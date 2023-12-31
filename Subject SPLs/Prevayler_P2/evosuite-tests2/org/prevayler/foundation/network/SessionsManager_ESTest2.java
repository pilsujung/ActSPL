/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 07 20:32:17 KST 2017
 */

package org.prevayler.foundation.network;

import static org.junit.Assert.assertNull;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class SessionsManager_ESTest2 extends SessionsManager_ESTest_scaffolding2 {

  @Test
  public void test0()  throws Throwable  {
      SessionsManagerImpl sessionsManagerImpl0 = new SessionsManagerImpl((-1L));
      NetworkSessionId networkSessionId0 = sessionsManagerImpl0.add((StubbornNetworkProxy) null);
      sessionsManagerImpl0.remove(networkSessionId0);
  }

  @Test
  public void test1()  throws Throwable  {
      SessionsManagerImpl sessionsManagerImpl0 = new SessionsManagerImpl((-1L));
      NetworkSessionId networkSessionId0 = sessionsManagerImpl0.add((StubbornNetworkProxy) null);
      StubbornNetworkProxy stubbornNetworkProxy0 = sessionsManagerImpl0.find(networkSessionId0);
      assertNull(stubbornNetworkProxy0);
  }
}
