/*
 * This file was automatically generated by EvoSuite
 * Sun Aug 12 16:02:27 KST 2018
 */

package com.substanceofcode.rssreader.businessentities;

import static org.evosuite.shaded.org.mockito.Mockito.mock;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import static org.evosuite.runtime.EvoAssertions.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.time.Clock;
import java.time.LocalDate;
import java.time.chrono.IsoChronology;
import java.time.chrono.ThaiBuddhistChronology;
import java.time.chrono.ThaiBuddhistDate;
import java.time.temporal.TemporalAccessor;
import java.util.Date;
import java.util.Enumeration;
import java.util.function.BiFunction;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.substanceofcode.utils.CauseException;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class RssFeedStore_ESTest4 extends RssFeedStore_ESTest_scaffolding4 {
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
      RssFeedStore rssFeedStore0 = new RssFeedStore(false);
      Date date0 = new Date(0L);
      RssItunesFeed rssItunesFeed0 = new RssItunesFeed("", "", "", "", date0, "", date0, 1, false, "", "", "", "", "", "", (byte)0);
      rssFeedStore0.put("0b&", rssItunesFeed0);
      RssItunesFeed rssItunesFeed1 = rssFeedStore0.getRo("0b&");
      assertEquals(1, rssItunesFeed1.getCategory());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      RssFeedStore rssFeedStore0 = new RssFeedStore(false);
      RssItunesFeed rssItunesFeed0 = new RssItunesFeed("0b&", "", "", (String) null);
      rssFeedStore0.put(rssItunesFeed0);
      RssItunesFeed rssItunesFeed1 = rssFeedStore0.getRo("0b&");
      assertEquals("", rssItunesFeed1.getUrl());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      RssFeedStore rssFeedStore0 = new RssFeedStore(false);
      Date date0 = new Date(0L);
      RssItunesFeed rssItunesFeed0 = new RssItunesFeed("", "", "", "", date0, "", date0, 1, false, "", "", "", "", "", "", (byte)0);
      rssFeedStore0.put("0b&", rssItunesFeed0);
      RssItunesFeed rssItunesFeed1 = rssFeedStore0.get("0b&");
      assertSame(rssItunesFeed1, rssItunesFeed0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      RssFeedStore rssFeedStore0 = new RssFeedStore(false, 0);
      RssItunesFeed rssItunesFeed0 = new RssItunesFeed();
      rssFeedStore0.put(";w!Hmm", rssItunesFeed0);
      RssItunesFeed rssItunesFeed1 = rssFeedStore0.get(";w!Hmm");
      assertSame(rssItunesFeed1, rssItunesFeed0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      RssFeedStore rssFeedStore0 = new RssFeedStore(true);
      // Undeclared exception!
      try { 
        rssFeedStore0.put((String) null, (String) null, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Hashtable", e);
      }
  }



  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      RssFeedStore rssFeedStore0 = new RssFeedStore(true);
      ThaiBuddhistChronology thaiBuddhistChronology0 = ThaiBuddhistChronology.INSTANCE;
      IsoChronology isoChronology0 = IsoChronology.INSTANCE;
      Clock clock0 = Clock.systemUTC();
      LocalDate localDate0 = isoChronology0.dateNow(clock0);
      ThaiBuddhistDate thaiBuddhistDate0 = thaiBuddhistChronology0.date((TemporalAccessor) localDate0);
      rssFeedStore0.putIfAbsent("Test UI ChoiceGroup end setSelectedIndex [", thaiBuddhistDate0);
      // Undeclared exception!
      try { 
        rssFeedStore0.getRo("Test UI ChoiceGroup end setSelectedIndex [");
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.time.chrono.ThaiBuddhistDate cannot be cast to java.lang.String
         //
         verifyException("com.substanceofcode.rssreader.businessentities.RssFeedStore", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      RssFeedStore rssFeedStore0 = new RssFeedStore(false, 0);
      rssFeedStore0.put("\"Cm&[*1HxL+v3j", "");
      try { 
        rssFeedStore0.getRo("\"Cm&[*1HxL+v3j");
        fail("Expecting exception: CauseException");
      
      } catch(CauseException e) {
         //
         // Internal error during initialize of RssFeed
         //
         verifyException("com.substanceofcode.rssreader.businessentities.RssFeed", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      RssFeedStore rssFeedStore0 = new RssFeedStore(false);
      // Undeclared exception!
      try { 
        rssFeedStore0.get((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      RssFeedStore rssFeedStore0 = new RssFeedStore(true, 0);
      rssFeedStore0.put("Out of memory error while parsing RSS data: ", "", false);
      try { 
        rssFeedStore0.get("Out of memory error while parsing RSS data: ");
        fail("Expecting exception: CauseException");
      
      } catch(CauseException e) {
         //
         // Internal error during initialize of RssFeed
         //
         verifyException("com.substanceofcode.rssreader.businessentities.RssFeed", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      RssFeedStore rssFeedStore0 = new RssFeedStore(true, 0);
      Enumeration enumeration0 = rssFeedStore0.elements();
      BiFunction<Integer, Object, Object> biFunction0 = (BiFunction<Integer, Object, Object>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      rssFeedStore0.merge(enumeration0, enumeration0, biFunction0);
      // Undeclared exception!
      try { 
        rssFeedStore0.freeFeedItems();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.util.Collections$EmptyEnumeration cannot be cast to java.lang.String
         //
         verifyException("com.substanceofcode.rssreader.businessentities.RssFeedStore", e);
      }
  }


  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      RssFeedStore rssFeedStore0 = new RssFeedStore(true, 0);
      // Undeclared exception!
      try { 
        rssFeedStore0.put("", (RssItunesFeed) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.substanceofcode.rssreader.businessentities.RssFeedStore", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      RssFeedStore rssFeedStore0 = new RssFeedStore(false);
      Date date0 = new Date(0L);
      RssItunesFeed rssItunesFeed0 = new RssItunesFeed("", "", "", "", date0, "", date0, 0, false, "", "", "", "", "", "", (byte)0);
      rssFeedStore0.put("0b&", rssItunesFeed0);
      String string0 = rssFeedStore0.getRoStoreStr("0b&");
      assertFalse(rssFeedStore0.isSaveMemoryEnabled());
      assertEquals("||||||||||||0||0|0|", string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      RssFeedStore rssFeedStore0 = new RssFeedStore(false);
      Date date0 = new Date(0L);
      RssItunesFeed rssItunesFeed0 = new RssItunesFeed("", "", "", "", date0, "", date0, 0, false, "", "", "", "", "", "", (byte)0);
      rssFeedStore0.put("0b&", rssItunesFeed0);
      rssFeedStore0.get("0b&");
      rssFeedStore0.freeFeedItems();
      assertEquals(2, rssFeedStore0.size());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      RssFeedStore rssFeedStore0 = new RssFeedStore(true);
      RssItunesFeed rssItunesFeed0 = new RssItunesFeed("", "", "", "");
      rssFeedStore0.put(rssItunesFeed0);
      rssFeedStore0.freeFeedItems();
      assertTrue(rssFeedStore0.isSaveMemoryEnabled());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      RssFeedStore rssFeedStore0 = new RssFeedStore(true, 0);
      // Undeclared exception!
      try { 
        rssFeedStore0.put("", "", true);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 8
         //
         verifyException("com.substanceofcode.rssreader.businessentities.RssItunesFeed", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      RssFeedStore rssFeedStore0 = new RssFeedStore(true, 0);
      rssFeedStore0.put("", "", false);
      String string0 = rssFeedStore0.getRoStoreStr("");
      assertNotNull(string0);
      assertTrue(rssFeedStore0.isSaveMemoryEnabled());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      RssFeedStore rssFeedStore0 = new RssFeedStore(false);
      try { 
        rssFeedStore0.put("", "", true);
        fail("Expecting exception: CauseException");
      
      } catch(CauseException e) {
         //
         // Internal error during initialize of RssFeed
         //
         verifyException("com.substanceofcode.rssreader.businessentities.RssFeed", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      RssFeedStore rssFeedStore0 = new RssFeedStore(true);
      assertTrue(rssFeedStore0.isSaveMemoryEnabled());
      
      rssFeedStore0.setSaveMemoryEnabled(false);
      assertFalse(rssFeedStore0.isSaveMemoryEnabled());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      RssFeedStore rssFeedStore0 = new RssFeedStore(false);
      rssFeedStore0.getRo("");
      assertFalse(rssFeedStore0.isSaveMemoryEnabled());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      RssFeedStore rssFeedStore0 = new RssFeedStore(false);
      RssItunesFeed rssItunesFeed0 = new RssItunesFeed((String) null, "", "", "");
      // Undeclared exception!
      try { 
        rssFeedStore0.put(rssItunesFeed0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Hashtable", e);
      }
  }


  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      RssFeedStore rssFeedStore0 = new RssFeedStore(false, 0);
      rssFeedStore0.get("");
      assertFalse(rssFeedStore0.isSaveMemoryEnabled());
  }

}
