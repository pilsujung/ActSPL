/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 21 22:52:12 KST 2017
 */

package com.sleepycat.je;

import org.junit.Test;
import static org.junit.Assert.*;
import com.sleepycat.je.CursorConfig;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class CursorConfig_ESTest2 extends CursorConfig_ESTest_scaffolding2 {

  @Test
  public void test0()  throws Throwable  {
      CursorConfig cursorConfig0 = new CursorConfig();
      boolean boolean0 = cursorConfig0.getDirtyRead();
      assertFalse(boolean0);
      assertFalse(cursorConfig0.getReadCommitted());
  }


  @Test
  public void test2()  throws Throwable  {
      CursorConfig cursorConfig0 = CursorConfig.READ_COMMITTED;
      cursorConfig0.setReadUncommitted(true);
      assertTrue(cursorConfig0.getDirtyRead());
  }

  @Test
  public void test3()  throws Throwable  {
      CursorConfig cursorConfig0 = CursorConfig.READ_COMMITTED;
      boolean boolean0 = cursorConfig0.getDirtyRead();
      //  // Unstable assertion: assertFalse(boolean0);
  }

  @Test
  public void test4()  throws Throwable  {
      CursorConfig cursorConfig0 = CursorConfig.DIRTY_READ;
      boolean boolean0 = cursorConfig0.getReadCommitted();
      assertFalse(boolean0);
  }

  @Test
  public void test5()  throws Throwable  {
      CursorConfig cursorConfig0 = new CursorConfig();
      cursorConfig0.setReadCommitted(false);
      assertFalse(cursorConfig0.getDirtyRead());
      assertFalse(cursorConfig0.getReadCommitted());
  }

  @Test
  public void test7()  throws Throwable  {
      CursorConfig cursorConfig0 = CursorConfig.READ_COMMITTED;
      CursorConfig cursorConfig1 = cursorConfig0.cloneConfig();
      //  // Unstable assertion: assertFalse(cursorConfig1.getDirtyRead());
  }

}