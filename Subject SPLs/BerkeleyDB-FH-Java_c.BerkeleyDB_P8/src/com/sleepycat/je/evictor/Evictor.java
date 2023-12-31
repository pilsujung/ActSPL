package com.sleepycat.je.evictor; 
import java.text.NumberFormat; 
import java.util.ArrayList; 
import java.util.Iterator; 
import java.util.List; 
import java.util.logging.Level; 
import java.util.logging.Logger; 
import com.sleepycat.je.DatabaseException; 
import com.sleepycat.je.config.EnvironmentParams; 
import com.sleepycat.je.dbi.DatabaseImpl; 
import com.sleepycat.je.dbi.DbConfigManager; 
import com.sleepycat.je.dbi.DbTree; 
import com.sleepycat.je.dbi.EnvironmentImpl; 
import com.sleepycat.je.dbi.INList; 
import com.sleepycat.je.dbi.MemoryBudget; 
import com.sleepycat.je.log.LogManager; 
import com.sleepycat.je.tree.BIN; 
import com.sleepycat.je.tree.IN; 
import com.sleepycat.je.tree.Node; 
import com.sleepycat.je.tree.SearchResult; 
import com.sleepycat.je.tree.Tree; 
import com.sleepycat.je.utilint.DaemonThread; 
import com.sleepycat.je.utilint.DbLsn; 
import com.sleepycat.je.utilint.TestHook; 
import com.sleepycat.je.utilint.Tracer; 
import de.ovgu.cide.jakutil.*; 
import com.sleepycat.je.latch.LatchSupport; 
public   class  Evictor {
	
  public static final String SOURCE_DAEMON="daemon";

	
  public static final String SOURCE_MANUAL="manual";

	
  public static final String SOURCE_CRITICAL="critical";

	
  private static final boolean DEBUG=false;

	
  private EnvironmentImpl envImpl;

	
  private LogManager logManager;

	
  private volatile boolean active;

	
  private IN nextNode;

	
  private long currentRequiredEvictBytes;

	
  private int nodesPerScan;

	
  private long evictBytesSetting;

	
  private boolean evictByLruOnly;

	
  private NumberFormat formatter;

	
  private int nNodesScannedThisRun;

	
  EvictProfile evictProfile;

	
  private TestHook runnableHook;

	
  public Evictor(  EnvironmentImpl envImpl,  String name) throws DatabaseException {
 //   super(0,name,envImpl);
    this.envImpl=envImpl;
    logManager=envImpl.getLogManager();
    nextNode=null;
    DbConfigManager configManager=envImpl.getConfigManager();
    nodesPerScan=configManager.getInt(EnvironmentParams.EVICTOR_NODES_PER_SCAN);
    evictBytesSetting=configManager.getLong(EnvironmentParams.EVICTOR_EVICT_BYTES);
    evictByLruOnly=configManager.getBoolean(EnvironmentParams.EVICTOR_LRU_ONLY);
    this.hook373(envImpl);
    evictProfile=new EvictProfile();
    formatter=NumberFormat.getNumberInstance();
    active=false;
  }

	
  public String toString(){
    StringBuffer sb=new StringBuffer();
    //sb.append("<Evictor name=\"").append(name).append("\"/>");
    return sb.toString();
  }

	
  synchronized public void clearEnv(){
    envImpl=null;
  }

	
  /** 
 * Wakeup the evictor only if it's not already active.
 */
  public void alert(){
    if (!active) {
      //wakeup();
    }
  }

	
  /** 
 * May be called by the evictor thread on wakeup or programatically.
 */
  public void doEvict(  String source) throws DatabaseException {
    doEvict(source,false);
  }

	
  /** 
 * Allows performing eviction during shutdown, which is needed when during
 * checkpointing and cleaner log file deletion.
 */
  private synchronized void doEvict(  String source,  boolean evictDuringShutdown) throws DatabaseException {
    if (active) {
      return;
    }
    active=true;
    try {
      boolean progress=true;
      while (progress && (evictDuringShutdown || isRunnable(source))) {
        if (evictBatch(source,currentRequiredEvictBytes) == 0) {
          progress=false;
        }
      }
    }
  finally {
      active=false;
    }
  }

	
  /** 
 * Each iteration will latch and unlatch the major INList, and will attempt
 * to evict requiredEvictBytes, but will give up after a complete pass over
 * the major INList. Releasing the latch is important because it provides an
 * opportunity for to add the minor INList to the major INList.
 * @return the number of bytes evicted, or zero if no progress was made.
 */
  long evictBatch(  String source,  long requiredEvictBytes) throws DatabaseException {
    return new Evictor_evictBatch(this,source,requiredEvictBytes).execute();
  }

	
  /** 
 * Return true if eviction should happen.
 */
  boolean isRunnable(  String source) throws DatabaseException {
    return new Evictor_isRunnable(this,source).execute();
  }

	
  /** 
 * Select a single node to evict.
 */
  private IN selectIN(  INList inList,  ScanIterator scanIter) throws DatabaseException {
    IN target=null;
    long targetGeneration=Long.MAX_VALUE;
    int targetLevel=Integer.MAX_VALUE;
    boolean targetDirty=true;
    boolean envIsReadOnly=envImpl.isReadOnly();
    int scanned=0;
    boolean wrapped=false;
    while (scanned < nodesPerScan) {
      if (scanIter.hasNext()) {
        IN in=scanIter.next();
        nNodesScannedThisRun++;
        DatabaseImpl db=in.getDatabase();
        boolean b=db == null;
        b=this.hook387(db,b);
        if (b) {
          String inInfo=" IN type=" + in.getLogType() + " id="+ in.getNodeId()+ " not expected on INList";
          String errMsg=(db == null) ? inInfo : "Database " + db.getDebugName() + " id="+ db.getId()+ inInfo;
          throw new DatabaseException(errMsg);
        }
        boolean b2=false;
        b2=this.hook386(db,b2);
        if (b2) {
          continue;
        }
        if (db.getId().equals(DbTree.ID_DB_ID)) {
          continue;
        }
        if (envIsReadOnly && (target != null) && in.getDirty()) {
          continue;
        }
        int evictType=in.getEvictionType();
        if (evictType == IN.MAY_NOT_EVICT) {
          continue;
        }
        if (evictByLruOnly) {
          if (targetGeneration > in.getGeneration()) {
            targetGeneration=in.getGeneration();
            target=in;
          }
        }
 else {
          int level=normalizeLevel(in,evictType);
          if (targetLevel != level) {
            if (targetLevel > level) {
              targetLevel=level;
              targetDirty=in.getDirty();
              targetGeneration=in.getGeneration();
              target=in;
            }
          }
 else           if (targetDirty != in.getDirty()) {
            if (targetDirty) {
              targetDirty=false;
              targetGeneration=in.getGeneration();
              target=in;
            }
          }
 else {
            if (targetGeneration > in.getGeneration()) {
              targetGeneration=in.getGeneration();
              target=in;
            }
          }
        }
        scanned++;
      }
 else {
        if (wrapped) {
          break;
        }
 else {
          nextNode=inList.first();
          scanIter.reset(nextNode);
          wrapped=true;
        }
      }
    }
    this.hook380(target);
    return target;
  }

	
  /** 
 * Normalize the tree level of the given IN.
 * Is public for unit testing.
 * A BIN containing evictable LNs is given level 0, so it will be stripped
 * first. For non-duplicate and DBMAP trees, the high order bits are cleared
 * to make their levels correspond; that way, all bottom level nodes (BINs
 * and DBINs) are given the same eviction priority.
 * Note that BINs in a duplicate tree are assigned the same level as BINs in
 * a non-duplicate tree. This isn't always optimimal, but is the best we can
 * do considering that BINs in duplicate trees may contain a mix of LNs and
 * DINs.
 */
  public int normalizeLevel(  IN in,  int evictType){
    int level=in.getLevel() & IN.LEVEL_MASK;
    if (level == 1 && evictType == IN.MAY_EVICT_LNS) {
      level=0;
    }
    return level;
  }

	
  /** 
 * Strip or evict this node.
 * @return number of bytes evicted.
 */
  private long evict(  INList inList,  IN target,  ScanIterator scanIter) throws DatabaseException {
    boolean envIsReadOnly=envImpl.isReadOnly();
    long evictedBytes=0;
    if (target.latchNoWait(false)) {
      evictedBytes=this.hook374(inList,target,scanIter,envIsReadOnly,evictedBytes);
    }
    return evictedBytes;
  }

	
  /** 
 * Evict an IN. Dirty nodes are logged before they're evicted. inlist is
 * latched with the major latch by the caller.
 */
  private long evictIN(  IN child,  IN parent,  int index,  INList inlist,  ScanIterator scanIter,  boolean envIsReadOnly) throws DatabaseException {
    long evictBytes=0;
    evictBytes=this.hook375(child,parent,index,inlist,scanIter,envIsReadOnly,evictBytes);
    return evictBytes;
  }

	
  /** 
 * Used by unit tests.
 */
  IN getNextNode(){
    return nextNode;
  }

	
  public void setRunnableHook(  TestHook hook){
    runnableHook=hook;
  }

	
static public  class  EvictProfile {
		
    private List candidates=new ArrayList();

		
    public boolean count(    IN target){
      candidates.add(new Long(target.getNodeId()));
      return true;
    }

		
    public List getCandidates(){
      return candidates;
    }

		
    public boolean clear(){
      candidates.clear();
      return true;
    }


	}

	
private static  class  ScanIterator {
		
    private INList inList;

		
    private Iterator iter;

		
    private IN nextMark;

		
    ScanIterator(    IN startingIN,    INList inList) throws DatabaseException {
      this.inList=inList;
      reset(startingIN);
    }

		
    void reset(    IN startingIN) throws DatabaseException {
      iter=inList.tailSet(startingIN).iterator();
    }

		
    IN mark() throws DatabaseException {
      if (iter.hasNext()) {
        nextMark=(IN)iter.next();
      }
 else {
        nextMark=(IN)inList.first();
      }
      return (IN)nextMark;
    }

		
    void resetToMark() throws DatabaseException {
      reset(nextMark);
    }

		
    boolean hasNext(){
      return iter.hasNext();
    }

		
    IN next(){
      return (IN)iter.next();
    }

		
    void remove(){
      iter.remove();
    }


	}

	
@MethodObject static  class  Evictor_evictBatch {
		
    Evictor_evictBatch(    Evictor _this,    String source,    long requiredEvictBytes){
      this._this=_this;
      this.source=source;
      this.requiredEvictBytes=requiredEvictBytes;
    }

		
     private long  execute__wrappee__Evictor  () throws DatabaseException {
      _this.nNodesScannedThisRun=0;
      this.hook381();
      assert _this.evictProfile.clear();
      nBatchSets=0;
      finished=false;
      evictBytes=0;
      evictBytes+=_this.envImpl.getUtilizationTracker().evictMemory();
      inList=_this.envImpl.getInMemoryINs();
      this.hook376();
      inListStartSize=inList.getSize();
      try {
        if (inListStartSize == 0) {
          _this.nextNode=null;
          return 0;
        }
 else {
          if (_this.nextNode == null) {
            _this.nextNode=inList.first();
          }
        }
        scanIter=new ScanIterator(_this.nextNode,inList);
        while ((evictBytes < requiredEvictBytes) && (_this.nNodesScannedThisRun <= inListStartSize)) {
          target=_this.selectIN(inList,scanIter);
          if (target == null) {
            break;
          }
 else {
            assert _this.evictProfile.count(target);
            evictBytes+=_this.evict(inList,target,scanIter);
          }
          nBatchSets++;
        }
        _this.nextNode=scanIter.mark();
        finished=true;
      }
  finally {
        this.hook382();
        this.hook377();
        this.hook371();
      }
      return evictBytes;
    }

		
    long execute() throws DatabaseException {
      long result=execute__wrappee__Evictor();
      assert LatchSupport.countLatchesHeld() == 0 : "latches held = " + LatchSupport.countLatchesHeld();
      return result;
    }

		
    protected Evictor _this;

		
    protected String source;

		
    protected long requiredEvictBytes;

		
    protected int nBatchSets;

		
    protected boolean finished;

		
    protected long evictBytes;

		
    protected INList inList;

		
    protected int inListStartSize;

		
    protected ScanIterator scanIter;

		
    protected IN target;

		
    protected Logger logger;

		
    protected String msg;

		
     private void  hook371__wrappee__Evictor  () throws DatabaseException {
    }

		
    protected void hook371() throws DatabaseException {
      logger=_this.envImpl.getLogger();
      if (logger.isLoggable(_this.detailedTraceLevel)) {
        msg="Evictor: ";
        this.hook369();
        msg+=" finished=" + finished + " source="+ source+ " requiredEvictBytes="+ _this.formatter.format(requiredEvictBytes)+ " evictBytes="+ _this.formatter.format(evictBytes)+ " inListSize="+ inListStartSize+ " nNodesScanned="+ _this.nNodesScannedThisRun;
        this.hook368();
        msg+=" nBatchSets=" + nBatchSets;
        Tracer.trace(_this.detailedTraceLevel,_this.envImpl,msg);
      }
      hook371__wrappee__Evictor();
    }

		
     private void  hook376__wrappee__Evictor  () throws DatabaseException {
    }

		
    protected void hook376() throws DatabaseException {
      inList.latchMajor();
      hook376__wrappee__Evictor();
    }

		
     private void  hook377__wrappee__Evictor  () throws DatabaseException {
    }

		
    protected void hook377() throws DatabaseException {
      inList.releaseMajorLatch();
      hook377__wrappee__Evictor();
    }

		
    protected void hook381() throws DatabaseException {
    }

		
    protected void hook382() throws DatabaseException {
    }

		
    protected void hook368() throws DatabaseException {
    }

		
    protected void hook369() throws DatabaseException {
    }


	}

	
@MethodObject static  class  Evictor_isRunnable {
		
    Evictor_isRunnable(    Evictor _this,    String source){
      this._this=_this;
      this.source=source;
    }

		
     private boolean  execute__wrappee__Evictor  () throws DatabaseException {
      mb=_this.envImpl.getMemoryBudget();
      this.hook388();
      this.hook372();
      result=false;
      return result;
    }

		
    boolean execute() throws DatabaseException {
      boolean result=execute__wrappee__Evictor();
      result=doRun;
      return result;
    }

		
    protected Evictor _this;

		
    protected String source;

		
    protected MemoryBudget mb;

		
    protected long currentUsage;

		
    protected long maxMem;

		
    protected boolean doRun;

		
    protected Logger logger;

		
    protected Runtime r;

		
    protected long totalBytes;

		
    protected long freeBytes;

		
    protected long usedBytes;

		
    protected StringBuffer sb;

		
    protected boolean result;

		
     private void  hook372__wrappee__Evictor  () throws DatabaseException {
    }

		
    protected void hook372() throws DatabaseException {
      logger=_this.envImpl.getLogger();
      if (logger.isLoggable(_this.detailedTraceLevel)) {
        r=Runtime.getRuntime();
        totalBytes=r.totalMemory();
        freeBytes=r.freeMemory();
        usedBytes=r.totalMemory() - r.freeMemory();
        sb=new StringBuffer();
        sb.append(" source=").append(source);
        this.hook370();
        sb.append(" requiredEvict=").append(_this.formatter.format(_this.currentRequiredEvictBytes));
        sb.append(" JVMtotalBytes= ").append(_this.formatter.format(totalBytes));
        sb.append(" JVMfreeBytes= ").append(_this.formatter.format(freeBytes));
        sb.append(" JVMusedBytes= ").append(_this.formatter.format(usedBytes));
        logger.log(_this.detailedTraceLevel,sb.toString());
      }
      hook372__wrappee__Evictor();
    }

		
     private void  hook388__wrappee__Evictor  () throws DatabaseException {
    }

		
    protected void hook388() throws DatabaseException {
      currentUsage=mb.getCacheMemoryUsage();
      maxMem=mb.getCacheBudget();
      doRun=((currentUsage - maxMem) > 0);
      if (doRun) {
        _this.currentRequiredEvictBytes=_this.evictBytesSetting;
        _this.currentRequiredEvictBytes+=(currentUsage - maxMem);
        if (_this.DEBUG) {
          if (source == _this.SOURCE_CRITICAL) {
            System.out.println("executed: critical runnable");
          }
        }
      }
      if (_this.runnableHook != null) {
        doRun=((Boolean)_this.runnableHook.getHookValue()).booleanValue();
        _this.currentRequiredEvictBytes=maxMem;
      }
      hook388__wrappee__Evictor();
    }

		
     private void  hook370__wrappee__Derivative_LoggingEvictor_Evictor_LoggingBase  () throws DatabaseException {
    }

		
    protected void hook370() throws DatabaseException {
      sb.append(" doRun=").append(doRun);
      sb.append(" JEusedBytes=").append(_this.formatter.format(currentUsage));
      hook370__wrappee__Derivative_LoggingEvictor_Evictor_LoggingBase();
    }


	}

	
   private void  hook373__wrappee__Evictor  (  EnvironmentImpl envImpl) throws DatabaseException {
  }

	
  protected void hook373(  EnvironmentImpl envImpl) throws DatabaseException {
    detailedTraceLevel=Tracer.parseLevel(envImpl,EnvironmentParams.JE_LOGGING_LEVEL_EVICTOR);
    hook373__wrappee__Evictor(envImpl);
  }

	
   private long  hook374__wrappee__Evictor  (  INList inList,  IN target,  ScanIterator scanIter,  boolean envIsReadOnly,  long evictedBytes) throws DatabaseException {
    if (target instanceof BIN) {
      this.hook385(target);
      evictedBytes=((BIN)target).evictLNs();
      this.hook383(evictedBytes);
    }
    if (evictedBytes == 0 && target.isEvictable()) {
      Tree tree=target.getDatabase().getTree();
      SearchResult result=tree.getParentINForChildIN(target,true,false);
      if (result.exactParentFound) {
        evictedBytes=evictIN(target,result.parent,result.index,inList,scanIter,envIsReadOnly);
      }
    }
    return evictedBytes;
  }

	
  protected long hook374(  INList inList,  IN target,  ScanIterator scanIter,  boolean envIsReadOnly,  long evictedBytes) throws DatabaseException {
    try {
      evictedBytes=hook374__wrappee__Evictor(inList,target,scanIter,envIsReadOnly,evictedBytes);
    }
  finally {
      target.releaseLatchIfOwner();
    }
    return evictedBytes;
  }

	
   private long  hook375__wrappee__Evictor  (  IN child,  IN parent,  int index,  INList inlist,  ScanIterator scanIter,  boolean envIsReadOnly,  long evictBytes) throws DatabaseException {
    this.hook378(parent);
    long oldGenerationCount=child.getGeneration();
    IN renewedChild=(IN)parent.getTarget(index);
    if ((renewedChild != null) && (renewedChild.getGeneration() <= oldGenerationCount) && renewedChild.latchNoWait(false)) {
      evictBytes=this.hook379(parent,index,inlist,scanIter,envIsReadOnly,evictBytes,renewedChild);
    }
    return evictBytes;
  }

	
  protected long hook375(  IN child,  IN parent,  int index,  INList inlist,  ScanIterator scanIter,  boolean envIsReadOnly,  long evictBytes) throws DatabaseException {
    try {
      evictBytes=hook375__wrappee__Evictor(child,parent,index,inlist,scanIter,envIsReadOnly,evictBytes);
    }
  finally {
      parent.releaseLatch();
    }
    return evictBytes;
  }

	
   private void  hook378__wrappee__Evictor  (  IN parent) throws DatabaseException {
  }

	
  protected void hook378(  IN parent) throws DatabaseException {
    assert parent.isLatchOwner();
    hook378__wrappee__Evictor(parent);
  }

	
   private long  hook379__wrappee__Evictor  (  IN parent,  int index,  INList inlist,  ScanIterator scanIter,  boolean envIsReadOnly,  long evictBytes,  IN renewedChild) throws DatabaseException {
    if (renewedChild.isEvictable()) {
      long renewedChildLsn=DbLsn.NULL_LSN;
      boolean newChildLsn=false;
      if (renewedChild.getDirty()) {
        if (!envIsReadOnly) {
          boolean logProvisional=(envImpl.getCheckpointer() != null && (renewedChild.getLevel() < envImpl.getCheckpointer().getHighestFlushLevel()));
          renewedChildLsn=renewedChild.log(logManager,false,logProvisional,true,parent);
          newChildLsn=true;
        }
      }
 else {
        renewedChildLsn=parent.getLsn(index);
      }
      if (renewedChildLsn != DbLsn.NULL_LSN) {
        scanIter.mark();
        inlist.removeLatchAlreadyHeld(renewedChild);
        scanIter.resetToMark();
        evictBytes=this.hook389(evictBytes,renewedChild);
        if (newChildLsn) {
          parent.updateEntry(index,null,renewedChildLsn);
        }
 else {
          parent.updateEntry(index,(Node)null);
        }
        this.hook384();
      }
    }
    return evictBytes;
  }

	
  protected long hook379(  IN parent,  int index,  INList inlist,  ScanIterator scanIter,  boolean envIsReadOnly,  long evictBytes,  IN renewedChild) throws DatabaseException {
    try {
      evictBytes=hook379__wrappee__Evictor(parent,index,inlist,scanIter,envIsReadOnly,evictBytes,renewedChild);
    }
  finally {
      renewedChild.releaseLatch();
    }
    return evictBytes;
  }

	
  protected void hook380(  IN target) throws DatabaseException {
  }

	
  protected void hook383(  long evictedBytes) throws DatabaseException {
  }

	
  protected void hook384() throws DatabaseException {
  }

	
   private void  hook385__wrappee__Evictor  (  IN target) throws DatabaseException {
  }

	
  protected void hook385(  IN target) throws DatabaseException {
    envImpl.lazyCompress(target);
    hook385__wrappee__Evictor(target);
  }

	
   private boolean  hook386__wrappee__Evictor  (  DatabaseImpl db,  boolean b2) throws DatabaseException {
    return b2;
  }

	
  protected boolean hook386(  DatabaseImpl db,  boolean b2) throws DatabaseException {
    b2=db.isDeleted();
    return hook386__wrappee__Evictor(db,b2);
  }

	
   private boolean  hook387__wrappee__Evictor  (  DatabaseImpl db,  boolean b) throws DatabaseException {
    return b;
  }

	
  protected boolean hook387(  DatabaseImpl db,  boolean b) throws DatabaseException {
    b|=db.isDeleteFinished();
    return hook387__wrappee__Evictor(db,b);
  }

	
   private long  hook389__wrappee__Evictor  (  long evictBytes,  IN renewedChild) throws DatabaseException {
    return evictBytes;
  }

	
  protected long hook389(  long evictBytes,  IN renewedChild) throws DatabaseException {
    evictBytes=renewedChild.getInMemorySize();
    return hook389__wrappee__Evictor(evictBytes,renewedChild);
  }

	
  /** 
 * Do a check on whether synchronous eviction is needed.
 */
  public void doCriticalEviction() throws DatabaseException {
    new Evictor_doCriticalEviction(this).execute();
  }

	
@MethodObject static  class  Evictor_doCriticalEviction {
		
    Evictor_doCriticalEviction(    Evictor _this){
      this._this=_this;
    }

		
     private void  execute__wrappee__Derivative_Evictor_CriticalEviction  () throws DatabaseException {
    }

		
    void execute() throws DatabaseException {
      mb=_this.envImpl.getMemoryBudget();
      currentUsage=mb.getCacheMemoryUsage();
      maxMem=mb.getCacheBudget();
      over=currentUsage - maxMem;
      if (over > mb.getCriticalThreshold()) {
        if (_this.DEBUG) {
          System.out.println("***critical detected:" + over);
        }
        _this.doEvict(_this.SOURCE_CRITICAL,true);
      }
      execute__wrappee__Derivative_Evictor_CriticalEviction();
    }

		
    protected Evictor _this;

		
    protected MemoryBudget mb;

		
    protected long currentUsage;

		
    protected long maxMem;

		
    protected long over;


	}

	
  private Level detailedTraceLevel;


}
