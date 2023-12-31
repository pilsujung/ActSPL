/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 03:33:00 KST 2017
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

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class TrackedFileSummary_ESTest8 extends TrackedFileSummary_ESTest_scaffolding8 {

  @Test
  public void test00()  throws Throwable  {
      TrackedFileSummary trackedFileSummary0 = new TrackedFileSummary((UtilizationTracker) null, 9L, false);
      long long0 = trackedFileSummary0.getFileNumber();
      assertTrue(trackedFileSummary0.getAllowFlush());
      assertEquals(9L, long0);
  }

  @Test
  public void test01()  throws Throwable  {
      TrackedFileSummary trackedFileSummary0 = new TrackedFileSummary((UtilizationTracker) null, (-14L), false);
      long long0 = trackedFileSummary0.getFileNumber();
      assertEquals((-14L), long0);
      assertTrue(trackedFileSummary0.getAllowFlush());
  }

  @Test
  public void test02()  throws Throwable  {
      TrackedFileSummary trackedFileSummary0 = new TrackedFileSummary((UtilizationTracker) null, 1189L, true);
      TrackedFileSummary trackedFileSummary1 = new TrackedFileSummary((UtilizationTracker) null, 0, true);
      trackedFileSummary0.addTrackedSummary(trackedFileSummary1);
      assertEquals(1189L, trackedFileSummary0.getFileNumber());
      assertTrue(trackedFileSummary1.getAllowFlush());
  }

  @Test
  public void test03()  throws Throwable  {
      TrackedFileSummary trackedFileSummary0 = new TrackedFileSummary((UtilizationTracker) null, 1L, false);
      trackedFileSummary0.trackObsolete(0L);
      assertTrue(trackedFileSummary0.getAllowFlush());
      assertEquals(1L, trackedFileSummary0.getFileNumber());
  }

  @Test
  public void test04()  throws Throwable  {
      TrackedFileSummary trackedFileSummary0 = new TrackedFileSummary((UtilizationTracker) null, 1L, false);
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
  public void test05()  throws Throwable  {
      TrackedFileSummary trackedFileSummary0 = new TrackedFileSummary((UtilizationTracker) null, (-14L), false);
      boolean boolean0 = trackedFileSummary0.containsObsoleteOffset((-14L));
      assertFalse(boolean0);
      assertEquals((-14L), trackedFileSummary0.getFileNumber());
      assertTrue(trackedFileSummary0.getAllowFlush());
  }

  @Test
  public void test06()  throws Throwable  {
      TrackedFileSummary trackedFileSummary0 = new TrackedFileSummary((UtilizationTracker) null, 0L, false);
      trackedFileSummary0.getObsoleteOffsets();
      assertTrue(trackedFileSummary0.getAllowFlush());
  }

  @Test
  public void test08()  throws Throwable  {
      TrackedFileSummary trackedFileSummary0 = new TrackedFileSummary((UtilizationTracker) null, 1L, false);
      trackedFileSummary0.hook168();
      assertEquals(1L, trackedFileSummary0.getFileNumber());
      assertTrue(trackedFileSummary0.getAllowFlush());
  }

  @Test
  public void test09()  throws Throwable  {
      TrackedFileSummary trackedFileSummary0 = new TrackedFileSummary((UtilizationTracker) null, 0L, false);
      trackedFileSummary0.getFileNumber();
      assertTrue(trackedFileSummary0.getAllowFlush());
  }

  @Test
  public void test10()  throws Throwable  {
      TrackedFileSummary trackedFileSummary0 = new TrackedFileSummary((UtilizationTracker) null, 1L, false);
      assertTrue(trackedFileSummary0.getAllowFlush());
      
      trackedFileSummary0.setAllowFlush(false);
      boolean boolean0 = trackedFileSummary0.getAllowFlush();
      assertFalse(boolean0);
  }

  @Test
  public void test11()  throws Throwable  {
      TrackedFileSummary trackedFileSummary0 = new TrackedFileSummary((UtilizationTracker) null, 0L, false);
      boolean boolean0 = trackedFileSummary0.getAllowFlush();
      assertTrue(boolean0);
  }

  @Test
  public void test12()  throws Throwable  {
      TrackedFileSummary trackedFileSummary0 = new TrackedFileSummary((UtilizationTracker) null, 9L, false);
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
  public void test13()  throws Throwable  {
      TrackedFileSummary.TrackedFileSummary_trackObsolete trackedFileSummary_TrackedFileSummary_trackObsolete0 = new TrackedFileSummary.TrackedFileSummary_trackObsolete((TrackedFileSummary) null, 0);
      trackedFileSummary_TrackedFileSummary_trackObsolete0.hook172();
  }

  @Test
  public void test14()  throws Throwable  {
      TrackedFileSummary trackedFileSummary0 = new TrackedFileSummary((UtilizationTracker) null, 1L, true);
      // Undeclared exception!
      try { 
        trackedFileSummary0.trackObsolete(1L);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.cleaner.TrackedFileSummary$TrackedFileSummary_trackObsolete", e);
      }
  }
}
