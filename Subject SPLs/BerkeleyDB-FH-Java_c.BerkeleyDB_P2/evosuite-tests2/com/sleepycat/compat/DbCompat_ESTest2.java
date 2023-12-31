/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 21 22:55:22 KST 2017
 */

package com.sleepycat.compat;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.sleepycat.compat.DbCompat;
import com.sleepycat.je.Cursor;
import com.sleepycat.je.CursorConfig;
import com.sleepycat.je.Database;
import com.sleepycat.je.DatabaseConfig;
import com.sleepycat.je.DatabaseEntry;
import com.sleepycat.je.Environment;
import com.sleepycat.je.EnvironmentConfig;
import com.sleepycat.je.LockMode;
import com.sleepycat.je.SecondaryConfig;
import com.sleepycat.je.SecondaryCursor;
import com.sleepycat.je.Transaction;
import com.sleepycat.je.TransactionConfig;
import java.io.File;
import java.util.Comparator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class DbCompat_ESTest2 extends DbCompat_ESTest_scaffolding2 {


  @Test
  public void test02()  throws Throwable  {
      SecondaryConfig secondaryConfig0 = new SecondaryConfig();
      // Undeclared exception!
      try { 
        DbCompat.setRecordLength(secondaryConfig0, (-2648));
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.compat.DbCompat", e);
      }
  }

  @Test
  public void test03()  throws Throwable  {
      TransactionConfig transactionConfig0 = new TransactionConfig();
      DbCompat.setSerializableIsolation(transactionConfig0, true);
      assertTrue(transactionConfig0.getSerializableIsolation());
  }

  @Test
  public void test04()  throws Throwable  {
      DatabaseConfig databaseConfig0 = DatabaseConfig.DEFAULT;
      // Undeclared exception!
      try { 
        DbCompat.openDatabase((Environment) null, (Transaction) null, " param ", " param ", databaseConfig0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.compat.DbCompat", e);
      }
  }

  @Test
  public void test05()  throws Throwable  {
      DatabaseConfig databaseConfig0 = null;
      // Undeclared exception!
      try { 
        DbCompat.openDatabase((Environment) null, (Transaction) null, (String) null, "Iqe /igLM/ ", (DatabaseConfig) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.compat.DbCompat", e);
      }
  }

  @Test
  public void test06()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = new EnvironmentConfig();
      DatabaseConfig databaseConfig0 = DatabaseConfig.DEFAULT;
      CursorConfig cursorConfig0 = CursorConfig.READ_UNCOMMITTED;
      File file0 = null;
      Environment environment0 = null;
      try {
        environment0 = new Environment(file0, environmentConfig0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // envHome cannot be null
         //
         assertThrownBy("com.sleepycat.je.DatabaseUtil", e);
      }
  }

  @Test
  public void test07()  throws Throwable  {
      Cursor cursor0 = null;
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      LockMode lockMode0 = LockMode.DIRTY_READ;
      // Undeclared exception!
      try { 
        DbCompat.getCurrentRecordNumber((Cursor) null, databaseEntry0, lockMode0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.compat.DbCompat", e);
      }
  }

  @Test
  public void test08()  throws Throwable  {
      DatabaseConfig databaseConfig0 = new DatabaseConfig();
      Environment environment0 = null;
      // Undeclared exception!
      try { 
        DbCompat.getThreadTransaction((Environment) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.compat.DbCompat", e);
      }
  }

  @Test
  public void test09()  throws Throwable  {
      TransactionConfig transactionConfig0 = new TransactionConfig();
      DbCompat.setSerializableIsolation(transactionConfig0, false);
      assertFalse(transactionConfig0.getSerializableIsolation());
  }

  @Test
  public void test10()  throws Throwable  {
      // Undeclared exception!
      try { 
        DbCompat.setSortedDuplicates((DatabaseConfig) null, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.compat.DbCompat", e);
      }
  }



  @Test
  public void test13()  throws Throwable  {
      DatabaseConfig databaseConfig0 = DatabaseConfig.DEFAULT;
      // Undeclared exception!
      try { 
        DbCompat.openDatabase((Environment) null, (Transaction) null, "", (String) null, databaseConfig0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.compat.DbCompat", e);
      }
  }

  @Test
  public void test14()  throws Throwable  {
      SecondaryConfig secondaryConfig0 = new SecondaryConfig();
      // Undeclared exception!
      try { 
        DbCompat.setRecordLength(secondaryConfig0, 50);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.compat.DbCompat", e);
      }
  }

  @Test
  public void test15()  throws Throwable  {
      DatabaseConfig databaseConfig0 = new DatabaseConfig();
      DbCompat.setRecordLength(databaseConfig0, 0);
      assertEquals(0, databaseConfig0.getNodeMaxDupTreeEntries());
  }

  @Test
  public void test16()  throws Throwable  {
      SecondaryConfig secondaryConfig0 = new SecondaryConfig();
      // Undeclared exception!
      try { 
        DbCompat.setUnsortedDuplicates(secondaryConfig0, true);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.compat.DbCompat", e);
      }
  }

  @Test
  public void test17()  throws Throwable  {
      DatabaseConfig databaseConfig0 = new DatabaseConfig();
      DbCompat.setUnsortedDuplicates(databaseConfig0, false);
      assertFalse(databaseConfig0.getAllowCreate());
  }

  @Test
  public void test18()  throws Throwable  {
      // Undeclared exception!
      try { 
        DbCompat.setInitializeCDB((EnvironmentConfig) null, true);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.compat.DbCompat", e);
      }
  }

  @Test
  public void test19()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = new EnvironmentConfig();
      DbCompat.setInitializeCDB(environmentConfig0, false);
      assertFalse(environmentConfig0.getTxnSerializableIsolation());
  }



  @Test
  public void test22()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = new EnvironmentConfig();
      // Undeclared exception!
      try { 
        DbCompat.setInitializeCache(environmentConfig0, false);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.compat.DbCompat", e);
      }
  }

  @Test
  public void test23()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = new EnvironmentConfig();
      DbCompat.setInitializeCache(environmentConfig0, true);
      assertFalse(environmentConfig0.getTxnSerializableIsolation());
  }

  @Test
  public void test24()  throws Throwable  {
      CursorConfig cursorConfig0 = CursorConfig.DEFAULT;
      // Undeclared exception!
      try { 
        DbCompat.setWriteCursor(cursorConfig0, true);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.compat.DbCompat", e);
      }
  }

  @Test
  public void test25()  throws Throwable  {
      CursorConfig cursorConfig0 = CursorConfig.READ_UNCOMMITTED;
      DbCompat.setWriteCursor(cursorConfig0, false);
      assertFalse(cursorConfig0.getReadCommitted());
  }


  @Test
  public void test27()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0, (int) (byte)0, (int) (byte)0);
      // Undeclared exception!
      try { 
        DbCompat.append((Database) null, (Transaction) null, databaseEntry0, databaseEntry0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.compat.DbCompat", e);
      }
  }


  @Test
  public void test29()  throws Throwable  {
      DatabaseConfig databaseConfig0 = DatabaseConfig.DEFAULT;
      DbCompat.setSortedDuplicates(databaseConfig0, true);
      assertTrue(databaseConfig0.getSortedDuplicates());
  }


  @Test
  public void test31()  throws Throwable  {
      DatabaseConfig databaseConfig0 = DatabaseConfig.DEFAULT;
      boolean boolean0 = DbCompat.getSortedDuplicates(databaseConfig0);
      //  // Unstable assertion: assertFalse(boolean0);
  }

  @Test
  public void test32()  throws Throwable  {
      DatabaseConfig databaseConfig0 = new DatabaseConfig();
      // Undeclared exception!
      try { 
        DbCompat.setRecordPad(databaseConfig0, 990);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.compat.DbCompat", e);
      }
  }

  @Test
  public void test33()  throws Throwable  {
      DatabaseConfig databaseConfig0 = DatabaseConfig.DEFAULT;
      DbCompat.setReadUncommitted(databaseConfig0, true);
      //  // Unstable assertion: assertFalse(databaseConfig0.getSortedDuplicates());
  }

  @Test
  public void test34()  throws Throwable  {
      // Undeclared exception!
      try { 
        DbCompat.getRecordNumber((DatabaseEntry) null);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.compat.DbCompat", e);
      }
  }

  @Test
  public void test35()  throws Throwable  {
      SecondaryConfig secondaryConfig0 = new SecondaryConfig();
      // Undeclared exception!
      try { 
        DbCompat.setRenumbering(secondaryConfig0, false);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.compat.DbCompat", e);
      }
  }

  @Test
  public void test36()  throws Throwable  {
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      // Undeclared exception!
      try { 
        DbCompat.setRecordNumber(databaseEntry0, (byte)82);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.compat.DbCompat", e);
      }
  }



  @Test
  public void test39()  throws Throwable  {
      DatabaseConfig databaseConfig0 = new DatabaseConfig();
      // Undeclared exception!
      try { 
        DbCompat.setTypeRecno(databaseConfig0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.compat.DbCompat", e);
      }
  }

  @Test
  public void test40()  throws Throwable  {
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      // Undeclared exception!
      try { 
        DbCompat.putBefore((Cursor) null, databaseEntry0, databaseEntry0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.compat.DbCompat", e);
      }
  }

  @Test
  public void test41()  throws Throwable  {
      DatabaseConfig databaseConfig0 = new DatabaseConfig();
      boolean boolean0 = DbCompat.isTypeHash(databaseConfig0);
      assertFalse(boolean0);
  }

  @Test
  public void test42()  throws Throwable  {
      SecondaryConfig secondaryConfig0 = new SecondaryConfig();
      boolean boolean0 = DbCompat.isTypeBtree(secondaryConfig0);
      assertTrue(boolean0);
  }

  @Test
  public void test43()  throws Throwable  {
      DatabaseConfig databaseConfig0 = DatabaseConfig.DEFAULT;
      // Undeclared exception!
      try { 
        DbCompat.openDatabase((Environment) null, (Transaction) null, "CZc[jK;Dw6Lg3", "r!s=0:Ns}[sC", databaseConfig0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.compat.DbCompat", e);
      }
  }

  @Test
  public void test44()  throws Throwable  {
      boolean boolean0 = DbCompat.getUnsortedDuplicates((DatabaseConfig) null);
      assertFalse(boolean0);
  }

  @Test
  public void test45()  throws Throwable  {
      // Undeclared exception!
      try { 
        DbCompat.setSerializableIsolation((TransactionConfig) null, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.compat.DbCompat", e);
      }
  }

  @Test
  public void test46()  throws Throwable  {
      CursorConfig cursorConfig0 = new CursorConfig();
      CursorConfig cursorConfig1 = DbCompat.cloneCursorConfig(cursorConfig0);
      assertNotSame(cursorConfig1, cursorConfig0);
  }



  @Test
  public void test49()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0, (-1835), (-1359));
      LockMode lockMode0 = LockMode.DIRTY_READ;
      // Undeclared exception!
      try { 
        DbCompat.getSearchRecordNumber((SecondaryCursor) null, databaseEntry0, databaseEntry0, databaseEntry0, lockMode0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.compat.DbCompat", e);
      }
  }

  @Test
  public void test50()  throws Throwable  {
      LockMode lockMode0 = LockMode.RMW;
      // Undeclared exception!
      try { 
        DbCompat.getSearchRecordNumber((Cursor) null, (DatabaseEntry) null, (DatabaseEntry) null, lockMode0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.compat.DbCompat", e);
      }
  }

  @Test
  public void test51()  throws Throwable  {
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      // Undeclared exception!
      try { 
        DbCompat.putAfter((Cursor) null, databaseEntry0, databaseEntry0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.compat.DbCompat", e);
      }
  }


  @Test
  public void test53()  throws Throwable  {
      DatabaseConfig databaseConfig0 = new DatabaseConfig();
      boolean boolean0 = DbCompat.getReadUncommitted(databaseConfig0);
      assertTrue(boolean0);
  }

  @Test
  public void test54()  throws Throwable  {
      DatabaseConfig databaseConfig0 = new DatabaseConfig();
      // Undeclared exception!
      try { 
        DbCompat.setBtreeRecordNumbers(databaseConfig0, false);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.compat.DbCompat", e);
      }
  }

  @Test
  public void test55()  throws Throwable  {
      DatabaseConfig databaseConfig0 = new DatabaseConfig();
      // Undeclared exception!
      try { 
        DbCompat.setBtreeComparator(databaseConfig0, (Comparator) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.compat.DbCompat", e);
      }
  }

  @Test
  public void test56()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = new EnvironmentConfig();
      DbCompat.setLockDetectModeOldest(environmentConfig0);
      assertEquals(0L, environmentConfig0.getCacheSize());
  }

  @Test
  public void test57()  throws Throwable  {
      DatabaseConfig databaseConfig0 = new DatabaseConfig();
      boolean boolean0 = DbCompat.getBtreeRecordNumbers(databaseConfig0);
      assertFalse(boolean0);
  }

  @Test
  public void test58()  throws Throwable  {
      SecondaryConfig secondaryConfig0 = new SecondaryConfig();
      boolean boolean0 = DbCompat.getRenumbering(secondaryConfig0);
      assertFalse(boolean0);
  }


  @Test
  public void test60()  throws Throwable  {
      boolean boolean0 = DbCompat.isTypeQueue((DatabaseConfig) null);
      assertFalse(boolean0);
  }
}
