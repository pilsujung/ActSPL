/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 21 22:59:59 KST 2017
 */

package com.sleepycat.bind.tuple;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.sleepycat.bind.tuple.TupleInput;
import com.sleepycat.bind.tuple.TupleInputBinding;
import com.sleepycat.je.DatabaseEntry;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class TupleInputBinding_ESTest10 extends TupleInputBinding_ESTest_scaffolding10 {



  @Test
  public void test2()  throws Throwable  {
      TupleInputBinding tupleInputBinding0 = new TupleInputBinding();
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
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
  public void test3()  throws Throwable  {
      TupleInputBinding tupleInputBinding0 = new TupleInputBinding();
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      TupleInput tupleInput0 = (TupleInput)tupleInputBinding0.entryToObject(databaseEntry0);
      tupleInputBinding0.objectToEntry(tupleInput0, databaseEntry0);
      assertEquals(0, databaseEntry0.getPartialOffset());
  }
}
