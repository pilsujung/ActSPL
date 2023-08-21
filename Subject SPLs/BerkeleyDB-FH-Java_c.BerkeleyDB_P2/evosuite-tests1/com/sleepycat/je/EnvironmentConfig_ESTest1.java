/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 21 18:38:44 KST 2017
 */

package com.sleepycat.je;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.Properties;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class EnvironmentConfig_ESTest1 extends EnvironmentConfig_ESTest_scaffolding1 {

  @Test
  public void test00()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = EnvironmentConfig.DEFAULT;
      EnvironmentConfig environmentConfig1 = environmentConfig0.cloneConfig();
      environmentConfig1.getTxnReadCommitted();
      environmentConfig1.getTxnTimeout();
      EnvironmentConfig environmentConfig2 = EnvironmentConfig.DEFAULT;
      environmentConfig2.setLoadPropertyFile(true);
      environmentConfig2.setValidateParams(true);
      environmentConfig2.checkImmutablePropsForEquality(environmentConfig0);
      environmentConfig0.setCacheSize((-1709L));
      environmentConfig2.getCreateUP();
      environmentConfig1.getLocking();
      environmentConfig1.getTxnSerializableIsolation();
      environmentConfig1.getLockTimeout();
      environmentConfig1.getCheckpointUP();
      environmentConfig1.setAllowCreate(true);
      assertTrue(environmentConfig1.getAllowCreate());
  }

  @Test
  public void test01()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = new EnvironmentConfig();
      environmentConfig0.getReadOnly();
      assertFalse(environmentConfig0.getAllowCreate());
  }

  @Test
  public void test02()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = EnvironmentConfig.DEFAULT;
      boolean boolean0 = environmentConfig0.getAllowCreate();
      assertFalse(boolean0);
  }

  @Test
  public void test03()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = EnvironmentConfig.DEFAULT;
      EnvironmentConfig environmentConfig1 = environmentConfig0.cloneConfig();
      environmentConfig1.setCreateUP(true);
      assertTrue(environmentConfig1.getLocking());
  }

  @Test
  public void test04()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = EnvironmentConfig.DEFAULT;
      environmentConfig0.setTxnTimeout(46L);
      assertEquals(0L, environmentConfig0.getCacheSize());
  }

  @Test
  public void test05()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = new EnvironmentConfig();
      try { 
        environmentConfig0.setLockTimeout((-1L));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // com.sleepycat.je.config.LongConfigParam: param je.lock.timeout doesn't validate, -1 is less than min of 0
         //
         assertThrownBy("com.sleepycat.je.config.LongConfigParam", e);
      }
  }

  @Test
  public void test06()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = new EnvironmentConfig();
      try { 
        environmentConfig0.setConfigParam("", "3,oDB3!");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         //  is not a valid BDBJE environment configuration
         //
         assertThrownBy("com.sleepycat.je.EnvironmentConfig", e);
      }
  }

  @Test
  public void test07()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = EnvironmentConfig.DEFAULT;
      try { 
        environmentConfig0.setConfigParam("je.maxMemory", "-+b{,g=[0");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // com.sleepycat.je.config.LongConfigParam: -+b{,g=[0 not valid value for je.maxMemory
         //
         assertThrownBy("com.sleepycat.je.config.LongConfigParam", e);
      }
  }

  @Test
  public void test08()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = new EnvironmentConfig();
      environmentConfig0.DEFAULT.setCheckpointUP(false);
      assertFalse(environmentConfig0.getAllowCreate());
  }

  @Test
  public void test09()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = new EnvironmentConfig();
      environmentConfig0.setReadOnly(true);
      assertTrue(environmentConfig0.getReadOnly());
  }

  @Test
  public void test10()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = EnvironmentConfig.DEFAULT;
      boolean boolean0 = environmentConfig0.getReadOnly();
      assertFalse(boolean0);
  }

  @Test
  public void test11()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = EnvironmentConfig.DEFAULT;
      environmentConfig0.setLocking(true);
      assertTrue(environmentConfig0.getLocking());
  }

  @Test
  public void test12()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = EnvironmentConfig.DEFAULT;
      environmentConfig0.setLockTimeout(1L);
      assertTrue(environmentConfig0.getLocking());
  }

  @Test
  public void test13()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = EnvironmentConfig.DEFAULT;
      //  // Unstable assertion: assertFalse(environmentConfig0.getTxnSerializableIsolation());
      
      environmentConfig0.setTxnSerializableIsolation(true);
      //  // Unstable assertion: assertTrue(environmentConfig0.getTxnSerializableIsolation());
  }

  @Test
  public void test14()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = null;
      try {
        environmentConfig0 = new EnvironmentConfig((Properties) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.EnvironmentMutableConfig", e);
      }
  }

  @Test
  public void test15()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = new EnvironmentConfig();
      environmentConfig0.setTransactional(true);
      boolean boolean0 = environmentConfig0.getTransactional();
      assertTrue(boolean0);
  }

  @Test
  public void test16()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = new EnvironmentConfig();
      String string0 = environmentConfig0.toString();
      assertEquals("allowCreate=false\n{}", string0);
  }

  @Test
  public void test18()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = new EnvironmentConfig();
      environmentConfig0.getTransactional();
      assertFalse(environmentConfig0.getAllowCreate());
  }

  @Test
  public void test19()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = new EnvironmentConfig();
      try { 
        environmentConfig0.setTxnTimeout((-185L));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // com.sleepycat.je.config.LongConfigParam: param je.txn.timeout doesn't validate, -185 is less than min of 0
         //
         assertThrownBy("com.sleepycat.je.config.LongConfigParam", e);
      }
  }

  @Test
  public void test20()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = new EnvironmentConfig();
      boolean boolean0 = environmentConfig0.getAllowCreate();
      assertFalse(boolean0);
  }
}