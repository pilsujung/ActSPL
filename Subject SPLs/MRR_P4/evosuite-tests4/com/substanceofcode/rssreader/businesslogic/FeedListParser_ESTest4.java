/*
 * This file was automatically generated by EvoSuite
 * Sun Aug 12 16:18:28 KST 2018
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

import com.substanceofcode.utils.CauseException;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class FeedListParser_ESTest4 extends FeedListParser_ESTest_scaffolding4 {
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
      HTMLAutoLinkParser hTMLAutoLinkParser0 = new HTMLAutoLinkParser("", "", (String) null);
      assertFalse(hTMLAutoLinkParser0.isRedirectHtml());
      
      hTMLAutoLinkParser0.setRedirectHtml(true);
      boolean boolean0 = hTMLAutoLinkParser0.isSuccessfull();
      assertTrue(hTMLAutoLinkParser0.isRedirectHtml());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      HTMLAutoLinkParser hTMLAutoLinkParser0 = new HTMLAutoLinkParser("", "", "");
      hTMLAutoLinkParser0.m_needRedirect = true;
      boolean boolean0 = hTMLAutoLinkParser0.isSuccessfull();
      assertFalse(hTMLAutoLinkParser0.isRedirectHtml());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      OpmlParser opmlParser0 = new OpmlParser("", "", "");
      opmlParser0.m_location = "";
      opmlParser0.run();
      assertFalse(opmlParser0.isSuccessfull());
      assertFalse(opmlParser0.isRedirectHtml());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      HTMLAutoLinkParser hTMLAutoLinkParser0 = new HTMLAutoLinkParser("", "", "");
      hTMLAutoLinkParser0.m_contentType = "";
      hTMLAutoLinkParser0.run();
      assertFalse(hTMLAutoLinkParser0.isRedirectHtml());
      assertFalse(hTMLAutoLinkParser0.isSuccessfull());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      HTMLAutoLinkParser hTMLAutoLinkParser0 = new HTMLAutoLinkParser("", "", (String) null);
      assertFalse(hTMLAutoLinkParser0.isRedirectHtml());
      
      hTMLAutoLinkParser0.setRedirectHtml(true);
      hTMLAutoLinkParser0.run();
      assertTrue(hTMLAutoLinkParser0.isRedirectHtml());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      HTMLAutoLinkParser hTMLAutoLinkParser0 = new HTMLAutoLinkParser("", "", "");
      hTMLAutoLinkParser0.m_needRedirect = true;
      hTMLAutoLinkParser0.run();
      assertFalse(hTMLAutoLinkParser0.isRedirectHtml());
      assertFalse(hTMLAutoLinkParser0.isSuccessfull());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      HTMLAutoLinkParser hTMLAutoLinkParser0 = new HTMLAutoLinkParser("", "", "");
      hTMLAutoLinkParser0.m_needRedirect = true;
      hTMLAutoLinkParser0.startParsing();
      assertFalse(hTMLAutoLinkParser0.isReady());
      assertFalse(hTMLAutoLinkParser0.isSuccessfull());
      assertFalse(hTMLAutoLinkParser0.isRedirectHtml());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      HTMLAutoLinkParser hTMLAutoLinkParser0 = new HTMLAutoLinkParser("", "", "");
      assertFalse(hTMLAutoLinkParser0.isRedirectHtml());
      
      hTMLAutoLinkParser0.setRedirectHtml(true);
      boolean boolean0 = hTMLAutoLinkParser0.isRedirectHtml();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      HTMLAutoLinkParser hTMLAutoLinkParser0 = new HTMLAutoLinkParser("", "", (String) null);
      hTMLAutoLinkParser0.run();
      boolean boolean0 = hTMLAutoLinkParser0.isReady();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      HTMLAutoLinkParser hTMLAutoLinkParser0 = new HTMLAutoLinkParser((String) null, (String) null, "");
      String string0 = hTMLAutoLinkParser0.getUrl();
      assertFalse(hTMLAutoLinkParser0.isRedirectHtml());
      assertFalse(hTMLAutoLinkParser0.isSuccessfull());
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      HTMLAutoLinkParser hTMLAutoLinkParser0 = new HTMLAutoLinkParser("R", "", "");
      String string0 = hTMLAutoLinkParser0.getUrl();
      assertEquals("R", string0);
      assertFalse(hTMLAutoLinkParser0.isSuccessfull());
      assertNotNull(string0);
      assertFalse(hTMLAutoLinkParser0.isRedirectHtml());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      HTMLAutoLinkParser hTMLAutoLinkParser0 = new HTMLAutoLinkParser("", "", "");
      hTMLAutoLinkParser0.setFeedURLFilter("B");
      String string0 = hTMLAutoLinkParser0.getFeedURLFilter();
      assertFalse(hTMLAutoLinkParser0.isSuccessfull());
      assertFalse(hTMLAutoLinkParser0.isRedirectHtml());
      assertEquals("b", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LineByLineParser lineByLineParser0 = new LineByLineParser("", (String) null, (String) null);
      lineByLineParser0.setFeedNameFilter("3");
      String string0 = lineByLineParser0.getFeedNameFilter();
      assertFalse(lineByLineParser0.isSuccessfull());
      assertFalse(lineByLineParser0.isRedirectHtml());
      assertNotNull(string0);
      assertEquals("3", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      OpmlParser opmlParser0 = new OpmlParser("", "", "");
      opmlParser0.run();
      CauseException causeException0 = opmlParser0.getEx();
      assertFalse(opmlParser0.isSuccessfull());
      assertFalse(opmlParser0.isRedirectHtml());
      assertEquals("com.substanceofcode.utils.CauseException: Error while parsing feed ", causeException0.toString());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LineByLineParser lineByLineParser0 = new LineByLineParser((String) null, (String) null, "");
      lineByLineParser0.startParsing();
      // Undeclared exception!
      try { 
        lineByLineParser0.startParsing();
        fail("Expecting exception: IllegalThreadStateException");
      
      } catch(IllegalThreadStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.lang.Thread", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      HTMLLinkParser hTMLLinkParser0 = new HTMLLinkParser("", "", "");
      try { 
        hTMLLinkParser0.parseFeeds();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("cz.cacek.ebook.util.ResourceProviderME", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      HTMLAutoLinkParser hTMLAutoLinkParser0 = new HTMLAutoLinkParser("", "", "");
      hTMLAutoLinkParser0.setFeedURLFilter("5");
      hTMLAutoLinkParser0.run();
      assertFalse(hTMLAutoLinkParser0.isSuccessfull());
      assertFalse(hTMLAutoLinkParser0.isRedirectHtml());
      assertEquals("5", hTMLAutoLinkParser0.getFeedURLFilter());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      HTMLAutoLinkParser hTMLAutoLinkParser0 = new HTMLAutoLinkParser("", "", "");
      hTMLAutoLinkParser0.setFeedURLFilter((String) null);
      assertFalse(hTMLAutoLinkParser0.isSuccessfull());
      assertFalse(hTMLAutoLinkParser0.isRedirectHtml());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      HTMLAutoLinkParser hTMLAutoLinkParser0 = new HTMLAutoLinkParser("", "", "");
      hTMLAutoLinkParser0.setFeedURLFilter("");
      assertFalse(hTMLAutoLinkParser0.isRedirectHtml());
      assertFalse(hTMLAutoLinkParser0.isSuccessfull());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      HTMLAutoLinkParser hTMLAutoLinkParser0 = new HTMLAutoLinkParser("", "", "");
      hTMLAutoLinkParser0.setFeedNameFilter("c");
      hTMLAutoLinkParser0.run();
      assertFalse(hTMLAutoLinkParser0.isSuccessfull());
      assertEquals("c", hTMLAutoLinkParser0.getFeedNameFilter());
      assertFalse(hTMLAutoLinkParser0.isRedirectHtml());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      HTMLAutoLinkParser hTMLAutoLinkParser0 = new HTMLAutoLinkParser((String) null, "", "");
      hTMLAutoLinkParser0.setFeedNameFilter((String) null);
      assertFalse(hTMLAutoLinkParser0.isRedirectHtml());
      assertFalse(hTMLAutoLinkParser0.isSuccessfull());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      HTMLAutoLinkParser hTMLAutoLinkParser0 = new HTMLAutoLinkParser("", "", "");
      hTMLAutoLinkParser0.setFeedNameFilter("");
      assertFalse(hTMLAutoLinkParser0.isRedirectHtml());
      assertFalse(hTMLAutoLinkParser0.isSuccessfull());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      HTMLAutoLinkParser hTMLAutoLinkParser0 = new HTMLAutoLinkParser("", "", "");
      String string0 = hTMLAutoLinkParser0.getUrl();
      assertFalse(hTMLAutoLinkParser0.isSuccessfull());
      assertNotNull(string0);
      assertFalse(hTMLAutoLinkParser0.isRedirectHtml());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      LineByLineParser lineByLineParser0 = new LineByLineParser((String) null, (String) null, "");
      boolean boolean0 = lineByLineParser0.isRedirectHtml();
      assertFalse(boolean0);
      assertFalse(lineByLineParser0.isSuccessfull());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      LineByLineParser lineByLineParser0 = new LineByLineParser((String) null, (String) null, "");
      String string0 = lineByLineParser0.getFeedURLFilter();
      assertFalse(lineByLineParser0.isSuccessfull());
      assertNull(string0);
      assertFalse(lineByLineParser0.isRedirectHtml());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      HTMLLinkParser hTMLLinkParser0 = new HTMLLinkParser("", "", "");
      hTMLLinkParser0.isReady();
      assertFalse(hTMLLinkParser0.isSuccessfull());
      assertFalse(hTMLLinkParser0.isRedirectHtml());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      HTMLLinkParser hTMLLinkParser0 = new HTMLLinkParser("", "", "");
      String string0 = hTMLLinkParser0.getFeedNameFilter();
      assertFalse(hTMLLinkParser0.isSuccessfull());
      assertNull(string0);
      assertFalse(hTMLLinkParser0.isRedirectHtml());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      HTMLLinkParser hTMLLinkParser0 = new HTMLLinkParser("", "", "");
      hTMLLinkParser0.getEx();
      assertFalse(hTMLLinkParser0.isRedirectHtml());
      assertFalse(hTMLLinkParser0.isSuccessfull());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      LineByLineParser lineByLineParser0 = new LineByLineParser((String) null, (String) null, "");
      lineByLineParser0.getFeeds();
      assertFalse(lineByLineParser0.isSuccessfull());
      assertFalse(lineByLineParser0.isRedirectHtml());
  }
}
