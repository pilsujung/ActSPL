/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 16:14:15 KST 2017
 */

package com.sleepycat.je.tree;

import static org.junit.Assert.assertEquals;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class TrackingInfo_ESTest4 extends TrackingInfo_ESTest_scaffolding4 {

  @Test
  public void test0()  throws Throwable  {
      TrackingInfo trackingInfo0 = new TrackingInfo(476L, 1863L);
  }

  @Test
  public void test1()  throws Throwable  {
      TrackingInfo trackingInfo0 = new TrackingInfo((-1611L), (-1611L));
      String string0 = trackingInfo0.toString();
      assertEquals("lsn=0xffffffff/0xfffff9b5 node=-1611", string0);
  }
}
