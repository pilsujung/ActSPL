/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 06 20:31:46 KST 2017
 */

package org.prevayler.foundation.gzip;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.fail;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.util.zip.ZipException;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class MultiMemberGZIPInputStream_ESTest5 extends MultiMemberGZIPInputStream_ESTest_scaffolding5 {

  @Test
  public void test0()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream((InputStream) byteArrayInputStream0);
      DataInputStream dataInputStream0 = new DataInputStream((InputStream) bufferedInputStream0);
      MultiMemberGZIPInputStream multiMemberGZIPInputStream0 = null;
      try {
        multiMemberGZIPInputStream0 = new MultiMemberGZIPInputStream((InputStream) dataInputStream0);
        fail("Expecting exception: ZipException");
      
      } catch(ZipException e) {
         //
         // Not in GZIP format
         //
         assertThrownBy("java.util.zip.GZIPInputStream", e);
      }
  }

  @Test
  public void test1()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (-1), (int) (byte)96);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream((InputStream) byteArrayInputStream0);
      MultiMemberGZIPInputStream multiMemberGZIPInputStream0 = null;
      try {
        multiMemberGZIPInputStream0 = new MultiMemberGZIPInputStream((InputStream) bufferedInputStream0);
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
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream((InputStream) pipedInputStream0, 1184);
      MultiMemberGZIPInputStream multiMemberGZIPInputStream0 = null;
      try {
        multiMemberGZIPInputStream0 = new MultiMemberGZIPInputStream((InputStream) bufferedInputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         assertThrownBy("java.io.PipedInputStream", e);
      }
  }

  @Test
  public void test3()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (int) (byte)0, (int) (byte)0);
      MultiMemberGZIPInputStream multiMemberGZIPInputStream0 = null;
      try {
        multiMemberGZIPInputStream0 = new MultiMemberGZIPInputStream((InputStream) byteArrayInputStream0);
        fail("Expecting exception: EOFException");
      
      } catch(EOFException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.util.zip.GZIPInputStream", e);
      }
  }

}
