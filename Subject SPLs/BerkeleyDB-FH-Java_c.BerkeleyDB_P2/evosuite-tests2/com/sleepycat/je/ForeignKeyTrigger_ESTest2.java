/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 21 22:39:12 KST 2017
 */

package com.sleepycat.je;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.sleepycat.je.Database;
import com.sleepycat.je.DatabaseEntry;
import com.sleepycat.je.ForeignKeyTrigger;
import com.sleepycat.je.SecondaryDatabase;
import com.sleepycat.je.txn.Txn;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class ForeignKeyTrigger_ESTest2 extends ForeignKeyTrigger_ESTest_scaffolding2 {

  @Test
  public void test0()  throws Throwable  {
      ForeignKeyTrigger foreignKeyTrigger0 = new ForeignKeyTrigger((SecondaryDatabase) null);
      Txn txn0 = new Txn();
      byte[] byteArray0 = new byte[0];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0, 0, 0);
      // Undeclared exception!
      try { 
        foreignKeyTrigger0.databaseUpdated((Database) null, txn0, databaseEntry0, databaseEntry0, (DatabaseEntry) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.ForeignKeyTrigger", e);
      }
  }

  @Test
  public void test1()  throws Throwable  {
      SecondaryDatabase secondaryDatabase0 = null;
      ForeignKeyTrigger foreignKeyTrigger0 = new ForeignKeyTrigger((SecondaryDatabase) null);
      Txn txn0 = new Txn();
      // Undeclared exception!
      try { 
        foreignKeyTrigger0.databaseUpdated((Database) null, txn0, (DatabaseEntry) null, (DatabaseEntry) null, (DatabaseEntry) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.ForeignKeyTrigger", e);
      }
  }

  @Test
  public void test2()  throws Throwable  {
      ForeignKeyTrigger foreignKeyTrigger0 = new ForeignKeyTrigger((SecondaryDatabase) null);
      Txn txn0 = new Txn();
      byte[] byteArray0 = new byte[6];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0, (int) (byte)0, (int) (byte) (-1));
      // Undeclared exception!
      try { 
        foreignKeyTrigger0.databaseUpdated((Database) null, txn0, (DatabaseEntry) null, databaseEntry0, (DatabaseEntry) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.ForeignKeyTrigger", e);
      }
  }

  @Test
  public void test3()  throws Throwable  {
      ForeignKeyTrigger foreignKeyTrigger0 = new ForeignKeyTrigger((SecondaryDatabase) null);
      Txn txn0 = new Txn();
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      foreignKeyTrigger0.databaseUpdated((Database) null, txn0, databaseEntry0, databaseEntry0, databaseEntry0);
      assertEquals(0L, txn0.getId());
  }


}