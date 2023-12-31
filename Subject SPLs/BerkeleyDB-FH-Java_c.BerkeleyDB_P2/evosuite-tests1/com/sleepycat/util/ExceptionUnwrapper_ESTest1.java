/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 21 21:38:51 KST 2017
 */

package com.sleepycat.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.sleepycat.util.ExceptionUnwrapper;
import com.sleepycat.util.IOExceptionWrapper;
import com.sleepycat.util.RuntimeExceptionWrapper;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class ExceptionUnwrapper_ESTest1 extends ExceptionUnwrapper_ESTest_scaffolding1 {

  @Test
  public void test0()  throws Throwable  {
      Throwable throwable0 = ExceptionUnwrapper.unwrapAny((Throwable) null);
      assertNull(throwable0);
  }

  @Test
  public void test1()  throws Throwable  {
      Exception exception0 = new Exception();
      RuntimeExceptionWrapper runtimeExceptionWrapper0 = new RuntimeExceptionWrapper((Throwable) exception0);
      Exception exception1 = (Exception)ExceptionUnwrapper.unwrapAny(runtimeExceptionWrapper0);
      assertNull(exception1.getMessage());
  }

  @Test
  public void test2()  throws Throwable  {
      // Undeclared exception!
      try { 
        ExceptionUnwrapper.unwrap((Exception) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Not Exception or Error: null
         //
         assertThrownBy("com.sleepycat.util.ExceptionUnwrapper", e);
      }
  }

  @Test
  public void test3()  throws Throwable  {
      Exception exception0 = new Exception();
      RuntimeExceptionWrapper runtimeExceptionWrapper0 = new RuntimeExceptionWrapper((Throwable) exception0);
      IOExceptionWrapper iOExceptionWrapper0 = new IOExceptionWrapper((Throwable) runtimeExceptionWrapper0);
      Exception exception1 = ExceptionUnwrapper.unwrap(iOExceptionWrapper0);
      assertSame(exception1, exception0);
  }

  @Test
  public void test5()  throws Throwable  {
      ExceptionUnwrapper exceptionUnwrapper0 = new ExceptionUnwrapper();
  }
}
