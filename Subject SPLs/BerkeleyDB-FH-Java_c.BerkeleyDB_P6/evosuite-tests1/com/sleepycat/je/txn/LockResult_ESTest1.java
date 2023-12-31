/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 21 21:07:16 KST 2017
 */

package com.sleepycat.je.txn;

import org.junit.Test;
import static org.junit.Assert.*;
import com.sleepycat.je.DatabaseEntry;
import com.sleepycat.je.tree.LN;
import com.sleepycat.je.tree.MapLN;
import com.sleepycat.je.txn.LockGrantType;
import com.sleepycat.je.txn.LockResult;
import com.sleepycat.je.txn.WriteLockInfo;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class LockResult_ESTest1 extends LockResult_ESTest_scaffolding1 {

  @Test
  public void test0()  throws Throwable  {
      LockResult lockResult0 = new LockResult((LockGrantType) null, (WriteLockInfo) null);
      LockGrantType lockGrantType0 = lockResult0.getLockGrant();
      assertNull(lockGrantType0);
  }

  @Test
  public void test1()  throws Throwable  {
      LockGrantType lockGrantType0 = LockGrantType.WAIT_PROMOTION;
      WriteLockInfo writeLockInfo0 = new WriteLockInfo();
      LockResult lockResult0 = new LockResult(lockGrantType0, writeLockInfo0);
      MapLN mapLN0 = new MapLN();
      lockResult0.setLN(mapLN0);
      MapLN mapLN1 = (MapLN)lockResult0.getLN();
      assertFalse(mapLN1.isDeleted());
  }

  @Test
  public void test2()  throws Throwable  {
      LockGrantType lockGrantType0 = LockGrantType.PROMOTION;
      WriteLockInfo writeLockInfo0 = WriteLockInfo.basicWriteLockInfo;
      LockResult lockResult0 = new LockResult(lockGrantType0, writeLockInfo0);
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      LN lN0 = new LN(databaseEntry0);
      lockResult0.setLN(lN0);
      LN lN1 = lockResult0.getLN();
      assertFalse(lN1.logEntryIsTransactional());
  }

  @Test
  public void test3()  throws Throwable  {
      LockGrantType lockGrantType0 = LockGrantType.NEW;
      WriteLockInfo writeLockInfo0 = new WriteLockInfo();
      LockResult lockResult0 = new LockResult(lockGrantType0, writeLockInfo0);
      lockResult0.setAbortLsn((-14L), true);
      assertEquals((-14L), writeLockInfo0.getAbortLsn());
  }

  @Test
  public void test4()  throws Throwable  {
      LockGrantType lockGrantType0 = LockGrantType.NEW;
      WriteLockInfo writeLockInfo0 = new WriteLockInfo();
      LockResult lockResult0 = new LockResult(lockGrantType0, writeLockInfo0);
      lockResult0.setAbortLsn((-1L), false, false);
      assertTrue(writeLockInfo0.getAbortKnownDeleted());
  }

  @Test
  public void test5()  throws Throwable  {
      LockGrantType lockGrantType0 = LockGrantType.WAIT_PROMOTION;
      WriteLockInfo writeLockInfo0 = new WriteLockInfo();
      LockResult lockResult0 = new LockResult(lockGrantType0, writeLockInfo0);
      lockResult0.setAbortLsn(14L, true, true);
      assertEquals(14L, writeLockInfo0.getAbortLsn());
      assertTrue(writeLockInfo0.getAbortKnownDeleted());
  }

  @Test
  public void test6()  throws Throwable  {
      LockGrantType lockGrantType0 = LockGrantType.PROMOTION;
      LockResult lockResult0 = new LockResult(lockGrantType0, (WriteLockInfo) null);
      lockResult0.setAbortLsn(397L, true);
  }

  @Test
  public void test7()  throws Throwable  {
      LockGrantType lockGrantType0 = LockGrantType.PROMOTION;
      WriteLockInfo writeLockInfo0 = WriteLockInfo.basicWriteLockInfo;
      LockResult lockResult0 = new LockResult(lockGrantType0, writeLockInfo0);
      lockResult0.setAbortLsn(0L, false, true);
  }

  @Test
  public void test8()  throws Throwable  {
      LockGrantType lockGrantType0 = LockGrantType.PROMOTION;
      WriteLockInfo writeLockInfo0 = WriteLockInfo.basicWriteLockInfo;
      LockResult lockResult0 = new LockResult(lockGrantType0, writeLockInfo0);
      LockGrantType lockGrantType1 = lockResult0.getLockGrant();
      assertSame(lockGrantType0, lockGrantType1);
  }

  @Test
  public void test9()  throws Throwable  {
      LockGrantType lockGrantType0 = LockGrantType.PROMOTION;
      WriteLockInfo writeLockInfo0 = WriteLockInfo.basicWriteLockInfo;
      LockResult lockResult0 = new LockResult(lockGrantType0, writeLockInfo0);
      LN lN0 = lockResult0.getLN();
      lockResult0.setLN(lN0);
  }
}
