/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 00:56:15 KST 2017
 */

package com.sleepycat.je.log;

import static org.junit.Assert.assertEquals;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.sleepycat.je.dbi.EnvironmentImpl;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class DbChecksumException_ESTest6 extends DbChecksumException_ESTest_scaffolding6 {

  @Test
  public void test0()  throws Throwable  {
      DbChecksumException dbChecksumException0 = new DbChecksumException((EnvironmentImpl) null, "DcC>2,5\"0j~yc#.nA");
      DbChecksumException dbChecksumException1 = new DbChecksumException((EnvironmentImpl) null, "DcC>2,5\"0j~yc#.nA", (Throwable) dbChecksumException0);
      assertEquals("DcC>2,5\"0j~yc#.nA", dbChecksumException1.getMessage());
  }
}