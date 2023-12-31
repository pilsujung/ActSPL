/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 21 22:29:51 KST 2017
 */

package com.sleepycat.util;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.fail;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.PipedOutputStream;
import java.io.UnsupportedEncodingException;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class FastOutputStream_ESTest7 extends FastOutputStream_ESTest_scaffolding7 {

  @Test
  public void test00()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      FastOutputStream fastOutputStream0 = new FastOutputStream(byteArray0);
      fastOutputStream0.write((int) (byte)116);
      int int0 = fastOutputStream0.size();
      assertEquals(1, int0);
  }

  @Test
  public void test01()  throws Throwable  {
      FastOutputStream fastOutputStream0 = new FastOutputStream(0, 0);
      fastOutputStream0.writeFast((int) (byte)5);
      int int0 = fastOutputStream0.getBufferLength();
      assertEquals(1, fastOutputStream0.size());
      assertEquals(1, int0);
  }

  @Test
  public void test02()  throws Throwable  {
      FastOutputStream fastOutputStream0 = new FastOutputStream(0, 0);
      byte[] byteArray0 = fastOutputStream0.getBufferBytes();
      assertArrayEquals(new byte[] {}, byteArray0);
  }

  @Test
  public void test03()  throws Throwable  {
      FastOutputStream fastOutputStream0 = new FastOutputStream();
      fastOutputStream0.makeSpace(0);
      assertEquals(0, fastOutputStream0.getBufferOffset());
  }

  @Test
  public void test04()  throws Throwable  {
      FastOutputStream fastOutputStream0 = new FastOutputStream();
      fastOutputStream0.addSize((-366));
      int int0 = fastOutputStream0.getBufferLength();
      assertEquals((-366), int0);
  }

  @Test
  public void test05()  throws Throwable  {
      FastOutputStream fastOutputStream0 = new FastOutputStream(0, 0);
      byte[] byteArray0 = new byte[9];
      fastOutputStream0.writeFast((int) (byte)5);
      fastOutputStream0.write(byteArray0, 0, (int) (byte)3);
      assertEquals(4, fastOutputStream0.getBufferLength());
  }

  @Test
  public void test06()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      FastOutputStream fastOutputStream0 = new FastOutputStream(byteArray0, 0);
      fastOutputStream0.writeFast(0);
      assertEquals(1, fastOutputStream0.getBufferLength());
  }

  @Test
  public void test07()  throws Throwable  {
      FastOutputStream fastOutputStream0 = new FastOutputStream(40);
      fastOutputStream0.addSize((-1118));
      int int0 = fastOutputStream0.size();
      assertEquals(-1118, fastOutputStream0.getBufferLength());
      assertEquals((-1118), int0);
  }

  @Test
  public void test08()  throws Throwable  {
      FastOutputStream fastOutputStream0 = new FastOutputStream(290, 290);
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(3917);
      fastOutputStream0.writeTo(byteArrayOutputStream0);
      assertEquals("", byteArrayOutputStream0.toString());
      assertEquals(0, byteArrayOutputStream0.size());
  }

  @Test
  public void test09()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      FastOutputStream fastOutputStream0 = new FastOutputStream(byteArray0, (int) (byte)0);
      fastOutputStream0.write(byteArray0);
      fastOutputStream0.toByteArray();
      assertEquals(5, fastOutputStream0.size());
  }

  @Test
  public void test10()  throws Throwable  {
      FastOutputStream fastOutputStream0 = new FastOutputStream();
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
  public void test11()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      FastOutputStream fastOutputStream0 = new FastOutputStream(byteArray0);
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream((OutputStream) fastOutputStream0);
      fastOutputStream0.addSize((-2350));
      // Undeclared exception!
      try { 
        fastOutputStream0.writeTo(objectOutputStream0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.io.ObjectOutputStream", e);
      }
  }

  @Test
  public void test12()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      FastOutputStream fastOutputStream0 = new FastOutputStream(byteArray0);
      fastOutputStream0.addSize((byte) (-27));
      // Undeclared exception!
      try { 
        fastOutputStream0.writeTo(fastOutputStream0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.lang.System", e);
      }
  }

  @Test
  public void test13()  throws Throwable  {
      FastOutputStream fastOutputStream0 = new FastOutputStream(290, 290);
      byte[] byteArray0 = new byte[3];
      // Undeclared exception!
      try { 
        fastOutputStream0.writeFast(byteArray0, (int) (byte)0, (-2840));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.lang.System", e);
      }
  }

  @Test
  public void test14()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      FastOutputStream fastOutputStream0 = new FastOutputStream(byteArray0);
      fastOutputStream0.addSize((-21));
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
  public void test15()  throws Throwable  {
      FastOutputStream fastOutputStream0 = new FastOutputStream();
      fastOutputStream0.addSize((-845));
      // Undeclared exception!
      try { 
        fastOutputStream0.writeFast(2);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -845
         //
         assertThrownBy("com.sleepycat.util.FastOutputStream", e);
      }
  }

  @Test
  public void test16()  throws Throwable  {
      FastOutputStream fastOutputStream0 = new FastOutputStream(0, 0);
      // Undeclared exception!
      try { 
        fastOutputStream0.write((byte[]) null, 0, (int) (byte)3);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.lang.System", e);
      }
  }

  @Test
  public void test17()  throws Throwable  {
      FastOutputStream fastOutputStream0 = new FastOutputStream();
      byte[] byteArray0 = new byte[0];
      // Undeclared exception!
      try { 
        fastOutputStream0.write(byteArray0, 3, 482);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.lang.System", e);
      }
  }

  @Test
  public void test18()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      FastOutputStream fastOutputStream0 = new FastOutputStream(byteArray0, (-853));
      fastOutputStream0.addSize((-853));
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
  public void test19()  throws Throwable  {
      FastOutputStream fastOutputStream0 = new FastOutputStream();
      fastOutputStream0.addSize(3469);
      // Undeclared exception!
      try { 
        fastOutputStream0.write(3469);
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
      FastOutputStream fastOutputStream0 = new FastOutputStream();
      fastOutputStream0.addSize((-366));
      // Undeclared exception!
      try { 
        fastOutputStream0.toString(".");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -366
         //
         assertThrownBy("java.lang.String", e);
      }
  }

  @Test
  public void test21()  throws Throwable  {
      FastOutputStream fastOutputStream0 = new FastOutputStream();
      // Undeclared exception!
      try { 
        fastOutputStream0.toString((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // charsetName
         //
         assertThrownBy("java.lang.String", e);
      }
  }

  @Test
  public void test22()  throws Throwable  {
      byte[] byteArray0 = new byte[17];
      FastOutputStream fastOutputStream0 = new FastOutputStream(byteArray0);
      fastOutputStream0.addSize(1025);
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
  public void test23()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      FastOutputStream fastOutputStream0 = new FastOutputStream(byteArray0, (int) (byte)0);
      fastOutputStream0.addSize((byte) (-115));
      // Undeclared exception!
      try { 
        fastOutputStream0.makeSpace(4534);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.lang.System", e);
      }
  }

  @Test
  public void test24()  throws Throwable  {
      FastOutputStream fastOutputStream0 = null;
      try {
        fastOutputStream0 = new FastOutputStream((-4220), 0);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.util.FastOutputStream", e);
      }
  }

  @Test
  public void test25()  throws Throwable  {
      FastOutputStream fastOutputStream0 = null;
      try {
        fastOutputStream0 = new FastOutputStream((-1));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.util.FastOutputStream", e);
      }
  }

  @Test
  public void test26()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      FastOutputStream fastOutputStream0 = new FastOutputStream(byteArray0);
      fastOutputStream0.writeFast(byteArray0);
      assertEquals(7, fastOutputStream0.size());
  }

  @Test
  public void test27()  throws Throwable  {
      FastOutputStream fastOutputStream0 = new FastOutputStream(290, 290);
      // Undeclared exception!
      try { 
        fastOutputStream0.writeFast((byte[]) null, 1735, 1735);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.lang.System", e);
      }
  }

  @Test
  public void test28()  throws Throwable  {
      FastOutputStream fastOutputStream0 = new FastOutputStream(290, 290);
      fastOutputStream0.makeSpace(290);
      assertEquals(0, fastOutputStream0.size());
  }

  @Test
  public void test29()  throws Throwable  {
      FastOutputStream fastOutputStream0 = new FastOutputStream(0, 0);
      byte[] byteArray0 = new byte[9];
      fastOutputStream0.writeFast(byteArray0, 0, 0);
      assertEquals(0, fastOutputStream0.getBufferLength());
  }

  @Test
  public void test30()  throws Throwable  {
      FastOutputStream fastOutputStream0 = new FastOutputStream(0, (-3009));
      byte[] byteArray0 = new byte[1];
      fastOutputStream0.writeFast(byteArray0);
      assertEquals(1, fastOutputStream0.getBufferLength());
  }

  @Test
  public void test31()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      FastOutputStream fastOutputStream0 = new FastOutputStream(byteArray0);
      fastOutputStream0.write((int) (byte) (-93));
      fastOutputStream0.write(byteArray0);
      assertArrayEquals(new byte[] {(byte) (-93), (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
      assertEquals(8, fastOutputStream0.size());
  }

  @Test
  public void test32()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      FastOutputStream fastOutputStream0 = new FastOutputStream(byteArray0, (-853));
      byte[] byteArray1 = fastOutputStream0.toByteArray();
      assertNotSame(byteArray0, byteArray1);
  }

  @Test
  public void test33()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      FastOutputStream fastOutputStream0 = new FastOutputStream(byteArray0, (int) (byte)0);
      fastOutputStream0.addSize((-490));
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
  public void test34()  throws Throwable  {
      FastOutputStream fastOutputStream0 = new FastOutputStream();
      int int0 = fastOutputStream0.getBufferOffset();
      assertEquals(0, int0);
  }

  @Test
  public void test35()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      FastOutputStream fastOutputStream0 = new FastOutputStream(byteArray0, (-853));
      String string0 = fastOutputStream0.toString();
      assertEquals("", string0);
  }

  @Test
  public void test36()  throws Throwable  {
      FastOutputStream fastOutputStream0 = new FastOutputStream();
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
  public void test37()  throws Throwable  {
      FastOutputStream fastOutputStream0 = new FastOutputStream();
      int int0 = fastOutputStream0.getBufferLength();
      assertEquals(0, int0);
  }

  @Test
  public void test38()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
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
  public void test39()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      FastOutputStream fastOutputStream0 = new FastOutputStream(byteArray0);
      fastOutputStream0.reset();
      assertEquals(0, fastOutputStream0.size());
  }

  @Test
  public void test40()  throws Throwable  {
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
  public void test41()  throws Throwable  {
      FastOutputStream fastOutputStream0 = new FastOutputStream(290, 290);
      byte[] byteArray0 = fastOutputStream0.getBufferBytes();
      assertNotNull(byteArray0);
  }

  @Test
  public void test42()  throws Throwable  {
      FastOutputStream fastOutputStream0 = new FastOutputStream(40);
      int int0 = fastOutputStream0.size();
      assertEquals(0, int0);
  }

  @Test
  public void test43()  throws Throwable  {
      FastOutputStream fastOutputStream0 = new FastOutputStream((byte[]) null);
      // Undeclared exception!
      try { 
        fastOutputStream0.write((int) (byte)116);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.util.FastOutputStream", e);
      }
  }
}
