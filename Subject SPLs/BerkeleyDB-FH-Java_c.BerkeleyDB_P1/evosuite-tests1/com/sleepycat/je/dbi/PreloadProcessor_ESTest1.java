/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 21 19:33:23 KST 2017
 */

package com.sleepycat.je.dbi;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.fail;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.sleepycat.je.PreloadStats;
import com.sleepycat.je.log.LogEntryType;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class PreloadProcessor_ESTest1 extends PreloadProcessor_ESTest_scaffolding1 {

  @Test
  public void test0()  throws Throwable  {
      PreloadStats preloadStats0 = new PreloadStats();
      PreloadProcessor preloadProcessor0 = new PreloadProcessor((EnvironmentImpl) null, (-1L), (-2033L), preloadStats0);
      preloadProcessor0.hook353(preloadStats0);
  }

  @Test
  public void test1()  throws Throwable  {
      LogEntryType logEntryType0 = LogEntryType.LOG_TXN_ABORT;
      PreloadStats preloadStats0 = new PreloadStats();
      PreloadProcessor preloadProcessor0 = new PreloadProcessor((EnvironmentImpl) null, 9223372036854775802L, 9223372036854775802L, preloadStats0);
      preloadProcessor0.processLSN(9223372036854775802L, logEntryType0);
      assertFalse(logEntryType0.isNodeType());
  }

  @Test
  public void test3()  throws Throwable  {
      LogEntryType logEntryType0 = LogEntryType.LOG_ROOT;
      PreloadStats preloadStats0 = new PreloadStats();
      PreloadProcessor preloadProcessor0 = new PreloadProcessor((EnvironmentImpl) null, (-1362L), (-1362L), preloadStats0);
      // Undeclared exception!
      try { 
        preloadProcessor0.processLSN((-1362L), logEntryType0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // PreloadStatus.EXCEEDED_TIME
         //
         assertThrownBy("com.sleepycat.je.dbi.DatabaseImpl", e);
      }
  }

  @Test
  public void test4()  throws Throwable  {
      PreloadStats preloadStats0 = new PreloadStats();
      PreloadProcessor preloadProcessor0 = new PreloadProcessor((EnvironmentImpl) null, 0L, 0L, preloadStats0);
      preloadProcessor0.hook355();
  }

  @Test
  public void test5()  throws Throwable  {
      PreloadStats preloadStats0 = new PreloadStats();
      PreloadProcessor preloadProcessor0 = new PreloadProcessor((EnvironmentImpl) null, 0L, 0L, preloadStats0);
      LogEntryType logEntryType0 = LogEntryType.LOG_IN_DELETE_INFO;
      preloadProcessor0.hook354(logEntryType0);
      assertFalse(logEntryType0.isNodeType());
  }
}
