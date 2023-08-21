/*
 * This file was automatically generated by EvoSuite
 * Sun Oct 02 21:12:36 KST 2016
 */


import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ImageProducer;
import java.net.URL;
import java.util.Vector;

import javax.swing.DebugGraphics;
import javax.swing.JColorChooser;
import javax.swing.TransferHandler;
import javax.swing.table.DefaultTableModel;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import sun.awt.HeadlessToolkit;
import sun.awt.image.ToolkitImage;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class Menu_ESTest4   {
@BeforeClass
public static void initEvoSuiteFramework() {
}
@AfterClass
public static void exitEvoSuiteFramework() {
}

  @Test
  public void test00()  throws Throwable  {
      Maler maler0 = new Maler((GameManager) null);
      Menu menu0 = new Menu(maler0);
      menu0.setLogoKoordinate(2804, 1607);
      menu0.add("", 1);
      menu0.KeyBehandeln(39);
  }

  @Test
  public void test01()  throws Throwable  {
      Maler maler0 = new Maler((GameManager) null);
      Menu menu0 = new Menu(maler0);
      menu0.setLogoKoordinate(2804, 1607);
      menu0.KeyBehandeln(39);
  }

  @Test
  public void test02()  throws Throwable  {
      Maler maler0 = new Maler((GameManager) null);
      Menu menu0 = new Menu(maler0);
      menu0.KeyBehandeln(486);
  }

  @Test
  public void test04()  throws Throwable  {
      Maler maler0 = new Maler((GameManager) null);
      Menu menu0 = new Menu(maler0);
      JColorChooser jColorChooser0 = new JColorChooser();
      TransferHandler transferHandler0 = jColorChooser0.getTransferHandler();
      ToolkitImage toolkitImage0 = (ToolkitImage)transferHandler0.getDragImage();
      menu0.add("[ ", (Image) toolkitImage0, 37);
      menu0.add("[ ", (Image) toolkitImage0, 4237);
      menu0.add("", (Image) toolkitImage0, (Image) toolkitImage0, 90);
      menu0.KeyBehandeln(37);
      menu0.KeyBehandeln(37);
  }

  @Test
  public void test06()  throws Throwable  {
      Maler maler0 = new Maler((GameManager) null);
      Menu menu0 = new Menu(maler0);
      JColorChooser jColorChooser0 = new JColorChooser((Color) null);
      TransferHandler transferHandler0 = jColorChooser0.getTransferHandler();
      ToolkitImage toolkitImage0 = (ToolkitImage)transferHandler0.getDragImage();
      menu0.add("o'bE\"S)j/<l1#Os", (Image) toolkitImage0, (Image) toolkitImage0, 0);
      menu0.add("o'bE\"S)j/<l1#Os", (Image) toolkitImage0, (Image) toolkitImage0, 1);
  }

  @Test
  public void test07()  throws Throwable  {
      Maler maler0 = new Maler((GameManager) null);
      Menu menu0 = new Menu(maler0);
      menu0.add("", 1);
      menu0.add("", (Image) null, (Image) null, 1);
      menu0.add("", (Image) null, 38);
  }

  @Test
  public void test09()  throws Throwable  {
      Maler maler0 = new Maler((GameManager) null);
      Menu menu0 = new Menu(maler0);
      menu0.setLogoKoordinate(996, 2001);
      menu0.add("", 0);
      menu0.add("Arial", (-4094));
  }

  @Test
  public void test10()  throws Throwable  {
      Maler maler0 = new Maler((GameManager) null);
      Menu menu0 = new Menu(maler0);
      menu0.add("", 0);
      menu0.add("", 1);
  }

  @Test
  public void test11()  throws Throwable  {
      Maler maler0 = new Maler((GameManager) null);
      Menu menu0 = new Menu(maler0);
      menu0.setLogoKoordinate(996, 2001);
      menu0.add("", 0);
      menu0.add("", 0);
  }

  @Test
  public void test12()  throws Throwable  {
      Maler maler0 = new Maler((GameManager) null);
      Menu menu0 = new Menu(maler0);
      menu0.setKoordinateImage(1185, 765);
  }

  @Test
  public void test13()  throws Throwable  {
      Maler maler0 = new Maler((GameManager) null);
      Menu menu0 = new Menu(maler0);
      maler0.getGraphics();
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
  public void test14()  throws Throwable  {
      Maler maler0 = new Maler((GameManager) null);
      Menu menu0 = new Menu(maler0);
      menu0.add("", 1);
      menu0.KeyBehandeln(10);
  }


  @Test
  public void test16()  throws Throwable  {
      Maler maler0 = new Maler((GameManager) null);
      Menu menu0 = new Menu(maler0);
      DefaultTableModel defaultTableModel0 = new DefaultTableModel(1765, 0);
      Vector vector0 = defaultTableModel0.getDataVector();
      menu0.options = vector0;
      // Undeclared exception!
      try { 
        menu0.add("#)!YR;3]:2", (Image) null, 0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.util.Vector cannot be cast to Option
         //
         assertThrownBy("Menu", e);
      }
  }

  @Test
  public void test17()  throws Throwable  {
      Menu menu0 = new Menu((Maler) null);
      menu0.options = null;
      // Undeclared exception!
      try { 
        menu0.add((String) null, 30);
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
      Menu menu0 = new Menu((Maler) null);
      menu0.add("", 1);
      // Undeclared exception!
      try { 
        menu0.KeyBehandeln(10);
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
      menu0.add((String) null, 1);
      menu0.KeyBehandeln(38);
  }



  @Test
  public void test25()  throws Throwable  {
      Maler maler0 = new Maler((GameManager) null);
      Menu menu0 = new Menu(maler0);
      menu0.KeyBehandeln(40);
  }

  @Test
  public void test28()  throws Throwable  {
      Maler maler0 = new Maler((GameManager) null);
      Menu menu0 = new Menu(maler0);
      JColorChooser jColorChooser0 = new JColorChooser((Color) null);
      TransferHandler transferHandler0 = jColorChooser0.getTransferHandler();
      Vector vector0 = menu0.options;
      DefaultTableModel defaultTableModel0 = new DefaultTableModel((Vector) vector0, 680);
      Vector vector1 = defaultTableModel0.getDataVector();
      menu0.options = vector1;
      ToolkitImage toolkitImage0 = (ToolkitImage)transferHandler0.getDragImage();
      // Undeclared exception!
      try { 
        menu0.add("o'bE\"S)j/<l1#Os", (Image) toolkitImage0, (Image) toolkitImage0, 0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test29()  throws Throwable  {
      Maler maler0 = new Maler((GameManager) null);
      Menu menu0 = new Menu(maler0);
      JColorChooser jColorChooser0 = new JColorChooser();
      TransferHandler transferHandler0 = jColorChooser0.getTransferHandler();
      ToolkitImage toolkitImage0 = (ToolkitImage)transferHandler0.getDragImage();
      menu0.add("[ ", (Image) toolkitImage0, 37);
      menu0.add("[ ", (Image) toolkitImage0, 4237);
      menu0.add("", (Image) null, 0);
  }

  @Test
  public void test30()  throws Throwable  {
      Maler maler0 = new Maler((GameManager) null);
      Menu menu0 = new Menu(maler0);
      menu0.add("", 0);
      menu0.add("", 0);
      menu0.add("Arial", (-4094));
  }

  @Test
  public void test31()  throws Throwable  {
      Maler maler0 = new Maler((GameManager) null);
      Menu menu0 = new Menu(maler0);
      Vector<Frame> vector0 = new Vector<Frame>();
      DefaultTableModel defaultTableModel0 = new DefaultTableModel((Vector) vector0, 30);
      Vector vector1 = defaultTableModel0.getDataVector();
      menu0.options = vector1;
      // Undeclared exception!
      try { 
        menu0.add("", 1);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.util.Vector cannot be cast to Option
         //
         assertThrownBy("Menu", e);
      }
  }

  @Test
  public void test32()  throws Throwable  {
      Maler maler0 = new Maler((GameManager) null);
      Menu menu0 = new Menu(maler0);
      menu0.add("", 1);
      menu0.add("", (Image) null, 1);
  }

  @Test
  public void test33()  throws Throwable  {
      Maler maler0 = new Maler((GameManager) null);
      Menu menu0 = new Menu(maler0);
      menu0.setStyle(2867);
  }




  @Test
  public void test37()  throws Throwable  {
      Maler maler0 = new Maler((GameManager) null);
      Menu menu0 = new Menu(maler0);
      menu0.setFontSize(1295);
  }


  
}
