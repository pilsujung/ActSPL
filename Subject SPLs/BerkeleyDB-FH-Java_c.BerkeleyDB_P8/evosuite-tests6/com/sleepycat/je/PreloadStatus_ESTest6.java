/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 21 23:31:48 KST 2017
 */

package com.sleepycat.je;

import static org.junit.Assert.assertEquals;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class PreloadStatus_ESTest6 extends PreloadStatus_ESTest_scaffolding6 {

  @Test
  public void test0()  throws Throwable  {
      PreloadStatus preloadStatus0 = PreloadStatus.EXCEEDED_TIME;
      String string0 = preloadStatus0.toString();
      assertEquals("PreloadStatus.EXCEEDED_TIME", string0);
  }
}