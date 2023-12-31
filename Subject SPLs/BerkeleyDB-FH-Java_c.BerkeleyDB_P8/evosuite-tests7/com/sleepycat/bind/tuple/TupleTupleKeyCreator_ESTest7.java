/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 21 18:57:14 KST 2017
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
public class TupleTupleKeyCreator_ESTest7 extends TupleTupleKeyCreator_ESTest_scaffolding7 {

  @Test
  public void test0()  throws Throwable  {
      TupleTupleMarshalledKeyCreator tupleTupleMarshalledKeyCreator0 = new TupleTupleMarshalledKeyCreator((TupleTupleMarshalledBinding) null, "jM/ <");
      byte[] byteArray0 = new byte[8];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0, (int) (byte)4, 0);
      DatabaseEntry databaseEntry1 = new DatabaseEntry();
      // Undeclared exception!
      try { 
        tupleTupleMarshalledKeyCreator0.createSecondaryKey((SecondaryDatabase) null, databaseEntry0, databaseEntry1, databaseEntry1);
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
      TupleTupleMarshalledKeyCreator tupleTupleMarshalledKeyCreator0 = new TupleTupleMarshalledKeyCreator((TupleTupleMarshalledBinding) null, "");
      byte[] byteArray0 = new byte[7];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0);
      DatabaseEntry databaseEntry1 = new DatabaseEntry();
      // Undeclared exception!
      try { 
        tupleTupleMarshalledKeyCreator0.createSecondaryKey((SecondaryDatabase) null, databaseEntry0, databaseEntry1, databaseEntry0);
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
      TupleTupleMarshalledKeyCreator tupleTupleMarshalledKeyCreator0 = new TupleTupleMarshalledKeyCreator((TupleTupleMarshalledBinding) null, "&");
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      // Undeclared exception!
      try { 
        tupleTupleMarshalledKeyCreator0.nullifyForeignKey((SecondaryDatabase) null, databaseEntry0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.bind.tuple.TupleTupleMarshalledKeyCreator", e);
      }
  }

  @Test
  public void test3()  throws Throwable  {
      TupleTupleMarshalledKeyCreator tupleTupleMarshalledKeyCreator0 = new TupleTupleMarshalledKeyCreator((TupleTupleMarshalledBinding) null, "]A");
      byte[] byteArray0 = new byte[2];
      tupleTupleMarshalledKeyCreator0.setTupleBufferSize((-3658));
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0, (int) (byte)17, (int) (byte)17);
      // Undeclared exception!
      try { 
        tupleTupleMarshalledKeyCreator0.nullifyForeignKey((SecondaryDatabase) null, databaseEntry0);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.bind.tuple.TupleBase", e);
      }
  }

  @Test
  public void test4()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      TupleTupleMarshalledKeyCreator tupleTupleMarshalledKeyCreator0 = new TupleTupleMarshalledKeyCreator((TupleTupleMarshalledBinding) null, "Z\"QyR@'5BYuAz");
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0);
      tupleTupleMarshalledKeyCreator0.setTupleBufferSize((byte) (-32));
      // Undeclared exception!
      try { 
        tupleTupleMarshalledKeyCreator0.createSecondaryKey((SecondaryDatabase) null, databaseEntry0, databaseEntry0, databaseEntry0);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.bind.tuple.TupleBase", e);
      }
  }

  @Test
  public void test5()  throws Throwable  {
      TupleTupleMarshalledKeyCreator tupleTupleMarshalledKeyCreator0 = new TupleTupleMarshalledKeyCreator((TupleTupleMarshalledBinding) null, " Database state must not be ");
      byte[] byteArray0 = new byte[9];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0, (int) (byte) (-128), 0);
      TupleInput tupleInput0 = TupleBase.entryToInput(databaseEntry0);
      Object object0 = new Object();
      TupleOutput tupleOutput0 = tupleTupleMarshalledKeyCreator0.getTupleOutput(object0);
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
  public void test6()  throws Throwable  {
      TupleTupleMarshalledKeyCreator tupleTupleMarshalledKeyCreator0 = new TupleTupleMarshalledKeyCreator((TupleTupleMarshalledBinding) null, "");
      byte[] byteArray0 = new byte[7];
      TupleInput tupleInput0 = new TupleInput(byteArray0);
      TupleOutput tupleOutput0 = new TupleOutput(byteArray0);
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
}
