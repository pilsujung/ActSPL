/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 21 21:42:54 KST 2017
 */

package com.sleepycat.je.txn;

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
public class BasicLocker_ESTest7 extends BasicLocker_ESTest_scaffolding7 {

  @Test
  public void test0()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = new EnvironmentConfig();
      EnvironmentImpl environmentImpl0 = null;
      try {
        environmentImpl0 = new EnvironmentImpl((File) null, environmentConfig0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.FileManager", e);
      }
  }

  @Test
  public void test1()  throws Throwable  {
      BasicLocker basicLocker0 = null;
      try {
        basicLocker0 = new BasicLocker((EnvironmentImpl) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.txn.Locker", e);
      }
  }
}
