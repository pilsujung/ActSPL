/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 00:52:48 KST 2017
 */

package com.sleepycat.je.latch;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.sleepycat.je.dbi.EnvironmentImpl;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class SharedLatch_ESTest6 extends SharedLatch_ESTest_scaffolding6 {

  @Test
  public void test0()  throws Throwable  {
      Java5SharedLatchImpl java5SharedLatchImpl0 = new Java5SharedLatchImpl();
      boolean boolean0 = java5SharedLatchImpl0.acquireExclusiveNoWait();
      assertTrue(boolean0);
  }

  @Test
  public void test1()  throws Throwable  {
      SharedLatchImpl sharedLatchImpl0 = new SharedLatchImpl("", (EnvironmentImpl) null);
      sharedLatchImpl0.setNoteLatch(false);
      assertFalse(sharedLatchImpl0.isWriteLockedByCurrentThread());
  }

  @Test
  public void test2()  throws Throwable  {
      Java5SharedLatchImpl java5SharedLatchImpl0 = new Java5SharedLatchImpl();
      java5SharedLatchImpl0.setName("");
  }

  @Test
  public void test3()  throws Throwable  {
      SharedLatchImpl sharedLatchImpl0 = new SharedLatchImpl("", (EnvironmentImpl) null);
      sharedLatchImpl0.release();
      assertFalse(sharedLatchImpl0.isWriteLockedByCurrentThread());
  }

  @Test
  public void test4()  throws Throwable  {
      SharedLatchImpl sharedLatchImpl0 = new SharedLatchImpl((String) null, (EnvironmentImpl) null);
      boolean boolean0 = sharedLatchImpl0.isWriteLockedByCurrentThread();
      assertFalse(boolean0);
  }

  @Test
  public void test5()  throws Throwable  {
      Java5SharedLatchImpl java5SharedLatchImpl0 = new Java5SharedLatchImpl();
      java5SharedLatchImpl0.acquireShared();
  }

  @Test
  public void test6()  throws Throwable  {
      SharedLatchImpl sharedLatchImpl0 = new SharedLatchImpl("", (EnvironmentImpl) null);
      sharedLatchImpl0.acquireExclusive();
      assertTrue(sharedLatchImpl0.isWriteLockedByCurrentThread());
  }

  @Test
  public void test7()  throws Throwable  {
      Java5SharedLatchImpl java5SharedLatchImpl0 = new Java5SharedLatchImpl();
      java5SharedLatchImpl0.acquireExclusive();
      try { 
        java5SharedLatchImpl0.acquireExclusiveNoWait();
        fail("Expecting exception: LatchException");
      
      } catch(LatchException e) {
         //
         // null already held
         //
         assertThrownBy("com.sleepycat.je.latch.Java5SharedLatchImpl", e);
      }
  }
}
