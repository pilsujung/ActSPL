/*
 * This file was automatically generated by EvoSuite
 * Mon Aug 13 18:52:09 KST 2018
 */

package lancs.mobilemedia.core.ui.datamodel;

import org.junit.Test;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import lancs.mobilemedia.core.ui.datamodel.ImageAlbumData;
import lancs.mobilemedia.core.ui.datamodel.ImageMediaAccessor;
import lancs.mobilemedia.core.ui.datamodel.MediaData;
import lancs.mobilemedia.core.ui.datamodel.MusicAlbumData;
import lancs.mobilemedia.core.ui.datamodel.VideoAlbumData;
import lancs.mobilemedia.lib.exceptions.ImagePathNotValidException;
import lancs.mobilemedia.lib.exceptions.InvalidArrayFormatException;
import lancs.mobilemedia.lib.exceptions.InvalidImageDataException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class ImageMediaAccessor_ESTest1 extends ImageMediaAccessor_ESTest_scaffolding1 {
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
      ImageMediaAccessor imageMediaAccessor0 = new ImageMediaAccessor(imageAlbumData0);
      MediaData mediaData0 = new MediaData(0, "", "");
      mediaData0.toggleFavorite();
      byte[] byteArray0 = imageMediaAccessor0.getByteFromMediaInfo(mediaData0);
      MediaData mediaData1 = imageMediaAccessor0.getMediaFromBytes(byteArray0);
      assertEquals(0, mediaData1.getNumberOfViews());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ImageAlbumData imageAlbumData0 = new ImageAlbumData();
      ImageMediaAccessor imageMediaAccessor0 = new ImageMediaAccessor(imageAlbumData0);
      MediaData mediaData0 = new MediaData(0, "", "");
      mediaData0.setRecordId(1);
      byte[] byteArray0 = imageMediaAccessor0.getByteFromMediaInfo(mediaData0);
      MediaData mediaData1 = imageMediaAccessor0.getMediaFromBytes(byteArray0);
      assertEquals("", mediaData1.getParentAlbumName());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ImageAlbumData imageAlbumData0 = new ImageAlbumData();
      ImageMediaAccessor imageMediaAccessor0 = new ImageMediaAccessor(imageAlbumData0);
      MediaData mediaData0 = new MediaData(0, "", "");
      mediaData0.setRecordId((-1));
      byte[] byteArray0 = imageMediaAccessor0.getByteFromMediaInfo(mediaData0);
      MediaData mediaData1 = imageMediaAccessor0.getMediaFromBytes(byteArray0);
      assertEquals("", mediaData1.getMediaLabel());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ImageAlbumData imageAlbumData0 = new ImageAlbumData();
      ImageMediaAccessor imageMediaAccessor0 = new ImageMediaAccessor(imageAlbumData0);
      MediaData mediaData0 = new MediaData(0, "", "");
      mediaData0.increaseNumberOfViews();
      byte[] byteArray0 = imageMediaAccessor0.getByteFromMediaInfo(mediaData0);
      MediaData mediaData1 = imageMediaAccessor0.getMediaFromBytes(byteArray0);
      assertEquals(1, mediaData1.getNumberOfViews());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ImageAlbumData imageAlbumData0 = new ImageAlbumData();
      ImageMediaAccessor imageMediaAccessor0 = new ImageMediaAccessor(imageAlbumData0);
      MediaData mediaData0 = new MediaData(0, "", "");
      mediaData0.setNumberOfViews((-1));
      byte[] byteArray0 = imageMediaAccessor0.getByteFromMediaInfo(mediaData0);
      MediaData mediaData1 = imageMediaAccessor0.getMediaFromBytes(byteArray0);
      assertEquals("", mediaData1.getMediaLabel());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ImageAlbumData imageAlbumData0 = new ImageAlbumData();
      ImageMediaAccessor imageMediaAccessor0 = new ImageMediaAccessor(imageAlbumData0);
      MediaData mediaData0 = new MediaData(1, "", "");
      byte[] byteArray0 = imageMediaAccessor0.getByteFromMediaInfo(mediaData0);
      MediaData mediaData1 = imageMediaAccessor0.getMediaFromBytes(byteArray0);
      assertEquals(0, mediaData1.getNumberOfViews());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ImageAlbumData imageAlbumData0 = new ImageAlbumData();
      ImageMediaAccessor imageMediaAccessor0 = new ImageMediaAccessor(imageAlbumData0);
      MediaData mediaData0 = new MediaData((-1), "", "");
      byte[] byteArray0 = imageMediaAccessor0.getByteFromMediaInfo(mediaData0);
      MediaData mediaData1 = imageMediaAccessor0.getMediaFromBytes(byteArray0);
      assertNotSame(mediaData0, mediaData1);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ImageAlbumData imageAlbumData0 = new ImageAlbumData();
      ImageMediaAccessor imageMediaAccessor0 = new ImageMediaAccessor(imageAlbumData0);
      byte[] byteArray0 = imageMediaAccessor0.getMediaArrayOfByte("");
      assertEquals(1000, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ImageAlbumData imageAlbumData0 = new ImageAlbumData();
      ImageMediaAccessor imageMediaAccessor0 = new ImageMediaAccessor(imageAlbumData0);
      try { 
        imageMediaAccessor0.resetRecordStore();
        fail("Expecting exception: ImagePathNotValidException");
      
      } catch(ImagePathNotValidException e) {
         //
         // Path not valid for this file:/images/Tucan.png
         //
         verifyException("lancs.mobilemedia.core.util.MediaUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MusicAlbumData musicAlbumData0 = new MusicAlbumData();
      ImageMediaAccessor imageMediaAccessor0 = new ImageMediaAccessor(musicAlbumData0);
      byte[] byteArray0 = new byte[4];
      try { 
        imageMediaAccessor0.getMediaFromBytes(byteArray0);
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
      ImageAlbumData imageAlbumData0 = new ImageAlbumData();
      ImageMediaAccessor imageMediaAccessor0 = new ImageMediaAccessor(imageAlbumData0);
      try { 
        imageMediaAccessor0.getMediaArrayOfByte("J");
        fail("Expecting exception: ImagePathNotValidException");
      
      } catch(ImagePathNotValidException e) {
         //
         // Path not valid for this file:J
         //
         verifyException("lancs.mobilemedia.core.util.MediaUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      VideoAlbumData videoAlbumData0 = new VideoAlbumData();
      ImageMediaAccessor imageMediaAccessor0 = new ImageMediaAccessor(videoAlbumData0);
      try { 
        imageMediaAccessor0.getByteFromMediaInfo((MediaData) null);
        fail("Expecting exception: InvalidImageDataException");
      
      } catch(InvalidImageDataException e) {
         //
         // The provided data are not valid
         //
         verifyException("lancs.mobilemedia.core.util.MediaUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ImageAlbumData imageAlbumData0 = new ImageAlbumData();
      ImageMediaAccessor imageMediaAccessor0 = new ImageMediaAccessor(imageAlbumData0);
      // Undeclared exception!
      try { 
        imageMediaAccessor0.loadSingleImageFromRMS("", 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("lancs.mobilemedia.core.ui.datamodel.MediaAccessor", e);
      }
  }
}
