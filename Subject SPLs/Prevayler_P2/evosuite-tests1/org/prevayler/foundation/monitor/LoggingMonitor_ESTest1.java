/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 07 23:34:10 KST 2017
 */

package org.prevayler.foundation.monitor;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.File;
import java.io.PrintStream;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class LoggingMonitor_ESTest1 extends LoggingMonitor_ESTest_scaffolding1 {

  @Test
  public void test00()  throws Throwable  {
      SimpleMonitor simpleMonitor0 = new SimpleMonitor();
      Class<Integer> class0 = Integer.class;
      boolean boolean0 = simpleMonitor0.isInfoEnabled(class0);
      assertTrue(boolean0);
  }

  @Test
  public void test02()  throws Throwable  {
      Log4jMonitor log4jMonitor0 = new Log4jMonitor();
      Class<Integer> class0 = Integer.class;
      log4jMonitor0.info(class0, "ALL");
  }

  @Test
  public void test03()  throws Throwable  {
      SimpleMonitor simpleMonitor0 = new SimpleMonitor();
      Class<Object> class0 = Object.class;
      Exception exception0 = new Exception((Throwable) null);
      simpleMonitor0.error(class0, (String) null, exception0);
      assertNull(exception0.getMessage());
  }

  @Test
  public void test04()  throws Throwable  {
      Log4jMonitor log4jMonitor0 = new Log4jMonitor();
      Class<Object> class0 = Object.class;
      Exception exception0 = new Exception();
      log4jMonitor0.notify(class0, "WR &", exception0);
      assertEquals("java.lang.Exception", exception0.toString());
  }

  @Test
  public void test05()  throws Throwable  {
      SimpleMonitor simpleMonitor0 = new SimpleMonitor();
      Class<Integer> class0 = Integer.class;
      Exception exception0 = new Exception("J#U!gE|q+=#");
      simpleMonitor0.notify(class0, "J#U!gE|q+=#", (File) null, exception0);
      assertEquals("J#U!gE|q+=#", exception0.getMessage());
  }

  @Test
  public void test06()  throws Throwable  {
      Log4jMonitor log4jMonitor0 = new Log4jMonitor();
      Class<String> class0 = String.class;
      log4jMonitor0.notify(class0, "WR &", (File) null);
  }

  @Test
  public void test07()  throws Throwable  {
      SimpleMonitor simpleMonitor0 = new SimpleMonitor((PrintStream) null);
      Class<String> class0 = String.class;
      // Undeclared exception!
      try { 
        simpleMonitor0.notify(class0, "yI[IwsP");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.prevayler.foundation.monitor.SimpleMonitor", e);
      }
  }

  @Test
  public void test08()  throws Throwable  {
      Log4jMonitor log4jMonitor0 = new Log4jMonitor();
      Class<Object> class0 = Object.class;
      log4jMonitor0.notify(class0, "WR &");
  }

  @Test
  public void test09()  throws Throwable  {
      SimpleMonitor simpleMonitor0 = new SimpleMonitor();
      Class<String> class0 = String.class;
      // Undeclared exception!
      try { 
        simpleMonitor0.notify(class0, "INFO", (File) null, (Exception) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.prevayler.foundation.monitor.SimpleMonitor", e);
      }
  }

  @Test
  public void test10()  throws Throwable  {
      SimpleMonitor simpleMonitor0 = new SimpleMonitor((PrintStream) null);
      Class<String> class0 = String.class;
      Exception exception0 = new Exception();
      // Undeclared exception!
      try { 
        simpleMonitor0.notify(class0, "", exception0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.prevayler.foundation.monitor.SimpleMonitor", e);
      }
  }

  @Test
  public void test11()  throws Throwable  {
      SimpleMonitor simpleMonitor0 = new SimpleMonitor((PrintStream) null);
      Class<String> class0 = String.class;
      // Undeclared exception!
      try { 
        simpleMonitor0.notify(class0, "r", (File) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.prevayler.foundation.monitor.SimpleMonitor", e);
      }
  }
}
