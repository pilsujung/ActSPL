/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 09:41:36 KST 2017
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
import java.nio.CharBuffer;
import java.nio.charset.Charset;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.sleepycat.je.DatabaseException;

import sun.nio.cs.ext.MS949;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class LogEntry_ESTest3 extends LogEntry_ESTest_scaffolding3 {

  @Test
  public void test00()  throws Throwable  {
      Class<String> class0 = String.class;
      LNLogEntry lNLogEntry0 = new LNLogEntry((Class) class0, false);
      boolean boolean0 = lNLogEntry0.isTransactional();
      assertFalse(boolean0);
  }

  @Test
  public void test01()  throws Throwable  {
      DeletedDupLNLogEntry deletedDupLNLogEntry0 = new DeletedDupLNLogEntry(false);
      long long0 = deletedDupLNLogEntry0.getTransactionId();
      assertEquals(0L, long0);
  }

  @Test
  public void test02()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      SingleItemLogEntry singleItemLogEntry0 = new SingleItemLogEntry(class0);
      Object object0 = singleItemLogEntry0.getMainItem();
      assertNull(object0);
  }

  @Test
  public void test03()  throws Throwable  {
      DeletedDupLNLogEntry deletedDupLNLogEntry0 = new DeletedDupLNLogEntry(false);
      DeletedDupLNLogEntry deletedDupLNLogEntry1 = (DeletedDupLNLogEntry)deletedDupLNLogEntry0.clone();
      assertFalse(deletedDupLNLogEntry1.isTransactional());
  }

  @Test
  public void test04()  throws Throwable  {
      Class<Object> class0 = Object.class;
      INLogEntry iNLogEntry0 = new INLogEntry(class0);
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("");
      // Undeclared exception!
      try { 
        iNLogEntry0.readEntry(byteBuffer0, 87, (byte)100, false);
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
      DeletedDupLNLogEntry deletedDupLNLogEntry0 = new DeletedDupLNLogEntry(true);
      // Undeclared exception!
      try { 
        deletedDupLNLogEntry0.readEntry((ByteBuffer) null, 45, (byte)0, true);
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
      INLogEntry iNLogEntry0 = new INLogEntry(class0);
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("The cache size is larger than the sequence range");
      CharBuffer charBuffer0 = mS949_0.decode(byteBuffer0);
      ByteBuffer byteBuffer1 = mS949_0.encode(charBuffer0);
      // Undeclared exception!
      try { 
        iNLogEntry0.readEntry(byteBuffer1, (-431), (byte) (-62), false);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.nio.Buffer", e);
      }
  }

  @Test
  public void test07()  throws Throwable  {
      Class<Object> class0 = Object.class;
      LNLogEntry lNLogEntry0 = new LNLogEntry((Class) class0, true);
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("");
      // Undeclared exception!
      try { 
        lNLogEntry0.readEntry(byteBuffer0, 0, (byte)0, true);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Object cannot be cast to com.sleepycat.je.tree.LN
         //
         assertThrownBy("com.sleepycat.je.log.entry.LNLogEntry", e);
      }
  }

  @Test
  public void test08()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      SingleItemLogEntry singleItemLogEntry0 = new SingleItemLogEntry(class0);
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("");
      try { 
        singleItemLogEntry0.readEntry(byteBuffer0, 488, (byte)0, true);
        fail("Expecting exception: DatabaseException");
      
      } catch(DatabaseException e) {
         //
         // java.lang.InstantiationException: java.lang.Integer
         //
         assertThrownBy("com.sleepycat.je.log.entry.SingleItemLogEntry", e);
      }
  }

  @Test
  public void test09()  throws Throwable  {
      Class<String> class0 = String.class;
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
  public void test10()  throws Throwable  {
      DeletedDupLNLogEntry deletedDupLNLogEntry0 = new DeletedDupLNLogEntry(true);
      // Undeclared exception!
      try { 
        deletedDupLNLogEntry0.getTransactionId();
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
}
