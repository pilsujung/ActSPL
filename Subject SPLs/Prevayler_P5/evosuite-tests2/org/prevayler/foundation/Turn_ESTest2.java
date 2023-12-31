/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 07 20:19:32 KST 2017
 */

package org.prevayler.foundation;

import static org.junit.Assert.assertFalse;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class Turn_ESTest2 extends Turn_ESTest_scaffolding2 {

  @Test
  public void test0()  throws Throwable  {
      Turn turn0 = Turn.first();
      turn0.end();
      turn0.alwaysSkip();
      Turn turn1 = turn0.next();
      Turn.first();
      turn0.start();
      turn0.alwaysSkip();
      turn1.next();
      turn1.alwaysSkip();
      turn0.end();
      turn1.next();
      Turn.first();
  }

  @Test
  public void test1()  throws Throwable  {
      Turn turn0 = Turn.first();
      turn0.end();
      Turn turn1 = turn0.next();
      Turn.first();
      turn0.end();
      turn0.alwaysSkip();
      turn1.end();
      Turn.first();
      turn1.alwaysSkip();
      turn1.start();
      turn0.start();
      assertFalse(turn0.equals((Object)turn1));
  }

  @Test
  public void test2()  throws Throwable  {
      Turn turn0 = Turn.first();
      Turn turn1 = turn0.next();
      turn0.start();
      turn0.alwaysSkip();
      turn0.alwaysSkip();
      turn0.start();
      assertFalse(turn0.equals((Object)turn1));
  }
}
