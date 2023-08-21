/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 21 22:41:51 KST 2017
 */

package com.sleepycat.je;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.sleepycat.je.EnvironmentConfig;
import com.sleepycat.je.EnvironmentMutableConfig;
import com.sleepycat.je.config.ConfigParam;
import com.sleepycat.je.dbi.EnvironmentImpl;
import java.io.File;
import java.util.Properties;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class EnvironmentMutableConfig_ESTest2 extends EnvironmentMutableConfig_ESTest_scaffolding2 {

  @Test
  public void test00()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = new EnvironmentConfig();
      boolean boolean0 = environmentConfig0.getTxnNoSync();
      assertFalse(environmentConfig0.getTxnWriteNoSync());
      assertFalse(boolean0);
  }

  @Test
  public void test01()  throws Throwable  {
      EnvironmentMutableConfig environmentMutableConfig0 = new EnvironmentMutableConfig();
      environmentMutableConfig0.setValidateParams(false);
      environmentMutableConfig0.setCachePercent(0);
      int int0 = environmentMutableConfig0.getCachePercent();
      assertEquals(0, int0);
      assertFalse(environmentMutableConfig0.getTxnNoSync());
      assertFalse(environmentMutableConfig0.getTxnWriteNoSync());
  }


  @Test
  public void test03()  throws Throwable  {
      EnvironmentMutableConfig environmentMutableConfig0 = new EnvironmentMutableConfig();
      EnvironmentMutableConfig environmentMutableConfig1 = environmentMutableConfig0.cloneMutableConfig();
      environmentMutableConfig1.setLoadPropertyFile(false);
      assertFalse(environmentMutableConfig1.getTxnWriteNoSync());
      assertFalse(environmentMutableConfig1.getTxnNoSync());
      assertNotSame(environmentMutableConfig1, environmentMutableConfig0);
  }

  @Test
  public void test04()  throws Throwable  {
      EnvironmentMutableConfig environmentMutableConfig0 = new EnvironmentMutableConfig();
      EnvironmentMutableConfig environmentMutableConfig1 = environmentMutableConfig0.cloneMutableConfig();
      environmentMutableConfig1.cacheSize = (long) 2;
      assertFalse(environmentMutableConfig1.getTxnNoSync());
      assertFalse(environmentMutableConfig1.getTxnWriteNoSync());
      assertEquals(0L, environmentMutableConfig0.getCacheSize());
  }

  @Test
  public void test05()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = EnvironmentConfig.DEFAULT;
      EnvironmentConfig environmentConfig1 = (EnvironmentConfig)environmentConfig0.cloneMutableConfig();
      environmentConfig0.copyMutablePropsTo(environmentConfig1);
      assertNotSame(environmentConfig1, environmentConfig0);
  }

  @Test
  public void test06()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = EnvironmentConfig.DEFAULT;
      EnvironmentConfig environmentConfig1 = environmentConfig0.cloneConfig();
      environmentConfig0.copyHandlePropsTo(environmentConfig1);
      assertNotSame(environmentConfig1, environmentConfig0);
  }

  @Test
  public void test07()  throws Throwable  {
      EnvironmentMutableConfig environmentMutableConfig0 = new EnvironmentMutableConfig();
      try { 
        environmentMutableConfig0.setConfigParam((String) null, " Sorted Duplicates\n");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not a valid BDBJE environment configuration
         //
         assertThrownBy("com.sleepycat.je.EnvironmentMutableConfig", e);
      }
  }

  @Test
  public void test08()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = EnvironmentConfig.DEFAULT;
      Properties properties0 = null;
      // Undeclared exception!
      try { 
        environmentConfig0.validateProperties((Properties) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.EnvironmentMutableConfig", e);
      }
  }

  @Test
  public void test09()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = EnvironmentConfig.DEFAULT;
      ConfigParam configParam0 = null;
      String string0 = "";
      // Undeclared exception!
      try { 
        environmentConfig0.setVal(configParam0, string0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.EnvironmentMutableConfig", e);
      }
  }

  @Test
  public void test10()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = EnvironmentConfig.DEFAULT;
      EnvironmentConfig environmentConfig1 = (EnvironmentConfig)environmentConfig0.clone();
      assertNotSame(environmentConfig1, environmentConfig0);
  }

  @Test
  public void test11()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = EnvironmentConfig.DEFAULT;
      long long0 = environmentConfig0.getCacheSize();
      assertEquals(0L, long0);
  }

  @Test
  public void test13()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = EnvironmentConfig.DEFAULT;
      // Undeclared exception!
      try { 
        environmentConfig0.getVal((ConfigParam) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.EnvironmentMutableConfig", e);
      }
  }

  @Test
  public void test14()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = new EnvironmentConfig();
      // Undeclared exception!
      try { 
        environmentConfig0.copyHandlePropsTo((EnvironmentMutableConfig) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.EnvironmentMutableConfig", e);
      }
  }



  @Test
  public void test19()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = EnvironmentConfig.DEFAULT;
      environmentConfig0.checkImmutablePropsForEquality(environmentConfig0);
      assertFalse(environmentConfig0.getTxnSerializableIsolation());
  }

  @Test
  public void test20()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = EnvironmentConfig.DEFAULT;
      try { 
        environmentConfig0.getConfigParam("`;+a");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // `;+a is not a valid BDBJE environment configuration
         //
         assertThrownBy("com.sleepycat.je.EnvironmentMutableConfig", e);
      }
  }

  @Test
  public void test21()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = new EnvironmentConfig();
      EnvironmentImpl environmentImpl0 = null;
      try {
        environmentImpl0 = new EnvironmentImpl((File) null, environmentConfig0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.FileManager", e);
      }
  }

  @Test
  public void test22()  throws Throwable  {
      EnvironmentMutableConfig environmentMutableConfig0 = new EnvironmentMutableConfig();
      try { 
        environmentMutableConfig0.setConfigParam("", "");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         //  is not a valid BDBJE environment configuration
         //
         assertThrownBy("com.sleepycat.je.EnvironmentMutableConfig", e);
      }
  }

  @Test
  public void test23()  throws Throwable  {
      EnvironmentMutableConfig environmentMutableConfig0 = new EnvironmentMutableConfig();
      environmentMutableConfig0.setCachePercent(32);
      int int0 = environmentMutableConfig0.getCachePercent();
      assertEquals(32, int0);
      assertFalse(environmentMutableConfig0.getTxnNoSync());
      assertFalse(environmentMutableConfig0.getTxnWriteNoSync());
  }


  @Test
  public void test26()  throws Throwable  {
      EnvironmentMutableConfig environmentMutableConfig0 = new EnvironmentMutableConfig();
      environmentMutableConfig0.setCacheSize(1);
      assertFalse(environmentMutableConfig0.getTxnWriteNoSync());
      assertFalse(environmentMutableConfig0.getTxnNoSync());
  }



  @Test
  public void test29()  throws Throwable  {
      EnvironmentMutableConfig environmentMutableConfig0 = new EnvironmentMutableConfig();
      environmentMutableConfig0.getNumExplicitlySetParams();
      assertFalse(environmentMutableConfig0.getTxnWriteNoSync());
      assertFalse(environmentMutableConfig0.getTxnNoSync());
  }


  @Test
  public void test31()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = new EnvironmentConfig();
      // Undeclared exception!
      try { 
        environmentConfig0.fillInEnvironmentGeneratedProps((EnvironmentImpl) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.EnvironmentMutableConfig", e);
      }
  }

  @Test
  public void test32()  throws Throwable  {
      EnvironmentMutableConfig environmentMutableConfig0 = new EnvironmentMutableConfig();
      EnvironmentMutableConfig environmentMutableConfig1 = environmentMutableConfig0.cloneMutableConfig();
      environmentMutableConfig1.cacheSize = (-1182L);
      assertFalse(environmentMutableConfig1.getTxnWriteNoSync());
      assertFalse(environmentMutableConfig1.getTxnNoSync());
      assertEquals(0L, environmentMutableConfig0.getCacheSize());
  }
}
