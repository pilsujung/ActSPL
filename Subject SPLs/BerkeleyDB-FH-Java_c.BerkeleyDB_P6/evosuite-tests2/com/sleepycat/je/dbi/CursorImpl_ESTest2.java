/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 21 23:36:27 KST 2017
 */

package com.sleepycat.je.dbi;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.sleepycat.je.DatabaseEntry;
import com.sleepycat.je.OperationStatus;
import com.sleepycat.je.dbi.CursorImpl;
import com.sleepycat.je.tree.BIN;
import com.sleepycat.je.tree.DIN;
import com.sleepycat.je.tree.MapLN;
import com.sleepycat.je.txn.LockType;
import java.util.logging.Level;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class CursorImpl_ESTest2 extends CursorImpl_ESTest_scaffolding2 {

  @Test
  public void test00()  throws Throwable  {
      CursorImpl cursorImpl0 = null;
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      LockType lockType0 = LockType.RANGE_INSERT;
      CursorImpl.CursorImpl_getNextDuplicate cursorImpl_CursorImpl_getNextDuplicate0 = new CursorImpl.CursorImpl_getNextDuplicate((CursorImpl) null, databaseEntry0, databaseEntry0, lockType0, true, true);
      cursorImpl_CursorImpl_getNextDuplicate0.hook251();
      // Undeclared exception!
      try { 
        cursorImpl_CursorImpl_getNextDuplicate0.hook251();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.dbi.CursorImpl$CursorImpl_getNextDuplicate", e);
      }
  }

  @Test
  public void test01()  throws Throwable  {
      CursorImpl cursorImpl0 = null;
      CursorImpl.CursorImpl_latchDBIN cursorImpl_CursorImpl_latchDBIN0 = new CursorImpl.CursorImpl_latchDBIN(cursorImpl0);
      byte[] byteArray0 = new byte[2];
  }

  @Test
  public void test02()  throws Throwable  {
      CursorImpl cursorImpl0 = null;
      byte[] byteArray0 = new byte[1];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0);
      LockType lockType0 = LockType.WRITE;
      CursorImpl.CursorImpl_getNextDuplicate cursorImpl_CursorImpl_getNextDuplicate0 = new CursorImpl.CursorImpl_getNextDuplicate((CursorImpl) null, databaseEntry0, databaseEntry0, lockType0, true, true);
      boolean boolean0 = false;
      CursorImpl.CursorImpl_fetchCurrent cursorImpl_CursorImpl_fetchCurrent0 = new CursorImpl.CursorImpl_fetchCurrent(cursorImpl0, databaseEntry0, databaseEntry0, cursorImpl_CursorImpl_getNextDuplicate0.lockType, boolean0);
      DIN dIN0 = null;
      try {  
      dIN0 = cursorImpl_CursorImpl_getNextDuplicate0.duplicateRoot;
      } catch(NullPointerException e) {}
  }

  @Test
  public void test03()  throws Throwable  {
      CursorImpl.CursorImpl_latchDBIN cursorImpl_CursorImpl_latchDBIN0 = new CursorImpl.CursorImpl_latchDBIN((CursorImpl) null);
      // Undeclared exception!
      try { 
        cursorImpl_CursorImpl_latchDBIN0.hook247();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.dbi.CursorImpl", e);
      }
  }

  @Test
  public void test04()  throws Throwable  {
      CursorImpl.CursorImpl_latchBIN cursorImpl_CursorImpl_latchBIN0 = new CursorImpl.CursorImpl_latchBIN((CursorImpl) null);
      CursorImpl cursorImpl0 = null;
      try {  
      cursorImpl0 = cursorImpl_CursorImpl_latchBIN0._this;
      } catch(NullPointerException e) {}
  }

  @Test
  public void test05()  throws Throwable  {
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
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
  public void test06()  throws Throwable  {
      CursorImpl.CursorImpl_latchBIN cursorImpl_CursorImpl_latchBIN0 = new CursorImpl.CursorImpl_latchBIN((CursorImpl) null);
      // Undeclared exception!
      try { 
        cursorImpl_CursorImpl_latchBIN0.hook245();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.dbi.CursorImpl", e);
      }
  }

  @Test
  public void test07()  throws Throwable  {
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      LockType lockType0 = LockType.READ;
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
  public void test09()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0);
      LockType lockType0 = LockType.READ;
      CursorImpl.CursorImpl_getNextDuplicate cursorImpl_CursorImpl_getNextDuplicate0 = new CursorImpl.CursorImpl_getNextDuplicate((CursorImpl) null, databaseEntry0, databaseEntry0, lockType0, true, false);
      // Undeclared exception!
      try { 
        cursorImpl_CursorImpl_getNextDuplicate0.hook254();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.dbi.CursorImpl", e);
      }
  }

  @Test
  public void test11()  throws Throwable  {
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      LockType lockType0 = LockType.RANGE_READ;
      CursorImpl.CursorImpl_getNextDuplicate cursorImpl_CursorImpl_getNextDuplicate0 = new CursorImpl.CursorImpl_getNextDuplicate((CursorImpl) null, databaseEntry0, databaseEntry0, lockType0, false, false);
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
  public void test12()  throws Throwable  {
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      CursorImpl.CursorImpl_lockNextKeyForInsert cursorImpl_CursorImpl_lockNextKeyForInsert0 = new CursorImpl.CursorImpl_lockNextKeyForInsert((CursorImpl) null, databaseEntry0, databaseEntry0);
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
  public void test16()  throws Throwable  {
      CursorImpl.SearchMode cursorImpl_SearchMode0 = CursorImpl.SearchMode.BOTH_RANGE;
      String string0 = cursorImpl_SearchMode0.toString();
      assertEquals("SearchMode.BOTH_RANGE", string0);
  }

  @Test
  public void test17()  throws Throwable  {
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      CursorImpl.CursorImpl_lockNextKeyForInsert cursorImpl_CursorImpl_lockNextKeyForInsert0 = new CursorImpl.CursorImpl_lockNextKeyForInsert((CursorImpl) null, databaseEntry0, databaseEntry0);
      cursorImpl_CursorImpl_lockNextKeyForInsert0.hook249();
  }


  @Test
  public void test19()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0);
      LockType lockType0 = LockType.READ;
      CursorImpl.CursorImpl_getNextDuplicate cursorImpl_CursorImpl_getNextDuplicate0 = new CursorImpl.CursorImpl_getNextDuplicate((CursorImpl) null, databaseEntry0, databaseEntry0, lockType0, true, false);
      cursorImpl_CursorImpl_getNextDuplicate0.hook253();
  }

  @Test
  public void test20()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0);
      LockType lockType0 = LockType.READ;
      CursorImpl.CursorImpl_getNextDuplicate cursorImpl_CursorImpl_getNextDuplicate0 = new CursorImpl.CursorImpl_getNextDuplicate((CursorImpl) null, databaseEntry0, databaseEntry0, lockType0, true, false);
      cursorImpl_CursorImpl_getNextDuplicate0.hook257();
  }

  @Test
  public void test21()  throws Throwable  {
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      CursorImpl.CursorImpl_getNextDuplicate cursorImpl_CursorImpl_getNextDuplicate0 = new CursorImpl.CursorImpl_getNextDuplicate((CursorImpl) null, databaseEntry0, databaseEntry0, (LockType) null, true, true);
      cursorImpl_CursorImpl_getNextDuplicate0.hook279();
  }

  @Test
  public void test22()  throws Throwable  {
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      LockType lockType0 = LockType.WRITE;
      CursorImpl.CursorImpl_getNextDuplicate cursorImpl_CursorImpl_getNextDuplicate0 = new CursorImpl.CursorImpl_getNextDuplicate((CursorImpl) null, databaseEntry0, databaseEntry0, lockType0, false, false);
      cursorImpl_CursorImpl_getNextDuplicate0.hook256();
  }

  @Test
  public void test23()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0);
      LockType lockType0 = LockType.WRITE;
      CursorImpl.CursorImpl_getNextDuplicate cursorImpl_CursorImpl_getNextDuplicate0 = new CursorImpl.CursorImpl_getNextDuplicate((CursorImpl) null, databaseEntry0, databaseEntry0, lockType0, true, true);
      // Undeclared exception!
      try { 
        cursorImpl_CursorImpl_getNextDuplicate0.hook255();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.dbi.CursorImpl", e);
      }
  }

  @Test
  public void test25()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0);
      LockType lockType0 = LockType.RESTART;
      CursorImpl.CursorImpl_getNextDuplicate cursorImpl_CursorImpl_getNextDuplicate0 = new CursorImpl.CursorImpl_getNextDuplicate((CursorImpl) null, databaseEntry0, databaseEntry0, lockType0, true, true);
      // Undeclared exception!
      try { 
        cursorImpl_CursorImpl_getNextDuplicate0.hook252();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.dbi.CursorImpl$CursorImpl_getNextDuplicate", e);
      }
  }

  @Test
  public void test26()  throws Throwable  {
      CursorImpl.KeyChangeStatus cursorImpl_KeyChangeStatus0 = new CursorImpl.KeyChangeStatus((OperationStatus) null, true);
      assertTrue(cursorImpl_KeyChangeStatus0.keyChange);
  }

  @Test
  public void test27()  throws Throwable  {
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      LockType lockType0 = LockType.RANGE_WRITE;
      CursorImpl.CursorImpl_fetchCurrent cursorImpl_CursorImpl_fetchCurrent0 = new CursorImpl.CursorImpl_fetchCurrent((CursorImpl) null, databaseEntry0, databaseEntry0, lockType0, false);
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
  public void test28()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0);
      LockType lockType0 = LockType.READ;
      CursorImpl.CursorImpl_fetchCurrent cursorImpl_CursorImpl_fetchCurrent0 = new CursorImpl.CursorImpl_fetchCurrent((CursorImpl) null, databaseEntry0, databaseEntry0, lockType0, false);
      // Undeclared exception!
      try { 
        cursorImpl_CursorImpl_fetchCurrent0.hook261();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.dbi.CursorImpl", e);
      }
  }

  @Test
  public void test29()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0);
      LockType lockType0 = LockType.RANGE_WRITE;
      CursorImpl.CursorImpl_fetchCurrent cursorImpl_CursorImpl_fetchCurrent0 = new CursorImpl.CursorImpl_fetchCurrent((CursorImpl) null, databaseEntry0, databaseEntry0, lockType0, false);
      // Undeclared exception!
      try { 
        cursorImpl_CursorImpl_fetchCurrent0.hook280();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.dbi.CursorImpl", e);
      }
  }

  @Test
  public void test30()  throws Throwable  {
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      LockType lockType0 = LockType.RANGE_WRITE;
      CursorImpl.CursorImpl_fetchCurrent cursorImpl_CursorImpl_fetchCurrent0 = new CursorImpl.CursorImpl_fetchCurrent((CursorImpl) null, databaseEntry0, databaseEntry0, lockType0, false);
      // Undeclared exception!
      try { 
        cursorImpl_CursorImpl_fetchCurrent0.hook262();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.dbi.CursorImpl$CursorImpl_fetchCurrent", e);
      }
  }

  @Test
  public void test31()  throws Throwable  {
      LockType lockType0 = LockType.WRITE;
      CursorImpl.CursorImpl_fetchCurrent cursorImpl_CursorImpl_fetchCurrent0 = new CursorImpl.CursorImpl_fetchCurrent((CursorImpl) null, (DatabaseEntry) null, (DatabaseEntry) null, lockType0, true);
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
  public void test32()  throws Throwable  {
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      LockType lockType0 = LockType.RANGE_WRITE;
      CursorImpl.CursorImpl_fetchCurrent cursorImpl_CursorImpl_fetchCurrent0 = new CursorImpl.CursorImpl_fetchCurrent((CursorImpl) null, databaseEntry0, databaseEntry0, lockType0, false);
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

}
