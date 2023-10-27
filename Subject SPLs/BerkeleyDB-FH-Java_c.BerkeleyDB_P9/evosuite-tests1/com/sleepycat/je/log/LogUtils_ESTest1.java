/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 21 19:54:44 KST 2017
 */

package com.sleepycat.je.log;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.StringWriter;
import java.nio.BufferOverflowException;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.sql.Timestamp;
import java.time.Instant;

import javax.transaction.xa.Xid;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import sun.nio.cs.ext.MS949;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class LogUtils_ESTest1 extends LogUtils_ESTest_scaffolding1 {

  @Test
  public void test00()  throws Throwable  {
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("&Ds3o}6/W+Q\"");
      CharBuffer charBuffer0 = mS949_0.decode(byteBuffer0);
      ByteBuffer byteBuffer1 = mS949_0.encode(charBuffer0);
      byteBuffer1.compact();
      short short0 = LogUtils.readShort(byteBuffer1);
      assertEquals((short)0, short0);
  }

  @Test
  public void test01()  throws Throwable  {
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("<Xid formatId=\"255\" gTxnId=\"\uFFFD\u0010\u00000\uFFFD\u0000\uFFFD\" bqual=\"\uFFFD\u0010\u00000\uFFFD\u0000\uFFFD\"/>");
      long long0 = LogUtils.readLong(byteBuffer0);
      assertEquals(8245921732048279612L, long0);
  }

  @Test
  public void test02()  throws Throwable  {
      ByteBuffer byteBuffer0 = ByteBuffer.allocateDirect(1556);
      int int0 = LogUtils.readInt(byteBuffer0);
      assertEquals(0, int0);
  }

  @Test
  public void test03()  throws Throwable  {
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = ByteBuffer.allocateDirect(1551);
      CharBuffer charBuffer0 = mS949_0.decode(byteBuffer0);
      ByteBuffer byteBuffer1 = mS949_0.encode(charBuffer0);
      long long0 = LogUtils.getUnsignedInt(byteBuffer1);
      assertEquals(0L, long0);
  }

  @Test
  public void test04()  throws Throwable  {
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("<Xid formatId=\"596\" gTxnId=\"\uFFFD\u001C\u0000\uFFFDn\uFFFDq\" bqual=\"\uFFFD\u001C\u0000\uFFFDn\uFFFDq\"/>");
      CharBuffer charBuffer0 = mS949_0.decode(byteBuffer0);
      ByteBuffer byteBuffer1 = mS949_0.encode(charBuffer0);
      // Undeclared exception!
      try { 
        LogUtils.readXid(byteBuffer1);
        fail("Expecting exception: BufferUnderflowException");
      
      } catch(BufferUnderflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.nio.HeapByteBuffer", e);
      }
  }

  @Test
  public void test05()  throws Throwable  {
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("S14-m/6Q=g.Ia'%");
      int int0 = LogUtils.readIntMSB(byteBuffer0);
      assertEquals(1395733549, int0);
  }

  @Test
  public void test06()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte) (-128);
      ByteBuffer byteBuffer0 = ByteBuffer.wrap(byteArray0);
      int int0 = LogUtils.readIntMSB(byteBuffer0);
      assertEquals(Integer.MIN_VALUE, int0);
  }

  @Test
  public void test07()  throws Throwable  {
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("y$fFtIT~/?Tk+");
      LogUtils.writeInt(byteBuffer0, 5);
      assertFalse(byteBuffer0.isDirect());
  }

  @Test
  public void test08()  throws Throwable  {
      int int0 = LogUtils.getStringLogSize(".");
      assertEquals(5, int0);
  }

  @Test
  public void test09()  throws Throwable  {
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("y$fFtIT~/?Tk+");
      LogUtils.writeString(byteBuffer0, ".");
      assertEquals(5, byteBuffer0.position());
      assertEquals("java.nio.HeapByteBuffer[pos=5 lim=13 cap=26]", byteBuffer0.toString());
  }

  @Test
  public void test10()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      ByteBuffer byteBuffer0 = ByteBuffer.wrap(byteArray0);
      int int0 = LogUtils.readIntMSB(byteBuffer0);
      assertEquals(0, int0);
  }

  @Test
  public void test11()  throws Throwable  {
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("<");
      byte[] byteArray0 = new byte[9];
      LogUtils.XidImpl logUtils_XidImpl0 = new LogUtils.XidImpl(8, byteArray0, byteArray0);
      // Undeclared exception!
      try { 
        LogUtils.writeXid(byteBuffer0, logUtils_XidImpl0);
        fail("Expecting exception: BufferOverflowException");
      
      } catch(BufferOverflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.nio.Buffer", e);
      }
  }

  @Test
  public void test12()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      LogUtils.XidImpl logUtils_XidImpl0 = new LogUtils.XidImpl(189, byteArray0, byteArray0);
      // Undeclared exception!
      try { 
        LogUtils.writeXid((ByteBuffer) null, logUtils_XidImpl0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.LogUtils", e);
      }
  }

  @Test
  public void test13()  throws Throwable  {
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("+/2z");
      LogUtils.readBoolean(byteBuffer0);
      // Undeclared exception!
      try { 
        LogUtils.writeUnsignedInt(byteBuffer0, (byte)48);
        fail("Expecting exception: BufferOverflowException");
      
      } catch(BufferOverflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.nio.Buffer", e);
      }
  }

  @Test
  public void test14()  throws Throwable  {
      // Undeclared exception!
      try { 
        LogUtils.writeUnsignedInt((ByteBuffer) null, (-1285L));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.LogUtils", e);
      }
  }

  @Test
  public void test15()  throws Throwable  {
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("");
      // Undeclared exception!
      try { 
        LogUtils.writeTimestamp(byteBuffer0, (Timestamp) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.LogUtils", e);
      }
  }

  @Test
  public void test16()  throws Throwable  {
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("");
      // Undeclared exception!
      try { 
        LogUtils.writeString(byteBuffer0, "");
        fail("Expecting exception: BufferOverflowException");
      
      } catch(BufferOverflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.nio.Buffer", e);
      }
  }

  @Test
  public void test17()  throws Throwable  {
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode(".");
      // Undeclared exception!
      try { 
        LogUtils.writeShort(byteBuffer0, (short)5278);
        fail("Expecting exception: BufferOverflowException");
      
      } catch(BufferOverflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.nio.Buffer", e);
      }
  }

  @Test
  public void test18()  throws Throwable  {
      // Undeclared exception!
      try { 
        LogUtils.writeShort((ByteBuffer) null, (short)1466);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.LogUtils", e);
      }
  }

  @Test
  public void test19()  throws Throwable  {
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("G@{QAEL%B:&");
      LogUtils.writeUnsignedInt(byteBuffer0, 0L);
      // Undeclared exception!
      try { 
        LogUtils.writeLong(byteBuffer0, 0L);
        fail("Expecting exception: BufferOverflowException");
      
      } catch(BufferOverflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.nio.Buffer", e);
      }
  }

  @Test
  public void test20()  throws Throwable  {
      // Undeclared exception!
      try { 
        LogUtils.writeLong((ByteBuffer) null, 936L);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.LogUtils", e);
      }
  }

  @Test
  public void test21()  throws Throwable  {
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("EyoE?:`Y,UK");
      mS949_0.decode(byteBuffer0);
      // Undeclared exception!
      try { 
        LogUtils.writeIntMSB(byteBuffer0, 3);
        fail("Expecting exception: BufferOverflowException");
      
      } catch(BufferOverflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.nio.Buffer", e);
      }
  }

  @Test
  public void test22()  throws Throwable  {
      // Undeclared exception!
      try { 
        LogUtils.writeIntMSB((ByteBuffer) null, 3);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.LogUtils", e);
      }
  }

  @Test
  public void test23()  throws Throwable  {
      // Undeclared exception!
      try { 
        LogUtils.writeInt((ByteBuffer) null, (byte) (-32));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.LogUtils", e);
      }
  }

  @Test
  public void test24()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      // Undeclared exception!
      try { 
        LogUtils.writeByteArray((ByteBuffer) null, byteArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.LogUtils", e);
      }
  }

  @Test
  public void test25()  throws Throwable  {
      // Undeclared exception!
      try { 
        LogUtils.readXid((ByteBuffer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.LogUtils", e);
      }
  }

  @Test
  public void test26()  throws Throwable  {
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("&Ds3o}6/W+Q\"");
      mS949_0.decode(byteBuffer0);
      // Undeclared exception!
      try { 
        LogUtils.readTimestamp(byteBuffer0);
        fail("Expecting exception: BufferUnderflowException");
      
      } catch(BufferUnderflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.nio.Buffer", e);
      }
  }

  @Test
  public void test27()  throws Throwable  {
      // Undeclared exception!
      try { 
        LogUtils.readTimestamp((ByteBuffer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.LogUtils", e);
      }
  }

  @Test
  public void test28()  throws Throwable  {
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("{q`A1\"");
      LogUtils.getUnsignedInt(byteBuffer0);
      // Undeclared exception!
      try { 
        LogUtils.readString(byteBuffer0);
        fail("Expecting exception: BufferUnderflowException");
      
      } catch(BufferUnderflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.nio.Buffer", e);
      }
  }

  @Test
  public void test29()  throws Throwable  {
      // Undeclared exception!
      try { 
        LogUtils.readString((ByteBuffer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.LogUtils", e);
      }
  }

  @Test
  public void test30()  throws Throwable  {
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("");
      // Undeclared exception!
      try { 
        LogUtils.readShort(byteBuffer0);
        fail("Expecting exception: BufferUnderflowException");
      
      } catch(BufferUnderflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.nio.Buffer", e);
      }
  }

  @Test
  public void test31()  throws Throwable  {
      // Undeclared exception!
      try { 
        LogUtils.readShort((ByteBuffer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.LogUtils", e);
      }
  }

  @Test
  public void test32()  throws Throwable  {
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("TuN]#\"BXQh");
      mS949_0.decode(byteBuffer0);
      // Undeclared exception!
      try { 
        LogUtils.readLong(byteBuffer0);
        fail("Expecting exception: BufferUnderflowException");
      
      } catch(BufferUnderflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.nio.Buffer", e);
      }
  }

  @Test
  public void test33()  throws Throwable  {
      // Undeclared exception!
      try { 
        LogUtils.readLong((ByteBuffer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.LogUtils", e);
      }
  }

  @Test
  public void test34()  throws Throwable  {
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("");
      // Undeclared exception!
      try { 
        LogUtils.readIntMSB(byteBuffer0);
        fail("Expecting exception: BufferUnderflowException");
      
      } catch(BufferUnderflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.nio.Buffer", e);
      }
  }

  @Test
  public void test35()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      ByteBuffer byteBuffer0 = ByteBuffer.wrap(byteArray0);
      // Undeclared exception!
      try { 
        LogUtils.readInt(byteBuffer0);
        fail("Expecting exception: BufferUnderflowException");
      
      } catch(BufferUnderflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.nio.Buffer", e);
      }
  }

  @Test
  public void test36()  throws Throwable  {
      // Undeclared exception!
      try { 
        LogUtils.readInt((ByteBuffer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.LogUtils", e);
      }
  }

  @Test
  public void test37()  throws Throwable  {
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode(".");
      // Undeclared exception!
      try { 
        LogUtils.readByteArray(byteBuffer0);
        fail("Expecting exception: BufferUnderflowException");
      
      } catch(BufferUnderflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.nio.Buffer", e);
      }
  }

  @Test
  public void test38()  throws Throwable  {
      // Undeclared exception!
      try { 
        LogUtils.readByteArray((ByteBuffer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.LogUtils", e);
      }
  }

  @Test
  public void test39()  throws Throwable  {
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("+/2z");
      byteBuffer0.getFloat();
      // Undeclared exception!
      try { 
        LogUtils.readBoolean(byteBuffer0);
        fail("Expecting exception: BufferUnderflowException");
      
      } catch(BufferUnderflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.nio.Buffer", e);
      }
  }

  @Test
  public void test40()  throws Throwable  {
      // Undeclared exception!
      try { 
        LogUtils.readBoolean((ByteBuffer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.LogUtils", e);
      }
  }

  @Test
  public void test41()  throws Throwable  {
      // Undeclared exception!
      try { 
        LogUtils.getXidSize((Xid) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.LogUtils", e);
      }
  }

  @Test
  public void test42()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      ByteBuffer byteBuffer0 = ByteBuffer.wrap(byteArray0);
      // Undeclared exception!
      try { 
        LogUtils.getUnsignedInt(byteBuffer0);
        fail("Expecting exception: BufferUnderflowException");
      
      } catch(BufferUnderflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.nio.Buffer", e);
      }
  }

  @Test
  public void test43()  throws Throwable  {
      // Undeclared exception!
      try { 
        LogUtils.getUnsignedInt((ByteBuffer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.LogUtils", e);
      }
  }

  @Test
  public void test44()  throws Throwable  {
      // Undeclared exception!
      try { 
        LogUtils.getByteArrayLogSize((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.LogUtils", e);
      }
  }

  @Test
  public void test45()  throws Throwable  {
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode(".^G#/mq8a=jM");
      mS949_0.decode(byteBuffer0);
      StringWriter stringWriter0 = new StringWriter();
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      // Undeclared exception!
      try { 
        LogUtils.dumpBoolean(byteBuffer0, stringBuffer0, "bW!3j");
        fail("Expecting exception: BufferUnderflowException");
      
      } catch(BufferUnderflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.nio.Buffer", e);
      }
  }

  @Test
  public void test46()  throws Throwable  {
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("");
      // Undeclared exception!
      try { 
        LogUtils.dumpBoolean(byteBuffer0, (StringBuffer) null, ".");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.LogUtils", e);
      }
  }

  @Test
  public void test47()  throws Throwable  {
      ByteBuffer byteBuffer0 = ByteBuffer.allocateDirect(1556);
      LogUtils.readByteArray(byteBuffer0);
      assertEquals(1552, byteBuffer0.remaining());
      assertEquals(4, byteBuffer0.position());
  }

  @Test
  public void test48()  throws Throwable  {
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("\"/>");
      // Undeclared exception!
      try { 
        LogUtils.writeInt(byteBuffer0, 2928);
        fail("Expecting exception: BufferOverflowException");
      
      } catch(BufferOverflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.nio.Buffer", e);
      }
  }

  @Test
  public void test49()  throws Throwable  {
      ByteBuffer byteBuffer0 = ByteBuffer.allocateDirect(1556);
      long long0 = LogUtils.readLong(byteBuffer0);
      assertEquals(0L, long0);
  }

  @Test
  public void test50()  throws Throwable  {
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("T$&^G30PCo@f9NM");
      byte[] byteArray0 = new byte[8];
      LogUtils.writeByteArray(byteBuffer0, byteArray0);
      assertEquals("java.nio.HeapByteBuffer[pos=12 lim=15 cap=30]", byteBuffer0.toString());
      assertEquals(3, byteBuffer0.remaining());
  }

  @Test
  public void test51()  throws Throwable  {
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode(";T}H&CxT6VYFvV]F/%");
      int int0 = LogUtils.readInt(byteBuffer0);
      assertEquals(1216173115, int0);
  }

  @Test
  public void test52()  throws Throwable  {
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode(";T}H&CxT6VYFvV]F/%");
      LogUtils.writeLong(byteBuffer0, (byte) (-66));
      assertTrue(byteBuffer0.hasRemaining());
  }

  @Test
  public void test53()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      LogUtils.XidImpl logUtils_XidImpl0 = new LogUtils.XidImpl(1877, (byte[]) null, byteArray0);
      String string0 = logUtils_XidImpl0.toString();
      assertEquals("<Xid formatId=\"1877\" gTxnId=\"null\" bqual=\"\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\"/>", string0);
  }

  @Test
  public void test54()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      LogUtils.XidImpl logUtils_XidImpl0 = new LogUtils.XidImpl(596, byteArray0, byteArray0);
      String string0 = logUtils_XidImpl0.toString();
      assertEquals("<Xid formatId=\"596\" gTxnId=\"\u0000\u0000\u0000\u0000\u0000\u0000\u0000\" bqual=\"\u0000\u0000\u0000\u0000\u0000\u0000\u0000\"/>", string0);
  }

  @Test
  public void test55()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      LogUtils.XidImpl logUtils_XidImpl0 = new LogUtils.XidImpl(1877, (byte[]) null, byteArray0);
      boolean boolean0 = logUtils_XidImpl0.equals(logUtils_XidImpl0);
      assertTrue(boolean0);
      assertEquals(1877, logUtils_XidImpl0.getFormatId());
  }

  @Test
  public void test56()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      LogUtils.XidImpl logUtils_XidImpl0 = new LogUtils.XidImpl((-1321), byteArray0, byteArray0);
      Object object0 = new Object();
      boolean boolean0 = logUtils_XidImpl0.equals(object0);
      assertFalse(boolean0);
      assertEquals(-1321, logUtils_XidImpl0.getFormatId());
  }

  @Test
  public void test57()  throws Throwable  {
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode(".^G#/_qp=jM");
      byte[] byteArray0 = new byte[2];
      LogUtils.XidImpl logUtils_XidImpl0 = new LogUtils.XidImpl((-2117), byteArray0, byteArray0);
      LogUtils.writeXid(byteBuffer0, logUtils_XidImpl0);
      assertEquals(1, byteBuffer0.remaining());
      assertEquals(-2117, logUtils_XidImpl0.getFormatId());
  }

  @Test
  public void test58()  throws Throwable  {
      byte[] byteArray0 = new byte[25];
      LogUtils.XidImpl logUtils_XidImpl0 = new LogUtils.XidImpl(2, (byte[]) null, byteArray0);
      int int0 = LogUtils.getXidSize(logUtils_XidImpl0);
      assertEquals(2, logUtils_XidImpl0.getFormatId());
      assertEquals(31, int0);
  }

  @Test
  public void test59()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      LogUtils.XidImpl logUtils_XidImpl0 = new LogUtils.XidImpl(596, byteArray0, byteArray0);
      int int0 = LogUtils.getXidSize(logUtils_XidImpl0);
      assertEquals(596, logUtils_XidImpl0.getFormatId());
      assertEquals(20, int0);
  }

  @Test
  public void test60()  throws Throwable  {
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode(".^G#/mq8a=jM");
      StringWriter stringWriter0 = new StringWriter();
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      boolean boolean0 = LogUtils.dumpBoolean(byteBuffer0, stringBuffer0, "bW!3j");
      assertEquals(34, stringBuffer0.capacity());
      assertFalse(boolean0);
  }

  @Test
  public void test61()  throws Throwable  {
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("Ix!sIf_LTBGP9");
      LogUtils.writeBoolean(byteBuffer0, true);
      assertEquals(1, byteBuffer0.position());
  }

  @Test
  public void test62()  throws Throwable  {
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("Ix!sIf_LTBGP9");
      LogUtils.writeBoolean(byteBuffer0, false);
      assertTrue(byteBuffer0.hasArray());
  }

  @Test
  public void test63()  throws Throwable  {
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("\" gTxnId=\"");
      LogUtils.writeUnsignedInt(byteBuffer0, (byte) (-113));
      assertEquals("java.nio.HeapByteBuffer[pos=4 lim=10 cap=20]", byteBuffer0.toString());
  }

  @Test
  public void test64()  throws Throwable  {
      // Undeclared exception!
      try { 
        LogUtils.readIntMSB((ByteBuffer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.LogUtils", e);
      }
  }

  @Test
  public void test65()  throws Throwable  {
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode(";T}H&CxT6VYFvV]F/%");
      LogUtils.writeIntMSB(byteBuffer0, (-949));
      assertEquals(4, byteBuffer0.position());
  }

  @Test
  public void test66()  throws Throwable  {
      int int0 = LogUtils.getLongLogSize();
      assertEquals(8, int0);
  }

  @Test
  public void test67()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      int int0 = LogUtils.getByteArrayLogSize(byteArray0);
      assertEquals(8, int0);
  }

  @Test
  public void test68()  throws Throwable  {
      int int0 = LogUtils.getIntLogSize();
      assertEquals(4, int0);
  }

  @Test
  public void test69()  throws Throwable  {
      LogUtils logUtils0 = new LogUtils();
      assertEquals(8, logUtils0.getLongLogSize());
  }

  @Test
  public void test70()  throws Throwable  {
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode(".");
      Instant instant0 = Instant.MAX;
      Timestamp timestamp0 = Timestamp.from(instant0);
      // Undeclared exception!
      try { 
        LogUtils.writeTimestamp(byteBuffer0, timestamp0);
        fail("Expecting exception: BufferOverflowException");
      
      } catch(BufferOverflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.nio.Buffer", e);
      }
  }

  @Test
  public void test71()  throws Throwable  {
      // Undeclared exception!
      try { 
        LogUtils.getStringLogSize((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.LogUtils", e);
      }
  }

  @Test
  public void test72()  throws Throwable  {
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode(";T}H&CxT6VYFvV]F/%");
      LogUtils.writeShort(byteBuffer0, (short) (-2947));
      assertFalse(byteBuffer0.isDirect());
  }

  @Test
  public void test73()  throws Throwable  {
      int int0 = LogUtils.getTimestampLogSize();
      assertEquals(8, int0);
  }

  @Test
  public void test74()  throws Throwable  {
      ByteBuffer byteBuffer0 = ByteBuffer.allocateDirect(1556);
      String string0 = LogUtils.readString(byteBuffer0);
      assertEquals("java.nio.DirectByteBuffer[pos=4 lim=1556 cap=1556]", byteBuffer0.toString());
      assertEquals("", string0);
  }

  @Test
  public void test75()  throws Throwable  {
      int int0 = LogUtils.getBooleanLogSize();
      assertEquals(1, int0);
  }

  @Test
  public void test76()  throws Throwable  {
      // Undeclared exception!
      try { 
        LogUtils.writeString((ByteBuffer) null, "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.LogUtils", e);
      }
  }

  @Test
  public void test77()  throws Throwable  {
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode(";T}H&CxT6VYFvV]F/%");
      Timestamp timestamp0 = LogUtils.readTimestamp(byteBuffer0);
      LogUtils.writeTimestamp(byteBuffer0, timestamp0);
      assertEquals("192881457-06-24 04:20:16.699", timestamp0.toString());
      assertEquals(699000000, timestamp0.getNanos());
  }

  @Test
  public void test78()  throws Throwable  {
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode(";T}H&CxT6VYFvV]F/%");
      short short0 = LogUtils.readShort(byteBuffer0);
      assertEquals((short)21563, short0);
  }

  @Test
  public void test79()  throws Throwable  {
      ByteBuffer byteBuffer0 = ByteBuffer.allocateDirect(1556);
      LogUtils.XidImpl logUtils_XidImpl0 = (LogUtils.XidImpl)LogUtils.readXid(byteBuffer0);
      assertEquals(6, byteBuffer0.position());
      assertEquals(0, logUtils_XidImpl0.getFormatId());
  }
}