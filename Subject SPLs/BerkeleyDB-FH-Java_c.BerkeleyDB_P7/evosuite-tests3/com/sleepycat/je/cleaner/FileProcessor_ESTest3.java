/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 03:42:01 KST 2017
 */

package com.sleepycat.je.cleaner;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.fail;

import java.io.IOException;
import java.util.HashMap;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.sleepycat.je.DatabaseException;
import com.sleepycat.je.dbi.DatabaseId;
import com.sleepycat.je.dbi.DatabaseImpl;
import com.sleepycat.je.dbi.EnvironmentImpl;
import com.sleepycat.je.tree.DupCountLN;
import com.sleepycat.je.tree.IN;
import com.sleepycat.je.tree.LN;
import com.sleepycat.je.tree.MapLN;
import com.sleepycat.je.tree.TreeLocation;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class FileProcessor_ESTest3 extends FileProcessor_ESTest_scaffolding3 {

  @Test
  public void test03()  throws Throwable  {
      TreeLocation treeLocation0 = new TreeLocation();
      MapLN mapLN0 = new MapLN();
      DatabaseId databaseId0 = new DatabaseId();
      HashMap<FileProcessor, IN> hashMap0 = new HashMap<FileProcessor, IN>();
      LNInfo lNInfo0 = new LNInfo((LN) mapLN0, databaseId0, (byte[]) null, (byte[]) null);
      FileProcessor.FileProcessor_processLN fileProcessor_FileProcessor_processLN0 = new FileProcessor.FileProcessor_processLN((FileProcessor) null, (Long) null, treeLocation0, (Long) (-1L), lNInfo0, databaseId0, hashMap0);
      //  // Unstable assertion: assertEquals(140L, mapLN0.getLastId());
  }

  @Test
  public void test04()  throws Throwable  {
      Long long0 = new Long((-16L));
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
  public void test05()  throws Throwable  {
      Long long0 = new Long((-16L));
      FileProcessor.FileProcessor_processFile fileProcessor_FileProcessor_processFile0 = new FileProcessor.FileProcessor_processFile((FileProcessor) null, long0);
      boolean boolean0 = true;
      DatabaseImpl databaseImpl0 = null;
      try {  
      databaseImpl0 = fileProcessor_FileProcessor_processFile0.db3;
      } catch(NullPointerException e) {}
  }

  @Test
  public void test06()  throws Throwable  {
      FileProcessor.FileProcessor_processFile fileProcessor_FileProcessor_processFile0 = new FileProcessor.FileProcessor_processFile((FileProcessor) null, (Long) null);
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
  public void test07()  throws Throwable  {
      FileSelector fileSelector0 = new FileSelector();
      FileProcessor fileProcessor0 = new FileProcessor("S]HhSB  j[!DhX6y'_#", (EnvironmentImpl) null, (Cleaner) null, (UtilizationProfile) null, fileSelector0);
      // Undeclared exception!
      try { 
        fileProcessor0.doClean(false, false, true);
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
      TreeLocation treeLocation0 = new TreeLocation();
      MapLN mapLN0 = new MapLN();
      DatabaseId databaseId0 = new DatabaseId();
      HashMap<FileProcessor, IN> hashMap0 = new HashMap<FileProcessor, IN>();
      LNInfo lNInfo0 = new LNInfo((LN) mapLN0, databaseId0, (byte[]) null, (byte[]) null);
      FileProcessor.FileProcessor_processLN fileProcessor_FileProcessor_processLN0 = new FileProcessor.FileProcessor_processLN((FileProcessor) null, (Long) null, treeLocation0, (Long) null, lNInfo0, databaseId0, hashMap0);
      fileProcessor_FileProcessor_processLN0.processedHere = true;
      // Undeclared exception!
      try { 
        fileProcessor_FileProcessor_processLN0.hook126();
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
      MapLN mapLN0 = new MapLN();
      DatabaseId databaseId0 = new DatabaseId();
      HashMap<FileProcessor, IN> hashMap0 = new HashMap<FileProcessor, IN>();
      TreeLocation treeLocation0 = new TreeLocation();
      LNInfo lNInfo0 = new LNInfo((LN) mapLN0, databaseId0, (byte[]) null, (byte[]) null);
      FileProcessor.FileProcessor_processLN fileProcessor_FileProcessor_processLN0 = new FileProcessor.FileProcessor_processLN((FileProcessor) null, (Long) null, treeLocation0, (Long) null, lNInfo0, databaseId0, hashMap0);
      fileProcessor_FileProcessor_processLN0.hook126();
      //  // Unstable assertion: assertEquals(59L, mapLN0.getLastId());
  }

  @Test
  public void test13()  throws Throwable  {
      MapLN mapLN0 = new MapLN();
      DatabaseId databaseId0 = new DatabaseId();
      HashMap<FileProcessor, IN> hashMap0 = new HashMap<FileProcessor, IN>();
      TreeLocation treeLocation0 = new TreeLocation();
      LNInfo lNInfo0 = new LNInfo((LN) mapLN0, databaseId0, (byte[]) null, (byte[]) null);
      FileProcessor.FileProcessor_processLN fileProcessor_FileProcessor_processLN0 = new FileProcessor.FileProcessor_processLN((FileProcessor) null, (Long) null, treeLocation0, (Long) null, lNInfo0, databaseId0, hashMap0);
      fileProcessor_FileProcessor_processLN0.hook135();
      //  // Unstable assertion: assertEquals(44L, mapLN0.getLastId());
  }

  @Test
  public void test14()  throws Throwable  {
      TreeLocation treeLocation0 = new TreeLocation();
      MapLN mapLN0 = new MapLN();
      DatabaseId databaseId0 = new DatabaseId();
      HashMap<FileProcessor, IN> hashMap0 = new HashMap<FileProcessor, IN>();
      LNInfo lNInfo0 = new LNInfo((LN) mapLN0, databaseId0, (byte[]) null, (byte[]) null);
      FileProcessor.FileProcessor_processLN fileProcessor_FileProcessor_processLN0 = new FileProcessor.FileProcessor_processLN((FileProcessor) null, (Long) null, treeLocation0, (Long) null, lNInfo0, databaseId0, hashMap0);
      fileProcessor_FileProcessor_processLN0.hook158();
      //  // Unstable assertion: assertEquals(31L, mapLN0.getLastId());
  }

  @Test
  public void test15()  throws Throwable  {
      TreeLocation treeLocation0 = new TreeLocation();
      MapLN mapLN0 = new MapLN();
      DatabaseId databaseId0 = new DatabaseId();
      HashMap<FileProcessor, IN> hashMap0 = new HashMap<FileProcessor, IN>();
      LNInfo lNInfo0 = new LNInfo((LN) mapLN0, databaseId0, (byte[]) null, (byte[]) null);
      FileProcessor.FileProcessor_processLN fileProcessor_FileProcessor_processLN0 = new FileProcessor.FileProcessor_processLN((FileProcessor) null, (Long) null, treeLocation0, (Long) null, lNInfo0, databaseId0, hashMap0);
      fileProcessor_FileProcessor_processLN0.hook157();
      //  // Unstable assertion: assertEquals(18L, mapLN0.getLastId());
  }

  @Test
  public void test16()  throws Throwable  {
      FileProcessor.FileProcessor_processFile fileProcessor_FileProcessor_processFile0 = new FileProcessor.FileProcessor_processFile((FileProcessor) null, (Long) null);
      MapLN mapLN0 = new MapLN();
      DatabaseId databaseId0 = new DatabaseId();
      HashMap<FileProcessor, IN> hashMap0 = new HashMap<FileProcessor, IN>();
      LNInfo lNInfo0 = new LNInfo((LN) mapLN0, databaseId0, (byte[]) null, (byte[]) null);
      FileProcessor.FileProcessor_processLN fileProcessor_FileProcessor_processLN0 = new FileProcessor.FileProcessor_processLN((FileProcessor) null, (Long) null, fileProcessor_FileProcessor_processFile0.location, (Long) null, lNInfo0, databaseId0, hashMap0);
      fileProcessor_FileProcessor_processLN0.hook133();
      //  // Unstable assertion: assertEquals(2L, mapLN0.getLastId());
  }

  @Test
  public void test17()  throws Throwable  {
      Long long0 = new Long((-2249L));
      FileProcessor.FileProcessor_processFile fileProcessor_FileProcessor_processFile0 = new FileProcessor.FileProcessor_processFile((FileProcessor) null, long0);
      // Undeclared exception!
      try { 
        fileProcessor_FileProcessor_processFile0.hook137();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.cleaner.FileProcessor$FileProcessor_processFile", e);
      }
  }

  @Test
  public void test18()  throws Throwable  {
      FileSelector fileSelector0 = new FileSelector();
      FileProcessor fileProcessor0 = new FileProcessor((String) null, (EnvironmentImpl) null, (Cleaner) null, (UtilizationProfile) null, fileSelector0);
      FileProcessor.FileProcessor_processFile fileProcessor_FileProcessor_processFile0 = new FileProcessor.FileProcessor_processFile(fileProcessor0, (Long) null);
      fileProcessor_FileProcessor_processFile0.hook154();
  }

  @Test
  public void test19()  throws Throwable  {
      FileProcessor.FileProcessor_processFile fileProcessor_FileProcessor_processFile0 = new FileProcessor.FileProcessor_processFile((FileProcessor) null, (Long) null);
      fileProcessor_FileProcessor_processFile0.hook129();
  }

  @Test
  public void test20()  throws Throwable  {
      FileProcessor.FileProcessor_processFile fileProcessor_FileProcessor_processFile0 = new FileProcessor.FileProcessor_processFile((FileProcessor) null, (Long) null);
      fileProcessor_FileProcessor_processFile0.hook128();
  }

  @Test
  public void test21()  throws Throwable  {
      FileProcessor.FileProcessor_processFile fileProcessor_FileProcessor_processFile0 = new FileProcessor.FileProcessor_processFile((FileProcessor) null, (Long) null);
      fileProcessor_FileProcessor_processFile0.hook156();
  }

  @Test
  public void test22()  throws Throwable  {
      Long long0 = new Long((-2249L));
      FileProcessor.FileProcessor_processFile fileProcessor_FileProcessor_processFile0 = new FileProcessor.FileProcessor_processFile((FileProcessor) null, long0);
      fileProcessor_FileProcessor_processFile0.hook155();
  }

  @Test
  public void test23()  throws Throwable  {
      Long long0 = new Long(3L);
      FileProcessor.FileProcessor_processFile fileProcessor_FileProcessor_processFile0 = new FileProcessor.FileProcessor_processFile((FileProcessor) null, long0);
      fileProcessor_FileProcessor_processFile0.hook120();
  }

  @Test
  public void test24()  throws Throwable  {
      FileProcessor.FileProcessor_processFile fileProcessor_FileProcessor_processFile0 = new FileProcessor.FileProcessor_processFile((FileProcessor) null, (Long) null);
      fileProcessor_FileProcessor_processFile0.hook127();
  }

  @Test
  public void test25()  throws Throwable  {
      FileProcessor.FileProcessor_processFile fileProcessor_FileProcessor_processFile0 = new FileProcessor.FileProcessor_processFile((FileProcessor) null, (Long) null);
      fileProcessor_FileProcessor_processFile0.hook162();
  }

  @Test
  public void test26()  throws Throwable  {
      FileProcessor.FileProcessor_processFile fileProcessor_FileProcessor_processFile0 = new FileProcessor.FileProcessor_processFile((FileProcessor) null, (Long) null);
      fileProcessor_FileProcessor_processFile0.hook161();
  }

  @Test
  public void test27()  throws Throwable  {
      FileProcessor.FileProcessor_processFile fileProcessor_FileProcessor_processFile0 = new FileProcessor.FileProcessor_processFile((FileProcessor) null, (Long) null);
      fileProcessor_FileProcessor_processFile0.hook147();
  }

  @Test
  public void test30()  throws Throwable  {
      FileProcessor.FileProcessor_processFile fileProcessor_FileProcessor_processFile0 = new FileProcessor.FileProcessor_processFile((FileProcessor) null, (Long) null);
      fileProcessor_FileProcessor_processFile0.hook119();
  }

  @Test
  public void test31()  throws Throwable  {
      FileSelector fileSelector0 = new FileSelector();
      FileProcessor fileProcessor0 = new FileProcessor((String) null, (EnvironmentImpl) null, (Cleaner) null, (UtilizationProfile) null, fileSelector0);
      Long long0 = new Long(1804L);
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
  public void test33()  throws Throwable  {
      FileSelector fileSelector0 = new FileSelector();
      FileProcessor fileProcessor0 = new FileProcessor((String) null, (EnvironmentImpl) null, (Cleaner) null, (UtilizationProfile) null, fileSelector0);
      DupCountLN dupCountLN0 = new DupCountLN(1000);
      // Undeclared exception!
      try { 
        fileProcessor0.hook124(0L, dupCountLN0, true, true, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.cleaner.FileProcessor", e);
      }
  }

  @Test
  public void test34()  throws Throwable  {
      FileSelector fileSelector0 = new FileSelector();
      FileProcessor fileProcessor0 = new FileProcessor((String) null, (EnvironmentImpl) null, (Cleaner) null, (UtilizationProfile) null, fileSelector0);
      fileProcessor0.clearEnv();
      assertEquals(0, fileProcessor0.getNWakeupRequests());
  }

  @Test
  public void test35()  throws Throwable  {
      FileSelector fileSelector0 = new FileSelector();
      FileProcessor fileProcessor0 = new FileProcessor((String) null, (EnvironmentImpl) null, (Cleaner) null, (UtilizationProfile) null, fileSelector0);
      fileProcessor0.hook152();
      assertFalse(fileProcessor0.isRunning());
  }

  @Test
  public void test36()  throws Throwable  {
      FileSelector fileSelector0 = new FileSelector();
      FileProcessor fileProcessor0 = new FileProcessor((String) null, (EnvironmentImpl) null, (Cleaner) null, (UtilizationProfile) null, fileSelector0);
      fileProcessor0.hook138();
      assertEquals(0, fileProcessor0.getNWakeupRequests());
  }

  @Test
  public void test38()  throws Throwable  {
      FileSelector fileSelector0 = new FileSelector();
      FileProcessor fileProcessor0 = new FileProcessor((String) null, (EnvironmentImpl) null, (Cleaner) null, (UtilizationProfile) null, fileSelector0);
      fileProcessor0.hook142();
      assertEquals(0, fileProcessor0.getNWakeupRequests());
  }

  @Test
  public void test39()  throws Throwable  {
      FileSelector fileSelector0 = new FileSelector();
      FileProcessor fileProcessor0 = new FileProcessor((String) null, (EnvironmentImpl) null, (Cleaner) null, (UtilizationProfile) null, fileSelector0);
      String string0 = fileProcessor0.toString();
      assertEquals("<Cleaner name=\"null\"/>", string0);
  }

  @Test
  public void test40()  throws Throwable  {
      FileProcessor fileProcessor0 = new FileProcessor("Uot+", (EnvironmentImpl) null, (Cleaner) null, (UtilizationProfile) null, (FileSelector) null);
      fileProcessor0.hook144();
      assertEquals(0, fileProcessor0.getNWakeupRequests());
  }

  @Test
  public void test41()  throws Throwable  {
      FileSelector fileSelector0 = new FileSelector();
      FileProcessor fileProcessor0 = new FileProcessor((String) null, (EnvironmentImpl) null, (Cleaner) null, (UtilizationProfile) null, fileSelector0);
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
  public void test45()  throws Throwable  {
      FileSelector fileSelector0 = new FileSelector();
      FileProcessor fileProcessor0 = new FileProcessor((String) null, (EnvironmentImpl) null, (Cleaner) null, (UtilizationProfile) null, fileSelector0);
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
  public void test48()  throws Throwable  {
      FileSelector fileSelector0 = new FileSelector();
      FileProcessor fileProcessor0 = new FileProcessor((String) null, (EnvironmentImpl) null, (Cleaner) null, (UtilizationProfile) null, fileSelector0);
      fileProcessor0.hook153();
      assertFalse(fileProcessor0.isRunning());
  }

  @Test
  public void test49()  throws Throwable  {
      FileSelector fileSelector0 = new FileSelector();
      FileProcessor fileProcessor0 = new FileProcessor((String) null, (EnvironmentImpl) null, (Cleaner) null, (UtilizationProfile) null, fileSelector0);
      fileProcessor0.hook151();
      assertEquals(0, fileProcessor0.getNWakeupRequests());
  }

  @Test
  public void test50()  throws Throwable  {
      FileSelector fileSelector0 = new FileSelector();
      FileProcessor fileProcessor0 = new FileProcessor((String) null, (EnvironmentImpl) null, (Cleaner) null, (UtilizationProfile) null, fileSelector0);
      fileProcessor0.hook143();
      assertEquals(0, fileProcessor0.getNWakeupRequests());
  }
}
