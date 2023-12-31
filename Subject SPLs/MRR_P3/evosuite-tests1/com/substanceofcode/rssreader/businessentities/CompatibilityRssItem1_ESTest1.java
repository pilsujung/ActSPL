/*
 * This file was automatically generated by EvoSuite
 * Sun Aug 12 14:43:02 KST 2018
 */

package com.substanceofcode.rssreader.businessentities;

import static org.junit.Assert.assertEquals;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Date;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class CompatibilityRssItem1_ESTest1 extends CompatibilityRssItem1_ESTest_scaffolding1 {
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
      CompatibilityRssItem1 compatibilityRssItem1_0 = new CompatibilityRssItem1("", "", "", (Date) null);
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
        CompatibilityRssItem1.deserialize1("V");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      // Undeclared exception!
      try { 
        CompatibilityRssItem1.deserialize1("-");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // unexpected code: -
         //
         verifyException("com.substanceofcode.utils.CompatibilityBase64", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      // Undeclared exception!
      try { 
        CompatibilityRssItem1.deserialize1((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.substanceofcode.utils.CompatibilityBase64", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      // Undeclared exception!
      try { 
        CompatibilityRssItem1.deserialize1("");
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("com.substanceofcode.rssreader.businessentities.CompatibilityRssItem1", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CompatibilityRssItem1 compatibilityRssItem1_0 = null;
      try {
        compatibilityRssItem1_0 = new CompatibilityRssItem1((RssItem) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.substanceofcode.rssreader.businessentities.CompatibilityRssItem1", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CompatibilityRssItem1 compatibilityRssItem1_0 = new CompatibilityRssItem1();
      Date date0 = new Date();
      compatibilityRssItem1_0.m_date = date0;
      CompatibilityRssItem1 compatibilityRssItem1_1 = new CompatibilityRssItem1();
      Date date1 = new Date(0L);
      compatibilityRssItem1_1.m_date = date1;
      boolean boolean0 = compatibilityRssItem1_0.equals((RssItem) compatibilityRssItem1_1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CompatibilityRssItem1 compatibilityRssItem1_0 = new CompatibilityRssItem1();
      Date date0 = new Date(0L);
      CompatibilityRssItem1 compatibilityRssItem1_1 = new CompatibilityRssItem1("", "", "", date0);
      boolean boolean0 = compatibilityRssItem1_0.equals((RssItem) compatibilityRssItem1_1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CompatibilityRssItem1 compatibilityRssItem1_0 = new CompatibilityRssItem1();
      Date date0 = new Date();
      compatibilityRssItem1_0.m_date = date0;
      CompatibilityRssItem1 compatibilityRssItem1_1 = new CompatibilityRssItem1();
      boolean boolean0 = compatibilityRssItem1_0.equals((RssItem) compatibilityRssItem1_1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CompatibilityRssItem1 compatibilityRssItem1_0 = new CompatibilityRssItem1();
      boolean boolean0 = compatibilityRssItem1_0.equals((RssItem) compatibilityRssItem1_0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CompatibilityRssItem1 compatibilityRssItem1_0 = new CompatibilityRssItem1();
      Date date0 = new Date(0L);
      RssItem rssItem0 = new RssItem("", "?", "", date0, "", true);
      boolean boolean0 = compatibilityRssItem1_0.equals(rssItem0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Date date0 = new Date();
      CompatibilityRssItem1 compatibilityRssItem1_0 = new CompatibilityRssItem1("O", "", "", date0);
      CompatibilityRssItem1 compatibilityRssItem1_1 = new CompatibilityRssItem1();
      boolean boolean0 = compatibilityRssItem1_0.equals((RssItem) compatibilityRssItem1_1);
      assertEquals("O", compatibilityRssItem1_0.getTitle());
      assertEquals("", compatibilityRssItem1_0.getDescription());
      assertEquals("", compatibilityRssItem1_0.getLink());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Date date0 = new Date();
      CompatibilityRssItem1 compatibilityRssItem1_0 = new CompatibilityRssItem1("", "", "", date0);
      boolean boolean0 = compatibilityRssItem1_0.equals((RssItem) compatibilityRssItem1_0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      // Undeclared exception!
      try { 
        CompatibilityRssItem1.deserialize1("T3MzLG9eKz4qfHxPczMsb14rPip8fDE1MzQwNTI1Njc3NTd8");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"Os3,o^+>*\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      CompatibilityRssItem1 compatibilityRssItem1_0 = CompatibilityRssItem1.deserialize1("fHx8");
      assertEquals("", compatibilityRssItem1_0.getTitle());
      assertEquals("", compatibilityRssItem1_0.getDescription());
      assertEquals("", compatibilityRssItem1_0.getLink());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Date date0 = new Date();
      CompatibilityRssItem1 compatibilityRssItem1_0 = new CompatibilityRssItem1("", "", "", date0);
      String string0 = compatibilityRssItem1_0.serialize();
      //  // Unstable assertion: assertEquals("fHwxNTM0MDUyNTY5NjY2fA==", string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      CompatibilityRssItem1 compatibilityRssItem1_0 = new CompatibilityRssItem1("", "", "");
      assertEquals("", compatibilityRssItem1_0.getTitle());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      RssItem rssItem0 = new RssItem("", "", "", (Date) null, "", false);
      CompatibilityRssItem1 compatibilityRssItem1_0 = new CompatibilityRssItem1(rssItem0);
      rssItem0.m_desc = "A";
      boolean boolean0 = compatibilityRssItem1_0.equals(rssItem0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      CompatibilityRssItem1 compatibilityRssItem1_0 = new CompatibilityRssItem1();
      String string0 = compatibilityRssItem1_0.serialize();
      assertEquals("fHx8", string0);
  }
}
