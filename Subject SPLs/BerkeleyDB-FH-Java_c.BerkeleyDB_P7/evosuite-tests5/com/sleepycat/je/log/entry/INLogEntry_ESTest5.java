/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 11:06:46 KST 2017
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
import com.sleepycat.je.dbi.DatabaseId;
import com.sleepycat.je.dbi.EnvironmentImpl;
import com.sleepycat.je.tree.DBIN;
import com.sleepycat.je.tree.IN;

import sun.nio.cs.ext.MS949;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class INLogEntry_ESTest5 extends INLogEntry_ESTest_scaffolding5 {

  @Test
  public void test00()  throws Throwable  {
      Class<Object> class0 = Object.class;
      INLogEntry iNLogEntry0 = new INLogEntry(class0);
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("vafYbY iXB?LjlQI");
      iNLogEntry0.readEntry(byteBuffer0, 14, (byte)1, false);
      long long0 = iNLogEntry0.getObsoleteLsn();
      assertEquals(7812140337094197248L, long0);
  }

  @Test
  public void test01()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      INLogEntry iNLogEntry0 = new INLogEntry(class0);
      long long0 = iNLogEntry0.getLsnOfIN(0L);
      assertEquals(0L, long0);
  }

  @Test
  public void test02()  throws Throwable  {
      Class<Object> class0 = Object.class;
      INLogEntry iNLogEntry0 = new INLogEntry(class0);
      long long0 = iNLogEntry0.getLsnOfIN(10L);
      assertEquals(10L, long0);
  }

  @Test
  public void test03()  throws Throwable  {
      Class<Object> class0 = Object.class;
      ByteBuffer byteBuffer0 = null;
      INLogEntry iNLogEntry0 = new INLogEntry(class0);
      // Undeclared exception!
      try { 
        iNLogEntry0.getLogType();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.entry.INLogEntry", e);
      }
  }

  @Test
  public void test04()  throws Throwable  {
      Class<String> class0 = String.class;
      INLogEntry iNLogEntry0 = new INLogEntry(class0);
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("");
      int int0 = 0;
      boolean boolean0 = false;
      // Undeclared exception!
      try { 
        iNLogEntry0.readEntry(byteBuffer0, 0, (byte)0, false);
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
      Class<Object> class0 = Object.class;
      INLogEntry iNLogEntry0 = new INLogEntry(class0);
      // Undeclared exception!
      try { 
        iNLogEntry0.marshallOutsideWriteLatch();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.entry.INLogEntry", e);
      }
  }

  @Test
  public void test06()  throws Throwable  {
      Class<IN> class0 = IN.class;
      INLogEntry iNLogEntry0 = new INLogEntry(class0);
      // Undeclared exception!
      try { 
        iNLogEntry0.readEntry((ByteBuffer) null, 1, (byte)31, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.entry.INLogEntry", e);
      }
  }

  @Test
  public void test07()  throws Throwable  {
      Class<Object> class0 = Object.class;
      INLogEntry iNLogEntry0 = new INLogEntry(class0);
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("=Pb!}>_QDL4+");
      // Undeclared exception!
      try { 
        iNLogEntry0.readEntry(byteBuffer0, 21, (byte)1, false);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.nio.Buffer", e);
      }
  }

  @Test
  public void test08()  throws Throwable  {
      Class<Object> class0 = Object.class;
      INLogEntry iNLogEntry0 = new INLogEntry(class0);
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("vafYbY iXB?LjlQI");
      // Undeclared exception!
      try { 
        iNLogEntry0.readEntry(byteBuffer0, 2523, (byte)0, true);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Object cannot be cast to com.sleepycat.je.tree.IN
         //
         assertThrownBy("com.sleepycat.je.log.entry.INLogEntry", e);
      }
  }

  @Test
  public void test09()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      INLogEntry iNLogEntry0 = new INLogEntry(class0);
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("dK7-BS5~;`abCdZ}o");
      try { 
        iNLogEntry0.readEntry(byteBuffer0, (-763), (byte)115, true);
        fail("Expecting exception: DatabaseException");
      
      } catch(DatabaseException e) {
         //
         // java.lang.InstantiationException: java.lang.Integer
         //
         assertThrownBy("com.sleepycat.je.log.entry.INLogEntry", e);
      }
  }

  @Test
  public void test10()  throws Throwable  {
      Class<Object> class0 = Object.class;
      INLogEntry iNLogEntry0 = new INLogEntry(class0);
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("vafYbY iXB?LjlQI");
      iNLogEntry0.readEntry(byteBuffer0, 14, (byte) (-7), false);
      assertEquals("java.nio.HeapByteBuffer[pos=14 lim=16 cap=32]", byteBuffer0.toString());
      assertEquals(7812140338207287584L, iNLogEntry0.getObsoleteLsn());
  }

  @Test
  public void test11()  throws Throwable  {
      Class<Object> class0 = Object.class;
      INLogEntry iNLogEntry0 = new INLogEntry(class0);
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("vafYbY iXB?LjlQI");
      iNLogEntry0.readEntry(byteBuffer0, 14, (byte)0, false);
      assertEquals((-1L), iNLogEntry0.getObsoleteLsn());
  }

  @Test
  public void test12()  throws Throwable  {
      Class<String> class0 = String.class;
      INLogEntry iNLogEntry0 = new INLogEntry(class0);
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("");
      // Undeclared exception!
      try { 
        iNLogEntry0.readEntry(byteBuffer0, 0, (byte)2, false);
        fail("Expecting exception: BufferUnderflowException");
      
      } catch(BufferUnderflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.nio.Buffer", e);
      }
  }

  @Test
  public void test13()  throws Throwable  {
      Class<IN> class0 = IN.class;
      INLogEntry iNLogEntry0 = new INLogEntry(class0);
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("rDYS&4");
      // Undeclared exception!
      try { 
        iNLogEntry0.readEntry(byteBuffer0, (-1499), (byte) (-17), true);
        fail("Expecting exception: BufferUnderflowException");
      
      } catch(BufferUnderflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.nio.Buffer", e);
      }
  }

  @Test
  public void test14()  throws Throwable  {
      Class<Object> class0 = Object.class;
      INLogEntry iNLogEntry0 = new INLogEntry(class0);
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("vafYbY iXB?LjlQI");
      iNLogEntry0.readEntry(byteBuffer0, 14, (byte)1, false);
      iNLogEntry0.getDbId();
      assertEquals(7812140337094197248L, iNLogEntry0.getObsoleteLsn());
  }


  @Test
  public void test16()  throws Throwable  {
      Class<String> class0 = String.class;
      INLogEntry iNLogEntry0 = new INLogEntry(class0);
      StringWriter stringWriter0 = new StringWriter(0);
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      // Undeclared exception!
      try { 
        iNLogEntry0.dumpEntry(stringBuffer0, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.entry.INLogEntry", e);
      }
  }

  @Test
  public void test17()  throws Throwable  {
      Class<IN> class0 = IN.class;
      INLogEntry iNLogEntry0 = new INLogEntry(class0);
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("m");
      // Undeclared exception!
      try { 
        iNLogEntry0.writeToLog(byteBuffer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.entry.INLogEntry", e);
      }
  }




  @Test
  public void test21()  throws Throwable  {
      Class<IN> class0 = IN.class;
      INLogEntry iNLogEntry0 = new INLogEntry(class0);
      // Undeclared exception!
      try { 
        iNLogEntry0.getLogSize();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.entry.INLogEntry", e);
      }
  }



  @Test
  public void test24()  throws Throwable  {
      Class<Object> class0 = Object.class;
      INLogEntry iNLogEntry0 = new INLogEntry(class0);
      iNLogEntry0.postLogWork((byte)1);
      assertEquals(0L, iNLogEntry0.getObsoleteLsn());
  }

  @Test
  public void test25()  throws Throwable  {
      Class<Object> class0 = Object.class;
      INLogEntry iNLogEntry0 = new INLogEntry(class0);
      long long0 = iNLogEntry0.getLsnOfIN((-773L));
      assertEquals((-773L), long0);
  }

  @Test
  public void test26()  throws Throwable  {
      Class<Object> class0 = Object.class;
      INLogEntry iNLogEntry0 = new INLogEntry(class0);
      INLogEntry iNLogEntry1 = (INLogEntry)iNLogEntry0.clone();
      assertEquals(0L, iNLogEntry1.getNodeId());
  }

  @Test
  public void test27()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      INLogEntry iNLogEntry0 = new INLogEntry(class0);
      IN iN0 = iNLogEntry0.getIN((EnvironmentImpl) null);
      assertNull(iN0);
  }


  @Test
  public void test29()  throws Throwable  {
      Class<IN> class0 = IN.class;
      INLogEntry iNLogEntry0 = new INLogEntry(class0);
      Object object0 = iNLogEntry0.getMainItem();
      assertNull(object0);
  }
}