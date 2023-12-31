/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 10:10:48 KST 2017
 */

package com.sleepycat.je.cleaner;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class TrackedFileSummary_ESTest5 extends TrackedFileSummary_ESTest_scaffolding5 {

  @Test
  public void test00()  throws Throwable  {
      TrackedFileSummary trackedFileSummary0 = new TrackedFileSummary((UtilizationTracker) null, 24L, true);
      long long0 = trackedFileSummary0.getFileNumber();
      assertTrue(trackedFileSummary0.getAllowFlush());
      assertEquals(24L, long0);
  }

  @Test
  public void test01()  throws Throwable  {
      TrackedFileSummary trackedFileSummary0 = new TrackedFileSummary((UtilizationTracker) null, (-34L), true);
      long long0 = trackedFileSummary0.getFileNumber();
      assertTrue(trackedFileSummary0.getAllowFlush());
      assertEquals((-34L), long0);
  }

  @Test
  public void test02()  throws Throwable  {
      TrackedFileSummary trackedFileSummary0 = new TrackedFileSummary((UtilizationTracker) null, 1919L, false);
      assertTrue(trackedFileSummary0.getAllowFlush());
      
      trackedFileSummary0.setAllowFlush(false);
      boolean boolean0 = trackedFileSummary0.getAllowFlush();
      assertFalse(boolean0);
  }

  @Test
  public void test17()  throws Throwable  {
      TrackedFileSummary trackedFileSummary0 = new TrackedFileSummary((UtilizationTracker) null, 0L, true);
      trackedFileSummary0.totalLNCount = (-1595);
      trackedFileSummary0.hook168();
      assertTrue(trackedFileSummary0.getAllowFlush());
  }

  @Test
  public void test18()  throws Throwable  {
      TrackedFileSummary trackedFileSummary0 = new TrackedFileSummary((UtilizationTracker) null, 0L, true);
      trackedFileSummary0.totalCount = (-1834);
      trackedFileSummary0.hook168();
      assertTrue(trackedFileSummary0.getAllowFlush());
  }

  @Test
  public void test19()  throws Throwable  {
      TrackedFileSummary trackedFileSummary0 = new TrackedFileSummary((UtilizationTracker) null, (-34L), true);
      trackedFileSummary0.totalINSize = (-1834);
      trackedFileSummary0.hook168();
      assertEquals((-34L), trackedFileSummary0.getFileNumber());
      assertTrue(trackedFileSummary0.getAllowFlush());
  }

  @Test
  public void test20()  throws Throwable  {
      TrackedFileSummary trackedFileSummary0 = new TrackedFileSummary((UtilizationTracker) null, 0L, true);
      trackedFileSummary0.totalINCount = 32767;
      trackedFileSummary0.hook168();
      assertTrue(trackedFileSummary0.getAllowFlush());
  }


  @Test
  public void test22()  throws Throwable  {
      TrackedFileSummary trackedFileSummary0 = new TrackedFileSummary((UtilizationTracker) null, 0L, true);
      TrackedFileSummary.TrackedFileSummary_trackObsolete trackedFileSummary_TrackedFileSummary_trackObsolete0 = new TrackedFileSummary.TrackedFileSummary_trackObsolete(trackedFileSummary0, (-1890L));
      trackedFileSummary_TrackedFileSummary_trackObsolete0._this.obsoleteLNCount = 175;
      trackedFileSummary0.hook168();
      assertTrue(trackedFileSummary0.getAllowFlush());
  }

  @Test
  public void test23()  throws Throwable  {
      TrackedFileSummary trackedFileSummary0 = new TrackedFileSummary((UtilizationTracker) null, 0L, true);
      trackedFileSummary0.totalSize = 1234;
      trackedFileSummary0.hook168();
      assertTrue(trackedFileSummary0.getAllowFlush());
  }

  @Test
  public void test24()  throws Throwable  {
      TrackedFileSummary trackedFileSummary0 = new TrackedFileSummary((UtilizationTracker) null, 0L, true);
      trackedFileSummary0.obsoleteINCount = (-3098);
      trackedFileSummary0.hook168();
      assertTrue(trackedFileSummary0.getAllowFlush());
  }

  @Test
  public void test25()  throws Throwable  {
      TrackedFileSummary trackedFileSummary0 = new TrackedFileSummary((UtilizationTracker) null, 1919L, false);
      TrackedFileSummary trackedFileSummary1 = new TrackedFileSummary((UtilizationTracker) null, 1603L, true);
      trackedFileSummary0.addTrackedSummary(trackedFileSummary1);
      assertTrue(trackedFileSummary1.getAllowFlush());
      assertEquals(1603L, trackedFileSummary1.getFileNumber());
      assertTrue(trackedFileSummary0.getAllowFlush());
  }

  @Test
  public void test26()  throws Throwable  {
      TrackedFileSummary trackedFileSummary0 = new TrackedFileSummary((UtilizationTracker) null, 0L, false);
      trackedFileSummary0.trackObsolete(0);
      assertTrue(trackedFileSummary0.getAllowFlush());
  }

  @Test
  public void test27()  throws Throwable  {
      TrackedFileSummary trackedFileSummary0 = new TrackedFileSummary((UtilizationTracker) null, 1919L, true);
      // Undeclared exception!
      try { 
        trackedFileSummary0.addTrackedSummary((TrackedFileSummary) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.cleaner.FileSummary", e);
      }
  }

  @Test
  public void test28()  throws Throwable  {
      TrackedFileSummary trackedFileSummary0 = new TrackedFileSummary((UtilizationTracker) null, 0L, true);
      TrackedFileSummary.TrackedFileSummary_trackObsolete trackedFileSummary_TrackedFileSummary_trackObsolete0 = new TrackedFileSummary.TrackedFileSummary_trackObsolete(trackedFileSummary0, 0L);
      boolean boolean0 = trackedFileSummary_TrackedFileSummary_trackObsolete0._this.containsObsoleteOffset(0);
      assertTrue(trackedFileSummary0.getAllowFlush());
      assertFalse(boolean0);
  }

  @Test
  public void test29()  throws Throwable  {
      TrackedFileSummary trackedFileSummary0 = new TrackedFileSummary((UtilizationTracker) null, 0L, true);
      trackedFileSummary0.getObsoleteOffsets();
      assertTrue(trackedFileSummary0.getAllowFlush());
  }

  @Test
  public void test30()  throws Throwable  {
      TrackedFileSummary trackedFileSummary0 = new TrackedFileSummary((UtilizationTracker) null, 0L, true);
      trackedFileSummary0.getFileNumber();
      assertTrue(trackedFileSummary0.getAllowFlush());
  }

  @Test
  public void test31()  throws Throwable  {
      TrackedFileSummary trackedFileSummary0 = new TrackedFileSummary((UtilizationTracker) null, 1919L, false);
      boolean boolean0 = trackedFileSummary0.getAllowFlush();
      assertTrue(boolean0);
      assertEquals(1919L, trackedFileSummary0.getFileNumber());
  }

  @Test
  public void test32()  throws Throwable  {
      TrackedFileSummary trackedFileSummary0 = new TrackedFileSummary((UtilizationTracker) null, 0L, false);
      // Undeclared exception!
      try { 
        trackedFileSummary0.reset();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.cleaner.TrackedFileSummary", e);
      }
  }

  @Test
  public void test33()  throws Throwable  {
      TrackedFileSummary trackedFileSummary0 = new TrackedFileSummary((UtilizationTracker) null, 0L, true);
      // Undeclared exception!
      try { 
        trackedFileSummary0.trackObsolete(0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.cleaner.TrackedFileSummary$TrackedFileSummary_trackObsolete", e);
      }
  }

  
}
