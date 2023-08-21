/*
 * This file was automatically generated by EvoSuite
 * Sun Aug 12 19:37:01 KST 2018
 */

package com.substanceofcode.testlcdui;

import static org.junit.Assert.assertEquals;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import static org.evosuite.runtime.EvoAssertions.*;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.fail;

import javax.microedition.lcdui.Alert;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.Image;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class List_ESTest3 extends List_ESTest_scaffolding3 {
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
      List list0 = new List("", 0);
      list0.setSelectedIndex((-1), true);
      assertEquals("", list0.getTitle());
  }



  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      List list0 = new List("", 0);
      list0.set((-1), "", (Image) null);
      assertEquals("", list0.getTitle());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      List list0 = new List("", 0);
      list0.insert(1, "", (Image) null);
      assertEquals("", list0.getTitle());
  }


  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      List list0 = new List("O", 0);
      String string0 = list0.getTitle();
      assertEquals("O", string0);
  }


  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      List list0 = new List("", 0);
      Form form0 = new Form("");
      // Undeclared exception!
      try { 
        list0.outputCmdAct((Command) null, form0, (Command) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.substanceofcode.testlcdui.List", e);
      }
  }


  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      List list0 = new List("", 0);
      Command command0 = new Command("", "", 0, 0);
      Alert alert0 = new Alert("");
      Command command1 = new Command("", 0, 0);
      list0.outputCmdAct(command1, alert0, command0);
      assertFalse(command1.equals((Object)command0));
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      String[] stringArray0 = new String[8];
      Image[] imageArray0 = new Image[7];
      List list0 = new List("", 0, stringArray0, imageArray0);
      Command command0 = new Command(stringArray0[5], stringArray0[0], 0, 0);
      list0.outputCmdAct(command0, list0, command0);
      assertEquals("", list0.getTitle());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      List list0 = new List("", 0);
      TextBox textBox0 = new TextBox("", "", 0, 0);
      list0.setCommandListener(textBox0);
      assertEquals("", list0.getTitle());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Image[] imageArray0 = new Image[1];
      List list0 = new List("", 0);
      list0.insert(0, "", imageArray0[0]);
      assertEquals(1, imageArray0.length);
  }




}
