/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 02:37:59 KST 2017
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
import com.sleepycat.je.EnvironmentMutableConfig;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class DbRunAction_ESTest2 extends DbRunAction_ESTest_scaffolding2 {

  @Test
  public void test00()  throws Throwable  {
      DbRunAction.DbRunAction_doEvict dbRunAction_DbRunAction_doEvict0 = new DbRunAction.DbRunAction_doEvict((Environment) null);
      dbRunAction_DbRunAction_doEvict0.cacheUsage = 532L;
      // Undeclared exception!
      try { 
        dbRunAction_DbRunAction_doEvict0.hook836();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.util.DbRunAction$DbRunAction_doEvict", e);
      }
  }

  @Test
  public void test01()  throws Throwable  {
      String[] stringArray0 = new String[8];
      DbRunAction.DbRunAction_main dbRunAction_DbRunAction_main0 = new DbRunAction.DbRunAction_main(stringArray0);
      dbRunAction_DbRunAction_main0.doAction = 95;
      dbRunAction_DbRunAction_main0.hook845();
  }

  @Test
  public void test02()  throws Throwable  {
      String[] stringArray0 = new String[2];
      DbRunAction.DbRunAction_main dbRunAction_DbRunAction_main0 = new DbRunAction.DbRunAction_main(stringArray0);
      dbRunAction_DbRunAction_main0.envHome = ",zGi;ewM<pu";
      dbRunAction_DbRunAction_main0.doAction = 3;
      try { 
        dbRunAction_DbRunAction_main0.hook844();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.util.DbRunAction", e);
      }
  }

  @Test
  public void test03()  throws Throwable  {
      String[] stringArray0 = new String[2];
      DbRunAction.DbRunAction_main dbRunAction_DbRunAction_main0 = new DbRunAction.DbRunAction_main(stringArray0);
      dbRunAction_DbRunAction_main0.action = "";
      dbRunAction_DbRunAction_main0.doAction = 3;
      try { 
        dbRunAction_DbRunAction_main0.hook844();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.util.DbRunAction", e);
      }
  }

  @Test
  public void test04()  throws Throwable  {
      String[] stringArray0 = new String[2];
      DbRunAction.DbRunAction_main dbRunAction_DbRunAction_main0 = new DbRunAction.DbRunAction_main(stringArray0);
      dbRunAction_DbRunAction_main0.doAction = 50000;
      dbRunAction_DbRunAction_main0.hook844();
  }

  @Test
  public void test05()  throws Throwable  {
      String[] stringArray0 = new String[23];
      DbRunAction.DbRunAction_main dbRunAction_DbRunAction_main0 = new DbRunAction.DbRunAction_main(stringArray0);
      dbRunAction_DbRunAction_main0.doAction = 5;
      dbRunAction_DbRunAction_main0.action = "<dbId id=\"";
      try { 
        dbRunAction_DbRunAction_main0.hook842();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.util.DbRunAction", e);
      }
  }

  @Test
  public void test06()  throws Throwable  {
      String[] stringArray0 = new String[4];
      DbRunAction.DbRunAction_main dbRunAction_DbRunAction_main0 = new DbRunAction.DbRunAction_main(stringArray0);
      dbRunAction_DbRunAction_main0.doAction = 1798;
      dbRunAction_DbRunAction_main0.hook842();
  }

  @Test
  public void test07()  throws Throwable  {
      String[] stringArray0 = new String[23];
      DbRunAction.DbRunAction_main dbRunAction_DbRunAction_main0 = new DbRunAction.DbRunAction_main(stringArray0);
      dbRunAction_DbRunAction_main0.doAction = 3;
      dbRunAction_DbRunAction_main0.hook840();
  }

  @Test
  public void test08()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
          String[] stringArray0 = new String[8];
          stringArray0[0] = "-a";
          stringArray0[2] = "-a";
          stringArray0[1] = "checkpoint";
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
             // com.sleepycat.je.util.DbRunAction$DbRunAction_main.execute(DbRunAction.java:152)
             // sun.reflect.GeneratedMethodAccessor36.invoke(Unknown Source)
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
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
          String[] stringArray0 = new String[1];
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
             // com.sleepycat.je.util.DbRunAction$DbRunAction_main.execute(DbRunAction.java:152)
             // sun.reflect.GeneratedMethodAccessor36.invoke(Unknown Source)
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
  public void test10()  throws Throwable  {
      String[] stringArray0 = new String[1];
      DbRunAction.DbRunAction_main dbRunAction_DbRunAction_main0 = new DbRunAction.DbRunAction_main(stringArray0);
      dbRunAction_DbRunAction_main0.readOnly = true;
      EnvironmentConfig environmentConfig0 = new EnvironmentConfig();
      dbRunAction_DbRunAction_main0.envConfig = environmentConfig0;
      dbRunAction_DbRunAction_main0.hook847();
  }

  @Test
  public void test11()  throws Throwable  {
      String[] stringArray0 = new String[23];
      DbRunAction.DbRunAction_main dbRunAction_DbRunAction_main0 = new DbRunAction.DbRunAction_main(stringArray0);
      dbRunAction_DbRunAction_main0.doAction = 3;
      try { 
        dbRunAction_DbRunAction_main0.hook845();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.util.DbRunAction$DbRunAction_main", e);
      }
  }

  @Test
  public void test12()  throws Throwable  {
      String[] stringArray0 = new String[8];
      DbRunAction.DbRunAction_main dbRunAction_DbRunAction_main0 = new DbRunAction.DbRunAction_main(stringArray0);
      dbRunAction_DbRunAction_main0.doAction = 2;
      try { 
        dbRunAction_DbRunAction_main0.hook840();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.util.DbRunAction$DbRunAction_main", e);
      }
  }

  @Test
  public void test13()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
          String[] stringArray0 = new String[6];
          stringArray0[0] = "-ro";
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
             // com.sleepycat.je.util.DbRunAction$DbRunAction_main.execute(DbRunAction.java:152)
             // sun.reflect.GeneratedMethodAccessor36.invoke(Unknown Source)
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
          String[] stringArray0 = new String[7];
          stringArray0[0] = "-h";
          stringArray0[2] = "Preloaded ";
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
             // com.sleepycat.je.util.DbRunAction$DbRunAction_main.execute(DbRunAction.java:152)
             // com.sleepycat.je.util.DbRunAction.main(DbRunAction.java:30)
             // sun.reflect.GeneratedMethodAccessor37.invoke(Unknown Source)
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
             // com.sleepycat.je.util.DbRunAction$DbRunAction_main.execute(DbRunAction.java:152)
             // sun.reflect.GeneratedMethodAccessor36.invoke(Unknown Source)
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
      String[] stringArray0 = new String[4];
      DbRunAction.DbRunAction_main dbRunAction_DbRunAction_main0 = new DbRunAction.DbRunAction_main(stringArray0);
      dbRunAction_DbRunAction_main0.hook838();
  }

  @Test
  public void test18()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
          String[] stringArray0 = new String[8];
          stringArray0[0] = "-a";
          stringArray0[1] = "-a";
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
             // com.sleepycat.je.util.DbRunAction$DbRunAction_main.execute(DbRunAction.java:152)
             // sun.reflect.GeneratedMethodAccessor36.invoke(Unknown Source)
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
  public void test19()  throws Throwable  {
      String[] stringArray0 = new String[2];
      DbRunAction.DbRunAction_main dbRunAction_DbRunAction_main0 = new DbRunAction.DbRunAction_main(stringArray0);
      EnvironmentConfig environmentConfig0 = new EnvironmentConfig();
      dbRunAction_DbRunAction_main0.envConfig = environmentConfig0;
      dbRunAction_DbRunAction_main0.hook848();
  }

  @Test
  public void test20()  throws Throwable  {
      String[] stringArray0 = new String[2];
      DbRunAction.DbRunAction_main dbRunAction_DbRunAction_main0 = new DbRunAction.DbRunAction_main(stringArray0);
      dbRunAction_DbRunAction_main0.hook844();
  }

  @Test
  public void test21()  throws Throwable  {
      String[] stringArray0 = new String[1];
      DbRunAction.DbRunAction_main dbRunAction_DbRunAction_main0 = new DbRunAction.DbRunAction_main(stringArray0);
      dbRunAction_DbRunAction_main0.hook845();
  }

  @Test
  public void test22()  throws Throwable  {
      String[] stringArray0 = new String[2];
      DbRunAction.DbRunAction_main dbRunAction_DbRunAction_main0 = new DbRunAction.DbRunAction_main(stringArray0);
      dbRunAction_DbRunAction_main0.hook847();
  }

  @Test
  public void test23()  throws Throwable  {
      String[] stringArray0 = new String[2];
      DbRunAction.DbRunAction_main dbRunAction_DbRunAction_main0 = new DbRunAction.DbRunAction_main(stringArray0);
      dbRunAction_DbRunAction_main0.hook840();
  }

  @Test
  public void test24()  throws Throwable  {
      String[] stringArray0 = new String[2];
      DbRunAction.DbRunAction_main dbRunAction_DbRunAction_main0 = new DbRunAction.DbRunAction_main(stringArray0);
      dbRunAction_DbRunAction_main0.hook842();
  }

  @Test
  public void test25()  throws Throwable  {
      DbRunAction.DbRunAction_doEvict dbRunAction_DbRunAction_doEvict0 = new DbRunAction.DbRunAction_doEvict((Environment) null);
      // Undeclared exception!
      try { 
        dbRunAction_DbRunAction_doEvict0.execute();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.DbInternal", e);
      }
  }

  @Test
  public void test26()  throws Throwable  {
      DbRunAction.DbRunAction_doEvict dbRunAction_DbRunAction_doEvict0 = new DbRunAction.DbRunAction_doEvict((Environment) null);
      EnvironmentConfig environmentConfig0 = new EnvironmentConfig();
      dbRunAction_DbRunAction_doEvict0.c = (EnvironmentMutableConfig) environmentConfig0;
      dbRunAction_DbRunAction_doEvict0.hook836();
  }

  @Test
  public void test27()  throws Throwable  {
      DbRunAction.DbRunAction_doEvict dbRunAction_DbRunAction_doEvict0 = new DbRunAction.DbRunAction_doEvict((Environment) null);
      // Undeclared exception!
      try { 
        dbRunAction_DbRunAction_doEvict0.hook837();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.util.DbRunAction$DbRunAction_doEvict", e);
      }
  }
}
