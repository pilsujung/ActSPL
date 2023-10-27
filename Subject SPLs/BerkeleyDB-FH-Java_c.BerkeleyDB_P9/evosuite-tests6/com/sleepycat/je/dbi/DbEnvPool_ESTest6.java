/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 00:28:43 KST 2017
 */

package com.sleepycat.je.dbi;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.sleepycat.je.EnvironmentConfig;
import com.sleepycat.je.dbi.DbEnvPool;
import com.sleepycat.je.dbi.EnvironmentImpl;
import java.io.File;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class DbEnvPool_ESTest6 extends DbEnvPool_ESTest_scaffolding6 {

  @Test
  public void test0()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = new EnvironmentConfig();
      DbEnvPool dbEnvPool0 = DbEnvPool.getInstance();
      // Undeclared exception!
      try { 
        dbEnvPool0.getEnvironment((File) null, environmentConfig0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.dbi.DbEnvPool", e);
      }
  }

  @Test
  public void test1()  throws Throwable  {
      DbEnvPool dbEnvPool0 = DbEnvPool.getInstance();
      // Undeclared exception!
      try { 
        dbEnvPool0.remove((File) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.dbi.DbEnvPool", e);
      }
  }

  @Test
  public void test2()  throws Throwable  {
      DbEnvPool dbEnvPool0 = DbEnvPool.getInstance();
      dbEnvPool0.clear();
  }

  @Test
  public void test3()  throws Throwable  {
      DbEnvPool dbEnvPool0 = DbEnvPool.getInstance();
      // Undeclared exception!
      try { 
        dbEnvPool0.getExistingEnvironment((File) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.dbi.DbEnvPool", e);
      }
  }

  @Test
  public void test4()  throws Throwable  {
      DbEnvPool.EnvironmentImplInfo dbEnvPool_EnvironmentImplInfo0 = new DbEnvPool.EnvironmentImplInfo((EnvironmentImpl) null, true);
      assertTrue(dbEnvPool_EnvironmentImplInfo0.firstHandle);
  }
}