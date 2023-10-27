/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 03:06:27 KST 2017
 */

package com.sleepycat.je.latch;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.sleepycat.je.dbi.EnvironmentImpl;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class Latch_ESTest8 extends Latch_ESTest_scaffolding8 {

  @Test
  public void test00()  throws Throwable  {
      Java5LatchImpl java5LatchImpl0 = new Java5LatchImpl();
      java5LatchImpl0.acquireNoWait();
      java5LatchImpl0.release();
  }

  @Test
  public void test01()  throws Throwable  {
      LatchImpl latchImpl0 = new LatchImpl((EnvironmentImpl) null);
      boolean boolean0 = latchImpl0.acquireNoWait();
      assertTrue(boolean0);
  }

  @Test
  public void test02()  throws Throwable  {
      LatchImpl latchImpl0 = new LatchImpl((EnvironmentImpl) null);
      latchImpl0.acquire();
      assertEquals(0, latchImpl0.nWaiters());
  }

  @Test
  public void test03()  throws Throwable  {
      LatchImpl latchImpl0 = new LatchImpl((String) null, (EnvironmentImpl) null);
      String string0 = latchImpl0.toString();
      assertEquals("<LATCH [owner: null]>", string0);
  }

  @Test
  public void test04()  throws Throwable  {
      Java5LatchImpl java5LatchImpl0 = new Java5LatchImpl();
      java5LatchImpl0.setName((String) null);
  }

  @Test
  public void test05()  throws Throwable  {
      LatchImpl latchImpl0 = new LatchImpl((EnvironmentImpl) null);
      latchImpl0.releaseIfOwner();
      assertFalse(latchImpl0.isOwner());
  }



  @Test
  public void test08()  throws Throwable  {
      LatchImpl latchImpl0 = new LatchImpl((EnvironmentImpl) null);
      boolean boolean0 = latchImpl0.isOwner();
      assertFalse(boolean0);
  }


  @Test
  public void test10()  throws Throwable  {
      Java5LatchImpl java5LatchImpl0 = new Java5LatchImpl();
      java5LatchImpl0.acquireNoWait();
      try { 
        java5LatchImpl0.acquireNoWait();
        fail("Expecting exception: LatchException");
      
      } catch(LatchException e) {
         //
         // null already held
         //
         assertThrownBy("com.sleepycat.je.latch.Java5LatchImpl", e);
      }
  }

}