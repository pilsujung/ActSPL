/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 00:54:28 KST 2017
 */

package com.sleepycat.je.latch;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.fail;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.sleepycat.je.dbi.EnvironmentImpl;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class SharedLatchImpl_ESTest6 extends SharedLatchImpl_ESTest_scaffolding6 {

  @Test
  public void test00()  throws Throwable  {
      SharedLatchImpl sharedLatchImpl0 = new SharedLatchImpl("", (EnvironmentImpl) null);
      sharedLatchImpl0.hook433();
  }

  @Test
  public void test01()  throws Throwable  {
      SharedLatchImpl sharedLatchImpl0 = new SharedLatchImpl("", (EnvironmentImpl) null);
      sharedLatchImpl0.hook432();
  }

  @Test
  public void test02()  throws Throwable  {
      SharedLatchImpl sharedLatchImpl0 = new SharedLatchImpl("$VdXNqFJ0? )", (EnvironmentImpl) null);
      sharedLatchImpl0.hook431();
  }

  @Test
  public void test03()  throws Throwable  {
      SharedLatchImpl sharedLatchImpl0 = new SharedLatchImpl("", (EnvironmentImpl) null);
      sharedLatchImpl0.acquireExclusive();
      sharedLatchImpl0.isWriteLockedByCurrentThread();
  }

  @Test
  public void test04()  throws Throwable  {
      SharedLatchImpl sharedLatchImpl0 = new SharedLatchImpl("", (EnvironmentImpl) null);
      sharedLatchImpl0.acquireShared();
      sharedLatchImpl0.isWriteLockedByCurrentThread();
  }

  @Test
  public void test05()  throws Throwable  {
      SharedLatchImpl sharedLatchImpl0 = new SharedLatchImpl("All cursors must use the same environment.", (EnvironmentImpl) null);
      sharedLatchImpl0.isWriteLockedByCurrentThread();
  }

  @Test
  public void test06()  throws Throwable  {
      SharedLatchImpl sharedLatchImpl0 = new SharedLatchImpl("", (EnvironmentImpl) null);
      sharedLatchImpl0.release();
  }

  @Test
  public void test07()  throws Throwable  {
      SharedLatchImpl sharedLatchImpl0 = new SharedLatchImpl((String) null, (EnvironmentImpl) null);
      sharedLatchImpl0.setNoteLatch(true);
      sharedLatchImpl0.acquireShared();
  }

  @Test
  public void test08()  throws Throwable  {
      SharedLatchImpl sharedLatchImpl0 = new SharedLatchImpl("", (EnvironmentImpl) null);
      sharedLatchImpl0.acquireShared();
      sharedLatchImpl0.acquireShared();
  }

  @Test
  public void test09()  throws Throwable  {
      SharedLatchImpl sharedLatchImpl0 = new SharedLatchImpl("EZAITTgb=A.tA0^K", (EnvironmentImpl) null);
      sharedLatchImpl0.acquireExclusive();
      try { 
        sharedLatchImpl0.acquireExclusiveNoWait();
        fail("Expecting exception: LatchException");
      
      } catch(LatchException e) {
         //
         // LatchImpl(EZAITTgb=A.tA0^K) reentrancy/upgrade not allowed
         //
         assertThrownBy("com.sleepycat.je.latch.SharedLatchImpl", e);
      }
  }

  @Test
  public void test10()  throws Throwable  {
      SharedLatchImpl sharedLatchImpl0 = new SharedLatchImpl("", (EnvironmentImpl) null);
      sharedLatchImpl0.setNoteLatch(true);
      sharedLatchImpl0.acquireExclusive();
  }

  @Test
  public void test11()  throws Throwable  {
      SharedLatchImpl sharedLatchImpl0 = new SharedLatchImpl("", (EnvironmentImpl) null);
      sharedLatchImpl0.acquireExclusive();
      sharedLatchImpl0.acquireShared();
      sharedLatchImpl0.release();
  }

  @Test
  public void test13()  throws Throwable  {
      SharedLatchImpl sharedLatchImpl0 = new SharedLatchImpl("All cursors must use the same environment.", (EnvironmentImpl) null);
      sharedLatchImpl0.setNoteLatch(true);
      sharedLatchImpl0.acquireExclusiveNoWait();
  }

  @Test
  public void test14()  throws Throwable  {
      SharedLatchImpl sharedLatchImpl0 = new SharedLatchImpl("$VdXNqFJ0? )", (EnvironmentImpl) null);
      sharedLatchImpl0.acquireExclusiveNoWait();
      try { 
        sharedLatchImpl0.acquireExclusive();
        fail("Expecting exception: LatchException");
      
      } catch(LatchException e) {
         //
         // LatchImpl($VdXNqFJ0? )) reentrancy/upgrade not allowed
         //
         assertThrownBy("com.sleepycat.je.latch.SharedLatchImpl", e);
      }
  }

  @Test
  public void test15()  throws Throwable  {
      SharedLatchImpl sharedLatchImpl0 = new SharedLatchImpl("", (EnvironmentImpl) null);
      sharedLatchImpl0.setName("");
      assertFalse(sharedLatchImpl0.isWriteLockedByCurrentThread());
  }

  @Test
  public void test16()  throws Throwable  {
      SharedLatchImpl sharedLatchImpl0 = new SharedLatchImpl("", (EnvironmentImpl) null);
      sharedLatchImpl0.hook430();
      assertFalse(sharedLatchImpl0.isWriteLockedByCurrentThread());
  }

  @Test
  public void test17()  throws Throwable  {
      SharedLatchImpl sharedLatchImpl0 = new SharedLatchImpl("", (EnvironmentImpl) null);
      sharedLatchImpl0.hook429();
      assertFalse(sharedLatchImpl0.isWriteLockedByCurrentThread());
  }

  @Test
  public void test18()  throws Throwable  {
      SharedLatchImpl sharedLatchImpl0 = new SharedLatchImpl((String) null, (EnvironmentImpl) null);
      sharedLatchImpl0.acquireShared();
      sharedLatchImpl0.release();
      assertFalse(sharedLatchImpl0.isWriteLockedByCurrentThread());
  }
}
