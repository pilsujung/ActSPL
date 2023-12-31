/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 13:22:59 KST 2017
 */

package com.sleepycat.bind.tuple;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.sleepycat.bind.tuple.TupleOutput;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class TupleOutput_ESTest4 extends TupleOutput_ESTest_scaffolding4 {

  @Test
  public void test00()  throws Throwable  {
      TupleOutput tupleOutput0 = new TupleOutput();
      TupleOutput tupleOutput1 = tupleOutput0.writeLong(106);
      assertEquals(8, tupleOutput1.size());
  }

  @Test
  public void test01()  throws Throwable  {
      TupleOutput tupleOutput0 = new TupleOutput();
      TupleOutput tupleOutput1 = tupleOutput0.writeByte(1513);
      assertSame(tupleOutput1, tupleOutput0);
  }

  @Test
  public void test02()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      TupleOutput tupleOutput0 = new TupleOutput(byteArray0);
      TupleOutput tupleOutput1 = tupleOutput0.writeChar((-2937));
      assertEquals(0, tupleOutput1.getBufferOffset());
  }

  @Test
  public void test03()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      TupleOutput tupleOutput0 = new TupleOutput(byteArray0);
      tupleOutput0.addSize(40);
      // Undeclared exception!
      try { 
        tupleOutput0.writeUnsignedShort((-1));
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
      TupleOutput tupleOutput0 = new TupleOutput();
      tupleOutput0.addSize(458);
      // Undeclared exception!
      try { 
        tupleOutput0.writeUnsignedInt(0L);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.lang.System", e);
      }
  }

  @Test
  public void test05()  throws Throwable  {
      TupleOutput tupleOutput0 = new TupleOutput();
      tupleOutput0.addSize(1345);
      // Undeclared exception!
      try { 
        tupleOutput0.writeUnsignedByte((-2122));
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
      TupleOutput tupleOutput0 = new TupleOutput();
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
  public void test07()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      TupleOutput tupleOutput0 = new TupleOutput(byteArray0);
      tupleOutput0.addSize(8);
      // Undeclared exception!
      try { 
        tupleOutput0.writeString("Z*-tsr-cI3n");
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.lang.System", e);
      }
  }

  @Test
  public void test08()  throws Throwable  {
      TupleOutput tupleOutput0 = new TupleOutput();
      tupleOutput0.addSize((byte) (-29));
      // Undeclared exception!
      try { 
        tupleOutput0.writeShort((byte) (-29));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -29
         //
         assertThrownBy("com.sleepycat.util.FastOutputStream", e);
      }
  }

  @Test
  public void test09()  throws Throwable  {
      TupleOutput tupleOutput0 = new TupleOutput();
      tupleOutput0.addSize(128);
      // Undeclared exception!
      try { 
        tupleOutput0.writeLong((-3576L));
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
      byte[] byteArray0 = new byte[0];
      TupleOutput tupleOutput0 = new TupleOutput(byteArray0);
      tupleOutput0.addSize((-320));
      // Undeclared exception!
      try { 
        tupleOutput0.writeInt(Integer.MIN_VALUE);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -320
         //
         assertThrownBy("com.sleepycat.util.FastOutputStream", e);
      }
  }

  @Test
  public void test11()  throws Throwable  {
      TupleOutput tupleOutput0 = new TupleOutput();
      tupleOutput0.addSize(1129);
      // Undeclared exception!
      try { 
        tupleOutput0.writeFloat((-744.0F));
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
      TupleOutput tupleOutput0 = new TupleOutput();
      tupleOutput0.addSize((-364));
      // Undeclared exception!
      try { 
        tupleOutput0.writeDouble((-899.65321845305));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -364
         //
         assertThrownBy("com.sleepycat.util.FastOutputStream", e);
      }
  }


  @Test
  public void test14()  throws Throwable  {
      TupleOutput tupleOutput0 = new TupleOutput();
      char[] charArray0 = new char[6];
      tupleOutput0.addSize((-1343));
      // Undeclared exception!
      try { 
        tupleOutput0.writeChars(charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1343
         //
         assertThrownBy("com.sleepycat.util.FastOutputStream", e);
      }
  }

  @Test
  public void test15()  throws Throwable  {
      TupleOutput tupleOutput0 = new TupleOutput();
      tupleOutput0.addSize(255);
      // Undeclared exception!
      try { 
        tupleOutput0.writeChars("l9Lgs:7vq$");
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
      byte[] byteArray0 = new byte[3];
      TupleOutput tupleOutput0 = new TupleOutput(byteArray0);
      tupleOutput0.addSize(1735);
      // Undeclared exception!
      try { 
        tupleOutput0.writeChar((byte)24);
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
      TupleOutput tupleOutput0 = new TupleOutput();
      char[] charArray0 = new char[3];
      tupleOutput0.addSize(188);
      // Undeclared exception!
      try { 
        tupleOutput0.writeBytes(charArray0);
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
      TupleOutput tupleOutput0 = new TupleOutput(byteArray0);
      tupleOutput0.addSize((byte) (-52));
      // Undeclared exception!
      try { 
        tupleOutput0.writeBoolean(true);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -52
         //
         assertThrownBy("com.sleepycat.util.FastOutputStream", e);
      }
  }

  @Test
  public void test20()  throws Throwable  {
      TupleOutput tupleOutput0 = new TupleOutput();
      char[] charArray0 = new char[3];
      tupleOutput0.writeString(charArray0);
      assertEquals(6, tupleOutput0.size());
  }

  @Test
  public void test21()  throws Throwable  {
      TupleOutput tupleOutput0 = new TupleOutput();
      char[] charArray0 = new char[4];
      tupleOutput0.writeChars(charArray0);
      assertEquals(8, tupleOutput0.getBufferLength());
  }

  @Test
  public void test22()  throws Throwable  {
      TupleOutput tupleOutput0 = new TupleOutput();
      TupleOutput tupleOutput1 = tupleOutput0.writeUnsignedByte(0);
      assertSame(tupleOutput0, tupleOutput1);
  }

  @Test
  public void test23()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      TupleOutput tupleOutput0 = new TupleOutput(byteArray0);
      tupleOutput0.writeUnsignedShort((-1));
      assertArrayEquals(new byte[] {(byte) (-1), (byte) (-1)}, byteArray0);
  }

  @Test
  public void test24()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      TupleOutput tupleOutput0 = new TupleOutput(byteArray0);
      TupleOutput tupleOutput1 = tupleOutput0.writeUnsignedInt(100);
      assertEquals(0, tupleOutput1.getBufferOffset());
  }

  @Test
  public void test25()  throws Throwable  {
      TupleOutput tupleOutput0 = new TupleOutput();
      char[] charArray0 = new char[0];
      TupleOutput tupleOutput1 = tupleOutput0.writeString(charArray0);
      assertSame(tupleOutput1, tupleOutput0);
  }

  @Test
  public void test26()  throws Throwable  {
      TupleOutput tupleOutput0 = new TupleOutput();
      char[] charArray0 = new char[2];
      tupleOutput0.writeBytes(charArray0);
      assertEquals(2, tupleOutput0.size());
  }

  @Test
  public void test27()  throws Throwable  {
      TupleOutput tupleOutput0 = new TupleOutput();
      TupleOutput tupleOutput1 = tupleOutput0.writeBoolean(true);
      assertSame(tupleOutput0, tupleOutput1);
  }


  @Test
  public void test29()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      TupleOutput tupleOutput0 = new TupleOutput(byteArray0);
      tupleOutput0.writeString("Z*-tsr-cI3n");
      assertEquals(12, tupleOutput0.size());
  }

  @Test
  public void test30()  throws Throwable  {
      TupleOutput tupleOutput0 = new TupleOutput();
      TupleOutput tupleOutput1 = tupleOutput0.writeString((String) null);
      assertSame(tupleOutput1, tupleOutput0);
  }

  @Test
  public void test31()  throws Throwable  {
      TupleOutput tupleOutput0 = new TupleOutput();
      TupleOutput tupleOutput1 = tupleOutput0.writeBytes("");
      assertSame(tupleOutput0, tupleOutput1);
  }

  @Test
  public void test32()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      TupleOutput tupleOutput0 = new TupleOutput(byteArray0);
      tupleOutput0.writeChars("Y&#.FJf,~rSkMgA");
      assertEquals(30, tupleOutput0.size());
  }

  @Test
  public void test33()  throws Throwable  {
      TupleOutput tupleOutput0 = new TupleOutput();
      TupleOutput tupleOutput1 = tupleOutput0.writeDouble(0);
      assertSame(tupleOutput0, tupleOutput1);
  }

  @Test
  public void test34()  throws Throwable  {
      TupleOutput tupleOutput0 = new TupleOutput();
      TupleOutput tupleOutput1 = tupleOutput0.writeShort(0);
      assertEquals(2, tupleOutput1.getBufferLength());
  }

  @Test
  public void test35()  throws Throwable  {
      TupleOutput tupleOutput0 = new TupleOutput();
      TupleOutput tupleOutput1 = tupleOutput0.writeFloat((-744.0F));
      assertSame(tupleOutput1, tupleOutput0);
  }

  @Test
  public void test36()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      TupleOutput tupleOutput0 = new TupleOutput(byteArray0);
      TupleOutput tupleOutput1 = tupleOutput0.writeInt(Integer.MIN_VALUE);
      assertSame(tupleOutput1, tupleOutput0);
  }
}
