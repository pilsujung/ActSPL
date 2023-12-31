/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 21 18:03:26 KST 2017
 */

package com.sleepycat.bind.serial;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class SerialBase_ESTest1 extends SerialBase_ESTest_scaffolding1 {

  @Test
  public void test0()  throws Throwable  {
      SerialBase serialBase0 = new SerialBase();
      serialBase0.setSerialBufferSize(386);
      int int0 = serialBase0.getSerialBufferSize();
      assertEquals(386, int0);
  }

  @Test
  public void test1()  throws Throwable  {
      SerialBase serialBase0 = new SerialBase();
      serialBase0.setSerialBufferSize((-1));
      int int0 = serialBase0.getSerialBufferSize();
      assertEquals((-1), int0);
  }

  @Test
  public void test2()  throws Throwable  {
      SerialBase serialBase0 = new SerialBase();
      serialBase0.setSerialBufferSize((-1902));
      // Undeclared exception!
      try { 
        serialBase0.getSerialOutput(serialBase0);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.util.FastOutputStream", e);
      }
  }

  @Test
  public void test3()  throws Throwable  {
      SerialBase serialBase0 = new SerialBase();
      int int0 = serialBase0.getSerialBufferSize();
      assertEquals(0, int0);
  }

  @Test
  public void test4()  throws Throwable  {
      SerialBase serialBase0 = new SerialBase();
      Integer integer0 = new Integer(1916);
      serialBase0.setSerialBufferSize(1916);
      serialBase0.getSerialOutput(integer0);
      assertEquals(1916, serialBase0.getSerialBufferSize());
  }

  @Test
  public void test5()  throws Throwable  {
      SerialBase serialBase0 = new SerialBase();
      Integer integer0 = new Integer(1916);
      serialBase0.getSerialOutput(integer0);
      assertEquals(0, serialBase0.getSerialBufferSize());
  }
}
