/*
 * This file was automatically generated by EvoSuite
 * Sun Aug 12 18:01:14 KST 2018
 */

package com.substanceofcode.testutil.presentation;

import static org.junit.Assert.assertEquals;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import static org.evosuite.runtime.EvoAssertions.*;
import static org.junit.Assert.fail;

import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.Item;
import javax.microedition.lcdui.TextBox;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.substanceofcode.rssreader.presentation.RssReaderMIDlet;
import com.substanceofcode.testlcdui.Form;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class EncodingList_ESTest2 extends EncodingList_ESTest_scaffolding2 {
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
      EncodingList encodingList0 = new EncodingList((RssReaderMIDlet) null);
      Item[] itemArray0 = new Item[0];
      Form form0 = new Form("", itemArray0);
      // Undeclared exception!
      try { 
        encodingList0.commandAction((Command) null, form0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.substanceofcode.testlcdui.List", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      EncodingList encodingList0 = new EncodingList((RssReaderMIDlet) null);
      Command command0 = new Command("", "", 0, 0);
      TextBox textBox0 = new TextBox((String) null, "", 0, 0);
      encodingList0.commandAction(command0, textBox0);
      assertEquals("Encoding List", encodingList0.getTitle());
  }
}
