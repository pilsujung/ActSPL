/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 10:39:28 KST 2017
 */

package com.sleepycat.je.log;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.fail;

import java.io.RandomAccessFile;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class FileSource_ESTest5 extends FileSource_ESTest_scaffolding5 {

  @Test
  public void test0()  throws Throwable  {
      FileSource fileSource0 = new FileSource((RandomAccessFile) null, Integer.MAX_VALUE, (FileManager) null);
      // Undeclared exception!
      try { 
        fileSource0.getBytes((long) Integer.MAX_VALUE, Integer.MAX_VALUE);
        fail("Expecting exception: OutOfMemoryError");
      
      } catch(OutOfMemoryError e) {
         //
         // Requested array size exceeds VM limit
         //
      }
  }

  @Test
  public void test1()  throws Throwable  {
      FileSource fileSource0 = new FileSource((RandomAccessFile) null, 472, (FileManager) null);
      // Undeclared exception!
      try { 
        fileSource0.getBytes((long) 472, 472);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.FileSource", e);
      }
  }

  @Test
  public void test2()  throws Throwable  {
      FileSource fileSource0 = new FileSource((RandomAccessFile) null, 0, (FileManager) null);
      // Undeclared exception!
      try { 
        fileSource0.getBytes((long) (-484), (-484));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.nio.ByteBuffer", e);
      }
  }

  @Test
  public void test3()  throws Throwable  {
      FileSource fileSource0 = new FileSource((RandomAccessFile) null, Integer.MAX_VALUE, (FileManager) null);
      // Undeclared exception!
      try { 
        fileSource0.getBytes((long) Integer.MAX_VALUE);
        fail("Expecting exception: OutOfMemoryError");
      
      } catch(OutOfMemoryError e) {
         //
         // Requested array size exceeds VM limit
         //
      }
  }

  @Test
  public void test4()  throws Throwable  {
      FileSource fileSource0 = new FileSource((RandomAccessFile) null, 0, (FileManager) null);
      // Undeclared exception!
      try { 
        fileSource0.getBytes(847L);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.FileSource", e);
      }
  }

  @Test
  public void test5()  throws Throwable  {
      FileSource fileSource0 = new FileSource((RandomAccessFile) null, (-1268), (FileManager) null);
      // Undeclared exception!
      try { 
        fileSource0.getBytes((long) (-1268));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.nio.ByteBuffer", e);
      }
  }

  @Test
  public void test6()  throws Throwable  {
      FileSource fileSource0 = new FileSource((RandomAccessFile) null, Integer.MAX_VALUE, (FileManager) null);
      fileSource0.release();
  }
}
