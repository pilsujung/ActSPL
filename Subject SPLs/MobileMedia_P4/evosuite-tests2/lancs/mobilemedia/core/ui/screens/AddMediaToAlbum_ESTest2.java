/*
 * This file was automatically generated by EvoSuite
 * Tue Aug 14 00:15:50 KST 2018
 */

package lancs.mobilemedia.core.ui.screens;

import static org.evosuite.runtime.EvoAssertions.verifyException;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.fail;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class AddMediaToAlbum_ESTest2 extends AddMediaToAlbum_ESTest_scaffolding2 {
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
      AddMediaToAlbum addMediaToAlbum0 = new AddMediaToAlbum("");
      byte[] byteArray0 = new byte[1];
      addMediaToAlbum0.setCapturedMedia(byteArray0);
      byte[] byteArray1 = addMediaToAlbum0.getCapturedMedia();
      assertArrayEquals(new byte[] {(byte)0}, byteArray1);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      AddMediaToAlbum addMediaToAlbum0 = new AddMediaToAlbum((String) null);
      byte[] byteArray0 = new byte[0];
      addMediaToAlbum0.setCapturedMedia(byteArray0);
      byte[] byteArray1 = addMediaToAlbum0.getCapturedMedia();
      assertSame(byteArray1, byteArray0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      AddMediaToAlbum addMediaToAlbum0 = new AddMediaToAlbum("");
      addMediaToAlbum0.itempathtxt = null;
      // Undeclared exception!
      try { 
        addMediaToAlbum0.setLabePath((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("lancs.mobilemedia.core.ui.screens.AddMediaToAlbum", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      AddMediaToAlbum addMediaToAlbum0 = new AddMediaToAlbum("");
      addMediaToAlbum0.labeltxt = null;
      // Undeclared exception!
      try { 
        addMediaToAlbum0.setItemName((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("lancs.mobilemedia.core.ui.screens.AddMediaToAlbum", e);
      }
  }




  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      AddMediaToAlbum addMediaToAlbum0 = new AddMediaToAlbum("");
      byte[] byteArray0 = addMediaToAlbum0.getCapturedMedia();
      assertNull(byteArray0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      AddMediaToAlbum addMediaToAlbum0 = new AddMediaToAlbum("");
      addMediaToAlbum0.setItemName((String) null);
  }




  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      AddMediaToAlbum addMediaToAlbum0 = new AddMediaToAlbum("");
      addMediaToAlbum0.setLabePath((String) null);
  }
}