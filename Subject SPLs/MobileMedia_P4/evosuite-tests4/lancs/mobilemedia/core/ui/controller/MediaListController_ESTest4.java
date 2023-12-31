/*
 * This file was automatically generated by EvoSuite
 * Mon Aug 13 23:14:44 KST 2018
 */

package lancs.mobilemedia.core.ui.controller;

import static org.evosuite.runtime.EvoAssertions.verifyException;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import javax.microedition.lcdui.Command;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import lancs.mobilemedia.core.ui.MainUIMidlet;
import lancs.mobilemedia.core.ui.datamodel.ImageAlbumData;
import lancs.mobilemedia.core.ui.datamodel.MediaData;
import lancs.mobilemedia.core.ui.datamodel.MusicAlbumData;
import lancs.mobilemedia.core.ui.screens.AlbumListScreen;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class MediaListController_ESTest4 extends MediaListController_ESTest_scaffolding4 {
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
      MediaController mediaController0 = new MediaController(mainUIMidlet0, musicAlbumData0, albumListScreen0);
      MediaData[] mediaDataArray0 = new MediaData[5];
      MediaData mediaData0 = new MediaData(0, "", "");
      mediaDataArray0[0] = mediaData0;
      mediaData0.increaseNumberOfViews();
      MediaData mediaData1 = new MediaData(0, "", "");
      mediaDataArray0[1] = mediaData1;
      mediaDataArray0[2] = mediaData0;
      mediaDataArray0[3] = mediaDataArray0[1];
      mediaDataArray0[4] = mediaData0;
      mediaController0.bubbleSort(mediaDataArray0);
      assertEquals(5, mediaDataArray0.length);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      MainUIMidlet mainUIMidlet0 = new MainUIMidlet();
      ImageAlbumData imageAlbumData0 = new ImageAlbumData();
      AlbumListScreen albumListScreen0 = new AlbumListScreen();
      MediaListController mediaListController0 = new MediaListController(mainUIMidlet0, imageAlbumData0, albumListScreen0);
      Command command0 = AlbumListScreen.addPassword;
      // Undeclared exception!
      try { 
        mediaListController0.handleCommand(command0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      MainUIMidlet mainUIMidlet0 = new MainUIMidlet();
      MusicAlbumData musicAlbumData0 = new MusicAlbumData();
      AlbumListScreen albumListScreen0 = new AlbumListScreen();
      MediaController mediaController0 = new MediaController(mainUIMidlet0, musicAlbumData0, albumListScreen0);
      // Undeclared exception!
      try { 
        mediaController0.showMediaList("", true, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("lancs.mobilemedia.core.ui.datamodel.MediaAccessor", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      MainUIMidlet mainUIMidlet0 = new MainUIMidlet();
      ImageAlbumData imageAlbumData0 = new ImageAlbumData();
      MediaController mediaController0 = new MediaController(mainUIMidlet0, imageAlbumData0, (AlbumListScreen) null);
      // Undeclared exception!
      try { 
        mediaController0.showMediaList((String) null, true, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("lancs.mobilemedia.core.ui.datamodel.MediaAccessor", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      MainUIMidlet mainUIMidlet0 = new MainUIMidlet();
      MusicAlbumData musicAlbumData0 = new MusicAlbumData();
      AlbumListScreen albumListScreen0 = new AlbumListScreen();
      MediaController mediaController0 = new MediaController(mainUIMidlet0, musicAlbumData0, albumListScreen0);
      MediaData[] mediaDataArray0 = new MediaData[5];
      MediaData mediaData0 = new MediaData(0, "", "");
      mediaDataArray0[0] = mediaData0;
      mediaData0.increaseNumberOfViews();
      MediaData mediaData1 = new MediaData(0, "", (String) null);
      mediaDataArray0[1] = mediaData1;
      // Undeclared exception!
      try { 
        mediaController0.bubbleSort(mediaDataArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}
