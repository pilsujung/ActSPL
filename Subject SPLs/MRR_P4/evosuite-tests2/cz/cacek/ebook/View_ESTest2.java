/*
 * This file was automatically generated by EvoSuite
 * Sun Aug 12 18:30:53 KST 2018
 */

package cz.cacek.ebook;

import static org.junit.Assert.assertEquals;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import static org.evosuite.runtime.EvoAssertions.*;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.fail;

import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class View_ESTest2 extends View_ESTest_scaffolding2 {
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
      View view0 = new View(0, 0, 0);
      // Undeclared exception!
      try { 
        view0.getScrollPosition(0, (-1));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("cz.cacek.ebook.View", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      View view0 = new View(0, 0, 0);
      view0.position = 1;
      // Undeclared exception!
      try { 
        view0.getPercPosition();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("cz.cacek.ebook.View", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Page page0 = new Page("");
      try { 
        View.estimateHeight((-1973), false, (-1170), (-2864), page0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("cz.cacek.ebook.View", e);
      }
  }



  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      View.Screen view_Screen0 = new View.Screen(2);
      view_Screen0.getContent(0);
      assertEquals(2, view_Screen0.size());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      View.Screen view_Screen0 = new View.Screen(1);
      view_Screen0.setContent(0, "");
      assertEquals(1, view_Screen0.size());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      View view0 = new View(0, 0, 0);
      Page page0 = new Page("D");
      // Undeclared exception!
      try { 
        view0.setPage(page0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("cz.cacek.ebook.View", e);
      }
  }








  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      View view0 = new View(0, 0, 0);
      // Undeclared exception!
      try { 
        view0.drawText((Graphics) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("cz.cacek.ebook.View", e);
      }
  }




  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      View view0 = new View(0, 0, 0);
      int int0 = view0.charWidth('%');
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      View view0 = new View(0, 0, 0);
      Page page0 = new Page("");
      view0.page = page0;
      String string0 = view0.prevLine();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      try { 
        View.estimateHeight(0, true, 0, 0, (Page) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("cz.cacek.ebook.View", e);
      }
  }





  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      View view0 = new View(0, 0, 0);
      Page page0 = new Page("");
      // Undeclared exception!
      try { 
        view0.setPage(page0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // / by zero
         //
         verifyException("cz.cacek.ebook.Page", e);
      }
  }






}
