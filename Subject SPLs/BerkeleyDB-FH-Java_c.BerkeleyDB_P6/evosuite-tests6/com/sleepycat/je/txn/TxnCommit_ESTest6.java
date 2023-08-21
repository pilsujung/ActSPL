/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 02:38:16 KST 2017
 */

package com.sleepycat.je.txn;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.sleepycat.je.log.LogEntryType;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class TxnCommit_ESTest6 extends TxnCommit_ESTest_scaffolding6 {

  @Test
  public void test0()  throws Throwable  {
      TxnCommit txnCommit0 = new TxnCommit();
      assertEquals(0L, txnCommit0.getId());
  }

  @Test
  public void test1()  throws Throwable  {
      TxnCommit txnCommit0 = new TxnCommit(0L, 0L);
      String string0 = txnCommit0.getTagName();
      assertEquals("TxnCommit", string0);
  }

  @Test
  public void test2()  throws Throwable  {
      TxnCommit txnCommit0 = new TxnCommit(0L, 0L);
      LogEntryType logEntryType0 = txnCommit0.getLogType();
      assertFalse(logEntryType0.isNodeType());
  }
}