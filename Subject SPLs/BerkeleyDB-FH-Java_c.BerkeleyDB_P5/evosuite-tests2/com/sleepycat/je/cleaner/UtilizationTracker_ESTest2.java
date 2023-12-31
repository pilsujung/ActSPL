/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 21 21:48:41 KST 2017
 */

package com.sleepycat.je.cleaner;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.sleepycat.je.cleaner.Cleaner;
import com.sleepycat.je.cleaner.TrackedFileSummary;
import com.sleepycat.je.cleaner.UtilizationTracker;
import com.sleepycat.je.dbi.EnvironmentImpl;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class UtilizationTracker_ESTest2 extends UtilizationTracker_ESTest_scaffolding2 {

  @Test
  public void test00()  throws Throwable  {
      UtilizationTracker.UtilizationTracker_evictMemory utilizationTracker_UtilizationTracker_evictMemory0 = new UtilizationTracker.UtilizationTracker_evictMemory((UtilizationTracker) null);
      utilizationTracker_UtilizationTracker_evictMemory0.mem = 1;
      utilizationTracker_UtilizationTracker_evictMemory0.hook199();
  }

  @Test
  public void test01()  throws Throwable  {
      UtilizationTracker.UtilizationTracker_evictMemory utilizationTracker_UtilizationTracker_evictMemory0 = new UtilizationTracker.UtilizationTracker_evictMemory((UtilizationTracker) null);
      TrackedFileSummary trackedFileSummary0 = new TrackedFileSummary((UtilizationTracker) null, (-987L), true);
      utilizationTracker_UtilizationTracker_evictMemory0.bestFile = trackedFileSummary0;
      // Undeclared exception!
      try { 
        utilizationTracker_UtilizationTracker_evictMemory0.hook198();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.cleaner.UtilizationTracker$UtilizationTracker_evictMemory", e);
      }
  }

  @Test
  public void test02()  throws Throwable  {
      UtilizationTracker.UtilizationTracker_evictMemory utilizationTracker_UtilizationTracker_evictMemory0 = new UtilizationTracker.UtilizationTracker_evictMemory((UtilizationTracker) null);
      utilizationTracker_UtilizationTracker_evictMemory0.largestBytes = 60;
      utilizationTracker_UtilizationTracker_evictMemory0.hook197();
  }

  @Test
  public void test03()  throws Throwable  {
      UtilizationTracker.UtilizationTracker_evictMemory utilizationTracker_UtilizationTracker_evictMemory0 = new UtilizationTracker.UtilizationTracker_evictMemory((UtilizationTracker) null);
      utilizationTracker_UtilizationTracker_evictMemory0.b1 = true;
      utilizationTracker_UtilizationTracker_evictMemory0.hook197();
  }

  @Test
  public void test04()  throws Throwable  {
      UtilizationTracker.UtilizationTracker_evictMemory utilizationTracker_UtilizationTracker_evictMemory0 = new UtilizationTracker.UtilizationTracker_evictMemory((UtilizationTracker) null);
      utilizationTracker_UtilizationTracker_evictMemory0.totalBytes = (long) 1;
      // Undeclared exception!
      try { 
        utilizationTracker_UtilizationTracker_evictMemory0.hook196();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.cleaner.UtilizationTracker$UtilizationTracker_evictMemory", e);
      }
  }

  @Test
  public void test05()  throws Throwable  {
      UtilizationTracker.UtilizationTracker_evictMemory utilizationTracker_UtilizationTracker_evictMemory0 = new UtilizationTracker.UtilizationTracker_evictMemory((UtilizationTracker) null);
      utilizationTracker_UtilizationTracker_evictMemory0.b2 = true;
      // Undeclared exception!
      try { 
        utilizationTracker_UtilizationTracker_evictMemory0.hook196();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.cleaner.UtilizationTracker$UtilizationTracker_evictMemory", e);
      }
  }

  @Test
  public void test06()  throws Throwable  {
      EnvironmentImpl environmentImpl0 = null;
      String string0 = "";
      Cleaner cleaner0 = null;
      try {
        cleaner0 = new Cleaner(environmentImpl0, string0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.cleaner.UtilizationProfile", e);
      }
  }

  @Test
  public void test07()  throws Throwable  {
      UtilizationTracker.UtilizationTracker_evictMemory utilizationTracker_UtilizationTracker_evictMemory0 = new UtilizationTracker.UtilizationTracker_evictMemory((UtilizationTracker) null);
      TrackedFileSummary trackedFileSummary0 = null;
      try {  
      trackedFileSummary0 = utilizationTracker_UtilizationTracker_evictMemory0.tfs;
      } catch(NullPointerException e) {}
  }

  @Test
  public void test08()  throws Throwable  {
      UtilizationTracker.UtilizationTracker_evictMemory utilizationTracker_UtilizationTracker_evictMemory0 = new UtilizationTracker.UtilizationTracker_evictMemory((UtilizationTracker) null);
      UtilizationTracker utilizationTracker0 = null;
      try {  
      utilizationTracker0 = utilizationTracker_UtilizationTracker_evictMemory0._this;
      } catch(NullPointerException e) {}
  }

  @Test
  public void test10()  throws Throwable  {
      UtilizationTracker.UtilizationTracker_evictMemory utilizationTracker_UtilizationTracker_evictMemory0 = new UtilizationTracker.UtilizationTracker_evictMemory((UtilizationTracker) null);
      // Undeclared exception!
      try { 
        utilizationTracker_UtilizationTracker_evictMemory0.execute();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.cleaner.UtilizationTracker", e);
      }
  }

  @Test
  public void test11()  throws Throwable  {
      UtilizationTracker.UtilizationTracker_evictMemory utilizationTracker_UtilizationTracker_evictMemory0 = new UtilizationTracker.UtilizationTracker_evictMemory((UtilizationTracker) null);
      utilizationTracker_UtilizationTracker_evictMemory0.mem = 1053;
      utilizationTracker_UtilizationTracker_evictMemory0.hook197();
  }

  @Test
  public void test12()  throws Throwable  {
      Cleaner cleaner0 = null;
      try {
        cleaner0 = new Cleaner((EnvironmentImpl) null, "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.cleaner.UtilizationProfile", e);
      }
  }

}
