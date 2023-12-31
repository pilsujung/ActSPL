/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 21 23:08:50 KST 2017
 */

package com.sleepycat.je;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class CursorConfig_ESTest6 extends CursorConfig_ESTest_scaffolding6 {

  @Test
  public void test0()  throws Throwable  {
      CursorConfig cursorConfig0 = new CursorConfig();
      boolean boolean0 = cursorConfig0.getReadCommitted();
      assertFalse(boolean0);
      assertFalse(cursorConfig0.getReadUncommitted());
  }

  @Test
  public void test1()  throws Throwable  {
      CursorConfig cursorConfig0 = new CursorConfig();
      boolean boolean0 = cursorConfig0.getDirtyRead();
      assertFalse(boolean0);
      assertFalse(cursorConfig0.getReadCommitted());
  }

  @Test
  public void test2()  throws Throwable  {
      CursorConfig cursorConfig0 = new CursorConfig();
      CursorConfig cursorConfig1 = cursorConfig0.cloneConfig();
      assertFalse(cursorConfig1.getReadCommitted());
      assertFalse(cursorConfig1.getReadUncommitted());
  }

  @Test
  public void test3()  throws Throwable  {
      CursorConfig cursorConfig0 = CursorConfig.READ_UNCOMMITTED;
      //  // Unstable assertion: assertTrue(cursorConfig0.getDirtyRead());
      
      cursorConfig0.setReadUncommitted(false);
      //  // Unstable assertion: assertFalse(cursorConfig0.getDirtyRead());
  }

  @Test
  public void test5()  throws Throwable  {
      CursorConfig cursorConfig0 = CursorConfig.READ_COMMITTED;
      boolean boolean0 = cursorConfig0.getReadCommitted();
      assertTrue(boolean0);
  }

  @Test
  public void test6()  throws Throwable  {
      CursorConfig cursorConfig0 = new CursorConfig();
      cursorConfig0.setReadCommitted(false);
      assertFalse(cursorConfig0.getReadCommitted());
      assertFalse(cursorConfig0.getReadUncommitted());
  }

  @Test
  public void test9()  throws Throwable  {
      CursorConfig cursorConfig0 = new CursorConfig();
      cursorConfig0.setDirtyRead(false);
      assertFalse(cursorConfig0.getReadCommitted());
      assertFalse(cursorConfig0.getReadUncommitted());
  }
}
