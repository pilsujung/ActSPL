/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 12:16:32 KST 2017
 */

package com.sleepycat.je.util;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.fail;

import java.io.OutputStream;
import java.io.PipedOutputStream;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.sleepycat.je.Database;
import com.sleepycat.je.Environment;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class DbCacheSize_ESTest5 extends DbCacheSize_ESTest_scaffolding5 {

  @Test
  public void test00()  throws Throwable  {
      PrintStream printStream0 = null;
      try {
        printStream0 = new PrintStream("e3ETo~kCYU ;/2;:t", "K?6;`SyO");
        fail("Expecting exception: UnsupportedEncodingException");
      
      } catch(UnsupportedEncodingException e) {
         //
         // K?6;`SyO
         //
         assertThrownBy("java.io.PrintStream", e);
      }
  }

  
}
