/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 21 20:11:53 KST 2017
 */

package com.sleepycat.je.recovery;

import static org.junit.Assert.assertFalse;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.sleepycat.je.dbi.EnvironmentImpl;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class RecoveryException_ESTest1 extends RecoveryException_ESTest_scaffolding1 {

  @Test
  public void test0()  throws Throwable  {
      RecoveryException recoveryException0 = new RecoveryException((EnvironmentImpl) null, "R!j]1lFK-wCr<");
      RecoveryException recoveryException1 = new RecoveryException((EnvironmentImpl) null, "+~thd9\"Y4JSxtpc", (Throwable) recoveryException0);
      assertFalse(recoveryException1.equals((Object)recoveryException0));
  }
}