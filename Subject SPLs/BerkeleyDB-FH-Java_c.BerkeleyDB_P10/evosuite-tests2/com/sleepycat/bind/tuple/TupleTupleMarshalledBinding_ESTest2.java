/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 21 22:56:37 KST 2017
 */

package com.sleepycat.bind.tuple;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.sleepycat.bind.tuple.TupleTupleMarshalledBinding;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class TupleTupleMarshalledBinding_ESTest2 extends TupleTupleMarshalledBinding_ESTest_scaffolding2 {


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