/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 15:12:22 KST 2017
 */

package com.sleepycat.je.log;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.sleepycat.je.log.FileManager;
import com.sleepycat.je.log.FileSource;
import com.sleepycat.je.log.LogBuffer;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.TooManyResourcesException;
import org.junit.runner.RunWith;
import sun.nio.cs.ext.MS949;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class LogSource_ESTest4 extends LogSource_ESTest_scaffolding4 {

  @Test
  public void test0()  throws Throwable  {
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode(")");
      LogBuffer logBuffer0 = new LogBuffer(byteBuffer0, 0L);
      ByteBuffer byteBuffer1 = logBuffer0.getBytes(0L);
      assertFalse(byteBuffer1.isReadOnly());
  }

  @Test
  public void test1()  throws Throwable  {
      FileSource fileSource0 = new FileSource((RandomAccessFile) null, 205, (FileManager) null);
      fileSource0.release();
  }

  @Test
  public void test2()  throws Throwable  {
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode(")");
      LogBuffer logBuffer0 = new LogBuffer(byteBuffer0, 0L);
      // Undeclared exception!
      try { 
        logBuffer0.getBytes((-1413L), 1613);
        fail("Expecting exception: TooManyResourcesException");
      
      } catch(TooManyResourcesException e) {
         //
         // Loop has been executed more times than the allowed 10000
         //
         assertThrownBy("org.evosuite.runtime.LoopCounter", e);
      }
  }

  @Test
  public void test3()  throws Throwable  {
      LogBuffer logBuffer0 = new LogBuffer((ByteBuffer) null, 821);
      // Undeclared exception!
      try { 
        logBuffer0.getBytes((long) 821, 9);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test5()  throws Throwable  {
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("");
      LogBuffer logBuffer0 = new LogBuffer(byteBuffer0, 9);
      // Undeclared exception!
      try { 
        logBuffer0.getBytes(2602L);
        fail("Expecting exception: TooManyResourcesException");
      
      } catch(TooManyResourcesException e) {
         //
         // Loop has been executed more times than the allowed 10000
         //
         assertThrownBy("org.evosuite.runtime.LoopCounter", e);
      }
  }

  @Test
  public void test6()  throws Throwable  {
      FileSource fileSource0 = new FileSource((RandomAccessFile) null, 205, (FileManager) null);
      // Undeclared exception!
      try { 
        fileSource0.getBytes((long) 205);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.FileSource", e);
      }
  }
}
