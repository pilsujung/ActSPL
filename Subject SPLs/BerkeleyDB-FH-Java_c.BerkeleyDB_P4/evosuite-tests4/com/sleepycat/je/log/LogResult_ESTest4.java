/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 15:11:19 KST 2017
 */

package com.sleepycat.je.log;

import org.junit.Test;
import static org.junit.Assert.*;
import com.sleepycat.je.log.LogResult;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class LogResult_ESTest4 extends LogResult_ESTest_scaffolding4 {


  @Test
  public void test1()  throws Throwable  {
      LogResult logResult0 = new LogResult(1L, true, true);
  }

  @Test
  public void test2()  throws Throwable  {
      LogResult logResult0 = new LogResult(0L, false, false);
      logResult0.hook510(false);
  }
}