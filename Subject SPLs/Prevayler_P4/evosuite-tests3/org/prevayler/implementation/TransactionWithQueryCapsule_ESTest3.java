/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 07 18:43:49 KST 2017
 */

package org.prevayler.implementation;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.fail;

import java.time.chrono.JapaneseDate;
import java.util.Date;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.prevayler.TransactionWithQuery;
import org.prevayler.foundation.serialization.JavaSerializer;
import org.prevayler.foundation.serialization.Serializer;
import org.prevayler.foundation.serialization.XStreamSerializer;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class TransactionWithQueryCapsule_ESTest3 extends TransactionWithQueryCapsule_ESTest_scaffolding3 {

  @Test
  public void test0()  throws Throwable  {
      XStreamSerializer xStreamSerializer0 = new XStreamSerializer();
      TransactionWithQueryCapsule transactionWithQueryCapsule0 = new TransactionWithQueryCapsule((TransactionWithQuery) null, (Serializer) xStreamSerializer0);
      JapaneseDate japaneseDate0 = JapaneseDate.now();
      Date date0 = new Date();
      // Undeclared exception!
      try { 
        transactionWithQueryCapsule0.justExecute("-BQhj", japaneseDate0, date0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.String cannot be cast to org.prevayler.TransactionWithQuery
         //
         assertThrownBy("org.prevayler.implementation.TransactionWithQueryCapsule", e);
      }
  }



  @Test
  public void test3()  throws Throwable  {
      JavaSerializer javaSerializer0 = new JavaSerializer();
      TransactionWithQueryCapsule transactionWithQueryCapsule0 = new TransactionWithQueryCapsule((TransactionWithQuery) null, (Serializer) javaSerializer0);
      Date date0 = new Date();
      // Undeclared exception!
      try { 
        transactionWithQueryCapsule0.justExecute((Object) null, javaSerializer0, date0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.prevayler.implementation.TransactionWithQueryCapsule", e);
      }
  }

  @Test
  public void test4()  throws Throwable  {
      XStreamSerializer xStreamSerializer0 = new XStreamSerializer();
      TransactionWithQueryCapsule transactionWithQueryCapsule0 = new TransactionWithQueryCapsule((TransactionWithQuery) null, (Serializer) xStreamSerializer0);
      TransactionWithQueryCapsule transactionWithQueryCapsule1 = (TransactionWithQueryCapsule)transactionWithQueryCapsule0.cleanCopy();
      assertFalse(transactionWithQueryCapsule1.equals((Object)transactionWithQueryCapsule0));
  }

  @Test
  public void test5()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      TransactionWithQueryCapsule transactionWithQueryCapsule0 = new TransactionWithQueryCapsule(byteArray0);
  }
}
