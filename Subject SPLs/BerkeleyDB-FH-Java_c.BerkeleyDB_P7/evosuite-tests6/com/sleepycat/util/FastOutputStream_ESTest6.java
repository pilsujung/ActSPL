/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 03:11:56 KST 2017
 */

package com.sleepycat.util;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.fail;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PipedOutputStream;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class FastOutputStream_ESTest6 extends FastOutputStream_ESTest_scaffolding6 {

  @Test
  public void test00()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      FastOutputStream fastOutputStream0 = new FastOutputStream(byteArray0, (int) (byte)59);
      fastOutputStream0.addSize((-2801));
      int int0 = fastOutputStream0.size();
      assertEquals(-2801, fastOutputStream0.getBufferLength());
      assertEquals((-2801), int0);
  }

  @Test
  public void test01()  throws Throwable  {
      FastOutputStream fastOutputStream0 = new FastOutputStream(1939, 1);
      fastOutputStream0.addSize((-1614));
      int int0 = fastOutputStream0.getBufferLength();
      assertEquals((-1614), int0);
  }

  @Test
  public void test02()  throws Throwable  {
      FastOutputStream fastOutputStream0 = new FastOutputStream((byte[]) null);
      byte[] byteArray0 = fastOutputStream0.getBufferBytes();
      assertNull(byteArray0);
  }

  @Test
  public void test03()  throws Throwable  {
      FastOutputStream fastOutputStream0 = new FastOutputStream(11, (-793));
      byte[] byteArray0 = fastOutputStream0.getBufferBytes();
      assertNotNull(byteArray0);
  }

  @Test
  public void test04()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      FastOutputStream fastOutputStream0 = new FastOutputStream(byteArray0, (-1));
      fastOutputStream0.write((-1));
      assertEquals(1, fastOutputStream0.size());
  }

  @Test
  public void test05()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      FastOutputStream fastOutputStream0 = new FastOutputStream(byteArray0);
      fastOutputStream0.writeFast(byteArray0);
      fastOutputStream0.addSize((byte)0);
      assertEquals(2, fastOutputStream0.getBufferLength());
  }

  @Test
  public void test06()  throws Throwable  {
      FastOutputStream fastOutputStream0 = new FastOutputStream(1500, 1075);
      fastOutputStream0.makeSpace(1500);
      assertEquals(0, fastOutputStream0.getBufferOffset());
  }

  @Test
  public void test07()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      FastOutputStream fastOutputStream0 = new FastOutputStream(byteArray0);
      fastOutputStream0.writeFast(byteArray0);
      PrintStream printStream0 = new PrintStream((OutputStream) fastOutputStream0);
      Object[] objectArray0 = new Object[0];
      printStream0.format("ycPz", objectArray0);
      assertEquals(6, fastOutputStream0.getBufferLength());
      assertEquals(6, fastOutputStream0.size());
  }

  @Test
  public void test08()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      FastOutputStream fastOutputStream0 = new FastOutputStream(byteArray0);
      fastOutputStream0.write(1);
      assertArrayEquals(new byte[] {(byte)1}, byteArray0);
      assertEquals(1, fastOutputStream0.size());
  }

  @Test
  public void test09()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      FastOutputStream fastOutputStream0 = new FastOutputStream(byteArray0, (int) (byte)84);
      // Undeclared exception!
      try { 
        fastOutputStream0.write(byteArray0, (int) (byte)84, (int) (byte)84);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.lang.System", e);
      }
  }

  @Test
  public void test10()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      FastOutputStream fastOutputStream0 = new FastOutputStream(byteArray0);
      fastOutputStream0.write(byteArray0);
      int int0 = fastOutputStream0.size();
      assertEquals(1, fastOutputStream0.getBufferLength());
      assertEquals(1, int0);
  }

  @Test
  public void test11()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      FastOutputStream fastOutputStream0 = new FastOutputStream(byteArray0);
      fastOutputStream0.write(byteArray0, 0, 0);
      assertEquals(0, fastOutputStream0.size());
  }

  @Test
  public void test12()  throws Throwable  {
      FastOutputStream fastOutputStream0 = new FastOutputStream();
      fastOutputStream0.writeFast(0);
      fastOutputStream0.toByteArray();
      assertEquals(1, fastOutputStream0.getBufferLength());
  }

  @Test
  public void test13()  throws Throwable  {
      FastOutputStream fastOutputStream0 = new FastOutputStream(11, (-793));
      // Undeclared exception!
      try { 
        fastOutputStream0.writeTo((OutputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.util.FastOutputStream", e);
      }
  }

  @Test
  public void test14()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      FastOutputStream fastOutputStream0 = new FastOutputStream(byteArray0, (-98));
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(3);
      fastOutputStream0.addSize((-3295));
      // Undeclared exception!
      try { 
        fastOutputStream0.writeTo(byteArrayOutputStream0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.io.ByteArrayOutputStream", e);
      }
  }

  @Test
  public void test15()  throws Throwable  {
      FastOutputStream fastOutputStream0 = new FastOutputStream();
      fastOutputStream0.addSize((-3809));
      PrintStream printStream0 = new PrintStream((OutputStream) fastOutputStream0, true);
      // Undeclared exception!
      try { 
        fastOutputStream0.writeTo(printStream0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.lang.System", e);
      }
  }

  @Test
  public void test16()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      FastOutputStream fastOutputStream0 = new FastOutputStream(byteArray0);
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      try { 
        fastOutputStream0.writeTo(pipedOutputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         assertThrownBy("java.io.PipedOutputStream", e);
      }
  }

  @Test
  public void test17()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      FastOutputStream fastOutputStream0 = new FastOutputStream(byteArray0, (int) (byte)32);
      // Undeclared exception!
      try { 
        fastOutputStream0.writeFast((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.util.FastOutputStream", e);
      }
  }

  @Test
  public void test18()  throws Throwable  {
      FastOutputStream fastOutputStream0 = new FastOutputStream();
      byte[] byteArray0 = new byte[7];
      fastOutputStream0.addSize(1212);
      // Undeclared exception!
      try { 
        fastOutputStream0.writeFast(byteArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.lang.System", e);
      }
  }

  @Test
  public void test19()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      FastOutputStream fastOutputStream0 = new FastOutputStream(byteArray0);
      fastOutputStream0.addSize((byte)35);
      // Undeclared exception!
      try { 
        fastOutputStream0.writeFast((int) (byte)35);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.lang.System", e);
      }
  }

  @Test
  public void test20()  throws Throwable  {
      FastOutputStream fastOutputStream0 = new FastOutputStream(0, 8);
      byte[] byteArray0 = new byte[2];
      fastOutputStream0.addSize((byte) (-112));
      // Undeclared exception!
      try { 
        fastOutputStream0.write(byteArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.lang.System", e);
      }
  }

  @Test
  public void test21()  throws Throwable  {
      FastOutputStream fastOutputStream0 = new FastOutputStream((byte[]) null);
      // Undeclared exception!
      try { 
        fastOutputStream0.write((-100));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.util.FastOutputStream", e);
      }
  }

  @Test
  public void test22()  throws Throwable  {
      FastOutputStream fastOutputStream0 = new FastOutputStream();
      fastOutputStream0.addSize((-147));
      // Undeclared exception!
      try { 
        fastOutputStream0.write((-507));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -147
         //
         assertThrownBy("com.sleepycat.util.FastOutputStream", e);
      }
  }

  @Test
  public void test23()  throws Throwable  {
      FastOutputStream fastOutputStream0 = new FastOutputStream();
      fastOutputStream0.addSize((-119));
      // Undeclared exception!
      try { 
        fastOutputStream0.toString("3I:gowfFzy]Ub");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -119
         //
         assertThrownBy("java.lang.String", e);
      }
  }

  @Test
  public void test24()  throws Throwable  {
      FastOutputStream fastOutputStream0 = new FastOutputStream((byte[]) null);
      // Undeclared exception!
      try { 
        fastOutputStream0.toString("_)Ah");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.lang.String", e);
      }
  }

  @Test
  public void test25()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      FastOutputStream fastOutputStream0 = new FastOutputStream(byteArray0, (int) (byte)100);
      fastOutputStream0.addSize((byte)100);
      // Undeclared exception!
      try { 
        fastOutputStream0.toString();
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: 100
         //
         assertThrownBy("java.lang.String", e);
      }
  }

  @Test
  public void test26()  throws Throwable  {
      FastOutputStream fastOutputStream0 = new FastOutputStream();
      fastOutputStream0.addSize(4477);
      // Undeclared exception!
      try { 
        fastOutputStream0.toByteArray();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.lang.System", e);
      }
  }

  @Test
  public void test27()  throws Throwable  {
      FastOutputStream fastOutputStream0 = new FastOutputStream((byte[]) null);
      // Undeclared exception!
      try { 
        fastOutputStream0.makeSpace(4573);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.util.FastOutputStream", e);
      }
  }

  @Test
  public void test28()  throws Throwable  {
      FastOutputStream fastOutputStream0 = new FastOutputStream();
      fastOutputStream0.addSize(2419);
      // Undeclared exception!
      try { 
        fastOutputStream0.makeSpace(2419);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.lang.System", e);
      }
  }

  @Test
  public void test29()  throws Throwable  {
      FastOutputStream fastOutputStream0 = null;
      try {
        fastOutputStream0 = new FastOutputStream((-493), (-493));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.util.FastOutputStream", e);
      }
  }

  @Test
  public void test30()  throws Throwable  {
      FastOutputStream fastOutputStream0 = null;
      try {
        fastOutputStream0 = new FastOutputStream((-1342));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.util.FastOutputStream", e);
      }
  }

  @Test
  public void test31()  throws Throwable  {
      FastOutputStream fastOutputStream0 = new FastOutputStream(0, 8);
      byte[] byteArray0 = new byte[2];
      fastOutputStream0.writeFast(byteArray0, 2, 0);
      assertEquals(0, fastOutputStream0.size());
  }

  @Test
  public void test32()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      FastOutputStream fastOutputStream0 = new FastOutputStream(byteArray0, 0);
      // Undeclared exception!
      try { 
        fastOutputStream0.writeFast(byteArray0, (-688), 1284);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.lang.System", e);
      }
  }

  @Test
  public void test33()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      FastOutputStream fastOutputStream0 = new FastOutputStream(byteArray0, 0);
      fastOutputStream0.makeSpace((-3625));
      assertEquals(0, fastOutputStream0.size());
  }

  @Test
  public void test34()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      FastOutputStream fastOutputStream0 = new FastOutputStream(byteArray0, (int) (byte)32);
      // Undeclared exception!
      try { 
        fastOutputStream0.write((byte[]) null, (int) (byte)0, 2247);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.lang.System", e);
      }
  }

  @Test
  public void test35()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      FastOutputStream fastOutputStream0 = new FastOutputStream(byteArray0, (int) (byte)32);
      fastOutputStream0.writeFast(byteArray0);
      fastOutputStream0.writeFast(byteArray0);
      assertEquals(4, fastOutputStream0.size());
  }

  @Test
  public void test36()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      FastOutputStream fastOutputStream0 = new FastOutputStream(byteArray0, (int) (byte)59);
      byte[] byteArray1 = fastOutputStream0.toByteArray();
      assertFalse(byteArray1.equals((Object)byteArray0));
  }

  @Test
  public void test37()  throws Throwable  {
      FastOutputStream fastOutputStream0 = new FastOutputStream(0, 0);
      int int0 = fastOutputStream0.getBufferOffset();
      assertEquals(0, int0);
  }

  @Test
  public void test38()  throws Throwable  {
      FastOutputStream fastOutputStream0 = new FastOutputStream();
      String string0 = fastOutputStream0.toString();
      assertEquals("", string0);
  }

  @Test
  public void test39()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      FastOutputStream fastOutputStream0 = new FastOutputStream(byteArray0, (int) (byte)59);
      try { 
        fastOutputStream0.toString(".");
        fail("Expecting exception: UnsupportedEncodingException");
      
      } catch(UnsupportedEncodingException e) {
         //
         // .
         //
         assertThrownBy("java.lang.StringCoding", e);
      }
  }

  @Test
  public void test40()  throws Throwable  {
      FastOutputStream fastOutputStream0 = new FastOutputStream(0, 0);
      int int0 = fastOutputStream0.getBufferLength();
      assertEquals(0, int0);
  }

  @Test
  public void test41()  throws Throwable  {
      FastOutputStream fastOutputStream0 = new FastOutputStream();
      PrintStream printStream0 = new PrintStream((OutputStream) fastOutputStream0, true);
      fastOutputStream0.writeTo(printStream0);
      assertEquals(0, fastOutputStream0.getBufferLength());
  }

  @Test
  public void test42()  throws Throwable  {
      FastOutputStream fastOutputStream0 = new FastOutputStream(0, 0);
      fastOutputStream0.reset();
      assertEquals(0, fastOutputStream0.getBufferLength());
  }

  @Test
  public void test43()  throws Throwable  {
      FastOutputStream fastOutputStream0 = new FastOutputStream(3130);
      fastOutputStream0.addSize((-255));
      // Undeclared exception!
      try { 
        fastOutputStream0.toByteArray();
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.util.FastOutputStream", e);
      }
  }

  @Test
  public void test44()  throws Throwable  {
      FastOutputStream fastOutputStream0 = new FastOutputStream(0, 0);
      // Undeclared exception!
      try { 
        fastOutputStream0.write((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.util.FastOutputStream", e);
      }
  }

  @Test
  public void test45()  throws Throwable  {
      FastOutputStream fastOutputStream0 = new FastOutputStream(0, 0);
      byte[] byteArray0 = fastOutputStream0.getBufferBytes();
      assertArrayEquals(new byte[] {}, byteArray0);
  }

  @Test
  public void test46()  throws Throwable  {
      FastOutputStream fastOutputStream0 = new FastOutputStream((byte[]) null);
      int int0 = fastOutputStream0.size();
      assertEquals(0, int0);
  }

  @Test
  public void test47()  throws Throwable  {
      FastOutputStream fastOutputStream0 = new FastOutputStream(0, 0);
      fastOutputStream0.write(0);
      int int0 = fastOutputStream0.getBufferLength();
      assertEquals(1, fastOutputStream0.size());
      assertEquals(1, int0);
  }
}
