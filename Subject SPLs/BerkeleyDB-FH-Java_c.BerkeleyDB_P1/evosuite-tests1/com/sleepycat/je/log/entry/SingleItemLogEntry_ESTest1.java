/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 21 20:08:04 KST 2017
 */

package com.sleepycat.je.log.entry;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.fail;

import java.io.StringWriter;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.sleepycat.je.DatabaseException;
import com.sleepycat.je.log.FileHeader;
import com.sleepycat.je.log.LogException;
import com.sleepycat.je.log.LogReadable;

import sun.nio.cs.ext.MS949;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class SingleItemLogEntry_ESTest1 extends SingleItemLogEntry_ESTest_scaffolding1 {

  @Test
  public void test00()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      SingleItemLogEntry singleItemLogEntry0 = new SingleItemLogEntry(class0);
      FileHeader fileHeader0 = new FileHeader();
      singleItemLogEntry0.item = (LogReadable) fileHeader0;
      FileHeader fileHeader1 = (FileHeader)singleItemLogEntry0.getMainItem();
      assertFalse(fileHeader1.countAsObsoleteWhenLogged());
  }

  @Test
  public void test01()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      SingleItemLogEntry singleItemLogEntry0 = new SingleItemLogEntry(class0);
      FileHeader fileHeader0 = new FileHeader();
      singleItemLogEntry0.item = (LogReadable) fileHeader0;
      boolean boolean0 = singleItemLogEntry0.isTransactional();
      assertFalse(boolean0);
  }

  @Test
  public void test02()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      SingleItemLogEntry singleItemLogEntry0 = new SingleItemLogEntry(class0);
      FileHeader fileHeader0 = new FileHeader();
      singleItemLogEntry0.item = (LogReadable) fileHeader0;
      long long0 = singleItemLogEntry0.getTransactionId();
      assertEquals(0L, long0);
  }

  @Test
  public void test03()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      SingleItemLogEntry singleItemLogEntry0 = new SingleItemLogEntry(class0);
      FileHeader fileHeader0 = new FileHeader();
      singleItemLogEntry0.item = (LogReadable) fileHeader0;
      StringWriter stringWriter0 = new StringWriter((int) (byte)30);
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      StringBuffer stringBuffer1 = singleItemLogEntry0.dumpEntry(stringBuffer0, false);
      assertEquals(84, stringBuffer1.length());
  }

  @Test
  public void test04()  throws Throwable  {
      Class<FileHeader> class0 = FileHeader.class;
      SingleItemLogEntry singleItemLogEntry0 = new SingleItemLogEntry(class0);
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("*KrQ}");
      // Undeclared exception!
      try { 
        singleItemLogEntry0.readEntry(byteBuffer0, 1, (byte)0, true);
        fail("Expecting exception: BufferUnderflowException");
      
      } catch(BufferUnderflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.nio.Buffer", e);
      }
  }

  @Test
  public void test05()  throws Throwable  {
      Class<FileHeader> class0 = FileHeader.class;
      BINDeltaLogEntry bINDeltaLogEntry0 = new BINDeltaLogEntry(class0);
      // Undeclared exception!
      try { 
        bINDeltaLogEntry0.readEntry((ByteBuffer) null, 1, (byte)116, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.LogUtils", e);
      }
  }

  @Test
  public void test06()  throws Throwable  {
      Class<Object> class0 = Object.class;
      BINDeltaLogEntry bINDeltaLogEntry0 = new BINDeltaLogEntry(class0);
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("");
      // Undeclared exception!
      try { 
        bINDeltaLogEntry0.readEntry(byteBuffer0, (-1132), (byte)0, true);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Object cannot be cast to com.sleepycat.je.log.LogReadable
         //
         assertThrownBy("com.sleepycat.je.log.entry.SingleItemLogEntry", e);
      }
  }

  @Test
  public void test07()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      SingleItemLogEntry singleItemLogEntry0 = new SingleItemLogEntry(class0);
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("");
      try { 
        singleItemLogEntry0.readEntry(byteBuffer0, 3301, (byte)0, true);
        fail("Expecting exception: DatabaseException");
      
      } catch(DatabaseException e) {
         //
         // java.lang.InstantiationException: java.lang.Integer
         //
         assertThrownBy("com.sleepycat.je.log.entry.SingleItemLogEntry", e);
      }
  }

  @Test
  public void test08()  throws Throwable  {
      Class<Object> class0 = Object.class;
      SingleItemLogEntry singleItemLogEntry0 = new SingleItemLogEntry(class0);
      // Undeclared exception!
      try { 
        singleItemLogEntry0.getNewInstance();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Object cannot be cast to com.sleepycat.je.log.entry.LogEntry
         //
         assertThrownBy("com.sleepycat.je.log.entry.SingleItemLogEntry", e);
      }
  }

  @Test
  public void test09()  throws Throwable  {
      Class<SingleItemLogEntry> class0 = SingleItemLogEntry.class;
      BINDeltaLogEntry bINDeltaLogEntry0 = new BINDeltaLogEntry(class0);
      try { 
        bINDeltaLogEntry0.getNewInstance();
        fail("Expecting exception: DatabaseException");
      
      } catch(DatabaseException e) {
         //
         // java.lang.InstantiationException: com.sleepycat.je.log.entry.SingleItemLogEntry
         //
         assertThrownBy("com.sleepycat.je.log.entry.SingleItemLogEntry", e);
      }
  }

  @Test
  public void test10()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
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
  public void test11()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      SingleItemLogEntry singleItemLogEntry0 = new SingleItemLogEntry(class0);
      StringWriter stringWriter0 = new StringWriter((int) (byte)30);
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      // Undeclared exception!
      try { 
        singleItemLogEntry0.dumpEntry(stringBuffer0, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.entry.SingleItemLogEntry", e);
      }
  }

  @Test
  public void test12()  throws Throwable  {
      Class<Object> class0 = Object.class;
      SingleItemLogEntry singleItemLogEntry0 = new SingleItemLogEntry(class0);
      Object object0 = singleItemLogEntry0.getMainItem();
      assertNull(object0);
  }

  @Test
  public void test13()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
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
  public void test14()  throws Throwable  {
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
  public void test15()  throws Throwable  {
      Class<FileHeader> class0 = FileHeader.class;
      BINDeltaLogEntry bINDeltaLogEntry0 = new BINDeltaLogEntry(class0);
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("Non-blocking lock was denied.");
      try { 
        bINDeltaLogEntry0.readEntry(byteBuffer0, 1, (byte)26, true);
        fail("Expecting exception: LogException");
      
      } catch(LogException e) {
         //
         // Expected log version 3 or earlier but found 1701060723 -- this version is not supported.
         //
         assertThrownBy("com.sleepycat.je.log.FileHeader", e);
      }
  }

  @Test
  public void test16()  throws Throwable  {
      Class<Object> class0 = Object.class;
      SingleItemLogEntry singleItemLogEntry0 = new SingleItemLogEntry(class0);
      SingleItemLogEntry singleItemLogEntry1 = (SingleItemLogEntry)singleItemLogEntry0.clone();
      assertFalse(singleItemLogEntry0.equals((Object)singleItemLogEntry1));
  }
}
