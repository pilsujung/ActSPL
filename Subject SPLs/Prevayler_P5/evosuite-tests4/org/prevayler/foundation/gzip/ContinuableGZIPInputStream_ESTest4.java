/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 07 10:49:10 KST 2017
 */

package org.prevayler.foundation.gzip;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.fail;

import java.io.ByteArrayInputStream;
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
public class ContinuableGZIPInputStream_ESTest4 extends ContinuableGZIPInputStream_ESTest_scaffolding4 {


  @Test
  public void test2()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream(1);
      ContinuableGZIPInputStream continuableGZIPInputStream0 = null;
      try {
        continuableGZIPInputStream0 = new ContinuableGZIPInputStream((InputStream) pipedInputStream0);
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
      byte[] byteArray0 = new byte[3];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (int) (byte)71, (int) (byte)71);
      ContinuableGZIPInputStream continuableGZIPInputStream0 = null;
      try {
        continuableGZIPInputStream0 = new ContinuableGZIPInputStream((InputStream) byteArrayInputStream0);
        fail("Expecting exception: EOFException");
      
      } catch(EOFException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.util.zip.GZIPInputStream", e);
      }
  }

}