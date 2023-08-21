/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 01:08:04 KST 2017
 */

package com.sleepycat.je.log;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.sleepycat.je.dbi.EnvironmentImpl;
import com.sleepycat.je.log.LogEntryType;
import com.sleepycat.je.log.SearchFileReader;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class SearchFileReader_ESTest2 extends SearchFileReader_ESTest_scaffolding2 {

  @Test
  public void test0()  throws Throwable  {
      LogEntryType logEntryType0 = LogEntryType.LOG_NAMELN_TRANSACTIONAL;
      SearchFileReader searchFileReader0 = null;
      try {
        searchFileReader0 = new SearchFileReader((EnvironmentImpl) null, (-2591), false, 10000000L, 10000000L, logEntryType0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.FileReader", e);
      }
  }
}
