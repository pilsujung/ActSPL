/*
 * This file was automatically generated by EvoSuite
 * Sun Aug 12 19:22:41 KST 2018
 */

package com.substanceofcode.rssreader.presentation;

import static org.junit.Assert.assertEquals;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import static org.evosuite.runtime.EvoAssertions.*;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.Image;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.substanceofcode.rssreader.businessentities.RssFeedStore;
import com.substanceofcode.testlcdui.List;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class AllNewsList_ESTest3 extends AllNewsList_ESTest_scaffolding3 {
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
      RssFeedStore rssFeedStore0 = new RssFeedStore(false);
      AllNewsList allNewsList0 = new AllNewsList((RssReaderMIDlet) null, (List) null, rssFeedStore0, (Image) null, (Image) null);
      // Undeclared exception!
      try { 
        allNewsList0.sortUnreadItems(true, (List) null, rssFeedStore0);
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
      List list0 = new List("", 0);
      RssFeedStore rssFeedStore0 = new RssFeedStore(true);
      AllNewsList allNewsList0 = new AllNewsList((RssReaderMIDlet) null, list0, rssFeedStore0, (Image) null, (Image) null);
      allNewsList0.updTitle();
      assertEquals("Unread Headers", allNewsList0.getTitle());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      List list0 = new List("", 0);
      RssFeedStore rssFeedStore0 = new RssFeedStore(true, 0);
      AllNewsList allNewsList0 = new AllNewsList((RssReaderMIDlet) null, list0, rssFeedStore0, (Image) null, (Image) null);
      Command command0 = new Command("", 0, 0);
      allNewsList0.commandAction(command0, list0);
      assertEquals("Unread Headers", allNewsList0.getTitle());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      List list0 = new List((String) null, 0);
      RssFeedStore rssFeedStore0 = new RssFeedStore(true, 0);
      AllNewsList allNewsList0 = new AllNewsList((RssReaderMIDlet) null, list0, rssFeedStore0, (Image) null, (Image) null);
      allNewsList0.sortReadItems(false, list0, rssFeedStore0);
      assertEquals(0, rssFeedStore0.size());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      List list0 = new List("", 0);
      RssFeedStore rssFeedStore0 = new RssFeedStore(true);
      AllNewsList allNewsList0 = new AllNewsList((RssReaderMIDlet) null, list0, rssFeedStore0, (Image) null, (Image) null);
      allNewsList0.sortUnreadItems(true, list0, rssFeedStore0);
      allNewsList0.updTitle();
      assertEquals("Unread Headers", allNewsList0.getTitle());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      List list0 = new List("", 0);
      RssFeedStore rssFeedStore0 = new RssFeedStore(true);
      AllNewsList allNewsList0 = new AllNewsList((RssReaderMIDlet) null, list0, rssFeedStore0, (Image) null, (Image) null);
      allNewsList0.sortAllItems(true, list0, rssFeedStore0);
      assertTrue(rssFeedStore0.isSaveMemoryEnabled());
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      List list0 = new List("", 0);
      RssFeedStore rssFeedStore0 = new RssFeedStore(true);
      AllNewsList allNewsList0 = new AllNewsList((RssReaderMIDlet) null, list0, rssFeedStore0, (Image) null, (Image) null);
      allNewsList0.initNewsList(false, false, true, list0, rssFeedStore0);
      assertEquals(0, rssFeedStore0.size());
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      List list0 = new List("", 0);
      RssFeedStore rssFeedStore0 = new RssFeedStore(false, 0);
      AllNewsList allNewsList0 = new AllNewsList((RssReaderMIDlet) null, list0, rssFeedStore0, (Image) null, (Image) null);
      allNewsList0.wakeUp();
      assertEquals("Unread Headers", allNewsList0.getTitle());
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      String[] stringArray0 = new String[6];
      Image[] imageArray0 = new Image[1];
      List list0 = new List((String) null, 0, stringArray0, imageArray0);
      RssFeedStore rssFeedStore0 = new RssFeedStore(false);
      AllNewsList allNewsList0 = new AllNewsList((RssReaderMIDlet) null, list0, rssFeedStore0, (Image) null, (Image) null);
      // Undeclared exception!
      try { 
        allNewsList0.initializeUnreadHhdrsList();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("cz.cacek.ebook.util.ResourceProviderME", e);
      }
  }
}
