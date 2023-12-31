/*
 * This file was automatically generated by EvoSuite
 * Mon Aug 13 23:13:21 KST 2018
 */

package lancs.mobilemedia.core.ui.controller;

import static org.evosuite.runtime.EvoAssertions.verifyException;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.fail;

import javax.microedition.lcdui.Command;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import lancs.mobilemedia.core.ui.MainUIMidlet;
import lancs.mobilemedia.core.ui.datamodel.AlbumData;
import lancs.mobilemedia.core.ui.datamodel.ImageAlbumData;
import lancs.mobilemedia.core.ui.datamodel.MediaData;
import lancs.mobilemedia.core.ui.datamodel.MusicAlbumData;
import lancs.mobilemedia.core.ui.screens.AlbumListScreen;
import lancs.mobilemedia.core.ui.screens.NewLabelScreen;
import lancs.mobilemedia.lib.exceptions.InvalidImageDataException;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class MediaController_ESTest4 extends MediaController_ESTest_scaffolding4 {
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
      ImageAlbumData imageAlbumData0 = new ImageAlbumData();
      AlbumListScreen albumListScreen0 = new AlbumListScreen();
      MediaController mediaController0 = new MediaController((MainUIMidlet) null, imageAlbumData0, albumListScreen0);
      NewLabelScreen newLabelScreen0 = new NewLabelScreen("", 0);
      mediaController0.setScreen(newLabelScreen0);
      NewLabelScreen newLabelScreen1 = mediaController0.getScreen();
      assertEquals(0, newLabelScreen1.getFormType());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MainUIMidlet mainUIMidlet0 = new MainUIMidlet();
      MusicAlbumData musicAlbumData0 = new MusicAlbumData();
      AlbumListScreen albumListScreen0 = new AlbumListScreen();
      MediaController mediaController0 = new MediaController(mainUIMidlet0, musicAlbumData0, albumListScreen0);
      NewLabelScreen newLabelScreen0 = new NewLabelScreen("", 1);
      mediaController0.setScreen(newLabelScreen0);
      NewLabelScreen newLabelScreen1 = mediaController0.getScreen();
      assertSame(newLabelScreen1, newLabelScreen0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MainUIMidlet mainUIMidlet0 = new MainUIMidlet();
      ImageAlbumData imageAlbumData0 = new ImageAlbumData();
      AlbumListScreen albumListScreen0 = new AlbumListScreen();
      MediaController mediaController0 = new MediaController(mainUIMidlet0, imageAlbumData0, albumListScreen0);
      NewLabelScreen newLabelScreen0 = new NewLabelScreen("", 0);
      newLabelScreen0.setFormType((-1));
      mediaController0.setScreen(newLabelScreen0);
      NewLabelScreen newLabelScreen1 = mediaController0.getScreen();
      assertSame(newLabelScreen1, newLabelScreen0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ImageAlbumData imageAlbumData0 = new ImageAlbumData();
      AlbumListScreen albumListScreen0 = new AlbumListScreen();
      MediaController mediaController0 = new MediaController((MainUIMidlet) null, imageAlbumData0, albumListScreen0);
      MediaData mediaData0 = new MediaData(0, "", "");
      mediaController0.setMedia(mediaData0);
      MediaData mediaData1 = mediaController0.getMedia();
      assertEquals(0, mediaData1.getNumberOfViews());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MainUIMidlet mainUIMidlet0 = new MainUIMidlet();
      MusicAlbumData musicAlbumData0 = new MusicAlbumData();
      AlbumListScreen albumListScreen0 = new AlbumListScreen();
      MediaController mediaController0 = new MediaController(mainUIMidlet0, musicAlbumData0, albumListScreen0);
      MediaData mediaData0 = new MediaData(1, (String) null, "");
      mediaController0.setMedia(mediaData0);
      MediaData mediaData1 = mediaController0.getMedia();
      assertEquals("", mediaData1.getMediaLabel());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MusicAlbumData musicAlbumData0 = new MusicAlbumData();
      MediaController mediaController0 = new MediaController((MainUIMidlet) null, musicAlbumData0, (AlbumListScreen) null);
      MediaData mediaData0 = new MediaData((-1), "", "");
      mediaController0.setMedia(mediaData0);
      MediaData mediaData1 = mediaController0.getMedia();
      assertNull(mediaData1.getTypeMedia());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ImageAlbumData imageAlbumData0 = new ImageAlbumData();
      AlbumListScreen albumListScreen0 = new AlbumListScreen();
      MediaController mediaController0 = new MediaController((MainUIMidlet) null, imageAlbumData0, albumListScreen0);
      MediaData mediaData0 = new MediaData(0, "Phot", (String) null);
      try { 
        mediaController0.updateMedia(mediaData0);
        fail("Expecting exception: InvalidImageDataException");
      
      } catch(InvalidImageDataException e) {
         //
         // The provided data are not valid
         //
         verifyException("lancs.mobilemedia.core.util.MediaUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MainUIMidlet mainUIMidlet0 = new MainUIMidlet();
      AlbumListScreen albumListScreen0 = new AlbumListScreen();
      MediaController mediaController0 = new MediaController(mainUIMidlet0, (AlbumData) null, albumListScreen0);
      MediaData mediaData0 = new MediaData(0, "", "");
      // Undeclared exception!
      try { 
        mediaController0.updateMedia(mediaData0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("lancs.mobilemedia.core.ui.controller.MediaController", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MainUIMidlet mainUIMidlet0 = new MainUIMidlet();
      MusicAlbumData musicAlbumData0 = new MusicAlbumData();
      AlbumListScreen albumListScreen0 = new AlbumListScreen();
      MediaController mediaController0 = new MediaController(mainUIMidlet0, musicAlbumData0, albumListScreen0);
      // Undeclared exception!
      try { 
        mediaController0.showImage("");
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // lancs.mobilemedia.core.ui.datamodel.MusicAlbumData cannot be cast to lancs.mobilemedia.core.ui.datamodel.ImageAlbumData
         //
         verifyException("lancs.mobilemedia.core.ui.controller.MediaController", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MainUIMidlet mainUIMidlet0 = new MainUIMidlet();
      MusicAlbumData musicAlbumData0 = new MusicAlbumData();
      AlbumListScreen albumListScreen0 = new AlbumListScreen();
      MediaController mediaController0 = new MediaController(mainUIMidlet0, musicAlbumData0, albumListScreen0);
      Command command0 = AlbumListScreen.resetCommand;
      // Undeclared exception!
      try { 
        mediaController0.handleCommand(command0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MainUIMidlet mainUIMidlet0 = new MainUIMidlet();
      MusicAlbumData musicAlbumData0 = new MusicAlbumData();
      MediaController mediaController0 = new MediaController(mainUIMidlet0, musicAlbumData0, (AlbumListScreen) null);
      // Undeclared exception!
      try { 
        mediaController0.getSelectedMediaName();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("lancs.mobilemedia.core.ui.controller.MediaController", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MainUIMidlet mainUIMidlet0 = new MainUIMidlet();
      AlbumListScreen albumListScreen0 = new AlbumListScreen();
      MediaController mediaController0 = new MediaController(mainUIMidlet0, (AlbumData) null, albumListScreen0);
      NewLabelScreen newLabelScreen0 = mediaController0.getScreen();
      assertNull(newLabelScreen0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ImageAlbumData imageAlbumData0 = new ImageAlbumData();
      AlbumListScreen albumListScreen0 = new AlbumListScreen();
      MediaController mediaController0 = new MediaController((MainUIMidlet) null, imageAlbumData0, albumListScreen0);
      MediaData mediaData0 = new MediaData(0, "", (String) null);
      // Undeclared exception!
      try { 
        mediaController0.updateMedia(mediaData0);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MainUIMidlet mainUIMidlet0 = new MainUIMidlet();
      MusicAlbumData musicAlbumData0 = new MusicAlbumData();
      MediaController mediaController0 = new MediaController(mainUIMidlet0, musicAlbumData0, (AlbumListScreen) null);
      MediaData mediaData0 = mediaController0.getMedia();
      assertNull(mediaData0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ImageAlbumData imageAlbumData0 = new ImageAlbumData();
      AlbumListScreen albumListScreen0 = new AlbumListScreen();
      MainUIMidlet mainUIMidlet0 = new MainUIMidlet();
      MediaController mediaController0 = new MediaController(mainUIMidlet0, imageAlbumData0, albumListScreen0);
      // Undeclared exception!
      try { 
        mediaController0.showImage("");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("lancs.mobilemedia.core.ui.controller.MediaController", e);
      }
  }
}
