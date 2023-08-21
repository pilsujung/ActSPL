/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 21 23:19:56 KST 2017
 */

package com.sleepycat.bind.serial;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.sleepycat.bind.serial.ClassCatalog;
import com.sleepycat.bind.serial.SerialInput;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.io.StreamCorruptedException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class SerialInput_ESTest2 extends SerialInput_ESTest_scaffolding2 {

  @Test
  public void test00()  throws Throwable  {
      ClassCatalog classCatalog0 = null;
      ClassLoader classLoader0 = null;
      PipedInputStream pipedInputStream0 = new PipedInputStream(4);
      SerialInput serialInput0 = null;
      try {
        serialInput0 = new SerialInput((InputStream) pipedInputStream0, (ClassCatalog) null, (ClassLoader) null);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         assertThrownBy("java.io.PipedInputStream", e);
      }
  }


  @Test
  public void test02()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (int) (byte) (-117), (int) (byte)119);
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      SerialInput serialInput0 = null;
      try {
        serialInput0 = new SerialInput((InputStream) byteArrayInputStream0, (ClassCatalog) null, classLoader0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.lang.System", e);
      }
  }

  @Test
  public void test03()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      DataInputStream dataInputStream0 = new DataInputStream((InputStream) byteArrayInputStream0);
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      SerialInput serialInput0 = null;
      try {
        serialInput0 = new SerialInput((InputStream) dataInputStream0, (ClassCatalog) null, classLoader0);
        fail("Expecting exception: StreamCorruptedException");
      
      } catch(StreamCorruptedException e) {
         //
         // invalid stream header: 00000000
         //
         assertThrownBy("java.io.ObjectInputStream", e);
      }
  }

  @Test
  public void test04()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (int) (byte) (-26), (-181));
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      SerialInput serialInput0 = null;
      try {
        serialInput0 = new SerialInput((InputStream) byteArrayInputStream0, (ClassCatalog) null, classLoader0);
        fail("Expecting exception: EOFException");
      
      } catch(EOFException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.io.ObjectInputStream$PeekInputStream", e);
      }
  }


  @Test
  public void test06()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (-1792), 2166);
      SerialInput serialInput0 = null;
      try {
        serialInput0 = new SerialInput((InputStream) byteArrayInputStream0, (ClassCatalog) null);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.lang.System", e);
      }
  }

  @Test
  public void test07()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      SerialInput serialInput0 = null;
      try {
        serialInput0 = new SerialInput((InputStream) byteArrayInputStream0, (ClassCatalog) null);
        fail("Expecting exception: StreamCorruptedException");
      
      } catch(StreamCorruptedException e) {
         //
         // invalid stream header: 00000000
         //
         assertThrownBy("java.io.ObjectInputStream", e);
      }
  }

  @Test
  public void test08()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      SerialInput serialInput0 = null;
      try {
        serialInput0 = new SerialInput((InputStream) byteArrayInputStream0, (ClassCatalog) null);
        fail("Expecting exception: EOFException");
      
      } catch(EOFException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.io.ObjectInputStream$PeekInputStream", e);
      }
  }

  @Test
  public void test09()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream(4);
      SerialInput serialInput0 = null;
      try {
        serialInput0 = new SerialInput((InputStream) pipedInputStream0, (ClassCatalog) null, (ClassLoader) null);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         assertThrownBy("java.io.PipedInputStream", e);
      }
  }

}
