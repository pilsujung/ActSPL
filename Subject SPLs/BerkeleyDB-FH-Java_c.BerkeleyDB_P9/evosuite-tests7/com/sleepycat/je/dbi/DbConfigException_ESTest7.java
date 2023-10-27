/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 21 20:05:16 KST 2017
 */

package com.sleepycat.je.dbi;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class DbConfigException_ESTest7 extends DbConfigException_ESTest_scaffolding7 {

  @Test
  public void test0()  throws Throwable  {
      DbConfigException dbConfigException0 = new DbConfigException("");
      DbConfigException dbConfigException1 = new DbConfigException((Throwable) dbConfigException0);
      assertEquals("com.sleepycat.je.dbi.DbConfigException: com.sleepycat.je.dbi.DbConfigException: ", dbConfigException1.toString());
  }

  @Test
  public void test1()  throws Throwable  {
      DbConfigException dbConfigException0 = new DbConfigException("");
      DbConfigException dbConfigException1 = new DbConfigException("", (Throwable) dbConfigException0);
      assertFalse(dbConfigException0.equals((Object)dbConfigException1));
  }
}