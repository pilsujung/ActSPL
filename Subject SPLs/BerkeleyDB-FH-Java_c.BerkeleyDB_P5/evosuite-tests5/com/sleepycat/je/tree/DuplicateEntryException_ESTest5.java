/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 11:33:13 KST 2017
 */

package com.sleepycat.je.tree;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class DuplicateEntryException_ESTest5 extends DuplicateEntryException_ESTest_scaffolding5 {

  @Test
  public void test0()  throws Throwable  {
      DuplicateEntryException duplicateEntryException0 = new DuplicateEntryException("W<f]iHEN?*D?',p#=");
      assertEquals("W<f]iHEN?*D?',p#=", duplicateEntryException0.getMessage());
  }

}
