/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 21 23:23:52 KST 2017
 */

package com.sleepycat.je;

import static org.junit.Assert.assertEquals;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class ForeignKeyDeleteAction_ESTest6 extends ForeignKeyDeleteAction_ESTest_scaffolding6 {

  @Test
  public void test0()  throws Throwable  {
      ForeignKeyDeleteAction foreignKeyDeleteAction0 = ForeignKeyDeleteAction.NULLIFY;
      String string0 = foreignKeyDeleteAction0.toString();
      assertEquals("ForeignKeyDeleteAction.NULLIFY", string0);
  }
}
