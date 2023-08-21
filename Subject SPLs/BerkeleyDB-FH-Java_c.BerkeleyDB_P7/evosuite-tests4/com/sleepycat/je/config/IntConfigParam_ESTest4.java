/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 14:18:13 KST 2017
 */

package com.sleepycat.je.config;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.sleepycat.je.config.IntConfigParam;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class IntConfigParam_ESTest4 extends IntConfigParam_ESTest_scaffolding4 {

  @Test
  public void test0()  throws Throwable  {
      Integer integer0 = new Integer(2102);
      Integer integer1 = new Integer(16);
      IntConfigParam intConfigParam0 = new IntConfigParam(",kd3", (Integer) null, integer0, integer1, true, "");
      intConfigParam0.validate();
      assertEquals("16", intConfigParam0.getDefault());
  }

  @Test
  public void test1()  throws Throwable  {
      Integer integer0 = new Integer((-944));
      IntConfigParam intConfigParam0 = new IntConfigParam("]", integer0, integer0, integer0, false, "]");
      intConfigParam0.validate();
      assertFalse(intConfigParam0.isMutable());
  }

  @Test
  public void test2()  throws Throwable  {
      String string0 = "";
      Integer integer0 = new Integer(35);
      Integer integer1 = new Integer((-1838));
      IntConfigParam intConfigParam0 = new IntConfigParam("&Ayh@}uDn.q1B6VN", integer0, integer0, integer1, true, "&Ayh@}uDn.q1B6VN");
      try { 
        intConfigParam0.validate();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // com.sleepycat.je.config.IntConfigParam: param &Ayh@}uDn.q1B6VN doesn't validate, -1838 is less than min of 35
         //
         assertThrownBy("com.sleepycat.je.config.IntConfigParam", e);
      }
  }

  @Test
  public void test3()  throws Throwable  {
      Integer integer0 = new Integer((-1));
      IntConfigParam intConfigParam0 = new IntConfigParam("%KA<|)V2", integer0, integer0, integer0, true, "%KA<|)V2");
      try { 
        intConfigParam0.validateValue(" A configuration parameter name can't be null or 0 length");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // com.sleepycat.je.config.IntConfigParam:  A configuration parameter name can't be null or 0 length not valid value for %KA<|)V2
         //
         assertThrownBy("com.sleepycat.je.config.IntConfigParam", e);
      }
  }

  @Test
  public void test4()  throws Throwable  {
      Integer integer0 = new Integer(5150);
      IntConfigParam intConfigParam0 = null;
      try {
        intConfigParam0 = new IntConfigParam(" A configuration parameter name can't be null or 0 length", integer0, integer0, (Integer) null, true, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.config.IntConfigParam", e);
      }
  }

  @Test
  public void test5()  throws Throwable  {
      Integer integer0 = new Integer(0);
      IntConfigParam intConfigParam0 = null;
      try {
        intConfigParam0 = new IntConfigParam("", integer0, integer0, integer0, false, (String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         //  A configuration parameter name can't be null or 0 length
         //
         assertThrownBy("com.sleepycat.je.config.ConfigParam", e);
      }
  }

  @Test
  public void test6()  throws Throwable  {
      Integer integer0 = new Integer(1);
      IntConfigParam intConfigParam0 = new IntConfigParam("je.evictor.criticalPercentage", (Integer) null, (Integer) null, integer0, false, "je.evictor.criticalPercentage");
      String string0 = intConfigParam0.getExtraDescription();
      assertEquals("", string0);
  }

  @Test
  public void test7()  throws Throwable  {
      Integer integer0 = new Integer((-944));
      IntConfigParam intConfigParam0 = new IntConfigParam("8", integer0, integer0, integer0, true, "8");
      String string0 = intConfigParam0.getExtraDescription();
      assertEquals("# minimum = -944\n# maximum = -944", string0);
  }

  @Test
  public void test8()  throws Throwable  {
      Integer integer0 = new Integer(2102);
      IntConfigParam intConfigParam0 = new IntConfigParam(",kd3", (Integer) null, integer0, integer0, true, "");
      String string0 = intConfigParam0.getExtraDescription();
      assertEquals("# maximum = 2102", string0);
  }

  @Test
  public void test9()  throws Throwable  {
      Integer integer0 = new Integer((-944));
      IntConfigParam intConfigParam0 = new IntConfigParam("8", integer0, integer0, integer0, true, "8");
      try { 
        intConfigParam0.validateValue("8");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // com.sleepycat.je.config.IntConfigParam: param 8 doesn't validate, 8 is greater than max of -944
         //
         assertThrownBy("com.sleepycat.je.config.IntConfigParam", e);
      }
  }
}
