/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 21 18:23:05 KST 2017
 */

package com.sleepycat.bind.tuple;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.fail;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class TupleOutput_ESTest1 extends TupleOutput_ESTest_scaffolding1 {

  @Test
  public void test00()  throws Throwable  {
      TupleOutput tupleOutput0 = new TupleOutput();
      TupleOutput tupleOutput1 = tupleOutput0.writeDouble((-3441.3));
      assertSame(tupleOutput1, tupleOutput0);
  }

  @Test
  public void test01()  throws Throwable  {
      TupleOutput tupleOutput0 = new TupleOutput();
      TupleOutput tupleOutput1 = tupleOutput0.writeShort((-2802));
      assertEquals(2, tupleOutput1.size());
  }

  @Test
  public void test02()  throws Throwable  {
      TupleOutput tupleOutput0 = new TupleOutput();
      TupleOutput tupleOutput1 = tupleOutput0.writeChar((-1539));
      assertSame(tupleOutput1, tupleOutput0);
  }

  @Test
  public void test03()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      TupleOutput tupleOutput0 = new TupleOutput(byteArray0);
      tupleOutput0.addSize(2052);
      // Undeclared exception!
      try { 
        tupleOutput0.writeUnsignedInt(500L);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.lang.System", e);
      }
  }

  @Test
  public void test04()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      TupleOutput tupleOutput0 = new TupleOutput(byteArray0);
      // Undeclared exception!
      try { 
        tupleOutput0.writeString((char[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.bind.tuple.TupleOutput", e);
      }
  }

  @Test
  public void test05()  throws Throwable  {
      TupleOutput tupleOutput0 = new TupleOutput();
      char[] charArray0 = new char[5];
      tupleOutput0.addSize((-1595));
      // Undeclared exception!
      try { 
        tupleOutput0.writeString(charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1595
         //
         assertThrownBy("com.sleepycat.util.UtfOps", e);
      }
  }

  @Test
  public void test06()  throws Throwable  {
      TupleOutput tupleOutput0 = new TupleOutput();
      tupleOutput0.addSize((-1565));
      // Undeclared exception!
      try { 
        tupleOutput0.writeString("");
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1565
         //
         assertThrownBy("com.sleepycat.util.FastOutputStream", e);
      }
  }

  @Test
  public void test07()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      TupleOutput tupleOutput0 = new TupleOutput(byteArray0);
      tupleOutput0.addSize((byte) (-5));
      // Undeclared exception!
      try { 
        tupleOutput0.writeShort((byte)98);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -5
         //
         assertThrownBy("com.sleepycat.util.FastOutputStream", e);
      }
  }

  @Test
  public void test08()  throws Throwable  {
      TupleOutput tupleOutput0 = new TupleOutput();
      tupleOutput0.addSize(1372);
      // Undeclared exception!
      try { 
        tupleOutput0.writeLong((byte)2);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.lang.System", e);
      }
  }

  @Test
  public void test09()  throws Throwable  {
      TupleOutput tupleOutput0 = new TupleOutput();
      tupleOutput0.addSize((-1565));
      // Undeclared exception!
      try { 
        tupleOutput0.writeInt((-1727));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1565
         //
         assertThrownBy("com.sleepycat.util.FastOutputStream", e);
      }
  }

  @Test
  public void test10()  throws Throwable  {
      TupleOutput tupleOutput0 = new TupleOutput((byte[]) null);
      // Undeclared exception!
      try { 
        tupleOutput0.writeFloat((byte)16);
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
      byte[] byteArray0 = new byte[0];
      TupleOutput tupleOutput0 = new TupleOutput(byteArray0);
      tupleOutput0.addSize(32768);
      // Undeclared exception!
      try { 
        tupleOutput0.writeFloat(28);
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
      byte[] byteArray0 = new byte[8];
      TupleOutput tupleOutput0 = new TupleOutput(byteArray0);
      tupleOutput0.addSize((byte) (-128));
      // Undeclared exception!
      try { 
        tupleOutput0.writeDouble(0.0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -128
         //
         assertThrownBy("com.sleepycat.util.FastOutputStream", e);
      }
  }

  @Test
  public void test13()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      TupleOutput tupleOutput0 = new TupleOutput(byteArray0);
      // Undeclared exception!
      try { 
        tupleOutput0.writeChars((char[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.bind.tuple.TupleOutput", e);
      }
  }

  @Test
  public void test14()  throws Throwable  {
      TupleOutput tupleOutput0 = new TupleOutput();
      // Undeclared exception!
      try { 
        tupleOutput0.writeChars((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.bind.tuple.TupleOutput", e);
      }
  }

  @Test
  public void test15()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      TupleOutput tupleOutput0 = new TupleOutput(byteArray0);
      tupleOutput0.addSize((-729));
      // Undeclared exception!
      try { 
        tupleOutput0.writeChar(0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -729
         //
         assertThrownBy("com.sleepycat.util.FastOutputStream", e);
      }
  }

  @Test
  public void test16()  throws Throwable  {
      TupleOutput tupleOutput0 = new TupleOutput();
      // Undeclared exception!
      try { 
        tupleOutput0.writeBytes((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.bind.tuple.TupleOutput", e);
      }
  }

  @Test
  public void test17()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      TupleOutput tupleOutput0 = new TupleOutput(byteArray0);
      tupleOutput0.addSize(505);
      // Undeclared exception!
      try { 
        tupleOutput0.writeBytes("t7h");
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
      TupleOutput tupleOutput0 = new TupleOutput();
      tupleOutput0.addSize((-360));
      // Undeclared exception!
      try { 
        tupleOutput0.writeByte((-360));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -360
         //
         assertThrownBy("com.sleepycat.util.FastOutputStream", e);
      }
  }

  @Test
  public void test19()  throws Throwable  {
      TupleOutput tupleOutput0 = new TupleOutput();
      char[] charArray0 = new char[5];
      tupleOutput0.writeString(charArray0);
      assertEquals(10, tupleOutput0.size());
  }

  @Test
  public void test20()  throws Throwable  {
      TupleOutput tupleOutput0 = new TupleOutput();
      char[] charArray0 = new char[0];
      TupleOutput tupleOutput1 = tupleOutput0.writeString(charArray0);
      assertEquals(0, tupleOutput1.getBufferOffset());
  }

  @Test
  public void test21()  throws Throwable  {
      TupleOutput tupleOutput0 = new TupleOutput();
      char[] charArray0 = new char[2];
      tupleOutput0.writeChars(charArray0);
      assertEquals(4, tupleOutput0.getBufferLength());
  }

  @Test
  public void test22()  throws Throwable  {
      TupleOutput tupleOutput0 = new TupleOutput();
      char[] charArray0 = new char[1];
      tupleOutput0.writeBytes(charArray0);
      assertEquals(1, tupleOutput0.getBufferLength());
  }

  @Test
  public void test23()  throws Throwable  {
      TupleOutput tupleOutput0 = new TupleOutput();
      TupleOutput tupleOutput1 = tupleOutput0.writeUnsignedByte(3746);
      assertEquals(1, tupleOutput1.size());
  }

  @Test
  public void test24()  throws Throwable  {
      TupleOutput tupleOutput0 = new TupleOutput();
      TupleOutput tupleOutput1 = tupleOutput0.writeUnsignedShort((-1998));
      assertEquals(0, tupleOutput1.getBufferOffset());
  }

  @Test
  public void test25()  throws Throwable  {
      TupleOutput tupleOutput0 = new TupleOutput();
      TupleOutput tupleOutput1 = tupleOutput0.writeUnsignedInt((-4821L));
      assertSame(tupleOutput0, tupleOutput1);
  }

  @Test
  public void test26()  throws Throwable  {
      TupleOutput tupleOutput0 = new TupleOutput();
      tupleOutput0.writeString(">x$U0An");
      assertEquals(8, tupleOutput0.size());
  }

  @Test
  public void test27()  throws Throwable  {
      TupleOutput tupleOutput0 = new TupleOutput();
      tupleOutput0.writeChars("\uFFFD\uFFFD\uFFFD+>x$U0An\u0000\uFFFD\u6FAF\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\u6FAF\uD77E\uFFFD\u0000");
      assertEquals(50, tupleOutput0.getBufferLength());
  }

  @Test
  public void test28()  throws Throwable  {
      TupleOutput tupleOutput0 = new TupleOutput();
      tupleOutput0.writeBytes("[~;q/]lD");
      assertEquals(8, tupleOutput0.getBufferLength());
  }

  @Test
  public void test29()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      TupleOutput tupleOutput0 = new TupleOutput(byteArray0);
      tupleOutput0.writeBoolean(true);
      assertArrayEquals(new byte[] {(byte)1}, byteArray0);
  }

  @Test
  public void test30()  throws Throwable  {
      TupleOutput tupleOutput0 = new TupleOutput();
      TupleOutput tupleOutput1 = tupleOutput0.writeBoolean(false);
      assertEquals(0, tupleOutput1.getBufferOffset());
  }

  @Test
  public void test31()  throws Throwable  {
      TupleOutput tupleOutput0 = new TupleOutput();
      TupleOutput tupleOutput1 = tupleOutput0.writeString((String) null);
      assertEquals(0, tupleOutput1.getBufferOffset());
  }

  @Test
  public void test32()  throws Throwable  {
      TupleOutput tupleOutput0 = new TupleOutput();
      TupleOutput tupleOutput1 = tupleOutput0.writeLong((-4133L));
      assertEquals(8, tupleOutput1.getBufferLength());
  }

  @Test
  public void test33()  throws Throwable  {
      TupleOutput tupleOutput0 = new TupleOutput();
      TupleOutput tupleOutput1 = tupleOutput0.writeByte(3746);
      assertSame(tupleOutput1, tupleOutput0);
  }

  @Test
  public void test34()  throws Throwable  {
      TupleOutput tupleOutput0 = new TupleOutput();
      TupleOutput tupleOutput1 = tupleOutput0.writeFloat((-4133L));
      assertEquals(0, tupleOutput1.getBufferOffset());
  }

  @Test
  public void test35()  throws Throwable  {
      TupleOutput tupleOutput0 = new TupleOutput();
      TupleOutput tupleOutput1 = tupleOutput0.writeInt((-1727));
      assertEquals(0, tupleOutput1.getBufferOffset());
  }

  @Test
  public void test36()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      TupleOutput tupleOutput0 = new TupleOutput(byteArray0);
      char[] charArray0 = new char[3];
      tupleOutput0.addSize(40);
      // Undeclared exception!
      try { 
        tupleOutput0.writeChars(charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.lang.System", e);
      }
  }
}
