/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 09:27:15 KST 2017
 */

package com.sleepycat.je;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.sleepycat.je.txn.Locker;
import com.sleepycat.je.txn.Txn;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class DatabaseTrigger_ESTest5 extends DatabaseTrigger_ESTest_scaffolding5 {

  @Test
  public void test0()  throws Throwable  {
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      ForeignKeyTrigger foreignKeyTrigger0 = new ForeignKeyTrigger((SecondaryDatabase) null);
      foreignKeyTrigger0.databaseUpdated((Database) null, (Locker) null, databaseEntry0, databaseEntry0, databaseEntry0);
      assertEquals(0, databaseEntry0.getOffset());
  }



  @Test
  public void test3()  throws Throwable  {
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      SecondaryTrigger secondaryTrigger0 = new SecondaryTrigger((SecondaryDatabase) null);
      Txn txn0 = new Txn();
      // Undeclared exception!
      try { 
        secondaryTrigger0.databaseUpdated((Database) null, txn0, databaseEntry0, databaseEntry0, databaseEntry0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.SecondaryTrigger", e);
      }
  }
}
