/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 21 20:44:12 KST 2017
 */

package com.sleepycat.je.tree;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
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

import com.sleepycat.je.dbi.DatabaseImpl;
import com.sleepycat.je.log.LogEntryType;

import sun.nio.cs.ext.MS949;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class MapLN_ESTest1 extends MapLN_ESTest_scaffolding1 {

  @Test
  public void test00()  throws Throwable  {
      MapLN mapLN0 = new MapLN();
      mapLN0.makeDeleted();
      boolean boolean0 = mapLN0.isDeleted();
      //  // Unstable assertion: assertEquals(188L, mapLN0.getLastId());
      //  // Unstable assertion: assertTrue(boolean0);
  }

  @Test
  public void test01()  throws Throwable  {
      MapLN mapLN0 = new MapLN();
      mapLN0.toString();
      //  // Unstable assertion: assertEquals(161L, mapLN0.getLastId());
  }

  @Test
  public void test02()  throws Throwable  {
      MapLN mapLN0 = new MapLN();
      DatabaseImpl databaseImpl0 = mapLN0.getDatabase();
      MapLN mapLN1 = new MapLN(databaseImpl0);
      int int0 = mapLN1.getLogSize();
      //  // Unstable assertion: assertEquals(140L, mapLN1.getNodeId());
      //  // Unstable assertion: assertEquals(36, int0);
  }

  @Test
  public void test03()  throws Throwable  {
      MapLN mapLN0 = new MapLN();
      StringWriter stringWriter0 = new StringWriter();
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      mapLN0.dumpLogAdditional(stringBuffer0, false);
      //  // Unstable assertion: assertEquals(137L, mapLN0.getLastId());
  }

  @Test
  public void test04()  throws Throwable  {
      DatabaseImpl databaseImpl0 = new DatabaseImpl();
      MapLN mapLN0 = new MapLN(databaseImpl0);
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("gb0[X=>F");
      // Undeclared exception!
      try { 
        mapLN0.writeToLog(byteBuffer0);
        fail("Expecting exception: BufferOverflowException");
      
      } catch(BufferOverflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.nio.Buffer", e);
      }
  }

  @Test
  public void test05()  throws Throwable  {
      MapLN mapLN0 = new MapLN();
      // Undeclared exception!
      try { 
        mapLN0.readFromLog((ByteBuffer) null, (byte) (-1));
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
      MapLN mapLN0 = new MapLN((DatabaseImpl) null);
      // Undeclared exception!
      try { 
        mapLN0.makeDeleted();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.MapLN", e);
      }
  }

  @Test
  public void test07()  throws Throwable  {
      MapLN mapLN0 = new MapLN();
      // Undeclared exception!
      try { 
        mapLN0.dumpString((-3351), false);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -3349
         //
         assertThrownBy("java.lang.String", e);
      }
  }

  @Test
  public void test08()  throws Throwable  {
      MapLN mapLN0 = new MapLN();
      String string0 = mapLN0.endTag();
      assertEquals("</mapLN>", string0);
  }

  @Test
  public void test09()  throws Throwable  {
      MapLN mapLN0 = new MapLN();
      mapLN0.isDeleted();
      //  // Unstable assertion: assertEquals(114L, mapLN0.getLastId());
  }

  @Test
  public void test10()  throws Throwable  {
      MapLN mapLN0 = new MapLN();
      String string0 = mapLN0.beginTag();
      assertEquals("<mapLN>", string0);
  }

  @Test
  public void test11()  throws Throwable  {
      MapLN mapLN0 = new MapLN();
      // Undeclared exception!
      try { 
        mapLN0.getLogSize();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.LogUtils", e);
      }
  }

  @Test
  public void test12()  throws Throwable  {
      MapLN mapLN0 = new MapLN();
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("=#h<_^<<].,'Vb");
      // Undeclared exception!
      try { 
        mapLN0.writeToLog(byteBuffer0);
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
      MapLN mapLN0 = new MapLN((DatabaseImpl) null);
      mapLN0.getDatabase();
      //  // Unstable assertion: assertEquals(106L, mapLN0.getLastId());
  }

  @Test
  public void test14()  throws Throwable  {
      MapLN mapLN0 = new MapLN();
      LogEntryType logEntryType0 = mapLN0.getLogType();
      assertTrue(logEntryType0.isNodeType());
  }

  @Test
  public void test15()  throws Throwable  {
      MapLN mapLN0 = new MapLN((DatabaseImpl) null);
      // Undeclared exception!
      try { 
        mapLN0.toString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.MapLN", e);
      }
  }

  @Test
  public void test16()  throws Throwable  {
      DatabaseImpl databaseImpl0 = new DatabaseImpl();
      MapLN mapLN0 = new MapLN(databaseImpl0);
      // Undeclared exception!
      try { 
        mapLN0.postFetchInit(databaseImpl0, (-686L));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.dbi.DatabaseImpl", e);
      }
  }

  @Test
  public void test17()  throws Throwable  {
      MapLN mapLN0 = new MapLN();
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode(".P@T]mvE7e6");
      // Undeclared exception!
      try { 
        mapLN0.readFromLog(byteBuffer0, (byte)0);
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
      DatabaseImpl databaseImpl0 = new DatabaseImpl();
      MapLN mapLN0 = new MapLN(databaseImpl0);
      mapLN0.dumpString(0, true);
      //  // Unstable assertion: assertEquals(9L, mapLN0.getNodeId());
  }

  @Test
  public void test19()  throws Throwable  {
      MapLN mapLN0 = new MapLN();
      // Undeclared exception!
      try { 
        mapLN0.dumpLogAdditional((StringBuffer) null, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.dbi.DatabaseImpl", e);
      }
  }

  @Test
  public void test20()  throws Throwable  {
      MapLN mapLN0 = new MapLN();
      LogEntryType logEntryType0 = mapLN0.getTransactionalLogType();
      assertTrue(logEntryType0.isNodeType());
  }

  @Test
  public void test21()  throws Throwable  {
      MapLN mapLN0 = new MapLN();
      mapLN0.makeDeleted();
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("=#h<_^<<].,'Vb");
      // Undeclared exception!
      try { 
        mapLN0.writeToLog(byteBuffer0);
        fail("Expecting exception: BufferOverflowException");
      
      } catch(BufferOverflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.nio.Buffer", e);
      }
  }
}
