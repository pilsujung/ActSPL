/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 10:07:50 KST 2017
 */

package com.sleepycat.je.tree;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class DuplicateEntryException_ESTest8 extends DuplicateEntryException_ESTest_scaffolding8 {

  @Test
  public void test0()  throws Throwable  {
      DuplicateEntryException duplicateEntryException0 = new DuplicateEntryException("^C.m");
      assertEquals("com.sleepycat.je.tree.DuplicateEntryException: ^C.m", duplicateEntryException0.toString());
  }

  @Test
  public void test1()  throws Throwable  {
      DuplicateEntryException duplicateEntryException0 = new DuplicateEntryException();
      assertNull(duplicateEntryException0.getMessage());
  }
}
