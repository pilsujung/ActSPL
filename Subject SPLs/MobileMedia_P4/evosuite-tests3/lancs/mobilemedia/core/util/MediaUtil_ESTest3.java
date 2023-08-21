/*
 * This file was automatically generated by EvoSuite
 * Mon Aug 13 21:47:37 KST 2018
 */

package lancs.mobilemedia.core.util;

import static org.evosuite.runtime.EvoAssertions.verifyException;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import lancs.mobilemedia.core.ui.datamodel.MediaData;
import lancs.mobilemedia.lib.exceptions.ImagePathNotValidException;
import lancs.mobilemedia.lib.exceptions.InvalidArrayFormatException;
import lancs.mobilemedia.lib.exceptions.InvalidImageDataException;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class MediaUtil_ESTest3 extends MediaUtil_ESTest_scaffolding3 {
@BeforeClass
public static void initEvoSuiteFramework() {
String a = "aa";
}
@AfterClass
public static void exitEvoSuiteFramework() {
String a = "aa";
}


  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MediaUtil mediaUtil0 = new MediaUtil();
      MediaData mediaData0 = new MediaData(1, "", "");
      byte[] byteArray0 = mediaUtil0.getBytesFromMediaInfo(mediaData0);
      MediaData mediaData1 = mediaUtil0.getMediaInfoFromBytes(byteArray0);
      assertEquals("", mediaData1.getMediaLabel());
      assertEquals(0, mediaData1.getRecordId());
      assertEquals("", mediaData1.getParentAlbumName());
      assertEquals(1, mediaData1.getForeignRecordId());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MediaUtil mediaUtil0 = new MediaUtil();
      try { 
        mediaUtil0.readMediaAsByteArray("9");
        fail("Expecting exception: ImagePathNotValidException");
      
      } catch(ImagePathNotValidException e) {
         //
         // Path not valid for this file:9
         //
         verifyException("lancs.mobilemedia.core.util.MediaUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MediaUtil mediaUtil0 = new MediaUtil();
      MediaData mediaData0 = new MediaData(0, (String) null, (String) null);
      try { 
        mediaUtil0.getBytesFromMediaInfo(mediaData0);
        fail("Expecting exception: InvalidImageDataException");
      
      } catch(InvalidImageDataException e) {
         //
         // The provided data are not valid
         //
         verifyException("lancs.mobilemedia.core.util.MediaUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MediaUtil mediaUtil0 = new MediaUtil();
      byte[] byteArray0 = mediaUtil0.readMediaAsByteArray("");
      try { 
        mediaUtil0.getMediaInfoFromBytes(byteArray0);
        fail("Expecting exception: InvalidArrayFormatException");
      
      } catch(InvalidArrayFormatException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("lancs.mobilemedia.core.util.MediaUtil", e);
      }
  }
}
