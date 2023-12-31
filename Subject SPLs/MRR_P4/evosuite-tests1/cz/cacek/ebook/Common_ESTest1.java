/*
 * This file was automatically generated by EvoSuite
 * Sun Aug 12 16:18:00 KST 2018
 */

package cz.cacek.ebook;

import static org.evosuite.runtime.EvoAssertions.verifyException;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class Common_ESTest1 extends Common_ESTest_scaffolding1 {
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
      String string0 = Common.createIdFromName("abcdefghijklmnopqrst");
      assertEquals("abcdefghijklmnopqrst", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      String string0 = Common.createIdFromName("W");
      assertEquals("w", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      String string0 = Common.createIdFromName("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      // Undeclared exception!
      try { 
        Common.error((Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("cz.cacek.ebook.Common", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      // Undeclared exception!
      try { 
        Common.createIdFromName((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("cz.cacek.ebook.Common", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Throwable throwable0 = new Throwable();
      Common.error(throwable0);
      assertEquals("java.lang.Throwable", throwable0.toString());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      String string0 = Common.createIdFromName("abcdefghijklmnopqrstu");
      assertEquals("abcdefghijklmnopqrst", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      String string0 = Common.createIdFromName("]");
      assertEquals("X", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      String string0 = Common.createIdFromName(" ");
      assertEquals("_", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Common.debugErr("");
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Common.debug("");
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Common common0 = new Common();
  }
}
