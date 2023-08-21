/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 21 21:16:49 KST 2017
 */

package com.sleepycat.je.tree;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
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

import sun.nio.cs.ext.MS949;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class DupCountLN_ESTest7 extends DupCountLN_ESTest_scaffolding7 {

  @Test
  public void test00()  throws Throwable  {
      DupCountLN dupCountLN0 = new DupCountLN();
      dupCountLN0.incDupCount();
      int int0 = dupCountLN0.getDupCount();
      assertEquals(1, int0);
  }

  @Test
  public void test01()  throws Throwable  {
      DupCountLN dupCountLN0 = new DupCountLN((-3763));
      int int0 = dupCountLN0.getDupCount();
      assertEquals((-3763), int0);
  }

  @Test
  public void test02()  throws Throwable  {
      DupCountLN dupCountLN0 = new DupCountLN();
      dupCountLN0.incDupCount();
      assertEquals(1, dupCountLN0.getDupCount());
      
      int int0 = dupCountLN0.decDupCount();
      assertEquals(0, int0);
  }

  @Test
  public void test03()  throws Throwable  {
      DupCountLN dupCountLN0 = new DupCountLN((-1));
      int int0 = dupCountLN0.incDupCount();
      assertEquals(0, dupCountLN0.getDupCount());
      assertEquals(0, int0);
  }

  @Test
  public void test04()  throws Throwable  {
      DupCountLN dupCountLN0 = new DupCountLN(956);
      int int0 = dupCountLN0.getLogSize();
      //  // Unstable assertion: assertEquals(252L, dupCountLN0.getNodeId());
      //  // Unstable assertion: assertEquals(17, int0);
  }

  @Test
  public void test05()  throws Throwable  {
      DupCountLN dupCountLN0 = new DupCountLN(20);
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("<com.sleepycat.je.tree.DupCountLN/10000591");
      CharBuffer charBuffer0 = mS949_0.decode(byteBuffer0);
      ByteBuffer byteBuffer1 = mS949_0.encode(charBuffer0);
      dupCountLN0.readFromLog(byteBuffer1, (byte)90);
      //  // Unstable assertion: assertEquals(246L, dupCountLN0.getLastId());
  }

  @Test
  public void test06()  throws Throwable  {
      DupCountLN dupCountLN0 = new DupCountLN(20);
      StringWriter stringWriter0 = new StringWriter(20);
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      dupCountLN0.dumpLogAdditional(stringBuffer0, true);
      //  // Unstable assertion: assertEquals(15, stringBuffer0.length());
      //  // Unstable assertion: assertEquals(235L, dupCountLN0.getLastId());
  }

  @Test
  public void test07()  throws Throwable  {
      DupCountLN dupCountLN0 = new DupCountLN((-3405));
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("&u|$a$e\"_DQ^p~");
      // Undeclared exception!
      try { 
        dupCountLN0.writeToLog(byteBuffer0);
        fail("Expecting exception: BufferOverflowException");
      
      } catch(BufferOverflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.nio.Buffer", e);
      }
  }

  @Test
  public void test08()  throws Throwable  {
      DupCountLN dupCountLN0 = new DupCountLN();
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("---- Node Id: ");
      // Undeclared exception!
      try { 
        dupCountLN0.writeToLog(byteBuffer0);
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
      DupCountLN dupCountLN0 = new DupCountLN((-1301));
      // Undeclared exception!
      try { 
        dupCountLN0.readFromLog((ByteBuffer) null, (byte)9);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.LogUtils", e);
      }
  }

  @Test
  public void test10()  throws Throwable  {
      DupCountLN dupCountLN0 = new DupCountLN(956);
      // Undeclared exception!
      try { 
        dupCountLN0.dumpString(956, false);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: 958
         //
         assertThrownBy("java.lang.String", e);
      }
  }

  @Test
  public void test11()  throws Throwable  {
      DupCountLN dupCountLN0 = new DupCountLN((-1301));
      String string0 = dupCountLN0.dumpString(0, true);
      //  // Unstable assertion: assertEquals("<dupCountLN>\n  <count v=\"-1301\"/>\n  <node>167</node>\n  <data></data>\n</dupCountLN>", string0);
  }

  @Test
  public void test12()  throws Throwable  {
      DupCountLN dupCountLN0 = new DupCountLN((-1));
      dupCountLN0.beginTag();
      //  // Unstable assertion: assertEquals(163L, dupCountLN0.getNodeId());
  }

  @Test
  public void test13()  throws Throwable  {
      DupCountLN dupCountLN0 = new DupCountLN();
      boolean boolean0 = dupCountLN0.isDeleted();
      assertFalse(boolean0);
      assertEquals(0, dupCountLN0.getDupCount());
  }

  @Test
  public void test14()  throws Throwable  {
      DupCountLN dupCountLN0 = new DupCountLN(298);
      dupCountLN0.endTag();
      //  // Unstable assertion: assertEquals(159L, dupCountLN0.getLastId());
  }

  @Test
  public void test15()  throws Throwable  {
      DupCountLN dupCountLN0 = new DupCountLN(2370);
      dupCountLN0.dumpString(4, false);
      //  // Unstable assertion: assertEquals(127L, dupCountLN0.getNodeId());
  }

  @Test
  public void test17()  throws Throwable  {
      DupCountLN dupCountLN0 = new DupCountLN(2370);
      int int0 = dupCountLN0.decDupCount();
      //  // Unstable assertion: assertEquals(104L, dupCountLN0.getLastId());
      //  // Unstable assertion: assertEquals(2369, int0);
  }

  @Test
  public void test19()  throws Throwable  {
      DupCountLN dupCountLN0 = new DupCountLN();
      // Undeclared exception!
      try { 
        dupCountLN0.getLogSize();
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
      DupCountLN dupCountLN0 = new DupCountLN();
      // Undeclared exception!
      try { 
        dupCountLN0.accumulateStats((TreeWalkerStatsAccumulator) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.DupCountLN", e);
      }
  }

  @Test
  public void test21()  throws Throwable  {
      DupCountLN dupCountLN0 = new DupCountLN(2370);
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("<dupCountLN>\n  <count v=\"2370\"/>\n  <node>10000601</node>\n  <data></data>\n</dupCountLN>");
      CharBuffer charBuffer0 = mS949_0.decode(byteBuffer0);
      ByteBuffer byteBuffer1 = mS949_0.encode(charBuffer0);
      dupCountLN0.writeToLog(byteBuffer1);
      //  // Unstable assertion: assertEquals(17, byteBuffer1.position());
      //  // Unstable assertion: assertEquals(73L, dupCountLN0.getNodeId());
  }

  @Test
  public void test22()  throws Throwable  {
      DupCountLN dupCountLN0 = new DupCountLN(2370);
      dupCountLN0.getLogType();
      //  // Unstable assertion: assertEquals(69L, dupCountLN0.getNodeId());
  }

  @Test
  public void test23()  throws Throwable  {
      DupCountLN dupCountLN0 = new DupCountLN(2370);
      dupCountLN0.getTransactionalLogType();
      assertEquals(2370, dupCountLN0.getDupCount());
  }

  @Test
  public void test24()  throws Throwable  {
      DupCountLN dupCountLN0 = new DupCountLN();
      // Undeclared exception!
      try { 
        dupCountLN0.dumpLogAdditional((StringBuffer) null, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.DupCountLN", e);
      }
  }

  @Test
  public void test25()  throws Throwable  {
      DupCountLN dupCountLN0 = new DupCountLN(0);
      boolean boolean0 = dupCountLN0.containsDuplicates();
      //  // Unstable assertion: assertEquals(60L, dupCountLN0.getNodeId());
      //  // Unstable assertion: assertTrue(boolean0);
  }

  @Test
  public void test26()  throws Throwable  {
      DupCountLN dupCountLN0 = new DupCountLN(2370);
      dupCountLN0.toString();
      //  // Unstable assertion: assertEquals(8L, dupCountLN0.getLastId());
  }

  @Test
  public void test27()  throws Throwable  {
      DupCountLN dupCountLN0 = new DupCountLN();
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("");
      // Undeclared exception!
      try { 
        dupCountLN0.readFromLog(byteBuffer0, (byte)101);
        fail("Expecting exception: BufferUnderflowException");
      
      } catch(BufferUnderflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.nio.Buffer", e);
      }
  }

  @Test
  public void test28()  throws Throwable  {
      DupCountLN dupCountLN0 = new DupCountLN(0);
      int int0 = dupCountLN0.getDupCount();
      //  // Unstable assertion: assertEquals(1L, dupCountLN0.getNodeId());
      //  // Unstable assertion: assertEquals(0, int0);
  }
}