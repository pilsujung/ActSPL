/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 14:43:32 KST 2017
 */

package com.sleepycat.je.latch;

import org.junit.Test;
import static org.junit.Assert.*;
import com.sleepycat.je.latch.LatchException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class LatchException_ESTest4 extends LatchException_ESTest_scaffolding4 {

  @Test
  public void test0()  throws Throwable  {
      LatchException latchException0 = new LatchException("{B5d{dcl@D3W*ixLHe*");
      assertEquals("{B5d{dcl@D3W*ixLHe*", latchException0.getMessage());
  }

  @Test
  public void test1()  throws Throwable  {
      LatchException latchException0 = new LatchException();
      assertEquals("com.sleepycat.je.latch.LatchException", latchException0.toString());
  }
}
