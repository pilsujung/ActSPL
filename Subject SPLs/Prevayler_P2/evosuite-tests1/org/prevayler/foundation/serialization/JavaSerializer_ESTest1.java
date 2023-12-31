/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 07 23:37:04 KST 2017
 */

package org.prevayler.foundation.serialization;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.fail;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.NotSerializableException;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.StreamCorruptedException;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class JavaSerializer_ESTest1 extends JavaSerializer_ESTest_scaffolding1 {

  @Test
  public void test0()  throws Throwable  {
      JavaSerializer javaSerializer0 = new JavaSerializer();
      // Undeclared exception!
      try { 
        javaSerializer0.writeObject((OutputStream) null, (Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.io.ObjectOutputStream$BlockDataOutputStream", e);
      }
  }

  @Test
  public void test1()  throws Throwable  {
      JavaSerializer javaSerializer0 = new JavaSerializer();
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      try { 
        javaSerializer0.writeObject(byteArrayOutputStream0, byteArrayOutputStream0);
        fail("Expecting exception: NotSerializableException");
      
      } catch(NotSerializableException e) {
         //
         // java.io.ByteArrayOutputStream
         //
         assertThrownBy("java.io.ObjectOutputStream", e);
      }
  }

  @Test
  public void test2()  throws Throwable  {
      JavaSerializer javaSerializer0 = new JavaSerializer();
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      try { 
        javaSerializer0.writeObject(pipedOutputStream0, (Object) null);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         assertThrownBy("java.io.PipedOutputStream", e);
      }
  }

  @Test
  public void test3()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      JavaSerializer javaSerializer0 = new JavaSerializer(classLoader0);
      // Undeclared exception!
      try { 
        javaSerializer0.readObject((InputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.io.ObjectInputStream$PeekInputStream", e);
      }
  }

  @Test
  public void test4()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      ByteArrayInputStream byteArrayInputStream0 = (ByteArrayInputStream)classLoader0.getResourceAsStream("");
      JavaSerializer javaSerializer0 = new JavaSerializer(classLoader0);
      try { 
        javaSerializer0.readObject(byteArrayInputStream0);
        fail("Expecting exception: StreamCorruptedException");
      
      } catch(StreamCorruptedException e) {
         //
         // invalid stream header: 6F72670A
         //
         assertThrownBy("java.io.ObjectInputStream", e);
      }
  }

  @Test
  public void test5()  throws Throwable  {
      JavaSerializer javaSerializer0 = new JavaSerializer();
      byte[] byteArray0 = new byte[4];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 1147, 1147);
      try { 
        javaSerializer0.readObject(byteArrayInputStream0);
        fail("Expecting exception: EOFException");
      
      } catch(EOFException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.io.ObjectInputStream$PeekInputStream", e);
      }
  }

  @Test
  public void test6()  throws Throwable  {
      JavaSerializer javaSerializer0 = new JavaSerializer();
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      try { 
        javaSerializer0.readObject(pipedInputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         assertThrownBy("java.io.PipedInputStream", e);
      }
  }

  @Test
  public void test7()  throws Throwable  {
      JavaSerializer javaSerializer0 = new JavaSerializer();
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream(pipedInputStream0);
      javaSerializer0.writeObject(pipedOutputStream0, (Object) null);
      Object object0 = javaSerializer0.readObject(pipedInputStream0);
      assertNull(object0);
  }

  @Test
  public void test8()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      JavaSerializer javaSerializer0 = new JavaSerializer(classLoader0);
      byte[] byteArray0 = new byte[1];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (int) (byte) (-64), 2092);
      // Undeclared exception!
      try { 
        javaSerializer0.readObject(byteArrayInputStream0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.lang.System", e);
      }
  }
}
