/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 21 19:13:35 KST 2017
 */

package com.sleepycat.je.config;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class BooleanConfigParam_ESTest1 extends BooleanConfigParam_ESTest_scaffolding1 {

  @Test
  public void test0()  throws Throwable  {
      BooleanConfigParam booleanConfigParam0 = new BooleanConfigParam(" not valid boolean ", false, false, " not valid boolean ");
      // Undeclared exception!
      try { 
        booleanConfigParam0.validateValue((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.config.BooleanConfigParam", e);
      }
  }

  @Test
  public void test1()  throws Throwable  {
      BooleanConfigParam booleanConfigParam0 = null;
      try {
        booleanConfigParam0 = new BooleanConfigParam("", false, false, "");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         //  A configuration parameter name can't be null or 0 length
         //
         assertThrownBy("com.sleepycat.je.config.ConfigParam", e);
      }
  }

  @Test
  public void test2()  throws Throwable  {
      BooleanConfigParam booleanConfigParam0 = new BooleanConfigParam(": ", true, false, "# *** Experimental and may be removed in a future release. ***\n# If true, eviction and checkpointing will cluster records by key\n# value, migrating them from low utilization files if they are\n# resident.\n# The cluster and clusterAll properties may not both be set to true.");
      booleanConfigParam0.validateValue("true");
      assertNull(booleanConfigParam0.getExtraDescription());
  }

  @Test
  public void test3()  throws Throwable  {
      BooleanConfigParam booleanConfigParam0 = new BooleanConfigParam("je.env.recoveryForceCheckpoint", true, true, "je.env.recoveryForceCheckpoint");
      try { 
        booleanConfigParam0.validateValue(",8Rbx:n4sF");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // com.sleepycat.je.config.BooleanConfigParam: ,8Rbx:n4sF not valid boolean je.env.recoveryForceCheckpoint
         //
         assertThrownBy("com.sleepycat.je.config.BooleanConfigParam", e);
      }
  }

  @Test
  public void test4()  throws Throwable  {
      BooleanConfigParam booleanConfigParam0 = new BooleanConfigParam("je.env.recoveryForceCheckpoint", true, true, "je.env.recoveryForceCheckpoint");
      booleanConfigParam0.validateValue("false");
      assertTrue(booleanConfigParam0.isMutable());
  }
}
