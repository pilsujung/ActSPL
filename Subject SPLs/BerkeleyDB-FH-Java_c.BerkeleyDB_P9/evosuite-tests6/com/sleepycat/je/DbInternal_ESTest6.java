/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 21 23:16:28 KST 2017
 */

package com.sleepycat.je;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.File;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.sleepycat.je.dbi.DatabaseImpl;
import com.sleepycat.je.dbi.GetMode;
import com.sleepycat.je.txn.Locker;
import com.sleepycat.je.txn.Txn;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class DbInternal_ESTest6 extends DbInternal_ESTest_scaffolding6 {

  @Test
  public void test00()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = EnvironmentConfig.DEFAULT;
      EnvironmentConfig environmentConfig1 = DbInternal.cloneConfig(environmentConfig0);
      assertEquals(0L, environmentConfig1.getCacheSize());
  }

  @Test
  public void test01()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = new EnvironmentConfig();
      environmentConfig0.setLocking(false);
      EnvironmentConfig environmentConfig1 = DbInternal.cloneConfig(environmentConfig0);
      assertFalse(environmentConfig1.getReadOnly());
  }

  @Test
  public void test02()  throws Throwable  {
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      byte[] byteArray0 = new byte[2];
      DatabaseEntry databaseEntry1 = new DatabaseEntry(byteArray0, 3585, 492);
      LockMode lockMode0 = LockMode.READ_COMMITTED;
      // Undeclared exception!
      try { 
        DbInternal.position((Cursor) null, databaseEntry0, databaseEntry1, lockMode0, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.DbInternal", e);
      }
  }

  @Test
  public void test03()  throws Throwable  {
      File file0 = null;
      Environment environment0 = null;
      try {
        environment0 = new Environment(file0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.dbi.DbEnvPool", e);
      }
  }

  @Test
  public void test05()  throws Throwable  {
      SecondaryConfig secondaryConfig0 = SecondaryConfig.DEFAULT;
      secondaryConfig0.getForeignKeyDatabase();
      // Undeclared exception!
      try { 
        DbInternal.dbGetDatabaseImpl((Database) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.DbInternal", e);
      }
  }

  @Test
  public void test06()  throws Throwable  {
      EnvironmentMutableConfig environmentMutableConfig0 = new EnvironmentMutableConfig();
      EnvironmentMutableConfig environmentMutableConfig1 = DbInternal.cloneMutableConfig(environmentMutableConfig0);
      environmentMutableConfig1.cacheSize = 0L;
      environmentMutableConfig1.cacheSize = (-9223372036854775808L);
  }

  @Test
  public void test08()  throws Throwable  {
      SecondaryConfig secondaryConfig0 = SecondaryConfig.DEFAULT;
      DbInternal.databaseConfigValidate(secondaryConfig0, secondaryConfig0);
      assertFalse(secondaryConfig0.getOverrideDuplicateComparator());
  }

  @Test
  public void test09()  throws Throwable  {
      // Undeclared exception!
      try { 
        DbInternal.setUseExistingConfig((DatabaseConfig) null, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.DbInternal", e);
      }
  }

  @Test
  public void test10()  throws Throwable  {
      // Undeclared exception!
      try { 
        DbInternal.setTxnReadCommitted((EnvironmentConfig) null, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.DbInternal", e);
      }
  }

  @Test
  public void test11()  throws Throwable  {
      // Undeclared exception!
      try { 
        DbInternal.getTxnReadCommitted((EnvironmentConfig) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.DbInternal", e);
      }
  }

  @Test
  public void test12()  throws Throwable  {
      // Undeclared exception!
      try { 
        DbInternal.getEnvironmentShell((File) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.dbi.DbEnvPool", e);
      }
  }

  @Test
  public void test13()  throws Throwable  {
      // Undeclared exception!
      try { 
        DbInternal.getCheckpointUP((EnvironmentConfig) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.DbInternal", e);
      }
  }

  @Test
  public void test15()  throws Throwable  {
      // Undeclared exception!
      try { 
        DbInternal.cloneConfig((EnvironmentConfig) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.DbInternal", e);
      }
  }

  @Test
  public void test16()  throws Throwable  {
      // Undeclared exception!
      try { 
        DbInternal.checkImmutablePropsForEquality((EnvironmentMutableConfig) null, (EnvironmentMutableConfig) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.DbInternal", e);
      }
  }

  @Test
  public void test17()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = EnvironmentConfig.DEFAULT;
      boolean boolean0 = DbInternal.getTxnReadCommitted(environmentConfig0);
      //  // Unstable assertion: assertTrue(boolean0);
  }

  @Test
  public void test18()  throws Throwable  {
      // Undeclared exception!
      try { 
        DbInternal.getDefaultTxnConfig((Environment) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.DbInternal", e);
      }
  }

  @Test
  public void test19()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = new EnvironmentConfig();
      EnvironmentConfig environmentConfig1 = DbInternal.cloneConfig(environmentConfig0);
      environmentConfig1.setTransactional(true);
      try { 
        DbInternal.checkImmutablePropsForEquality(environmentConfig1, environmentConfig0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // je.env.isTransactional is set to null in the config parameter which is incompatible with the value of true in the underlying environment
         //
         assertThrownBy("com.sleepycat.je.EnvironmentMutableConfig", e);
      }
  }

  @Test
  public void test20()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = new EnvironmentConfig();
      DbInternal.checkImmutablePropsForEquality(environmentConfig0, environmentConfig0);
      assertEquals(0L, environmentConfig0.getCacheSize());
  }

  @Test
  public void test21()  throws Throwable  {
      DbInternal dbInternal0 = new DbInternal();
  }

  @Test
  public void test22()  throws Throwable  {
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      // Undeclared exception!
      try { 
        DbInternal.advanceCursor((Cursor) null, databaseEntry0, databaseEntry0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.DbInternal", e);
      }
  }

  @Test
  public void test23()  throws Throwable  {
      Txn txn0 = new Txn();
      // Undeclared exception!
      try { 
        DbInternal.dbSetHandleLocker((Database) null, txn0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.DbInternal", e);
      }
  }

  @Test
  public void test24()  throws Throwable  {
      // Undeclared exception!
      try { 
        DbInternal.getCreateUP((EnvironmentConfig) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.DbInternal", e);
      }
  }

  @Test
  public void test25()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0);
      LockMode lockMode0 = LockMode.READ_UNCOMMITTED;
      // Undeclared exception!
      try { 
        DbInternal.retrieveNext((Cursor) null, databaseEntry0, (DatabaseEntry) null, lockMode0, (GetMode) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.DbInternal", e);
      }
  }

  @Test
  public void test27()  throws Throwable  {
      // Undeclared exception!
      try { 
        DbInternal.dbInvalidate((Database) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.DbInternal", e);
      }
  }

  @Test
  public void test28()  throws Throwable  {
      // Undeclared exception!
      try { 
        DbInternal.disableParameterValidation((EnvironmentMutableConfig) null);
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
      EnvironmentConfig environmentConfig0 = EnvironmentConfig.DEFAULT;
      boolean boolean0 = DbInternal.getCheckpointUP(environmentConfig0);
      assertTrue(boolean0);
  }

  @Test
  public void test30()  throws Throwable  {
      // Undeclared exception!
      try { 
        DbInternal.getLocker((Transaction) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.DbInternal", e);
      }
  }

  @Test
  public void test31()  throws Throwable  {
      DatabaseConfig databaseConfig0 = new DatabaseConfig();
      DbInternal.setUseExistingConfig(databaseConfig0, true);
      assertFalse(databaseConfig0.getOverrideBtreeComparator());
  }

  @Test
  public void test33()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = EnvironmentConfig.DEFAULT;
      DbInternal.setCheckpointUP(environmentConfig0, true);
      assertFalse(environmentConfig0.getAllowCreate());
  }

  @Test
  public void test34()  throws Throwable  {
      // Undeclared exception!
      try { 
        DbInternal.envGetEnvironmentImpl((Environment) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.DbInternal", e);
      }
  }

  @Test
  public void test35()  throws Throwable  {
      // Undeclared exception!
      try { 
        DbInternal.getCursorImpl((Cursor) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.DbInternal", e);
      }
  }

  @Test
  public void test36()  throws Throwable  {
      // Undeclared exception!
      try { 
        DbInternal.cloneMutableConfig((EnvironmentMutableConfig) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.DbInternal", e);
      }
  }

  @Test
  public void test37()  throws Throwable  {
      // Undeclared exception!
      try { 
        DbInternal.getSortedCursors((JoinCursor) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.DbInternal", e);
      }
  }

  @Test
  public void test38()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = new EnvironmentConfig();
      // Undeclared exception!
      try { 
        DbInternal.copyMutablePropsTo((EnvironmentMutableConfig) null, environmentConfig0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.DbInternal", e);
      }
  }

  @Test
  public void test39()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = new EnvironmentConfig();
      DbInternal.setCreateUP(environmentConfig0, false);
      assertFalse(environmentConfig0.getReadOnly());
  }

  @Test
  public void test40()  throws Throwable  {
      // Undeclared exception!
      try { 
        DbInternal.databaseConfigValidate((DatabaseConfig) null, (DatabaseConfig) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.DbInternal", e);
      }
  }
}