/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 10:13:35 KST 2017
 */

package com.sleepycat.je.tree;

import static org.junit.Assert.assertEquals;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class InconsistentNodeException_ESTest8 extends InconsistentNodeException_ESTest_scaffolding8 {

  @Test
  public void test0()  throws Throwable  {
      InconsistentNodeException inconsistentNodeException0 = new InconsistentNodeException("");
      assertEquals("", inconsistentNodeException0.getMessage());
  }

  @Test
  public void test1()  throws Throwable  {
      InconsistentNodeException inconsistentNodeException0 = new InconsistentNodeException();
      assertEquals("com.sleepycat.je.tree.InconsistentNodeException", inconsistentNodeException0.toString());
  }
}