/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 21 19:31:29 KST 2017
 */

package com.sleepycat.je;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.fail;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.sleepycat.bind.tuple.TupleTupleMarshalledBinding;
import com.sleepycat.bind.tuple.TupleTupleMarshalledKeyCreator;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class SecondaryKeyCreator_ESTest7 extends SecondaryKeyCreator_ESTest_scaffolding7 {

  @Test
  public void test0()  throws Throwable  {
      TupleTupleMarshalledKeyCreator tupleTupleMarshalledKeyCreator0 = new TupleTupleMarshalledKeyCreator((TupleTupleMarshalledBinding) null, "pL.");
      byte[] byteArray0 = new byte[9];
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