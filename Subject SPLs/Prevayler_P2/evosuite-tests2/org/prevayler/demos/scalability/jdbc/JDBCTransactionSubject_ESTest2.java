/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 07 19:53:58 KST 2017
 */

package org.prevayler.demos.scalability.jdbc;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.fail;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class JDBCTransactionSubject_ESTest2 extends JDBCTransactionSubject_ESTest_scaffolding2 {

  @Test
  public void test0()  throws Throwable  {
      JDBCTransactionSubject jDBCTransactionSubject0 = null;
      try {
        jDBCTransactionSubject0 = new JDBCTransactionSubject("-zd$A[s(Ah6p\"f", "-zd$A[s(Ah6p\"f", "0K", "0K");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Exception loading JDBC driver class: -zd$A[s(Ah6p\"f
         //
         assertThrownBy("org.prevayler.demos.scalability.jdbc.JDBCScalabilitySubject", e);
      }
  }
}
