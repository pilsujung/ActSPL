/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 21 23:29:59 KST 2017
 */

package com.sleepycat.je;

import static org.junit.Assert.assertEquals;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class OperationStatus_ESTest6 extends OperationStatus_ESTest_scaffolding6 {

  @Test
  public void test0()  throws Throwable  {
      OperationStatus operationStatus0 = OperationStatus.KEYEMPTY;
      String string0 = operationStatus0.toString();
      assertEquals("OperationStatus.KEYEMPTY", string0);
  }
}
