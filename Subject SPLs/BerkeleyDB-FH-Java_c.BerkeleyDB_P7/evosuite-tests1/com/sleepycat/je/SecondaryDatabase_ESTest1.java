/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 21 18:52:04 KST 2017
 */

package com.sleepycat.je;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.fail;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class SecondaryDatabase_ESTest1 extends SecondaryDatabase_ESTest_scaffolding1 {

  @Test
  public void test1()  throws Throwable  {
      // Undeclared exception!
      try { 
        SecondaryDatabase.notAllowedException();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Operation not allowed on a secondary
         //
         assertThrownBy("com.sleepycat.je.SecondaryDatabase", e);
      }
  }
}
