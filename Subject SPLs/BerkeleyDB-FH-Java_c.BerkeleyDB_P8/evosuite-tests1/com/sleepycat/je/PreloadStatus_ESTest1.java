/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 21 18:48:31 KST 2017
 */

package com.sleepycat.je;

import static org.junit.Assert.assertEquals;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class PreloadStatus_ESTest1 extends PreloadStatus_ESTest_scaffolding1 {

  @Test
  public void test0()  throws Throwable  {
      PreloadStatus preloadStatus0 = PreloadStatus.SUCCESS;
      String string0 = preloadStatus0.toString();
      assertEquals("PreloadStatus.SUCCESS", string0);
  }
}