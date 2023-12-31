/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 07 23:12:45 KST 2017
 */

package org.prevayler.demos.scalability.prevayler;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.fail;

import java.util.List;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.TooManyResourcesException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.prevayler.demos.scalability.RecordIterator;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class QuerySystem_ESTest1 extends QuerySystem_ESTest_scaffolding1 {

  @Test
  public void test0()  throws Throwable  {
      QuerySystem querySystem0 = new QuerySystem();
      RecordIterator recordIterator0 = new RecordIterator(10000000);
      // Undeclared exception!
      try { 
        querySystem0.replaceAllRecords(recordIterator0);
        fail("Expecting exception: TooManyResourcesException");
      
      } catch(TooManyResourcesException e) {
         //
         // Loop has been executed more times than the allowed 10000
         //
         assertThrownBy("org.evosuite.runtime.LoopCounter", e);
      }
  }

  @Test
  public void test1()  throws Throwable  {
      QuerySystem querySystem0 = new QuerySystem();
      // Undeclared exception!
      try { 
        querySystem0.replaceAllRecords((RecordIterator) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test2()  throws Throwable  {
      QuerySystem querySystem0 = new QuerySystem();
      List list0 = querySystem0.queryByName("...");
      assertNull(list0);
  }

  @Test
  public void test3()  throws Throwable  {
      QuerySystem querySystem0 = new QuerySystem();
      RecordIterator recordIterator0 = new RecordIterator(183);
      querySystem0.replaceAllRecords(recordIterator0);
      assertFalse(recordIterator0.hasNext());
  }
}
