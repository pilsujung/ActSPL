/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 07 16:42:51 KST 2017
 */

package org.prevayler.foundation;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.fail;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class Chunking_ESTest3 extends Chunking_ESTest_scaffolding3 {

  @Test
  public void test0()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      byte[] byteArray0 = new byte[4];
      Chunk chunk0 = new Chunk(byteArray0);
      chunk0.setParameter("M", (String) null);
      // Undeclared exception!
      try { 
        Chunking.writeChunk(byteArrayOutputStream0, chunk0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }


  @Test
  public void test2()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      DataInputStream dataInputStream0 = new DataInputStream((InputStream) byteArrayInputStream0);
      try { 
        Chunking.readChunk(dataInputStream0);
        fail("Expecting exception: EOFException");
      
      } catch(EOFException e) {
         //
         // Unexpected end of stream in chunk header
         //
         assertThrownBy("org.prevayler.foundation.Chunking", e);
      }
  }

  @Test
  public void test3()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      DataInputStream dataInputStream0 = new DataInputStream((InputStream) byteArrayInputStream0);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream((InputStream) dataInputStream0);
      bufferedInputStream0.read(byteArray0);
      Chunk chunk0 = Chunking.readChunk(bufferedInputStream0);
      assertNull(chunk0);
  }


  @Test
  public void test5()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      byte[] byteArray0 = new byte[4];
      Chunk chunk0 = new Chunk(byteArray0);
      chunk0.setParameter("snapshot", "");
      try { 
        Chunking.writeChunk(byteArrayOutputStream0, chunk0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Invalid parameter value ''
         //
         assertThrownBy("org.prevayler.foundation.Chunking", e);
      }
  }

  @Test
  public void test6()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      byte[] byteArray0 = new byte[4];
      Chunk chunk0 = new Chunk(byteArray0);
      chunk0.setParameter("`@:Cj gxD;", "9UfNca[");
      try { 
        Chunking.writeChunk(byteArrayOutputStream0, chunk0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Invalid parameter name '`@:Cj gxD;'
         //
         assertThrownBy("org.prevayler.foundation.Chunking", e);
      }
  }

  @Test
  public void test7()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      byte[] byteArray0 = new byte[4];
      Chunk chunk0 = new Chunk(byteArray0);
      chunk0.setParameter("snapshot", "M");
      Chunking.writeChunk(byteArrayOutputStream0, chunk0);
      assertEquals(20, byteArrayOutputStream0.size());
      assertEquals("4;snapshot=M\r\n\u0000\u0000\u0000\u0000\r\n", byteArrayOutputStream0.toString());
  }

}
