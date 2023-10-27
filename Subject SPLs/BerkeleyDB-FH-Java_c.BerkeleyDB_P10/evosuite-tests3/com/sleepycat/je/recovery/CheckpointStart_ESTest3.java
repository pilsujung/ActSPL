/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 09:47:03 KST 2017
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
public class CheckpointStart_ESTest3 extends CheckpointStart_ESTest_scaffolding3 {

  @Test
  public void test00()  throws Throwable  {
      CheckpointStart checkpointStart0 = new CheckpointStart(0L, "");
      int int0 = checkpointStart0.getLogSize();
      assertEquals(20, int0);
  }


  @Test
  public void test02()  throws Throwable  {
      CheckpointStart checkpointStart0 = new CheckpointStart();
      checkpointStart0.postLogWork(517L);
      assertTrue(checkpointStart0.marshallOutsideWriteLatch());
  }


  @Test
  public void test04()  throws Throwable  {
      CheckpointStart checkpointStart0 = new CheckpointStart((-2974L), (String) null);
      boolean boolean0 = checkpointStart0.logEntryIsTransactional();
      assertFalse(boolean0);
  }

  @Test
  public void test05()  throws Throwable  {
      CheckpointStart checkpointStart0 = new CheckpointStart(0L, "");
      // Undeclared exception!
      try { 
        checkpointStart0.dumpLog((StringBuffer) null, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.recovery.CheckpointStart", e);
      }
  }


  @Test
  public void test07()  throws Throwable  {
      CheckpointStart checkpointStart0 = new CheckpointStart(0L, "");
      boolean boolean0 = checkpointStart0.marshallOutsideWriteLatch();
      assertTrue(boolean0);
  }

  @Test
  public void test08()  throws Throwable  {
      CheckpointStart checkpointStart0 = new CheckpointStart(0L, "");
      LogEntryType logEntryType0 = checkpointStart0.getLogType();
      assertFalse(logEntryType0.isNodeType());
  }

  @Test
  public void test09()  throws Throwable  {
      CheckpointStart checkpointStart0 = new CheckpointStart();
      // Undeclared exception!
      try { 
        checkpointStart0.readFromLog((ByteBuffer) null, (byte)0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.LogUtils", e);
      }
  }

}