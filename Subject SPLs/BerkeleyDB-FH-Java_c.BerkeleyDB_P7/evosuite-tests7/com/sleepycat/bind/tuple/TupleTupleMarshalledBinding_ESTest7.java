/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 21 18:57:52 KST 2017
 */

package com.sleepycat.bind.tuple;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.fail;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class TupleTupleMarshalledBinding_ESTest7 extends TupleTupleMarshalledBinding_ESTest_scaffolding7 {

  @Test
  public void test0()  throws Throwable  {
      TupleTupleMarshalledBinding tupleTupleMarshalledBinding0 = null;
      try {
        tupleTupleMarshalledBinding0 = new TupleTupleMarshalledBinding((Class) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.lang.Class", e);
      }
  }

  @Test
  public void test1()  throws Throwable  {
      Class<Object> class0 = Object.class;
      TupleTupleMarshalledBinding tupleTupleMarshalledBinding0 = null;
      try {
        tupleTupleMarshalledBinding0 = new TupleTupleMarshalledBinding(class0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // class java.lang.Object does not implement MarshalledTupleKeyEntity
         //
         assertThrownBy("com.sleepycat.bind.tuple.TupleTupleMarshalledBinding", e);
      }
  }
}
