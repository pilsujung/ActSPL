/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 02:56:35 KST 2017
 */

package com.sleepycat.util;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
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

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class FastOutputStream_ESTest10 extends FastOutputStream_ESTest_scaffolding10 {

  @Test
  public void test00()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      FastOutputStream fastOutputStream0 = new FastOutputStream(byteArray0);
      fastOutputStream0.writeFast((int) (byte)0);
      int int0 = fastOutputStream0.size();
      assertEquals(1, int0);
  }

  @Test
  public void test01()  throws Throwable  {
      FastOutputStream fastOutputStream0 = new FastOutputStream(0);
      fastOutputStream0.writeFast(1514);
      int int0 = fastOutputStream0.getBufferLength();
      assertEquals(1, int0);
  }

  @Test
  public void test02()  throws Throwable  {
      FastOutputStream fastOutputStream0 = new FastOutputStream();
      byte[] byteArray0 = fastOutputStream0.getBufferBytes();
      assertNotNull(byteArray0);
  }

  @Test
  public void test03()  throws Throwable  {
      FastOutputStream fastOutputStream0 = new FastOutputStream();
      fastOutputStream0.makeSpace(100);
      assertEquals(0, fastOutputStream0.getBufferOffset());
  }

  @Test
  public void test04()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      FastOutputStream fastOutputStream0 = new FastOutputStream(byteArray0);
      fastOutputStream0.writeFast((int) (byte)0);
      DataOutputStream dataOutputStream0 = new DataOutputStream((OutputStream) fastOutputStream0);
      fastOutputStream0.writeTo(dataOutputStream0);
      assertEquals(2, fastOutputStream0.size());
  }

  @Test
  public void test05()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      FastOutputStream fastOutputStream0 = new FastOutputStream(byteArray0, 0);
      fastOutputStream0.write((int) (byte) (-59));
      fastOutputStream0.write(byteArray0);
      // Undeclared exception!
      try { 
        fastOutputStream0.write(byteArray0, 0, 572);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.lang.System", e);
      }
  }

  @Test
  public void test06()  throws Throwable  {
      FastOutputStream fastOutputStream0 = new FastOutputStream();
      byte[] byteArray0 = new byte[5];
      fastOutputStream0.writeFast(byteArray0);
      fastOutputStream0.writeFast((int) (byte)44);
      assertEquals(6, fastOutputStream0.size());
  }

  @Test
  public void test07()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      FastOutputStream fastOutputStream0 = new FastOutputStream(byteArray0);
      fastOutputStream0.writeFast(1);
      fastOutputStream0.reset();
      fastOutputStream0.writeFast((-4552));
      assertEquals(1, fastOutputStream0.size());
  }

  @Test
  public void test08()  throws Throwable  {
      FastOutputStream fastOutputStream0 = new FastOutputStream(0, 0);
      fastOutputStream0.addSize((-3994));
      int int0 = fastOutputStream0.size();
      assertEquals((-3994), int0);
  }

  @Test
  public void test09()  throws Throwable  {
      FastOutputStream fastOutputStream0 = new FastOutputStream(0, 0);
      byte[] byteArray0 = new byte[6];
      fastOutputStream0.writeFast(byteArray0, (int) (byte)1, 0);
      assertEquals(0, fastOutputStream0.size());
  }

  @Test
  public void test10()  throws Throwable  {
      FastOutputStream fastOutputStream0 = new FastOutputStream(0);
      byte[] byteArray0 = new byte[1];
      fastOutputStream0.write(byteArray0, 0, 0);
      assertEquals(0, fastOutputStream0.size());
  }

  @Test
  public void test11()  throws Throwable  {
      byte[] byteArray0 = new byte[18];
      FastOutputStream fastOutputStream0 = new FastOutputStream(byteArray0, (int) (byte) (-80));
      fastOutputStream0.toString();
      // Undeclared exception!
      try { 
        fastOutputStream0.writeFast(byteArray0, (-1749), (-944));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.lang.System", e);
      }
  }

  @Test
  public void test12()  throws Throwable  {
      FastOutputStream fastOutputStream0 = new FastOutputStream(2408, 2408);
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
      byte[] byteArray0 = new byte[0];
      FastOutputStream fastOutputStream0 = new FastOutputStream(byteArray0, 16);
      fastOutputStream0.addSize((-78));
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
      byte[] byteArray0 = new byte[4];
      FastOutputStream fastOutputStream0 = new FastOutputStream(byteArray0, 0);
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
  public void test15()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      FastOutputStream fastOutputStream0 = new FastOutputStream(byteArray0, 1635);
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
  public void test16()  throws Throwable  {
      FastOutputStream fastOutputStream0 = new FastOutputStream(0, 0);
      fastOutputStream0.addSize(1764);
      byte[] byteArray0 = new byte[3];
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
  public void test17()  throws Throwable  {
      FastOutputStream fastOutputStream0 = new FastOutputStream(1, 1);
      byte[] byteArray0 = new byte[7];
      fastOutputStream0.addSize(727);
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
  public void test18()  throws Throwable  {
      FastOutputStream fastOutputStream0 = new FastOutputStream(3, 3);
      fastOutputStream0.addSize(2669);
      // Undeclared exception!
      try { 
        fastOutputStream0.write((-85));
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
      FastOutputStream fastOutputStream0 = new FastOutputStream(0, 0);
      fastOutputStream0.addSize((-50));
      // Undeclared exception!
      try { 
        fastOutputStream0.toString("");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -50
         //
         assertThrownBy("java.lang.String", e);
      }
  }

  @Test
  public void test20()  throws Throwable  {
      FastOutputStream fastOutputStream0 = new FastOutputStream(0, 11);
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
  public void test21()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      FastOutputStream fastOutputStream0 = new FastOutputStream(byteArray0);
      fastOutputStream0.addSize(1262);
      // Undeclared exception!
      try { 
        fastOutputStream0.toString();
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: 1262
         //
         assertThrownBy("java.lang.String", e);
      }
  }

  @Test
  public void test22()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      FastOutputStream fastOutputStream0 = new FastOutputStream(byteArray0);
      fastOutputStream0.addSize(8);
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
      byte[] byteArray0 = new byte[0];
      FastOutputStream fastOutputStream0 = new FastOutputStream(byteArray0, (-1));
      fastOutputStream0.addSize(142);
      // Undeclared exception!
      try { 
        fastOutputStream0.makeSpace((-1));
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
        fastOutputStream0 = new FastOutputStream((-444), (-435));
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
      FastOutputStream fastOutputStream0 = new FastOutputStream(0);
      byte[] byteArray0 = new byte[4];
      // Undeclared exception!
      try { 
        fastOutputStream0.write(byteArray0, (int) (byte) (-24), 0);
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
      FastOutputStream fastOutputStream0 = new FastOutputStream();
      fastOutputStream0.makeSpace(0);
      assertEquals(0, fastOutputStream0.size());
  }

  @Test
  public void test28()  throws Throwable  {
      FastOutputStream fastOutputStream0 = new FastOutputStream(0);
      byte[] byteArray0 = fastOutputStream0.toByteArray();
      // Undeclared exception!
      try { 
        fastOutputStream0.writeFast(byteArray0, 0, 2928);
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
      byte[] byteArray0 = new byte[1];
      FastOutputStream fastOutputStream0 = new FastOutputStream(byteArray0, 1635);
      fastOutputStream0.writeFast(byteArray0);
      fastOutputStream0.write(byteArray0);
      assertEquals(2, fastOutputStream0.size());
  }

  @Test
  public void test30()  throws Throwable  {
      FastOutputStream fastOutputStream0 = new FastOutputStream();
      byte[] byteArray0 = new byte[5];
      fastOutputStream0.writeFast(byteArray0);
      fastOutputStream0.addSize((byte)100);
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
      FastOutputStream fastOutputStream0 = new FastOutputStream(0);
      fastOutputStream0.writeFast(0);
      fastOutputStream0.toByteArray();
      assertEquals(1, fastOutputStream0.size());
  }

  @Test
  public void test32()  throws Throwable  {
      FastOutputStream fastOutputStream0 = new FastOutputStream(0, 0);
      fastOutputStream0.addSize((-3994));
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
  public void test33()  throws Throwable  {
      FastOutputStream fastOutputStream0 = new FastOutputStream();
      int int0 = fastOutputStream0.getBufferOffset();
      assertEquals(0, int0);
  }

  @Test
  public void test34()  throws Throwable  {
      FastOutputStream fastOutputStream0 = new FastOutputStream();
      fastOutputStream0.addSize((-2661));
      int int0 = fastOutputStream0.getBufferLength();
      assertEquals(-2661, fastOutputStream0.size());
      assertEquals((-2661), int0);
  }

  @Test
  public void test35()  throws Throwable  {
      FastOutputStream fastOutputStream0 = new FastOutputStream(2, (-1144));
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
  public void test36()  throws Throwable  {
      FastOutputStream fastOutputStream0 = new FastOutputStream();
      int int0 = fastOutputStream0.getBufferLength();
      assertEquals(0, int0);
  }

  @Test
  public void test37()  throws Throwable  {
      FastOutputStream fastOutputStream0 = new FastOutputStream(0, 11);
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
  public void test38()  throws Throwable  {
      FastOutputStream fastOutputStream0 = new FastOutputStream(0, 11);
      byte[] byteArray0 = fastOutputStream0.getBufferBytes();
      assertArrayEquals(new byte[] {}, byteArray0);
  }

  @Test
  public void test39()  throws Throwable  {
      FastOutputStream fastOutputStream0 = new FastOutputStream(0, 0);
      int int0 = fastOutputStream0.size();
      assertEquals(0, int0);
  }

  @Test
  public void test40()  throws Throwable  {
      FastOutputStream fastOutputStream0 = new FastOutputStream((byte[]) null);
      // Undeclared exception!
      try { 
        fastOutputStream0.writeFast((int) (byte)0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.util.FastOutputStream", e);
      }
  }
}
