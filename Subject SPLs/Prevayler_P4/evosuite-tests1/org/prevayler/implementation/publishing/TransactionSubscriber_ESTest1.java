/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 08 00:04:34 KST 2017
 */

package org.prevayler.implementation.publishing;

import static org.junit.Assert.assertEquals;

import java.time.Clock;
import java.time.Instant;
import java.util.Date;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.prevayler.implementation.Capsule;
import org.prevayler.implementation.TransactionTimestamp;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class TransactionSubscriber_ESTest1 extends TransactionSubscriber_ESTest_scaffolding1 {

  @Test
  public void test0()  throws Throwable  {
      POBox pOBox0 = new POBox((TransactionSubscriber) null);
      Clock clock0 = Clock.systemUTC();
      Instant instant0 = Instant.now(clock0);
      Date date0 = Date.from(instant0);
      TransactionTimestamp transactionTimestamp0 = new TransactionTimestamp((Capsule) null, (-1184L), date0);
      pOBox0.receive(transactionTimestamp0);
      assertEquals((-1184L), transactionTimestamp0.systemVersion());
  }
}
