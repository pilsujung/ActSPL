/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 06 20:29:58 KST 2017
 */

package org.prevayler.foundation.gzip;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.fail;

import java.io.ByteArrayInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.io.PushbackInputStream;
import java.util.zip.ZipException;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class ContinuableGZIPInputStream_ESTest5 extends ContinuableGZIPInputStream_ESTest_scaffolding5 {


  @Test
  public void test2()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream((InputStream) pipedInputStream0);
      ContinuableGZIPInputStream continuableGZIPInputStream0 = null;
      try {
        continuableGZIPInputStream0 = new ContinuableGZIPInputStream((InputStream) pushbackInputStream0);
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
      byte[] byteArray0 = new byte[1];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 1, (-1574));
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
