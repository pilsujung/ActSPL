/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 21 18:10:58 KST 2017
 */

package com.sleepycat.bind.serial;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.fail;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class TupleSerialMarshalledKeyCreator_ESTest1 extends TupleSerialMarshalledKeyCreator_ESTest_scaffolding1 {

  @Test
  public void test0()  throws Throwable  {
      TupleSerialMarshalledKeyCreator tupleSerialMarshalledKeyCreator0 = null;
      try {
        tupleSerialMarshalledKeyCreator0 = new TupleSerialMarshalledKeyCreator((TupleSerialMarshalledBinding) null, "Exception while closing cursors:\n");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.bind.serial.TupleSerialMarshalledKeyCreator", e);
      }
  }

  @Test
  public void test1()  throws Throwable  {
      TupleSerialMarshalledBinding tupleSerialMarshalledBinding0 = new TupleSerialMarshalledBinding((SerialBinding) null);
      TupleSerialMarshalledKeyCreator tupleSerialMarshalledKeyCreator0 = null;
      try {
        tupleSerialMarshalledKeyCreator0 = new TupleSerialMarshalledKeyCreator(tupleSerialMarshalledBinding0, "@");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // dataBinding may not be null
         //
         assertThrownBy("com.sleepycat.bind.serial.TupleSerialMarshalledKeyCreator", e);
      }
  }
}