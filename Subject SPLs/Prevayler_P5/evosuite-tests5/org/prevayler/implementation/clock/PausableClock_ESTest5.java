/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 06 22:57:43 KST 2017
 */

package org.prevayler.implementation.clock;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.util.Date;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.prevayler.Clock;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class PausableClock_ESTest5 extends PausableClock_ESTest_scaffolding5 {



  @Test
  public void test2()  throws Throwable  {
      MachineClock machineClock0 = new MachineClock();
      PausableClock pausableClock0 = new PausableClock((Clock) machineClock0);
      Date date0 = new Date();
      pausableClock0.advanceTo(date0);
      //  // Unstable assertion: assertEquals("Thu Apr 06 22:57:39 KST 2017", date0.toString());
  }


  @Test
  public void test4()  throws Throwable  {
      BrokenClock brokenClock0 = new BrokenClock();
      PausableClock pausableClock0 = new PausableClock((Clock) brokenClock0);
      pausableClock0.resume();
  }

  @Test
  public void test5()  throws Throwable  {
      Date date0 = new Date();
      BrokenClock brokenClock0 = new BrokenClock(date0);
      PausableClock pausableClock0 = new PausableClock((Clock) brokenClock0);
      Date date1 = pausableClock0.time();
      //  // Unstable assertion: assertEquals("Thu Apr 06 22:57:39 KST 2017", date1.toString());
  }



}