/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 04:01:45 KST 2017
 */

package com.sleepycat.je;

import static org.junit.Assert.assertEquals;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class DeadlockException_ESTest8 extends DeadlockException_ESTest_scaffolding8 {


  @Test
  public void test1()  throws Throwable  {
      DeadlockException deadlockException0 = new DeadlockException("");
      assertEquals("", deadlockException0.getMessage());
  }

  @Test
  public void test2()  throws Throwable  {
      DeadlockException deadlockException0 = new DeadlockException("zd~", (Throwable) null);
      assertEquals("zd~", deadlockException0.getMessage());
  }
}
