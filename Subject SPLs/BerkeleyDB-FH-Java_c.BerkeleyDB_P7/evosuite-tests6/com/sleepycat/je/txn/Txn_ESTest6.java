/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 02:36:56 KST 2017
 */

package com.sleepycat.je.txn;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.StringWriter;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

import javax.transaction.xa.Xid;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.sleepycat.je.Database;
import com.sleepycat.je.DatabaseException;
import com.sleepycat.je.LockStats;
import com.sleepycat.je.TransactionConfig;
import com.sleepycat.je.dbi.CursorImpl;
import com.sleepycat.je.dbi.DatabaseId;
import com.sleepycat.je.dbi.DatabaseImpl;
import com.sleepycat.je.dbi.EnvironmentImpl;
import com.sleepycat.je.log.LogEntryType;
import com.sleepycat.je.log.LogUtils;
import com.sleepycat.je.log.entry.LNLogEntry;
import com.sleepycat.je.tree.LN;
import com.sleepycat.je.tree.MapLN;
import com.sleepycat.je.tree.TreeLocation;

import sun.nio.cs.ext.MS949;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class Txn_ESTest6 extends Txn_ESTest_scaffolding6 {

  @Test
  public void test00()  throws Throwable  {
      Txn txn0 = new Txn();
      txn0.setSuspended(true);
      txn0.getTxnLocker();
      assertTrue(txn0.isSuspended());
  }

  @Test
  public void test01()  throws Throwable  {
      Txn txn0 = new Txn();
      txn0.setOnlyAbortable();
      txn0.getTxnLocker();
      assertTrue(txn0.getOnlyAbortable());
  }

  @Test
  public void test02()  throws Throwable  {
      Txn txn0 = new Txn();
      Txn txn1 = txn0.getTxnLocker();
      txn1.addLogInfo(0L);
      assertEquals(10000, Txn.ACCUMULATED_LIMIT);
  }

  @Test
  public void test03()  throws Throwable  {
      Txn txn0 = new Txn();
      boolean boolean0 = true;
      txn0.checkState(boolean0);
      assertEquals(16, txn0.getLogSize());
  }

  @Test
  public void test05()  throws Throwable  {
      Txn txn0 = new Txn();
      txn0.setPrepared(false);
      assertFalse(txn0.getOnlyAbortable());
  }

  @Test
  public void test06()  throws Throwable  {
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
  public void test07()  throws Throwable  {
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
  public void test08()  throws Throwable  {
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
  public void test09()  throws Throwable  {
      Txn txn0 = new Txn();
      byte[] byteArray0 = new byte[5];
      txn0.setOnlyAbortable();
      LogUtils.XidImpl logUtils_XidImpl0 = new LogUtils.XidImpl(1984, byteArray0, byteArray0);
      try { 
        txn0.prepare(logUtils_XidImpl0);
        fail("Expecting exception: DatabaseException");
      
      } catch(DatabaseException e) {
         //
         // Transaction 0 must be aborted.
         //
         assertThrownBy("com.sleepycat.je.txn.Txn", e);
      }
  }

  @Test
  public void test10()  throws Throwable  {
      Txn txn0 = new Txn();
      txn0.hook812();
      assertTrue(txn0.logEntryIsTransactional());
  }

  @Test
  public void test11()  throws Throwable  {
      Txn txn0 = new Txn();
      txn0.setOnlyAbortable();
      try { 
        txn0.checkState(false);
        fail("Expecting exception: DatabaseException");
      
      } catch(DatabaseException e) {
         //
         // Transaction 0 must be aborted.
         //
         assertThrownBy("com.sleepycat.je.txn.Txn", e);
      }
  }

  @Test
  public void test12()  throws Throwable  {
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
  public void test13()  throws Throwable  {
      Txn txn0 = new Txn();
      try { 
        txn0.commit((byte)75);
        fail("Expecting exception: DatabaseException");
      
      } catch(DatabaseException e) {
         //
         // Failed while attempting to commit transaction 0. The attempt to abort and clean up also failed. The original exception seen from commit = null The exception from the cleanup = null
         //
         assertThrownBy("com.sleepycat.je.txn.Txn", e);
      }
  }

  @Test
  public void test14()  throws Throwable  {
      Txn txn0 = new Txn();
      txn0.operationEnd(false);
      assertFalse(txn0.isSerializableIsolation());
  }

  @Test
  public void test15()  throws Throwable  {
      Txn txn0 = new Txn();
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
  public void test16()  throws Throwable  {
      Txn txn0 = new Txn();
      // Undeclared exception!
      try { 
        txn0.collectStats((LockStats) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.txn.Txn", e);
      }
  }

  @Test
  public void test17()  throws Throwable  {
      Txn txn0 = new Txn();
      txn0.hook810((-486));
      assertFalse(txn0.isHandleLockTransferrable());
  }

  @Test
  public void test18()  throws Throwable  {
      Txn txn0 = new Txn();
      TreeLocation treeLocation0 = new TreeLocation();
      LN lN0 = new LN((byte[]) null);
      DatabaseImpl databaseImpl0 = new DatabaseImpl();
      try { 
        txn0.hook802((-1256L), treeLocation0, (LNLogEntry) null, lN0, databaseImpl0, (-2683L), true);
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
      boolean boolean0 = txn0.getOnlyAbortable();
      assertFalse(boolean0);
  }

  @Test
  public void test20()  throws Throwable  {
      Txn txn0 = new Txn();
      // Undeclared exception!
      try { 
        txn0.setHandleLockOwner(false, (Database) null, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.txn.Txn", e);
      }
  }

  @Test
  public void test22()  throws Throwable  {
      Txn txn0 = new Txn();
      long long0 = txn0.getAbortLsn((-18L));
      assertEquals((-1L), long0);
  }

  @Test
  public void test23()  throws Throwable  {
      Txn txn0 = new Txn();
      boolean boolean0 = txn0.createdNode(0L);
      assertFalse(boolean0);
  }

  @Test
  public void test25()  throws Throwable  {
      Txn txn0 = new Txn();
      txn0.removeLock((-1654L), (Lock) null);
      assertEquals(0L, txn0.getTxnTimeOut());
  }

  @Test
  public void test26()  throws Throwable  {
      Txn txn0 = new Txn();
      byte[] byteArray0 = new byte[5];
      txn0.setOnlyAbortable();
      LogUtils.XidImpl logUtils_XidImpl0 = new LogUtils.XidImpl((-1032), byteArray0, byteArray0);
      try { 
        txn0.commit((Xid) logUtils_XidImpl0);
        fail("Expecting exception: DatabaseException");
      
      } catch(DatabaseException e) {
         //
         // Failed while attempting to commit transaction 0. The attempt to abort and clean up also failed. The original exception seen from commit = Transaction 0 must be aborted. The exception from the cleanup = null
         //
         assertThrownBy("com.sleepycat.je.txn.Txn", e);
      }
  }

  @Test
  public void test27()  throws Throwable  {
      Txn txn0 = new Txn();
      byte[] byteArray0 = new byte[8];
      LogUtils.XidImpl logUtils_XidImpl0 = new LogUtils.XidImpl((-1032), byteArray0, byteArray0);
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
  public void test28()  throws Throwable  {
      Txn txn0 = new Txn();
      boolean boolean0 = txn0.isSuspended();
      assertFalse(boolean0);
  }

  @Test
  public void test29()  throws Throwable  {
      Txn txn0 = new Txn();
      assertFalse(txn0.isSuspended());
      
      txn0.setSuspended(true);
      boolean boolean0 = txn0.isSuspended();
      assertTrue(boolean0);
  }

  @Test
  public void test30()  throws Throwable  {
      Txn txn0 = new Txn();
      txn0.setSuspended(false);
      assertFalse(txn0.isSuspended());
      assertFalse(txn0.getOnlyAbortable());
  }

  @Test
  public void test31()  throws Throwable  {
      Txn txn0 = new Txn();
      txn0.setPrepared(true);
      assertFalse(txn0.getOnlyAbortable());
  }

  @Test
  public void test32()  throws Throwable  {
      Txn txn0 = new Txn();
      Long long0 = new Long((long) (-1032));
      LockType lockType0 = LockType.RANGE_READ;
      LockGrantType lockGrantType0 = LockGrantType.EXISTING;
      Txn.Txn_addLock txn_Txn_addLock0 = new Txn.Txn_addLock(txn0, long0, (Lock) null, lockType0, lockGrantType0);
      txn_Txn_addLock0.hook819();
  }

  @Test
  public void test33()  throws Throwable  {
      Txn txn0 = new Txn();
      txn0.releaseNonTxnLocks();
      assertEquals(16, txn0.getLogSize());
  }

  @Test
  public void test34()  throws Throwable  {
      Txn txn0 = new Txn();
      Long long0 = new Long((long) (-1032));
      Lock lock0 = new Lock(long0);
      LockType lockType0 = LockType.RANGE_WRITE;
      txn0.addLock(long0, lock0, lockType0, (LockGrantType) null);
      assertEquals(0L, txn0.getLockTimeout());
  }

  @Test
  public void test35()  throws Throwable  {
      Txn txn0 = new Txn();
      txn0.hook804();
      assertTrue(txn0.isTransactional());
  }

  @Test
  public void test36()  throws Throwable  {
      Txn txn0 = new Txn();
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("TA/VVw*+ pLSa XS");
      txn0.readFromLog(byteBuffer0, (byte)12);
      assertEquals(0, byteBuffer0.arrayOffset());
  }

  @Test
  public void test37()  throws Throwable  {
      Txn txn0 = new Txn();
      // Undeclared exception!
      try { 
        txn0.generateId((TxnManager) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.txn.Txn", e);
      }
  }

  @Test
  public void test38()  throws Throwable  {
      Txn txn0 = new Txn();
      int int0 = txn0.getLogSize();
      assertEquals(16, int0);
  }

  @Test
  public void test39()  throws Throwable  {
      Txn txn0 = new Txn();
      txn0.hook814();
      txn0.hook812();
      assertTrue(txn0.logEntryIsTransactional());
  }

  @Test
  public void test40()  throws Throwable  {
      Txn txn0 = new Txn();
      Exception exception0 = new Exception(">EU-t");
      txn0.hook800(exception0);
      assertFalse(txn0.isSerializableIsolation());
  }

  @Test
  public void test41()  throws Throwable  {
      Txn txn0 = new Txn();
      Txn txn1 = (Txn)txn0.newNonTxnLocker();
      assertFalse(txn1.getOnlyAbortable());
  }

  @Test
  public void test42()  throws Throwable  {
      Txn txn0 = new Txn();
      boolean boolean0 = txn0.logEntryIsTransactional();
      assertTrue(boolean0);
  }

  @Test
  public void test43()  throws Throwable  {
      Txn txn0 = new Txn();
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
  public void test44()  throws Throwable  {
      Txn txn0 = new Txn();
      int int0 = txn0.getInMemorySize();
      assertEquals(0, int0);
  }

  @Test
  public void test45()  throws Throwable  {
      Txn txn0 = new Txn();
      long long0 = txn0.getLastLsn();
      assertEquals((-1L), long0);
  }

  @Test
  public void test46()  throws Throwable  {
      TransactionConfig transactionConfig0 = TransactionConfig.DEFAULT;
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
  public void test47()  throws Throwable  {
      Txn txn0 = new Txn();
      txn0.hook813();
      assertFalse(txn0.isHandleLockTransferrable());
  }

  @Test
  public void test48()  throws Throwable  {
      Txn txn0 = new Txn();
      // Undeclared exception!
      try { 
        txn0.abort((Xid) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.txn.Txn", e);
      }
  }

  @Test
  public void test49()  throws Throwable  {
      Txn txn0 = new Txn();
      TreeLocation treeLocation0 = new TreeLocation();
      LogEntryType logEntryType0 = LogEntryType.LOG_MAPLN_TRANSACTIONAL;
      MapLN mapLN0 = new MapLN();
      DatabaseId databaseId0 = new DatabaseId(0);
      LNLogEntry lNLogEntry0 = new LNLogEntry(logEntryType0, (LN) mapLN0, databaseId0, treeLocation0.lnKey, 255L, false, txn0);
      DatabaseImpl databaseImpl0 = new DatabaseImpl();
      txn0.hook802((-1L), treeLocation0, lNLogEntry0, mapLN0, databaseImpl0, 576L, true);
      //  // Unstable assertion: assertEquals(103L, databaseImpl0.getEofNodeId());
      //  // Unstable assertion: assertEquals(103L, mapLN0.getLastId());
  }

  @Test
  public void test50()  throws Throwable  {
      Txn txn0 = new Txn();
      StringWriter stringWriter0 = new StringWriter();
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      txn0.dumpLog(stringBuffer0, false);
      assertEquals("<txn id=\"0__Txn\"><DbLsn val=\"0xffffffff/0xffffffff\"/></txn>", stringBuffer0.toString());
      assertEquals("<txn id=\"0__Txn\"><DbLsn val=\"0xffffffff/0xffffffff\"/></txn>", stringWriter0.toString());
  }

  @Test
  public void test51()  throws Throwable  {
      Txn txn0 = new Txn();
      txn0.hook807();
      assertFalse(txn0.isReadUncommittedDefault());
  }

  @Test
  public void test52()  throws Throwable  {
      Txn txn0 = new Txn();
      boolean boolean0 = txn0.isHandleLockTransferrable();
      assertFalse(boolean0);
  }

  @Test
  public void test53()  throws Throwable  {
      Txn txn0 = new Txn();
      boolean boolean0 = txn0.isTransactional();
      assertTrue(boolean0);
  }

  @Test
  public void test54()  throws Throwable  {
      Txn txn0 = new Txn();
      long long0 = txn0.getFirstActiveLsn();
      assertEquals((-1L), long0);
  }

  @Test
  public void test55()  throws Throwable  {
      Txn txn0 = new Txn();
      txn0.hook806();
      assertFalse(txn0.isReadUncommittedDefault());
  }

  @Test
  public void test56()  throws Throwable  {
      Txn txn0 = new Txn();
      long long0 = txn0.getTransactionId();
      assertEquals(0L, long0);
  }

  @Test
  public void test57()  throws Throwable  {
      Txn txn0 = new Txn();
      txn0.hook808();
      assertEquals(10000, Txn.ACCUMULATED_LIMIT);
  }

  @Test
  public void test58()  throws Throwable  {
      Txn txn0 = new Txn();
      Txn txn1 = txn0.getTxnLocker();
      txn1.hook813();
      assertSame(txn1, txn0);
  }

  @Test
  public void test59()  throws Throwable  {
      Txn txn0 = new Txn();
      txn0.operationEnd();
      assertFalse(txn0.isHandleLockTransferrable());
  }

  @Test
  public void test60()  throws Throwable  {
      Txn txn0 = new Txn();
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("rh~`~%Ob%.dcZ");
      // Undeclared exception!
      try { 
        txn0.writeToLog(byteBuffer0);
        fail("Expecting exception: BufferOverflowException");
      
      } catch(BufferOverflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.nio.Buffer", e);
      }
  }

  @Test
  public void test61()  throws Throwable  {
      Txn txn0 = new Txn();
      boolean boolean0 = txn0.isReadCommittedIsolation();
      assertFalse(boolean0);
  }

  @Test
  public void test62()  throws Throwable  {
      TransactionConfig transactionConfig0 = TransactionConfig.DEFAULT;
      Txn txn0 = null;
      try {
        txn0 = new Txn((EnvironmentImpl) null, transactionConfig0, (-2152L));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.txn.Locker", e);
      }
  }

  @Test
  public void test63()  throws Throwable  {
      Txn txn0 = new Txn();
      txn0.setOnlyAbortable();
      try { 
        txn0.commit((byte) (-53));
        fail("Expecting exception: DatabaseException");
      
      } catch(DatabaseException e) {
         //
         // Failed while attempting to commit transaction 0. The attempt to abort and clean up also failed. The original exception seen from commit = Transaction 0 must be aborted. The exception from the cleanup = null
         //
         assertThrownBy("com.sleepycat.je.txn.Txn", e);
      }
  }

  @Test
  public void test64()  throws Throwable  {
      Txn txn0 = new Txn();
      txn0.hook803();
      assertTrue(txn0.logEntryIsTransactional());
  }

  @Test
  public void test66()  throws Throwable  {
      Txn txn0 = new Txn();
      txn0.hook799((byte)94, (byte)0, true);
      assertEquals(0L, txn0.getTxnTimeOut());
  }

  @Test
  public void test67()  throws Throwable  {
      Txn txn0 = new Txn();
      txn0.hook805();
      assertFalse(txn0.isReadUncommittedDefault());
  }

  @Test
  public void test68()  throws Throwable  {
      Txn txn0 = new Txn();
      Long long0 = new Long((long) (-1032));
      LockType lockType0 = LockType.RANGE_READ;
      LockGrantType lockGrantType0 = LockGrantType.EXISTING;
      Txn.Txn_addLock txn_Txn_addLock0 = new Txn.Txn_addLock(txn0, long0, (Lock) null, lockType0, lockGrantType0);
      txn_Txn_addLock0.execute();
      byte byte0 = (byte)0;
      try { 
        txn0.commit(byte0);
        fail("Expecting exception: DatabaseException");
      
      } catch(DatabaseException e) {
         //
         // Failed while attempting to commit transaction 0. The attempt to abort and clean up also failed. The original exception seen from commit = null The exception from the cleanup = null
         //
         assertThrownBy("com.sleepycat.je.txn.Txn", e);
      }
  }

  @Test
  public void test69()  throws Throwable  {
      Txn txn0 = new Txn();
      txn0.hook809();
      assertFalse(txn0.isReadUncommittedDefault());
  }

  @Test
  public void test70()  throws Throwable  {
      Txn txn0 = new Txn();
      boolean boolean0 = txn0.isSerializableIsolation();
      assertFalse(boolean0);
  }
}
