/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 07 20:30:36 KST 2017
 */

package org.prevayler.foundation.network;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.fail;

import java.io.EOFException;
import java.io.IOException;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.EvoSuiteRemoteAddress;
import org.evosuite.runtime.testdata.NetworkHandling;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class OldNetworkImpl_ESTest2 extends OldNetworkImpl_ESTest_scaffolding2 {

  @Test
  public void test0()  throws Throwable  {
      OldNetworkImpl oldNetworkImpl0 = new OldNetworkImpl();
      // Undeclared exception!
      try { 
        oldNetworkImpl0.openSocket(">v^U)~j.7", (-3904));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // port out of range:-3904
         //
         assertThrownBy("java.net.InetSocketAddress", e);
      }
  }

  @Test
  public void test2()  throws Throwable  {
      OldNetworkImpl oldNetworkImpl0 = new OldNetworkImpl();
      oldNetworkImpl0.openObjectServerSocket(1741);
      try { 
        oldNetworkImpl0.openObjectServerSocket(1741);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Failed to open TCP port
         //
         assertThrownBy("org.evosuite.runtime.mock.java.net.EvoSuiteSocket", e);
      }
  }

  @Test
  public void test4()  throws Throwable  {
      OldNetworkImpl oldNetworkImpl0 = new OldNetworkImpl();
      // Undeclared exception!
      try { 
        oldNetworkImpl0.openObjectServerSocket((-1));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Port value out of range: -1
         //
         assertThrownBy("org.evosuite.runtime.mock.java.net.MockServerSocket", e);
      }
  }
}
