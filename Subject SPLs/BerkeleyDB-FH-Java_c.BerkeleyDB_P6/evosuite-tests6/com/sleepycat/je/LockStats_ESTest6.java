/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 21 23:29:28 KST 2017
 */

package com.sleepycat.je;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.sleepycat.je.latch.LatchStats;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class LockStats_ESTest6 extends LockStats_ESTest_scaffolding6 {

  @Test
  public void test00()  throws Throwable  {
      LockStats lockStats0 = new LockStats();
      lockStats0.setNWriteLocks(2562);
      int int0 = lockStats0.getNWriteLocks();
      assertEquals(2562, int0);
  }

  @Test
  public void test01()  throws Throwable  {
      LockStats lockStats0 = new LockStats();
      lockStats0.setNWriteLocks((-766));
      int int0 = lockStats0.getNWriteLocks();
      assertEquals((-766), int0);
  }

  @Test
  public void test02()  throws Throwable  {
      LockStats lockStats0 = new LockStats();
      lockStats0.setNWaits(139L);
      long long0 = lockStats0.getNWaits();
      assertEquals(139L, long0);
  }

  @Test
  public void test03()  throws Throwable  {
      LockStats lockStats0 = new LockStats();
      lockStats0.setNWaits((-1846L));
      long long0 = lockStats0.getNWaits();
      assertEquals((-1846L), long0);
  }

  @Test
  public void test04()  throws Throwable  {
      LockStats lockStats0 = new LockStats();
      lockStats0.setNWaiters(1987);
      int int0 = lockStats0.getNWaiters();
      assertEquals(1987, int0);
  }

  @Test
  public void test05()  throws Throwable  {
      LockStats lockStats0 = new LockStats();
      lockStats0.setNWaiters((-3465));
      int int0 = lockStats0.getNWaiters();
      assertEquals((-3465), int0);
  }

  @Test
  public void test06()  throws Throwable  {
      LockStats lockStats0 = new LockStats();
      lockStats0.accumulateNTotalLocks(2544);
      int int0 = lockStats0.getNTotalLocks();
      assertEquals(2544, int0);
  }

  @Test
  public void test07()  throws Throwable  {
      LockStats lockStats0 = new LockStats();
      lockStats0.accumulateNTotalLocks((-1));
      int int0 = lockStats0.getNTotalLocks();
      assertEquals((-1), int0);
  }

  @Test
  public void test08()  throws Throwable  {
      LockStats lockStats0 = new LockStats();
      lockStats0.setNRequests(2641L);
      long long0 = lockStats0.getNRequests();
      assertEquals(2641L, long0);
  }

  @Test
  public void test09()  throws Throwable  {
      LockStats lockStats0 = new LockStats();
      lockStats0.setNRequests((-1017L));
      long long0 = lockStats0.getNRequests();
      assertEquals((-1017L), long0);
  }

  @Test
  public void test10()  throws Throwable  {
      LockStats lockStats0 = new LockStats();
      lockStats0.setNReadLocks(722);
      int int0 = lockStats0.getNReadLocks();
      assertEquals(722, int0);
  }

  @Test
  public void test11()  throws Throwable  {
      LockStats lockStats0 = new LockStats();
      lockStats0.setNReadLocks((-1356));
      int int0 = lockStats0.getNReadLocks();
      assertEquals((-1356), int0);
  }

  @Test
  public void test12()  throws Throwable  {
      LockStats lockStats0 = new LockStats();
      lockStats0.setNOwners(2544);
      int int0 = lockStats0.getNOwners();
      assertEquals(2544, int0);
  }

  @Test
  public void test13()  throws Throwable  {
      LockStats lockStats0 = new LockStats();
      lockStats0.setNOwners((-971));
      int int0 = lockStats0.getNOwners();
      assertEquals((-971), int0);
  }

  @Test
  public void test14()  throws Throwable  {
      LockStats lockStats0 = new LockStats();
      LatchStats latchStats0 = new LatchStats();
      latchStats0.nAcquireSharedSuccessful = 1175;
      lockStats0.accumulateLockTableLatchStats(latchStats0);
      lockStats0.accumulateLockTableLatchStats(latchStats0);
      assertEquals(2350, latchStats0.nAcquireSharedSuccessful);
      assertEquals(0, latchStats0.nAcquiresNoWaiters);
  }

  @Test
  public void test15()  throws Throwable  {
      LockStats lockStats0 = new LockStats();
      LatchStats latchStats0 = new LatchStats();
      lockStats0.accumulateLockTableLatchStats(latchStats0);
      latchStats0.nAcquireNoWaitUnsuccessful = (-1845);
      lockStats0.accumulateLockTableLatchStats(latchStats0);
      assertEquals((-3690), latchStats0.nAcquireNoWaitUnsuccessful);
      assertEquals(0, latchStats0.nAcquireSharedSuccessful);
  }

  @Test
  public void test16()  throws Throwable  {
      LockStats lockStats0 = new LockStats();
      LatchStats latchStats0 = new LatchStats();
      lockStats0.accumulateLockTableLatchStats(latchStats0);
      LatchStats latchStats1 = new LatchStats();
      latchStats1.nAcquireNoWaitSuccessful = 1241;
      lockStats0.accumulateLockTableLatchStats(latchStats1);
      assertEquals(0L, lockStats0.getNWaits());
  }

  @Test
  public void test17()  throws Throwable  {
      LockStats lockStats0 = new LockStats();
      LatchStats latchStats0 = new LatchStats();
      latchStats0.nAcquiresWithContention = (-444);
      lockStats0.accumulateLockTableLatchStats(latchStats0);
      lockStats0.accumulateLockTableLatchStats(latchStats0);
      assertEquals((-888), latchStats0.nAcquiresWithContention);
      assertEquals(0, latchStats0.nAcquiresSelfOwned);
  }

  @Test
  public void test18()  throws Throwable  {
      LockStats lockStats0 = new LockStats();
      LatchStats latchStats0 = new LatchStats();
      lockStats0.accumulateLockTableLatchStats(latchStats0);
      latchStats0.nAcquiresUpgrade = 10;
      lockStats0.accumulateLockTableLatchStats(latchStats0);
      assertEquals(20, latchStats0.nAcquiresUpgrade);
      assertEquals(0, latchStats0.nAcquireSharedSuccessful);
  }

  @Test
  public void test19()  throws Throwable  {
      LockStats lockStats0 = new LockStats();
      LatchStats latchStats0 = new LatchStats();
      lockStats0.accumulateLockTableLatchStats(latchStats0);
      LatchStats latchStats1 = new LatchStats();
      latchStats1.nAcquiresSelfOwned = 543;
      lockStats0.accumulateLockTableLatchStats(latchStats1);
      assertEquals(0, lockStats0.getNReadLocks());
  }

  @Test
  public void test20()  throws Throwable  {
      LockStats lockStats0 = new LockStats();
      LatchStats latchStats0 = new LatchStats();
      latchStats0.nAcquiresNoWaiters = (-1585);
      lockStats0.accumulateLockTableLatchStats(latchStats0);
      lockStats0.accumulateLockTableLatchStats(latchStats0);
      assertEquals((-3170), latchStats0.nAcquiresNoWaiters);
      assertEquals(0, latchStats0.nAcquireSharedSuccessful);
  }

  @Test
  public void test21()  throws Throwable  {
      LockStats lockStats0 = new LockStats();
      LatchStats latchStats0 = new LatchStats();
      lockStats0.accumulateLockTableLatchStats(latchStats0);
      // Undeclared exception!
      try { 
        lockStats0.accumulateLockTableLatchStats((LatchStats) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.LockStats", e);
      }
  }

  @Test
  public void test22()  throws Throwable  {
      LockStats lockStats0 = new LockStats();
      int int0 = lockStats0.getNWaiters();
      assertEquals(0, int0);
  }

  @Test
  public void test23()  throws Throwable  {
      LockStats lockStats0 = new LockStats();
      long long0 = lockStats0.getNWaits();
      assertEquals(0L, long0);
  }

  @Test
  public void test24()  throws Throwable  {
      LockStats lockStats0 = new LockStats();
      String string0 = lockStats0.toString();
      assertEquals("nTotalLocks=0\nnReadLocks=0\nnWriteLocks=0\nnWaiters=0\nnOwners=0\nnRequests=0\nnWaits=0\nlockTableLatch:\nnull", string0);
  }

  @Test
  public void test25()  throws Throwable  {
      LockStats lockStats0 = new LockStats();
      int int0 = lockStats0.getNReadLocks();
      assertEquals(0, int0);
  }

  @Test
  public void test26()  throws Throwable  {
      LockStats lockStats0 = new LockStats();
      // Undeclared exception!
      try { 
        lockStats0.hook64((StringBuffer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.LockStats", e);
      }
  }

  @Test
  public void test27()  throws Throwable  {
      LockStats lockStats0 = new LockStats();
      int int0 = lockStats0.getNOwners();
      assertEquals(0, int0);
  }

  @Test
  public void test28()  throws Throwable  {
      LockStats lockStats0 = new LockStats();
      int int0 = lockStats0.getNWriteLocks();
      assertEquals(0, int0);
  }

  @Test
  public void test29()  throws Throwable  {
      LockStats lockStats0 = new LockStats();
      long long0 = lockStats0.getNRequests();
      assertEquals(0L, long0);
  }

  @Test
  public void test30()  throws Throwable  {
      LockStats lockStats0 = new LockStats();
      int int0 = lockStats0.getNTotalLocks();
      assertEquals(0, int0);
  }
}
