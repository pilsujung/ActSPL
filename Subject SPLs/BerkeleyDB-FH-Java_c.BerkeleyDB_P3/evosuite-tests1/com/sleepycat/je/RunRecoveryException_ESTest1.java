/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 21 18:49:14 KST 2017
 */

package com.sleepycat.je;

import static org.junit.Assert.assertEquals;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.sleepycat.je.dbi.EnvironmentImpl;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class RunRecoveryException_ESTest1 extends RunRecoveryException_ESTest_scaffolding1 {

  @Test
  public void test0()  throws Throwable  {
      RunRecoveryException runRecoveryException0 = new RunRecoveryException((EnvironmentImpl) null);
      String string0 = runRecoveryException0.toString();
      assertEquals("com.sleepycat.je.RunRecoveryException", string0);
  }

  @Test
  public void test1()  throws Throwable  {
      RunRecoveryException runRecoveryException0 = new RunRecoveryException((EnvironmentImpl) null);
      runRecoveryException0.setAlreadyThrown();
      String string0 = runRecoveryException0.toString();
      assertEquals("Environment invalid because of previous exception: com.sleepycat.je.RunRecoveryException", string0);
  }

  @Test
  public void test2()  throws Throwable  {
      RunRecoveryException runRecoveryException0 = new RunRecoveryException((EnvironmentImpl) null);
      RunRecoveryException runRecoveryException1 = new RunRecoveryException((EnvironmentImpl) null, (Throwable) runRecoveryException0);
      assertEquals("com.sleepycat.je.RunRecoveryException", runRecoveryException1.getMessage());
  }

  @Test
  public void test3()  throws Throwable  {
      RunRecoveryException runRecoveryException0 = new RunRecoveryException((EnvironmentImpl) null);
      RunRecoveryException runRecoveryException1 = new RunRecoveryException((EnvironmentImpl) null, "Environment invalid because of previous exception: com.sleepycat.je.RunRecoveryException", (Throwable) runRecoveryException0);
      assertEquals("Environment invalid because of previous exception: com.sleepycat.je.RunRecoveryException", runRecoveryException1.getMessage());
  }

  @Test
  public void test4()  throws Throwable  {
      RunRecoveryException runRecoveryException0 = new RunRecoveryException((EnvironmentImpl) null, "lmaY0");
      assertEquals("lmaY0", runRecoveryException0.getMessage());
  }
}