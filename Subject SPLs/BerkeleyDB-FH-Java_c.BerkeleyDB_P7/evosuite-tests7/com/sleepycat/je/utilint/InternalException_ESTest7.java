/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 21 22:20:23 KST 2017
 */

package com.sleepycat.je.utilint;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class InternalException_ESTest7 extends InternalException_ESTest_scaffolding7 {

  @Test
  public void test0()  throws Throwable  {
      InternalException internalException0 = new InternalException("$\"7}1");
      assertEquals("$\"7}1", internalException0.getMessage());
  }

  @Test
  public void test1()  throws Throwable  {
      InternalException internalException0 = new InternalException();
      assertNull(internalException0.getMessage());
  }
}
