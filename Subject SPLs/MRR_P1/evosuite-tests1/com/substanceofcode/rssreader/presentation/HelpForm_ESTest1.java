/*
 * This file was automatically generated by EvoSuite
 * Sun Aug 12 15:39:59 KST 2018
 */

package com.substanceofcode.rssreader.presentation;

import static org.evosuite.runtime.EvoAssertions.verifyException;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.fail;

import javax.microedition.midlet.MIDlet;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class HelpForm_ESTest1 extends HelpForm_ESTest_scaffolding1 {
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
      // Undeclared exception!
      try { 
        HelpForm.getAbout((MIDlet) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("cz.cacek.ebook.util.ResourceProviderME", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      HelpForm helpForm0 = new HelpForm("");
      assertNull(helpForm0.getTitle());
  }
}