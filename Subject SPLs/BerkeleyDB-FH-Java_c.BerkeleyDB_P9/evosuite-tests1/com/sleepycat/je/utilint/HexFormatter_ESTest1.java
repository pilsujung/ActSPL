/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 21 21:32:30 KST 2017
 */

package com.sleepycat.je.utilint;

import static org.junit.Assert.assertEquals;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class HexFormatter_ESTest1 extends HexFormatter_ESTest_scaffolding1 {

  @Test
  public void test0()  throws Throwable  {
      String string0 = HexFormatter.formatLong(1L);
      assertEquals("0x0000000000000001", string0);
  }

  @Test
  public void test1()  throws Throwable  {
      HexFormatter hexFormatter0 = new HexFormatter();
  }
}