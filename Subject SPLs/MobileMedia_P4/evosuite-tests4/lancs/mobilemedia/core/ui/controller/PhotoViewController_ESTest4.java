/*
 * This file was automatically generated by EvoSuite
 * Mon Aug 13 23:16:29 KST 2018
 */

package lancs.mobilemedia.core.ui.controller;

import static org.junit.Assert.assertNull;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import static org.junit.Assert.fail;

import javax.microedition.lcdui.Command;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import lancs.mobilemedia.core.ui.MainUIMidlet;
import lancs.mobilemedia.core.ui.datamodel.ImageAlbumData;
import lancs.mobilemedia.core.ui.datamodel.MusicAlbumData;
import lancs.mobilemedia.core.ui.screens.AlbumListScreen;
import lancs.mobilemedia.core.ui.screens.CaptureVideoScreen;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class PhotoViewController_ESTest4 extends PhotoViewController_ESTest_scaffolding4 {
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
      ImageAlbumData imageAlbumData0 = new ImageAlbumData();
      AlbumListScreen albumListScreen0 = new AlbumListScreen();
      PhotoViewController photoViewController0 = new PhotoViewController(mainUIMidlet0, imageAlbumData0, albumListScreen0, "");
      Command command0 = new Command("", 0, 0);
      // Undeclared exception!
      try { 
        photoViewController0.handleCommand(command0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      MainUIMidlet mainUIMidlet0 = new MainUIMidlet();
      MusicAlbumData musicAlbumData0 = new MusicAlbumData();
      AlbumListScreen albumListScreen0 = new AlbumListScreen();
      PhotoViewController photoViewController0 = new PhotoViewController(mainUIMidlet0, musicAlbumData0, albumListScreen0, "");
      photoViewController0.setCpVideoScreen((CaptureVideoScreen) null);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      MainUIMidlet mainUIMidlet0 = new MainUIMidlet();
      MusicAlbumData musicAlbumData0 = new MusicAlbumData();
      AlbumListScreen albumListScreen0 = new AlbumListScreen();
      PhotoViewController photoViewController0 = new PhotoViewController(mainUIMidlet0, musicAlbumData0, albumListScreen0, "");
      CaptureVideoScreen captureVideoScreen0 = photoViewController0.getCpVideoScreen();
      assertNull(captureVideoScreen0);
  }
}
