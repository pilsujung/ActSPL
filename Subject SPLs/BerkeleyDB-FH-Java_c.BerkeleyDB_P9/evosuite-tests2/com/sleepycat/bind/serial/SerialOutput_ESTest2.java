/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 21 23:16:54 KST 2017
 */

package com.sleepycat.bind.serial;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.sleepycat.bind.serial.ClassCatalog;
import com.sleepycat.bind.serial.SerialOutput;
import java.io.IOException;
import java.io.ObjectStreamClass;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class SerialOutput_ESTest2 extends SerialOutput_ESTest_scaffolding2 {


  @Test
  public void test1()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream(pipedInputStream0);
      SerialOutput serialOutput0 = new SerialOutput((OutputStream) pipedOutputStream0, (ClassCatalog) null);
      // Undeclared exception!
      try { 
        serialOutput0.writeClassDescriptor((ObjectStreamClass) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.bind.serial.SerialOutput", e);
      }
  }


}