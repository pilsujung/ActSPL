/*
 * This file was automatically generated by EvoSuite
 * Sun Aug 12 18:27:51 KST 2018
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
public class ChoiceGroup_ESTest5 extends ChoiceGroup_ESTest_scaffolding5 {
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
      ChoiceGroup choiceGroup0 = new ChoiceGroup((String) null, 0);
      choiceGroup0.setSelectedIndex(1, false);
  }



  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ChoiceGroup choiceGroup0 = new ChoiceGroup((String) null, 0);
      choiceGroup0.set((-1), "", (Image) null);
  }




  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      String[] stringArray0 = new String[0];
      Image[] imageArray0 = new Image[0];
      ChoiceGroup choiceGroup0 = new ChoiceGroup("", 0, stringArray0, imageArray0);
      Command command0 = new Command("", "", 0, 0);
      choiceGroup0.setItemCommandListener(choiceGroup0);
      // Undeclared exception!
      choiceGroup0.commandAction(command0, choiceGroup0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ChoiceGroup choiceGroup0 = new ChoiceGroup("", 0, (String[]) null, (Image[]) null);
      boolean[] booleanArray0 = new boolean[2];
      int int0 = choiceGroup0.getSelectedFlags(booleanArray0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ChoiceGroup choiceGroup0 = new ChoiceGroup("", 0);
      boolean[] booleanArray0 = new boolean[16];
      choiceGroup0.setSelectedFlags(booleanArray0);
      assertEquals(16, booleanArray0.length);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      String[] stringArray0 = new String[9];
      Image[] imageArray0 = new Image[2];
      ChoiceGroup choiceGroup0 = new ChoiceGroup("", 0, stringArray0, imageArray0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      String[] stringArray0 = new String[0];
      Image[] imageArray0 = new Image[0];
      ChoiceGroup choiceGroup0 = new ChoiceGroup("", 0, stringArray0, imageArray0);
      Command command0 = new Command("", "", 0, 0);
      // Undeclared exception!
      try { 
        choiceGroup0.commandAction(command0, choiceGroup0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.substanceofcode.testlcdui.ChoiceGroup", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      String[] stringArray0 = new String[0];
      Image[] imageArray0 = new Image[0];
      ChoiceGroup choiceGroup0 = new ChoiceGroup("", 0, stringArray0, imageArray0);
      choiceGroup0.setSelectedIndex(0, false);
  }



}