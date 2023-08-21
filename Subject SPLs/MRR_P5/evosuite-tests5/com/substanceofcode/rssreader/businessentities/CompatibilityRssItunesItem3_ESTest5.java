/*
 * This file was automatically generated by EvoSuite
 * Sun Aug 12 17:45:29 KST 2018
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

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class CompatibilityRssItunesItem3_ESTest5 extends CompatibilityRssItunesItem3_ESTest_scaffolding5 {
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
      CompatibilityRssItunesItem3 compatibilityRssItunesItem3_0 = new CompatibilityRssItunesItem3();
      compatibilityRssItunesItem3_0.setSummary("");
      boolean boolean0 = compatibilityRssItunesItem3_0.equals(compatibilityRssItunesItem3_0);
      assertEquals("", compatibilityRssItunesItem3_0.getSummary());
      assertTrue(boolean0);
  }


  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Instant instant0 = Instant.ofEpochSecond(0L);
      Date date0 = Date.from(instant0);
      CompatibilityRssItunesItem3 compatibilityRssItunesItem3_0 = new CompatibilityRssItunesItem3("", "", "", date0, "", true);
      boolean boolean0 = compatibilityRssItunesItem3_0.equals(compatibilityRssItunesItem3_0);
      assertTrue(boolean0);
  }


  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CompatibilityRssItem3 compatibilityRssItem3_0 = CompatibilityRssItunesItem3.unencodedDeserialize3("");
      ((CompatibilityRssItunesItem3) compatibilityRssItem3_0).setExplicit(1);
      assertEquals("clean", compatibilityRssItem3_0.getExplicit());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CompatibilityRssItunesItem3 compatibilityRssItunesItem3_0 = new CompatibilityRssItunesItem3();
      compatibilityRssItunesItem3_0.m_explicit = (byte) (-2);
      String string0 = compatibilityRssItunesItem3_0.toString();
      assertEquals("false||||-2||null||false|", string0);
  }


  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Date date0 = new Date(0L);
      CompatibilityRssItunesItem3 compatibilityRssItunesItem3_0 = new CompatibilityRssItunesItem3((String) null, (String) null, (String) null, date0, (String) null, true);
      compatibilityRssItunesItem3_0.setAuthor("");
      String string0 = compatibilityRssItunesItem3_0.toString();
      assertNotNull(string0);
      assertEquals("false||||-1null|null|Thu Jan 01 09:00:00 KST 1970|null|true|null", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CompatibilityRssItunesItem3 compatibilityRssItunesItem3_0 = new CompatibilityRssItunesItem3("", "", (String) null, (Date) null, "", true, true, "", "", "", (byte)0, "");
      String[] stringArray0 = new String[3];
      compatibilityRssItunesItem3_0.init(true, stringArray0);
      assertEquals("", compatibilityRssItunesItem3_0.getDuration());
      assertTrue(compatibilityRssItunesItem3_0.isItunes());
      assertEquals("", compatibilityRssItunesItem3_0.getSummary());
      assertEquals("", compatibilityRssItunesItem3_0.getSubtitle());
      assertEquals("", compatibilityRssItunesItem3_0.getAuthor());
      assertEquals("no", compatibilityRssItunesItem3_0.getExplicit());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CompatibilityRssItunesItem3 compatibilityRssItunesItem3_0 = new CompatibilityRssItunesItem3();
      Date date0 = new Date(0L);
      CompatibilityRssItunesItem3 compatibilityRssItunesItem3_1 = new CompatibilityRssItunesItem3("", "", "", date0, "", true, true, "", "", "", (byte) (-2), "");
      compatibilityRssItunesItem3_0.modifyItunes(compatibilityRssItunesItem3_1);
      compatibilityRssItunesItem3_0.unencodedSerialize3();
      assertTrue(compatibilityRssItunesItem3_0.isItunes());
  }


  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CompatibilityRssItunesItem3 compatibilityRssItunesItem3_0 = new CompatibilityRssItunesItem3();
      String[] stringArray0 = new String[4];
      stringArray0[0] = "";
      stringArray0[1] = "";
      stringArray0[2] = "|";
      stringArray0[3] = "";
      compatibilityRssItunesItem3_0.init(false, stringArray0);
      compatibilityRssItunesItem3_0.serialize3();
      //  // Unstable assertion: assertEquals("|", compatibilityRssItunesItem3_0.getSubtitle());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CompatibilityRssItunesItem3 compatibilityRssItunesItem3_0 = new CompatibilityRssItunesItem3("", (String) null, "", (Date) null, "", false);
      compatibilityRssItunesItem3_0.setAuthor((String) null);
      String string0 = compatibilityRssItunesItem3_0.serialize3();
      assertEquals("fHx8fHx8fG51bGx8fHwwfA==", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      CompatibilityRssItunesItem3 compatibilityRssItunesItem3_0 = new CompatibilityRssItunesItem3("", "", "", (Date) null, (String) null, true, true, "", "", "", (byte)0, "");
      CompatibilityRssItunesItem3 compatibilityRssItunesItem3_1 = new CompatibilityRssItunesItem3("", "", "", (Date) null, (String) null, false, false, "", "", (String) null, (byte)0, "");
      compatibilityRssItunesItem3_0.copyTo(compatibilityRssItunesItem3_1);
      assertTrue(compatibilityRssItunesItem3_1.isUnreadItem());
      assertTrue(compatibilityRssItunesItem3_0.isItunes());
  }


  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Date date0 = new Date(0L);
      CompatibilityRssItunesItem3 compatibilityRssItunesItem3_0 = new CompatibilityRssItunesItem3("", "", "", date0, "", false, false, (String) null, "", "", (byte)0, "");
      boolean boolean0 = compatibilityRssItunesItem3_0.isItunes();
      assertEquals("unspecified", compatibilityRssItunesItem3_0.getExplicit());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      CompatibilityRssItunesItem3 compatibilityRssItunesItem3_0 = new CompatibilityRssItunesItem3();
      compatibilityRssItunesItem3_0.setSummary("O");
      compatibilityRssItunesItem3_0.getSummary();
      assertEquals("O", compatibilityRssItunesItem3_0.getSummary());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      CompatibilityRssItunesItem3 compatibilityRssItunesItem3_0 = new CompatibilityRssItunesItem3("", "", "", (Date) null, "", false, true, "", "E", (String) null, (byte)0, "");
      String string0 = compatibilityRssItunesItem3_0.getSubtitle();
      assertEquals("", compatibilityRssItunesItem3_0.getAuthor());
      assertEquals("", compatibilityRssItunesItem3_0.getDuration());
      assertTrue(compatibilityRssItunesItem3_0.isItunes());
      assertEquals("E", string0);
      assertNotNull(string0);
      assertEquals("no", compatibilityRssItunesItem3_0.getExplicit());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Date date0 = new Date(0L);
      CompatibilityRssItunesItem3 compatibilityRssItunesItem3_0 = new CompatibilityRssItunesItem3("", "", "", date0, "", false, false, (String) null, "", "", (byte)0, "");
      compatibilityRssItunesItem3_0.m_duration = null;
      String string0 = compatibilityRssItunesItem3_0.getDuration();
      assertEquals("unspecified", compatibilityRssItunesItem3_0.getExplicit());
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      CompatibilityRssItunesItem3 compatibilityRssItunesItem3_0 = new CompatibilityRssItunesItem3();
      compatibilityRssItunesItem3_0.m_duration = "O";
      compatibilityRssItunesItem3_0.getDuration();
      assertEquals("O", compatibilityRssItunesItem3_0.getDuration());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      CompatibilityRssItunesItem3 compatibilityRssItunesItem3_0 = new CompatibilityRssItunesItem3();
      String[] stringArray0 = new String[9];
      stringArray0[0] = "";
      stringArray0[1] = "f";
      compatibilityRssItunesItem3_0.init(true, stringArray0);
      compatibilityRssItunesItem3_0.getAuthor();
      //  // Unstable assertion: assertTrue(compatibilityRssItunesItem3_0.isItunes());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      CompatibilityRssItem3 compatibilityRssItem3_0 = CompatibilityRssItunesItem3.deserialize3("Error");
      assertNull(compatibilityRssItem3_0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      CompatibilityRssItunesItem3 compatibilityRssItunesItem3_0 = new CompatibilityRssItunesItem3();
      String[] stringArray0 = new String[4];
      stringArray0[0] = "";
      compatibilityRssItunesItem3_0.init(false, stringArray0);
      // Undeclared exception!
      try { 
        compatibilityRssItunesItem3_0.serialize3();
       //  fail("Expecting exception: NullPointerException");
       // Unstable assertion
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.substanceofcode.rssreader.businessentities.CompatibilityRssItunesItem3", e);
      }
  }


  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      CompatibilityRssItunesItem3 compatibilityRssItunesItem3_0 = new CompatibilityRssItunesItem3("", "", "", (Date) null, "", true, true, "", "", "", (byte)0, "");
      CompatibilityRssItunesItem3 compatibilityRssItunesItem3_1 = new CompatibilityRssItunesItem3((String) null, "", "", (Date) null, "", false, true, "", "", "", (byte)0, "");
      // Undeclared exception!
      try { 
        compatibilityRssItunesItem3_0.equals(compatibilityRssItunesItem3_1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.substanceofcode.rssreader.businessentities.RssItem", e);
      }
  }


  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Date date0 = new Date();
      CompatibilityRssItunesItem3 compatibilityRssItunesItem3_0 = new CompatibilityRssItunesItem3("", (String) null, "", date0, (String) null, true, true, "", "", "", (byte)0, (String) null);
      String string0 = compatibilityRssItunesItem3_0.unencodedSerialize3();
      //  // Unstable assertion: assertEquals("1||||0|null||null|1652d4f2e2e|null|1|", string0);
      //  // Unstable assertion: assertEquals("Sun Aug 12 17:44:48 KST 2018", date0.toString());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      CompatibilityRssItunesItem3 compatibilityRssItunesItem3_0 = (CompatibilityRssItunesItem3)CompatibilityRssItunesItem3.unencodedDeserialize3("");
      CompatibilityRssItunesItem3 compatibilityRssItunesItem3_1 = new CompatibilityRssItunesItem3();
      compatibilityRssItunesItem3_0.setSummary("P");
      boolean boolean0 = compatibilityRssItunesItem3_1.equals(compatibilityRssItunesItem3_0);
      assertEquals("P", compatibilityRssItunesItem3_0.getSummary());
      assertFalse(boolean0);
  }


  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Date date0 = new Date(0L);
      CompatibilityRssItunesItem3 compatibilityRssItunesItem3_0 = new CompatibilityRssItunesItem3("", "", "", date0, "", true, true, "", "", "", (byte)0, "");
      String string0 = compatibilityRssItunesItem3_0.getExplicit();
      assertEquals("", compatibilityRssItunesItem3_0.getAuthor());
      assertEquals("", compatibilityRssItunesItem3_0.getDuration());
      assertEquals("", compatibilityRssItunesItem3_0.getSubtitle());
      assertTrue(compatibilityRssItunesItem3_0.isItunes());
      assertEquals("", compatibilityRssItunesItem3_0.getSummary());
      assertEquals("no", string0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      CompatibilityRssItunesItem3 compatibilityRssItunesItem3_0 = new CompatibilityRssItunesItem3();
      String[] stringArray0 = new String[9];
      stringArray0[0] = "";
      stringArray0[1] = "";
      stringArray0[2] = "";
      stringArray0[3] = "";
      stringArray0[4] = "f";
      compatibilityRssItunesItem3_0.init(true, stringArray0);
      //  // Unstable assertion: assertTrue(compatibilityRssItunesItem3_0.isItunes());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Date date0 = new Date();
      CompatibilityRssItunesItem3 compatibilityRssItunesItem3_0 = new CompatibilityRssItunesItem3("", "", "", date0, "", false);
      String[] stringArray0 = new String[8];
      stringArray0[0] = "";
      stringArray0[4] = "";
      compatibilityRssItunesItem3_0.init(false, stringArray0);
      //  // Unstable assertion: assertTrue(compatibilityRssItunesItem3_0.isItunes());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      CompatibilityRssItunesItem3 compatibilityRssItunesItem3_0 = new CompatibilityRssItunesItem3();
      String[] stringArray0 = new String[9];
      stringArray0[0] = "";
      stringArray0[1] = "";
      stringArray0[2] = "";
      compatibilityRssItunesItem3_0.init(true, stringArray0);
      compatibilityRssItunesItem3_0.getSummary();
      //  // Unstable assertion: assertTrue(compatibilityRssItunesItem3_0.isItunes());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      CompatibilityRssItunesItem3 compatibilityRssItunesItem3_0 = new CompatibilityRssItunesItem3();
      String[] stringArray0 = new String[9];
      stringArray0[0] = "";
      compatibilityRssItunesItem3_0.init(true, stringArray0);
      // Undeclared exception!
      try { 
        compatibilityRssItunesItem3_0.unencodedSerialize3();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.substanceofcode.rssreader.businessentities.CompatibilityRssItunesItem3", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      CompatibilityRssItunesItem3 compatibilityRssItunesItem3_0 = new CompatibilityRssItunesItem3();
      compatibilityRssItunesItem3_0.setSubtitle("");
      boolean boolean0 = compatibilityRssItunesItem3_0.equals(compatibilityRssItunesItem3_0);
      assertTrue(boolean0);
      assertEquals("", compatibilityRssItunesItem3_0.getSubtitle());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      CompatibilityRssItunesItem3 compatibilityRssItunesItem3_0 = new CompatibilityRssItunesItem3();
      CompatibilityRssItunesItem3 compatibilityRssItunesItem3_1 = compatibilityRssItunesItem3_0.copyTo(compatibilityRssItunesItem3_0);
      assertEquals("unspecified", compatibilityRssItunesItem3_1.getExplicit());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      CompatibilityRssItem3 compatibilityRssItem3_0 = CompatibilityRssItunesItem3.unencodedDeserialize3("");
      String string0 = ((CompatibilityRssItunesItem3) compatibilityRssItem3_0).getDuration();
      //  // Unstable assertion: assertEquals("", string0);
      //  // Unstable assertion: assertTrue(compatibilityRssItem3_0.isItunes());
  }



  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      CompatibilityRssItem3 compatibilityRssItem3_0 = CompatibilityRssItunesItem3.unencodedDeserialize3("");
      String string0 = ((CompatibilityRssItunesItem3) compatibilityRssItem3_0).getAuthor();
      //  // Unstable assertion: assertTrue(compatibilityRssItem3_0.isItunes());
      //  // Unstable assertion: assertEquals("", string0);
  }


  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      CompatibilityRssItem3 compatibilityRssItem3_0 = CompatibilityRssItunesItem3.unencodedDeserialize3("");
      //  // Unstable assertion: assertNotNull(compatibilityRssItem3_0);
      
      boolean boolean0 = ((CompatibilityRssItunesItem3) compatibilityRssItem3_0).isItunes();
      //  // Unstable assertion: assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      CompatibilityRssItunesItem3 compatibilityRssItunesItem3_0 = new CompatibilityRssItunesItem3();
      compatibilityRssItunesItem3_0.setDuration("");
      String string0 = compatibilityRssItunesItem3_0.toString();
      assertEquals("false||||-1||null||false|", string0);
      assertEquals("", compatibilityRssItunesItem3_0.getDuration());
  }


  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      CompatibilityRssItem3 compatibilityRssItem3_0 = new CompatibilityRssItem3();
      CompatibilityRssItunesItem3 compatibilityRssItunesItem3_0 = new CompatibilityRssItunesItem3(compatibilityRssItem3_0);
  }
}
