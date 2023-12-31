/*
 * This file was automatically generated by EvoSuite
 * Sun Oct 02 22:21:38 KST 2016
 */


import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
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
public class Menu_ESTest5   {
@BeforeClass
public static void initEvoSuiteFramework() {
}
@AfterClass
public static void exitEvoSuiteFramework() {
}

  @Test
  public void test02()  throws Throwable  {
      Maler maler0 = new Maler((GameManager) null);
      Menu menu0 = new Menu(maler0);
      menu0.add("", (Image) null, (Image) null, 1);
      menu0.setLogoKoordinate(39, 2419);
      menu0.add("", (Image) null, (Image) null, 0);
      menu0.KeyBehandeln(39);
  }

  @Test
  public void test03()  throws Throwable  {
      Maler maler0 = new Maler((GameManager) null);
      Menu menu0 = new Menu(maler0);
      menu0.add("", (Image) null, (Image) null, 1);
      menu0.setLogoKoordinate(39, 2419);
      menu0.KeyBehandeln(39);
  }

  @Test
  public void test05()  throws Throwable  {
      Maler maler0 = new Maler((GameManager) null);
      Menu menu0 = new Menu(maler0);
      menu0.add("", (Image) null, 0);
      menu0.add("", 0);
      menu0.add("", (Image) null, (Image) null, (-1172));
  }

  @Test
  public void test07()  throws Throwable  {
      Maler maler0 = new Maler((GameManager) null);
      Menu menu0 = new Menu(maler0);
      menu0.add("", (Image) null, 0);
      menu0.add("", 0);
      menu0.add("", (Image) null, (Image) null, 2256);
  }

  @Test
  public void test08()  throws Throwable  {
      Maler maler0 = new Maler((GameManager) null);
      Menu menu0 = new Menu(maler0);
      menu0.add("", (Image) null, (Image) null, 1);
      menu0.add("", (Image) null, (Image) null, 1);
      menu0.add("", (Image) null, 0);
  }

  @Test
  public void test09()  throws Throwable  {
      Maler maler0 = new Maler((GameManager) null);
      Menu menu0 = new Menu(maler0);
      menu0.add("", (Image) null, 70);
      menu0.add((String) null, (Image) null, (-2084));
  }

  @Test
  public void test10()  throws Throwable  {
      Maler maler0 = new Maler((GameManager) null);
      Menu menu0 = new Menu(maler0);
      menu0.add("", (Image) null, (Image) null, 1);
      menu0.setLogoKoordinate(39, 2419);
      menu0.add("", (Image) null, 3);
  }

  @Test
  public void test11()  throws Throwable  {
      Maler maler0 = new Maler((GameManager) null);
      Menu menu0 = new Menu(maler0);
      menu0.add("", (Image) null, (Image) null, 0);
      menu0.add("", 32);
      menu0.add("", (Image) null, 1);
  }

  @Test
  public void test12()  throws Throwable  {
      Maler maler0 = new Maler((GameManager) null);
      Menu menu0 = new Menu(maler0);
      menu0.add("", (Image) null, (Image) null, 4201);
      menu0.add("", 405);
      menu0.add("VBk#Y&vO#)IjGzkv", 20);
  }

  @Test
  public void test13()  throws Throwable  {
      Maler maler0 = new Maler((GameManager) null);
      Menu menu0 = new Menu(maler0);
      menu0.add("", (Image) null, 0);
      menu0.add("", (Image) null, (Image) null, 2256);
      menu0.add("", 603);
  }

  @Test
  public void test14()  throws Throwable  {
      Maler maler0 = new Maler((GameManager) null);
      Menu menu0 = new Menu(maler0);
      menu0.add("", (Image) null, 0);
      menu0.add("", 0);
      menu0.add("", 603);
  }


  @Test
  public void test16()  throws Throwable  {
      Maler maler0 = new Maler((GameManager) null);
      Menu menu0 = new Menu(maler0);
      menu0.setLogoKoordinate(39, 2419);
      menu0.KeyBehandeln(39);
  }

  @Test
  public void test17()  throws Throwable  {
      Maler maler0 = new Maler((GameManager) null);
      Menu menu0 = new Menu(maler0);
      Image image0 = null;
      try {  
      image0 = maler0.offScreenImage;
      } catch(NullPointerException e) {}
  }


  @Test
  public void test19()  throws Throwable  {
      Menu menu0 = new Menu((Maler) null);
      DebugGraphics debugGraphics0 = new DebugGraphics((Graphics) null);
      // Undeclared exception!
      try { 
        menu0.erscheinen(debugGraphics0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // javax.swing.DebugGraphics cannot be cast to java.awt.Graphics2D
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
        menu0.add("", (Image) null, (Image) null, 1);
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
      menu0.options = null;
      // Undeclared exception!
      try { 
        menu0.add("", (Image) null, 1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("Menu", e);
      }
  }

  @Test
  public void test22()  throws Throwable  {
      Maler maler0 = new Maler((GameManager) null);
      Menu menu0 = new Menu(maler0);
      menu0.options = null;
      // Undeclared exception!
      try { 
        menu0.KeyBehandeln(38);
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
      Maler maler0 = new Maler((GameManager) null);
      Menu menu0 = new Menu(maler0);
      Object[] objectArray0 = new Object[8];
      DefaultTableModel defaultTableModel0 = new DefaultTableModel(objectArray0, 104);
      Vector vector0 = defaultTableModel0.getDataVector();
      menu0.options = vector0;
      // Undeclared exception!
      try { 
        menu0.KeyBehandeln(10);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.util.Vector cannot be cast to Option
         //
         assertThrownBy("Menu", e);
      }
  }


  @Test
  public void test25()  throws Throwable  {
      Maler maler0 = new Maler((GameManager) null);
      Menu menu0 = new Menu(maler0);
      menu0.add("", (Image) null, (Image) null, 1);
      menu0.KeyBehandeln(10);
  }



  @Test
  public void test28()  throws Throwable  {
      Maler maler0 = new Maler((GameManager) null);
      Menu menu0 = new Menu(maler0);
      menu0.add("", 2);
      menu0.KeyBehandeln(40);
  }

  @Test
  public void test29()  throws Throwable  {
      Maler maler0 = new Maler((GameManager) null);
      Menu menu0 = new Menu(maler0);
      menu0.KeyBehandeln(1209);
  }

  @Test
  public void test30()  throws Throwable  {
      Maler maler0 = new Maler((GameManager) null);
      Menu menu0 = new Menu(maler0);
      menu0.add("", (Image) null, (Image) null, 0);
      menu0.add("", (Image) null, 0);
  }



  @Test
  public void test35()  throws Throwable  {
      Maler maler0 = new Maler((GameManager) null);
      maler0.tankErstellen();
      assertTrue(maler0.isEnabled());
  }

  @Test
  public void test36()  throws Throwable  {
      Maler maler0 = new Maler((GameManager) null);
      Menu menu0 = new Menu(maler0);
      menu0.setStyle((-332));
  }



  @Test
  public void test39()  throws Throwable  {
      Maler maler0 = new Maler((GameManager) null);
      Menu menu0 = new Menu(maler0);
      menu0.setFontSize((-1082));
  }

  @Test
  public void test40()  throws Throwable  {
      Maler maler0 = new Maler((GameManager) null);
      Menu menu0 = new Menu(maler0);
      menu0.setWaehlbar(true);
  }


  @Test
  public void test42()  throws Throwable  {
      Maler maler0 = new Maler((GameManager) null);
      Menu menu0 = new Menu(maler0);
      menu0.setKoordinateImage(0, 40);
  }
}
