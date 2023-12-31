/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 21 18:33:41 KST 2017
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
public class DatabaseException_ESTest1 extends DatabaseException_ESTest_scaffolding1 {

  @Test
  public void test0()  throws Throwable  {
      DatabaseException databaseException0 = new DatabaseException("q:s<so");
      DatabaseException databaseException1 = new DatabaseException((Throwable) databaseException0);
      assertEquals("com.sleepycat.je.DatabaseException: com.sleepycat.je.DatabaseException: q:s<so", databaseException1.toString());
  }

  @Test
  public void test1()  throws Throwable  {
      DatabaseException databaseException0 = new DatabaseException();
      assertNull(databaseException0.getMessage());
  }

  @Test
  public void test2()  throws Throwable  {
      DatabaseException databaseException0 = new DatabaseException("q:s<so");
      DatabaseException databaseException1 = new DatabaseException((String) null, (Throwable) databaseException0);
      assertFalse(databaseException1.equals((Object)databaseException0));
  }
}
