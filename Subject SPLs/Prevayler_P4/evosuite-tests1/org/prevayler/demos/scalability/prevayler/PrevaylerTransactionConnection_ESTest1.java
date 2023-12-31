/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 07 23:10:23 KST 2017
 */

package org.prevayler.demos.scalability.prevayler;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.fail;

import java.util.Date;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.prevayler.Clock;
import org.prevayler.demos.scalability.Record;
import org.prevayler.foundation.serialization.JavaSerializer;
import org.prevayler.foundation.serialization.Serializer;
import org.prevayler.implementation.PrevaylerImpl;
import org.prevayler.implementation.clock.BrokenClock;
import org.prevayler.implementation.clock.MachineClock;
import org.prevayler.implementation.clock.PausableClock;
import org.prevayler.implementation.journal.Journal;
import org.prevayler.implementation.publishing.CentralPublisher;
import org.prevayler.implementation.publishing.TransactionPublisher;
import org.prevayler.implementation.publishing.censorship.TransactionCensor;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class PrevaylerTransactionConnection_ESTest1 extends PrevaylerTransactionConnection_ESTest_scaffolding1 {

  @Test
  public void test0()  throws Throwable  {
      Date date0 = new Date();
      BrokenClock brokenClock0 = new BrokenClock(date0);
      CentralPublisher centralPublisher0 = new CentralPublisher((Clock) brokenClock0, (TransactionCensor) null, (Journal) null);
      PrevaylerImpl prevaylerImpl0 = new PrevaylerImpl((TransactionPublisher) centralPublisher0, (Serializer) null);
      PrevaylerTransactionConnection prevaylerTransactionConnection0 = new PrevaylerTransactionConnection(prevaylerImpl0);
      Record record0 = new Record(1995L);
      // Undeclared exception!
      try { 
        prevaylerTransactionConnection0.performTransaction(record0, record0, 1269L);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Unable to serialize transaction
         //
         assertThrownBy("org.prevayler.implementation.Capsule", e);
      }
  }

  @Test
  public void test1()  throws Throwable  {
      MachineClock machineClock0 = new MachineClock();
      PausableClock pausableClock0 = new PausableClock((Clock) machineClock0);
      CentralPublisher centralPublisher0 = new CentralPublisher((Clock) pausableClock0, (Journal) null);
      JavaSerializer javaSerializer0 = new JavaSerializer();
      PrevaylerImpl prevaylerImpl0 = new PrevaylerImpl((TransactionPublisher) centralPublisher0, (Serializer) javaSerializer0);
      PrevaylerTransactionConnection prevaylerTransactionConnection0 = new PrevaylerTransactionConnection(prevaylerImpl0);
      Record record0 = new Record((-495L));
      // Undeclared exception!
      try { 
        prevaylerTransactionConnection0.performTransaction(record0, (Record) null, (-495L));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unexpected Exception: java.lang.NullPointerException
         //
         assertThrownBy("org.prevayler.demos.scalability.prevayler.PrevaylerTransactionConnection", e);
      }
  }
}
