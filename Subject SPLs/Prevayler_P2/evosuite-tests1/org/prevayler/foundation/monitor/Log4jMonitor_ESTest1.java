/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 07 23:33:28 KST 2017
 */

package org.prevayler.foundation.monitor;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class Log4jMonitor_ESTest1 extends Log4jMonitor_ESTest_scaffolding1 {

  @Test
  public void test0()  throws Throwable  {
      Log4jMonitor log4jMonitor0 = new Log4jMonitor();
      Class<Object> class0 = Object.class;
      log4jMonitor0.info(class0, "NMmFNu\"Y~?{hOW");
  }

  @Test
  public void test2()  throws Throwable  {
      Log4jMonitor log4jMonitor0 = new Log4jMonitor();
      Class<Object> class0 = Object.class;
      Exception exception0 = new Exception();
      log4jMonitor0.error(class0, "", exception0);
      assertNull(exception0.getMessage());
  }
}
