/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 07 23:28:56 KST 2017
 */

package org.prevayler.foundation;

import static org.junit.Assert.assertFalse;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class Turn_ESTest1 extends Turn_ESTest_scaffolding1 {

  @Test
  public void test0()  throws Throwable  {
      Turn turn0 = Turn.first();
      turn0.end();
      turn0.alwaysSkip();
      turn0.alwaysSkip();
      Turn.first();
      turn0.alwaysSkip();
      turn0.start();
      Turn turn1 = Turn.first();
      Turn.first();
      turn1.start();
      turn1.end();
      turn1.end();
      turn1.start();
      Turn.first();
      turn1.alwaysSkip();
      turn1.next();
      turn0.alwaysSkip();
  }

  @Test
  public void test1()  throws Throwable  {
      Turn turn0 = Turn.first();
      Turn turn1 = Turn.first();
      turn0.end();
      Turn.first();
      turn0.alwaysSkip();
      turn1.start();
      Turn turn2 = turn0.next();
      turn1.next();
      turn0.alwaysSkip();
      Turn turn3 = Turn.first();
      turn2.next();
      turn1.start();
      turn1.start();
      Turn turn4 = turn2.next();
      Turn.first();
      turn4.end();
      turn3.alwaysSkip();
      turn3.start();
      Turn.first();
  }

  @Test
  public void test2()  throws Throwable  {
      Turn turn0 = Turn.first();
      Turn turn1 = turn0.next();
      turn0.alwaysSkip();
      turn0.next();
      turn1.alwaysSkip();
      turn1.start();
      turn0.end();
      Turn turn2 = turn1.next();
      turn1.end();
      turn2.end();
      Turn.first();
  }

  @Test
  public void test3()  throws Throwable  {
      Turn turn0 = Turn.first();
      turn0.alwaysSkip();
      turn0.alwaysSkip();
      turn0.start();
      turn0.alwaysSkip();
      turn0.alwaysSkip();
      Turn turn1 = turn0.next();
      Turn turn2 = Turn.first();
      turn0.start();
      turn0.alwaysSkip();
      Turn.first();
      turn1.end();
      Turn turn3 = turn0.next();
      turn2.start();
      turn1.alwaysSkip();
      turn3.start();
      turn0.alwaysSkip();
      turn1.end();
      turn1.start();
      Turn.first();
      turn1.alwaysSkip();
      turn1.next();
      Turn.first();
      Turn turn4 = Turn.first();
      turn0.alwaysSkip();
      Turn turn5 = turn3.next();
      assertFalse(turn5.equals((Object)turn4));
  }
}
