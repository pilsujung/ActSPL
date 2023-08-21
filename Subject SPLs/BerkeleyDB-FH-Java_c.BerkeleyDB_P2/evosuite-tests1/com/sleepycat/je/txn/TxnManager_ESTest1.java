/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 21 21:16:02 KST 2017
 */

package com.sleepycat.je.txn;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.sleepycat.je.dbi.EnvironmentImpl;
import com.sleepycat.je.txn.TxnManager;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class TxnManager_ESTest1 extends TxnManager_ESTest_scaffolding1 {

  @Test
  public void test0()  throws Throwable  {
      TxnManager txnManager0 = null;
      try {
        txnManager0 = new TxnManager((EnvironmentImpl) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.txn.TxnManager", e);
      }
  }
}