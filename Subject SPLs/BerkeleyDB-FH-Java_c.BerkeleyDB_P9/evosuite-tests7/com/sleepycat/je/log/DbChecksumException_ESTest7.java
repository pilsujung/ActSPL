/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 21 20:23:11 KST 2017
 */

package com.sleepycat.je.log;

import static org.junit.Assert.assertFalse;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.sleepycat.je.dbi.EnvironmentImpl;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class DbChecksumException_ESTest7 extends DbChecksumException_ESTest_scaffolding7 {

  @Test
  public void test0()  throws Throwable  {
      DbChecksumException dbChecksumException0 = new DbChecksumException((EnvironmentImpl) null, "I_TKf yFS=GA@2R");
      DbChecksumException dbChecksumException1 = new DbChecksumException((EnvironmentImpl) null, "", (Throwable) dbChecksumException0);
      assertFalse(dbChecksumException1.equals((Object)dbChecksumException0));
  }
}