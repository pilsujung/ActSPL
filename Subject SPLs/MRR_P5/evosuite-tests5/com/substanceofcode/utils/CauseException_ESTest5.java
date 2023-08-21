/*
 * This file was automatically generated by EvoSuite
 * Sun Aug 12 18:39:22 KST 2018
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
public class CauseException_ESTest5 extends CauseException_ESTest_scaffolding5 {
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
      CauseException causeException0 = new CauseException("");
      Throwable throwable0 = causeException0.initCause((Throwable) null);
      assertNull(throwable0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      CauseException causeException0 = new CauseException();
      causeException0.initCause(causeException0);
      Throwable throwable0 = causeException0.getCause();
      assertSame(throwable0, causeException0);
  }


  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      CauseRuntimeException causeRuntimeException0 = new CauseRuntimeException();
      CauseException causeException0 = new CauseException("", causeRuntimeException0);
      causeRuntimeException0.initCause(causeRuntimeException0);
      Throwable throwable0 = causeException0.getFirstCause();
      assertNull(throwable0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      CauseRuntimeException causeRuntimeException0 = new CauseRuntimeException();
      Throwable throwable0 = new Throwable("", causeRuntimeException0);
      CauseException causeException0 = new CauseException("", throwable0);
      Throwable throwable1 = causeException0.getFirstCause();
      assertEquals("java.lang.Throwable: ", throwable1.toString());
  }




}
