/*
 * This file was automatically generated by EvoSuite
 * Sun Aug 12 17:52:06 KST 2018
 */

package com.substanceofcode.testlcdui;

import static org.junit.Assert.assertEquals;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import static org.evosuite.runtime.EvoAssertions.*;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.fail;

import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.Image;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class ChoiceGroup_ESTest2 extends ChoiceGroup_ESTest_scaffolding2 {
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
      ChoiceGroup choiceGroup0 = new ChoiceGroup("", 0);
      choiceGroup0.setSelectedIndex(1, false);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ChoiceGroup choiceGroup0 = new ChoiceGroup("", 0);
      choiceGroup0.delete((-1));
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ChoiceGroup choiceGroup0 = new ChoiceGroup("", 0);
      boolean boolean0 = choiceGroup0.isSelected((-1));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ChoiceGroup choiceGroup0 = new ChoiceGroup("", 0);
      choiceGroup0.set(1, "", (Image) null);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      String[] stringArray0 = new String[1];
      Image[] imageArray0 = new Image[3];
      ChoiceGroup choiceGroup0 = new ChoiceGroup("", 0, stringArray0, imageArray0);
      choiceGroup0.insert(1, "", (Image) null);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      String[] stringArray0 = new String[3];
      Image[] imageArray0 = new Image[2];
      ChoiceGroup choiceGroup0 = new ChoiceGroup((String) null, 0, stringArray0, imageArray0);
      // Undeclared exception!
      try { 
        choiceGroup0.setSelectedFlags((boolean[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.substanceofcode.testlcdui.ChoiceGroup", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      String[] stringArray0 = new String[2];
      Image[] imageArray0 = new Image[0];
      ChoiceGroup choiceGroup0 = new ChoiceGroup("", 0, stringArray0, imageArray0);
      // Undeclared exception!
      try { 
        choiceGroup0.getSelectedFlags((boolean[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.substanceofcode.testlcdui.ChoiceGroup", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      String[] stringArray0 = new String[0];
      Image[] imageArray0 = new Image[0];
      ChoiceGroup choiceGroup0 = new ChoiceGroup("", 0, stringArray0, imageArray0);
      boolean[] booleanArray0 = new boolean[3];
      int int0 = choiceGroup0.getSelectedFlags(booleanArray0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ChoiceGroup choiceGroup0 = new ChoiceGroup("", 0);
      boolean[] booleanArray0 = new boolean[5];
      choiceGroup0.setSelectedFlags(booleanArray0);
      assertEquals(5, booleanArray0.length);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Image[] imageArray0 = new Image[0];
      ChoiceGroup choiceGroup0 = new ChoiceGroup("", 0, (String[]) null, imageArray0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ChoiceGroup choiceGroup0 = new ChoiceGroup("", 0);
      Command command0 = new Command("", 0, 0);
      StringItem stringItem0 = new StringItem("", "");
      // Undeclared exception!
      try { 
        choiceGroup0.commandAction(command0, stringItem0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.substanceofcode.testlcdui.ChoiceGroup", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      String[] stringArray0 = new String[6];
      Image[] imageArray0 = new Image[1];
      ChoiceGroup choiceGroup0 = new ChoiceGroup("", 0, stringArray0, imageArray0);
      choiceGroup0.setSelectedIndex(0, true);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ChoiceGroup choiceGroup0 = new ChoiceGroup("", 0);
      choiceGroup0.setItemCommandListener(choiceGroup0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ChoiceGroup choiceGroup0 = new ChoiceGroup("", 0);
      choiceGroup0.set(0, (String) null, (Image) null);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ChoiceGroup choiceGroup0 = new ChoiceGroup("", 0);
      choiceGroup0.deleteAll();
  }



  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      String[] stringArray0 = new String[6];
      Image[] imageArray0 = new Image[1];
      ChoiceGroup choiceGroup0 = new ChoiceGroup("", 0, stringArray0, imageArray0);
      int int0 = choiceGroup0.append("", (Image) null);
      assertEquals(0, int0);
  }
}
