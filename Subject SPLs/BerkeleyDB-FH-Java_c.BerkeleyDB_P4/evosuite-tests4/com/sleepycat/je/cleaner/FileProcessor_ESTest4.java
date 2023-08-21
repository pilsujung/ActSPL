/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 14:03:42 KST 2017
 */

package com.sleepycat.je.cleaner;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.sleepycat.je.DatabaseException;
import com.sleepycat.je.cleaner.Cleaner;
import com.sleepycat.je.cleaner.FileProcessor;
import com.sleepycat.je.cleaner.FileSelector;
import com.sleepycat.je.cleaner.LNInfo;
import com.sleepycat.je.cleaner.UtilizationProfile;
import com.sleepycat.je.dbi.DatabaseId;
import com.sleepycat.je.dbi.DbTree;
import com.sleepycat.je.dbi.EnvironmentImpl;
import com.sleepycat.je.log.LogEntryType;
import com.sleepycat.je.log.entry.LNLogEntry;
import com.sleepycat.je.tree.BIN;
import com.sleepycat.je.tree.DBIN;
import com.sleepycat.je.tree.DIN;
import com.sleepycat.je.tree.LN;
import com.sleepycat.je.tree.NameLN;
import com.sleepycat.je.tree.TreeLocation;
import com.sleepycat.je.txn.Txn;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class FileProcessor_ESTest4 extends FileProcessor_ESTest_scaffolding4 {

  @Test
  public void test00()  throws Throwable  {
      LogEntryType logEntryType0 = LogEntryType.LOG_TRACE;
      NameLN nameLN0 = new NameLN();
      DatabaseId databaseId0 = DbTree.NAME_DB_ID;
      byte[] byteArray0 = new byte[3];
      Txn txn0 = new Txn();
      LNLogEntry lNLogEntry0 = new LNLogEntry(logEntryType0, (LN) nameLN0, databaseId0, byteArray0, (-2486L), true, txn0);
      Long long0 = lNLogEntry0.getTxnId();
      TreeLocation treeLocation0 = new TreeLocation();
      LNInfo lNInfo0 = new LNInfo((LN) nameLN0, databaseId0, byteArray0, byteArray0);
      HashMap<Integer, String> hashMap0 = new HashMap<Integer, String>();
      FileProcessor.FileProcessor_processLN fileProcessor_FileProcessor_processLN0 = new FileProcessor.FileProcessor_processLN((FileProcessor) null, long0, treeLocation0, (Long) treeLocation0.childLsn, lNInfo0, nameLN0, hashMap0);
      fileProcessor_FileProcessor_processLN0.parentFound = true;
      // Undeclared exception!
      try { 
        fileProcessor_FileProcessor_processLN0.hook157();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.cleaner.FileProcessor$FileProcessor_processLN", e);
      }
  }

  @Test
  public void test01()  throws Throwable  {
      Long long0 = new Long(4294967292L);
      FileProcessor.FileProcessor_processFile fileProcessor_FileProcessor_processFile0 = new FileProcessor.FileProcessor_processFile((FileProcessor) null, long0);
      fileProcessor_FileProcessor_processFile0.adjustMem = (int) (byte)65;
      // Undeclared exception!
      try { 
        fileProcessor_FileProcessor_processFile0.hook162();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.cleaner.FileProcessor$FileProcessor_processFile", e);
      }
  }

  @Test
  public void test02()  throws Throwable  {
      Long long0 = new Long(2121L);
      FileProcessor.FileProcessor_processFile fileProcessor_FileProcessor_processFile0 = new FileProcessor.FileProcessor_processFile((FileProcessor) null, long0);
      fileProcessor_FileProcessor_processFile0.isRoot = true;
      fileProcessor_FileProcessor_processFile0.hook147();
  }

  @Test
  public void test03()  throws Throwable  {
      Long long0 = new Long(4294967306L);
      FileProcessor.FileProcessor_processFile fileProcessor_FileProcessor_processFile0 = new FileProcessor.FileProcessor_processFile((FileProcessor) null, long0);
      fileProcessor_FileProcessor_processFile0.isObsolete = true;
      fileProcessor_FileProcessor_processFile0.hook147();
  }

  @Test
  public void test04()  throws Throwable  {
      Long long0 = new Long(2121L);
      FileProcessor.FileProcessor_processFile fileProcessor_FileProcessor_processFile0 = new FileProcessor.FileProcessor_processFile((FileProcessor) null, long0);
      // Undeclared exception!
      try { 
        fileProcessor_FileProcessor_processFile0.hook156();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.cleaner.FileProcessor$FileProcessor_processFile", e);
      }
  }

  @Test
  public void test05()  throws Throwable  {
      Long long0 = new Long(4294967306L);
      FileProcessor.FileProcessor_processFile fileProcessor_FileProcessor_processFile0 = new FileProcessor.FileProcessor_processFile((FileProcessor) null, long0);
      // Undeclared exception!
      try { 
        fileProcessor_FileProcessor_processFile0.execute();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.cleaner.FileProcessor", e);
      }
  }

  @Test
  public void test06()  throws Throwable  {
      FileSelector fileSelector0 = new FileSelector();
      FileProcessor fileProcessor0 = new FileProcessor("LN;Xdn=", (EnvironmentImpl) null, (Cleaner) null, (UtilizationProfile) null, fileSelector0);
      // Undeclared exception!
      try { 
        fileProcessor0.doClean(true, true, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.cleaner.FileProcessor", e);
      }
  }

  @Test
  public void test07()  throws Throwable  {
      Long long0 = new Long((-944L));
      TreeLocation treeLocation0 = new TreeLocation();
      FileProcessor.FileProcessor_processLN fileProcessor_FileProcessor_processLN0 = new FileProcessor.FileProcessor_processLN((FileProcessor) null, long0, treeLocation0, long0, (LNInfo) null, treeLocation0.index, (Map) null);
      DBIN dBIN0 = new DBIN();
      fileProcessor_FileProcessor_processLN0.bin = (BIN) dBIN0;
      fileProcessor_FileProcessor_processLN0.hook135();
  }

  @Test
  public void test08()  throws Throwable  {
      Long long0 = new Long((-672L));
      FileProcessor.FileProcessor_processFile fileProcessor_FileProcessor_processFile0 = new FileProcessor.FileProcessor_processFile((FileProcessor) null, long0);
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      fileProcessor_FileProcessor_processFile0.checkPendingDbSet = (Set) linkedHashSet0;
      linkedHashSet0.add((String) null);
      // Undeclared exception!
      try { 
        fileProcessor_FileProcessor_processFile0.hook155();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.cleaner.FileProcessor", e);
      }
  }

  @Test
  public void test09()  throws Throwable  {
      FileProcessor.FileProcessor_processFile fileProcessor_FileProcessor_processFile0 = new FileProcessor.FileProcessor_processFile((FileProcessor) null, (Long) (-1L));
      fileProcessor_FileProcessor_processFile0.isLN = true;
      // Undeclared exception!
      try { 
        fileProcessor_FileProcessor_processFile0.hook147();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.cleaner.FileProcessor", e);
      }
  }

  @Test
  public void test10()  throws Throwable  {
      Long long0 = new Long((-912L));
      TreeLocation treeLocation0 = new TreeLocation();
      FileProcessor.FileProcessor_processLN fileProcessor_FileProcessor_processLN0 = new FileProcessor.FileProcessor_processLN((FileProcessor) null, long0, treeLocation0, long0, (LNInfo) null, treeLocation0.index, (Map) null);
      // Undeclared exception!
      try { 
        fileProcessor_FileProcessor_processLN0.hook148();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.cleaner.FileProcessor", e);
      }
  }

  @Test
  public void test11()  throws Throwable  {
      Long long0 = new Long((-944L));
      TreeLocation treeLocation0 = new TreeLocation();
      FileProcessor.FileProcessor_processLN fileProcessor_FileProcessor_processLN0 = new FileProcessor.FileProcessor_processLN((FileProcessor) null, long0, treeLocation0, long0, (LNInfo) null, treeLocation0.index, (Map) null);
      // Undeclared exception!
      try { 
        fileProcessor_FileProcessor_processLN0.hook149();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.cleaner.FileProcessor", e);
      }
  }

  @Test
  public void test12()  throws Throwable  {
      Long long0 = new Long((-944L));
      TreeLocation treeLocation0 = new TreeLocation();
      FileProcessor.FileProcessor_processLN fileProcessor_FileProcessor_processLN0 = new FileProcessor.FileProcessor_processLN((FileProcessor) null, long0, treeLocation0, long0, (LNInfo) null, treeLocation0.index, (Map) null);
      fileProcessor_FileProcessor_processLN0.hook126();
  }

  @Test
  public void test13()  throws Throwable  {
      Long long0 = new Long(1623L);
      DatabaseId databaseId0 = new DatabaseId();
      byte[] byteArray0 = new byte[6];
      LNInfo lNInfo0 = new LNInfo((LN) null, databaseId0, byteArray0, byteArray0);
      TreeLocation treeLocation0 = new TreeLocation();
      DIN dIN0 = new DIN();
      FileProcessor.FileProcessor_processLN fileProcessor_FileProcessor_processLN0 = new FileProcessor.FileProcessor_processLN((FileProcessor) null, long0, treeLocation0, long0, lNInfo0, dIN0, (Map) null);
      // Undeclared exception!
      try { 
        fileProcessor_FileProcessor_processLN0.hook158();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.cleaner.FileProcessor", e);
      }
  }

  @Test
  public void test14()  throws Throwable  {
      Long long0 = new Long(0L);
      TreeLocation treeLocation0 = new TreeLocation();
      FileProcessor.FileProcessor_processLN fileProcessor_FileProcessor_processLN0 = new FileProcessor.FileProcessor_processLN((FileProcessor) null, long0, treeLocation0, long0, (LNInfo) null, treeLocation0.index, (Map) null);
      fileProcessor_FileProcessor_processLN0.hook133();
  }

  @Test
  public void test15()  throws Throwable  {
      Long long0 = new Long((-944L));
      TreeLocation treeLocation0 = new TreeLocation();
      FileProcessor.FileProcessor_processLN fileProcessor_FileProcessor_processLN0 = new FileProcessor.FileProcessor_processLN((FileProcessor) null, long0, treeLocation0, long0, (LNInfo) null, treeLocation0.index, (Map) null);
      // Undeclared exception!
      try { 
        fileProcessor_FileProcessor_processLN0.hook150();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.cleaner.FileProcessor", e);
      }
  }

  @Test
  public void test16()  throws Throwable  {
      Long long0 = new Long((-944L));
      TreeLocation treeLocation0 = new TreeLocation();
      FileProcessor.FileProcessor_processLN fileProcessor_FileProcessor_processLN0 = new FileProcessor.FileProcessor_processLN((FileProcessor) null, long0, treeLocation0, long0, (LNInfo) null, treeLocation0.index, (Map) null);
      fileProcessor_FileProcessor_processLN0.hook135();
  }

  @Test
  public void test17()  throws Throwable  {
      Long long0 = new Long(67108877L);
      FileProcessor.FileProcessor_processFile fileProcessor_FileProcessor_processFile0 = new FileProcessor.FileProcessor_processFile((FileProcessor) null, long0);
      fileProcessor_FileProcessor_processFile0.hook137();
  }

  @Test
  public void test18()  throws Throwable  {
      Long long0 = new Long((-707L));
      FileProcessor.FileProcessor_processFile fileProcessor_FileProcessor_processFile0 = new FileProcessor.FileProcessor_processFile((FileProcessor) null, long0);
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      fileProcessor_FileProcessor_processFile0.checkPendingDbSet = (Set) linkedHashSet0;
      fileProcessor_FileProcessor_processFile0.hook155();
  }

  @Test
  public void test19()  throws Throwable  {
      Long long0 = new Long(4294967292L);
      FileProcessor.FileProcessor_processFile fileProcessor_FileProcessor_processFile0 = new FileProcessor.FileProcessor_processFile((FileProcessor) null, long0);
      fileProcessor_FileProcessor_processFile0.hook154();
  }

  @Test
  public void test20()  throws Throwable  {
      TreeLocation treeLocation0 = new TreeLocation();
      FileProcessor.FileProcessor_processFile fileProcessor_FileProcessor_processFile0 = new FileProcessor.FileProcessor_processFile((FileProcessor) null, (Long) treeLocation0.childLsn);
      fileProcessor_FileProcessor_processFile0.hook129();
  }


  @Test
  public void test22()  throws Throwable  {
      Long long0 = new Long((-2616L));
      FileProcessor.FileProcessor_processFile fileProcessor_FileProcessor_processFile0 = new FileProcessor.FileProcessor_processFile((FileProcessor) null, long0);
      fileProcessor_FileProcessor_processFile0.hook120();
  }

  @Test
  public void test23()  throws Throwable  {
      Long long0 = new Long(0L);
      FileProcessor.FileProcessor_processFile fileProcessor_FileProcessor_processFile0 = new FileProcessor.FileProcessor_processFile((FileProcessor) null, long0);
      fileProcessor_FileProcessor_processFile0.hook127();
  }

  @Test
  public void test24()  throws Throwable  {
      Long long0 = new Long((-643L));
      FileProcessor.FileProcessor_processFile fileProcessor_FileProcessor_processFile0 = new FileProcessor.FileProcessor_processFile((FileProcessor) null, long0);
      // Undeclared exception!
      try { 
        fileProcessor_FileProcessor_processFile0.hook161();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.cleaner.FileProcessor$FileProcessor_processFile", e);
      }
  }

  @Test
  public void test25()  throws Throwable  {
      FileSelector fileSelector0 = new FileSelector();
      FileProcessor fileProcessor0 = new FileProcessor("LN;Xdn=", (EnvironmentImpl) null, (Cleaner) null, (UtilizationProfile) null, fileSelector0);
      Long long0 = Long.valueOf(2132L);
      FileProcessor.FileProcessor_processFile fileProcessor_FileProcessor_processFile0 = new FileProcessor.FileProcessor_processFile(fileProcessor0, long0);
      // Undeclared exception!
      try { 
        fileProcessor_FileProcessor_processFile0.hook146();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.cleaner.FileProcessor$FileProcessor_processFile", e);
      }
  }

  @Test
  public void test26()  throws Throwable  {
      FileProcessor.FileProcessor_processFile fileProcessor_FileProcessor_processFile0 = new FileProcessor.FileProcessor_processFile((FileProcessor) null, (Long) null);
      // Undeclared exception!
      try { 
        fileProcessor_FileProcessor_processFile0.hook145();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.cleaner.FileProcessor$FileProcessor_processFile", e);
      }
  }

  @Test
  public void test27()  throws Throwable  {
      Long long0 = new Long(67108877L);
      FileProcessor.FileProcessor_processFile fileProcessor_FileProcessor_processFile0 = new FileProcessor.FileProcessor_processFile((FileProcessor) null, long0);
      fileProcessor_FileProcessor_processFile0.hook119();
  }

  @Test
  public void test28()  throws Throwable  {
      Long long0 = new Long(1623L);
      FileProcessor.FileProcessor_processFile fileProcessor_FileProcessor_processFile0 = new FileProcessor.FileProcessor_processFile((FileProcessor) null, long0);
      fileProcessor_FileProcessor_processFile0.hook118();
  }

  @Test
  public void test29()  throws Throwable  {
      FileSelector fileSelector0 = new FileSelector();
      FileProcessor fileProcessor0 = new FileProcessor("LN;Xdn=", (EnvironmentImpl) null, (Cleaner) null, (UtilizationProfile) null, fileSelector0);
      Long long0 = new Long(0L);
      FileProcessor.FileProcessor_processFile fileProcessor_FileProcessor_processFile0 = new FileProcessor.FileProcessor_processFile(fileProcessor0, long0);
      // Undeclared exception!
      try { 
        fileProcessor_FileProcessor_processFile0.hook130();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.cleaner.FileProcessor$FileProcessor_processLN", e);
      }
  }

  @Test
  public void test30()  throws Throwable  {
      FileSelector fileSelector0 = new FileSelector();
      FileProcessor fileProcessor0 = new FileProcessor("LN;Xdn=", (EnvironmentImpl) null, (Cleaner) null, (UtilizationProfile) null, fileSelector0);
      // Undeclared exception!
      try { 
        fileProcessor0.nDeadlockRetries();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.cleaner.FileProcessor", e);
      }
  }

  @Test
  public void test31()  throws Throwable  {
      FileSelector fileSelector0 = new FileSelector();
      FileProcessor fileProcessor0 = new FileProcessor("LN;Xdn=", (EnvironmentImpl) null, (Cleaner) null, (UtilizationProfile) null, fileSelector0);
      fileProcessor0.clearEnv();
      assertFalse(fileProcessor0.isRunning());
  }

  @Test
  public void test32()  throws Throwable  {
      FileSelector fileSelector0 = new FileSelector();
      FileProcessor fileProcessor0 = new FileProcessor("7~|X[{~8fV", (EnvironmentImpl) null, (Cleaner) null, (UtilizationProfile) null, fileSelector0);
      // Undeclared exception!
      try { 
        fileProcessor0.hook140();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.cleaner.FileProcessor", e);
      }
  }

  @Test
  public void test33()  throws Throwable  {
      FileSelector fileSelector0 = new FileSelector();
      FileProcessor fileProcessor0 = new FileProcessor("LN;Xdn=", (EnvironmentImpl) null, (Cleaner) null, (UtilizationProfile) null, fileSelector0);
      String string0 = fileProcessor0.toString();
      assertEquals("<Cleaner name=\"LN;Xdn=\"/>", string0);
  }

  @Test
  public void test34()  throws Throwable  {
      FileSelector fileSelector0 = new FileSelector();
      FileProcessor fileProcessor0 = new FileProcessor("7~|X[{~8fV", (EnvironmentImpl) null, (Cleaner) null, (UtilizationProfile) null, fileSelector0);
      fileProcessor0.hook144();
      assertEquals(0, fileProcessor0.getNWakeupRequests());
  }

  @Test
  public void test35()  throws Throwable  {
      FileSelector fileSelector0 = new FileSelector();
      FileProcessor fileProcessor0 = new FileProcessor("7~|X[{~8fV", (EnvironmentImpl) null, (Cleaner) null, (UtilizationProfile) null, fileSelector0);
      // Undeclared exception!
      try { 
        fileProcessor0.onWakeup();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.cleaner.FileProcessor", e);
      }
  }

  @Test
  public void test36()  throws Throwable  {
      FileSelector fileSelector0 = new FileSelector();
      FileProcessor fileProcessor0 = new FileProcessor("LN;Xdn=", (EnvironmentImpl) null, (Cleaner) null, (UtilizationProfile) null, fileSelector0);
      // Undeclared exception!
      try { 
        fileProcessor0.hook123((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.utilint.Tracer", e);
      }
  }

  @Test
  public void test37()  throws Throwable  {
      FileSelector fileSelector0 = new FileSelector();
      FileProcessor fileProcessor0 = new FileProcessor("LN;Xdn=", (EnvironmentImpl) null, (Cleaner) null, (UtilizationProfile) null, fileSelector0);
      IOException iOException0 = new IOException();
      // Undeclared exception!
      try { 
        fileProcessor0.hook122(iOException0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.utilint.Tracer", e);
      }
  }

  @Test
  public void test38()  throws Throwable  {
      FileSelector fileSelector0 = new FileSelector();
      FileProcessor fileProcessor0 = new FileProcessor("LN;Xdn=", (EnvironmentImpl) null, (Cleaner) null, (UtilizationProfile) null, fileSelector0);
      fileProcessor0.hook152();
      assertEquals(0, fileProcessor0.getNWakeupRequests());
  }

  @Test
  public void test39()  throws Throwable  {
      FileSelector fileSelector0 = new FileSelector();
      FileProcessor fileProcessor0 = new FileProcessor("LN;Xdn=", (EnvironmentImpl) null, (Cleaner) null, (UtilizationProfile) null, fileSelector0);
      fileProcessor0.hook142();
      assertFalse(fileProcessor0.isRunning());
  }

  @Test
  public void test40()  throws Throwable  {
      FileSelector fileSelector0 = new FileSelector();
      FileProcessor fileProcessor0 = new FileProcessor("LN;Xdn=", (EnvironmentImpl) null, (Cleaner) null, (UtilizationProfile) null, fileSelector0);
      // Undeclared exception!
      try { 
        fileProcessor0.hook139("LN;Xdn=");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.cleaner.FileProcessor", e);
      }
  }

  @Test
  public void test41()  throws Throwable  {
      FileSelector fileSelector0 = new FileSelector();
      FileProcessor fileProcessor0 = new FileProcessor("LN;Xdn=", (EnvironmentImpl) null, (Cleaner) null, (UtilizationProfile) null, fileSelector0);
      try { 
        fileProcessor0.addToQueue((Object) null);
        fail("Expecting exception: DatabaseException");
      
      } catch(DatabaseException e) {
         //
         // Cleaner.addToQueue should never be called.
         //
         assertThrownBy("com.sleepycat.je.cleaner.FileProcessor", e);
      }
  }

  @Test
  public void test42()  throws Throwable  {
      FileSelector fileSelector0 = new FileSelector();
      FileProcessor fileProcessor0 = new FileProcessor("LN;Xdn=", (EnvironmentImpl) null, (Cleaner) null, (UtilizationProfile) null, fileSelector0);
      String string0 = fileProcessor0.hook141("LN;Xdn=");
      assertEquals("LN;Xdn= nEntriesRead=0 nINsObsolete=0 nINsCleaned=0 nINsDead=0 nINsMigrated=0 nLNsObsolete=0 nLNsCleaned=0 nLNsDead=0 nLNsMigrated=0 nLNsMarked=0 nLNQueueHits=0 nLNsLocked=0", string0);
  }

  @Test
  public void test43()  throws Throwable  {
      FileSelector fileSelector0 = new FileSelector();
      FileProcessor fileProcessor0 = new FileProcessor("LN;Xdn=", (EnvironmentImpl) null, (Cleaner) null, (UtilizationProfile) null, fileSelector0);
      fileProcessor0.hook121("LN;Xdn=");
      assertFalse(fileProcessor0.isRunning());
  }

  @Test
  public void test44()  throws Throwable  {
      FileSelector fileSelector0 = new FileSelector();
      FileProcessor fileProcessor0 = new FileProcessor("7~|X[{~8fV", (EnvironmentImpl) null, (Cleaner) null, (UtilizationProfile) null, fileSelector0);
      fileProcessor0.hook153();
      assertFalse(fileProcessor0.isRunning());
  }

  @Test
  public void test45()  throws Throwable  {
      FileSelector fileSelector0 = new FileSelector();
      FileProcessor fileProcessor0 = new FileProcessor("LN;Xdn=", (EnvironmentImpl) null, (Cleaner) null, (UtilizationProfile) null, fileSelector0);
      fileProcessor0.hook151();
      assertEquals(0, fileProcessor0.getNWakeupRequests());
  }

  @Test
  public void test46()  throws Throwable  {
      FileSelector fileSelector0 = new FileSelector();
      FileProcessor fileProcessor0 = new FileProcessor("LN;Xdn=", (EnvironmentImpl) null, (Cleaner) null, (UtilizationProfile) null, fileSelector0);
      fileProcessor0.hook143();
      assertFalse(fileProcessor0.isRunning());
  }

  @Test
  public void test47()  throws Throwable  {
      FileSelector fileSelector0 = new FileSelector();
      FileProcessor fileProcessor0 = new FileProcessor("LN;Xdn=", (EnvironmentImpl) null, (Cleaner) null, (UtilizationProfile) null, fileSelector0);
      fileProcessor0.hook138();
      assertEquals(0, fileProcessor0.getNWakeupRequests());
  }
}
