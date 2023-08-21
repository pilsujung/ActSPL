/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 13:50:21 KST 2017
 */

package com.sleepycat.je;

import org.junit.Test;
import static org.junit.Assert.*;
import com.sleepycat.je.RunRecoveryException;
import com.sleepycat.je.dbi.EnvironmentImpl;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class RunRecoveryException_ESTest4 extends RunRecoveryException_ESTest_scaffolding4 {


  @Test
  public void test1()  throws Throwable  {
      RunRecoveryException runRecoveryException0 = new RunRecoveryException((EnvironmentImpl) null, "");
      runRecoveryException0.setAlreadyThrown();
      String string0 = runRecoveryException0.toString();
      assertEquals("Environment invalid because of previous exception: com.sleepycat.je.RunRecoveryException: ", string0);
  }


  @Test
  public void test3()  throws Throwable  {
      RunRecoveryException runRecoveryException0 = new RunRecoveryException((EnvironmentImpl) null, "");
      RunRecoveryException runRecoveryException1 = new RunRecoveryException((EnvironmentImpl) null, "", (Throwable) runRecoveryException0);
      assertEquals("", runRecoveryException1.getMessage());
  }
}
