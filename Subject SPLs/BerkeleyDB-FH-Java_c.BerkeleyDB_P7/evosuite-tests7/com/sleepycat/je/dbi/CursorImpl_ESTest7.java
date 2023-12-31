/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 21 20:01:51 KST 2017
 */

package com.sleepycat.je.dbi;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.logging.Level;

import javax.transaction.xa.Xid;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.sleepycat.je.DatabaseEntry;
import com.sleepycat.je.DatabaseException;
import com.sleepycat.je.OperationStatus;
import com.sleepycat.je.log.LogUtils;
import com.sleepycat.je.tree.DBIN;
import com.sleepycat.je.tree.DIN;
import com.sleepycat.je.tree.LN;
import com.sleepycat.je.txn.LockType;
import com.sleepycat.je.txn.Locker;
import com.sleepycat.je.txn.Txn;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class CursorImpl_ESTest7 extends CursorImpl_ESTest_scaffolding7 {

  @Test
  public void test00()  throws Throwable  {
      CursorImpl.CursorImpl_latchBIN cursorImpl_CursorImpl_latchBIN0 = new CursorImpl.CursorImpl_latchBIN((CursorImpl) null);
      // Undeclared exception!
      try { 
        cursorImpl_CursorImpl_latchBIN0.execute();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.dbi.CursorImpl", e);
      }
  }

  @Test
  public void test01()  throws Throwable  {
      CursorImpl cursorImpl0 = null;
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      CursorImpl.CursorImpl_lockNextKeyForInsert cursorImpl_CursorImpl_lockNextKeyForInsert0 = new CursorImpl.CursorImpl_lockNextKeyForInsert(cursorImpl0, databaseEntry0, databaseEntry0);
      CursorImpl cursorImpl1 = null;
      try {  
      cursorImpl1 = cursorImpl_CursorImpl_lockNextKeyForInsert0._this;
      } catch(NullPointerException e) {}
  }

  @Test
  public void test02()  throws Throwable  {
      CursorImpl cursorImpl0 = null;
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      LockType lockType0 = LockType.RANGE_READ;
      boolean boolean0 = false;
      CursorImpl.CursorImpl_fetchCurrent cursorImpl_CursorImpl_fetchCurrent0 = new CursorImpl.CursorImpl_fetchCurrent(cursorImpl0, databaseEntry0, databaseEntry0, lockType0, boolean0);
      byte[] byteArray0 = null;
      try {  
      byteArray0 = cursorImpl_CursorImpl_fetchCurrent0.lnData;
      } catch(NullPointerException e) {}
  }

  @Test
  public void test03()  throws Throwable  {
      DatabaseImpl databaseImpl0 = new DatabaseImpl();
      Txn txn0 = new Txn();
      boolean boolean0 = false;
      CursorImpl cursorImpl0 = new CursorImpl(databaseImpl0, (Locker) txn0, false);
      LockType lockType0 = LockType.NONE;
      byte[] byteArray0 = new byte[2];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0, (int) byteArray0[0], (int) byteArray0[0]);
      CursorImpl.CursorImpl_fetchCurrent cursorImpl_CursorImpl_fetchCurrent0 = new CursorImpl.CursorImpl_fetchCurrent(cursorImpl0, databaseEntry0, databaseEntry0, lockType0, boolean0);
      DIN dIN0 = null;
      try {  
      dIN0 = cursorImpl_CursorImpl_fetchCurrent0.duplicateRoot;
      } catch(NullPointerException e) {}
  }

  @Test
  public void test04()  throws Throwable  {
      DatabaseEntry databaseEntry0 = null;
      CursorImpl.CursorImpl_lockNextKeyForInsert cursorImpl_CursorImpl_lockNextKeyForInsert0 = new CursorImpl.CursorImpl_lockNextKeyForInsert((CursorImpl) null, (DatabaseEntry) null, (DatabaseEntry) null);
      CursorImpl cursorImpl0 = null;
      try {  
      cursorImpl0 = cursorImpl_CursorImpl_lockNextKeyForInsert0._this;
      } catch(NullPointerException e) {}
  }

  @Test
  public void test05()  throws Throwable  {
      CursorImpl.CursorImpl_latchBIN cursorImpl_CursorImpl_latchBIN0 = new CursorImpl.CursorImpl_latchBIN((CursorImpl) null);
      DatabaseEntry databaseEntry0 = null;
      LockType lockType0 = LockType.RANGE_READ;
      boolean boolean0 = false;
  }

  @Test
  public void test06()  throws Throwable  {
      CursorImpl cursorImpl0 = null;
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      boolean boolean0 = false;
      CursorImpl.CursorImpl_lockNextKeyForInsert cursorImpl_CursorImpl_lockNextKeyForInsert0 = new CursorImpl.CursorImpl_lockNextKeyForInsert(cursorImpl0, databaseEntry0, databaseEntry0);
      CursorImpl cursorImpl1 = null;
      try {  
      cursorImpl1 = cursorImpl_CursorImpl_lockNextKeyForInsert0._this;
      } catch(NullPointerException e) {}
  }

  @Test
  public void test07()  throws Throwable  {
      CursorImpl cursorImpl0 = null;
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      LockType lockType0 = LockType.RANGE_READ;
      boolean boolean0 = false;
      CursorImpl.CursorImpl_lockNextKeyForInsert cursorImpl_CursorImpl_lockNextKeyForInsert0 = new CursorImpl.CursorImpl_lockNextKeyForInsert(cursorImpl0, databaseEntry0, databaseEntry0);
      CursorImpl cursorImpl1 = null;
      try {  
      cursorImpl1 = cursorImpl_CursorImpl_lockNextKeyForInsert0._this;
      } catch(NullPointerException e) {}
  }

  @Test
  public void test08()  throws Throwable  {
      CursorImpl.CursorImpl_lockNextKeyForInsert cursorImpl_CursorImpl_lockNextKeyForInsert0 = new CursorImpl.CursorImpl_lockNextKeyForInsert((CursorImpl) null, (DatabaseEntry) null, (DatabaseEntry) null);
      // Undeclared exception!
      try { 
        cursorImpl_CursorImpl_lockNextKeyForInsert0.hook248();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.dbi.CursorImpl$CursorImpl_lockNextKeyForInsert", e);
      }
  }

  @Test
  public void test09()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0);
      CursorImpl.CursorImpl_lockNextKeyForInsert cursorImpl_CursorImpl_lockNextKeyForInsert0 = new CursorImpl.CursorImpl_lockNextKeyForInsert((CursorImpl) null, databaseEntry0, databaseEntry0);
      // Undeclared exception!
      try { 
        cursorImpl_CursorImpl_lockNextKeyForInsert0.execute();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.dbi.CursorImpl", e);
      }
  }

  @Test
  public void test10()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0);
      LockType lockType0 = LockType.RANGE_INSERT;
      CursorImpl.CursorImpl_getNextDuplicate cursorImpl_CursorImpl_getNextDuplicate0 = new CursorImpl.CursorImpl_getNextDuplicate((CursorImpl) null, databaseEntry0, databaseEntry0, lockType0, true, true);
      // Undeclared exception!
      try { 
        cursorImpl_CursorImpl_getNextDuplicate0.hook201();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.dbi.CursorImpl$CursorImpl_getNextDuplicate", e);
      }
  }

  @Test
  public void test11()  throws Throwable  {
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      LockType lockType0 = LockType.RANGE_READ;
      CursorImpl.CursorImpl_getNextDuplicate cursorImpl_CursorImpl_getNextDuplicate0 = new CursorImpl.CursorImpl_getNextDuplicate((CursorImpl) null, databaseEntry0, databaseEntry0, lockType0, false, false);
      // Undeclared exception!
      try { 
        cursorImpl_CursorImpl_getNextDuplicate0.hook200();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.dbi.CursorImpl", e);
      }
  }

  @Test
  public void test12()  throws Throwable  {
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      CursorImpl.CursorImpl_fetchCurrent cursorImpl_CursorImpl_fetchCurrent0 = new CursorImpl.CursorImpl_fetchCurrent((CursorImpl) null, databaseEntry0, databaseEntry0, (LockType) null, true);
      // Undeclared exception!
      try { 
        cursorImpl_CursorImpl_fetchCurrent0.hook258();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.dbi.CursorImpl$CursorImpl_fetchCurrent", e);
      }
  }

  @Test
  public void test13()  throws Throwable  {
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      LockType lockType0 = LockType.RANGE_WRITE;
      CursorImpl.CursorImpl_fetchCurrent cursorImpl_CursorImpl_fetchCurrent0 = new CursorImpl.CursorImpl_fetchCurrent((CursorImpl) null, databaseEntry0, databaseEntry0, lockType0, true);
      // Undeclared exception!
      try { 
        cursorImpl_CursorImpl_fetchCurrent0.execute();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.dbi.CursorImpl", e);
      }
  }

  @Test
  public void test14()  throws Throwable  {
      DatabaseImpl databaseImpl0 = new DatabaseImpl();
      CursorImpl cursorImpl0 = null;
      try {
        cursorImpl0 = new CursorImpl(databaseImpl0, (Locker) null, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.dbi.CursorImpl", e);
      }
  }

  @Test
  public void test15()  throws Throwable  {
      LockType lockType0 = LockType.READ;
      CursorImpl.CursorImpl_getNextDuplicate cursorImpl_CursorImpl_getNextDuplicate0 = new CursorImpl.CursorImpl_getNextDuplicate((CursorImpl) null, (DatabaseEntry) null, (DatabaseEntry) null, lockType0, false, false);
      // Undeclared exception!
      try { 
        cursorImpl_CursorImpl_getNextDuplicate0.execute();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.dbi.CursorImpl", e);
      }
  }

  @Test
  public void test16()  throws Throwable  {
      DatabaseImpl databaseImpl0 = new DatabaseImpl();
      Txn txn0 = new Txn();
      CursorImpl cursorImpl0 = new CursorImpl(databaseImpl0, (Locker) txn0, false);
      byte[] byteArray0 = new byte[2];
      LogUtils.XidImpl logUtils_XidImpl0 = new LogUtils.XidImpl((int) (byte)54, byteArray0, byteArray0);
      try { 
        txn0.commit((Xid) logUtils_XidImpl0);
        fail("Expecting exception: DatabaseException");
      
      } catch(DatabaseException e) {
         //
         // Failed while attempting to commit transaction 0. The attempt to abort and clean up also failed. The original exception seen from commit = Transaction 0 commit failed because there were open cursors. The exception from the cleanup = null
         //
         assertThrownBy("com.sleepycat.je.txn.Txn", e);
      }
  }

  @Test
  public void test17()  throws Throwable  {
      Level level0 = Level.FINER;
      DBIN dBIN0 = new DBIN();
      CursorImpl.CursorImpl_trace cursorImpl_CursorImpl_trace0 = new CursorImpl.CursorImpl_trace((CursorImpl) null, level0, ":l+", dBIN0, (LN) null, (-100), (-3), 1421L);
      // Undeclared exception!
      try { 
        cursorImpl_CursorImpl_trace0.execute();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.dbi.CursorImpl", e);
      }
  }

  @Test
  public void test18()  throws Throwable  {
      CursorImpl.SearchMode cursorImpl_SearchMode0 = CursorImpl.SearchMode.SET_RANGE;
      boolean boolean0 = cursorImpl_SearchMode0.isExactSearch();
      assertFalse(boolean0);
  }

  @Test
  public void test19()  throws Throwable  {
      CursorImpl.SearchMode cursorImpl_SearchMode0 = CursorImpl.SearchMode.SET_RANGE;
      boolean boolean0 = cursorImpl_SearchMode0.isDataSearch();
      assertFalse(boolean0);
  }

  @Test
  public void test20()  throws Throwable  {
      CursorImpl.SearchMode cursorImpl_SearchMode0 = CursorImpl.SearchMode.BOTH;
      String string0 = cursorImpl_SearchMode0.toString();
      assertEquals("SearchMode.BOTH", string0);
  }

  @Test
  public void test21()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0);
      CursorImpl.CursorImpl_lockNextKeyForInsert cursorImpl_CursorImpl_lockNextKeyForInsert0 = new CursorImpl.CursorImpl_lockNextKeyForInsert((CursorImpl) null, databaseEntry0, databaseEntry0);
      cursorImpl_CursorImpl_lockNextKeyForInsert0.hook249();
  }

  @Test
  public void test23()  throws Throwable  {
      DatabaseImpl databaseImpl0 = new DatabaseImpl();
      Txn txn0 = new Txn();
      CursorImpl cursorImpl0 = new CursorImpl(databaseImpl0, (Locker) txn0, false);
      cursorImpl0.hook271();
      //  // Unstable assertion: assertEquals(239L, databaseImpl0.getEofNodeId());
  }

  @Test
  public void test24()  throws Throwable  {
      DatabaseImpl databaseImpl0 = new DatabaseImpl();
      Txn txn0 = new Txn();
      CursorImpl cursorImpl0 = new CursorImpl(databaseImpl0, (Locker) txn0, false);
      cursorImpl0.hook220();
      //  // Unstable assertion: assertEquals(210L, databaseImpl0.getEofNodeId());
  }

  @Test
  public void test25()  throws Throwable  {
      DatabaseImpl databaseImpl0 = new DatabaseImpl();
      Txn txn0 = new Txn();
      CursorImpl cursorImpl0 = new CursorImpl(databaseImpl0, (Locker) txn0, false);
      cursorImpl0.hook243();
      //  // Unstable assertion: assertEquals(181L, databaseImpl0.getEofNodeId());
  }

  @Test
  public void test26()  throws Throwable  {
      DatabaseImpl databaseImpl0 = new DatabaseImpl();
      Txn txn0 = new Txn();
      CursorImpl cursorImpl0 = new CursorImpl(databaseImpl0, (Locker) txn0);
      //  // Unstable assertion: assertEquals(151L, databaseImpl0.getEofNodeId());
  }

  @Test
  public void test27()  throws Throwable  {
      DatabaseImpl databaseImpl0 = new DatabaseImpl();
      Txn txn0 = new Txn();
      CursorImpl cursorImpl0 = new CursorImpl(databaseImpl0, (Locker) txn0, false);
      cursorImpl0.hook233();
      //  // Unstable assertion: assertEquals(122L, databaseImpl0.getEofNodeId());
  }

  @Test
  public void test28()  throws Throwable  {
      DatabaseImpl databaseImpl0 = new DatabaseImpl();
      Txn txn0 = new Txn();
      CursorImpl cursorImpl0 = new CursorImpl(databaseImpl0, (Locker) txn0, false);
      LockType lockType0 = LockType.RANGE_INSERT;
      // Undeclared exception!
      try { 
        cursorImpl0.lockEofNode(lockType0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.txn.Txn", e);
      }
  }

  @Test
  public void test29()  throws Throwable  {
      LockType lockType0 = LockType.RANGE_WRITE;
      CursorImpl.CursorImpl_getNextDuplicate cursorImpl_CursorImpl_getNextDuplicate0 = new CursorImpl.CursorImpl_getNextDuplicate((CursorImpl) null, (DatabaseEntry) null, (DatabaseEntry) null, lockType0, true, true);
      cursorImpl_CursorImpl_getNextDuplicate0.hook279();
  }

  @Test
  public void test30()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0, (int) (byte) (-108), (int) (byte)0);
      LockType lockType0 = LockType.RANGE_READ;
      CursorImpl.CursorImpl_getNextDuplicate cursorImpl_CursorImpl_getNextDuplicate0 = new CursorImpl.CursorImpl_getNextDuplicate((CursorImpl) null, databaseEntry0, databaseEntry0, lockType0, true, false);
      cursorImpl_CursorImpl_getNextDuplicate0.hook257();
  }

  @Test
  public void test31()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0);
      LockType lockType0 = LockType.RANGE_INSERT;
      CursorImpl.CursorImpl_getNextDuplicate cursorImpl_CursorImpl_getNextDuplicate0 = new CursorImpl.CursorImpl_getNextDuplicate((CursorImpl) null, databaseEntry0, databaseEntry0, lockType0, true, true);
      cursorImpl_CursorImpl_getNextDuplicate0.hook256();
  }

  @Test
  public void test32()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0, (int) (byte) (-127), 0);
      LockType lockType0 = LockType.RESTART;
      CursorImpl.CursorImpl_getNextDuplicate cursorImpl_CursorImpl_getNextDuplicate0 = new CursorImpl.CursorImpl_getNextDuplicate((CursorImpl) null, databaseEntry0, databaseEntry0, lockType0, false, true);
      cursorImpl_CursorImpl_getNextDuplicate0.hook251();
  }

  @Test
  public void test33()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0, (int) (byte) (-127), 0);
      LockType lockType0 = LockType.RESTART;
      CursorImpl.CursorImpl_getNextDuplicate cursorImpl_CursorImpl_getNextDuplicate0 = new CursorImpl.CursorImpl_getNextDuplicate((CursorImpl) null, databaseEntry0, databaseEntry0, lockType0, false, true);
      cursorImpl_CursorImpl_getNextDuplicate0.hook255();
  }

  @Test
  public void test34()  throws Throwable  {
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      CursorImpl.CursorImpl_getNextDuplicate cursorImpl_CursorImpl_getNextDuplicate0 = new CursorImpl.CursorImpl_getNextDuplicate((CursorImpl) null, databaseEntry0, databaseEntry0, (LockType) null, false, false);
      cursorImpl_CursorImpl_getNextDuplicate0.hook250();
  }

  @Test
  public void test35()  throws Throwable  {
      DatabaseImpl databaseImpl0 = new DatabaseImpl();
      Txn txn0 = new Txn();
      CursorImpl cursorImpl0 = new CursorImpl(databaseImpl0, (Locker) txn0, false);
      LockType lockType0 = LockType.RANGE_INSERT;
      CursorImpl.CursorImpl_getNextDuplicate cursorImpl_CursorImpl_getNextDuplicate0 = new CursorImpl.CursorImpl_getNextDuplicate(cursorImpl0, (DatabaseEntry) null, (DatabaseEntry) null, lockType0, false, true);
      cursorImpl_CursorImpl_getNextDuplicate0.hook275();
      //  // Unstable assertion: assertEquals(42L, databaseImpl0.getEofNodeId());
  }

  @Test
  public void test36()  throws Throwable  {
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      LockType lockType0 = LockType.READ;
      CursorImpl.CursorImpl_getNextDuplicate cursorImpl_CursorImpl_getNextDuplicate0 = new CursorImpl.CursorImpl_getNextDuplicate((CursorImpl) null, databaseEntry0, databaseEntry0, lockType0, true, true);
      cursorImpl_CursorImpl_getNextDuplicate0.hook254();
  }

  @Test
  public void test37()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0);
      LockType lockType0 = LockType.RESTART;
      CursorImpl.CursorImpl_getNextDuplicate cursorImpl_CursorImpl_getNextDuplicate0 = new CursorImpl.CursorImpl_getNextDuplicate((CursorImpl) null, databaseEntry0, databaseEntry0, lockType0, true, true);
      cursorImpl_CursorImpl_getNextDuplicate0.hook253();
  }

  @Test
  public void test38()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0, (-1592), 10000);
      LockType lockType0 = LockType.RANGE_READ;
      CursorImpl.CursorImpl_getNextDuplicate cursorImpl_CursorImpl_getNextDuplicate0 = new CursorImpl.CursorImpl_getNextDuplicate((CursorImpl) null, databaseEntry0, databaseEntry0, lockType0, true, false);
      cursorImpl_CursorImpl_getNextDuplicate0.hook252();
  }

  @Test
  public void test39()  throws Throwable  {
      CursorImpl.KeyChangeStatus cursorImpl_KeyChangeStatus0 = new CursorImpl.KeyChangeStatus((OperationStatus) null, true);
      assertTrue(cursorImpl_KeyChangeStatus0.keyChange);
  }

  @Test
  public void test40()  throws Throwable  {
      CursorImpl.CursorImpl_latchDBIN cursorImpl_CursorImpl_latchDBIN0 = new CursorImpl.CursorImpl_latchDBIN((CursorImpl) null);
      // Undeclared exception!
      try { 
        cursorImpl_CursorImpl_latchDBIN0.execute();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.dbi.CursorImpl", e);
      }
  }

  @Test
  public void test41()  throws Throwable  {
      DatabaseImpl databaseImpl0 = new DatabaseImpl();
      Txn txn0 = new Txn();
      CursorImpl cursorImpl0 = new CursorImpl(databaseImpl0, (Locker) txn0, false);
      byte[] byteArray0 = new byte[2];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0, 0, (int) (byte)0);
      LockType lockType0 = LockType.WRITE;
      CursorImpl.CursorImpl_fetchCurrent cursorImpl_CursorImpl_fetchCurrent0 = new CursorImpl.CursorImpl_fetchCurrent(cursorImpl0, databaseEntry0, databaseEntry0, lockType0, false);
      // Undeclared exception!
      try { 
        cursorImpl_CursorImpl_fetchCurrent0.hook280();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.dbi.CursorImpl$CursorImpl_fetchCurrent", e);
      }
  }

  @Test
  public void test42()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0, (int) (byte) (-51), (int) (byte)50);
      LockType lockType0 = LockType.RANGE_WRITE;
      CursorImpl.CursorImpl_fetchCurrent cursorImpl_CursorImpl_fetchCurrent0 = new CursorImpl.CursorImpl_fetchCurrent((CursorImpl) null, databaseEntry0, databaseEntry0, lockType0, true);
      // Undeclared exception!
      try { 
        cursorImpl_CursorImpl_fetchCurrent0.hook263();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.dbi.CursorImpl", e);
      }
  }

  @Test
  public void test43()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0);
      LockType lockType0 = LockType.NONE;
      CursorImpl.CursorImpl_fetchCurrent cursorImpl_CursorImpl_fetchCurrent0 = new CursorImpl.CursorImpl_fetchCurrent((CursorImpl) null, databaseEntry0, databaseEntry0, lockType0, false);
      cursorImpl_CursorImpl_fetchCurrent0.hook262();
  }

  @Test
  public void test44()  throws Throwable  {
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      LockType lockType0 = LockType.READ;
      CursorImpl.CursorImpl_fetchCurrent cursorImpl_CursorImpl_fetchCurrent0 = new CursorImpl.CursorImpl_fetchCurrent((CursorImpl) null, databaseEntry0, databaseEntry0, lockType0, false);
      // Undeclared exception!
      try { 
        cursorImpl_CursorImpl_fetchCurrent0.hook260();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.dbi.CursorImpl", e);
      }
  }

  @Test
  public void test45()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0);
      LockType lockType0 = LockType.NONE;
      CursorImpl.CursorImpl_fetchCurrent cursorImpl_CursorImpl_fetchCurrent0 = new CursorImpl.CursorImpl_fetchCurrent((CursorImpl) null, databaseEntry0, databaseEntry0, lockType0, true);
      cursorImpl_CursorImpl_fetchCurrent0.hook259();
  }

  @Test
  public void test46()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0, (int) (byte)67, (-2066));
      LockType lockType0 = LockType.READ;
      CursorImpl.CursorImpl_fetchCurrent cursorImpl_CursorImpl_fetchCurrent0 = new CursorImpl.CursorImpl_fetchCurrent((CursorImpl) null, databaseEntry0, databaseEntry0, lockType0, false);
      cursorImpl_CursorImpl_fetchCurrent0.hook261();
  }
}
