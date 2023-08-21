/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 11:59:38 KST 2017
 */

package com.sleepycat.je.txn;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.List;
import java.util.Set;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.sleepycat.je.dbi.MemoryBudget;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class Lock_ESTest5 extends Lock_ESTest_scaffolding5 {

  @Test
  public void test00()  throws Throwable  {
      Long long0 = new Long((-3037L));
      Lock lock0 = new Lock(long0);
      Long long1 = lock0.getNodeId();
      assertEquals((-3037L), (long)long1);
  }

  @Test
  public void test04()  throws Throwable  {
      Lock lock0 = new Lock();
      MemoryBudget memoryBudget0 = null;
      int int0 = 0;
      boolean boolean0 = false;
      lock0.hook765(memoryBudget0, int0, boolean0);
  }


  @Test
  public void test13()  throws Throwable  {
      Lock lock0 = new Lock((Long) null);
      String string0 = lock0.toString();
      assertEquals(" NodeId:null Owners: (none) Waiters: (none)", string0);
  }

  @Test
  public void test14()  throws Throwable  {
      Lock lock0 = new Lock();
      Locker locker0 = lock0.getWriteOwnerLocker();
      assertNull(locker0);
  }



  @Test
  public void test17()  throws Throwable  {
      Long long0 = new Long(1095L);
      Lock lock0 = new Lock(long0);
      LockType lockType0 = LockType.READ;
      boolean boolean0 = lock0.isOwner((Locker) null, lockType0);
      assertFalse(boolean0);
  }



  @Test
  public void test20()  throws Throwable  {
      Lock lock0 = new Lock();
      lock0.flushWaiter((Locker) null, (MemoryBudget) null, 4);
  }


  @Test
  public void test26()  throws Throwable  {
      Lock lock0 = new Lock((Long) null);
      Set set0 = lock0.release((Locker) null, (MemoryBudget) null, 0);
      assertNull(set0);
  }

}
