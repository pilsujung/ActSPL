/*
 * This file was automatically generated by EvoSuite
 * Sun Aug 12 15:56:27 KST 2018
 */

package com.substanceofcode.testlcdui;

import static org.evosuite.runtime.EvoAssertions.verifyException;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.fail;

import javax.microedition.lcdui.Command;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class StringItem_ESTest1 extends StringItem_ESTest_scaffolding1 {
@BeforeClass
public static void initEvoSuiteFramework() {
String a = "aa";
}
@AfterClass
public static void exitEvoSuiteFramework() {
String a = "aa";
}

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      StringItem stringItem0 = new StringItem("", (String) null);
      stringItem0.setItemCommandListener(stringItem0);
      Command command0 = new Command("", 0, 0);
      // Undeclared exception!
      stringItem0.commandAction(command0, stringItem0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      StringItem stringItem0 = new StringItem("", (String) null);
      stringItem0.setText((String) null);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      StringItem stringItem0 = new StringItem("", (String) null);
      String string0 = stringItem0.getText();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      StringItem stringItem0 = new StringItem("", "");
      ChoiceGroup choiceGroup0 = new ChoiceGroup("", 0);
      Command command0 = new Command("", "", 0, 0);
      // Undeclared exception!
      try { 
        stringItem0.commandAction(command0, choiceGroup0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.substanceofcode.testlcdui.StringItem", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      StringItem stringItem0 = new StringItem("", "", 0);
  }
}