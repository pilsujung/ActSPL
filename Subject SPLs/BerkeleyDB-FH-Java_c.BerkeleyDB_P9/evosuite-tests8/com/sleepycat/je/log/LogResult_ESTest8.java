/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 09:26:18 KST 2017
 */

package com.sleepycat.je.log;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class LogResult_ESTest8 extends LogResult_ESTest_scaffolding8 {

  @Test
  public void test0()  throws Throwable  {
      LogResult logResult0 = new LogResult(0L, true, false);
  }

  @Test
  public void test1()  throws Throwable  {
      LogResult logResult0 = new LogResult(1468L, true, true);
      logResult0.hook510(true);
  }
}