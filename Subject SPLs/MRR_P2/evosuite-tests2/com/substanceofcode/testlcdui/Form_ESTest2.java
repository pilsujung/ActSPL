/*
 * This file was automatically generated by EvoSuite
 * Sun Aug 12 17:53:36 KST 2018
 */

package com.substanceofcode.testlcdui;

import static org.junit.Assert.assertEquals;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import static org.evosuite.runtime.EvoAssertions.*;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.fail;

import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.Image;
import javax.microedition.lcdui.ImageItem;
import javax.microedition.lcdui.Item;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class Form_ESTest2 extends Form_ESTest_scaffolding2 {
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
      Item[] itemArray0 = new Item[3];
      Form form0 = new Form("T", itemArray0);
      String string0 = form0.getTitle();
      assertEquals("T", string0);
  }


  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Form form0 = new Form("");
      // Undeclared exception!
      try { 
        form0.insert(0, (Item) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.substanceofcode.testlcdui.Form", e);
      }
  }



  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Form form0 = new Form("");
      Command command0 = new Command("", 0, 0);
      String[] stringArray0 = new String[0];
      Image[] imageArray0 = new Image[1];
      List list0 = new List("", 0, stringArray0, imageArray0);
      form0.outputCmdAct(command0, list0);
      assertEquals("", list0.getTitle());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Form form0 = new Form("");
      // Undeclared exception!
      try { 
        form0.outputCmdAct((Command) null, form0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.substanceofcode.testlcdui.Form", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Form form0 = new Form("");
      Command command0 = new Command("", 0, 0);
      TextBox textBox0 = new TextBox("", "", 0, 0);
      form0.outputCmdAct(command0, textBox0);
      assertNull(form0.getTitle());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Form form0 = new Form("", (Item[]) null);
      javax.microedition.lcdui.StringItem stringItem0 = new javax.microedition.lcdui.StringItem("", "", 0);
      form0.set(0, stringItem0);
      assertEquals("", form0.getTitle());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Form form0 = new Form("");
      javax.microedition.lcdui.TextField textField0 = new javax.microedition.lcdui.TextField((String) null, "", 0, 0);
      form0.set(0, textField0);
      assertNull(form0.getTitle());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Form form0 = new Form("");
      ImageItem imageItem0 = new ImageItem("", (Image) null, 0, "");
      form0.set(0, imageItem0);
      assertNull(form0.getTitle());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Item[] itemArray0 = new Item[3];
      ImageItem imageItem0 = new ImageItem("", (Image) null, 0, "");
      Form form0 = new Form("", itemArray0);
      form0.insert(0, imageItem0);
      assertEquals("", form0.getTitle());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Form form0 = new Form("", (Item[]) null);
      javax.microedition.lcdui.StringItem stringItem0 = new javax.microedition.lcdui.StringItem("", "", 0);
      form0.insert(0, stringItem0);
      assertEquals("", form0.getTitle());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Form form0 = new Form("");
      TextField textField0 = new TextField("", "", 0, 0);
      form0.insert(0, textField0);
      assertNull(form0.getTitle());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Form form0 = new Form("");
      ChoiceGroup choiceGroup0 = new ChoiceGroup("", 0);
      form0.insert(0, choiceGroup0);
      assertNull(form0.getTitle());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Form form0 = new Form("");
      ImageItem imageItem0 = new ImageItem("", (Image) null, 0, "");
      int int0 = form0.append((Item) imageItem0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Form form0 = new Form("");
      javax.microedition.lcdui.StringItem stringItem0 = new javax.microedition.lcdui.StringItem((String) null, "");
      int int0 = form0.append((Item) stringItem0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Form form0 = new Form("");
      javax.microedition.lcdui.TextField textField0 = new javax.microedition.lcdui.TextField((String) null, "", 0, 0);
      int int0 = form0.append((Item) textField0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Form form0 = new Form("");
      ChoiceGroup choiceGroup0 = new ChoiceGroup("", 0);
      int int0 = form0.append((Item) choiceGroup0);
      assertEquals(0, int0);
  }


  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Item[] itemArray0 = new Item[3];
      Form form0 = new Form("", itemArray0);
      TextBox textBox0 = new TextBox("", "", 0, 0);
      form0.setCommandListener(textBox0);
      assertEquals("", form0.getTitle());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Item[] itemArray0 = new Item[3];
      Form form0 = new Form("", itemArray0);
      form0.deleteAll();
      assertEquals("", form0.getTitle());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Form form0 = new Form("");
      int int0 = form0.append("");
      assertEquals(0, int0);
  }
}
