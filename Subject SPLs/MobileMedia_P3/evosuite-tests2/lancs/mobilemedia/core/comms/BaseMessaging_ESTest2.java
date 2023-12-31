/*
 * This file was automatically generated by EvoSuite
 * Mon Aug 13 23:58:37 KST 2018
 */

package lancs.mobilemedia.core.comms;

import static org.evosuite.runtime.EvoAssertions.verifyException;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.fail;

import javax.wireless.messaging.MessageConnection;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import lancs.mobilemedia.sms.SmsMessaging;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class BaseMessaging_ESTest2 extends BaseMessaging_ESTest_scaffolding2 {
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
      SmsMessaging smsMessaging0 = new SmsMessaging();
      smsMessaging0.cleanUpConnections((MessageConnection) null);
      assertEquals("1000", smsMessaging0.getSmsSendPort());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      SmsMessaging smsMessaging0 = new SmsMessaging();
      byte[] byteArray0 = new byte[1];
      boolean boolean0 = smsMessaging0.sendImage(byteArray0);
      assertFalse(boolean0);
  }

}
