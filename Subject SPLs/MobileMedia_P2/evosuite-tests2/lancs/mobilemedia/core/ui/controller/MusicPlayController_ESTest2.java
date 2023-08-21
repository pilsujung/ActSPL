/*
 * This file was automatically generated by EvoSuite
 * Tue Aug 14 00:04:38 KST 2018
 */

package lancs.mobilemedia.core.ui.controller;

import static org.junit.Assert.assertEquals;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.fail;

import java.io.InputStream;
import java.io.PushbackInputStream;

import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.List;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import lancs.mobilemedia.core.ui.MainUIMidlet;
import lancs.mobilemedia.core.ui.datamodel.MusicAlbumData;
import lancs.mobilemedia.core.ui.datamodel.VideoAlbumData;
import lancs.mobilemedia.core.ui.screens.AlbumListScreen;
import lancs.mobilemedia.core.ui.screens.PlayMediaScreen;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class MusicPlayController_ESTest2 extends MusicPlayController_ESTest_scaffolding2 {
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
      List list0 = new List("", 0);
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream((InputStream) null, 1);
      AlbumListScreen albumListScreen0 = new AlbumListScreen();
      AlbumController albumController0 = new AlbumController(mainUIMidlet0, musicAlbumData0, albumListScreen0);
      PlayMediaScreen playMediaScreen0 = new PlayMediaScreen(mainUIMidlet0, pushbackInputStream0, "", albumController0);
      MusicPlayController musicPlayController0 = new MusicPlayController(mainUIMidlet0, musicAlbumData0, list0, playMediaScreen0);
      Command command0 = PlayMediaScreen.start;
      // Undeclared exception!
      try { 
        musicPlayController0.handleCommand(command0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      MainUIMidlet mainUIMidlet0 = new MainUIMidlet();
      VideoAlbumData videoAlbumData0 = new VideoAlbumData();
      AlbumListScreen albumListScreen0 = new AlbumListScreen();
      MusicPlayController musicPlayController0 = new MusicPlayController(mainUIMidlet0, videoAlbumData0, albumListScreen0, (PlayMediaScreen) null);
      musicPlayController0.setMediaName("U");
      String string0 = musicPlayController0.getMediaName();
      assertEquals("U", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      MainUIMidlet mainUIMidlet0 = new MainUIMidlet();
      VideoAlbumData videoAlbumData0 = new VideoAlbumData();
      AlbumListScreen albumListScreen0 = new AlbumListScreen();
      MusicPlayController musicPlayController0 = new MusicPlayController(mainUIMidlet0, videoAlbumData0, albumListScreen0, (PlayMediaScreen) null);
      musicPlayController0.setMediaName("");
      String string0 = musicPlayController0.getMediaName();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      MainUIMidlet mainUIMidlet0 = new MainUIMidlet();
      MusicAlbumData musicAlbumData0 = new MusicAlbumData();
      List list0 = new List("", 0);
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream((InputStream) null, 1);
      AlbumListScreen albumListScreen0 = new AlbumListScreen();
      AlbumController albumController0 = new AlbumController(mainUIMidlet0, musicAlbumData0, albumListScreen0);
      PlayMediaScreen playMediaScreen0 = new PlayMediaScreen(mainUIMidlet0, pushbackInputStream0, "", albumController0);
      MusicPlayController musicPlayController0 = new MusicPlayController(mainUIMidlet0, musicAlbumData0, list0, playMediaScreen0);
      String string0 = musicPlayController0.getMediaName();
      assertNull(string0);
  }
}
