/*
 * This file was automatically generated by EvoSuite
 * Sun Aug 12 17:50:54 KST 2018
 */

package com.substanceofcode.rssreader.presentation;

import static org.junit.Assert.assertArrayEquals;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import static org.evosuite.runtime.EvoAssertions.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.fail;

import javax.microedition.lcdui.Alert;
import javax.microedition.lcdui.AlertType;
import javax.microedition.lcdui.Choice;
import javax.microedition.lcdui.Command;
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
public class UiUtil_ESTest2 extends UiUtil_ESTest_scaffolding2 {
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
      // Undeclared exception!
      try { 
        UiUtil.getCmdRsc("", (-1), 0);
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
      Form form0 = new Form("");
      String[] stringArray0 = new String[3];
      ChoiceGroup choiceGroup0 = UiUtil.getAddChoiceGroup(form0, "", stringArray0);
      assertNotNull(choiceGroup0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
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
        UiUtil.getPlaceIndex((Command) null, 0, (Command) null, (Command) null, (Command) null, (List) null);
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
      Alert alert0 = new Alert((String) null, "", (Image) null, (AlertType) null);
      // Undeclared exception!
      try { 
        UiUtil.delCmds(alert0, (Command[]) null);
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
      Alert alert0 = new Alert("");
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
  public void test11()  throws Throwable  {
      javax.microedition.lcdui.ChoiceGroup choiceGroup0 = new javax.microedition.lcdui.ChoiceGroup("", 0);
      int int0 = UiUtil.getSelectedIndex(choiceGroup0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Item[] itemArray0 = new Item[9];
      TextField textField0 = new TextField("", "", 0, 0);
      itemArray0[3] = (Item) textField0;
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
  public void test13()  throws Throwable  {
      Item[] itemArray0 = new Item[5];
      ChoiceGroup choiceGroup0 = new ChoiceGroup("", 0);
      itemArray0[2] = (Item) choiceGroup0;
      byte[] byteArray0 = UiUtil.storeValues(itemArray0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Item[] itemArray0 = new Item[5];
      byte[] byteArray0 = UiUtil.storeValues(itemArray0);
      assertArrayEquals(new byte[] {}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Item[] itemArray0 = new Item[6];
      TextField textField0 = new TextField("", "", 0, 0);
      itemArray0[4] = (Item) textField0;
      byte[] byteArray0 = new byte[0];
      UiUtil.restorePrevValues(itemArray0, byteArray0);
      assertEquals(6, itemArray0.length);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Item[] itemArray0 = new Item[6];
      ChoiceGroup choiceGroup0 = new ChoiceGroup("", 0);
      itemArray0[0] = (Item) choiceGroup0;
      byte[] byteArray0 = new byte[7];
      UiUtil.restorePrevValues(itemArray0, byteArray0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Command command0 = new Command("", 0, 0);
      String[] stringArray0 = new String[9];
      Image[] imageArray0 = new Image[1];
      List list0 = new List("", 0, stringArray0, imageArray0);
      int int0 = UiUtil.getPlaceIndex((Command) null, 1, command0, (Command) null, command0, list0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      List list0 = new List("", 0);
      int int0 = UiUtil.getPlaceIndex((Command) null, (-2), (Command) null, (Command) null, (Command) null, list0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      String[] stringArray0 = new String[0];
      Image[] imageArray0 = new Image[7];
      List list0 = new List("", 0, stringArray0, imageArray0);
      int int0 = UiUtil.getPlaceIndex((Command) null, (-1), (Command) null, (Command) null, (Command) null, list0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Command command0 = new Command("", "", 0, 0);
      Command command1 = new Command("", 0, 0);
      com.substanceofcode.testlcdui.List list0 = new com.substanceofcode.testlcdui.List("", 0);
      int int0 = UiUtil.getPlaceIndex(command0, 0, command1, command1, command0, list0);
      assertEquals(0, int0);
  }



  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Alert alert0 = new Alert((String) null, "", (Image) null, (AlertType) null);
      Command[] commandArray0 = new Command[5];
      UiUtil.delCmds(alert0, commandArray0);
      assertEquals(5, commandArray0.length);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      String[] stringArray0 = new String[5];
      // Undeclared exception!
      try { 
        UiUtil.getAddChoiceGroup((Form) null, (String) null, stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.substanceofcode.rssreader.presentation.UiUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      UiUtil uiUtil0 = new UiUtil();
      Alert alert0 = new Alert("", "", (Image) null, (AlertType) null);
      uiUtil0.commandAction((Command) null, alert0);
  }
}