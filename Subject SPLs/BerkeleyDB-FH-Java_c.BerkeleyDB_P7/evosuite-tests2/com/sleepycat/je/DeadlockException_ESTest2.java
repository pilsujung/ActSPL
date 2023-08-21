/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 21 22:44:11 KST 2017
 */

package com.sleepycat.je;

import org.junit.Test;
import static org.junit.Assert.*;
import com.sleepycat.je.DeadlockException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class DeadlockException_ESTest2 extends DeadlockException_ESTest_scaffolding2 {

  @Test
  public void test0()  throws Throwable  {
      DeadlockException deadlockException0 = new DeadlockException();
      assertNull(deadlockException0.getMessage());
  }

  @Test
  public void test1()  throws Throwable  {
      DeadlockException deadlockException0 = new DeadlockException("$k$G>}(] />|[");
      DeadlockException deadlockException1 = new DeadlockException((Throwable) deadlockException0);
      assertEquals("com.sleepycat.je.DeadlockException: $k$G>}(] />|[", deadlockException1.getMessage());
  }

  @Test
  public void test2()  throws Throwable  {
      DeadlockException deadlockException0 = new DeadlockException("SXS#)UooIuu>~J\"K<~", (Throwable) null);
      assertEquals("com.sleepycat.je.DeadlockException: SXS#)UooIuu>~J\"K<~", deadlockException0.toString());
  }
}
