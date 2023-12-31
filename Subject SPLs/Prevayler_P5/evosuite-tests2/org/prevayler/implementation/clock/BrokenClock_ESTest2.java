/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 07 21:31:01 KST 2017
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

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class BrokenClock_ESTest2 extends BrokenClock_ESTest_scaffolding2 {



  @Test
  public void test2()  throws Throwable  {
      BrokenClock brokenClock0 = new BrokenClock();
      Date date0 = new Date();
      brokenClock0.advanceTo(date0);
      brokenClock0.advanceTo(date0);
      //  // Unstable assertion: assertEquals("Fri Apr 07 21:30:58 KST 2017", date0.toString());
  }

  @Test
  public void test3()  throws Throwable  {
      Date date0 = new Date((-1720L));
      BrokenClock brokenClock0 = new BrokenClock(date0);
      brokenClock0._millis = 2619L;
      brokenClock0.advanceTo(date0);
      assertEquals("Thu Jan 01 08:59:58 KST 1970", date0.toString());
  }

}
