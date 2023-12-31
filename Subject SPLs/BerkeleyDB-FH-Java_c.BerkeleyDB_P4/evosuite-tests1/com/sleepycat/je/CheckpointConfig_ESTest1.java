/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 21 18:27:06 KST 2017
 */

package com.sleepycat.je;

import static org.junit.Assert.assertFalse;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class CheckpointConfig_ESTest1 extends CheckpointConfig_ESTest_scaffolding1 {

  @Test
  public void test0()  throws Throwable  {
      CheckpointConfig checkpointConfig0 = CheckpointConfig.DEFAULT;
      checkpointConfig0.setForce(false);
      assertFalse(checkpointConfig0.getForce());
  }

  @Test
  public void test1()  throws Throwable  {
      CheckpointConfig checkpointConfig0 = new CheckpointConfig();
      assertFalse(checkpointConfig0.getMinimizeRecoveryTime());
      assertFalse(checkpointConfig0.getForce());
  }

  @Test
  public void test2()  throws Throwable  {
      CheckpointConfig checkpointConfig0 = CheckpointConfig.DEFAULT;
      boolean boolean0 = checkpointConfig0.getMinimizeRecoveryTime();
      //  // Unstable assertion: assertTrue(boolean0);
  }

  @Test
  public void test3()  throws Throwable  {
      CheckpointConfig checkpointConfig0 = CheckpointConfig.DEFAULT;
      boolean boolean0 = checkpointConfig0.getForce();
      assertFalse(boolean0);
  }

  @Test
  public void test4()  throws Throwable  {
      CheckpointConfig checkpointConfig0 = CheckpointConfig.DEFAULT;
      checkpointConfig0.setMinimizeRecoveryTime(false);
      assertFalse(checkpointConfig0.getMinimizeRecoveryTime());
  }
}
