package com.sleepycat.je.log; 
import java.io.IOException; 
import java.nio.ByteBuffer; 
import java.util.List; 
import com.sleepycat.je.DatabaseException; 
import com.sleepycat.je.cleaner.TrackedFileSummary; 
import com.sleepycat.je.cleaner.UtilizationTracker; 
import com.sleepycat.je.dbi.EnvironmentImpl; 
import de.ovgu.cide.jakutil.*; 
public   class  SyncedLogManager  extends LogManager {
	
  /** 
 * There is a single log manager per database environment.
 */
  public SyncedLogManager(  EnvironmentImpl envImpl,  boolean readOnly) throws DatabaseException {
    super(envImpl,readOnly);
  }

	
  protected LogResult logItem(  LoggableObject item,  boolean isProvisional,  boolean flushRequired,  boolean forceNewLogFile,  long oldNodeLsn,  boolean marshallOutsideLatch,  ByteBuffer marshalledBuffer,  UtilizationTracker tracker) throws IOException, DatabaseException {
    try {
      this.hook511(item,isProvisional,flushRequired,forceNewLogFile,oldNodeLsn,marshallOutsideLatch,marshalledBuffer,tracker);
      throw ReturnHack.returnObject;
    }
 catch (    ReturnObject r) {
      return (LogResult)r.value;
    }
  }

	
  protected void flushInternal() throws LogException, DatabaseException {
    try {
      this.hook512();
    }
 catch (    IOException e) {
      throw new LogException(e.getMessage());
    }
  }

	
  /** 
 * @see LogManager#getUnflushableTrackedSummary
 */
  public TrackedFileSummary getUnflushableTrackedSummary(  long file) throws DatabaseException {
    try {
      this.hook513(file);
      throw ReturnHack.returnObject;
    }
 catch (    ReturnObject r) {
      return (TrackedFileSummary)r.value;
    }
  }

	
  /** 
 * @see LogManager#countObsoleteLNs
 */
  public void countObsoleteNode(  long lsn,  LogEntryType type) throws DatabaseException {
    UtilizationTracker tracker=envImpl.getUtilizationTracker();
    this.hook514(lsn,type,tracker);
  }

	
  /** 
 * @see LogManager#countObsoleteNodes
 */
  public void countObsoleteNodes(  TrackedFileSummary[] summaries) throws DatabaseException {
    UtilizationTracker tracker=envImpl.getUtilizationTracker();
    this.hook515(summaries,tracker);
  }

	
  /** 
 * @see LogManager#countObsoleteINs
 */
   private void  countObsoleteINs__wrappee__base  (  List lsnList) throws DatabaseException {
    countObsoleteINsInternal(lsnList);
  }

	
  /** 
 * @see LogManager#countObsoleteINs
 */
  public void countObsoleteINs(  List lsnList) throws DatabaseException {
synchronized (logWriteLatch) {
      countObsoleteINs__wrappee__base(lsnList);
    }
  }

	
   private void  hook511__wrappee__base  (  LoggableObject item,  boolean isProvisional,  boolean flushRequired,  boolean forceNewLogFile,  long oldNodeLsn,  boolean marshallOutsideLatch,  ByteBuffer marshalledBuffer,  UtilizationTracker tracker) throws IOException, DatabaseException {
    throw new ReturnObject(logInternal(item,isProvisional,flushRequired,forceNewLogFile,oldNodeLsn,marshallOutsideLatch,marshalledBuffer,tracker));
  }

	
  protected void hook511(  LoggableObject item,  boolean isProvisional,  boolean flushRequired,  boolean forceNewLogFile,  long oldNodeLsn,  boolean marshallOutsideLatch,  ByteBuffer marshalledBuffer,  UtilizationTracker tracker) throws IOException, DatabaseException {
synchronized (logWriteLatch) {
      hook511__wrappee__base(item,isProvisional,flushRequired,forceNewLogFile,oldNodeLsn,marshallOutsideLatch,marshalledBuffer,tracker);
    }
  }

	
   private void  hook512__wrappee__base  () throws LogException, DatabaseException, IOException {
    logBufferPool.writeBufferToFile(0);
  }

	
  protected void hook512() throws LogException, DatabaseException, IOException {
synchronized (logWriteLatch) {
      hook512__wrappee__base();
    }
  }

	
   private void  hook513__wrappee__base  (  long file) throws DatabaseException {
    throw new ReturnObject(getUnflushableTrackedSummaryInternal(file));
  }

	
  protected void hook513(  long file) throws DatabaseException {
synchronized (logWriteLatch) {
      hook513__wrappee__base(file);
    }
  }

	
   private void  hook514__wrappee__base  (  long lsn,  LogEntryType type,  UtilizationTracker tracker) throws DatabaseException {
    countObsoleteNodeInternal(tracker,lsn,type);
  }

	
  protected void hook514(  long lsn,  LogEntryType type,  UtilizationTracker tracker) throws DatabaseException {
synchronized (logWriteLatch) {
      hook514__wrappee__base(lsn,type,tracker);
    }
  }

	
   private void  hook515__wrappee__base  (  TrackedFileSummary[] summaries,  UtilizationTracker tracker) throws DatabaseException {
    countObsoleteNodesInternal(tracker,summaries);
  }

	
  protected void hook515(  TrackedFileSummary[] summaries,  UtilizationTracker tracker) throws DatabaseException {
synchronized (logWriteLatch) {
      hook515__wrappee__base(summaries,tracker);
    }
  }


}
