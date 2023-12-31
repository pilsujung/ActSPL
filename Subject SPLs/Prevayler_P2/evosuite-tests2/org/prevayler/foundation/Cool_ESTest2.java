/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 07 20:09:14 KST 2017
 */

package org.prevayler.foundation;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.fail;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class Cool_ESTest2 extends Cool_ESTest_scaffolding2 {

  @Test
  public void test0()  throws Throwable  {
      Cool.startDaemon((Runnable) null);
      Cool.startDaemon((Runnable) null);
      Cool.sleep(0L);
      // Undeclared exception!
      try { 
        Cool.wait((Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.prevayler.foundation.Cool", e);
      }
  }

  @Test
  public void test1()  throws Throwable  {
      // Undeclared exception!
      try { 
        Cool.sleep((-1021L));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // timeout value is negative
         //
         assertThrownBy("java.lang.Thread", e);
      }
  }

  @Test
  public void test2()  throws Throwable  {
      Integer integer0 = new Integer(475);
      // Undeclared exception!
      try { 
        Cool.wait((Object) integer0);
        fail("Expecting exception: IllegalMonitorStateException");
      
      } catch(IllegalMonitorStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.lang.Object", e);
      }
  }

  @Test
  public void test3()  throws Throwable  {
      Cool.startDaemon((Runnable) null);
      Exception exception0 = new Exception();
      Exception exception1 = new Exception((Throwable) exception0);
      Exception exception2 = new Exception((String) null, (Throwable) exception1);
      // Undeclared exception!
      try { 
        Cool.unexpected(exception2);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unexpected Exception was thrown.
         //
         assertThrownBy("org.prevayler.foundation.Cool", e);
      }
  }

  @Test
  public void test4()  throws Throwable  {
      Cool.sleep(874L);
      Cool cool0 = new Cool();
      String string0 = "^xB";
      Cool.startDaemon((Runnable) null);
      Exception exception0 = new Exception((String) null);
      // Undeclared exception!
      try { 
        Cool.wait((Object) exception0);
        fail("Expecting exception: IllegalMonitorStateException");
      
      } catch(IllegalMonitorStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.lang.Object", e);
      }
  }

  @Test
  public void test5()  throws Throwable  {
      Cool.sleep(0L);
      Cool cool0 = new Cool();
      Cool cool1 = new Cool();
      Exception exception0 = new Exception();
      exception0.printStackTrace();
      exception0.getSuppressed();
      // Undeclared exception!
      try { 
        Cool.unexpected(exception0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unexpected Exception was thrown.
         //
         assertThrownBy("org.prevayler.foundation.Cool", e);
      }
  }
}
