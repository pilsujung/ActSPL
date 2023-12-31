/*
 * This file was automatically generated by EvoSuite
 * Sun Oct 02 21:03:39 KST 2016
 */


import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.ImageProducer;
import java.util.Vector;

import javax.swing.DebugGraphics;
import javax.swing.table.DefaultTableModel;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import sun.awt.HeadlessToolkit;
import sun.awt.image.ToolkitImage;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class Menu_ESTest3   {
@BeforeClass
public static void initEvoSuiteFramework() {
}
@AfterClass
public static void exitEvoSuiteFramework() {
}

  @Test
  public void test01()  throws Throwable  {
      Maler maler0 = new Maler((GameManager) null);
      Menu menu0 = new Menu(maler0);
      maler0.menu = menu0;
      menu0.setLogoKoordinate(1, 1);
      maler0.menu.add("", (-347));
      maler0.menu.KeyBehandeln(39);
      assertFalse(maler0.isDisplayable());
  }

  @Test
  public void test02()  throws Throwable  {
      Maler maler0 = new Maler((GameManager) null);
      Menu menu0 = new Menu(maler0);
      maler0.menu = menu0;
      menu0.setLogoKoordinate(1, 0);
      maler0.menu.KeyBehandeln(39);
      assertEquals(0, maler0.getY());
  }

  @Test
  public void test03()  throws Throwable  {
      Maler maler0 = new Maler((GameManager) null);
      Menu menu0 = new Menu(maler0);
      maler0.menu = menu0;
      maler0.menu.KeyBehandeln(1189);
      assertFalse(maler0.isCursorSet());
  }

  @Test
  public void test05()  throws Throwable  {
      Maler maler0 = new Maler((GameManager) null);
      Menu menu0 = new Menu(maler0);
      menu0.add("", (Image) null, (Image) null, 1);
      menu0.add("", (Image) null, (Image) null, 50);
      menu0.add("o::=|\u0004\"PB={", (Image) null, (Image) null, 0);
  }

  @Test
  public void test07()  throws Throwable  {
      Maler maler0 = new Maler((GameManager) null);
      Menu menu0 = new Menu(maler0);
      menu0.add("", (Image) null, (Image) null, 1);
      menu0.add("", 0);
      menu0.add("o::=|\u0004\"PB={", (Image) null, (Image) null, 0);
  }

  @Test
  public void test09()  throws Throwable  {
      Maler maler0 = new Maler((GameManager) null);
      Menu menu0 = new Menu(maler0);
      menu0.add("", (Image) null, (Image) null, 1);
      menu0.add("", 0);
      menu0.add("", (Image) null, 38);
  }

  @Test
  public void test10()  throws Throwable  {
      Maler maler0 = new Maler((GameManager) null);
      Menu menu0 = new Menu((Maler) null);
      maler0.menu = menu0;
      maler0.menu.add("e", 1);
      menu0.add("e", 0);
      maler0.menu.add("", (-341));
      assertFalse(maler0.isFontSet());
  }

  @Test
  public void test12()  throws Throwable  {
      Maler maler0 = new Maler((GameManager) null);
      Menu menu0 = new Menu(maler0);
      menu0.setZeileAbstand((-261));
  }

  @Test
  public void test13()  throws Throwable  {
      Maler maler0 = new Maler((GameManager) null);
      maler0.tankErstellen();
      assertEquals(0, maler0.getX());
  }

  @Test
  public void test14()  throws Throwable  {
      Maler maler0 = new Maler((GameManager) null);
      Menu menu0 = new Menu(maler0);
      maler0.menu = menu0;
      maler0.menu.add("e", 1);
      maler0.menu.KeyBehandeln(10);
      assertFalse(maler0.isForegroundSet());
  }

  @Test
  public void test15()  throws Throwable  {
      Menu menu0 = new Menu((Maler) null);
      // Undeclared exception!
      try { 
        menu0.erscheinen((Graphics) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("Menu", e);
      }
  }


  @Test
  public void test17()  throws Throwable  {
      Maler maler0 = new Maler((GameManager) null);
      Menu menu0 = new Menu(maler0);
      menu0.options = null;
      // Undeclared exception!
      try { 
        menu0.add("", (Image) null, (Image) null, (-77));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("Menu", e);
      }
  }

  @Test
  public void test18()  throws Throwable  {
      Maler maler0 = new Maler((GameManager) null);
      Object[] objectArray0 = new Object[18];
      Menu menu0 = new Menu(maler0);
      Object[][] objectArray1 = new Object[3][7];
      DefaultTableModel defaultTableModel0 = new DefaultTableModel(objectArray1, objectArray0);
      Vector vector0 = defaultTableModel0.getDataVector();
      menu0.options = vector0;
      // Undeclared exception!
      try { 
        menu0.add("rIz]y@m\"4J-#`VV", (Image) null, (Image) null, (-1204));
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.util.Vector cannot be cast to Option
         //
         assertThrownBy("Menu", e);
      }
  }

  @Test
  public void test20()  throws Throwable  {
      Maler maler0 = new Maler((GameManager) null);
      Menu menu0 = new Menu(maler0);
      menu0.options = null;
      // Undeclared exception!
      try { 
        menu0.add("hDo*bE{K51NK16@+W/D", 25);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("Menu", e);
      }
  }

  @Test
  public void test21()  throws Throwable  {
      Maler maler0 = new Maler((GameManager) null);
      Menu menu0 = new Menu(maler0);
      maler0.menu = menu0;
      Object[] objectArray0 = new Object[0];
      DefaultTableModel defaultTableModel0 = new DefaultTableModel(objectArray0, 1);
      Vector vector0 = defaultTableModel0.getDataVector();
      menu0.options = vector0;
      // Undeclared exception!
      try { 
        maler0.menu.add("", (-347));
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.util.Vector cannot be cast to Option
         //
         assertThrownBy("Menu", e);
      }
  }

  @Test
  public void test22()  throws Throwable  {
      Maler maler0 = new Maler((GameManager) null);
      Menu menu0 = new Menu((Maler) null);
      maler0.menu = menu0;
      maler0.menu.add("e", 1);
      // Undeclared exception!
      try { 
        maler0.menu.KeyBehandeln(10);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("Menu", e);
      }
  }

  @Test
  public void test23()  throws Throwable  {
      Menu menu0 = new Menu((Maler) null);
      menu0.KeyBehandeln(10);
  }


  @Test
  public void test25()  throws Throwable  {
      Maler maler0 = new Maler((GameManager) null);
      Menu menu0 = new Menu(maler0);
      maler0.menu = menu0;
      maler0.menu.KeyBehandeln(40);
      assertFalse(maler0.isFontSet());
  }

  @Test
  public void test26()  throws Throwable  {
      Maler maler0 = new Maler((GameManager) null);
      Menu menu0 = new Menu(maler0);
      menu0.add("", (Image) null, (Image) null, 1);
      menu0.add("", (Image) null, (Image) null, 50);
      menu0.add("", (Image) null, 38);
  }

  @Test
  public void test27()  throws Throwable  {
      Maler maler0 = new Maler((GameManager) null);
      Menu menu0 = new Menu(maler0);
      menu0.add("!;W9YSBkst9v=411\"", (Image) null, 1);
      menu0.add("rIz]y@m\"4J-#`VV", (Image) null, (Image) null, (-1204));
      menu0.add("", 0);
  }

  @Test
  public void test28()  throws Throwable  {
      Maler maler0 = new Maler((GameManager) null);
      Menu menu0 = new Menu(maler0);
      menu0.add("", (-170));
      menu0.add("Arial", (-170));
  }

  @Test
  public void test29()  throws Throwable  {
      Maler maler0 = new Maler((GameManager) null);
      Menu menu0 = new Menu(maler0);
      menu0.add("", 0);
      menu0.KeyBehandeln(38);
  }

  @Test
  public void test30()  throws Throwable  {
      Maler maler0 = new Maler((GameManager) null);
      Menu menu0 = new Menu(maler0);
      menu0.setStyle(39);
  }






  @Test
  public void test36()  throws Throwable  {
      Maler maler0 = new Maler((GameManager) null);
      Menu menu0 = new Menu(maler0);
      maler0.menu = menu0;
      maler0.menu.setFontSize((-347));
      assertFalse(maler0.isFontSet());
  }


  @Test
  public void test38()  throws Throwable  {
      Maler maler0 = new Maler((GameManager) null);
      Menu menu0 = new Menu(maler0);
      menu0.setLogoKoordinate((-1956), 10);
      menu0.add("", 0);
      menu0.KeyBehandeln(38);
  }

  @Test
  public void test39()  throws Throwable  {
      Maler maler0 = new Maler((GameManager) null);
      Menu menu0 = new Menu(maler0);
      menu0.setKoordinateImage(25, 1704);
  }
}
