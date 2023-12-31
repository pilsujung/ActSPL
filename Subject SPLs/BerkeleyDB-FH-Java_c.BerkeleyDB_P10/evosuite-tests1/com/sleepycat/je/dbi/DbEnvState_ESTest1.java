/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 21 19:24:36 KST 2017
 */

package com.sleepycat.je.dbi;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.fail;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.sleepycat.je.DatabaseException;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class DbEnvState_ESTest1 extends DbEnvState_ESTest_scaffolding1 {

  @Test
  public void test0()  throws Throwable  {
      DbEnvState dbEnvState0 = DbEnvState.INIT;
      String string0 = dbEnvState0.toString();
      assertEquals("initialized", string0);
  }

  @Test
  public void test1()  throws Throwable  {
      DbEnvState dbEnvState0 = DbEnvState.INIT;
      DbEnvState[] dbEnvStateArray0 = new DbEnvState[0];
      // Undeclared exception!
      try { 
        dbEnvState0.checkState(dbEnvStateArray0, (DbEnvState) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.dbi.DbEnvState", e);
      }
  }

  @Test
  public void test2()  throws Throwable  {
      DbEnvState dbEnvState0 = new DbEnvState("K*i{;)0b'V,xxW#M");
      DbEnvState[] dbEnvStateArray0 = new DbEnvState[11];
      dbEnvStateArray0[0] = dbEnvState0;
      dbEnvState0.checkState(dbEnvStateArray0, dbEnvState0);
  }

  @Test
  public void test3()  throws Throwable  {
      DbEnvState dbEnvState0 = DbEnvState.INIT;
      DbEnvState[] dbEnvStateArray0 = new DbEnvState[4];
      try { 
        dbEnvState0.checkState(dbEnvStateArray0, dbEnvState0);
        fail("Expecting exception: DatabaseException");
      
      } catch(DatabaseException e) {
         //
         // Can't go from environment state initialized to initialized
         //
         assertThrownBy("com.sleepycat.je.dbi.DbEnvState", e);
      }
  }

  @Test
  public void test4()  throws Throwable  {
      DbEnvState dbEnvState0 = new DbEnvState((String) null);
      String string0 = dbEnvState0.toString();
      assertNull(string0);
  }
}
