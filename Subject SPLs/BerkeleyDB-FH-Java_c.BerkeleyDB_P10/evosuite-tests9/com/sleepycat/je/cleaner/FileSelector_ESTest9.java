/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 10:01:28 KST 2017
 */

package com.sleepycat.je.cleaner;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.File;
import java.lang.reflect.Array;
import java.util.Properties;
import java.util.Set;
import java.util.TreeSet;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.sleepycat.je.EnvironmentConfig;
import com.sleepycat.je.dbi.DatabaseId;
import com.sleepycat.je.tree.FileSummaryLN;
import com.sleepycat.je.tree.LN;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class FileSelector_ESTest9 extends FileSelector_ESTest_scaffolding9 {


  @Test
  public void test01()  throws Throwable  {
      FileSelector fileSelector0 = new FileSelector();
      Long long0 = new Long((-6L));
      fileSelector0.putBackFileForCleaning(long0);
      int int0 = fileSelector0.getBacklog();
      assertEquals(1, int0);
  }

  @Test
  public void test02()  throws Throwable  {
      FileSelector fileSelector0 = new FileSelector();
      fileSelector0.addPendingDB((DatabaseId) null);
      boolean boolean0 = fileSelector0.addPendingDB((DatabaseId) null);
      assertFalse(boolean0);
  }


  @Test
  public void test04()  throws Throwable  {
      FileSelector fileSelector0 = new FileSelector();
      LN lN0 = new LN();
      DatabaseId databaseId0 = new DatabaseId(688);
      byte[] byteArray0 = new byte[2];
      byte[] byteArray1 = new byte[3];
      boolean boolean0 = fileSelector0.addPendingLN(lN0, databaseId0, byteArray0, byteArray1);
      assertFalse(boolean0);
  }

  @Test
  public void test05()  throws Throwable  {
      FileSelector fileSelector0 = new FileSelector();
      // Undeclared exception!
      try { 
        fileSelector0.selectFileForCleaning((UtilizationProfile) null, true, false, 2);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.cleaner.FileSelector", e);
      }
  }

  @Test
  public void test06()  throws Throwable  {
      FileSelector fileSelector0 = new FileSelector();
      // Undeclared exception!
      try { 
        fileSelector0.selectFileForCleaning((UtilizationProfile) null, true, true, (-3021));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.cleaner.FileSelector", e);
      }
  }

  @Test
  public void test07()  throws Throwable  {
      FileSelector fileSelector0 = new FileSelector();
      Long long0 = new Long(0L);
      fileSelector0.isFileCleaningInProgress(long0);
      File file0 = null;
      EnvironmentConfig environmentConfig0 = null;
      try {
        environmentConfig0 = new EnvironmentConfig((Properties) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.EnvironmentMutableConfig", e);
      }
  }






  @Test
  public void test13()  throws Throwable  {
      FileSelector fileSelector0 = new FileSelector();
      DatabaseId databaseId0 = new DatabaseId();
      fileSelector0.addPendingDB(databaseId0);
      DatabaseId[] databaseIdArray0 = fileSelector0.getPendingDBs();
      assertNotNull(databaseIdArray0);
  }


  @Test
  public void test15()  throws Throwable  {
      FileSelector fileSelector0 = new FileSelector();
      fileSelector0.addPendingDB((DatabaseId) null);
      fileSelector0.removePendingLN((byte)0);
  }


  @Test
  public void test17()  throws Throwable  {
      FileSelector fileSelector0 = new FileSelector();
      fileSelector0.addCleanedFile((Long) null);
      Set[] setArray0 = fileSelector0.getFilesAtCheckpointStart();
      fileSelector0.updateFilesAtCheckpointEnd(setArray0);
      Set set0 = fileSelector0.copySafeToDeleteFiles();
      assertEquals(1, set0.size());
  }

  @Test
  public void test18()  throws Throwable  {
      FileSelector fileSelector0 = new FileSelector();
      FileSummaryLN fileSummaryLN0 = new FileSummaryLN();
      DatabaseId databaseId0 = new DatabaseId();
      byte[] byteArray0 = new byte[2];
      fileSelector0.addPendingLN(fileSummaryLN0, databaseId0, byteArray0, byteArray0);
      LNInfo[] lNInfoArray0 = fileSelector0.getPendingLNs();
      assertNotNull(lNInfoArray0);
  }


  @Test
  public void test20()  throws Throwable  {
      FileSelector fileSelector0 = new FileSelector();
      FileSummaryLN fileSummaryLN0 = new FileSummaryLN();
      DatabaseId databaseId0 = new DatabaseId();
      byte[] byteArray0 = new byte[2];
      boolean boolean0 = fileSelector0.addPendingLN(fileSummaryLN0, databaseId0, byteArray0, byteArray0);
      assertFalse(boolean0);
      
      boolean boolean1 = fileSelector0.addPendingLN(fileSummaryLN0, databaseId0, byteArray0, byteArray0);
      assertTrue(boolean1);
  }

  @Test
  public void test22()  throws Throwable  {
      FileSelector fileSelector0 = new FileSelector();
      Set<String>[] setArray0 = (Set<String>[]) Array.newInstance(Set.class, 4);
      TreeSet<String> treeSet0 = new TreeSet<String>();
      setArray0[1] = (Set<String>) treeSet0;
      fileSelector0.updateFilesAtCheckpointEnd(setArray0);
  }




  @Test
  public void test26()  throws Throwable  {
      FileSelector fileSelector0 = new FileSelector();
      FileSummaryLN fileSummaryLN0 = new FileSummaryLN();
      DatabaseId databaseId0 = new DatabaseId();
      byte[] byteArray0 = new byte[2];
      boolean boolean0 = fileSelector0.addPendingLN(fileSummaryLN0, databaseId0, byteArray0, byteArray0);
      Long long0 = new Long((long) (byte)16);
      fileSelector0.addCleanedFile(long0);
      Set[] setArray0 = fileSelector0.getFilesAtCheckpointStart();
      assertNotNull(setArray0);
      
      fileSelector0.updateFilesAtCheckpointEnd(setArray0);
      boolean boolean1 = fileSelector0.isFileCleaningInProgress(long0);
      assertFalse(boolean1 == boolean0);
      assertTrue(boolean1);
  }

  @Test
  public void test27()  throws Throwable  {
      FileSelector fileSelector0 = new FileSelector();
      Long long0 = new Long((long) 0);
      fileSelector0.addCleanedFile(long0);
      boolean boolean0 = fileSelector0.isFileCleaningInProgress(long0);
      assertTrue(boolean0);
  }

  @Test
  public void test28()  throws Throwable  {
      FileSelector fileSelector0 = new FileSelector();
      Long long0 = new Long((-6L));
      fileSelector0.putBackFileForCleaning(long0);
      // Undeclared exception!
      try { 
        fileSelector0.selectFileForCleaning((UtilizationProfile) null, false, true, 1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.cleaner.FileSelector", e);
      }
  }


  @Test
  public void test30()  throws Throwable  {
      FileSelector fileSelector0 = new FileSelector();
      DatabaseId databaseId0 = new DatabaseId();
      fileSelector0.removePendingDB(databaseId0);
      assertFalse(databaseId0.logEntryIsTransactional());
  }




  @Test
  public void test34()  throws Throwable  {
      FileSelector fileSelector0 = new FileSelector();
      Long long0 = new Long((long) (byte)16);
      fileSelector0.addCleanedFile(long0);
      Set[] setArray0 = fileSelector0.getFilesAtCheckpointStart();
      assertNotNull(setArray0);
      
      fileSelector0.updateFilesAtCheckpointEnd(setArray0);
      boolean boolean0 = fileSelector0.isFileCleaningInProgress(long0);
      assertTrue(boolean0);
  }


}