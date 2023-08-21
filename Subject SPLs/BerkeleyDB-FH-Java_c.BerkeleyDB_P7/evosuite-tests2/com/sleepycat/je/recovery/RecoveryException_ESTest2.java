/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 01:23:17 KST 2017
 */

package com.sleepycat.je.recovery;

import static org.junit.Assert.assertEquals;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.sleepycat.je.RunRecoveryException;
import com.sleepycat.je.dbi.EnvironmentImpl;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class RecoveryException_ESTest2 extends RecoveryException_ESTest_scaffolding2 {

  @Test
  public void test0()  throws Throwable  {
      RecoveryException recoveryException0 = new RecoveryException((EnvironmentImpl) null, "");
      assertEquals("", recoveryException0.getMessage());
  }

  @Test
  public void test1()  throws Throwable  {
      RunRecoveryException runRecoveryException0 = new RunRecoveryException((EnvironmentImpl) null, "");
      RecoveryException recoveryException0 = new RecoveryException((EnvironmentImpl) null, "Nested transactions are not supported yet.", (Throwable) runRecoveryException0);
      assertEquals("Nested transactions are not supported yet.", recoveryException0.getMessage());
  }
}
