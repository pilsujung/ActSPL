/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 21 23:21:06 KST 2017
 */

package com.sleepycat.bind.serial;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.sleepycat.bind.serial.SerialBase;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class SerialBase_ESTest2 extends SerialBase_ESTest_scaffolding2 {

  @Test
  public void test0()  throws Throwable  {
      SerialBase serialBase0 = new SerialBase();
      serialBase0.setSerialBufferSize((-330));
      int int0 = serialBase0.getSerialBufferSize();
      assertEquals((-330), int0);
  }

  @Test
  public void test1()  throws Throwable  {
      SerialBase serialBase0 = new SerialBase();
      serialBase0.setSerialBufferSize(1306);
      serialBase0.getSerialOutput(serialBase0);
      assertEquals(1306, serialBase0.getSerialBufferSize());
  }

  @Test
  public void test2()  throws Throwable  {
      SerialBase serialBase0 = new SerialBase();
      serialBase0.setSerialBufferSize((-330));
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        serialBase0.getSerialOutput(object0);
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
      serialBase0.getSerialOutput(serialBase0);
      assertEquals(0, serialBase0.getSerialBufferSize());
  }


  @Test
  public void test5()  throws Throwable  {
      SerialBase serialBase0 = new SerialBase();
      serialBase0.setSerialBufferSize(1149);
      int int0 = serialBase0.getSerialBufferSize();
      assertEquals(1149, int0);
  }
}
