/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 07 16:50:21 KST 2017
 */

package org.prevayler.foundation;

import static org.junit.Assert.assertEquals;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class StopWatch_ESTest3 extends StopWatch_ESTest_scaffolding3 {

  @Test
  public void test0()  throws Throwable  {
      StopWatch stopWatch0 = StopWatch.start();
      long long0 = stopWatch0.millisEllapsed();
      //  // Unstable assertion: assertEquals(1L, long0);
  }

  @Test
  public void test1()  throws Throwable  {
      StopWatch stopWatch0 = StopWatch.start();
      double double0 = stopWatch0.secondsEllapsed();
      assertEquals(0.004, double0, 0.01D);
  }
}
