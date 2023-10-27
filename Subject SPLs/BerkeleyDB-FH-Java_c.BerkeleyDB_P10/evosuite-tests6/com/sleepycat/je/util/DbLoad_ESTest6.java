/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 02:47:30 KST 2017
 */

package com.sleepycat.je.util;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.fail;

import java.io.BufferedReader;
import java.io.CharArrayReader;
import java.io.IOException;
import java.io.Reader;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.sleepycat.je.DatabaseException;
import com.sleepycat.je.Environment;
import com.sleepycat.je.log.LogException;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class DbLoad_ESTest6 extends DbLoad_ESTest_scaffolding6 {

  @Test
  public void test00()  throws Throwable  {
      DbLoad dbLoad0 = new DbLoad();
      // Undeclared exception!
      try { 
        dbLoad0.load();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.util.DbLoad", e);
      }
  }

  @Test
  public void test01()  throws Throwable  {
      String[] stringArray0 = new String[7];
      stringArray0[0] = "-T";
      stringArray0[1] = "nINsMigrated=";
      stringArray0[2] = "naa#|_n\"dd)jw";
      stringArray0[3] = "# If true, use latches instead of synchronized blocks to\n# implement the lock table and log write mutexes. Latches require\n# that threads queue to obtain the mutex in question and\n# therefore guarantee that there will be no mutex starvation, but \n# do incur a performance penalty. Latches should not be necessary in\n# most cases, so synchronized blocks are the default. An application\n# that puts heavy load on JE with threads with different thread\n# priorities might find it useful to use latches.  In a Java 5 JVM,\n# where java.util.concurrent.locks.ReentrantLock is used for the\n# latch implementation, this parameter will determine whether they\n# are 'fair' or not.  This parameter is 'static' across all\n# environments.\n";
      stringArray0[4] = "No data to match key ";
      stringArray0[5] = "-h";
      stringArray0[6] = "-h";
      try { 
        DbLoad.main(stringArray0);
        fail("Expecting exception: LogException");
      
      } catch(LogException e) {
         //
         // Environment home -h doesn't exist
         //
         assertThrownBy("com.sleepycat.je.log.FileManager", e);
      }
  }

  @Test
  public void test02()  throws Throwable  {
      DbLoad dbLoad0 = new DbLoad();
      char[] charArray0 = new char[9];
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      BufferedReader bufferedReader0 = new BufferedReader((Reader) charArrayReader0);
      bufferedReader0.close();
      dbLoad0.setInputReader(bufferedReader0);
      try { 
        dbLoad0.load();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Stream closed
         //
         assertThrownBy("java.io.BufferedReader", e);
      }
  }

  @Test
  public void test03()  throws Throwable  {
      DbLoad dbLoad0 = new DbLoad();
      char[] charArray0 = new char[9];
      charArray0[5] = '=';
      dbLoad0.setIgnoreUnknownConfig(true);
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      BufferedReader bufferedReader0 = new BufferedReader((Reader) charArrayReader0);
      dbLoad0.setInputReader(bufferedReader0);
      // Undeclared exception!
      try { 
        dbLoad0.load();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Must supply a database name if -l not supplied.
         //
         assertThrownBy("com.sleepycat.je.util.DbLoad", e);
      }
  }

  @Test
  public void test04()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
        try {
          String[] stringArray0 = new String[4];
          stringArray0[0] = "       [-I]                 # ignore unknown parameters\n";
          stringArray0[1] = "-c";
          stringArray0[2] = "       -h <dir>             # environment home directory\n";
          // Undeclared exception!
          try { 
            DbLoad.main(stringArray0);
            fail("Expecting exception: SecurityException");
          
          } catch(SecurityException e) {
             //
             // Security manager blocks (\"java.lang.RuntimePermission\" \"exitVM.-1\")
             // java.lang.Thread.getStackTrace(Thread.java:1552)
             // org.evosuite.runtime.sandbox.MSecurityManager.checkPermission(MSecurityManager.java:433)
             // java.lang.SecurityManager.checkExit(SecurityManager.java:761)
             // java.lang.Runtime.exit(Runtime.java:107)
             // java.lang.System.exit(System.java:971)
             // com.sleepycat.je.util.DbLoad.printUsage(DbLoad.java:78)
             // com.sleepycat.je.util.DbLoad.parseArgs(DbLoad.java:140)
             // com.sleepycat.je.util.DbLoad.main(DbLoad.java:64)
             // sun.reflect.GeneratedMethodAccessor25.invoke(Unknown Source)
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
  public void test05()  throws Throwable  {
      DbLoad dbLoad0 = new DbLoad();
      char[] charArray0 = new char[9];
      charArray0[5] = '=';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      BufferedReader bufferedReader0 = new BufferedReader((Reader) charArrayReader0);
      dbLoad0.setInputReader(bufferedReader0);
      // Undeclared exception!
      try { 
        dbLoad0.load();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // '\u0000\u0000\u0000\u0000\u0000=\u0000\u0000\u0000' is not understood.
         //
         assertThrownBy("com.sleepycat.je.util.DbLoad", e);
      }
  }

  @Test
  public void test06()  throws Throwable  {
      DbLoad dbLoad0 = new DbLoad();
      dbLoad0.setProgressInterval(4010L);
      // Undeclared exception!
      try { 
        dbLoad0.load();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.util.DbLoad", e);
      }
  }

  @Test
  public void test07()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
        try {
          String[] stringArray0 = new String[5];
          stringArray0[0] = "-I";
          stringArray0[1] = ",W )2PI-hve1|";
          stringArray0[2] = "<dirty val=\"";
          stringArray0[3] = "|,aNyFrrAwHJUGrj_rl";
          stringArray0[4] = " dupIdx=";
          // Undeclared exception!
          try { 
            DbLoad.main(stringArray0);
            fail("Expecting exception: SecurityException");
          
          } catch(SecurityException e) {
             //
             // Security manager blocks (\"java.lang.RuntimePermission\" \"exitVM.-1\")
             // java.lang.Thread.getStackTrace(Thread.java:1552)
             // org.evosuite.runtime.sandbox.MSecurityManager.checkPermission(MSecurityManager.java:433)
             // java.lang.SecurityManager.checkExit(SecurityManager.java:761)
             // java.lang.Runtime.exit(Runtime.java:107)
             // java.lang.System.exit(System.java:971)
             // com.sleepycat.je.util.DbLoad.printUsage(DbLoad.java:78)
             // com.sleepycat.je.util.DbLoad.parseArgs(DbLoad.java:152)
             // com.sleepycat.je.util.DbLoad.main(DbLoad.java:64)
             // sun.reflect.GeneratedMethodAccessor25.invoke(Unknown Source)
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
  public void test08()  throws Throwable  {
      String[] stringArray0 = new String[4];
      stringArray0[0] = "       [-I]                 # ignore unknown parameters\n";
      stringArray0[1] = "-c";
      // Undeclared exception!
      try { 
        DbLoad.main(stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.util.DbLoad", e);
      }
  }

  @Test
  public void test09()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
        try {
          String[] stringArray0 = new String[7];
          stringArray0[0] = "bytevalue";
          stringArray0[1] = "\"TrK^g=oP4";
          stringArray0[2] = "An error occurred when reading ";
          stringArray0[3] = "nXACommits=";
          stringArray0[4] = "G\"pP";
          stringArray0[5] = "";
          stringArray0[6] = "-c";
          // Undeclared exception!
          try { 
            DbLoad.main(stringArray0);
            fail("Expecting exception: SecurityException");
          
          } catch(SecurityException e) {
             //
             // Security manager blocks (\"java.lang.RuntimePermission\" \"exitVM.-1\")
             // java.lang.Thread.getStackTrace(Thread.java:1552)
             // org.evosuite.runtime.sandbox.MSecurityManager.checkPermission(MSecurityManager.java:433)
             // java.lang.SecurityManager.checkExit(SecurityManager.java:761)
             // java.lang.Runtime.exit(Runtime.java:107)
             // java.lang.System.exit(System.java:971)
             // com.sleepycat.je.util.DbLoad.printUsage(DbLoad.java:78)
             // com.sleepycat.je.util.DbLoad.parseArgs(DbLoad.java:144)
             // com.sleepycat.je.util.DbLoad.main(DbLoad.java:64)
             // sun.reflect.GeneratedMethodAccessor25.invoke(Unknown Source)
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
  public void test10()  throws Throwable  {
      String[] stringArray0 = new String[9];
      stringArray0[0] = "J_'mix[:bP";
      stringArray0[1] = "-s requires an argument";
      stringArray0[2] = "je.evictor.deadlockRetry";
      stringArray0[3] = "-s";
      // Undeclared exception!
      try { 
        DbLoad.main(stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.util.DbLoad", e);
      }
  }

  @Test
  public void test11()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
        try {
          String[] stringArray0 = new String[6];
          stringArray0[0] = "d>QH%nG";
          stringArray0[1] = "H+E=:BVEp~hAOB/r3ex";
          stringArray0[2] = "";
          stringArray0[3] = "";
          stringArray0[4] = "'";
          stringArray0[5] = "-s";
          // Undeclared exception!
          try { 
            DbLoad.main(stringArray0);
            fail("Expecting exception: SecurityException");
          
          } catch(SecurityException e) {
             //
             // Security manager blocks (\"java.lang.RuntimePermission\" \"exitVM.-1\")
             // java.lang.Thread.getStackTrace(Thread.java:1552)
             // org.evosuite.runtime.sandbox.MSecurityManager.checkPermission(MSecurityManager.java:433)
             // java.lang.SecurityManager.checkExit(SecurityManager.java:761)
             // java.lang.Runtime.exit(Runtime.java:107)
             // java.lang.System.exit(System.java:971)
             // com.sleepycat.je.util.DbLoad.printUsage(DbLoad.java:78)
             // com.sleepycat.je.util.DbLoad.parseArgs(DbLoad.java:131)
             // com.sleepycat.je.util.DbLoad.main(DbLoad.java:64)
             // sun.reflect.GeneratedMethodAccessor25.invoke(Unknown Source)
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
  public void test12()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
        try {
          String[] stringArray0 = new String[4];
          stringArray0[0] = "       [-T]                 # input file is in text mode\n";
          stringArray0[1] = "<[J\"/E}pO%L";
          stringArray0[2] = "ZMi-JH.m_#UyR";
          stringArray0[3] = "-f";
          // Undeclared exception!
          try { 
            DbLoad.main(stringArray0);
            fail("Expecting exception: SecurityException");
          
          } catch(SecurityException e) {
             //
             // Security manager blocks (\"java.lang.RuntimePermission\" \"exitVM.-1\")
             // java.lang.Thread.getStackTrace(Thread.java:1552)
             // org.evosuite.runtime.sandbox.MSecurityManager.checkPermission(MSecurityManager.java:433)
             // java.lang.SecurityManager.checkExit(SecurityManager.java:761)
             // java.lang.Runtime.exit(Runtime.java:107)
             // java.lang.System.exit(System.java:971)
             // com.sleepycat.je.util.DbLoad.printUsage(DbLoad.java:78)
             // com.sleepycat.je.util.DbLoad.parseArgs(DbLoad.java:115)
             // com.sleepycat.je.util.DbLoad.main(DbLoad.java:64)
             // sun.reflect.GeneratedMethodAccessor25.invoke(Unknown Source)
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
  public void test13()  throws Throwable  {
      String[] stringArray0 = new String[10];
      stringArray0[0] = "-v";
      stringArray0[1] = "-v";
      stringArray0[2] = "-v";
      stringArray0[3] = "Cursor has been closed.";
      stringArray0[4] = "-f";
      // Undeclared exception!
      try { 
        DbLoad.main(stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.util.DbLoad", e);
      }
  }

  @Test
  public void test14()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
        try {
          String[] stringArray0 = new String[8];
          stringArray0[0] = "-n";
          stringArray0[1] = "-V";
          // Undeclared exception!
          try { 
            DbLoad.main(stringArray0);
            fail("Expecting exception: SecurityException");
          
          } catch(SecurityException e) {
             //
             // Security manager blocks (\"java.lang.RuntimePermission\" \"exitVM.0\")
             // java.lang.Thread.getStackTrace(Thread.java:1552)
             // org.evosuite.runtime.sandbox.MSecurityManager.checkPermission(MSecurityManager.java:433)
             // java.lang.SecurityManager.checkExit(SecurityManager.java:761)
             // java.lang.Runtime.exit(Runtime.java:107)
             // java.lang.System.exit(System.java:971)
             // com.sleepycat.je.util.DbLoad.parseArgs(DbLoad.java:108)
             // com.sleepycat.je.util.DbLoad.main(DbLoad.java:64)
             // sun.reflect.GeneratedMethodAccessor25.invoke(Unknown Source)
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
      String[] stringArray0 = new String[7];
      stringArray0[0] = "GXgD]d!RE4M}74V~Cb";
      stringArray0[1] = "nINsMigrated=";
      stringArray0[2] = "naa#|_n\"dd)jw";
      stringArray0[3] = "# If true, use latches instead of synchronized blocks to\n# implement the lock table and log write mutexes. Latches require\n# that threads queue to obtain the mutex in question and\n# therefore guarantee that there will be no mutex starvation, but \n# do incur a performance penalty. Latches should not be necessary in\n# most cases, so synchronized blocks are the default. An application\n# that puts heavy load on JE with threads with different thread\n# priorities might find it useful to use latches.  In a Java 5 JVM,\n# where java.util.concurrent.locks.ReentrantLock is used for the\n# latch implementation, this parameter will determine whether they\n# are 'fair' or not.  This parameter is 'static' across all\n# environments.\n";
      stringArray0[4] = "No data to mtch key ";
      stringArray0[5] = "-h";
      stringArray0[6] = "# If true, use latches instead of synchronized blocks to\n# implement the lock table and log write mutexes. Latches require\n# that threads queue to obtain the mutex in question and\n# therefore guarantee that there will be no mutex starvation, but \n# do incur a performance penalty. Latches should not be necessary in\n# most cases, so synchronized blocks are the default. An application\n# that puts heavy load on JE with threads with different thread\n# priorities might find it useful to use latches.  In a Java 5 JVM,\n# where java.util.concurrent.locks.ReentrantLock is used for the\n# latch implementation, this parameter will determine whether they\n# are 'fair' or not.  This parameter is 'static' across all\n# environments.\n";
      try { 
        DbLoad.main(stringArray0);
        fail("Expecting exception: DatabaseException");
      
      } catch(DatabaseException e) {
         //
         // java.io.IOException: \uB9E4\uAC1C \uBCC0\uC218\uAC00 \uD2C0\uB9BD\uB2C8\uB2E4
         //
         assertThrownBy("com.sleepycat.je.dbi.DbEnvPool", e);
      }
  }

  @Test
  public void test16()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
        try {
          String[] stringArray0 = new String[7];
          stringArray0[0] = "GXgD]d!RE4M}74V~Cb";
          stringArray0[1] = "nINsMigrated=";
          stringArray0[2] = "naa#|_n\"dd)jw";
          stringArray0[3] = "# If true, use latches instead of synchronized blocks to\n# implement the lock table and log write mutexes. Latches require\n# that threads queue to obtain the mutex in question and\n# therefore guarantee that there will be no mutex starvation, but \n# do incur a performance penalty. Latches should not be necessary in\n# most cases, so synchronized blocks are the default. An application\n# that puts heavy load on JE with threads with different thread\n# priorities might find it useful to use latches.  In a Java 5 JVM,\n# where java.util.concurrent.locks.ReentrantLock is used for the\n# latch implementation, this parameter will determine whether they\n# are 'fair' or not.  This parameter is 'static' across all\n# environments.\n";
          stringArray0[4] = "No data to match key ";
          stringArray0[5] = "-soh";
          stringArray0[6] = "-h";
          // Undeclared exception!
          try { 
            DbLoad.main(stringArray0);
            fail("Expecting exception: SecurityException");
          
          } catch(SecurityException e) {
             //
             // Security manager blocks (\"java.lang.RuntimePermission\" \"exitVM.-1\")
             // java.lang.Thread.getStackTrace(Thread.java:1552)
             // org.evosuite.runtime.sandbox.MSecurityManager.checkPermission(MSecurityManager.java:433)
             // java.lang.SecurityManager.checkExit(SecurityManager.java:761)
             // java.lang.Runtime.exit(Runtime.java:107)
             // java.lang.System.exit(System.java:971)
             // com.sleepycat.je.util.DbLoad.printUsage(DbLoad.java:78)
             // com.sleepycat.je.util.DbLoad.parseArgs(DbLoad.java:123)
             // com.sleepycat.je.util.DbLoad.main(DbLoad.java:64)
             // sun.reflect.GeneratedMethodAccessor25.invoke(Unknown Source)
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
  public void test17()  throws Throwable  {
      DbLoad dbLoad0 = new DbLoad();
      dbLoad0.setEnv((Environment) null);
  }

  @Test
  public void test18()  throws Throwable  {
      DbLoad dbLoad0 = new DbLoad();
      dbLoad0.setDbName("jC=JN\u0000");
      dbLoad0.setTextFileMode(true);
      // Undeclared exception!
      try { 
        dbLoad0.load();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.util.DbLoad", e);
      }
  }

  @Test
  public void test19()  throws Throwable  {
      DbLoad dbLoad0 = new DbLoad();
      dbLoad0.setTotalLoadBytes(4010L);
  }

  @Test
  public void test20()  throws Throwable  {
      DbLoad dbLoad0 = new DbLoad();
      dbLoad0.hook835();
  }

  @Test
  public void test21()  throws Throwable  {
      DbLoad dbLoad0 = new DbLoad();
      dbLoad0.setNoOverwrite(true);
  }

  @Test
  public void test22()  throws Throwable  {
      DbLoad dbLoad0 = new DbLoad();
      dbLoad0.setProgressInterval((-9223372036854775808L));
      // Undeclared exception!
      try { 
        dbLoad0.load();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.util.DbLoad", e);
      }
  }
}