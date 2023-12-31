/*
 * This file was automatically generated by EvoSuite
 * Sun Aug 12 14:46:24 KST 2018
 */

package com.substanceofcode.rssreader.businessentities;

import static org.junit.Assert.assertEquals;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
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
public class CompatibilityRssItem3_ESTest1 extends CompatibilityRssItem3_ESTest_scaffolding1 {
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
      CompatibilityRssItem3 compatibilityRssItem3_0 = new CompatibilityRssItem3("", (String) null, "", date0, "", true);
      String string0 = compatibilityRssItem3_0.toString();
      //  // Unstable assertion: assertTrue(compatibilityRssItem3_0.isUnreadItem());
      //  // Unstable assertion: assertEquals("|null|Sun Aug 12 14:45:59 KST 2018||true|", string0);
      //  // Unstable assertion: assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CompatibilityRssItem3 compatibilityRssItem3_0 = CompatibilityRssItem3.deserialize3("");
      compatibilityRssItem3_0.setDuration("");
      String string0 = compatibilityRssItem3_0.toString();
      assertEquals("||null||false|", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CompatibilityRssItem3 compatibilityRssItem3_0 = CompatibilityRssItem3.unencodedDeserialize3("|");
      String string0 = compatibilityRssItem3_0.toString();
      assertEquals("||null||false|", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CompatibilityRssItem3 compatibilityRssItem3_0 = CompatibilityRssItem3.unencodedDeserialize3("");
      CompatibilityRssItem3 compatibilityRssItem3_1 = new CompatibilityRssItem3(compatibilityRssItem3_0);
      compatibilityRssItem3_0.setUnreadItem(true);
      compatibilityRssItem3_0.m_desc = "W";
      boolean boolean0 = compatibilityRssItem3_0.equals((RssItem) compatibilityRssItem3_1);
      assertTrue(compatibilityRssItem3_0.isUnreadItem());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Date date0 = new Date(0L);
      CompatibilityRssItem3 compatibilityRssItem3_0 = new CompatibilityRssItem3("}3C{'An>,[b:mhziiRl", "", "", date0, "", true);
      compatibilityRssItem3_0.m_itunes = true;
      RssItunesItem rssItunesItem0 = new RssItunesItem("}3C{'An>,[b:mhziiRl", "3", (String) null, date0, "", false, false, "", "", "", (byte)0, "");
      boolean boolean0 = compatibilityRssItem3_0.equals((RssItem) rssItunesItem0);
      assertEquals("}3C{'An>,[b:mhziiRl", compatibilityRssItem3_0.getTitle());
      assertTrue(compatibilityRssItem3_0.isUnreadItem());
      assertEquals("", compatibilityRssItem3_0.getLink());
      assertFalse(boolean0);
      assertEquals("", compatibilityRssItem3_0.getEnclosure());
      assertEquals("", compatibilityRssItem3_0.getDescription());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Date date0 = new Date(0L);
      CompatibilityRssItem3 compatibilityRssItem3_0 = new CompatibilityRssItem3("l", "", "", date0, "", true);
      CompatibilityRssItem3 compatibilityRssItem3_1 = CompatibilityRssItem3.deserialize3("");
      boolean boolean0 = compatibilityRssItem3_0.equals((RssItem) compatibilityRssItem3_1);
      assertEquals("", compatibilityRssItem3_1.getTitle());
      assertEquals("", compatibilityRssItem3_0.getLink());
      assertEquals("l", compatibilityRssItem3_0.getTitle());
      assertFalse(boolean0);
      assertTrue(compatibilityRssItem3_0.isUnreadItem());
      assertEquals("", compatibilityRssItem3_0.getEnclosure());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CompatibilityRssItem3 compatibilityRssItem3_0 = new CompatibilityRssItem3();
      compatibilityRssItem3_0.m_itunes = true;
      CompatibilityRssItem3 compatibilityRssItem3_1 = CompatibilityRssItem3.unencodedDeserialize3("3");
      boolean boolean0 = compatibilityRssItem3_0.equals((RssItem) compatibilityRssItem3_1);
      assertFalse(boolean0);
      assertEquals("3", compatibilityRssItem3_1.getTitle());
      assertEquals("", compatibilityRssItem3_1.getLink());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CompatibilityRssItem3 compatibilityRssItem3_0 = CompatibilityRssItem3.unencodedDeserialize3("\r\n");
      assertEquals("\r|", compatibilityRssItem3_0.getTitle());
      assertEquals("", compatibilityRssItem3_0.getLink());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CompatibilityRssItem3 compatibilityRssItem3_0 = CompatibilityRssItem3.unencodedDeserialize3("");
      String[] stringArray0 = new String[6];
      compatibilityRssItem3_0.init(0, true, false, stringArray0);
      assertEquals("", compatibilityRssItem3_0.getDuration());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CompatibilityRssItem3 compatibilityRssItem3_0 = CompatibilityRssItem3.deserialize3("");
      String[] stringArray0 = new String[3];
      compatibilityRssItem3_0.init(1, true, true, stringArray0);
      assertEquals(8, RssItunesItem.IDATE_OFFSET);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CompatibilityRssItem3 compatibilityRssItem3_0 = CompatibilityRssItem3.unencodedDeserialize3("");
      compatibilityRssItem3_0.m_itunes = true;
      String[] stringArray0 = new String[6];
      compatibilityRssItem3_0.init(0, true, false, stringArray0);
      assertFalse(compatibilityRssItem3_0.isUnreadItem());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CompatibilityRssItem3 compatibilityRssItem3_0 = new CompatibilityRssItem3();
      String[] stringArray0 = new String[9];
      stringArray0[0] = "";
      stringArray0[2] = "";
      stringArray0[4] = "";
      stringArray0[5] = "";
      compatibilityRssItem3_0.init(0, true, true, stringArray0);
      compatibilityRssItem3_0.unencodedSerialize3();
      assertEquals("|null|null|null", compatibilityRssItem3_0.getDescription());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CompatibilityRssItem3 compatibilityRssItem3_0 = CompatibilityRssItem3.unencodedDeserialize3("");
      compatibilityRssItem3_0.setAuthor("");
      String string0 = compatibilityRssItem3_0.unencodedSerialize3();
      assertEquals("||||0|", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CompatibilityRssItem3 compatibilityRssItem3_0 = CompatibilityRssItem3.deserialize3("");
      compatibilityRssItem3_0.m_enclosure = null;
      String string0 = compatibilityRssItem3_0.unencodedSerialize3();
      assertNotNull(string0);
      assertEquals("|||null|0|", string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      CompatibilityRssItem3 compatibilityRssItem3_0 = CompatibilityRssItem3.deserialize3("");
      assertEquals("", compatibilityRssItem3_0.getTitle());
      
      String[] stringArray0 = new String[3];
      stringArray0[0] = "";
      compatibilityRssItem3_0.init(0, true, true, stringArray0);
      String string0 = compatibilityRssItem3_0.serialize3();
      assertEquals("fG51bGx8fHwwfA==", string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      CompatibilityRssItem3 compatibilityRssItem3_0 = CompatibilityRssItem3.unencodedDeserialize3("");
      String[] stringArray0 = new String[6];
      stringArray0[2] = "I";
      compatibilityRssItem3_0.init(0, true, false, stringArray0);
      assertEquals("", compatibilityRssItem3_0.getAuthor());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      CompatibilityRssItem3 compatibilityRssItem3_0 = CompatibilityRssItem3.unencodedDeserialize3("||||");
      //  // Unstable assertion: assertTrue(compatibilityRssItem3_0.isUnreadItem());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      CompatibilityRssItem3 compatibilityRssItem3_0 = CompatibilityRssItem3.deserialize3("");
      compatibilityRssItem3_0.setUnreadItem(true);
      boolean boolean0 = compatibilityRssItem3_0.isUnreadItem();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      CompatibilityRssItem3 compatibilityRssItem3_0 = CompatibilityRssItem3.unencodedDeserialize3("V");
      String string0 = compatibilityRssItem3_0.getTitle();
      assertEquals("", compatibilityRssItem3_0.getLink());
      assertEquals("V", string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      CompatibilityRssItem3 compatibilityRssItem3_0 = CompatibilityRssItem3.deserialize3("O7y3p25qi");
      String string0 = compatibilityRssItem3_0.getTitle();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      CompatibilityRssItem3 compatibilityRssItem3_0 = new CompatibilityRssItem3();
      String[] stringArray0 = new String[9];
      stringArray0[0] = "";
      compatibilityRssItem3_0.init(0, true, true, stringArray0);
      String string0 = compatibilityRssItem3_0.getLink();
      assertNull(string0);
      assertEquals("", compatibilityRssItem3_0.getTitle());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      CompatibilityRssItem3 compatibilityRssItem3_0 = CompatibilityRssItem3.unencodedDeserialize3("|s");
      String string0 = compatibilityRssItem3_0.getLink();
      assertEquals("", compatibilityRssItem3_0.getTitle());
      assertEquals("s", string0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      CompatibilityRssItem3 compatibilityRssItem3_0 = CompatibilityRssItem3.deserialize3("");
      compatibilityRssItem3_0.m_enclosure = null;
      String string0 = compatibilityRssItem3_0.getEnclosure();
      assertEquals("", compatibilityRssItem3_0.getTitle());
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      CompatibilityRssItem3 compatibilityRssItem3_0 = CompatibilityRssItem3.unencodedDeserialize3("");
      compatibilityRssItem3_0.m_enclosure = "E";
      compatibilityRssItem3_0.getEnclosure();
      assertEquals("E", compatibilityRssItem3_0.getEnclosure());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      CompatibilityRssItem3 compatibilityRssItem3_0 = new CompatibilityRssItem3();
      compatibilityRssItem3_0.m_desc = "S";
      compatibilityRssItem3_0.getDescription();
      assertEquals("S", compatibilityRssItem3_0.getDescription());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      CompatibilityRssItem3 compatibilityRssItem3_0 = CompatibilityRssItem3.unencodedDeserialize3("");
      Date date0 = new Date();
      compatibilityRssItem3_0.m_date = date0;
      compatibilityRssItem3_0.getDate();
      assertEquals("", compatibilityRssItem3_0.getTitle());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Date date0 = new Date();
      CompatibilityRssItem3 compatibilityRssItem3_0 = new CompatibilityRssItem3("", "", "", date0, "", true);
      CompatibilityRssItem3 compatibilityRssItem3_1 = compatibilityRssItem3_0.copyTo(compatibilityRssItem3_0);
      assertEquals("", compatibilityRssItem3_1.getTitle());
      assertEquals("", compatibilityRssItem3_1.getDescription());
      assertEquals("", compatibilityRssItem3_1.getLink());
      assertTrue(compatibilityRssItem3_1.isUnreadItem());
      assertEquals("", compatibilityRssItem3_1.getEnclosure());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      CompatibilityRssItem3 compatibilityRssItem3_0 = CompatibilityRssItem3.deserialize3("");
      CompatibilityRssItem3 compatibilityRssItem3_1 = compatibilityRssItem3_0.copyTo(compatibilityRssItem3_0);
      compatibilityRssItem3_1.m_itunes = true;
      CompatibilityRssItem3 compatibilityRssItem3_2 = compatibilityRssItem3_0.copyTo(compatibilityRssItem3_1);
      assertEquals("", compatibilityRssItem3_2.getTitle());
      assertEquals("", compatibilityRssItem3_2.getEnclosure());
      assertEquals("", compatibilityRssItem3_2.getLink());
      assertFalse(compatibilityRssItem3_2.isUnreadItem());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Instant instant0 = Instant.EPOCH;
      Date date0 = Date.from(instant0);
      CompatibilityRssItem3 compatibilityRssItem3_0 = new CompatibilityRssItem3((String) null, (String) null, (String) null, date0, (String) null, true);
      // Undeclared exception!
      try { 
        compatibilityRssItem3_0.unencodedSerialize3();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.substanceofcode.rssreader.businessentities.CompatibilityRssItem3", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      CompatibilityRssItem3 compatibilityRssItem3_0 = CompatibilityRssItem3.deserialize3("");
      // Undeclared exception!
      try { 
        compatibilityRssItem3_0.equals((RssItem) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.substanceofcode.rssreader.businessentities.CompatibilityRssItem3", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      CompatibilityRssItem3 compatibilityRssItem3_0 = new CompatibilityRssItem3();
      // Undeclared exception!
      try { 
        compatibilityRssItem3_0.copyTo((CompatibilityRssItem3) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.substanceofcode.rssreader.businessentities.CompatibilityRssItem3", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      CompatibilityRssItem3 compatibilityRssItem3_0 = null;
      try {
        compatibilityRssItem3_0 = new CompatibilityRssItem3((RssItem) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.substanceofcode.rssreader.businessentities.CompatibilityRssItem3", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      CompatibilityRssItem3 compatibilityRssItem3_0 = null;
      try {
        compatibilityRssItem3_0 = new CompatibilityRssItem3((CompatibilityRssItem3) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.substanceofcode.rssreader.businessentities.CompatibilityRssItem3", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      CompatibilityRssItem3 compatibilityRssItem3_0 = CompatibilityRssItem3.unencodedDeserialize3((String) null);
      Date date0 = new Date(0);
      compatibilityRssItem3_0.m_date = date0;
      String string0 = compatibilityRssItem3_0.unencodedSerialize3();
      assertEquals("||0||0|", string0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      CompatibilityRssItem3 compatibilityRssItem3_0 = CompatibilityRssItem3.unencodedDeserialize3((String) null);
      RssItunesItem rssItunesItem0 = new RssItunesItem(compatibilityRssItem3_0);
      rssItunesItem0.setUnreadItem(true);
      boolean boolean0 = compatibilityRssItem3_0.equals((RssItem) rssItunesItem0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      CompatibilityRssItem3 compatibilityRssItem3_0 = CompatibilityRssItem3.deserialize3("");
      RssItunesItem rssItunesItem0 = new RssItunesItem(compatibilityRssItem3_0);
      compatibilityRssItem3_0.m_enclosure = null;
      compatibilityRssItem3_0.equals((RssItem) rssItunesItem0);
      assertEquals("", rssItunesItem0.getTitle());
      assertEquals("", compatibilityRssItem3_0.getTitle());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      CompatibilityRssItem3 compatibilityRssItem3_0 = CompatibilityRssItem3.unencodedDeserialize3((String) null);
      Date date0 = new Date(0);
      compatibilityRssItem3_0.m_date = date0;
      CompatibilityRssItem3 compatibilityRssItem3_1 = new CompatibilityRssItem3();
      boolean boolean0 = compatibilityRssItem3_1.equals((RssItem) compatibilityRssItem3_0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      CompatibilityRssItem3 compatibilityRssItem3_0 = CompatibilityRssItem3.deserialize3("");
      RssItem rssItem0 = new RssItem(compatibilityRssItem3_0);
      Date date0 = new Date();
      compatibilityRssItem3_0.m_date = date0;
      compatibilityRssItem3_0.equals(rssItem0);
      assertEquals("", rssItem0.getTitle());
      assertEquals("", compatibilityRssItem3_0.getTitle());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      CompatibilityRssItem3 compatibilityRssItem3_0 = CompatibilityRssItem3.unencodedDeserialize3((String) null);
      Date date0 = new Date(0);
      compatibilityRssItem3_0.m_date = date0;
      boolean boolean0 = compatibilityRssItem3_0.equals((RssItem) compatibilityRssItem3_0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      CompatibilityRssItem3 compatibilityRssItem3_0 = CompatibilityRssItem3.unencodedDeserialize3("\n");
      String string0 = compatibilityRssItem3_0.unencodedSerialize3();
      assertEquals("\u0001||||0|", string0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      CompatibilityRssItem3 compatibilityRssItem3_0 = CompatibilityRssItem3.unencodedDeserialize3("||0");
      assertEquals("", compatibilityRssItem3_0.getEnclosure());
      assertEquals("", compatibilityRssItem3_0.getTitle());
      assertEquals("", compatibilityRssItem3_0.getLink());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      CompatibilityRssItem3 compatibilityRssItem3_0 = CompatibilityRssItem3.deserialize3("");
      String[] stringArray0 = new String[3];
      stringArray0[0] = "";
      stringArray0[2] = "f";
      compatibilityRssItem3_0.init(0, true, true, stringArray0);
      assertEquals("", compatibilityRssItem3_0.getTitle());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      CompatibilityRssItem3 compatibilityRssItem3_0 = CompatibilityRssItem3.deserialize3("fHx8fDB8");
      //  // Unstable assertion: assertEquals("", compatibilityRssItem3_0.getTitle());
      //  // Unstable assertion: assertTrue(compatibilityRssItem3_0.isUnreadItem());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      CompatibilityRssItem3 compatibilityRssItem3_0 = CompatibilityRssItem3.unencodedDeserialize3((String) null);
      String[] stringArray0 = new String[1];
      compatibilityRssItem3_0.init(0, false, true, stringArray0);
      // Undeclared exception!
      try { 
        compatibilityRssItem3_0.serialize3();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.substanceofcode.rssreader.businessentities.CompatibilityRssItem3", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      CompatibilityRssItem3 compatibilityRssItem3_0 = CompatibilityRssItem3.deserialize3("");
      compatibilityRssItem3_0.isUnreadItem();
      assertEquals("", compatibilityRssItem3_0.getTitle());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      CompatibilityRssItem3 compatibilityRssItem3_0 = CompatibilityRssItem3.deserialize3("");
      String string0 = compatibilityRssItem3_0.getLink();
      assertEquals("", string0);
      assertEquals("", compatibilityRssItem3_0.getTitle());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      CompatibilityRssItem3 compatibilityRssItem3_0 = CompatibilityRssItem3.deserialize3("");
      String string0 = compatibilityRssItem3_0.getDescription();
      assertEquals("", compatibilityRssItem3_0.getTitle());
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      CompatibilityRssItem3 compatibilityRssItem3_0 = CompatibilityRssItem3.unencodedDeserialize3("");
      compatibilityRssItem3_0.setUnreadItem(true);
      String[] stringArray0 = new String[7];
      compatibilityRssItem3_0.init(0, false, true, stringArray0);
      assertTrue(compatibilityRssItem3_0.isUnreadItem());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      CompatibilityRssItem3 compatibilityRssItem3_0 = CompatibilityRssItem3.unencodedDeserialize3("");
      String string0 = compatibilityRssItem3_0.getEnclosure();
      assertEquals("", string0);
      assertEquals("", compatibilityRssItem3_0.getTitle());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      CompatibilityRssItem3 compatibilityRssItem3_0 = CompatibilityRssItem3.unencodedDeserialize3("");
      compatibilityRssItem3_0.getDate();
      assertEquals("", compatibilityRssItem3_0.getTitle());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      CompatibilityRssItem3 compatibilityRssItem3_0 = CompatibilityRssItem3.deserialize3("");
      compatibilityRssItem3_0.setEnclosure("");
      assertEquals("", compatibilityRssItem3_0.getTitle());
      assertEquals("", compatibilityRssItem3_0.getEnclosure());
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Instant instant0 = Instant.EPOCH;
      Date date0 = Date.from(instant0);
      CompatibilityRssItem3 compatibilityRssItem3_0 = new CompatibilityRssItem3((String) null, (String) null, (String) null, date0, (String) null, true);
      String string0 = compatibilityRssItem3_0.getTitle();
      assertTrue(compatibilityRssItem3_0.isUnreadItem());
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      CompatibilityRssItem3 compatibilityRssItem3_0 = CompatibilityRssItem3.deserialize3("");
      CompatibilityRssItem3 compatibilityRssItem3_1 = new CompatibilityRssItem3((RssItem) compatibilityRssItem3_0);
      assertFalse(compatibilityRssItem3_1.isUnreadItem());
      
      CompatibilityRssItem3 compatibilityRssItem3_2 = compatibilityRssItem3_0.copyTo(compatibilityRssItem3_1);
      assertEquals("", compatibilityRssItem3_1.getLink());
      assertEquals("", compatibilityRssItem3_2.getTitle());
      assertEquals("", compatibilityRssItem3_1.getEnclosure());
  }
}
