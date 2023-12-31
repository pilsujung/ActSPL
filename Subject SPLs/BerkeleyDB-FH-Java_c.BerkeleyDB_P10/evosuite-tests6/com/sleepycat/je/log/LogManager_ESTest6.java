/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 01:12:56 KST 2017
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
public class LogManager_ESTest6 extends LogManager_ESTest_scaffolding6 {

  @Test
  public void test0()  throws Throwable  {
      int int0 = LogManager.hook504(1946);
      assertEquals(1946, int0);
  }

  @Test
  public void test1()  throws Throwable  {
      int int0 = LogManager.hook504((-766));
      assertEquals((-766), int0);
  }

  @Test
  public void test2()  throws Throwable  {
      LogManager.LogManager_getLogEntryFromLogSource logManager_LogManager_getLogEntryFromLogSource0 = new LogManager.LogManager_getLogEntryFromLogSource((LogManager) null, (-49L), (LogSource) null);
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
      LogManager.LogManager_getLogEntryFromLogSource logManager_LogManager_getLogEntryFromLogSource0 = new LogManager.LogManager_getLogEntryFromLogSource((LogManager) null, (-1L), (LogSource) null);
      logManager_LogManager_getLogEntryFromLogSource0.hook506();
  }

  @Test
  public void test4()  throws Throwable  {
      LogManager.LogManager_getLogEntryFromLogSource logManager_LogManager_getLogEntryFromLogSource0 = new LogManager.LogManager_getLogEntryFromLogSource((LogManager) null, 601L, (LogSource) null);
      logManager_LogManager_getLogEntryFromLogSource0.hook507();
  }

  @Test
  public void test5()  throws Throwable  {
      LogManager.LogManager_getLogEntryFromLogSource logManager_LogManager_getLogEntryFromLogSource0 = new LogManager.LogManager_getLogEntryFromLogSource((LogManager) null, (-1L), (LogSource) null);
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
  public void test6()  throws Throwable  {
      int int0 = LogManager.HEADER_CONTENT_BYTES();
      assertEquals(14, int0);
  }

  @Test
  public void test7()  throws Throwable  {
      int int0 = LogManager.hook504(0);
      assertEquals(0, int0);
  }

  @Test
  public void test8()  throws Throwable  {
      LatchedLogManager latchedLogManager0 = null;
      try {
        latchedLogManager0 = new LatchedLogManager((EnvironmentImpl) null, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.LogManager", e);
      }
  }
}
