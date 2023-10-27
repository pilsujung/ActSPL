/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 02:26:42 KST 2017
 */

package com.sleepycat.je.txn;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.StringWriter;
import java.nio.BufferOverflowException;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

import javax.transaction.xa.Xid;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.sleepycat.je.log.LogEntryType;
import com.sleepycat.je.log.LogUtils;

import sun.nio.cs.ext.MS949;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class TxnEnd_ESTest10 extends TxnEnd_ESTest_scaffolding10 {

  @Test
  public void test00()  throws Throwable  {
      TxnCommit txnCommit0 = new TxnCommit();
      long long0 = txnCommit0.getTransactionId();
      assertEquals(0L, long0);
  }

  @Test
  public void test01()  throws Throwable  {
      TxnCommit txnCommit0 = new TxnCommit((-1L), (-1735L));
      txnCommit0.id = 288L;
      long long0 = txnCommit0.getTransactionId();
      assertEquals(288L, long0);
  }

  @Test
  public void test02()  throws Throwable  {
      TxnCommit txnCommit0 = new TxnCommit(2101L, 2101L);
      long long0 = txnCommit0.getLastLsn();
      assertEquals(2101L, long0);
      assertEquals(2101L, txnCommit0.getId());
  }

  @Test
  public void test03()  throws Throwable  {
      TxnCommit txnCommit0 = new TxnCommit();
      long long0 = txnCommit0.getLastLsn();
      assertEquals((-1L), long0);
  }

  @Test
  public void test04()  throws Throwable  {
      TxnCommit txnCommit0 = new TxnCommit();
      long long0 = txnCommit0.getId();
      assertEquals(0L, long0);
  }

  @Test
  public void test05()  throws Throwable  {
      TxnCommit txnCommit0 = new TxnCommit(1L, (-1L));
      long long0 = txnCommit0.getId();
      assertEquals(1L, long0);
  }

  @Test
  public void test06()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      LogUtils.XidImpl logUtils_XidImpl0 = new LogUtils.XidImpl(1045, byteArray0, byteArray0);
      TxnPrepare txnPrepare0 = new TxnPrepare(0L, (Xid) logUtils_XidImpl0);
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("<Xid formatId=\"1045\" gTxnId=\"\u0000\uFFFD\u0000w\u0000\uFFFD\" bqual=\"\u0000\uFFFD\u0000w\u0000\uFFFD\"/>");
      txnPrepare0.writeToLog(byteBuffer0);
      assertEquals(0L, txnPrepare0.getId());
  }

  @Test
  public void test07()  throws Throwable  {
      TxnAbort txnAbort0 = new TxnAbort();
      String string0 = txnAbort0.getTagName();
      assertEquals("TxnAbort", string0);
  }

  @Test
  public void test08()  throws Throwable  {
      TxnAbort txnAbort0 = new TxnAbort();
      LogEntryType logEntryType0 = txnAbort0.getLogType();
      assertFalse(logEntryType0.isNodeType());
  }

  @Test
  public void test09()  throws Throwable  {
      TxnCommit txnCommit0 = new TxnCommit();
      StringWriter stringWriter0 = new StringWriter();
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      txnCommit0.dumpLog(stringBuffer0, false);
      assertEquals(142, stringBuffer0.capacity());
      assertEquals("<TxnCommit id=\"0\" time=\"null\"><DbLsn val=\"0xffffffff/0xffffffff\"/></TxnCommit>", stringWriter0.toString());
  }

  @Test
  public void test10()  throws Throwable  {
      TxnCommit txnCommit0 = new TxnCommit();
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("hl/~u<(gw[G.\"N");
      // Undeclared exception!
      try { 
        txnCommit0.writeToLog(byteBuffer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.LogUtils", e);
      }
  }

  @Test
  public void test11()  throws Throwable  {
      TxnAbort txnAbort0 = new TxnAbort();
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("");
      // Undeclared exception!
      try { 
        txnAbort0.readFromLog(byteBuffer0, (byte)0);
        fail("Expecting exception: BufferUnderflowException");
      
      } catch(BufferUnderflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.nio.Buffer", e);
      }
  }

  @Test
  public void test12()  throws Throwable  {
      TxnCommit txnCommit0 = new TxnCommit();
      // Undeclared exception!
      try { 
        txnCommit0.readFromLog((ByteBuffer) null, (byte) (-5));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.LogUtils", e);
      }
  }


  @Test
  public void test14()  throws Throwable  {
      TxnCommit txnCommit0 = new TxnCommit((-1L), (-1735L));
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode(":bgy,3agDS+IxWlH~");
      // Undeclared exception!
      try { 
        txnCommit0.writeToLog(byteBuffer0);
        fail("Expecting exception: BufferOverflowException");
      
      } catch(BufferOverflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.nio.Buffer", e);
      }
  }

  @Test
  public void test15()  throws Throwable  {
      TxnCommit txnCommit0 = new TxnCommit((-1L), (-1735L));
      boolean boolean0 = txnCommit0.marshallOutsideWriteLatch();
      assertEquals((-1L), txnCommit0.getTransactionId());
      assertTrue(boolean0);
  }

  @Test
  public void test16()  throws Throwable  {
      TxnAbort txnAbort0 = new TxnAbort((-3365L), 0L);
      long long0 = txnAbort0.getLastLsn();
      assertEquals(0L, long0);
      assertEquals((-3365L), txnAbort0.getTransactionId());
  }

  @Test
  public void test17()  throws Throwable  {
      TxnAbort txnAbort0 = new TxnAbort((-1L), (-1L));
      txnAbort0.postLogWork((-1L));
      assertEquals((-1L), txnAbort0.getId());
  }

  @Test
  public void test18()  throws Throwable  {
      TxnAbort txnAbort0 = new TxnAbort();
      int int0 = txnAbort0.getLogSize();
      assertEquals(24, int0);
  }

  @Test
  public void test19()  throws Throwable  {
      TxnAbort txnAbort0 = new TxnAbort();
      boolean boolean0 = txnAbort0.logEntryIsTransactional();
      assertTrue(boolean0);
  }

  @Test
  public void test20()  throws Throwable  {
      TxnCommit txnCommit0 = new TxnCommit((-2314L), 0L);
      long long0 = txnCommit0.getTransactionId();
      assertEquals((-2314L), long0);
  }

  @Test
  public void test21()  throws Throwable  {
      TxnAbort txnAbort0 = new TxnAbort(1L, 1L);
      // Undeclared exception!
      try { 
        txnAbort0.dumpLog((StringBuffer) null, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.txn.TxnEnd", e);
      }
  }

  @Test
  public void test22()  throws Throwable  {
      TxnAbort txnAbort0 = new TxnAbort();
      boolean boolean0 = txnAbort0.countAsObsoleteWhenLogged();
      assertFalse(boolean0);
  }

  @Test
  public void test23()  throws Throwable  {
      TxnAbort txnAbort0 = new TxnAbort((-1L), 0L);
      long long0 = txnAbort0.getId();
      assertEquals((-1L), long0);
  }

  @Test
  public void test24()  throws Throwable  {
      TxnAbort txnAbort0 = new TxnAbort();
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode(" while flushing INList. nEntries = ");
      txnAbort0.readFromLog(byteBuffer0, (byte) (-94));
      assertEquals(0, byteBuffer0.arrayOffset());
  }
}