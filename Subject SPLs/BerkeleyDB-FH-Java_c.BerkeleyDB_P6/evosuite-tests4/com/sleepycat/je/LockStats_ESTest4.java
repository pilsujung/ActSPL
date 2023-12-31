/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 13:47:20 KST 2017
 */

package com.sleepycat.je;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.sleepycat.je.LockStats;
import com.sleepycat.je.latch.LatchStats;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class LockStats_ESTest4 extends LockStats_ESTest_scaffolding4 {

  @Test
  public void test00()  throws Throwable  {
      LockStats lockStats0 = new LockStats();
      lockStats0.setNWriteLocks(611);
      int int0 = lockStats0.getNWriteLocks();
      assertEquals(611, int0);
  }

  @Test
  public void test01()  throws Throwable  {
      LockStats lockStats0 = new LockStats();
      lockStats0.setNWriteLocks((-4578));
      int int0 = lockStats0.getNWriteLocks();
      assertEquals((-4578), int0);
  }

  @Test
  public void test02()  throws Throwable  {
      LockStats lockStats0 = new LockStats();
      lockStats0.setNWaits(4462L);
      long long0 = lockStats0.getNWaits();
      assertEquals(4462L, long0);
  }

  @Test
  public void test03()  throws Throwable  {
      LockStats lockStats0 = new LockStats();
      lockStats0.setNWaits((-1302L));
      long long0 = lockStats0.getNWaits();
      assertEquals((-1302L), long0);
  }

  @Test
  public void test04()  throws Throwable  {
      LockStats lockStats0 = new LockStats();
      lockStats0.setNWaiters(561);
      int int0 = lockStats0.getNWaiters();
      assertEquals(561, int0);
  }

  @Test
  public void test05()  throws Throwable  {
      LockStats lockStats0 = new LockStats();
      lockStats0.setNWaiters((-4526));
      int int0 = lockStats0.getNWaiters();
      assertEquals((-4526), int0);
  }

  @Test
  public void test06()  throws Throwable  {
      LockStats lockStats0 = new LockStats();
      lockStats0.accumulateNTotalLocks(1189);
      int int0 = lockStats0.getNTotalLocks();
      assertEquals(1189, int0);
  }

  @Test
  public void test07()  throws Throwable  {
      LockStats lockStats0 = new LockStats();
      lockStats0.accumulateNTotalLocks((-1513));
      int int0 = lockStats0.getNTotalLocks();
      assertEquals((-1513), int0);
  }

  @Test
  public void test08()  throws Throwable  {
      LockStats lockStats0 = new LockStats();
      lockStats0.setNRequests(1746L);
      long long0 = lockStats0.getNRequests();
      assertEquals(1746L, long0);
  }

  @Test
  public void test09()  throws Throwable  {
      LockStats lockStats0 = new LockStats();
      lockStats0.setNRequests((-5349));
      long long0 = lockStats0.getNRequests();
      assertEquals((-5349L), long0);
  }

  @Test
  public void test10()  throws Throwable  {
      LockStats lockStats0 = new LockStats();
      lockStats0.setNReadLocks((-540));
      int int0 = lockStats0.getNReadLocks();
      assertEquals((-540), int0);
  }

  @Test
  public void test11()  throws Throwable  {
      LockStats lockStats0 = new LockStats();
      lockStats0.setNOwners(2696);
      int int0 = lockStats0.getNOwners();
      assertEquals(2696, int0);
  }

  @Test
  public void test12()  throws Throwable  {
      LockStats lockStats0 = new LockStats();
      lockStats0.setNOwners((-1));
      int int0 = lockStats0.getNOwners();
      assertEquals((-1), int0);
  }

  @Test
  public void test13()  throws Throwable  {
      LockStats lockStats0 = new LockStats();
      LatchStats latchStats0 = new LatchStats();
      lockStats0.accumulateLockTableLatchStats(latchStats0);
      latchStats0.nAcquireSharedSuccessful = 10;
      lockStats0.accumulateLockTableLatchStats(latchStats0);
      assertEquals(20, latchStats0.nAcquireSharedSuccessful);
      assertEquals(0, latchStats0.nAcquiresSelfOwned);
  }

  @Test
  public void test14()  throws Throwable  {
      LockStats lockStats0 = new LockStats();
      LatchStats latchStats0 = new LatchStats();
      lockStats0.accumulateLockTableLatchStats(latchStats0);
      latchStats0.nAcquireNoWaitSuccessful = (-209);
      lockStats0.accumulateLockTableLatchStats(latchStats0);
      assertEquals((-418), latchStats0.nAcquireNoWaitSuccessful);
      assertEquals(0, latchStats0.nAcquiresUpgrade);
  }

  @Test
  public void test15()  throws Throwable  {
      LockStats lockStats0 = new LockStats();
      LatchStats latchStats0 = new LatchStats();
      latchStats0.nAcquiresWithContention = (-3106);
      lockStats0.accumulateLockTableLatchStats(latchStats0);
      lockStats0.accumulateLockTableLatchStats(latchStats0);
      assertEquals((-6212), latchStats0.nAcquiresWithContention);
  }

  @Test
  public void test16()  throws Throwable  {
      LockStats lockStats0 = new LockStats();
      LatchStats latchStats0 = new LatchStats();
      latchStats0.nAcquiresUpgrade = 10;
      lockStats0.accumulateLockTableLatchStats(latchStats0);
      lockStats0.accumulateLockTableLatchStats(latchStats0);
      assertEquals(20, latchStats0.nAcquiresUpgrade);
  }

  @Test
  public void test17()  throws Throwable  {
      LockStats lockStats0 = new LockStats();
      LatchStats latchStats0 = new LatchStats();
      lockStats0.accumulateLockTableLatchStats(latchStats0);
      latchStats0.nAcquiresSelfOwned = 3427;
      lockStats0.accumulateLockTableLatchStats(latchStats0);
      assertEquals(6854, latchStats0.nAcquiresSelfOwned);
      assertEquals(0, latchStats0.nAcquiresNoWaiters);
  }

  @Test
  public void test18()  throws Throwable  {
      LockStats lockStats0 = new LockStats();
      LatchStats latchStats0 = new LatchStats();
      latchStats0.nAcquiresNoWaiters = (-1);
      lockStats0.accumulateLockTableLatchStats(latchStats0);
      lockStats0.accumulateLockTableLatchStats(latchStats0);
      assertEquals((-2), latchStats0.nAcquiresNoWaiters);
      assertEquals(0, latchStats0.nAcquireNoWaitUnsuccessful);
  }

  @Test
  public void test19()  throws Throwable  {
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
  public void test20()  throws Throwable  {
      LockStats lockStats0 = new LockStats();
      int int0 = lockStats0.getNWaiters();
      assertEquals(0, int0);
  }

  @Test
  public void test21()  throws Throwable  {
      LockStats lockStats0 = new LockStats();
      long long0 = lockStats0.getNWaits();
      assertEquals(0L, long0);
  }

  @Test
  public void test22()  throws Throwable  {
      LockStats lockStats0 = new LockStats();
      String string0 = lockStats0.toString();
      assertEquals("nTotalLocks=0\nnReadLocks=0\nnWriteLocks=0\nnWaiters=0\nnOwners=0\nnRequests=0\nnWaits=0\nlockTableLatch:\nnull", string0);
  }

  @Test
  public void test23()  throws Throwable  {
      LockStats lockStats0 = new LockStats();
      int int0 = lockStats0.getNReadLocks();
      assertEquals(0, int0);
  }

  @Test
  public void test24()  throws Throwable  {
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
  public void test25()  throws Throwable  {
      LockStats lockStats0 = new LockStats();
      int int0 = lockStats0.getNOwners();
      assertEquals(0, int0);
  }

  @Test
  public void test26()  throws Throwable  {
      LockStats lockStats0 = new LockStats();
      int int0 = lockStats0.getNWriteLocks();
      assertEquals(0, int0);
  }

  @Test
  public void test27()  throws Throwable  {
      LockStats lockStats0 = new LockStats();
      lockStats0.setNReadLocks(3500);
      int int0 = lockStats0.getNReadLocks();
      assertEquals(3500, int0);
  }

  @Test
  public void test28()  throws Throwable  {
      LockStats lockStats0 = new LockStats();
      long long0 = lockStats0.getNRequests();
      assertEquals(0L, long0);
  }

  @Test
  public void test29()  throws Throwable  {
      LockStats lockStats0 = new LockStats();
      int int0 = lockStats0.getNTotalLocks();
      assertEquals(0, int0);
  }
}
