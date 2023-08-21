/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 21 19:04:23 KST 2017
 */

package com.sleepycat.je;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class Database_ESTest7 extends Database_ESTest_scaffolding7 {

  @Test
  public void test0()  throws Throwable  {
      Database.DbState database_DbState0 = Database.OPEN;
      String string0 = database_DbState0.toString();
      assertEquals("DbState.OPEN", string0);
  }

  @Test
  public void test1()  throws Throwable  {
      Database.DbState database_DbState0 = new Database.DbState("3");
  }

  @Test
  public void test2()  throws Throwable  {
      Database.Database_acquireTriggerListWriteLock database_Database_acquireTriggerListWriteLock0 = new Database.Database_acquireTriggerListWriteLock((Database) null);
      // Undeclared exception!
      try { 
        database_Database_acquireTriggerListWriteLock0.execute();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.Database", e);
      }
  }

  @Test
  public void test3()  throws Throwable  {
      Database database0 = null;
      try {
        database0 = new Database((Environment) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.Database", e);
      }
  }

  @Test
  public void test4()  throws Throwable  {
      Database.Database_acquireTriggerListReadLock database_Database_acquireTriggerListReadLock0 = new Database.Database_acquireTriggerListReadLock((Database) null);
      // Undeclared exception!
      try { 
        database_Database_acquireTriggerListReadLock0.execute();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.Database", e);
      }
  }

  @Test
  public void test5()  throws Throwable  {
      Database.Database_releaseTriggerListWriteLock database_Database_releaseTriggerListWriteLock0 = new Database.Database_releaseTriggerListWriteLock((Database) null);
      // Undeclared exception!
      try { 
        database_Database_releaseTriggerListWriteLock0.execute();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.Database", e);
      }
  }
}
