/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 21 18:02:25 KST 2017
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
public class RecordNumberBinding_ESTest1 extends RecordNumberBinding_ESTest_scaffolding1 {

  @Test
  public void test0()  throws Throwable  {
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      // Undeclared exception!
      try { 
        RecordNumberBinding.recordNumberToEntry(0L, databaseEntry0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.compat.DbCompat", e);
      }
  }

  @Test
  public void test1()  throws Throwable  {
      RecordNumberBinding recordNumberBinding0 = new RecordNumberBinding();
      byte[] byteArray0 = new byte[1];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0);
      // Undeclared exception!
      try { 
        recordNumberBinding0.objectToEntry((Object) null, databaseEntry0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.bind.RecordNumberBinding", e);
      }
  }

  @Test
  public void test2()  throws Throwable  {
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      RecordNumberBinding recordNumberBinding0 = new RecordNumberBinding();
      // Undeclared exception!
      try { 
        recordNumberBinding0.objectToEntry(recordNumberBinding0, databaseEntry0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // com.sleepycat.bind.RecordNumberBinding cannot be cast to java.lang.Number
         //
         assertThrownBy("com.sleepycat.bind.RecordNumberBinding", e);
      }
  }

  @Test
  public void test3()  throws Throwable  {
      // Undeclared exception!
      try { 
        RecordNumberBinding.recordNumberToEntry(0L, (DatabaseEntry) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.bind.RecordNumberBinding", e);
      }
  }

  @Test
  public void test4()  throws Throwable  {
      // Undeclared exception!
      try { 
        RecordNumberBinding.entryToRecordNumber((DatabaseEntry) null);
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
      Float float0 = new Float((-3463.8F));
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      // Undeclared exception!
      try { 
        recordNumberBinding0.objectToEntry(float0, databaseEntry0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.compat.DbCompat", e);
      }
  }

  @Test
  public void test6()  throws Throwable  {
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      RecordNumberBinding recordNumberBinding0 = new RecordNumberBinding();
      // Undeclared exception!
      try { 
        recordNumberBinding0.entryToObject(databaseEntry0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.compat.DbCompat", e);
      }
  }
}
