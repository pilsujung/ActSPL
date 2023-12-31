/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 10:03:19 KST 2017
 */

package com.sleepycat.je.cleaner;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.nio.ByteBuffer;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class FileSummary_ESTest5 extends FileSummary_ESTest_scaffolding5 {

  @Test
  public void test00()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      fileSummary0.totalINCount = 0;
      fileSummary0.totalINCount = (-2006);
      fileSummary0.totalINSize = (-2006);
      fileSummary0.obsoleteINCount = 1343;
      int int0 = fileSummary0.getObsoleteINSize();
      assertEquals(1343, int0);
  }

  @Test
  public void test01()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      fileSummary0.obsoleteINCount = (-773);
      int int0 = fileSummary0.getEntriesCounted();
      assertEquals((-773), int0);
  }

  @Test
  public void test02()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      fileSummary0.totalLNSize = 32;
      String string0 = fileSummary0.toString();
      assertEquals("<summary totalCount=\"0\" totalSize=\"0\" totalINCount=\"0\" totalINSize=\"0\" totalLNCount=\"0\" totalLNSize=\"32\" obsoleteINCount=\"0\" obsoleteLNCount=\"0\"/>", string0);
  }

  @Test
  public void test03()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      fileSummary0.totalLNCount = (-903);
      String string0 = fileSummary0.toString();
      assertEquals("<summary totalCount=\"0\" totalSize=\"0\" totalINCount=\"0\" totalINSize=\"0\" totalLNCount=\"-903\" totalLNSize=\"0\" obsoleteINCount=\"0\" obsoleteLNCount=\"0\"/>", string0);
  }

  @Test
  public void test04()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      fileSummary0.totalINSize = 1618;
      String string0 = fileSummary0.toString();
      assertEquals("<summary totalCount=\"0\" totalSize=\"0\" totalINCount=\"0\" totalINSize=\"1618\" totalLNCount=\"0\" totalLNSize=\"0\" obsoleteINCount=\"0\" obsoleteLNCount=\"0\"/>", string0);
  }

  @Test
  public void test05()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      fileSummary0.totalSize = 4;
      String string0 = fileSummary0.toString();
      assertEquals("<summary totalCount=\"0\" totalSize=\"4\" totalINCount=\"0\" totalINSize=\"0\" totalLNCount=\"0\" totalLNSize=\"0\" obsoleteINCount=\"0\" obsoleteLNCount=\"0\"/>", string0);
  }

  @Test
  public void test06()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      fileSummary0.obsoleteINCount = (-1);
      String string0 = fileSummary0.toString();
      assertEquals("<summary totalCount=\"0\" totalSize=\"0\" totalINCount=\"0\" totalINSize=\"0\" totalLNCount=\"0\" totalLNSize=\"0\" obsoleteINCount=\"-1\" obsoleteLNCount=\"0\"/>", string0);
  }

  @Test
  public void test07()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      fileSummary0.totalCount = 150;
      // Undeclared exception!
      try { 
        fileSummary0.writeToLog((ByteBuffer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.LogUtils", e);
      }
  }

  @Test
  public void test08()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      fileSummary0.totalLNSize = 1915;
      fileSummary0.add(fileSummary0);
      assertEquals(3830, fileSummary0.totalLNSize);
  }

  @Test
  public void test09()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      FileSummary fileSummary1 = new FileSummary();
      fileSummary1.totalLNCount = (-1358);
      fileSummary0.add(fileSummary1);
      fileSummary0.add(fileSummary1);
      assertEquals((-2716), fileSummary0.totalLNCount);
  }


  @Test
  public void test11()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      fileSummary0.totalSize = 1545;
      fileSummary0.add(fileSummary0);
      assertFalse(fileSummary0.isEmpty());
  }

  @Test
  public void test12()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      fileSummary0.obsoleteINCount = 32;
      fileSummary0.add(fileSummary0);
      assertFalse(fileSummary0.isEmpty());
  }

  @Test
  public void test13()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      fileSummary0.totalINCount = (-1453);
      int int0 = fileSummary0.getNonObsoleteCount();
      assertEquals((-1453), int0);
  }

  @Test
  public void test14()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      fileSummary0.totalCount = 2016;
      int int0 = fileSummary0.getNonObsoleteCount();
      assertEquals(0, int0);
  }

  @Test
  public void test15()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      fileSummary0.totalINSize = 32;
      int int0 = fileSummary0.getNonObsoleteCount();
      assertEquals(0, int0);
  }

  @Test
  public void test16()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      fileSummary0.totalLNSize = 1915;
      int int0 = fileSummary0.getNonObsoleteCount();
      assertEquals(0, int0);
  }


  @Test
  public void test18()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      fileSummary0.obsoleteINCount = (-2736);
      int int0 = fileSummary0.getNonObsoleteCount();
      assertEquals(2736, int0);
  }

  @Test
  public void test19()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      fileSummary0.totalLNCount = 1;
      int int0 = fileSummary0.getNonObsoleteCount();
      assertEquals(1, int0);
  }

  @Test
  public void test20()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      FileSummary fileSummary1 = new FileSummary();
      fileSummary1.obsoleteLNCount = 5055;
      fileSummary0.add(fileSummary1);
      int int0 = fileSummary0.getEntriesCounted();
      assertEquals(5055, fileSummary0.obsoleteLNCount);
      assertEquals(5055, int0);
  }

  @Test
  public void test21()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      fileSummary0.totalSize = (-217);
      int int0 = fileSummary0.getEntriesCounted();
      assertEquals(0, int0);
  }

  @Test
  public void test22()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      fileSummary0.totalLNSize = 32;
      fileSummary0.totalSize = 4;
      int int0 = fileSummary0.getObsoleteSize();
      assertEquals((-28), int0);
  }

  @Test
  public void test23()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      fileSummary0.totalSize = (-773);
      int int0 = fileSummary0.getObsoleteSize();
      assertEquals(0, int0);
  }

  @Test
  public void test24()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      fileSummary0.totalINCount = (-586);
      fileSummary0.obsoleteINCount = 1343;
      fileSummary0.totalINSize = 101;
      int int0 = fileSummary0.getObsoleteINSize();
      assertEquals((-231), int0);
  }

  @Test
  public void test25()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      fileSummary0.obsoleteINCount = 4;
      fileSummary0.totalINSize = (-542);
      fileSummary0.totalINCount = (-542);
      fileSummary0.totalSize = 4;
      int int0 = fileSummary0.getObsoleteSize();
      assertEquals(4, int0);
  }

  @Test
  public void test26()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      fileSummary0.totalINSize = (-542);
      fileSummary0.totalINCount = (-542);
      fileSummary0.totalSize = 4;
      int int0 = fileSummary0.getObsoleteSize();
      assertEquals(4, int0);
  }

  @Test
  public void test27()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      fileSummary0.obsoleteINCount = 4;
      fileSummary0.totalINCount = (-542);
      fileSummary0.totalSize = 4;
      int int0 = fileSummary0.getObsoleteSize();
      assertEquals(4, int0);
  }

  @Test
  public void test28()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      fileSummary0.totalINCount = 1687;
      int int0 = fileSummary0.getObsoleteINSize();
      assertEquals(0, int0);
  }

  @Test
  public void test29()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      fileSummary0.totalLNSize = 2;
      fileSummary0.totalLNCount = (-903);
      fileSummary0.totalLNCount = 4;
      fileSummary0.obsoleteLNCount = 2815;
      int int0 = fileSummary0.getObsoleteLNSize();
      assertEquals(1407, int0);
  }

  @Test
  public void test30()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      fileSummary0.totalLNSize = 2;
      fileSummary0.totalLNCount = (-903);
      fileSummary0.totalLNCount = 4;
      int int0 = fileSummary0.getObsoleteLNSize();
      assertEquals(0, int0);
  }

  @Test
  public void test31()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      fileSummary0.totalLNCount = (-903);
      fileSummary0.obsoleteLNCount = 2815;
      int int0 = fileSummary0.getObsoleteLNSize();
      assertEquals(0, int0);
  }

  @Test
  public void test32()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      assertTrue(fileSummary0.isEmpty());
      
      fileSummary0.totalSize = (-2);
      boolean boolean0 = fileSummary0.isEmpty();
      assertFalse(boolean0);
  }

  @Test
  public void test33()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      assertTrue(fileSummary0.isEmpty());
      
      fileSummary0.totalCount = (-1);
      boolean boolean0 = fileSummary0.isEmpty();
      assertFalse(boolean0);
  }







  @Test
  public void test40()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      assertTrue(fileSummary0.isEmpty());
      
      fileSummary0.obsoleteLNCount = 1;
      boolean boolean0 = fileSummary0.isEmpty();
      assertFalse(boolean0);
  }

  @Test
  public void test41()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      assertTrue(fileSummary0.isEmpty());
      
      fileSummary0.obsoleteINCount = 43;
      boolean boolean0 = fileSummary0.isEmpty();
      assertFalse(boolean0);
  }

  @Test
  public void test42()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      assertTrue(fileSummary0.isEmpty());
      
      fileSummary0.totalSize = 63;
      boolean boolean0 = fileSummary0.isEmpty();
      assertFalse(boolean0);
  }


  @Test
  public void test44()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      assertTrue(fileSummary0.isEmpty());
      
      fileSummary0.totalCount = 32;
      boolean boolean0 = fileSummary0.isEmpty();
      assertFalse(boolean0);
  }




  @Test
  public void test48()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      fileSummary0.reset();
      assertEquals(0, fileSummary0.totalINSize);
      assertEquals(0, fileSummary0.getNonObsoleteCount());
      assertEquals(0, fileSummary0.totalLNSize);
      assertTrue(fileSummary0.isEmpty());
  }
}
