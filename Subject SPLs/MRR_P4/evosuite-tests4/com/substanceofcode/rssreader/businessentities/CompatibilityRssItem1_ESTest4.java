/*
 * This file was automatically generated by EvoSuite
 * Sun Aug 12 15:50:27 KST 2018
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
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.Date;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class CompatibilityRssItem1_ESTest4 extends CompatibilityRssItem1_ESTest_scaffolding4 {
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
      CompatibilityRssItem1 compatibilityRssItem1_0 = new CompatibilityRssItem1();
      // Undeclared exception!
      try { 
        compatibilityRssItem1_0.equals((RssItem) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.substanceofcode.rssreader.businessentities.CompatibilityRssItem1", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      // Undeclared exception!
      try { 
        CompatibilityRssItem1.deserialize1("uCfD9");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      // Undeclared exception!
      try { 
        CompatibilityRssItem1.deserialize1("|");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // unexpected code: |
         //
         verifyException("com.substanceofcode.utils.CompatibilityBase64", e);
      }
  }





  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CompatibilityRssItem1 compatibilityRssItem1_0 = new CompatibilityRssItem1("", "", "");
      CompatibilityRssItem1 compatibilityRssItem1_1 = new CompatibilityRssItem1(compatibilityRssItem1_0);
      Date date0 = new Date(0L);
      compatibilityRssItem1_0.m_date = date0;
      boolean boolean0 = compatibilityRssItem1_0.equals((RssItem) compatibilityRssItem1_1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CompatibilityRssItem1 compatibilityRssItem1_0 = new CompatibilityRssItem1();
      Date date0 = new Date();
      compatibilityRssItem1_0.m_date = date0;
      boolean boolean0 = compatibilityRssItem1_0.equals((RssItem) compatibilityRssItem1_0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CompatibilityRssItem1 compatibilityRssItem1_0 = new CompatibilityRssItem1("", "", "");
      CompatibilityRssItem1 compatibilityRssItem1_1 = new CompatibilityRssItem1(compatibilityRssItem1_0);
      compatibilityRssItem1_0.m_desc = "X";
      boolean boolean0 = compatibilityRssItem1_0.equals((RssItem) compatibilityRssItem1_1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CompatibilityRssItem1 compatibilityRssItem1_0 = new CompatibilityRssItem1();
      RssItem rssItem0 = new RssItem();
      rssItem0.m_link = "|";
      boolean boolean0 = compatibilityRssItem1_0.equals(rssItem0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CompatibilityRssItem1 compatibilityRssItem1_0 = new CompatibilityRssItem1();
      Date date0 = new Date(0L);
      CompatibilityRssItem1 compatibilityRssItem1_1 = new CompatibilityRssItem1("O", "", "", date0);
      boolean boolean0 = compatibilityRssItem1_0.equals((RssItem) compatibilityRssItem1_1);
      assertEquals("", compatibilityRssItem1_1.getLink());
      assertEquals("", compatibilityRssItem1_1.getDescription());
      assertEquals("O", compatibilityRssItem1_1.getTitle());
      assertFalse(boolean0);
  }


  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      // Undeclared exception!
      try { 
        CompatibilityRssItem1.deserialize1("fHxYfHx8");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"X\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      CompatibilityRssItem1 compatibilityRssItem1_0 = CompatibilityRssItem1.deserialize1("fHx8");
      assertEquals("", compatibilityRssItem1_0.getDescription());
      assertEquals("", compatibilityRssItem1_0.getTitle());
      assertEquals("", compatibilityRssItem1_0.getLink());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Date date0 = new Date(0L);
      CompatibilityRssItem1 compatibilityRssItem1_0 = new CompatibilityRssItem1("", "", "", date0);
      String string0 = compatibilityRssItem1_0.serialize();
      assertEquals("fHwwfA==", string0);
  }


  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      CompatibilityRssItem1 compatibilityRssItem1_0 = new CompatibilityRssItem1();
      CompatibilityRssItem1 compatibilityRssItem1_1 = new CompatibilityRssItem1(compatibilityRssItem1_0);
      Date date0 = new Date();
      compatibilityRssItem1_0.m_date = date0;
      ZoneOffset zoneOffset0 = ZoneOffset.MIN;
      OffsetDateTime offsetDateTime0 = OffsetDateTime.now((ZoneId) zoneOffset0);
      OffsetDateTime offsetDateTime1 = offsetDateTime0.minusYears((-1L));
      LocalDateTime localDateTime0 = offsetDateTime1.toLocalDateTime();
      Instant instant0 = localDateTime0.toInstant(zoneOffset0);
      Date date1 = Date.from(instant0);
      compatibilityRssItem1_1.m_date = date1;
      boolean boolean0 = compatibilityRssItem1_0.equals((RssItem) compatibilityRssItem1_1);
      assertFalse(boolean0);
  }
}
