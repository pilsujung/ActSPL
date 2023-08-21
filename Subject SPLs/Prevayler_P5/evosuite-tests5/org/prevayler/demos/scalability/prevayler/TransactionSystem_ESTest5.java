/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 06 20:14:47 KST 2017
 */

package org.prevayler.demos.scalability.prevayler;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.fail;

import java.math.BigDecimal;
import java.util.Date;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.TooManyResourcesException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.prevayler.demos.scalability.Record;
import org.prevayler.demos.scalability.RecordIterator;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class TransactionSystem_ESTest5 extends TransactionSystem_ESTest_scaffolding5 {



  @Test
  public void test2()  throws Throwable  {
      TransactionSystem transactionSystem0 = new TransactionSystem();
      // Undeclared exception!
      try { 
        transactionSystem0.performTransaction((Record) null, (Record) null, 2077L);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test3()  throws Throwable  {
      TransactionSystem transactionSystem0 = new TransactionSystem();
      Record record0 = new Record(0L);
      Date date0 = record0.getDate1();
      Record record1 = new Record(1L, "SGd", "SGd", (BigDecimal) null, (BigDecimal) null, date0, date0);
      transactionSystem0.performTransaction(record0, record1, 0L);
      // Undeclared exception!
      try { 
        transactionSystem0.hashCode();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.prevayler.demos.scalability.Record", e);
      }
  }


}
