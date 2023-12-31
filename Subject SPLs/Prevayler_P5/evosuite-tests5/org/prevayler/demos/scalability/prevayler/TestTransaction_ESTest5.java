/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 06 20:13:47 KST 2017
 */

package org.prevayler.demos.scalability.prevayler;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.fail;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Random;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.prevayler.demos.scalability.Record;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class TestTransaction_ESTest5 extends TestTransaction_ESTest_scaffolding5 {

  @Test
  public void test0()  throws Throwable  {
      Random random0 = new Random();
      Record record0 = new Record(296L, random0);
      Date date0 = new Date();
      Record record1 = new Record(296L, " objects...", " objects...", (BigDecimal) null, (BigDecimal) null, date0, date0);
      TestTransaction testTransaction0 = new TestTransaction(record0, record1, 296L);
  }

  @Test
  public void test1()  throws Throwable  {
      Random random0 = new Random();
      Record record0 = new Record(296L, random0);
      Date date0 = new Date();
      TestTransaction testTransaction0 = new TestTransaction(record0, record0, 296L);
      TransactionSystem transactionSystem0 = new TransactionSystem();
      testTransaction0.executeOn(transactionSystem0, date0);
      //  // Unstable assertion: assertEquals("Thu Apr 06 20:13:44 KST 2017", date0.toString());
  }

  @Test
  public void test2()  throws Throwable  {
      TestTransaction testTransaction0 = new TestTransaction((Record) null, (Record) null, 867L);
      Date date0 = new Date();
      // Undeclared exception!
      try { 
        testTransaction0.executeOn((Object) null, date0);
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
      TestTransaction testTransaction0 = new TestTransaction((Record) null, (Record) null, (-929L));
      TransactionSystem transactionSystem0 = new TransactionSystem();
      // Undeclared exception!
      try { 
        testTransaction0.executeOn(transactionSystem0, (Date) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.prevayler.demos.scalability.prevayler.TransactionSystem", e);
      }
  }

  @Test
  public void test4()  throws Throwable  {
      Random random0 = new Random();
      Record record0 = new Record((-2703L), random0);
      TestTransaction testTransaction0 = new TestTransaction(record0, record0, (-2703L));
      Date date0 = new Date();
      // Undeclared exception!
      try { 
        testTransaction0.executeOn(random0, date0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.util.Random cannot be cast to org.prevayler.demos.scalability.prevayler.TransactionSystem
         //
         assertThrownBy("org.prevayler.demos.scalability.prevayler.TestTransaction", e);
      }
  }
}
