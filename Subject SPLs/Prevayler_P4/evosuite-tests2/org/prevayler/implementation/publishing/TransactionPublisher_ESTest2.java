/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 07 21:42:24 KST 2017
 */

package org.prevayler.implementation.publishing;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import java.io.IOException;
import java.util.Date;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.prevayler.Clock;
import org.prevayler.implementation.Capsule;
import org.prevayler.implementation.clock.BrokenClock;
import org.prevayler.implementation.clock.MachineClock;
import org.prevayler.implementation.clock.PausableClock;
import org.prevayler.implementation.journal.Journal;
import org.prevayler.implementation.journal.TransientJournal;
import org.prevayler.implementation.publishing.censorship.LiberalTransactionCensor;
import org.prevayler.implementation.publishing.censorship.TransactionCensor;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class TransactionPublisher_ESTest2 extends TransactionPublisher_ESTest_scaffolding2 {

  @Test
  public void test0()  throws Throwable  {
      MachineClock machineClock0 = new MachineClock();
      TransientJournal transientJournal0 = new TransientJournal();
      CentralPublisher centralPublisher0 = new CentralPublisher((Clock) machineClock0, (Journal) transientJournal0);
      centralPublisher0.subscribe((TransactionSubscriber) null, 0L);
  }

  @Test
  public void test1()  throws Throwable  {
      TransientJournal transientJournal0 = new TransientJournal();
      CentralPublisher centralPublisher0 = new CentralPublisher((Clock) null, (Journal) transientJournal0);
      centralPublisher0.close();
  }

  @Test
  public void test2()  throws Throwable  {
      MachineClock machineClock0 = new MachineClock();
      TransientJournal transientJournal0 = new TransientJournal();
      CentralPublisher centralPublisher0 = new CentralPublisher((Clock) machineClock0, (Journal) transientJournal0);
      PausableClock pausableClock0 = (PausableClock)centralPublisher0.clock();
      assertNotNull(pausableClock0);
  }

  @Test
  public void test3()  throws Throwable  {
      TransientJournal transientJournal0 = new TransientJournal();
      CentralPublisher centralPublisher0 = new CentralPublisher((Clock) null, (Journal) transientJournal0);
      centralPublisher0.cancelSubscription((TransactionSubscriber) null);
  }

  @Test
  public void test4()  throws Throwable  {
      MachineClock machineClock0 = new MachineClock();
      TransientJournal transientJournal0 = new TransientJournal();
      CentralPublisher centralPublisher0 = new CentralPublisher((Clock) machineClock0, (Journal) transientJournal0);
      transientJournal0.update((TransactionSubscriber) null, (-2857L));
      try { 
        centralPublisher0.subscribe((TransactionSubscriber) null, 0L);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // The transaction journal has not yet reached transaction 0. The last logged transaction was -2858.
         //
         assertThrownBy("org.prevayler.implementation.journal.TransientJournal", e);
      }
  }

  @Test
  public void test5()  throws Throwable  {
      BrokenClock brokenClock0 = new BrokenClock();
      TransientJournal transientJournal0 = new TransientJournal();
      CentralPublisher centralPublisher0 = new CentralPublisher((Clock) brokenClock0, (Journal) transientJournal0);
      // Undeclared exception!
      try { 
        centralPublisher0.publish((Capsule) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.prevayler.implementation.publishing.CentralPublisher", e);
      }
  }


  @Test
  public void test7()  throws Throwable  {
      Date date0 = new Date();
      BrokenClock brokenClock0 = new BrokenClock(date0);
      LiberalTransactionCensor liberalTransactionCensor0 = new LiberalTransactionCensor();
      CentralPublisher centralPublisher0 = new CentralPublisher((Clock) brokenClock0, (TransactionCensor) liberalTransactionCensor0, (Journal) null);
      // Undeclared exception!
      try { 
        centralPublisher0.close();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.prevayler.implementation.publishing.CentralPublisher", e);
      }
  }
}
