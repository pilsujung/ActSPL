/*
 * This file was automatically generated by EvoSuite
 * Tue Aug 14 00:29:22 KST 2018
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
public class SmsSenderThread_ESTest2 extends SmsSenderThread_ESTest_scaffolding2 {
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
      SmsSenderThread smsSenderThread0 = new SmsSenderThread("d", (String) null, (String) null);
      String string0 = smsSenderThread0.getSmsPort();
      assertEquals("d", string0);
  }


  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      SmsSenderThread smsSenderThread0 = new SmsSenderThread("", (String) null, (String) null);
      smsSenderThread0.setMessageText("M");
      String string0 = smsSenderThread0.getMessageText();
      assertEquals("M", string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      SmsSenderThread smsSenderThread0 = new SmsSenderThread("", (String) null, (String) null);
      // Undeclared exception!
      try { 
        smsSenderThread0.setBinaryData((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("lancs.mobilemedia.sms.SmsSenderThread", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      SmsSenderThread smsSenderThread0 = new SmsSenderThread("", "", "");
      smsSenderThread0.run();
      assertEquals("", smsSenderThread0.getSmsPort());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      SmsSenderThread smsSenderThread0 = new SmsSenderThread("", "", "");
      String string0 = smsSenderThread0.getSmsPort();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      SmsSenderThread smsSenderThread0 = new SmsSenderThread("", "", "");
      byte[] byteArray0 = new byte[0];
      smsSenderThread0.setBinaryData(byteArray0);
      assertEquals("", smsSenderThread0.getSmsPort());
  }

}
