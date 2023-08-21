/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 03:51:12 KST 2017
 */

package com.sleepycat.je;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.sleepycat.je.dbi.EnvironmentImpl;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class RunRecoveryException_ESTest3 extends RunRecoveryException_ESTest_scaffolding3 {




  @Test
  public void test3()  throws Throwable  {
      RunRecoveryException runRecoveryException0 = new RunRecoveryException((EnvironmentImpl) null);
      RunRecoveryException runRecoveryException1 = new RunRecoveryException((EnvironmentImpl) null, "=!BoQr%nlMa", (Throwable) runRecoveryException0);
      assertFalse(runRecoveryException0.equals((Object)runRecoveryException1));
  }

  @Test
  public void test4()  throws Throwable  {
      RunRecoveryException runRecoveryException0 = new RunRecoveryException((EnvironmentImpl) null, "=!BoQr%nlMa");
      assertEquals("=!BoQr%nlMa", runRecoveryException0.getMessage());
  }
}
