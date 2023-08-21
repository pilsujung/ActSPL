/*
 * This file was automatically generated by EvoSuite
 * Sun Aug 12 15:27:25 KST 2018
 */

package com.substanceofcode.rssreader.businesslogic;

import static org.evosuite.runtime.EvoAssertions.verifyException;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import static org.junit.Assert.fail;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.substanceofcode.rssreader.businessentities.RssItunesFeed;
import com.substanceofcode.utils.XmlParser;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class AtomFormatParser_ESTest1 extends AtomFormatParser_ESTest_scaffolding1 {
@BeforeClass
public static void initEvoSuiteFramework() {
String a = "aa";
}
@AfterClass
public static void exitEvoSuiteFramework() {
String a = "aa";
}

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      AtomFormatParser atomFormatParser0 = new AtomFormatParser();
      // Undeclared exception!
      try { 
        atomFormatParser0.parse((XmlParser) null, (RssItunesFeed) null, false, 0, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.substanceofcode.rssreader.businesslogic.ExtParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      AtomFormatParser atomFormatParser0 = new AtomFormatParser();
      atomFormatParser0.parseItem((XmlParser) null, 's', "");
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      AtomFormatParser atomFormatParser0 = new AtomFormatParser();
      atomFormatParser0.parseItem((XmlParser) null, '.', (String) null);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      AtomFormatParser atomFormatParser0 = new AtomFormatParser();
      // Undeclared exception!
      try { 
        atomFormatParser0.parseItem((XmlParser) null, 's', (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      AtomFormatParser atomFormatParser0 = new AtomFormatParser();
      atomFormatParser0.parseItem((XmlParser) null, 'c', "");
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      AtomFormatParser atomFormatParser0 = new AtomFormatParser();
      atomFormatParser0.parseItem((XmlParser) null, 'p', "");
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      AtomFormatParser atomFormatParser0 = new AtomFormatParser();
      atomFormatParser0.parseItem((XmlParser) null, 'a', "");
  }
}
