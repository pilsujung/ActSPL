/*
 * This file was automatically generated by EvoSuite
 * Mon Aug 13 23:11:13 KST 2018
 */

package lancs.mobilemedia.core.ui.screens;

import static org.evosuite.runtime.EvoAssertions.verifyException;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class PhotoViewScreen_ESTest1 extends PhotoViewScreen_ESTest_scaffolding1 {
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
      PhotoViewScreen photoViewScreen0 = new PhotoViewScreen((Image) null);
      assertFalse(photoViewScreen0.isFromSMS());
      
      photoViewScreen0.setFromSMS(true);
      boolean boolean0 = photoViewScreen0.isFromSMS();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      PhotoViewScreen photoViewScreen0 = new PhotoViewScreen((Image) null);
      // Undeclared exception!
      try { 
        photoViewScreen0.paint((Graphics) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("lancs.mobilemedia.core.ui.screens.PhotoViewScreen", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      PhotoViewScreen photoViewScreen0 = new PhotoViewScreen((Image) null);
      boolean boolean0 = photoViewScreen0.isFromSMS();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      PhotoViewScreen photoViewScreen0 = new PhotoViewScreen((Image) null);
      byte[] byteArray0 = new byte[1];
      photoViewScreen0.setImage(byteArray0);
      byte[] byteArray1 = photoViewScreen0.getImage();
      assertNotNull(byteArray1);
      assertFalse(photoViewScreen0.isFromSMS());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      PhotoViewScreen photoViewScreen0 = new PhotoViewScreen((Image) null);
      photoViewScreen0.getImage();
      assertFalse(photoViewScreen0.isFromSMS());
  }
}
