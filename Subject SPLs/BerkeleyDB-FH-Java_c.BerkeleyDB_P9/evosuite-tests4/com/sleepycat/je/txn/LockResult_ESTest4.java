/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 16:30:48 KST 2017
 */

package com.sleepycat.je.txn;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.sleepycat.je.tree.DupCountLN;
import com.sleepycat.je.tree.LN;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class LockResult_ESTest4 extends LockResult_ESTest_scaffolding4 {


  @Test
  public void test1()  throws Throwable  {
      WriteLockInfo writeLockInfo0 = new WriteLockInfo();
      LockResult lockResult0 = new LockResult((LockGrantType) null, writeLockInfo0);
      DupCountLN dupCountLN0 = new DupCountLN(212);
      lockResult0.setLN(dupCountLN0);
      DupCountLN dupCountLN1 = (DupCountLN)lockResult0.getLN();
      assertSame(dupCountLN1, dupCountLN0);
  }

  @Test
  public void test3()  throws Throwable  {
      LockGrantType lockGrantType0 = LockGrantType.EXISTING;
      WriteLockInfo writeLockInfo0 = WriteLockInfo.basicWriteLockInfo;
      LockResult lockResult0 = new LockResult(lockGrantType0, writeLockInfo0);
      lockResult0.setAbortLsn(987L, true, false);
  }

  @Test
  public void test4()  throws Throwable  {
      LockGrantType lockGrantType0 = LockGrantType.EXISTING;
      WriteLockInfo writeLockInfo0 = new WriteLockInfo();
      LockResult lockResult0 = new LockResult(lockGrantType0, writeLockInfo0);
      lockResult0.setAbortLsn((-1L), false, false);
      assertTrue(writeLockInfo0.getAbortKnownDeleted());
  }

  @Test
  public void test5()  throws Throwable  {
      WriteLockInfo writeLockInfo0 = new WriteLockInfo();
      LockResult lockResult0 = new LockResult((LockGrantType) null, writeLockInfo0);
      lockResult0.setAbortLsn((-744L), true);
      assertEquals((-744L), writeLockInfo0.getAbortLsn());
      assertTrue(writeLockInfo0.getAbortKnownDeleted());
  }

  @Test
  public void test6()  throws Throwable  {
      LockResult lockResult0 = new LockResult((LockGrantType) null, (WriteLockInfo) null);
      lockResult0.setAbortLsn((-5453L), false);
  }

  @Test
  public void test7()  throws Throwable  {
      LockGrantType lockGrantType0 = LockGrantType.NEW;
      WriteLockInfo writeLockInfo0 = WriteLockInfo.basicWriteLockInfo;
      LockResult lockResult0 = new LockResult(lockGrantType0, writeLockInfo0);
      LockGrantType lockGrantType1 = lockResult0.getLockGrant();
      assertEquals("NEW", lockGrantType1.toString());
  }

  @Test
  public void test8()  throws Throwable  {
      LockGrantType lockGrantType0 = LockGrantType.NEW;
      WriteLockInfo writeLockInfo0 = WriteLockInfo.basicWriteLockInfo;
      LockResult lockResult0 = new LockResult(lockGrantType0, writeLockInfo0);
      LN lN0 = new LN();
      lockResult0.setLN(lN0);
      LN lN1 = lockResult0.getLN();
      assertEquals(0L, lN1.getNodeId());
  }

  @Test
  public void test9()  throws Throwable  {
      LockGrantType lockGrantType0 = LockGrantType.NEW;
      WriteLockInfo writeLockInfo0 = WriteLockInfo.basicWriteLockInfo;
      LockResult lockResult0 = new LockResult(lockGrantType0, writeLockInfo0);
      LN lN0 = lockResult0.getLN();
      assertNull(lN0);
  }
}