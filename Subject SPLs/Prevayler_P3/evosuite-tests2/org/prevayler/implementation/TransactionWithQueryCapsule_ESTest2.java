/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 07 20:57:02 KST 2017
 */

package org.prevayler.implementation;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.fail;

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
public class TransactionWithQueryCapsule_ESTest2 extends TransactionWithQueryCapsule_ESTest_scaffolding2 {

  @Test
  public void test0()  throws Throwable  {
      XStreamSerializer xStreamSerializer0 = new XStreamSerializer();
      TransactionWithQueryCapsule transactionWithQueryCapsule0 = new TransactionWithQueryCapsule((TransactionWithQuery) null, (Serializer) xStreamSerializer0);
      Date date0 = new Date();
      // Undeclared exception!
      try { 
        transactionWithQueryCapsule0.executeOn(date0, date0, xStreamSerializer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.prevayler.implementation.TransactionWithQueryCapsule", e);
      }
  }

  @Test
  public void test1()  throws Throwable  {
      TransactionWithQueryCapsule transactionWithQueryCapsule0 = null;
      try {
        transactionWithQueryCapsule0 = new TransactionWithQueryCapsule((TransactionWithQuery) null, (Serializer) null);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Unable to serialize transaction
         //
         assertThrownBy("org.prevayler.implementation.Capsule", e);
      }
  }

  @Test
  public void test2()  throws Throwable  {
      XStreamSerializer xStreamSerializer0 = new XStreamSerializer();
      TransactionWithQueryCapsule transactionWithQueryCapsule0 = new TransactionWithQueryCapsule((TransactionWithQuery) null, (Serializer) xStreamSerializer0);
      Object object0 = transactionWithQueryCapsule0.result();
      assertNull(object0);
  }

  @Test
  public void test3()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      TransactionWithQueryCapsule transactionWithQueryCapsule0 = new TransactionWithQueryCapsule(byteArray0);
      Integer integer0 = new Integer((int) (byte) (-1));
      // Undeclared exception!
      try { 
        transactionWithQueryCapsule0.justExecute(integer0, integer0, (Date) null);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Integer cannot be cast to org.prevayler.TransactionWithQuery
         //
         assertThrownBy("org.prevayler.implementation.TransactionWithQueryCapsule", e);
      }
  }

  @Test
  public void test4()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      JavaSerializer javaSerializer0 = new JavaSerializer(classLoader0);
      TransactionWithQueryCapsule transactionWithQueryCapsule0 = new TransactionWithQueryCapsule((TransactionWithQuery) null, (Serializer) javaSerializer0);
      // Undeclared exception!
      try { 
        transactionWithQueryCapsule0.justExecute((Object) null, classLoader0, (Date) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.prevayler.implementation.TransactionWithQueryCapsule", e);
      }
  }

  @Test
  public void test5()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      TransactionWithQueryCapsule transactionWithQueryCapsule0 = new TransactionWithQueryCapsule(byteArray0);
      TransactionWithQueryCapsule transactionWithQueryCapsule1 = (TransactionWithQueryCapsule)transactionWithQueryCapsule0.cleanCopy();
      assertFalse(transactionWithQueryCapsule1.equals((Object)transactionWithQueryCapsule0));
  }
}
