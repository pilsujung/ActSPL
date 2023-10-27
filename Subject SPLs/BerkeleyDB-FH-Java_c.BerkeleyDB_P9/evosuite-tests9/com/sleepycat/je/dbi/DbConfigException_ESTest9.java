/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 10:22:10 KST 2017
 */

package com.sleepycat.je.dbi;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class DbConfigException_ESTest9 extends DbConfigException_ESTest_scaffolding9 {

  @Test
  public void test0()  throws Throwable  {
      DbConfigException dbConfigException0 = new DbConfigException("18<NW?[,*S_");
      DbConfigException dbConfigException1 = new DbConfigException((Throwable) dbConfigException0);
      assertEquals("com.sleepycat.je.dbi.DbConfigException: com.sleepycat.je.dbi.DbConfigException: 18<NW?[,*S_", dbConfigException1.toString());
  }

  @Test
  public void test1()  throws Throwable  {
      DbConfigException dbConfigException0 = new DbConfigException("18<NW?[,*S_");
      DbConfigException dbConfigException1 = new DbConfigException("18<NW?[,*S_", (Throwable) dbConfigException0);
      assertFalse(dbConfigException0.equals((Object)dbConfigException1));
  }
}