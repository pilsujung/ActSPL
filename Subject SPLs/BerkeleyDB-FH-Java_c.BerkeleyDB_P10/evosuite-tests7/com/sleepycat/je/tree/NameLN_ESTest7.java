/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 21 21:31:34 KST 2017
 */

package com.sleepycat.je.tree;

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

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.sleepycat.je.dbi.DatabaseId;
import com.sleepycat.je.log.LogEntryType;

import sun.nio.cs.ext.MS949;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class NameLN_ESTest7 extends NameLN_ESTest_scaffolding7 {

  @Test
  public void test00()  throws Throwable  {
      NameLN nameLN0 = new NameLN();
      DatabaseId databaseId0 = nameLN0.getId();
      assertEquals(0L, databaseId0.getTransactionId());
  }

  @Test
  public void test01()  throws Throwable  {
      DatabaseId databaseId0 = new DatabaseId(10000);
      NameLN nameLN0 = new NameLN(databaseId0);
      nameLN0.getId();
      //  // Unstable assertion: assertEquals(114L, nameLN0.getNodeId());
  }

  @Test
  public void test02()  throws Throwable  {
      DatabaseId databaseId0 = new DatabaseId((-486));
      NameLN nameLN0 = new NameLN(databaseId0);
      nameLN0.getId();
      assertFalse(nameLN0.isDeleted());
  }

  @Test
  public void test03()  throws Throwable  {
      NameLN nameLN0 = new NameLN();
      nameLN0.makeDeleted();
      int int0 = nameLN0.getLogSize();
      assertTrue(nameLN0.isDeleted());
      assertEquals(14, int0);
  }

  @Test
  public void test04()  throws Throwable  {
      NameLN nameLN0 = new NameLN();
      nameLN0.makeDeleted();
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("<com.sleepycat.je.tree.NameLN/0");
      CharBuffer charBuffer0 = mS949_0.decode(byteBuffer0);
      ByteBuffer byteBuffer1 = mS949_0.encode(charBuffer0);
      nameLN0.writeToLog(byteBuffer1);
      assertTrue(nameLN0.isDeleted());
  }

  @Test
  public void test05()  throws Throwable  {
      DatabaseId databaseId0 = new DatabaseId();
      NameLN nameLN0 = new NameLN(databaseId0);
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("E!d");
      // Undeclared exception!
      try { 
        nameLN0.writeToLog(byteBuffer0);
        fail("Expecting exception: BufferOverflowException");
      
      } catch(BufferOverflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.nio.Buffer", e);
      }
  }

  @Test
  public void test06()  throws Throwable  {
      NameLN nameLN0 = new NameLN();
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("R WjN_B3e)a");
      // Undeclared exception!
      try { 
        nameLN0.readFromLog(byteBuffer0, (byte)0);
        fail("Expecting exception: BufferUnderflowException");
      
      } catch(BufferUnderflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.nio.Buffer", e);
      }
  }

  @Test
  public void test07()  throws Throwable  {
      DatabaseId databaseId0 = new DatabaseId();
      NameLN nameLN0 = new NameLN(databaseId0);
      // Undeclared exception!
      try { 
        nameLN0.readFromLog((ByteBuffer) null, (byte)0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.LogUtils", e);
      }
  }

  @Test
  public void test08()  throws Throwable  {
      NameLN nameLN0 = new NameLN((DatabaseId) null);
      // Undeclared exception!
      try { 
        nameLN0.dumpString((-1746), true);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -1746
         //
         assertThrownBy("java.lang.String", e);
      }
  }

  @Test
  public void test09()  throws Throwable  {
      NameLN nameLN0 = new NameLN();
      // Undeclared exception!
      try { 
        nameLN0.dumpLogAdditional((StringBuffer) null, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.dbi.DatabaseId", e);
      }
  }

  @Test
  public void test10()  throws Throwable  {
      NameLN nameLN0 = new NameLN();
      String string0 = nameLN0.beginTag();
      assertEquals("<nameLN>", string0);
  }

  @Test
  public void test11()  throws Throwable  {
      DatabaseId databaseId0 = new DatabaseId();
      NameLN nameLN0 = new NameLN(databaseId0);
      nameLN0.dumpString(7, true);
      //  // Unstable assertion: assertEquals(66L, nameLN0.getNodeId());
  }

  @Test
  public void test12()  throws Throwable  {
      NameLN nameLN0 = new NameLN((DatabaseId) null);
      nameLN0.endTag();
      //  // Unstable assertion: assertEquals(63L, nameLN0.getLastId());
  }

  @Test
  public void test13()  throws Throwable  {
      NameLN nameLN0 = new NameLN((DatabaseId) null);
      boolean boolean0 = nameLN0.isDeleted();
      //  // Unstable assertion: assertEquals(60L, nameLN0.getLastId());
      //  // Unstable assertion: assertFalse(boolean0);
  }

  @Test
  public void test14()  throws Throwable  {
      NameLN nameLN0 = new NameLN();
      LogEntryType logEntryType0 = nameLN0.getTransactionalLogType();
      assertTrue(logEntryType0.isNodeType());
  }

  @Test
  public void test15()  throws Throwable  {
      NameLN nameLN0 = new NameLN((DatabaseId) null);
      nameLN0.setId((DatabaseId) null);
      //  // Unstable assertion: assertEquals(58L, nameLN0.getLastId());
  }

  @Test
  public void test16()  throws Throwable  {
      DatabaseId databaseId0 = new DatabaseId(10000);
      NameLN nameLN0 = new NameLN(databaseId0);
      StringWriter stringWriter0 = new StringWriter();
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      nameLN0.dumpLogAdditional(stringBuffer0, false);
      //  // Unstable assertion: assertEquals(55L, nameLN0.getNodeId());
  }

  @Test
  public void test17()  throws Throwable  {
      NameLN nameLN0 = new NameLN((DatabaseId) null);
      nameLN0.makeDeleted();
      boolean boolean0 = nameLN0.isDeleted();
      //  // Unstable assertion: assertEquals(51L, nameLN0.getNodeId());
      //  // Unstable assertion: assertTrue(boolean0);
  }

  @Test
  public void test18()  throws Throwable  {
      DatabaseId databaseId0 = new DatabaseId();
      NameLN nameLN0 = new NameLN(databaseId0);
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("       <nameLN>\n         <node>66666</node>\n         <data></data>\n       </nameLN>\n       <deleted val=\"false\">\n       <id val=\"0\">\n");
      nameLN0.readFromLog(byteBuffer0, (byte)0);
      //  // Unstable assertion: assertEquals(43L, nameLN0.getLastId());
  }

  @Test
  public void test19()  throws Throwable  {
      NameLN nameLN0 = new NameLN();
      // Undeclared exception!
      try { 
        nameLN0.getLogSize();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.LogUtils", e);
      }
  }

  @Test
  public void test20()  throws Throwable  {
      DatabaseId databaseId0 = new DatabaseId();
      NameLN nameLN0 = new NameLN(databaseId0);
      nameLN0.getLogType();
      //  // Unstable assertion: assertEquals(41L, nameLN0.getNodeId());
  }

  @Test
  public void test21()  throws Throwable  {
      NameLN nameLN0 = new NameLN();
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("<com.sleepycat.je.tree.NameLN/0");
      // Undeclared exception!
      try { 
        nameLN0.writeToLog(byteBuffer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.LogUtils", e);
      }
  }

  @Test
  public void test22()  throws Throwable  {
      NameLN nameLN0 = new NameLN((DatabaseId) null);
      nameLN0.getId();
      //  // Unstable assertion: assertEquals(39L, nameLN0.getLastId());
  }

  @Test
  public void test23()  throws Throwable  {
      NameLN nameLN0 = new NameLN((DatabaseId) null);
      nameLN0.toString();
      //  // Unstable assertion: assertEquals(1L, nameLN0.getNodeId());
  }
}