/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 21 18:43:42 KST 2017
 */

package com.sleepycat.je;

import static org.junit.Assert.assertEquals;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class JEVersion_ESTest1 extends JEVersion_ESTest_scaffolding1 {

  @Test
  public void test0()  throws Throwable  {
      JEVersion jEVersion0 = JEVersion.CURRENT_VERSION;
      String string0 = jEVersion0.getVersionString();
      assertEquals("2.1.30", string0);
  }

  @Test
  public void test1()  throws Throwable  {
      JEVersion jEVersion0 = JEVersion.CURRENT_VERSION;
      int int0 = jEVersion0.getMajor();
      assertEquals(2, int0);
  }

  @Test
  public void test2()  throws Throwable  {
      JEVersion jEVersion0 = JEVersion.CURRENT_VERSION;
      String string0 = jEVersion0.getNumericVersionString();
      assertEquals("2.1.30", string0);
  }

  @Test
  public void test3()  throws Throwable  {
      JEVersion jEVersion0 = JEVersion.CURRENT_VERSION;
      int int0 = jEVersion0.getMinor();
      assertEquals(1, int0);
  }

  @Test
  public void test4()  throws Throwable  {
      JEVersion jEVersion0 = JEVersion.CURRENT_VERSION;
      int int0 = jEVersion0.getPatch();
      assertEquals(30, int0);
  }

  @Test
  public void test5()  throws Throwable  {
      JEVersion jEVersion0 = JEVersion.CURRENT_VERSION;
      String string0 = jEVersion0.toString();
      assertEquals("2.1.30", string0);
  }
}
