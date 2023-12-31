/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 21 19:59:54 KST 2017
 */

package com.sleepycat.je.config;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.fail;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class ShortConfigParam_ESTest7 extends ShortConfigParam_ESTest_scaffolding7 {

  @Test
  public void test0()  throws Throwable  {
      Short short0 = new Short((short)0);
      Short short1 = new Short((short)3343);
      Short short2 = new Short((short)86);
      ShortConfigParam shortConfigParam0 = new ShortConfigParam("'q", short0, short1, short2, false, "'q");
      shortConfigParam0.validate();
      assertFalse(shortConfigParam0.isMutable());
  }

  @Test
  public void test1()  throws Throwable  {
      String string0 = "";
      Short short0 = new Short((short) (-5));
      Short short1 = new Short((short)2208);
      ShortConfigParam shortConfigParam0 = new ShortConfigParam("<h-6,;!nf$iF", short0, short0, short1, true, "<h-6,;!nf$iF");
      try { 
        shortConfigParam0.validate();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // com.sleepycat.je.config.ShortConfigParam: param <h-6,;!nf$iF doesn't validate, 2208 is greater than max of -5
         //
         assertThrownBy("com.sleepycat.je.config.ShortConfigParam", e);
      }
  }

  @Test
  public void test2()  throws Throwable  {
      ShortConfigParam shortConfigParam0 = null;
      try {
        shortConfigParam0 = new ShortConfigParam("d|", (Short) null, (Short) null, (Short) null, true, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.config.ShortConfigParam", e);
      }
  }

  @Test
  public void test3()  throws Throwable  {
      Short short0 = new Short((short)0);
      ShortConfigParam shortConfigParam0 = null;
      try {
        shortConfigParam0 = new ShortConfigParam("", (Short) null, short0, short0, false, "\"0{Y-sql");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         //  A configuration parameter name can't be null or 0 length
         //
         assertThrownBy("com.sleepycat.je.config.ConfigParam", e);
      }
  }

  @Test
  public void test4()  throws Throwable  {
      Short short0 = new Short((short)0);
      ShortConfigParam shortConfigParam0 = new ShortConfigParam(" is greater than max of ", short0, short0, short0, false, (String) null);
      try { 
        shortConfigParam0.validateValue((String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // com.sleepycat.je.config.ShortConfigParam: null not valid value for  is greater than max of 
         //
         assertThrownBy("com.sleepycat.je.config.ShortConfigParam", e);
      }
  }

  @Test
  public void test5()  throws Throwable  {
      Short short0 = new Short((short) (-627));
      ShortConfigParam shortConfigParam0 = new ShortConfigParam("^]A8;PZ byMi:6HCT_", short0, (Short) null, short0, true, "^]A8;PZ byMi:6HCT_");
      String string0 = shortConfigParam0.getExtraDescription();
      assertEquals("# minimum = -627", string0);
  }

  @Test
  public void test6()  throws Throwable  {
      Short short0 = new Short((short)1);
      ShortConfigParam shortConfigParam0 = new ShortConfigParam("]\"ptpcTZRlK", short0, short0, short0, true, "]\"ptpcTZRlK");
      String string0 = shortConfigParam0.getExtraDescription();
      assertEquals("# minimum = 1\n# maximum = 1", string0);
  }

  @Test
  public void test7()  throws Throwable  {
      Short short0 = new Short((short) (-1267));
      ShortConfigParam shortConfigParam0 = new ShortConfigParam("g]&ig=", (Short) null, short0, short0, false, "g]&ig=");
      String string0 = shortConfigParam0.getExtraDescription();
      assertEquals("# maximum = -1267", string0);
  }

  @Test
  public void test8()  throws Throwable  {
      Short short0 = new Short((short)0);
      Short short1 = new Short((short) (-7));
      ShortConfigParam shortConfigParam0 = new ShortConfigParam("c;jM{-'A8D=", short0, short1, short1, false, "c;jM{-'A8D=");
      try { 
        shortConfigParam0.validate();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // com.sleepycat.je.config.ShortConfigParam: param c;jM{-'A8D= doesn't validate, -7 is less than min of 0
         //
         assertThrownBy("com.sleepycat.je.config.ShortConfigParam", e);
      }
  }

  @Test
  public void test9()  throws Throwable  {
      Short short0 = new Short((short)0);
      ShortConfigParam shortConfigParam0 = new ShortConfigParam("'q", short0, short0, short0, false, "'q");
      shortConfigParam0.validate();
      assertFalse(shortConfigParam0.isMutable());
  }
}
