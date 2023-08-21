/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 21 22:43:53 KST 2017
 */

package com.sleepycat.je;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.sleepycat.je.Environment;
import com.sleepycat.je.EnvironmentConfig;
import java.io.File;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class Environment_ESTest2 extends Environment_ESTest_scaffolding2 {

  @Test
  public void test0()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = EnvironmentConfig.DEFAULT;
      Environment environment0 = null;
      try {
        environment0 = new Environment((File) null, environmentConfig0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // envHome cannot be null
         //
         assertThrownBy("com.sleepycat.je.DatabaseUtil", e);
      }
  }

}
