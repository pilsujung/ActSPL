/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 07 23:12:57 KST 2017
 */

package org.prevayler.demos.scalability.prevayler;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.fail;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.TooManyResourcesException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.prevayler.demos.scalability.RecordIterator;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class ScalabilitySystem_ESTest1 extends ScalabilitySystem_ESTest_scaffolding1 {

  @Test
  public void test0()  throws Throwable  {
      TransactionSystem transactionSystem0 = new TransactionSystem();
      RecordIterator recordIterator0 = new RecordIterator(2885);
      transactionSystem0.replaceAllRecords(recordIterator0);
      assertFalse(recordIterator0.hasNext());
  }

  @Test
  public void test1()  throws Throwable  {
      TransactionSystem transactionSystem0 = new TransactionSystem();
      RecordIterator recordIterator0 = new RecordIterator(10000000);
      // Undeclared exception!
      try { 
        transactionSystem0.replaceAllRecords(recordIterator0);
        fail("Expecting exception: TooManyResourcesException");
      
      } catch(TooManyResourcesException e) {
         //
         // Loop has been executed more times than the allowed 10000
         //
         assertThrownBy("org.evosuite.runtime.LoopCounter", e);
      }
  }

  @Test
  public void test2()  throws Throwable  {
      QuerySystem querySystem0 = new QuerySystem();
      // Undeclared exception!
      try { 
        querySystem0.replaceAllRecords((RecordIterator) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.prevayler.demos.scalability.prevayler.QuerySystem", e);
      }
  }
}
