/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 02:17:13 KST 2017
 */

package com.sleepycat.je.tree;

import static org.junit.Assert.assertEquals;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class TreeStats_ESTest6 extends TreeStats_ESTest_scaffolding6 {

  @Test
  public void test0()  throws Throwable  {
      TreeStats treeStats0 = new TreeStats();
      assertEquals(0, treeStats0.nRootSplits);
  }
}
