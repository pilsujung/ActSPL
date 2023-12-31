/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 21 23:47:22 KST 2017
 */

package com.sleepycat.je.cleaner;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.sleepycat.je.cleaner.FileSelector;
import com.sleepycat.je.cleaner.LNInfo;
import com.sleepycat.je.cleaner.UtilizationProfile;
import com.sleepycat.je.dbi.DatabaseId;
import com.sleepycat.je.tree.LN;
import com.sleepycat.je.tree.MapLN;
import com.sleepycat.je.tree.NameLN;
import java.lang.reflect.Array;
import java.util.Set;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class FileSelector_ESTest6 extends FileSelector_ESTest_scaffolding6 {

  @Test
  public void test00()  throws Throwable  {
      FileSelector fileSelector0 = new FileSelector();
      boolean boolean0 = fileSelector0.hook165(false);
      assertFalse(boolean0);
  }

  @Test
  public void test01()  throws Throwable  {
      FileSelector fileSelector0 = new FileSelector();
      Long long0 = new Long(775L);
      fileSelector0.putBackFileForCleaning(long0);
      int int0 = fileSelector0.getBacklog();
      assertEquals(1, int0);
  }

  @Test
  public void test03()  throws Throwable  {
      FileSelector fileSelector0 = new FileSelector();
      byte[] byteArray0 = new byte[3];
      LN lN0 = new LN(byteArray0);
      DatabaseId databaseId0 = new DatabaseId();
      byte[] byteArray1 = new byte[7];
      boolean boolean0 = fileSelector0.addPendingLN(lN0, databaseId0, byteArray0, byteArray1);
      //  // Unstable assertion: assertEquals(91L, lN0.getLastId());
      //  // Unstable assertion: assertFalse(boolean0);
  }

  @Test
  public void test04()  throws Throwable  {
      FileSelector fileSelector0 = new FileSelector();
      // Undeclared exception!
      try { 
        fileSelector0.selectFileForCleaning((UtilizationProfile) null, false, false, (-1388));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.cleaner.FileSelector", e);
      }
  }

  @Test
  public void test05()  throws Throwable  {
      FileSelector fileSelector0 = new FileSelector();
      fileSelector0.hook164();
  }

  @Test
  public void test06()  throws Throwable  {
      FileSelector fileSelector0 = new FileSelector();
      fileSelector0.hook163();
  }

  @Test
  public void test09()  throws Throwable  {
      FileSelector fileSelector0 = new FileSelector();
      MapLN mapLN0 = new MapLN();
      DatabaseId databaseId0 = new DatabaseId(0);
      byte[] byteArray0 = new byte[15];
      fileSelector0.addPendingLN(mapLN0, databaseId0, byteArray0, byteArray0);
      fileSelector0.removePendingLN(98304L);
  }

  @Test
  public void test10()  throws Throwable  {
      FileSelector fileSelector0 = new FileSelector();
      Set set0 = fileSelector0.copySafeToDeleteFiles();
      assertNull(set0);
  }

  @Test
  public void test11()  throws Throwable  {
      FileSelector fileSelector0 = new FileSelector();
      DatabaseId databaseId0 = new DatabaseId();
      NameLN nameLN0 = new NameLN(databaseId0);
      byte[] byteArray0 = new byte[2];
      fileSelector0.addPendingLN(nameLN0, databaseId0, byteArray0, byteArray0);
      LNInfo[] lNInfoArray0 = fileSelector0.getPendingLNs();
      assertNotNull(lNInfoArray0);
  }

  @Test
  public void test12()  throws Throwable  {
      FileSelector fileSelector0 = new FileSelector();
      LNInfo[] lNInfoArray0 = fileSelector0.getPendingLNs();
      assertNull(lNInfoArray0);
  }

  @Test
  public void test13()  throws Throwable  {
      FileSelector fileSelector0 = new FileSelector();
      MapLN mapLN0 = new MapLN();
      DatabaseId databaseId0 = new DatabaseId(0);
      byte[] byteArray0 = new byte[15];
      fileSelector0.addPendingLN(mapLN0, databaseId0, byteArray0, byteArray0);
      boolean boolean0 = fileSelector0.addPendingLN(mapLN0, databaseId0, byteArray0, byteArray0);
      //  // Unstable assertion: assertEquals(39L, mapLN0.getLastId());
      //  // Unstable assertion: assertTrue(boolean0);
  }

  @Test
  public void test15()  throws Throwable  {
      FileSelector fileSelector0 = new FileSelector();
      Set<String>[] setArray0 = (Set<String>[]) Array.newInstance(Set.class, 1);
      // Undeclared exception!
      try { 
        fileSelector0.updateFilesAtCheckpointEnd(setArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         assertThrownBy("com.sleepycat.je.cleaner.FileSelector", e);
      }
  }

  @Test
  public void test16()  throws Throwable  {
      FileSelector fileSelector0 = new FileSelector();
      fileSelector0.updateFilesAtCheckpointEnd((Set[]) null);
  }

  @Test
  public void test17()  throws Throwable  {
      FileSelector fileSelector0 = new FileSelector();
      MapLN mapLN0 = new MapLN();
      DatabaseId databaseId0 = new DatabaseId(0);
      byte[] byteArray0 = new byte[15];
      fileSelector0.addPendingLN(mapLN0, databaseId0, byteArray0, byteArray0);
      Set[] setArray0 = fileSelector0.getFilesAtCheckpointStart();
      assertNull(setArray0);
  }

  @Test
  public void test18()  throws Throwable  {
      FileSelector fileSelector0 = new FileSelector();
      Long long0 = new Long((long) 0);
      fileSelector0.addCleanedFile(long0);
      Set[] setArray0 = fileSelector0.getFilesAtCheckpointStart();
      assertNotNull(setArray0);
      
      fileSelector0.updateFilesAtCheckpointEnd(setArray0);
      boolean boolean0 = fileSelector0.isFileCleaningInProgress(long0);
      assertTrue(boolean0);
  }

  @Test
  public void test20()  throws Throwable  {
      FileSelector fileSelector0 = new FileSelector();
      Long long0 = new Long(775L);
      fileSelector0.putBackFileForCleaning(long0);
      boolean boolean0 = fileSelector0.isFileCleaningInProgress(long0);
      assertTrue(boolean0);
  }

  @Test
  public void test21()  throws Throwable  {
      FileSelector fileSelector0 = new FileSelector();
      Long long0 = new Long((long) 0);
      boolean boolean0 = fileSelector0.isFileCleaningInProgress(long0);
      assertFalse(boolean0);
  }

  @Test
  public void test22()  throws Throwable  {
      FileSelector fileSelector0 = new FileSelector();
      Long long0 = new Long(775L);
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
  public void test23()  throws Throwable  {
      FileSelector fileSelector0 = new FileSelector();
      Long long0 = new Long(775L);
      fileSelector0.putBackFileForCleaning(long0);
      // Undeclared exception!
      try { 
        fileSelector0.selectFileForCleaning((UtilizationProfile) null, false, false, 1);
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
      // Undeclared exception!
      try { 
        fileSelector0.selectFileForCleaning((UtilizationProfile) null, false, true, (byte)2);
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
        fileSelector0.selectFileForCleaning((UtilizationProfile) null, false, false, 0);
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
      Set set0 = fileSelector0.getMustBeCleanedFiles();
      assertEquals(0, set0.size());
  }

  @Test
  public void test29()  throws Throwable  {
      FileSelector fileSelector0 = new FileSelector();
      Long long0 = new Long((-896L));
      fileSelector0.removeDeletedFile(long0);
  }

  @Test
  public void test30()  throws Throwable  {
      FileSelector fileSelector0 = new FileSelector();
      boolean boolean0 = fileSelector0.hook165(true);
      assertTrue(boolean0);
  }

  @Test
  public void test31()  throws Throwable  {
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
  public void test32()  throws Throwable  {
      FileSelector fileSelector0 = new FileSelector();
      Long long0 = new Long((long) 0);
      fileSelector0.addCleanedFile(long0);
      boolean boolean0 = fileSelector0.isFileCleaningInProgress(long0);
      assertTrue(boolean0);
  }

  @Test
  public void test33()  throws Throwable  {
      FileSelector fileSelector0 = new FileSelector();
      int int0 = fileSelector0.getBacklog();
      assertEquals(0, int0);
  }

  @Test
  public void test34()  throws Throwable  {
      FileSelector fileSelector0 = new FileSelector();
      Set set0 = fileSelector0.getLowUtilizationFiles();
      assertEquals(0, set0.size());
  }
}
