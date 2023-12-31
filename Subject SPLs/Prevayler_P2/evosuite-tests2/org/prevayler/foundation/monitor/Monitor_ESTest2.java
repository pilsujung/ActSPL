/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 07 20:20:53 KST 2017
 */

package org.prevayler.foundation.monitor;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.fail;

import java.io.File;
import java.io.PrintStream;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class Monitor_ESTest2 extends Monitor_ESTest_scaffolding2 {

  @Test
  public void test0()  throws Throwable  {
      Log4jMonitor log4jMonitor0 = new Log4jMonitor();
      Class<Object> class0 = Object.class;
      Exception exception0 = new Exception();
      log4jMonitor0.notify(class0, "1,fH<Hl_Hp5aa%o9Bn", (File) null, exception0);
      assertEquals("java.lang.Exception", exception0.toString());
  }

  @Test
  public void test1()  throws Throwable  {
      Log4jMonitor log4jMonitor0 = new Log4jMonitor();
      Exception exception0 = new Exception();
      Class<String> class0 = String.class;
      log4jMonitor0.notify(class0, "g:8c'f", exception0);
      assertNull(exception0.getMessage());
  }

  @Test
  public void test2()  throws Throwable  {
      SimpleMonitor simpleMonitor0 = new SimpleMonitor();
      Class<Object> class0 = Object.class;
      simpleMonitor0.notify(class0, "SL.dui.hE7", (File) null);
  }

  @Test
  public void test3()  throws Throwable  {
      SimpleMonitor simpleMonitor0 = new SimpleMonitor();
      Class<String> class0 = String.class;
      simpleMonitor0.notify(class0, (String) null);
  }

  @Test
  public void test4()  throws Throwable  {
      Class<Object> class0 = Object.class;
      Exception exception0 = new Exception("$2/q$");
      SimpleMonitor simpleMonitor0 = new SimpleMonitor((PrintStream) null);
      // Undeclared exception!
      try { 
        simpleMonitor0.notify(class0, "$2/q$", (File) null, exception0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.prevayler.foundation.monitor.SimpleMonitor", e);
      }
  }
}
