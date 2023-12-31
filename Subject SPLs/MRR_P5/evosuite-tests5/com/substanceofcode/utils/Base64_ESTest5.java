/*
 * This file was automatically generated by EvoSuite
 * Sun Aug 12 18:38:28 KST 2018
 */

package com.substanceofcode.utils;

import static org.junit.Assert.assertArrayEquals;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import static org.evosuite.runtime.EvoAssertions.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class Base64_ESTest5 extends Base64_ESTest_scaffolding5 {
@BeforeClass
public static void initEvoSuiteFramework() {
String a = "aa";
}
@AfterClass
public static void exitEvoSuiteFramework() {
String a = "aa";
}





  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Base64 base64_0 = new Base64();
      byte[] byteArray0 = base64_0.decode("AA==");
      assertArrayEquals(new byte[] {(byte)0}, byteArray0);
  }




  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Base64 base64_0 = new Base64();
      byte[] byteArray0 = new byte[1];
      String string0 = base64_0.encode(byteArray0);
      assertEquals("AA==", string0);
  }


  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Base64 base64_0 = new Base64();
      byte[] byteArray0 = new byte[5];
      String string0 = base64_0.encode(byteArray0);
      assertEquals("AAAAAAA=", string0);
  }

}
