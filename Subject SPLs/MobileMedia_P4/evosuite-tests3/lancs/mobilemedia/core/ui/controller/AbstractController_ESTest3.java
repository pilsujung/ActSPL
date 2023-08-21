/*
 * This file was automatically generated by EvoSuite
 * Mon Aug 13 18:42:14 KST 2018
 */

package lancs.mobilemedia.core.ui.controller;

import org.junit.Test;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.InputStream;
import javax.microedition.lcdui.Alert;
import javax.microedition.lcdui.AlertType;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Image;
import javax.microedition.lcdui.List;
import lancs.mobilemedia.core.ui.MainUIMidlet;
import lancs.mobilemedia.core.ui.controller.AlbumController;
import lancs.mobilemedia.core.ui.controller.BaseController;
import lancs.mobilemedia.core.ui.controller.ControllerInterface;
import lancs.mobilemedia.core.ui.controller.MediaController;
import lancs.mobilemedia.core.ui.controller.MediaListController;
import lancs.mobilemedia.core.ui.controller.MusicPlayController;
import lancs.mobilemedia.core.ui.controller.SelectMediaController;
import lancs.mobilemedia.core.ui.datamodel.AlbumData;
import lancs.mobilemedia.core.ui.datamodel.MusicAlbumData;
import lancs.mobilemedia.core.ui.screens.AlbumListScreen;
import lancs.mobilemedia.core.ui.screens.PlayMediaScreen;
import lancs.mobilemedia.sms.SmsSenderController;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class AbstractController_ESTest3 extends AbstractController_ESTest_scaffolding3 {
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
      MainUIMidlet mainUIMidlet0 = new MainUIMidlet();
      MusicAlbumData musicAlbumData0 = new MusicAlbumData();
      AlbumListScreen albumListScreen0 = new AlbumListScreen();
      SmsSenderController smsSenderController0 = new SmsSenderController(mainUIMidlet0, musicAlbumData0, albumListScreen0, "");
      BaseController baseController0 = new BaseController(mainUIMidlet0, musicAlbumData0, albumListScreen0);
      smsSenderController0.setNextController(baseController0);
      ControllerInterface controllerInterface0 = smsSenderController0.getNextController();
      assertSame(controllerInterface0, baseController0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MainUIMidlet mainUIMidlet0 = new MainUIMidlet();
      MusicAlbumData musicAlbumData0 = new MusicAlbumData();
      BaseController baseController0 = new BaseController(mainUIMidlet0, musicAlbumData0, (AlbumListScreen) null);
      List list0 = baseController0.getAlbumListScreen();
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MainUIMidlet mainUIMidlet0 = new MainUIMidlet();
      MusicAlbumData musicAlbumData0 = new MusicAlbumData();
      List list0 = new List("", 0);
      SelectMediaController selectMediaController0 = new SelectMediaController(mainUIMidlet0, musicAlbumData0, list0);
      List list1 = selectMediaController0.getAlbumListScreen();
      assertSame(list0, list1);
  }


  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MainUIMidlet mainUIMidlet0 = new MainUIMidlet();
      MusicAlbumData musicAlbumData0 = new MusicAlbumData();
      List list0 = new List((String) null, 0);
      SelectMediaController selectMediaController0 = new SelectMediaController(mainUIMidlet0, musicAlbumData0, list0);
      PlayMediaScreen playMediaScreen0 = new PlayMediaScreen(mainUIMidlet0, (InputStream) null, (String) null, selectMediaController0);
      MusicPlayController musicPlayController0 = new MusicPlayController(mainUIMidlet0, musicAlbumData0, list0, playMediaScreen0);
      AlbumData albumData0 = musicPlayController0.getAlbumData();
      assertSame(albumData0, musicAlbumData0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MainUIMidlet mainUIMidlet0 = new MainUIMidlet();
      MusicAlbumData musicAlbumData0 = new MusicAlbumData();
      AlbumListScreen albumListScreen0 = new AlbumListScreen();
      MediaController mediaController0 = new MediaController(mainUIMidlet0, musicAlbumData0, albumListScreen0);
      Command command0 = PlayMediaScreen.back;
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
  public void test06()  throws Throwable  {
      MainUIMidlet mainUIMidlet0 = new MainUIMidlet();
      MusicAlbumData musicAlbumData0 = new MusicAlbumData();
      AlbumListScreen albumListScreen0 = new AlbumListScreen();
      MediaListController mediaListController0 = new MediaListController(mainUIMidlet0, musicAlbumData0, albumListScreen0);
      Alert alert0 = new Alert("", "", (Image) null, (AlertType) null);
      // Undeclared exception!
      try { 
        mediaListController0.setCurrentScreen(alert0, (Displayable) alert0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("lancs.mobilemedia.core.ui.controller.AbstractController", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MainUIMidlet mainUIMidlet0 = new MainUIMidlet();
      MusicAlbumData musicAlbumData0 = new MusicAlbumData();
      AlbumListScreen albumListScreen0 = new AlbumListScreen();
      MediaController mediaController0 = new MediaController(mainUIMidlet0, musicAlbumData0, albumListScreen0);
      // Undeclared exception!
      try { 
        mediaController0.getCurrentScreen();
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
      MainUIMidlet mainUIMidlet0 = new MainUIMidlet();
      AlbumListScreen albumListScreen0 = new AlbumListScreen();
      MusicAlbumData musicAlbumData0 = new MusicAlbumData();
      SelectMediaController selectMediaController0 = new SelectMediaController(mainUIMidlet0, musicAlbumData0, albumListScreen0);
      // Undeclared exception!
      try { 
        selectMediaController0.setCurrentScreen((Displayable) albumListScreen0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("lancs.mobilemedia.core.ui.controller.AbstractController", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MainUIMidlet mainUIMidlet0 = new MainUIMidlet();
      MusicAlbumData musicAlbumData0 = new MusicAlbumData();
      AlbumListScreen albumListScreen0 = new AlbumListScreen();
      MusicPlayController musicPlayController0 = new MusicPlayController(mainUIMidlet0, musicAlbumData0, albumListScreen0, (PlayMediaScreen) null);
      String string0 = musicPlayController0.getCurrentStoreName();
      assertEquals("My Photo Album", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MusicAlbumData musicAlbumData0 = new MusicAlbumData();
      AlbumListScreen albumListScreen0 = new AlbumListScreen();
      MediaController mediaController0 = new MediaController((MainUIMidlet) null, musicAlbumData0, albumListScreen0);
      ControllerInterface controllerInterface0 = mediaController0.getNextController();
      assertNull(controllerInterface0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MainUIMidlet mainUIMidlet0 = new MainUIMidlet();
      MusicAlbumData musicAlbumData0 = new MusicAlbumData();
      AlbumListScreen albumListScreen0 = new AlbumListScreen();
      MediaController mediaController0 = new MediaController(mainUIMidlet0, musicAlbumData0, albumListScreen0);
      mediaController0.setAlbumData(musicAlbumData0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MainUIMidlet mainUIMidlet0 = new MainUIMidlet();
      List list0 = new List((String) null, 0);
      SelectMediaController selectMediaController0 = new SelectMediaController(mainUIMidlet0, (AlbumData) null, list0);
      Alert alert0 = new Alert((String) null, (String) null, (Image) null, (AlertType) null);
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
      MainUIMidlet mainUIMidlet0 = new MainUIMidlet();
      MusicAlbumData musicAlbumData0 = new MusicAlbumData();
      AlbumListScreen albumListScreen0 = new AlbumListScreen();
      AlbumController albumController0 = new AlbumController(mainUIMidlet0, musicAlbumData0, albumListScreen0);
      Command command0 = new Command("", 0, 0);
      // Undeclared exception!
      try { 
        albumController0.commandAction(command0, albumListScreen0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("lancs.mobilemedia.core.ui.controller.AlbumController", e);
      }
  }
}
