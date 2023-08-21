/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 22 05:25:47 GMT 2022
 */

package org.prevayler;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.Serializable;
import java.time.Month;
import java.time.OffsetTime;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.time.MockOffsetTime;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;
import org.prevayler.Clock;
import org.prevayler.Prevayler;
import org.prevayler.PrevaylerFactory;
import org.prevayler.foundation.monitor.NullMonitor;
import org.prevayler.foundation.serialization.JavaSerializer;
import org.prevayler.foundation.serialization.Serializer;
import org.prevayler.foundation.serialization.SkaringaSerializer;
import org.prevayler.foundation.serialization.XStreamSerializer;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class PrevaylerFactory_ESTest extends PrevaylerFactory_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      PrevaylerFactory prevaylerFactory0 = new PrevaylerFactory();
      XStreamSerializer xStreamSerializer0 = new XStreamSerializer("");
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      PipedInputStream pipedInputStream0 = new PipedInputStream(pipedOutputStream0);
      prevaylerFactory0.configurePrevalentSystem(pipedInputStream0);
      prevaylerFactory0.configureSnapshotSerializer(xStreamSerializer0);
      // Undeclared exception!
      try { 
        prevaylerFactory0.create();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.prevayler.implementation.PrevaylerImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      // Undeclared exception!
      try { 
        PrevaylerFactory.createPrevayler((Serializable) null, "<");
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // The prevalent system must be configured.
         //
         verifyException("org.prevayler.PrevaylerFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      OffsetTime offsetTime0 = MockOffsetTime.now();
      try { 
        PrevaylerFactory.createPrevayler((Serializable) offsetTime0, ">S|orb{lP`X Lc}U");
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Directory doesn't exist and could not be created: >S|orb{lP`X Lc}U
         //
         verifyException("org.prevayler.foundation.FileManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      // Undeclared exception!
      try { 
        PrevaylerFactory.createPrevayler((Serializable) null);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // The prevalent system must be configured.
         //
         verifyException("org.prevayler.PrevaylerFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("PrevalenceBase");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "");
      Month month0 = Month.DECEMBER;
      try { 
        PrevaylerFactory.createPrevayler((Serializable) month0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Path exists but is not a directory: PrevalenceBase
         //
         verifyException("org.prevayler.foundation.FileManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      PrevaylerFactory prevaylerFactory0 = new PrevaylerFactory();
      Locale locale0 = new Locale("V8F", "6}", "V8F");
      prevaylerFactory0.configurePrevalentSystem(locale0);
      FileSystemHandling.shouldAllThrowIOExceptions();
      try { 
        prevaylerFactory0.create();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Directory doesn't exist and could not be created: Prevalence
         //
         verifyException("org.prevayler.foundation.FileManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      PrevaylerFactory prevaylerFactory0 = new PrevaylerFactory();
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      JavaSerializer javaSerializer0 = new JavaSerializer(classLoader0);
      // Undeclared exception!
      try { 
        prevaylerFactory0.configureSnapshotSerializer((String) null, (Serializer) javaSerializer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.prevayler.implementation.PrevaylerDirectory", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      PrevaylerFactory prevaylerFactory0 = new PrevaylerFactory();
      XStreamSerializer xStreamSerializer0 = new XStreamSerializer("");
      // Undeclared exception!
      try { 
        prevaylerFactory0.configureSnapshotSerializer("kZ", (Serializer) xStreamSerializer0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Snapshot filename suffix must match /[a-zA-Z0-9]*[Ss]napshot/, but 'kZ' does not
         //
         verifyException("org.prevayler.implementation.PrevaylerDirectory", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      PrevaylerFactory prevaylerFactory0 = new PrevaylerFactory();
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      JavaSerializer javaSerializer0 = new JavaSerializer(classLoader0);
      prevaylerFactory0.configureJournalSerializer(javaSerializer0);
      // Undeclared exception!
      try { 
        prevaylerFactory0.configureJournalSerializer((SkaringaSerializer) null);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Read the javadoc to this method.
         //
         verifyException("org.prevayler.PrevaylerFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      PrevaylerFactory prevaylerFactory0 = new PrevaylerFactory();
      XStreamSerializer xStreamSerializer0 = new XStreamSerializer();
      prevaylerFactory0.configureJournalSerializer(xStreamSerializer0);
      JavaSerializer javaSerializer0 = new JavaSerializer();
      // Undeclared exception!
      try { 
        prevaylerFactory0.configureJournalSerializer(javaSerializer0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Read the javadoc to this method.
         //
         verifyException("org.prevayler.PrevaylerFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      PrevaylerFactory prevaylerFactory0 = new PrevaylerFactory();
      XStreamSerializer xStreamSerializer0 = new XStreamSerializer();
      // Undeclared exception!
      try { 
        prevaylerFactory0.configureJournalSerializer((String) null, (Serializer) xStreamSerializer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.prevayler.implementation.PrevaylerDirectory", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      PrevaylerFactory prevaylerFactory0 = new PrevaylerFactory();
      JavaSerializer javaSerializer0 = new JavaSerializer((ClassLoader) null);
      // Undeclared exception!
      try { 
        prevaylerFactory0.configureJournalSerializer("", (Serializer) javaSerializer0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Journal filename suffix must match /[a-zA-Z0-9]*[Jj]ournal/, but '' does not
         //
         verifyException("org.prevayler.implementation.PrevaylerDirectory", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      PrevaylerFactory prevaylerFactory0 = new PrevaylerFactory();
      XStreamSerializer xStreamSerializer0 = new XStreamSerializer();
      prevaylerFactory0.configureSnapshotSerializer("xstreamsnapshot", (Serializer) xStreamSerializer0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      PrevaylerFactory prevaylerFactory0 = new PrevaylerFactory();
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      JavaSerializer javaSerializer0 = new JavaSerializer(classLoader0);
      prevaylerFactory0.configureSnapshotSerializer(javaSerializer0);
      prevaylerFactory0.configureSnapshotSerializer("snapshot", (Serializer) javaSerializer0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      PrevaylerFactory prevaylerFactory0 = new PrevaylerFactory();
      XStreamSerializer xStreamSerializer0 = new XStreamSerializer();
      prevaylerFactory0.configureJournalSerializer("journal", (Serializer) xStreamSerializer0);
      // Undeclared exception!
      try { 
        prevaylerFactory0.configureJournalSerializer(xStreamSerializer0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Read the javadoc to this method.
         //
         verifyException("org.prevayler.PrevaylerFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Prevayler prevayler0 = PrevaylerFactory.createCheckpointPrevayler("Prevalence", "Prevalence");
      assertNull(prevayler0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      PrevaylerFactory prevaylerFactory0 = new PrevaylerFactory();
      prevaylerFactory0.configurePrevalenceDirectory("char");
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      // Undeclared exception!
      try { 
        PrevaylerFactory.createPrevayler((Serializable) "char", "char");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.prevayler.implementation.PrevaylerImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      PrevaylerFactory prevaylerFactory0 = new PrevaylerFactory();
      prevaylerFactory0.configureTransientMode(false);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      PrevaylerFactory prevaylerFactory0 = new PrevaylerFactory();
      Long long0 = new Long(1896L);
      prevaylerFactory0.configurePrevalentSystem(long0);
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      JavaSerializer javaSerializer0 = new JavaSerializer(classLoader0);
      prevaylerFactory0.configureJournalSerializer(javaSerializer0);
      // Undeclared exception!
      try { 
        prevaylerFactory0.create();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.prevayler.implementation.PrevaylerImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Prevayler prevayler0 = PrevaylerFactory.createTransientPrevayler((Serializable) null, (String) null);
      assertNull(prevayler0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      PrevaylerFactory prevaylerFactory0 = new PrevaylerFactory();
      XStreamSerializer xStreamSerializer0 = new XStreamSerializer(",");
      prevaylerFactory0.configureJournalSerializer(xStreamSerializer0);
      JavaSerializer javaSerializer0 = new JavaSerializer();
      // Undeclared exception!
      try { 
        prevaylerFactory0.configureJournalSerializer("skaringajournal", (Serializer) javaSerializer0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Read the javadoc to this method.
         //
         verifyException("org.prevayler.PrevaylerFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      PrevaylerFactory prevaylerFactory0 = new PrevaylerFactory();
      NullMonitor nullMonitor0 = new NullMonitor();
      prevaylerFactory0.configureMonitor(nullMonitor0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      PrevaylerFactory prevaylerFactory0 = new PrevaylerFactory();
      prevaylerFactory0.configureSnapshotSerializer((XStreamSerializer) null);
      // Undeclared exception!
      try { 
        prevaylerFactory0.create();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // The prevalent system must be configured.
         //
         verifyException("org.prevayler.PrevaylerFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Prevayler prevayler0 = PrevaylerFactory.createTransientPrevayler((Serializable) null);
      assertNull(prevayler0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      PrevaylerFactory prevaylerFactory0 = new PrevaylerFactory();
      prevaylerFactory0.configureJournalFileAgeThreshold((-1762L));
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      // Undeclared exception!
      try { 
        PrevaylerFactory.createPrevayler((Serializable) "The prevalent system must be configured.");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.prevayler.implementation.PrevaylerImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      PrevaylerFactory prevaylerFactory0 = new PrevaylerFactory();
      prevaylerFactory0.configureJournalSerializer((SkaringaSerializer) null);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      PrevaylerFactory prevaylerFactory0 = new PrevaylerFactory();
      prevaylerFactory0.configureTransactionFiltering(true);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      PrevaylerFactory prevaylerFactory0 = new PrevaylerFactory();
      prevaylerFactory0.configureClock((Clock) null);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      PrevaylerFactory prevaylerFactory0 = new PrevaylerFactory();
      prevaylerFactory0.configureSnapshotSerializer((SkaringaSerializer) null);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      PrevaylerFactory prevaylerFactory0 = new PrevaylerFactory();
      prevaylerFactory0.configureJournalFileSizeThreshold(0L);
  }
}
