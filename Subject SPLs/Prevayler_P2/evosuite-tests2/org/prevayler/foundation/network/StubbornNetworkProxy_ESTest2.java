/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 07 20:40:25 KST 2017
 */

package org.prevayler.foundation.network;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.fail;

import java.io.IOException;
import java.net.Inet4Address;
import java.net.InetAddress;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.net.MockInetAddress;
import org.evosuite.runtime.mock.java.net.MockSocket;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class StubbornNetworkProxy_ESTest2 extends StubbornNetworkProxy_ESTest_scaffolding2 {

  @Test
  public void test0()  throws Throwable  {
      StubbornNetworkProxy stubbornNetworkProxy0 = new StubbornNetworkProxy();
      SessionsManagerImpl sessionsManagerImpl0 = new SessionsManagerImpl();
      SessionsManagerImpl sessionsManagerImpl1 = new SessionsManagerImpl();
      NetworkSessionId networkSessionId0 = new NetworkSessionId((-1L), 420);
      networkSessionId0.toString();
      sessionsManagerImpl1.remove(networkSessionId0);
      NetworkSessionId networkSessionId1 = sessionsManagerImpl1.add(stubbornNetworkProxy0);
      sessionsManagerImpl0.remove(networkSessionId1);
      StubbornServerReceiverImpl stubbornServerReceiverImpl0 = new StubbornServerReceiverImpl((ObjectReceiver) stubbornNetworkProxy0, (Service) null, (SessionsManager) sessionsManagerImpl0);
      stubbornNetworkProxy0.close();
      stubbornNetworkProxy0.connect(stubbornServerReceiverImpl0, stubbornServerReceiverImpl0);
      // Undeclared exception!
      try { 
        stubbornNetworkProxy0.receive(stubbornNetworkProxy0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.prevayler.foundation.network.StubbornNetworkProxy cannot be cast to org.prevayler.foundation.network.NetworkSessionId
         //
         assertThrownBy("org.prevayler.foundation.network.StubbornServerReceiverImpl", e);
      }
  }

  @Test
  public void test2()  throws Throwable  {
      SessionsManagerImpl sessionsManagerImpl0 = new SessionsManagerImpl(3153L);
      StubbornNetworkProxy stubbornNetworkProxy0 = new StubbornNetworkProxy();
      stubbornNetworkProxy0.disconnect();
      NetworkSessionId networkSessionId0 = sessionsManagerImpl0.add(stubbornNetworkProxy0);
      StubbornNetworkProxy stubbornNetworkProxy1 = sessionsManagerImpl0.find(networkSessionId0);
      stubbornNetworkProxy1.setClient(stubbornNetworkProxy0);
      networkSessionId0.toString();
      stubbornNetworkProxy1.setClient(stubbornNetworkProxy0);
      stubbornNetworkProxy1.setClient(stubbornNetworkProxy0);
      stubbornNetworkProxy0.disconnect();
      stubbornNetworkProxy0.close();
      stubbornNetworkProxy0.getClient();
      StubbornNetworkProxy stubbornNetworkProxy2 = new StubbornNetworkProxy();
      Service service0 = null;
      StubbornNetworkImpl stubbornNetworkImpl0 = new StubbornNetworkImpl();
      String string0 = null;
      int int0 = 526;
      // Undeclared exception!
      try { 
        stubbornNetworkImpl0.newInstance("LFvX/r", (-1581));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // port out of range:-1581
         //
         assertThrownBy("java.net.InetSocketAddress", e);
      }
  }

  @Test
  public void test3()  throws Throwable  {
      StubbornNetworkProxy stubbornNetworkProxy0 = new StubbornNetworkProxy();
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte)100;
      byteArray0[2] = (byte)0;
      byteArray0[3] = (byte)0;
      Inet4Address inet4Address0 = (Inet4Address)MockInetAddress.getByAddress(byteArray0);
      MockSocket mockSocket0 = null;
      try {
        mockSocket0 = new MockSocket((InetAddress) inet4Address0, (int) (byte)100, false);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Remote address/port is not opened: org.evosuite.runtime.vnet.EndPointInfo@be59837
         //
         assertThrownBy("org.evosuite.runtime.vnet.VirtualNetwork", e);
      }
  }
}
