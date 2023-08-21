/*
 * This file was automatically generated by EvoSuite
 * Mon Aug 13 02:58:27 GMT+18:00 2018
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
public class TextField_ESTest2 extends TextField_ESTest_scaffolding2 {
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
      TextField textField0 = new TextField("", "", 0, 0);
      Command command0 = new Command((String) null, 0, 0);
      // Undeclared exception!
      try { 
        textField0.commandAction(command0, textField0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.substanceofcode.testlcdui.TextField", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      TextField textField0 = new TextField("", "", 0, 0);
      String string0 = textField0.getString();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      TextField textField0 = new TextField("", "", 0, 0);
      textField0.setItemCommandListener(textField0);
      Command command0 = new Command((String) null, 0, 0);
      // Undeclared exception!
      textField0.commandAction(command0, textField0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      TextField textField0 = new TextField((String) null, (String) null, 0, 0);
      textField0.setString((String) null);
  }
}
