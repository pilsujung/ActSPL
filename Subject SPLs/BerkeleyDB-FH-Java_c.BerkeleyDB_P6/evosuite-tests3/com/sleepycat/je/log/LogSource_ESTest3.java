/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 09:27:02 KST 2017
 */

package com.sleepycat.je.log;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.fail;

import java.io.RandomAccessFile;
import java.nio.ByteBuffer;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.TooManyResourcesException;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class LogSource_ESTest3 extends LogSource_ESTest_scaffolding3 {

  @Test
  public void test0()  throws Throwable  {
      FileSource fileSource0 = new FileSource((RandomAccessFile) null, (-788), (FileManager) null);
      fileSource0.release();
  }

  @Test
  public void test1()  throws Throwable  {
      LogBuffer logBuffer0 = new LogBuffer((ByteBuffer) null, 5178L);
      // Undeclared exception!
      try { 
        logBuffer0.getBytes((-1875L), 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.LogBuffer", e);
      }
  }

  @Test
  public void test2()  throws Throwable  {
      FileSource fileSource0 = new FileSource((RandomAccessFile) null, 1565, (FileManager) null);
      // Undeclared exception!
      try { 
        fileSource0.getBytes(2302L, (-1306));
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
      LogBuffer logBuffer0 = new LogBuffer((ByteBuffer) null, 697L);
      logBuffer0.hook482(26);
      // Undeclared exception!
      try { 
        logBuffer0.getBytes((-1060L));
        fail("Expecting exception: TooManyResourcesException");
      
      } catch(TooManyResourcesException e) {
         //
         // Loop has been executed more times than the allowed 10000
         //
         assertThrownBy("org.evosuite.runtime.LoopCounter", e);
      }
  }

  @Test
  public void test4()  throws Throwable  {
      LogBuffer logBuffer0 = new LogBuffer((ByteBuffer) null, 5178L);
      // Undeclared exception!
      try { 
        logBuffer0.getBytes(5178L);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test5()  throws Throwable  {
      FileSource fileSource0 = new FileSource((RandomAccessFile) null, (-788), (FileManager) null);
      // Undeclared exception!
      try { 
        fileSource0.getBytes((long) (-788));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.nio.ByteBuffer", e);
      }
  }
}
