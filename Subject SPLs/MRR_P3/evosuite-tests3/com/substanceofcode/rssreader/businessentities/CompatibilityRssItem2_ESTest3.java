/*
 * This file was automatically generated by EvoSuite
 * Sun Aug 12 18:48:00 KST 2018
 */

package com.substanceofcode.rssreader.businessentities;

import static org.junit.Assert.assertEquals;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import static org.evosuite.runtime.EvoAssertions.*;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.Date;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class CompatibilityRssItem2_ESTest3 extends CompatibilityRssItem2_ESTest_scaffolding3 {
@BeforeClass
public static void initEvoSuiteFramework() {
String a = "aa";
}
@AfterClass
public static void exitEvoSuiteFramework() {
String a = "aa";
}


  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CompatibilityRssItem2 compatibilityRssItem2_0 = CompatibilityRssItem2.deserialize2("MXwxfC0yMTk5fDF8MXwx");
      assertNotNull(compatibilityRssItem2_0);
      
      String string0 = compatibilityRssItem2_0.serialize();
      assertEquals("MXwxfC0yMTk5fDF8MXwx", string0);
      assertTrue(compatibilityRssItem2_0.isUnreadItem());
  }


  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Date date0 = new Date();
      CompatibilityRssItem2 compatibilityRssItem2_0 = new CompatibilityRssItem2((String) null, (String) null, (String) null, date0, "", true);
      // Undeclared exception!
      try { 
        compatibilityRssItem2_0.serialize();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.substanceofcode.rssreader.businessentities.CompatibilityRssItem2", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CompatibilityRssItem2 compatibilityRssItem2_0 = new CompatibilityRssItem2("", "", (String) null);
      // Undeclared exception!
      try { 
        compatibilityRssItem2_0.equals((RssItem) compatibilityRssItem2_0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }


  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Date date0 = new Date();
      RssItem rssItem0 = new RssItem("", "", "", date0, "", false);
      CompatibilityRssItem2 compatibilityRssItem2_0 = new CompatibilityRssItem2(rssItem0);
      compatibilityRssItem2_0.setUnreadItem(true);
      boolean boolean0 = compatibilityRssItem2_0.equals(rssItem0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Date date0 = new Date(0L);
      CompatibilityRssItem2 compatibilityRssItem2_0 = new CompatibilityRssItem2("", "", "", date0, "", true);
      RssItem rssItem0 = new RssItem(compatibilityRssItem2_0);
      rssItem0.setEnclosure("M");
      boolean boolean0 = compatibilityRssItem2_0.equals(rssItem0);
      assertTrue(rssItem0.isUnreadItem());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Date date0 = new Date(0L);
      CompatibilityRssItem2 compatibilityRssItem2_0 = new CompatibilityRssItem2("", "", "", date0, "", true);
      RssItem rssItem0 = new RssItem(compatibilityRssItem2_0);
      Date date1 = new Date();
      rssItem0.m_date = date1;
      boolean boolean0 = compatibilityRssItem2_0.equals(rssItem0);
      assertTrue(rssItem0.isUnreadItem());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CompatibilityRssItem2 compatibilityRssItem2_0 = new CompatibilityRssItem2();
      CompatibilityRssItem2 compatibilityRssItem2_1 = new CompatibilityRssItem2(compatibilityRssItem2_0);
      Date date0 = new Date();
      compatibilityRssItem2_1.m_date = date0;
      boolean boolean0 = compatibilityRssItem2_1.equals((RssItem) compatibilityRssItem2_0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CompatibilityRssItem2 compatibilityRssItem2_0 = new CompatibilityRssItem2();
      Date date0 = new Date();
      compatibilityRssItem2_0.m_date = date0;
      boolean boolean0 = compatibilityRssItem2_0.equals((RssItem) compatibilityRssItem2_0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CompatibilityRssItem2 compatibilityRssItem2_0 = new CompatibilityRssItem2("", "", "H");
      CompatibilityRssItem2 compatibilityRssItem2_1 = new CompatibilityRssItem2(compatibilityRssItem2_0);
      assertEquals("H", compatibilityRssItem2_1.getDescription());
      
      compatibilityRssItem2_1.m_desc = "";
      boolean boolean0 = compatibilityRssItem2_0.equals((RssItem) compatibilityRssItem2_1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CompatibilityRssItem2 compatibilityRssItem2_0 = new CompatibilityRssItem2("1", "", "");
      CompatibilityRssItem2 compatibilityRssItem2_1 = new CompatibilityRssItem2("1", "1", "");
      boolean boolean0 = compatibilityRssItem2_0.equals((RssItem) compatibilityRssItem2_1);
      assertFalse(boolean0);
      assertEquals("1", compatibilityRssItem2_0.getTitle());
      assertEquals("", compatibilityRssItem2_1.getDescription());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CompatibilityRssItem2 compatibilityRssItem2_0 = new CompatibilityRssItem2("", "", "");
      CompatibilityRssItem2 compatibilityRssItem2_1 = new CompatibilityRssItem2("2", "", "");
      boolean boolean0 = compatibilityRssItem2_0.equals((RssItem) compatibilityRssItem2_1);
      assertFalse(boolean0);
      assertEquals("", compatibilityRssItem2_1.getLink());
      assertEquals("", compatibilityRssItem2_1.getDescription());
  }


  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      CompatibilityRssItem2 compatibilityRssItem2_0 = CompatibilityRssItem2.deserialize2("fHx8V3wjO3ozKn4/Mz9AUDc/T3tkfDF8");
      assertEquals("", compatibilityRssItem2_0.getTitle());
      assertNotNull(compatibilityRssItem2_0);
      assertFalse(compatibilityRssItem2_0.isUnreadItem());
      assertEquals("W|#;z3*~?3?@P7?O{d|1|", compatibilityRssItem2_0.getDescription());
      assertEquals("W", compatibilityRssItem2_0.getEnclosure());
      assertEquals("", compatibilityRssItem2_0.getLink());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      CompatibilityRssItem2 compatibilityRssItem2_0 = CompatibilityRssItem2.deserialize2("fHx8fDB8");
      assertEquals("", compatibilityRssItem2_0.getTitle());
      assertFalse(compatibilityRssItem2_0.isUnreadItem());
      assertEquals("", compatibilityRssItem2_0.getDescription());
      assertEquals("", compatibilityRssItem2_0.getLink());
      assertNotNull(compatibilityRssItem2_0);
  }
}
