/*
 * This file was automatically generated by EvoSuite
 * Sun Aug 12 18:16:38 KST 2018
 */

package com.substanceofcode.rssreader.presentation;

import static org.junit.Assert.fail;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import static org.evosuite.runtime.EvoAssertions.*;

import javax.microedition.lcdui.Image;
import javax.microedition.midlet.MIDlet;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.substanceofcode.rssreader.businessentities.RssFeedStore;
import com.substanceofcode.rssreader.businessentities.RssReaderSettings;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class ImportFeedsForm_ESTest5 extends ImportFeedsForm_ESTest_scaffolding5 {
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
      String[] stringArray0 = new String[1];
      Image[] imageArray0 = new Image[1];
      PromptList promptList0 = new PromptList((RssReaderMIDlet) null, "", 0, stringArray0, imageArray0);
      RssReaderSettings rssReaderSettings0 = RssReaderSettings.getInstance((MIDlet) null);
      ImportFeedsForm importFeedsForm0 = null;
      try {
        importFeedsForm0 = new ImportFeedsForm((RssReaderMIDlet) null, promptList0, (RssFeedStore) null, rssReaderSettings0, (RssReaderMIDlet.LoadingForm) null, "t");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.substanceofcode.rssreader.businessentities.RssReaderSettings", e);
      }
  }
}
