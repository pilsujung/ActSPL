/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 21 21:08:43 KST 2017
 */

package com.sleepycat.je.txn;

import org.junit.Test;
import static org.junit.Assert.*;
import com.sleepycat.je.txn.LockType;
import com.sleepycat.je.txn.LockUpgrade;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class LockUpgrade_ESTest1 extends LockUpgrade_ESTest_scaffolding1 {

  @Test
  public void test0()  throws Throwable  {
      LockUpgrade lockUpgrade0 = LockUpgrade.RANGE_READ_IMMED;
      LockType lockType0 = lockUpgrade0.getUpgrade();
      assertEquals("RANGE_READ", lockType0.toString());
  }

  @Test
  public void test1()  throws Throwable  {
      LockUpgrade lockUpgrade0 = LockUpgrade.RANGE_WRITE_PROMOTE;
      LockType lockType0 = lockUpgrade0.getUpgrade();
      assertEquals("RANGE_WRITE", lockType0.toString());
  }

  @Test
  public void test2()  throws Throwable  {
      LockUpgrade lockUpgrade0 = LockUpgrade.WRITE_PROMOTE;
      LockType lockType0 = lockUpgrade0.getUpgrade();
      assertTrue(lockType0.isWriteLock());
  }

  @Test
  public void test3()  throws Throwable  {
      LockUpgrade lockUpgrade0 = LockUpgrade.RANGE_WRITE_PROMOTE;
      boolean boolean0 = lockUpgrade0.getPromotion();
      assertTrue(boolean0);
  }

  @Test
  public void test4()  throws Throwable  {
      LockUpgrade lockUpgrade0 = LockUpgrade.RANGE_WRITE_PROMOTE;
      boolean boolean0 = lockUpgrade0.getIllegal();
      assertFalse(boolean0);
  }

  @Test
  public void test5()  throws Throwable  {
      LockUpgrade lockUpgrade0 = LockUpgrade.EXISTING;
      boolean boolean0 = lockUpgrade0.getPromotion();
      assertFalse(boolean0);
  }

  @Test
  public void test6()  throws Throwable  {
      LockUpgrade lockUpgrade0 = LockUpgrade.ILLEGAL;
      boolean boolean0 = lockUpgrade0.getIllegal();
      assertTrue(boolean0);
  }

  @Test
  public void test7()  throws Throwable  {
      LockUpgrade lockUpgrade0 = LockUpgrade.ILLEGAL;
      LockType lockType0 = lockUpgrade0.getUpgrade();
      assertNull(lockType0);
  }
}
