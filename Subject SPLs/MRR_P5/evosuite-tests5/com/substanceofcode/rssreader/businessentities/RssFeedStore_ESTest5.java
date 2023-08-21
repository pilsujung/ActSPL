/*
 * This file was automatically generated by EvoSuite
 * Sun Aug 12 17:49:46 KST 2018
 */

package com.substanceofcode.rssreader.businessentities;

import static org.junit.Assert.assertEquals;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import static org.evosuite.runtime.EvoAssertions.*;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.time.Instant;
import java.util.Date;
import java.util.Vector;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.substanceofcode.utils.CauseException;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class RssFeedStore_ESTest5 extends RssFeedStore_ESTest_scaffolding5 {
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
      RssFeedStore rssFeedStore0 = new RssFeedStore(true);
      rssFeedStore0.put("cannot convert save name=", "");
      String string0 = rssFeedStore0.getRoStoreStr("cannot convert save name=");
      assertTrue(rssFeedStore0.isSaveMemoryEnabled());
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      RssFeedStore rssFeedStore0 = new RssFeedStore(false);
      Instant instant0 = Instant.now();
      Date date0 = Date.from(instant0);
      RssItunesFeed rssItunesFeed0 = new RssItunesFeed("", "", "", "", date0, "", date0, 0, true, "", "", "", "", "", "", (byte)0);
      rssFeedStore0.put(rssItunesFeed0);
      rssFeedStore0.freeFeedItems();
      assertFalse(rssFeedStore0.isSaveMemoryEnabled());
  }


  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      RssFeedStore rssFeedStore0 = new RssFeedStore(false);
      rssFeedStore0.get("");
      assertFalse(rssFeedStore0.isSaveMemoryEnabled());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      RssFeedStore rssFeedStore0 = new RssFeedStore(false);
      Instant instant0 = Instant.now();
      Date date0 = Date.from(instant0);
      RssItunesFeed rssItunesFeed0 = new RssItunesFeed("RssFeedStore", "", "", "", date0, "", date0, 0, true, "", "", "", "", "", "", (byte)0);
      rssFeedStore0.put(rssItunesFeed0);
      RssItunesFeed rssItunesFeed1 = rssFeedStore0.get("RssFeedStore");
      assertSame(rssItunesFeed1, rssItunesFeed0);
      assertNotNull(rssItunesFeed1);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      RssFeedStore rssFeedStore0 = new RssFeedStore(false);
      RssItunesFeed rssItunesFeed0 = new RssItunesFeed();
      rssItunesFeed0.m_category = 0;
      rssFeedStore0.put(rssItunesFeed0);
      RssItunesFeed rssItunesFeed1 = rssFeedStore0.get("");
      assertSame(rssItunesFeed1, rssItunesFeed0);
      assertNotNull(rssItunesFeed1);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      RssFeedStore rssFeedStore0 = new RssFeedStore(false);
      RssItunesFeed rssItunesFeed0 = new RssItunesFeed();
      rssItunesFeed0.m_category = 1;
      rssFeedStore0.put(rssItunesFeed0);
      RssItunesFeed rssItunesFeed1 = rssFeedStore0.get("");
      assertNotNull(rssItunesFeed1);
      assertSame(rssItunesFeed1, rssItunesFeed0);
  }


  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      RssFeedStore rssFeedStore0 = new RssFeedStore(false);
      // Undeclared exception!
      try { 
        rssFeedStore0.put("", (RssItunesFeed) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Hashtable", e);
      }
  }


  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      RssFeedStore rssFeedStore0 = new RssFeedStore(false, 0);
      // Undeclared exception!
      try { 
        rssFeedStore0.getRoStoreStr((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      RssFeedStore rssFeedStore0 = new RssFeedStore(false);
      RssItunesFeed rssItunesFeed0 = new RssItunesFeed();
      rssFeedStore0.put(rssItunesFeed0);
      Vector<Object> vector0 = new Vector<Object>();
      rssItunesFeed0.m_items = vector0;
      vector0.add((Object) rssItunesFeed0.m_items);
      // Undeclared exception!
      try { 
        rssFeedStore0.getRoStoreStr("");
        fail("Expecting exception: ArrayStoreException");
      
      } catch(ArrayStoreException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      RssFeedStore rssFeedStore0 = new RssFeedStore(false);
      // Undeclared exception!
      try { 
        rssFeedStore0.getRo((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      RssFeedStore rssFeedStore0 = new RssFeedStore(true, 0);
      rssFeedStore0.putIfAbsent("OG5A~E})Cq,{(h3hG", "");
      try { 
        rssFeedStore0.get("OG5A~E})Cq,{(h3hG");
        fail("Expecting exception: CauseException");
      
      } catch(CauseException e) {
         //
         // Internal error during initialize of RssFeed
         //
         verifyException("com.substanceofcode.rssreader.businessentities.RssFeed", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      RssFeedStore rssFeedStore0 = new RssFeedStore(false);
      rssFeedStore0.put(rssFeedStore0, rssFeedStore0);
      // Undeclared exception!
      try { 
        rssFeedStore0.freeFeedItems();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // com.substanceofcode.rssreader.businessentities.RssFeedStore cannot be cast to java.lang.String
         //
         verifyException("com.substanceofcode.rssreader.businessentities.RssFeedStore", e);
      }
  }


  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      RssFeedStore rssFeedStore0 = new RssFeedStore(false);
      RssFeed rssFeed0 = new RssFeed("", "", "", "");
      RssItunesFeed rssItunesFeed0 = new RssItunesFeed(rssFeed0);
      rssFeedStore0.put("", rssItunesFeed0);
      RssItunesFeed rssItunesFeed1 = rssFeedStore0.getRo("");
      assertSame(rssItunesFeed1, rssItunesFeed0);
      assertNotNull(rssItunesFeed1);
  }


  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      RssFeedStore rssFeedStore0 = new RssFeedStore(true, 0);
      RssItunesFeed rssItunesFeed0 = new RssItunesFeed("", "", "", "");
      rssFeedStore0.put("", rssItunesFeed0);
      rssFeedStore0.freeFeedItems();
      assertTrue(rssFeedStore0.isSaveMemoryEnabled());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      RssFeedStore rssFeedStore0 = new RssFeedStore(true, 0);
      RssItunesFeed rssItunesFeed0 = new RssItunesFeed("Qe", "", "", "", (Date) null, "", (Date) null, 0, false, (String) null, "", "", "", "", "", (byte)0);
      rssFeedStore0.put(rssItunesFeed0);
      RssItunesFeed rssItunesFeed1 = rssFeedStore0.getRo("Qe");
      assertNotNull(rssItunesFeed1);
      assertEquals(0, rssItunesFeed1.getCategory());
      assertNotSame(rssItunesFeed1, rssItunesFeed0);
      assertTrue(rssFeedStore0.isSaveMemoryEnabled());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      RssFeedStore rssFeedStore0 = new RssFeedStore(false);
      RssItunesFeed rssItunesFeed0 = new RssItunesFeed();
      rssFeedStore0.put(rssItunesFeed0);
      String string0 = rssFeedStore0.getRoStoreStr("");
      assertEquals("||||||||||||||||", string0);
      assertFalse(rssFeedStore0.isSaveMemoryEnabled());
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      RssFeedStore rssFeedStore0 = new RssFeedStore(false);
      RssItunesFeed rssItunesFeed0 = new RssItunesFeed();
      rssFeedStore0.put(rssItunesFeed0);
      RssItunesFeed rssItunesFeed1 = rssFeedStore0.get("");
      assertNotNull(rssItunesFeed1);
      assertSame(rssItunesFeed1, rssItunesFeed0);
      
      String string0 = rssFeedStore0.getRoStoreStr("");
      assertEquals("||||||||||||||||", string0);
  }



  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      RssFeedStore rssFeedStore0 = new RssFeedStore(true, 0);
      rssFeedStore0.setSaveMemoryEnabled(true);
      assertTrue(rssFeedStore0.isSaveMemoryEnabled());
  }


  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      RssFeedStore rssFeedStore0 = new RssFeedStore(true, 0);
      rssFeedStore0.getRoStoreStr("");
      assertTrue(rssFeedStore0.isSaveMemoryEnabled());
  }


}
