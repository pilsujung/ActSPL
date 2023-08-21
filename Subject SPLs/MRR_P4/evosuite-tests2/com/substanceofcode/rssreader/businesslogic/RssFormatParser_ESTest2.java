/*
 * This file was automatically generated by EvoSuite
 * Sun Aug 12 17:34:48 KST 2018
 */

package com.substanceofcode.rssreader.businesslogic;

import static org.junit.Assert.assertEquals;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import static org.evosuite.runtime.EvoAssertions.*;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.fail;

import java.util.Date;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.substanceofcode.rssreader.businessentities.RssItunesFeed;
import com.substanceofcode.utils.XmlParser;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class RssFormatParser_ESTest2 extends RssFormatParser_ESTest_scaffolding2 {
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
      Date date0 = RssFormatParser.parseDcDate(" ");
      assertNull(date0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Date date0 = RssFormatParser.getCal(7, 0, 0, 0, 0, 0);
      assertEquals("Wed Jan 07 00:00:00 KST 1", date0.toString());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Date date0 = RssFormatParser.getCal(0, 0, 1, 0, 0, 0);
      assertEquals("Fri Dec 31 00:00:00 KST 1", date0.toString());
  }



  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Date date0 = RssFormatParser.getCal(0, 0, 0, 1, 0, 0);
      assertEquals("Wed Dec 31 01:00:00 KST 2", date0.toString());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      RssFormatParser rssFormatParser0 = new RssFormatParser();
      RssItunesFeed rssItunesFeed0 = new RssItunesFeed("", "", "", "", (Date) null, "", (Date) null, 0, true, "", "", (String) null, "", "", "", (byte)0);
      // Undeclared exception!
      try { 
        rssFormatParser0.parse((XmlParser) null, rssItunesFeed0, true, 0, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.substanceofcode.rssreader.businesslogic.ExtParser", e);
      }
  }



  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Date date0 = RssFormatParser.parseStdDate(" U C s g ");
      assertNull(date0);
  }


  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Date date0 = RssFormatParser.parseDcDate("u");
      assertNull(date0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Date date0 = RssFormatParser.parseRssDate("O o m e d d");
      assertNull(date0);
  }


  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Date date0 = RssFormatParser.parseStdDate(" e w p ");
      assertNull(date0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Date date0 = RssFormatParser.parseRssDate("EI-");
      assertNull(date0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      RssFormatParser rssFormatParser0 = new RssFormatParser();
      rssFormatParser0.parseItem((XmlParser) null, 'e', "");
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      RssFormatParser rssFormatParser0 = new RssFormatParser();
      rssFormatParser0.parseItem((XmlParser) null, '\"', "");
  }
}
