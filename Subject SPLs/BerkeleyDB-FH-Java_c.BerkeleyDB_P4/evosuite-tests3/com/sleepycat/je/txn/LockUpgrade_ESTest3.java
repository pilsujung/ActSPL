/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 10:45:42 KST 2017
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
public class LockUpgrade_ESTest3 extends LockUpgrade_ESTest_scaffolding3 {

  @Test
  public void test0()  throws Throwable  {
      LockUpgrade lockUpgrade0 = LockUpgrade.EXISTING;
      LockType lockType0 = lockUpgrade0.getUpgrade();
      assertNull(lockType0);
  }



  @Test
  public void test3()  throws Throwable  {
      LockUpgrade lockUpgrade0 = LockUpgrade.WRITE_PROMOTE;
      boolean boolean0 = lockUpgrade0.getIllegal();
      assertFalse(boolean0);
  }



}
