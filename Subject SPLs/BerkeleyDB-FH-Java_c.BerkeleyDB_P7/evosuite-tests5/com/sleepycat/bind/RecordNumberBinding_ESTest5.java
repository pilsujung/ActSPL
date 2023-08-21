/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 08:51:34 KST 2017
 */

package com.sleepycat.bind;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.fail;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.sleepycat.je.DatabaseEntry;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class RecordNumberBinding_ESTest5 extends RecordNumberBinding_ESTest_scaffolding5 {

  @Test
  public void test0()  throws Throwable  {
      // Undeclared exception!
      try { 
        RecordNumberBinding.recordNumberToEntry((byte) (-54), (DatabaseEntry) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.bind.RecordNumberBinding", e);
      }
  }

  @Test
  public void test1()  throws Throwable  {
      RecordNumberBinding recordNumberBinding0 = new RecordNumberBinding();
      Double double0 = new Double(35.05997399969307);
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      // Undeclared exception!
      try { 
        recordNumberBinding0.objectToEntry(double0, databaseEntry0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.compat.DbCompat", e);
      }
  }




  @Test
  public void test5()  throws Throwable  {
      RecordNumberBinding recordNumberBinding0 = new RecordNumberBinding();
      Byte byte0 = new Byte((byte)93);
      // Undeclared exception!
      try { 
        recordNumberBinding0.objectToEntry(byte0, (DatabaseEntry) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.bind.RecordNumberBinding", e);
      }
  }

}
