/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 21 19:19:01 KST 2017
 */

package com.sleepycat.je;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.fail;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.sleepycat.je.txn.Locker;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class ForeignKeyTrigger_ESTest7 extends ForeignKeyTrigger_ESTest_scaffolding7 {

  @Test
  public void test0()  throws Throwable  {
      ForeignKeyTrigger foreignKeyTrigger0 = new ForeignKeyTrigger((SecondaryDatabase) null);
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      // Undeclared exception!
      try { 
        foreignKeyTrigger0.databaseUpdated((Database) null, (Locker) null, databaseEntry0, databaseEntry0, (DatabaseEntry) null);
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
      ForeignKeyTrigger foreignKeyTrigger0 = new ForeignKeyTrigger((SecondaryDatabase) null);
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      // Undeclared exception!
      try { 
        foreignKeyTrigger0.databaseUpdated((Database) null, (Locker) null, (DatabaseEntry) null, databaseEntry0, (DatabaseEntry) null);
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
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      foreignKeyTrigger0.databaseUpdated((Database) null, (Locker) null, databaseEntry0, (DatabaseEntry) null, databaseEntry0);
      assertFalse(databaseEntry0.getPartial());
  }

  @Test
  public void test3()  throws Throwable  {
      ForeignKeyTrigger foreignKeyTrigger0 = new ForeignKeyTrigger((SecondaryDatabase) null);
      foreignKeyTrigger0.triggerAdded((Database) null);
  }

  @Test
  public void test4()  throws Throwable  {
      ForeignKeyTrigger foreignKeyTrigger0 = new ForeignKeyTrigger((SecondaryDatabase) null);
      // Undeclared exception!
      try { 
        foreignKeyTrigger0.triggerRemoved((Database) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.ForeignKeyTrigger", e);
      }
  }
}
