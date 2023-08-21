/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 07 23:21:25 KST 2017
 */

package org.prevayler.foundation;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.fail;

import java.io.File;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class FileLocker_ESTest1 extends FileLocker_ESTest_scaffolding1 {

  @Test
  public void test0()  throws Throwable  {
      FileLocker fileLocker0 = null;
      try {
        fileLocker0 = new FileLocker((File) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.prevayler.foundation.FileLocker", e);
      }
  }
}