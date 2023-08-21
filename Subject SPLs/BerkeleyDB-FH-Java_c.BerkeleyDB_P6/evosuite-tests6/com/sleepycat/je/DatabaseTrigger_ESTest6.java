/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 21 23:14:35 KST 2017
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

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class DatabaseTrigger_ESTest6 extends DatabaseTrigger_ESTest_scaffolding6 {

  @Test
  public void test0()  throws Throwable  {
      SecondaryTrigger secondaryTrigger0 = new SecondaryTrigger((SecondaryDatabase) null);
      secondaryTrigger0.triggerAdded((Database) null);
  }

  @Test
  public void test1()  throws Throwable  {
      ForeignKeyTrigger foreignKeyTrigger0 = new ForeignKeyTrigger((SecondaryDatabase) null);
      byte[] byteArray0 = new byte[8];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0, (-5081), 175);
      foreignKeyTrigger0.databaseUpdated((Database) null, (Locker) null, databaseEntry0, databaseEntry0, databaseEntry0);
      assertEquals(-5081, databaseEntry0.getOffset());
  }

  @Test
  public void test2()  throws Throwable  {
      SecondaryTrigger secondaryTrigger0 = new SecondaryTrigger((SecondaryDatabase) null);
      // Undeclared exception!
      try { 
        secondaryTrigger0.triggerRemoved((Database) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.SecondaryTrigger", e);
      }
  }
}
