/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 21 20:48:33 KST 2017
 */

package com.sleepycat.je.log.entry;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.fail;

import java.io.StringWriter;
import java.nio.BufferOverflowException;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.sleepycat.je.dbi.DatabaseId;
import com.sleepycat.je.log.LogEntryType;
import com.sleepycat.je.tree.FileSummaryLN;
import com.sleepycat.je.tree.LN;
import com.sleepycat.je.tree.NameLN;
import com.sleepycat.je.txn.Txn;

import sun.nio.cs.ext.MS949;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class DeletedDupLNLogEntry_ESTest7 extends DeletedDupLNLogEntry_ESTest_scaffolding7 {

  @Test
  public void test00()  throws Throwable  {
      DeletedDupLNLogEntry deletedDupLNLogEntry0 = new DeletedDupLNLogEntry(false);
      byte[] byteArray0 = deletedDupLNLogEntry0.getDupKey();
      assertNull(byteArray0);
  }

  @Test
  public void test01()  throws Throwable  {
      LogEntryType logEntryType0 = LogEntryType.LOG_BIN;
      FileSummaryLN fileSummaryLN0 = new FileSummaryLN();
      DatabaseId databaseId0 = new DatabaseId((-878));
      byte[] byteArray0 = new byte[6];
      byte[] byteArray1 = new byte[0];
      Txn txn0 = new Txn();
      DeletedDupLNLogEntry deletedDupLNLogEntry0 = new DeletedDupLNLogEntry(logEntryType0, (LN) fileSummaryLN0, databaseId0, byteArray0, byteArray1, (long) (byte) (-75), false, txn0);
      byte[] byteArray2 = deletedDupLNLogEntry0.getDupKey();
      assertArrayEquals(new byte[] {}, byteArray2);
  }

  @Test
  public void test02()  throws Throwable  {
      DeletedDupLNLogEntry deletedDupLNLogEntry0 = new DeletedDupLNLogEntry(true);
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("aK`_~FTMG");
      byte byte0 = (byte)0;
      // Undeclared exception!
      try { 
        deletedDupLNLogEntry0.readEntry(byteBuffer0, 1, (byte)0, true);
        fail("Expecting exception: BufferUnderflowException");
      
      } catch(BufferUnderflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.nio.Buffer", e);
      }
  }

  @Test
  public void test03()  throws Throwable  {
      DeletedDupLNLogEntry deletedDupLNLogEntry0 = new DeletedDupLNLogEntry(false);
      // Undeclared exception!
      try { 
        deletedDupLNLogEntry0.readEntry((ByteBuffer) null, 591, (byte) (-112), false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.entry.LNLogEntry", e);
      }
  }

  @Test
  public void test04()  throws Throwable  {
      DeletedDupLNLogEntry deletedDupLNLogEntry0 = new DeletedDupLNLogEntry(false);
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("kF8f|KWG{VIBA+$^:f");
      // Undeclared exception!
      try { 
        deletedDupLNLogEntry0.readEntry(byteBuffer0, (-3006), (byte)37, false);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.nio.Buffer", e);
      }
  }

  @Test
  public void test05()  throws Throwable  {
      DeletedDupLNLogEntry deletedDupLNLogEntry0 = new DeletedDupLNLogEntry(true);
      // Undeclared exception!
      try { 
        deletedDupLNLogEntry0.getLogSize();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.entry.LNLogEntry", e);
      }
  }

  @Test
  public void test06()  throws Throwable  {
      LogEntryType logEntryType0 = LogEntryType.LOG_IN_DELETE_INFO;
      DatabaseId databaseId0 = new DatabaseId((-2991));
      byte[] byteArray0 = new byte[1];
      DeletedDupLNLogEntry deletedDupLNLogEntry0 = null;
      try {
        deletedDupLNLogEntry0 = new DeletedDupLNLogEntry(logEntryType0, (LN) null, databaseId0, byteArray0, byteArray0, (-220L), true, (Txn) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.entry.LNLogEntry", e);
      }
  }

  @Test
  public void test07()  throws Throwable  {
      DeletedDupLNLogEntry deletedDupLNLogEntry0 = new DeletedDupLNLogEntry(true);
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("aK`_~FTMG");
      // Undeclared exception!
      try { 
        deletedDupLNLogEntry0.readEntry(byteBuffer0, 1, (byte)0, true);
        fail("Expecting exception: BufferUnderflowException");
      
      } catch(BufferUnderflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.nio.Buffer", e);
      }
  }

  @Test
  public void test08()  throws Throwable  {
      LogEntryType logEntryType0 = LogEntryType.LOG_BIN;
      FileSummaryLN fileSummaryLN0 = new FileSummaryLN();
      DatabaseId databaseId0 = new DatabaseId((-878));
      byte[] byteArray0 = new byte[6];
      Txn txn0 = new Txn();
      DeletedDupLNLogEntry deletedDupLNLogEntry0 = new DeletedDupLNLogEntry(logEntryType0, (LN) fileSummaryLN0, databaseId0, byteArray0, byteArray0, (long) (byte) (-75), false, txn0);
      byte[] byteArray1 = deletedDupLNLogEntry0.getDupKey();
      assertSame(byteArray0, byteArray1);
  }

  @Test
  public void test09()  throws Throwable  {
      FileSummaryLN fileSummaryLN0 = new FileSummaryLN();
      LogEntryType logEntryType0 = fileSummaryLN0.getLogType();
      DatabaseId databaseId0 = new DatabaseId((-306));
      byte[] byteArray0 = new byte[5];
      DeletedDupLNLogEntry deletedDupLNLogEntry0 = new DeletedDupLNLogEntry(logEntryType0, (LN) fileSummaryLN0, databaseId0, byteArray0, byteArray0, (-3635L), true, (Txn) null);
      int int0 = deletedDupLNLogEntry0.getLogSize();
      assertEquals(31, int0);
  }

  @Test
  public void test10()  throws Throwable  {
      DeletedDupLNLogEntry deletedDupLNLogEntry0 = new DeletedDupLNLogEntry(false);
      StringWriter stringWriter0 = new StringWriter();
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      // Undeclared exception!
      try { 
        deletedDupLNLogEntry0.dumpEntry(stringBuffer0, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.entry.LNLogEntry", e);
      }
  }

  @Test
  public void test11()  throws Throwable  {
      FileSummaryLN fileSummaryLN0 = new FileSummaryLN();
      LogEntryType logEntryType0 = fileSummaryLN0.getLogType();
      DatabaseId databaseId0 = new DatabaseId((-306));
      byte[] byteArray0 = new byte[5];
      DeletedDupLNLogEntry deletedDupLNLogEntry0 = new DeletedDupLNLogEntry(logEntryType0, (LN) fileSummaryLN0, databaseId0, byteArray0, byteArray0, (-3635L), true, (Txn) null);
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("");
      // Undeclared exception!
      try { 
        deletedDupLNLogEntry0.writeToLog(byteBuffer0);
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
      LogEntryType logEntryType0 = LogEntryType.LOG_IN_DELETE_INFO;
      NameLN nameLN0 = new NameLN();
      DatabaseId databaseId0 = new DatabaseId();
      byte[] byteArray0 = new byte[8];
      Txn txn0 = new Txn();
      DeletedDupLNLogEntry deletedDupLNLogEntry0 = new DeletedDupLNLogEntry(logEntryType0, (LN) nameLN0, databaseId0, byteArray0, byteArray0, (long) (byte)0, false, txn0);
      StringWriter stringWriter0 = new StringWriter(0);
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      deletedDupLNLogEntry0.dumpEntry(stringBuffer0, false);
      assertEquals(221, stringBuffer0.length());
      assertEquals("<nameLN><node>0</node><dbId id=\"0\"/></nameLN><dbId id=\"0\"/><key v=\"0 0 0 0 0 0 0 0 \"/><DbLsn val=\"0x0/0x0\"/><knownDeleted val=\"false\"/><txn id=\"0__Txn\"><DbLsn val=\"0xffffffff/0xffffffff\"/></txn><key v=\"0 0 0 0 0 0 0 0 \"/>", stringWriter0.toString());
  }
}
