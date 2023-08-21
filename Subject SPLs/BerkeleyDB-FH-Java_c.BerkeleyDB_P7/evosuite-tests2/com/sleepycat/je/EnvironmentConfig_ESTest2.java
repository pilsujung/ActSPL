/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 21 22:43:11 KST 2017
 */

package com.sleepycat.je;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.sleepycat.je.EnvironmentConfig;
import java.util.Properties;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class EnvironmentConfig_ESTest2 extends EnvironmentConfig_ESTest_scaffolding2 {

  @Test
  public void test00()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = new EnvironmentConfig();
      environmentConfig0.setTxnSerializableIsolation(true);
      boolean boolean0 = environmentConfig0.getTxnSerializableIsolation();
      assertTrue(boolean0);
  }

  @Test
  public void test01()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = EnvironmentConfig.DEFAULT;
      try { 
        environmentConfig0.setConfigParam("je.log.iteratorMaxSize", (String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // com.sleepycat.je.config.IntConfigParam: null not valid value for je.log.iteratorMaxSize
         //
         assertThrownBy("com.sleepycat.je.config.IntConfigParam", e);
      }
  }

  @Test
  public void test02()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = EnvironmentConfig.DEFAULT;
      try { 
        environmentConfig0.setConfigParam("allowCreate=", "NdAn7A!");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // allowCreate= is not a valid BDBJE environment configuration
         //
         assertThrownBy("com.sleepycat.je.EnvironmentConfig", e);
      }
  }

  @Test
  public void test03()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = EnvironmentConfig.DEFAULT;
      EnvironmentConfig environmentConfig1 = (EnvironmentConfig)environmentConfig0.cloneMutableConfig();
      try { 
        environmentConfig0.checkImmutablePropsForEquality(environmentConfig1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // je.txn.timeout is set to null in the config parameter which is incompatible with the value of 0 in the underlying environment
         //
         assertThrownBy("com.sleepycat.je.EnvironmentMutableConfig", e);
      }
  }

  @Test
  public void test04()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = new EnvironmentConfig();
      try { 
        environmentConfig0.setConfigParam("je.nodeMaxEntries", "je.nodeMaxEntries");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // com.sleepycat.je.config.IntConfigParam: je.nodeMaxEntries not valid value for je.nodeMaxEntries
         //
         assertThrownBy("com.sleepycat.je.config.IntConfigParam", e);
      }
  }

  @Test
  public void test05()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = EnvironmentConfig.DEFAULT;
      boolean boolean0 = environmentConfig0.getCreateUP();
      //  // Unstable assertion: assertFalse(boolean0);
  }

  @Test
  public void test06()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = new EnvironmentConfig();
      try { 
        environmentConfig0.setTxnTimeout((-307L));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // com.sleepycat.je.config.LongConfigParam: param je.txn.timeout doesn't validate, -307 is less than min of 0
         //
         assertThrownBy("com.sleepycat.je.config.LongConfigParam", e);
      }
  }

  @Test
  public void test07()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = new EnvironmentConfig();
      try { 
        environmentConfig0.setLockTimeout((-1245L));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // com.sleepycat.je.config.LongConfigParam: param je.lock.timeout doesn't validate, -1245 is less than min of 0
         //
         assertThrownBy("com.sleepycat.je.config.LongConfigParam", e);
      }
  }

  @Test
  public void test08()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = new EnvironmentConfig();
      environmentConfig0.setCheckpointUP(true);
      assertFalse(environmentConfig0.getAllowCreate());
  }

  @Test
  public void test09()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = EnvironmentConfig.DEFAULT;
      environmentConfig0.setReadOnly(false);
      assertFalse(environmentConfig0.getReadOnly());
  }


  @Test
  public void test11()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = EnvironmentConfig.DEFAULT;
      boolean boolean0 = environmentConfig0.getTxnReadCommitted();
      assertFalse(boolean0);
  }

  @Test
  public void test12()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = EnvironmentConfig.DEFAULT;
      EnvironmentConfig environmentConfig1 = environmentConfig0.cloneConfig();
      assertNotSame(environmentConfig0, environmentConfig1);
  }

  @Test
  public void test13()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = new EnvironmentConfig();
      environmentConfig0.setLocking(false);
      assertFalse(environmentConfig0.getLocking());
  }

  @Test
  public void test14()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = EnvironmentConfig.DEFAULT;
      environmentConfig0.setLockTimeout(0L);
      assertEquals(0L, environmentConfig0.getCacheSize());
  }

  @Test
  public void test15()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = EnvironmentConfig.DEFAULT;
      long long0 = environmentConfig0.getLockTimeout();
      //  // Unstable assertion: assertEquals(500000L, long0);
  }

  @Test
  public void test16()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = new EnvironmentConfig();
      boolean boolean0 = environmentConfig0.getCheckpointUP();
      assertFalse(environmentConfig0.getAllowCreate());
      assertTrue(boolean0);
  }

  @Test
  public void test17()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = EnvironmentConfig.DEFAULT;
      environmentConfig0.setCreateUP(true);
      assertFalse(environmentConfig0.getTxnSerializableIsolation());
  }

  @Test
  public void test18()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = EnvironmentConfig.DEFAULT;
      long long0 = environmentConfig0.getTxnTimeout();
      assertEquals(0L, long0);
  }

  @Test
  public void test19()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = EnvironmentConfig.DEFAULT;
      boolean boolean0 = environmentConfig0.getTxnSerializableIsolation();
      assertFalse(boolean0);
  }


  @Test
  public void test21()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = new EnvironmentConfig();
      assertFalse(environmentConfig0.getAllowCreate());
      
      environmentConfig0.setAllowCreate(true);
      boolean boolean0 = environmentConfig0.getAllowCreate();
      assertTrue(boolean0);
  }

  @Test
  public void test22()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = new EnvironmentConfig();
      environmentConfig0.setTransactional(false);
      assertFalse(environmentConfig0.getTransactional());
      assertFalse(environmentConfig0.getAllowCreate());
  }

  @Test
  public void test23()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = EnvironmentConfig.DEFAULT;
      String string0 = environmentConfig0.toString();
      //  // Unstable assertion: assertEquals("allowCreate=false\n{je.txn.timeout=0}", string0);
  }

  @Test
  public void test24()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = EnvironmentConfig.DEFAULT;
      environmentConfig0.setTxnReadCommitted(false);
      assertFalse(environmentConfig0.getTransactional());
  }

  @Test
  public void test25()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = EnvironmentConfig.DEFAULT;
      boolean boolean0 = environmentConfig0.getTransactional();
      assertFalse(boolean0);
  }

  @Test
  public void test26()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = EnvironmentConfig.DEFAULT;
      environmentConfig0.setTxnTimeout(0L);
      assertFalse(environmentConfig0.getTransactional());
  }

}
