/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 09:14:02 KST 2017
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
public class TupleOutput_ESTest5 extends TupleOutput_ESTest_scaffolding5 {

  @Test
  public void test00()  throws Throwable  {
      TupleOutput tupleOutput0 = new TupleOutput();
      TupleOutput tupleOutput1 = tupleOutput0.writeDouble((-1311));
      assertSame(tupleOutput1, tupleOutput0);
  }

  @Test
  public void test01()  throws Throwable  {
      TupleOutput tupleOutput0 = new TupleOutput();
      TupleOutput tupleOutput1 = tupleOutput0.writeShort((-2910));
      assertSame(tupleOutput0, tupleOutput1);
  }

  @Test
  public void test02()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      TupleOutput tupleOutput0 = new TupleOutput(byteArray0);
      tupleOutput0.addSize((byte) (-9));
      // Undeclared exception!
      try { 
        tupleOutput0.writeUnsignedShort((-2154));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -9
         //
         assertThrownBy("com.sleepycat.util.FastOutputStream", e);
      }
  }

  @Test
  public void test03()  throws Throwable  {
      TupleOutput tupleOutput0 = new TupleOutput();
      tupleOutput0.addSize((-958));
      // Undeclared exception!
      try { 
        tupleOutput0.writeUnsignedInt((-1145L));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -958
         //
         assertThrownBy("com.sleepycat.util.FastOutputStream", e);
      }
  }

  @Test
  public void test04()  throws Throwable  {
      TupleOutput tupleOutput0 = new TupleOutput((byte[]) null);
      // Undeclared exception!
      try { 
        tupleOutput0.writeUnsignedByte((byte) (-73));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.util.FastOutputStream", e);
      }
  }

  @Test
  public void test05()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      TupleOutput tupleOutput0 = new TupleOutput(byteArray0);
      tupleOutput0.addSize(128);
      // Undeclared exception!
      try { 
        tupleOutput0.writeUnsignedByte('0');
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
      char[] charArray0 = new char[6];
      tupleOutput0.addSize((-3265));
      // Undeclared exception!
      try { 
        tupleOutput0.writeString(charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -3265
         //
         assertThrownBy("com.sleepycat.util.UtfOps", e);
      }
  }

  @Test
  public void test07()  throws Throwable  {
      TupleOutput tupleOutput0 = new TupleOutput();
      tupleOutput0.addSize(106);
      // Undeclared exception!
      try { 
        tupleOutput0.writeString(" d4");
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
      byte[] byteArray0 = new byte[3];
      TupleOutput tupleOutput0 = new TupleOutput(byteArray0);
      tupleOutput0.addSize((byte)52);
      // Undeclared exception!
      try { 
        tupleOutput0.writeShort(2488);
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
      byte[] byteArray0 = new byte[5];
      TupleOutput tupleOutput0 = new TupleOutput(byteArray0);
      tupleOutput0.addSize(7);
      // Undeclared exception!
      try { 
        tupleOutput0.writeLong(1L);
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
      TupleOutput tupleOutput0 = new TupleOutput((byte[]) null);
      // Undeclared exception!
      try { 
        tupleOutput0.writeInt((byte)52);
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
      TupleOutput tupleOutput0 = new TupleOutput();
      tupleOutput0.addSize((-2012));
      // Undeclared exception!
      try { 
        tupleOutput0.writeInt((-1082));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2012
         //
         assertThrownBy("com.sleepycat.util.FastOutputStream", e);
      }
  }

  @Test
  public void test12()  throws Throwable  {
      TupleOutput tupleOutput0 = new TupleOutput();
      tupleOutput0.addSize((-2201));
      // Undeclared exception!
      try { 
        tupleOutput0.writeFloat(2506.0F);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2201
         //
         assertThrownBy("com.sleepycat.util.FastOutputStream", e);
      }
  }

  @Test
  public void test13()  throws Throwable  {
      TupleOutput tupleOutput0 = new TupleOutput();
      tupleOutput0.addSize((-1955));
      // Undeclared exception!
      try { 
        tupleOutput0.writeDouble((-1.0));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1955
         //
         assertThrownBy("com.sleepycat.util.FastOutputStream", e);
      }
  }

  @Test
  public void test14()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      TupleOutput tupleOutput0 = new TupleOutput(byteArray0);
      char[] charArray0 = new char[5];
      tupleOutput0.addSize((byte) (-60));
      // Undeclared exception!
      try { 
        tupleOutput0.writeChars(charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -60
         //
         assertThrownBy("com.sleepycat.util.FastOutputStream", e);
      }
  }


  @Test
  public void test16()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      TupleOutput tupleOutput0 = new TupleOutput(byteArray0);
      tupleOutput0.addSize(2031);
      // Undeclared exception!
      try { 
        tupleOutput0.writeChars("+3");
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
      byte[] byteArray0 = new byte[2];
      TupleOutput tupleOutput0 = new TupleOutput(byteArray0);
      tupleOutput0.addSize((byte)3);
      // Undeclared exception!
      try { 
        tupleOutput0.writeChar((byte) (-58));
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
      // Undeclared exception!
      try { 
        tupleOutput0.writeBytes((char[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.bind.tuple.TupleOutput", e);
      }
  }

  @Test
  public void test19()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      TupleOutput tupleOutput0 = new TupleOutput(byteArray0);
      tupleOutput0.addSize((byte)21);
      char[] charArray0 = new char[3];
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
  public void test21()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      TupleOutput tupleOutput0 = new TupleOutput(byteArray0);
      tupleOutput0.addSize(2);
      // Undeclared exception!
      try { 
        tupleOutput0.writeBytes("9o");
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.lang.System", e);
      }
  }

  @Test
  public void test22()  throws Throwable  {
      TupleOutput tupleOutput0 = new TupleOutput((byte[]) null);
      // Undeclared exception!
      try { 
        tupleOutput0.writeByte((byte) (-73));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.util.FastOutputStream", e);
      }
  }

  @Test
  public void test23()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      TupleOutput tupleOutput0 = new TupleOutput(byteArray0);
      tupleOutput0.addSize((byte)105);
      // Undeclared exception!
      try { 
        tupleOutput0.writeByte((byte) (-66));
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
      TupleOutput tupleOutput0 = new TupleOutput((byte[]) null);
      // Undeclared exception!
      try { 
        tupleOutput0.writeBoolean(true);
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
      byte[] byteArray0 = new byte[0];
      TupleOutput tupleOutput0 = new TupleOutput(byteArray0);
      tupleOutput0.addSize((-1192));
      // Undeclared exception!
      try { 
        tupleOutput0.writeBoolean(true);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1192
         //
         assertThrownBy("com.sleepycat.util.FastOutputStream", e);
      }
  }


  @Test
  public void test27()  throws Throwable  {
      TupleOutput tupleOutput0 = new TupleOutput();
      char[] charArray0 = new char[0];
      TupleOutput tupleOutput1 = tupleOutput0.writeString(charArray0);
      assertEquals(0, tupleOutput1.size());
  }

  @Test
  public void test28()  throws Throwable  {
      TupleOutput tupleOutput0 = new TupleOutput();
      char[] charArray0 = new char[1];
      tupleOutput0.writeChars(charArray0);
      assertEquals(2, tupleOutput0.size());
  }

  @Test
  public void test29()  throws Throwable  {
      TupleOutput tupleOutput0 = new TupleOutput();
      TupleOutput tupleOutput1 = tupleOutput0.writeUnsignedByte((-1955));
      assertEquals(0, tupleOutput1.getBufferOffset());
  }

  @Test
  public void test30()  throws Throwable  {
      TupleOutput tupleOutput0 = new TupleOutput();
      TupleOutput tupleOutput1 = tupleOutput0.writeUnsignedShort((-1955));
      assertSame(tupleOutput0, tupleOutput1);
  }

  @Test
  public void test31()  throws Throwable  {
      TupleOutput tupleOutput0 = new TupleOutput();
      TupleOutput tupleOutput1 = tupleOutput0.writeUnsignedInt((-443L));
      assertSame(tupleOutput1, tupleOutput0);
  }

  @Test
  public void test32()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      TupleOutput tupleOutput0 = new TupleOutput(byteArray0);
      TupleOutput tupleOutput1 = tupleOutput0.writeString("");
      assertEquals(1, tupleOutput1.size());
  }

  @Test
  public void test33()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      TupleOutput tupleOutput0 = new TupleOutput(byteArray0);
      char[] charArray0 = new char[5];
      tupleOutput0.writeBytes(charArray0);
      assertEquals(5, tupleOutput0.size());
  }

  @Test
  public void test34()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      TupleOutput tupleOutput0 = new TupleOutput(byteArray0);
      TupleOutput tupleOutput1 = tupleOutput0.writeBoolean(true);
      assertSame(tupleOutput1, tupleOutput0);
  }

  @Test
  public void test35()  throws Throwable  {
      TupleOutput tupleOutput0 = new TupleOutput();
      TupleOutput tupleOutput1 = tupleOutput0.writeBoolean(false);
      assertEquals(1, tupleOutput1.getBufferLength());
  }

  @Test
  public void test36()  throws Throwable  {
      TupleOutput tupleOutput0 = new TupleOutput();
      TupleOutput tupleOutput1 = tupleOutput0.writeString((String) null);
      assertEquals(2, tupleOutput1.size());
  }

  @Test
  public void test37()  throws Throwable  {
      TupleOutput tupleOutput0 = new TupleOutput();
      TupleOutput tupleOutput1 = tupleOutput0.writeLong((-443L));
      assertEquals(0, tupleOutput1.getBufferOffset());
  }

  @Test
  public void test38()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      TupleOutput tupleOutput0 = new TupleOutput(byteArray0);
      TupleOutput tupleOutput1 = tupleOutput0.writeBytes("");
      assertSame(tupleOutput0, tupleOutput1);
  }

  @Test
  public void test39()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      TupleOutput tupleOutput0 = new TupleOutput(byteArray0);
      tupleOutput0.writeChars("n#SN");
      assertEquals(8, tupleOutput0.getBufferLength());
  }

  @Test
  public void test40()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      TupleOutput tupleOutput0 = new TupleOutput(byteArray0);
      tupleOutput0.writeChar((byte)16);
      assertArrayEquals(new byte[] {(byte)0, (byte)16, (byte)0, (byte)0, (byte)0}, byteArray0);
  }

  @Test
  public void test41()  throws Throwable  {
      TupleOutput tupleOutput0 = new TupleOutput();
      TupleOutput tupleOutput1 = tupleOutput0.writeByte((-589));
      assertSame(tupleOutput1, tupleOutput0);
  }

  @Test
  public void test42()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      TupleOutput tupleOutput0 = new TupleOutput(byteArray0);
      tupleOutput0.writeFloat((byte)0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
  }

  @Test
  public void test43()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      TupleOutput tupleOutput0 = new TupleOutput(byteArray0);
      TupleOutput tupleOutput1 = tupleOutput0.writeInt(806);
      assertEquals(4, tupleOutput1.getBufferLength());
  }
}
