/*
 * This file was automatically generated by EvoSuite
 * Sun Aug 12 18:37:27 KST 2018
 */

package com.substanceofcode.testutil.presentation;

import static org.junit.Assert.assertNull;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import static org.evosuite.runtime.EvoAssertions.*;
import static org.junit.Assert.fail;

import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.TextBox;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.substanceofcode.rssreader.presentation.RssReaderMIDlet;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class TestingForm_ESTest5 extends TestingForm_ESTest_scaffolding5 {
@BeforeClass
public static void initEvoSuiteFramework() {
String a = "aa";
}
@AfterClass
public static void exitEvoSuiteFramework() {
String a = "aa";
}


  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      TestingForm testingForm0 = new TestingForm((RssReaderMIDlet) null);
      Command command0 = new Command("", 0, 0);
      TextBox textBox0 = new TextBox("", "", 0, 0);
      testingForm0.commandAction(command0, textBox0);
      assertNull(testingForm0.getTitle());
  }
}
