/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 08 13:03:42 KST 2017
 */

package org.prevayler.demos.scalability.jdbc;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.fail;

import java.sql.Connection;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class JDBCTransactionConnection_ESTest1 extends JDBCTransactionConnection_ESTest_scaffolding1 {

  @Test
  public void test0()  throws Throwable  {
      JDBCTransactionConnection jDBCTransactionConnection0 = null;
      try {
        jDBCTransactionConnection0 = new JDBCTransactionConnection((Connection) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.prevayler.demos.scalability.jdbc.JDBCScalabilityConnection", e);
      }
  }
}
