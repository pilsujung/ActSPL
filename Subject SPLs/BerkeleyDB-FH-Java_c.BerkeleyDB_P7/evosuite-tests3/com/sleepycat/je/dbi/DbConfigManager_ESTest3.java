/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 03:22:12 KST 2017
 */

package com.sleepycat.je.dbi;

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

import com.sleepycat.je.EnvironmentConfig;
import com.sleepycat.je.config.BooleanConfigParam;
import com.sleepycat.je.config.ConfigParam;
import com.sleepycat.je.config.IntConfigParam;
import com.sleepycat.je.config.LongConfigParam;
import com.sleepycat.je.config.ShortConfigParam;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class DbConfigManager_ESTest3 extends DbConfigManager_ESTest_scaffolding3 {


  @Test
  public void test01()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = new EnvironmentConfig();
      environmentConfig0.setTxnSerializableIsolation(true);
      DbConfigManager dbConfigManager0 = new DbConfigManager(environmentConfig0);
      EnvironmentConfig environmentConfig1 = dbConfigManager0.getEnvironmentConfig();
      assertFalse(environmentConfig1.getAllowCreate());
  }

  @Test
  public void test02()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = new EnvironmentConfig();
      DbConfigManager dbConfigManager0 = new DbConfigManager(environmentConfig0);
      dbConfigManager0.getEnvironmentConfig();
      environmentConfig0.setTransactional(true);
      assertFalse(environmentConfig0.getReadOnly());
  }

  @Test
  public void test03()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = new EnvironmentConfig();
      environmentConfig0.setReadOnly(true);
      DbConfigManager dbConfigManager0 = new DbConfigManager(environmentConfig0);
      EnvironmentConfig environmentConfig1 = dbConfigManager0.getEnvironmentConfig();
      assertEquals(0L, environmentConfig1.getCacheSize());
  }

  @Test
  public void test04()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = new EnvironmentConfig();
      DbConfigManager dbConfigManager0 = new DbConfigManager(environmentConfig0);
      dbConfigManager0.getEnvironmentConfig();
      environmentConfig0.setLocking(false);
      assertFalse(environmentConfig0.getTxnSerializableIsolation());
  }




  @Test
  public void test08()  throws Throwable  {
      DbConfigManager dbConfigManager0 = new DbConfigManager((EnvironmentConfig) null);
      // Undeclared exception!
      try { 
        dbConfigManager0.get("bfiC,S|W:TZ&K*n+R");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.dbi.DbConfigManager", e);
      }
  }

  @Test
  public void test09()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = new EnvironmentConfig();
      DbConfigManager dbConfigManager0 = new DbConfigManager(environmentConfig0);
      try { 
        dbConfigManager0.get("N}dg:!Xs [,lS|,");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // N}dg:!Xs [,lS|, is not a valid BDBJE environment configuration
         //
         assertThrownBy("com.sleepycat.je.EnvironmentMutableConfig", e);
      }
  }



  @Test
  public void test12()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = new EnvironmentConfig();
      DbConfigManager dbConfigManager0 = new DbConfigManager(environmentConfig0);
      String string0 = dbConfigManager0.get("je.cleaner.maxBatchFiles");
      assertEquals("0", string0);
  }

  @Test
  public void test13()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = new EnvironmentConfig();
      DbConfigManager dbConfigManager0 = new DbConfigManager(environmentConfig0);
      dbConfigManager0.getEnvironmentConfig();
      environmentConfig0.setAllowCreate(true);
      assertTrue(environmentConfig0.getAllowCreate());
  }
}
