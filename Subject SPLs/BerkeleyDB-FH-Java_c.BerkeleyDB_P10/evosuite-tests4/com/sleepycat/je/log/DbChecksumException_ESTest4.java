/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 14:51:19 KST 2017
 */

package com.sleepycat.je.log;

import org.junit.Test;
import static org.junit.Assert.*;
import com.sleepycat.je.dbi.EnvironmentImpl;
import com.sleepycat.je.log.DbChecksumException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class DbChecksumException_ESTest4 extends DbChecksumException_ESTest_scaffolding4 {

  @Test
  public void test0()  throws Throwable  {
      DbChecksumException dbChecksumException0 = new DbChecksumException((EnvironmentImpl) null, "");
      DbChecksumException dbChecksumException1 = new DbChecksumException((EnvironmentImpl) null, "", (Throwable) dbChecksumException0);
      assertFalse(dbChecksumException1.equals((Object)dbChecksumException0));
  }
}
