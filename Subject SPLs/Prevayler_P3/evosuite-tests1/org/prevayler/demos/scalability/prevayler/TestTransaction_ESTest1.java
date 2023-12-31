/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 07 23:13:20 KST 2017
 */

package org.prevayler.demos.scalability.prevayler;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.fail;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.Date;
import java.util.Random;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.prevayler.demos.scalability.Record;
import org.prevayler.demos.scalability.RecordIterator;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class TestTransaction_ESTest1 extends TestTransaction_ESTest_scaffolding1 {

  @Test
  public void test0()  throws Throwable  {
      Instant instant0 = Instant.ofEpochMilli(0L);
      Date date0 = Date.from(instant0);
      Record record0 = new Record(0L, "snapshot", "snapshot", (BigDecimal) null, (BigDecimal) null, date0, date0);
      Random random0 = new Random();
      Record record1 = new Record(0L, random0);
      TestTransaction testTransaction0 = new TestTransaction(record0, record1, 0L);
  }

  @Test
  public void test1()  throws Throwable  {
      RecordIterator recordIterator0 = new RecordIterator(65);
      Record record0 = recordIterator0.next();
      TestTransaction testTransaction0 = new TestTransaction(record0, record0, 1L);
      // Undeclared exception!
      try { 
        testTransaction0.executeOn((Object) null, (Date) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.prevayler.demos.scalability.prevayler.TestTransaction", e);
      }
  }

  @Test
  public void test3()  throws Throwable  {
      Random random0 = new Random(0L);
      Record record0 = new Record(0L, random0);
      TestTransaction testTransaction0 = new TestTransaction(record0, record0, 2445L);
      Date date0 = record0.getDate2();
      // Undeclared exception!
      try { 
        testTransaction0.executeOn(date0, date0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.util.Date cannot be cast to org.prevayler.demos.scalability.prevayler.TransactionSystem
         //
         assertThrownBy("org.prevayler.demos.scalability.prevayler.TestTransaction", e);
      }
  }

  @Test
  public void test4()  throws Throwable  {
      Random random0 = new Random();
      Record record0 = new Record((-1L), random0);
      TestTransaction testTransaction0 = new TestTransaction(record0, record0, (-1L));
      TransactionSystem transactionSystem0 = new TransactionSystem();
      Date date0 = new Date();
      testTransaction0.executeOn(transactionSystem0, date0);
      //  // Unstable assertion: assertEquals("Fri Apr 07 23:13:05 KST 2017", date0.toString());
  }
}
