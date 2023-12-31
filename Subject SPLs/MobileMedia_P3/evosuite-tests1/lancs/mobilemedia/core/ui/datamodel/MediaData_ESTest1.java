/*
 * This file was automatically generated by EvoSuite
 * Mon Aug 13 18:55:12 KST 2018
 */

package lancs.mobilemedia.core.ui.datamodel;

import org.junit.Test;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import static org.junit.Assert.*;
import lancs.mobilemedia.core.ui.datamodel.MediaData;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class MediaData_ESTest1 extends MediaData_ESTest_scaffolding1 {
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
      MediaData mediaData0 = new MediaData(0, (String) null, "");
      mediaData0.setRecordId(1);
      int int0 = mediaData0.getRecordId();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MediaData mediaData0 = new MediaData(0, "", "");
      mediaData0.setRecordId((-1));
      int int0 = mediaData0.getRecordId();
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MediaData mediaData0 = new MediaData(0, "", "");
      mediaData0.toggleFavorite();
      mediaData0.toggleFavorite();
      mediaData0.toggleFavorite();
      boolean boolean0 = mediaData0.isFavorite();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      MediaData mediaData0 = new MediaData(0, (String) null, (String) null);
      assertFalse(mediaData0.isFavorite());
      
      mediaData0.setFavorite(true);
      assertTrue(mediaData0.isFavorite());
  }
}
