/*
 * This file was automatically generated by EvoSuite
 * Sun Aug 12 16:46:38 KST 2018
 */

package com.substanceofcode.testlcdui;

import static org.junit.Assert.assertNull;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import static org.evosuite.runtime.EvoAssertions.*;
import static org.junit.Assert.fail;

import javax.microedition.lcdui.Command;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class TextBox_ESTest4 extends TextBox_ESTest_scaffolding4 {
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
      TextBox textBox0 = new TextBox("", "", 0, 0);
      textBox0.setCommandListener(textBox0);
      Command command0 = new Command("", (String) null, 0, 0);
      // Undeclared exception!
      textBox0.commandAction(command0, textBox0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      TextBox textBox0 = new TextBox("", "", 0, 0);
      Command command0 = new Command("", (String) null, 0, 0);
      // Undeclared exception!
      try { 
        textBox0.commandAction(command0, textBox0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.substanceofcode.testlcdui.TextBox", e);
      }
  }


  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      TextBox textBox0 = new TextBox("", "", 0, 0);
      textBox0.setString((String) null);
  }
}
