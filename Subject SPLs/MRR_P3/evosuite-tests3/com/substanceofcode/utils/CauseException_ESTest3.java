/*
 * This file was automatically generated by EvoSuite
 * Sun Aug 12 19:44:33 KST 2018
 */

package com.substanceofcode.utils;

import static org.junit.Assert.assertEquals;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import static org.evosuite.runtime.EvoAssertions.*;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class CauseException_ESTest3 extends CauseException_ESTest_scaffolding3 {
@BeforeClass
public static void initEvoSuiteFramework() {
String a = "aa";
}
@AfterClass
public static void exitEvoSuiteFramework() {
String a = "aa";
}


  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Throwable throwable0 = new Throwable("");
      CauseException causeException0 = new CauseException("", throwable0);
      Throwable throwable1 = causeException0.getCause();
      assertEquals("", throwable1.getMessage());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      CauseException causeException0 = new CauseException("");
      Throwable throwable0 = causeException0.getCause();
      assertNull(throwable0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      CauseRuntimeException causeRuntimeException0 = new CauseRuntimeException((String) null);
      CauseException causeException0 = new CauseException((String) null, causeRuntimeException0);
      Throwable throwable0 = causeException0.getFirstCause();
      assertEquals("com.substanceofcode.utils.CauseRuntimeException", throwable0.toString());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Throwable throwable0 = new Throwable("");
      CauseException causeException0 = new CauseException("", throwable0);
      Throwable throwable1 = causeException0.getFirstCause();
      assertSame(throwable0, throwable1);
  }


  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      CauseException causeException0 = new CauseException("");
      Throwable throwable0 = causeException0.initCause(causeException0);
      assertSame(throwable0, causeException0);
  }


  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      CauseException causeException0 = new CauseException();
      CauseRuntimeException causeRuntimeException0 = new CauseRuntimeException();
      Throwable throwable0 = causeException0.initCause(causeRuntimeException0);
      throwable0.initCause(causeException0);
      Throwable throwable1 = causeException0.getFirstCause();
      assertNull(throwable1);
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      CauseException causeException0 = new CauseException("");
      CauseException causeException1 = new CauseException("", causeException0);
      Throwable throwable0 = causeException1.getFirstCause();
      assertNotNull(throwable0);
      assertSame(throwable0, causeException0);
  }
}
