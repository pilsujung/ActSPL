/*
 * This file was automatically generated by EvoSuite
 * Sun Aug 12 19:10:36 KST 2018
 */

package org.kablog.kgui;

import static org.junit.Assert.assertNotSame;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import static org.evosuite.runtime.EvoAssertions.*;
import static org.junit.Assert.fail;

import javax.microedition.lcdui.AlertType;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Form;
import javax.microedition.lcdui.TextField;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.substanceofcode.rssreader.presentation.RssReaderMIDlet;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class KFileSelectorMgr_ESTest5 extends KFileSelectorMgr_ESTest_scaffolding5 {
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
      KFileSelectorMgr kFileSelectorMgr0 = new KFileSelectorMgr();
      kFileSelectorMgr0.ready = true;
      kFileSelectorMgr0.displayDbgMsg("", (AlertType) null);
  }








  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      KFileSelectorMgr kFileSelectorMgr0 = new KFileSelectorMgr();
      kFileSelectorMgr0.bDebug = true;
      kFileSelectorMgr0.doLaunchSelector((RssReaderMIDlet) null, (Form) null, (TextField) null);
  }
}
