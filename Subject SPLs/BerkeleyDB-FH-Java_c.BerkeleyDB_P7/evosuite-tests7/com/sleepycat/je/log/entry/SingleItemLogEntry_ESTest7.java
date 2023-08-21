/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 21 20:54:51 KST 2017
 */

package com.sleepycat.je.log.entry;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.StringWriter;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.sleepycat.je.DatabaseException;
import com.sleepycat.je.cleaner.FileSummary;
import com.sleepycat.je.log.FileHeader;
import com.sleepycat.je.log.LogException;
import com.sleepycat.je.log.LogReadable;
import com.sleepycat.je.tree.DupCountLN;
import com.sleepycat.je.tree.NameLN;
import com.sleepycat.je.txn.Txn;

import sun.nio.cs.ext.MS949;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class SingleItemLogEntry_ESTest7 extends SingleItemLogEntry_ESTest_scaffolding7 {

  @Test
  public void test00()  throws Throwable  {
      Class<String> class0 = String.class;
      SingleItemLogEntry singleItemLogEntry0 = new SingleItemLogEntry(class0);
      Txn txn0 = new Txn();
      singleItemLogEntry0.item = (LogReadable) txn0;
      boolean boolean0 = singleItemLogEntry0.isTransactional();
      assertTrue(boolean0);
  }

  @Test
  public void test01()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      SingleItemLogEntry singleItemLogEntry0 = new SingleItemLogEntry(class0);
      NameLN nameLN0 = new NameLN();
      singleItemLogEntry0.item = (LogReadable) nameLN0;
      long long0 = singleItemLogEntry0.getTransactionId();
      assertEquals(0L, long0);
  }

  @Test
  public void test02()  throws Throwable  {
      Class<String> class0 = String.class;
      SingleItemLogEntry singleItemLogEntry0 = new SingleItemLogEntry(class0);
      Txn txn0 = new Txn();
      singleItemLogEntry0.item = (LogReadable) txn0;
      Txn txn1 = (Txn)singleItemLogEntry0.getMainItem();
      assertFalse(txn1.isReadUncommittedDefault());
  }

  @Test
  public void test03()  throws Throwable  {
      Class<FileHeader> class0 = FileHeader.class;
      SingleItemLogEntry singleItemLogEntry0 = new SingleItemLogEntry(class0);
      DupCountLN dupCountLN0 = new DupCountLN();
      singleItemLogEntry0.item = (LogReadable) dupCountLN0;
      boolean boolean0 = singleItemLogEntry0.isTransactional();
      assertFalse(boolean0);
  }

  @Test
  public void test04()  throws Throwable  {
      Class<INLogEntry> class0 = INLogEntry.class;
      SingleItemLogEntry singleItemLogEntry0 = new SingleItemLogEntry(class0);
      FileSummary fileSummary0 = new FileSummary();
      singleItemLogEntry0.item = (LogReadable) fileSummary0;
      long long0 = singleItemLogEntry0.getTransactionId();
      assertEquals((-1L), long0);
  }

  @Test
  public void test05()  throws Throwable  {
      Class<BINDeltaLogEntry> class0 = BINDeltaLogEntry.class;
      SingleItemLogEntry singleItemLogEntry0 = new SingleItemLogEntry(class0);
      FileHeader fileHeader0 = new FileHeader();
      singleItemLogEntry0.item = (LogReadable) fileHeader0;
      StringWriter stringWriter0 = new StringWriter();
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      StringBuffer stringBuffer1 = singleItemLogEntry0.dumpEntry(stringBuffer0, true);
      assertEquals("<FileHeader num=\"0x0\" lastEntryInPrevFileOffset=\"0x0\" logVersion=\"0x0\" time=\"null\"/>", stringBuffer1.toString());
  }

  @Test
  public void test06()  throws Throwable  {
      SingleItemLogEntry singleItemLogEntry0 = new SingleItemLogEntry((Class) null);
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("QBPLqdWF");
      // Undeclared exception!
      try { 
        singleItemLogEntry0.readEntry(byteBuffer0, 0, (byte)8, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.entry.SingleItemLogEntry", e);
      }
  }

  @Test
  public void test07()  throws Throwable  {
      Class<Object> class0 = Object.class;
      SingleItemLogEntry singleItemLogEntry0 = new SingleItemLogEntry(class0);
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("B~>$o,^N`{_K");
      // Undeclared exception!
      try { 
        singleItemLogEntry0.readEntry(byteBuffer0, 2122, (byte)57, true);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Object cannot be cast to com.sleepycat.je.log.LogReadable
         //
         assertThrownBy("com.sleepycat.je.log.entry.SingleItemLogEntry", e);
      }
  }

  @Test
  public void test08()  throws Throwable  {
      Class<FileHeader> class0 = FileHeader.class;
      SingleItemLogEntry singleItemLogEntry0 = new SingleItemLogEntry(class0);
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("Can't set 'je.env.isNoLocking' and 'je.env.isTransactional';");
      CharBuffer charBuffer0 = mS949_0.decode(byteBuffer0);
      ByteBuffer byteBuffer1 = mS949_0.encode(charBuffer0);
      try { 
        singleItemLogEntry0.readEntry(byteBuffer1, 0, (byte)0, false);
        fail("Expecting exception: LogException");
      
      } catch(LogException e) {
         //
         // Expected log version 3 or earlier but found 1867280206 -- this version is not supported.
         //
         assertThrownBy("com.sleepycat.je.log.FileHeader", e);
      }
  }

  @Test
  public void test09()  throws Throwable  {
      Class<INLogEntry> class0 = INLogEntry.class;
      BINDeltaLogEntry bINDeltaLogEntry0 = new BINDeltaLogEntry(class0);
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("");
      try { 
        bINDeltaLogEntry0.readEntry(byteBuffer0, 0, (byte) (-35), false);
        fail("Expecting exception: DatabaseException");
      
      } catch(DatabaseException e) {
         //
         // java.lang.InstantiationException: com.sleepycat.je.log.entry.INLogEntry
         //
         assertThrownBy("com.sleepycat.je.log.entry.SingleItemLogEntry", e);
      }
  }

  @Test
  public void test10()  throws Throwable  {
      SingleItemLogEntry singleItemLogEntry0 = new SingleItemLogEntry((Class) null);
      // Undeclared exception!
      try { 
        singleItemLogEntry0.getNewInstance();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.entry.SingleItemLogEntry", e);
      }
  }

  @Test
  public void test11()  throws Throwable  {
      Class<String> class0 = String.class;
      SingleItemLogEntry singleItemLogEntry0 = new SingleItemLogEntry(class0);
      // Undeclared exception!
      try { 
        singleItemLogEntry0.getNewInstance();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.String cannot be cast to com.sleepycat.je.log.entry.LogEntry
         //
         assertThrownBy("com.sleepycat.je.log.entry.SingleItemLogEntry", e);
      }
  }

  @Test
  public void test12()  throws Throwable  {
      Class<FileHeader> class0 = FileHeader.class;
      SingleItemLogEntry singleItemLogEntry0 = new SingleItemLogEntry(class0);
      // Undeclared exception!
      try { 
        singleItemLogEntry0.isTransactional();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.entry.SingleItemLogEntry", e);
      }
  }

  @Test
  public void test13()  throws Throwable  {
      Class<BINDeltaLogEntry> class0 = BINDeltaLogEntry.class;
      SingleItemLogEntry singleItemLogEntry0 = new SingleItemLogEntry(class0);
      StringWriter stringWriter0 = new StringWriter();
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      // Undeclared exception!
      try { 
        singleItemLogEntry0.dumpEntry(stringBuffer0, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.entry.SingleItemLogEntry", e);
      }
  }

  @Test
  public void test14()  throws Throwable  {
      Class<Object> class0 = Object.class;
      SingleItemLogEntry singleItemLogEntry0 = new SingleItemLogEntry(class0);
      Object object0 = singleItemLogEntry0.getMainItem();
      assertNull(object0);
  }

  @Test
  public void test15()  throws Throwable  {
      Class<INLogEntry> class0 = INLogEntry.class;
      SingleItemLogEntry singleItemLogEntry0 = new SingleItemLogEntry(class0);
      // Undeclared exception!
      try { 
        singleItemLogEntry0.getTransactionId();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.entry.SingleItemLogEntry", e);
      }
  }

  @Test
  public void test16()  throws Throwable  {
      Class<INLogEntry> class0 = INLogEntry.class;
      SingleItemLogEntry singleItemLogEntry0 = new SingleItemLogEntry(class0);
      try { 
        singleItemLogEntry0.getNewInstance();
        fail("Expecting exception: DatabaseException");
      
      } catch(DatabaseException e) {
         //
         // java.lang.InstantiationException: com.sleepycat.je.log.entry.INLogEntry
         //
         assertThrownBy("com.sleepycat.je.log.entry.SingleItemLogEntry", e);
      }
  }

  @Test
  public void test17()  throws Throwable  {
      Class<FileHeader> class0 = FileHeader.class;
      SingleItemLogEntry singleItemLogEntry0 = new SingleItemLogEntry(class0);
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("");
      // Undeclared exception!
      try { 
        singleItemLogEntry0.readEntry(byteBuffer0, (-936), (byte) (-112), false);
        fail("Expecting exception: BufferUnderflowException");
      
      } catch(BufferUnderflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.nio.Buffer", e);
      }
  }

  @Test
  public void test18()  throws Throwable  {
      Class<FileHeader> class0 = FileHeader.class;
      SingleItemLogEntry singleItemLogEntry0 = new SingleItemLogEntry(class0);
      SingleItemLogEntry singleItemLogEntry1 = (SingleItemLogEntry)singleItemLogEntry0.clone();
      assertNotSame(singleItemLogEntry0, singleItemLogEntry1);
  }
}
