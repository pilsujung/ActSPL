/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 03:01:25 KST 2017
 */

package com.sleepycat.je.utilint;

import static org.junit.Assert.assertEquals;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class InternalException_ESTest6 extends InternalException_ESTest_scaffolding6 {

  @Test
  public void test0()  throws Throwable  {
      InternalException internalException0 = new InternalException("84!u]q");
      assertEquals("com.sleepycat.je.utilint.InternalException: 84!u]q", internalException0.toString());
  }

  @Test
  public void test1()  throws Throwable  {
      InternalException internalException0 = new InternalException();
      assertEquals("com.sleepycat.je.utilint.InternalException", internalException0.toString());
  }
}