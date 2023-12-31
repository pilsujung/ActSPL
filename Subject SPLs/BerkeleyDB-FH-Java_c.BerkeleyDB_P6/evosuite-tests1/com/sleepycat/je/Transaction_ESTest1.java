/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 21 18:56:28 KST 2017
 */

package com.sleepycat.je;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.sleepycat.je.txn.Txn;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class Transaction_ESTest1 extends Transaction_ESTest_scaffolding1 {

  @Test
  public void test00()  throws Throwable  {
      Txn txn0 = new Txn();
      txn0.setOnlyAbortable();
      Transaction transaction0 = new Transaction((Environment) null, txn0);
      Txn txn1 = transaction0.getTxn();
      assertEquals(0L, txn1.getTransactionId());
  }

  @Test
  public void test01()  throws Throwable  {
      Txn txn0 = new Txn();
      Transaction transaction0 = new Transaction((Environment) null, txn0);
      txn0.addLogInfo(1299L);
      Txn txn1 = transaction0.getTxn();
      assertFalse(txn1.isReadCommittedIsolation());
  }

  @Test
  public void test02()  throws Throwable  {
      Txn txn0 = new Txn();
      Transaction transaction0 = new Transaction((Environment) null, txn0);
      // Undeclared exception!
      try { 
        transaction0.abort();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.Transaction", e);
      }
  }

  @Test
  public void test03()  throws Throwable  {
      Transaction transaction0 = null;
      try {
        transaction0 = new Transaction((Environment) null, (Txn) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.Transaction", e);
      }
  }

  @Test
  public void test04()  throws Throwable  {
      Txn txn0 = new Txn();
      Transaction transaction0 = new Transaction((Environment) null, txn0);
      Txn txn1 = (Txn)transaction0.getLocker();
      assertFalse(txn1.isReadCommittedIsolation());
  }

  @Test
  public void test05()  throws Throwable  {
      Txn txn0 = new Txn();
      Transaction transaction0 = new Transaction((Environment) null, txn0);
      transaction0.setName("je.cleaner.bytesInterval");
      String string0 = transaction0.toString();
      assertEquals("<Transaction id=\"0\" name=\"je.cleaner.bytesInterval\">", string0);
  }

  @Test
  public void test06()  throws Throwable  {
      Txn txn0 = new Txn();
      Transaction transaction0 = new Transaction((Environment) null, txn0);
      String string0 = transaction0.toString();
      assertEquals("<Transaction id=\"0\">", string0);
  }

  @Test
  public void test07()  throws Throwable  {
      Txn txn0 = new Txn();
      Transaction transaction0 = new Transaction((Environment) null, txn0);
      boolean boolean0 = transaction0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test
  public void test08()  throws Throwable  {
      Txn txn0 = new Txn();
      Transaction transaction0 = new Transaction((Environment) null, txn0);
      boolean boolean0 = transaction0.equals(txn0.ACCUMULATED_LIMIT);
      assertFalse(boolean0);
  }

  @Test
  public void test09()  throws Throwable  {
      Txn txn0 = new Txn();
      Transaction transaction0 = new Transaction((Environment) null, txn0);
      // Undeclared exception!
      try { 
        transaction0.commitNoSync();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.Transaction", e);
      }
  }

  @Test
  public void test10()  throws Throwable  {
      Txn txn0 = new Txn();
      Transaction transaction0 = new Transaction((Environment) null, txn0);
      long long0 = transaction0.getId();
      assertEquals(0L, long0);
  }

  @Test
  public void test11()  throws Throwable  {
      Txn txn0 = new Txn();
      Transaction transaction0 = new Transaction((Environment) null, txn0);
      transaction0.getTxn();
      txn0.addLogInfo(0L);
      assertTrue(txn0.logEntryIsTransactional());
  }

  @Test
  public void test12()  throws Throwable  {
      Txn txn0 = new Txn();
      Transaction transaction0 = new Transaction((Environment) null, txn0);
      transaction0.setName("m)]n-QU\"7=)qq=A!,X");
      String string0 = transaction0.getName();
      assertEquals("m)]n-QU\"7=)qq=A!,X", string0);
  }

  @Test
  public void test13()  throws Throwable  {
      Txn txn0 = new Txn();
      Transaction transaction0 = new Transaction((Environment) null, txn0);
      // Undeclared exception!
      try { 
        transaction0.commitSync();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.Transaction", e);
      }
  }

  @Test
  public void test14()  throws Throwable  {
      Txn txn0 = new Txn();
      Transaction transaction0 = new Transaction((Environment) null, txn0);
      // Undeclared exception!
      try { 
        transaction0.setLockTimeout((-77));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.Transaction", e);
      }
  }

  @Test
  public void test15()  throws Throwable  {
      Txn txn0 = new Txn();
      Transaction transaction0 = new Transaction((Environment) null, txn0);
      // Undeclared exception!
      try { 
        transaction0.commit();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.Transaction", e);
      }
  }

  @Test
  public void test16()  throws Throwable  {
      Txn txn0 = new Txn();
      Transaction transaction0 = new Transaction((Environment) null, txn0);
      transaction0.hashCode();
  }

  @Test
  public void test17()  throws Throwable  {
      Txn txn0 = new Txn();
      Transaction transaction0 = new Transaction((Environment) null, txn0);
      String string0 = transaction0.getName();
      assertNull(string0);
  }

  @Test
  public void test18()  throws Throwable  {
      Txn txn0 = new Txn();
      Transaction transaction0 = new Transaction((Environment) null, txn0);
      // Undeclared exception!
      try { 
        transaction0.commitWriteNoSync();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.Transaction", e);
      }
  }

  @Test
  public void test19()  throws Throwable  {
      Txn txn0 = new Txn();
      Transaction transaction0 = new Transaction((Environment) null, txn0);
      // Undeclared exception!
      try { 
        transaction0.setTxnTimeout((-77));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.Transaction", e);
      }
  }
}
