/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 06 20:32:18 KST 2017
 */

package org.prevayler.foundation.gzip;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PipedOutputStream;
import java.io.PrintStream;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class MultiMemberGZIPOutputStream_ESTest5 extends MultiMemberGZIPOutputStream_ESTest_scaffolding5 {

  @Test
  public void test00()  throws Throwable  {
      MultiMemberGZIPOutputStream multiMemberGZIPOutputStream0 = new MultiMemberGZIPOutputStream((OutputStream) null);
      byte[] byteArray0 = new byte[4];
      // Undeclared exception!
      try { 
        multiMemberGZIPOutputStream0.write(byteArray0, (int) (byte)0, (int) (byte)0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.prevayler.foundation.gzip.NonCloseableOutputStream", e);
      }
  }

  @Test
  public void test01()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      MultiMemberGZIPOutputStream multiMemberGZIPOutputStream0 = new MultiMemberGZIPOutputStream((OutputStream) byteArrayOutputStream0);
      byte[] byteArray0 = new byte[0];
      // Undeclared exception!
      try { 
        multiMemberGZIPOutputStream0.write(byteArray0, (-3960), (-3960));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.util.zip.DeflaterOutputStream", e);
      }
  }

  @Test
  public void test02()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      MultiMemberGZIPOutputStream multiMemberGZIPOutputStream0 = new MultiMemberGZIPOutputStream((OutputStream) pipedOutputStream0);
      byte[] byteArray0 = new byte[7];
      try { 
        multiMemberGZIPOutputStream0.write(byteArray0, (int) (byte)0, (int) (byte)0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         assertThrownBy("java.io.PipedOutputStream", e);
      }
  }

  @Test
  public void test03()  throws Throwable  {
      MultiMemberGZIPOutputStream multiMemberGZIPOutputStream0 = new MultiMemberGZIPOutputStream((OutputStream) null);
      byte[] byteArray0 = new byte[5];
      // Undeclared exception!
      try { 
        multiMemberGZIPOutputStream0.write(byteArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.prevayler.foundation.gzip.NonCloseableOutputStream", e);
      }
  }

  @Test
  public void test04()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      MultiMemberGZIPOutputStream multiMemberGZIPOutputStream0 = new MultiMemberGZIPOutputStream((OutputStream) pipedOutputStream0);
      byte[] byteArray0 = new byte[9];
      try { 
        multiMemberGZIPOutputStream0.write(byteArray0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         assertThrownBy("java.io.PipedOutputStream", e);
      }
  }

  @Test
  public void test05()  throws Throwable  {
      MultiMemberGZIPOutputStream multiMemberGZIPOutputStream0 = new MultiMemberGZIPOutputStream((OutputStream) null);
      // Undeclared exception!
      try { 
        multiMemberGZIPOutputStream0.write(137);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.prevayler.foundation.gzip.NonCloseableOutputStream", e);
      }
  }

  @Test
  public void test06()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      MultiMemberGZIPOutputStream multiMemberGZIPOutputStream0 = new MultiMemberGZIPOutputStream((OutputStream) pipedOutputStream0);
      try { 
        multiMemberGZIPOutputStream0.write(0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         assertThrownBy("java.io.PipedOutputStream", e);
      }
  }


  @Test
  public void test08()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      MultiMemberGZIPOutputStream multiMemberGZIPOutputStream0 = new MultiMemberGZIPOutputStream((OutputStream) byteArrayOutputStream0);
      multiMemberGZIPOutputStream0.write(370);
      PrintStream printStream0 = new PrintStream((OutputStream) multiMemberGZIPOutputStream0, true);
      byteArrayOutputStream0.writeTo(printStream0);
      assertEquals(26, byteArrayOutputStream0.size());
  }


  @Test
  public void test10()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      MultiMemberGZIPOutputStream multiMemberGZIPOutputStream0 = new MultiMemberGZIPOutputStream((OutputStream) byteArrayOutputStream0);
      byte[] byteArray0 = new byte[2];
      multiMemberGZIPOutputStream0.write(byteArray0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0}, byteArray0);
  }

  @Test
  public void test11()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      MultiMemberGZIPOutputStream multiMemberGZIPOutputStream0 = new MultiMemberGZIPOutputStream((OutputStream) byteArrayOutputStream0);
      multiMemberGZIPOutputStream0.flush();
  }

  @Test
  public void test12()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      MultiMemberGZIPOutputStream multiMemberGZIPOutputStream0 = new MultiMemberGZIPOutputStream((OutputStream) byteArrayOutputStream0);
      byte[] byteArray0 = new byte[3];
      multiMemberGZIPOutputStream0.write(byteArray0, (int) (byte)0, (int) (byte)0);
      multiMemberGZIPOutputStream0.write((int) (byte)0);
  }
}
