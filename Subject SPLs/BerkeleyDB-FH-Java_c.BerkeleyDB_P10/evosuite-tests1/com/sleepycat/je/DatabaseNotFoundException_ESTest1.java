/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 21 18:33:53 KST 2017
 */

package com.sleepycat.je;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class DatabaseNotFoundException_ESTest1 extends DatabaseNotFoundException_ESTest_scaffolding1 {

  @Test
  public void test0()  throws Throwable  {
      DatabaseNotFoundException databaseNotFoundException0 = new DatabaseNotFoundException("#R-l7Y", (Throwable) null);
      DatabaseNotFoundException databaseNotFoundException1 = new DatabaseNotFoundException((Throwable) databaseNotFoundException0);
      assertFalse(databaseNotFoundException0.equals((Object)databaseNotFoundException1));
  }

  @Test
  public void test1()  throws Throwable  {
      DatabaseNotFoundException databaseNotFoundException0 = new DatabaseNotFoundException();
      assertNull(databaseNotFoundException0.getMessage());
  }

  @Test
  public void test2()  throws Throwable  {
      DatabaseNotFoundException databaseNotFoundException0 = new DatabaseNotFoundException("#R-l7Y");
      assertEquals("com.sleepycat.je.DatabaseNotFoundException: #R-l7Y", databaseNotFoundException0.toString());
  }
}
