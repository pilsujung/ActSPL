/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 06 22:51:46 KST 2017
 */

package org.prevayler.implementation;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.fail;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class PrevaylerDirectory_ESTest5 extends PrevaylerDirectory_ESTest_scaffolding5 {


  @Test
  public void test01()  throws Throwable  {
      PrevaylerDirectory prevaylerDirectory0 = new PrevaylerDirectory((File) null);
      File file0 = prevaylerDirectory0.snapshotFile((-11L), "Snapshot");
      long long0 = PrevaylerDirectory.snapshotVersion(file0);
      assertEquals("0000000000000000-11.Snapshot", file0.toString());
      assertEquals((-1L), long0);
  }

  @Test
  public void test02()  throws Throwable  {
      PrevaylerDirectory prevaylerDirectory0 = new PrevaylerDirectory((File) null);
      File file0 = prevaylerDirectory0.snapshotFile((-11L), "Snapshot");
      long long0 = PrevaylerDirectory.journalVersion(file0);
      assertEquals("0000000000000000-11.Snapshot", file0.toString());
      assertEquals((-1L), long0);
  }

  @Test
  public void test03()  throws Throwable  {
      PrevaylerDirectory prevaylerDirectory0 = new PrevaylerDirectory(".");
      // Undeclared exception!
      try { 
        PrevaylerDirectory.renameUnusedFile((File) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.prevayler.implementation.PrevaylerDirectory", e);
      }
  }


  @Test
  public void test05()  throws Throwable  {
      PrevaylerDirectory prevaylerDirectory0 = new PrevaylerDirectory((File) null);
      // Undeclared exception!
      try { 
        prevaylerDirectory0.snapshotFile((-673L), (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }



  @Test
  public void test08()  throws Throwable  {
      PrevaylerDirectory prevaylerDirectory0 = new PrevaylerDirectory((File) null);
      // Undeclared exception!
      try { 
        prevaylerDirectory0.journalFile(225L, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test09()  throws Throwable  {
      PrevaylerDirectory prevaylerDirectory0 = new PrevaylerDirectory((File) null);
      // Undeclared exception!
      try { 
        prevaylerDirectory0.journalFile(0L, "d{19}.[a-zA-Z0-9]*[Jj]ournal");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Journal filename suffix must match /[a-zA-Z0-9]*[Jj]ournal/, but 'd{19}.[a-zA-Z0-9]*[Jj]ournal' does not
         //
         assertThrownBy("org.prevayler.implementation.PrevaylerDirectory", e);
      }
  }

  @Test
  public void test10()  throws Throwable  {
      PrevaylerDirectory prevaylerDirectory0 = new PrevaylerDirectory((File) null);
      // Undeclared exception!
      try { 
        prevaylerDirectory0.findInitialJournalFile((-1L));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.prevayler.implementation.PrevaylerDirectory", e);
      }
  }

  @Test
  public void test11()  throws Throwable  {
      PrevaylerDirectory prevaylerDirectory0 = new PrevaylerDirectory((File) null);
      // Undeclared exception!
      try { 
        prevaylerDirectory0.createTempFile("", (String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Prefix string too short
         //
         assertThrownBy("java.io.File", e);
      }
  }





  @Test
  public void test16()  throws Throwable  {
      // Undeclared exception!
      try { 
        PrevaylerDirectory.checkValidSnapshotSuffix("d{19}.[a-zA-u0-9]*[Ss]0apshot");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Snapshot filename suffix must match /[a-zA-Z0-9]*[Ss]napshot/, but 'd{19}.[a-zA-u0-9]*[Ss]0apshot' does not
         //
         assertThrownBy("org.prevayler.implementation.PrevaylerDirectory", e);
      }
  }


  @Test
  public void test18()  throws Throwable  {
      PrevaylerDirectory prevaylerDirectory0 = new PrevaylerDirectory("");
      try { 
        prevaylerDirectory0.latestSnapshot();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Error reading file list from directory 
         //
         assertThrownBy("org.prevayler.implementation.PrevaylerDirectory", e);
      }
  }



  @Test
  public void test21()  throws Throwable  {
      PrevaylerDirectory prevaylerDirectory0 = new PrevaylerDirectory(".");
      File file0 = prevaylerDirectory0.findInitialJournalFile(0L);
      assertNull(file0);
  }


  @Test
  public void test23()  throws Throwable  {
      PrevaylerDirectory prevaylerDirectory0 = new PrevaylerDirectory((File) null);
      // Undeclared exception!
      try { 
        prevaylerDirectory0.createTempFile((String) null, "e~8Y");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.io.File", e);
      }
  }

  @Test
  public void test24()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
          PrevaylerDirectory prevaylerDirectory0 = new PrevaylerDirectory("");
          File file0 = prevaylerDirectory0.snapshotFile(385L, "Snapshot");
          // Undeclared exception!
          try { 
            PrevaylerDirectory.renameUnusedFile(file0);
            fail("Expecting exception: SecurityException");
          
          } catch(SecurityException e) {
             //
             // Security manager blocks (\"java.io.FilePermission\" \"\\0000000000000000385.Snapshot\" \"write\")
             // java.lang.Thread.getStackTrace(Thread.java:1552)
             // org.evosuite.runtime.sandbox.MSecurityManager.checkPermission(MSecurityManager.java:433)
             // java.lang.SecurityManager.checkWrite(SecurityManager.java:979)
             // java.io.File.renameTo(File.java:1388)
             // org.prevayler.implementation.PrevaylerDirectory.renameUnusedFile(PrevaylerDirectory.java:143)
             // sun.reflect.GeneratedMethodAccessor54.invoke(Unknown Source)
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
  public void test25()  throws Throwable  {
      PrevaylerDirectory prevaylerDirectory0 = new PrevaylerDirectory((File) null);
      File file0 = prevaylerDirectory0.snapshotFile(689L, "Snapshot");
      long long0 = PrevaylerDirectory.snapshotVersion(file0);
      assertEquals(689L, long0);
  }

  @Test
  public void test26()  throws Throwable  {
      PrevaylerDirectory prevaylerDirectory0 = new PrevaylerDirectory((File) null);
      File file0 = prevaylerDirectory0.journalFile(0L, "Journal");
      long long0 = PrevaylerDirectory.journalVersion(file0);
      assertEquals(0L, long0);
  }
}
