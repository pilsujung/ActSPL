/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 09:00:56 KST 2017
 */

package com.sleepycat.bind.serial;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.fail;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class TupleSerialMarshalledKeyCreator_ESTest5 extends TupleSerialMarshalledKeyCreator_ESTest_scaffolding5 {


  @Test
  public void test1()  throws Throwable  {
      TupleSerialMarshalledBinding tupleSerialMarshalledBinding0 = new TupleSerialMarshalledBinding((SerialBinding) null);
      TupleSerialMarshalledKeyCreator tupleSerialMarshalledKeyCreator0 = null;
      try {
        tupleSerialMarshalledKeyCreator0 = new TupleSerialMarshalledKeyCreator(tupleSerialMarshalledBinding0, "8rEP}jXQXj>1w{LV9");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // dataBinding may not be null
         //
         assertThrownBy("com.sleepycat.bind.serial.TupleSerialMarshalledKeyCreator", e);
      }
  }
}
