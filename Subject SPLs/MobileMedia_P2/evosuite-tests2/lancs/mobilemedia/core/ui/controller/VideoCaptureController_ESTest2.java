/*
 * This file was automatically generated by EvoSuite
 * Tue Aug 14 00:08:20 KST 2018
 */

package lancs.mobilemedia.core.ui.controller;

import static org.junit.Assert.fail;
import org.junit.AfterClass;
import org.junit.BeforeClass;

import javax.microedition.lcdui.Command;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import lancs.mobilemedia.core.ui.MainUIMidlet;
import lancs.mobilemedia.core.ui.datamodel.MusicAlbumData;
import lancs.mobilemedia.core.ui.screens.AlbumListScreen;
import lancs.mobilemedia.core.ui.screens.CaptureVideoScreen;
import lancs.mobilemedia.core.ui.screens.PlayMediaScreen;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class VideoCaptureController_ESTest2 extends VideoCaptureController_ESTest_scaffolding2 {
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
      AlbumListScreen albumListScreen0 = new AlbumListScreen();
      MusicAlbumData musicAlbumData0 = new MusicAlbumData();
      VideoCaptureController videoCaptureController0 = new VideoCaptureController(mainUIMidlet0, musicAlbumData0, albumListScreen0, (CaptureVideoScreen) null);
      Command command0 = PlayMediaScreen.stop;
      // Undeclared exception!
      try { 
        videoCaptureController0.handleCommand(command0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }
}
