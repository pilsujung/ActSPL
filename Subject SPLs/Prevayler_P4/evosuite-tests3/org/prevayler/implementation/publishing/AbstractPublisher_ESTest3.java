/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 07 18:50:18 KST 2017
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
import org.prevayler.implementation.clock.MachineClock;
import org.prevayler.implementation.clock.PausableClock;
import org.prevayler.implementation.journal.Journal;
import org.prevayler.implementation.journal.TransientJournal;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class AbstractPublisher_ESTest3 extends AbstractPublisher_ESTest_scaffolding3 {

  @Test
  public void test0()  throws Throwable  {
      MachineClock machineClock0 = new MachineClock();
      TransientJournal transientJournal0 = new TransientJournal();
      CentralPublisher centralPublisher0 = new CentralPublisher((Clock) machineClock0, (Journal) transientJournal0);
      centralPublisher0.addSubscriber((TransactionSubscriber) null);
  }

  @Test
  public void test1()  throws Throwable  {
      MachineClock machineClock0 = new MachineClock();
      PausableClock pausableClock0 = new PausableClock((Clock) machineClock0);
      TransientJournal transientJournal0 = new TransientJournal();
      CentralPublisher centralPublisher0 = new CentralPublisher((Clock) pausableClock0, (Journal) transientJournal0);
      Date date0 = pausableClock0.time();
      TransactionTimestamp transactionTimestamp0 = new TransactionTimestamp((Capsule) null, 0L, date0);
      centralPublisher0.notifySubscribers(transactionTimestamp0);
      assertEquals(0L, transactionTimestamp0.systemVersion());
  }

  @Test
  public void test2()  throws Throwable  {
      TransientJournal transientJournal0 = new TransientJournal();
      CentralPublisher centralPublisher0 = new CentralPublisher((Clock) null, (Journal) transientJournal0);
      centralPublisher0.subscribe((TransactionSubscriber) null, 1157L);
      Date date0 = new Date();
      TransactionTimestamp transactionTimestamp0 = new TransactionTimestamp((Capsule) null, (-1L), date0);
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
  public void test3()  throws Throwable  {
      TransientJournal transientJournal0 = new TransientJournal();
      CentralPublisher centralPublisher0 = new CentralPublisher((Clock) null, (Journal) transientJournal0);
      PausableClock pausableClock0 = (PausableClock)centralPublisher0.clock();
      assertNotNull(pausableClock0);
  }

}
