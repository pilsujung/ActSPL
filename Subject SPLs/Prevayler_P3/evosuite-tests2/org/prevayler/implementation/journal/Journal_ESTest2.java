/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 07 21:33:08 KST 2017
 */

package org.prevayler.implementation.journal;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.io.IOException;
import java.util.Date;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.prevayler.foundation.Turn;
import org.prevayler.implementation.Capsule;
import org.prevayler.implementation.TransactionGuide;
import org.prevayler.implementation.TransactionTimestamp;
import org.prevayler.implementation.publishing.POBox;
import org.prevayler.implementation.publishing.TransactionSubscriber;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class Journal_ESTest2 extends Journal_ESTest_scaffolding2 {

  @Test
  public void test0()  throws Throwable  {
      TransientJournal transientJournal0 = new TransientJournal();
      POBox pOBox0 = new POBox((TransactionSubscriber) null);
      transientJournal0.update(pOBox0, 0L);
  }

  @Test
  public void test1()  throws Throwable  {
      TransientJournal transientJournal0 = new TransientJournal();
      POBox pOBox0 = new POBox((TransactionSubscriber) null);
      transientJournal0.update(pOBox0, 0L);
      long long0 = transientJournal0.nextTransaction();
      assertEquals(0L, long0);
  }


  @Test
  public void test3()  throws Throwable  {
      TransientJournal transientJournal0 = new TransientJournal();
      POBox pOBox0 = new POBox((TransactionSubscriber) null);
      transientJournal0.update(pOBox0, 2864L);
      try { 
        transientJournal0.update(pOBox0, (-2452L));
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Unable to recover transaction -2452. The oldest recoverable transaction is 2864.
         //
         assertThrownBy("org.prevayler.implementation.journal.TransientJournal", e);
      }
  }


  @Test
  public void test5()  throws Throwable  {
      TransientJournal transientJournal0 = new TransientJournal();
      transientJournal0.update((TransactionSubscriber) null, 0L);
      // Undeclared exception!
      try { 
        transientJournal0.append((TransactionGuide) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.prevayler.implementation.journal.TransientJournal", e);
      }
  }

  @Test
  public void test6()  throws Throwable  {
      TransientJournal transientJournal0 = new TransientJournal();
      Date date0 = new Date();
      TransactionTimestamp transactionTimestamp0 = new TransactionTimestamp((Capsule) null, 1L, date0);
      Turn turn0 = Turn.first();
      TransactionGuide transactionGuide0 = new TransactionGuide(transactionTimestamp0, turn0);
      // Undeclared exception!
      try { 
        transientJournal0.append(transactionGuide0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Journal.update() has to be called at least once before Journal.journal().
         //
         assertThrownBy("org.prevayler.implementation.journal.TransientJournal", e);
      }
  }
}