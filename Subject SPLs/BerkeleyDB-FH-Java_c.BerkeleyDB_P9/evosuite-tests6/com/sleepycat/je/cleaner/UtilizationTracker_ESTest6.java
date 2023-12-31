/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 21 23:58:07 KST 2017
 */

package com.sleepycat.je.cleaner;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.sleepycat.je.EnvironmentConfig;
import com.sleepycat.je.cleaner.Cleaner;
import com.sleepycat.je.cleaner.TrackedFileSummary;
import com.sleepycat.je.cleaner.UtilizationTracker;
import com.sleepycat.je.dbi.EnvironmentImpl;
import java.io.File;
import java.util.Properties;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class UtilizationTracker_ESTest6 extends UtilizationTracker_ESTest_scaffolding6 {

  @Test
  public void test00()  throws Throwable  {
      UtilizationTracker.UtilizationTracker_evictMemory utilizationTracker_UtilizationTracker_evictMemory0 = new UtilizationTracker.UtilizationTracker_evictMemory((UtilizationTracker) null);
      utilizationTracker_UtilizationTracker_evictMemory0.mem = 352;
      utilizationTracker_UtilizationTracker_evictMemory0.hook199();
  }

  @Test
  public void test01()  throws Throwable  {
      UtilizationTracker.UtilizationTracker_evictMemory utilizationTracker_UtilizationTracker_evictMemory0 = new UtilizationTracker.UtilizationTracker_evictMemory((UtilizationTracker) null);
      TrackedFileSummary trackedFileSummary0 = new TrackedFileSummary((UtilizationTracker) null, 4294967296L, true);
      utilizationTracker_UtilizationTracker_evictMemory0.tfs = trackedFileSummary0;
      utilizationTracker_UtilizationTracker_evictMemory0.largestBytes = 50;
      utilizationTracker_UtilizationTracker_evictMemory0.hook198();
  }

  @Test
  public void test02()  throws Throwable  {
      UtilizationTracker.UtilizationTracker_evictMemory utilizationTracker_UtilizationTracker_evictMemory0 = new UtilizationTracker.UtilizationTracker_evictMemory((UtilizationTracker) null);
      TrackedFileSummary trackedFileSummary0 = new TrackedFileSummary((UtilizationTracker) null, 4294967296L, true);
      utilizationTracker_UtilizationTracker_evictMemory0.totalBytes = (-902L);
      utilizationTracker_UtilizationTracker_evictMemory0.tfs = trackedFileSummary0;
      utilizationTracker_UtilizationTracker_evictMemory0.hook198();
  }

  @Test
  public void test03()  throws Throwable  {
      UtilizationTracker.UtilizationTracker_evictMemory utilizationTracker_UtilizationTracker_evictMemory0 = new UtilizationTracker.UtilizationTracker_evictMemory((UtilizationTracker) null);
      utilizationTracker_UtilizationTracker_evictMemory0.largestBytes = 337;
      utilizationTracker_UtilizationTracker_evictMemory0.hook197();
  }

  @Test
  public void test04()  throws Throwable  {
      UtilizationTracker.UtilizationTracker_evictMemory utilizationTracker_UtilizationTracker_evictMemory0 = new UtilizationTracker.UtilizationTracker_evictMemory((UtilizationTracker) null);
      utilizationTracker_UtilizationTracker_evictMemory0.b1 = true;
      utilizationTracker_UtilizationTracker_evictMemory0.hook197();
  }

  @Test
  public void test05()  throws Throwable  {
      UtilizationTracker.UtilizationTracker_evictMemory utilizationTracker_UtilizationTracker_evictMemory0 = new UtilizationTracker.UtilizationTracker_evictMemory((UtilizationTracker) null);
      utilizationTracker_UtilizationTracker_evictMemory0.totalBytes = 2912L;
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
  public void test07()  throws Throwable  {
      File file0 = null;
      EnvironmentConfig environmentConfig0 = null;
      EnvironmentImpl environmentImpl0 = null;
      try {
        environmentImpl0 = new EnvironmentImpl(file0, environmentConfig0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.dbi.DbConfigManager", e);
      }
  }

  @Test
  public void test08()  throws Throwable  {
      File file0 = null;
      Properties properties0 = null;
      EnvironmentConfig environmentConfig0 = null;
      try {
        environmentConfig0 = new EnvironmentConfig(properties0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.EnvironmentMutableConfig", e);
      }
  }

  @Test
  public void test09()  throws Throwable  {
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
  public void test10()  throws Throwable  {
      UtilizationTracker.UtilizationTracker_evictMemory utilizationTracker_UtilizationTracker_evictMemory0 = new UtilizationTracker.UtilizationTracker_evictMemory((UtilizationTracker) null);
      utilizationTracker_UtilizationTracker_evictMemory0.mem = 352;
      utilizationTracker_UtilizationTracker_evictMemory0.hook197();
  }

  @Test
  public void test12()  throws Throwable  {
      Cleaner cleaner0 = null;
      try {
        cleaner0 = new Cleaner((EnvironmentImpl) null, "j^-[h^.2");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.cleaner.UtilizationProfile", e);
      }
  }

  @Test
  public void test13()  throws Throwable  {
      UtilizationTracker utilizationTracker0 = null;
      try {
        utilizationTracker0 = new UtilizationTracker((EnvironmentImpl) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.cleaner.UtilizationTracker", e);
      }
  }
}
