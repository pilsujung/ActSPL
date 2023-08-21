/*
 * This file was automatically generated by EvoSuite
 * Sun Aug 12 15:03:04 KST 2018
 */

package com.substanceofcode.rssreader.businessentities;

import static org.junit.Assert.assertEquals;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import static org.evosuite.runtime.EvoAssertions.*;
import java.time.Instant;
import java.util.Date;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class RssShortItem_ESTest1 extends RssShortItem_ESTest_scaffolding1 {
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
      Instant instant0 = Instant.ofEpochMilli(0L);
      Date date0 = Date.from(instant0);
      RssShortItem rssShortItem0 = new RssShortItem("", date0, false, 0);
      boolean boolean0 = rssShortItem0.isUnreadItem();
      assertFalse(boolean0);
      assertEquals(0, rssShortItem0.getIndex());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      RssShortItem rssShortItem0 = new RssShortItem((String) null, (Date) null, true, 0);
      rssShortItem0.getTitle();
      assertTrue(rssShortItem0.isUnreadItem());
      assertEquals(0, rssShortItem0.getIndex());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Date date0 = new Date();
      RssShortItem rssShortItem0 = new RssShortItem("D", date0, false, 0);
      rssShortItem0.getTitle();
      assertEquals(0, rssShortItem0.getIndex());
      assertFalse(rssShortItem0.isUnreadItem());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Date date0 = new Date(0L);
      RssShortItem rssShortItem0 = new RssShortItem("", date0, true, 1);
      int int0 = rssShortItem0.getIndex();
      assertEquals(1, int0);
      assertTrue(rssShortItem0.isUnreadItem());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Date date0 = new Date();
      RssItem rssItem0 = new RssItem("", "", "", date0, "", true);
      RssShortItem rssShortItem0 = new RssShortItem(rssItem0, (-1));
      int int0 = rssShortItem0.getIndex();
      assertEquals((-1), int0);
      assertTrue(rssShortItem0.isUnreadItem());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Date date0 = new Date();
      RssShortItem rssShortItem0 = new RssShortItem("", date0, true, 0);
      rssShortItem0.getDate();
      assertTrue(rssShortItem0.isUnreadItem());
      assertEquals(0, rssShortItem0.getIndex());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Date date0 = new Date(0L);
      RssItem rssItem0 = new RssItem((String) null, "", "", date0, "", false);
      RssShortItem rssShortItem0 = new RssShortItem(rssItem0, 0);
      // Undeclared exception!
      try { 
        rssShortItem0.equals(rssShortItem0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      RssShortItem rssShortItem0 = null;
      try {
        rssShortItem0 = new RssShortItem((RssItem) null, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.substanceofcode.rssreader.businessentities.RssShortItem", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      RssShortItem rssShortItem0 = new RssShortItem("swK", (Date) null, false, 0);
      RssShortItem rssShortItem1 = new RssShortItem("swK", (Date) null, false, 1);
      rssShortItem0.equals(rssShortItem1);
      assertFalse(rssShortItem1.isUnreadItem());
      assertEquals(1, rssShortItem1.getIndex());
      assertFalse(rssShortItem0.isUnreadItem());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Date date0 = new Date();
      RssShortItem rssShortItem0 = new RssShortItem(",'D>?C#/*xIz^ka", date0, false, 0);
      RssItem rssItem0 = new RssItem(",'D>?C#/*xIz^ka", "", "", date0, "", true);
      RssShortItem rssShortItem1 = new RssShortItem(rssItem0, 0);
      boolean boolean0 = rssShortItem0.equals(rssShortItem1);
      assertEquals(0, rssShortItem1.getIndex());
      assertTrue(rssShortItem1.isUnreadItem());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Date date0 = new Date();
      RssShortItem rssShortItem0 = new RssShortItem("F.FWw4=3", date0, true, (-50));
      Date date1 = new Date();
      date1.clone();
      RssShortItem rssShortItem1 = new RssShortItem("F.FWw4=3", date1, true, (-67));
      boolean boolean0 = rssShortItem1.equals(rssShortItem0);
      //  // Unstable assertion: assertTrue(rssShortItem1.isUnreadItem());
      //  // Unstable assertion: assertEquals((-67), rssShortItem1.getIndex());
      //  // Unstable assertion: assertFalse(date1.equals((Object)date0));
      //  // Unstable assertion: assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      RssItem rssItem0 = new RssItem();
      RssShortItem rssShortItem0 = new RssShortItem(rssItem0, 0);
      Date date0 = new Date();
      RssShortItem rssShortItem1 = new RssShortItem("", date0, true, 0);
      boolean boolean0 = rssShortItem0.equals(rssShortItem1);
      assertEquals(0, rssShortItem1.getIndex());
      assertTrue(rssShortItem1.isUnreadItem());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      RssItem rssItem0 = new RssItem();
      RssShortItem rssShortItem0 = new RssShortItem(rssItem0, 0);
      boolean boolean0 = rssShortItem0.equals(rssShortItem0);
      assertEquals(0, rssShortItem0.getIndex());
      assertTrue(boolean0);
      assertFalse(rssShortItem0.isUnreadItem());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Date date0 = new Date();
      RssItem rssItem0 = new RssItem("", "", "", date0, "", true);
      RssShortItem rssShortItem0 = new RssShortItem(rssItem0, 0);
      RssShortItem rssShortItem1 = new RssShortItem("I", date0, true, 0);
      boolean boolean0 = rssShortItem0.equals(rssShortItem1);
      assertFalse(boolean0);
      assertEquals(0, rssShortItem1.getIndex());
      assertTrue(rssShortItem1.isUnreadItem());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      RssShortItem rssShortItem0 = new RssShortItem("", (Date) null, false, 0);
      rssShortItem0.getDate();
      assertEquals(0, rssShortItem0.getIndex());
      assertFalse(rssShortItem0.isUnreadItem());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Date date0 = new Date();
      RssItem rssItem0 = new RssItem("", "", "", date0, "", true);
      RssShortItem rssShortItem0 = new RssShortItem(rssItem0, 0);
      rssShortItem0.setTitle("");
      assertTrue(rssShortItem0.isUnreadItem());
      assertEquals(0, rssShortItem0.getIndex());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      RssShortItem rssShortItem0 = new RssShortItem("", (Date) null, false, 0);
      rssShortItem0.setIndex(0);
      assertFalse(rssShortItem0.isUnreadItem());
      assertEquals(0, rssShortItem0.getIndex());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      RssItem rssItem0 = new RssItem();
      RssShortItem rssShortItem0 = new RssShortItem(rssItem0, 0);
      Date date0 = new Date(0L);
      rssShortItem0.setDate(date0);
      RssShortItem rssShortItem1 = new RssShortItem(rssItem0, 0);
      boolean boolean0 = rssShortItem0.equals(rssShortItem1);
      assertEquals(0, rssShortItem1.getIndex());
      assertFalse(rssShortItem1.isUnreadItem());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Date date0 = new Date();
      RssShortItem rssShortItem0 = new RssShortItem("", date0, false, 0);
      rssShortItem0.getTitle();
      assertEquals(0, rssShortItem0.getIndex());
      assertFalse(rssShortItem0.isUnreadItem());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Date date0 = new Date();
      RssItem rssItem0 = new RssItem("", "", "", date0, "", true);
      RssShortItem rssShortItem0 = new RssShortItem(rssItem0, 0);
      boolean boolean0 = rssShortItem0.isUnreadItem();
      assertEquals(0, rssShortItem0.getIndex());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      RssItem rssItem0 = new RssItem();
      RssShortItem rssShortItem0 = new RssShortItem(rssItem0, 0);
      String string0 = rssShortItem0.toString();
      assertEquals("|null|false|0", string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Date date0 = new Date();
      RssItem rssItem0 = new RssItem("", "", "", date0, "", true);
      RssShortItem rssShortItem0 = new RssShortItem(rssItem0, 0);
      int int0 = rssShortItem0.getIndex();
      assertTrue(rssShortItem0.isUnreadItem());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      RssItem rssItem0 = new RssItem();
      RssShortItem rssShortItem0 = new RssShortItem(rssItem0, 0);
      rssShortItem0.setUnreadItem(false);
      assertFalse(rssShortItem0.isUnreadItem());
      assertEquals(0, rssShortItem0.getIndex());
  }
}