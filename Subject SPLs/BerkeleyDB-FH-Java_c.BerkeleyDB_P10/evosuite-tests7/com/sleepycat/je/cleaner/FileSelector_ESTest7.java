/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 21 19:43:47 KST 2017
 */

package com.sleepycat.je.cleaner;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.lang.reflect.Array;
import java.util.Set;
import java.util.TreeSet;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.sleepycat.je.dbi.DatabaseId;
import com.sleepycat.je.tree.DupCountLN;
import com.sleepycat.je.tree.FileSummaryLN;
import com.sleepycat.je.tree.LN;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class FileSelector_ESTest7 extends FileSelector_ESTest_scaffolding7 {

  @Test
  public void test00()  throws Throwable  {
      FileSelector fileSelector0 = new FileSelector();
      boolean boolean0 = fileSelector0.hook165(false);
      assertFalse(boolean0);
  }

  @Test
  public void test01()  throws Throwable  {
      FileSelector fileSelector0 = new FileSelector();
      Long long0 = new Long(0L);
      fileSelector0.putBackFileForCleaning(long0);
      int int0 = fileSelector0.getBacklog();
      assertEquals(1, int0);
  }

  @Test
  public void test02()  throws Throwable  {
      FileSelector fileSelector0 = new FileSelector();
      UtilizationProfile utilizationProfile0 = null;
      boolean boolean0 = true;
      int int0 = 0;
      // Undeclared exception!
      try { 
        fileSelector0.selectFileForCleaning((UtilizationProfile) null, true, true, 2);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.cleaner.FileSelector", e);
      }
  }

  @Test
  public void test03()  throws Throwable  {
      FileSelector fileSelector0 = new FileSelector();
      boolean boolean0 = fileSelector0.hook165(true);
      assertTrue(boolean0);
  }

  @Test
  public void test04()  throws Throwable  {
      FileSelector fileSelector0 = new FileSelector();
      fileSelector0.hook164();
  }

  @Test
  public void test05()  throws Throwable  {
      FileSelector fileSelector0 = new FileSelector();
      fileSelector0.hook163();
  }

  @Test
  public void test06()  throws Throwable  {
      FileSelector fileSelector0 = new FileSelector();
      // Undeclared exception!
      try { 
        fileSelector0.putBackFileForCleaning((Long) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test07()  throws Throwable  {
      FileSelector fileSelector0 = new FileSelector();
      Long long0 = new Long((-686L));
      fileSelector0.addCleanedFile((Long) null);
      // Undeclared exception!
      try { 
        fileSelector0.isFileCleaningInProgress(long0);
       //  fail("Expecting exception: NullPointerException");
       // Unstable assertion
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test08()  throws Throwable  {
      FileSelector fileSelector0 = new FileSelector();
      FileSummaryLN fileSummaryLN0 = new FileSummaryLN();
      DatabaseId databaseId0 = new DatabaseId(0);
      byte[] byteArray0 = new byte[0];
      byte[] byteArray1 = new byte[7];
      fileSelector0.addPendingLN(fileSummaryLN0, databaseId0, byteArray0, byteArray1);
      fileSelector0.removePendingLN((-1737L));
  }

  @Test
  public void test09()  throws Throwable  {
      FileSelector fileSelector0 = new FileSelector();
      Set set0 = fileSelector0.copySafeToDeleteFiles();
      assertNull(set0);
  }

  @Test
  public void test10()  throws Throwable  {
      FileSelector fileSelector0 = new FileSelector();
      DupCountLN dupCountLN0 = new DupCountLN((-371));
      DatabaseId databaseId0 = new DatabaseId();
      byte[] byteArray0 = new byte[7];
      fileSelector0.addPendingLN(dupCountLN0, databaseId0, byteArray0, byteArray0);
      LNInfo[] lNInfoArray0 = fileSelector0.getPendingLNs();
      assertNotNull(lNInfoArray0);
  }

  @Test
  public void test11()  throws Throwable  {
      FileSelector fileSelector0 = new FileSelector();
      LNInfo[] lNInfoArray0 = fileSelector0.getPendingLNs();
      assertNull(lNInfoArray0);
  }

  @Test
  public void test12()  throws Throwable  {
      FileSelector fileSelector0 = new FileSelector();
      DupCountLN dupCountLN0 = new DupCountLN();
      DatabaseId databaseId0 = new DatabaseId((-656));
      byte[] byteArray0 = new byte[2];
      boolean boolean0 = fileSelector0.addPendingLN(dupCountLN0, databaseId0, byteArray0, byteArray0);
      assertFalse(boolean0);
      
      FileSummaryLN fileSummaryLN0 = new FileSummaryLN();
      boolean boolean1 = fileSelector0.addPendingLN(fileSummaryLN0, databaseId0, byteArray0, byteArray0);
      assertTrue(boolean1);
  }

  @Test
  public void test14()  throws Throwable  {
      FileSelector fileSelector0 = new FileSelector();
      Set<String>[] setArray0 = (Set<String>[]) Array.newInstance(Set.class, 3);
      TreeSet<String> treeSet0 = new TreeSet<String>();
      setArray0[1] = (Set<String>) treeSet0;
      fileSelector0.updateFilesAtCheckpointEnd(setArray0);
  }

  @Test
  public void test15()  throws Throwable  {
      FileSelector fileSelector0 = new FileSelector();
      Set<String>[] setArray0 = (Set<String>[]) Array.newInstance(Set.class, 3);
      TreeSet<String> treeSet0 = new TreeSet<String>();
      setArray0[0] = (Set<String>) treeSet0;
      fileSelector0.updateFilesAtCheckpointEnd(setArray0);
  }

  @Test
  public void test16()  throws Throwable  {
      FileSelector fileSelector0 = new FileSelector();
      Set<Integer>[] setArray0 = (Set<Integer>[]) Array.newInstance(Set.class, 0);
      // Undeclared exception!
      try { 
        fileSelector0.updateFilesAtCheckpointEnd(setArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         assertThrownBy("com.sleepycat.je.cleaner.FileSelector", e);
      }
  }

  @Test
  public void test17()  throws Throwable  {
      FileSelector fileSelector0 = new FileSelector();
      fileSelector0.updateFilesAtCheckpointEnd((Set[]) null);
  }

  @Test
  public void test18()  throws Throwable  {
      FileSelector fileSelector0 = new FileSelector();
      Long long0 = new Long((-178L));
      fileSelector0.addCleanedFile(long0);
      Set[] setArray0 = fileSelector0.getFilesAtCheckpointStart();
      assertNotNull(setArray0);
  }

  @Test
  public void test19()  throws Throwable  {
      FileSelector fileSelector0 = new FileSelector();
      FileSummaryLN fileSummaryLN0 = new FileSummaryLN();
      DatabaseId databaseId0 = new DatabaseId(0);
      byte[] byteArray0 = new byte[0];
      byte[] byteArray1 = new byte[7];
      fileSelector0.addPendingLN(fileSummaryLN0, databaseId0, byteArray0, byteArray1);
      Set[] setArray0 = fileSelector0.getFilesAtCheckpointStart();
      assertNull(setArray0);
  }

  @Test
  public void test20()  throws Throwable  {
      FileSelector fileSelector0 = new FileSelector();
      Long long0 = new Long((-2536L));
      fileSelector0.addCleanedFile(long0);
      boolean boolean0 = fileSelector0.isFileCleaningInProgress(long0);
      assertTrue(boolean0);
  }

  @Test
  public void test21()  throws Throwable  {
      FileSelector fileSelector0 = new FileSelector();
      Long long0 = new Long(32767L);
      fileSelector0.putBackFileForCleaning(long0);
      boolean boolean0 = fileSelector0.isFileCleaningInProgress(long0);
      assertTrue(boolean0);
  }

  @Test
  public void test22()  throws Throwable  {
      FileSelector fileSelector0 = new FileSelector();
      Long long0 = new Long((-686L));
      boolean boolean0 = fileSelector0.isFileCleaningInProgress(long0);
      assertFalse(boolean0);
  }

  @Test
  public void test23()  throws Throwable  {
      FileSelector fileSelector0 = new FileSelector();
      Long long0 = new Long(0L);
      fileSelector0.putBackFileForCleaning(long0);
      Long long1 = new Long(1783L);
      fileSelector0.putBackFileForCleaning(long1);
      // Undeclared exception!
      try { 
        fileSelector0.selectFileForCleaning((UtilizationProfile) null, true, true, 2);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.cleaner.FileSelector", e);
      }
  }

  @Test
  public void test24()  throws Throwable  {
      FileSelector fileSelector0 = new FileSelector();
      Long long0 = new Long(0L);
      fileSelector0.putBackFileForCleaning(long0);
      Long long1 = new Long(1783L);
      fileSelector0.putBackFileForCleaning(long1);
      // Undeclared exception!
      try { 
        fileSelector0.selectFileForCleaning((UtilizationProfile) null, false, false, 2);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.cleaner.FileSelector", e);
      }
  }

  @Test
  public void test25()  throws Throwable  {
      FileSelector fileSelector0 = new FileSelector();
      // Undeclared exception!
      try { 
        fileSelector0.selectFileForCleaning((UtilizationProfile) null, true, true, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.cleaner.FileSelector", e);
      }
  }

  @Test
  public void test26()  throws Throwable  {
      FileSelector fileSelector0 = new FileSelector();
      // Undeclared exception!
      try { 
        fileSelector0.selectFileForCleaning((UtilizationProfile) null, true, false, (-3262));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.cleaner.FileSelector", e);
      }
  }

  @Test
  public void test27()  throws Throwable  {
      FileSelector fileSelector0 = new FileSelector();
      int int0 = fileSelector0.getBacklog();
      assertEquals(0, int0);
  }

  @Test
  public void test28()  throws Throwable  {
      FileSelector fileSelector0 = new FileSelector();
      Set set0 = fileSelector0.getLowUtilizationFiles();
      assertEquals(0, set0.size());
  }

  @Test
  public void test29()  throws Throwable  {
      FileSelector fileSelector0 = new FileSelector();
      Set set0 = fileSelector0.getMustBeCleanedFiles();
      assertTrue(set0.isEmpty());
  }

  @Test
  public void test30()  throws Throwable  {
      FileSelector fileSelector0 = new FileSelector();
      fileSelector0.removeDeletedFile((Long) null);
  }
}