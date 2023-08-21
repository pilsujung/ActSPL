/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 07 18:49:37 KST 2017
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

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class CentralPublisher_ESTest3 extends CentralPublisher_ESTest_scaffolding3 {

  @Test
  public void test0()  throws Throwable  {
      BrokenClock brokenClock0 = null;
      try {
        brokenClock0 = new BrokenClock((Date) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.prevayler.implementation.clock.BrokenClock", e);
      }
  }

  @Test
  public void test1()  throws Throwable  {
      MachineClock machineClock0 = new MachineClock();
      TransientJournal transientJournal0 = new TransientJournal();
      CentralPublisher centralPublisher0 = new CentralPublisher((Clock) machineClock0, (Journal) transientJournal0);
      centralPublisher0.subscribe((TransactionSubscriber) null, (-1L));
      try { 
        centralPublisher0.subscribe((TransactionSubscriber) null, (-421L));
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Unable to recover transaction -421. The oldest recoverable transaction is -1.
         //
         assertThrownBy("org.prevayler.implementation.journal.TransientJournal", e);
      }
  }

  @Test
  public void test2()  throws Throwable  {
      MachineClock machineClock0 = new MachineClock();
      PausableClock pausableClock0 = new PausableClock((Clock) machineClock0);
      CentralPublisher centralPublisher0 = new CentralPublisher((Clock) pausableClock0, (Journal) null);
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
  public void test4()  throws Throwable  {
      MachineClock machineClock0 = new MachineClock();
      TransientJournal transientJournal0 = new TransientJournal();
      CentralPublisher centralPublisher0 = new CentralPublisher((Clock) machineClock0, (Journal) transientJournal0);
      centralPublisher0.close();
  }

  @Test
  public void test6()  throws Throwable  {
      Date date0 = new Date();
      BrokenClock brokenClock0 = new BrokenClock(date0);
      PausableClock pausableClock0 = new PausableClock((Clock) brokenClock0);
      CentralPublisher centralPublisher0 = new CentralPublisher((Clock) pausableClock0, (Journal) null);
      // Undeclared exception!
      try { 
        centralPublisher0.subscribe((TransactionSubscriber) null, 2389L);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.prevayler.implementation.publishing.CentralPublisher", e);
      }
  }
}