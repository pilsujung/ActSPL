/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 12:40:04 KST 2017
 */

package com.sleepycat.util;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PipedOutputStream;
import java.io.UnsupportedEncodingException;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class FastOutputStream_ESTest5 extends FastOutputStream_ESTest_scaffolding5 {

  @Test
  public void test00()  throws Throwable  {
      FastOutputStream fastOutputStream0 = new FastOutputStream();
      fastOutputStream0.addSize((-3716));
      int int0 = fastOutputStream0.size();
      assertEquals(-3716, fastOutputStream0.getBufferLength());
      assertEquals((-3716), int0);
  }

  @Test
  public void test01()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      FastOutputStream fastOutputStream0 = new FastOutputStream(byteArray0, (-2562));
      byte[] byteArray1 = fastOutputStream0.getBufferBytes();
      assertArrayEquals(new byte[] {}, byteArray1);
  }

  @Test
  public void test02()  throws Throwable  {
      FastOutputStream fastOutputStream0 = new FastOutputStream();
      fastOutputStream0.makeSpace((-2251));
      assertEquals(0, fastOutputStream0.size());
  }

  @Test
  public void test03()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      FastOutputStream fastOutputStream0 = new FastOutputStream(byteArray0, (int) (byte)93);
      fastOutputStream0.write((-529));
      int int0 = fastOutputStream0.getBufferLength();
      assertArrayEquals(new byte[] {(byte) (-17), (byte)0, (byte)0, (byte)0}, byteArray0);
      assertEquals(1, int0);
  }

  @Test
  public void test04()  throws Throwable  {
      FastOutputStream fastOutputStream0 = new FastOutputStream();
      fastOutputStream0.writeFast(0);
      fastOutputStream0.writeTo(fastOutputStream0);
      assertEquals(2, fastOutputStream0.getBufferLength());
  }

  @Test
  public void test05()  throws Throwable  {
      FastOutputStream fastOutputStream0 = new FastOutputStream();
      fastOutputStream0.writeFast(3286);
      fastOutputStream0.write(0);
      assertEquals(2, fastOutputStream0.size());
  }

  @Test
  public void test06()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      FastOutputStream fastOutputStream0 = new FastOutputStream(byteArray0);
      fastOutputStream0.writeFast((-1));
      assertEquals(1, fastOutputStream0.size());
  }

  @Test
  public void test07()  throws Throwable  {
      FastOutputStream fastOutputStream0 = new FastOutputStream();
      fastOutputStream0.writeFast(3286);
      int int0 = fastOutputStream0.size();
      assertEquals(1, int0);
  }

  @Test
  public void test08()  throws Throwable  {
      FastOutputStream fastOutputStream0 = new FastOutputStream((int) (byte)98, (int) (byte) (-28));
      assertEquals(0, fastOutputStream0.size());
  }

  @Test
  public void test09()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      FastOutputStream fastOutputStream0 = new FastOutputStream(byteArray0);
      fastOutputStream0.write(byteArray0, (int) (byte)0, (int) (byte)0);
      assertEquals(0, fastOutputStream0.getBufferLength());
  }

  @Test
  public void test10()  throws Throwable  {
      FastOutputStream fastOutputStream0 = new FastOutputStream(0, 0);
      DataOutputStream dataOutputStream0 = new DataOutputStream((OutputStream) fastOutputStream0);
      fastOutputStream0.writeTo(dataOutputStream0);
      assertEquals(0, fastOutputStream0.size());
  }

  @Test
  public void test11()  throws Throwable  {
      FastOutputStream fastOutputStream0 = new FastOutputStream(119);
      assertEquals(0, fastOutputStream0.size());
  }

  @Test
  public void test12()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      FastOutputStream fastOutputStream0 = new FastOutputStream(byteArray0, (int) (byte)16);
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
  public void test13()  throws Throwable  {
      FastOutputStream fastOutputStream0 = new FastOutputStream();
      fastOutputStream0.addSize(119);
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
  public void test14()  throws Throwable  {
      FastOutputStream fastOutputStream0 = new FastOutputStream(1325, 1325);
      // Undeclared exception!
      try { 
        fastOutputStream0.writeFast((byte[]) null, (int) (byte)0, (-1));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.lang.System", e);
      }
  }

  @Test
  public void test15()  throws Throwable  {
      FastOutputStream fastOutputStream0 = new FastOutputStream(1, 1);
      byte[] byteArray0 = new byte[3];
      fastOutputStream0.addSize((byte) (-68));
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
  public void test16()  throws Throwable  {
      FastOutputStream fastOutputStream0 = new FastOutputStream((byte[]) null, 1);
      // Undeclared exception!
      try { 
        fastOutputStream0.writeFast((-2416));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.util.FastOutputStream", e);
      }
  }

  @Test
  public void test17()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      FastOutputStream fastOutputStream0 = new FastOutputStream((byte[]) null);
      // Undeclared exception!
      try { 
        fastOutputStream0.write(byteArray0, (int) (byte)65, (int) (byte)0);
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
      byte[] byteArray0 = new byte[5];
      FastOutputStream fastOutputStream0 = new FastOutputStream((byte[]) null);
      // Undeclared exception!
      try { 
        fastOutputStream0.write(byteArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.util.FastOutputStream", e);
      }
  }

  @Test
  public void test19()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      FastOutputStream fastOutputStream0 = new FastOutputStream(byteArray0, 727);
      fastOutputStream0.addSize((byte)93);
      // Undeclared exception!
      try { 
        fastOutputStream0.toString("");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: 93
         //
         assertThrownBy("java.lang.String", e);
      }
  }

  @Test
  public void test20()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      FastOutputStream fastOutputStream0 = new FastOutputStream(byteArray0, 1400);
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
  public void test21()  throws Throwable  {
      FastOutputStream fastOutputStream0 = new FastOutputStream();
      fastOutputStream0.addSize((-190));
      // Undeclared exception!
      try { 
        fastOutputStream0.toString();
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -190
         //
         assertThrownBy("java.lang.String", e);
      }
  }

  @Test
  public void test22()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      FastOutputStream fastOutputStream0 = new FastOutputStream(byteArray0);
      fastOutputStream0.addSize((-2172));
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
  public void test23()  throws Throwable  {
      FastOutputStream fastOutputStream0 = new FastOutputStream();
      fastOutputStream0.addSize(576);
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
  public void test24()  throws Throwable  {
      FastOutputStream fastOutputStream0 = new FastOutputStream((byte[]) null, 0);
      // Undeclared exception!
      try { 
        fastOutputStream0.makeSpace(10);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.util.FastOutputStream", e);
      }
  }

  @Test
  public void test25()  throws Throwable  {
      FastOutputStream fastOutputStream0 = new FastOutputStream(2, 2);
      fastOutputStream0.addSize(16);
      // Undeclared exception!
      try { 
        fastOutputStream0.makeSpace(3);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.lang.System", e);
      }
  }

  @Test
  public void test26()  throws Throwable  {
      FastOutputStream fastOutputStream0 = null;
      try {
        fastOutputStream0 = new FastOutputStream((-236), (-236));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.util.FastOutputStream", e);
      }
  }

  @Test
  public void test27()  throws Throwable  {
      FastOutputStream fastOutputStream0 = new FastOutputStream();
      byte[] byteArray0 = new byte[0];
      fastOutputStream0.writeFast(byteArray0, 0, 0);
      assertEquals(0, fastOutputStream0.getBufferLength());
  }

  @Test
  public void test28()  throws Throwable  {
      FastOutputStream fastOutputStream0 = new FastOutputStream();
      byte[] byteArray0 = new byte[2];
      fastOutputStream0.writeFast(byteArray0);
      fastOutputStream0.addSize(1196);
      assertEquals(1198, fastOutputStream0.getBufferLength());
  }

  @Test
  public void test29()  throws Throwable  {
      FastOutputStream fastOutputStream0 = new FastOutputStream();
      byte[] byteArray0 = fastOutputStream0.getBufferBytes();
      fastOutputStream0.writeFast(3286);
      fastOutputStream0.writeFast(byteArray0);
      assertEquals(101, fastOutputStream0.getBufferLength());
  }

  @Test
  public void test30()  throws Throwable  {
      FastOutputStream fastOutputStream0 = new FastOutputStream();
      fastOutputStream0.addSize(576);
      // Undeclared exception!
      try { 
        fastOutputStream0.writeFast(0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.lang.System", e);
      }
  }

  @Test
  public void test31()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      FastOutputStream fastOutputStream0 = new FastOutputStream(byteArray0, (-20));
      fastOutputStream0.makeSpace(10);
      assertEquals(0, fastOutputStream0.getBufferLength());
  }

  @Test
  public void test32()  throws Throwable  {
      FastOutputStream fastOutputStream0 = new FastOutputStream(9, 9);
      fastOutputStream0.makeSpace(9);
      assertEquals(0, fastOutputStream0.getBufferLength());
  }

  @Test
  public void test33()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      FastOutputStream fastOutputStream0 = new FastOutputStream(byteArray0, (int) (byte) (-22));
      // Undeclared exception!
      try { 
        fastOutputStream0.writeFast(byteArray0, (-23), (int) (byte)122);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.lang.System", e);
      }
  }

  @Test
  public void test34()  throws Throwable  {
      FastOutputStream fastOutputStream0 = new FastOutputStream();
      byte[] byteArray0 = new byte[2];
      fastOutputStream0.addSize(1196);
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
  public void test35()  throws Throwable  {
      FastOutputStream fastOutputStream0 = new FastOutputStream(1582, 1582);
      fastOutputStream0.addSize(2987);
      // Undeclared exception!
      try { 
        fastOutputStream0.write(2987);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.lang.System", e);
      }
  }

  @Test
  public void test36()  throws Throwable  {
      FastOutputStream fastOutputStream0 = new FastOutputStream(9, 9);
      byte[] byteArray0 = fastOutputStream0.toByteArray();
      assertArrayEquals(new byte[] {}, byteArray0);
  }

  @Test
  public void test37()  throws Throwable  {
      FastOutputStream fastOutputStream0 = new FastOutputStream(1582, 1582);
      int int0 = fastOutputStream0.getBufferOffset();
      assertEquals(0, int0);
  }

  @Test
  public void test38()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      FastOutputStream fastOutputStream0 = new FastOutputStream(byteArray0, (int) (byte)69);
      fastOutputStream0.addSize((-930));
      int int0 = fastOutputStream0.getBufferLength();
      assertEquals((-930), int0);
  }

  @Test
  public void test39()  throws Throwable  {
      FastOutputStream fastOutputStream0 = new FastOutputStream(2, 2);
      String string0 = fastOutputStream0.toString();
      assertEquals("", string0);
  }

  @Test
  public void test40()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      FastOutputStream fastOutputStream0 = new FastOutputStream(byteArray0, 727);
      try { 
        fastOutputStream0.toString("");
        fail("Expecting exception: UnsupportedEncodingException");
      
      } catch(UnsupportedEncodingException e) {
         //
         // 
         //
         assertThrownBy("java.lang.StringCoding", e);
      }
  }

  @Test
  public void test41()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      FastOutputStream fastOutputStream0 = new FastOutputStream(byteArray0, (int) (byte)69);
      // Undeclared exception!
      try { 
        fastOutputStream0.write(byteArray0, 601, (-1225));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.lang.System", e);
      }
  }

  @Test
  public void test42()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      FastOutputStream fastOutputStream0 = new FastOutputStream(byteArray0, (int) (byte)69);
      int int0 = fastOutputStream0.getBufferLength();
      assertEquals(0, int0);
  }

  @Test
  public void test43()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      FastOutputStream fastOutputStream0 = new FastOutputStream(byteArray0, (-20));
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
  public void test44()  throws Throwable  {
      FastOutputStream fastOutputStream0 = new FastOutputStream(1325, 1325);
      fastOutputStream0.reset();
      assertEquals(0, fastOutputStream0.size());
  }

  @Test
  public void test45()  throws Throwable  {
      FastOutputStream fastOutputStream0 = null;
      try {
        fastOutputStream0 = new FastOutputStream((-707));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.util.FastOutputStream", e);
      }
  }

  @Test
  public void test46()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      FastOutputStream fastOutputStream0 = new FastOutputStream(byteArray0);
      fastOutputStream0.write(byteArray0);
      fastOutputStream0.toByteArray();
      assertEquals(5, fastOutputStream0.size());
  }

}
