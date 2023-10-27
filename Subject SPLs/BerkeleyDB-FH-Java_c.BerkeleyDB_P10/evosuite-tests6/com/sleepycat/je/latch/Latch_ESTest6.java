/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 00:47:56 KST 2017
 */

package com.sleepycat.je.latch;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.sleepycat.je.dbi.EnvironmentImpl;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class Latch_ESTest6 extends Latch_ESTest_scaffolding6 {

  @Test
  public void test00()  throws Throwable  {
      LatchImpl latchImpl0 = new LatchImpl((EnvironmentImpl) null);
      latchImpl0.acquire();
      latchImpl0.release();
      assertFalse(latchImpl0.isOwner());
  }

  @Test
  public void test01()  throws Throwable  {
      Java5LatchImpl java5LatchImpl0 = new Java5LatchImpl();
      boolean boolean0 = java5LatchImpl0.acquireNoWait();
      assertTrue(boolean0);
  }

  @Test
  public void test02()  throws Throwable  {
      Java5LatchImpl java5LatchImpl0 = new Java5LatchImpl();
      java5LatchImpl0.acquire();
  }

  @Test
  public void test03()  throws Throwable  {
      Java5LatchImpl java5LatchImpl0 = new Java5LatchImpl();
      String string0 = java5LatchImpl0.toString();
      assertNotNull(string0);
  }

  @Test
  public void test04()  throws Throwable  {
      Java5LatchImpl java5LatchImpl0 = new Java5LatchImpl();
      java5LatchImpl0.setName("M5-Tkd#Gm96dlB@f");
  }

  @Test
  public void test05()  throws Throwable  {
      Java5LatchImpl java5LatchImpl0 = new Java5LatchImpl();
      java5LatchImpl0.releaseIfOwner();
  }

  @Test
  public void test06()  throws Throwable  {
      LatchImpl latchImpl0 = new LatchImpl((EnvironmentImpl) null);
      Thread thread0 = latchImpl0.owner();
      assertNull(thread0);
  }

  @Test
  public void test07()  throws Throwable  {
      Java5LatchImpl java5LatchImpl0 = new Java5LatchImpl();
      int int0 = java5LatchImpl0.nWaiters();
      assertEquals(0, int0);
  }

  @Test
  public void test08()  throws Throwable  {
      Java5LatchImpl java5LatchImpl0 = new Java5LatchImpl();
      boolean boolean0 = java5LatchImpl0.isOwner();
      assertFalse(boolean0);
  }

  @Test
  public void test09()  throws Throwable  {
      LatchImpl latchImpl0 = new LatchImpl((EnvironmentImpl) null);
      LatchStats latchStats0 = latchImpl0.getLatchStats();
      assertEquals(0, latchStats0.nReleases);
  }

  @Test
  public void test10()  throws Throwable  {
      Java5LatchImpl java5LatchImpl0 = new Java5LatchImpl();
      try { 
        java5LatchImpl0.release();
        fail("Expecting exception: LatchNotHeldException");
      
      } catch(LatchNotHeldException e) {
         //
         // null not held
         //
         assertThrownBy("com.sleepycat.je.latch.Java5LatchImpl", e);
      }
  }

  @Test
  public void test11()  throws Throwable  {
      Java5LatchImpl java5LatchImpl0 = new Java5LatchImpl();
      java5LatchImpl0.acquire();
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

  @Test
  public void test12()  throws Throwable  {
      Java5LatchImpl java5LatchImpl0 = new Java5LatchImpl();
      java5LatchImpl0.acquire();
      try { 
        java5LatchImpl0.acquire();
        fail("Expecting exception: LatchException");
      
      } catch(LatchException e) {
         //
         // null already held
         //
         assertThrownBy("com.sleepycat.je.latch.Java5LatchImpl", e);
      }
  }
}