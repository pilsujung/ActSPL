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
  public void test12()  throws Throwable  {
      Long long0 = new Long((-944L));
      TreeLocation treeLocation0 = new TreeLocation();
      FileProcessor.FileProcessor_processLN fileProcessor_FileProcessor_processLN0 = new FileProcessor.FileProcessor_processLN((FileProcessor) null, long0, treeLocation0, long0, (LNInfo) null, treeLocation0.index, (Map) null);
      fileProcessor_FileProcessor_processLN0.hook126();
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
