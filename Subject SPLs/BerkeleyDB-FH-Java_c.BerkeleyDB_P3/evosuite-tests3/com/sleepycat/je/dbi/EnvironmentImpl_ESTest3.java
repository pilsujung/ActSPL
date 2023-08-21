/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 03:17:24 KST 2017
 */

package com.sleepycat.je.dbi;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.File;
import java.util.Properties;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.sleepycat.je.EnvironmentConfig;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class EnvironmentImpl_ESTest3 extends EnvironmentImpl_ESTest_scaffolding3 {

  @Test
  public void test00()  throws Throwable  {
      File file0 = null;
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
  public void test06()  throws Throwable  {
      int int0 = EnvironmentImpl.getThreadLocalReferenceCount();
      //  // Unstable assertion: assertEquals(1, int0);
  }




  @Test
  public void test10()  throws Throwable  {
      EnvironmentImpl.EnvironmentImpl_createDaemons environmentImpl_EnvironmentImpl_createDaemons0 = new EnvironmentImpl.EnvironmentImpl_createDaemons((EnvironmentImpl) null);
      // Undeclared exception!
      try { 
        environmentImpl_EnvironmentImpl_createDaemons0.execute();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.dbi.EnvironmentImpl", e);
      }
  }

}
