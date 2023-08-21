/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 01:56:09 KST 2017
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
import java.nio.charset.Charset;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.sleepycat.je.dbi.DatabaseId;
import com.sleepycat.je.log.LogEntryType;

import sun.nio.cs.ext.MS949;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class NameLN_ESTest2 extends NameLN_ESTest_scaffolding2 {

  @Test
  public void test00()  throws Throwable  {
      NameLN nameLN0 = new NameLN((DatabaseId) null);
      nameLN0.getId();
      assertFalse(nameLN0.isDeleted());
  }

  @Test
  public void test01()  throws Throwable  {
      NameLN nameLN0 = new NameLN();
      DatabaseId databaseId0 = nameLN0.getId();
      assertEquals(0L, databaseId0.getTransactionId());
  }

  @Test
  public void test02()  throws Throwable  {
      DatabaseId databaseId0 = new DatabaseId(1046);
      NameLN nameLN0 = new NameLN(databaseId0);
      nameLN0.getId();
      //  // Unstable assertion: assertEquals(80L, nameLN0.getNodeId());
  }

  @Test
  public void test03()  throws Throwable  {
      NameLN nameLN0 = new NameLN();
      String string0 = nameLN0.dumpString(10, false);
      assertEquals("            <node>0</node>\n\n          <deleted val=\"false\">\n          <id val=\"0\">\n", string0);
  }

  @Test
  public void test04()  throws Throwable  {
      DatabaseId databaseId0 = new DatabaseId(1104);
      NameLN nameLN0 = new NameLN(databaseId0);
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("<nameLN>\n  <node>33577</node>\n  <data></data>\n</nameLN>\n<deleted val=\"false\">\n<id val=\"1104\">\n");
      nameLN0.writeToLog(byteBuffer0);
      //  // Unstable assertion: assertEquals("java.nio.HeapByteBuffer[pos=18 lim=94 cap=188]", byteBuffer0.toString());
      //  // Unstable assertion: assertEquals(76L, nameLN0.getNodeId());
  }

  @Test
  public void test05()  throws Throwable  {
      NameLN nameLN0 = new NameLN((DatabaseId) null);
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("");
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
      DatabaseId databaseId0 = new DatabaseId(1046);
      NameLN nameLN0 = new NameLN(databaseId0);
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("</nameLN>");
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
      NameLN nameLN0 = new NameLN();
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
      DatabaseId databaseId0 = new DatabaseId((-1));
      NameLN nameLN0 = new NameLN(databaseId0);
      nameLN0.beginTag();
      //  // Unstable assertion: assertEquals(63L, nameLN0.getNodeId());
  }

  @Test
  public void test11()  throws Throwable  {
      DatabaseId databaseId0 = new DatabaseId(1104);
      NameLN nameLN0 = new NameLN(databaseId0);
      // Undeclared exception!
      try { 
        nameLN0.dumpString((-155), true);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -155
         //
         assertThrownBy("java.lang.String", e);
      }
  }

  @Test
  public void test12()  throws Throwable  {
      NameLN nameLN0 = new NameLN();
      String string0 = nameLN0.endTag();
      assertEquals("</nameLN>", string0);
  }

  @Test
  public void test13()  throws Throwable  {
      NameLN nameLN0 = new NameLN();
      boolean boolean0 = nameLN0.isDeleted();
      assertFalse(boolean0);
  }


  @Test
  public void test15()  throws Throwable  {
      DatabaseId databaseId0 = new DatabaseId((-1));
      NameLN nameLN0 = new NameLN(databaseId0);
      nameLN0.setId(databaseId0);
      //  // Unstable assertion: assertEquals(54L, nameLN0.getLastId());
  }

  @Test
  public void test16()  throws Throwable  {
      NameLN nameLN0 = new NameLN();
      StringWriter stringWriter0 = new StringWriter();
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      nameLN0.dumpLogAdditional(stringBuffer0, false);
      assertFalse(nameLN0.containsDuplicates());
  }

  @Test
  public void test17()  throws Throwable  {
      NameLN nameLN0 = new NameLN();
      nameLN0.makeDeleted();
      boolean boolean0 = nameLN0.isDeleted();
      assertTrue(boolean0);
  }

  @Test
  public void test18()  throws Throwable  {
      NameLN nameLN0 = new NameLN();
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("mLJ81IJuu#i)t2");
      nameLN0.readFromLog(byteBuffer0, (byte)101);
      assertEquals(0L, nameLN0.getTransactionId());
  }

  @Test
  public void test19()  throws Throwable  {
      DatabaseId databaseId0 = new DatabaseId((-1));
      NameLN nameLN0 = new NameLN(databaseId0);
      int int0 = nameLN0.getLogSize();
      //  // Unstable assertion: assertEquals(43L, nameLN0.getLastId());
      //  // Unstable assertion: assertEquals(18, int0);
  }

  @Test
  public void test20()  throws Throwable  {
      DatabaseId databaseId0 = new DatabaseId((-1));
      NameLN nameLN0 = new NameLN(databaseId0);
      nameLN0.getLogType();
      assertFalse(nameLN0.isDeleted());
  }

  @Test
  public void test21()  throws Throwable  {
      NameLN nameLN0 = new NameLN();
      // Undeclared exception!
      try { 
        nameLN0.writeToLog((ByteBuffer) null);
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
      DatabaseId databaseId0 = new DatabaseId((-1));
      NameLN nameLN0 = new NameLN(databaseId0);
      nameLN0.getId();
      //  // Unstable assertion: assertEquals(39L, nameLN0.getLastId());
  }

  @Test
  public void test23()  throws Throwable  {
      DatabaseId databaseId0 = new DatabaseId(1104);
      NameLN nameLN0 = new NameLN(databaseId0);
      nameLN0.toString();
      //  // Unstable assertion: assertEquals(1L, nameLN0.getLastId());
  }
}