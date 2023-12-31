/*
 * This file was automatically generated by EvoSuite
 * Sun Aug 12 20:13:09 KST 2018
 */

package org.kablog.kgui;

import static org.junit.Assert.assertNotSame;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import static org.evosuite.runtime.EvoAssertions.*;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.fail;

import javax.microedition.lcdui.Alert;
import javax.microedition.lcdui.AlertType;
import javax.microedition.lcdui.TextField;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.substanceofcode.rssreader.presentation.RssReaderMIDlet;
import com.substanceofcode.testlcdui.Form;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class KFileSelectorMgr_ESTest3 extends KFileSelectorMgr_ESTest_scaffolding3 {
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
      KFileSelectorMgr kFileSelectorMgr0 = new KFileSelectorMgr();
      Form form0 = new Form("");
      kFileSelectorMgr0.doLaunchSelector((RssReaderMIDlet) null, form0, (TextField) null);
      assertNull(form0.getTitle());
  }





  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      KFileSelectorMgr kFileSelectorMgr0 = new KFileSelectorMgr();
      KFileSelectorMgr kFileSelectorMgr1 = new KFileSelectorMgr();
      kFileSelectorMgr0.setViewParent(kFileSelectorMgr1);
      Alert alert0 = new Alert("");
      // Undeclared exception!
      try { 
        kFileSelectorMgr0.reqSetVisible(alert0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.kablog.kgui.KFileSelectorMgr", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      KFileSelectorMgr kFileSelectorMgr0 = new KFileSelectorMgr();
      Alert alert0 = new Alert("");
      // Undeclared exception!
      try { 
        kFileSelectorMgr0.reqSetVisible(alert0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.kablog.kgui.KFileSelectorMgr", e);
      }
  }


  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      KFileSelectorMgr kFileSelectorMgr0 = new KFileSelectorMgr();
      com.substanceofcode.testlcdui.TextField textField0 = new com.substanceofcode.testlcdui.TextField("", "", 0, 0);
      kFileSelectorMgr0.doLaunchSelector((RssReaderMIDlet) null, (javax.microedition.lcdui.Form) null, textField0);
  }
}
