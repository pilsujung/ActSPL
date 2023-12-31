/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 09:18:59 KST 2017
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
public class LNFileReader_ESTest3 extends LNFileReader_ESTest_scaffolding3 {

  @Test
  public void test0()  throws Throwable  {
      Long long0 = new Long((long) (-598));
      LNFileReader lNFileReader0 = null;
      try {
        lNFileReader0 = new LNFileReader((EnvironmentImpl) null, (-598), (long) (-598), false, (long) (-598), (long) (-598), long0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.FileReader", e);
      }
  }
}
