/*
 * This file was automatically generated by EvoSuite
 * Tue Aug 14 00:19:21 KST 2018
 */

package lancs.mobilemedia.core.ui.screens;

import static org.evosuite.runtime.EvoAssertions.verifyException;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class PhotoViewScreen_ESTest2 extends PhotoViewScreen_ESTest_scaffolding2 {
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
      byte[] byteArray0 = new byte[4];
      photoViewScreen0.setImage(byteArray0);
      assertFalse(photoViewScreen0.isFromSMS());
  }


  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      PhotoViewScreen photoViewScreen0 = new PhotoViewScreen((Image) null);
      byte[] byteArray0 = new byte[6];
      photoViewScreen0.byteImage = byteArray0;
      photoViewScreen0.getImage();
      assertFalse(photoViewScreen0.isFromSMS());
  }



}
