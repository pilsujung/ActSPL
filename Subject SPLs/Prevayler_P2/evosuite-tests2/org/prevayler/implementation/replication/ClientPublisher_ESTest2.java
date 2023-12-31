/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 07 21:45:42 KST 2017
 */

package org.prevayler.implementation.replication;

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
import org.prevayler.foundation.network.OldNetwork;
import org.prevayler.foundation.network.OldNetworkImpl;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class ClientPublisher_ESTest2 extends ClientPublisher_ESTest_scaffolding2 {

  @Test
  public void test0()  throws Throwable  {
      ClientPublisher clientPublisher0 = null;
      try {
        clientPublisher0 = new ClientPublisher((OldNetwork) null, "", (-1284));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.prevayler.implementation.replication.ClientPublisher", e);
      }
  }

  @Test
  public void test1()  throws Throwable  {
      OldNetworkImpl oldNetworkImpl0 = new OldNetworkImpl();
      ClientPublisher clientPublisher0 = null;
      try {
        clientPublisher0 = new ClientPublisher((OldNetwork) oldNetworkImpl0, "The replication logic is still under development.", (-521));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // port out of range:-521
         //
         assertThrownBy("java.net.InetSocketAddress", e);
      }
  }

  
}
