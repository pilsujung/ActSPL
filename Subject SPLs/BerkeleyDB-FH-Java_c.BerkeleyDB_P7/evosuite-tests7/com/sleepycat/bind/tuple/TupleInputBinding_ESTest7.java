/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 21 18:54:24 KST 2017
 */

package com.sleepycat.bind.tuple;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.sleepycat.je.DatabaseEntry;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class TupleInputBinding_ESTest7 extends TupleInputBinding_ESTest_scaffolding7 {

  @Test
  public void test0()  throws Throwable  {
      TupleInputBinding tupleInputBinding0 = new TupleInputBinding();
      byte[] byteArray0 = new byte[9];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0);
      // Undeclared exception!
      try { 
        tupleInputBinding0.objectToEntry((Object) null, databaseEntry0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.bind.tuple.TupleBase", e);
      }
  }

  @Test
  public void test1()  throws Throwable  {
      TupleInputBinding tupleInputBinding0 = new TupleInputBinding();
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      // Undeclared exception!
      try { 
        tupleInputBinding0.objectToEntry(tupleInputBinding0, databaseEntry0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // com.sleepycat.bind.tuple.TupleInputBinding cannot be cast to com.sleepycat.bind.tuple.TupleInput
         //
         assertThrownBy("com.sleepycat.bind.tuple.TupleInputBinding", e);
      }
  }

  @Test
  public void test2()  throws Throwable  {
      TupleInputBinding tupleInputBinding0 = new TupleInputBinding();
      // Undeclared exception!
      try { 
        tupleInputBinding0.entryToObject((DatabaseEntry) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.bind.tuple.TupleBase", e);
      }
  }

  @Test
  public void test3()  throws Throwable  {
      TupleInputBinding tupleInputBinding0 = new TupleInputBinding();
      byte[] byteArray0 = new byte[3];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0);
      TupleInput tupleInput0 = (TupleInput)tupleInputBinding0.entryToObject(databaseEntry0);
      tupleInputBinding0.objectToEntry(tupleInput0, databaseEntry0);
      assertEquals(0, databaseEntry0.getPartialOffset());
  }
}
