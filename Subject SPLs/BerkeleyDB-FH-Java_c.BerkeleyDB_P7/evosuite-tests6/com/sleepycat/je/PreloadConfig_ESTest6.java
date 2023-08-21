/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 21 23:30:32 KST 2017
 */

package com.sleepycat.je;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class PreloadConfig_ESTest6 extends PreloadConfig_ESTest_scaffolding6 {

  @Test
  public void test0()  throws Throwable  {
      PreloadConfig preloadConfig0 = new PreloadConfig();
      preloadConfig0.setLoadLNs(false);
      assertFalse(preloadConfig0.getLoadLNs());
  }

  @Test
  public void test1()  throws Throwable  {
      PreloadConfig preloadConfig0 = PreloadConfig.DEFAULT;
      long long0 = preloadConfig0.getMaxBytes();
      assertEquals(0L, long0);
  }

  @Test
  public void test3()  throws Throwable  {
      PreloadConfig preloadConfig0 = new PreloadConfig();
      preloadConfig0.setMaxMillisecs(0L);
      assertFalse(preloadConfig0.getLoadLNs());
  }

  @Test
  public void test4()  throws Throwable  {
      PreloadConfig preloadConfig0 = new PreloadConfig();
      preloadConfig0.setMaxBytes(0L);
      assertEquals(0L, preloadConfig0.getMaxMillisecs());
  }

  @Test
  public void test5()  throws Throwable  {
      PreloadConfig preloadConfig0 = PreloadConfig.DEFAULT;
      boolean boolean0 = preloadConfig0.getLoadLNs();
      assertFalse(boolean0);
  }
}
