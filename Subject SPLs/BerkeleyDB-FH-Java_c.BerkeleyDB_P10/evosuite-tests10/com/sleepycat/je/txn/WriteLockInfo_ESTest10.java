/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 02:28:47 KST 2017
 */

package com.sleepycat.je.txn;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class WriteLockInfo_ESTest10 extends WriteLockInfo_ESTest_scaffolding10 {



  @Test
  public void test3()  throws Throwable  {
      Lock lock0 = new Lock();
      WriteLockInfo writeLockInfo0 = new WriteLockInfo(lock0);
      boolean boolean0 = writeLockInfo0.getAbortKnownDeleted();
      assertFalse(boolean0);
      assertEquals((-1L), writeLockInfo0.getAbortLsn());
  }

}
