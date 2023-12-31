/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 10:18:02 KST 2017
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

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class LongConfigParam_ESTest9 extends LongConfigParam_ESTest_scaffolding9 {

  @Test
  public void test0()  throws Throwable  {
      Long long0 = Long.getLong("]<5jc$qSWU%8e'", 0L);
      Long long1 = Long.getLong("'ReNjg())!'Y]*+THN", (-2792L));
      LongConfigParam longConfigParam0 = new LongConfigParam("'ReNjg())!'Y]*+THN", (Long) null, long0, long1, true, "'ReNjg())!'Y]*+THN");
      longConfigParam0.validate();
      assertEquals("'ReNjg())!'Y]*+THN", longConfigParam0.getName());
  }

  @Test
  public void test1()  throws Throwable  {
      Long long0 = new Long(1L);
      Long long1 = new Long(1455L);
      LongConfigParam longConfigParam0 = new LongConfigParam("x#Z8o28zp'", long0, long1, long1, false, "jtL` A}keq+E");
      longConfigParam0.validate();
      assertFalse(longConfigParam0.isMutable());
  }

  @Test
  public void test2()  throws Throwable  {
      String string0 = "";
      Long long0 = new Long(41L);
      Long long1 = new Long((-1718L));
      LongConfigParam longConfigParam0 = new LongConfigParam("`z6v|9R4}vYjK]z@", long0, long1, long0, false, "`z6v|9R4}vYjK]z@");
      try { 
        longConfigParam0.validate();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // com.sleepycat.je.config.LongConfigParam: param `z6v|9R4}vYjK]z@ doesn't validate, 41 is greater than max  of -1718
         //
         assertThrownBy("com.sleepycat.je.config.LongConfigParam", e);
      }
  }

  @Test
  public void test3()  throws Throwable  {
      Long long0 = new Long((-2198L));
      LongConfigParam longConfigParam0 = null;
      try {
        longConfigParam0 = new LongConfigParam("tWHg:&K'>Re", long0, long0, (Long) null, false, "Ixr>gJ");
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
      Long long0 = new Long(1L);
      LongConfigParam longConfigParam0 = null;
      try {
        longConfigParam0 = new LongConfigParam("", long0, long0, long0, false, "41UI");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         //  A configuration parameter name can't be null or 0 length
         //
         assertThrownBy("com.sleepycat.je.config.ConfigParam", e);
      }
  }

  @Test
  public void test5()  throws Throwable  {
      Long long0 = new Long(1L);
      LongConfigParam longConfigParam0 = new LongConfigParam("x#Z8o28zp'", long0, long0, long0, false, "jtL` A}keq+E");
      try { 
        longConfigParam0.validateValue("Y");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // com.sleepycat.je.config.LongConfigParam: Y not valid value for x#Z8o28zp'
         //
         assertThrownBy("com.sleepycat.je.config.LongConfigParam", e);
      }
  }

  @Test
  public void test6()  throws Throwable  {
      Long long0 = new Long((-24L));
      LongConfigParam longConfigParam0 = new LongConfigParam("hx[H,(Q(d", (Long) null, (Long) null, long0, false, "hx[H,(Q(d");
      String string0 = longConfigParam0.getExtraDescription();
      assertEquals("", string0);
  }

  @Test
  public void test7()  throws Throwable  {
      Long long0 = new Long(1L);
      LongConfigParam longConfigParam0 = new LongConfigParam("x#Z8o28zp'", long0, long0, long0, false, "jtL` A}keq+E");
      String string0 = longConfigParam0.getExtraDescription();
      assertEquals("# minimum = 1\n# maximum = 1", string0);
  }

  @Test
  public void test8()  throws Throwable  {
      Long long0 = Long.valueOf((-7L));
      LongConfigParam longConfigParam0 = new LongConfigParam(" is less than min o$ ", (Long) null, long0, long0, false, " is less than min o$ ");
      String string0 = longConfigParam0.getExtraDescription();
      assertEquals("# maximum = -7", string0);
  }

  @Test
  public void test9()  throws Throwable  {
      Long long0 = new Long(1383L);
      Long long1 = new Long((-3510L));
      LongConfigParam longConfigParam0 = new LongConfigParam("x#Z8o28zp'", long0, long1, long1, true, "x#Z8o28zp'");
      try { 
        longConfigParam0.validate();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // com.sleepycat.je.config.LongConfigParam: param x#Z8o28zp' doesn't validate, -3510 is less than min of 1383
         //
         assertThrownBy("com.sleepycat.je.config.LongConfigParam", e);
      }
  }
}
