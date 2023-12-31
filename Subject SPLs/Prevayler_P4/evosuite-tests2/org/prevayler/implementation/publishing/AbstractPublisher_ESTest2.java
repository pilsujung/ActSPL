/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 07 21:36:01 KST 2017
 */

package org.prevayler.implementation.publishing;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import java.util.Date;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.prevayler.Clock;
import org.prevayler.implementation.Capsule;
import org.prevayler.implementation.TransactionTimestamp;
import org.prevayler.implementation.clock.BrokenClock;
import org.prevayler.implementation.clock.MachineClock;
import org.prevayler.implementation.clock.PausableClock;
import org.prevayler.implementation.journal.Journal;
import org.prevayler.implementation.journal.TransientJournal;
import org.prevayler.implementation.publishing.censorship.LiberalTransactionCensor;
import org.prevayler.implementation.publishing.censorship.TransactionCensor;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class AbstractPublisher_ESTest2 extends AbstractPublisher_ESTest_scaffolding2 {

  @Test
  public void test0()  throws Throwable  {
      Date date0 = new Date();
      MachineClock machineClock0 = new MachineClock();
      TransientJournal transientJournal0 = new TransientJournal();
      CentralPublisher centralPublisher0 = new CentralPublisher((Clock) machineClock0, (Journal) transientJournal0);
      TransactionTimestamp transactionTimestamp0 = new TransactionTimestamp((Capsule) null, (-39L), date0);
      centralPublisher0.notifySubscribers(transactionTimestamp0);
      assertEquals((-39L), transactionTimestamp0.systemVersion());
  }

  @Test
  public void test1()  throws Throwable  {
      MachineClock machineClock0 = new MachineClock();
      TransientJournal transientJournal0 = new TransientJournal();
      CentralPublisher centralPublisher0 = new CentralPublisher((Clock) machineClock0, (TransactionCensor) null, (Journal) transientJournal0);
      centralPublisher0.subscribe((TransactionSubscriber) null, 1L);
      Date date0 = machineClock0.time();
      TransactionTimestamp transactionTimestamp0 = new TransactionTimestamp((Capsule) null, (-2635L), date0);
      // Undeclared exception!
      try { 
        centralPublisher0.notifySubscribers(transactionTimestamp0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.prevayler.implementation.publishing.AbstractPublisher", e);
      }
  }

  @Test
  public void test2()  throws Throwable  {
      Date date0 = new Date(2832L);
      BrokenClock brokenClock0 = new BrokenClock(date0);
      TransientJournal transientJournal0 = new TransientJournal();
      CentralPublisher centralPublisher0 = new CentralPublisher((Clock) brokenClock0, (Journal) transientJournal0);
      PausableClock pausableClock0 = (PausableClock)centralPublisher0.clock();
      assertNotNull(pausableClock0);
  }

  @Test
  public void test3()  throws Throwable  {
      Date date0 = new Date(2832L);
      BrokenClock brokenClock0 = new BrokenClock(date0);
      TransientJournal transientJournal0 = new TransientJournal();
      CentralPublisher centralPublisher0 = new CentralPublisher((Clock) brokenClock0, (Journal) transientJournal0);
      centralPublisher0.cancelSubscription((TransactionSubscriber) null);
  }

  @Test
  public void test4()  throws Throwable  {
      TransientJournal transientJournal0 = new TransientJournal();
      BrokenClock brokenClock0 = new BrokenClock();
      LiberalTransactionCensor liberalTransactionCensor0 = new LiberalTransactionCensor();
      CentralPublisher centralPublisher0 = new CentralPublisher((Clock) brokenClock0, (TransactionCensor) liberalTransactionCensor0, (Journal) transientJournal0);
      centralPublisher0.addSubscriber((TransactionSubscriber) null);
  }
}
