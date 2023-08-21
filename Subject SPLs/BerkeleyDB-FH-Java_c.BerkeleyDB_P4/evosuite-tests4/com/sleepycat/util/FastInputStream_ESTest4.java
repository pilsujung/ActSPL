/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 17:07:05 KST 2017
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
public class FastInputStream_ESTest4 extends FastInputStream_ESTest_scaffolding4 {

  @Test
  public void test00()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      FastInputStream fastInputStream0 = new FastInputStream(byteArray0);
      long long0 = fastInputStream0.skip(5197L);
      assertEquals(0, fastInputStream0.available());
      assertEquals(5L, long0);
  }

  @Test
  public void test01()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      FastInputStream fastInputStream0 = new FastInputStream(byteArray0, 0, 854);
      int int0 = fastInputStream0.readFast(byteArray0, 0, 0);
      assertEquals(0, int0);
      assertEquals(854, fastInputStream0.available());
  }

  @Test
  public void test02()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      FastInputStream fastInputStream0 = new FastInputStream(byteArray0);
      byte[] byteArray1 = new byte[0];
      int int0 = fastInputStream0.readFast(byteArray1);
      assertEquals(6, fastInputStream0.available());
      assertEquals(0, int0);
  }

  @Test
  public void test03()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      FastInputStream fastInputStream0 = new FastInputStream(byteArray0);
      fastInputStream0.read(byteArray0, (int) (byte)0, 1446);
      int int0 = fastInputStream0.readFast(byteArray0);
      assertEquals(0, fastInputStream0.available());
      assertEquals((-1), int0);
  }

  @Test
  public void test04()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      FastInputStream fastInputStream0 = new FastInputStream(byteArray0);
      int int0 = fastInputStream0.readFast();
      assertEquals(1, fastInputStream0.available());
      assertEquals(0, int0);
  }

  @Test
  public void test05()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte)76;
      FastInputStream fastInputStream0 = new FastInputStream(byteArray0);
      int int0 = fastInputStream0.readFast();
      assertEquals(1, fastInputStream0.getBufferOffset());
      assertEquals(76, int0);
  }

  @Test
  public void test06()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      FastInputStream fastInputStream0 = new FastInputStream(byteArray0);
      int int0 = fastInputStream0.read(byteArray0, (int) (byte)0, (int) (byte)0);
      assertEquals(0, int0);
      assertEquals(9, fastInputStream0.available());
  }

  @Test
  public void test07()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      FastInputStream fastInputStream0 = new FastInputStream(byteArray0, 0, 854);
      int int0 = fastInputStream0.read(byteArray0);
      assertEquals(854, fastInputStream0.available());
      assertEquals(0, int0);
  }

  @Test
  public void test08()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte)69;
      FastInputStream fastInputStream0 = new FastInputStream(byteArray0);
      int int0 = fastInputStream0.read();
      assertEquals(1, fastInputStream0.getBufferOffset());
      assertEquals(69, int0);
  }

  @Test
  public void test09()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      FastInputStream fastInputStream0 = new FastInputStream(byteArray0, (-277), (-710));
      int int0 = fastInputStream0.getBufferOffset();
      assertEquals(-710, fastInputStream0.getBufferLength());
      assertEquals((-277), int0);
  }

  @Test
  public void test10()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      FastInputStream fastInputStream0 = new FastInputStream(byteArray0, 499, (-2312));
      int int0 = fastInputStream0.getBufferLength();
      assertEquals((-2312), int0);
      assertEquals(-2811, fastInputStream0.available());
  }


  @Test
  public void test12()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      FastInputStream fastInputStream0 = new FastInputStream(byteArray0);
      fastInputStream0.read(byteArray0);
      fastInputStream0.len = (int) (byte)0;
      int int0 = fastInputStream0.available();
      assertEquals(2, fastInputStream0.getBufferOffset());
      assertEquals((-2), int0);
  }

  @Test
  public void test13()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      FastInputStream fastInputStream0 = new FastInputStream(byteArray0);
      int int0 = fastInputStream0.getBufferLength();
      assertEquals(2, int0);
  }

  @Test
  public void test14()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      FastInputStream fastInputStream0 = new FastInputStream(byteArray0);
      fastInputStream0.readFast(byteArray0, 1, 1);
      int int0 = fastInputStream0.getBufferOffset();
      assertEquals(1, int0);
  }

  @Test
  public void test15()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      FastInputStream fastInputStream0 = new FastInputStream(byteArray0);
      fastInputStream0.readFast(byteArray0, 1, 1);
      int int0 = fastInputStream0.read(byteArray0, (int) (byte)0, 1446);
      assertEquals(2, fastInputStream0.getBufferOffset());
      assertEquals(1, int0);
  }

  @Test
  public void test16()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      FastInputStream fastInputStream0 = new FastInputStream(byteArray0, 499, (-2312));
      int int0 = fastInputStream0.read(byteArray0, (int) (byte)0, 3313);
      assertEquals(-2811, fastInputStream0.available());
      assertEquals((-1), int0);
  }

  @Test
  public void test17()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      FastInputStream fastInputStream0 = new FastInputStream(byteArray0, 0, (-1805));
      int int0 = fastInputStream0.read();
      assertEquals(-1805, fastInputStream0.available());
      assertEquals((-1), int0);
  }

  @Test
  public void test18()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      FastInputStream fastInputStream0 = new FastInputStream(byteArray0);
      // Undeclared exception!
      try { 
        fastInputStream0.read(byteArray0, (-917), (int) (byte) (-4));
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
      byte[] byteArray0 = new byte[2];
      FastInputStream fastInputStream0 = new FastInputStream(byteArray0);
      byte[] byteArray1 = new byte[6];
      // Undeclared exception!
      try { 
        fastInputStream0.read(byteArray1, 0, (-1));
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
      byte[] byteArray0 = new byte[4];
      FastInputStream fastInputStream0 = new FastInputStream(byteArray0, 0, (-1805));
      long long0 = fastInputStream0.skip((-1L));
      assertEquals(-1805, fastInputStream0.getBufferOffset());
      assertEquals((-1805L), long0);
  }

  @Test
  public void test21()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      FastInputStream fastInputStream0 = new FastInputStream(byteArray0, 0, 0);
      long long0 = fastInputStream0.skip(0);
      assertEquals(0L, long0);
      assertEquals(0, fastInputStream0.getBufferOffset());
  }

  @Test
  public void test22()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      FastInputStream fastInputStream0 = new FastInputStream(byteArray0, 0, 0);
      fastInputStream0.mark((-1));
      assertEquals(0, fastInputStream0.available());
  }

  @Test
  public void test23()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      FastInputStream fastInputStream0 = new FastInputStream(byteArray0);
      fastInputStream0.read(byteArray0);
      int int0 = fastInputStream0.available();
      assertEquals(2, fastInputStream0.getBufferOffset());
      assertEquals(0, int0);
  }

  @Test
  public void test24()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      FastInputStream fastInputStream0 = new FastInputStream(byteArray0);
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

  @Test
  public void test25()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      FastInputStream fastInputStream0 = new FastInputStream(byteArray0, 1, (int) (byte) (-18));
      fastInputStream0.skip((-1146L));
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
  public void test27()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      FastInputStream fastInputStream0 = new FastInputStream(byteArray0, (-2658), 0);
      // Undeclared exception!
      try { 
        fastInputStream0.read(byteArray0);
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
      FastInputStream fastInputStream0 = new FastInputStream(byteArray0, 0, 854);
      // Undeclared exception!
      try { 
        fastInputStream0.read();
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
      byte[] byteArray0 = new byte[2];
      FastInputStream fastInputStream0 = new FastInputStream(byteArray0);
      // Undeclared exception!
      try { 
        fastInputStream0.readFast(byteArray0, 70, 70);
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
      byte[] byteArray0 = new byte[2];
      FastInputStream fastInputStream0 = new FastInputStream(byteArray0);
      fastInputStream0.readFast(byteArray0, 1, 1);
      assertEquals(1, fastInputStream0.getBufferOffset());
      
      fastInputStream0.reset();
      assertEquals(2, fastInputStream0.available());
  }

  @Test
  public void test32()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      FastInputStream fastInputStream0 = new FastInputStream(byteArray0, (-1063), (-1063));
      int int0 = fastInputStream0.readFast(byteArray0, 29, 29);
      assertEquals((-1), int0);
      assertEquals(0, fastInputStream0.available());
  }

  @Test
  public void test33()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      FastInputStream fastInputStream0 = new FastInputStream(byteArray0, 0, 0);
      fastInputStream0.off = (int) (byte) (-1);
      // Undeclared exception!
      try { 
        fastInputStream0.readFast();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         assertThrownBy("com.sleepycat.util.FastInputStream", e);
      }
  }

  @Test
  public void test34()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      FastInputStream fastInputStream0 = new FastInputStream(byteArray0);
      fastInputStream0.read(byteArray0, (int) (byte)0, 1446);
      long long0 = fastInputStream0.skip(1L);
      assertEquals(2, fastInputStream0.getBufferOffset());
      assertEquals(0L, long0);
  }

  @Test
  public void test35()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      FastInputStream fastInputStream0 = new FastInputStream(byteArray0, (int) (byte)0, (int) (byte)0);
      int int0 = fastInputStream0.readFast();
      assertEquals((-1), int0);
      assertEquals(0, fastInputStream0.available());
  }

  @Test
  public void test36()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      FastInputStream fastInputStream0 = new FastInputStream(byteArray0);
      int int0 = fastInputStream0.readFast(byteArray0);
      assertEquals(0, fastInputStream0.available());
      assertEquals(2, int0);
  }


  @Test
  public void test38()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      FastInputStream fastInputStream0 = new FastInputStream(byteArray0);
      boolean boolean0 = fastInputStream0.markSupported();
      assertTrue(boolean0);
  }

  @Test
  public void test39()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      FastInputStream fastInputStream0 = new FastInputStream(byteArray0, (int) (byte)0, (int) (byte)0);
      int int0 = fastInputStream0.getBufferLength();
      assertEquals(0, fastInputStream0.getBufferOffset());
      assertEquals(0, int0);
  }

  @Test
  public void test40()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      FastInputStream fastInputStream0 = new FastInputStream(byteArray0, (int) (byte)0, (int) (byte)0);
      int int0 = fastInputStream0.read(byteArray0);
      assertEquals(0, fastInputStream0.available());
      assertEquals((-1), int0);
  }

  @Test
  public void test41()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      FastInputStream fastInputStream0 = new FastInputStream(byteArray0);
      int int0 = fastInputStream0.read();
      assertEquals(1, fastInputStream0.getBufferOffset());
      assertEquals(0, int0);
  }

  @Test
  public void test42()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      FastInputStream fastInputStream0 = new FastInputStream(byteArray0);
      int int0 = fastInputStream0.getBufferOffset();
      assertEquals(0, int0);
  }

  @Test
  public void test43()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      FastInputStream fastInputStream0 = new FastInputStream(byteArray0);
      byte[] byteArray1 = fastInputStream0.getBufferBytes();
      assertArrayEquals(new byte[] {(byte)0, (byte)0}, byteArray1);
  }

  @Test
  public void test44()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      FastInputStream fastInputStream0 = new FastInputStream(byteArray0, (int) (byte)0, (int) (byte)0);
      FastInputStream fastInputStream1 = new FastInputStream(fastInputStream0.buf);
      // Undeclared exception!
      try { 
        fastInputStream1.readFast((byte[]) null, (int) (byte) (-88), (-911));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.lang.System", e);
      }
  }
}
