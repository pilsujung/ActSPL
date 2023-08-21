/*
 * This file was automatically generated by EvoSuite
 * Sun Aug 12 15:38:40 KST 2018
 */

package com.substanceofcode.rssreader.presentation;

import static org.evosuite.runtime.EvoAssertions.verifyException;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.fail;

import javax.microedition.lcdui.ChoiceGroup;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.Image;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.substanceofcode.rssreader.businessentities.RssFeedStore;
import com.substanceofcode.testlcdui.List;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class AllNewsList_ESTest1 extends AllNewsList_ESTest_scaffolding1 {
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
      List list0 = new List("", 0);
      RssFeedStore rssFeedStore0 = new RssFeedStore(false);
      AllNewsList allNewsList0 = new AllNewsList((RssReaderMIDlet) null, list0, rssFeedStore0, (Image) null, (Image) null);
      // Undeclared exception!
      try { 
        allNewsList0.commandAction((Command) null, list0);
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
      String[] stringArray0 = new String[4];
      Image[] imageArray0 = new Image[1];
      ChoiceGroup choiceGroup0 = new ChoiceGroup("", 0, stringArray0, imageArray0);
      Image image0 = choiceGroup0.getImage(0);
      List list0 = new List("", 0, stringArray0, imageArray0);
      AllNewsList allNewsList0 = null;
      try {
        allNewsList0 = new AllNewsList((RssReaderMIDlet) null, list0, (RssFeedStore) null, (Image) null, image0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.substanceofcode.rssreader.presentation.AllNewsList", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      String[] stringArray0 = new String[3];
      Image[] imageArray0 = new Image[2];
      List list0 = new List("", 0, stringArray0, imageArray0);
      RssFeedStore rssFeedStore0 = new RssFeedStore(true);
      AllNewsList allNewsList0 = new AllNewsList((RssReaderMIDlet) null, list0, rssFeedStore0, (Image) null, (Image) null);
      allNewsList0.gotoNews();
      assertEquals("Unread Headers", allNewsList0.getTitle());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      List list0 = new List("", 0);
      RssFeedStore rssFeedStore0 = new RssFeedStore(false);
      AllNewsList allNewsList0 = new AllNewsList((RssReaderMIDlet) null, list0, rssFeedStore0, (Image) null, (Image) null);
      allNewsList0.sortReadItems(false, list0, rssFeedStore0);
      assertFalse(rssFeedStore0.isSaveMemoryEnabled());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      String[] stringArray0 = new String[3];
      List list0 = new List((String) null, 0, stringArray0, (Image[]) null);
      RssFeedStore rssFeedStore0 = new RssFeedStore(true, 0);
      AllNewsList allNewsList0 = new AllNewsList((RssReaderMIDlet) null, list0, rssFeedStore0, (Image) null, (Image) null);
      allNewsList0.sortReadItems(true, list0, rssFeedStore0);
      assertNull(list0.getTitle());
  }
}
