/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 09:43:13 KST 2017
 */

package com.sleepycat.je.log.entry;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
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
import com.sleepycat.je.cleaner.PackedOffsets;
import com.sleepycat.je.dbi.DatabaseImpl;
import com.sleepycat.je.log.FileHeader;
import com.sleepycat.je.log.LogException;
import com.sleepycat.je.log.LogReadable;
import com.sleepycat.je.tree.BIN;
import com.sleepycat.je.tree.DupCountLN;
import com.sleepycat.je.tree.FileSummaryLN;

import sun.nio.cs.ext.MS949;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class SingleItemLogEntry_ESTest3 extends SingleItemLogEntry_ESTest_scaffolding3 {

  @Test
  public void test00()  throws Throwable  {
      Class<Object> class0 = Object.class;
      SingleItemLogEntry singleItemLogEntry0 = new SingleItemLogEntry(class0);
      FileSummaryLN fileSummaryLN0 = new FileSummaryLN();
      PackedOffsets packedOffsets0 = fileSummaryLN0.getObsoleteOffsets();
      singleItemLogEntry0.item = (LogReadable) packedOffsets0;
      long long0 = singleItemLogEntry0.getTransactionId();
      assertEquals((-1L), long0);
  }

  @Test
  public void test01()  throws Throwable  {
      Class<DeletedDupLNLogEntry> class0 = DeletedDupLNLogEntry.class;
      BINDeltaLogEntry bINDeltaLogEntry0 = new BINDeltaLogEntry(class0);
      DatabaseImpl databaseImpl0 = new DatabaseImpl();
      byte[] byteArray0 = new byte[5];
      BIN bIN0 = new BIN(databaseImpl0, byteArray0, 0, (int) (byte)0);
      bINDeltaLogEntry0.item = (LogReadable) bIN0;
      BIN bIN1 = (BIN)bINDeltaLogEntry0.getMainItem();
      assertEquals((-1L), bIN1.getLastDeltaVersion());
  }

  @Test
  public void test02()  throws Throwable  {
      Class<String> class0 = String.class;
      SingleItemLogEntry singleItemLogEntry0 = new SingleItemLogEntry(class0);
      DupCountLN dupCountLN0 = new DupCountLN();
      singleItemLogEntry0.item = (LogReadable) dupCountLN0;
      boolean boolean0 = singleItemLogEntry0.isTransactional();
      assertFalse(boolean0);
  }

  @Test
  public void test03()  throws Throwable  {
      Class<String> class0 = String.class;
      SingleItemLogEntry singleItemLogEntry0 = new SingleItemLogEntry(class0);
      DupCountLN dupCountLN0 = new DupCountLN();
      singleItemLogEntry0.item = (LogReadable) dupCountLN0;
      long long0 = singleItemLogEntry0.getTransactionId();
      assertEquals(0L, long0);
  }

  @Test
  public void test04()  throws Throwable  {
      Class<String> class0 = String.class;
      SingleItemLogEntry singleItemLogEntry0 = new SingleItemLogEntry(class0);
      DupCountLN dupCountLN0 = new DupCountLN();
      singleItemLogEntry0.item = (LogReadable) dupCountLN0;
      StringWriter stringWriter0 = new StringWriter((int) (byte)101);
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      StringBuffer stringBuffer1 = singleItemLogEntry0.dumpEntry(stringBuffer0, false);
      assertSame(stringBuffer1, stringBuffer0);
  }

  @Test
  public void test05()  throws Throwable  {
      Class<FileHeader> class0 = FileHeader.class;
      SingleItemLogEntry singleItemLogEntry0 = new SingleItemLogEntry(class0);
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("_yMY/ZFZ5{5!N4+O6A");
      // Undeclared exception!
      try { 
        singleItemLogEntry0.readEntry(byteBuffer0, 0, (byte)0, false);
        fail("Expecting exception: BufferUnderflowException");
      
      } catch(BufferUnderflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.nio.Buffer", e);
      }
  }

  @Test
  public void test06()  throws Throwable  {
      Class<String> class0 = String.class;
      SingleItemLogEntry singleItemLogEntry0 = new SingleItemLogEntry(class0);
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("H'U5$^~Mj");
      // Undeclared exception!
      try { 
        singleItemLogEntry0.readEntry(byteBuffer0, (byte)0, (byte)0, false);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.String cannot be cast to com.sleepycat.je.log.LogReadable
         //
         assertThrownBy("com.sleepycat.je.log.entry.SingleItemLogEntry", e);
      }
  }

  @Test
  public void test07()  throws Throwable  {
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("is 1 open Database in the Environment.\n");
      Class<FileHeader> class0 = FileHeader.class;
      SingleItemLogEntry singleItemLogEntry0 = new SingleItemLogEntry(class0);
      try { 
        singleItemLogEntry0.readEntry(byteBuffer0, 0, (byte) (-74), true);
        fail("Expecting exception: LogException");
      
      } catch(LogException e) {
         //
         // Expected log version 3 or earlier but found 1752440942 -- this version is not supported.
         //
         assertThrownBy("com.sleepycat.je.log.FileHeader", e);
      }
  }

  @Test
  public void test08()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      BINDeltaLogEntry bINDeltaLogEntry0 = new BINDeltaLogEntry(class0);
      try { 
        bINDeltaLogEntry0.readEntry((ByteBuffer) null, 1431, (byte)0, false);
        fail("Expecting exception: DatabaseException");
      
      } catch(DatabaseException e) {
         //
         // java.lang.InstantiationException: java.lang.Integer
         //
         assertThrownBy("com.sleepycat.je.log.entry.SingleItemLogEntry", e);
      }
  }


  @Test
  public void test10()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      SingleItemLogEntry singleItemLogEntry0 = new SingleItemLogEntry(class0);
      try { 
        singleItemLogEntry0.getNewInstance();
        fail("Expecting exception: DatabaseException");
      
      } catch(DatabaseException e) {
         //
         // java.lang.InstantiationException: java.lang.Integer
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
  public void test12()  throws Throwable  {
      Class<String> class0 = String.class;
      SingleItemLogEntry singleItemLogEntry0 = new SingleItemLogEntry(class0);
      StringWriter stringWriter0 = new StringWriter((int) (byte)101);
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
  public void test13()  throws Throwable  {
      Class<DeletedDupLNLogEntry> class0 = DeletedDupLNLogEntry.class;
      BINDeltaLogEntry bINDeltaLogEntry0 = new BINDeltaLogEntry(class0);
      Object object0 = bINDeltaLogEntry0.getMainItem();
      assertNull(object0);
  }



  @Test
  public void test16()  throws Throwable  {
      Class<FileHeader> class0 = FileHeader.class;
      BINDeltaLogEntry bINDeltaLogEntry0 = new BINDeltaLogEntry(class0);
      // Undeclared exception!
      try { 
        bINDeltaLogEntry0.readEntry((ByteBuffer) null, 2678, (byte) (-47), true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.LogUtils", e);
      }
  }

}
