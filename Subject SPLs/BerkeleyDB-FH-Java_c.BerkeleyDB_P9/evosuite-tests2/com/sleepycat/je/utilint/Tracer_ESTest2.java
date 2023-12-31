/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 02:53:06 KST 2017
 */

package com.sleepycat.je.utilint;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.File;
import java.io.StringWriter;
import java.nio.BufferOverflowException;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Properties;
import java.util.logging.Level;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.sleepycat.je.EnvironmentConfig;
import com.sleepycat.je.RunRecoveryException;
import com.sleepycat.je.config.ConfigParam;
import com.sleepycat.je.dbi.EnvironmentImpl;

import sun.nio.cs.ext.MS949;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class Tracer_ESTest2 extends Tracer_ESTest_scaffolding2 {

  @Test
  public void test00()  throws Throwable  {
      Tracer tracer0 = new Tracer("-z");
      String string0 = tracer0.getMessage();
      assertEquals("-z", string0);
  }

  @Test
  public void test01()  throws Throwable  {
      File file0 = null;
      Properties properties0 = null;
      EnvironmentConfig environmentConfig0 = null;
      try {
        environmentConfig0 = new EnvironmentConfig(properties0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.EnvironmentMutableConfig", e);
      }
  }

  @Test
  public void test03()  throws Throwable  {
      RunRecoveryException runRecoveryException0 = new RunRecoveryException((EnvironmentImpl) null, "-z");
      String string0 = Tracer.getStackTrace(runRecoveryException0);
      //  // Unstable assertion: assertEquals("com.sleepycat.je.RunRecoveryException: -z\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:422)\r\n\tat org.evosuite.testcase.statements.ConstructorStatement$1.execute(ConstructorStatement.java:241)\r\n\tat org.evosuite.testcase.statements.AbstractStatement.exceptionHandler(AbstractStatement.java:169)\r\n\tat org.evosuite.testcase.statements.ConstructorStatement.execute(ConstructorStatement.java:196)\r\n\tat org.evosuite.testcase.execution.TestRunnable.executeStatements(TestRunnable.java:306)\r\n\tat org.evosuite.testcase.execution.TestRunnable.call(TestRunnable.java:212)\r\n\tat org.evosuite.testcase.execution.TestRunnable.call(TestRunnable.java:55)\r\n\tat java.util.concurrent.FutureTask.run(FutureTask.java:266)\r\n\tat java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1142)\r\n\tat java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:617)\r\n\tat java.lang.Thread.run(Thread.java:745)\r\n", string0);
  }

  @Test
  public void test10()  throws Throwable  {
      Tracer tracer0 = new Tracer("~RVo");
      Tracer tracer1 = new Tracer();
      boolean boolean0 = tracer0.equals(tracer1);
      assertEquals("~RVo", tracer0.getMessage());
      assertFalse(boolean0);
  }

  @Test
  public void test11()  throws Throwable  {
      Tracer tracer0 = new Tracer();
      boolean boolean0 = tracer0.equals(tracer0);
      assertTrue(boolean0);
  }

  @Test
  public void test12()  throws Throwable  {
      Tracer tracer0 = new Tracer("-z");
      Integer integer0 = new Integer(2413);
      boolean boolean0 = tracer0.equals(integer0);
      assertFalse(boolean0);
      assertEquals("-z", tracer0.getMessage());
  }

  @Test
  public void test16()  throws Throwable  {
      Tracer tracer0 = new Tracer();
      String string0 = tracer0.getMessage();
      assertNull(string0);
  }

  @Test
  public void test18()  throws Throwable  {
      // Undeclared exception!
      try { 
        Tracer.trace((Level) null, (EnvironmentImpl) null, "&gt;");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.utilint.Tracer", e);
      }
  }

  @Test
  public void test19()  throws Throwable  {
      Tracer tracer0 = new Tracer("~RVo");
      tracer0.hashCode();
      assertEquals("~RVo", tracer0.getMessage());
  }

  
}
