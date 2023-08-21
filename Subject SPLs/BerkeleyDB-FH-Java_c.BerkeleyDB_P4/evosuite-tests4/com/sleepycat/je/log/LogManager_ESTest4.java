/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 15:10:13 KST 2017
 */

package com.sleepycat.je.log;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.sleepycat.je.DatabaseException;
import com.sleepycat.je.dbi.EnvironmentImpl;
import com.sleepycat.je.log.LatchedLogManager;
import com.sleepycat.je.log.LogManager;
import com.sleepycat.je.log.LogSource;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class LogManager_ESTest4 extends LogManager_ESTest_scaffolding4 {


  @Test
  public void test1()  throws Throwable  {
      int int0 = LogManager.hook504(5);
      assertEquals(5, int0);
  }

  @Test
  public void test2()  throws Throwable  {
      LogManager.LogManager_getLogEntryFromLogSource logManager_LogManager_getLogEntryFromLogSource0 = new LogManager.LogManager_getLogEntryFromLogSource((LogManager) null, (-167L), (LogSource) null);
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
  public void test3()  throws Throwable  {
      LogManager.LogManager_getLogEntryFromLogSource logManager_LogManager_getLogEntryFromLogSource0 = new LogManager.LogManager_getLogEntryFromLogSource((LogManager) null, (-194L), (LogSource) null);
      logManager_LogManager_getLogEntryFromLogSource0.hook506();
  }

  @Test
  public void test4()  throws Throwable  {
      LogManager.LogManager_getLogEntryFromLogSource logManager_LogManager_getLogEntryFromLogSource0 = new LogManager.LogManager_getLogEntryFromLogSource((LogManager) null, (-194L), (LogSource) null);
      logManager_LogManager_getLogEntryFromLogSource0.hook507();
  }

  @Test
  public void test5()  throws Throwable  {
      LogManager.LogManager_getLogEntryFromLogSource logManager_LogManager_getLogEntryFromLogSource0 = new LogManager.LogManager_getLogEntryFromLogSource((LogManager) null, (-195L), (LogSource) null);
      try { 
        logManager_LogManager_getLogEntryFromLogSource0.hook508();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.LogManager", e);
      }
  }


  @Test
  public void test7()  throws Throwable  {
      int int0 = LogManager.hook504((-10));
      assertEquals((-10), int0);
  }

}
