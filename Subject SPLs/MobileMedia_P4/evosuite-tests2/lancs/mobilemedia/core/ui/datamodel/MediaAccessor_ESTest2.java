/*
 * This file was automatically generated by EvoSuite
 * Tue Aug 14 00:12:10 KST 2018
 */

package lancs.mobilemedia.core.ui.datamodel;

import static org.evosuite.runtime.EvoAssertions.verifyException;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.Hashtable;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import lancs.mobilemedia.lib.exceptions.ImageNotFoundException;
import lancs.mobilemedia.lib.exceptions.ImagePathNotValidException;
import lancs.mobilemedia.lib.exceptions.InvalidImageDataException;
import lancs.mobilemedia.lib.exceptions.InvalidPhotoAlbumNameException;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class MediaAccessor_ESTest2 extends MediaAccessor_ESTest_scaffolding2 {
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
      MusicAlbumData musicAlbumData0 = new MusicAlbumData();
      ImageMediaAccessor imageMediaAccessor0 = new ImageMediaAccessor(musicAlbumData0);
      try { 
        imageMediaAccessor0.deleteSingleMediaFromRMS("", "");
        fail("Expecting exception: ImageNotFoundException");
      
      } catch(ImageNotFoundException e) {
         //
         //  was NULL in ImageAccessor Hashtable.
         //
         verifyException("lancs.mobilemedia.core.ui.datamodel.MediaAccessor", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ImageAlbumData imageAlbumData0 = new ImageAlbumData();
      ImageMediaAccessor imageMediaAccessor0 = (ImageMediaAccessor)imageAlbumData0.mediaAccessor;
      imageMediaAccessor0.password_label = "";
      String string0 = imageAlbumData0.getPassword("");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ImageAlbumData imageAlbumData0 = new ImageAlbumData();
      ImageMediaAccessor imageMediaAccessor0 = (ImageMediaAccessor)imageAlbumData0.mediaAccessor;
      imageMediaAccessor0.removeRecords();
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ImageAlbumData imageAlbumData0 = new ImageAlbumData();
      MediaData mediaData0 = new MediaData(0, "Prin", "");
      // Undeclared exception!
      try { 
        imageAlbumData0.updateMediaInfo(mediaData0, mediaData0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("lancs.mobilemedia.core.ui.datamodel.MediaAccessor", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ImageAlbumData imageAlbumData0 = new ImageAlbumData();
      ImageMediaAccessor imageMediaAccessor0 = (ImageMediaAccessor)imageAlbumData0.mediaAccessor;
      String string0 = imageMediaAccessor0.getPassword("");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ImageAlbumData imageAlbumData0 = new ImageAlbumData();
      ImageMediaAccessor imageMediaAccessor0 = (ImageMediaAccessor)imageAlbumData0.mediaAccessor;
      // Undeclared exception!
      try { 
        imageMediaAccessor0.getMediaInfo((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MusicMediaAccessor musicMediaAccessor0 = new MusicMediaAccessor((AlbumData) null);
      // Undeclared exception!
      try { 
        musicMediaAccessor0.addPassword("", "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("lancs.mobilemedia.core.ui.datamodel.MediaAccessor", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ImageAlbumData imageAlbumData0 = new ImageAlbumData();
      MusicMediaAccessor musicMediaAccessor0 = new MusicMediaAccessor(imageAlbumData0);
      try { 
        musicMediaAccessor0.addMediaData("", "6", "");
        fail("Expecting exception: ImagePathNotValidException");
      
      } catch(ImagePathNotValidException e) {
         //
         // Path not valid for this file:6
         //
         verifyException("lancs.mobilemedia.core.util.MediaUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      MusicMediaAccessor musicMediaAccessor0 = new MusicMediaAccessor((AlbumData) null);
      // Undeclared exception!
      try { 
        musicMediaAccessor0.addMediaArrayOfBytes("", "", (byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("lancs.mobilemedia.core.ui.datamodel.MediaAccessor", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      MusicAlbumData musicAlbumData0 = new MusicAlbumData();
      ImageMediaAccessor imageMediaAccessor0 = new ImageMediaAccessor(musicAlbumData0);
      try { 
        imageMediaAccessor0.getMediaInfo("");
        fail("Expecting exception: ImageNotFoundException");
      
      } catch(ImageNotFoundException e) {
         //
         //  was NULL in ImageAccessor Hashtable.
         //
         verifyException("lancs.mobilemedia.core.ui.datamodel.MediaAccessor", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ImageAlbumData imageAlbumData0 = new ImageAlbumData();
      ImageMediaAccessor imageMediaAccessor0 = new ImageMediaAccessor(imageAlbumData0);
      String[] stringArray0 = new String[2];
      imageMediaAccessor0.albumNames = stringArray0;
      try { 
        imageMediaAccessor0.loadAlbums();
        fail("Expecting exception: ImagePathNotValidException");
      
      } catch(ImagePathNotValidException e) {
         //
         // Path not valid for this file:/images/Tucan.png
         //
         verifyException("lancs.mobilemedia.core.util.MediaUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      MusicMediaAccessor musicMediaAccessor0 = new MusicMediaAccessor((AlbumData) null);
      MediaData mediaData0 = new MediaData(0, "", "");
      musicMediaAccessor0.setMediaInfo("", mediaData0);
      assertNull(mediaData0.getTypeMedia());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ImageAlbumData imageAlbumData0 = new ImageAlbumData();
      ImageMediaAccessor imageMediaAccessor0 = (ImageMediaAccessor)imageAlbumData0.mediaAccessor;
      // Undeclared exception!
      try { 
        imageMediaAccessor0.loadMediaBytesFromRMS("", (byte)0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("lancs.mobilemedia.core.ui.datamodel.MediaAccessor", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      MusicAlbumData musicAlbumData0 = new MusicAlbumData();
      ImageMediaAccessor imageMediaAccessor0 = new ImageMediaAccessor(musicAlbumData0);
      imageMediaAccessor0.deleteAlbum("");
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ImageAlbumData imageAlbumData0 = new ImageAlbumData();
      ImageMediaAccessor imageMediaAccessor0 = (ImageMediaAccessor)imageAlbumData0.mediaAccessor;
      // Undeclared exception!
      try { 
        imageMediaAccessor0.addMediaData((MediaData) null, "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("lancs.mobilemedia.core.ui.datamodel.MediaAccessor", e);
      }
  }
}
