/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 09:31:42 KST 2017
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
public class SearchFileReader_ESTest3 extends SearchFileReader_ESTest_scaffolding3 {

  @Test
  public void test0()  throws Throwable  {
      SearchFileReader searchFileReader0 = null;
      try {
        searchFileReader0 = new SearchFileReader((EnvironmentImpl) null, 106, true, (long) 106, (long) 106, (LogEntryType) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.FileReader", e);
      }
  }
}
