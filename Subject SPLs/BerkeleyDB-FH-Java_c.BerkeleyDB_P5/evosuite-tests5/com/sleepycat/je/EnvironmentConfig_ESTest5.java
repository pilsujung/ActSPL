/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 09:31:30 KST 2017
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
public class EnvironmentConfig_ESTest5 extends EnvironmentConfig_ESTest_scaffolding5 {

  @Test
  public void test00()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = new EnvironmentConfig();
      boolean boolean0 = environmentConfig0.getTxnReadCommitted();
      assertFalse(boolean0);
      assertFalse(environmentConfig0.getAllowCreate());
  }

  @Test
  public void test04()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = new EnvironmentConfig();
      try { 
        environmentConfig0.setTxnTimeout((-2515L));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // com.sleepycat.je.config.LongConfigParam: param je.txn.timeout doesn't validate, -2515 is less than min of 0
         //
         assertThrownBy("com.sleepycat.je.config.LongConfigParam", e);
      }
  }


  @Test
  public void test06()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = EnvironmentConfig.DEFAULT;
      environmentConfig0.setTxnTimeout(0L);
      assertEquals(0L, environmentConfig0.getCacheSize());
  }

  @Test
  public void test07()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = EnvironmentConfig.DEFAULT;
      try { 
        environmentConfig0.setConfigParam(" and ", "");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         //  and  is not a valid BDBJE environment configuration
         //
         assertThrownBy("com.sleepycat.je.EnvironmentConfig", e);
      }
  }




  @Test
  public void test11()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = EnvironmentConfig.DEFAULT;
      boolean boolean0 = environmentConfig0.getTxnReadCommitted();
      //  // Unstable assertion: assertFalse(boolean0);
  }

  @Test
  public void test12()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = new EnvironmentConfig();
      EnvironmentConfig environmentConfig1 = environmentConfig0.cloneConfig();
      environmentConfig1.DEFAULT = environmentConfig0;
      environmentConfig1.DEFAULT.setCheckpointUP(false);
      boolean boolean0 = environmentConfig0.getCheckpointUP();
      assertFalse(environmentConfig0.getAllowCreate());
      assertFalse(boolean0);
  }

  @Test
  public void test13()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = EnvironmentConfig.DEFAULT;
      environmentConfig0.setLocking(false);
      assertFalse(environmentConfig0.getLocking());
  }

  @Test
  public void test14()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = new EnvironmentConfig();
      boolean boolean0 = environmentConfig0.getCheckpointUP();
      assertTrue(boolean0);
      assertFalse(environmentConfig0.getAllowCreate());
  }

  @Test
  public void test15()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = EnvironmentConfig.DEFAULT;
      environmentConfig0.setCreateUP(true);
      //  // Unstable assertion: assertTrue(environmentConfig0.getTransactional());
  }



  @Test
  public void test18()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = EnvironmentConfig.DEFAULT;
      environmentConfig0.setAllowCreate(false);
      assertFalse(environmentConfig0.getAllowCreate());
  }

  @Test
  public void test20()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = new EnvironmentConfig();
      environmentConfig0.setTxnSerializableIsolation(true);
      assertTrue(environmentConfig0.getTxnSerializableIsolation());
  }

  @Test
  public void test22()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = EnvironmentConfig.DEFAULT;
      environmentConfig0.setTxnReadCommitted(true);
      assertEquals(0L, environmentConfig0.getCacheSize());
  }


  @Test
  public void test25()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = EnvironmentConfig.DEFAULT;
      boolean boolean0 = environmentConfig0.getLocking();
      //  // Unstable assertion: assertTrue(boolean0);
  }

}
