/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 01:02:07 KST 2017
 */

package com.sleepycat.je.log;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.sleepycat.je.log.FileHeader;
import java.nio.ByteBuffer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class LogReadable_ESTest2 extends LogReadable_ESTest_scaffolding2 {

  @Test
  public void test0()  throws Throwable  {
      FileHeader fileHeader0 = new FileHeader(0L, 0L);
      boolean boolean0 = fileHeader0.logEntryIsTransactional();
      assertFalse(boolean0);
  }

  @Test
  public void test1()  throws Throwable  {
      FileHeader fileHeader0 = new FileHeader();
      long long0 = fileHeader0.getTransactionId();
      assertEquals(0L, long0);
  }

  @Test
  public void test2()  throws Throwable  {
      FileHeader fileHeader0 = new FileHeader();
      // Undeclared exception!
      try { 
        fileHeader0.readFromLog((ByteBuffer) null, (byte) (-12));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.LogUtils", e);
      }
  }

  @Test
  public void test3()  throws Throwable  {
      FileHeader fileHeader0 = new FileHeader();
      // Undeclared exception!
      try { 
        fileHeader0.dumpLog((StringBuffer) null, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.FileHeader", e);
      }
  }
}
