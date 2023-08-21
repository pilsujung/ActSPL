/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 09:14:52 KST 2017
 */

package com.sleepycat.je.log;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.fail;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.sleepycat.je.dbi.EnvironmentImpl;
import com.sleepycat.je.latch.LatchSupport;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class FSyncManager_ESTest3 extends FSyncManager_ESTest_scaffolding3 {

  @Test
  public void test0()  throws Throwable  {
      FSyncManager.FSyncGroup fSyncManager_FSyncGroup0 = new FSyncManager.FSyncGroup(1L, (EnvironmentImpl) null);
      fSyncManager_FSyncGroup0.wakeupOne();
      boolean boolean0 = fSyncManager_FSyncGroup0.getLeader();
      fSyncManager_FSyncGroup0.NO_FSYNC_NEEDED = (-1);
      boolean boolean1 = fSyncManager_FSyncGroup0.getLeader();
      assertFalse(boolean1 == boolean0);
      assertFalse(boolean1);
  }

  @Test
  public void test1()  throws Throwable  {
      LatchSupport.makeLatch((EnvironmentImpl) null);
      FSyncManager.FSyncGroup fSyncManager_FSyncGroup0 = new FSyncManager.FSyncGroup(10L, (EnvironmentImpl) null);
      fSyncManager_FSyncGroup0.waitForFsync();
      fSyncManager_FSyncGroup0.wakeupOne();
      fSyncManager_FSyncGroup0.waitForFsync();
      fSyncManager_FSyncGroup0.wakeupAll();
      fSyncManager_FSyncGroup0.DO_TIMEOUT_FSYNC = 1410;
      fSyncManager_FSyncGroup0.getLeader();
      fSyncManager_FSyncGroup0.waitForFsync();
      fSyncManager_FSyncGroup0.wakeupAll();
      fSyncManager_FSyncGroup0.wakeupOne();
      fSyncManager_FSyncGroup0.wakeupOne();
      FSyncManager fSyncManager0 = null;
      try {
        fSyncManager0 = new FSyncManager((EnvironmentImpl) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.FSyncManager", e);
      }
  }

  @Test
  public void test2()  throws Throwable  {
      FSyncManager.FSyncGroup.NO_FSYNC_NEEDED = 0;
      int int0 = FSyncManager.FSyncGroup.DO_TIMEOUT_FSYNC;
      //  // Unstable assertion: assertEquals(0, int0);
  }
}