/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 02:47:54 KST 2017
 */

package com.sleepycat.je.utilint;

import static org.junit.Assert.assertEquals;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class NotImplementedYetException_ESTest2 extends NotImplementedYetException_ESTest_scaffolding2 {

  @Test
  public void test0()  throws Throwable  {
      NotImplementedYetException notImplementedYetException0 = new NotImplementedYetException("SD%");
      assertEquals("com.sleepycat.je.utilint.NotImplementedYetException: SD%", notImplementedYetException0.toString());
  }

  @Test
  public void test1()  throws Throwable  {
      NotImplementedYetException notImplementedYetException0 = new NotImplementedYetException();
      assertEquals("com.sleepycat.je.utilint.NotImplementedYetException", notImplementedYetException0.toString());
  }
}
