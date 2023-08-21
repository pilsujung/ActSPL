/*
 * This file was automatically generated by EvoSuite
 * Sun Aug 12 16:29:59 KST 2018
 */

package com.substanceofcode.rssreader.presentation;

import static org.junit.Assert.fail;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import static org.evosuite.runtime.EvoAssertions.*;

import javax.microedition.lcdui.Alert;
import javax.microedition.lcdui.Spacer;
import javax.microedition.midlet.MIDlet;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class HelpForm_ESTest4 extends HelpForm_ESTest_scaffolding4 {
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
      Alert alert0 = new Alert("");
      HelpForm helpForm0 = null;
      try {
        helpForm0 = new HelpForm((RssReaderMIDlet) null, alert0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("cz.cacek.ebook.util.ResourceProviderME", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Spacer spacer0 = new Spacer(0, 0);
      HelpForm helpForm0 = null;
      try {
        helpForm0 = new HelpForm((RssReaderMIDlet) null, spacer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("cz.cacek.ebook.util.ResourceProviderME", e);
      }
  }
}
