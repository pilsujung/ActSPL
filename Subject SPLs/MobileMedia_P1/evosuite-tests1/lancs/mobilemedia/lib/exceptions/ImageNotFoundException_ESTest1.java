/*
 * This file was automatically generated by EvoSuite
 * Mon Aug 13 23:17:17 KST 2018
 */

package lancs.mobilemedia.lib.exceptions;

import static org.junit.Assert.assertEquals;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import static org.junit.Assert.assertNull;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class ImageNotFoundException_ESTest1 extends ImageNotFoundException_ESTest_scaffolding1 {
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
      ImageNotFoundException imageNotFoundException0 = new ImageNotFoundException("");
      assertEquals("", imageNotFoundException0.getMessage());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ImageNotFoundException imageNotFoundException0 = new ImageNotFoundException();
      Throwable throwable0 = imageNotFoundException0.getCause();
      assertNull(throwable0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ImageNotFoundException imageNotFoundException0 = new ImageNotFoundException();
      ImageNotFoundException imageNotFoundException1 = new ImageNotFoundException(imageNotFoundException0);
      Throwable throwable0 = imageNotFoundException1.getCause();
      assertEquals("lancs.mobilemedia.lib.exceptions.ImageNotFoundException", throwable0.toString());
  }
}
