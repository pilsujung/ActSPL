/*
 * This file was automatically generated by EvoSuite
 * Tue Aug 14 00:14:02 KST 2018
 */

package lancs.mobilemedia.core.ui.datamodel;

import static org.evosuite.runtime.EvoAssertions.verifyException;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.fail;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import lancs.mobilemedia.lib.exceptions.ImagePathNotValidException;
import lancs.mobilemedia.lib.exceptions.InvalidArrayFormatException;
import lancs.mobilemedia.lib.exceptions.InvalidImageDataException;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class MusicMediaAccessor_ESTest2 extends MusicMediaAccessor_ESTest_scaffolding2 {
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
      MusicMediaAccessor musicMediaAccessor0 = new MusicMediaAccessor(imageAlbumData0);
      MediaData mediaData0 = new MediaData(0, "", "");
      mediaData0.setFavorite(true);
      byte[] byteArray0 = musicMediaAccessor0.getByteFromMediaInfo(mediaData0);
      MediaData mediaData1 = musicMediaAccessor0.getMediaFromBytes(byteArray0);
      assertEquals(0, mediaData1.getRecordId());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ImageAlbumData imageAlbumData0 = new ImageAlbumData();
      MusicMediaAccessor musicMediaAccessor0 = new MusicMediaAccessor(imageAlbumData0);
      MediaData mediaData0 = new MediaData(0, "", "");
      mediaData0.setRecordId(1);
      byte[] byteArray0 = musicMediaAccessor0.getByteFromMediaInfo(mediaData0);
      MediaData mediaData1 = musicMediaAccessor0.getMediaFromBytes(byteArray0);
      assertEquals("", mediaData1.getParentAlbumName());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ImageAlbumData imageAlbumData0 = new ImageAlbumData();
      MusicMediaAccessor musicMediaAccessor0 = new MusicMediaAccessor(imageAlbumData0);
      MediaData mediaData0 = new MediaData(0, "", "");
      mediaData0.setRecordId((-1));
      byte[] byteArray0 = musicMediaAccessor0.getByteFromMediaInfo(mediaData0);
      MediaData mediaData1 = musicMediaAccessor0.getMediaFromBytes(byteArray0);
      assertEquals((-1), mediaData1.getRecordId());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ImageAlbumData imageAlbumData0 = new ImageAlbumData();
      MusicMediaAccessor musicMediaAccessor0 = new MusicMediaAccessor(imageAlbumData0);
      MediaData mediaData0 = new MediaData(0, "", "");
      mediaData0.setNumberOfViews(1);
      byte[] byteArray0 = musicMediaAccessor0.getByteFromMediaInfo(mediaData0);
      MediaData mediaData1 = musicMediaAccessor0.getMediaFromBytes(byteArray0);
      assertNull(mediaData1.getTypeMedia());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ImageAlbumData imageAlbumData0 = new ImageAlbumData();
      MusicMediaAccessor musicMediaAccessor0 = new MusicMediaAccessor(imageAlbumData0);
      MediaData mediaData0 = new MediaData(0, "", "");
      mediaData0.setNumberOfViews((-1));
      byte[] byteArray0 = musicMediaAccessor0.getByteFromMediaInfo(mediaData0);
      MediaData mediaData1 = musicMediaAccessor0.getMediaFromBytes(byteArray0);
      assertEquals("", mediaData1.getParentAlbumName());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ImageAlbumData imageAlbumData0 = new ImageAlbumData();
      MusicMediaAccessor musicMediaAccessor0 = new MusicMediaAccessor(imageAlbumData0);
      MediaData mediaData0 = new MediaData(1, "", "");
      byte[] byteArray0 = musicMediaAccessor0.getByteFromMediaInfo(mediaData0);
      MediaData mediaData1 = musicMediaAccessor0.getMediaFromBytes(byteArray0);
      assertEquals(0, mediaData1.getNumberOfViews());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ImageAlbumData imageAlbumData0 = new ImageAlbumData();
      MusicMediaAccessor musicMediaAccessor0 = new MusicMediaAccessor(imageAlbumData0);
      MediaData mediaData0 = new MediaData((-1), "", "");
      byte[] byteArray0 = musicMediaAccessor0.getByteFromMediaInfo(mediaData0);
      MediaData mediaData1 = musicMediaAccessor0.getMediaFromBytes(byteArray0);
      assertNotSame(mediaData0, mediaData1);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MusicMediaAccessor musicMediaAccessor0 = new MusicMediaAccessor((AlbumData) null);
      byte[] byteArray0 = musicMediaAccessor0.getMediaArrayOfByte("");
      assertEquals(1000, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      VideoMediaAccessor videoMediaAccessor0 = new VideoMediaAccessor((AlbumData) null);
      // Undeclared exception!
      try { 
        videoMediaAccessor0.resetRecordStore();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("lancs.mobilemedia.core.ui.datamodel.VideoMediaAccessor", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      VideoAlbumData videoAlbumData0 = new VideoAlbumData();
      MusicMediaAccessor musicMediaAccessor0 = new MusicMediaAccessor(videoAlbumData0, "", "", "");
      byte[] byteArray0 = new byte[9];
      try { 
        musicMediaAccessor0.getMediaFromBytes(byteArray0);
        fail("Expecting exception: InvalidArrayFormatException");
      
      } catch(InvalidArrayFormatException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("lancs.mobilemedia.core.util.MediaUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MusicMediaAccessor musicMediaAccessor0 = new MusicMediaAccessor((AlbumData) null);
      try { 
        musicMediaAccessor0.getMediaArrayOfByte("y");
        fail("Expecting exception: ImagePathNotValidException");
      
      } catch(ImagePathNotValidException e) {
         //
         // Path not valid for this file:y
         //
         verifyException("lancs.mobilemedia.core.util.MediaUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MusicAlbumData musicAlbumData0 = new MusicAlbumData();
      VideoMediaAccessor videoMediaAccessor0 = new VideoMediaAccessor(musicAlbumData0);
      MediaData mediaData0 = new MediaData(0, "", (String) null);
      try { 
        videoMediaAccessor0.getByteFromMediaInfo(mediaData0);
        fail("Expecting exception: InvalidImageDataException");
      
      } catch(InvalidImageDataException e) {
         //
         // The provided data are not valid
         //
         verifyException("lancs.mobilemedia.core.util.MusicMediaUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ImageAlbumData imageAlbumData0 = new ImageAlbumData();
      MusicMediaAccessor musicMediaAccessor0 = new MusicMediaAccessor(imageAlbumData0);
      try { 
        musicMediaAccessor0.resetRecordStore();
        fail("Expecting exception: ImagePathNotValidException");
      
      } catch(ImagePathNotValidException e) {
         //
         // Path not valid for this file:/images/applause.wav
         //
         verifyException("lancs.mobilemedia.core.util.MediaUtil", e);
      }
  }
}
