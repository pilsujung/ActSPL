/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 02:30:16 KST 2017
 */

package com.sleepycat.je.txn;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.fail;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.sleepycat.je.StatsConfig;
import com.sleepycat.je.dbi.EnvironmentImpl;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class LockManager_ESTest6 extends LockManager_ESTest_scaffolding6 {

  @Test
  public void test0()  throws Throwable  {
      StatsConfig statsConfig0 = new StatsConfig();
      LockManager.LockManager_lockStat lockManager_LockManager_lockStat0 = new LockManager.LockManager_lockStat((LockManager) null, statsConfig0);
      // Undeclared exception!
      try { 
        lockManager_LockManager_lockStat0.hook769();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.txn.LockManager$LockManager_lockStat", e);
      }
  }

  @Test
  public void test1()  throws Throwable  {
      LatchedLockManager latchedLockManager0 = null;
      try {
        latchedLockManager0 = new LatchedLockManager((EnvironmentImpl) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.txn.LockManager", e);
      }
  }

  @Test
  public void test2()  throws Throwable  {
      Lock lock0 = new Lock();
      LockGrantType lockGrantType0 = LockGrantType.WAIT_PROMOTION;
      LockManager.LockAttemptResult lockManager_LockAttemptResult0 = new LockManager.LockAttemptResult(lock0, lockGrantType0, true);
  }

  @Test
  public void test3()  throws Throwable  {
      LockManager.setLockTableDump(false);
  }

  @Test
  public void test4()  throws Throwable  {
      StatsConfig statsConfig0 = new StatsConfig();
      LockManager.LockManager_lockStat lockManager_LockManager_lockStat0 = new LockManager.LockManager_lockStat((LockManager) null, statsConfig0);
      // Undeclared exception!
      try { 
        lockManager_LockManager_lockStat0.execute();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.txn.LockManager", e);
      }
  }
}