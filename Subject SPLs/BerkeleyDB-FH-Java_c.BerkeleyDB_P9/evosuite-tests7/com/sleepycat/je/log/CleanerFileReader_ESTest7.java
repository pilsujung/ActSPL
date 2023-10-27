/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 21 20:22:53 KST 2017
 */

package com.sleepycat.je.log;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.fail;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.sleepycat.je.dbi.EnvironmentImpl;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class CleanerFileReader_ESTest7 extends CleanerFileReader_ESTest_scaffolding7 {

  @Test
  public void test0()  throws Throwable  {
      Long long0 = new Long((long) 9892);
      CleanerFileReader cleanerFileReader0 = null;
      try {
        cleanerFileReader0 = new CleanerFileReader((EnvironmentImpl) null, 9892, (long) 9892, long0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.FileReader", e);
      }
  }
}