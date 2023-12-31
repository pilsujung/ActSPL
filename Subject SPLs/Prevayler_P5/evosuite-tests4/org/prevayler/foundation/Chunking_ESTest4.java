/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 07 10:33:48 KST 2017
 */

package org.prevayler.foundation;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.fail;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class Chunking_ESTest4 extends Chunking_ESTest_scaffolding4 {

  @Test
  public void test0()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      byte[] byteArray0 = new byte[8];
      Chunk chunk0 = new Chunk(byteArray0);
      chunk0.setParameter("0\r\n", "m\";/VbG8z&.ao");
      try { 
        Chunking.writeChunk(byteArrayOutputStream0, chunk0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Invalid parameter name '0\r
         // '
         //
         assertThrownBy("org.prevayler.foundation.Chunking", e);
      }
  }



  @Test
  public void test3()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (int) (byte) (-43), (int) (byte)77);
      // Undeclared exception!
      try { 
        Chunking.readChunk(byteArrayInputStream0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test4()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      try { 
        Chunking.readChunk(byteArrayInputStream0);
        fail("Expecting exception: EOFException");
      
      } catch(EOFException e) {
         //
         // Unexpected end of stream in chunk header
         //
         assertThrownBy("org.prevayler.foundation.Chunking", e);
      }
  }

  @Test
  public void test5()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (int) (byte)0, (int) (byte)0);
      Chunk chunk0 = Chunking.readChunk(byteArrayInputStream0);
      assertNull(chunk0);
  }


  @Test
  public void test7()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      byte[] byteArray0 = new byte[8];
      Chunk chunk0 = new Chunk(byteArray0);
      chunk0.setParameter("journal", "'_?M=T");
      try { 
        Chunking.writeChunk(byteArrayOutputStream0, chunk0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Invalid parameter value ''_?M=T'
         //
         assertThrownBy("org.prevayler.foundation.Chunking", e);
      }
  }

  @Test
  public void test8()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      byte[] byteArray0 = new byte[8];
      Chunk chunk0 = new Chunk(byteArray0);
      chunk0.setParameter("Z", "!");
      Chunking.writeChunk(byteArrayOutputStream0, chunk0);
      assertEquals(17, byteArrayOutputStream0.size());
      assertEquals("8;Z=!\r\n\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\r\n", byteArrayOutputStream0.toString());
  }

}
