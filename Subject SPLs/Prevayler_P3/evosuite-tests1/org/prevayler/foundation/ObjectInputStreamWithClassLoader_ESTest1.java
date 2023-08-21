/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 07 23:24:55 KST 2017
 */

package org.prevayler.foundation;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.fail;

import java.io.ByteArrayInputStream;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.StreamCorruptedException;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class ObjectInputStreamWithClassLoader_ESTest1 extends ObjectInputStreamWithClassLoader_ESTest_scaffolding1 {

  @Test
  public void test0()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      ObjectInputStreamWithClassLoader objectInputStreamWithClassLoader0 = null;
      try {
        objectInputStreamWithClassLoader0 = new ObjectInputStreamWithClassLoader((InputStream) null, classLoader0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.io.ObjectInputStream$PeekInputStream", e);
      }
  }

  @Test
  public void test1()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (-1), 1837);
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      ObjectInputStreamWithClassLoader objectInputStreamWithClassLoader0 = null;
      try {
        objectInputStreamWithClassLoader0 = new ObjectInputStreamWithClassLoader((InputStream) byteArrayInputStream0, classLoader0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.lang.System", e);
      }
  }

  @Test
  public void test2()  throws Throwable  {
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      FileInputStream fileInputStream0 = new FileInputStream(fileDescriptor0);
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      ObjectInputStreamWithClassLoader objectInputStreamWithClassLoader0 = null;
      try {
        objectInputStreamWithClassLoader0 = new ObjectInputStreamWithClassLoader((InputStream) fileInputStream0, classLoader0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Stream Closed
         //
         assertThrownBy("java.io.FileInputStream", e);
      }
  }

  @Test
  public void test3()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (int) (byte)28, (int) (byte) (-68));
      ObjectInputStreamWithClassLoader objectInputStreamWithClassLoader0 = null;
      try {
        objectInputStreamWithClassLoader0 = new ObjectInputStreamWithClassLoader((InputStream) byteArrayInputStream0, (ClassLoader) null);
        fail("Expecting exception: EOFException");
      
      } catch(EOFException e) {
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
      ObjectInputStreamWithClassLoader objectInputStreamWithClassLoader0 = null;
      try {
        objectInputStreamWithClassLoader0 = new ObjectInputStreamWithClassLoader((InputStream) byteArrayInputStream0, classLoader0);
        fail("Expecting exception: StreamCorruptedException");
      
      } catch(StreamCorruptedException e) {
         //
         // invalid stream header: 6F72670A
         //
         assertThrownBy("java.io.ObjectInputStream", e);
      }
  }
}