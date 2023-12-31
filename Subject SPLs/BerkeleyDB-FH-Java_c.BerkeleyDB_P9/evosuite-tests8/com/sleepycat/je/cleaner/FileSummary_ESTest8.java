/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 03:38:59 KST 2017
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

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class FileSummary_ESTest8 extends FileSummary_ESTest_scaffolding8 {

  @Test
  public void test00()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      fileSummary0.totalSize = 1513;
      fileSummary0.totalINSize = 1227;
      fileSummary0.totalLNSize = 1227;
      int int0 = fileSummary0.getObsoleteSize();
      assertEquals((-941), int0);
  }

  @Test
  public void test01()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      fileSummary0.obsoleteLNCount = (-1629);
      fileSummary0.totalLNSize = (-3446);
      fileSummary0.totalLNCount = (-1629);
      fileSummary0.totalLNSize = 24;
      int int0 = fileSummary0.getObsoleteLNSize();
      assertEquals(19, int0);
  }

  @Test
  public void test02()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      fileSummary0.totalINCount = 1219;
      String string0 = fileSummary0.toString();
      assertEquals("<summary totalCount=\"0\" totalSize=\"0\" totalINCount=\"1219\" totalINSize=\"0\" totalLNCount=\"0\" totalLNSize=\"0\" obsoleteINCount=\"0\" obsoleteLNCount=\"0\"/>", string0);
  }

  @Test
  public void test03()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      fileSummary0.totalLNSize = (-3446);
      String string0 = fileSummary0.toString();
      assertEquals("<summary totalCount=\"0\" totalSize=\"0\" totalINCount=\"0\" totalINSize=\"0\" totalLNCount=\"0\" totalLNSize=\"-3446\" obsoleteINCount=\"0\" obsoleteLNCount=\"0\"/>", string0);
  }

  @Test
  public void test04()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      fileSummary0.totalSize = (-1629);
      String string0 = fileSummary0.toString();
      assertEquals("<summary totalCount=\"0\" totalSize=\"-1629\" totalINCount=\"0\" totalINSize=\"0\" totalLNCount=\"0\" totalLNSize=\"0\" obsoleteINCount=\"0\" obsoleteLNCount=\"0\"/>", string0);
  }

  @Test
  public void test05()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      fileSummary0.obsoleteINCount = 8;
      String string0 = fileSummary0.toString();
      assertEquals("<summary totalCount=\"0\" totalSize=\"0\" totalINCount=\"0\" totalINSize=\"0\" totalLNCount=\"0\" totalLNSize=\"0\" obsoleteINCount=\"8\" obsoleteLNCount=\"0\"/>", string0);
  }

  @Test
  public void test06()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      fileSummary0.totalCount = 877;
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
  public void test07()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      FileSummary fileSummary1 = new FileSummary();
      fileSummary1.totalLNSize = 4482;
      fileSummary0.add(fileSummary1);
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
      fileSummary0.totalLNCount = 3629;
      fileSummary0.add(fileSummary0);
      assertEquals(7258, fileSummary0.totalLNCount);
  }

  @Test
  public void test09()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      fileSummary0.totalINCount = (-1);
      fileSummary0.add(fileSummary0);
      assertEquals((-2), fileSummary0.totalINCount);
  }

  @Test
  public void test10()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      FileSummary fileSummary1 = new FileSummary();
      fileSummary1.totalCount = 2921;
      fileSummary0.add(fileSummary1);
      assertFalse(fileSummary0.isEmpty());
  }

  @Test
  public void test11()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      fileSummary0.totalINSize = 1626;
      fileSummary0.add(fileSummary0);
      assertEquals(3252, fileSummary0.totalINSize);
  }

  @Test
  public void test12()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      fileSummary0.totalLNSize = (-3446);
      fileSummary0.add(fileSummary0);
      assertEquals((-6892), fileSummary0.totalLNSize);
  }

  @Test
  public void test13()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      fileSummary0.obsoleteLNCount = 1374;
      fileSummary0.add(fileSummary0);
      assertEquals(2748, fileSummary0.obsoleteLNCount);
  }


  @Test
  public void test15()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      FileSummary fileSummary1 = new FileSummary();
      fileSummary1.obsoleteINCount = (-209);
      fileSummary1.add(fileSummary0);
      assertFalse(fileSummary1.isEmpty());
  }

  @Test
  public void test16()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      fileSummary0.totalCount = 2343;
      int int0 = fileSummary0.getNonObsoleteCount();
      assertEquals(0, int0);
  }

  @Test
  public void test17()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      fileSummary0.totalINSize = 621;
      int int0 = fileSummary0.getNonObsoleteCount();
      assertEquals(0, int0);
  }

  @Test
  public void test18()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      fileSummary0.totalINCount = (-1);
      int int0 = fileSummary0.getNonObsoleteCount();
      assertEquals((-1), int0);
  }

  @Test
  public void test19()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      fileSummary0.totalLNSize = 1585;
      int int0 = fileSummary0.getNonObsoleteCount();
      assertEquals(0, int0);
  }

  @Test
  public void test20()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      fileSummary0.obsoleteLNCount = (-128);
      int int0 = fileSummary0.getNonObsoleteCount();
      assertEquals(128, int0);
  }

  @Test
  public void test21()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      fileSummary0.totalSize = (-1510);
      int int0 = fileSummary0.getNonObsoleteCount();
      assertEquals(0, int0);
  }

  @Test
  public void test22()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      fileSummary0.obsoleteINCount = 8;
      int int0 = fileSummary0.getNonObsoleteCount();
      assertEquals((-8), int0);
  }

  @Test
  public void test23()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      fileSummary0.obsoleteLNCount = (-275);
      int int0 = fileSummary0.getEntriesCounted();
      assertEquals((-275), int0);
  }

  @Test
  public void test24()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      fileSummary0.totalCount = 4486;
      int int0 = fileSummary0.getEntriesCounted();
      assertEquals(4486, int0);
  }

  @Test
  public void test25()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      fileSummary0.totalSize = (-1);
      int int0 = fileSummary0.getEntriesCounted();
      assertEquals(0, int0);
  }

  @Test
  public void test26()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      fileSummary0.obsoleteINCount = (-2833);
      int int0 = fileSummary0.getEntriesCounted();
      assertEquals((-2833), int0);
  }

  @Test
  public void test27()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      fileSummary0.obsoleteINCount = 1227;
      fileSummary0.totalSize = 1513;
      fileSummary0.totalINSize = 1227;
      fileSummary0.totalINCount = 1227;
      int int0 = fileSummary0.getObsoleteSize();
      assertEquals(1227, fileSummary0.getObsoleteINSize());
      assertEquals(1513, int0);
  }

  @Test
  public void test28()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      fileSummary0.totalSize = (-1);
      int int0 = fileSummary0.getObsoleteSize();
      assertEquals(0, int0);
  }

  @Test
  public void test29()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      FileSummary fileSummary1 = new FileSummary();
      fileSummary1.totalINSize = (-1248);
      fileSummary0.add(fileSummary1);
      fileSummary0.obsoleteINCount = (-1171);
      fileSummary0.obsoleteINCount = 132;
      fileSummary0.totalINCount = 1784;
      int int0 = fileSummary0.getObsoleteINSize();
      assertEquals(132, fileSummary0.getEntriesCounted());
      assertEquals((-93), int0);
  }

  @Test
  public void test30()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      FileSummary fileSummary1 = new FileSummary();
      fileSummary1.totalINSize = (-1248);
      fileSummary0.add(fileSummary1);
      fileSummary0.obsoleteINCount = (-1171);
      fileSummary0.totalINCount = 1784;
      int int0 = fileSummary0.getObsoleteINSize();
      assertEquals(2955, fileSummary0.getNonObsoleteCount());
      assertEquals(818, int0);
  }

  @Test
  public void test31()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      fileSummary0.obsoleteINCount = (-1171);
      fileSummary0.totalINCount = 1784;
      int int0 = fileSummary0.getObsoleteINSize();
      assertEquals(0, int0);
  }

  @Test
  public void test32()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      fileSummary0.totalINCount = (-174);
      int int0 = fileSummary0.getObsoleteINSize();
      assertEquals(0, int0);
  }

  @Test
  public void test33()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      fileSummary0.obsoleteLNCount = (-1248);
      fileSummary0.totalLNCount = 2451;
      fileSummary0.totalLNSize = 29;
      int int0 = fileSummary0.getObsoleteLNSize();
      assertEquals((-15), int0);
  }

  @Test
  public void test34()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      fileSummary0.totalLNCount = 2451;
      fileSummary0.totalLNSize = 29;
      int int0 = fileSummary0.getObsoleteLNSize();
      assertEquals(0, int0);
  }

  @Test
  public void test35()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      assertTrue(fileSummary0.isEmpty());
      
      fileSummary0.obsoleteLNCount = 1219;
      boolean boolean0 = fileSummary0.isEmpty();
      assertFalse(boolean0);
  }

  @Test
  public void test36()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      assertTrue(fileSummary0.isEmpty());
      
      fileSummary0.obsoleteINCount = (-2814);
      boolean boolean0 = fileSummary0.isEmpty();
      assertFalse(boolean0);
  }

  @Test
  public void test37()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      assertTrue(fileSummary0.isEmpty());
      
      fileSummary0.totalSize = 1242;
      boolean boolean0 = fileSummary0.isEmpty();
      assertFalse(boolean0);
  }

  @Test
  public void test38()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      assertTrue(fileSummary0.isEmpty());
      
      fileSummary0.totalCount = (-174);
      boolean boolean0 = fileSummary0.isEmpty();
      assertFalse(boolean0);
  }

  @Test
  public void test39()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      ByteBuffer byteBuffer0 = null;
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
  public void test40()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      // Undeclared exception!
      try { 
        fileSummary0.readFromLog((ByteBuffer) null, (byte)6);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.LogUtils", e);
      }
  }




  @Test
  public void test44()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      fileSummary0.totalSize = 1513;
      fileSummary0.totalLNSize = (-3389);
      int int0 = fileSummary0.getObsoleteSize();
      assertEquals(1513, int0);
  }



  @Test
  public void test47()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      assertTrue(fileSummary0.isEmpty());
      
      fileSummary0.obsoleteLNCount = (-2739);
      boolean boolean0 = fileSummary0.isEmpty();
      assertFalse(boolean0);
  }

  @Test
  public void test48()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      assertTrue(fileSummary0.isEmpty());
      
      fileSummary0.obsoleteINCount = 1;
      boolean boolean0 = fileSummary0.isEmpty();
      assertFalse(boolean0);
  }

  @Test
  public void test49()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      assertTrue(fileSummary0.isEmpty());
      
      fileSummary0.totalSize = (-1);
      boolean boolean0 = fileSummary0.isEmpty();
      assertFalse(boolean0);
  }


  @Test
  public void test51()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      assertTrue(fileSummary0.isEmpty());
      
      fileSummary0.totalCount = 4486;
      boolean boolean0 = fileSummary0.isEmpty();
      assertFalse(boolean0);
  }


  @Test
  public void test53()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
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
  public void test56()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      fileSummary0.reset();
      assertEquals(0, fileSummary0.getNonObsoleteCount());
      assertEquals(0, fileSummary0.totalINSize);
      assertTrue(fileSummary0.isEmpty());
      assertEquals(0, fileSummary0.totalLNSize);
  }
}
