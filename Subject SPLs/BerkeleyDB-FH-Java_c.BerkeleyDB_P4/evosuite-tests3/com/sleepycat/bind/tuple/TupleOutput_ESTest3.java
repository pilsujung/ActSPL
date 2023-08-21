/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 08:35:33 KST 2017
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
public class TupleOutput_ESTest3 extends TupleOutput_ESTest_scaffolding3 {

  @Test
  public void test00()  throws Throwable  {
      TupleOutput tupleOutput0 = new TupleOutput();
      char[] charArray0 = new char[6];
      tupleOutput0.writeBytes(charArray0);
      assertEquals(6, tupleOutput0.getBufferLength());
  }

  @Test
  public void test01()  throws Throwable  {
      TupleOutput tupleOutput0 = new TupleOutput();
      TupleOutput tupleOutput1 = tupleOutput0.writeShort((-1));
      assertEquals(2, tupleOutput1.getBufferLength());
  }

  @Test
  public void test02()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      TupleOutput tupleOutput0 = new TupleOutput(byteArray0);
      tupleOutput0.writeByte(1423);
      assertArrayEquals(new byte[] {(byte)15, (byte)0, (byte)0}, byteArray0);
  }

  @Test
  public void test03()  throws Throwable  {
      TupleOutput tupleOutput0 = new TupleOutput();
      TupleOutput tupleOutput1 = tupleOutput0.writeChar((-1));
      assertEquals(0, tupleOutput1.getBufferOffset());
  }

  @Test
  public void test04()  throws Throwable  {
      TupleOutput tupleOutput0 = new TupleOutput();
      tupleOutput0.addSize(1445);
      // Undeclared exception!
      try { 
        tupleOutput0.writeUnsignedShort(668);
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
      tupleOutput0.addSize((-510));
      // Undeclared exception!
      try { 
        tupleOutput0.writeUnsignedInt((-510));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -510
         //
         assertThrownBy("com.sleepycat.util.FastOutputStream", e);
      }
  }

  @Test
  public void test06()  throws Throwable  {
      byte[] byteArray0 = new byte[11];
      TupleOutput tupleOutput0 = new TupleOutput(byteArray0);
      tupleOutput0.addSize((-91));
      // Undeclared exception!
      try { 
        tupleOutput0.writeUnsignedByte((-1806));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -91
         //
         assertThrownBy("com.sleepycat.util.FastOutputStream", e);
      }
  }

  @Test
  public void test07()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
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
  public void test08()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      TupleOutput tupleOutput0 = new TupleOutput(byteArray0);
      tupleOutput0.addSize((byte)14);
      char[] charArray0 = new char[2];
      // Undeclared exception!
      try { 
        tupleOutput0.writeString(charArray0);
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
      TupleOutput tupleOutput0 = new TupleOutput((byte[]) null);
      // Undeclared exception!
      try { 
        tupleOutput0.writeString("");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.util.FastOutputStream", e);
      }
  }

  @Test
  public void test10()  throws Throwable  {
      TupleOutput tupleOutput0 = new TupleOutput();
      tupleOutput0.addSize((-1206));
      // Undeclared exception!
      try { 
        tupleOutput0.writeString("");
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1206
         //
         assertThrownBy("com.sleepycat.util.FastOutputStream", e);
      }
  }

  @Test
  public void test11()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      TupleOutput tupleOutput0 = new TupleOutput(byteArray0);
      tupleOutput0.addSize(Integer.MIN_VALUE);
      // Undeclared exception!
      try { 
        tupleOutput0.writeShort(4);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2147483648
         //
         assertThrownBy("com.sleepycat.util.FastOutputStream", e);
      }
  }

  @Test
  public void test12()  throws Throwable  {
      TupleOutput tupleOutput0 = new TupleOutput();
      tupleOutput0.addSize(1663);
      // Undeclared exception!
      try { 
        tupleOutput0.writeLong((-1L));
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
      byte[] byteArray0 = new byte[0];
      TupleOutput tupleOutput0 = new TupleOutput(byteArray0);
      tupleOutput0.addSize((-26));
      // Undeclared exception!
      try { 
        tupleOutput0.writeInt((-2787));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -26
         //
         assertThrownBy("com.sleepycat.util.FastOutputStream", e);
      }
  }

  @Test
  public void test14()  throws Throwable  {
      TupleOutput tupleOutput0 = new TupleOutput();
      tupleOutput0.addSize((-1784));
      // Undeclared exception!
      try { 
        tupleOutput0.writeFloat((-1.0F));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1784
         //
         assertThrownBy("com.sleepycat.util.FastOutputStream", e);
      }
  }

  @Test
  public void test15()  throws Throwable  {
      TupleOutput tupleOutput0 = new TupleOutput((byte[]) null);
      // Undeclared exception!
      try { 
        tupleOutput0.writeDouble((byte)0);
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
      TupleOutput tupleOutput0 = new TupleOutput();
      tupleOutput0.addSize(760);
      // Undeclared exception!
      try { 
        tupleOutput0.writeDouble((-1.0));
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
  public void test18()  throws Throwable  {
      TupleOutput tupleOutput0 = new TupleOutput();
      char[] charArray0 = new char[6];
      tupleOutput0.addSize((-2217));
      // Undeclared exception!
      try { 
        tupleOutput0.writeChars(charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2217
         //
         assertThrownBy("com.sleepycat.util.FastOutputStream", e);
      }
  }

  @Test
  public void test19()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      TupleOutput tupleOutput0 = new TupleOutput(byteArray0);
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
  public void test20()  throws Throwable  {
      TupleOutput tupleOutput0 = new TupleOutput();
      tupleOutput0.addSize(761);
      // Undeclared exception!
      try { 
        tupleOutput0.writeChars("_");
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
      TupleOutput tupleOutput0 = new TupleOutput();
      tupleOutput0.addSize((-2337));
      // Undeclared exception!
      try { 
        tupleOutput0.writeChar(0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2337
         //
         assertThrownBy("com.sleepycat.util.FastOutputStream", e);
      }
  }

  @Test
  public void test22()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      TupleOutput tupleOutput0 = new TupleOutput(byteArray0);
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
  public void test23()  throws Throwable  {
      TupleOutput tupleOutput0 = new TupleOutput();
      char[] charArray0 = new char[1];
      tupleOutput0.addSize(761);
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
  public void test24()  throws Throwable  {
      TupleOutput tupleOutput0 = new TupleOutput();
      tupleOutput0.addSize(4504);
      // Undeclared exception!
      try { 
        tupleOutput0.writeByte(1106);
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
      TupleOutput tupleOutput0 = new TupleOutput((byte[]) null);
      // Undeclared exception!
      try { 
        tupleOutput0.writeBoolean(false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.util.FastOutputStream", e);
      }
  }

  @Test
  public void test26()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      TupleOutput tupleOutput0 = new TupleOutput(byteArray0);
      tupleOutput0.addSize(1571);
      // Undeclared exception!
      try { 
        tupleOutput0.writeBoolean(false);
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
      TupleOutput tupleOutput0 = new TupleOutput(byteArray0);
      char[] charArray0 = new char[0];
      TupleOutput tupleOutput1 = tupleOutput0.writeString(charArray0);
      assertEquals(0, tupleOutput1.getBufferLength());
  }

  @Test
  public void test29()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      TupleOutput tupleOutput0 = new TupleOutput(byteArray0);
      TupleOutput tupleOutput1 = tupleOutput0.writeUnsignedByte(535);
      assertEquals(0, tupleOutput1.getBufferOffset());
  }

  @Test
  public void test30()  throws Throwable  {
      TupleOutput tupleOutput0 = new TupleOutput();
      TupleOutput tupleOutput1 = tupleOutput0.writeUnsignedShort(0);
      assertEquals(2, tupleOutput1.getBufferLength());
  }

  @Test
  public void test31()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      TupleOutput tupleOutput0 = new TupleOutput(byteArray0);
      TupleOutput tupleOutput1 = tupleOutput0.writeUnsignedInt((byte)0);
      assertEquals(0, tupleOutput1.getBufferOffset());
  }

  @Test
  public void test32()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      TupleOutput tupleOutput0 = new TupleOutput(byteArray0);
      tupleOutput0.writeString("6uTBF!Xb:e[#Q#YXG");
      assertEquals(19, tupleOutput0.getBufferLength());
  }

  @Test
  public void test33()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      TupleOutput tupleOutput0 = new TupleOutput(byteArray0);
      char[] charArray0 = new char[4];
      tupleOutput0.writeChars(charArray0);
      assertEquals(8, tupleOutput0.size());
  }

  @Test
  public void test34()  throws Throwable  {
      byte[] byteArray0 = new byte[11];
      TupleOutput tupleOutput0 = new TupleOutput(byteArray0);
      tupleOutput0.writeBytes(".");
      assertEquals(1, tupleOutput0.getBufferLength());
  }

  @Test
  public void test35()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      TupleOutput tupleOutput0 = new TupleOutput(byteArray0);
      tupleOutput0.writeBoolean(true);
      assertArrayEquals(new byte[] {(byte)1, (byte)0, (byte)0}, byteArray0);
  }

  @Test
  public void test36()  throws Throwable  {
      TupleOutput tupleOutput0 = new TupleOutput();
      TupleOutput tupleOutput1 = tupleOutput0.writeString((String) null);
      assertEquals(2, tupleOutput1.getBufferLength());
  }

  @Test
  public void test37()  throws Throwable  {
      byte[] byteArray0 = new byte[11];
      TupleOutput tupleOutput0 = new TupleOutput(byteArray0);
      TupleOutput tupleOutput1 = tupleOutput0.writeLong(2128L);
      assertSame(tupleOutput0, tupleOutput1);
  }


  @Test
  public void test39()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      TupleOutput tupleOutput0 = new TupleOutput(byteArray0);
      TupleOutput tupleOutput1 = tupleOutput0.writeChars("");
      assertSame(tupleOutput0, tupleOutput1);
  }

  @Test
  public void test40()  throws Throwable  {
      TupleOutput tupleOutput0 = new TupleOutput();
      TupleOutput tupleOutput1 = tupleOutput0.writeDouble((-3574.22501563));
      assertSame(tupleOutput1, tupleOutput0);
  }

  @Test
  public void test41()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      TupleOutput tupleOutput0 = new TupleOutput(byteArray0);
      TupleOutput tupleOutput1 = tupleOutput0.writeChar(179);
      assertEquals(2, tupleOutput1.size());
  }

  @Test
  public void test42()  throws Throwable  {
      TupleOutput tupleOutput0 = new TupleOutput();
      TupleOutput tupleOutput1 = tupleOutput0.writeFloat((-800.982F));
      assertSame(tupleOutput1, tupleOutput0);
  }

  @Test
  public void test43()  throws Throwable  {
      byte[] byteArray0 = new byte[11];
      TupleOutput tupleOutput0 = new TupleOutput(byteArray0);
      TupleOutput tupleOutput1 = tupleOutput0.writeInt((-214));
      assertEquals(4, tupleOutput1.size());
  }
}
