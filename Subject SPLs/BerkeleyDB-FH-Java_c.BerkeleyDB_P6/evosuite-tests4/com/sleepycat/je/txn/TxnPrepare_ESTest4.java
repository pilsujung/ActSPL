/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 16:39:32 KST 2017
 */

package com.sleepycat.je.txn;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.fail;

import java.io.StringWriter;
import java.nio.BufferOverflowException;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;

import javax.transaction.xa.Xid;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.sleepycat.je.log.LogEntryType;
import com.sleepycat.je.log.LogUtils;

import sun.nio.cs.ext.MS949;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class TxnPrepare_ESTest4 extends TxnPrepare_ESTest_scaffolding4 {

  @Test
  public void test00()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      LogUtils.XidImpl logUtils_XidImpl0 = new LogUtils.XidImpl((-5), byteArray0, byteArray0);
      TxnPrepare txnPrepare0 = new TxnPrepare((-6L), (Xid) logUtils_XidImpl0);
      LogUtils.XidImpl logUtils_XidImpl1 = (LogUtils.XidImpl)txnPrepare0.getXid();
      assertEquals(-5, logUtils_XidImpl1.getFormatId());
  }

  @Test
  public void test01()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      LogUtils.XidImpl logUtils_XidImpl0 = new LogUtils.XidImpl((-603), byteArray0, byteArray0);
      TxnPrepare txnPrepare0 = new TxnPrepare(1L, (Xid) logUtils_XidImpl0);
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("<Xid formatId=\"-603\" gTxnId=\"h\u0000\u5E06\u0000\u0000\u91AF\u0000\" bqual=\"h\u0000\u5E06\u0000\u0000\u91AF\u0000\"/>");
      CharBuffer charBuffer0 = mS949_0.decode(byteBuffer0);
      ByteBuffer byteBuffer1 = mS949_0.encode(charBuffer0);
      txnPrepare0.readFromLog(byteBuffer1, (byte) (-53));
      assertFalse(txnPrepare0.countAsObsoleteWhenLogged());
  }

  @Test
  public void test02()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      LogUtils.XidImpl logUtils_XidImpl0 = new LogUtils.XidImpl((-603), byteArray0, byteArray0);
      TxnPrepare txnPrepare0 = new TxnPrepare(1L, (Xid) logUtils_XidImpl0);
      StringWriter stringWriter0 = new StringWriter((int) (byte)104);
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      txnPrepare0.dumpLog(stringBuffer0, true);
      //  // Unstable assertion: assertEquals("<TxnPrepare id=\"1\" xid=\"<Xid formatId=\"-603\" gTxnId=\"\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\" bqual=\"\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\"/>\" time=\"2017-04-22 16:39:24.234\"></TxnPrepare>", stringBuffer0.toString());
      //  // Unstable assertion: assertEquals("<TxnPrepare id=\"1\" xid=\"<Xid formatId=\"-603\" gTxnId=\"\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\" bqual=\"\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\"/>\" time=\"2017-04-22 16:39:24.234\"></TxnPrepare>", stringWriter0.toString());
  }

  @Test
  public void test03()  throws Throwable  {
      TxnPrepare txnPrepare0 = new TxnPrepare();
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("+L");
      // Undeclared exception!
      try { 
        txnPrepare0.writeToLog(byteBuffer0);
        fail("Expecting exception: BufferOverflowException");
      
      } catch(BufferOverflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.nio.Buffer", e);
      }
  }

  @Test
  public void test04()  throws Throwable  {
      TxnPrepare txnPrepare0 = new TxnPrepare();
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("l;p0|e0q$Tw%E J");
      // Undeclared exception!
      try { 
        txnPrepare0.writeToLog(byteBuffer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.LogUtils", e);
      }
  }

  @Test
  public void test05()  throws Throwable  {
      TxnPrepare txnPrepare0 = new TxnPrepare();
      // Undeclared exception!
      try { 
        txnPrepare0.readFromLog((ByteBuffer) null, (byte)97);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.LogUtils", e);
      }
  }


  @Test
  public void test07()  throws Throwable  {
      TxnPrepare txnPrepare0 = new TxnPrepare(4294967295L, (Xid) null);
      LogEntryType logEntryType0 = txnPrepare0.getLogType();
      assertFalse(logEntryType0.isNodeType());
  }


  @Test
  public void test09()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      LogUtils.XidImpl logUtils_XidImpl0 = new LogUtils.XidImpl((-1), byteArray0, byteArray0);
      TxnPrepare txnPrepare0 = new TxnPrepare(2485L, (Xid) logUtils_XidImpl0);
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("NULL_LSN without KnownDeleted");
      // Undeclared exception!
      try { 
        txnPrepare0.readFromLog(byteBuffer0, (byte) (-123));
        fail("Expecting exception: BufferUnderflowException");
      
      } catch(BufferUnderflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.nio.HeapByteBuffer", e);
      }
  }

  @Test
  public void test10()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      LogUtils.XidImpl logUtils_XidImpl0 = new LogUtils.XidImpl((-1), byteArray0, byteArray0);
      TxnPrepare txnPrepare0 = new TxnPrepare(2485L, (Xid) logUtils_XidImpl0);
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("NULL_LSN without KnownDeleted");
      txnPrepare0.writeToLog(byteBuffer0);
      assertEquals(2485L, txnPrepare0.getId());
  }

  @Test
  public void test11()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      LogUtils.XidImpl logUtils_XidImpl0 = new LogUtils.XidImpl((-1), byteArray0, byteArray0);
      TxnPrepare txnPrepare0 = new TxnPrepare(2485L, (Xid) logUtils_XidImpl0);
      int int0 = txnPrepare0.getLogSize();
      assertEquals(24, int0);
  }

  @Test
  public void test12()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      LogUtils.XidImpl logUtils_XidImpl0 = new LogUtils.XidImpl((-1), byteArray0, byteArray0);
      TxnPrepare txnPrepare0 = new TxnPrepare(2485L, (Xid) logUtils_XidImpl0);
      String string0 = txnPrepare0.getTagName();
      assertEquals("TxnPrepare", string0);
  }

  @Test
  public void test13()  throws Throwable  {
      TxnPrepare txnPrepare0 = new TxnPrepare(4294967295L, (Xid) null);
      Xid xid0 = txnPrepare0.getXid();
      assertNull(xid0);
  }
}
