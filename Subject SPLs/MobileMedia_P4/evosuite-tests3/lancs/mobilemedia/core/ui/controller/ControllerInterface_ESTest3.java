/*
 * This file was automatically generated by EvoSuite
 * Mon Aug 13 18:44:23 KST 2018
 */

package lancs.mobilemedia.core.ui.controller;

import org.junit.Test;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import javax.microedition.lcdui.Command;
import lancs.mobilemedia.core.ui.MainUIMidlet;
import lancs.mobilemedia.core.ui.controller.BaseController;
import lancs.mobilemedia.core.ui.datamodel.MusicAlbumData;
import lancs.mobilemedia.core.ui.screens.AlbumListScreen;
import lancs.mobilemedia.sms.SmsReceiverController;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class ControllerInterface_ESTest3 extends ControllerInterface_ESTest_scaffolding3 {
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
      MainUIMidlet mainUIMidlet0 = new MainUIMidlet();
      MusicAlbumData musicAlbumData0 = new MusicAlbumData();
      AlbumListScreen albumListScreen0 = new AlbumListScreen();
      BaseController baseController0 = new BaseController(mainUIMidlet0, musicAlbumData0, albumListScreen0);
      Command command0 = AlbumListScreen.deleteAlbumCommand;
      // Undeclared exception!
      try { 
        baseController0.postCommand(command0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("lancs.mobilemedia.core.ui.controller.BaseController", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      MusicAlbumData musicAlbumData0 = new MusicAlbumData();
      AlbumListScreen albumListScreen0 = new AlbumListScreen();
      SmsReceiverController smsReceiverController0 = new SmsReceiverController((MainUIMidlet) null, musicAlbumData0, albumListScreen0);
      Command command0 = AlbumListScreen.addPassword;
      // Undeclared exception!
      try { 
        smsReceiverController0.handleCommand(command0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("lancs.mobilemedia.sms.SmsReceiverController", e);
      }
  }
}
