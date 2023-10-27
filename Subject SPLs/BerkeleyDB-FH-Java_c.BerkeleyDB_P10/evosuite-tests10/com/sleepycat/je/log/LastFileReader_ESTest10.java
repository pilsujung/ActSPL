/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 00:53:57 KST 2017
 */

package com.sleepycat.je.log;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.sleepycat.je.dbi.EnvironmentImpl;
import com.sleepycat.je.log.LastFileReader;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class LastFileReader_ESTest10 extends LastFileReader_ESTest_scaffolding10 {

  @Test
  public void test0()  throws Throwable  {
      LastFileReader lastFileReader0 = null;
      try {
        lastFileReader0 = new LastFileReader((EnvironmentImpl) null, 2052);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.FileReader", e);
      }
  }

  @Test
  public void test1()  throws Throwable  {
      Long long0 = new Long((long) (-1637));
      LastFileReader lastFileReader0 = null;
      try {
        lastFileReader0 = new LastFileReader((EnvironmentImpl) null, (-1637), long0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.FileReader", e);
      }
  }
}