/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 03:30:02 KST 2017
 */

package com.sleepycat.je.config;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class BooleanConfigParam_ESTest3 extends BooleanConfigParam_ESTest_scaffolding3 {

  @Test
  public void test0()  throws Throwable  {
      BooleanConfigParam booleanConfigParam0 = new BooleanConfigParam("*74~3\"`XD,", false, false, "*74~3\"`XD,");
      // Undeclared exception!
      try { 
        booleanConfigParam0.validateValue((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.config.BooleanConfigParam", e);
      }
  }

  @Test
  public void test1()  throws Throwable  {
      BooleanConfigParam booleanConfigParam0 = null;
      try {
        booleanConfigParam0 = new BooleanConfigParam("", true, false, "(<DBK>j4_a8[O]m");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         //  A configuration parameter name can't be null or 0 length
         //
         assertThrownBy("com.sleepycat.je.config.ConfigParam", e);
      }
  }

  @Test
  public void test2()  throws Throwable  {
      BooleanConfigParam booleanConfigParam0 = new BooleanConfigParam("false", true, true, "+%1o/a5#:2aie*@");
      booleanConfigParam0.validateValue("false");
      assertEquals("false", booleanConfigParam0.getName());
  }

  @Test
  public void test3()  throws Throwable  {
      BooleanConfigParam booleanConfigParam0 = new BooleanConfigParam("fAktd", true, true, "fAktd");
      try { 
        booleanConfigParam0.validateValue("fAktd");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // com.sleepycat.je.config.BooleanConfigParam: fAktd not valid boolean fAktd
         //
         assertThrownBy("com.sleepycat.je.config.BooleanConfigParam", e);
      }
  }

  @Test
  public void test4()  throws Throwable  {
      BooleanConfigParam booleanConfigParam0 = new BooleanConfigParam("true", false, true, "true");
      booleanConfigParam0.validateValue("true");
      assertEquals("true", booleanConfigParam0.getDescription());
  }
}
