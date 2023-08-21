/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 08:35:03 KST 2017
 */

package com.sleepycat.je.latch;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.sleepycat.je.latch.Java5LatchImpl;
import com.sleepycat.je.latch.LatchNotHeldException;
import com.sleepycat.je.latch.LatchStats;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class Java5LatchImpl_ESTest5 extends Java5LatchImpl_ESTest_scaffolding5 {













  @Test
  public void test12()  throws Throwable  {
      Java5LatchImpl java5LatchImpl0 = new Java5LatchImpl();
      java5LatchImpl0.setName("");
  }



  @Test
  public void test15()  throws Throwable  {
      Java5LatchImpl java5LatchImpl0 = new Java5LatchImpl();
      LatchStats latchStats0 = java5LatchImpl0.getLatchStats();
      assertEquals(0, latchStats0.nAcquireNoWaitUnsuccessful);
  }
}
