/*
 * This file was automatically generated by EvoSuite
 * Tue Aug 14 00:00:02 KST 2018
 */

package lancs.mobilemedia.core.ui.controller;

import static org.evosuite.runtime.EvoAssertions.verifyException;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.fail;

import javax.microedition.lcdui.Alert;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.List;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import lancs.mobilemedia.core.ui.MainUIMidlet;
import lancs.mobilemedia.core.ui.datamodel.AlbumData;
import lancs.mobilemedia.core.ui.datamodel.ImageAlbumData;
import lancs.mobilemedia.core.ui.datamodel.MusicAlbumData;
import lancs.mobilemedia.core.ui.screens.AlbumListScreen;
import lancs.mobilemedia.core.ui.screens.CaptureVideoScreen;
import lancs.mobilemedia.core.ui.screens.PlayMediaScreen;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class AbstractController_ESTest2 extends AbstractController_ESTest_scaffolding2 {
@BeforeClass
public static void initEvoSuiteFramework() {
String a = "aa";
}
@AfterClass
public static void exitEvoSuiteFramework() {
String a = "aa";
}

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MainUIMidlet mainUIMidlet0 = new MainUIMidlet();
      MusicAlbumData musicAlbumData0 = new MusicAlbumData();
      SelectMediaController selectMediaController0 = new SelectMediaController(mainUIMidlet0, musicAlbumData0, (List) null);
      List list0 = selectMediaController0.getAlbumListScreen();
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MainUIMidlet mainUIMidlet0 = new MainUIMidlet();
      ImageAlbumData imageAlbumData0 = new ImageAlbumData();
      AlbumListScreen albumListScreen0 = new AlbumListScreen();
      MediaController mediaController0 = new MediaController(mainUIMidlet0, imageAlbumData0, albumListScreen0);
      List list0 = mediaController0.getAlbumListScreen();
      assertSame(albumListScreen0, list0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MainUIMidlet mainUIMidlet0 = new MainUIMidlet();
      AlbumListScreen albumListScreen0 = new AlbumListScreen();
      MediaController mediaController0 = new MediaController(mainUIMidlet0, (AlbumData) null, albumListScreen0);
      AlbumData albumData0 = mediaController0.getAlbumData();
      assertNull(albumData0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MainUIMidlet mainUIMidlet0 = new MainUIMidlet();
      MusicAlbumData musicAlbumData0 = new MusicAlbumData();
      AlbumListScreen albumListScreen0 = new AlbumListScreen();
      MediaController mediaController0 = new MediaController(mainUIMidlet0, musicAlbumData0, albumListScreen0);
      AlbumData albumData0 = mediaController0.getAlbumData();
      assertSame(albumData0, musicAlbumData0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MainUIMidlet mainUIMidlet0 = new MainUIMidlet();
      ImageAlbumData imageAlbumData0 = new ImageAlbumData();
      AlbumListScreen albumListScreen0 = new AlbumListScreen();
      MediaController mediaController0 = new MediaController(mainUIMidlet0, imageAlbumData0, albumListScreen0);
      Command command0 = PlayMediaScreen.start;
      // Undeclared exception!
      try { 
        mediaController0.postCommand(command0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("lancs.mobilemedia.core.ui.controller.MediaController", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MainUIMidlet mainUIMidlet0 = new MainUIMidlet();
      MusicAlbumData musicAlbumData0 = new MusicAlbumData();
      AlbumListScreen albumListScreen0 = new AlbumListScreen();
      AlbumController albumController0 = new AlbumController(mainUIMidlet0, musicAlbumData0, albumListScreen0);
      Alert alert0 = new Alert("");
      // Undeclared exception!
      try { 
        albumController0.setCurrentScreen(alert0, (Displayable) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("lancs.mobilemedia.core.ui.controller.AbstractController", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      BaseController baseController0 = new BaseController((MainUIMidlet) null, (AlbumData) null, (AlbumListScreen) null);
      // Undeclared exception!
      try { 
        baseController0.getCurrentScreen();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("lancs.mobilemedia.core.ui.controller.AbstractController", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MainUIMidlet mainUIMidlet0 = new MainUIMidlet();
      MusicAlbumData musicAlbumData0 = new MusicAlbumData();
      SelectMediaController selectMediaController0 = new SelectMediaController(mainUIMidlet0, musicAlbumData0, (List) null);
      selectMediaController0.setAlbumData(musicAlbumData0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MainUIMidlet mainUIMidlet0 = new MainUIMidlet();
      ImageAlbumData imageAlbumData0 = new ImageAlbumData();
      AlbumListScreen albumListScreen0 = new AlbumListScreen();
      SelectMediaController selectMediaController0 = new SelectMediaController(mainUIMidlet0, imageAlbumData0, albumListScreen0);
      Alert alert0 = new Alert("");
      // Undeclared exception!
      try { 
        selectMediaController0.setAlbumListAsCurrentScreen(alert0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("lancs.mobilemedia.core.ui.controller.AbstractController", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ImageAlbumData imageAlbumData0 = new ImageAlbumData();
      AlbumListScreen albumListScreen0 = new AlbumListScreen();
      AlbumController albumController0 = new AlbumController((MainUIMidlet) null, imageAlbumData0, albumListScreen0);
      // Undeclared exception!
      try { 
        albumController0.commandAction((Command) null, albumListScreen0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("lancs.mobilemedia.core.ui.controller.AlbumController", e);
      }
  }
}
