/*
 * This file was automatically generated by EvoSuite
 * Sun Aug 12 18:38:41 KST 2018
 */

package org.kablog.kgui;

import static org.junit.Assert.fail;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import static org.evosuite.runtime.EvoAssertions.*;

import javax.microedition.lcdui.AlertType;
import javax.microedition.lcdui.Displayable;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class KViewParent_ESTest2 extends KViewParent_ESTest_scaffolding2 {
@BeforeClass
public static void initEvoSuiteFramework() {
String a = "aa";
}
@AfterClass
public static void exitEvoSuiteFramework() {
String a = "aa";
}





  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      KFileSelectorMgr kFileSelectorMgr0 = new KFileSelectorMgr();
      // Undeclared exception!
      try { 
        kFileSelectorMgr0.reqSetVisible((Displayable) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.kablog.kgui.KFileSelectorMgr", e);
      }
  }
}
