/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 10:18:43 KST 2017
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
public class ShortConfigParam_ESTest5 extends ShortConfigParam_ESTest_scaffolding5 {

  @Test
  public void test0()  throws Throwable  {
      Short short0 = new Short((short)0);
      Short short1 = new Short((short)1423);
      Short short2 = new Short((short)0);
      ShortConfigParam shortConfigParam0 = new ShortConfigParam("mgjG", short0, short1, short2, false, "mgjG");
      shortConfigParam0.validate();
      assertEquals("mgjG", shortConfigParam0.toString());
  }

  @Test
  public void test1()  throws Throwable  {
      ShortConfigParam shortConfigParam0 = null;
      try {
        shortConfigParam0 = new ShortConfigParam(":", (Short) null, (Short) null, (Short) null, true, "eb[M");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.config.ShortConfigParam", e);
      }
  }

  @Test
  public void test2()  throws Throwable  {
      Short short0 = new Short((short)0);
      ShortConfigParam shortConfigParam0 = null;
      try {
        shortConfigParam0 = new ShortConfigParam("", short0, short0, short0, false, (String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         //  A configuration parameter name can't be null or 0 length
         //
         assertThrownBy("com.sleepycat.je.config.ConfigParam", e);
      }
  }

  @Test
  public void test3()  throws Throwable  {
      Short short0 = new Short((short)0);
      ShortConfigParam shortConfigParam0 = new ShortConfigParam("mgjG", short0, short0, short0, false, "mgjG");
      try { 
        shortConfigParam0.validateValue("g637@_\"Oqi1{yyt&o/k");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // com.sleepycat.je.config.ShortConfigParam: g637@_\"Oqi1{yyt&o/k not valid value for mgjG
         //
         assertThrownBy("com.sleepycat.je.config.ShortConfigParam", e);
      }
  }

  @Test
  public void test4()  throws Throwable  {
      Short short0 = new Short((short)0);
      ShortConfigParam shortConfigParam0 = new ShortConfigParam("q^@Y#", short0, (Short) null, short0, true, "q^@Y#");
      String string0 = shortConfigParam0.getExtraDescription();
      assertEquals("# minimum = 0", string0);
  }

  @Test
  public void test5()  throws Throwable  {
      Short short0 = new Short((short) (-1333));
      ShortConfigParam shortConfigParam0 = new ShortConfigParam("/rBK<:\"di];}`b=,j=", short0, short0, short0, true, "/rBK<:\"di];}`b=,j=");
      String string0 = shortConfigParam0.getExtraDescription();
      assertEquals("# minimum = -1333\n# maximum = -1333", string0);
  }

  @Test
  public void test6()  throws Throwable  {
      Short short0 = new Short((short)0);
      ShortConfigParam shortConfigParam0 = new ShortConfigParam("#(-bOsPC8m4#3(b%", (Short) null, short0, short0, true, "#(-bOsPC8m4#3(b%");
      String string0 = shortConfigParam0.getExtraDescription();
      assertEquals("# maximum = 0", string0);
  }

  @Test
  public void test7()  throws Throwable  {
      Short short0 = new Short((short) (-20));
      Short short1 = new Short((short)2017);
      ShortConfigParam shortConfigParam0 = new ShortConfigParam("# minimum = ", short0, short0, short1, false, "ZjUkNp9Xl0'Who/-");
      try { 
        shortConfigParam0.validate();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // com.sleepycat.je.config.ShortConfigParam: param # minimum =  doesn't validate, 2017 is greater than max of -20
         //
         assertThrownBy("com.sleepycat.je.config.ShortConfigParam", e);
      }
  }

  @Test
  public void test8()  throws Throwable  {
      Short short0 = new Short((short) (-1));
      Short short1 = new Short((short) (-21));
      ShortConfigParam shortConfigParam0 = new ShortConfigParam("`]", short0, short0, short1, true, ")+OnR>l=;6TXL");
      try { 
        shortConfigParam0.validate();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // com.sleepycat.je.config.ShortConfigParam: param `] doesn't validate, -21 is less than min of -1
         //
         assertThrownBy("com.sleepycat.je.config.ShortConfigParam", e);
      }
  }

  @Test
  public void test9()  throws Throwable  {
      Short short0 = new Short((short) (-20));
      ShortConfigParam shortConfigParam0 = new ShortConfigParam("# minimum = ", short0, short0, short0, false, "ZjUkNp9Xl0'Who/-");
      shortConfigParam0.validate();
      assertEquals("# minimum = ", shortConfigParam0.toString());
  }
}
