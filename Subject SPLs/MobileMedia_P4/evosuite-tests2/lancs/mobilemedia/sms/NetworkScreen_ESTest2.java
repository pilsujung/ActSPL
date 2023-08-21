/*
 * This file was automatically generated by EvoSuite
 * Mon Aug 13 15:26:40 GMT 2018
 */

package lancs.mobilemedia.sms;

import static org.evosuite.runtime.EvoAssertions.verifyException;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.fail;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class NetworkScreen_ESTest2 extends NetworkScreen_ESTest_scaffolding2 {
@BeforeClass
public static void initEvoSuiteFramework() {
String a = "aa";
}
@AfterClass
public static void exitEvoSuiteFramework() {
String a = "aa";
}



  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      NetworkScreen networkScreen0 = new NetworkScreen("");
      networkScreen0.recPhoneNum = null;
      // Undeclared exception!
      try { 
        networkScreen0.getRecPhoneNum();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("lancs.mobilemedia.sms.NetworkScreen", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      NetworkScreen networkScreen0 = new NetworkScreen("");
      networkScreen0.getRecPhoneNum();
      assertEquals("1000", networkScreen0.getRecPort());
  }

}
