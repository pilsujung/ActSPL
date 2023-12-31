/*
 * This file was automatically generated by EvoSuite
 * Sun Aug 12 15:51:32 KST 2018
 */

package com.substanceofcode.rssreader.presentation;

import static org.evosuite.runtime.EvoAssertions.verifyException;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.fail;

import javax.microedition.lcdui.Alert;
import javax.microedition.lcdui.AlertType;
import javax.microedition.lcdui.Choice;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Image;
import javax.microedition.lcdui.Item;
import javax.microedition.lcdui.List;
import javax.microedition.midlet.MIDlet;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.substanceofcode.testlcdui.ChoiceGroup;
import com.substanceofcode.testlcdui.Form;
import com.substanceofcode.testlcdui.TextField;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class UiUtil_ESTest1 extends UiUtil_ESTest_scaffolding1 {
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
      Command command0 = new Command("", "", 0, 0);
      String[] stringArray0 = new String[5];
      Image[] imageArray0 = new Image[0];
      List list0 = new List("", 0, stringArray0, imageArray0);
      int int0 = UiUtil.getPlaceIndex(command0, 1, command0, command0, command0, list0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Command command0 = new Command("", 0, 0);
      Command command1 = new Command("", "", 0, 0);
      // Undeclared exception!
      try { 
        UiUtil.getPlaceIndex(command0, 0, command0, command1, command1, (List) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.substanceofcode.rssreader.presentation.UiUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      // Undeclared exception!
      try { 
        UiUtil.getCmdRsc("", (String) null, 0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("cz.cacek.ebook.util.ResourceProviderME", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      // Undeclared exception!
      try { 
        UiUtil.getCmdRsc("", "", 0, 1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("cz.cacek.ebook.util.ResourceProviderME", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      // Undeclared exception!
      try { 
        UiUtil.getCmdRsc("", 1, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("cz.cacek.ebook.util.ResourceProviderME", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Image image0 = UiUtil.getImage("");
      assertNull(image0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      // Undeclared exception!
      try { 
        UiUtil.restorePrevValues((Item[]) null, byteArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.substanceofcode.rssreader.presentation.UiUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      // Undeclared exception!
      try { 
        UiUtil.getSelectedIndex((Choice) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.substanceofcode.rssreader.presentation.UiUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      String[] stringArray0 = new String[5];
      // Undeclared exception!
      try { 
        UiUtil.getAddChoiceGroup((Form) null, "", stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.substanceofcode.rssreader.presentation.UiUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      // Undeclared exception!
      try { 
        UiUtil.delItems((javax.microedition.lcdui.Form) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.substanceofcode.rssreader.presentation.UiUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      // Undeclared exception!
      try { 
        UiUtil.delItems((com.substanceofcode.testlcdui.List) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.substanceofcode.rssreader.presentation.UiUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Alert alert0 = new Alert("", "", (Image) null, (AlertType) null);
      // Undeclared exception!
      try { 
        UiUtil.showAlert((MIDlet) null, alert0, alert0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.substanceofcode.rssreader.presentation.UiUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      List list0 = new List("", 0);
      int int0 = UiUtil.getSelectedIndex(list0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Item[] itemArray0 = new Item[3];
      TextField textField0 = new TextField("", "", 0, 0);
      itemArray0[2] = (Item) textField0;
      // Undeclared exception!
      try { 
        UiUtil.storeValues(itemArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.substanceofcode.rssreader.presentation.UiUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Item[] itemArray0 = new Item[5];
      String[] stringArray0 = new String[4];
      Image[] imageArray0 = new Image[9];
      ChoiceGroup choiceGroup0 = new ChoiceGroup("", 0, stringArray0, imageArray0);
      itemArray0[1] = (Item) choiceGroup0;
      byte[] byteArray0 = UiUtil.storeValues(itemArray0);
      assertEquals(4, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Item[] itemArray0 = new Item[5];
      byte[] byteArray0 = UiUtil.storeValues(itemArray0);
      assertEquals(0, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Item[] itemArray0 = new Item[2];
      TextField textField0 = new TextField((String) null, (String) null, 0, 0);
      itemArray0[0] = (Item) textField0;
      byte[] byteArray0 = new byte[1];
      UiUtil.restorePrevValues(itemArray0, byteArray0);
      assertArrayEquals(new byte[] {(byte)0}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Item[] itemArray0 = new Item[3];
      String[] stringArray0 = new String[6];
      Image[] imageArray0 = new Image[0];
      ChoiceGroup choiceGroup0 = new ChoiceGroup("", 0, stringArray0, imageArray0);
      itemArray0[2] = (Item) choiceGroup0;
      byte[] byteArray0 = new byte[4];
      UiUtil.restorePrevValues(itemArray0, byteArray0);
      assertEquals(3, itemArray0.length);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      List list0 = new List("", 0);
      int int0 = UiUtil.getPlaceIndex((Command) null, (-1), (Command) null, (Command) null, (Command) null, list0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Command command0 = new Command("", 0, 0);
      // Undeclared exception!
      try { 
        UiUtil.getPlaceIndex(command0, 0, (Command) null, command0, (Command) null, (List) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.substanceofcode.rssreader.presentation.UiUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      com.substanceofcode.testlcdui.List list0 = new com.substanceofcode.testlcdui.List("", 0);
      UiUtil.delItems(list0);
      assertEquals("", list0.getTitle());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Form form0 = new Form("");
      UiUtil.delItems((javax.microedition.lcdui.Form) form0);
      assertNull(form0.getTitle());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      List list0 = new List("", 0);
      Command[] commandArray0 = new Command[4];
      UiUtil.delCmds(list0, commandArray0);
      assertEquals(4, commandArray0.length);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Command[] commandArray0 = new Command[1];
      // Undeclared exception!
      try { 
        UiUtil.delCmds((Displayable) null, commandArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.substanceofcode.rssreader.presentation.UiUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Item[] itemArray0 = new Item[8];
      Form form0 = new Form("", itemArray0);
      ChoiceGroup choiceGroup0 = UiUtil.getAddChoiceGroup(form0, "", (String[]) null);
      assertNotNull(choiceGroup0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      UiUtil uiUtil0 = new UiUtil();
      javax.microedition.lcdui.Form form0 = new javax.microedition.lcdui.Form("");
      uiUtil0.commandAction((Command) null, form0);
  }
}
