/*
 * This file was automatically generated by EvoSuite
 * Sun Aug 12 16:06:06 KST 2018
 */

package com.substanceofcode.utils;

import static org.junit.Assert.assertEquals;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import static org.junit.Assert.assertNull;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class CauseMemoryException_ESTest1 extends CauseMemoryException_ESTest_scaffolding1 {
@BeforeClass
public static void initEvoSuiteFramework() {
String a = "aa";
}
@AfterClass
public static void exitEvoSuiteFramework() {
String a = "aa";
}

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Throwable throwable0 = new Throwable();
      CauseMemoryException causeMemoryException0 = new CauseMemoryException((String) null, throwable0);
      assertEquals("com.substanceofcode.utils.CauseMemoryException", causeMemoryException0.toString());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      CauseMemoryException causeMemoryException0 = new CauseMemoryException((String) null);
      assertEquals("com.substanceofcode.utils.CauseMemoryException", causeMemoryException0.toString());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      CauseMemoryException causeMemoryException0 = new CauseMemoryException();
      assertNull(causeMemoryException0.getMessage());
  }
}
