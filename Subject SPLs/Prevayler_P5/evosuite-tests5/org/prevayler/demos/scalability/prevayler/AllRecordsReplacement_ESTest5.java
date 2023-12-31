/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 06 20:05:09 KST 2017
 */

package org.prevayler.demos.scalability.prevayler;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.util.Date;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class AllRecordsReplacement_ESTest5 extends AllRecordsReplacement_ESTest_scaffolding5 {

  @Test
  public void test0()  throws Throwable  {
      AllRecordsReplacement allRecordsReplacement0 = new AllRecordsReplacement((-807));
      Date date0 = new Date();
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
      AllRecordsReplacement allRecordsReplacement0 = new AllRecordsReplacement(0);
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
      AllRecordsReplacement allRecordsReplacement0 = new AllRecordsReplacement((-1677));
      QuerySystem querySystem0 = new QuerySystem();
      Date date0 = new Date((long) (-1677));
      allRecordsReplacement0.executeOn(querySystem0, date0);
      assertEquals("Thu Jan 01 08:59:58 KST 1970", date0.toString());
  }
}
