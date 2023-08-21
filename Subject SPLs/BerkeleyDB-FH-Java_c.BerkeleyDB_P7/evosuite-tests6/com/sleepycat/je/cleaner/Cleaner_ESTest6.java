/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 21 23:44:06 KST 2017
 */

package com.sleepycat.je.cleaner;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.sleepycat.je.EnvironmentConfig;
import com.sleepycat.je.cleaner.Cleaner;
import com.sleepycat.je.dbi.EnvironmentImpl;
import java.io.File;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class Cleaner_ESTest6 extends Cleaner_ESTest_scaffolding6 {

  @Test
  public void test0()  throws Throwable  {
      String string0 = "";
      EnvironmentConfig environmentConfig0 = new EnvironmentConfig();
      EnvironmentImpl environmentImpl0 = null;
      try {
        environmentImpl0 = new EnvironmentImpl((File) null, environmentConfig0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.FileManager", e);
      }
  }

  @Test
  public void test1()  throws Throwable  {
      Cleaner.Cleaner_processPending cleaner_Cleaner_processPending0 = new Cleaner.Cleaner_processPending((Cleaner) null);
      // Undeclared exception!
      try { 
        cleaner_Cleaner_processPending0.execute();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.cleaner.Cleaner", e);
      }
  }

  @Test
  public void test2()  throws Throwable  {
      Cleaner.Cleaner_processPending cleaner_Cleaner_processPending0 = new Cleaner.Cleaner_processPending((Cleaner) null);
      cleaner_Cleaner_processPending0.hook114();
  }

  @Test
  public void test3()  throws Throwable  {
      Cleaner cleaner0 = null;
      try {
        cleaner0 = new Cleaner((EnvironmentImpl) null, ".89>|5HZw");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.cleaner.UtilizationProfile", e);
      }
  }
}