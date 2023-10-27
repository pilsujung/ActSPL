/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 03:12:53 KST 2017
 */

package com.sleepycat.je.dbi;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.fail;

import java.io.File;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.sleepycat.je.DatabaseException;
import com.sleepycat.je.EnvironmentConfig;
import com.sleepycat.je.PreloadConfig;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class PreloadLSNTreeWalker_ESTest8 extends PreloadLSNTreeWalker_ESTest_scaffolding8 {

  @Test
  public void test0()  throws Throwable  {
      DatabaseImpl databaseImpl0 = new DatabaseImpl();
      EnvironmentImpl environmentImpl0 = null;
      try {
        environmentImpl0 = new EnvironmentImpl((File) null, (EnvironmentConfig) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.dbi.DbConfigManager", e);
      }
  }


}