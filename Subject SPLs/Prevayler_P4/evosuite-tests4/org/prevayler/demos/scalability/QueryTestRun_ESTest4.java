/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 07 10:13:29 KST 2017
 */

package org.prevayler.demos.scalability;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.fail;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class QueryTestRun_ESTest4 extends QueryTestRun_ESTest_scaffolding4 {

  @Test
  public void test0()  throws Throwable  {
      int int0 = 0;
      QueryTestRun queryTestRun0 = null;
      try {
        queryTestRun0 = new QueryTestRun((ScalabilityTestSubject) null, 796, 54, 174);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.prevayler.demos.scalability.ScalabilityTestRun", e);
      }
  }

}
