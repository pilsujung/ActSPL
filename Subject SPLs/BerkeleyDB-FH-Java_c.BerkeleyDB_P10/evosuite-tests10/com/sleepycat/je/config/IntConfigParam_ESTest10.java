/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 21 23:32:59 KST 2017
 */

package com.sleepycat.je.config;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.sleepycat.je.config.IntConfigParam;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class IntConfigParam_ESTest10 extends IntConfigParam_ESTest_scaffolding10 {

  @Test
  public void test0()  throws Throwable  {
      Integer integer0 = Integer.getInteger("# Number of times to retry a compression run if a deadlock occurs.", (-6137));
      Integer integer1 = new Integer((-1271));
      IntConfigParam intConfigParam0 = new IntConfigParam("# Number of times to retry a compression run if a deadlock occurs.", integer0, integer1, integer0, false, "# Number of times to retry a compression run if a deadlock occurs.");
      intConfigParam0.validate();
      assertEquals("# Number of times to retry a compression run if a deadlock occurs.", intConfigParam0.toString());
  }

  @Test
  public void test1()  throws Throwable  {
      Integer integer0 = new Integer(0);
      IntConfigParam intConfigParam0 = null;
      try {
        intConfigParam0 = new IntConfigParam(" A configuration parameter name can't be null or 0 length", integer0, integer0, (Integer) null, false, " A configuration parameter name can't be null or 0 length");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.config.IntConfigParam", e);
      }
  }

  @Test
  public void test2()  throws Throwable  {
      Integer integer0 = new Integer(0);
      IntConfigParam intConfigParam0 = null;
      try {
        intConfigParam0 = new IntConfigParam((String) null, integer0, integer0, integer0, false, (String) null);
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
      Integer integer0 = Integer.getInteger("# Number of times to retry a compression run if a deadlock occurs.", (-6137));
      IntConfigParam intConfigParam0 = new IntConfigParam("# Number of times to retry a compression run if a deadlock occurs.", integer0, integer0, integer0, false, "# Number of times to retry a compression run if a deadlock occurs.");
      try { 
        intConfigParam0.validateValue("V;3s[u|[$_j'9DNE>%^");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // com.sleepycat.je.config.IntConfigParam: V;3s[u|[$_j'9DNE>%^ not valid value for # Number of times to retry a compression run if a deadlock occurs.
         //
         assertThrownBy("com.sleepycat.je.config.IntConfigParam", e);
      }
  }

  @Test
  public void test4()  throws Throwable  {
      Integer integer0 = new Integer(1);
      IntConfigParam intConfigParam0 = new IntConfigParam("je.evictor.nodeScanPercentage", integer0, (Integer) null, integer0, false, "je.evictor.nodeScanPercentage");
      String string0 = intConfigParam0.getExtraDescription();
      assertEquals("# minimum = 1", string0);
  }

  @Test
  public void test5()  throws Throwable  {
      Integer integer0 = Integer.getInteger("# Number of times to retry a compression run if a deadlock occurs.", (-6137));
      IntConfigParam intConfigParam0 = new IntConfigParam("# Number of times to retry a compression run if a deadlock occurs.", integer0, integer0, integer0, false, "# Number of times to retry a compression run if a deadlock occurs.");
      String string0 = intConfigParam0.getExtraDescription();
      assertEquals("# minimum = -6137\n# maximum = -6137", string0);
  }

  @Test
  public void test6()  throws Throwable  {
      Integer integer0 = new Integer((-16));
      IntConfigParam intConfigParam0 = new IntConfigParam("Tw@IRu9vM", (Integer) null, integer0, integer0, false, "Tw@IRu9vM");
      String string0 = intConfigParam0.getExtraDescription();
      assertEquals("# maximum = -16", string0);
  }

  @Test
  public void test7()  throws Throwable  {
      Integer integer0 = new Integer((-262));
      Integer integer1 = new Integer(1000);
      IntConfigParam intConfigParam0 = new IntConfigParam("[[jm_:KOsQ&X.k", integer0, integer0, integer1, false, "[[jm_:KOsQ&X.k");
      try { 
        intConfigParam0.validate();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // com.sleepycat.je.config.IntConfigParam: param [[jm_:KOsQ&X.k doesn't validate, 1000 is greater than max of -262
         //
         assertThrownBy("com.sleepycat.je.config.IntConfigParam", e);
      }
  }

  @Test
  public void test8()  throws Throwable  {
      Integer integer0 = new Integer(3162);
      Integer integer1 = new Integer((-2));
      IntConfigParam intConfigParam0 = new IntConfigParam("!", integer0, integer1, integer1, false, "!");
      try { 
        intConfigParam0.validate();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // com.sleepycat.je.config.IntConfigParam: param ! doesn't validate, -2 is less than min of 3162
         //
         assertThrownBy("com.sleepycat.je.config.IntConfigParam", e);
      }
  }

  @Test
  public void test9()  throws Throwable  {
      Integer integer0 = Integer.getInteger("# Number of times to retry a compression run if a deadlock occurs.", (-6137));
      IntConfigParam intConfigParam0 = new IntConfigParam("# Number of times to retry a compression run if a deadlock occurs.", integer0, integer0, integer0, false, "# Number of times to retry a compression run if a deadlock occurs.");
      intConfigParam0.validate();
      assertEquals("# Number of times to retry a compression run if a deadlock occurs.", intConfigParam0.getDescription());
  }
}
