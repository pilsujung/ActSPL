/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 01:24:13 KST 2017
 */

package com.sleepycat.je.recovery;

import static org.junit.Assert.assertEquals;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class RecoveryInfo_ESTest2 extends RecoveryInfo_ESTest_scaffolding2 {

  @Test
  public void test00()  throws Throwable  {
      RecoveryInfo recoveryInfo0 = new RecoveryInfo();
      recoveryInfo0.nRepeatIteratorReads = 664;
      String string0 = recoveryInfo0.toString();
      assertEquals("Recovery Info ckptEnd=<null> useMaxNodeId=0 useMaxDbId=0 useMaxTxnId=0 numMapINs=0 numOtherINs=0 numBinDeltas=0 numDuplicateINs=0 lnFound=0 lnNotFound=0 lnInserted=0 lnReplaced=0 nRepeatIteratorReads=664", string0);
      assertEquals((-1L), recoveryInfo0.partialCheckpointStartLsn);
  }

  @Test
  public void test01()  throws Throwable  {
      RecoveryInfo recoveryInfo0 = new RecoveryInfo();
      recoveryInfo0.lnReplaced = 1117;
      String string0 = recoveryInfo0.toString();
      assertEquals("Recovery Info ckptEnd=<null> useMaxNodeId=0 useMaxDbId=0 useMaxTxnId=0 numMapINs=0 numOtherINs=0 numBinDeltas=0 numDuplicateINs=0 lnFound=0 lnNotFound=0 lnInserted=0 lnReplaced=1117 nRepeatIteratorReads=0", string0);
      assertEquals((-1L), recoveryInfo0.partialCheckpointStartLsn);
  }

  @Test
  public void test02()  throws Throwable  {
      RecoveryInfo recoveryInfo0 = new RecoveryInfo();
      recoveryInfo0.lnFound = 1599;
      String string0 = recoveryInfo0.toString();
      assertEquals("Recovery Info ckptEnd=<null> useMaxNodeId=0 useMaxDbId=0 useMaxTxnId=0 numMapINs=0 numOtherINs=0 numBinDeltas=0 numDuplicateINs=0 lnFound=1599 lnNotFound=0 lnInserted=0 lnReplaced=0 nRepeatIteratorReads=0", string0);
      assertEquals((-1L), recoveryInfo0.partialCheckpointStartLsn);
  }

  @Test
  public void test03()  throws Throwable  {
      RecoveryInfo recoveryInfo0 = new RecoveryInfo();
      recoveryInfo0.lnNotFound = (-1);
      String string0 = recoveryInfo0.toString();
      assertEquals((-1L), recoveryInfo0.partialCheckpointStartLsn);
      assertEquals("Recovery Info ckptEnd=<null> useMaxNodeId=0 useMaxDbId=0 useMaxTxnId=0 numMapINs=0 numOtherINs=0 numBinDeltas=0 numDuplicateINs=0 lnFound=0 lnNotFound=-1 lnInserted=0 lnReplaced=0 nRepeatIteratorReads=0", string0);
  }

  @Test
  public void test04()  throws Throwable  {
      RecoveryInfo recoveryInfo0 = new RecoveryInfo();
      recoveryInfo0.lnInserted = 9;
      String string0 = recoveryInfo0.toString();
      assertEquals((-1L), recoveryInfo0.partialCheckpointStartLsn);
      assertEquals("Recovery Info ckptEnd=<null> useMaxNodeId=0 useMaxDbId=0 useMaxTxnId=0 numMapINs=0 numOtherINs=0 numBinDeltas=0 numDuplicateINs=0 lnFound=0 lnNotFound=0 lnInserted=9 lnReplaced=0 nRepeatIteratorReads=0", string0);
  }

  @Test
  public void test05()  throws Throwable  {
      RecoveryInfo recoveryInfo0 = new RecoveryInfo();
      recoveryInfo0.numOtherINs = 0;
      recoveryInfo0.numOtherINs = 1599;
      String string0 = recoveryInfo0.toString();
      assertEquals((-1L), recoveryInfo0.partialCheckpointStartLsn);
      assertEquals("Recovery Info ckptEnd=<null> useMaxNodeId=0 useMaxDbId=0 useMaxTxnId=0 numMapINs=0 numOtherINs=1599 numBinDeltas=0 numDuplicateINs=0 lnFound=0 lnNotFound=0 lnInserted=0 lnReplaced=0 nRepeatIteratorReads=0", string0);
  }

  @Test
  public void test06()  throws Throwable  {
      RecoveryInfo recoveryInfo0 = new RecoveryInfo();
      recoveryInfo0.numMapINs = 3281;
      String string0 = recoveryInfo0.toString();
      assertEquals((-1L), recoveryInfo0.partialCheckpointStartLsn);
      assertEquals("Recovery Info ckptEnd=<null> useMaxNodeId=0 useMaxDbId=0 useMaxTxnId=0 numMapINs=3281 numOtherINs=0 numBinDeltas=0 numDuplicateINs=0 lnFound=0 lnNotFound=0 lnInserted=0 lnReplaced=0 nRepeatIteratorReads=0", string0);
  }

  @Test
  public void test07()  throws Throwable  {
      RecoveryInfo recoveryInfo0 = new RecoveryInfo();
      recoveryInfo0.useMaxNodeId = 1425L;
      String string0 = recoveryInfo0.toString();
      assertEquals("Recovery Info ckptEnd=<null> useMaxNodeId=1425 useMaxDbId=0 useMaxTxnId=0 numMapINs=0 numOtherINs=0 numBinDeltas=0 numDuplicateINs=0 lnFound=0 lnNotFound=0 lnInserted=0 lnReplaced=0 nRepeatIteratorReads=0", string0);
      assertEquals((-1L), recoveryInfo0.partialCheckpointStartLsn);
  }

  @Test
  public void test08()  throws Throwable  {
      RecoveryInfo recoveryInfo0 = new RecoveryInfo();
      assertEquals((-1L), recoveryInfo0.useRootLsn);
      
      recoveryInfo0.useRootLsn = 1823L;
      String string0 = recoveryInfo0.toString();
      assertEquals("Recovery Info useRoot=0x0/0x71f ckptEnd=<null> useMaxNodeId=0 useMaxDbId=0 useMaxTxnId=0 numMapINs=0 numOtherINs=0 numBinDeltas=0 numDuplicateINs=0 lnFound=0 lnNotFound=0 lnInserted=0 lnReplaced=0 nRepeatIteratorReads=0", string0);
  }

  @Test
  public void test09()  throws Throwable  {
      RecoveryInfo recoveryInfo0 = new RecoveryInfo();
      assertEquals((-1L), recoveryInfo0.lastUsedLsn);
      
      recoveryInfo0.lastUsedLsn = (long) 0;
      String string0 = recoveryInfo0.toString();
      assertEquals("Recovery Info lastUsed=0x0/0x0 ckptEnd=<null> useMaxNodeId=0 useMaxDbId=0 useMaxTxnId=0 numMapINs=0 numOtherINs=0 numBinDeltas=0 numDuplicateINs=0 lnFound=0 lnNotFound=0 lnInserted=0 lnReplaced=0 nRepeatIteratorReads=0", string0);
  }

  @Test
  public void test10()  throws Throwable  {
      RecoveryInfo recoveryInfo0 = new RecoveryInfo();
      assertEquals((-1L), recoveryInfo0.checkpointEndLsn);
      
      recoveryInfo0.checkpointEndLsn = (-156L);
      String string0 = recoveryInfo0.toString();
      assertEquals("Recovery Info ckptEnd=0xffffffff/0xffffff64 ckptEnd=<null> useMaxNodeId=0 useMaxDbId=0 useMaxTxnId=0 numMapINs=0 numOtherINs=0 numBinDeltas=0 numDuplicateINs=0 lnFound=0 lnNotFound=0 lnInserted=0 lnReplaced=0 nRepeatIteratorReads=0", string0);
  }

  @Test
  public void test11()  throws Throwable  {
      RecoveryInfo recoveryInfo0 = new RecoveryInfo();
      assertEquals((-1L), recoveryInfo0.checkpointStartLsn);
      
      recoveryInfo0.checkpointStartLsn = (long) 3523;
      String string0 = recoveryInfo0.toString();
      assertEquals("Recovery Info ckptStart=0x0/0xdc3 ckptEnd=<null> useMaxNodeId=0 useMaxDbId=0 useMaxTxnId=0 numMapINs=0 numOtherINs=0 numBinDeltas=0 numDuplicateINs=0 lnFound=0 lnNotFound=0 lnInserted=0 lnReplaced=0 nRepeatIteratorReads=0", string0);
  }

  @Test
  public void test12()  throws Throwable  {
      RecoveryInfo recoveryInfo0 = new RecoveryInfo();
      assertEquals((-1L), recoveryInfo0.nextAvailableLsn);
      
      recoveryInfo0.nextAvailableLsn = (-1204L);
      String string0 = recoveryInfo0.toString();
      assertEquals("Recovery Info nextAvail=0xffffffff/0xfffffb4c ckptEnd=<null> useMaxNodeId=0 useMaxDbId=0 useMaxTxnId=0 numMapINs=0 numOtherINs=0 numBinDeltas=0 numDuplicateINs=0 lnFound=0 lnNotFound=0 lnInserted=0 lnReplaced=0 nRepeatIteratorReads=0", string0);
  }

  @Test
  public void test13()  throws Throwable  {
      RecoveryInfo recoveryInfo0 = new RecoveryInfo();
      assertEquals((-1L), recoveryInfo0.firstActiveLsn);
      
      recoveryInfo0.firstActiveLsn = 0L;
      String string0 = recoveryInfo0.toString();
      assertEquals("Recovery Info firstActive=0x0/0x0 ckptEnd=<null> useMaxNodeId=0 useMaxDbId=0 useMaxTxnId=0 numMapINs=0 numOtherINs=0 numBinDeltas=0 numDuplicateINs=0 lnFound=0 lnNotFound=0 lnInserted=0 lnReplaced=0 nRepeatIteratorReads=0", string0);
  }
}
