/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 12:29:16 KST 2017
 */

package com.sleepycat.je.utilint;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.fail;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.sleepycat.je.dbi.EnvironmentImpl;
import com.sleepycat.je.incomp.INCompressor;
import com.sleepycat.je.recovery.Checkpointer;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class DaemonThread_ESTest5 extends DaemonThread_ESTest_scaffolding5 {

  @Test
  public void test0()  throws Throwable  {
      Checkpointer checkpointer0 = null;
      try {
        checkpointer0 = new Checkpointer((EnvironmentImpl) null, 9L, "t7,b(:K{N<+r7Ntu");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.recovery.Checkpointer", e);
      }
  }

  @Test
  public void test1()  throws Throwable  {
      INCompressor iNCompressor0 = null;
      try {
        iNCompressor0 = new INCompressor((EnvironmentImpl) null, 11L, "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.incomp.INCompressor", e);
      }
  }
}
