/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 15:39:26 KST 2017
 */

package com.sleepycat.je.recovery;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.nio.ByteBuffer;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.sleepycat.je.log.LogEntryType;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class CheckpointStart_ESTest4 extends CheckpointStart_ESTest_scaffolding4 {

  @Test
  public void test00()  throws Throwable  {
      CheckpointStart checkpointStart0 = new CheckpointStart(98L, (String) null);
      int int0 = checkpointStart0.getLogSize();
      assertEquals(20, int0);
  }

  @Test
  public void test01()  throws Throwable  {
      CheckpointStart checkpointStart0 = new CheckpointStart(0L, "s@|58/");
      assertTrue(checkpointStart0.marshallOutsideWriteLatch());
  }

  @Test
  public void test02()  throws Throwable  {
      CheckpointStart checkpointStart0 = new CheckpointStart(98L, (String) null);
      // Undeclared exception!
      try { 
        checkpointStart0.writeToLog((ByteBuffer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.LogUtils", e);
      }
  }

  @Test
  public void test03()  throws Throwable  {
      CheckpointStart checkpointStart0 = new CheckpointStart(98L, (String) null);
      checkpointStart0.postLogWork(20);
      assertFalse(checkpointStart0.logEntryIsTransactional());
  }

  @Test
  public void test04()  throws Throwable  {
      CheckpointStart checkpointStart0 = new CheckpointStart(98L, (String) null);
      boolean boolean0 = checkpointStart0.countAsObsoleteWhenLogged();
      assertFalse(boolean0);
  }



  @Test
  public void test07()  throws Throwable  {
      CheckpointStart checkpointStart0 = new CheckpointStart(98L, (String) null);
      long long0 = checkpointStart0.getTransactionId();
      assertEquals(0L, long0);
  }



  @Test
  public void test10()  throws Throwable  {
      CheckpointStart checkpointStart0 = new CheckpointStart();
      // Undeclared exception!
      try { 
        checkpointStart0.readFromLog((ByteBuffer) null, (byte) (-45));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.LogUtils", e);
      }
  }

}
