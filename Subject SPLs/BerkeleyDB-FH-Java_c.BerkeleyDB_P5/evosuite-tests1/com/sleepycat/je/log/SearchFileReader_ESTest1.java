/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 21 19:57:12 KST 2017
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
public class SearchFileReader_ESTest1 extends SearchFileReader_ESTest_scaffolding1 {

  @Test
  public void test0()  throws Throwable  {
      LogEntryType logEntryType0 = LogEntryType.LOG_LN_TRANSACTIONAL;
      SearchFileReader searchFileReader0 = null;
      try {
        searchFileReader0 = new SearchFileReader((EnvironmentImpl) null, 909, true, (long) 909, (long) 909, logEntryType0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.FileReader", e);
      }
  }
}
