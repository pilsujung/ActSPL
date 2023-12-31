/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 07 23:58:21 KST 2017
 */

package org.prevayler.implementation.publishing;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
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
public class CentralPublisher_ESTest1 extends CentralPublisher_ESTest_scaffolding1 {

  @Test
  public void test0()  throws Throwable  {
      MachineClock machineClock0 = new MachineClock();
      TransientJournal transientJournal0 = new TransientJournal();
      CentralPublisher centralPublisher0 = new CentralPublisher((Clock) machineClock0, (TransactionCensor) null, (Journal) transientJournal0);
      centralPublisher0.subscribe((TransactionSubscriber) null, (-1244L));
      POBox pOBox0 = new POBox((TransactionSubscriber) null);
      try { 
        centralPublisher0.subscribe(pOBox0, 0L);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // The transaction journal has not yet reached transaction 0. The last logged transaction was -1245.
         //
         assertThrownBy("org.prevayler.implementation.journal.TransientJournal", e);
      }
  }

  @Test
  public void test1()  throws Throwable  {
      MachineClock machineClock0 = new MachineClock();
      LiberalTransactionCensor liberalTransactionCensor0 = new LiberalTransactionCensor();
      TransientJournal transientJournal0 = new TransientJournal();
      CentralPublisher centralPublisher0 = new CentralPublisher((Clock) machineClock0, (TransactionCensor) liberalTransactionCensor0, (Journal) transientJournal0);
      // Undeclared exception!
      try { 
        centralPublisher0.publish((Capsule) null);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Journal.update() has to be called at least once before Journal.journal().
         //
         assertThrownBy("org.prevayler.implementation.journal.TransientJournal", e);
      }
  }

  @Test
  public void test2()  throws Throwable  {
      MachineClock machineClock0 = new MachineClock();
      CentralPublisher centralPublisher0 = new CentralPublisher((Clock) machineClock0, (Journal) null);
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

  @Test
  public void test3()  throws Throwable  {
      MachineClock machineClock0 = new MachineClock();
      LiberalTransactionCensor liberalTransactionCensor0 = new LiberalTransactionCensor();
      TransientJournal transientJournal0 = new TransientJournal();
      CentralPublisher centralPublisher0 = new CentralPublisher((Clock) machineClock0, (TransactionCensor) liberalTransactionCensor0, (Journal) transientJournal0);
      centralPublisher0.close();
  }

  @Test
  public void test4()  throws Throwable  {
      Date date0 = new Date();
      BrokenClock brokenClock0 = new BrokenClock(date0);
      PausableClock pausableClock0 = new PausableClock((Clock) brokenClock0);
      LiberalTransactionCensor liberalTransactionCensor0 = new LiberalTransactionCensor();
      CentralPublisher centralPublisher0 = new CentralPublisher((Clock) pausableClock0, (TransactionCensor) liberalTransactionCensor0, (Journal) null);
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
  public void test5()  throws Throwable  {
      BrokenClock brokenClock0 = new BrokenClock();
      PausableClock pausableClock0 = new PausableClock((Clock) brokenClock0);
      CentralPublisher centralPublisher0 = new CentralPublisher((Clock) pausableClock0, (Journal) null);
      // Undeclared exception!
      try { 
        centralPublisher0.subscribe((TransactionSubscriber) null, 427L);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.prevayler.implementation.publishing.CentralPublisher", e);
      }
  }
}
