/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 09:50:34 KST 2017
 */

package com.sleepycat.je;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.fail;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.sleepycat.je.txn.Locker;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class SecondaryTrigger_ESTest5 extends SecondaryTrigger_ESTest_scaffolding5 {

  @Test
  public void test0()  throws Throwable  {
      SecondaryTrigger secondaryTrigger0 = new SecondaryTrigger((SecondaryDatabase) null);
      byte[] byteArray0 = new byte[1];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0);
      DatabaseEntry databaseEntry1 = new DatabaseEntry();
      // Undeclared exception!
      try { 
        secondaryTrigger0.databaseUpdated((Database) null, (Locker) null, databaseEntry0, databaseEntry0, databaseEntry1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.SecondaryTrigger", e);
      }
  }

  @Test
  public void test1()  throws Throwable  {
      SecondaryTrigger secondaryTrigger0 = new SecondaryTrigger((SecondaryDatabase) null);
      byte[] byteArray0 = new byte[8];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0);
      DatabaseEntry databaseEntry1 = new DatabaseEntry();
      // Undeclared exception!
      try { 
        secondaryTrigger0.databaseUpdated((Database) null, (Locker) null, databaseEntry0, databaseEntry1, databaseEntry1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.SecondaryTrigger", e);
      }
  }



}
