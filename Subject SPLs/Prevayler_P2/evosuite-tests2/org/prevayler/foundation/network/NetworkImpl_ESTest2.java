/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 07 20:24:32 KST 2017
 */

package org.prevayler.foundation.network;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.fail;

import java.io.IOException;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class NetworkImpl_ESTest2 extends NetworkImpl_ESTest_scaffolding2 {

  @Test
  public void test1()  throws Throwable  {
      NetworkImpl networkImpl0 = new NetworkImpl();
      // Undeclared exception!
      try { 
        networkImpl0.newReceiver((Service) null, (ObjectSocket) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.prevayler.foundation.network.NetworkClientObjectReceiverImpl", e);
      }
  }

  
}
