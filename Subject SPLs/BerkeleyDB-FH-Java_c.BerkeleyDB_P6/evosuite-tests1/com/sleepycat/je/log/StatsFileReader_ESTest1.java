/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 21 19:58:37 KST 2017
 */

package com.sleepycat.je.log;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.sleepycat.je.dbi.EnvironmentImpl;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class StatsFileReader_ESTest1 extends StatsFileReader_ESTest_scaffolding1 {

  @Test
  public void test00()  throws Throwable  {
      StatsFileReader.CheckpointCounter statsFileReader_CheckpointCounter0 = new StatsFileReader.CheckpointCounter();
      statsFileReader_CheckpointCounter0.postStartMapLNCount = 2439;
      statsFileReader_CheckpointCounter0.startCkptLsn = (-391L);
      statsFileReader_CheckpointCounter0.increment((FileReader) null, (byte)4);
  }

  @Test
  public void test01()  throws Throwable  {
      StatsFileReader.CheckpointCounter statsFileReader_CheckpointCounter0 = new StatsFileReader.CheckpointCounter();
      statsFileReader_CheckpointCounter0.startCkptLsn = (long) 0;
      statsFileReader_CheckpointCounter0.postStartLNTxnCount = 2713;
      statsFileReader_CheckpointCounter0.increment((FileReader) null, (byte)1);
  }

  @Test
  public void test02()  throws Throwable  {
      StatsFileReader.CheckpointCounter statsFileReader_CheckpointCounter0 = new StatsFileReader.CheckpointCounter();
      statsFileReader_CheckpointCounter0.preStartLNTxnCount = (-424);
      statsFileReader_CheckpointCounter0.increment((FileReader) null, (byte)1);
  }

  @Test
  public void test03()  throws Throwable  {
      StatsFileReader.CheckpointCounter statsFileReader_CheckpointCounter0 = new StatsFileReader.CheckpointCounter();
      statsFileReader_CheckpointCounter0.startCkptLsn = (-1L);
      statsFileReader_CheckpointCounter0.startCkptLsn = (long) (byte) (-44);
      statsFileReader_CheckpointCounter0.increment((FileReader) null, (byte)1);
  }

  @Test
  public void test04()  throws Throwable  {
      StatsFileReader.CheckpointCounter statsFileReader_CheckpointCounter0 = new StatsFileReader.CheckpointCounter();
      statsFileReader_CheckpointCounter0.increment((FileReader) null, (byte)29);
  }

  @Test
  public void test05()  throws Throwable  {
      StatsFileReader statsFileReader0 = null;
      try {
        statsFileReader0 = new StatsFileReader((EnvironmentImpl) null, 0, (long) 0, (long) 0, "key", "key", false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.FileReader", e);
      }
  }

  @Test
  public void test06()  throws Throwable  {
      StatsFileReader.CheckpointCounter statsFileReader_CheckpointCounter0 = new StatsFileReader.CheckpointCounter();
      statsFileReader_CheckpointCounter0.startCkptLsn = (long) 0;
      statsFileReader_CheckpointCounter0.increment((FileReader) null, (byte)3);
  }

  @Test
  public void test07()  throws Throwable  {
      StatsFileReader.CheckpointCounter statsFileReader_CheckpointCounter0 = new StatsFileReader.CheckpointCounter();
      statsFileReader_CheckpointCounter0.increment((FileReader) null, (byte)3);
  }

  @Test
  public void test08()  throws Throwable  {
      StatsFileReader.CheckpointCounter statsFileReader_CheckpointCounter0 = new StatsFileReader.CheckpointCounter();
      statsFileReader_CheckpointCounter0.startCkptLsn = (long) 0;
      statsFileReader_CheckpointCounter0.increment((FileReader) null, (byte)4);
  }

  @Test
  public void test09()  throws Throwable  {
      StatsFileReader.CheckpointCounter statsFileReader_CheckpointCounter0 = new StatsFileReader.CheckpointCounter();
      statsFileReader_CheckpointCounter0.increment((FileReader) null, (byte)4);
      statsFileReader_CheckpointCounter0.increment((FileReader) null, (byte)4);
  }

  @Test
  public void test10()  throws Throwable  {
      StatsFileReader.CheckpointCounter statsFileReader_CheckpointCounter0 = new StatsFileReader.CheckpointCounter();
      // Undeclared exception!
      try { 
        statsFileReader_CheckpointCounter0.increment((FileReader) null, (byte)19);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.StatsFileReader$CheckpointCounter", e);
      }
  }

  @Test
  public void test11()  throws Throwable  {
      StatsFileReader.CheckpointCounter statsFileReader_CheckpointCounter0 = new StatsFileReader.CheckpointCounter();
      statsFileReader_CheckpointCounter0.increment((FileReader) null, (byte) (-44));
  }

  @Test
  public void test12()  throws Throwable  {
      StatsFileReader.EntryInfo statsFileReader_EntryInfo0 = new StatsFileReader.EntryInfo();
      StatsFileReader.CheckpointCounter statsFileReader_CheckpointCounter0 = new StatsFileReader.CheckpointCounter();
      StatsFileReader.LogEntryTypeComparator statsFileReader_LogEntryTypeComparator0 = new StatsFileReader.LogEntryTypeComparator();
      // Undeclared exception!
      try { 
        statsFileReader_LogEntryTypeComparator0.compare(statsFileReader_EntryInfo0, statsFileReader_CheckpointCounter0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // non LogEntryType passed to LogEntryType.compare
         //
         assertThrownBy("com.sleepycat.je.log.StatsFileReader$LogEntryTypeComparator", e);
      }
  }

  @Test
  public void test13()  throws Throwable  {
      StatsFileReader.EntryInfo statsFileReader_EntryInfo0 = new StatsFileReader.EntryInfo();
      StatsFileReader.LogEntryTypeComparator statsFileReader_LogEntryTypeComparator0 = new StatsFileReader.LogEntryTypeComparator();
      LogEntryType logEntryType0 = LogEntryType.LOG_TXN_COMMIT;
      // Undeclared exception!
      try { 
        statsFileReader_LogEntryTypeComparator0.compare(logEntryType0, statsFileReader_EntryInfo0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // non LogEntryType passed to LogEntryType.compare
         //
         assertThrownBy("com.sleepycat.je.log.StatsFileReader$LogEntryTypeComparator", e);
      }
  }

  @Test
  public void test14()  throws Throwable  {
      StatsFileReader.CheckpointCounter statsFileReader_CheckpointCounter0 = new StatsFileReader.CheckpointCounter();
      StatsFileReader.LogEntryTypeComparator statsFileReader_LogEntryTypeComparator0 = new StatsFileReader.LogEntryTypeComparator();
      int int0 = statsFileReader_LogEntryTypeComparator0.compare((Object) null, statsFileReader_CheckpointCounter0.preStartMapLNTxnCount);
      assertEquals((-1), int0);
  }

  @Test
  public void test15()  throws Throwable  {
      StatsFileReader.LogEntryTypeComparator statsFileReader_LogEntryTypeComparator0 = new StatsFileReader.LogEntryTypeComparator();
      Integer integer0 = new Integer(0);
      int int0 = statsFileReader_LogEntryTypeComparator0.compare(integer0, (Object) null);
      assertEquals(1, int0);
  }
}
