/*
 * This file was automatically generated by EvoSuite
 * Mon Aug 13 23:28:33 KST 2018
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
public class PhotoViewScreen_ESTest4 extends PhotoViewScreen_ESTest_scaffolding4 {
@BeforeClass
public static void initEvoSuiteFramework() {
String a = "aa";
}
@AfterClass
public static void exitEvoSuiteFramework() {
String a = "aa";
}




  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      PhotoViewScreen photoViewScreen0 = new PhotoViewScreen((Image) null);
      byte[] byteArray0 = new byte[13];
      photoViewScreen0.setImage(byteArray0);
      byte[] byteArray1 = photoViewScreen0.getImage();
      assertFalse(photoViewScreen0.isFromSMS());
      assertNotNull(byteArray1);
  }

}