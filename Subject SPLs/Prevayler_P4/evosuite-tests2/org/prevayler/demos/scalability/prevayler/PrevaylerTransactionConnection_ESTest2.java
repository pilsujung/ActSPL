/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 07 19:58:09 KST 2017
 */

package org.prevayler.demos.scalability.prevayler;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.fail;

import java.util.Random;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.prevayler.Clock;
import org.prevayler.Prevayler;
import org.prevayler.demos.scalability.Record;
import org.prevayler.foundation.serialization.Serializer;
import org.prevayler.foundation.serialization.XStreamSerializer;
import org.prevayler.implementation.PrevaylerImpl;
import org.prevayler.implementation.clock.MachineClock;
import org.prevayler.implementation.journal.Journal;
import org.prevayler.implementation.journal.TransientJournal;
import org.prevayler.implementation.publishing.CentralPublisher;
import org.prevayler.implementation.publishing.TransactionPublisher;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class PrevaylerTransactionConnection_ESTest2 extends PrevaylerTransactionConnection_ESTest_scaffolding2 {

  @Test
  public void test0()  throws Throwable  {
      PrevaylerTransactionConnection prevaylerTransactionConnection0 = new PrevaylerTransactionConnection((Prevayler) null);
      Random random0 = new Random();
      Record record0 = new Record(706L, random0);
      Record record1 = new Record(706L);
      // Undeclared exception!
      try { 
        prevaylerTransactionConnection0.performTransaction(record0, record1, 1L);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unexpected Exception: java.lang.NullPointerException
         //
         assertThrownBy("org.prevayler.demos.scalability.prevayler.PrevaylerTransactionConnection", e);
      }
  }

  @Test
  public void test1()  throws Throwable  {
      MachineClock machineClock0 = new MachineClock();
      TransientJournal transientJournal0 = new TransientJournal();
      CentralPublisher centralPublisher0 = new CentralPublisher((Clock) machineClock0, (Journal) transientJournal0);
      XStreamSerializer xStreamSerializer0 = new XStreamSerializer();
      PrevaylerImpl prevaylerImpl0 = new PrevaylerImpl((TransactionPublisher) centralPublisher0, (Serializer) xStreamSerializer0);
      PrevaylerTransactionConnection prevaylerTransactionConnection0 = new PrevaylerTransactionConnection(prevaylerImpl0);
      // Undeclared exception!
      try { 
        prevaylerTransactionConnection0.performTransaction((Record) null, (Record) null, 0L);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Unable to serialize transaction
         //
         assertThrownBy("org.prevayler.implementation.Capsule", e);
      }
  }
}