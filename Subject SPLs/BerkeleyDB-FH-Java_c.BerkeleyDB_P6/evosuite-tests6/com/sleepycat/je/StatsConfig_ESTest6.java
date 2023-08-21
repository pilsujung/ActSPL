/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 21 23:39:38 KST 2017
 */

package com.sleepycat.je;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class StatsConfig_ESTest6 extends StatsConfig_ESTest_scaffolding6 {

  @Test
  public void test0()  throws Throwable  {
      StatsConfig statsConfig0 = StatsConfig.DEFAULT;
      boolean boolean0 = statsConfig0.getFast();
      assertFalse(boolean0);
  }

  @Test
  public void test1()  throws Throwable  {
      StatsConfig statsConfig0 = new StatsConfig();
      assertFalse(statsConfig0.getClear());
      
      statsConfig0.setClear(true);
      boolean boolean0 = statsConfig0.getClear();
      assertTrue(boolean0);
  }

  @Test
  public void test2()  throws Throwable  {
      StatsConfig statsConfig0 = StatsConfig.DEFAULT;
      int int0 = statsConfig0.getShowProgressInterval();
      assertEquals(0, int0);
  }

  @Test
  public void test3()  throws Throwable  {
      StatsConfig statsConfig0 = new StatsConfig();
      statsConfig0.setShowProgressInterval(977);
      assertEquals(977, statsConfig0.getShowProgressInterval());
  }

  @Test
  public void test4()  throws Throwable  {
      StatsConfig statsConfig0 = new StatsConfig();
      boolean boolean0 = statsConfig0.getFast();
      assertEquals(0, statsConfig0.getShowProgressInterval());
      assertFalse(boolean0);
      assertFalse(statsConfig0.getClear());
  }

  @Test
  public void test5()  throws Throwable  {
      StatsConfig statsConfig0 = new StatsConfig();
      statsConfig0.setFast(false);
      assertFalse(statsConfig0.getFast());
      assertFalse(statsConfig0.getClear());
      assertEquals(0, statsConfig0.getShowProgressInterval());
  }

  @Test
  public void test6()  throws Throwable  {
      StatsConfig statsConfig0 = new StatsConfig();
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      PrintStream printStream0 = new PrintStream((OutputStream) byteArrayOutputStream0);
      statsConfig0.setShowProgressStream(printStream0);
      statsConfig0.getShowProgressStream();
      assertEquals(0, statsConfig0.getShowProgressInterval());
      assertFalse(statsConfig0.getClear());
      assertFalse(statsConfig0.getFast());
  }

  @Test
  public void test7()  throws Throwable  {
      StatsConfig statsConfig0 = new StatsConfig();
      boolean boolean0 = statsConfig0.getClear();
      assertFalse(boolean0);
      assertEquals(0, statsConfig0.getShowProgressInterval());
      assertFalse(statsConfig0.getFast());
  }

  @Test
  public void test8()  throws Throwable  {
      StatsConfig statsConfig0 = new StatsConfig();
      statsConfig0.getShowProgressStream();
      assertFalse(statsConfig0.getClear());
      assertEquals(0, statsConfig0.getShowProgressInterval());
      assertFalse(statsConfig0.getFast());
  }
}