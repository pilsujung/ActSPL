/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 09:15:23 KST 2017
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

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class TupleTupleKeyCreator_ESTest9 extends TupleTupleKeyCreator_ESTest_scaffolding9 {

  @Test
  public void test0()  throws Throwable  {
      TupleTupleMarshalledKeyCreator tupleTupleMarshalledKeyCreator0 = new TupleTupleMarshalledKeyCreator((TupleTupleMarshalledBinding) null, "");
      byte[] byteArray0 = new byte[7];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0, 1206, 0);
      DatabaseEntry databaseEntry1 = new DatabaseEntry();
      // Undeclared exception!
      try { 
        tupleTupleMarshalledKeyCreator0.createSecondaryKey((SecondaryDatabase) null, databaseEntry0, databaseEntry0, databaseEntry1);
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
      byte[] byteArray0 = new byte[19];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0, (int) (byte)1, 1164);
      TupleTupleMarshalledKeyCreator tupleTupleMarshalledKeyCreator0 = new TupleTupleMarshalledKeyCreator((TupleTupleMarshalledBinding) null, "Tua!");
      DatabaseEntry databaseEntry1 = new DatabaseEntry(byteArray0, 1164, 0);
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
  public void test3()  throws Throwable  {
      TupleTupleMarshalledKeyCreator tupleTupleMarshalledKeyCreator0 = new TupleTupleMarshalledKeyCreator((TupleTupleMarshalledBinding) null, "ua!");
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
  public void test4()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0, (int) (byte)1, 1164);
      TupleTupleMarshalledKeyCreator tupleTupleMarshalledKeyCreator0 = new TupleTupleMarshalledKeyCreator((TupleTupleMarshalledBinding) null, "Tua!");
      tupleTupleMarshalledKeyCreator0.setTupleBufferSize(Integer.MIN_VALUE);
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
  public void test5()  throws Throwable  {
      TupleTupleMarshalledKeyCreator tupleTupleMarshalledKeyCreator0 = new TupleTupleMarshalledKeyCreator((TupleTupleMarshalledBinding) null, "");
      byte[] byteArray0 = new byte[3];
      TupleOutput tupleOutput0 = TupleBase.newOutput(byteArray0);
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
  public void test6()  throws Throwable  {
      TupleTupleMarshalledKeyCreator tupleTupleMarshalledKeyCreator0 = new TupleTupleMarshalledKeyCreator((TupleTupleMarshalledBinding) null, "jJzb9642a,P9'Fb\"-l");
      byte[] byteArray0 = new byte[6];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0);
      tupleTupleMarshalledKeyCreator0.setTupleBufferSize((-5448));
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
  public void test7()  throws Throwable  {
      TupleTupleMarshalledKeyCreator tupleTupleMarshalledKeyCreator0 = new TupleTupleMarshalledKeyCreator((TupleTupleMarshalledBinding) null, "");
      TupleOutput tupleOutput0 = TupleBase.newOutput();
      // Undeclared exception!
      try { 
        tupleTupleMarshalledKeyCreator0.createSecondaryKey((TupleInput) null, (TupleInput) null, tupleOutput0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.bind.tuple.TupleTupleMarshalledKeyCreator", e);
      }
  }
}