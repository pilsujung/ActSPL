/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 21 18:53:46 KST 2017
 */

package com.sleepycat.bind.tuple;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class TupleInput_ESTest7 extends TupleInput_ESTest_scaffolding7 {

  @Test
  public void test00()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte)16;
      TupleInput tupleInput0 = new TupleInput(byteArray0);
      int int0 = tupleInput0.readUnsignedShort();
      assertEquals(4096, int0);
  }

  @Test
  public void test01()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      TupleOutput tupleOutput0 = new TupleOutput(byteArray0);
      TupleOutput tupleOutput1 = tupleOutput0.writeDouble(0.0);
      tupleOutput1.writeFloat(764.59204F);
      TupleInput tupleInput0 = new TupleInput(tupleOutput1);
      long long0 = tupleInput0.readLong();
      assertEquals((-9223372036854775808L), long0);
      
      long long1 = tupleInput0.readUnsignedInt();
      assertEquals(1144989156L, long1);
  }

  @Test
  public void test02()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      TupleInput tupleInput0 = new TupleInput(byteArray0);
      int int0 = tupleInput0.readUnsignedByte();
      assertEquals(0, int0);
  }

  @Test
  public void test03()  throws Throwable  {
      byte[] byteArray0 = new byte[13];
      TupleInput tupleInput0 = new TupleInput(byteArray0);
      tupleInput0.readString();
      assertEquals(1, tupleInput0.getBufferOffset());
  }

  @Test
  public void test04()  throws Throwable  {
      TupleOutput tupleOutput0 = new TupleOutput();
      TupleOutput tupleOutput1 = tupleOutput0.writeUnsignedShort((-2224));
      TupleInput tupleInput0 = new TupleInput(tupleOutput1);
      short short0 = tupleInput0.readShort();
      assertEquals((short)30544, short0);
  }

  @Test
  public void test05()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      TupleOutput tupleOutput0 = new TupleOutput(byteArray0);
      TupleOutput tupleOutput1 = tupleOutput0.writeChars(".[5?I[\".");
      TupleInput tupleInput0 = new TupleInput(tupleOutput1);
      short short0 = tupleInput0.readShort();
      assertEquals((short) (-32722), short0);
  }

  @Test
  public void test06()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      TupleOutput tupleOutput0 = new TupleOutput(byteArray0);
      tupleOutput0.writeLong(0L);
      TupleInput tupleInput0 = new TupleInput(tupleOutput0);
      long long0 = tupleInput0.readLong();
      assertEquals(0L, long0);
  }

  @Test
  public void test07()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte) (-32);
      TupleInput tupleInput0 = new TupleInput(byteArray0);
      float float0 = tupleInput0.readFloat();
      assertEquals((-3.6893488E19F), float0, 0.01F);
  }

  @Test
  public void test08()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      TupleOutput tupleOutput0 = new TupleOutput(byteArray0);
      tupleOutput0.writeLong((byte)0);
      TupleInput tupleInput0 = new TupleInput(tupleOutput0);
      double double0 = tupleInput0.readDouble();
      assertEquals(-0.0, double0, 0.01D);
  }

  @Test
  public void test09()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte)11;
      byteArray0[1] = (byte)109;
      TupleInput tupleInput0 = new TupleInput(byteArray0);
      char char0 = tupleInput0.readChar();
      assertEquals('\u0B6D', char0);
  }

  @Test
  public void test10()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte)8;
      TupleInput tupleInput0 = new TupleInput(byteArray0);
      char char0 = tupleInput0.readChar();
      assertEquals('\u0800', char0);
  }

  @Test
  public void test11()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      TupleOutput tupleOutput0 = new TupleOutput(byteArray0);
      char[] charArray0 = new char[4];
      charArray0[1] = 'Q';
      charArray0[2] = 'v';
      charArray0[3] = 'h';
      TupleOutput tupleOutput1 = tupleOutput0.writeString(charArray0);
      tupleOutput1.writeShort(128);
      tupleOutput0.writeTo(tupleOutput1);
      TupleInput tupleInput0 = new TupleInput(tupleOutput0);
      double double0 = tupleInput0.readDouble();
      assertEquals((-522.1828165091792), double0, 0.01D);
      
      byte byte0 = tupleInput0.readByte();
      assertEquals((byte)0, byte0);
  }

  @Test
  public void test12()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte) (-98);
      TupleInput tupleInput0 = new TupleInput(byteArray0);
      char[] charArray0 = new char[6];
      tupleInput0.readBytes(charArray0);
      assertEquals(0, tupleInput0.available());
  }

  @Test
  public void test13()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      TupleOutput tupleOutput0 = new TupleOutput(byteArray0);
      tupleOutput0.writeLong((byte)0);
      TupleInput tupleInput0 = new TupleInput(tupleOutput0);
      tupleInput0.readChars(2);
      assertEquals(4, tupleInput0.getBufferOffset());
  }

  @Test
  public void test14()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      TupleOutput tupleOutput0 = new TupleOutput(byteArray0);
      char[] charArray0 = new char[4];
      charArray0[3] = 'h';
      TupleOutput tupleOutput1 = tupleOutput0.writeString(charArray0);
      tupleOutput0.writeTo(tupleOutput1);
      TupleInput tupleInput0 = new TupleInput(tupleOutput0);
      double double0 = tupleInput0.readDouble();
      assertEquals((-536.0628671676604), double0, 0.01D);
  }

  @Test
  public void test15()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      TupleOutput tupleOutput0 = new TupleOutput(byteArray0);
      char[] charArray0 = new char[4];
      charArray0[1] = 'B';
      tupleOutput0.writeString(charArray0);
      TupleInput tupleInput0 = new TupleInput(tupleOutput0);
      try { 
        tupleInput0.readDouble();
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.bind.tuple.TupleInput", e);
      }
  }

  @Test
  public void test16()  throws Throwable  {
      TupleOutput tupleOutput0 = new TupleOutput();
      TupleOutput tupleOutput1 = tupleOutput0.writeUnsignedShort((-1357));
      TupleOutput tupleOutput2 = tupleOutput1.writeDouble((-1357));
      TupleInput tupleInput0 = new TupleInput(tupleOutput2);
      long long0 = tupleInput0.readLong();
      assertEquals(8841622240513490944L, long0);
  }

  @Test
  public void test17()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte) (-98);
      TupleInput tupleInput0 = new TupleInput(byteArray0);
      int int0 = tupleInput0.readInt();
      assertEquals(503316480, int0);
  }

  @Test
  public void test18()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      TupleOutput tupleOutput0 = new TupleOutput(byteArray0);
      char[] charArray0 = new char[4];
      tupleOutput0.writeString(charArray0);
      TupleInput tupleInput0 = new TupleInput(tupleOutput0);
      byte byte0 = tupleInput0.readByte();
      assertEquals((byte)64, byte0);
  }

  @Test
  public void test19()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[1] = (byte) (-1);
      byteArray0[2] = (byte)114;
      TupleInput tupleInput0 = new TupleInput(byteArray0);
      tupleInput0.read();
      try { 
        tupleInput0.readString();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.util.UtfOps", e);
      }
  }

  @Test
  public void test20()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      TupleOutput tupleOutput0 = new TupleOutput(byteArray0);
      TupleOutput tupleOutput1 = tupleOutput0.writeShort((-1));
      TupleInput tupleInput0 = new TupleInput(tupleOutput1);
      try { 
        tupleInput0.readString();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.util.UtfOps", e);
      }
  }

  @Test
  public void test21()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      TupleInput tupleInput0 = new TupleInput(byteArray0);
      char[] charArray0 = new char[0];
      tupleInput0.readString(charArray0);
      assertEquals(0, tupleInput0.getBufferOffset());
  }

  @Test
  public void test22()  throws Throwable  {
      TupleOutput tupleOutput0 = new TupleOutput();
      TupleOutput tupleOutput1 = tupleOutput0.writeUnsignedShort(0);
      TupleInput tupleInput0 = new TupleInput(tupleOutput1);
      char char0 = tupleInput0.readChar();
      assertEquals('\u0000', char0);
  }

  @Test
  public void test23()  throws Throwable  {
      byte[] byteArray0 = new byte[23];
      TupleInput tupleInput0 = new TupleInput(byteArray0, 573, 3955);
      try { 
        tupleInput0.readUnsignedShort();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test24()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      TupleInput tupleInput0 = new TupleInput(byteArray0, 124, (int) (byte)125);
      try { 
        tupleInput0.readUnsignedInt();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test25()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      TupleInput tupleInput0 = new TupleInput(byteArray0, (int) (byte) (-42), 0);
      try { 
        tupleInput0.readUnsignedByte();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test26()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      TupleOutput tupleOutput0 = new TupleOutput(byteArray0);
      tupleOutput0.writeInt((byte)54);
      TupleInput tupleInput0 = new TupleInput(tupleOutput0);
      char[] charArray0 = new char[8];
      try { 
        tupleInput0.readString(charArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.util.UtfOps", e);
      }
  }

  @Test
  public void test27()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      TupleInput tupleInput0 = new TupleInput(byteArray0);
      // Undeclared exception!
      try { 
        tupleInput0.readString((int) (byte) (-3));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.bind.tuple.TupleInput", e);
      }
  }

  @Test
  public void test28()  throws Throwable  {
      TupleOutput tupleOutput0 = new TupleOutput();
      TupleOutput tupleOutput1 = tupleOutput0.writeShort(0);
      TupleInput tupleInput0 = new TupleInput(tupleOutput1);
      try { 
        tupleInput0.readString(2609);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.util.UtfOps", e);
      }
  }

  @Test
  public void test29()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      TupleInput tupleInput0 = new TupleInput(byteArray0);
      try { 
        tupleInput0.readString(2);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         assertThrownBy("com.sleepycat.util.UtfOps", e);
      }
  }

  @Test
  public void test30()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      TupleInput tupleInput0 = new TupleInput(byteArray0, (int) (byte)123, 3297);
      try { 
        tupleInput0.readShort();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test31()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      TupleInput tupleInput0 = new TupleInput(byteArray0, 0, (int) (byte)80);
      try { 
        tupleInput0.readLong();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test32()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      TupleInput tupleInput0 = new TupleInput(byteArray0, (int) (byte) (-93), 0);
      try { 
        tupleInput0.readInt();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test33()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      TupleInput tupleInput0 = new TupleInput(byteArray0);
      try { 
        tupleInput0.readFloat();
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.bind.tuple.TupleInput", e);
      }
  }

  @Test
  public void test34()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      TupleInput tupleInput0 = new TupleInput(byteArray0, 1542, 2047);
      try { 
        tupleInput0.readFloat();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test35()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      TupleOutput tupleOutput0 = new TupleOutput(byteArray0);
      TupleInput tupleInput0 = new TupleInput(tupleOutput0);
      tupleInput0.skip((-1L));
      try { 
        tupleInput0.readDouble();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test36()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      TupleOutput tupleOutput0 = new TupleOutput(byteArray0);
      TupleInput tupleInput0 = new TupleInput(tupleOutput0);
      char[] charArray0 = new char[4];
      try { 
        tupleInput0.readChars(charArray0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.bind.tuple.TupleInput", e);
      }
  }

  @Test
  public void test37()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      TupleInput tupleInput0 = new TupleInput(byteArray0, 31, 1454);
      char[] charArray0 = new char[8];
      try { 
        tupleInput0.readChars(charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test38()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      TupleInput tupleInput0 = new TupleInput(byteArray0, 16, 16);
      // Undeclared exception!
      try { 
        tupleInput0.readChars(2127413707);
        fail("Expecting exception: OutOfMemoryError");
      
      } catch(OutOfMemoryError e) {
         //
         // Java heap space
         //
      }
  }

  @Test
  public void test39()  throws Throwable  {
      TupleOutput tupleOutput0 = new TupleOutput();
      TupleInput tupleInput0 = new TupleInput(tupleOutput0);
      // Undeclared exception!
      try { 
        tupleInput0.readChars((-347));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.lang.AbstractStringBuilder", e);
      }
  }

  @Test
  public void test40()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      TupleInput tupleInput0 = new TupleInput(byteArray0);
      try { 
        tupleInput0.readChars(2);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.bind.tuple.TupleInput", e);
      }
  }

  @Test
  public void test41()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      TupleInput tupleInput0 = new TupleInput(byteArray0, (int) (byte)20, (int) (byte)20);
      try { 
        tupleInput0.readChar();
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.bind.tuple.TupleInput", e);
      }
  }

  @Test
  public void test42()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      TupleInput tupleInput0 = new TupleInput(byteArray0, (int) (byte)74, 4351);
      char[] charArray0 = new char[8];
      try { 
        tupleInput0.readBytes(charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test43()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      TupleOutput tupleOutput0 = new TupleOutput(byteArray0);
      TupleInput tupleInput0 = new TupleInput(tupleOutput0);
      // Undeclared exception!
      try { 
        tupleInput0.readBytes(2139062143);
        fail("Expecting exception: OutOfMemoryError");
      
      } catch(OutOfMemoryError e) {
         //
         // Java heap space
         //
      }
  }

  @Test
  public void test44()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      TupleInput tupleInput0 = new TupleInput(byteArray0);
      // Undeclared exception!
      try { 
        tupleInput0.readBytes((-819));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.lang.AbstractStringBuilder", e);
      }
  }

  @Test
  public void test45()  throws Throwable  {
      byte[] byteArray0 = new byte[23];
      TupleInput tupleInput0 = new TupleInput(byteArray0, 573, 3955);
      try { 
        tupleInput0.readByte();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test46()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      TupleInput tupleInput0 = new TupleInput(byteArray0, 0, 539);
      tupleInput0.readBoolean();
      tupleInput0.readInt();
      try { 
        tupleInput0.readBoolean();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test47()  throws Throwable  {
      TupleInput tupleInput0 = null;
      try {
        tupleInput0 = new TupleInput((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.util.FastInputStream", e);
      }
  }

  @Test
  public void test48()  throws Throwable  {
      TupleInput tupleInput0 = null;
      try {
        tupleInput0 = new TupleInput((TupleOutput) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.bind.tuple.TupleInput", e);
      }
  }

  @Test
  public void test49()  throws Throwable  {
      TupleOutput tupleOutput0 = new TupleOutput();
      TupleOutput tupleOutput1 = tupleOutput0.writeInt(16);
      TupleInput tupleInput0 = new TupleInput(tupleOutput1);
      tupleInput0.readShort();
      try { 
        tupleInput0.readUnsignedInt();
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.bind.tuple.TupleInput", e);
      }
  }

  @Test
  public void test50()  throws Throwable  {
      TupleOutput tupleOutput0 = new TupleOutput();
      tupleOutput0.writeFloat(0.0F);
      TupleInput tupleInput0 = new TupleInput(tupleOutput0);
      long long0 = tupleInput0.readUnsignedInt();
      assertEquals(0L, long0);
  }

  @Test
  public void test51()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      TupleInput tupleInput0 = new TupleInput(byteArray0, 48, (int) (byte)0);
      try { 
        tupleInput0.readUnsignedShort();
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.bind.tuple.TupleInput", e);
      }
  }

  @Test
  public void test52()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      TupleOutput tupleOutput0 = new TupleOutput(byteArray0);
      tupleOutput0.writeDouble(0.0);
      TupleInput tupleInput0 = new TupleInput(tupleOutput0);
      int int0 = tupleInput0.readUnsignedShort();
      assertEquals(0, int0);
  }

  @Test
  public void test53()  throws Throwable  {
      TupleOutput tupleOutput0 = new TupleOutput();
      TupleInput tupleInput0 = new TupleInput(tupleOutput0);
      try { 
        tupleInput0.readUnsignedByte();
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.bind.tuple.TupleInput", e);
      }
  }

  @Test
  public void test54()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      TupleOutput tupleOutput0 = new TupleOutput(byteArray0);
      tupleOutput0.writeLong(0L);
      TupleInput tupleInput0 = new TupleInput(tupleOutput0);
      int int0 = tupleInput0.readUnsignedByte();
      assertEquals(128, int0);
  }

  @Test
  public void test55()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      TupleInput tupleInput0 = new TupleInput(byteArray0);
      char[] charArray0 = new char[5];
      try { 
        tupleInput0.readString(charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         assertThrownBy("com.sleepycat.util.UtfOps", e);
      }
  }

  @Test
  public void test56()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      TupleInput tupleInput0 = new TupleInput(byteArray0);
      tupleInput0.readInt();
      char[] charArray0 = new char[6];
      try { 
        tupleInput0.readBytes(charArray0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.bind.tuple.TupleInput", e);
      }
  }

  @Test
  public void test57()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      TupleInput tupleInput0 = new TupleInput(byteArray0, 14, 2047);
      try { 
        tupleInput0.readChars((int) (byte)56);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test58()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      TupleInput tupleInput0 = new TupleInput(byteArray0, (-1651), (-2280));
      try { 
        tupleInput0.readBytes((int) (byte)124);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.bind.tuple.TupleInput", e);
      }
  }

  @Test
  public void test59()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      TupleOutput tupleOutput0 = new TupleOutput(byteArray0);
      tupleOutput0.writeChars(".[5?I[\".");
      TupleInput tupleInput0 = new TupleInput(tupleOutput0);
      tupleInput0.readBytes(16);
      assertEquals(16, tupleInput0.getBufferOffset());
  }

  @Test
  public void test60()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      TupleInput tupleInput0 = new TupleInput(byteArray0, (-1651), (int) (byte) (-68));
      try { 
        tupleInput0.readBytes((int) (byte)124);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test61()  throws Throwable  {
      byte[] byteArray0 = new byte[13];
      TupleInput tupleInput0 = new TupleInput(byteArray0);
      byte byte0 = tupleInput0.readByte();
      assertEquals((byte) (-128), byte0);
  }

  @Test
  public void test62()  throws Throwable  {
      TupleOutput tupleOutput0 = new TupleOutput();
      char[] charArray0 = new char[16];
      charArray0[0] = '6';
      charArray0[1] = 'j';
      TupleOutput tupleOutput1 = tupleOutput0.writeString(charArray0);
      TupleOutput tupleOutput2 = tupleOutput1.writeDouble((-1.0));
      tupleOutput2.writeChar(3038);
      TupleOutput tupleOutput3 = tupleOutput2.writeBytes("6mac$C8g");
      TupleInput tupleInput0 = new TupleInput(tupleOutput3);
      tupleInput0.readDouble();
      tupleInput0.readChars(charArray0);
      tupleInput0.readFloat();
      tupleInput0.readInt();
      try { 
        tupleInput0.readBoolean();
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.bind.tuple.TupleInput", e);
      }
  }

  @Test
  public void test63()  throws Throwable  {
      TupleOutput tupleOutput0 = new TupleOutput();
      TupleOutput tupleOutput1 = tupleOutput0.writeInt(16);
      TupleInput tupleInput0 = new TupleInput(tupleOutput1);
      boolean boolean0 = tupleInput0.readBoolean();
      assertTrue(boolean0);
  }

  @Test
  public void test64()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte) (-1);
      byteArray0[1] = (byte) (-1);
      TupleInput tupleInput0 = new TupleInput(byteArray0);
      try { 
        tupleInput0.readString();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.util.UtfOps", e);
      }
  }

  @Test
  public void test65()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte) (-1);
      TupleInput tupleInput0 = new TupleInput(byteArray0);
      tupleInput0.readString();
      assertEquals(2, tupleInput0.getBufferOffset());
  }

  @Test
  public void test66()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      TupleOutput tupleOutput0 = new TupleOutput(byteArray0);
      tupleOutput0.writeLong((byte)0);
      TupleInput tupleInput0 = new TupleInput(tupleOutput0);
      try { 
        tupleInput0.readString();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.util.UtfOps", e);
      }
  }

  @Test
  public void test67()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      TupleInput tupleInput0 = new TupleInput(byteArray0);
      tupleInput0.readFast(byteArray0);
      try { 
        tupleInput0.readString();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 9
         //
         assertThrownBy("com.sleepycat.util.UtfOps", e);
      }
  }

  @Test
  public void test68()  throws Throwable  {
      TupleOutput tupleOutput0 = new TupleOutput();
      TupleInput tupleInput0 = new TupleInput(tupleOutput0);
      try { 
        tupleInput0.readShort();
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.bind.tuple.TupleInput", e);
      }
  }

  @Test
  public void test69()  throws Throwable  {
      byte[] byteArray0 = new byte[13];
      TupleInput tupleInput0 = new TupleInput(byteArray0);
      float float0 = tupleInput0.readFloat();
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test
  public void test70()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      TupleOutput tupleOutput0 = new TupleOutput(byteArray0);
      TupleInput tupleInput0 = new TupleInput(tupleOutput0);
      try { 
        tupleInput0.readInt();
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.bind.tuple.TupleInput", e);
      }
  }

  @Test
  public void test71()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      TupleInput tupleInput0 = new TupleInput(byteArray0, (-709), (int) (byte) (-1));
      try { 
        tupleInput0.readChar();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test72()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      TupleOutput tupleOutput0 = new TupleOutput(byteArray0);
      TupleInput tupleInput0 = new TupleInput(tupleOutput0);
      try { 
        tupleInput0.readByte();
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.bind.tuple.TupleInput", e);
      }
  }

  @Test
  public void test73()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      TupleOutput tupleOutput0 = new TupleOutput(byteArray0);
      TupleInput tupleInput0 = new TupleInput(tupleOutput0);
      try { 
        tupleInput0.readLong();
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.bind.tuple.TupleInput", e);
      }
  }

  @Test
  public void test74()  throws Throwable  {
      byte[] byteArray0 = new byte[13];
      TupleInput tupleInput0 = new TupleInput(byteArray0);
      tupleInput0.readString((int) (byte)0);
      assertEquals(0, tupleInput0.getBufferOffset());
  }
}
