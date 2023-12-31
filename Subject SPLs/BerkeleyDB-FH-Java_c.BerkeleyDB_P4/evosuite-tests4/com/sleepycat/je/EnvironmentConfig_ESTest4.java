/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 13:37:42 KST 2017
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
public class EnvironmentConfig_ESTest4 extends EnvironmentConfig_ESTest_scaffolding4 {

  @Test
  public void test00()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = EnvironmentConfig.DEFAULT;
      try { 
        environmentConfig0.setConfigParam("ytU0|>q.I'7FP~ay{", (String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ytU0|>q.I'7FP~ay{ is not a valid BDBJE environment configuration
         //
         assertThrownBy("com.sleepycat.je.EnvironmentConfig", e);
      }
  }

  @Test
  public void test01()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = EnvironmentConfig.DEFAULT;
      try { 
        environmentConfig0.setTxnTimeout((-4139L));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // com.sleepycat.je.config.LongConfigParam: param je.txn.timeout doesn't validate, -4139 is less than min of 0
         //
         assertThrownBy("com.sleepycat.je.config.LongConfigParam", e);
      }
  }

  @Test
  public void test02()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = new EnvironmentConfig();
      try { 
        environmentConfig0.setLockTimeout((-3722L));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // com.sleepycat.je.config.LongConfigParam: param je.lock.timeout doesn't validate, -3722 is less than min of 0
         //
         assertThrownBy("com.sleepycat.je.config.LongConfigParam", e);
      }
  }

  @Test
  public void test03()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = EnvironmentConfig.DEFAULT;
      try { 
        environmentConfig0.setConfigParam("je.evictor.evictBytes", "}tv7F");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // com.sleepycat.je.config.LongConfigParam: }tv7F not valid value for je.evictor.evictBytes
         //
         assertThrownBy("com.sleepycat.je.config.LongConfigParam", e);
      }
  }

  @Test
  public void test04()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = EnvironmentConfig.DEFAULT;
      environmentConfig0.setCheckpointUP(true);
      //  // Unstable assertion: assertTrue(environmentConfig0.getReadOnly());
  }



  @Test
  public void test09()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = EnvironmentConfig.DEFAULT;
      environmentConfig0.setLocking(true);
      environmentConfig0.setCacheSize((-2947L));
      environmentConfig0.setValidateParams(true);
      environmentConfig0.getTransactional();
      environmentConfig0.getTransactional();
      environmentConfig0.getTransactional();
      environmentConfig0.getCheckpointUP();
      environmentConfig0.getTxnTimeout();
      String string0 = environmentConfig0.toString();
      //  // Unstable assertion: assertEquals("allowCreate=false\n{je.maxMemory=-2947, je.env.isLocking=true, je.txn.serializableIsolation=true, je.lock.timeout=0}", string0);
      
      environmentConfig0.getLocking();
      environmentConfig0.setTxnTimeout(0L);
      EnvironmentConfig environmentConfig1 = EnvironmentConfig.DEFAULT;
      environmentConfig0.cloneConfig();
      environmentConfig1.setAllowCreate(false);
      environmentConfig1.getTxnTimeout();
      environmentConfig0.setCreateUP(true);
      environmentConfig1.setTransactional(true);
      //  // Unstable assertion: assertTrue(environmentConfig1.getLocking());
  }

  @Test
  public void test10()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = EnvironmentConfig.DEFAULT;
      environmentConfig0.setLockTimeout(514L);
      assertFalse(environmentConfig0.getAllowCreate());
  }






  @Test
  public void test17()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = EnvironmentConfig.DEFAULT;
      boolean boolean0 = environmentConfig0.getTransactional();
      //  // Unstable assertion: assertFalse(boolean0);
  }

}
