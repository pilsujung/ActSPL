/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 07 20:28:24 KST 2017
 */

package org.prevayler.foundation.network;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.fail;

import java.io.EOFException;
import java.io.IOException;
import java.io.StreamCorruptedException;
import java.net.SocketException;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.EvoSuiteLocalAddress;
import org.evosuite.runtime.testdata.NetworkHandling;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class ObjectServerSocketImpl_ESTest2 extends ObjectServerSocketImpl_ESTest_scaffolding2 {

  @Test
  public void test2()  throws Throwable  {
      ObjectServerSocketImpl objectServerSocketImpl0 = null;
      try {
        objectServerSocketImpl0 = new ObjectServerSocketImpl((-1));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Port value out of range: -1
         //
         assertThrownBy("org.evosuite.runtime.mock.java.net.MockServerSocket", e);
      }
  }

  @Test
  public void test4()  throws Throwable  {
      ObjectServerSocketImpl objectServerSocketImpl0 = new ObjectServerSocketImpl(31);
      objectServerSocketImpl0.close();
      try { 
        objectServerSocketImpl0.accept();
        fail("Expecting exception: SocketException");
      
      } catch(SocketException e) {
         //
         // Socket is closed
         //
         assertThrownBy("org.evosuite.runtime.mock.java.net.MockServerSocket", e);
      }
  }

  
}
