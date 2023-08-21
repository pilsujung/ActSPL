/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 12:04:38 KST 2017
 */

package com.sleepycat.je.txn;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.fail;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.sleepycat.je.StatsConfig;
import com.sleepycat.je.dbi.EnvironmentImpl;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class LockManager_ESTest5 extends LockManager_ESTest_scaffolding5 {

  @Test
  public void test2()  throws Throwable  {
      Long long0 = new Long(2676L);
      Lock lock0 = new Lock(long0);
      LockGrantType lockGrantType0 = LockGrantType.DENIED;
      LockManager.LockAttemptResult lockManager_LockAttemptResult0 = new LockManager.LockAttemptResult(lock0, lockGrantType0, true);
  }


}
