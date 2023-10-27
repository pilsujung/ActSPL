/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 21 23:34:34 KST 2017
 */

package com.sleepycat.je.config;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.sleepycat.je.config.ShortConfigParam;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class ShortConfigParam_ESTest2 extends ShortConfigParam_ESTest_scaffolding2 {

  @Test
  public void test0()  throws Throwable  {
      Short short0 = new Short((short) (-2031));
      Short short1 = new Short((short)0);
      ShortConfigParam shortConfigParam0 = new ShortConfigParam("Ms~%lq.", short0, short1, short0, false, "Ms~%lq.");
      shortConfigParam0.validate();
      assertEquals("Ms~%lq.", shortConfigParam0.getName());
  }

  @Test
  public void test1()  throws Throwable  {
      Short short0 = new Short((short) (-2609));
      Short short1 = new Short((short)0);
      ShortConfigParam shortConfigParam0 = new ShortConfigParam(";", short0, short0, short1, false, ";");
      try { 
        shortConfigParam0.validate();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // com.sleepycat.je.config.ShortConfigParam: param ; doesn't validate, 0 is greater than max of -2609
         //
         assertThrownBy("com.sleepycat.je.config.ShortConfigParam", e);
      }
  }

  @Test
  public void test2()  throws Throwable  {
      Short short0 = new Short((short)593);
      ShortConfigParam shortConfigParam0 = null;
      try {
        shortConfigParam0 = new ShortConfigParam(": ", short0, short0, (Short) null, true, "M{%7/");
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
      Short short0 = new Short((short) (-555));
      ShortConfigParam shortConfigParam0 = null;
      try {
        shortConfigParam0 = new ShortConfigParam("", short0, short0, short0, true, "");
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
      Short short0 = new Short((short) (-2031));
      ShortConfigParam shortConfigParam0 = new ShortConfigParam("Ms~%lq.", short0, short0, short0, false, "Ms~%lq.");
      try { 
        shortConfigParam0.validateValue((String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // com.sleepycat.je.config.ShortConfigParam: null not valid value for Ms~%lq.
         //
         assertThrownBy("com.sleepycat.je.config.ShortConfigParam", e);
      }
  }

  @Test
  public void test5()  throws Throwable  {
      Short short0 = new Short((short)39);
      ShortConfigParam shortConfigParam0 = new ShortConfigParam("`%;:sEaKAScFW", short0, (Short) null, short0, false, "`%;:sEaKAScFW");
      String string0 = shortConfigParam0.getExtraDescription();
      assertEquals("# minimum = 39", string0);
  }

  @Test
  public void test6()  throws Throwable  {
      Short short0 = new Short((short) (-2031));
      ShortConfigParam shortConfigParam0 = new ShortConfigParam("Ms~%lq.", short0, short0, short0, false, "Ms~%lq.");
      String string0 = shortConfigParam0.getExtraDescription();
      assertEquals("# minimum = -2031\n# maximum = -2031", string0);
  }

  @Test
  public void test7()  throws Throwable  {
      Short short0 = Short.valueOf((short)23);
      ShortConfigParam shortConfigParam0 = new ShortConfigParam("nlXv", (Short) null, short0, short0, false, "nlXv");
      String string0 = shortConfigParam0.getExtraDescription();
      assertEquals("# maximum = 23", string0);
  }

  @Test
  public void test8()  throws Throwable  {
      Short short0 = Short.valueOf((short)5771);
      Short short1 = new Short((short) (-2031));
      ShortConfigParam shortConfigParam0 = new ShortConfigParam("PwN19$|1lxmn9}{W]", short0, short0, short1, true, "PwN19$|1lxmn9}{W]");
      try { 
        shortConfigParam0.validate();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // com.sleepycat.je.config.ShortConfigParam: param PwN19$|1lxmn9}{W] doesn't validate, -2031 is less than min of 5771
         //
         assertThrownBy("com.sleepycat.je.config.ShortConfigParam", e);
      }
  }

  @Test
  public void test9()  throws Throwable  {
      Short short0 = new Short((short)1346);
      ShortConfigParam shortConfigParam0 = new ShortConfigParam("# When eviction happens, the evictor will push memory usage to this\n# number of bytes below je.maxMemory.  The default is 512KB and the\n# minimum is 1 KB (1024).", short0, short0, short0, false, "# When eviction happens, the evictor will push memory usage to this\n# number of bytes below je.maxMemory.  The default is 512KB and the\n# minimum is 1 KB (1024).");
      shortConfigParam0.validate();
      assertEquals("# When eviction happens, the evictor will push memory usage to this\n# number of bytes below je.maxMemory.  The default is 512KB and the\n# minimum is 1 KB (1024).", shortConfigParam0.getDescription());
  }
}