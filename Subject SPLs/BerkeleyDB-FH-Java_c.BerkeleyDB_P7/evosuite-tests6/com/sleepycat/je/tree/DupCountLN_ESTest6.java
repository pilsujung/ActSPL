/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 01:54:07 KST 2017
 */

package com.sleepycat.je.tree;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
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

import sun.nio.cs.ext.MS949;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class DupCountLN_ESTest6 extends DupCountLN_ESTest_scaffolding6 {

  @Test
  public void test00()  throws Throwable  {
      DupCountLN dupCountLN0 = new DupCountLN(0);
      int int0 = dupCountLN0.getDupCount();
      //  // Unstable assertion: assertEquals(226L, dupCountLN0.getNodeId());
      //  // Unstable assertion: assertEquals(0, int0);
  }

  @Test
  public void test01()  throws Throwable  {
      DupCountLN dupCountLN0 = new DupCountLN();
      dupCountLN0.setDupCount(2);
      dupCountLN0.decDupCount();
      int int0 = dupCountLN0.decDupCount();
      assertEquals(0, dupCountLN0.getDupCount());
      assertEquals(0, int0);
  }

  @Test
  public void test02()  throws Throwable  {
      DupCountLN dupCountLN0 = new DupCountLN((-1));
      int int0 = dupCountLN0.incDupCount();
      assertEquals(0, dupCountLN0.getDupCount());
      assertEquals(0, int0);
  }

  @Test
  public void test03()  throws Throwable  {
      DupCountLN dupCountLN0 = new DupCountLN((-1));
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("g.zA'U=J\u0002ax[+T");
      dupCountLN0.readFromLog(byteBuffer0, (byte)0);
      //  // Unstable assertion: assertEquals(199L, dupCountLN0.getLastId());
  }

  @Test
  public void test04()  throws Throwable  {
      DupCountLN dupCountLN0 = new DupCountLN();
      StringWriter stringWriter0 = new StringWriter(0);
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      dupCountLN0.dumpLogAdditional(stringBuffer0, false);
      assertEquals(22, stringBuffer0.capacity());
      assertEquals("<count v=\"0\"/>", stringWriter0.toString());
  }

  @Test
  public void test05()  throws Throwable  {
      DupCountLN dupCountLN0 = new DupCountLN(528);
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("");
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
  public void test06()  throws Throwable  {
      DupCountLN dupCountLN0 = new DupCountLN(2);
      // Undeclared exception!
      try { 
        dupCountLN0.writeToLog((ByteBuffer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.LogUtils", e);
      }
  }

  @Test
  public void test07()  throws Throwable  {
      DupCountLN dupCountLN0 = new DupCountLN();
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("");
      // Undeclared exception!
      try { 
        dupCountLN0.readFromLog(byteBuffer0, (byte)48);
        fail("Expecting exception: BufferUnderflowException");
      
      } catch(BufferUnderflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.nio.Buffer", e);
      }
  }

  @Test
  public void test08()  throws Throwable  {
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
  public void test09()  throws Throwable  {
      DupCountLN dupCountLN0 = new DupCountLN(333);
      // Undeclared exception!
      try { 
        dupCountLN0.dumpString(666, true);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: 666
         //
         assertThrownBy("java.lang.String", e);
      }
  }

  @Test
  public void test10()  throws Throwable  {
      DupCountLN dupCountLN0 = new DupCountLN((-6));
      dupCountLN0.beginTag();
      //  // Unstable assertion: assertEquals(176L, dupCountLN0.getNodeId());
  }

  @Test
  public void test11()  throws Throwable  {
      DupCountLN dupCountLN0 = new DupCountLN(1957);
      dupCountLN0.endTag();
      //  // Unstable assertion: assertEquals(171L, dupCountLN0.getNodeId());
  }

  @Test
  public void test12()  throws Throwable  {
      DupCountLN dupCountLN0 = new DupCountLN((-1));
      String string0 = dupCountLN0.dumpString(0, false);
      //  // Unstable assertion: assertEquals("  <count v=\"-1\"/>\n  <node>138</node>\n  <data></data>\n", string0);
  }

  @Test
  public void test15()  throws Throwable  {
      DupCountLN dupCountLN0 = new DupCountLN();
      dupCountLN0.incDupCount();
      int int0 = dupCountLN0.getDupCount();
      assertEquals(1, int0);
  }

  @Test
  public void test16()  throws Throwable  {
      DupCountLN dupCountLN0 = new DupCountLN((-1));
      int int0 = dupCountLN0.getLogSize();
      //  // Unstable assertion: assertEquals(87L, dupCountLN0.getNodeId());
      //  // Unstable assertion: assertEquals(17, int0);
  }

  @Test
  public void test17()  throws Throwable  {
      DupCountLN dupCountLN0 = new DupCountLN((-3167));
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("<com.sleepycat.je.tree.DupCountLN/526147");
      dupCountLN0.writeToLog(byteBuffer0);
      assertEquals(23, byteBuffer0.remaining());
      assertEquals(-3167, dupCountLN0.getDupCount());
  }

  @Test
  public void test18()  throws Throwable  {
      DupCountLN dupCountLN0 = new DupCountLN(1957);
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
  public void test19()  throws Throwable  {
      DupCountLN dupCountLN0 = new DupCountLN((-6));
      boolean boolean0 = dupCountLN0.isDeleted();
      //  // Unstable assertion: assertEquals(70L, dupCountLN0.getLastId());
      //  // Unstable assertion: assertFalse(boolean0);
  }

  @Test
  public void test20()  throws Throwable  {
      DupCountLN dupCountLN0 = new DupCountLN();
      dupCountLN0.getLogType();
      assertEquals(0, dupCountLN0.getDupCount());
  }

  @Test
  public void test22()  throws Throwable  {
      DupCountLN dupCountLN0 = new DupCountLN();
      dupCountLN0.getTransactionalLogType();
      assertEquals(0, dupCountLN0.getDupCount());
  }

  @Test
  public void test23()  throws Throwable  {
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
  public void test24()  throws Throwable  {
      DupCountLN dupCountLN0 = new DupCountLN((-6));
      boolean boolean0 = dupCountLN0.containsDuplicates();
      //  // Unstable assertion: assertEquals(65L, dupCountLN0.getNodeId());
      //  // Unstable assertion: assertTrue(boolean0);
  }

  @Test
  public void test25()  throws Throwable  {
      DupCountLN dupCountLN0 = new DupCountLN();
      String string0 = dupCountLN0.toString();
      assertEquals("<dupCountLN>\n  <count v=\"0\"/>\n  <node>0</node>\n</dupCountLN>", string0);
  }

  @Test
  public void test26()  throws Throwable  {
      DupCountLN dupCountLN0 = new DupCountLN(0);
      dupCountLN0.dumpString(0, true);
      //  // Unstable assertion: assertEquals(15L, dupCountLN0.getNodeId());
  }

  @Test
  public void test27()  throws Throwable  {
      DupCountLN dupCountLN0 = new DupCountLN((-6));
      // Undeclared exception!
      try { 
        dupCountLN0.readFromLog((ByteBuffer) null, (byte) (-87));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.LogUtils", e);
      }
  }

  @Test
  public void test28()  throws Throwable  {
      DupCountLN dupCountLN0 = new DupCountLN((-6));
      int int0 = dupCountLN0.getDupCount();
      assertEquals((-6), int0);
  }
}
