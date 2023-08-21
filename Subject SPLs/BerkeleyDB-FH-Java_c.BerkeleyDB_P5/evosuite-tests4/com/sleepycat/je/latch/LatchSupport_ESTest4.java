/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 14:46:18 KST 2017
 */

package com.sleepycat.je.latch;

import org.junit.Test;
import static org.junit.Assert.*;
import com.sleepycat.je.dbi.EnvironmentImpl;
import com.sleepycat.je.latch.Java5LatchImpl;
import com.sleepycat.je.latch.Java5SharedLatchImpl;
import com.sleepycat.je.latch.LatchSupport;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class LatchSupport_ESTest4 extends LatchSupport_ESTest_scaffolding4 {

  @Test
  public void test04()  throws Throwable  {
      EnvironmentImpl environmentImpl0 = null;
      Java5LatchImpl java5LatchImpl0 = (Java5LatchImpl)LatchSupport.makeLatch(environmentImpl0);
      assertNotNull(java5LatchImpl0);
  }

  @Test
  public void test05()  throws Throwable  {
      Class class0 = LatchSupport.getJava5LatchClass();
      assertFalse(class0.isEnum());
  }

  
}
