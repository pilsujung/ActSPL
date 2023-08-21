/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 07 16:04:53 KST 2017
 */

package org.prevayler;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.fail;

import java.util.Date;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.prevayler.implementation.clock.MachineClock;
import org.prevayler.implementation.clock.PausableClock;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class Clock_ESTest3 extends Clock_ESTest_scaffolding3 {

  @Test
  public void test0()  throws Throwable  {
      MachineClock machineClock0 = new MachineClock();
      PausableClock pausableClock0 = new PausableClock((Clock) machineClock0);
      Date date0 = pausableClock0.time();
      //  // Unstable assertion: assertEquals("Fri Apr 07 16:04:51 KST 2017", date0.toString());
  }

  @Test
  public void test1()  throws Throwable  {
      PausableClock pausableClock0 = new PausableClock((Clock) null);
      // Undeclared exception!
      try { 
        pausableClock0.time();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.prevayler.implementation.clock.PausableClock", e);
      }
  }
}