/*
 * This file was automatically generated by EvoSuite
 * Mon Aug 13 23:09:35 KST 2018
 */

package lancs.mobilemedia.core.ui.screens;

import static org.evosuite.runtime.EvoAssertions.verifyException;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class NewLabelScreen_ESTest1 extends NewLabelScreen_ESTest_scaffolding1 {
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
      NewLabelScreen newLabelScreen0 = new NewLabelScreen("", 0);
      assertEquals(0, newLabelScreen0.getFormType());
      
      newLabelScreen0.setFormType(1);
      assertEquals(1, newLabelScreen0.getFormType());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      NewLabelScreen newLabelScreen0 = new NewLabelScreen("", 1);
      int int0 = newLabelScreen0.getFormType();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      NewLabelScreen newLabelScreen0 = new NewLabelScreen("", (-1));
      int int0 = newLabelScreen0.getFormType();
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      NewLabelScreen newLabelScreen0 = new NewLabelScreen("", 0);
      newLabelScreen0.labelName = null;
      // Undeclared exception!
      try { 
        newLabelScreen0.getLabelName();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("lancs.mobilemedia.core.ui.screens.NewLabelScreen", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      NewLabelScreen newLabelScreen0 = new NewLabelScreen("", 0);
      int int0 = newLabelScreen0.getFormType();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      NewLabelScreen newLabelScreen0 = new NewLabelScreen("", 0);
      newLabelScreen0.setFormType(0);
      assertEquals(0, newLabelScreen0.getFormType());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      NewLabelScreen newLabelScreen0 = new NewLabelScreen("", 0);
      newLabelScreen0.getLabelName();
      assertEquals(0, newLabelScreen0.getFormType());
  }
}
