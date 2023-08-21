/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 07 10:16:38 KST 2017
 */

package org.prevayler.demos.scalability;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.fail;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class ScalabilityTestRun_ESTest4 extends ScalabilityTestRun_ESTest_scaffolding4 {


  @Test
  public void test1()  throws Throwable  {
      ScalabilityTestSubject scalabilityTestSubject0 = null;
      int int0 = 0;
      QueryTestRun queryTestRun0 = null;
      try {
        queryTestRun0 = new QueryTestRun((ScalabilityTestSubject) null, 0, 1, 1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.prevayler.demos.scalability.ScalabilityTestRun", e);
      }
  }

  @Test
  public void test2()  throws Throwable  {
      QueryTestRun queryTestRun0 = null;
      try {
        queryTestRun0 = new QueryTestRun((ScalabilityTestSubject) null, (-937), 407, (-937));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The minimum number of threads cannot be greater than the maximum number.
         //
         assertThrownBy("org.prevayler.demos.scalability.ScalabilityTestRun", e);
      }
  }

  @Test
  public void test3()  throws Throwable  {
      TransactionTestRun transactionTestRun0 = null;
      try {
        transactionTestRun0 = new TransactionTestRun((ScalabilityTestSubject) null, 2661, 914, 2661);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.prevayler.demos.scalability.ScalabilityTestRun", e);
      }
  }

}
