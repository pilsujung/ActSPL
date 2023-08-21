/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 21 21:40:18 KST 2017
 */

package com.sleepycat.util;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class FastInputStream_ESTest1 extends FastInputStream_ESTest_scaffolding1 {

  @Test
  public void test00()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      FastInputStream fastInputStream0 = new FastInputStream(byteArray0);
      long long0 = fastInputStream0.skip(554L);
      assertEquals(0, fastInputStream0.available());
      assertEquals(1L, long0);
  }

  @Test
  public void test01()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      FastInputStream fastInputStream0 = new FastInputStream(byteArray0);
      int int0 = fastInputStream0.readFast(byteArray0, 0, 1);
      assertEquals(1, fastInputStream0.getBufferOffset());
      assertEquals(1, int0);
  }

  @Test
  public void test02()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      FastInputStream fastInputStream0 = new FastInputStream(byteArray0, 255, 255);
      assertEquals(255, fastInputStream0.getBufferOffset());
      
      fastInputStream0.off = 0;
      int int0 = fastInputStream0.readFast(byteArray0);
      assertEquals(0, int0);
  }

  @Test
  public void test03()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      FastInputStream fastInputStream0 = new FastInputStream(byteArray0);
      fastInputStream0.readFast();
      assertEquals(1, fastInputStream0.getBufferOffset());
      
      int int0 = fastInputStream0.readFast(byteArray0);
      assertEquals((-1), int0);
  }

  @Test
  public void test04()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte)2;
      FastInputStream fastInputStream0 = new FastInputStream(byteArray0);
      int int0 = fastInputStream0.readFast();
      assertEquals(1, fastInputStream0.getBufferOffset());
      assertEquals(2, int0);
  }

  @Test
  public void test05()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      FastInputStream fastInputStream0 = new FastInputStream(byteArray0);
      int int0 = fastInputStream0.read(byteArray0, 0, 0);
      assertEquals(0, int0);
      assertEquals(7, fastInputStream0.available());
  }

  @Test
  public void test06()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      FastInputStream fastInputStream0 = new FastInputStream(byteArray0);
      int int0 = fastInputStream0.read(byteArray0, 0, 2447);
      assertEquals(3, fastInputStream0.getBufferOffset());
      assertEquals(3, int0);
  }

  @Test
  public void test07()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      FastInputStream fastInputStream0 = new FastInputStream(byteArray0);
      byte[] byteArray1 = new byte[0];
      int int0 = fastInputStream0.read(byteArray1);
      assertEquals(0, int0);
      assertEquals(0, fastInputStream0.getBufferOffset());
  }

  @Test
  public void test08()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte)32;
      FastInputStream fastInputStream0 = new FastInputStream(byteArray0);
      int int0 = fastInputStream0.read();
      assertEquals(5, fastInputStream0.available());
      assertEquals(32, int0);
  }

  @Test
  public void test09()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      FastInputStream fastInputStream0 = new FastInputStream(byteArray0);
      int int0 = fastInputStream0.read();
      assertEquals((-1), int0);
  }

  @Test
  public void test10()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      FastInputStream fastInputStream0 = new FastInputStream(byteArray0);
      int int0 = fastInputStream0.getBufferOffset();
      assertEquals(0, int0);
  }

  @Test
  public void test11()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      FastInputStream fastInputStream0 = new FastInputStream(byteArray0);
      fastInputStream0.read(byteArray0);
      int int0 = fastInputStream0.getBufferOffset();
      assertEquals(0, fastInputStream0.available());
      assertEquals(7, int0);
  }

  @Test
  public void test12()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      FastInputStream fastInputStream0 = new FastInputStream(byteArray0);
      int int0 = fastInputStream0.getBufferLength();
      assertEquals(0, int0);
  }

  @Test
  public void test13()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      FastInputStream fastInputStream0 = new FastInputStream(byteArray0);
      fastInputStream0.len = (-1697);
      int int0 = fastInputStream0.getBufferLength();
      assertEquals((-1697), int0);
  }

  @Test
  public void test14()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      FastInputStream fastInputStream0 = new FastInputStream(byteArray0);
      byte[] byteArray1 = fastInputStream0.getBufferBytes();
      assertArrayEquals(new byte[] {(byte)0}, byteArray1);
  }

  @Test
  public void test15()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      FastInputStream fastInputStream0 = new FastInputStream(byteArray0);
      int int0 = fastInputStream0.available();
      assertEquals(0, int0);
  }

  @Test
  public void test16()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      FastInputStream fastInputStream0 = new FastInputStream(byteArray0, (int) (byte) (-1), (-2641));
      int int0 = fastInputStream0.available();
      assertEquals((-2640), int0);
  }

  @Test
  public void test17()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      FastInputStream fastInputStream0 = new FastInputStream(byteArray0, 0, 2325);
      int int0 = fastInputStream0.readFast(byteArray0, 0, 0);
      assertEquals(2325, fastInputStream0.available());
      assertEquals(0, int0);
  }

  @Test
  public void test18()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      FastInputStream fastInputStream0 = new FastInputStream(byteArray0);
      fastInputStream0.readFast();
      int int0 = fastInputStream0.readFast(byteArray0);
      assertEquals(3, fastInputStream0.getBufferOffset());
      assertEquals(2, int0);
  }

  @Test
  public void test19()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      FastInputStream fastInputStream0 = new FastInputStream(byteArray0);
      fastInputStream0.len = (-1697);
      int int0 = fastInputStream0.read(byteArray0);
      assertEquals(-1697, fastInputStream0.available());
      assertEquals((-1), int0);
  }

  @Test
  public void test20()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      FastInputStream fastInputStream0 = new FastInputStream(byteArray0);
      fastInputStream0.len = (-1697);
      int int0 = fastInputStream0.readFast();
      assertEquals(-1697, fastInputStream0.available());
      assertEquals((-1), int0);
  }

  @Test
  public void test21()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      FastInputStream fastInputStream0 = new FastInputStream(byteArray0, 1, (int) (byte)0);
      long long0 = fastInputStream0.skip(0L);
      assertEquals(0, fastInputStream0.getBufferOffset());
      assertEquals((-1L), long0);
  }

  @Test
  public void test22()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      FastInputStream fastInputStream0 = new FastInputStream(byteArray0);
      fastInputStream0.read();
      assertEquals(0, fastInputStream0.available());
      
      fastInputStream0.reset();
      assertEquals(0, fastInputStream0.getBufferOffset());
  }

  @Test
  public void test23()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      FastInputStream fastInputStream0 = new FastInputStream(byteArray0);
      int int0 = fastInputStream0.read(byteArray0, 0, 667);
      assertEquals((-1), int0);
  }

  @Test
  public void test24()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      FastInputStream fastInputStream0 = new FastInputStream(byteArray0, (int) (byte) (-97), 0);
      // Undeclared exception!
      try { 
        fastInputStream0.readFast(byteArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.lang.System", e);
      }
  }

  @Test
  public void test25()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      FastInputStream fastInputStream0 = new FastInputStream(byteArray0);
      fastInputStream0.skip((-1));
      // Undeclared exception!
      try { 
        fastInputStream0.read(byteArray0, (-748), (-1253));
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
      byte[] byteArray0 = new byte[1];
      FastInputStream fastInputStream0 = new FastInputStream(byteArray0);
      fastInputStream0.off = (int) (byte)1;
      fastInputStream0.off = (-1);
      // Undeclared exception!
      try { 
        fastInputStream0.read();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         assertThrownBy("com.sleepycat.util.FastInputStream", e);
      }
  }

  @Test
  public void test27()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      FastInputStream fastInputStream0 = new FastInputStream(byteArray0);
      // Undeclared exception!
      try { 
        fastInputStream0.readFast(byteArray0, (-2357), (int) (byte)23);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.lang.System", e);
      }
  }

  @Test
  public void test28()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      FastInputStream fastInputStream0 = new FastInputStream(byteArray0);
      int int0 = fastInputStream0.readFast(byteArray0, (-644), (-1));
      assertEquals((-1), int0);
  }

  @Test
  public void test29()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      FastInputStream fastInputStream0 = new FastInputStream(byteArray0, 255, 255);
      fastInputStream0.off = 0;
      // Undeclared exception!
      try { 
        fastInputStream0.readFast();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         assertThrownBy("com.sleepycat.util.FastInputStream", e);
      }
  }

  @Test
  public void test30()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      FastInputStream fastInputStream0 = new FastInputStream(byteArray0, 255, 255);
      long long0 = fastInputStream0.skip(0);
      assertEquals(0, fastInputStream0.available());
      assertEquals(0L, long0);
  }

  @Test
  public void test31()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      FastInputStream fastInputStream0 = new FastInputStream(byteArray0, (int) (byte) (-1), 255);
      int int0 = fastInputStream0.available();
      assertEquals(256, int0);
  }

  @Test
  public void test32()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      FastInputStream fastInputStream0 = new FastInputStream(byteArray0, 2197, 2197);
      boolean boolean0 = fastInputStream0.markSupported();
      assertEquals(0, fastInputStream0.available());
      assertTrue(boolean0);
  }

  @Test
  public void test33()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      FastInputStream fastInputStream0 = new FastInputStream(byteArray0);
      int int0 = fastInputStream0.getBufferLength();
      assertEquals(1, int0);
  }

  @Test
  public void test34()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      FastInputStream fastInputStream0 = new FastInputStream(byteArray0);
      // Undeclared exception!
      try { 
        fastInputStream0.read((byte[]) null, (int) (byte)0, (int) (byte)82);
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
      byte[] byteArray0 = new byte[4];
      FastInputStream fastInputStream0 = new FastInputStream(byteArray0, (-3291), 0);
      int int0 = fastInputStream0.getBufferOffset();
      assertEquals((-3291), int0);
      assertEquals(0, fastInputStream0.getBufferLength());
  }

  @Test
  public void test36()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      FastInputStream fastInputStream0 = new FastInputStream(byteArray0);
      fastInputStream0.mark((-4179));
      assertEquals(0, fastInputStream0.getBufferOffset());
  }

  @Test
  public void test37()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      FastInputStream fastInputStream0 = new FastInputStream(byteArray0);
      byte[] byteArray1 = fastInputStream0.getBufferBytes();
      assertArrayEquals(new byte[] {}, byteArray1);
  }

  @Test
  public void test38()  throws Throwable  {
      FastInputStream fastInputStream0 = null;
      try {
        fastInputStream0 = new FastInputStream((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.util.FastInputStream", e);
      }
  }

  @Test
  public void test39()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      FastInputStream fastInputStream0 = new FastInputStream(byteArray0, 1809, 0);
      // Undeclared exception!
      try { 
        fastInputStream0.readFast((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.util.FastInputStream", e);
      }
  }
}
