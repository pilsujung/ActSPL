/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 01:21:48 KST 2017
 */

package com.sleepycat.je.log;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.fail;

import java.io.File;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.sleepycat.je.EnvironmentConfig;
import com.sleepycat.je.dbi.EnvironmentImpl;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class SyncedLogManager_ESTest6 extends SyncedLogManager_ESTest_scaffolding6 {

  @Test
  public void test1()  throws Throwable  {
      SyncedLogManager syncedLogManager0 = null;
      try {
        syncedLogManager0 = new SyncedLogManager((EnvironmentImpl) null, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.LogManager", e);
      }
  }
}
