/*
 * This file was automatically generated by EvoSuite
 * Sun Aug 12 16:07:12 KST 2018
 */

package com.substanceofcode.utils;

import static org.junit.Assert.assertEquals;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class CauseRuntimeException_ESTest1 extends CauseRuntimeException_ESTest_scaffolding1 {
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
      CauseRuntimeException causeRuntimeException0 = new CauseRuntimeException();
      causeRuntimeException0.initCause(causeRuntimeException0);
      Throwable throwable0 = causeRuntimeException0.getCause();
      assertEquals("com.substanceofcode.utils.CauseRuntimeException", throwable0.toString());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      CauseRuntimeException causeRuntimeException0 = new CauseRuntimeException();
      Throwable throwable0 = causeRuntimeException0.getCause();
      assertNull(throwable0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      CauseRuntimeException causeRuntimeException0 = new CauseRuntimeException();
      CauseRuntimeException causeRuntimeException1 = new CauseRuntimeException("", causeRuntimeException0);
      Throwable throwable0 = causeRuntimeException1.getFirstCause();
      assertNotNull(throwable0);
      assertEquals("com.substanceofcode.utils.CauseRuntimeException", throwable0.toString());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      CauseRuntimeException causeRuntimeException0 = new CauseRuntimeException();
      Throwable throwable0 = new Throwable("", causeRuntimeException0);
      causeRuntimeException0.initCause(throwable0);
      Throwable throwable1 = causeRuntimeException0.getFirstCause();
      assertSame(throwable1, throwable0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      CauseException causeException0 = new CauseException();
      causeException0.initCause(causeException0);
      CauseRuntimeException causeRuntimeException0 = new CauseRuntimeException("", causeException0);
      Throwable throwable0 = causeRuntimeException0.getFirstCause();
      assertNull(throwable0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      CauseException causeException0 = new CauseException();
      CauseRuntimeException causeRuntimeException0 = new CauseRuntimeException("", causeException0);
      Throwable throwable0 = causeRuntimeException0.getFirstCause();
      assertEquals("com.substanceofcode.utils.CauseException", throwable0.toString());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      CauseRuntimeException causeRuntimeException0 = new CauseRuntimeException();
      causeRuntimeException0.initCause(causeRuntimeException0);
      Throwable throwable0 = causeRuntimeException0.getFirstCause();
      assertNull(throwable0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      CauseException causeException0 = new CauseException();
      CauseRuntimeException causeRuntimeException0 = new CauseRuntimeException();
      CauseRuntimeException causeRuntimeException1 = new CauseRuntimeException("", causeException0);
      Throwable throwable0 = causeRuntimeException1.initCause(causeRuntimeException0);
      assertSame(causeRuntimeException0, throwable0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      CauseRuntimeException causeRuntimeException0 = new CauseRuntimeException("");
      Throwable throwable0 = causeRuntimeException0.initCause((Throwable) null);
      assertNull(throwable0);
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      CauseRuntimeException causeRuntimeException0 = new CauseRuntimeException();
      Throwable throwable0 = causeRuntimeException0.getFirstCause();
      assertNull(throwable0);
  }
}
