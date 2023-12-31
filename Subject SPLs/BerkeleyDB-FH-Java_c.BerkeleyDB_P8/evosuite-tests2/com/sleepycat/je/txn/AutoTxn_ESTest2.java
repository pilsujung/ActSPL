/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 02:07:41 KST 2017
 */

package com.sleepycat.je.txn;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.fail;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.sleepycat.je.TransactionConfig;
import com.sleepycat.je.dbi.EnvironmentImpl;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class AutoTxn_ESTest2 extends AutoTxn_ESTest_scaffolding2 {

  @Test
  public void test0()  throws Throwable  {
      TransactionConfig transactionConfig0 = TransactionConfig.DEFAULT;
      AutoTxn autoTxn0 = null;
      try {
        autoTxn0 = new AutoTxn((EnvironmentImpl) null, transactionConfig0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.txn.Locker", e);
      }
  }
}
