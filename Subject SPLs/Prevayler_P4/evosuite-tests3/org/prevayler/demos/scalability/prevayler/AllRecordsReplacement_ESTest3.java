/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 07 16:31:33 KST 2017
 */

package org.prevayler.demos.scalability.prevayler;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.time.Instant;
import java.util.Date;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class AllRecordsReplacement_ESTest3 extends AllRecordsReplacement_ESTest_scaffolding3 {

  @Test
  public void test0()  throws Throwable  {
      AllRecordsReplacement allRecordsReplacement0 = new AllRecordsReplacement((-3796));
      Date date0 = new Date((-1L));
      // Undeclared exception!
      try { 
        allRecordsReplacement0.executeOn((Object) null, date0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.prevayler.demos.scalability.prevayler.AllRecordsReplacement", e);
      }
  }

  @Test
  public void test1()  throws Throwable  {
      AllRecordsReplacement allRecordsReplacement0 = new AllRecordsReplacement((-1));
      Date date0 = new Date();
      // Undeclared exception!
      try { 
        allRecordsReplacement0.executeOn(allRecordsReplacement0, date0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.prevayler.demos.scalability.prevayler.AllRecordsReplacement cannot be cast to org.prevayler.demos.scalability.prevayler.ScalabilitySystem
         //
         assertThrownBy("org.prevayler.demos.scalability.prevayler.AllRecordsReplacement", e);
      }
  }

  @Test
  public void test2()  throws Throwable  {
      AllRecordsReplacement allRecordsReplacement0 = new AllRecordsReplacement(0);
      QuerySystem querySystem0 = new QuerySystem();
      Instant instant0 = Instant.ofEpochSecond(1475L);
      Date date0 = Date.from(instant0);
      allRecordsReplacement0.executeOn(querySystem0, date0);
      assertEquals("Thu Jan 01 09:24:35 KST 1970", date0.toString());
  }
}
