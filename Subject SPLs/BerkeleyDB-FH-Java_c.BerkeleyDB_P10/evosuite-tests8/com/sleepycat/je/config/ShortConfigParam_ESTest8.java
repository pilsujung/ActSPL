/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 03:26:12 KST 2017
 */

package com.sleepycat.je.config;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class ShortConfigParam_ESTest8 extends ShortConfigParam_ESTest_scaffolding8 {

  @Test
  public void test00()  throws Throwable  {
      Short short0 = new Short((short) (-1028));
      Short short1 = new Short((short)0);
      ShortConfigParam shortConfigParam0 = new ShortConfigParam("W9,(!tlcv<", short0, short1, short0, true, "W9,(!tlcv<");
      shortConfigParam0.validate();
      assertEquals("W9,(!tlcv<", shortConfigParam0.getName());
  }

  @Test
  public void test01()  throws Throwable  {
      String string0 = "";
      Short short0 = new Short((short)1000);
      Short short1 = new Short((short) (-2819));
      ShortConfigParam shortConfigParam0 = new ShortConfigParam("9[!ic#<", short0, short1, short0, true, "9[!ic#<");
      try { 
        shortConfigParam0.validate();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // com.sleepycat.je.config.ShortConfigParam: param 9[!ic#< doesn't validate, 1000 is greater than max of -2819
         //
         assertThrownBy("com.sleepycat.je.config.ShortConfigParam", e);
      }
  }

  @Test
  public void test02()  throws Throwable  {
      Short short0 = new Short((short) (-1));
      ShortConfigParam shortConfigParam0 = new ShortConfigParam("Fa]n+Fd%o+[0", short0, short0, short0, false, "Fa]n+Fd%o+[0");
      try { 
        shortConfigParam0.validateValue("NN&L|WAr,E]");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // com.sleepycat.je.config.ShortConfigParam: NN&L|WAr,E] not valid value for Fa]n+Fd%o+[0
         //
         assertThrownBy("com.sleepycat.je.config.ShortConfigParam", e);
      }
  }

  @Test
  public void test03()  throws Throwable  {
      ShortConfigParam shortConfigParam0 = null;
      try {
        shortConfigParam0 = new ShortConfigParam("", (Short) null, (Short) null, (Short) null, true, "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.config.ShortConfigParam", e);
      }
  }

  @Test
  public void test04()  throws Throwable  {
      Short short0 = new Short((short)0);
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
  public void test05()  throws Throwable  {
      Short short0 = new Short((short)24);
      ShortConfigParam shortConfigParam0 = new ShortConfigParam(" A configuration parameter name can't be null or 0 length", (Short) null, short0, short0, true, " A configuration parameter name can't be null or 0 length");
      String string0 = shortConfigParam0.getExtraDescription();
      assertEquals("# maximum = 24", string0);
  }

  @Test
  public void test06()  throws Throwable  {
      Short short0 = new Short((short) (-1028));
      ShortConfigParam shortConfigParam0 = new ShortConfigParam("W9,(!tlcv<", short0, short0, short0, true, "W9,(!tlcv<");
      String string0 = shortConfigParam0.getExtraDescription();
      assertEquals("# minimum = -1028\n# maximum = -1028", string0);
  }

  @Test
  public void test07()  throws Throwable  {
      Short short0 = new Short((short) (-1664));
      ShortConfigParam shortConfigParam0 = new ShortConfigParam("K=`MF}-hGbH;[g", (Short) null, (Short) null, short0, false, "K=`MF}-hGbH;[g");
      String string0 = shortConfigParam0.getExtraDescription();
      assertEquals("", string0);
  }

  @Test
  public void test08()  throws Throwable  {
      Short short0 = new Short((short) (-1));
      ShortConfigParam shortConfigParam0 = new ShortConfigParam("4)(;Si=dXP=j#GcFB", short0, short0, short0, true, "");
      try { 
        shortConfigParam0.validateValue("9");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // com.sleepycat.je.config.ShortConfigParam: param 4)(;Si=dXP=j#GcFB doesn't validate, 9 is greater than max of -1
         //
         assertThrownBy("com.sleepycat.je.config.ShortConfigParam", e);
      }
  }

  @Test
  public void test09()  throws Throwable  {
      Short short0 = new Short((short)9);
      Short short1 = new Short((short) (-1));
      ShortConfigParam shortConfigParam0 = new ShortConfigParam("Jc", short0, short0, short1, false, "Jc");
      try { 
        shortConfigParam0.validate();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // com.sleepycat.je.config.ShortConfigParam: param Jc doesn't validate, -1 is less than min of 9
         //
         assertThrownBy("com.sleepycat.je.config.ShortConfigParam", e);
      }
  }

  @Test
  public void test10()  throws Throwable  {
      Short short0 = new Short((short) (-1028));
      ShortConfigParam shortConfigParam0 = new ShortConfigParam("W9,(!tlcv<", short0, short0, short0, true, "W9,(!tlcv<");
      shortConfigParam0.validate();
      assertTrue(shortConfigParam0.isMutable());
  }
}