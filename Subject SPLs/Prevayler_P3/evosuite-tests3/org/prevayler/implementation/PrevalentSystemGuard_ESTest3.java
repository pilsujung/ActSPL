/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 07 17:47:07 KST 2017
 */

package org.prevayler.implementation;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.fail;

import java.io.File;
import java.io.IOException;
import java.io.NotSerializableException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.Period;
import java.time.YearMonth;
import java.time.ZoneOffset;
import java.time.chrono.JapaneseChronology;
import java.time.chrono.JapaneseDate;
import java.time.chrono.MinguoChronology;
import java.time.chrono.MinguoDate;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.prevayler.Clock;
import org.prevayler.Query;
import org.prevayler.Transaction;
import org.prevayler.foundation.Chunk;
import org.prevayler.foundation.serialization.JavaSerializer;
import org.prevayler.foundation.serialization.Serializer;
import org.prevayler.foundation.serialization.SkaringaSerializer;
import org.prevayler.foundation.serialization.XStreamSerializer;
import org.prevayler.implementation.clock.BrokenClock;
import org.prevayler.implementation.clock.MachineClock;
import org.prevayler.implementation.journal.Journal;
import org.prevayler.implementation.journal.TransientJournal;
import org.prevayler.implementation.publishing.CentralPublisher;
import org.prevayler.implementation.publishing.TransactionPublisher;
import org.prevayler.implementation.snapshot.GenericSnapshotManager;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class PrevalentSystemGuard_ESTest3 extends PrevalentSystemGuard_ESTest_scaffolding3 {

  @Test
  public void test00()  throws Throwable  {
      JavaSerializer javaSerializer0 = new JavaSerializer();
      PrevalentSystemGuard prevalentSystemGuard0 = new PrevalentSystemGuard((Object) null, (-443L), (Serializer) javaSerializer0);
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte)21;
      byteArray0[1] = (byte) (-1);
      byteArray0[2] = (byte)79;
      TransactionWithQueryCapsule transactionWithQueryCapsule0 = new TransactionWithQueryCapsule(byteArray0);
      Date date0 = new Date((-443L));
      TransactionTimestamp transactionTimestamp0 = new TransactionTimestamp((Capsule) transactionWithQueryCapsule0, (long) (byte)79, date0);
      Chunk chunk0 = transactionTimestamp0.toChunk();
      TransactionTimestamp.fromChunk(chunk0);
      // Undeclared exception!
      try { 
        prevalentSystemGuard0.receive(transactionTimestamp0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Prevayler is no longer processing transactions due to an Error thrown from an earlier transaction.
         //
         assertThrownBy("org.prevayler.implementation.PrevalentSystemGuard", e);
      }
  }

  @Test
  public void test01()  throws Throwable  {
      Object object0 = new Object();
      SkaringaSerializer skaringaSerializer0 = new SkaringaSerializer();
      PrevalentSystemGuard prevalentSystemGuard0 = new PrevalentSystemGuard(object0, (-2127L), (Serializer) skaringaSerializer0);
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte)1;
      byteArray0[1] = (byte)48;
      byteArray0[2] = (byte)0;
      byteArray0[3] = (byte)0;
      byteArray0[4] = (byte) (-1);
      byteArray0[5] = (byte)29;
      byteArray0[6] = (byte)0;
      TransactionCapsule transactionCapsule0 = new TransactionCapsule(byteArray0);
      TransactionCapsule transactionCapsule1 = (TransactionCapsule)transactionCapsule0.cleanCopy();
      Date date0 = new Date((long) (byte)29);
      TransactionTimestamp transactionTimestamp0 = new TransactionTimestamp((Capsule) transactionCapsule1, (-1L), date0);
      // Undeclared exception!
      try { 
        prevalentSystemGuard0.receive(transactionTimestamp0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Attempted to apply transaction -1 when prevalent system was only at -2127
         //
         assertThrownBy("org.prevayler.implementation.PrevalentSystemGuard", e);
      }
  }

  @Test
  public void test02()  throws Throwable  {
      ClassLoader.getSystemResourceAsStream(",F");
      JavaSerializer javaSerializer0 = new JavaSerializer();
      PrevalentSystemGuard prevalentSystemGuard0 = new PrevalentSystemGuard((Object) null, 5000L, (Serializer) javaSerializer0);
      // Undeclared exception!
      try { 
        prevalentSystemGuard0.prevalentSystem();
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Prevayler is no longer allowing access to the prevalent system due to an Error thrown from an earlier transaction.
         //
         assertThrownBy("org.prevayler.implementation.PrevalentSystemGuard", e);
      }
  }

  @Test
  public void test03()  throws Throwable  {
      Integer integer0 = new Integer(0);
      XStreamSerializer xStreamSerializer0 = new XStreamSerializer();
      PrevalentSystemGuard prevalentSystemGuard0 = new PrevalentSystemGuard((Object) integer0, (long) 0, (Serializer) xStreamSerializer0);
      BrokenClock brokenClock0 = new BrokenClock();
      CentralPublisher centralPublisher0 = new CentralPublisher((Clock) brokenClock0, (Journal) null);
      // Undeclared exception!
      try { 
        prevalentSystemGuard0.subscribeTo(centralPublisher0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.prevayler.implementation.publishing.CentralPublisher", e);
      }
  }

  @Test
  public void test04()  throws Throwable  {
      Integer integer0 = new Integer(1);
      XStreamSerializer xStreamSerializer0 = new XStreamSerializer();
      PrevalentSystemGuard prevalentSystemGuard0 = new PrevalentSystemGuard((Object) integer0, (long) 1, (Serializer) xStreamSerializer0);
      // Undeclared exception!
      try { 
        prevalentSystemGuard0.receive((TransactionTimestamp) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.prevayler.implementation.PrevalentSystemGuard", e);
      }
  }

  @Test
  public void test05()  throws Throwable  {
      JapaneseChronology japaneseChronology0 = JapaneseChronology.INSTANCE;
      ZoneOffset zoneOffset0 = ZoneOffset.MAX;
      java.time.Clock clock0 = java.time.Clock.system(zoneOffset0);
      JapaneseDate japaneseDate0 = japaneseChronology0.dateNow(clock0);
      SkaringaSerializer skaringaSerializer0 = new SkaringaSerializer();
      PrevalentSystemGuard prevalentSystemGuard0 = new PrevalentSystemGuard((Object) japaneseDate0, 1L, (Serializer) skaringaSerializer0);
      try { 
        prevalentSystemGuard0.deepCopy(1L, skaringaSerializer0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Unable to deserialize with Skaringa: org.xml.sax.SAXException: no default ctor found for class: java.time.chrono.JapaneseDate
         // com.skaringa.javaxml.DeserializerException: no default ctor found for class: java.time.chrono.JapaneseDate
         //
         assertThrownBy("org.prevayler.foundation.serialization.SkaringaSerializer", e);
      }
  }

  @Test
  public void test07()  throws Throwable  {
      XStreamSerializer xStreamSerializer0 = new XStreamSerializer(":GWJ<*GI94PC#");
      PrevalentSystemGuard prevalentSystemGuard0 = new PrevalentSystemGuard((Object) ":GWJ<*GI94PC#", 0L, (Serializer) xStreamSerializer0);
      try { 
        prevalentSystemGuard0.deepCopy(0L, xStreamSerializer0);
        fail("Expecting exception: UnsupportedEncodingException");
      
      } catch(UnsupportedEncodingException e) {
         //
         // :GWJ<*GI94PC#
         //
         assertThrownBy("sun.nio.cs.StreamEncoder", e);
      }
  }

  @Test
  public void test08()  throws Throwable  {
      Object object0 = new Object();
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      ClassLoader classLoader1 = classLoader0.getParent();
      JavaSerializer javaSerializer0 = new JavaSerializer(classLoader1);
      PrevalentSystemGuard prevalentSystemGuard0 = new PrevalentSystemGuard(object0, 1L, (Serializer) javaSerializer0);
      prevalentSystemGuard0.prevalentSystem();
  }

  @Test
  public void test09()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      JavaSerializer javaSerializer0 = new JavaSerializer(classLoader0);
      PrevalentSystemGuard prevalentSystemGuard0 = new PrevalentSystemGuard((Object) null, 0L, (Serializer) javaSerializer0);
      MachineClock machineClock0 = new MachineClock();
      // Undeclared exception!
      try { 
        prevalentSystemGuard0.executeQuery((Query) null, machineClock0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Prevayler is no longer processing queries due to an Error thrown from an earlier transaction.
         //
         assertThrownBy("org.prevayler.implementation.PrevalentSystemGuard", e);
      }
  }

  @Test
  public void test10()  throws Throwable  {
      Object object0 = new Object();
      PrevalentSystemGuard prevalentSystemGuard0 = new PrevalentSystemGuard(object0, 0L, (Serializer) null);
      MachineClock machineClock0 = new MachineClock();
      TransientJournal transientJournal0 = new TransientJournal();
      CentralPublisher centralPublisher0 = new CentralPublisher((Clock) machineClock0, (Journal) transientJournal0);
      prevalentSystemGuard0.subscribeTo(centralPublisher0);
  }

  @Test
  public void test11()  throws Throwable  {
      PrevalentSystemGuard prevalentSystemGuard0 = new PrevalentSystemGuard((Object) null, 0L, (Serializer) null);
      // Undeclared exception!
      try { 
        prevalentSystemGuard0.deepCopy(5000L, (Serializer) null);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Prevayler is no longer accepting transactions due to an Error thrown from an earlier transaction.
         //
         assertThrownBy("org.prevayler.implementation.PrevalentSystemGuard", e);
      }
  }

  @Test
  public void test12()  throws Throwable  {
      SkaringaSerializer skaringaSerializer0 = new SkaringaSerializer();
      PrevalentSystemGuard prevalentSystemGuard0 = new PrevalentSystemGuard((Object) "java.util.BitSet", 0L, (Serializer) skaringaSerializer0);
      PrevalentSystemGuard prevalentSystemGuard1 = prevalentSystemGuard0.deepCopy(0L, skaringaSerializer0);
      PrevalentSystemGuard prevalentSystemGuard2 = prevalentSystemGuard1.deepCopy(0L, skaringaSerializer0);
      assertNotSame(prevalentSystemGuard2, prevalentSystemGuard1);
  }

  @Test
  public void test13()  throws Throwable  {
      Object object0 = new Object();
      JavaSerializer javaSerializer0 = new JavaSerializer();
      PrevalentSystemGuard prevalentSystemGuard0 = new PrevalentSystemGuard(object0, 0L, (Serializer) javaSerializer0);
      try { 
        prevalentSystemGuard0.deepCopy(0L, javaSerializer0);
        fail("Expecting exception: NotSerializableException");
      
      } catch(NotSerializableException e) {
         //
         // java.lang.Object
         //
         assertThrownBy("java.io.ObjectOutputStream", e);
      }
  }

  @Test
  public void test14()  throws Throwable  {
      java.time.Clock clock0 = java.time.Clock.systemUTC();
      YearMonth yearMonth0 = YearMonth.now(clock0);
      LocalDate localDate0 = yearMonth0.atEndOfMonth();
      MinguoDate minguoDate0 = MinguoDate.from(localDate0);
      XStreamSerializer xStreamSerializer0 = new XStreamSerializer();
      PrevalentSystemGuard prevalentSystemGuard0 = new PrevalentSystemGuard((Object) minguoDate0, (-109L), (Serializer) xStreamSerializer0);
      try { 
        prevalentSystemGuard0.executeQuery((Query) null, (Clock) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.prevayler.implementation.PrevalentSystemGuard", e);
      }
  }

  @Test
  public void test15()  throws Throwable  {
      Object object0 = new Object();
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      JavaSerializer javaSerializer0 = new JavaSerializer(classLoader0);
      PrevalentSystemGuard prevalentSystemGuard0 = new PrevalentSystemGuard(object0, 1073741824L, (Serializer) javaSerializer0);
      long long0 = (-1251L);
      // Undeclared exception!
      try { 
        prevalentSystemGuard0.deepCopy((-1251L), javaSerializer0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Already at 1073741824; can't go back to -1251
         //
         assertThrownBy("org.prevayler.implementation.PrevalentSystemGuard", e);
      }
  }

  @Test
  public void test16()  throws Throwable  {
      int int0 = (-20);
      Integer integer0 = new Integer((-20));
      XStreamSerializer xStreamSerializer0 = new XStreamSerializer();
      PrevalentSystemGuard prevalentSystemGuard0 = new PrevalentSystemGuard((Object) integer0, (long) (-20), (Serializer) xStreamSerializer0);
      // Undeclared exception!
      try { 
        prevalentSystemGuard0.takeSnapshot((GenericSnapshotManager) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.prevayler.implementation.PrevalentSystemGuard", e);
      }
  }

  @Test
  public void test17()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte) (-22);
      Chunk chunk0 = new Chunk(byteArray0);
      Map map0 = chunk0.getParameters();
      Chunk chunk1 = new Chunk(byteArray0, (Map) map0);
      Map map1 = chunk1.getParameters();
      PrevaylerDirectory prevaylerDirectory0 = new PrevaylerDirectory((File) null);
      JavaSerializer javaSerializer0 = new JavaSerializer();
      GenericSnapshotManager genericSnapshotManager0 = null;
      try {
        genericSnapshotManager0 = new GenericSnapshotManager((Map) map1, (String) null, (Object) null, prevaylerDirectory0, (Serializer) javaSerializer0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Primary suffix 'null' does not appear in strategies map
         //
         assertThrownBy("org.prevayler.implementation.snapshot.GenericSnapshotManager", e);
      }
  }

  @Test
  public void test18()  throws Throwable  {
      MinguoDate minguoDate0 = MinguoDate.now();
      XStreamSerializer xStreamSerializer0 = new XStreamSerializer((String) null);
      PrevalentSystemGuard prevalentSystemGuard0 = new PrevalentSystemGuard((Object) minguoDate0, 0L, (Serializer) xStreamSerializer0);
      // Undeclared exception!
      try { 
        prevalentSystemGuard0.subscribeTo((TransactionPublisher) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.prevayler.implementation.PrevalentSystemGuard", e);
      }
  }

  @Test
  public void test19()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte)1;
      byteArray0[1] = (byte)68;
      byteArray0[2] = (byte)0;
      byteArray0[3] = (byte) (-2);
      byteArray0[4] = (byte)1;
      byteArray0[5] = (byte)10;
      byteArray0[6] = (byte)113;
      byteArray0[7] = (byte)0;
      byteArray0[8] = (byte) (-92);
      TransactionCapsule transactionCapsule0 = new TransactionCapsule(byteArray0);
      Chunk chunk0 = transactionCapsule0.toChunk();
      Map map0 = chunk0.getParameters();
      PrevaylerDirectory prevaylerDirectory0 = new PrevaylerDirectory((File) null);
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      JavaSerializer javaSerializer0 = new JavaSerializer(classLoader0);
      GenericSnapshotManager genericSnapshotManager0 = null;
      try {
        genericSnapshotManager0 = new GenericSnapshotManager((Map) map0, "/;+Ruvq_|0q;I3e;X", (Object) "+6BkeT", prevaylerDirectory0, (Serializer) javaSerializer0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Snapshot filename suffix must match /[a-zA-Z0-9]*[Ss]napshot/, but 'withQuery' does not
         //
         assertThrownBy("org.prevayler.implementation.PrevaylerDirectory", e);
      }
  }

  @Test
  public void test20()  throws Throwable  {
      HashMap<MinguoDate, Integer> hashMap0 = new HashMap<MinguoDate, Integer>();
      MinguoChronology minguoChronology0 = MinguoChronology.INSTANCE;
      minguoChronology0.dateNow();
      int int0 = 6;
      Period.ofYears(6);
      MinguoDate.now();
      PrevaylerDirectory prevaylerDirectory0 = new PrevaylerDirectory("7jK1tGcfN");
      JavaSerializer javaSerializer0 = new JavaSerializer();
      GenericSnapshotManager genericSnapshotManager0 = null;
      try {
        genericSnapshotManager0 = new GenericSnapshotManager((Map) hashMap0, "7jK1tGcfN", (Object) hashMap0, prevaylerDirectory0, (Serializer) javaSerializer0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Primary suffix '7jK1tGcfN' does not appear in strategies map
         //
         assertThrownBy("org.prevayler.implementation.snapshot.GenericSnapshotManager", e);
      }
  }

  @Test
  public void test21()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      ClassLoader classLoader1 = classLoader0.getParent();
      JavaSerializer javaSerializer0 = new JavaSerializer(classLoader1);
  }

  @Test
  public void test22()  throws Throwable  {
      XStreamSerializer xStreamSerializer0 = new XStreamSerializer();
      PrevalentSystemGuard prevalentSystemGuard0 = new PrevalentSystemGuard((Object) "Prevayler is no longer processing queries due to an Error thrown from an earlier transaction.", (-2980L), (Serializer) xStreamSerializer0);
      Query query0 = null;
      MachineClock machineClock0 = new MachineClock();
      Date date0 = machineClock0.time();
      TransactionCapsule transactionCapsule0 = new TransactionCapsule((Transaction) null, (Serializer) xStreamSerializer0);
      TransactionTimestamp transactionTimestamp0 = new TransactionTimestamp((Capsule) transactionCapsule0, (-2980L), date0);
      Chunk chunk0 = transactionTimestamp0.toChunk();
      TransactionTimestamp transactionTimestamp1 = TransactionTimestamp.fromChunk(chunk0);
      TransactionTimestamp transactionTimestamp2 = transactionTimestamp1.cleanCopy();
      // Undeclared exception!
      try { 
        prevalentSystemGuard0.receive(transactionTimestamp2);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Attempted to apply transaction -2980 when prevalent system was only at -2980
         //
         assertThrownBy("org.prevayler.implementation.PrevalentSystemGuard", e);
      }
  }

  @Test
  public void test23()  throws Throwable  {
      MinguoChronology minguoChronology0 = MinguoChronology.INSTANCE;
      // Undeclared exception!
      try { 
        minguoChronology0.dateYearDay(0, 0);
        fail("Expecting exception: DateTimeException");
      
      } catch(DateTimeException e) {
         //
         // Invalid value for DayOfYear (valid values 1 - 365/366): 0
         //
         assertThrownBy("java.time.temporal.ValueRange", e);
      }
  }

  @Test
  public void test24()  throws Throwable  {
      Object object0 = new Object();
      long long0 = (-3119L);
      XStreamSerializer xStreamSerializer0 = new XStreamSerializer("~r> /8");
      ObjectOutputStream objectOutputStream0 = null;
      try {
        objectOutputStream0 = new ObjectOutputStream((OutputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.io.ObjectOutputStream$BlockDataOutputStream", e);
      }
  }
}
