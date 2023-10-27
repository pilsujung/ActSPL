/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 21 21:45:56 KST 2017
 */

package com.sleepycat.je.txn;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.File;
import java.util.List;
import java.util.Set;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.sleepycat.je.EnvironmentConfig;
import com.sleepycat.je.dbi.EnvironmentImpl;
import com.sleepycat.je.dbi.MemoryBudget;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class Lock_ESTest7 extends Lock_ESTest_scaffolding7 {

  @Test
  public void test01()  throws Throwable  {
      Long long0 = new Long((-85L));
      Lock lock0 = new Lock(long0);
      Long long1 = lock0.getNodeId();
      assertSame(long0, long1);
  }

  @Test
  public void test02()  throws Throwable  {
      Long long0 = new Long((-1441L));
      Lock lock0 = new Lock(long0);
      int int0 = lock0.nOwners();
      assertEquals(0, int0);
  }

  @Test
  public void test03()  throws Throwable  {
      Lock lock0 = new Lock();
      lock0.nWaiters();
      Txn txn0 = new Txn();
      EnvironmentConfig environmentConfig0 = new EnvironmentConfig();
      EnvironmentImpl environmentImpl0 = null;
      try {
        environmentImpl0 = new EnvironmentImpl((File) null, environmentConfig0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.FileManager", e);
      }
  }

  @Test
  public void test09()  throws Throwable  {
      Lock lock0 = new Lock();
      String string0 = lock0.toString();
      assertEquals(" NodeId:null Owners: (none) Waiters: (none)", string0);
  }

  @Test
  public void test11()  throws Throwable  {
      Lock lock0 = new Lock();
      Locker locker0 = lock0.getWriteOwnerLocker();
      assertNull(locker0);
  }

  @Test
  public void test16()  throws Throwable  {
      Long long0 = new Long((-85L));
      Lock lock0 = new Lock(long0);
      lock0.demote((Locker) null);
  }

  @Test
  public void test19()  throws Throwable  {
      Lock lock0 = new Lock();
      Txn txn0 = new Txn();
      boolean boolean0 = lock0.isWaiter(txn0);
      assertFalse(boolean0);
  }

  @Test
  public void test22()  throws Throwable  {
      Lock lock0 = new Lock();
      Txn txn0 = new Txn();
      boolean boolean0 = lock0.isOwner(txn0, (LockType) null);
      assertFalse(boolean0);
  }

  @Test
  public void test24()  throws Throwable  {
      Lock lock0 = new Lock();
      boolean boolean0 = lock0.isOwnedWriteLock((Locker) null);
      assertFalse(boolean0);
  }

  @Test
  public void test26()  throws Throwable  {
      Long long0 = new Long((-1441L));
      Lock lock0 = new Lock(long0);
      Txn txn0 = new Txn();
      Set set0 = lock0.release(txn0, (MemoryBudget) null, 1);
      assertNull(set0);
  }

  @Test
  public void test29()  throws Throwable  {
      Lock lock0 = new Lock();
      Set set0 = lock0.getOwnersClone();
      assertEquals(0, set0.size());
  }

  @Test
  public void test30()  throws Throwable  {
      Lock lock0 = new Lock();
      lock0.flushWaiter((Locker) null, (MemoryBudget) null, 0);
  }

  @Test
  public void test31()  throws Throwable  {
      Lock lock0 = new Lock();
      List list0 = lock0.getWaitersListClone();
      assertEquals(0, list0.size());
  }

  @Test
  public void test40()  throws Throwable  {
      Lock lock0 = new Lock();
      lock0.hook765((MemoryBudget) null, (-968), false);
  }

  @Test
  public void test41()  throws Throwable  {
      Lock lock0 = new Lock();
      Long long0 = lock0.getNodeId();
      assertNull(long0);
  }
}