/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 21 19:49:33 KST 2017
 */

package com.sleepycat.je.log;

import static org.junit.Assert.assertEquals;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class LogFileNotFoundException_ESTest1 extends LogFileNotFoundException_ESTest_scaffolding1 {

  @Test
  public void test0()  throws Throwable  {
      LogFileNotFoundException logFileNotFoundException0 = new LogFileNotFoundException("");
      assertEquals("", logFileNotFoundException0.getMessage());
  }
}