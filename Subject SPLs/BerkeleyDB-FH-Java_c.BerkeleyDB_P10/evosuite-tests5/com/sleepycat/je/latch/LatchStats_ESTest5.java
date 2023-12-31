/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 03:20:28 KST 2017
 */

package com.sleepycat.je.latch;

import org.junit.Test;
import static org.junit.Assert.*;
import com.sleepycat.je.latch.LatchStats;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class LatchStats_ESTest5 extends LatchStats_ESTest_scaffolding5 {

  @Test
  public void test0()  throws Throwable  {
      LatchStats latchStats0 = new LatchStats();
      latchStats0.nReleases = (-4188);
      String string0 = latchStats0.toString();
      assertEquals("nAcquiresNoWaiters=0\nnAcquiresSelfOwned=0\nnAcquiresUpgrade=0\nnAcquiresWithContention=0\nnAcquiresNoWaitSuccessful=0\nnAcquiresNoWaitUnSuccessful=0\nnAcquiresSharedSuccessful=0\n", string0);
  }

  @Test
  public void test1()  throws Throwable  {
      LatchStats latchStats0 = new LatchStats();
      assertEquals(0, latchStats0.nAcquireNoWaitSuccessful);
      
      latchStats0.nAcquireNoWaitSuccessful = (-4867);
      String string0 = latchStats0.toString();
      assertEquals("nAcquiresNoWaiters=0\nnAcquiresSelfOwned=0\nnAcquiresUpgrade=0\nnAcquiresWithContention=0\nnAcquiresNoWaitSuccessful=-4867\nnAcquiresNoWaitUnSuccessful=0\nnAcquiresSharedSuccessful=0\n", string0);
  }

  @Test
  public void test2()  throws Throwable  {
      LatchStats latchStats0 = new LatchStats();
      assertEquals(0, latchStats0.nAcquireNoWaitUnsuccessful);
      
      latchStats0.nAcquireNoWaitUnsuccessful = 2559;
      String string0 = latchStats0.toString();
      assertEquals("nAcquiresNoWaiters=0\nnAcquiresSelfOwned=0\nnAcquiresUpgrade=0\nnAcquiresWithContention=0\nnAcquiresNoWaitSuccessful=0\nnAcquiresNoWaitUnSuccessful=2559\nnAcquiresSharedSuccessful=0\n", string0);
  }

  @Test
  public void test3()  throws Throwable  {
      LatchStats latchStats0 = new LatchStats();
      assertEquals(0, latchStats0.nAcquireSharedSuccessful);
      
      latchStats0.nAcquireSharedSuccessful = 444;
      String string0 = latchStats0.toString();
      assertEquals("nAcquiresNoWaiters=0\nnAcquiresSelfOwned=0\nnAcquiresUpgrade=0\nnAcquiresWithContention=0\nnAcquiresNoWaitSuccessful=0\nnAcquiresNoWaitUnSuccessful=0\nnAcquiresSharedSuccessful=444\n", string0);
  }

  @Test
  public void test4()  throws Throwable  {
      LatchStats latchStats0 = new LatchStats();
      latchStats0.nAcquiresUpgrade = 231;
      String string0 = latchStats0.toString();
      assertEquals(0, latchStats0.nReleases);
      assertEquals("nAcquiresNoWaiters=0\nnAcquiresSelfOwned=0\nnAcquiresUpgrade=231\nnAcquiresWithContention=0\nnAcquiresNoWaitSuccessful=0\nnAcquiresNoWaitUnSuccessful=0\nnAcquiresSharedSuccessful=0\n", string0);
  }

  @Test
  public void test5()  throws Throwable  {
      LatchStats latchStats0 = new LatchStats();
      assertEquals(0, latchStats0.nAcquiresSelfOwned);
      
      latchStats0.nAcquiresSelfOwned = (-2047);
      String string0 = latchStats0.toString();
      assertEquals("nAcquiresNoWaiters=0\nnAcquiresSelfOwned=-2047\nnAcquiresUpgrade=0\nnAcquiresWithContention=0\nnAcquiresNoWaitSuccessful=0\nnAcquiresNoWaitUnSuccessful=0\nnAcquiresSharedSuccessful=0\n", string0);
  }

  @Test
  public void test6()  throws Throwable  {
      LatchStats latchStats0 = new LatchStats();
      assertEquals(0, latchStats0.nAcquiresNoWaiters);
      
      latchStats0.nAcquiresNoWaiters = 623;
      String string0 = latchStats0.toString();
      assertEquals("nAcquiresNoWaiters=623\nnAcquiresSelfOwned=0\nnAcquiresUpgrade=0\nnAcquiresWithContention=0\nnAcquiresNoWaitSuccessful=0\nnAcquiresNoWaitUnSuccessful=0\nnAcquiresSharedSuccessful=0\n", string0);
  }

  @Test
  public void test7()  throws Throwable  {
      LatchStats latchStats0 = new LatchStats();
      LatchStats latchStats1 = (LatchStats)latchStats0.clone();
      assertEquals(0, latchStats1.nAcquireNoWaitUnsuccessful);
      assertEquals(0, latchStats1.nAcquiresSelfOwned);
      assertEquals(0, latchStats1.nReleases);
      assertEquals(0, latchStats1.nAcquireSharedSuccessful);
      assertEquals(0, latchStats1.nAcquiresWithContention);
      assertEquals(0, latchStats1.nAcquiresNoWaiters);
      assertEquals(0, latchStats1.nAcquiresUpgrade);
      assertEquals(0, latchStats1.nAcquireNoWaitSuccessful);
  }
}
