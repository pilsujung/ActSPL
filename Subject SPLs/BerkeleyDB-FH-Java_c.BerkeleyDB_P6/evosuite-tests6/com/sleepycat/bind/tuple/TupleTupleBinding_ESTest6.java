/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 21 23:02:11 KST 2017
 */

package com.sleepycat.bind.tuple;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.fail;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class TupleTupleBinding_ESTest6 extends TupleTupleBinding_ESTest_scaffolding6 {

  @Test
  public void test0()  throws Throwable  {
      Class<String> class0 = String.class;
      TupleTupleMarshalledBinding tupleTupleMarshalledBinding0 = null;
      try {
        tupleTupleMarshalledBinding0 = new TupleTupleMarshalledBinding(class0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // class java.lang.String does not implement MarshalledTupleKeyEntity
         //
         assertThrownBy("com.sleepycat.bind.tuple.TupleTupleMarshalledBinding", e);
      }
  }
}