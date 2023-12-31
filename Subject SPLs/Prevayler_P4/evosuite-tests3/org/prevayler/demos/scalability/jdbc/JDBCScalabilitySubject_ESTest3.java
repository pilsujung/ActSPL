/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 07 16:29:58 KST 2017
 */

package org.prevayler.demos.scalability.jdbc;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.fail;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class JDBCScalabilitySubject_ESTest3 extends JDBCScalabilitySubject_ESTest_scaffolding3 {

  @Test
  public void test0()  throws Throwable  {
      JDBCTransactionSubject jDBCTransactionSubject0 = null;
      try {
        jDBCTransactionSubject0 = new JDBCTransactionSubject("|7LRzD<c WQf8", "|7LRzD<c WQf8", "|7LRzD<c WQf8", "|7LRzD<c WQf8");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Exception loading JDBC driver class: |7LRzD<c WQf8
         //
         assertThrownBy("org.prevayler.demos.scalability.jdbc.JDBCScalabilitySubject", e);
      }
  }
}
