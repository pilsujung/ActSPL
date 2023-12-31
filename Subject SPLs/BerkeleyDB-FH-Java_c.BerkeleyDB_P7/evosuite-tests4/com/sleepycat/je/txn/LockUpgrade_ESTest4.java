/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 16:32:03 KST 2017
 */

package com.sleepycat.je.txn;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class LockUpgrade_ESTest4 extends LockUpgrade_ESTest_scaffolding4 {



  @Test
  public void test2()  throws Throwable  {
      LockUpgrade lockUpgrade0 = LockUpgrade.RANGE_WRITE_IMMED;
      LockType lockType0 = lockUpgrade0.getUpgrade();
      assertEquals("RANGE_WRITE", lockType0.toString());
  }


  @Test
  public void test4()  throws Throwable  {
      LockUpgrade lockUpgrade0 = LockUpgrade.RANGE_WRITE_IMMED;
      boolean boolean0 = lockUpgrade0.getIllegal();
      assertFalse(boolean0);
  }

  @Test
  public void test5()  throws Throwable  {
      LockUpgrade lockUpgrade0 = LockUpgrade.WRITE_PROMOTE;
      boolean boolean0 = lockUpgrade0.getPromotion();
      assertTrue(boolean0);
  }


}
