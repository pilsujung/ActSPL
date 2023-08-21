/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 02:51:30 KST 2017
 */

package com.sleepycat.je.util;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.fail;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.sleepycat.je.Environment;
import com.sleepycat.je.EnvironmentConfig;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class DbRunAction_ESTest6 extends DbRunAction_ESTest_scaffolding6 {

  @Test
  public void test01()  throws Throwable  {
      String[] stringArray0 = new String[3];
      DbRunAction.DbRunAction_main dbRunAction_DbRunAction_main0 = new DbRunAction.DbRunAction_main(stringArray0);
      dbRunAction_DbRunAction_main0.doAction = 53;
      dbRunAction_DbRunAction_main0.hook845();
  }

  @Test
  public void test02()  throws Throwable  {
      String[] stringArray0 = new String[1];
      DbRunAction.DbRunAction_main dbRunAction_DbRunAction_main0 = new DbRunAction.DbRunAction_main(stringArray0);
      dbRunAction_DbRunAction_main0.doAction = 4;
      dbRunAction_DbRunAction_main0.hook844();
  }

  @Test
  public void test03()  throws Throwable  {
      String[] stringArray0 = new String[12];
      DbRunAction.DbRunAction_main dbRunAction_DbRunAction_main0 = new DbRunAction.DbRunAction_main(stringArray0);
      dbRunAction_DbRunAction_main0.doAction = 1;
      dbRunAction_DbRunAction_main0.hook844();
  }

  @Test
  public void test04()  throws Throwable  {
      String[] stringArray0 = new String[3];
      DbRunAction.DbRunAction_main dbRunAction_DbRunAction_main0 = new DbRunAction.DbRunAction_main(stringArray0);
      dbRunAction_DbRunAction_main0.doAction = 1968;
      dbRunAction_DbRunAction_main0.hook842();
  }

  @Test
  public void test05()  throws Throwable  {
      String[] stringArray0 = new String[1];
      DbRunAction.DbRunAction_main dbRunAction_DbRunAction_main0 = new DbRunAction.DbRunAction_main(stringArray0);
      dbRunAction_DbRunAction_main0.doAction = 327;
      dbRunAction_DbRunAction_main0.hook840();
  }

  @Test
  public void test06()  throws Throwable  {
      String[] stringArray0 = new String[9];
      DbRunAction.DbRunAction_main dbRunAction_DbRunAction_main0 = new DbRunAction.DbRunAction_main(stringArray0);
      dbRunAction_DbRunAction_main0.whichArg = (-1431655763);
      dbRunAction_DbRunAction_main0.hook838();
  }

  @Test
  public void test07()  throws Throwable  {
      String[] stringArray0 = new String[3];
      DbRunAction.DbRunAction_main dbRunAction_DbRunAction_main0 = new DbRunAction.DbRunAction_main(stringArray0);
      dbRunAction_DbRunAction_main0.nFiles = 100;
      dbRunAction_DbRunAction_main0.hook838();
  }

  @Test
  public void test08()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
          String[] stringArray0 = new String[4];
          stringArray0[0] = "-s";
          DbRunAction.DbRunAction_main dbRunAction_DbRunAction_main0 = new DbRunAction.DbRunAction_main(stringArray0);
          // Undeclared exception!
          try { 
            dbRunAction_DbRunAction_main0.execute();
            fail("Expecting exception: SecurityException");
          
          } catch(SecurityException e) {
             //
             // Security manager blocks (\"java.lang.RuntimePermission\" \"exitVM.1\")
             // java.lang.Thread.getStackTrace(Thread.java:1552)
             // org.evosuite.runtime.sandbox.MSecurityManager.checkPermission(MSecurityManager.java:433)
             // java.lang.SecurityManager.checkExit(SecurityManager.java:761)
             // java.lang.Runtime.exit(Runtime.java:107)
             // java.lang.System.exit(System.java:971)
             // com.sleepycat.je.util.DbRunAction$DbRunAction_main.execute(DbRunAction.java:153)
             // sun.reflect.GeneratedMethodAccessor23.invoke(Unknown Source)
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
  public void test09()  throws Throwable  {
      String[] stringArray0 = new String[19];
      DbRunAction.DbRunAction_main dbRunAction_DbRunAction_main0 = new DbRunAction.DbRunAction_main(stringArray0);
      try { 
        dbRunAction_DbRunAction_main0.hook846();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test10()  throws Throwable  {
      String[] stringArray0 = new String[1];
      DbRunAction.DbRunAction_main dbRunAction_DbRunAction_main0 = new DbRunAction.DbRunAction_main(stringArray0);
      EnvironmentConfig environmentConfig0 = new EnvironmentConfig();
      dbRunAction_DbRunAction_main0.envConfig = environmentConfig0;
      dbRunAction_DbRunAction_main0.readOnly = true;
      dbRunAction_DbRunAction_main0.hook847();
  }

  @Test
  public void test12()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
          String[] stringArray0 = new String[3];
          stringArray0[0] = "SJT";
          DbRunAction.DbRunAction_main dbRunAction_DbRunAction_main0 = new DbRunAction.DbRunAction_main(stringArray0);
          // Undeclared exception!
          try { 
            dbRunAction_DbRunAction_main0.execute();
            fail("Expecting exception: SecurityException");
          
          } catch(SecurityException e) {
             //
             // Security manager blocks (\"java.lang.RuntimePermission\" \"exitVM.1\")
             // java.lang.Thread.getStackTrace(Thread.java:1552)
             // org.evosuite.runtime.sandbox.MSecurityManager.checkPermission(MSecurityManager.java:433)
             // java.lang.SecurityManager.checkExit(SecurityManager.java:761)
             // java.lang.Runtime.exit(Runtime.java:107)
             // java.lang.System.exit(System.java:971)
             // com.sleepycat.je.util.DbRunAction$DbRunAction_main.execute(DbRunAction.java:153)
             // sun.reflect.GeneratedMethodAccessor23.invoke(Unknown Source)
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
          String[] stringArray0 = new String[0];
          DbRunAction.DbRunAction_main dbRunAction_DbRunAction_main0 = new DbRunAction.DbRunAction_main(stringArray0);
          // Undeclared exception!
          try { 
            dbRunAction_DbRunAction_main0.execute();
            fail("Expecting exception: SecurityException");
          
          } catch(SecurityException e) {
             //
             // Security manager blocks (\"java.lang.RuntimePermission\" \"exitVM.1\")
             // java.lang.Thread.getStackTrace(Thread.java:1552)
             // org.evosuite.runtime.sandbox.MSecurityManager.checkPermission(MSecurityManager.java:433)
             // java.lang.SecurityManager.checkExit(SecurityManager.java:761)
             // java.lang.Runtime.exit(Runtime.java:107)
             // java.lang.System.exit(System.java:971)
             // com.sleepycat.je.util.DbRunAction$DbRunAction_main.execute(DbRunAction.java:153)
             // sun.reflect.GeneratedMethodAccessor23.invoke(Unknown Source)
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
      DbRunAction dbRunAction0 = new DbRunAction();
  }

  @Test
  public void test15()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
          String[] stringArray0 = new String[2];
          stringArray0[0] = "-s";
          DbRunAction.DbRunAction_main dbRunAction_DbRunAction_main0 = new DbRunAction.DbRunAction_main(stringArray0);
          // Undeclared exception!
          try { 
            dbRunAction_DbRunAction_main0.execute();
            fail("Expecting exception: SecurityException");
          
          } catch(SecurityException e) {
             //
             // Security manager blocks (\"java.lang.RuntimePermission\" \"exitVM.1\")
             // java.lang.Thread.getStackTrace(Thread.java:1552)
             // org.evosuite.runtime.sandbox.MSecurityManager.checkPermission(MSecurityManager.java:433)
             // java.lang.SecurityManager.checkExit(SecurityManager.java:761)
             // java.lang.Runtime.exit(Runtime.java:107)
             // java.lang.System.exit(System.java:971)
             // com.sleepycat.je.util.DbRunAction$DbRunAction_main.execute(DbRunAction.java:153)
             // sun.reflect.GeneratedMethodAccessor23.invoke(Unknown Source)
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
  public void test16()  throws Throwable  {
      String[] stringArray0 = new String[1];
      DbRunAction.DbRunAction_main dbRunAction_DbRunAction_main0 = new DbRunAction.DbRunAction_main(stringArray0);
      dbRunAction_DbRunAction_main0.hook840();
  }

  @Test
  public void test17()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
          String[] stringArray0 = new String[9];
          stringArray0[0] = "-a";
          stringArray0[1] = "T-,:d_)2";
          // Undeclared exception!
          try { 
            DbRunAction.main(stringArray0);
            fail("Expecting exception: SecurityException");
          
          } catch(SecurityException e) {
             //
             // Security manager blocks (\"java.lang.RuntimePermission\" \"exitVM.1\")
             // java.lang.Thread.getStackTrace(Thread.java:1552)
             // org.evosuite.runtime.sandbox.MSecurityManager.checkPermission(MSecurityManager.java:433)
             // java.lang.SecurityManager.checkExit(SecurityManager.java:761)
             // java.lang.Runtime.exit(Runtime.java:107)
             // java.lang.System.exit(System.java:971)
             // com.sleepycat.je.util.DbRunAction$DbRunAction_main.execute(DbRunAction.java:153)
             // com.sleepycat.je.util.DbRunAction.main(DbRunAction.java:31)
             // sun.reflect.GeneratedMethodAccessor22.invoke(Unknown Source)
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
  public void test18()  throws Throwable  {
      String[] stringArray0 = new String[3];
      DbRunAction.DbRunAction_main dbRunAction_DbRunAction_main0 = new DbRunAction.DbRunAction_main(stringArray0);
      dbRunAction_DbRunAction_main0.hook842();
  }

  
}
