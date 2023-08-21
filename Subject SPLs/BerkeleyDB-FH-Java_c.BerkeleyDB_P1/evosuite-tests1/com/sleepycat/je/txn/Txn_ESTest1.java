/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 21 21:12:53 KST 2017
 */

package com.sleepycat.je.txn;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.StringWriter;
import java.lang.reflect.Method;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

import javax.transaction.xa.Xid;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.sleepycat.je.DatabaseException;
import com.sleepycat.je.TransactionConfig;
import com.sleepycat.je.dbi.CursorImpl;
import com.sleepycat.je.dbi.DatabaseId;
import com.sleepycat.je.dbi.DatabaseImpl;
import com.sleepycat.je.dbi.EnvironmentImpl;
import com.sleepycat.je.dbi.MemoryBudget;
import com.sleepycat.je.log.LogEntryType;
import com.sleepycat.je.log.LogUtils;
import com.sleepycat.je.log.entry.LNLogEntry;
import com.sleepycat.je.tree.DupCountLN;
import com.sleepycat.je.tree.LN;
import com.sleepycat.je.tree.MapLN;
import com.sleepycat.je.tree.TreeLocation;

import sun.nio.cs.ext.MS949;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class Txn_ESTest1 extends Txn_ESTest_scaffolding1 {

  @Test
  public void test00()  throws Throwable  {
      Txn txn0 = new Txn();
      int int0 = txn0.hook811(48);
      assertEquals(48, int0);
  }

  @Test
  public void test01()  throws Throwable  {
      Txn txn0 = new Txn();
      int int0 = txn0.hook811((-21));
      assertEquals((-21), int0);
  }

  @Test
  public void test02()  throws Throwable  {
      Txn txn0 = new Txn();
      txn0.setSuspended(true);
      txn0.getTxnLocker();
      assertTrue(txn0.isSuspended());
  }

  @Test
  public void test03()  throws Throwable  {
      Txn txn0 = new Txn();
      txn0.getTxnLocker();
      txn0.setOnlyAbortable();
      assertTrue(txn0.getOnlyAbortable());
  }

  @Test
  public void test04()  throws Throwable  {
      Txn txn0 = new Txn();
      Txn txn1 = txn0.getTxnLocker();
      txn1.addLogInfo(0L);
      assertEquals(0L, txn1.getId());
  }

  @Test
  public void test05()  throws Throwable  {
      Txn txn0 = new Txn();
      txn0.setSuspended(true);
      byte[] byteArray0 = new byte[7];
      LogUtils.XidImpl logUtils_XidImpl0 = new LogUtils.XidImpl((-2142), byteArray0, byteArray0);
      // Undeclared exception!
      try { 
        txn0.abort((Xid) logUtils_XidImpl0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.txn.Txn", e);
      }
  }

  @Test
  public void test06()  throws Throwable  {
      Txn txn0 = new Txn();
      txn0.setOnlyAbortable();
      txn0.setLockTimeout((-843L));
      try { 
        txn0.lockInternal((-843L), (LockType) null, false, (DatabaseImpl) null);
        fail("Expecting exception: DatabaseException");
      
      } catch(DatabaseException e) {
         //
         // Transaction 0 must be aborted.
         //
         assertThrownBy("com.sleepycat.je.txn.Txn", e);
      }
  }

  @Test
  public void test07()  throws Throwable  {
      Txn txn0 = new Txn();
      txn0.setSuspended(true);
      boolean boolean0 = txn0.getOnlyAbortable();
      assertTrue(txn0.isSuspended());
      assertFalse(boolean0);
  }

  @Test
  public void test08()  throws Throwable  {
      Txn txn0 = new Txn();
      txn0.setSuspended(true);
      txn0.setOnlyAbortable();
      assertTrue(txn0.isSuspended());
  }

  @Test
  public void test09()  throws Throwable  {
      Txn txn0 = new Txn();
      txn0.defaultNoWait = true;
      boolean boolean0 = txn0.isReadCommittedIsolation();
      assertFalse(boolean0);
  }

  @Test
  public void test10()  throws Throwable  {
      Txn txn0 = new Txn();
      txn0.lockTimeOutMillis = (long) (-2142);
      try { 
        txn0.commit();
        fail("Expecting exception: DatabaseException");
      
      } catch(DatabaseException e) {
         //
         // Failed while attempting to commit transaction 0. The attempt to abort and clean up also failed. The original exception seen from commit = null The exception from the cleanup = null
         //
         assertThrownBy("com.sleepycat.je.txn.Txn", e);
      }
  }

  @Test
  public void test11()  throws Throwable  {
      Txn txn0 = new Txn();
      txn0.id = 1L;
      // Undeclared exception!
      try { 
        txn0.lock((-843L), (LockType) null, false, (DatabaseImpl) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.txn.Txn", e);
      }
  }

  @Test
  public void test12()  throws Throwable  {
      Txn txn0 = new Txn();
      txn0.setOnlyAbortable();
      boolean boolean0 = txn0.isSuspended();
      assertTrue(txn0.getOnlyAbortable());
      assertFalse(boolean0);
  }

  @Test
  public void test13()  throws Throwable  {
      Txn txn0 = new Txn();
      txn0.setOnlyAbortable();
      txn0.setSuspended(true);
      assertTrue(txn0.isSuspended());
  }

  @Test
  public void test14()  throws Throwable  {
      Txn txn0 = new Txn();
      txn0.hook810(352);
      assertFalse(txn0.isHandleLockTransferrable());
  }

  @Test
  public void test15()  throws Throwable  {
      Txn txn0 = new Txn();
      txn0.checkState(false);
      assertFalse(txn0.getDefaultNoWait());
  }

  @Test
  public void test16()  throws Throwable  {
      Txn txn0 = new Txn();
      TreeLocation treeLocation0 = new TreeLocation();
      LogEntryType logEntryType0 = LogEntryType.LOG_DEL_DUPLN_TRANSACTIONAL;
      DatabaseImpl databaseImpl0 = new DatabaseImpl();
      MapLN mapLN0 = new MapLN(databaseImpl0);
      DatabaseId databaseId0 = new DatabaseId(8);
      LNLogEntry lNLogEntry0 = new LNLogEntry(logEntryType0, (LN) mapLN0, databaseId0, treeLocation0.lnKey, (long) 8, true, txn0);
      txn0.hook802((-2142), treeLocation0, lNLogEntry0, mapLN0, databaseImpl0, (-1L), true);
      //  // Unstable assertion: assertEquals(113L, lNLogEntry0.getNodeId());
      //  // Unstable assertion: assertEquals(112L, databaseImpl0.getEofNodeId());
  }

  @Test
  public void test17()  throws Throwable  {
      Txn txn0 = new Txn();
      // Undeclared exception!
      try { 
        txn0.unRegisterCursor((CursorImpl) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.txn.Txn", e);
      }
  }

  @Test
  public void test18()  throws Throwable  {
      Txn txn0 = new Txn();
      // Undeclared exception!
      try { 
        txn0.registerCursor((CursorImpl) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.txn.Txn", e);
      }
  }

  @Test
  public void test19()  throws Throwable  {
      Txn txn0 = new Txn();
      // Undeclared exception!
      try { 
        txn0.readFromLog((ByteBuffer) null, (byte)23);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.LogUtils", e);
      }
  }

  @Test
  public void test20()  throws Throwable  {
      Txn txn0 = new Txn();
      try { 
        txn0.commit((byte)2);
        fail("Expecting exception: DatabaseException");
      
      } catch(DatabaseException e) {
         //
         // Failed while attempting to commit transaction 0. The attempt to abort and clean up also failed. The original exception seen from commit = null The exception from the cleanup = null
         //
         assertThrownBy("com.sleepycat.je.txn.Txn", e);
      }
  }

  @Test
  public void test21()  throws Throwable  {
      Txn txn0 = new Txn();
      try { 
        txn0.commit((byte)3);
        fail("Expecting exception: DatabaseException");
      
      } catch(DatabaseException e) {
         //
         // Failed while attempting to commit transaction 0. The attempt to abort and clean up also failed. The original exception seen from commit = null The exception from the cleanup = null
         //
         assertThrownBy("com.sleepycat.je.txn.Txn", e);
      }
  }

  @Test
  public void test22()  throws Throwable  {
      Txn txn0 = new Txn();
      Long long0 = new Long(0L);
      Lock lock0 = new Lock(long0);
      LockType lockType0 = LockType.RANGE_WRITE;
      LockGrantType lockGrantType0 = LockGrantType.PROMOTION;
      // Undeclared exception!
      try { 
        txn0.addLock(long0, lock0, lockType0, lockGrantType0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.txn.Txn$Txn_addLock", e);
      }
  }

  @Test
  public void test23()  throws Throwable  {
      Txn txn0 = new Txn();
      WriteLockInfo writeLockInfo0 = txn0.getWriteLockInfo((-4L));
      assertTrue(writeLockInfo0.getAbortKnownDeleted());
  }

  @Test
  public void test24()  throws Throwable  {
      Txn txn0 = new Txn();
      long long0 = txn0.getAbortLsn(16);
      assertEquals((-1L), long0);
  }

  @Test
  public void test25()  throws Throwable  {
      Txn txn0 = new Txn();
      boolean boolean0 = txn0.createdNode((-4L));
      assertFalse(boolean0);
  }

  @Test
  public void test27()  throws Throwable  {
      Txn txn0 = new Txn();
      Long long0 = Long.valueOf((long) (-2142));
      Lock lock0 = new Lock(long0);
      txn0.removeLock(98304L, lock0);
      assertEquals(10000, Txn.ACCUMULATED_LIMIT);
  }

  @Test
  public void test28()  throws Throwable  {
      Txn txn0 = new Txn();
      txn0.addLogInfo(326L);
      txn0.addLogInfo(0L);
      assertFalse(txn0.isSerializableIsolation());
  }

  @Test
  public void test29()  throws Throwable  {
      Txn txn0 = new Txn();
      byte[] byteArray0 = new byte[3];
      Long long0 = new Long(0L);
      Lock lock0 = new Lock(long0);
      LockType lockType0 = LockType.RANGE_WRITE;
      LockGrantType lockGrantType0 = LockGrantType.NONE_NEEDED;
      txn0.addLock(long0, lock0, lockType0, lockGrantType0);
      LogUtils.XidImpl logUtils_XidImpl0 = new LogUtils.XidImpl(1, byteArray0, byteArray0);
      try { 
        txn0.commit((Xid) logUtils_XidImpl0);
        fail("Expecting exception: DatabaseException");
      
      } catch(DatabaseException e) {
         //
         // Failed while attempting to commit transaction 0. The attempt to abort and clean up also failed. The original exception seen from commit = null The exception from the cleanup = null
         //
         assertThrownBy("com.sleepycat.je.txn.Txn", e);
      }
  }

  @Test
  public void test30()  throws Throwable  {
      Txn txn0 = new Txn();
      Txn.Txn_traceCommit txn_Txn_traceCommit0 = new Txn.Txn_traceCommit(txn0, (-2142), (-2142));
      Long long0 = new Long(0L);
      Lock lock0 = new Lock(long0);
      LockType lockType0 = LockType.WRITE;
      LockGrantType lockGrantType0 = lock0.lock(lockType0, txn0, false, (MemoryBudget) null, 0);
      txn0.addLock(long0, lock0, lockType0, lockGrantType0);
      // Undeclared exception!
      try { 
        txn_Txn_traceCommit0._this.abort(false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.txn.Txn", e);
      }
  }

  @Test
  public void test31()  throws Throwable  {
      Txn txn0 = new Txn();
      byte[] byteArray0 = new byte[4];
      LogUtils.XidImpl logUtils_XidImpl0 = new LogUtils.XidImpl((-1085), byteArray0, byteArray0);
      txn0.setPrepared(true);
      try { 
        txn0.prepare(logUtils_XidImpl0);
        fail("Expecting exception: DatabaseException");
      
      } catch(DatabaseException e) {
         //
         // prepare() has already been called for Transaction 0.
         //
         assertThrownBy("com.sleepycat.je.txn.Txn", e);
      }
  }

  @Test
  public void test32()  throws Throwable  {
      Txn txn0 = new Txn();
      byte[] byteArray0 = new byte[2];
      LogUtils.XidImpl logUtils_XidImpl0 = new LogUtils.XidImpl((-1153), byteArray0, byteArray0);
      // Undeclared exception!
      try { 
        txn0.prepare(logUtils_XidImpl0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.txn.Txn", e);
      }
  }

  @Test
  public void test33()  throws Throwable  {
      Txn txn0 = new Txn();
      DatabaseImpl databaseImpl0 = new DatabaseImpl();
      // Undeclared exception!
      try { 
        txn0.lockInternal(2730L, (LockType) null, true, databaseImpl0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.txn.Txn", e);
      }
  }

  @Test
  public void test34()  throws Throwable  {
      Txn txn0 = new Txn();
      boolean boolean0 = txn0.isSuspended();
      assertFalse(boolean0);
  }

  @Test
  public void test35()  throws Throwable  {
      Txn txn0 = new Txn();
      txn0.setSuspended(true);
      txn0.setPrepared(false);
      assertTrue(txn0.isSuspended());
  }

  @Test
  public void test36()  throws Throwable  {
      Txn txn0 = new Txn();
      txn0.setSuspended(false);
      assertFalse(txn0.isSuspended());
      assertFalse(txn0.getOnlyAbortable());
  }

  @Test
  public void test37()  throws Throwable  {
      Txn txn0 = new Txn();
      Lock lock0 = new Lock((Long) null);
      LockGrantType lockGrantType0 = LockGrantType.PROMOTION;
      Txn.Txn_addLock txn_Txn_addLock0 = new Txn.Txn_addLock(txn0, (Long) null, lock0, (LockType) null, lockGrantType0);
      txn_Txn_addLock0.hook819();
  }

  @Test
  public void test38()  throws Throwable  {
      Txn txn0 = new Txn();
      txn0.releaseNonTxnLocks();
      assertEquals(0L, txn0.getLockTimeout());
  }

  @Test
  public void test39()  throws Throwable  {
      Txn txn0 = new Txn();
      Long long0 = new Long((long) (-2142));
      Lock lock0 = new Lock();
      LockType lockType0 = LockType.READ;
      LockGrantType lockGrantType0 = LockGrantType.WAIT_RESTART;
      Txn.Txn_addLock txn_Txn_addLock0 = new Txn.Txn_addLock(txn0, long0, lock0, lockType0, lockGrantType0);
      txn_Txn_addLock0.execute();
      txn_Txn_addLock0.execute();
  }

  @Test
  public void test40()  throws Throwable  {
      Txn txn0 = new Txn();
      txn0.hook804();
      assertFalse(txn0.isHandleLockTransferrable());
  }

  @Test
  public void test41()  throws Throwable  {
      Txn txn0 = new Txn();
      DatabaseImpl databaseImpl0 = new DatabaseImpl();
      TreeLocation treeLocation0 = new TreeLocation();
      Class<Method> class0 = Method.class;
      LNLogEntry lNLogEntry0 = new LNLogEntry((Class) class0, true);
      DupCountLN dupCountLN0 = new DupCountLN();
      try { 
        txn0.hook802((byte)0, treeLocation0, lNLogEntry0, dupCountLN0, databaseImpl0, 0L, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.entry.LNLogEntry", e);
      }
  }

  @Test
  public void test42()  throws Throwable  {
      Txn txn0 = new Txn();
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("q!");
      // Undeclared exception!
      try { 
        txn0.readFromLog(byteBuffer0, (byte)0);
        fail("Expecting exception: BufferUnderflowException");
      
      } catch(BufferUnderflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.nio.Buffer", e);
      }
  }

  @Test
  public void test43()  throws Throwable  {
      Txn txn0 = new Txn();
      Txn.Txn_traceCommit txn_Txn_traceCommit0 = new Txn.Txn_traceCommit(txn0, (-2142), (-1153));
      boolean boolean0 = txn_Txn_traceCommit0._this.isHandleLockTransferrable();
      assertFalse(boolean0);
  }

  @Test
  public void test44()  throws Throwable  {
      Txn txn0 = new Txn();
      int int0 = txn0.getLogSize();
      assertEquals(16, int0);
  }

  @Test
  public void test45()  throws Throwable  {
      Txn txn0 = new Txn();
      boolean boolean0 = txn0.isTransactional();
      assertTrue(boolean0);
  }

  @Test
  public void test46()  throws Throwable  {
      Txn txn0 = new Txn();
      long long0 = txn0.getFirstActiveLsn();
      assertEquals((-1L), long0);
  }

  @Test
  public void test47()  throws Throwable  {
      Txn txn0 = new Txn();
      txn0.hook812();
      assertTrue(txn0.isTransactional());
  }

  @Test
  public void test48()  throws Throwable  {
      Txn txn0 = new Txn();
      txn0.hook806();
      assertEquals(16, txn0.getLogSize());
  }

  @Test
  public void test49()  throws Throwable  {
      Txn txn0 = new Txn();
      long long0 = txn0.getTransactionId();
      assertEquals(0L, long0);
  }

  @Test
  public void test50()  throws Throwable  {
      Txn txn0 = new Txn();
      txn0.hook814();
      assertFalse(txn0.isSerializableIsolation());
  }

  @Test
  public void test51()  throws Throwable  {
      Txn txn0 = new Txn();
      txn0.hook808();
      assertEquals(0L, txn0.getTxnTimeOut());
  }

  @Test
  public void test52()  throws Throwable  {
      Txn txn0 = new Txn();
      DatabaseException databaseException0 = new DatabaseException();
      txn0.hook800(databaseException0);
      assertFalse(txn0.getOnlyAbortable());
  }

  @Test
  public void test53()  throws Throwable  {
      Txn txn0 = new Txn();
      Txn txn1 = txn0.getTxnLocker();
      txn1.addLogInfo(326L);
      assertFalse(txn1.isHandleLockTransferrable());
  }

  @Test
  public void test54()  throws Throwable  {
      Txn txn0 = new Txn();
      txn0.operationEnd();
      assertFalse(txn0.isHandleLockTransferrable());
  }

  @Test
  public void test55()  throws Throwable  {
      Txn txn0 = new Txn();
      // Undeclared exception!
      try { 
        txn0.writeToLog((ByteBuffer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.LogUtils", e);
      }
  }

  @Test
  public void test56()  throws Throwable  {
      Txn txn0 = new Txn();
      Txn txn1 = (Txn)txn0.newNonTxnLocker();
      assertFalse(txn1.isReadCommittedIsolation());
  }

  @Test
  public void test57()  throws Throwable  {
      Txn txn0 = new Txn();
      txn0.hook803();
      assertEquals(10000, Txn.ACCUMULATED_LIMIT);
  }

  @Test
  public void test58()  throws Throwable  {
      Txn txn0 = new Txn();
      Long long0 = new Long(750L);
      DatabaseException databaseException0 = new DatabaseException();
      txn0.hook801(long0, 750L, databaseException0);
      assertEquals(0L, txn0.getId());
  }

  @Test
  public void test59()  throws Throwable  {
      TransactionConfig transactionConfig0 = new TransactionConfig();
      Txn txn0 = null;
      try {
        txn0 = new Txn((EnvironmentImpl) null, transactionConfig0, (-1392L));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.txn.Locker", e);
      }
  }

  @Test
  public void test60()  throws Throwable  {
      Txn txn0 = new Txn();
      txn0.setOnlyAbortable();
      // Undeclared exception!
      try { 
        txn0.abort(true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.txn.Txn", e);
      }
  }

  @Test
  public void test61()  throws Throwable  {
      Txn txn0 = new Txn();
      boolean boolean0 = txn0.logEntryIsTransactional();
      assertTrue(boolean0);
  }

  @Test
  public void test62()  throws Throwable  {
      Txn txn0 = new Txn();
      int int0 = txn0.getInMemorySize();
      assertEquals(0, int0);
  }

  @Test
  public void test63()  throws Throwable  {
      Txn txn0 = new Txn();
      txn0.operationEnd(false);
      assertFalse(txn0.isReadCommittedIsolation());
  }

  @Test
  public void test64()  throws Throwable  {
      Txn txn0 = new Txn();
      long long0 = txn0.getLastLsn();
      assertEquals((-1L), long0);
  }

  @Test
  public void test65()  throws Throwable  {
      Txn txn0 = new Txn();
      txn0.hook799(16777214, 16777214, false);
      assertEquals(10000, Txn.ACCUMULATED_LIMIT);
  }

  @Test
  public void test66()  throws Throwable  {
      Txn txn0 = new Txn();
      txn0.hook805();
      assertEquals(0L, txn0.getTransactionId());
  }

  @Test
  public void test67()  throws Throwable  {
      TransactionConfig transactionConfig0 = new TransactionConfig();
      Txn txn0 = null;
      try {
        txn0 = new Txn((EnvironmentImpl) null, transactionConfig0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.txn.Locker", e);
      }
  }

  @Test
  public void test68()  throws Throwable  {
      Txn txn0 = new Txn();
      txn0.hook813();
      assertEquals(0L, txn0.getId());
  }

  @Test
  public void test69()  throws Throwable  {
      Txn txn0 = new Txn();
      int int0 = txn0.hook811(0);
      assertEquals(0, int0);
  }

  @Test
  public void test70()  throws Throwable  {
      Txn txn0 = new Txn();
      txn0.hook807();
      assertEquals(0L, txn0.getLockTimeout());
  }

  @Test
  public void test71()  throws Throwable  {
      Txn txn0 = new Txn();
      txn0.hook809();
      assertFalse(txn0.isSerializableIsolation());
  }

  @Test
  public void test72()  throws Throwable  {
      Txn txn0 = new Txn();
      StringWriter stringWriter0 = new StringWriter();
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      txn0.dumpLog(stringBuffer0, false);
      assertEquals(70, stringBuffer0.capacity());
      assertEquals("<txn id=\"0__Txn\"><DbLsn val=\"0xffffffff/0xffffffff\"/></txn>", stringWriter0.toString());
  }

  @Test
  public void test73()  throws Throwable  {
      Txn txn0 = new Txn();
      boolean boolean0 = txn0.isSerializableIsolation();
      assertFalse(boolean0);
  }

  @Test
  public void test74()  throws Throwable  {
      Txn txn0 = new Txn();
      Txn.Txn_traceCommit txn_Txn_traceCommit0 = new Txn.Txn_traceCommit(txn0, 0, (-2142));
      txn_Txn_traceCommit0.execute();
  }
}
