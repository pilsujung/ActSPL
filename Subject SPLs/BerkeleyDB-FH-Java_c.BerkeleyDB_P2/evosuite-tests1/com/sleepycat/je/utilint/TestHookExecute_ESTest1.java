/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 21 21:36:25 KST 2017
 */

package com.sleepycat.je.utilint;

import static org.junit.Assert.assertTrue;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class TestHookExecute_ESTest1 extends TestHookExecute_ESTest_scaffolding1 {

  @Test
  public void test0()  throws Throwable  {
      boolean boolean0 = TestHookExecute.doHookIfSet((TestHook) null);
      assertTrue(boolean0);
  }

  @Test
  public void test1()  throws Throwable  {
      TestHookExecute testHookExecute0 = new TestHookExecute();
  }
}
