/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 10:38:41 KST 2017
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
public class FileReader_ESTest5 extends FileReader_ESTest_scaffolding5 {


  @Test
  public void test1()  throws Throwable  {
      LastFileReader lastFileReader0 = null;
      try {
        lastFileReader0 = new LastFileReader((EnvironmentImpl) null, 52);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.FileReader", e);
      }
  }




  
}
