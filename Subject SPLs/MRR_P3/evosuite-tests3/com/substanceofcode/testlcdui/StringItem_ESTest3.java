/*
 * This file was automatically generated by EvoSuite
 * Sun Aug 12 19:37:40 KST 2018
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
public class StringItem_ESTest3 extends StringItem_ESTest_scaffolding3 {
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
      StringItem stringItem0 = new StringItem("", "", 0);
      String string0 = stringItem0.getText();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      StringItem stringItem0 = new StringItem("", "", 0);
      Command command0 = new Command((String) null, 0, 0);
      // Undeclared exception!
      try { 
        stringItem0.commandAction(command0, stringItem0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.substanceofcode.testlcdui.StringItem", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      StringItem stringItem0 = new StringItem("", "", 0);
      stringItem0.setItemCommandListener(stringItem0);
      Command command0 = new Command((String) null, 0, 0);
      // Undeclared exception!
      stringItem0.commandAction(command0, stringItem0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      StringItem stringItem0 = new StringItem((String) null, (String) null);
      stringItem0.setText((String) null);
  }
}
