/*
 * This file was automatically generated by EvoSuite
 * Mon Aug 13 23:17:51 KST 2018
 */

package lancs.mobilemedia.lib.exceptions;

import static org.junit.Assert.assertNull;
import org.junit.AfterClass;
import org.junit.BeforeClass;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class InvalidArrayFormatException_ESTest1 extends InvalidArrayFormatException_ESTest_scaffolding1 {
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
      InvalidArrayFormatException invalidArrayFormatException0 = new InvalidArrayFormatException((Throwable) null);
      assertNull(invalidArrayFormatException0.getMessage());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      InvalidArrayFormatException invalidArrayFormatException0 = new InvalidArrayFormatException((String) null);
      assertNull(invalidArrayFormatException0.getMessage());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      InvalidArrayFormatException invalidArrayFormatException0 = new InvalidArrayFormatException();
      assertNull(invalidArrayFormatException0.getMessage());
  }
}
