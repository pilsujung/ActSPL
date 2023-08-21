/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 00:39:35 KST 2017
 */

package com.sleepycat.je.dbi;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.sleepycat.je.PreloadStats;
import com.sleepycat.je.log.LogEntryType;
import com.sleepycat.je.tree.DupCountLN;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class PreloadProcessor_ESTest6 extends PreloadProcessor_ESTest_scaffolding6 {

  @Test
  public void test01()  throws Throwable  {
      PreloadStats preloadStats0 = new PreloadStats();
      PreloadProcessor preloadProcessor0 = new PreloadProcessor((EnvironmentImpl) null, (-944L), (-944L), preloadStats0);
      LogEntryType logEntryType0 = LogEntryType.LOG_IN;
      preloadProcessor0.hook354(logEntryType0);
      assertEquals(1, preloadStats0.nINsLoaded);
      assertEquals(1, preloadStats0.getNINsLoaded());
  }

  @Test
  public void test02()  throws Throwable  {
      PreloadStats preloadStats0 = new PreloadStats();
      PreloadProcessor preloadProcessor0 = new PreloadProcessor((EnvironmentImpl) null, (-951L), (-951L), preloadStats0);
      LogEntryType logEntryType0 = LogEntryType.LOG_DIN;
      preloadProcessor0.hook354(logEntryType0);
      assertEquals(1, preloadStats0.nDINsLoaded);
      assertEquals(0, preloadStats0.getNLNsLoaded());
  }

  @Test
  public void test03()  throws Throwable  {
      PreloadStats preloadStats0 = new PreloadStats();
      PreloadProcessor preloadProcessor0 = new PreloadProcessor((EnvironmentImpl) null, (-950L), (-950L), preloadStats0);
      LogEntryType logEntryType0 = LogEntryType.LOG_BIN;
      preloadProcessor0.hook354(logEntryType0);
      assertEquals(1, preloadStats0.nBINsLoaded);
      assertEquals(1, preloadStats0.getNBINsLoaded());
  }

  @Test
  public void test04()  throws Throwable  {
      PreloadStats preloadStats0 = new PreloadStats();
      PreloadProcessor preloadProcessor0 = new PreloadProcessor((EnvironmentImpl) null, (-925L), (-925L), preloadStats0);
      LogEntryType logEntryType0 = LogEntryType.LOG_DBIN;
      preloadProcessor0.hook354(logEntryType0);
      assertEquals(1, preloadStats0.nDBINsLoaded);
      assertEquals(1, preloadStats0.getNDBINsLoaded());
  }

  @Test
  public void test05()  throws Throwable  {
      PreloadStats preloadStats0 = new PreloadStats();
      PreloadProcessor preloadProcessor0 = new PreloadProcessor((EnvironmentImpl) null, (-951L), (-951L), preloadStats0);
      LogEntryType logEntryType0 = LogEntryType.LOG_LN;
      preloadProcessor0.hook354(logEntryType0);
      assertEquals(1, preloadStats0.nLNsLoaded);
      assertEquals(1, preloadStats0.getNLNsLoaded());
  }

  @Test
  public void test06()  throws Throwable  {
      PreloadStats preloadStats0 = new PreloadStats();
      PreloadProcessor preloadProcessor0 = new PreloadProcessor((EnvironmentImpl) null, 183L, 183L, preloadStats0);
      LogEntryType logEntryType0 = LogEntryType.LOG_LN_TRANSACTIONAL;
      preloadProcessor0.hook354(logEntryType0);
      assertEquals(1, preloadStats0.nLNsLoaded);
      assertEquals(1, preloadStats0.getNLNsLoaded());
  }

  @Test
  public void test07()  throws Throwable  {
      PreloadProcessor preloadProcessor0 = new PreloadProcessor((EnvironmentImpl) null, 12L, 12L, (PreloadStats) null);
      DupCountLN dupCountLN0 = new DupCountLN();
      LogEntryType logEntryType0 = dupCountLN0.getLogType();
      // Undeclared exception!
      try { 
        preloadProcessor0.hook354(logEntryType0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.dbi.PreloadProcessor", e);
      }
  }

  @Test
  public void test08()  throws Throwable  {
      PreloadStats preloadStats0 = new PreloadStats();
      PreloadProcessor preloadProcessor0 = new PreloadProcessor((EnvironmentImpl) null, 183L, 183L, preloadStats0);
      LogEntryType logEntryType0 = LogEntryType.LOG_DUPCOUNTLN_TRANSACTIONAL;
      preloadProcessor0.hook354(logEntryType0);
      assertEquals(1, preloadStats0.nDupCountLNsLoaded);
      assertEquals(1, preloadStats0.getNDupCountLNsLoaded());
  }

  @Test
  public void test10()  throws Throwable  {
      PreloadProcessor preloadProcessor0 = new PreloadProcessor((EnvironmentImpl) null, 2048L, 1492789140373L, (PreloadStats) null);
      LogEntryType logEntryType0 = LogEntryType.LOG_CKPT_START;
      // Undeclared exception!
      try { 
        preloadProcessor0.processLSN((-3816L), logEntryType0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // PreloadStatus.EXCEEDED_TIME
         //
         assertThrownBy("com.sleepycat.je.dbi.DatabaseImpl", e);
      }
  }

  @Test
  public void test11()  throws Throwable  {
      PreloadStats preloadStats0 = new PreloadStats();
      PreloadProcessor preloadProcessor0 = new PreloadProcessor((EnvironmentImpl) null, (-925L), (-925L), preloadStats0);
      LogEntryType logEntryType0 = LogEntryType.LOG_DEL_DUPLN_TRANSACTIONAL;
      preloadProcessor0.hook354(logEntryType0);
      assertEquals(0, preloadStats0.nDupCountLNsLoaded);
      assertEquals(0, preloadStats0.nLNsLoaded);
      assertEquals(0, preloadStats0.nDBINsLoaded);
      assertEquals(0, preloadStats0.nDINsLoaded);
      assertEquals(0, preloadStats0.nINsLoaded);
      assertEquals(0, preloadStats0.nBINsLoaded);
      assertEquals(0, preloadStats0.getNDupCountLNsLoaded());
  }

  @Test
  public void test12()  throws Throwable  {
      PreloadStats preloadStats0 = new PreloadStats();
      PreloadProcessor preloadProcessor0 = new PreloadProcessor((EnvironmentImpl) null, 135L, 135L, preloadStats0);
      preloadProcessor0.hook353(preloadStats0);
      assertEquals(0, preloadStats0.nDupCountLNsLoaded);
  }
}
