/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 01:58:54 KST 2017
 */

package com.sleepycat.je.tree;

import static org.junit.Assert.assertNull;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class SplitRequiredException_ESTest2 extends SplitRequiredException_ESTest_scaffolding2 {

  @Test
  public void test0()  throws Throwable  {
      SplitRequiredException splitRequiredException0 = new SplitRequiredException();
      assertNull(splitRequiredException0.getMessage());
  }
}