/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 03:26:51 KST 2017
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
public class LongConfigParam_ESTest3 extends LongConfigParam_ESTest_scaffolding3 {

  @Test
  public void test0()  throws Throwable  {
      Long long0 = new Long(0L);
      Long long1 = new Long(1L);
      LongConfigParam longConfigParam0 = new LongConfigParam("s6}9`&YQM}b2p.r6O", long0, long1, long0, false, "z8G6>$+^s7.h");
      longConfigParam0.validate();
      assertEquals("s6}9`&YQM}b2p.r6O", longConfigParam0.getName());
  }

  @Test
  public void test1()  throws Throwable  {
      String string0 = "";
      Long long0 = new Long(1167L);
      Long long1 = new Long((long) 0);
      LongConfigParam longConfigParam0 = new LongConfigParam(")ff>\"+@o", long0, long0, long1, false, ")ff>\"+@o");
      try { 
        longConfigParam0.validate();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // com.sleepycat.je.config.LongConfigParam: param )ff>\"+@o doesn't validate, 0 is less than min of 1167
         //
         assertThrownBy("com.sleepycat.je.config.LongConfigParam", e);
      }
  }

  @Test
  public void test2()  throws Throwable  {
      Long long0 = new Long((-54L));
      LongConfigParam longConfigParam0 = null;
      try {
        longConfigParam0 = new LongConfigParam((String) null, long0, long0, (Long) null, false, "F$(WS|S}j y_qXw?");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.config.LongConfigParam", e);
      }
  }


  @Test
  public void test4()  throws Throwable  {
      Long long0 = new Long((-1L));
      LongConfigParam longConfigParam0 = new LongConfigParam(")\"vZ|(C{`XUQ`nV;%+", long0, long0, long0, true, ")\"vZ|(C{`XUQ`nV;%+");
      try { 
        longConfigParam0.validateValue("tNo,&Fj");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // com.sleepycat.je.config.LongConfigParam: tNo,&Fj not valid value for )\"vZ|(C{`XUQ`nV;%+
         //
         assertThrownBy("com.sleepycat.je.config.LongConfigParam", e);
      }
  }

  @Test
  public void test5()  throws Throwable  {
      Long long0 = new Long(1660L);
      LongConfigParam longConfigParam0 = new LongConfigParam("j%ipu8=&?j&r$w04", (Long) null, (Long) null, long0, true, "j%ipu8=&?j&r$w04");
      String string0 = longConfigParam0.getExtraDescription();
      assertEquals("", string0);
  }

  @Test
  public void test6()  throws Throwable  {
      Long long0 = new Long(20L);
      LongConfigParam longConfigParam0 = new LongConfigParam("\n", long0, long0, long0, true, "\n");
      String string0 = longConfigParam0.getExtraDescription();
      assertEquals("# minimum = 20\n# maximum = 20", string0);
  }

  @Test
  public void test7()  throws Throwable  {
      Long long0 = new Long(0L);
      LongConfigParam longConfigParam0 = new LongConfigParam("E>0", (Long) null, long0, long0, false, "E>0");
      String string0 = longConfigParam0.getExtraDescription();
      assertEquals("# maximum = 0", string0);
  }

  @Test
  public void test8()  throws Throwable  {
      Long long0 = new Long(0L);
      Long long1 = new Long(2191L);
      LongConfigParam longConfigParam0 = new LongConfigParam(":r{!p6j8", long0, long0, long1, false, ":r{!p6j8");
      try { 
        longConfigParam0.validate();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // com.sleepycat.je.config.LongConfigParam: param :r{!p6j8 doesn't validate, 2191 is greater than max  of 0
         //
         assertThrownBy("com.sleepycat.je.config.LongConfigParam", e);
      }
  }

  @Test
  public void test9()  throws Throwable  {
      Long long0 = new Long(0L);
      LongConfigParam longConfigParam0 = new LongConfigParam(":r{!p6j8", long0, long0, long0, false, ":r{!p6j8");
      longConfigParam0.validate();
      assertEquals(":r{!p6j8", longConfigParam0.getDescription());
  }
}
