/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 09:11:46 KST 2017
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
public class FileSource_ESTest3 extends FileSource_ESTest_scaffolding3 {

  @Test
  public void test0()  throws Throwable  {
      FileSource fileSource0 = new FileSource((RandomAccessFile) null, 0, (FileManager) null);
      // Undeclared exception!
      try { 
        fileSource0.getBytes((long) 0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.FileSource", e);
      }
  }

  @Test
  public void test1()  throws Throwable  {
      FileSource fileSource0 = new FileSource((RandomAccessFile) null, (-1508), (FileManager) null);
      // Undeclared exception!
      try { 
        fileSource0.getBytes((long) (-1508), (-1508));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.nio.ByteBuffer", e);
      }
  }

  @Test
  public void test2()  throws Throwable  {
      FileSource fileSource0 = new FileSource((RandomAccessFile) null, 2027, (FileManager) null);
      // Undeclared exception!
      try { 
        fileSource0.getBytes((long) 2027);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.FileSource", e);
      }
  }

  @Test
  public void test3()  throws Throwable  {
      FileSource fileSource0 = new FileSource((RandomAccessFile) null, (-2572), (FileManager) null);
      // Undeclared exception!
      try { 
        fileSource0.getBytes((long) (-2572));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.nio.ByteBuffer", e);
      }
  }

  @Test
  public void test4()  throws Throwable  {
      FileSource fileSource0 = new FileSource((RandomAccessFile) null, (-1508), (FileManager) null);
      fileSource0.release();
  }
}
