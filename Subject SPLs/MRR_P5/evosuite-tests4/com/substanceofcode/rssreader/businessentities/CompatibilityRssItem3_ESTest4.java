/*
 * This file was automatically generated by EvoSuite
 * Sun Aug 12 15:54:13 KST 2018
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
public class CompatibilityRssItem3_ESTest4 extends CompatibilityRssItem3_ESTest_scaffolding4 {
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
      CompatibilityRssItem3 compatibilityRssItem3_0 = CompatibilityRssItem3.deserialize3("");
      compatibilityRssItem3_0.m_desc = "";
      String string0 = compatibilityRssItem3_0.toString();
      assertEquals("||null||false|", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CompatibilityRssItem3 compatibilityRssItem3_0 = CompatibilityRssItem3.deserialize3("");
      compatibilityRssItem3_0.m_itunes = true;
      String string0 = compatibilityRssItem3_0.toString();
      assertEquals("||null||false|", string0);
  }



  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CompatibilityRssItem3 compatibilityRssItem3_0 = CompatibilityRssItem3.deserialize3("");
      CompatibilityRssItem3 compatibilityRssItem3_1 = CompatibilityRssItem3.deserialize3("");
      String[] stringArray0 = new String[9];
      stringArray0[0] = "";
      stringArray0[1] = "";
      stringArray0[2] = "";
      stringArray0[4] = "";
      stringArray0[5] = "";
      compatibilityRssItem3_0.init(0, false, false, stringArray0);
      boolean boolean0 = compatibilityRssItem3_0.equals((RssItem) compatibilityRssItem3_1);
      //  // Unstable assertion: assertTrue(compatibilityRssItem3_0.isUnreadItem());
      //  // Unstable assertion: assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CompatibilityRssItem3 compatibilityRssItem3_0 = CompatibilityRssItem3.deserialize3("");
      String[] stringArray0 = new String[9];
      stringArray0[0] = "";
      stringArray0[1] = "";
      stringArray0[2] = "";
      stringArray0[4] = "";
      stringArray0[5] = "";
      compatibilityRssItem3_0.init(0, false, false, stringArray0);
      // Undeclared exception!
      try { 
        compatibilityRssItem3_0.equals((RssItem) compatibilityRssItem3_0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CompatibilityRssItem3 compatibilityRssItem3_0 = CompatibilityRssItem3.unencodedDeserialize3("Internal error while RssItem unencodedDeserialize ");
      Date date0 = new Date();
      compatibilityRssItem3_0.setUnreadItem(true);
      RssItunesItem rssItunesItem0 = new RssItunesItem("Internal error while RssItem unencodedDeserialize ", "u", "", date0, "", true);
      boolean boolean0 = compatibilityRssItem3_0.equals((RssItem) rssItunesItem0);
      assertTrue(compatibilityRssItem3_0.isUnreadItem());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CompatibilityRssItem3 compatibilityRssItem3_0 = CompatibilityRssItem3.deserialize3("unequalitemmenclosurethis");
      compatibilityRssItem3_0.m_itunes = true;
      RssItunesItem rssItunesItem0 = new RssItunesItem();
      rssItunesItem0.m_link = "u";
      boolean boolean0 = compatibilityRssItem3_0.equals((RssItem) rssItunesItem0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CompatibilityRssItem3 compatibilityRssItem3_0 = CompatibilityRssItem3.unencodedDeserialize3("I");
      compatibilityRssItem3_0.setUnreadItem(true);
      RssItunesItem rssItunesItem0 = new RssItunesItem();
      boolean boolean0 = compatibilityRssItem3_0.equals((RssItem) rssItunesItem0);
      assertTrue(compatibilityRssItem3_0.isUnreadItem());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CompatibilityRssItem3 compatibilityRssItem3_0 = CompatibilityRssItem3.deserialize3("");
      CompatibilityRssItem3 compatibilityRssItem3_1 = CompatibilityRssItem3.unencodedDeserialize3("]");
      compatibilityRssItem3_0.m_itunes = true;
      boolean boolean0 = compatibilityRssItem3_0.equals((RssItem) compatibilityRssItem3_1);
      assertEquals("", compatibilityRssItem3_1.getLink());
      assertEquals("", compatibilityRssItem3_0.getTitle());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CompatibilityRssItem3 compatibilityRssItem3_0 = CompatibilityRssItem3.unencodedDeserialize3("e\n");
      assertEquals("e|", compatibilityRssItem3_0.getTitle());
      assertEquals("", compatibilityRssItem3_0.getLink());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CompatibilityRssItem3 compatibilityRssItem3_0 = CompatibilityRssItem3.deserialize3("");
      compatibilityRssItem3_0.m_itunes = true;
      String[] stringArray0 = new String[5];
      compatibilityRssItem3_0.init(0, true, false, stringArray0);
      assertNull(compatibilityRssItem3_0.getTitle());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CompatibilityRssItem3 compatibilityRssItem3_0 = CompatibilityRssItem3.unencodedDeserialize3("");
      String[] stringArray0 = new String[7];
      stringArray0[0] = "|";
      compatibilityRssItem3_0.init(0, false, false, stringArray0);
      compatibilityRssItem3_0.serialize3();
      assertEquals("|", compatibilityRssItem3_0.getTitle());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CompatibilityRssItem3 compatibilityRssItem3_0 = new CompatibilityRssItem3();
      String[] stringArray0 = new String[9];
      stringArray0[5] = "1";
      compatibilityRssItem3_0.init(3, true, false, stringArray0);
      assertEquals(500, RssItunesItem.MAX_SUMMARY);
  }


  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      CompatibilityRssItem3 compatibilityRssItem3_0 = CompatibilityRssItem3.unencodedDeserialize3((String) null);
      compatibilityRssItem3_0.setUnreadItem(true);
      boolean boolean0 = compatibilityRssItem3_0.isUnreadItem();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      CompatibilityRssItem3 compatibilityRssItem3_0 = CompatibilityRssItem3.unencodedDeserialize3((String) null);
      String[] stringArray0 = new String[2];
      compatibilityRssItem3_0.init(0, true, true, stringArray0);
      String string0 = compatibilityRssItem3_0.getTitle();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      CompatibilityRssItem3 compatibilityRssItem3_0 = CompatibilityRssItem3.unencodedDeserialize3("D");
      String string0 = compatibilityRssItem3_0.getTitle();
      assertEquals("", compatibilityRssItem3_0.getLink());
      assertEquals("D", string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Date date0 = new Date(0L);
      CompatibilityRssItem3 compatibilityRssItem3_0 = new CompatibilityRssItem3("", "", "", date0, "", true);
      assertEquals("", compatibilityRssItem3_0.getLink());
      
      String[] stringArray0 = new String[7];
      compatibilityRssItem3_0.init((byte)0, true, false, stringArray0);
      String string0 = compatibilityRssItem3_0.getLink();
      assertNull(string0);
      assertEquals("", compatibilityRssItem3_0.getDescription());
      assertTrue(compatibilityRssItem3_0.isUnreadItem());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Date date0 = new Date();
      CompatibilityRssItem3 compatibilityRssItem3_0 = new CompatibilityRssItem3("", "o", "", date0, "", false);
      String string0 = compatibilityRssItem3_0.getLink();
      assertEquals("o", string0);
      assertEquals("", compatibilityRssItem3_0.getEnclosure());
      assertEquals("", compatibilityRssItem3_0.getTitle());
      assertEquals("", compatibilityRssItem3_0.getDescription());
      assertFalse(compatibilityRssItem3_0.isUnreadItem());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      CompatibilityRssItem3 compatibilityRssItem3_0 = new CompatibilityRssItem3();
      compatibilityRssItem3_0.setEnclosure("O");
      compatibilityRssItem3_0.getEnclosure();
      assertEquals("O", compatibilityRssItem3_0.getEnclosure());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Date date0 = new Date();
      CompatibilityRssItem3 compatibilityRssItem3_0 = new CompatibilityRssItem3("", "", (String) null, date0, "", false);
      String string0 = compatibilityRssItem3_0.getDescription();
      assertFalse(compatibilityRssItem3_0.isUnreadItem());
      assertEquals("", compatibilityRssItem3_0.getEnclosure());
      assertEquals("", compatibilityRssItem3_0.getTitle());
      assertEquals("", compatibilityRssItem3_0.getLink());
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Date date0 = new Date(0L);
      RssItem rssItem0 = new RssItem("", "", "I", date0, (String) null, true);
      CompatibilityRssItem3 compatibilityRssItem3_0 = new CompatibilityRssItem3(rssItem0);
      String string0 = compatibilityRssItem3_0.getDescription();
      assertEquals("I", string0);
      assertTrue(compatibilityRssItem3_0.isUnreadItem());
      assertEquals("", compatibilityRssItem3_0.getTitle());
      assertEquals("", compatibilityRssItem3_0.getLink());
      assertNotNull(string0);
  }


  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      CompatibilityRssItem3 compatibilityRssItem3_0 = new CompatibilityRssItem3("", "", "", (Date) null, "", true);
      CompatibilityRssItem3 compatibilityRssItem3_1 = compatibilityRssItem3_0.copyTo(compatibilityRssItem3_0);
      assertTrue(compatibilityRssItem3_1.isUnreadItem());
      assertEquals("", compatibilityRssItem3_1.getTitle());
      assertEquals("", compatibilityRssItem3_1.getLink());
      assertEquals("", compatibilityRssItem3_1.getDescription());
      assertEquals("", compatibilityRssItem3_1.getEnclosure());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      CompatibilityRssItem3 compatibilityRssItem3_0 = new CompatibilityRssItem3();
      CompatibilityRssItem3 compatibilityRssItem3_1 = CompatibilityRssItem3.deserialize3((String) null);
      compatibilityRssItem3_1.m_itunes = true;
      CompatibilityRssItem3 compatibilityRssItem3_2 = compatibilityRssItem3_0.copyTo(compatibilityRssItem3_1);
      assertEquals("", compatibilityRssItem3_2.getTitle());
      assertEquals("", compatibilityRssItem3_2.getEnclosure());
      assertEquals("", compatibilityRssItem3_2.getLink());
      assertEquals("", compatibilityRssItem3_2.getDescription());
      assertTrue(compatibilityRssItem3_2.isItunes());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      CompatibilityRssItem3 compatibilityRssItem3_0 = CompatibilityRssItem3.unencodedDeserialize3((String) null);
      String[] stringArray0 = new String[5];
      compatibilityRssItem3_0.init(0, false, false, stringArray0);
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
  public void test27()  throws Throwable  {
      Date date0 = new Date(0L);
      CompatibilityRssItem3 compatibilityRssItem3_0 = new CompatibilityRssItem3((String) null, "", "", date0, "", true);
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
  public void test28()  throws Throwable  {
      CompatibilityRssItem3 compatibilityRssItem3_0 = CompatibilityRssItem3.deserialize3("");
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
      CompatibilityRssItem3 compatibilityRssItem3_0 = CompatibilityRssItem3.deserialize3("");
      compatibilityRssItem3_0.setUnreadItem(true);
      compatibilityRssItem3_0.unencodedSerialize3();
      assertTrue(compatibilityRssItem3_0.isUnreadItem());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      CompatibilityRssItem3 compatibilityRssItem3_0 = new CompatibilityRssItem3();
      String string0 = compatibilityRssItem3_0.unencodedSerialize3();
      assertEquals("||||0|", string0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      CompatibilityRssItem3 compatibilityRssItem3_0 = CompatibilityRssItem3.deserialize3("");
      Date date0 = new Date();
      compatibilityRssItem3_0.m_date = date0;
      String string0 = compatibilityRssItem3_0.unencodedSerialize3();
      //  // Unstable assertion: assertEquals("||1652ce96613||0|", string0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      CompatibilityRssItem3 compatibilityRssItem3_0 = new CompatibilityRssItem3();
      RssItunesItem rssItunesItem0 = new RssItunesItem(compatibilityRssItem3_0);
      compatibilityRssItem3_0.setUnreadItem(true);
      boolean boolean0 = compatibilityRssItem3_0.equals((RssItem) rssItunesItem0);
      assertTrue(compatibilityRssItem3_0.isUnreadItem());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      CompatibilityRssItem3 compatibilityRssItem3_0 = new CompatibilityRssItem3();
      compatibilityRssItem3_0.m_enclosure = "=";
      CompatibilityRssItem3 compatibilityRssItem3_1 = CompatibilityRssItem3.deserialize3("");
      compatibilityRssItem3_0.equals((RssItem) compatibilityRssItem3_1);
      assertEquals("", compatibilityRssItem3_1.getTitle());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      CompatibilityRssItem3 compatibilityRssItem3_0 = new CompatibilityRssItem3();
      String[] stringArray0 = new String[9];
      stringArray0[3] = "";
      stringArray0[4] = "";
      stringArray0[5] = "1";
      compatibilityRssItem3_0.init(3, false, false, stringArray0);
      RssItunesItem rssItunesItem0 = new RssItunesItem(compatibilityRssItem3_0);
      Date date0 = new Date();
      rssItunesItem0.m_date = date0;
      compatibilityRssItem3_0.equals((RssItem) rssItunesItem0);
      assertEquals("", rssItunesItem0.getLink());
      assertEquals("", compatibilityRssItem3_0.getLink());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      CompatibilityRssItem3 compatibilityRssItem3_0 = new CompatibilityRssItem3();
      String[] stringArray0 = new String[9];
      stringArray0[3] = "";
      stringArray0[4] = "";
      stringArray0[5] = "1";
      compatibilityRssItem3_0.init(3, false, false, stringArray0);
      // Undeclared exception!
      try { 
        compatibilityRssItem3_0.equals((RssItem) compatibilityRssItem3_0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      CompatibilityRssItem3 compatibilityRssItem3_0 = new CompatibilityRssItem3();
      CompatibilityRssItem3 compatibilityRssItem3_1 = CompatibilityRssItem3.unencodedDeserialize3("");
      Date date0 = new Date(0);
      compatibilityRssItem3_1.m_date = date0;
      boolean boolean0 = compatibilityRssItem3_1.equals((RssItem) compatibilityRssItem3_0);
      assertEquals("", compatibilityRssItem3_1.getTitle());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      CompatibilityRssItem3 compatibilityRssItem3_0 = new CompatibilityRssItem3();
      CompatibilityRssItem3 compatibilityRssItem3_1 = CompatibilityRssItem3.unencodedDeserialize3("");
      Date date0 = new Date(0);
      compatibilityRssItem3_1.m_date = date0;
      boolean boolean0 = compatibilityRssItem3_0.equals((RssItem) compatibilityRssItem3_1);
      assertEquals("", compatibilityRssItem3_1.getTitle());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Date date0 = new Date(0L);
      CompatibilityRssItem3 compatibilityRssItem3_0 = new CompatibilityRssItem3("", "", "R", date0, "", true);
      assertEquals("", compatibilityRssItem3_0.getLink());
      
      String[] stringArray0 = new String[7];
      stringArray0[4] = "";
      stringArray0[3] = "";
      compatibilityRssItem3_0.init((byte)3, true, true, stringArray0);
      CompatibilityRssItem3 compatibilityRssItem3_1 = CompatibilityRssItem3.deserialize3("");
      compatibilityRssItem3_1.equals((RssItem) compatibilityRssItem3_0);
      assertEquals("", compatibilityRssItem3_1.getTitle());
      assertTrue(compatibilityRssItem3_0.isUnreadItem());
      assertEquals("", compatibilityRssItem3_0.getEnclosure());
      assertEquals("R", compatibilityRssItem3_0.getDescription());
      assertEquals("", compatibilityRssItem3_0.getTitle());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      CompatibilityRssItem3 compatibilityRssItem3_0 = new CompatibilityRssItem3();
      boolean boolean0 = compatibilityRssItem3_0.equals((RssItem) compatibilityRssItem3_0);
      assertTrue(boolean0);
  }


  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      CompatibilityRssItem3 compatibilityRssItem3_0 = CompatibilityRssItem3.deserialize3("fHx8fHx8fHx8fDB8");
      assertEquals("|||||0|", compatibilityRssItem3_0.getDescription());
      assertEquals("", compatibilityRssItem3_0.getTitle());
      assertEquals("", compatibilityRssItem3_0.getLink());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      CompatibilityRssItem3 compatibilityRssItem3_0 = new CompatibilityRssItem3();
      String[] stringArray0 = new String[9];
      stringArray0[5] = "";
      stringArray0[7] = "";
      compatibilityRssItem3_0.init(3, false, false, stringArray0);
      //  // Unstable assertion: assertTrue(compatibilityRssItem3_0.isUnreadItem());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Date date0 = new Date();
      CompatibilityRssItem3 compatibilityRssItem3_0 = new CompatibilityRssItem3("", "", "", date0, "", false);
      String[] stringArray0 = new String[4];
      stringArray0[0] = "";
      stringArray0[2] = "";
      compatibilityRssItem3_0.init(0, false, true, stringArray0);
      String string0 = compatibilityRssItem3_0.getEnclosure();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Date date0 = new Date(0L);
      CompatibilityRssItem3 compatibilityRssItem3_0 = new CompatibilityRssItem3("", "", "", date0, "", true);
      String string0 = compatibilityRssItem3_0.serialize3();
      assertEquals("fHwwfHwxfA==", string0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Date date0 = new Date();
      CompatibilityRssItem3 compatibilityRssItem3_0 = new CompatibilityRssItem3("", "", "", date0, "", false);
      boolean boolean0 = compatibilityRssItem3_0.isUnreadItem();
      assertEquals("", compatibilityRssItem3_0.getEnclosure());
      assertEquals("", compatibilityRssItem3_0.getDescription());
      assertEquals("", compatibilityRssItem3_0.getLink());
      assertFalse(boolean0);
      assertEquals("", compatibilityRssItem3_0.getTitle());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Date date0 = new Date();
      CompatibilityRssItem3 compatibilityRssItem3_0 = new CompatibilityRssItem3("", "", "", date0, "", false);
      String string0 = compatibilityRssItem3_0.getLink();
      assertFalse(compatibilityRssItem3_0.isUnreadItem());
      assertEquals("", compatibilityRssItem3_0.getTitle());
      assertEquals("", string0);
      assertEquals("", compatibilityRssItem3_0.getDescription());
      assertEquals("", compatibilityRssItem3_0.getEnclosure());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      CompatibilityRssItem3 compatibilityRssItem3_0 = CompatibilityRssItem3.deserialize3("");
      String string0 = compatibilityRssItem3_0.getDescription();
      assertEquals("", string0);
      assertEquals("", compatibilityRssItem3_0.getTitle());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Date date0 = new Date();
      CompatibilityRssItem3 compatibilityRssItem3_0 = new CompatibilityRssItem3("", "", "", date0, "", false);
      String string0 = compatibilityRssItem3_0.getEnclosure();
      assertEquals("", string0);
      assertEquals("", compatibilityRssItem3_0.getTitle());
      assertEquals("", compatibilityRssItem3_0.getLink());
      assertEquals("", compatibilityRssItem3_0.getDescription());
      assertFalse(compatibilityRssItem3_0.isUnreadItem());
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Date date0 = new Date();
      CompatibilityRssItem3 compatibilityRssItem3_0 = new CompatibilityRssItem3("", "", "", date0, "", false);
      compatibilityRssItem3_0.getDate();
      //  // Unstable assertion: assertEquals("", compatibilityRssItem3_0.getDescription());
      //  // Unstable assertion: assertEquals("Sun Aug 12 15:53:30 KST 2018", date0.toString());
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      CompatibilityRssItem3 compatibilityRssItem3_0 = new CompatibilityRssItem3();
      CompatibilityRssItem3 compatibilityRssItem3_1 = new CompatibilityRssItem3(compatibilityRssItem3_0);
      assertEquals("", compatibilityRssItem3_1.getTitle());
      assertEquals("", compatibilityRssItem3_1.getLink());
      assertEquals("", compatibilityRssItem3_1.getDescription());
      assertFalse(compatibilityRssItem3_1.isUnreadItem());
      assertEquals("", compatibilityRssItem3_1.getEnclosure());
  }

}
