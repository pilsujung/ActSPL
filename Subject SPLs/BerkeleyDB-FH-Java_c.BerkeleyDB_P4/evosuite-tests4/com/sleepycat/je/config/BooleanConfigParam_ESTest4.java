/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 14:16:19 KST 2017
 */

package com.sleepycat.je.config;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.sleepycat.je.config.BooleanConfigParam;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class BooleanConfigParam_ESTest4 extends BooleanConfigParam_ESTest_scaffolding4 {

  @Test
  public void test0()  throws Throwable  {
      BooleanConfigParam booleanConfigParam0 = new BooleanConfigParam("?5~:0#7GO?D", true, true, "?5~:0#7GO?D");
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
  public void test2()  throws Throwable  {
      BooleanConfigParam booleanConfigParam0 = new BooleanConfigParam("?5~:0#7GO?D", true, true, "?5~:0#7GO?D");
      booleanConfigParam0.validateValue("false");
      assertTrue(booleanConfigParam0.isMutable());
  }

  @Test
  public void test3()  throws Throwable  {
      BooleanConfigParam booleanConfigParam0 = new BooleanConfigParam("famtf", false, false, "famtf");
      try { 
        booleanConfigParam0.validateValue("famtf");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // com.sleepycat.je.config.BooleanConfigParam: famtf not valid boolean famtf
         //
         assertThrownBy("com.sleepycat.je.config.BooleanConfigParam", e);
      }
  }

  @Test
  public void test4()  throws Throwable  {
      BooleanConfigParam booleanConfigParam0 = new BooleanConfigParam("7", true, false, "ZAUIP;+h");
      booleanConfigParam0.validateValue("true");
      assertEquals("7", booleanConfigParam0.toString());
  }
}
