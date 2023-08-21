/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 21 20:31:07 KST 2017
 */

package com.sleepycat.je.log;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.fail;

import java.io.File;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class JEFileFilter_ESTest7 extends JEFileFilter_ESTest_scaffolding7 {

  @Test
  public void test0()  throws Throwable  {
      String[] stringArray0 = new String[0];
      JEFileFilter jEFileFilter0 = new JEFileFilter(stringArray0);
      // Undeclared exception!
      try { 
        jEFileFilter0.accept((File) null, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test1()  throws Throwable  {
      String[] stringArray0 = new String[0];
      JEFileFilter jEFileFilter0 = new JEFileFilter(stringArray0);
      boolean boolean0 = jEFileFilter0.accept((File) null, "f.WN[Z>~e|0xfS1");
      assertFalse(boolean0);
  }

  @Test
  public void test2()  throws Throwable  {
      String[] stringArray0 = new String[1];
      JEFileFilter jEFileFilter0 = new JEFileFilter(stringArray0);
      boolean boolean0 = jEFileFilter0.accept((File) null, "N2[u?<!F.j.}l$");
      assertFalse(boolean0);
  }

  @Test
  public void test3()  throws Throwable  {
      String[] stringArray0 = new String[6];
      JEFileFilter jEFileFilter0 = new JEFileFilter(stringArray0);
      boolean boolean0 = jEFileFilter0.accept((File) null, "xc+TyK_y&&#%c");
      assertFalse(boolean0);
  }

  @Test
  public void test4()  throws Throwable  {
      String[] stringArray0 = new String[9];
      stringArray0[5] = ".<y0*5";
      JEFileFilter jEFileFilter0 = new JEFileFilter(stringArray0);
      boolean boolean0 = jEFileFilter0.accept((File) null, "?%`jcimx.<y0*5");
      assertFalse(boolean0);
  }

  @Test
  public void test5()  throws Throwable  {
      String[] stringArray0 = new String[17];
      JEFileFilter jEFileFilter0 = new JEFileFilter(stringArray0);
      boolean boolean0 = jEFileFilter0.accept((File) null, "N2.[u?<G!(F.j.}l$");
      assertFalse(boolean0);
  }
}
