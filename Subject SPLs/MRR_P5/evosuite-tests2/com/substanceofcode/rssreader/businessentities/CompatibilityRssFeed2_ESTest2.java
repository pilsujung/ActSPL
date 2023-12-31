/*
 * This file was automatically generated by EvoSuite
 * Sun Aug 12 16:53:35 KST 2018
 */

package com.substanceofcode.rssreader.businessentities;

import static org.junit.Assert.assertEquals;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import static org.evosuite.runtime.EvoAssertions.*;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.time.Instant;
import java.util.Date;
import java.util.Vector;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class CompatibilityRssFeed2_ESTest2 extends CompatibilityRssFeed2_ESTest_scaffolding2 {
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
      Date date0 = new Date();
      RssFeed rssFeed0 = new RssFeed("", "", "", "", date0, "", date0, 0);
      CompatibilityRssFeed2 compatibilityRssFeed2_0 = new CompatibilityRssFeed2(rssFeed0);
      compatibilityRssFeed2_0.m_password = "O";
      boolean boolean0 = compatibilityRssFeed2_0.equals(rssFeed0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CompatibilityRssFeed2 compatibilityRssFeed2_0 = new CompatibilityRssFeed2("", "", "", "");
      boolean boolean0 = compatibilityRssFeed2_0.equals((RssFeed) compatibilityRssFeed2_0);
      assertEquals("", compatibilityRssFeed2_0.getUrl());
      assertEquals("", compatibilityRssFeed2_0.getName());
      assertEquals("", compatibilityRssFeed2_0.getPassword());
      assertTrue(boolean0);
      assertEquals("", compatibilityRssFeed2_0.getUsername());
  }


  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CompatibilityRssFeed2 compatibilityRssFeed2_0 = new CompatibilityRssFeed2("");
      compatibilityRssFeed2_0.setUrl("");
      String string0 = compatibilityRssFeed2_0.getStoreString(false);
      assertEquals("|||||", string0);
  }


  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CompatibilityRssFeed2 compatibilityRssFeed2_0 = new CompatibilityRssFeed2("");
      Vector<Integer> vector0 = new Vector<Integer>();
      compatibilityRssFeed2_0.m_items = vector0;
      vector0.add((Integer) null);
      // Undeclared exception!
      try { 
        compatibilityRssFeed2_0.equals((RssFeed) compatibilityRssFeed2_0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.substanceofcode.rssreader.businessentities.CompatibilityRssFeed2", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CompatibilityRssFeed2 compatibilityRssFeed2_0 = new CompatibilityRssFeed2("");
      Vector<Integer> vector0 = new Vector<Integer>();
      compatibilityRssFeed2_0.m_items = vector0;
      RssFeed rssFeed0 = new RssFeed(compatibilityRssFeed2_0);
      vector0.add((Integer) null);
      compatibilityRssFeed2_0.equals(rssFeed0);
      assertEquals("", rssFeed0.getName());
      assertEquals("", compatibilityRssFeed2_0.getName());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CompatibilityRssFeed2 compatibilityRssFeed2_0 = new CompatibilityRssFeed2("");
      CompatibilityRssFeed2 compatibilityRssFeed2_1 = new CompatibilityRssFeed2(compatibilityRssFeed2_0);
      CompatibilityRssFeed2 compatibilityRssFeed2_2 = new CompatibilityRssFeed2(" ");
      Date date0 = new Date();
      compatibilityRssFeed2_1.m_upddate = date0;
      assertEquals("", compatibilityRssFeed2_1.getName());
      
      compatibilityRssFeed2_1.setName(" ");
      compatibilityRssFeed2_2.equals((RssFeed) compatibilityRssFeed2_1);
      assertEquals(" ", compatibilityRssFeed2_2.getName());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CompatibilityRssFeed2 compatibilityRssFeed2_0 = new CompatibilityRssFeed2("");
      CompatibilityRssFeed2 compatibilityRssFeed2_1 = new CompatibilityRssFeed2(compatibilityRssFeed2_0);
      Date date0 = new Date(0);
      compatibilityRssFeed2_0.m_upddate = date0;
      compatibilityRssFeed2_0.equals((RssFeed) compatibilityRssFeed2_1);
      assertEquals("", compatibilityRssFeed2_1.getName());
      assertEquals("", compatibilityRssFeed2_0.getName());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CompatibilityRssFeed2 compatibilityRssFeed2_0 = new CompatibilityRssFeed2("");
      CompatibilityRssFeed2 compatibilityRssFeed2_1 = new CompatibilityRssFeed2(compatibilityRssFeed2_0);
      Date date0 = new Date();
      compatibilityRssFeed2_1.m_upddate = date0;
      boolean boolean0 = compatibilityRssFeed2_1.equals((RssFeed) compatibilityRssFeed2_1);
      assertTrue(boolean0);
      assertEquals("", compatibilityRssFeed2_1.getName());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CompatibilityRssFeed2 compatibilityRssFeed2_0 = new CompatibilityRssFeed2("");
      Instant instant0 = Instant.now();
      Date date0 = Date.from(instant0);
      RssFeed rssFeed0 = new RssFeed("", "", (String) null, "", date0, "", date0, 0);
      compatibilityRssFeed2_0.copyTo(rssFeed0);
      compatibilityRssFeed2_0.m_username = "Q";
      boolean boolean0 = compatibilityRssFeed2_0.equals(rssFeed0);
      //  // Unstable assertion: assertFalse(boolean0);
      //  // Unstable assertion: assertEquals("Sun Aug 12 16:53:17 KST 2018", date0.toString());
      //  // Unstable assertion: assertEquals("", rssFeed0.getName());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CompatibilityRssFeed2 compatibilityRssFeed2_0 = new CompatibilityRssFeed2("");
      CompatibilityRssFeed2 compatibilityRssFeed2_1 = new CompatibilityRssFeed2(" ");
      boolean boolean0 = compatibilityRssFeed2_1.equals((RssFeed) compatibilityRssFeed2_0);
      assertFalse(boolean0);
      assertEquals("", compatibilityRssFeed2_1.getUrl());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CompatibilityRssFeed2 compatibilityRssFeed2_0 = new CompatibilityRssFeed2("");
      CompatibilityRssFeed2 compatibilityRssFeed2_1 = new CompatibilityRssFeed2("");
      compatibilityRssFeed2_0.setUrl("O");
      boolean boolean0 = compatibilityRssFeed2_0.equals((RssFeed) compatibilityRssFeed2_1);
      assertFalse(boolean0);
      assertEquals("", compatibilityRssFeed2_1.getName());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CompatibilityRssFeed2 compatibilityRssFeed2_0 = new CompatibilityRssFeed2("");
      Vector<Object> vector0 = new Vector<Object>();
      compatibilityRssFeed2_0.m_items = vector0;
      Object object0 = new Object();
      vector0.add(object0);
      // Undeclared exception!
      try { 
        compatibilityRssFeed2_0.getStoreString(true);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Object cannot be cast to com.substanceofcode.rssreader.businessentities.RssItem
         //
         verifyException("com.substanceofcode.rssreader.businessentities.CompatibilityRssFeed2", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      CompatibilityRssFeed2 compatibilityRssFeed2_0 = new CompatibilityRssFeed2("||||-|");
      assertEquals("", compatibilityRssFeed2_0.getPassword());
      assertEquals("", compatibilityRssFeed2_0.getName());
  }


  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      CompatibilityRssFeed2 compatibilityRssFeed2_0 = new CompatibilityRssFeed2("|||");
      assertEquals("", compatibilityRssFeed2_0.getName());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      CompatibilityRssFeed2 compatibilityRssFeed2_0 = new CompatibilityRssFeed2("");
      CompatibilityRssFeed2 compatibilityRssFeed2_1 = new CompatibilityRssFeed2(compatibilityRssFeed2_0);
      Date date0 = new Date();
      compatibilityRssFeed2_1.m_upddate = date0;
      String string0 = compatibilityRssFeed2_1.getStoreString(false);
      //  // Unstable assertion: assertEquals("||||1534060395840|", string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      CompatibilityRssFeed2 compatibilityRssFeed2_0 = new CompatibilityRssFeed2("");
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

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      CompatibilityRssFeed2 compatibilityRssFeed2_0 = new CompatibilityRssFeed2("", "", "", "");
      Vector<Integer> vector0 = new Vector<Integer>();
      compatibilityRssFeed2_0.m_items = vector0;
      vector0.add((Integer) null);
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
}
