/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 21 20:17:08 KST 2017
 */

package com.sleepycat.je.dbi;

import static org.junit.Assert.assertEquals;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class RangeRestartException_ESTest7 extends RangeRestartException_ESTest_scaffolding7 {

  @Test
  public void test0()  throws Throwable  {
      RangeRestartException rangeRestartException0 = new RangeRestartException();
      assertEquals("com.sleepycat.je.dbi.RangeRestartException", rangeRestartException0.toString());
  }
}
