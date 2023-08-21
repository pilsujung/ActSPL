/*
 * This file was automatically generated by EvoSuite
 * Sun Aug 12 18:05:47 KST 2018
 */

package com.substanceofcode.rssreader.businesslogic;

import static org.junit.Assert.assertEquals;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import static org.evosuite.runtime.EvoAssertions.*;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.substanceofcode.rssreader.businessentities.RssItunesFeed;
import com.substanceofcode.utils.CauseException;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class FeedListParser_ESTest5 extends FeedListParser_ESTest_scaffolding5 {
@BeforeClass
public static void initEvoSuiteFramework() {
String a = "aa";
}
@AfterClass
public static void exitEvoSuiteFramework() {
String a = "aa";
}

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LineByLineParser lineByLineParser0 = new LineByLineParser("", "", "");
      assertFalse(lineByLineParser0.isRedirectHtml());
      
      lineByLineParser0.setRedirectHtml(true);
      boolean boolean0 = lineByLineParser0.isSuccessfull();
      assertTrue(lineByLineParser0.isRedirectHtml());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LineByLineParser lineByLineParser0 = new LineByLineParser("", "", "");
      lineByLineParser0.m_needRedirect = true;
      boolean boolean0 = lineByLineParser0.isSuccessfull();
      assertFalse(boolean0);
      assertFalse(lineByLineParser0.isRedirectHtml());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LineByLineParser lineByLineParser0 = new LineByLineParser("", "", (String) null);
      lineByLineParser0.m_feedURLFilter = "";
      lineByLineParser0.run();
      assertFalse(lineByLineParser0.isRedirectHtml());
      assertFalse(lineByLineParser0.isSuccessfull());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LineByLineParser lineByLineParser0 = new LineByLineParser("", "", "");
      lineByLineParser0.m_contentType = "";
      lineByLineParser0.run();
      assertFalse(lineByLineParser0.isRedirectHtml());
      assertFalse(lineByLineParser0.isSuccessfull());
  }


  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      LineByLineParser lineByLineParser0 = new LineByLineParser("", "", (String) null);
      lineByLineParser0.m_needRedirect = true;
      lineByLineParser0.run();
      assertFalse(lineByLineParser0.isRedirectHtml());
      assertFalse(lineByLineParser0.isSuccessfull());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LineByLineParser lineByLineParser0 = new LineByLineParser("", "", "");
      assertFalse(lineByLineParser0.isRedirectHtml());
      
      lineByLineParser0.setRedirectHtml(true);
      lineByLineParser0.startParsing();
      assertTrue(lineByLineParser0.isRedirectHtml());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      LineByLineParser lineByLineParser0 = new LineByLineParser("", "", "");
      lineByLineParser0.m_needRedirect = true;
      lineByLineParser0.startParsing();
      assertFalse(lineByLineParser0.isReady());
      assertFalse(lineByLineParser0.isRedirectHtml());
      assertFalse(lineByLineParser0.isSuccessfull());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LineByLineParser lineByLineParser0 = new LineByLineParser("", "", "");
      assertFalse(lineByLineParser0.isRedirectHtml());
      
      lineByLineParser0.setRedirectHtml(true);
      boolean boolean0 = lineByLineParser0.isRedirectHtml();
      assertTrue(boolean0);
  }


  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      OpmlParser opmlParser0 = new OpmlParser((String) null, (String) null, "");
      String string0 = opmlParser0.getUrl();
      assertFalse(opmlParser0.isRedirectHtml());
      assertNull(string0);
      assertFalse(opmlParser0.isSuccessfull());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LineByLineParser lineByLineParser0 = new LineByLineParser("6", "", (String) null);
      String string0 = lineByLineParser0.getUrl();
      assertFalse(lineByLineParser0.isRedirectHtml());
      assertEquals("6", string0);
      assertNotNull(string0);
      assertFalse(lineByLineParser0.isSuccessfull());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      OpmlParser opmlParser0 = new OpmlParser("", "", "");
      RssItunesFeed[] rssItunesFeedArray0 = new RssItunesFeed[2];
      opmlParser0.m_feeds = rssItunesFeedArray0;
      opmlParser0.getFeeds();
      assertFalse(opmlParser0.isSuccessfull());
      assertFalse(opmlParser0.isRedirectHtml());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      OpmlParser opmlParser0 = new OpmlParser("", "", "");
      RssItunesFeed[] rssItunesFeedArray0 = new RssItunesFeed[0];
      opmlParser0.m_feeds = rssItunesFeedArray0;
      opmlParser0.getFeeds();
      assertFalse(opmlParser0.isSuccessfull());
      assertFalse(opmlParser0.isRedirectHtml());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      OpmlParser opmlParser0 = new OpmlParser("", "", "");
      opmlParser0.setFeedURLFilter("G");
      String string0 = opmlParser0.getFeedURLFilter();
      assertFalse(opmlParser0.isSuccessfull());
      assertNotNull(string0);
      assertEquals("g", string0);
      assertFalse(opmlParser0.isRedirectHtml());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      LineByLineParser lineByLineParser0 = new LineByLineParser("", "", "");
      lineByLineParser0.m_feedURLFilter = "";
      String string0 = lineByLineParser0.getFeedURLFilter();
      assertFalse(lineByLineParser0.isRedirectHtml());
      assertNotNull(string0);
      assertFalse(lineByLineParser0.isSuccessfull());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      LineByLineParser lineByLineParser0 = new LineByLineParser("", "", "");
      lineByLineParser0.m_feedNameFilter = "C";
      String string0 = lineByLineParser0.getFeedNameFilter();
      assertFalse(lineByLineParser0.isSuccessfull());
      assertNotNull(string0);
      assertEquals("C", string0);
      assertFalse(lineByLineParser0.isRedirectHtml());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      LineByLineParser lineByLineParser0 = new LineByLineParser("", "", (String) null);
      lineByLineParser0.run();
      CauseException causeException0 = lineByLineParser0.getEx();
      assertEquals("com.substanceofcode.utils.CauseException: Error while parsing feed ", causeException0.toString());
      assertFalse(lineByLineParser0.isRedirectHtml());
      assertFalse(lineByLineParser0.isSuccessfull());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      LineByLineParser lineByLineParser0 = new LineByLineParser("", "", "");
      try { 
        lineByLineParser0.parseFeeds();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("cz.cacek.ebook.util.ResourceProviderME", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      OpmlParser opmlParser0 = new OpmlParser("", (String) null, "");
      opmlParser0.setFeedURLFilter((String) null);
      assertFalse(opmlParser0.isSuccessfull());
      assertFalse(opmlParser0.isRedirectHtml());
  }


  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      LineByLineParser lineByLineParser0 = new LineByLineParser("", "", "");
      lineByLineParser0.setFeedNameFilter("C");
      assertFalse(lineByLineParser0.isRedirectHtml());
      assertEquals("c", lineByLineParser0.getFeedNameFilter());
      assertFalse(lineByLineParser0.isSuccessfull());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      OpmlParser opmlParser0 = new OpmlParser("", "", "");
      opmlParser0.setFeedNameFilter((String) null);
      assertFalse(opmlParser0.isSuccessfull());
      assertFalse(opmlParser0.isRedirectHtml());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      LineByLineParser lineByLineParser0 = new LineByLineParser("", "", "");
      lineByLineParser0.setFeedNameFilter("");
      assertFalse(lineByLineParser0.isRedirectHtml());
      assertFalse(lineByLineParser0.isSuccessfull());
  }


  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      LineByLineParser lineByLineParser0 = new LineByLineParser("", "", "");
      String string0 = lineByLineParser0.getUrl();
      assertFalse(lineByLineParser0.isSuccessfull());
      assertNotNull(string0);
      assertFalse(lineByLineParser0.isRedirectHtml());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      LineByLineParser lineByLineParser0 = new LineByLineParser("", "", "");
      boolean boolean0 = lineByLineParser0.isRedirectHtml();
      assertFalse(boolean0);
      assertFalse(lineByLineParser0.isSuccessfull());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      LineByLineParser lineByLineParser0 = new LineByLineParser("", "", "");
      String string0 = lineByLineParser0.getFeedURLFilter();
      assertFalse(lineByLineParser0.isRedirectHtml());
      assertFalse(lineByLineParser0.isSuccessfull());
      assertNull(string0);
  }



  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      LineByLineParser lineByLineParser0 = new LineByLineParser((String) null, (String) null, "");
      lineByLineParser0.getEx();
      assertFalse(lineByLineParser0.isRedirectHtml());
      assertFalse(lineByLineParser0.isSuccessfull());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      OpmlParser opmlParser0 = new OpmlParser("", "", "");
      opmlParser0.getFeeds();
      assertFalse(opmlParser0.isRedirectHtml());
      assertFalse(opmlParser0.isSuccessfull());
  }
}