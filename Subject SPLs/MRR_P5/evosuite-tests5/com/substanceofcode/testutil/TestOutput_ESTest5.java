/*
 * This file was automatically generated by EvoSuite
 * Sun Aug 12 18:34:29 KST 2018
 */

package com.substanceofcode.testutil;

import static org.junit.Assert.fail;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import static org.evosuite.runtime.EvoAssertions.*;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class TestOutput_ESTest5 extends TestOutput_ESTest_scaffolding5 {
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
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(0);
      TestOutput testOutput0 = new TestOutput(byteArrayOutputStream0);
  }



}
