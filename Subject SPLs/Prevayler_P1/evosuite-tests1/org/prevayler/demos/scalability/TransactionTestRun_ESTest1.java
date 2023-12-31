/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 08 13:00:22 KST 2017
 */

package org.prevayler.demos.scalability;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.fail;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class TransactionTestRun_ESTest1 extends TransactionTestRun_ESTest_scaffolding1 {

  @Test
  public void test0()  throws Throwable  {
      TransactionTestRun transactionTestRun0 = null;
      try {
        transactionTestRun0 = new TransactionTestRun((ScalabilityTestSubject) null, 79, 79, 79);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.prevayler.demos.scalability.ScalabilityTestRun", e);
      }
  }

  @Test
  public void test1()  throws Throwable  {
      TransactionTestRun transactionTestRun0 = null;
      try {
        transactionTestRun0 = new TransactionTestRun((ScalabilityTestSubject) null, 2, 2, (-2466));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The minimum number of threads cannot be greater than the maximum number.
         //
         assertThrownBy("org.prevayler.demos.scalability.ScalabilityTestRun", e);
      }
  }
}
