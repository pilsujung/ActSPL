/*
 * This file was automatically generated by EvoSuite
 * Sun Aug 12 16:08:33 KST 2018
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

import java.time.Instant;
import java.util.Date;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.substanceofcode.utils.CauseException;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class RssItunesItem_ESTest4 extends RssItunesItem_ESTest_scaffolding4 {
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
      RssItunesItem rssItunesItem0 = new RssItunesItem("", "", "", date0, "", true, false, "", "", "", (byte)0, "");
      boolean boolean0 = rssItunesItem0.isItunes();
      assertEquals("unspecified", rssItunesItem0.getExplicit());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      RssItunesItem rssItunesItem0 = new RssItunesItem((String) null, (String) null, (String) null, (Date) null, "", false, false, "", "", "", (byte)0, "");
      rssItunesItem0.setItunes(true);
      assertFalse(rssItunesItem0.isItunes());
      assertEquals("unspecified", rssItunesItem0.getExplicit());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Date date0 = new Date();
      RssItunesItem rssItunesItem0 = new RssItunesItem("", "", "", date0, "", false, false, "", "", "", (byte)0, "");
      RssItunesItem rssItunesItem1 = new RssItunesItem(rssItunesItem0);
      rssItunesItem1.setExplicit(0);
      boolean boolean0 = rssItunesItem1.equals(rssItunesItem0);
      assertFalse(boolean0);
      assertEquals("no", rssItunesItem1.getExplicit());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Date date0 = new Date();
      RssItunesItem rssItunesItem0 = new RssItunesItem("", "", "", date0, "", false, false, "", "", "", (byte)0, "");
      boolean boolean0 = rssItunesItem0.equals(rssItunesItem0);
      //  // Unstable assertion: assertTrue(boolean0);
      //  // Unstable assertion: assertEquals("Sun Aug 12 16:08:06 KST 2018", date0.toString());
      //  // Unstable assertion: assertEquals("unspecified", rssItunesItem0.getExplicit());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Date date0 = new Date(0L);
      RssItunesItem rssItunesItem0 = new RssItunesItem("", "", "", date0, "", true, true, "", "", "", (byte)0, "");
      RssItunesItem rssItunesItem1 = new RssItunesItem(rssItunesItem0);
      rssItunesItem0.setAuthor("I");
      boolean boolean0 = rssItunesItem0.equals(rssItunesItem1);
      assertEquals("I", rssItunesItem0.getAuthor());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Date date0 = new Date();
      RssItunesItem rssItunesItem0 = new RssItunesItem("", "", "", date0, "", false, true, "", "", "", (byte)0, "");
      boolean boolean0 = rssItunesItem0.equals(rssItunesItem0);
      assertTrue(rssItunesItem0.isItunes());
      assertEquals("", rssItunesItem0.getSummary());
      assertEquals("no", rssItunesItem0.getExplicit());
      assertEquals("", rssItunesItem0.getDuration());
      assertEquals("", rssItunesItem0.getAuthor());
      assertEquals("", rssItunesItem0.getSubtitle());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Date date0 = new Date();
      RssItunesItem rssItunesItem0 = new RssItunesItem("", "", "", date0, "", false, true, "", "", "", (byte)0, "");
      String string0 = rssItunesItem0.toString();
      //  // Unstable assertion: assertEquals("", rssItunesItem0.getDuration());
      //  // Unstable assertion: assertEquals("true||||0||Sun Aug 12 16:08:06 KST 2018||false|", string0);
      //  // Unstable assertion: assertTrue(rssItunesItem0.isItunes());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Date date0 = new Date(0L);
      RssItunesItem rssItunesItem0 = new RssItunesItem("", "", "", date0, "", true, false, "", "", "", (byte)0, "");
      String string0 = rssItunesItem0.toString();
      assertEquals("false||||-1||Thu Jan 01 09:00:00 KST 1970||true|", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Date date0 = new Date(0L);
      RssItunesItem rssItunesItem0 = new RssItunesItem("", "", "", date0, "", true, true, "", "", "", (byte)0, "");
      String[] stringArray0 = new String[4];
      rssItunesItem0.init(true, stringArray0);
      assertEquals("", rssItunesItem0.getSubtitle());
      assertEquals("", rssItunesItem0.getSummary());
      assertEquals("", rssItunesItem0.getDuration());
      assertEquals("no", rssItunesItem0.getExplicit());
      assertEquals("", rssItunesItem0.getAuthor());
      assertTrue(rssItunesItem0.isItunes());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Date date0 = new Date(0L);
      RssItunesItem rssItunesItem0 = new RssItunesItem("", "", "", date0, "", true);
      rssItunesItem0.setExplicit((-1538));
      String string0 = rssItunesItem0.unencodedSerialize();
      assertEquals("||||-2||||0||1|", string0);
      assertEquals("unspecified", rssItunesItem0.getExplicit());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Date date0 = new Date(0L);
      RssItunesItem rssItunesItem0 = new RssItunesItem("", "", "", date0, "", true);
      rssItunesItem0.setSummary("");
      String string0 = rssItunesItem0.unencodedSerialize();
      assertEquals("||||||||0||1|", string0);
      assertEquals("", rssItunesItem0.getSummary());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      RssItunesItem rssItunesItem0 = new RssItunesItem();
      rssItunesItem0.setSubtitle("");
      String string0 = rssItunesItem0.serialize();
      assertEquals("fHx8fHx8fHx8fDB8", string0);
      assertEquals("", rssItunesItem0.getSubtitle());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      RssItunesItem rssItunesItem0 = new RssItunesItem();
      rssItunesItem0.m_author = "";
      String string0 = rssItunesItem0.serialize();
      assertEquals("fHx8fHx8fHx8fDB8", string0);
  }


  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      RssItunesItem rssItunesItem0 = (RssItunesItem)RssItunesItem.unencodedDeserialize("||||||||1||1|");
      //  // Unstable assertion: assertTrue(rssItunesItem0.isUnreadItem());
      //  // Unstable assertion: assertEquals("", rssItunesItem0.getAuthor());
      //  // Unstable assertion: assertEquals("unspecified", rssItunesItem0.getExplicit());
      //  // Unstable assertion: assertTrue(rssItunesItem0.isItunes());
      //  // Unstable assertion: assertEquals("", rssItunesItem0.getSummary());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Date date0 = new Date(0L);
      RssItunesItem rssItunesItem0 = new RssItunesItem("", "", "", date0, "", true, true, "", "", "", (byte)0, "");
      boolean boolean0 = rssItunesItem0.isItunes();
      assertEquals("", rssItunesItem0.getSubtitle());
      assertTrue(boolean0);
      assertEquals("", rssItunesItem0.getSummary());
      assertEquals("", rssItunesItem0.getDuration());
      assertEquals("no", rssItunesItem0.getExplicit());
      assertEquals("", rssItunesItem0.getAuthor());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      RssItunesItem rssItunesItem0 = new RssItunesItem((String) null, (String) null, (String) null, (Date) null, "", false, false, "", "", "", (byte)0, "");
      rssItunesItem0.setSummary((String) null);
      String string0 = rssItunesItem0.getSummary();
      assertEquals("unspecified", rssItunesItem0.getExplicit());
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Date date0 = new Date(0L);
      RssItunesItem rssItunesItem0 = new RssItunesItem("", "", "", date0, "", true, true, (String) null, (String) null, "J", (byte)0, "");
      String string0 = rssItunesItem0.getSummary();
      assertEquals("no", rssItunesItem0.getExplicit());
      assertEquals("J", string0);
      assertTrue(rssItunesItem0.isItunes());
      assertEquals("", rssItunesItem0.getDuration());
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Date date0 = new Date();
      RssItunesItem rssItunesItem0 = new RssItunesItem("", "", "", date0, "", true);
      rssItunesItem0.m_subtitle = null;
      String string0 = rssItunesItem0.getSubtitle();
      assertEquals("unspecified", rssItunesItem0.getExplicit());
      assertFalse(rssItunesItem0.isItunes());
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      RssItunesItem rssItunesItem0 = new RssItunesItem();
      rssItunesItem0.setSubtitle("G");
      rssItunesItem0.getSubtitle();
      assertEquals("G", rssItunesItem0.getSubtitle());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Date date0 = new Date();
      RssItunesItem rssItunesItem0 = new RssItunesItem("", "", "", date0, (String) null, false);
      rssItunesItem0.setDuration((String) null);
      String string0 = rssItunesItem0.getDuration();
      assertNull(string0);
      assertEquals("unspecified", rssItunesItem0.getExplicit());
      assertFalse(rssItunesItem0.isItunes());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Instant instant0 = Instant.ofEpochMilli(0L);
      Date date0 = Date.from(instant0);
      RssItunesItem rssItunesItem0 = new RssItunesItem("", "", "", date0, "", true, true, "", "", "", (byte)0, "N");
      String string0 = rssItunesItem0.getDuration();
      assertEquals("N", string0);
      assertEquals("", rssItunesItem0.getSummary());
      assertEquals("no", rssItunesItem0.getExplicit());
      assertEquals("", rssItunesItem0.getAuthor());
      assertTrue(rssItunesItem0.isItunes());
      assertEquals("", rssItunesItem0.getSubtitle());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Date date0 = new Date(0L);
      RssItunesItem rssItunesItem0 = new RssItunesItem("", "", "", date0, "", true, true, (String) null, (String) null, "", (byte)0, "");
      String string0 = rssItunesItem0.getAuthor();
      assertEquals("", rssItunesItem0.getDuration());
      assertNull(string0);
      assertEquals("", rssItunesItem0.getSummary());
      assertTrue(rssItunesItem0.isItunes());
      assertEquals("no", rssItunesItem0.getExplicit());
  }


  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Instant instant0 = Instant.EPOCH;
      Date date0 = Date.from(instant0);
      RssItunesItem rssItunesItem0 = new RssItunesItem("", "", "", date0, "", true, true, (String) null, "", "", (byte)0, "");
      // Undeclared exception!
      try { 
        rssItunesItem0.serialize();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.substanceofcode.rssreader.businessentities.RssItunesItem", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Date date0 = new Date(0L);
      RssItunesItem rssItunesItem0 = new RssItunesItem("", "", "", date0, "", false);
      // Undeclared exception!
      try { 
        rssItunesItem0.equals((RssItunesItem) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.substanceofcode.rssreader.businessentities.RssItem", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      try { 
        RssItunesItem.deserialize("lRkDL");
        fail("Expecting exception: CauseException");
      
      } catch(CauseException e) {
         //
         // Internal error while RssItunesItem deserialize 
         //
         verifyException("com.substanceofcode.rssreader.businessentities.RssItunesItem", e);
      }
  }


  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      RssItunesItem rssItunesItem0 = new RssItunesItem();
      RssItunesItem rssItunesItem1 = new RssItunesItem(rssItunesItem0);
      rssItunesItem1.setExplicit((-2));
      boolean boolean0 = rssItunesItem1.equals(rssItunesItem0);
      assertEquals("", rssItunesItem1.getDuration());
      assertEquals("", rssItunesItem1.getSubtitle());
      assertFalse(boolean0);
      assertFalse(rssItunesItem1.isItunes());
      assertEquals("unspecified", rssItunesItem1.getExplicit());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      RssItunesItem rssItunesItem0 = new RssItunesItem();
      Date date0 = new Date(0L);
      RssItunesItem rssItunesItem1 = new RssItunesItem("", "", "", date0, "", false);
      boolean boolean0 = rssItunesItem0.equals(rssItunesItem1);
      assertEquals("unspecified", rssItunesItem0.getExplicit());
      assertFalse(boolean0);
      assertFalse(rssItunesItem0.isItunes());
      assertEquals("unspecified", rssItunesItem1.getExplicit());
      assertFalse(rssItunesItem1.isItunes());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Date date0 = new Date(0L);
      RssItunesItem rssItunesItem0 = new RssItunesItem("", "", "", date0, "", true, true, (String) null, (String) null, "", (byte)1, "");
      String string0 = rssItunesItem0.getExplicit();
      assertEquals("", rssItunesItem0.getSummary());
      assertEquals("", rssItunesItem0.getDuration());
      assertEquals("clean", string0);
      assertTrue(rssItunesItem0.isItunes());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      RssItunesItem rssItunesItem0 = new RssItunesItem();
      String string0 = rssItunesItem0.getExplicit();
      assertFalse(rssItunesItem0.isItunes());
      assertEquals("unspecified", string0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      RssItunesItem rssItunesItem0 = new RssItunesItem();
      assertEquals("unspecified", rssItunesItem0.getExplicit());
      
      rssItunesItem0.m_explicit = (byte)0;
      rssItunesItem0.getExplicit();
      assertEquals("no", rssItunesItem0.getExplicit());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      RssItunesItem rssItunesItem0 = new RssItunesItem();
      String[] stringArray0 = new String[9];
      stringArray0[0] = "";
      stringArray0[4] = "";
      try { 
        rssItunesItem0.init(false, stringArray0);
        fail("Expecting exception: CauseException");
      
      } catch(CauseException e) {
         //
         // Internal error while RssItem init 
         //
         verifyException("com.substanceofcode.rssreader.businessentities.RssItem", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Date date0 = new Date();
      RssItunesItem rssItunesItem0 = new RssItunesItem("", "", "", date0, "", true, true, "", "", "", (byte)0, "");
      String string0 = rssItunesItem0.unencodedSerialize();
      //  // Unstable assertion: assertEquals("1||||0||||1652cf68dff||1|", string0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      RssItem rssItem0 = new RssItem();
      RssItunesItem rssItunesItem0 = new RssItunesItem(rssItem0);
      RssItunesItem rssItunesItem1 = new RssItunesItem(rssItem0);
      rssItunesItem1.setAuthor("P");
      boolean boolean0 = rssItunesItem1.equals(rssItunesItem0);
      assertEquals("P", rssItunesItem1.getAuthor());
      assertFalse(boolean0);
  }


  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      RssItunesItem rssItunesItem0 = new RssItunesItem();
      String string0 = rssItunesItem0.getDuration();
      assertEquals("unspecified", rssItunesItem0.getExplicit());
      assertEquals("", string0);
      assertFalse(rssItunesItem0.isItunes());
  }


  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Date date0 = new Date(0L);
      RssItunesItem rssItunesItem0 = new RssItunesItem("", "", "", date0, "", true, false, "", "", "", (byte)0, "");
      rssItunesItem0.setDuration("");
      assertEquals("unspecified", rssItunesItem0.getExplicit());
      assertEquals("", rssItunesItem0.getDuration());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Date date0 = new Date();
      RssItunesItem rssItunesItem0 = new RssItunesItem("", "", "", date0, "", true);
      String string0 = rssItunesItem0.getSummary();
      assertEquals("unspecified", rssItunesItem0.getExplicit());
      assertFalse(rssItunesItem0.isItunes());
      assertEquals("", string0);
  }
}