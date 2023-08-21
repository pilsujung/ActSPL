/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 09:16:35 KST 2017
 */

package com.sleepycat.bind.tuple;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.fail;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class TupleTupleMarshalledKeyCreator_ESTest5 extends TupleTupleMarshalledKeyCreator_ESTest_scaffolding5 {

  @Test
  public void test0()  throws Throwable  {
      TupleTupleMarshalledKeyCreator tupleTupleMarshalledKeyCreator0 = new TupleTupleMarshalledKeyCreator((TupleTupleMarshalledBinding) null, "]J n6");
      byte[] byteArray0 = new byte[0];
      TupleInput tupleInput0 = new TupleInput(byteArray0);
      TupleOutput tupleOutput0 = TupleBase.newOutput();
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
      TupleTupleMarshalledKeyCreator tupleTupleMarshalledKeyCreator0 = new TupleTupleMarshalledKeyCreator((TupleTupleMarshalledBinding) null, " bin=");
      byte[] byteArray0 = new byte[7];
      TupleOutput tupleOutput0 = new TupleOutput(byteArray0);
      TupleInput tupleInput0 = new TupleInput(tupleOutput0);
      // Undeclared exception!
      try { 
        tupleTupleMarshalledKeyCreator0.createSecondaryKey(tupleInput0, (TupleInput) null, tupleOutput0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.bind.tuple.TupleTupleMarshalledKeyCreator", e);
      }
  }
}