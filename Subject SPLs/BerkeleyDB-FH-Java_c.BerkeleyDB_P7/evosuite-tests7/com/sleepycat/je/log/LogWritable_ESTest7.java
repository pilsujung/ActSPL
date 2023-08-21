/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 21 20:42:15 KST 2017
 */

package com.sleepycat.je.log;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.nio.ByteBuffer;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class LogWritable_ESTest7 extends LogWritable_ESTest_scaffolding7 {

  @Test
  public void test0()  throws Throwable  {
      FileHeader fileHeader0 = new FileHeader();
      int int0 = fileHeader0.getLogSize();
      assertEquals(24, int0);
  }

  @Test
  public void test1()  throws Throwable  {
      FileHeader fileHeader0 = new FileHeader((-477L), (-477L));
      // Undeclared exception!
      try { 
        fileHeader0.writeToLog((ByteBuffer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.LogUtils", e);
      }
  }
}