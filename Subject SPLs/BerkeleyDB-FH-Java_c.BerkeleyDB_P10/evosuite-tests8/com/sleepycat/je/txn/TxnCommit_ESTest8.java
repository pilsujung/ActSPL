/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 10:51:36 KST 2017
 */

package com.sleepycat.je.txn;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.sleepycat.je.log.LogEntryType;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class TxnCommit_ESTest8 extends TxnCommit_ESTest_scaffolding8 {



  @Test
  public void test2()  throws Throwable  {
      TxnCommit txnCommit0 = new TxnCommit((-345L), (-345L));
      assertTrue(txnCommit0.marshallOutsideWriteLatch());
  }
}
