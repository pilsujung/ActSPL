/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 07 23:42:25 KST 2017
 */

package org.prevayler;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.fail;

import java.io.Serializable;
import java.net.URL;
import java.time.ZoneOffset;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.prevayler.foundation.monitor.Log4jMonitor;
import org.prevayler.foundation.serialization.JavaSerializer;
import org.prevayler.foundation.serialization.Serializer;
import org.prevayler.foundation.serialization.SkaringaSerializer;
import org.prevayler.foundation.serialization.XStreamSerializer;
import org.prevayler.implementation.PrevaylerImpl;
import org.prevayler.implementation.clock.MachineClock;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class PrevaylerFactory_ESTest1 extends PrevaylerFactory_ESTest_scaffolding1 {

  @Test
  public void test01()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
        try {
          ZoneOffset zoneOffset0 = ZoneOffset.UTC;
          ClassLoader.getSystemResource("");
          // Undeclared exception!
          try { 
            PrevaylerFactory.createPrevayler((Serializable) zoneOffset0, "");
            fail("Expecting exception: SecurityException");
          
          } catch(SecurityException e) {
             //
             // Security manager blocks (\"java.io.FilePermission\" \"\" \"write\")
             // java.lang.Thread.getStackTrace(Thread.java:1552)
             // org.evosuite.runtime.sandbox.MSecurityManager.checkPermission(MSecurityManager.java:433)
             // java.lang.SecurityManager.checkWrite(SecurityManager.java:979)
             // java.io.File.mkdir(File.java:1311)
             // java.io.File.mkdirs(File.java:1343)
             // org.prevayler.foundation.FileManager.produceDirectory(FileManager.java:15)
             // org.prevayler.implementation.PrevaylerDirectory.produceDirectory(PrevaylerDirectory.java:35)
             // org.prevayler.implementation.snapshot.GenericSnapshotManager.<init>(GenericSnapshotManager.java:39)
             // org.prevayler.PrevaylerFactory.snapshotManager(PrevaylerFactory.java:428)
             // org.prevayler.PrevaylerFactory.create(PrevaylerFactory.java:344)
             // org.prevayler.PrevaylerFactory.createPrevayler(PrevaylerFactory.java:105)
             // sun.reflect.GeneratedMethodAccessor74.invoke(Unknown Source)
             // sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
             // java.lang.reflect.Method.invoke(Method.java:497)
             // org.evosuite.testcase.statements.MethodStatement$1.execute(MethodStatement.java:261)
             // org.evosuite.testcase.statements.AbstractStatement.exceptionHandler(AbstractStatement.java:169)
             // org.evosuite.testcase.statements.MethodStatement.execute(MethodStatement.java:224)
             // org.evosuite.testcase.execution.TestRunnable.executeStatements(TestRunnable.java:306)
             // org.evosuite.testcase.execution.TestRunnable.call(TestRunnable.java:212)
             // org.evosuite.testcase.execution.TestRunnable.call(TestRunnable.java:55)
             // java.util.concurrent.FutureTask.run(FutureTask.java:266)
             // java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1142)
             // java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:617)
             // java.lang.Thread.run(Thread.java:745)
             //
             assertThrownBy("org.evosuite.runtime.sandbox.MSecurityManager", e);
          }
        } catch(Throwable t) {
            // Need to catch declared exceptions
        }
      } 
    });
    future.get(4000, TimeUnit.MILLISECONDS);
  }

  @Test
  public void test06()  throws Throwable  {
      PrevaylerFactory prevaylerFactory0 = new PrevaylerFactory();
      JavaSerializer javaSerializer0 = new JavaSerializer((ClassLoader) null);
      prevaylerFactory0.configureJournalSerializer(javaSerializer0);
      SkaringaSerializer skaringaSerializer0 = new SkaringaSerializer();
      // Undeclared exception!
      try { 
        prevaylerFactory0.configureJournalSerializer(skaringaSerializer0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Read the javadoc to this method.
         //
         assertThrownBy("org.prevayler.PrevaylerFactory", e);
      }
  }

  @Test
  public void test07()  throws Throwable  {
      PrevaylerFactory prevaylerFactory0 = new PrevaylerFactory();
      XStreamSerializer xStreamSerializer0 = new XStreamSerializer("JKp$=jZGFurOv");
      prevaylerFactory0.configureJournalSerializer(xStreamSerializer0);
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      JavaSerializer javaSerializer0 = new JavaSerializer(classLoader0);
      // Undeclared exception!
      try { 
        prevaylerFactory0.configureJournalSerializer(javaSerializer0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Read the javadoc to this method.
         //
         assertThrownBy("org.prevayler.PrevaylerFactory", e);
      }
  }

  @Test
  public void test08()  throws Throwable  {
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
         assertThrownBy("org.prevayler.implementation.PrevaylerDirectory", e);
      }
  }

  @Test
  public void test09()  throws Throwable  {
      PrevaylerFactory prevaylerFactory0 = new PrevaylerFactory();
      JavaSerializer javaSerializer0 = new JavaSerializer();
      // Undeclared exception!
      try { 
        prevaylerFactory0.configureJournalSerializer("", (Serializer) javaSerializer0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Journal filename suffix must match /[a-zA-Z0-9]*[Jj]ournal/, but '' does not
         //
         assertThrownBy("org.prevayler.implementation.PrevaylerDirectory", e);
      }
  }

  @Test
  public void test12()  throws Throwable  {
      PrevaylerFactory prevaylerFactory0 = new PrevaylerFactory();
      prevaylerFactory0.configurePrevalenceDirectory((String) null);
  }

  @Test
  public void test14()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
        try {
          PrevaylerFactory prevaylerFactory0 = new PrevaylerFactory();
          ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
          JavaSerializer javaSerializer0 = new JavaSerializer(classLoader0);
          Object object0 = new Object();
          prevaylerFactory0.configurePrevalentSystem(object0);
          prevaylerFactory0.configureJournalSerializer(javaSerializer0);
          // Undeclared exception!
          try { 
            prevaylerFactory0.create();
            fail("Expecting exception: SecurityException");
          
          } catch(SecurityException e) {
             //
             // Security manager blocks (\"java.io.FilePermission\" \"Prevalence\" \"write\")
             // java.lang.Thread.getStackTrace(Thread.java:1552)
             // org.evosuite.runtime.sandbox.MSecurityManager.checkPermission(MSecurityManager.java:433)
             // java.lang.SecurityManager.checkWrite(SecurityManager.java:979)
             // java.io.File.mkdir(File.java:1311)
             // java.io.File.mkdirs(File.java:1343)
             // org.prevayler.foundation.FileManager.produceDirectory(FileManager.java:15)
             // org.prevayler.implementation.PrevaylerDirectory.produceDirectory(PrevaylerDirectory.java:35)
             // org.prevayler.implementation.snapshot.GenericSnapshotManager.<init>(GenericSnapshotManager.java:39)
             // org.prevayler.PrevaylerFactory.snapshotManager(PrevaylerFactory.java:428)
             // org.prevayler.PrevaylerFactory.create(PrevaylerFactory.java:344)
             // sun.reflect.GeneratedMethodAccessor70.invoke(Unknown Source)
             // sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
             // java.lang.reflect.Method.invoke(Method.java:497)
             // org.evosuite.testcase.statements.MethodStatement$1.execute(MethodStatement.java:261)
             // org.evosuite.testcase.statements.AbstractStatement.exceptionHandler(AbstractStatement.java:169)
             // org.evosuite.testcase.statements.MethodStatement.execute(MethodStatement.java:224)
             // org.evosuite.testcase.execution.TestRunnable.executeStatements(TestRunnable.java:306)
             // org.evosuite.testcase.execution.TestRunnable.call(TestRunnable.java:212)
             // org.evosuite.testcase.execution.TestRunnable.call(TestRunnable.java:55)
             // java.util.concurrent.FutureTask.run(FutureTask.java:266)
             // java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1142)
             // java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:617)
             // java.lang.Thread.run(Thread.java:745)
             //
             assertThrownBy("org.evosuite.runtime.sandbox.MSecurityManager", e);
          }
        } catch(Throwable t) {
            // Need to catch declared exceptions
        }
      } 
    });
    future.get(4000, TimeUnit.MILLISECONDS);
  }

  @Test
  public void test15()  throws Throwable  {
      PrevaylerFactory prevaylerFactory0 = new PrevaylerFactory();
      Log4jMonitor log4jMonitor0 = new Log4jMonitor();
      prevaylerFactory0.configureMonitor(log4jMonitor0);
  }

  @Test
  public void test19()  throws Throwable  {
      Prevayler prevayler0 = PrevaylerFactory.createTransientPrevayler((Serializable) null, "~^");
      assertNull(prevayler0);
  }

  @Test
  public void test20()  throws Throwable  {
      PrevaylerFactory prevaylerFactory0 = new PrevaylerFactory();
      prevaylerFactory0.configureJournalFileAgeThreshold(0L);
  }

  @Test
  public void test22()  throws Throwable  {
      PrevaylerFactory prevaylerFactory0 = new PrevaylerFactory();
      SkaringaSerializer skaringaSerializer0 = new SkaringaSerializer();
      prevaylerFactory0.configureJournalSerializer(skaringaSerializer0);
  }

  @Test
  public void test23()  throws Throwable  {
      PrevaylerFactory prevaylerFactory0 = new PrevaylerFactory();
      prevaylerFactory0.configureTransactionFiltering(false);
  }

  @Test
  public void test24()  throws Throwable  {
      PrevaylerFactory prevaylerFactory0 = new PrevaylerFactory();
      MachineClock machineClock0 = new MachineClock();
      prevaylerFactory0.configureClock(machineClock0);
  }

  @Test
  public void test26()  throws Throwable  {
      PrevaylerFactory prevaylerFactory0 = new PrevaylerFactory();
      JavaSerializer javaSerializer0 = new JavaSerializer();
      prevaylerFactory0.configureJournalSerializer(javaSerializer0);
      XStreamSerializer xStreamSerializer0 = new XStreamSerializer("'$A2<'");
      // Undeclared exception!
      try { 
        prevaylerFactory0.configureJournalSerializer(xStreamSerializer0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Read the javadoc to this method.
         //
         assertThrownBy("org.prevayler.PrevaylerFactory", e);
      }
  }

  @Test
  public void test27()  throws Throwable  {
      PrevaylerFactory prevaylerFactory0 = new PrevaylerFactory();
      prevaylerFactory0.configureJournalFileSizeThreshold(1224L);
  }

  @Test
  public void test28()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
          Prevayler prevayler0 = PrevaylerFactory.createCheckpointPrevayler("'$A2<'", "'$A2<'");
          assertNull(prevayler0);
      } 
    });
    future.get(4000, TimeUnit.MILLISECONDS);
  }
}
