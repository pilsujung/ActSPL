/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 01:10:42 KST 2017
 */

package com.sleepycat.je.log;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.Set;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.sleepycat.je.log.entry.DeletedDupLNLogEntry;
import com.sleepycat.je.log.entry.SingleItemLogEntry;
import com.sleepycat.je.recovery.CheckpointStart;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class LogEntryType_ESTest6 extends LogEntryType_ESTest_scaffolding6 {

  @Test
  public void test00()  throws Throwable  {
      LogEntryType logEntryType0 = new LogEntryType((byte)24, (byte)24);
      byte byte0 = logEntryType0.getVersion();
      assertEquals((byte)24, byte0);
      assertFalse(logEntryType0.isNodeType());
  }

  @Test
  public void test01()  throws Throwable  {
      LogEntryType logEntryType0 = new LogEntryType((byte)12, (byte) (-103));
      byte byte0 = logEntryType0.getVersion();
      assertEquals((byte) (-103), byte0);
  }

  @Test
  public void test02()  throws Throwable  {
      LogEntryType logEntryType0 = new LogEntryType((byte)0, (byte)0);
      byte byte0 = logEntryType0.getTypeNum();
      assertEquals((byte)0, byte0);
  }

  @Test
  public void test03()  throws Throwable  {
      LogEntryType logEntryType0 = new LogEntryType((byte)103, (byte)0);
      logEntryType0.getSharedLogEntry();
      assertFalse(logEntryType0.isNodeType());
  }

  @Test
  public void test04()  throws Throwable  {
      LogEntryType logEntryType0 = LogEntryType.findType((byte)11, (byte) (-50));
      assertTrue(logEntryType0.isNodeType());
  }

  @Test
  public void test05()  throws Throwable  {
      byte byte0 = LogEntryType.clearProvisional((byte)0);
      assertEquals((byte)0, byte0);
  }

  @Test
  public void test06()  throws Throwable  {
      LogEntryType logEntryType0 = LogEntryType.LOG_DIN;
      LogEntryType logEntryType1 = LogEntryType.LOG_CKPT_END;
      boolean boolean0 = logEntryType0.equals(logEntryType1);
      assertFalse(logEntryType1.equals((Object)logEntryType0));
      assertFalse(boolean0);
  }

  @Test
  public void test07()  throws Throwable  {
      LogEntryType logEntryType0 = new LogEntryType((byte)103, (byte)0);
      boolean boolean0 = logEntryType0.equalsType((byte)0);
      assertFalse(boolean0);
      assertFalse(logEntryType0.isNodeType());
  }

  @Test
  public void test08()  throws Throwable  {
      LogEntryType logEntryType0 = LogEntryType.LOG_DIN;
      boolean boolean0 = logEntryType0.equalsType((byte)27, (byte)9);
      assertFalse(boolean0);
  }

  @Test
  public void test09()  throws Throwable  {
      boolean boolean0 = LogEntryType.isValidType((byte)27);
      assertTrue(boolean0);
  }

  @Test
  public void test10()  throws Throwable  {
      boolean boolean0 = LogEntryType.isValidType((byte) (-116));
      assertFalse(boolean0);
  }

  @Test
  public void test11()  throws Throwable  {
      byte byte0 = LogEntryType.setProvisional((byte) (-96));
      assertEquals((byte) (-96), byte0);
  }

  @Test
  public void test12()  throws Throwable  {
      LogEntryType logEntryType0 = LogEntryType.findType((byte) (-30), (byte) (-30));
      assertNull(logEntryType0);
  }

  @Test
  public void test13()  throws Throwable  {
      LogEntryType logEntryType0 = LogEntryType.LOG_DBIN;
      boolean boolean0 = logEntryType0.isNodeType();
      assertTrue(boolean0);
  }

  @Test
  public void test14()  throws Throwable  {
      boolean boolean0 = LogEntryType.isNodeType((byte)15, (byte)0);
      assertTrue(boolean0);
  }

  @Test
  public void test15()  throws Throwable  {
      LogEntryType logEntryType0 = new LogEntryType((byte)103, (byte)0);
      // Undeclared exception!
      try { 
        logEntryType0.getNewLogEntry();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.LogEntryType", e);
      }
  }

  @Test
  public void test16()  throws Throwable  {
      LogEntryType logEntryType0 = LogEntryType.LOG_DUP_BIN_DELTA;
      LogEntryType logEntryType1 = new LogEntryType((byte)23, (byte) (-65));
      boolean boolean0 = logEntryType1.equals(logEntryType0);
      assertTrue(boolean0);
  }

  @Test
  public void test17()  throws Throwable  {
      LogEntryType logEntryType0 = LogEntryType.LOG_TXN_ABORT;
      boolean boolean0 = logEntryType0.equals("Abort/0");
      assertFalse(boolean0);
  }

  @Test
  public void test18()  throws Throwable  {
      LogEntryType logEntryType0 = LogEntryType.findType((byte)21, (byte)21);
      assertNotNull(logEntryType0);
      
      boolean boolean0 = logEntryType0.equals(logEntryType0);
      assertFalse(logEntryType0.isNodeType());
      assertTrue(boolean0);
  }

  @Test
  public void test19()  throws Throwable  {
      LogEntryType logEntryType0 = LogEntryType.LOG_FILE_HEADER;
      LogEntryType logEntryType1 = LogEntryType.LOG_BIN;
      boolean boolean0 = logEntryType0.equals(logEntryType1);
      assertFalse(boolean0);
      assertFalse(logEntryType1.equals((Object)logEntryType0));
  }

  @Test
  public void test20()  throws Throwable  {
      LogEntryType logEntryType0 = new LogEntryType((byte) (-23), (byte) (-23));
      boolean boolean0 = logEntryType0.equalsType((byte) (-23));
      assertTrue(boolean0);
  }

  @Test
  public void test21()  throws Throwable  {
      CheckpointStart checkpointStart0 = new CheckpointStart();
      LogEntryType logEntryType0 = checkpointStart0.getLogType();
      boolean boolean0 = logEntryType0.equalsType((byte)51);
      assertFalse(boolean0);
  }

  @Test
  public void test22()  throws Throwable  {
      LogEntryType logEntryType0 = LogEntryType.LOG_DUP_BIN_DELTA;
      boolean boolean0 = logEntryType0.equalsType((byte)23, (byte)0);
      assertTrue(boolean0);
  }

  @Test
  public void test23()  throws Throwable  {
      LogEntryType logEntryType0 = LogEntryType.LOG_DIN;
      boolean boolean0 = logEntryType0.equalsType((byte) (-94), (byte) (-94));
      assertFalse(boolean0);
  }

  @Test
  public void test24()  throws Throwable  {
      boolean boolean0 = LogEntryType.isValidType((byte)104);
      assertFalse(boolean0);
  }

  @Test
  public void test25()  throws Throwable  {
      boolean boolean0 = LogEntryType.isValidType((byte)15);
      assertTrue(boolean0);
  }

  @Test
  public void test26()  throws Throwable  {
      boolean boolean0 = LogEntryType.isValidType((byte)0);
      assertFalse(boolean0);
  }

  @Test
  public void test27()  throws Throwable  {
      boolean boolean0 = LogEntryType.isProvisional((byte) (-48));
      assertTrue(boolean0);
  }

  @Test
  public void test28()  throws Throwable  {
      boolean boolean0 = LogEntryType.isProvisional((byte)0);
      assertFalse(boolean0);
  }

  @Test
  public void test29()  throws Throwable  {
      LogEntryType logEntryType0 = LogEntryType.findType((byte)43, (byte)0);
      assertNull(logEntryType0);
  }

  @Test
  public void test30()  throws Throwable  {
      LogEntryType logEntryType0 = LogEntryType.findType((byte)27, (byte)0);
      assertNotNull(logEntryType0);
      assertFalse(logEntryType0.isNodeType());
  }

  @Test
  public void test31()  throws Throwable  {
      LogEntryType logEntryType0 = LogEntryType.findType((byte)0, (byte)0);
      assertNull(logEntryType0);
  }

  @Test
  public void test32()  throws Throwable  {
      LogEntryType logEntryType0 = LogEntryType.LOG_DEL_DUPLN_TRANSACTIONAL;
      boolean boolean0 = logEntryType0.isNodeType();
      assertTrue(boolean0);
  }

  @Test
  public void test33()  throws Throwable  {
      LogEntryType logEntryType0 = LogEntryType.LOG_TXN_ABORT;
      boolean boolean0 = logEntryType0.isNodeType();
      assertFalse(boolean0);
  }

  @Test
  public void test34()  throws Throwable  {
      boolean boolean0 = LogEntryType.isNodeType((byte) (-32), (byte)0);
      assertTrue(boolean0);
  }

  @Test
  public void test35()  throws Throwable  {
      boolean boolean0 = LogEntryType.isNodeType((byte)23, (byte)12);
      assertFalse(boolean0);
  }

  @Test
  public void test36()  throws Throwable  {
      LogEntryType logEntryType0 = LogEntryType.LOG_TXN_ABORT;
      byte byte0 = logEntryType0.getVersion();
      assertEquals((byte)0, byte0);
  }

  @Test
  public void test37()  throws Throwable  {
      Set set0 = LogEntryType.getAllTypes();
      assertEquals(27, set0.size());
  }

  @Test
  public void test38()  throws Throwable  {
      LogEntryType logEntryType0 = LogEntryType.LOG_FILE_HEADER;
      String string0 = logEntryType0.toString();
      assertEquals("FileHeader/0", string0);
  }

  @Test
  public void test39()  throws Throwable  {
      byte byte0 = LogEntryType.clearProvisional((byte) (-116));
      assertEquals((byte)12, byte0);
  }

  @Test
  public void test40()  throws Throwable  {
      LogEntryType logEntryType0 = LogEntryType.LOG_DEL_DUPLN_TRANSACTIONAL;
      DeletedDupLNLogEntry deletedDupLNLogEntry0 = (DeletedDupLNLogEntry)logEntryType0.getSharedLogEntry();
      assertFalse(deletedDupLNLogEntry0.getAbortKnownDeleted());
  }

  @Test
  public void test41()  throws Throwable  {
      LogEntryType logEntryType0 = LogEntryType.LOG_TXN_ABORT;
      byte byte0 = logEntryType0.getTypeNum();
      assertEquals((byte)18, byte0);
  }

  @Test
  public void test42()  throws Throwable  {
      LogEntryType logEntryType0 = LogEntryType.LOG_FILE_HEADER;
      SingleItemLogEntry singleItemLogEntry0 = (SingleItemLogEntry)logEntryType0.getNewLogEntry();
      assertNotNull(singleItemLogEntry0);
  }

  @Test
  public void test43()  throws Throwable  {
      LogEntryType logEntryType0 = new LogEntryType((byte)0, (byte)0);
      logEntryType0.hashCode();
  }
}