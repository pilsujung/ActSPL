/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 21 23:49:03 KST 2017
 */

package com.sleepycat.je.cleaner;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.sleepycat.je.cleaner.FileSummary;
import java.nio.ByteBuffer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class FileSummary_ESTest6 extends FileSummary_ESTest_scaffolding6 {

  @Test
  public void test00()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      fileSummary0.totalSize = 226;
      fileSummary0.totalINSize = 226;
      fileSummary0.totalLNSize = 32;
      int int0 = fileSummary0.getObsoleteSize();
      assertEquals((-32), int0);
  }

  @Test
  public void test01()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      fileSummary0.totalLNCount = (-150);
      fileSummary0.totalLNSize = (-150);
      fileSummary0.obsoleteLNCount = (-150);
      fileSummary0.obsoleteLNCount = 293;
      int int0 = fileSummary0.getObsoleteLNSize();
      assertEquals(293, int0);
  }

  @Test
  public void test02()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      fileSummary0.totalINCount = 8;
      fileSummary0.obsoleteINCount = (-1);
      fileSummary0.totalINSize = 8;
      fileSummary0.obsoleteINCount = 453;
      int int0 = fileSummary0.getObsoleteINSize();
      assertEquals(453, int0);
  }

  @Test
  public void test03()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      fileSummary0.totalINSize = 32;
      String string0 = fileSummary0.toString();
      assertEquals("<summary totalCount=\"0\" totalSize=\"0\" totalINCount=\"0\" totalINSize=\"32\" totalLNCount=\"0\" totalLNSize=\"0\" obsoleteINCount=\"0\" obsoleteLNCount=\"0\"/>", string0);
  }

  @Test
  public void test04()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      fileSummary0.totalINCount = (-4);
      String string0 = fileSummary0.toString();
      assertEquals("<summary totalCount=\"0\" totalSize=\"0\" totalINCount=\"-4\" totalINSize=\"0\" totalLNCount=\"0\" totalLNSize=\"0\" obsoleteINCount=\"0\" obsoleteLNCount=\"0\"/>", string0);
  }

  @Test
  public void test05()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      fileSummary0.totalLNSize = 261;
      String string0 = fileSummary0.toString();
      assertEquals("<summary totalCount=\"0\" totalSize=\"0\" totalINCount=\"0\" totalINSize=\"0\" totalLNCount=\"0\" totalLNSize=\"261\" obsoleteINCount=\"0\" obsoleteLNCount=\"0\"/>", string0);
  }

  @Test
  public void test06()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      fileSummary0.obsoleteLNCount = 1178;
      String string0 = fileSummary0.toString();
      assertEquals("<summary totalCount=\"0\" totalSize=\"0\" totalINCount=\"0\" totalINSize=\"0\" totalLNCount=\"0\" totalLNSize=\"0\" obsoleteINCount=\"0\" obsoleteLNCount=\"1178\"/>", string0);
  }

  @Test
  public void test07()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      fileSummary0.totalSize = (-150);
      String string0 = fileSummary0.toString();
      assertEquals("<summary totalCount=\"0\" totalSize=\"-150\" totalINCount=\"0\" totalINSize=\"0\" totalLNCount=\"0\" totalLNSize=\"0\" obsoleteINCount=\"0\" obsoleteLNCount=\"0\"/>", string0);
  }

  @Test
  public void test08()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      fileSummary0.obsoleteINCount = (-17);
      String string0 = fileSummary0.toString();
      assertEquals("<summary totalCount=\"0\" totalSize=\"0\" totalINCount=\"0\" totalINSize=\"0\" totalLNCount=\"0\" totalLNSize=\"0\" obsoleteINCount=\"-17\" obsoleteLNCount=\"0\"/>", string0);
  }

  @Test
  public void test09()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      fileSummary0.totalCount = (-1275);
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
  public void test10()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      FileSummary fileSummary1 = new FileSummary();
      fileSummary0.add(fileSummary1);
      assertEquals(0, fileSummary0.totalLNSize);
      assertTrue(fileSummary0.isEmpty());
      assertEquals(0, fileSummary0.getNonObsoleteCount());
      assertEquals(0, fileSummary0.totalINSize);
  }

  @Test
  public void test11()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      fileSummary0.totalCount = (-4011);
      fileSummary0.add(fileSummary0);
      assertFalse(fileSummary0.isEmpty());
  }

  @Test
  public void test12()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      fileSummary0.totalINSize = 56;
      fileSummary0.add(fileSummary0);
      assertEquals(112, fileSummary0.totalINSize);
  }

  @Test
  public void test13()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      fileSummary0.totalINCount = (-606);
      fileSummary0.add(fileSummary0);
      assertEquals((-1212), fileSummary0.totalINCount);
  }

  @Test
  public void test14()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      fileSummary0.obsoleteLNCount = (-712);
      fileSummary0.add(fileSummary0);
      assertFalse(fileSummary0.isEmpty());
  }

  @Test
  public void test15()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      fileSummary0.totalSize = (-150);
      fileSummary0.add(fileSummary0);
      assertFalse(fileSummary0.isEmpty());
  }

  @Test
  public void test16()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      fileSummary0.obsoleteINCount = (-1012);
      fileSummary0.add(fileSummary0);
      assertFalse(fileSummary0.isEmpty());
  }

  @Test
  public void test17()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      fileSummary0.totalINSize = (-25);
      int int0 = fileSummary0.getNonObsoleteCount();
      assertEquals(0, int0);
  }

  @Test
  public void test18()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      fileSummary0.totalINCount = 8;
      int int0 = fileSummary0.getNonObsoleteCount();
      assertEquals(8, int0);
  }

  @Test
  public void test19()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      fileSummary0.totalLNSize = (-464);
      int int0 = fileSummary0.getNonObsoleteCount();
      assertEquals(0, int0);
  }

  @Test
  public void test20()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      fileSummary0.obsoleteLNCount = 482;
      int int0 = fileSummary0.getNonObsoleteCount();
      assertEquals((-482), int0);
  }

  @Test
  public void test21()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      fileSummary0.totalSize = 1873;
      int int0 = fileSummary0.getNonObsoleteCount();
      assertEquals(0, int0);
  }

  @Test
  public void test22()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      fileSummary0.obsoleteINCount = (-1772);
      int int0 = fileSummary0.getNonObsoleteCount();
      assertEquals(1772, int0);
  }

  @Test
  public void test23()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      fileSummary0.totalCount = 0;
      fileSummary0.totalCount = (-1);
      int int0 = fileSummary0.getEntriesCounted();
      assertEquals((-1), int0);
  }

  @Test
  public void test24()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      fileSummary0.obsoleteLNCount = (-712);
      int int0 = fileSummary0.getEntriesCounted();
      assertEquals((-712), int0);
  }

  @Test
  public void test25()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      fileSummary0.obsoleteINCount = 8;
      int int0 = fileSummary0.getEntriesCounted();
      assertEquals(8, int0);
  }

  @Test
  public void test26()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      fileSummary0.totalINSize = (-25);
      fileSummary0.obsoleteINCount = 1;
      fileSummary0.totalINCount = 221;
      fileSummary0.totalSize = 229;
      int int0 = fileSummary0.getObsoleteSize();
      assertEquals(-1, fileSummary0.getObsoleteINSize());
      assertEquals(229, int0);
  }

  @Test
  public void test27()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      fileSummary0.totalSize = (-150);
      int int0 = fileSummary0.getObsoleteSize();
      assertEquals(0, int0);
  }

  @Test
  public void test28()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      fileSummary0.totalINCount = (-1233);
      fileSummary0.obsoleteINCount = 0;
      fileSummary0.obsoleteINCount = 14;
      fileSummary0.totalINSize = 1368;
      int int0 = fileSummary0.getObsoleteINSize();
      assertEquals((-16), int0);
  }

  @Test
  public void test29()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      fileSummary0.totalINCount = (-1233);
      fileSummary0.totalINSize = 1368;
      int int0 = fileSummary0.getObsoleteINSize();
      assertEquals(0, int0);
  }

  @Test
  public void test30()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      fileSummary0.totalINCount = 221;
      fileSummary0.totalSize = 229;
      int int0 = fileSummary0.getObsoleteSize();
      assertEquals(229, int0);
  }

  @Test
  public void test31()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      fileSummary0.totalLNCount = (-150);
      fileSummary0.totalLNSize = (-150);
      fileSummary0.obsoleteLNCount = (-150);
      int int0 = fileSummary0.getObsoleteLNSize();
      assertEquals((-150), int0);
  }

  @Test
  public void test32()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      fileSummary0.totalLNCount = (-150);
      fileSummary0.obsoleteINCount = 342;
      int int0 = fileSummary0.getObsoleteLNSize();
      assertEquals(0, int0);
  }

  @Test
  public void test33()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      fileSummary0.totalLNCount = 6;
      int int0 = fileSummary0.getObsoleteLNSize();
      assertEquals(0, int0);
  }

  @Test
  public void test34()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      assertTrue(fileSummary0.isEmpty());
      
      fileSummary0.obsoleteLNCount = (-8);
      boolean boolean0 = fileSummary0.isEmpty();
      assertFalse(boolean0);
  }

  @Test
  public void test35()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      assertTrue(fileSummary0.isEmpty());
      
      fileSummary0.obsoleteINCount = (-17);
      boolean boolean0 = fileSummary0.isEmpty();
      assertFalse(boolean0);
  }

  @Test
  public void test36()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      // Undeclared exception!
      try { 
        fileSummary0.readFromLog((ByteBuffer) null, (byte)109);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.LogUtils", e);
      }
  }

  @Test
  public void test37()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      // Undeclared exception!
      try { 
        fileSummary0.add((FileSummary) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.cleaner.FileSummary", e);
      }
  }

  @Test
  public void test38()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      int int0 = fileSummary0.getObsoleteINSize();
      assertEquals(0, int0);
  }

  @Test
  public void test39()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      int int0 = fileSummary0.getObsoleteLNSize();
      assertEquals(0, int0);
  }

  @Test
  public void test40()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      // Undeclared exception!
      try { 
        fileSummary0.dumpLog((StringBuffer) null, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.cleaner.FileSummary", e);
      }
  }

  @Test
  public void test41()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      int int0 = fileSummary0.getObsoleteSize();
      assertEquals(0, int0);
  }

  @Test
  public void test42()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      assertTrue(fileSummary0.isEmpty());
      
      fileSummary0.obsoleteLNCount = 1;
      boolean boolean0 = fileSummary0.isEmpty();
      assertFalse(boolean0);
  }

  @Test
  public void test43()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      assertTrue(fileSummary0.isEmpty());
      
      fileSummary0.obsoleteINCount = 6;
      boolean boolean0 = fileSummary0.isEmpty();
      assertFalse(boolean0);
  }

  @Test
  public void test44()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      assertTrue(fileSummary0.isEmpty());
      
      fileSummary0.totalSize = 1873;
      boolean boolean0 = fileSummary0.isEmpty();
      assertFalse(boolean0);
  }

  @Test
  public void test45()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      boolean boolean0 = fileSummary0.isEmpty();
      assertTrue(boolean0);
  }

  @Test
  public void test46()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      assertTrue(fileSummary0.isEmpty());
      
      fileSummary0.totalCount = (-4011);
      boolean boolean0 = fileSummary0.isEmpty();
      assertFalse(boolean0);
  }

  @Test
  public void test47()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      long long0 = fileSummary0.getTransactionId();
      assertEquals((-1L), long0);
  }

  @Test
  public void test48()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      int int0 = fileSummary0.getLogSize();
      assertEquals(32, int0);
  }

  @Test
  public void test49()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      int int0 = fileSummary0.getEntriesCounted();
      assertEquals(0, int0);
  }

  @Test
  public void test50()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      boolean boolean0 = fileSummary0.logEntryIsTransactional();
      assertFalse(boolean0);
  }

  @Test
  public void test51()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      fileSummary0.reset();
      assertEquals(0, fileSummary0.getNonObsoleteCount());
      assertEquals(0, fileSummary0.totalLNSize);
      assertTrue(fileSummary0.isEmpty());
      assertEquals(0, fileSummary0.totalINSize);
  }
}
