/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 07 10:32:13 KST 2017
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
public class TransactionSystem_ESTest4 extends TransactionSystem_ESTest_scaffolding4 {


  @Test
  public void test1()  throws Throwable  {
      TransactionSystem transactionSystem0 = new TransactionSystem();
      Record record0 = new Record(1760L);
      // Undeclared exception!
      try { 
        transactionSystem0.performTransaction(record0, (Record) null, (-1L));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test2()  throws Throwable  {
      TransactionSystem transactionSystem0 = new TransactionSystem();
      RecordIterator recordIterator0 = new RecordIterator((-1));
      transactionSystem0.replaceAllRecords(recordIterator0);
      assertFalse(recordIterator0.hasNext());
  }


  @Test
  public void test4()  throws Throwable  {
      TransactionSystem transactionSystem0 = new TransactionSystem();
      Date date0 = new Date(0L);
      Record record0 = new Record(1L, "", "", (BigDecimal) null, (BigDecimal) null, date0, date0);
      transactionSystem0.performTransaction(record0, record0, 0L);
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
