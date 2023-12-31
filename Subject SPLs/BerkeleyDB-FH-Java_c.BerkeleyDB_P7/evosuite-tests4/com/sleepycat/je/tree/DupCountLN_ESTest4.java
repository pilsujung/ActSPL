/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 15:58:21 KST 2017
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

import sun.nio.cs.ext.MS949;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class DupCountLN_ESTest4 extends DupCountLN_ESTest_scaffolding4 {

  @Test
  public void test00()  throws Throwable  {
      DupCountLN dupCountLN0 = new DupCountLN(0);
      int int0 = dupCountLN0.getDupCount();
      //  // Unstable assertion: assertEquals(194L, dupCountLN0.getLastId());
      //  // Unstable assertion: assertEquals(0, int0);
  }

  @Test
  public void test01()  throws Throwable  {
      DupCountLN dupCountLN0 = new DupCountLN(1773);
      int int0 = dupCountLN0.getDupCount();
      assertEquals(1773, int0);
  }

  @Test
  public void test02()  throws Throwable  {
      DupCountLN dupCountLN0 = new DupCountLN(3);
      int int0 = dupCountLN0.decDupCount();
      assertEquals(2, dupCountLN0.getDupCount());
      assertEquals(2, int0);
  }

  @Test
  public void test03()  throws Throwable  {
      DupCountLN dupCountLN0 = new DupCountLN((-1071));
      int int0 = dupCountLN0.getLogSize();
      //  // Unstable assertion: assertEquals(155L, dupCountLN0.getLastId());
      //  // Unstable assertion: assertEquals(17, int0);
  }

  @Test
  public void test04()  throws Throwable  {
      DupCountLN dupCountLN0 = new DupCountLN();
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("</dupCountLN>");
      dupCountLN0.readFromLog(byteBuffer0, (byte)0);
      assertEquals(1045318772, dupCountLN0.getDupCount());
  }

  @Test
  public void test05()  throws Throwable  {
      DupCountLN dupCountLN0 = new DupCountLN();
      StringWriter stringWriter0 = new StringWriter();
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      dupCountLN0.dumpLogAdditional(stringBuffer0, false);
      assertEquals(14, stringBuffer0.length());
      assertEquals("<count v=\"0\"/>", stringWriter0.toString());
  }

  @Test
  public void test06()  throws Throwable  {
      DupCountLN dupCountLN0 = new DupCountLN(0);
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
  public void test07()  throws Throwable  {
      DupCountLN dupCountLN0 = new DupCountLN(1773);
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
  public void test08()  throws Throwable  {
      DupCountLN dupCountLN0 = new DupCountLN(2);
      // Undeclared exception!
      try { 
        dupCountLN0.readFromLog((ByteBuffer) null, (byte)0);
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
      DupCountLN dupCountLN0 = new DupCountLN(64);
      dupCountLN0.dumpString(64, true);
      //  // Unstable assertion: assertEquals(96L, dupCountLN0.getLastId());
  }



  @Test
  public void test12()  throws Throwable  {
      DupCountLN dupCountLN0 = new DupCountLN();
      String string0 = dupCountLN0.dumpString(1, false);
      assertEquals("   <count v=\"0\"/>\n   <node>0</node>\n", string0);
  }

  @Test
  public void test13()  throws Throwable  {
      DupCountLN dupCountLN0 = new DupCountLN();
      // Undeclared exception!
      try { 
        dupCountLN0.dumpString((-131073), false);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -131071
         //
         assertThrownBy("java.lang.String", e);
      }
  }



  @Test
  public void test18()  throws Throwable  {
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
  public void test19()  throws Throwable  {
      DupCountLN dupCountLN0 = new DupCountLN((-2361));
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("o3gT)Z7TC&V(lUDeZW");
      dupCountLN0.writeToLog(byteBuffer0);
      assertEquals(17, byteBuffer0.position());
      assertEquals(-2361, dupCountLN0.getDupCount());
  }




  @Test
  public void test24()  throws Throwable  {
      DupCountLN dupCountLN0 = new DupCountLN();
      boolean boolean0 = dupCountLN0.containsDuplicates();
      assertEquals(0, dupCountLN0.getDupCount());
      assertTrue(boolean0);
  }

  @Test
  public void test25()  throws Throwable  {
      DupCountLN dupCountLN0 = new DupCountLN(1773);
      dupCountLN0.toString();
      //  // Unstable assertion: assertEquals(8L, dupCountLN0.getNodeId());
  }

  @Test
  public void test26()  throws Throwable  {
      DupCountLN dupCountLN0 = new DupCountLN();
      dupCountLN0.setDupCount((-781));
      assertEquals(-781, dupCountLN0.getDupCount());
  }


  @Test
  public void test28()  throws Throwable  {
      DupCountLN dupCountLN0 = new DupCountLN();
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("jw");
      // Undeclared exception!
      try { 
        dupCountLN0.readFromLog(byteBuffer0, (byte)2);
        fail("Expecting exception: BufferUnderflowException");
      
      } catch(BufferUnderflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.nio.Buffer", e);
      }
  }

  @Test
  public void test29()  throws Throwable  {
      DupCountLN dupCountLN0 = new DupCountLN((-2920));
      int int0 = dupCountLN0.getDupCount();
      assertEquals((-2920), int0);
  }
}
