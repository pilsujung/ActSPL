/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 21 20:29:10 KST 2017
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
public class FileSource_ESTest7 extends FileSource_ESTest_scaffolding7 {

  @Test
  public void test0()  throws Throwable  {
      FileSource fileSource0 = new FileSource((RandomAccessFile) null, (-1152), (FileManager) null);
      // Undeclared exception!
      try { 
        fileSource0.getBytes((long) (-1152), Integer.MAX_VALUE);
        fail("Expecting exception: OutOfMemoryError");
      
      } catch(OutOfMemoryError e) {
         //
         // Requested array size exceeds VM limit
         //
      }
  }

  @Test
  public void test1()  throws Throwable  {
      FileSource fileSource0 = new FileSource((RandomAccessFile) null, 685, (FileManager) null);
      // Undeclared exception!
      try { 
        fileSource0.getBytes((long) 685, 685);
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
      FileSource fileSource0 = new FileSource((RandomAccessFile) null, (-2729), (FileManager) null);
      // Undeclared exception!
      try { 
        fileSource0.getBytes((-1953L), (-2729));
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
      FileSource fileSource0 = new FileSource((RandomAccessFile) null, 343, (FileManager) null);
      // Undeclared exception!
      try { 
        fileSource0.getBytes((long) 343);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.FileSource", e);
      }
  }

  @Test
  public void test4()  throws Throwable  {
      FileSource fileSource0 = new FileSource((RandomAccessFile) null, (-19), (FileManager) null);
      // Undeclared exception!
      try { 
        fileSource0.getBytes((long) (-19));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.nio.ByteBuffer", e);
      }
  }

  @Test
  public void test5()  throws Throwable  {
      FileSource fileSource0 = new FileSource((RandomAccessFile) null, (-19), (FileManager) null);
      fileSource0.release();
  }
}
