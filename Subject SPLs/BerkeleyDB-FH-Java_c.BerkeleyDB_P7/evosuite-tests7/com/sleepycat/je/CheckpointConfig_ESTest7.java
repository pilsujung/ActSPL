/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 21 19:01:31 KST 2017
 */

package com.sleepycat.je;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class CheckpointConfig_ESTest7 extends CheckpointConfig_ESTest_scaffolding7 {

  @Test
  public void test0()  throws Throwable  {
      CheckpointConfig checkpointConfig0 = CheckpointConfig.DEFAULT;
      int int0 = checkpointConfig0.getMinutes();
      assertEquals(0, int0);
  }

  @Test
  public void test1()  throws Throwable  {
      CheckpointConfig checkpointConfig0 = new CheckpointConfig();
      assertFalse(checkpointConfig0.getMinimizeRecoveryTime());
      
      checkpointConfig0.setMinimizeRecoveryTime(true);
      boolean boolean0 = checkpointConfig0.getMinimizeRecoveryTime();
      assertTrue(boolean0);
  }

  @Test
  public void test2()  throws Throwable  {
      CheckpointConfig checkpointConfig0 = new CheckpointConfig();
      assertFalse(checkpointConfig0.getForce());
      
      checkpointConfig0.setForce(true);
      boolean boolean0 = checkpointConfig0.getForce();
      assertTrue(boolean0);
  }

  @Test
  public void test3()  throws Throwable  {
      CheckpointConfig checkpointConfig0 = new CheckpointConfig();
      int int0 = checkpointConfig0.getMinutes();
      assertFalse(checkpointConfig0.getMinimizeRecoveryTime());
      assertEquals(0, int0);
      assertFalse(checkpointConfig0.getForce());
  }

  @Test
  public void test4()  throws Throwable  {
      CheckpointConfig checkpointConfig0 = new CheckpointConfig();
      checkpointConfig0.setMinutes((-1));
      assertEquals(-1, checkpointConfig0.getMinutes());
  }

  @Test
  public void test5()  throws Throwable  {
      CheckpointConfig checkpointConfig0 = new CheckpointConfig();
      boolean boolean0 = checkpointConfig0.getMinimizeRecoveryTime();
      assertEquals(0, checkpointConfig0.getMinutes());
      assertFalse(boolean0);
      assertFalse(checkpointConfig0.getForce());
  }

  @Test
  public void test6()  throws Throwable  {
      CheckpointConfig checkpointConfig0 = new CheckpointConfig();
      boolean boolean0 = checkpointConfig0.getForce();
      assertFalse(boolean0);
      assertFalse(checkpointConfig0.getMinimizeRecoveryTime());
      assertEquals(0, checkpointConfig0.getMinutes());
  }
}
