/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 04:03:27 KST 2017
 */

package com.sleepycat.je;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class DatabaseUtil_ESTest3 extends DatabaseUtil_ESTest_scaffolding3 {


  @Test
  public void test1()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0, 0, (int) (byte) (-55));
      databaseEntry0.setPartial(3412, 0, true);
      // Undeclared exception!
      try { 
        DatabaseUtil.checkForPartialKey(databaseEntry0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // A partial key DatabaseEntry is not allowed
         //
         assertThrownBy("com.sleepycat.je.DatabaseUtil", e);
      }
  }

  @Test
  public void test2()  throws Throwable  {
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      DatabaseUtil.checkForPartialKey(databaseEntry0);
      assertEquals(0, databaseEntry0.getOffset());
  }

  @Test
  public void test3()  throws Throwable  {
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      // Undeclared exception!
      try { 
        DatabaseUtil.checkForNullDbt(databaseEntry0, (String) null, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Data field for DatabaseEntry null cannot be null
         //
         assertThrownBy("com.sleepycat.je.DatabaseUtil", e);
      }
  }

  @Test
  public void test4()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0);
      DatabaseUtil.checkForNullDbt(databaseEntry0, ">k::~\"7V^gDQWi(*e", true);
      assertEquals(0, databaseEntry0.getPartialOffset());
  }


  @Test
  public void test6()  throws Throwable  {
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      DatabaseUtil.checkForNullDbt(databaseEntry0, " offset=", false);
      assertEquals(0, databaseEntry0.getOffset());
  }

  @Test
  public void test7()  throws Throwable  {
      // Undeclared exception!
      try { 
        DatabaseUtil.checkForNullParam((Object) null, "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         //  cannot be null
         //
         assertThrownBy("com.sleepycat.je.DatabaseUtil", e);
      }
  }

  @Test
  public void test8()  throws Throwable  {
      Object object0 = new Object();
      DatabaseUtil.checkForNullParam(object0, " offset=");
  }

}