/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 21 18:58:32 KST 2017
 */

package com.sleepycat.bind.tuple;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.fail;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.sleepycat.je.DatabaseEntry;
import com.sleepycat.je.SecondaryDatabase;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class TupleTupleMarshalledKeyCreator_ESTest7 extends TupleTupleMarshalledKeyCreator_ESTest_scaffolding7 {

  @Test
  public void test0()  throws Throwable  {
      TupleTupleMarshalledKeyCreator tupleTupleMarshalledKeyCreator0 = new TupleTupleMarshalledKeyCreator((TupleTupleMarshalledBinding) null, "");
      TupleOutput tupleOutput0 = new TupleOutput();
      TupleInput tupleInput0 = new TupleInput(tupleOutput0);
      // Undeclared exception!
      try { 
        tupleTupleMarshalledKeyCreator0.nullifyForeignKey(tupleInput0, tupleOutput0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.bind.tuple.TupleTupleMarshalledKeyCreator", e);
      }
  }

  @Test
  public void test1()  throws Throwable  {
      TupleOutput tupleOutput0 = new TupleOutput();
      TupleInput tupleInput0 = new TupleInput(tupleOutput0);
      TupleTupleMarshalledKeyCreator tupleTupleMarshalledKeyCreator0 = new TupleTupleMarshalledKeyCreator((TupleTupleMarshalledBinding) null, (String) null);
      // Undeclared exception!
      try { 
        tupleTupleMarshalledKeyCreator0.createSecondaryKey(tupleInput0, tupleInput0, tupleOutput0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.bind.tuple.TupleTupleMarshalledKeyCreator", e);
      }
  }

  @Test
  public void test2()  throws Throwable  {
      TupleTupleMarshalledKeyCreator tupleTupleMarshalledKeyCreator0 = new TupleTupleMarshalledKeyCreator((TupleTupleMarshalledBinding) null, "'B2m");
      byte[] byteArray0 = new byte[7];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0);
      // Undeclared exception!
      try { 
        tupleTupleMarshalledKeyCreator0.createSecondaryKey((SecondaryDatabase) null, databaseEntry0, databaseEntry0, databaseEntry0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.bind.tuple.TupleTupleMarshalledKeyCreator", e);
      }
  }
}
