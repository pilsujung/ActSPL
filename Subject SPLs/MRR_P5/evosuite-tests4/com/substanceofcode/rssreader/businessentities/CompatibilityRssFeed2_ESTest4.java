/*
 * This file was automatically generated by EvoSuite
 * Sun Aug 12 15:45:59 KST 2018
 */

package com.substanceofcode.rssreader.businessentities;

import static org.junit.Assert.assertEquals;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import static org.evosuite.runtime.EvoAssertions.*;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.time.chrono.JapaneseDate;
import java.util.Date;
import java.util.Vector;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class CompatibilityRssFeed2_ESTest4 extends CompatibilityRssFeed2_ESTest_scaffolding4 {
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
      CompatibilityRssFeed2 compatibilityRssFeed2_0 = new CompatibilityRssFeed2("", "", "", "");
      CompatibilityRssFeed2 compatibilityRssFeed2_1 = new CompatibilityRssFeed2(compatibilityRssFeed2_0);
      assertEquals("", compatibilityRssFeed2_1.getPassword());
      
      compatibilityRssFeed2_1.m_password = "Z";
      boolean boolean0 = compatibilityRssFeed2_1.equals((RssFeed) compatibilityRssFeed2_0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CompatibilityRssFeed2 compatibilityRssFeed2_0 = new CompatibilityRssFeed2("", "", "A", "");
      RssFeed rssFeed0 = new RssFeed();
      boolean boolean0 = compatibilityRssFeed2_0.equals(rssFeed0);
      assertEquals("", compatibilityRssFeed2_0.getName());
      assertEquals("", compatibilityRssFeed2_0.getUrl());
      assertFalse(boolean0);
      assertEquals("", compatibilityRssFeed2_0.getPassword());
      assertEquals("A", compatibilityRssFeed2_0.getUsername());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CompatibilityRssFeed2 compatibilityRssFeed2_0 = new CompatibilityRssFeed2("");
      Vector<Object> vector0 = new Vector<Object>();
      compatibilityRssFeed2_0.m_items = vector0;
      compatibilityRssFeed2_0.m_url = "";
      RssItem rssItem0 = new RssItem("", "", (String) null, (Date) null, "", true);
      vector0.add((Object) rssItem0);
      String string0 = compatibilityRssFeed2_0.getStoreString(true);
      assertEquals("|||||fHx8fDF8bnVsbA==.", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CompatibilityRssFeed2 compatibilityRssFeed2_0 = new CompatibilityRssFeed2("", "", "", "");
      CompatibilityRssFeed2 compatibilityRssFeed2_1 = new CompatibilityRssFeed2(compatibilityRssFeed2_0);
      Vector<Integer> vector0 = new Vector<Integer>();
      vector0.add((Integer) 0);
      compatibilityRssFeed2_1.m_items = vector0;
      // Undeclared exception!
      try { 
        compatibilityRssFeed2_1.getStoreString(true);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Integer cannot be cast to com.substanceofcode.rssreader.businessentities.RssItem
         //
         verifyException("com.substanceofcode.rssreader.businessentities.CompatibilityRssFeed2", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CompatibilityRssFeed2 compatibilityRssFeed2_0 = new CompatibilityRssFeed2("", "", "", "");
      Vector<Object> vector0 = new Vector<Object>();
      vector0.add((Object) "");
      compatibilityRssFeed2_0.setItems(vector0);
      // Undeclared exception!
      try { 
        compatibilityRssFeed2_0.equals((RssFeed) compatibilityRssFeed2_0);
        fail("Expecting exception: ArrayStoreException");
      
      } catch(ArrayStoreException e) {
      }
  }


  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CompatibilityRssFeed2 compatibilityRssFeed2_0 = new CompatibilityRssFeed2("");
      Vector<Object> vector0 = new Vector<Object>();
      compatibilityRssFeed2_0.m_items = vector0;
      RssItem rssItem0 = new RssItem("", "", (String) null, (Date) null, "", true);
      vector0.add((Object) rssItem0);
      // Undeclared exception!
      try { 
        compatibilityRssFeed2_0.equals((RssFeed) compatibilityRssFeed2_0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.substanceofcode.rssreader.businessentities.RssItem", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CompatibilityRssFeed2 compatibilityRssFeed2_0 = new CompatibilityRssFeed2("", "1", "1", "1");
      assertEquals("", compatibilityRssFeed2_0.getName());
      
      compatibilityRssFeed2_0.setName("721a0H1");
      CompatibilityRssFeed2 compatibilityRssFeed2_1 = new CompatibilityRssFeed2("N38yMWEwSDE=|1|1|1||");
      Vector<JapaneseDate> vector0 = new Vector<JapaneseDate>();
      compatibilityRssFeed2_1.m_items = vector0;
      vector0.add((JapaneseDate) null);
      compatibilityRssFeed2_0.equals((RssFeed) compatibilityRssFeed2_1);
      assertEquals("721a0H1", compatibilityRssFeed2_1.getName());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      RssFeed rssFeed0 = new RssFeed("", "", "", "");
      RssFeed rssFeed1 = new RssFeed(rssFeed0);
      Date date0 = new Date();
      rssFeed1.setUpddate(date0);
      CompatibilityRssFeed2 compatibilityRssFeed2_0 = new CompatibilityRssFeed2(rssFeed1);
      boolean boolean0 = compatibilityRssFeed2_0.equals(rssFeed0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      RssFeed rssFeed0 = new RssFeed("", "", "", "");
      Date date0 = new Date();
      rssFeed0.setUpddate(date0);
      CompatibilityRssFeed2 compatibilityRssFeed2_0 = new CompatibilityRssFeed2(rssFeed0);
      boolean boolean0 = compatibilityRssFeed2_0.equals(rssFeed0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CompatibilityRssFeed2 compatibilityRssFeed2_0 = new CompatibilityRssFeed2("");
      CompatibilityRssFeed2 compatibilityRssFeed2_1 = new CompatibilityRssFeed2("");
      assertEquals("", compatibilityRssFeed2_1.getName());
      
      compatibilityRssFeed2_1.m_name = "v";
      boolean boolean0 = compatibilityRssFeed2_0.equals((RssFeed) compatibilityRssFeed2_1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CompatibilityRssFeed2 compatibilityRssFeed2_0 = new CompatibilityRssFeed2("", "", "", "");
      RssFeed rssFeed0 = new RssFeed("", "7", "", "");
      boolean boolean0 = compatibilityRssFeed2_0.equals(rssFeed0);
      assertFalse(boolean0);
      assertEquals("", compatibilityRssFeed2_0.getUrl());
      assertEquals("", compatibilityRssFeed2_0.getUsername());
      assertEquals("", compatibilityRssFeed2_0.getName());
      assertEquals("", compatibilityRssFeed2_0.getPassword());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      RssFeed rssFeed0 = new RssFeed("", "", "", "");
      Date date0 = new Date();
      rssFeed0.setUpddate(date0);
      CompatibilityRssFeed2 compatibilityRssFeed2_0 = new CompatibilityRssFeed2(rssFeed0);
      String string0 = compatibilityRssFeed2_0.getStoreString(false);
      //  // Unstable assertion: assertEquals("||||1534056341357|", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CompatibilityRssFeed2 compatibilityRssFeed2_0 = new CompatibilityRssFeed2("");
      Vector<JapaneseDate> vector0 = new Vector<JapaneseDate>();
      compatibilityRssFeed2_0.m_items = vector0;
      vector0.add((JapaneseDate) null);
      // Undeclared exception!
      try { 
        compatibilityRssFeed2_0.getStoreString(true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.substanceofcode.rssreader.businessentities.CompatibilityRssItem2", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      RssFeed rssFeed0 = new RssFeed("", "", "", "");
      CompatibilityRssFeed2 compatibilityRssFeed2_0 = new CompatibilityRssFeed2(rssFeed0);
      Date date0 = new Date();
      rssFeed0.m_upddate = date0;
      boolean boolean0 = compatibilityRssFeed2_0.equals(rssFeed0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      CompatibilityRssFeed2 compatibilityRssFeed2_0 = new CompatibilityRssFeed2("", (String) null, (String) null, "");
      Vector<String> vector0 = new Vector<String>();
      vector0.add("");
      compatibilityRssFeed2_0.setItems(vector0);
      CompatibilityRssFeed2 compatibilityRssFeed2_1 = null;
      try {
        compatibilityRssFeed2_1 = new CompatibilityRssFeed2(compatibilityRssFeed2_0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.String cannot be cast to com.substanceofcode.rssreader.businessentities.RssItem
         //
         verifyException("com.substanceofcode.rssreader.businessentities.CompatibilityRssFeed2", e);
      }
  }
}
