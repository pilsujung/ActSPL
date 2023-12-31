/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 07 16:43:55 KST 2017
 */

package org.prevayler.foundation;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.fail;

import java.io.PrintStream;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class Cool_ESTest3 extends Cool_ESTest_scaffolding3 {

  @Test
  public void test0()  throws Throwable  {
      Runnable runnable0 = null;
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
      Exception exception0 = new Exception();
      // Undeclared exception!
      try { 
        exception0.printStackTrace((PrintStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.lang.Throwable", e);
      }
  }





  @Test
  public void test6()  throws Throwable  {
      Exception exception0 = new Exception("[}NqocB'Y@~6a");
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

  @Test
  public void test7()  throws Throwable  {
      // Undeclared exception!
      try { 
        Cool.sleep((-1867L));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // timeout value is negative
         //
         assertThrownBy("java.lang.Thread", e);
      }
  }
}
