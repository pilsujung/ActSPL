/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 21 23:34:49 KST 2017
 */

package com.sleepycat.je;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.fail;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class SecondaryCursor_ESTest6 extends SecondaryCursor_ESTest_scaffolding6 {

  @Test
  public void test0()  throws Throwable  {
      CursorConfig cursorConfig0 = new CursorConfig();
      SecondaryCursor secondaryCursor0 = null;
      try {
        secondaryCursor0 = new SecondaryCursor((SecondaryDatabase) null, (Transaction) null, cursorConfig0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.Cursor", e);
      }
  }
}