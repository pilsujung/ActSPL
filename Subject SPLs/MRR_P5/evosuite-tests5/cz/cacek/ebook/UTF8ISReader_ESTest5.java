/*
 * This file was automatically generated by EvoSuite
 * Sun Aug 12 19:03:07 KST 2018
 */

package cz.cacek.ebook;

import static org.evosuite.shaded.org.mockito.Mockito.doReturn;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import static org.evosuite.runtime.EvoAssertions.*;
import static org.evosuite.shaded.org.mockito.Mockito.mock;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.PushbackInputStream;
import java.io.SequenceInputStream;
import java.io.UTFDataFormatException;
import java.nio.CharBuffer;
import java.util.Enumeration;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class UTF8ISReader_ESTest5 extends UTF8ISReader_ESTest_scaffolding5 {
@BeforeClass
public static void initEvoSuiteFramework() {
String a = "aa";
}
@AfterClass
public static void exitEvoSuiteFramework() {
String a = "aa";
}

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      UTF8ISReader uTF8ISReader0 = new UTF8ISReader(pipedInputStream0);
      int int0 = uTF8ISReader0.sizeOf((byte[]) null, 0, (-1));
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      UTF8ISReader uTF8ISReader0 = new UTF8ISReader(pipedInputStream0);
      byte[] byteArray0 = new byte[8];
      byteArray0[2] = (byte) (-1);
      int int0 = uTF8ISReader0.sizeOf(byteArray0, (byte)0, (byte)4);
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      UTF8ISReader uTF8ISReader0 = new UTF8ISReader(pipedInputStream0);
      int int0 = uTF8ISReader0.sizeOf((byte[]) null, 1, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Enumeration<ObjectInputStream> enumeration0 = (Enumeration<ObjectInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      UTF8ISReader uTF8ISReader0 = new UTF8ISReader(sequenceInputStream0);
      char[] charArray0 = new char[3];
      int int0 = uTF8ISReader0.read(charArray0, (-1), (int) (byte)1);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte)0, (byte) (-1));
      UTF8ISReader uTF8ISReader0 = new UTF8ISReader(byteArrayInputStream0);
      boolean boolean0 = uTF8ISReader0.ready();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      FileInputStream fileInputStream0 = new FileInputStream(fileDescriptor0);
      DataInputStream dataInputStream0 = new DataInputStream(fileInputStream0);
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(dataInputStream0, dataInputStream0);
      UTF8ISReader uTF8ISReader0 = new UTF8ISReader(sequenceInputStream0);
      boolean boolean0 = uTF8ISReader0.ready();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      UTF8ISReader uTF8ISReader0 = new UTF8ISReader(pipedInputStream0);
      // Undeclared exception!
      try { 
        uTF8ISReader0.sizeOf((byte[]) null, 0, 1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("cz.cacek.ebook.UTF8ISReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      UTF8ISReader uTF8ISReader0 = new UTF8ISReader(pipedInputStream0);
      byte[] byteArray0 = new byte[8];
      // Undeclared exception!
      try { 
        uTF8ISReader0.sizeOf(byteArray0, (byte)0, (byte)9);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 8
         //
         verifyException("cz.cacek.ebook.UTF8ISReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      UTF8ISReader uTF8ISReader0 = new UTF8ISReader(byteArrayInputStream0);
      char[] charArray0 = new char[0];
      // Undeclared exception!
      try { 
        uTF8ISReader0.read(charArray0, (int) (byte)0, 1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("cz.cacek.ebook.UTF8ISReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      UTF8ISReader uTF8ISReader0 = new UTF8ISReader(pipedInputStream0);
      char[] charArray0 = new char[8];
      try { 
        uTF8ISReader0.read(charArray0, 0, 1);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Enumeration<InputStream> enumeration0 = (Enumeration<InputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false, true).when(enumeration0).hasMoreElements();
      doReturn((Object) null).when(enumeration0).nextElement();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      UTF8ISReader uTF8ISReader0 = new UTF8ISReader(sequenceInputStream0);
      // Undeclared exception!
      try { 
        uTF8ISReader0.close();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.SequenceInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      UTF8ISReader uTF8ISReader0 = new UTF8ISReader(pipedInputStream0);
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte) (-17);
      int int0 = uTF8ISReader0.sizeOf(byteArray0, 0, 1);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      UTF8ISReader uTF8ISReader0 = new UTF8ISReader(pipedInputStream0);
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte) (-33);
      int int0 = uTF8ISReader0.sizeOf(byteArray0, (byte)0, (byte)1);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[5] = (byte) (-65);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte)0, (byte)0);
      UTF8ISReader uTF8ISReader0 = new UTF8ISReader(byteArrayInputStream0);
      int int0 = uTF8ISReader0.sizeOf(byteArray0, 0, (byte)6);
      assertEquals(6, int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      PipedInputStream pipedInputStream0 = new PipedInputStream(pipedOutputStream0);
      UTF8ISReader uTF8ISReader0 = new UTF8ISReader(pipedInputStream0);
      byte[] byteArray0 = new byte[7];
      byteArray0[1] = (byte) (-81);
      int int0 = uTF8ISReader0.sizeOf(byteArray0, (byte)0, (byte)2);
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      PipedInputStream pipedInputStream0 = new PipedInputStream(pipedOutputStream0);
      UTF8ISReader uTF8ISReader0 = new UTF8ISReader(pipedInputStream0);
      byte[] byteArray0 = new byte[7];
      byteArray0[5] = (byte) (-113);
      int int0 = uTF8ISReader0.sizeOf(byteArray0, (byte)0, (byte)6);
      assertEquals(6, int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte)112;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte)0, (byte)0);
      UTF8ISReader uTF8ISReader0 = new UTF8ISReader(byteArrayInputStream0);
      int int0 = uTF8ISReader0.sizeOf(byteArray0, 0, (byte)1);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      PipedInputStream pipedInputStream0 = new PipedInputStream(pipedOutputStream0);
      UTF8ISReader uTF8ISReader0 = new UTF8ISReader(pipedInputStream0);
      byte[] byteArray0 = new byte[7];
      byteArray0[3] = (byte)96;
      int int0 = uTF8ISReader0.sizeOf(byteArray0, (byte)0, (byte)4);
      assertEquals(4, int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[2] = (byte)80;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte)0, (byte)0);
      UTF8ISReader uTF8ISReader0 = new UTF8ISReader(byteArrayInputStream0);
      int int0 = uTF8ISReader0.sizeOf(byteArray0, 0, (byte)3);
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      UTF8ISReader uTF8ISReader0 = new UTF8ISReader(pipedInputStream0);
      byte[] byteArray0 = new byte[8];
      byteArray0[5] = (byte)32;
      int int0 = uTF8ISReader0.sizeOf(byteArray0, (byte)0, (byte)6);
      assertEquals(6, int0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte)16;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte)0, (byte)0);
      UTF8ISReader uTF8ISReader0 = new UTF8ISReader(byteArrayInputStream0);
      int int0 = uTF8ISReader0.sizeOf(byteArray0, 0, (byte)1);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Enumeration<ObjectInputStream> enumeration0 = (Enumeration<ObjectInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      UTF8ISReader uTF8ISReader0 = new UTF8ISReader(sequenceInputStream0);
      char[] charArray0 = new char[3];
      int int0 = uTF8ISReader0.read(charArray0);
      assertEquals((-1), int0);
      
      int int1 = uTF8ISReader0.read(charArray0, 0, (int) (byte)1);
      assertEquals((-1), int1);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byteArray0[2] = (byte) (-17);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      UTF8ISReader uTF8ISReader0 = new UTF8ISReader(byteArrayInputStream0);
      char[] charArray0 = new char[7];
      try { 
        uTF8ISReader0.read(charArray0, 0, (int) (byte)3);
        fail("Expecting exception: UTFDataFormatException");
      
      } catch(UTFDataFormatException e) {
         //
         // invalid byte 0
         //
         verifyException("cz.cacek.ebook.UTF8ISReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte) (-33);
      char[] charArray0 = new char[0];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      DataInputStream dataInputStream0 = new DataInputStream(byteArrayInputStream0);
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(dataInputStream0);
      UTF8ISReader uTF8ISReader0 = new UTF8ISReader(pushbackInputStream0);
      try { 
        uTF8ISReader0.read(charArray0, 0, 1);
        fail("Expecting exception: UTFDataFormatException");
      
      } catch(UTFDataFormatException e) {
         //
         // invalid byte 0
         //
         verifyException("cz.cacek.ebook.UTF8ISReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byteArray0[1] = (byte) (-65);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      UTF8ISReader uTF8ISReader0 = new UTF8ISReader(byteArrayInputStream0);
      char[] charArray0 = new char[2];
      uTF8ISReader0.read(charArray0, (int) (byte)0, 1);
      try { 
        uTF8ISReader0.read(charArray0, (int) (byte)0, 1);
        fail("Expecting exception: UTFDataFormatException");
      
      } catch(UTFDataFormatException e) {
         //
         // invalid first byte 10111111
         //
         verifyException("cz.cacek.ebook.UTF8ISReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte) (-81);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      UTF8ISReader uTF8ISReader0 = new UTF8ISReader(byteArrayInputStream0);
      char[] charArray0 = new char[7];
      try { 
        uTF8ISReader0.read(charArray0, 0, (int) (byte)1);
        fail("Expecting exception: UTFDataFormatException");
      
      } catch(UTFDataFormatException e) {
         //
         // invalid first byte 10101111
         //
         verifyException("cz.cacek.ebook.UTF8ISReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byteArray0[1] = (byte) (-97);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      UTF8ISReader uTF8ISReader0 = new UTF8ISReader(byteArrayInputStream0);
      char[] charArray0 = new char[9];
      try { 
        uTF8ISReader0.read(charArray0);
        fail("Expecting exception: UTFDataFormatException");
      
      } catch(UTFDataFormatException e) {
         //
         // invalid first byte 10011111
         //
         verifyException("cz.cacek.ebook.UTF8ISReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte) (-113);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      UTF8ISReader uTF8ISReader0 = new UTF8ISReader(byteArrayInputStream0);
      char[] charArray0 = new char[19];
      try { 
        uTF8ISReader0.read(charArray0);
        fail("Expecting exception: UTFDataFormatException");
      
      } catch(UTFDataFormatException e) {
         //
         // invalid first byte 10001111
         //
         verifyException("cz.cacek.ebook.UTF8ISReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byteArray0[1] = (byte)80;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      UTF8ISReader uTF8ISReader0 = new UTF8ISReader(byteArrayInputStream0);
      char[] charArray0 = new char[7];
      int int0 = uTF8ISReader0.read(charArray0, 0, (int) (byte)2);
      assertEquals(2, byteArrayInputStream0.available());
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byteArray0[4] = (byte)64;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      UTF8ISReader uTF8ISReader0 = new UTF8ISReader(byteArrayInputStream0);
      char[] charArray0 = new char[9];
      int int0 = uTF8ISReader0.read(charArray0);
      assertEquals(0, byteArrayInputStream0.available());
      assertEquals(5, int0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byteArray0[1] = (byte)16;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      UTF8ISReader uTF8ISReader0 = new UTF8ISReader(byteArrayInputStream0);
      char[] charArray0 = new char[19];
      int int0 = uTF8ISReader0.read(charArray0);
      assertEquals(0, byteArrayInputStream0.available());
      assertEquals(5, int0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte) (-1);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      UTF8ISReader uTF8ISReader0 = new UTF8ISReader(byteArrayInputStream0);
      char[] charArray0 = new char[9];
      try { 
        uTF8ISReader0.read(charArray0);
        fail("Expecting exception: UTFDataFormatException");
      
      } catch(UTFDataFormatException e) {
         //
         // invalid first byte 11111111
         //
         verifyException("cz.cacek.ebook.UTF8ISReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      UTF8ISReader uTF8ISReader0 = new UTF8ISReader(byteArrayInputStream0);
      CharBuffer charBuffer0 = CharBuffer.allocate(0);
      int int0 = uTF8ISReader0.read(charBuffer0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      UTF8ISReader uTF8ISReader0 = new UTF8ISReader(byteArrayInputStream0);
      char[] charArray0 = new char[6];
      int int0 = uTF8ISReader0.read(charArray0, 0, (-1));
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      UTF8ISReader uTF8ISReader0 = new UTF8ISReader(byteArrayInputStream0);
      uTF8ISReader0.close();
      assertFalse(uTF8ISReader0.markSupported());
  }


  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 0, 0);
      UTF8ISReader uTF8ISReader0 = new UTF8ISReader(byteArrayInputStream0);
      boolean boolean0 = uTF8ISReader0.ready();
      assertFalse(boolean0);
  }



  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 0, 0);
      UTF8ISReader uTF8ISReader0 = new UTF8ISReader(byteArrayInputStream0);
      try { 
        uTF8ISReader0.mark((byte)0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // mark() not supported
         //
         verifyException("cz.cacek.ebook.UTF8ISReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Enumeration<InputStream> enumeration0 = (Enumeration<InputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      UTF8ISReader uTF8ISReader0 = new UTF8ISReader(sequenceInputStream0);
      try { 
        uTF8ISReader0.reset();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // reset() not supported
         //
         verifyException("cz.cacek.ebook.UTF8ISReader", e);
      }
  }
}