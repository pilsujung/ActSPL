/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 03:45:36 KST 2017
 */

package com.sleepycat.je;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.sleepycat.je.txn.Txn;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class Transaction_ESTest3 extends Transaction_ESTest_scaffolding3 {

  @Test
  public void test00()  throws Throwable  {
      Txn txn0 = new Txn();
      Transaction transaction0 = new Transaction((Environment) null, txn0);
      txn0.setSuspended(true);
      Txn txn1 = transaction0.getTxn();
      assertEquals(16, txn1.getLogSize());
  }

  @Test
  public void test01()  throws Throwable  {
      Txn txn0 = new Txn();
      Transaction transaction0 = new Transaction((Environment) null, txn0);
      txn0.setOnlyAbortable();
      Txn txn1 = transaction0.getTxn();
      assertEquals(16, txn1.getLogSize());
  }

  @Test
  public void test02()  throws Throwable  {
      Txn txn0 = new Txn();
      Transaction transaction0 = new Transaction((Environment) null, txn0);
      transaction0.setName("<Transaction id=\"0\">");
      String string0 = transaction0.getName();
      assertEquals("<Transaction id=\"0\">", string0);
  }

  @Test
  public void test03()  throws Throwable  {
      Txn txn0 = new Txn();
      Transaction transaction0 = new Transaction((Environment) null, txn0);
      // Undeclared exception!
      try { 
        transaction0.setLockTimeout(0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.Transaction", e);
      }
  }


  @Test
  public void test05()  throws Throwable  {
      Txn txn0 = new Txn();
      Transaction transaction0 = new Transaction((Environment) null, txn0);
      Txn txn1 = (Txn)transaction0.getLocker();
      assertSame(txn0, txn1);
  }


  @Test
  public void test07()  throws Throwable  {
      Txn txn0 = new Txn();
      Transaction transaction0 = new Transaction((Environment) null, txn0);
      Object object0 = new Object();
      boolean boolean0 = transaction0.equals(object0);
      assertFalse(boolean0);
  }






  @Test
  public void test13()  throws Throwable  {
      Txn txn0 = new Txn();
      Transaction transaction0 = new Transaction((Environment) null, txn0);
      transaction0.setName("<Transaction id=\"0\">");
      String string0 = transaction0.toString();
      assertEquals("<Transaction id=\"0\" name=\"<Transaction id=\"0\">\">", string0);
  }






  @Test
  public void test19()  throws Throwable  {
      Txn txn0 = new Txn();
      Transaction transaction0 = new Transaction((Environment) null, txn0);
      // Undeclared exception!
      try { 
        transaction0.setTxnTimeout(0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.Transaction", e);
      }
  }
}
