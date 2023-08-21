/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 21 21:58:13 KST 2017
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
public class TxnCommit_ESTest7 extends TxnCommit_ESTest_scaffolding7 {

  @Test
  public void test0()  throws Throwable  {
      TxnCommit txnCommit0 = new TxnCommit();
      String string0 = txnCommit0.getTagName();
      assertEquals("TxnCommit", string0);
  }

  @Test
  public void test1()  throws Throwable  {
      TxnCommit txnCommit0 = new TxnCommit();
      LogEntryType logEntryType0 = txnCommit0.getLogType();
      assertFalse(logEntryType0.isNodeType());
  }

  @Test
  public void test2()  throws Throwable  {
      TxnCommit txnCommit0 = new TxnCommit((-52L), (-52L));
      assertEquals((-52L), txnCommit0.getId());
  }
}
