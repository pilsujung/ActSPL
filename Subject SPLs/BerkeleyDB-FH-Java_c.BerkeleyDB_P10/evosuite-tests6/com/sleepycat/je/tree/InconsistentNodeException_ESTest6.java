/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 02:01:17 KST 2017
 */

package com.sleepycat.je.tree;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class InconsistentNodeException_ESTest6 extends InconsistentNodeException_ESTest_scaffolding6 {

  @Test
  public void test0()  throws Throwable  {
      InconsistentNodeException inconsistentNodeException0 = new InconsistentNodeException("");
      assertEquals("", inconsistentNodeException0.getMessage());
  }

  @Test
  public void test1()  throws Throwable  {
      InconsistentNodeException inconsistentNodeException0 = new InconsistentNodeException();
      assertNull(inconsistentNodeException0.getMessage());
  }
}