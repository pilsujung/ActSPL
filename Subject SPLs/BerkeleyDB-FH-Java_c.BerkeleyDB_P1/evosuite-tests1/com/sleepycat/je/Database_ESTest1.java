/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 21 18:30:34 KST 2017
 */

package com.sleepycat.je;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.fail;

import java.io.File;
import java.util.List;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.sleepycat.je.dbi.DatabaseImpl;
import com.sleepycat.je.dbi.EnvironmentImpl;
import com.sleepycat.je.dbi.PutMode;
import com.sleepycat.je.txn.Locker;
import com.sleepycat.je.txn.Txn;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class Database_ESTest1 extends Database_ESTest_scaffolding1 {

  @Test
  public void test00()  throws Throwable  {
      Database database0 = new Database((Environment) null);
      SecondaryDatabase secondaryDatabase0 = null;
      try {
        secondaryDatabase0 = new SecondaryDatabase((Environment) null, (SecondaryConfig) null, database0);
        fail("Expecting exception: DatabaseException");
      
      } catch(DatabaseException e) {
         //
         // Can't use as primary: Database state can't be null must be DbState.OPEN
         //
         assertThrownBy("com.sleepycat.je.Database", e);
      }
  }

  @Test
  public void test01()  throws Throwable  {
      Database database0 = new Database((Environment) null);
      // Undeclared exception!
      try { 
        database0.close();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.Database", e);
      }
  }

  @Test
  public void test02()  throws Throwable  {
      Database database0 = new Database((Environment) null);
      Transaction transaction0 = null;
      // Undeclared exception!
      try { 
        database0.close();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.Database", e);
      }
  }

  @Test
  public void test04()  throws Throwable  {
      Database database0 = new Database((Environment) null);
      File file0 = null;
      EnvironmentConfig environmentConfig0 = null;
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
  public void test05()  throws Throwable  {
      Database database0 = new Database((Environment) null);
      DatabaseConfig databaseConfig0 = new DatabaseConfig();
      Transaction transaction0 = null;
      byte[] byteArray0 = new byte[3];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0);
      LockMode lockMode0 = LockMode.DIRTY_READ;
      // Undeclared exception!
      try { 
        database0.initNew((Environment) null, (Locker) null, "zxQg7H)\"fYW[bj9+fT ", databaseConfig0);
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
      Database database0 = new Database((Environment) null);
      Database.Database_releaseTriggerListWriteLock database_Database_releaseTriggerListWriteLock0 = new Database.Database_releaseTriggerListWriteLock(database0);
      EnvironmentImpl environmentImpl0 = null;
      try {  
      environmentImpl0 = database_Database_releaseTriggerListWriteLock0.env;
      } catch(NullPointerException e) {}
  }

  @Test
  public void test07()  throws Throwable  {
      Environment environment0 = null;
      try {
        environment0 = new Environment((File) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.dbi.DbEnvPool", e);
      }
  }

  @Test
  public void test08()  throws Throwable  {
      Database database0 = new Database((Environment) null);
      boolean boolean0 = database0.hasTriggers();
      assertFalse(boolean0);
  }

  @Test
  public void test09()  throws Throwable  {
      Database database0 = new Database((Environment) null);
      CursorConfig cursorConfig0 = CursorConfig.DIRTY_READ;
      // Undeclared exception!
      try { 
        database0.openCursor((Transaction) null, cursorConfig0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.Database", e);
      }
  }

  @Test
  public void test10()  throws Throwable  {
      Database database0 = new Database((Environment) null);
      Cursor[] cursorArray0 = new Cursor[0];
      JoinConfig joinConfig0 = JoinConfig.DEFAULT;
      // Undeclared exception!
      try { 
        database0.join(cursorArray0, joinConfig0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.Database", e);
      }
  }

  @Test
  public void test11()  throws Throwable  {
      Database database0 = new Database((Environment) null);
      // Undeclared exception!
      try { 
        database0.invalidate();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.Database", e);
      }
  }

  @Test
  public void test12()  throws Throwable  {
      Database database0 = new Database((Environment) null);
      Txn txn0 = new Txn();
      byte[] byteArray0 = new byte[3];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0);
      // Undeclared exception!
      try { 
        database0.hook54(txn0, databaseEntry0, databaseEntry0, databaseEntry0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.Database", e);
      }
  }

  @Test
  public void test13()  throws Throwable  {
      Database database0 = new Database((Environment) null);
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      LockMode lockMode0 = LockMode.DEFAULT;
      // Undeclared exception!
      try { 
        database0.getSearchBoth((Transaction) null, databaseEntry0, databaseEntry0, lockMode0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.Database", e);
      }
  }

  @Test
  public void test14()  throws Throwable  {
      Database database0 = new Database((Environment) null);
      // Undeclared exception!
      try { 
        database0.getDatabaseName();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.Database", e);
      }
  }

  @Test
  public void test15()  throws Throwable  {
      Database database0 = new Database((Environment) null);
      // Undeclared exception!
      try { 
        database0.getConfig();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.Database", e);
      }
  }

  @Test
  public void test16()  throws Throwable  {
      Database database0 = new Database((Environment) null);
      byte[] byteArray0 = new byte[3];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0);
      LockMode lockMode0 = LockMode.DIRTY_READ;
      // Undeclared exception!
      try { 
        database0.get((Transaction) null, databaseEntry0, databaseEntry0, lockMode0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.Database", e);
      }
  }

  @Test
  public void test17()  throws Throwable  {
      Database database0 = new Database((Environment) null);
      byte[] byteArray0 = new byte[3];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0);
      // Undeclared exception!
      try { 
        database0.delete((Transaction) null, databaseEntry0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.Database", e);
      }
  }

  @Test
  public void test18()  throws Throwable  {
      Database database0 = new Database((Environment) null);
      // Undeclared exception!
      try { 
        database0.checkEnv();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.Database", e);
      }
  }

  @Test
  public void test19()  throws Throwable  {
      Database database0 = new Database((Environment) null);
      SecondaryTrigger secondaryTrigger0 = new SecondaryTrigger((SecondaryDatabase) null);
      database0.addTrigger(secondaryTrigger0, true);
  }

  @Test
  public void test20()  throws Throwable  {
      Database database0 = new Database((Environment) null);
      try { 
        database0.checkProhibitedDbState((Database.DbState) null, "");
        fail("Expecting exception: DatabaseException");
      
      } catch(DatabaseException e) {
         //
         //  Database state must not be null
         //
         assertThrownBy("com.sleepycat.je.Database", e);
      }
  }

  @Test
  public void test21()  throws Throwable  {
      Database database0 = new Database((Environment) null);
      Database.DbState database_DbState0 = Database.INVALID;
      database0.checkProhibitedDbState(database_DbState0, "");
  }

  @Test
  public void test22()  throws Throwable  {
      Database database0 = new Database((Environment) null);
      database0.checkRequiredDbState((Database.DbState) null, (String) null);
  }

  @Test
  public void test23()  throws Throwable  {
      Database database0 = new Database((Environment) null);
      List list0 = database0.getSecondaryDatabases();
      // Undeclared exception!
      try { 
        database0.hook53(list0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.Database", e);
      }
  }

  @Test
  public void test24()  throws Throwable  {
      Database database0 = new Database((Environment) null);
      String string0 = database0.getDebugName();
      assertNull(string0);
  }

  @Test
  public void test25()  throws Throwable  {
      Database database0 = new Database((Environment) null);
      byte[] byteArray0 = new byte[6];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0);
      // Undeclared exception!
      try { 
        database0.deleteInternal((Locker) null, databaseEntry0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.txn.LockerFactory", e);
      }
  }

  @Test
  public void test26()  throws Throwable  {
      Database database0 = new Database((Environment) null);
      Database.DbState database_DbState0 = Database.CLOSED;
      try { 
        database0.checkRequiredDbState(database_DbState0, "</din>");
        fail("Expecting exception: DatabaseException");
      
      } catch(DatabaseException e) {
         //
         // </din> Database state can't be null must be DbState.CLOSED
         //
         assertThrownBy("com.sleepycat.je.Database", e);
      }
  }

  @Test
  public void test27()  throws Throwable  {
      Database.DbState database_DbState0 = new Database.DbState((String) null);
  }

  @Test
  public void test28()  throws Throwable  {
      Database database0 = new Database((Environment) null);
      SecondaryTrigger secondaryTrigger0 = new SecondaryTrigger((SecondaryDatabase) null);
      database0.addTrigger(secondaryTrigger0, false);
      List list0 = database0.getSecondaryDatabases();
      assertEquals(1, list0.size());
  }

  @Test
  public void test29()  throws Throwable  {
      Database database0 = new Database((Environment) null);
      database0.removeCursor((Cursor) null);
  }

  @Test
  public void test31()  throws Throwable  {
      Database database0 = new Database((Environment) null);
      PreloadConfig preloadConfig0 = new PreloadConfig();
      // Undeclared exception!
      try { 
        database0.preload(preloadConfig0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.Database", e);
      }
  }

  @Test
  public void test32()  throws Throwable  {
      Database database0 = new Database((Environment) null);
      database0.hook51((Transaction) null, (DatabaseEntry) null, (DatabaseEntry) null);
  }

  @Test
  public void test33()  throws Throwable  {
      Database database0 = new Database((Environment) null);
      boolean boolean0 = database0.isWritable();
      assertFalse(boolean0);
  }

  @Test
  public void test34()  throws Throwable  {
      Database database0 = new Database((Environment) null);
      Txn txn0 = new Txn();
      database0.setHandleLocker(txn0);
      assertFalse(txn0.isSuspended());
  }

  @Test
  public void test35()  throws Throwable  {
      Database database0 = new Database((Environment) null);
      byte[] byteArray0 = new byte[3];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0);
      LockMode lockMode0 = LockMode.DIRTY_READ;
      database0.hook48((Transaction) null, databaseEntry0, lockMode0);
      assertEquals(0, databaseEntry0.getOffset());
  }

  @Test
  public void test36()  throws Throwable  {
      Database database0 = new Database((Environment) null);
      byte[] byteArray0 = new byte[3];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0);
      // Undeclared exception!
      try { 
        database0.put((Transaction) null, databaseEntry0, databaseEntry0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.Database", e);
      }
  }

  @Test
  public void test37()  throws Throwable  {
      Database database0 = new Database((Environment) null);
      database0.hook56();
  }

  @Test
  public void test38()  throws Throwable  {
      Database database0 = new Database((Environment) null);
      // Undeclared exception!
      try { 
        database0.preload((-1016L));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.Database", e);
      }
  }

  @Test
  public void test39()  throws Throwable  {
      Database database0 = new Database((Environment) null);
      // Undeclared exception!
      try { 
        database0.preload(0L, 628L);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.Database", e);
      }
  }

  @Test
  public void test40()  throws Throwable  {
      Database database0 = new Database((Environment) null);
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      // Undeclared exception!
      try { 
        database0.putNoOverwrite((Transaction) null, databaseEntry0, databaseEntry0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.Database", e);
      }
  }

  @Test
  public void test41()  throws Throwable  {
      Database database0 = new Database((Environment) null);
      database0.addCursor((Cursor) null);
  }

  @Test
  public void test42()  throws Throwable  {
      Database database0 = new Database((Environment) null);
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      SequenceConfig sequenceConfig0 = new SequenceConfig();
      // Undeclared exception!
      try { 
        database0.openSequence((Transaction) null, databaseEntry0, sequenceConfig0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.Database", e);
      }
  }

  @Test
  public void test43()  throws Throwable  {
      Database database0 = new Database((Environment) null);
      database0.hook44();
  }

  @Test
  public void test44()  throws Throwable  {
      Database database0 = new Database((Environment) null);
      DatabaseImpl databaseImpl0 = database0.getDatabaseImpl();
      assertNull(databaseImpl0);
  }

  @Test
  public void test45()  throws Throwable  {
      Database database0 = new Database((Environment) null);
      // Undeclared exception!
      try { 
        database0.removeTrigger((DatabaseTrigger) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.Database", e);
      }
  }

  @Test
  public void test46()  throws Throwable  {
      Database database0 = new Database((Environment) null);
      database0.hook57();
  }

  @Test
  public void test47()  throws Throwable  {
      Database database0 = new Database((Environment) null);
      database0.hook55();
  }

  @Test
  public void test48()  throws Throwable  {
      Database database0 = new Database((Environment) null);
      CursorConfig cursorConfig0 = CursorConfig.READ_UNCOMMITTED;
      // Undeclared exception!
      try { 
        database0.newDbcInstance((Transaction) null, cursorConfig0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.Database", e);
      }
  }

  @Test
  public void test49()  throws Throwable  {
      Database database0 = new Database((Environment) null);
      Environment environment0 = database0.getEnvironment();
      assertNull(environment0);
  }

  @Test
  public void test50()  throws Throwable  {
      Database database0 = new Database((Environment) null);
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      // Undeclared exception!
      try { 
        database0.removeSequence((Transaction) null, databaseEntry0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.Database", e);
      }
  }

  @Test
  public void test51()  throws Throwable  {
      Database database0 = new Database((Environment) null);
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      // Undeclared exception!
      try { 
        database0.putInternal((Transaction) null, databaseEntry0, databaseEntry0, (PutMode) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.Database", e);
      }
  }

  @Test
  public void test52()  throws Throwable  {
      Database database0 = new Database((Environment) null);
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      database0.hook47((Transaction) null, databaseEntry0);
      assertEquals(0, databaseEntry0.getPartialLength());
  }

  @Test
  public void test53()  throws Throwable  {
      Database database0 = new Database((Environment) null);
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      database0.hook50((Transaction) null, databaseEntry0, databaseEntry0);
      assertEquals(0, databaseEntry0.getPartialLength());
  }

  @Test
  public void test54()  throws Throwable  {
      Database database0 = new Database((Environment) null);
      byte[] byteArray0 = new byte[3];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0);
      LockMode lockMode0 = LockMode.DIRTY_READ;
      database0.hook49((Transaction) null, databaseEntry0, databaseEntry0, lockMode0);
      assertEquals(0, databaseEntry0.getOffset());
  }

  @Test
  public void test55()  throws Throwable  {
      Database database0 = new Database((Environment) null);
      Database.Database_acquireTriggerListReadLock database_Database_acquireTriggerListReadLock0 = new Database.Database_acquireTriggerListReadLock(database0);
      database_Database_acquireTriggerListReadLock0.execute();
      List list0 = database0.getSecondaryDatabases();
      database0.hook53(list0);
      assertEquals(0, list0.size());
  }

  @Test
  public void test56()  throws Throwable  {
      Database database0 = new Database((Environment) null);
      // Undeclared exception!
      try { 
        database0.addTrigger((DatabaseTrigger) null, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.Database", e);
      }
  }
}
