/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 03:43:01 KST 2017
 */

package com.sleepycat.je.cleaner;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.fail;

import java.io.File;
import java.util.Properties;
import java.util.logging.Level;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.sleepycat.je.EnvironmentConfig;
import com.sleepycat.je.dbi.EnvironmentImpl;
import com.sleepycat.je.tree.NameLN;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class Cleaner_ESTest8 extends Cleaner_ESTest_scaffolding8 {

  @Test
  public void test0()  throws Throwable  {
      String string0 = "";
      File file0 = null;
      EnvironmentConfig environmentConfig0 = null;
      try {
        environmentConfig0 = new EnvironmentConfig((Properties) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.EnvironmentMutableConfig", e);
      }
  }


  @Test
  public void test2()  throws Throwable  {
      Level level0 = Level.OFF;
      NameLN nameLN0 = new NameLN();
      Cleaner.Cleaner_trace cleaner_Cleaner_trace0 = new Cleaner.Cleaner_trace((Cleaner) null, level0, ".`W&A.7'.\"`,q4LlZc", nameLN0, (-17L), true, true, true);
      // Undeclared exception!
      try { 
        cleaner_Cleaner_trace0.execute();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.cleaner.Cleaner", e);
      }
  }


  @Test
  public void test4()  throws Throwable  {
      Cleaner cleaner0 = null;
      try {
        cleaner0 = new Cleaner((EnvironmentImpl) null, "c&f;\u0000ggi5%");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.cleaner.UtilizationProfile", e);
      }
  }
}
