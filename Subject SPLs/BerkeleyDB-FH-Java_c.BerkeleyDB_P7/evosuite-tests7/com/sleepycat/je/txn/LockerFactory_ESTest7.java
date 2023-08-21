/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 21 21:49:04 KST 2017
 */

package com.sleepycat.je.txn;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.fail;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.sleepycat.je.Database;
import com.sleepycat.je.Environment;
import com.sleepycat.je.Transaction;
import com.sleepycat.je.TransactionConfig;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class LockerFactory_ESTest7 extends LockerFactory_ESTest_scaffolding7 {

  @Test
  public void test0()  throws Throwable  {
      // Undeclared exception!
      try { 
        LockerFactory.getReadableLocker((Environment) null, (Transaction) null, true, false, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.DbInternal", e);
      }
  }

  @Test
  public void test1()  throws Throwable  {
      TransactionConfig transactionConfig0 = new TransactionConfig();
      // Undeclared exception!
      try { 
        LockerFactory.getWritableLocker((Environment) null, (Transaction) null, true, true, transactionConfig0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.DbInternal", e);
      }
  }

  @Test
  public void test2()  throws Throwable  {
      // Undeclared exception!
      try { 
        LockerFactory.getReadableLocker((Environment) null, (Database) null, (Locker) null, true, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.DbInternal", e);
      }
  }

  @Test
  public void test3()  throws Throwable  {
      // Undeclared exception!
      try { 
        LockerFactory.getReadableLocker((Environment) null, (Transaction) null, true, true, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.DbInternal", e);
      }
  }

  @Test
  public void test4()  throws Throwable  {
      // Undeclared exception!
      try { 
        LockerFactory.getWritableLocker((Environment) null, (Transaction) null, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.DbInternal", e);
      }
  }

  @Test
  public void test5()  throws Throwable  {
      LockerFactory lockerFactory0 = new LockerFactory();
  }
}
