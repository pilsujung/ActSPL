/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 09:59:48 KST 2017
 */

package com.sleepycat.je.cleaner;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.fail;

import java.util.HashMap;
import java.util.Map;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.sleepycat.je.DatabaseException;
import com.sleepycat.je.dbi.DatabaseId;
import com.sleepycat.je.dbi.DatabaseImpl;
import com.sleepycat.je.dbi.DbTree;
import com.sleepycat.je.dbi.EnvironmentImpl;
import com.sleepycat.je.tree.DupCountLN;
import com.sleepycat.je.tree.IN;
import com.sleepycat.je.tree.LN;
import com.sleepycat.je.tree.TreeLocation;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class FileProcessor_ESTest9 extends FileProcessor_ESTest_scaffolding9 {

  @Test
  public void test00()  throws Throwable  {
      Long long0 = new Long(0L);
      FileProcessor.FileProcessor_processFile fileProcessor_FileProcessor_processFile0 = new FileProcessor.FileProcessor_processFile((FileProcessor) null, long0);
      TreeLocation treeLocation0 = new TreeLocation();
      FileProcessor.FileProcessor_processLN fileProcessor_FileProcessor_processLN0 = new FileProcessor.FileProcessor_processLN((FileProcessor) null, long0, treeLocation0, long0, (LNInfo) null, fileProcessor_FileProcessor_processFile0, (Map) null);
      fileProcessor_FileProcessor_processLN0.obsolete = true;
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
      Long long0 = new Long((long) 868);
      FileProcessor.FileProcessor_processFile fileProcessor_FileProcessor_processFile0 = new FileProcessor.FileProcessor_processFile((FileProcessor) null, long0);
      fileProcessor_FileProcessor_processFile0.adjustMem = 83;
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
      Long long0 = new Long(0L);
      FileProcessor.FileProcessor_processFile fileProcessor_FileProcessor_processFile0 = new FileProcessor.FileProcessor_processFile((FileProcessor) null, long0);
      fileProcessor_FileProcessor_processFile0.nProcessedLNs = 1024;
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
  public void test03()  throws Throwable  {
      Long long0 = new Long(0L);
      FileProcessor.FileProcessor_processFile fileProcessor_FileProcessor_processFile0 = new FileProcessor.FileProcessor_processFile((FileProcessor) null, long0);
      fileProcessor_FileProcessor_processFile0.lookAheadCacheSize = 1;
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
  public void test05()  throws Throwable  {
      FileProcessor fileProcessor0 = new FileProcessor("jHX<C@!I*3", (EnvironmentImpl) null, (Cleaner) null, (UtilizationProfile) null, (FileSelector) null);
      Long long0 = new Long((-1L));
      FileProcessor.FileProcessor_processFile fileProcessor_FileProcessor_processFile0 = new FileProcessor.FileProcessor_processFile(fileProcessor0, long0);
      // Undeclared exception!
      try { 
        fileProcessor_FileProcessor_processFile0.execute();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.cleaner.FileProcessor$FileProcessor_processFile", e);
      }
  }

  @Test
  public void test06()  throws Throwable  {
      FileSelector fileSelector0 = new FileSelector();
      FileProcessor fileProcessor0 = new FileProcessor(".<p?;x]|hY2m", (EnvironmentImpl) null, (Cleaner) null, (UtilizationProfile) null, fileSelector0);
      // Undeclared exception!
      try { 
        fileProcessor0.doClean(true, true, true);
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
      Long long0 = new Long(0L);
      FileProcessor.FileProcessor_processFile fileProcessor_FileProcessor_processFile0 = new FileProcessor.FileProcessor_processFile((FileProcessor) null, long0);
      fileProcessor_FileProcessor_processFile0.isIN = true;
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
  public void test08()  throws Throwable  {
      DupCountLN dupCountLN0 = new DupCountLN();
      Long long0 = new Long((long) 868);
      TreeLocation treeLocation0 = new TreeLocation();
      DatabaseId databaseId0 = DbTree.NAME_DB_ID;
      LNInfo lNInfo0 = new LNInfo((LN) dupCountLN0, databaseId0, (byte[]) null, (byte[]) null);
      FileProcessor.FileProcessor_processLN fileProcessor_FileProcessor_processLN0 = new FileProcessor.FileProcessor_processLN((FileProcessor) null, long0, treeLocation0, long0, lNInfo0, (Object) null, (Map) null);
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
  public void test09()  throws Throwable  {
      DupCountLN dupCountLN0 = new DupCountLN(868);
      Long long0 = new Long((long) 868);
      TreeLocation treeLocation0 = new TreeLocation();
      DatabaseId databaseId0 = DbTree.NAME_DB_ID;
      LNInfo lNInfo0 = new LNInfo((LN) dupCountLN0, databaseId0, (byte[]) null, (byte[]) null);
      FileProcessor.FileProcessor_processLN fileProcessor_FileProcessor_processLN0 = new FileProcessor.FileProcessor_processLN((FileProcessor) null, long0, treeLocation0, long0, lNInfo0, (Object) null, (Map) null);
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
  public void test10()  throws Throwable  {
      Long long0 = new Long((long) 868);
      TreeLocation treeLocation0 = new TreeLocation();
      FileProcessor.FileProcessor_processLN fileProcessor_FileProcessor_processLN0 = new FileProcessor.FileProcessor_processLN((FileProcessor) null, long0, treeLocation0, long0, (LNInfo) null, (Object) null, (Map) null);
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
  public void test12()  throws Throwable  {
      TreeLocation treeLocation0 = new TreeLocation();
      Object object0 = new Object();
      HashMap<Object, String> hashMap0 = new HashMap<Object, String>();
      FileProcessor.FileProcessor_processLN fileProcessor_FileProcessor_processLN0 = new FileProcessor.FileProcessor_processLN((FileProcessor) null, (Long) (-1L), treeLocation0, (Long) treeLocation0.childLsn, (LNInfo) null, object0, hashMap0);
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
  public void test14()  throws Throwable  {
      Long long0 = new Long(0L);
      FileProcessor.FileProcessor_processFile fileProcessor_FileProcessor_processFile0 = new FileProcessor.FileProcessor_processFile((FileProcessor) null, long0);
      fileProcessor_FileProcessor_processFile0.hook137();
  }

  @Test
  public void test16()  throws Throwable  {
      Long long0 = new Long((-867L));
      FileProcessor.FileProcessor_processFile fileProcessor_FileProcessor_processFile0 = new FileProcessor.FileProcessor_processFile((FileProcessor) null, long0);
      // Undeclared exception!
      try { 
        fileProcessor_FileProcessor_processFile0.hook146();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.cleaner.FileProcessor", e);
      }
  }

  @Test
  public void test18()  throws Throwable  {
      Long long0 = new Long((long) 868);
      FileProcessor.FileProcessor_processFile fileProcessor_FileProcessor_processFile0 = new FileProcessor.FileProcessor_processFile((FileProcessor) null, long0);
      fileProcessor_FileProcessor_processFile0.hook147();
  }

  @Test
  public void test19()  throws Throwable  {
      Long long0 = new Long((long) 868);
      FileProcessor.FileProcessor_processFile fileProcessor_FileProcessor_processFile0 = new FileProcessor.FileProcessor_processFile((FileProcessor) null, long0);
      fileProcessor_FileProcessor_processFile0.hook154();
      fileProcessor_FileProcessor_processFile0.hook155();
  }

  @Test
  public void test20()  throws Throwable  {
      FileProcessor.FileProcessor_processFile fileProcessor_FileProcessor_processFile0 = new FileProcessor.FileProcessor_processFile((FileProcessor) null, (Long) (-1L));
      fileProcessor_FileProcessor_processFile0.hook129();
  }

  @Test
  public void test22()  throws Throwable  {
      Long long0 = new Long(67108869L);
      FileProcessor.FileProcessor_processFile fileProcessor_FileProcessor_processFile0 = new FileProcessor.FileProcessor_processFile((FileProcessor) null, long0);
      // Undeclared exception!
      try { 
        fileProcessor_FileProcessor_processFile0.hook130();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.cleaner.FileProcessor", e);
      }
  }

  @Test
  public void test23()  throws Throwable  {
      Long long0 = new Long(0L);
      FileProcessor.FileProcessor_processFile fileProcessor_FileProcessor_processFile0 = new FileProcessor.FileProcessor_processFile((FileProcessor) null, long0);
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
  public void test24()  throws Throwable  {
      Long long0 = Long.getLong("", (-1L));
      FileProcessor.FileProcessor_processFile fileProcessor_FileProcessor_processFile0 = new FileProcessor.FileProcessor_processFile((FileProcessor) null, long0);
      fileProcessor_FileProcessor_processFile0.hook118();
  }

  @Test
  public void test25()  throws Throwable  {
      FileProcessor fileProcessor0 = new FileProcessor("jHX<C@!I*3", (EnvironmentImpl) null, (Cleaner) null, (UtilizationProfile) null, (FileSelector) null);
      // Undeclared exception!
      try { 
        fileProcessor0.hook136((IN) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.cleaner.FileProcessor", e);
      }
  }

  @Test
  public void test26()  throws Throwable  {
      FileProcessor fileProcessor0 = new FileProcessor("jHX<C@!I*3", (EnvironmentImpl) null, (Cleaner) null, (UtilizationProfile) null, (FileSelector) null);
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
  public void test27()  throws Throwable  {
      FileProcessor fileProcessor0 = new FileProcessor("jHX<C@!I*3", (EnvironmentImpl) null, (Cleaner) null, (UtilizationProfile) null, (FileSelector) null);
      fileProcessor0.clearEnv();
      assertFalse(fileProcessor0.isRunning());
  }

  @Test
  public void test28()  throws Throwable  {
      FileProcessor fileProcessor0 = new FileProcessor("jHX<C@!I*3", (EnvironmentImpl) null, (Cleaner) null, (UtilizationProfile) null, (FileSelector) null);
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
  public void test29()  throws Throwable  {
      FileProcessor fileProcessor0 = new FileProcessor("jHX<C@!I*3", (EnvironmentImpl) null, (Cleaner) null, (UtilizationProfile) null, (FileSelector) null);
      String string0 = fileProcessor0.toString();
      assertEquals("<Cleaner name=\"jHX<C@!I*3\"/>", string0);
  }

  @Test
  public void test30()  throws Throwable  {
      FileProcessor fileProcessor0 = new FileProcessor("jHX<C@!I*3", (EnvironmentImpl) null, (Cleaner) null, (UtilizationProfile) null, (FileSelector) null);
      DatabaseImpl databaseImpl0 = new DatabaseImpl();
      // Undeclared exception!
      try { 
        fileProcessor0.hook160(databaseImpl0);
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
      FileProcessor fileProcessor0 = new FileProcessor("jHX<C@!I*3", (EnvironmentImpl) null, (Cleaner) null, (UtilizationProfile) null, (FileSelector) null);
      fileProcessor0.hook144();
      assertFalse(fileProcessor0.isRunning());
  }

  @Test
  public void test32()  throws Throwable  {
      FileProcessor fileProcessor0 = new FileProcessor("jHX<C@!I*3", (EnvironmentImpl) null, (Cleaner) null, (UtilizationProfile) null, (FileSelector) null);
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
  public void test33()  throws Throwable  {
      FileProcessor fileProcessor0 = new FileProcessor("jHX<C@!I*3", (EnvironmentImpl) null, (Cleaner) null, (UtilizationProfile) null, (FileSelector) null);
      fileProcessor0.hook152();
      assertFalse(fileProcessor0.isRunning());
  }

  @Test
  public void test34()  throws Throwable  {
      FileProcessor fileProcessor0 = new FileProcessor("jHX<C@!I*3", (EnvironmentImpl) null, (Cleaner) null, (UtilizationProfile) null, (FileSelector) null);
      fileProcessor0.hook142();
      assertFalse(fileProcessor0.isRunning());
  }

  @Test
  public void test35()  throws Throwable  {
      FileProcessor fileProcessor0 = new FileProcessor("jHX<C@!I*3", (EnvironmentImpl) null, (Cleaner) null, (UtilizationProfile) null, (FileSelector) null);
      // Undeclared exception!
      try { 
        fileProcessor0.hook139("");
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
      FileProcessor fileProcessor0 = new FileProcessor("jHX<C@!I*3", (EnvironmentImpl) null, (Cleaner) null, (UtilizationProfile) null, (FileSelector) null);
      try { 
        fileProcessor0.addToQueue(fileProcessor0);
        fail("Expecting exception: DatabaseException");
      
      } catch(DatabaseException e) {
         //
         // Cleaner.addToQueue should never be called.
         //
         assertThrownBy("com.sleepycat.je.cleaner.FileProcessor", e);
      }
  }

  @Test
  public void test37()  throws Throwable  {
      FileProcessor fileProcessor0 = new FileProcessor("jHX<C@!I*3", (EnvironmentImpl) null, (Cleaner) null, (UtilizationProfile) null, (FileSelector) null);
      String string0 = fileProcessor0.hook141("jHX<C@!I*3");
      assertEquals("jHX<C@!I*3 nEntriesRead=0 nINsObsolete=0 nINsCleaned=0 nINsDead=0 nINsMigrated=0 nLNsObsolete=0 nLNsCleaned=0 nLNsDead=0 nLNsMigrated=0 nLNsMarked=0 nLNQueueHits=0 nLNsLocked=0", string0);
  }

  @Test
  public void test38()  throws Throwable  {
      FileProcessor fileProcessor0 = new FileProcessor("jHX<C@!I*3", (EnvironmentImpl) null, (Cleaner) null, (UtilizationProfile) null, (FileSelector) null);
      fileProcessor0.hook153();
      assertEquals(0, fileProcessor0.getNWakeupRequests());
  }

  @Test
  public void test39()  throws Throwable  {
      FileProcessor fileProcessor0 = new FileProcessor("jHX<C@!I*3", (EnvironmentImpl) null, (Cleaner) null, (UtilizationProfile) null, (FileSelector) null);
      fileProcessor0.hook151();
      assertEquals(0, fileProcessor0.getNWakeupRequests());
  }

  @Test
  public void test40()  throws Throwable  {
      FileProcessor fileProcessor0 = new FileProcessor("jHX<C@!I*3", (EnvironmentImpl) null, (Cleaner) null, (UtilizationProfile) null, (FileSelector) null);
      fileProcessor0.hook143();
      assertFalse(fileProcessor0.isRunning());
  }

  @Test
  public void test41()  throws Throwable  {
      FileProcessor fileProcessor0 = new FileProcessor("jHX<C@!I*3", (EnvironmentImpl) null, (Cleaner) null, (UtilizationProfile) null, (FileSelector) null);
      fileProcessor0.hook138();
      assertFalse(fileProcessor0.isRunning());
  }
}
