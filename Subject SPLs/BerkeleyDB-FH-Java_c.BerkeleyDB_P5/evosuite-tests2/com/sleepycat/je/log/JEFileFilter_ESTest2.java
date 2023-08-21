/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 00:53:19 KST 2017
 */

package com.sleepycat.je.log;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.sleepycat.je.log.JEFileFilter;
import java.io.File;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class JEFileFilter_ESTest2 extends JEFileFilter_ESTest_scaffolding2 {

  @Test
  public void test0()  throws Throwable  {
      String[] stringArray0 = new String[2];
      JEFileFilter jEFileFilter0 = new JEFileFilter(stringArray0);
      boolean boolean0 = jEFileFilter0.accept((File) null, "=ar~NK?ljH8,)F.yOU/");
      assertFalse(boolean0);
  }

  @Test
  public void test1()  throws Throwable  {
      String[] stringArray0 = new String[14];
      JEFileFilter jEFileFilter0 = new JEFileFilter(stringArray0);
      boolean boolean0 = jEFileFilter0.accept((File) null, ".%@0_xoi9h8");
      assertFalse(boolean0);
  }

  @Test
  public void test2()  throws Throwable  {
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
  public void test3()  throws Throwable  {
      String[] stringArray0 = new String[21];
      JEFileFilter jEFileFilter0 = new JEFileFilter(stringArray0);
      boolean boolean0 = jEFileFilter0.accept((File) null, "?4!$KQ.u..*Ak|/<]");
      assertFalse(boolean0);
  }

  @Test
  public void test4()  throws Throwable  {
      String[] stringArray0 = new String[19];
      JEFileFilter jEFileFilter0 = new JEFileFilter(stringArray0);
      boolean boolean0 = jEFileFilter0.accept((File) null, "?4!J$KQ.u./.*Ak|8<]");
      assertFalse(boolean0);
  }

  @Test
  public void test5()  throws Throwable  {
      String[] stringArray0 = new String[9];
      stringArray0[8] = ".%@0_xhi6h8";
      JEFileFilter jEFileFilter0 = new JEFileFilter(stringArray0);
      boolean boolean0 = jEFileFilter0.accept((File) null, "-c=Ww5)e.%@0_xhi6h8");
      assertFalse(boolean0);
  }

  @Test
  public void test6()  throws Throwable  {
      String[] stringArray0 = new String[19];
      JEFileFilter jEFileFilter0 = new JEFileFilter(stringArray0);
      boolean boolean0 = jEFileFilter0.accept((File) null, ":-=<ZQ\"D.2kqa");
      assertFalse(boolean0);
  }
}
