/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 00:30:08 KST 2017
 */

package com.sleepycat.je.dbi;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.sleepycat.je.DatabaseException;
import com.sleepycat.je.EnvironmentConfig;
import com.sleepycat.je.PreloadConfig;
import com.sleepycat.je.dbi.DatabaseImpl;
import com.sleepycat.je.dbi.PreloadLSNTreeWalker;
import com.sleepycat.je.dbi.SortedLSNTreeWalker;
import java.io.File;
import java.util.Properties;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class PreloadLSNTreeWalker_ESTest2 extends PreloadLSNTreeWalker_ESTest_scaffolding2 {

  @Test
  public void test0()  throws Throwable  {
      PreloadConfig preloadConfig0 = PreloadConfig.DEFAULT;
      DatabaseImpl databaseImpl0 = new DatabaseImpl();
      File file0 = null;
      EnvironmentConfig environmentConfig0 = null;
      try {
        environmentConfig0 = new EnvironmentConfig((Properties) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.EnvironmentMutableConfig", e);
      }
  }

  @Test
  public void test1()  throws Throwable  {
      PreloadConfig preloadConfig0 = new PreloadConfig();
      DatabaseImpl databaseImpl0 = new DatabaseImpl();
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

  @Test
  public void test2()  throws Throwable  {
      PreloadConfig preloadConfig0 = PreloadConfig.DEFAULT;
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
}
