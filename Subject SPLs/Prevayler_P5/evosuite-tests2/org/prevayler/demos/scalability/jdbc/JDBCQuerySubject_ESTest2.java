/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 07 19:51:07 KST 2017
 */

package org.prevayler.demos.scalability.jdbc;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.fail;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class JDBCQuerySubject_ESTest2 extends JDBCQuerySubject_ESTest_scaffolding2 {

  @Test
  public void test0()  throws Throwable  {
      JDBCQuerySubject jDBCQuerySubject0 = null;
      try {
        jDBCQuerySubject0 = new JDBCQuerySubject("", "", "/^v+NmRWNC(*ig)+^|", "/^v+NmRWNC(*ig)+^|");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Exception loading JDBC driver class: 
         //
         assertThrownBy("org.prevayler.demos.scalability.jdbc.JDBCScalabilitySubject", e);
      }
  }
}
