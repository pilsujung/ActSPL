/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 15:28:50 KST 2017
 */

package com.sleepycat.je.log.entry;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.sleepycat.je.DatabaseException;
import com.sleepycat.je.dbi.DatabaseId;
import com.sleepycat.je.dbi.DatabaseImpl;
import com.sleepycat.je.log.FileHeader;
import com.sleepycat.je.log.LogReadable;
import com.sleepycat.je.log.entry.BINDeltaLogEntry;
import com.sleepycat.je.log.entry.DeletedDupLNLogEntry;
import com.sleepycat.je.log.entry.INLogEntry;
import com.sleepycat.je.log.entry.LNLogEntry;
import com.sleepycat.je.log.entry.SingleItemLogEntry;
import com.sleepycat.je.tree.FileSummaryLN;
import com.sleepycat.je.tree.LN;
import com.sleepycat.je.txn.Txn;
import java.io.StringWriter;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.IllegalCharsetNameException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import sun.nio.cs.ext.MS949;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class SingleItemLogEntry_ESTest4 extends SingleItemLogEntry_ESTest_scaffolding4 {

  @Test
  public void test00()  throws Throwable  {
      Class<Object> class0 = Object.class;
      SingleItemLogEntry singleItemLogEntry0 = new SingleItemLogEntry(class0);
      singleItemLogEntry0.item = null;
      Txn txn0 = new Txn();
      singleItemLogEntry0.item = (LogReadable) txn0;
      boolean boolean0 = singleItemLogEntry0.isTransactional();
      assertTrue(boolean0);
  }

  @Test
  public void test01()  throws Throwable  {
      DatabaseId databaseId0 = new DatabaseId((-2455));
      Class<INLogEntry> class0 = INLogEntry.class;
      BINDeltaLogEntry bINDeltaLogEntry0 = new BINDeltaLogEntry(class0);
      bINDeltaLogEntry0.clone();
      StringWriter stringWriter0 = new StringWriter();
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      LN lN0 = new LN();
      bINDeltaLogEntry0.item = (LogReadable) lN0;
      bINDeltaLogEntry0.dumpEntry(stringBuffer0, false);
      bINDeltaLogEntry0.clone();
      long long0 = bINDeltaLogEntry0.getTransactionId();
      assertEquals(0L, long0);
  }

  @Test
  public void test02()  throws Throwable  {
      SingleItemLogEntry singleItemLogEntry0 = new SingleItemLogEntry((Class) null);
      singleItemLogEntry0.clone();
      singleItemLogEntry0.clone();
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
  public void test03()  throws Throwable  {
      Class<FileHeader> class0 = FileHeader.class;
      BINDeltaLogEntry bINDeltaLogEntry0 = new BINDeltaLogEntry(class0);
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("");
      CharBuffer charBuffer0 = mS949_0.decode(byteBuffer0);
      ByteBuffer byteBuffer1 = mS949_0.encode(charBuffer0);
      byteBuffer0.rewind();
      // Undeclared exception!
      try { 
        bINDeltaLogEntry0.readEntry(byteBuffer1, 0, (byte)0, true);
        fail("Expecting exception: BufferUnderflowException");
      
      } catch(BufferUnderflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.nio.Buffer", e);
      }
  }

  @Test
  public void test04()  throws Throwable  {
      Class<String> class0 = String.class;
      SingleItemLogEntry singleItemLogEntry0 = new SingleItemLogEntry(class0);
      DatabaseImpl databaseImpl0 = null;
      try {
        databaseImpl0 = new DatabaseImpl();
       //  fail("Expecting exception: NoClassDefFoundError");
       // Unstable assertion
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class com.sleepycat.je.dbi.DatabaseImpl
         //
         assertThrownBy("sun.reflect.NativeConstructorAccessorImpl", e);
      }
  }

  @Test
  public void test05()  throws Throwable  {
      Class<Object> class0 = Object.class;
      BINDeltaLogEntry bINDeltaLogEntry0 = new BINDeltaLogEntry(class0);
      // Undeclared exception!
      try { 
        bINDeltaLogEntry0.getTransactionId();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.entry.SingleItemLogEntry", e);
      }
  }

  @Test
  public void test06()  throws Throwable  {
      Class<FileHeader> class0 = FileHeader.class;
      SingleItemLogEntry singleItemLogEntry0 = new SingleItemLogEntry(class0);
      Txn txn0 = new Txn();
      Txn txn1 = txn0.getTxnLocker();
      singleItemLogEntry0.item = (LogReadable) txn1;
      singleItemLogEntry0.getMainItem();
      // Undeclared exception!
      try { 
        Charset.forName("<(McYi?L.~");
        fail("Expecting exception: IllegalCharsetNameException");
      
      } catch(IllegalCharsetNameException e) {
         //
         // <(McYi?L.~
         //
         assertThrownBy("java.nio.charset.Charset", e);
      }
  }

  @Test
  public void test07()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      SingleItemLogEntry singleItemLogEntry0 = new SingleItemLogEntry(class0);
      try { 
        singleItemLogEntry0.readEntry((ByteBuffer) null, (-1), (byte) (-89), true);
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
      Class<FileHeader> class0 = FileHeader.class;
      SingleItemLogEntry singleItemLogEntry0 = new SingleItemLogEntry(class0);
      Class<INLogEntry> class1 = INLogEntry.class;
      SingleItemLogEntry singleItemLogEntry1 = new SingleItemLogEntry(class1);
      // Undeclared exception!
      try { 
        singleItemLogEntry0.readEntry((ByteBuffer) null, (-3398), (byte) (-28), true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.LogUtils", e);
      }
  }

  @Test
  public void test09()  throws Throwable  {
      Class<FileHeader> class0 = FileHeader.class;
      BINDeltaLogEntry bINDeltaLogEntry0 = new BINDeltaLogEntry(class0);
      // Undeclared exception!
      try { 
        bINDeltaLogEntry0.getNewInstance();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // com.sleepycat.je.log.FileHeader cannot be cast to com.sleepycat.je.log.entry.LogEntry
         //
         assertThrownBy("com.sleepycat.je.log.entry.SingleItemLogEntry", e);
      }
  }

  @Test
  public void test10()  throws Throwable  {
      Class<DeletedDupLNLogEntry> class0 = DeletedDupLNLogEntry.class;
      SingleItemLogEntry singleItemLogEntry0 = new SingleItemLogEntry(class0);
      Object object0 = singleItemLogEntry0.getMainItem();
      assertNull(object0);
  }

  @Test
  public void test11()  throws Throwable  {
      Class<String> class0 = String.class;
      SingleItemLogEntry singleItemLogEntry0 = new SingleItemLogEntry(class0);
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("");
      // Undeclared exception!
      try { 
        singleItemLogEntry0.readEntry(byteBuffer0, 221, (byte)106, true);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.String cannot be cast to com.sleepycat.je.log.LogReadable
         //
         assertThrownBy("com.sleepycat.je.log.entry.SingleItemLogEntry", e);
      }
  }

  @Test
  public void test12()  throws Throwable  {
      Class<INLogEntry> class0 = INLogEntry.class;
      BINDeltaLogEntry bINDeltaLogEntry0 = new BINDeltaLogEntry(class0);
      bINDeltaLogEntry0.clone();
      StringWriter stringWriter0 = new StringWriter();
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      // Undeclared exception!
      try { 
        bINDeltaLogEntry0.dumpEntry(stringBuffer0, false);
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
      Class<Object> class0 = Object.class;
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
  public void test14()  throws Throwable  {
      Class<LNLogEntry> class0 = LNLogEntry.class;
      SingleItemLogEntry singleItemLogEntry0 = new SingleItemLogEntry(class0);
      FileSummaryLN fileSummaryLN0 = new FileSummaryLN();
      singleItemLogEntry0.item = (LogReadable) fileSummaryLN0;
      singleItemLogEntry0.getTransactionId();
      try { 
        singleItemLogEntry0.getNewInstance();
        fail("Expecting exception: DatabaseException");
      
      } catch(DatabaseException e) {
         //
         // java.lang.InstantiationException: com.sleepycat.je.log.entry.LNLogEntry
         //
         assertThrownBy("com.sleepycat.je.log.entry.SingleItemLogEntry", e);
      }
  }
}
