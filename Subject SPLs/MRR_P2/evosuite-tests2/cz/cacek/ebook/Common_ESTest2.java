/*
 * This file was automatically generated by EvoSuite
 * Sun Aug 12 18:16:49 KST 2018
 */

package cz.cacek.ebook;

import static org.junit.Assert.assertEquals;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import static org.evosuite.runtime.EvoAssertions.*;
import static org.junit.Assert.fail;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class Common_ESTest2 extends Common_ESTest_scaffolding2 {
@BeforeClass
public static void initEvoSuiteFramework() {
String a = "aa";
}
@AfterClass
public static void exitEvoSuiteFramework() {
String a = "aa";
}


  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      String string0 = Common.createIdFromName("G");
      assertEquals("g", string0);
  }




  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Throwable throwable0 = new Throwable("");
      Common.error(throwable0);
      assertEquals("java.lang.Throwable: ", throwable0.toString());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      String string0 = Common.createIdFromName("abcdefghijmnopbrstuvw");
      assertEquals("abcdefghijmnopbrstuv", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      String string0 = Common.createIdFromName("`");
      assertEquals("X", string0);
  }




  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Common common0 = new Common();
      Common.error(common0);
  }
}
