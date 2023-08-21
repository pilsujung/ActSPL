/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 09:35:55 KST 2017
 */

package com.sleepycat.je;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class EnvironmentStats_ESTest5 extends EnvironmentStats_ESTest_scaffolding5 {

  @Test
  public void test000()  throws Throwable  {
      EnvironmentStats environmentStats0 = new EnvironmentStats();
      environmentStats0.setSplitBins(1803);
      int int0 = environmentStats0.getSplitBins();
      assertEquals(1803, int0);
  }

  @Test
  public void test001()  throws Throwable  {
      EnvironmentStats environmentStats0 = new EnvironmentStats();
      environmentStats0.setSplitBins((-441));
      int int0 = environmentStats0.getSplitBins();
      assertEquals((-441), int0);
  }

  @Test
  public void test002()  throws Throwable  {
      EnvironmentStats environmentStats0 = new EnvironmentStats();
      environmentStats0.setRequiredEvictBytes(1139);
      long long0 = environmentStats0.getRequiredEvictBytes();
      assertEquals(1139L, long0);
  }

  @Test
  public void test003()  throws Throwable  {
      EnvironmentStats environmentStats0 = new EnvironmentStats();
      assertEquals(0L, environmentStats0.getRequiredEvictBytes());
      
      environmentStats0.setRequiredEvictBytes((-1L));
      long long0 = environmentStats0.getRequiredEvictBytes();
      assertEquals((-1L), long0);
  }

  @Test
  public void test004()  throws Throwable  {
      EnvironmentStats environmentStats0 = new EnvironmentStats();
      assertEquals(0, environmentStats0.getProcessedBins());
      
      environmentStats0.setProcessedBins(1);
      int int0 = environmentStats0.getProcessedBins();
      assertEquals(1, int0);
  }

  @Test
  public void test005()  throws Throwable  {
      EnvironmentStats environmentStats0 = new EnvironmentStats();
      environmentStats0.setProcessedBins((-2795));
      int int0 = environmentStats0.getProcessedBins();
      assertEquals((-2795), int0);
  }

  @Test
  public void test006()  throws Throwable  {
      EnvironmentStats environmentStats0 = new EnvironmentStats();
      environmentStats0.setNonEmptyBins(1129);
      int int0 = environmentStats0.getNonEmptyBins();
      assertEquals(1129, int0);
  }

  @Test
  public void test007()  throws Throwable  {
      EnvironmentStats environmentStats0 = new EnvironmentStats();
      environmentStats0.setNonEmptyBins((-1245));
      int int0 = environmentStats0.getNonEmptyBins();
      assertEquals((-1245), int0);
  }

  @Test
  public void test008()  throws Throwable  {
      EnvironmentStats environmentStats0 = new EnvironmentStats();
      environmentStats0.setNToBeCleanedLNsProcessed(10);
      int int0 = environmentStats0.getNToBeCleanedLNsProcessed();
      assertEquals(10, int0);
  }

  @Test
  public void test009()  throws Throwable  {
      EnvironmentStats environmentStats0 = new EnvironmentStats();
      environmentStats0.setNToBeCleanedLNsProcessed((-2708));
      int int0 = environmentStats0.getNToBeCleanedLNsProcessed();
      assertEquals((-2708), int0);
  }

  @Test
  public void test010()  throws Throwable  {
      EnvironmentStats environmentStats0 = new EnvironmentStats();
      environmentStats0.setNTempBufferWrites(1L);
      long long0 = environmentStats0.getNTempBufferWrites();
      assertEquals(1L, long0);
  }

  @Test
  public void test011()  throws Throwable  {
      EnvironmentStats environmentStats0 = new EnvironmentStats();
      environmentStats0.setNTempBufferWrites((-1540L));
      long long0 = environmentStats0.getNTempBufferWrites();
      assertEquals((-1540L), long0);
  }

  @Test
  public void test012()  throws Throwable  {
      EnvironmentStats environmentStats0 = new EnvironmentStats();
      environmentStats0.setNRepeatIteratorReads(1L);
      long long0 = environmentStats0.getNRepeatIteratorReads();
      assertEquals(1L, long0);
  }

  @Test
  public void test013()  throws Throwable  {
      EnvironmentStats environmentStats0 = new EnvironmentStats();
      environmentStats0.setNRepeatIteratorReads((-3821L));
      long long0 = environmentStats0.getNRepeatIteratorReads();
      assertEquals((-3821L), long0);
  }

  @Test
  public void test014()  throws Throwable  {
      EnvironmentStats environmentStats0 = new EnvironmentStats();
      environmentStats0.setNRepeatFaultReads(1);
      long long0 = environmentStats0.getNRepeatFaultReads();
      assertEquals(1L, long0);
  }

  @Test
  public void test015()  throws Throwable  {
      EnvironmentStats environmentStats0 = new EnvironmentStats();
      environmentStats0.setNRepeatFaultReads((-1L));
      long long0 = environmentStats0.getNRepeatFaultReads();
      assertEquals((-1L), long0);
  }

  @Test
  public void test016()  throws Throwable  {
      EnvironmentStats environmentStats0 = new EnvironmentStats();
      environmentStats0.setNPendingLNsProcessed(1);
      int int0 = environmentStats0.getNPendingLNsProcessed();
      assertEquals(1, int0);
  }

  @Test
  public void test017()  throws Throwable  {
      EnvironmentStats environmentStats0 = new EnvironmentStats();
      environmentStats0.setNPendingLNsProcessed((-1080));
      int int0 = environmentStats0.getNPendingLNsProcessed();
      assertEquals((-1080), int0);
  }

  @Test
  public void test018()  throws Throwable  {
      EnvironmentStats environmentStats0 = new EnvironmentStats();
      environmentStats0.setNPendingLNsLocked(1);
      int int0 = environmentStats0.getNPendingLNsLocked();
      assertEquals(1, int0);
  }

  @Test
  public void test019()  throws Throwable  {
      EnvironmentStats environmentStats0 = new EnvironmentStats();
      environmentStats0.setNPendingLNsLocked((-1012));
      int int0 = environmentStats0.getNPendingLNsLocked();
      assertEquals((-1012), int0);
  }

  @Test
  public void test020()  throws Throwable  {
      EnvironmentStats environmentStats0 = new EnvironmentStats();
      environmentStats0.setNNotResident(1L);
      long long0 = environmentStats0.getNNotResident();
      assertEquals(1L, long0);
  }

  @Test
  public void test021()  throws Throwable  {
      EnvironmentStats environmentStats0 = new EnvironmentStats();
      environmentStats0.setNNotResident((-2674));
      long long0 = environmentStats0.getNNotResident();
      assertEquals((-2674L), long0);
  }

  @Test
  public void test022()  throws Throwable  {
      EnvironmentStats environmentStats0 = new EnvironmentStats();
      environmentStats0.setNNodesSelected(2163L);
      long long0 = environmentStats0.getNNodesSelected();
      assertEquals(2163L, long0);
  }

  @Test
  public void test023()  throws Throwable  {
      EnvironmentStats environmentStats0 = new EnvironmentStats();
      assertEquals(0L, environmentStats0.getNNodesSelected());
      
      environmentStats0.setNNodesSelected((-1));
      long long0 = environmentStats0.getNNodesSelected();
      assertEquals((-1L), long0);
  }

  @Test
  public void test024()  throws Throwable  {
      EnvironmentStats environmentStats0 = new EnvironmentStats();
      environmentStats0.setNNodesScanned((-2447));
      long long0 = environmentStats0.getNNodesScanned();
      assertEquals((-2447L), long0);
  }

  @Test
  public void test025()  throws Throwable  {
      EnvironmentStats environmentStats0 = new EnvironmentStats();
      environmentStats0.setNNodesExplicitlyEvicted(4505L);
      long long0 = environmentStats0.getNNodesExplicitlyEvicted();
      assertEquals(4505L, long0);
  }

  @Test
  public void test026()  throws Throwable  {
      EnvironmentStats environmentStats0 = new EnvironmentStats();
      assertEquals(0L, environmentStats0.getNNodesExplicitlyEvicted());
      
      environmentStats0.setNNodesExplicitlyEvicted((-1));
      long long0 = environmentStats0.getNNodesExplicitlyEvicted();
      assertEquals((-1L), long0);
  }

  @Test
  public void test027()  throws Throwable  {
      EnvironmentStats environmentStats0 = new EnvironmentStats();
      environmentStats0.setNMarkedLNsProcessed(4919);
      int int0 = environmentStats0.getNMarkedLNsProcessed();
      assertEquals(4919, int0);
  }

  @Test
  public void test028()  throws Throwable  {
      EnvironmentStats environmentStats0 = new EnvironmentStats();
      environmentStats0.setNMarkedLNsProcessed((-467));
      int int0 = environmentStats0.getNMarkedLNsProcessed();
      assertEquals((-467), int0);
  }

  @Test
  public void test029()  throws Throwable  {
      EnvironmentStats environmentStats0 = new EnvironmentStats();
      environmentStats0.setNLogBuffers(2108);
      int int0 = environmentStats0.getNLogBuffers();
      assertEquals(2108, int0);
  }

  @Test
  public void test030()  throws Throwable  {
      EnvironmentStats environmentStats0 = new EnvironmentStats();
      environmentStats0.setNLogBuffers((-3188));
      int int0 = environmentStats0.getNLogBuffers();
      assertEquals((-3188), int0);
  }

  @Test
  public void test031()  throws Throwable  {
      EnvironmentStats environmentStats0 = new EnvironmentStats();
      environmentStats0.setNLNsObsolete(32);
      int int0 = environmentStats0.getNLNsObsolete();
      assertEquals(32, int0);
  }

  @Test
  public void test032()  throws Throwable  {
      EnvironmentStats environmentStats0 = new EnvironmentStats();
      environmentStats0.setNLNsObsolete((-1));
      int int0 = environmentStats0.getNLNsObsolete();
      assertEquals((-1), int0);
  }

  @Test
  public void test033()  throws Throwable  {
      EnvironmentStats environmentStats0 = new EnvironmentStats();
      environmentStats0.setNLNsMigrated(830);
      int int0 = environmentStats0.getNLNsMigrated();
      assertEquals(830, int0);
  }

  @Test
  public void test034()  throws Throwable  {
      EnvironmentStats environmentStats0 = new EnvironmentStats();
      environmentStats0.setNLNsMigrated((-2197));
      int int0 = environmentStats0.getNLNsMigrated();
      assertEquals((-2197), int0);
  }


  @Test
  public void test036()  throws Throwable  {
      EnvironmentStats environmentStats0 = new EnvironmentStats();
      environmentStats0.setNLNsMarked((-228));
      int int0 = environmentStats0.getNLNsMarked();
      assertEquals((-228), int0);
  }

  @Test
  public void test037()  throws Throwable  {
      EnvironmentStats environmentStats0 = new EnvironmentStats();
      environmentStats0.setNLNsLocked((-1276));
      int int0 = environmentStats0.getNLNsLocked();
      assertEquals((-1276), int0);
  }

  @Test
  public void test038()  throws Throwable  {
      EnvironmentStats environmentStats0 = new EnvironmentStats();
      environmentStats0.setNLNsDead(1638);
      int int0 = environmentStats0.getNLNsDead();
      assertEquals(1638, int0);
  }

  @Test
  public void test039()  throws Throwable  {
      EnvironmentStats environmentStats0 = new EnvironmentStats();
      environmentStats0.setNLNsDead((-5383));
      int int0 = environmentStats0.getNLNsDead();
      assertEquals((-5383), int0);
  }

  @Test
  public void test040()  throws Throwable  {
      EnvironmentStats environmentStats0 = new EnvironmentStats();
      environmentStats0.setNLNsCleaned(1);
      int int0 = environmentStats0.getNLNsCleaned();
      assertEquals(1, int0);
  }

  @Test
  public void test041()  throws Throwable  {
      EnvironmentStats environmentStats0 = new EnvironmentStats();
      environmentStats0.setNLNsCleaned((-211));
      int int0 = environmentStats0.getNLNsCleaned();
      assertEquals((-211), int0);
  }

  @Test
  public void test042()  throws Throwable  {
      EnvironmentStats environmentStats0 = new EnvironmentStats();
      environmentStats0.setNLNQueueHits(1031);
      int int0 = environmentStats0.getNLNQueueHits();
      assertEquals(1031, int0);
  }

  @Test
  public void test043()  throws Throwable  {
      EnvironmentStats environmentStats0 = new EnvironmentStats();
      environmentStats0.setNLNQueueHits((-1562));
      int int0 = environmentStats0.getNLNQueueHits();
      assertEquals((-1562), int0);
  }

  @Test
  public void test044()  throws Throwable  {
      EnvironmentStats environmentStats0 = new EnvironmentStats();
      environmentStats0.setNINsObsolete(10);
      int int0 = environmentStats0.getNINsObsolete();
      assertEquals(10, int0);
  }

  @Test
  public void test045()  throws Throwable  {
      EnvironmentStats environmentStats0 = new EnvironmentStats();
      environmentStats0.setNINsObsolete((-1));
      int int0 = environmentStats0.getNINsObsolete();
      assertEquals((-1), int0);
  }

  @Test
  public void test046()  throws Throwable  {
      EnvironmentStats environmentStats0 = new EnvironmentStats();
      environmentStats0.setNINsMigrated(642);
      int int0 = environmentStats0.getNINsMigrated();
      assertEquals(642, int0);
  }

  @Test
  public void test047()  throws Throwable  {
      EnvironmentStats environmentStats0 = new EnvironmentStats();
      environmentStats0.setNINsMigrated((-1));
      int int0 = environmentStats0.getNINsMigrated();
      assertEquals((-1), int0);
  }

  @Test
  public void test048()  throws Throwable  {
      EnvironmentStats environmentStats0 = new EnvironmentStats();
      environmentStats0.setNINsDead(1803);
      int int0 = environmentStats0.getNINsDead();
      assertEquals(1803, int0);
  }

  @Test
  public void test049()  throws Throwable  {
      EnvironmentStats environmentStats0 = new EnvironmentStats();
      environmentStats0.setNINsDead((-443));
      int int0 = environmentStats0.getNINsDead();
      assertEquals((-443), int0);
  }

  @Test
  public void test050()  throws Throwable  {
      EnvironmentStats environmentStats0 = new EnvironmentStats();
      environmentStats0.setNINsCleaned(10);
      int int0 = environmentStats0.getNINsCleaned();
      assertEquals(10, int0);
  }

  @Test
  public void test051()  throws Throwable  {
      EnvironmentStats environmentStats0 = new EnvironmentStats();
      environmentStats0.setNINsCleaned((-3664));
      int int0 = environmentStats0.getNINsCleaned();
      assertEquals((-3664), int0);
  }

  @Test
  public void test052()  throws Throwable  {
      EnvironmentStats environmentStats0 = new EnvironmentStats();
      environmentStats0.setNFullINFlush(2440);
      int int0 = environmentStats0.getNFullINFlush();
      assertEquals(2440, int0);
  }

  @Test
  public void test053()  throws Throwable  {
      EnvironmentStats environmentStats0 = new EnvironmentStats();
      environmentStats0.setNFullINFlush((-1274));
      int int0 = environmentStats0.getNFullINFlush();
      assertEquals((-1274), int0);
  }

  @Test
  public void test054()  throws Throwable  {
      EnvironmentStats environmentStats0 = new EnvironmentStats();
      environmentStats0.setNFullBINFlush(32);
      int int0 = environmentStats0.getNFullBINFlush();
      assertEquals(32, int0);
  }

  @Test
  public void test055()  throws Throwable  {
      EnvironmentStats environmentStats0 = new EnvironmentStats();
      environmentStats0.setNFullBINFlush((-1296));
      int int0 = environmentStats0.getNFullBINFlush();
      assertEquals((-1296), int0);
  }

  @Test
  public void test062()  throws Throwable  {
      EnvironmentStats environmentStats0 = new EnvironmentStats();
      environmentStats0.setNEvictPasses(45);
      int int0 = environmentStats0.getNEvictPasses();
      assertEquals(45, int0);
  }

  @Test
  public void test063()  throws Throwable  {
      EnvironmentStats environmentStats0 = new EnvironmentStats();
      environmentStats0.setNEvictPasses((-158));
      int int0 = environmentStats0.getNEvictPasses();
      assertEquals((-158), int0);
  }

  @Test
  public void test064()  throws Throwable  {
      EnvironmentStats environmentStats0 = new EnvironmentStats();
      environmentStats0.setNDeltaINFlush(188);
      int int0 = environmentStats0.getNDeltaINFlush();
      assertEquals(188, int0);
  }

  @Test
  public void test065()  throws Throwable  {
      EnvironmentStats environmentStats0 = new EnvironmentStats();
      environmentStats0.setNDeltaINFlush((-635));
      int int0 = environmentStats0.getNDeltaINFlush();
      assertEquals((-635), int0);
  }

  @Test
  public void test066()  throws Throwable  {
      EnvironmentStats environmentStats0 = new EnvironmentStats();
      environmentStats0.setNClusterLNsProcessed(2112);
      int int0 = environmentStats0.getNClusterLNsProcessed();
      assertEquals(2112, int0);
  }

  @Test
  public void test067()  throws Throwable  {
      EnvironmentStats environmentStats0 = new EnvironmentStats();
      environmentStats0.setNClusterLNsProcessed((-35));
      int int0 = environmentStats0.getNClusterLNsProcessed();
      assertEquals((-35), int0);
  }


  @Test
  public void test069()  throws Throwable  {
      EnvironmentStats environmentStats0 = new EnvironmentStats();
      environmentStats0.setNCleanerRuns((-560));
      int int0 = environmentStats0.getNCleanerRuns();
      assertEquals((-560), int0);
  }

  @Test
  public void test070()  throws Throwable  {
      EnvironmentStats environmentStats0 = new EnvironmentStats();
      environmentStats0.setNCleanerEntriesRead(1);
      int int0 = environmentStats0.getNCleanerEntriesRead();
      assertEquals(1, int0);
  }

  @Test
  public void test071()  throws Throwable  {
      EnvironmentStats environmentStats0 = new EnvironmentStats();
      environmentStats0.setNCleanerEntriesRead((-3590));
      int int0 = environmentStats0.getNCleanerEntriesRead();
      assertEquals((-3590), int0);
  }

  @Test
  public void test072()  throws Throwable  {
      EnvironmentStats environmentStats0 = new EnvironmentStats();
      environmentStats0.setNCleanerDeletions(1598);
      int int0 = environmentStats0.getNCleanerDeletions();
      assertEquals(1598, int0);
  }

  @Test
  public void test073()  throws Throwable  {
      EnvironmentStats environmentStats0 = new EnvironmentStats();
      environmentStats0.setNCleanerDeletions((-1714));
      int int0 = environmentStats0.getNCleanerDeletions();
      assertEquals((-1714), int0);
  }

  @Test
  public void test074()  throws Throwable  {
      EnvironmentStats environmentStats0 = new EnvironmentStats();
      environmentStats0.setNCheckpoints(1042);
      int int0 = environmentStats0.getNCheckpoints();
      assertEquals(1042, int0);
  }

  @Test
  public void test075()  throws Throwable  {
      EnvironmentStats environmentStats0 = new EnvironmentStats();
      environmentStats0.setNCheckpoints((-635));
      int int0 = environmentStats0.getNCheckpoints();
      assertEquals((-635), int0);
  }

  @Test
  public void test076()  throws Throwable  {
      EnvironmentStats environmentStats0 = new EnvironmentStats();
      environmentStats0.setNCacheMiss(1);
      long long0 = environmentStats0.getNCacheMiss();
      assertEquals(1L, long0);
  }

  @Test
  public void test077()  throws Throwable  {
      EnvironmentStats environmentStats0 = new EnvironmentStats();
      environmentStats0.setNCacheMiss((-1));
      long long0 = environmentStats0.getNCacheMiss();
      assertEquals((-1L), long0);
  }

  @Test
  public void test078()  throws Throwable  {
      EnvironmentStats environmentStats0 = new EnvironmentStats();
      environmentStats0.setNBINsStripped(2440);
      long long0 = environmentStats0.getNBINsStripped();
      assertEquals(2440L, long0);
  }

  @Test
  public void test079()  throws Throwable  {
      EnvironmentStats environmentStats0 = new EnvironmentStats();
      environmentStats0.setNBINsStripped((-936L));
      long long0 = environmentStats0.getNBINsStripped();
      assertEquals((-936L), long0);
  }

  @Test
  public void test080()  throws Throwable  {
      EnvironmentStats environmentStats0 = new EnvironmentStats();
      assertEquals((-1L), environmentStats0.getLastCheckpointStart());
      
      environmentStats0.setLastCheckpointStart(0);
      environmentStats0.getLastCheckpointStart();
      assertEquals(0, environmentStats0.getNEvictPasses());
  }

  @Test
  public void test081()  throws Throwable  {
      EnvironmentStats environmentStats0 = new EnvironmentStats();
      environmentStats0.setLastCheckpointStart(400L);
      long long0 = environmentStats0.getLastCheckpointStart();
      assertEquals(400L, long0);
  }

  @Test
  public void test082()  throws Throwable  {
      EnvironmentStats environmentStats0 = new EnvironmentStats();
      environmentStats0.setLastCheckpointId(1628L);
      long long0 = environmentStats0.getLastCheckpointId();
      assertEquals(1628L, long0);
  }

  @Test
  public void test083()  throws Throwable  {
      EnvironmentStats environmentStats0 = new EnvironmentStats();
      assertEquals((-1L), environmentStats0.getLastCheckpointEnd());
      
      environmentStats0.setLastCheckpointEnd(0L);
      environmentStats0.getLastCheckpointEnd();
      assertEquals(0L, environmentStats0.getRequiredEvictBytes());
  }

  @Test
  public void test084()  throws Throwable  {
      EnvironmentStats environmentStats0 = new EnvironmentStats();
      environmentStats0.setLastCheckpointEnd(2528L);
      long long0 = environmentStats0.getLastCheckpointEnd();
      assertEquals(2528L, long0);
  }

  @Test
  public void test085()  throws Throwable  {
      EnvironmentStats environmentStats0 = new EnvironmentStats();
      environmentStats0.setInCompQueueSize(3148);
      int int0 = environmentStats0.getInCompQueueSize();
      assertEquals(3148, int0);
  }

  @Test
  public void test086()  throws Throwable  {
      EnvironmentStats environmentStats0 = new EnvironmentStats();
      environmentStats0.setInCompQueueSize((-3691));
      int int0 = environmentStats0.getInCompQueueSize();
      assertEquals((-3691), int0);
  }

  @Test
  public void test087()  throws Throwable  {
      EnvironmentStats environmentStats0 = new EnvironmentStats();
      environmentStats0.setDbClosedBins(705);
      int int0 = environmentStats0.getDbClosedBins();
      assertEquals(705, int0);
  }

  @Test
  public void test088()  throws Throwable  {
      EnvironmentStats environmentStats0 = new EnvironmentStats();
      environmentStats0.setDbClosedBins((-1));
      int int0 = environmentStats0.getDbClosedBins();
      assertEquals((-1), int0);
  }

  @Test
  public void test089()  throws Throwable  {
      EnvironmentStats environmentStats0 = new EnvironmentStats();
      environmentStats0.setCursorsBins(1107);
      int int0 = environmentStats0.getCursorsBins();
      assertEquals(1107, int0);
  }

  @Test
  public void test090()  throws Throwable  {
      EnvironmentStats environmentStats0 = new EnvironmentStats();
      environmentStats0.setCleanerBacklog(2996);
      int int0 = environmentStats0.getCleanerBacklog();
      assertEquals(2996, int0);
  }

  @Test
  public void test091()  throws Throwable  {
      EnvironmentStats environmentStats0 = new EnvironmentStats();
      environmentStats0.setCleanerBacklog((-571));
      int int0 = environmentStats0.getCleanerBacklog();
      assertEquals((-571), int0);
  }

  @Test
  public void test092()  throws Throwable  {
      EnvironmentStats environmentStats0 = new EnvironmentStats();
      environmentStats0.setBufferBytes(1057L);
      long long0 = environmentStats0.getCacheTotalBytes();
      assertEquals(1057L, environmentStats0.getBufferBytes());
      assertEquals(1057L, long0);
  }

  @Test
  public void test093()  throws Throwable  {
      EnvironmentStats environmentStats0 = new EnvironmentStats();
      environmentStats0.setCacheDataBytes(1L);
      long long0 = environmentStats0.getCacheDataBytes();
      assertEquals(1L, environmentStats0.getCacheTotalBytes());
      assertEquals(1L, long0);
  }

  @Test
  public void test094()  throws Throwable  {
      EnvironmentStats environmentStats0 = new EnvironmentStats();
      environmentStats0.setCacheDataBytes((-1569L));
      long long0 = environmentStats0.getCacheDataBytes();
      assertEquals((-1569L), environmentStats0.getCacheTotalBytes());
      assertEquals((-1569L), long0);
  }

  @Test
  public void test095()  throws Throwable  {
      EnvironmentStats environmentStats0 = new EnvironmentStats();
      environmentStats0.setBufferBytes(1549L);
      long long0 = environmentStats0.getBufferBytes();
      assertEquals(1549L, long0);
  }

  @Test
  public void test096()  throws Throwable  {
      EnvironmentStats environmentStats0 = new EnvironmentStats();
      environmentStats0.setBufferBytes((-1245));
      long long0 = environmentStats0.getBufferBytes();
      assertEquals((-1245L), environmentStats0.getCacheTotalBytes());
      assertEquals((-1245L), long0);
  }

  @Test
  public void test097()  throws Throwable  {
      EnvironmentStats environmentStats0 = new EnvironmentStats();
      environmentStats0.setBufferBytes((-1));
      long long0 = environmentStats0.getCacheTotalBytes();
      assertEquals((-1L), environmentStats0.getBufferBytes());
      assertEquals((-1L), long0);
  }

  @Test
  public void test105()  throws Throwable  {
      EnvironmentStats environmentStats0 = new EnvironmentStats();
      environmentStats0.setLastCheckpointId((-2615L));
      long long0 = environmentStats0.getLastCheckpointId();
      assertEquals((-2615L), long0);
  }

  @Test
  public void test117()  throws Throwable  {
      EnvironmentStats environmentStats0 = new EnvironmentStats();
      environmentStats0.setNLNsLocked(792);
      int int0 = environmentStats0.getNLNsLocked();
      assertEquals(792, int0);
  }

  @Test
  public void test132()  throws Throwable  {
      EnvironmentStats environmentStats0 = new EnvironmentStats();
      environmentStats0.setCursorsBins((-1));
      int int0 = environmentStats0.getCursorsBins();
      assertEquals((-1), int0);
  }

  @Test
  public void test143()  throws Throwable  {
      EnvironmentStats environmentStats0 = new EnvironmentStats();
      environmentStats0.setNNodesScanned(3552);
      long long0 = environmentStats0.getNNodesScanned();
      assertEquals(3552L, long0);
  }

  
}
