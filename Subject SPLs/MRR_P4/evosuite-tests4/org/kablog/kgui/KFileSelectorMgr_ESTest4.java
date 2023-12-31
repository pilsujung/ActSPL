/*
 * This file was automatically generated by EvoSuite
 * Sun Aug 12 17:23:32 KST 2018
 */

package org.kablog.kgui;

import static org.junit.Assert.assertNotSame;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import static org.evosuite.runtime.EvoAssertions.*;
import static org.junit.Assert.fail;

import javax.microedition.lcdui.AlertType;
import javax.microedition.lcdui.Form;
import javax.microedition.lcdui.Item;
import javax.microedition.lcdui.TextBox;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.substanceofcode.rssreader.presentation.RssReaderMIDlet;
import com.substanceofcode.testlcdui.TextField;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class KFileSelectorMgr_ESTest4 extends KFileSelectorMgr_ESTest_scaffolding4 {
@BeforeClass
public static void initEvoSuiteFramework() {
String a = "aa";
}
@AfterClass
public static void exitEvoSuiteFramework() {
String a = "aa";
}







  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      KFileSelectorMgr kFileSelectorMgr0 = new KFileSelectorMgr();
      TextBox textBox0 = new TextBox("", "", 0, 0);
      // Undeclared exception!
      try { 
        kFileSelectorMgr0.reqSetVisible(textBox0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.kablog.kgui.KFileSelectorMgr", e);
      }
  }


  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      KFileSelectorMgr kFileSelectorMgr0 = new KFileSelectorMgr();
      kFileSelectorMgr0.bDebug = true;
      Form form0 = new Form("", (Item[]) null);
      TextField textField0 = new TextField("", "", 0, 0);
      kFileSelectorMgr0.doLaunchSelector((RssReaderMIDlet) null, form0, textField0);
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      KFileSelectorMgr kFileSelectorMgr0 = new KFileSelectorMgr();
      TextField textField0 = new TextField("", "", 0, 0);
      kFileSelectorMgr0.doLaunchSelector((RssReaderMIDlet) null, (Form) null, textField0);
  }
}
