/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 21 19:58:55 KST 2017
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
public class LongConfigParam_ESTest7 extends LongConfigParam_ESTest_scaffolding7 {

  @Test
  public void test0()  throws Throwable  {
      Long long0 = new Long((-930L));
      Long long1 = new Long(2006L);
      LongConfigParam longConfigParam0 = new LongConfigParam(";", long0, long1, long0, false, ";");
      longConfigParam0.validate();
      assertEquals(";", longConfigParam0.getDescription());
  }

  @Test
  public void test1()  throws Throwable  {
      LongConfigParam longConfigParam0 = null;
      try {
        longConfigParam0 = new LongConfigParam("-,4QWbHl^j.&", (Long) null, (Long) null, (Long) null, false, ";");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.config.LongConfigParam", e);
      }
  }

  @Test
  public void test2()  throws Throwable  {
      Long long0 = new Long(0L);
      LongConfigParam longConfigParam0 = null;
      try {
        longConfigParam0 = new LongConfigParam((String) null, long0, long0, long0, true, (String) null);
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
      Long long0 = new Long((-1L));
      LongConfigParam longConfigParam0 = new LongConfigParam("# maximum = ", long0, long0, long0, false, "# maximum = ");
      try { 
        longConfigParam0.validateValue("# maximum = ");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // com.sleepycat.je.config.LongConfigParam: # maximum =  not valid value for # maximum = 
         //
         assertThrownBy("com.sleepycat.je.config.LongConfigParam", e);
      }
  }

  @Test
  public void test4()  throws Throwable  {
      Long long0 = new Long((-4L));
      LongConfigParam longConfigParam0 = new LongConfigParam("kMs,~8ByZ \"c}C(-f", long0, (Long) null, long0, false, "kMs,~8ByZ \"c}C(-f");
      String string0 = longConfigParam0.getExtraDescription();
      assertEquals("# minimum = -4", string0);
  }

  @Test
  public void test5()  throws Throwable  {
      Long long0 = new Long((-1L));
      LongConfigParam longConfigParam0 = new LongConfigParam("# maximum = ", long0, long0, long0, false, "# maximum = ");
      String string0 = longConfigParam0.getExtraDescription();
      assertEquals("# minimum = -1\n# maximum = -1", string0);
  }

  @Test
  public void test6()  throws Throwable  {
      Long long0 = new Long(1346L);
      LongConfigParam longConfigParam0 = new LongConfigParam("@AInBr65O[!", (Long) null, long0, long0, false, "@AInBr65O[!");
      String string0 = longConfigParam0.getExtraDescription();
      assertEquals("# maximum = 1346", string0);
  }

  @Test
  public void test7()  throws Throwable  {
      Long long0 = new Long((-31L));
      Long long1 = new Long(0L);
      LongConfigParam longConfigParam0 = new LongConfigParam(" is greaer than max ", long0, long0, long1, true, " is greaer than max ");
      try { 
        longConfigParam0.validate();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // com.sleepycat.je.config.LongConfigParam: param  is greaer than max  doesn't validate, 0 is greater than max  of -31
         //
         assertThrownBy("com.sleepycat.je.config.LongConfigParam", e);
      }
  }

  @Test
  public void test8()  throws Throwable  {
      Long long0 = new Long(4L);
      Long long1 = new Long((-3975L));
      LongConfigParam longConfigParam0 = new LongConfigParam("g&*qToK\"L!k^v", long0, long0, long1, false, "g&*qToK\"L!k^v");
      try { 
        longConfigParam0.validate();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // com.sleepycat.je.config.LongConfigParam: param g&*qToK\"L!k^v doesn't validate, -3975 is less than min of 4
         //
         assertThrownBy("com.sleepycat.je.config.LongConfigParam", e);
      }
  }

  @Test
  public void test9()  throws Throwable  {
      Long long0 = new Long((-930L));
      LongConfigParam longConfigParam0 = new LongConfigParam(";", long0, long0, long0, false, ";");
      longConfigParam0.validate();
      assertEquals(";", longConfigParam0.getDescription());
  }
}
