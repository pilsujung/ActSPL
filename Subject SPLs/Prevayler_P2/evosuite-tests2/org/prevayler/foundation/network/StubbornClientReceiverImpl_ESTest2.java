/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 07 20:35:16 KST 2017
 */

package org.prevayler.foundation.network;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.fail;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.net.MockSocket;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class StubbornClientReceiverImpl_ESTest2 extends StubbornClientReceiverImpl_ESTest_scaffolding2 {

  @Test
  public void test2()  throws Throwable  {
      StubbornNetworkProxy stubbornNetworkProxy0 = new StubbornNetworkProxy();
      StubbornClientReceiverImpl stubbornClientReceiverImpl0 = new StubbornClientReceiverImpl((StubbornNetwork) null, "", 0, (ObjectReceiver) stubbornNetworkProxy0);
      // Undeclared exception!
      try { 
        stubbornClientReceiverImpl0.networkRequestToReceive("");
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.String cannot be cast to org.prevayler.foundation.network.NetworkSessionId
         //
         assertThrownBy("org.prevayler.foundation.network.StubbornClientReceiverImpl", e);
      }
  }

  @Test
  public void test3()  throws Throwable  {
      StubbornClientReceiverImpl stubbornClientReceiverImpl0 = new StubbornClientReceiverImpl((ObjectSocket) null, (Service) null);
      stubbornClientReceiverImpl0.run();
  }

  @Test
  public void test5()  throws Throwable  {
      StubbornNetworkImpl stubbornNetworkImpl0 = new StubbornNetworkImpl();
      StubbornClientReceiverImpl stubbornClientReceiverImpl0 = new StubbornClientReceiverImpl((StubbornNetwork) stubbornNetworkImpl0, (String) null, 103, (ObjectReceiver) null);
      stubbornClientReceiverImpl0.close();
  }

  @Test
  public void test6()  throws Throwable  {
      StubbornClientReceiverImpl stubbornClientReceiverImpl0 = new StubbornClientReceiverImpl((ObjectSocket) null, (Service) null);
      stubbornClientReceiverImpl0.networkRequestToReceive((Object) null);
      // Undeclared exception!
      try { 
        stubbornClientReceiverImpl0.close();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.prevayler.foundation.network.StubbornClientReceiverImpl", e);
      }
  }

  @Test
  public void test7()  throws Throwable  {
      StubbornNetworkImpl stubbornNetworkImpl0 = new StubbornNetworkImpl();
      StubbornNetworkProxy stubbornNetworkProxy0 = new StubbornNetworkProxy();
      SessionsManagerImpl sessionsManagerImpl0 = new SessionsManagerImpl(0);
      StubbornServerReceiverImpl stubbornServerReceiverImpl0 = new StubbornServerReceiverImpl((ObjectReceiver) stubbornNetworkProxy0, (Service) null, (SessionsManager) sessionsManagerImpl0);
      StubbornClientReceiverImpl stubbornClientReceiverImpl0 = (StubbornClientReceiverImpl)stubbornNetworkImpl0.findServer("RUs", 1, stubbornServerReceiverImpl0);
      NetworkSessionId networkSessionId0 = sessionsManagerImpl0.add(stubbornNetworkProxy0);
      stubbornClientReceiverImpl0.networkRequestToReceive(networkSessionId0);
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        stubbornClientReceiverImpl0.receive(object0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.prevayler.foundation.network.StubbornClientReceiverImpl", e);
      }
  }
}
