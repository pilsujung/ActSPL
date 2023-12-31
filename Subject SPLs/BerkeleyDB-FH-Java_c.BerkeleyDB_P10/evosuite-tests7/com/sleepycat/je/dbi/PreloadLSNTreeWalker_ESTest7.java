/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 21 20:15:32 KST 2017
 */

package com.sleepycat.je.dbi;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.fail;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.sleepycat.je.DatabaseException;
import com.sleepycat.je.PreloadConfig;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class PreloadLSNTreeWalker_ESTest7 extends PreloadLSNTreeWalker_ESTest_scaffolding7 {

  @Test
  public void test0()  throws Throwable  {
      PreloadConfig preloadConfig0 = new PreloadConfig();
      PreloadLSNTreeWalker preloadLSNTreeWalker0 = null;
      try {
        preloadLSNTreeWalker0 = new PreloadLSNTreeWalker((DatabaseImpl) null, (SortedLSNTreeWalker.TreeNodeProcessor) null, preloadConfig0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.dbi.PreloadLSNTreeWalker", e);
      }
  }

  @Test
  public void test1()  throws Throwable  {
      DatabaseImpl databaseImpl0 = new DatabaseImpl();
      PreloadConfig preloadConfig0 = new PreloadConfig();
      PreloadLSNTreeWalker preloadLSNTreeWalker0 = null;
      try {
        preloadLSNTreeWalker0 = new PreloadLSNTreeWalker(databaseImpl0, (SortedLSNTreeWalker.TreeNodeProcessor) null, preloadConfig0);
        fail("Expecting exception: DatabaseException");
      
      } catch(DatabaseException e) {
         //
         // environmentImpl is null for target db null
         //
         assertThrownBy("com.sleepycat.je.dbi.SortedLSNTreeWalker", e);
      }
  }
}
