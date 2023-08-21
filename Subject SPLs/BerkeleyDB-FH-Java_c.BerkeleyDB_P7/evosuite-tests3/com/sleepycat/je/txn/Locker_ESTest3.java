/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 10:40:34 KST 2017
 */

package com.sleepycat.je.txn;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.sleepycat.je.Database;
import com.sleepycat.je.EnvironmentConfig;
import com.sleepycat.je.OperationStatus;
import com.sleepycat.je.dbi.CursorImpl;
import com.sleepycat.je.dbi.DatabaseImpl;
import com.sleepycat.je.dbi.EnvironmentImpl;
import com.sleepycat.je.tree.DBIN;
import com.sleepycat.je.tree.Key;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class Locker_ESTest3 extends Locker_ESTest_scaffolding3 {

  @Test
  public void test00()  throws Throwable  {
      Txn txn0 = new Txn();
      byte[] byteArray0 = new byte[6];
      HashMap<ReadCommittedLocker, Database> hashMap0 = new HashMap<ReadCommittedLocker, Database>();
      txn0.handleLockToHandleMap = (Map) hashMap0;
      DBIN dBIN0 = new DBIN();
      Key key0 = new Key(byteArray0);
      // Undeclared exception!
      try { 
        txn0.addDeleteInfo(dBIN0, key0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.DBIN", e);
      }
  }

  @Test
  public void test01()  throws Throwable  {
      Txn txn0 = new Txn();
      txn0.setTxnTimeout(0L);
      long long0 = txn0.getTxnStartMillis();
      //  // Unstable assertion: assertEquals(1492825214300L, long0);
  }

  @Test
  public void test02()  throws Throwable  {
      Txn txn0 = new Txn();
      txn0.setTxnTimeout((byte)6);
      long long0 = txn0.getTxnTimeOut();
      assertEquals(6L, long0);
  }

  @Test
  public void test03()  throws Throwable  {
      Txn txn0 = new Txn();
      byte[] byteArray0 = new byte[6];
      txn0.setTxnTimeout((byte)6);
      byteArray0[0] = (byte)6;
      byteArray0[1] = (byte)1;
      byteArray0[3] = (byte)46;
      byteArray0[1] = (byte)1;
      DBIN dBIN0 = new DBIN();
      boolean boolean0 = txn0.isTimedOut();
      //  // Unstable assertion: assertEquals(6L, txn0.getTxnTimeOut());
      //  // Unstable assertion: assertTrue(boolean0);
  }

  @Test
  public void test04()  throws Throwable  {
      Txn txn0 = new Txn();
      LockType lockType0 = LockType.RANGE_INSERT;
      DatabaseImpl databaseImpl0 = new DatabaseImpl();
      // Undeclared exception!
      try { 
        txn0.nonBlockingLock((byte)1, lockType0, databaseImpl0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.txn.Txn", e);
      }
  }

  @Test
  public void test05()  throws Throwable  {
      Txn txn0 = new Txn();
      // Undeclared exception!
      try { 
        txn0.lock(2014L, (LockType) null, true, (DatabaseImpl) null);
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
      txn0.readUncommittedDefault = true;
      boolean boolean0 = txn0.getDefaultNoWait();
      assertFalse(boolean0);
  }

  @Test
  public void test07()  throws Throwable  {
      Txn txn0 = new Txn();
      txn0.lockTimeOutMillis = (long) (byte)46;
      long long0 = txn0.getId();
      assertEquals(0L, long0);
  }

  @Test
  public void test08()  throws Throwable  {
      Txn txn0 = new Txn();
      TxnManager txnManager0 = null;
      try {
        txnManager0 = new TxnManager((EnvironmentImpl) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.txn.TxnManager", e);
      }
  }

  @Test
  public void test09()  throws Throwable  {
      Txn txn0 = new Txn();
      File file0 = null;
      EnvironmentConfig environmentConfig0 = new EnvironmentConfig();
      EnvironmentImpl environmentImpl0 = null;
      try {
        environmentImpl0 = new EnvironmentImpl(file0, environmentConfig0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.FileManager", e);
      }
  }

  @Test
  public void test10()  throws Throwable  {
      Txn txn0 = new Txn();
      byte[] byteArray0 = new byte[6];
      // Undeclared exception!
      try { 
        txn0.lock(2014L, (LockType) null, false, (DatabaseImpl) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.txn.Txn", e);
      }
  }

  @Test
  public void test11()  throws Throwable  {
      Txn txn0 = new Txn();
      txn0.setOnlyAbortable();
      assertEquals(10000, Txn.ACCUMULATED_LIMIT);
  }

  @Test
  public void test12()  throws Throwable  {
      Txn txn0 = new Txn();
      txn0.setHandleLockOwner(false, (Database) null, false);
      assertEquals(0L, txn0.getTxnTimeOut());
  }

  @Test
  public void test13()  throws Throwable  {
      Txn txn0 = new Txn();
      Lock lock0 = new Lock();
      txn0.removeLock((-1L), lock0);
      assertFalse(txn0.isReadUncommittedDefault());
  }

  @Test
  public void test14()  throws Throwable  {
      Txn txn0 = new Txn();
      txn0.operationEnd(false);
      assertFalse(txn0.isReadUncommittedDefault());
  }

  @Test
  public void test15()  throws Throwable  {
      Txn txn0 = new Txn();
      txn0.operationEnd();
      assertFalse(txn0.isSerializableIsolation());
  }

  @Test
  public void test16()  throws Throwable  {
      Txn txn0 = new Txn();
      Txn txn1 = (Txn)txn0.newNonTxnLocker();
      assertEquals(0L, txn1.getLockTimeout());
  }





  @Test
  public void test22()  throws Throwable  {
      Txn txn0 = new Txn();
      Txn txn1 = txn0.getTxnLocker();
      assertFalse(txn1.getDefaultNoWait());
  }

  @Test
  public void test23()  throws Throwable  {
      Txn txn0 = new Txn();
      long long0 = txn0.getAbortLsn(956L);
      assertEquals((-1L), long0);
  }

  @Test
  public void test24()  throws Throwable  {
      Txn txn0 = new Txn();
      boolean boolean0 = txn0.createdNode((-1490L));
      assertFalse(boolean0);
  }

  @Test
  public void test25()  throws Throwable  {
      Txn txn0 = new Txn();
      txn0.checkState(false);
      assertFalse(txn0.isReadUncommittedDefault());
  }

  @Test
  public void test26()  throws Throwable  {
      Txn txn0 = new Txn();
      // Undeclared exception!
      try { 
        txn0.transferHandleLock((Database) null, (Locker) null, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.DbInternal", e);
      }
  }


  @Test
  public void test29()  throws Throwable  {
      Txn txn0 = new Txn();
      LockType lockType0 = LockType.RANGE_WRITE;
      // Undeclared exception!
      try { 
        txn0.lockInternal(956L, lockType0, false, (DatabaseImpl) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.txn.Txn", e);
      }
  }

  @Test
  public void test30()  throws Throwable  {
      Txn txn0 = new Txn();
      String string0 = txn0.toString();
      assertEquals("0__Txn", string0);
  }



  @Test
  public void test34()  throws Throwable  {
      Txn txn0 = new Txn();
      Lock lock0 = new Lock();
      txn0.setWaitingFor(lock0);
      assertTrue(txn0.logEntryIsTransactional());
  }




  @Test
  public void test38()  throws Throwable  {
      Txn txn0 = new Txn();
      Long long0 = new Long((long) (byte)6);
      txn0.rememberHandleWriteLock(long0);
      assertEquals(16, txn0.getLogSize());
  }

  @Test
  public void test39()  throws Throwable  {
      Txn txn0 = new Txn();
      txn0.setLockTimeout((-1152L));
      txn0.toString();
      assertEquals((-1152L), txn0.getLockTimeout());
  }

  @Test
  public void test40()  throws Throwable  {
      Txn txn0 = new Txn();
      // Undeclared exception!
      try { 
        txn0.demoteLock((byte)1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.txn.Locker", e);
      }
  }


  @Test
  public void test42()  throws Throwable  {
      Txn txn0 = new Txn();
      long long0 = txn0.getTxnStartMillis();
      assertEquals(0L, long0);
  }


  @Test
  public void test44()  throws Throwable  {
      Txn txn0 = new Txn();
      // Undeclared exception!
      try { 
        txn0.releaseLock(4294967295L);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.txn.Locker", e);
      }
  }

}
