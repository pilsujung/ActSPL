/*
 * This file was automatically generated by EvoSuite
 * Mon Aug 13 23:21:29 KST 2018
 */

package lancs.mobilemedia.sms;

import static org.evosuite.runtime.EvoAssertions.verifyException;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import static org.evosuite.shaded.org.mockito.Mockito.mock;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import javax.wireless.messaging.MessageConnection;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class SmsMessaging_ESTest1 extends SmsMessaging_ESTest_scaffolding1 {
@BeforeClass
public static void initEvoSuiteFramework() {
String a = "aa";
}
@AfterClass
public static void exitEvoSuiteFramework() {
String a = "aa";
}

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SmsMessaging smsMessaging0 = new SmsMessaging();
      String string0 = smsMessaging0.getSmsSendPort();
      assertEquals("1000", string0);
      assertEquals("1000", smsMessaging0.getSmsReceivePort());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SmsMessaging smsMessaging0 = new SmsMessaging("", (String) null);
      String string0 = smsMessaging0.getSmsSendPort();
      assertNotNull(string0);
      assertEquals("1000", smsMessaging0.getSmsReceivePort());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SmsMessaging smsMessaging0 = new SmsMessaging();
      assertEquals("1000", smsMessaging0.getSmsReceivePort());
      
      smsMessaging0.setSmsReceivePort((String) null);
      smsMessaging0.getSmsReceivePort();
      assertEquals("1000", smsMessaging0.getSmsSendPort());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SmsMessaging smsMessaging0 = new SmsMessaging();
      assertEquals("1000", smsMessaging0.getSmsReceivePort());
      
      smsMessaging0.setSmsReceivePort("");
      smsMessaging0.getSmsReceivePort();
      assertEquals("1000", smsMessaging0.getSmsSendPort());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SmsMessaging smsMessaging0 = new SmsMessaging((String) null, (String) null);
      smsMessaging0.getDestinationPhoneNumber();
      assertEquals("1000", smsMessaging0.getSmsReceivePort());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SmsMessaging smsMessaging0 = new SmsMessaging("", "Q");
      String string0 = smsMessaging0.getDestinationPhoneNumber();
      assertEquals("", smsMessaging0.getSmsSendPort());
      assertEquals("1000", smsMessaging0.getSmsReceivePort());
      assertEquals("Q", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SmsMessaging smsMessaging0 = new SmsMessaging();
      smsMessaging0.cleanUpReceiverConnections();
      assertEquals("1000", smsMessaging0.getSmsReceivePort());
      assertEquals("1000", smsMessaging0.getSmsSendPort());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SmsMessaging smsMessaging0 = new SmsMessaging();
      MessageConnection messageConnection0 = mock(MessageConnection.class, new ViolatedAssumptionAnswer());
      smsMessaging0.cleanUpConnections(messageConnection0);
      assertEquals("1000", smsMessaging0.getSmsReceivePort());
      assertEquals("1000", smsMessaging0.getSmsSendPort());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SmsMessaging smsMessaging0 = new SmsMessaging();
      smsMessaging0.cleanUpConnections((MessageConnection) null);
      assertEquals("1000", smsMessaging0.getSmsReceivePort());
      assertEquals("1000", smsMessaging0.getSmsSendPort());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SmsMessaging smsMessaging0 = new SmsMessaging((String) null, (String) null);
      // Undeclared exception!
      try { 
        smsMessaging0.receiveImage();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("lancs.mobilemedia.sms.SmsMessaging", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SmsMessaging smsMessaging0 = new SmsMessaging();
      boolean boolean0 = smsMessaging0.sendImage((byte[]) null);
      assertEquals("1000", smsMessaging0.getSmsSendPort());
      assertEquals("1000", smsMessaging0.getSmsReceivePort());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SmsMessaging smsMessaging0 = new SmsMessaging((String) null, (String) null);
      byte[] byteArray0 = new byte[1];
      boolean boolean0 = smsMessaging0.sendImage(byteArray0);
      assertFalse(boolean0);
      assertEquals("1000", smsMessaging0.getSmsReceivePort());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SmsMessaging smsMessaging0 = new SmsMessaging("", "");
      String string0 = smsMessaging0.getSmsReceivePort();
      assertEquals("1000", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SmsMessaging smsMessaging0 = new SmsMessaging("", "");
      smsMessaging0.getDestinationPhoneNumber();
      assertEquals("1000", smsMessaging0.getSmsReceivePort());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      SmsMessaging smsMessaging0 = new SmsMessaging();
      assertEquals("1000", smsMessaging0.getSmsSendPort());
      
      smsMessaging0.setSmsSendPort("");
      boolean boolean0 = smsMessaging0.sendImage((byte[]) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      SmsMessaging smsMessaging0 = new SmsMessaging((String) null, (String) null);
      smsMessaging0.getSmsSendPort();
      assertEquals("1000", smsMessaging0.getSmsReceivePort());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      SmsMessaging smsMessaging0 = new SmsMessaging("", "");
      smsMessaging0.setDestinationPhoneNumber("");
      assertEquals("1000", smsMessaging0.getSmsReceivePort());
  }
}
