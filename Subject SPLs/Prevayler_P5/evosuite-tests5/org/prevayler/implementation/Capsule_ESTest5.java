/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 06 22:47:45 KST 2017
 */

package org.prevayler.implementation;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.fail;

import java.time.Clock;
import java.time.Instant;
import java.time.chrono.ThaiBuddhistDate;
import java.util.Date;
import java.util.Map;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.prevayler.Transaction;
import org.prevayler.TransactionWithQuery;
import org.prevayler.foundation.Chunk;
import org.prevayler.foundation.serialization.JavaSerializer;
import org.prevayler.foundation.serialization.Serializer;
import org.prevayler.foundation.serialization.SkaringaSerializer;
import org.prevayler.foundation.serialization.XStreamSerializer;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class Capsule_ESTest5 extends Capsule_ESTest_scaffolding5 {

  @Test
  public void test00()  throws Throwable  {
      JavaSerializer javaSerializer0 = new JavaSerializer();
      TransactionWithQueryCapsule transactionWithQueryCapsule0 = new TransactionWithQueryCapsule((TransactionWithQuery) null, (Serializer) javaSerializer0);
      byte[] byteArray0 = transactionWithQueryCapsule0.serialized();
      assertArrayEquals(new byte[] {(byte) (-84), (byte) (-19), (byte)0, (byte)5, (byte)112}, byteArray0);
  }

  @Test
  public void test01()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      TransactionWithQueryCapsule transactionWithQueryCapsule0 = new TransactionWithQueryCapsule(byteArray0);
      byte[] byteArray1 = transactionWithQueryCapsule0.serialized();
      assertSame(byteArray1, byteArray0);
  }

  @Test
  public void test02()  throws Throwable  {
      SkaringaSerializer skaringaSerializer0 = new SkaringaSerializer();
      TransactionCapsule transactionCapsule0 = new TransactionCapsule((Transaction) null, (Serializer) skaringaSerializer0);
      XStreamSerializer xStreamSerializer0 = new XStreamSerializer();
      Object object0 = transactionCapsule0.deserialize(xStreamSerializer0);
      assertNotNull(object0);
  }

  @Test
  public void test03()  throws Throwable  {
      JavaSerializer javaSerializer0 = new JavaSerializer();
      TransactionWithQueryCapsule transactionWithQueryCapsule0 = new TransactionWithQueryCapsule((TransactionWithQuery) null, (Serializer) javaSerializer0);
      TransactionWithQueryCapsule transactionWithQueryCapsule1 = (TransactionWithQueryCapsule)transactionWithQueryCapsule0.cleanCopy();
      assertNotSame(transactionWithQueryCapsule1, transactionWithQueryCapsule0);
  }


  @Test
  public void test05()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      Chunk chunk0 = new Chunk(byteArray0);
      TransactionCapsule transactionCapsule0 = (TransactionCapsule)Capsule.fromChunk(chunk0);
      Date date0 = new Date(0L);
      // Undeclared exception!
      try { 
        transactionCapsule0.justExecute((Object) null, (Object) null, date0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.prevayler.implementation.TransactionCapsule", e);
      }
  }

  @Test
  public void test06()  throws Throwable  {
      SkaringaSerializer skaringaSerializer0 = new SkaringaSerializer();
      Object object0 = new Object();
      TransactionWithQueryCapsule transactionWithQueryCapsule0 = new TransactionWithQueryCapsule((TransactionWithQuery) null, (Serializer) skaringaSerializer0);
      Instant instant0 = Instant.ofEpochSecond(1L, 1L);
      Date date0 = Date.from(instant0);
      // Undeclared exception!
      try { 
        transactionWithQueryCapsule0.justExecute((Object) null, object0, date0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.prevayler.implementation.TransactionWithQueryCapsule", e);
      }
  }

  @Test
  public void test07()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      TransactionCapsule transactionCapsule0 = new TransactionCapsule(byteArray0);
      Date date0 = new Date();
      // Undeclared exception!
      try { 
        transactionCapsule0.justExecute(byteArray0, byteArray0, date0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // [B cannot be cast to org.prevayler.Transaction
         //
         assertThrownBy("org.prevayler.implementation.TransactionCapsule", e);
      }
  }

  @Test
  public void test08()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      TransactionWithQueryCapsule transactionWithQueryCapsule0 = new TransactionWithQueryCapsule(byteArray0);
      Date date0 = new Date((long) (byte)37);
      // Undeclared exception!
      try { 
        transactionWithQueryCapsule0.justExecute(transactionWithQueryCapsule0, transactionWithQueryCapsule0, date0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.prevayler.implementation.TransactionWithQueryCapsule cannot be cast to org.prevayler.TransactionWithQuery
         //
         assertThrownBy("org.prevayler.implementation.TransactionWithQueryCapsule", e);
      }
  }

  @Test
  public void test09()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      Chunk chunk0 = new Chunk(byteArray0, (Map) null);
      // Undeclared exception!
      try { 
        Capsule.fromChunk(chunk0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.prevayler.foundation.Chunk", e);
      }
  }

  @Test
  public void test10()  throws Throwable  {
      JavaSerializer javaSerializer0 = new JavaSerializer();
      Date date0 = new Date((-465L));
      TransactionWithQueryCapsule transactionWithQueryCapsule0 = new TransactionWithQueryCapsule((TransactionWithQuery) null, (Serializer) javaSerializer0);
      Clock clock0 = Clock.systemDefaultZone();
      ThaiBuddhistDate thaiBuddhistDate0 = ThaiBuddhistDate.now(clock0);
      // Undeclared exception!
      try { 
        transactionWithQueryCapsule0.executeOn(thaiBuddhistDate0, date0, javaSerializer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.prevayler.implementation.TransactionWithQueryCapsule", e);
      }
  }

  @Test
  public void test11()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      TransactionWithQueryCapsule transactionWithQueryCapsule0 = new TransactionWithQueryCapsule(byteArray0);
      Date date0 = new Date((long) (byte)0);
      // Undeclared exception!
      try { 
        transactionWithQueryCapsule0.executeOn(transactionWithQueryCapsule0, date0, (Serializer) null);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Unable to deserialize transaction
         //
         assertThrownBy("org.prevayler.implementation.Capsule", e);
      }
  }

  @Test
  public void test12()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      TransactionWithQueryCapsule transactionWithQueryCapsule0 = new TransactionWithQueryCapsule(byteArray0);
      // Undeclared exception!
      try { 
        transactionWithQueryCapsule0.deserialize((Serializer) null);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Unable to deserialize transaction
         //
         assertThrownBy("org.prevayler.implementation.Capsule", e);
      }
  }

  @Test
  public void test13()  throws Throwable  {
      TransactionWithQueryCapsule transactionWithQueryCapsule0 = new TransactionWithQueryCapsule((byte[]) null);
      Chunk chunk0 = transactionWithQueryCapsule0.toChunk();
      TransactionWithQueryCapsule transactionWithQueryCapsule1 = (TransactionWithQueryCapsule)Capsule.fromChunk(chunk0);
      assertNotSame(transactionWithQueryCapsule1, transactionWithQueryCapsule0);
  }

  @Test
  public void test14()  throws Throwable  {
      TransactionWithQueryCapsule transactionWithQueryCapsule0 = new TransactionWithQueryCapsule((byte[]) null);
      byte[] byteArray0 = transactionWithQueryCapsule0.serialized();
      assertNull(byteArray0);
  }

  @Test
  public void test15()  throws Throwable  {
      JavaSerializer javaSerializer0 = new JavaSerializer();
      TransactionCapsule transactionCapsule0 = new TransactionCapsule((Transaction) null, (Serializer) javaSerializer0);
      Date date0 = new Date((-1L));
      // Undeclared exception!
      try { 
        transactionCapsule0.executeOn((Object) null, date0, javaSerializer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.prevayler.implementation.Capsule", e);
      }
  }

  @Test
  public void test16()  throws Throwable  {
      SkaringaSerializer skaringaSerializer0 = new SkaringaSerializer();
      TransactionCapsule transactionCapsule0 = new TransactionCapsule((Transaction) null, (Serializer) skaringaSerializer0);
      Object object0 = transactionCapsule0.deserialize(skaringaSerializer0);
      assertNull(object0);
  }
}
