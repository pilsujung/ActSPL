/*
 * This file was automatically generated by EvoSuite
 * Mon Aug 13 15:18:43 GMT+00:00 2018
 */

package lancs.mobilemedia.core.ui.screens;

import static org.evosuite.runtime.EvoAssertions.verifyException;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.fail;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class PasswordScreen_ESTest2 extends PasswordScreen_ESTest_scaffolding2 {
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
      PasswordScreen passwordScreen0 = new PasswordScreen((String) null, 0);
      passwordScreen0.labelPassword = null;
      // Undeclared exception!
      try { 
        passwordScreen0.setPassword((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("lancs.mobilemedia.core.ui.screens.PasswordScreen", e);
      }
  }





  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      PasswordScreen passwordScreen0 = new PasswordScreen((String) null, 0);
      passwordScreen0.setPassword((String) null);
  }

}