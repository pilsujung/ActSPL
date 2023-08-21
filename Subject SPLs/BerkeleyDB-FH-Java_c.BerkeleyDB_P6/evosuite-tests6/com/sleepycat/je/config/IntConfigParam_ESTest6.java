/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 00:01:08 KST 2017
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
public class IntConfigParam_ESTest6 extends IntConfigParam_ESTest_scaffolding6 {

  @Test
  public void test0()  throws Throwable  {
      Integer integer0 = new Integer(0);
      Integer integer1 = new Integer(1560);
      Integer integer2 = new Integer(0);
      IntConfigParam intConfigParam0 = new IntConfigParam("zmQ5", integer0, integer1, integer2, true, "");
      intConfigParam0.validate();
      assertTrue(intConfigParam0.isMutable());
  }

  @Test
  public void test1()  throws Throwable  {
      Integer integer0 = new Integer(2588);
      Integer integer1 = new Integer(0);
      IntConfigParam intConfigParam0 = new IntConfigParam("T,QC/kY)", integer1, integer0, integer0, false, "+L,NmOX_");
      intConfigParam0.validate();
      assertEquals("T,QC/kY)", intConfigParam0.toString());
  }

  @Test
  public void test2()  throws Throwable  {
      String string0 = "";
      Integer integer0 = new Integer(2098);
      Integer integer1 = new Integer(1);
      IntConfigParam intConfigParam0 = new IntConfigParam("Qb:McjCnOrgH>T,>5.5", integer0, integer1, integer0, false, "Qb:McjCnOrgH>T,>5.5");
      try { 
        intConfigParam0.validate();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // com.sleepycat.je.config.IntConfigParam: param Qb:McjCnOrgH>T,>5.5 doesn't validate, 2098 is greater than max of 1
         //
         assertThrownBy("com.sleepycat.je.config.IntConfigParam", e);
      }
  }

  @Test
  public void test3()  throws Throwable  {
      IntConfigParam intConfigParam0 = null;
      try {
        intConfigParam0 = new IntConfigParam("GWZw-qc", (Integer) null, (Integer) null, (Integer) null, true, "GWZw-qc");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.config.IntConfigParam", e);
      }
  }

  @Test
  public void test4()  throws Throwable  {
      Integer integer0 = new Integer(0);
      IntConfigParam intConfigParam0 = null;
      try {
        intConfigParam0 = new IntConfigParam("", integer0, integer0, integer0, false, "~h$C");
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
      Integer integer0 = new Integer(0);
      IntConfigParam intConfigParam0 = new IntConfigParam("zmQ5", integer0, integer0, integer0, true, "");
      try { 
        intConfigParam0.validateValue((String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // com.sleepycat.je.config.IntConfigParam: null not valid value for zmQ5
         //
         assertThrownBy("com.sleepycat.je.config.IntConfigParam", e);
      }
  }

  @Test
  public void test6()  throws Throwable  {
      Integer integer0 = new Integer(0);
      IntConfigParam intConfigParam0 = new IntConfigParam("U_J:ikvX", (Integer) null, integer0, integer0, true, "U_J:ikvX");
      String string0 = intConfigParam0.getExtraDescription();
      assertEquals("# maximum = 0", string0);
  }

  @Test
  public void test7()  throws Throwable  {
      Integer integer0 = new Integer(0);
      IntConfigParam intConfigParam0 = new IntConfigParam("zmQ5", integer0, integer0, integer0, true, "");
      String string0 = intConfigParam0.getExtraDescription();
      assertEquals("# minimum = 0\n# maximum = 0", string0);
  }

  @Test
  public void test8()  throws Throwable  {
      Integer integer0 = new Integer(2588);
      IntConfigParam intConfigParam0 = new IntConfigParam("T,QC/kY)", (Integer) null, (Integer) null, integer0, false, "+L,NmOX_");
      String string0 = intConfigParam0.getExtraDescription();
      assertEquals("", string0);
  }

  @Test
  public void test9()  throws Throwable  {
      Integer integer0 = new Integer(1015);
      Integer integer1 = new Integer((-3032));
      IntConfigParam intConfigParam0 = new IntConfigParam("^Ylj2)NKz3lMEkON]B", integer0, integer1, integer1, true, "^Ylj2)NKz3lMEkON]B");
      try { 
        intConfigParam0.validate();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // com.sleepycat.je.config.IntConfigParam: param ^Ylj2)NKz3lMEkON]B doesn't validate, -3032 is less than min of 1015
         //
         assertThrownBy("com.sleepycat.je.config.IntConfigParam", e);
      }
  }
}