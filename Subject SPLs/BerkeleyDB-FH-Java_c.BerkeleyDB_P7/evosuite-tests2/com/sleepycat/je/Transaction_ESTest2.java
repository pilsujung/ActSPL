/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 21 22:27:04 KST 2017
 */

package com.sleepycat.je;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.sleepycat.je.Environment;
import com.sleepycat.je.Transaction;
import com.sleepycat.je.dbi.DatabaseImpl;
import com.sleepycat.je.txn.Txn;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import sun.nio.cs.ext.MS949;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class Transaction_ESTest2 extends Transaction_ESTest_scaffolding2 {

  @Test
  public void test00()  throws Throwable  {
      Txn txn0 = new Txn();
      Transaction transaction0 = new Transaction((Environment) null, txn0);
      transaction0.getTxn();
      txn0.setSuspended(true);
      assertEquals(0L, txn0.getId());
  }

  @Test
  public void test01()  throws Throwable  {
      Txn txn0 = new Txn();
      Transaction transaction0 = new Transaction((Environment) null, txn0);
      transaction0.getTxn();
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("<Transaction id=\"0\">");
      txn0.readFromLog(byteBuffer0, (byte)24);
      assertFalse(byteBuffer0.isReadOnly());
  }

  @Test
  public void test02()  throws Throwable  {
      Txn txn0 = new Txn();
      Transaction transaction0 = new Transaction((Environment) null, txn0);
      txn0.setOnlyAbortable();
      Txn txn1 = transaction0.getTxn();
      assertFalse(txn1.isSerializableIsolation());
  }

  @Test
  public void test03()  throws Throwable  {
      Txn txn0 = new Txn();
      Transaction transaction0 = new Transaction((Environment) null, txn0);
      txn0.addLogInfo(1100L);
      Txn txn1 = transaction0.getTxn();
      assertFalse(txn1.isReadUncommittedDefault());
  }

  @Test
  public void test04()  throws Throwable  {
      Txn txn0 = new Txn();
      Transaction transaction0 = new Transaction((Environment) null, txn0);
      transaction0.setName("dnc<B,zUg");
      String string0 = transaction0.getName();
      assertEquals("dnc<B,zUg", string0);
  }


  @Test
  public void test06()  throws Throwable  {
      Txn txn0 = new Txn();
      Transaction transaction0 = new Transaction((Environment) null, txn0);
      Txn txn1 = (Txn)transaction0.getLocker();
      assertFalse(txn1.isSuspended());
  }


  @Test
  public void test08()  throws Throwable  {
      Txn txn0 = new Txn();
      Transaction transaction0 = new Transaction((Environment) null, txn0);
      boolean boolean0 = transaction0.equals("<Transaction id=\"0\">");
      assertFalse(boolean0);
  }


  @Test
  public void test10()  throws Throwable  {
      Txn txn0 = new Txn();
      Transaction transaction0 = new Transaction((Environment) null, txn0);
      boolean boolean0 = transaction0.equals(transaction0);
      assertTrue(boolean0);
  }




  @Test
  public void test15()  throws Throwable  {
      Txn txn0 = new Txn();
      Transaction transaction0 = new Transaction((Environment) null, txn0);
      transaction0.setName("dnc<B,zUg");
      String string0 = transaction0.toString();
      assertEquals("<Transaction id=\"0\" name=\"dnc<B,zUg\">", string0);
  }


  @Test
  public void test17()  throws Throwable  {
      Txn txn0 = new Txn();
      Transaction transaction0 = new Transaction((Environment) null, txn0);
      // Undeclared exception!
      try { 
        transaction0.setLockTimeout(1847);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.Transaction", e);
      }
  }





  @Test
  public void test22()  throws Throwable  {
      Txn txn0 = new Txn();
      Transaction transaction0 = new Transaction((Environment) null, txn0);
      // Undeclared exception!
      try { 
        transaction0.setTxnTimeout(1847);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.Transaction", e);
      }
  }
}