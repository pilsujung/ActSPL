/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 21 21:17:04 KST 2017
 */

package com.sleepycat.je.tree;

import static org.junit.Assert.assertEquals;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class DuplicateEntryException_ESTest7 extends DuplicateEntryException_ESTest_scaffolding7 {

  @Test
  public void test0()  throws Throwable  {
      DuplicateEntryException duplicateEntryException0 = new DuplicateEntryException("");
      assertEquals("", duplicateEntryException0.getMessage());
  }

  @Test
  public void test1()  throws Throwable  {
      DuplicateEntryException duplicateEntryException0 = new DuplicateEntryException();
      assertEquals("com.sleepycat.je.tree.DuplicateEntryException", duplicateEntryException0.toString());
  }
}
