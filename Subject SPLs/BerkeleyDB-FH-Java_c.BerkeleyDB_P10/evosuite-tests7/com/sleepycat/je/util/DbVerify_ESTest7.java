/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 21 22:13:44 KST 2017
 */

package com.sleepycat.je.util;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.fail;

import java.io.OutputStream;
import java.io.PrintStream;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.sleepycat.bind.tuple.TupleOutput;
import com.sleepycat.je.DatabaseException;
import com.sleepycat.je.Environment;
import com.sleepycat.je.StatsConfig;
import com.sleepycat.je.dbi.EnvironmentImpl;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class DbVerify_ESTest7 extends DbVerify_ESTest_scaffolding7 {

  @Test
  public void test00()  throws Throwable  {
      DbVerify dbVerify0 = new DbVerify();
      StatsConfig statsConfig0 = new StatsConfig();
      statsConfig0.getShowProgressStream();
      // Undeclared exception!
      try { 
        dbVerify0.verify((PrintStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // envHome cannot be null
         //
         assertThrownBy("com.sleepycat.je.DatabaseUtil", e);
      }
  }

  @Test
  public void test01()  throws Throwable  {
      DbVerify dbVerify0 = new DbVerify();
      // Undeclared exception!
      try { 
        dbVerify0.verify((PrintStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // envHome cannot be null
         //
         assertThrownBy("com.sleepycat.je.DatabaseUtil", e);
      }
  }

  @Test
  public void test02()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
          DbVerify dbVerify0 = new DbVerify();
          // Undeclared exception!
          try { 
            dbVerify0.printUsage("9");
            fail("Expecting exception: SecurityException");
          
          } catch(SecurityException e) {
             //
             // Security manager blocks (\"java.lang.RuntimePermission\" \"exitVM.-1\")
             // java.lang.Thread.getStackTrace(Thread.java:1552)
             // org.evosuite.runtime.sandbox.MSecurityManager.checkPermission(MSecurityManager.java:433)
             // java.lang.SecurityManager.checkExit(SecurityManager.java:761)
             // java.lang.Runtime.exit(Runtime.java:107)
             // java.lang.System.exit(System.java:971)
             // com.sleepycat.je.util.DbVerify.printUsage(DbVerify.java:79)
             // sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
             // sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
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
      } 
    });
    future.get(4000, TimeUnit.MILLISECONDS);
  }

  @Test
  public void test03()  throws Throwable  {
      DbVerify dbVerify0 = new DbVerify();
      String[] stringArray0 = new String[17];
      // Undeclared exception!
      try { 
        dbVerify0.parseArgs(stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test04()  throws Throwable  {
      DbVerify dbVerify0 = new DbVerify();
      // Undeclared exception!
      try { 
        dbVerify0.openEnv();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // envHome cannot be null
         //
         assertThrownBy("com.sleepycat.je.DatabaseUtil", e);
      }
  }

  @Test
  public void test05()  throws Throwable  {
      DbVerify dbVerify0 = new DbVerify();
      dbVerify0.dbName = "/ ._l_*OGl@";
      String[] stringArray0 = new String[3];
      stringArray0[0] = "|i2H%Hb[l8q;s";
      stringArray0[1] = "-h";
      stringArray0[2] = "|i2H%Hb[l8q;s";
      dbVerify0.parseArgs(stringArray0);
      try { 
        dbVerify0.openEnv();
        fail("Expecting exception: DatabaseException");
      
      } catch(DatabaseException e) {
         //
         // java.io.IOException: \uD30C\uC77C \uC774\uB984, \uB514\uB809\uD130\uB9AC \uC774\uB984 \uB610\uB294 \uBCFC\uB968 \uB808\uC774\uBE14 \uAD6C\uBB38\uC774 \uC798\uBABB\uB418\uC5C8\uC2B5\uB2C8\uB2E4
         //
         assertThrownBy("com.sleepycat.je.dbi.DbEnvPool", e);
      }
  }

  @Test
  public void test06()  throws Throwable  {
      String[] stringArray0 = new String[12];
      stringArray0[0] = ">UDL_z@8/.i=CUR";
      stringArray0[1] = "h(xab+M?l0M}IgO;p#";
      stringArray0[2] = "h(xab+M?l0M}IgO;p#";
      stringArray0[3] = ">UDL_z@8/.i=CUR";
      stringArray0[4] = "-v";
      // Undeclared exception!
      try { 
        DbVerify.main(stringArray0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // null
         //
         assertThrownBy("java.lang.Integer", e);
      }
  }

  @Test
  public void test07()  throws Throwable  {
      DbVerify dbVerify0 = new DbVerify();
      dbVerify0.quiet = true;
      // Undeclared exception!
      try { 
        dbVerify0.verify((PrintStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // envHome cannot be null
         //
         assertThrownBy("com.sleepycat.je.DatabaseUtil", e);
      }
  }

  @Test
  public void test08()  throws Throwable  {
      DbVerify dbVerify0 = new DbVerify();
      String[] stringArray0 = new String[3];
      stringArray0[0] = "|i2H%Hb[l8q;s";
      dbVerify0.dbName = "|i2H%Hb[l8q;s";
      stringArray0[1] = "-h";
      stringArray0[2] = "|i2H%Hb[l8q;s";
      dbVerify0.parseArgs(stringArray0);
      TupleOutput tupleOutput0 = new TupleOutput();
      PrintStream printStream0 = new PrintStream((OutputStream) tupleOutput0);
      try { 
        dbVerify0.verify(printStream0);
        fail("Expecting exception: DatabaseException");
      
      } catch(DatabaseException e) {
         //
         // java.io.IOException: \uD30C\uC77C \uC774\uB984, \uB514\uB809\uD130\uB9AC \uC774\uB984 \uB610\uB294 \uBCFC\uB968 \uB808\uC774\uBE14 \uAD6C\uBB38\uC774 \uC798\uBABB\uB418\uC5C8\uC2B5\uB2C8\uB2E4
         //
         assertThrownBy("com.sleepycat.je.dbi.DbEnvPool", e);
      }
  }

  @Test
  public void test09()  throws Throwable  {
      String[] stringArray0 = new String[7];
      stringArray0[0] = "Bc#Szu/";
      stringArray0[1] = "Bc#Szu/";
      stringArray0[2] = "Bc#Szu/";
      stringArray0[3] = "-c";
      // Undeclared exception!
      try { 
        DbVerify.main(stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test10()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
        try {
          String[] stringArray0 = new String[5];
          stringArray0[0] = ">UDL_z@8/.i=CUR";
          stringArray0[1] = ">UDL_z@8/.i=CUR";
          stringArray0[2] = ">UDL_z@8/.i=CUR";
          stringArray0[3] = "-v requires a positive argument";
          stringArray0[4] = "-v";
          // Undeclared exception!
          try { 
            DbVerify.main(stringArray0);
            fail("Expecting exception: SecurityException");
          
          } catch(SecurityException e) {
             //
             // Security manager blocks (\"java.lang.RuntimePermission\" \"exitVM.-1\")
             // java.lang.Thread.getStackTrace(Thread.java:1552)
             // org.evosuite.runtime.sandbox.MSecurityManager.checkPermission(MSecurityManager.java:433)
             // java.lang.SecurityManager.checkExit(SecurityManager.java:761)
             // java.lang.Runtime.exit(Runtime.java:107)
             // java.lang.System.exit(System.java:971)
             // com.sleepycat.je.util.DbVerify.printUsage(DbVerify.java:79)
             // com.sleepycat.je.util.DbVerify.parseArgs(DbVerify.java:119)
             // com.sleepycat.je.util.DbVerify.main(DbVerify.java:45)
             // sun.reflect.GeneratedMethodAccessor24.invoke(Unknown Source)
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
  public void test11()  throws Throwable  {
      DbVerify dbVerify0 = new DbVerify();
      String[] stringArray0 = new String[7];
      stringArray0[0] = "[{NJ2}~&{S";
      stringArray0[1] = "i T{i{}S BoW ,9k95";
      stringArray0[2] = "E:XF!Kai/XG9mtpS=3$";
      stringArray0[3] = "waqJxC~uFuGN";
      stringArray0[4] = "h(b+M?l0M}LgO;p#";
      stringArray0[5] = "-v";
      // Undeclared exception!
      try { 
        dbVerify0.parseArgs(stringArray0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // null
         //
         assertThrownBy("java.lang.Integer", e);
      }
  }

  @Test
  public void test12()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
          DbVerify dbVerify0 = new DbVerify();
          String[] stringArray0 = new String[2];
          stringArray0[0] = "-s";
          // Undeclared exception!
          try { 
            dbVerify0.parseArgs(stringArray0);
            fail("Expecting exception: SecurityException");
          
          } catch(SecurityException e) {
             //
             // Security manager blocks (\"java.lang.RuntimePermission\" \"exitVM.-1\")
             // java.lang.Thread.getStackTrace(Thread.java:1552)
             // org.evosuite.runtime.sandbox.MSecurityManager.checkPermission(MSecurityManager.java:433)
             // java.lang.SecurityManager.checkExit(SecurityManager.java:761)
             // java.lang.Runtime.exit(Runtime.java:107)
             // java.lang.System.exit(System.java:971)
             // com.sleepycat.je.util.DbVerify.printUsage(DbVerify.java:79)
             // com.sleepycat.je.util.DbVerify.parseArgs(DbVerify.java:127)
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
      } 
    });
    future.get(4000, TimeUnit.MILLISECONDS);
  }

  @Test
  public void test13()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
          DbVerify dbVerify0 = new DbVerify();
          String[] stringArray0 = new String[1];
          stringArray0[0] = "-h";
          // Undeclared exception!
          try { 
            dbVerify0.parseArgs(stringArray0);
            fail("Expecting exception: SecurityException");
          
          } catch(SecurityException e) {
             //
             // Security manager blocks (\"java.lang.RuntimePermission\" \"exitVM.-1\")
             // java.lang.Thread.getStackTrace(Thread.java:1552)
             // org.evosuite.runtime.sandbox.MSecurityManager.checkPermission(MSecurityManager.java:433)
             // java.lang.SecurityManager.checkExit(SecurityManager.java:761)
             // java.lang.Runtime.exit(Runtime.java:107)
             // java.lang.System.exit(System.java:971)
             // com.sleepycat.je.util.DbVerify.printUsage(DbVerify.java:79)
             // com.sleepycat.je.util.DbVerify.parseArgs(DbVerify.java:100)
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
      } 
    });
    future.get(4000, TimeUnit.MILLISECONDS);
  }

  @Test
  public void test14()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
          DbVerify dbVerify0 = new DbVerify();
          String[] stringArray0 = new String[7];
          stringArray0[0] = "[{NJ2}~&{S";
          stringArray0[1] = "[{NJ2}~&{S";
          stringArray0[2] = "E:XF!Kai/XG9mtpS=3$";
          stringArray0[3] = "[{NJ2}~&{S";
          stringArray0[4] = "h(b+M?l0M}LgO;p#";
          stringArray0[5] = "-V";
          // Undeclared exception!
          try { 
            dbVerify0.parseArgs(stringArray0);
            fail("Expecting exception: SecurityException");
          
          } catch(SecurityException e) {
             //
             // Security manager blocks (\"java.lang.RuntimePermission\" \"exitVM.0\")
             // java.lang.Thread.getStackTrace(Thread.java:1552)
             // org.evosuite.runtime.sandbox.MSecurityManager.checkPermission(MSecurityManager.java:433)
             // java.lang.SecurityManager.checkExit(SecurityManager.java:761)
             // java.lang.Runtime.exit(Runtime.java:107)
             // java.lang.System.exit(System.java:971)
             // com.sleepycat.je.util.DbVerify.parseArgs(DbVerify.java:93)
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
      } 
    });
    future.get(4000, TimeUnit.MILLISECONDS);
  }

  @Test
  public void test15()  throws Throwable  {
      String[] stringArray0 = new String[17];
      stringArray0[0] = "-q";
      // Undeclared exception!
      try { 
        DbVerify.main(stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test16()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
          DbVerify dbVerify0 = new DbVerify();
          String[] stringArray0 = new String[3];
          stringArray0[0] = "|i2H%Hb[l8q;s";
          stringArray0[1] = "-h";
          stringArray0[2] = "|i2H%Hb[l8q;s";
          // Undeclared exception!
          try { 
            dbVerify0.parseArgs(stringArray0);
            fail("Expecting exception: SecurityException");
          
          } catch(SecurityException e) {
             //
             // Security manager blocks (\"java.lang.RuntimePermission\" \"exitVM.-1\")
             // java.lang.Thread.getStackTrace(Thread.java:1552)
             // org.evosuite.runtime.sandbox.MSecurityManager.checkPermission(MSecurityManager.java:433)
             // java.lang.SecurityManager.checkExit(SecurityManager.java:761)
             // java.lang.Runtime.exit(Runtime.java:107)
             // java.lang.System.exit(System.java:971)
             // com.sleepycat.je.util.DbVerify.printUsage(DbVerify.java:79)
             // com.sleepycat.je.util.DbVerify.parseArgs(DbVerify.java:130)
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
      } 
    });
    future.get(4000, TimeUnit.MILLISECONDS);
  }

  @Test
  public void test17()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
        try {
          String[] stringArray0 = new String[7];
          stringArray0[0] = "";
          stringArray0[1] = "";
          stringArray0[2] = "";
          stringArray0[3] = "File ";
          stringArray0[4] = "rGEr_4)|)Tnxa";
          stringArray0[5] = "";
          stringArray0[6] = "-s";
          // Undeclared exception!
          try { 
            DbVerify.main(stringArray0);
            fail("Expecting exception: SecurityException");
          
          } catch(SecurityException e) {
             //
             // Security manager blocks (\"java.lang.RuntimePermission\" \"exitVM.-1\")
             // java.lang.Thread.getStackTrace(Thread.java:1552)
             // org.evosuite.runtime.sandbox.MSecurityManager.checkPermission(MSecurityManager.java:433)
             // java.lang.SecurityManager.checkExit(SecurityManager.java:761)
             // java.lang.Runtime.exit(Runtime.java:107)
             // java.lang.System.exit(System.java:971)
             // com.sleepycat.je.util.DbVerify.printUsage(DbVerify.java:79)
             // com.sleepycat.je.util.DbVerify.parseArgs(DbVerify.java:108)
             // com.sleepycat.je.util.DbVerify.main(DbVerify.java:45)
             // sun.reflect.GeneratedMethodAccessor24.invoke(Unknown Source)
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
  public void test18()  throws Throwable  {
      DbVerify dbVerify0 = new DbVerify((Environment) null, "", true);
      dbVerify0.closeEnv();
  }

  @Test
  public void test19()  throws Throwable  {
      DbVerify dbVerify0 = new DbVerify();
      dbVerify0.hook851((EnvironmentImpl) null);
  }

  @Test
  public void test20()  throws Throwable  {
      DbVerify dbVerify0 = new DbVerify();
      dbVerify0.hook852((EnvironmentImpl) null);
  }
}
