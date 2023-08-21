/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 12:06:49 KST 2017
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
public class LockUpgrade_ESTest5 extends LockUpgrade_ESTest_scaffolding5 {





  @Test
  public void test4()  throws Throwable  {
      LockUpgrade lockUpgrade0 = LockUpgrade.ILLEGAL;
      boolean boolean0 = lockUpgrade0.getPromotion();
      assertFalse(boolean0);
  }


  @Test
  public void test6()  throws Throwable  {
      LockUpgrade lockUpgrade0 = LockUpgrade.RANGE_READ_IMMED;
      LockType lockType0 = lockUpgrade0.getUpgrade();
      assertFalse(lockType0.isWriteLock());
  }
}
