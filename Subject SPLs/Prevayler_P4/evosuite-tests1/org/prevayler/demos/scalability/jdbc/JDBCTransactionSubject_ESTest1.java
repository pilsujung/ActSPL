/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 08 13:04:28 KST 2017
 */

package org.prevayler.demos.scalability.jdbc;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.fail;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class JDBCTransactionSubject_ESTest1 extends JDBCTransactionSubject_ESTest_scaffolding1 {

  @Test
  public void test0()  throws Throwable  {
      JDBCTransactionSubject jDBCTransactionSubject0 = null;
      try {
        jDBCTransactionSubject0 = new JDBCTransactionSubject("JDBC", "JDBC", "JDBC", "JDBC");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Exception loading JDBC driver class: JDBC
         //
         assertThrownBy("org.prevayler.demos.scalability.jdbc.JDBCScalabilitySubject", e);
      }
  }
}
