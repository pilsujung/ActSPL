/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 21 19:50:55 KST 2017
 */

package com.sleepycat.je.log;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.sleepycat.je.DatabaseException;
import com.sleepycat.je.dbi.EnvironmentImpl;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class LogManager_ESTest1 extends LogManager_ESTest_scaffolding1 {

  @Test
  public void test2()  throws Throwable  {
      LogManager.LogManager_getLogEntryFromLogSource logManager_LogManager_getLogEntryFromLogSource0 = new LogManager.LogManager_getLogEntryFromLogSource((LogManager) null, (-2832L), (LogSource) null);
      try { 
        logManager_LogManager_getLogEntryFromLogSource0.execute();
        fail("Expecting exception: DatabaseException");
      
      } catch(DatabaseException e) {
         //
         // java.lang.NullPointerException
         //
         assertThrownBy("com.sleepycat.je.log.LogManager$LogManager_getLogEntryFromLogSource", e);
      }
  }

  @Test
  public void test5()  throws Throwable  {
      LogManager.LogManager_getLogEntryFromLogSource logManager_LogManager_getLogEntryFromLogSource0 = new LogManager.LogManager_getLogEntryFromLogSource((LogManager) null, (-8L), (LogSource) null);
      logManager_LogManager_getLogEntryFromLogSource0.hook508();
  }

  @Test
  public void test8()  throws Throwable  {
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
