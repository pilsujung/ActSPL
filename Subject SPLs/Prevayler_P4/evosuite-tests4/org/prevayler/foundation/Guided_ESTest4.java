/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 07 10:41:54 KST 2017
 */

package org.prevayler.foundation;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.fail;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.time.Instant;
import java.util.Date;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.prevayler.implementation.Capsule;
import org.prevayler.implementation.TransactionGuide;
import org.prevayler.implementation.TransactionTimestamp;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class Guided_ESTest4 extends Guided_ESTest_scaffolding4 {

  @Test
  public void test1()  throws Throwable  {
      TransactionGuide transactionGuide0 = new TransactionGuide((TransactionTimestamp) null, (Turn) null);
      // Undeclared exception!
      try { 
        transactionGuide0.startTurn();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.prevayler.foundation.Guided", e);
      }
  }

  @Test
  public void test2()  throws Throwable  {
      TransactionGuide transactionGuide0 = new TransactionGuide((TransactionTimestamp) null, (Turn) null);
      // Undeclared exception!
      try { 
        transactionGuide0.endTurn();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.prevayler.foundation.Guided", e);
      }
  }

  @Test
  public void test3()  throws Throwable  {
      Instant instant0 = Instant.EPOCH;
      Date date0 = Date.from(instant0);
      TransactionTimestamp transactionTimestamp0 = new TransactionTimestamp((Capsule) null, (-501L), date0);
      Turn turn0 = Turn.first();
      TransactionGuide transactionGuide0 = new TransactionGuide(transactionTimestamp0, turn0);
      transactionGuide0.endTurn();
  }


  @Test
  public void test5()  throws Throwable  {
      Date date0 = new Date(0L);
      TransactionTimestamp transactionTimestamp0 = new TransactionTimestamp((Capsule) null, (-37L), date0);
      Turn turn0 = Turn.first();
      TransactionGuide transactionGuide0 = new TransactionGuide(transactionTimestamp0, turn0);
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(2395);
      // Undeclared exception!
      try { 
        transactionGuide0.writeTo(byteArrayOutputStream0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.prevayler.implementation.TransactionTimestamp", e);
      }
  }
}
