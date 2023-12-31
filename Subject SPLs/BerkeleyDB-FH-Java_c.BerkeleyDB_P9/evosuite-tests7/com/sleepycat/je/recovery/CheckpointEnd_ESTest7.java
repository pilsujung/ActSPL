/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 21 20:55:59 KST 2017
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
public class CheckpointEnd_ESTest7 extends CheckpointEnd_ESTest_scaffolding7 {

  @Test
  public void test00()  throws Throwable  {
      CheckpointEnd checkpointEnd0 = new CheckpointEnd("", 0L, 0L, 0L, 0L, 0, 0L, 0L);
      long long0 = checkpointEnd0.getRootLsn();
      assertEquals(0L, long0);
  }

  @Test
  public void test01()  throws Throwable  {
      CheckpointEnd checkpointEnd0 = new CheckpointEnd((String) null, 17L, 17L, 17L, 17L, (-758), 17L, (long) (-758));
      long long0 = checkpointEnd0.getRootLsn();
      assertEquals(17L, long0);
  }

  @Test
  public void test02()  throws Throwable  {
      CheckpointEnd checkpointEnd0 = new CheckpointEnd("6f~f1NQATf)", 252L, 252L, 0L, 0L, 1764, 127L, 0L);
      long long0 = checkpointEnd0.getLastTxnId();
      assertEquals(127L, long0);
  }

  @Test
  public void test03()  throws Throwable  {
      CheckpointEnd checkpointEnd0 = new CheckpointEnd(" rootExists=", (-1L), (-1L), (-1L), (-1L), 28, (-1L), 1553L);
      long long0 = checkpointEnd0.getLastTxnId();
      assertEquals((-1L), long0);
  }

  @Test
  public void test04()  throws Throwable  {
      CheckpointEnd checkpointEnd0 = new CheckpointEnd("k-Vt}YmEwS4c1WB", 127L, 127L, 127L, 127L, (-3), 127L, (long) (-3));
      long long0 = checkpointEnd0.getLastNodeId();
      assertEquals(127L, long0);
  }

  @Test
  public void test05()  throws Throwable  {
      CheckpointEnd checkpointEnd0 = new CheckpointEnd("", (-2064L), (-2064L), (-2064L), (-2064L), 3144, (-2064L), 0L);
      long long0 = checkpointEnd0.getLastNodeId();
      assertEquals((-2064L), long0);
  }

  @Test
  public void test06()  throws Throwable  {
      CheckpointEnd checkpointEnd0 = new CheckpointEnd((String) null, 17L, 17L, 17L, 17L, (-758), 17L, (long) (-758));
      int int0 = checkpointEnd0.getLastDbId();
      assertEquals((-758), int0);
  }

  @Test
  public void test07()  throws Throwable  {
      CheckpointEnd checkpointEnd0 = new CheckpointEnd((String) null, 17L, 17L, 17L, 17L, (-758), 17L, (long) (-758));
      long long0 = checkpointEnd0.getId();
      assertEquals((-758L), long0);
  }

  @Test
  public void test08()  throws Throwable  {
      CheckpointEnd checkpointEnd0 = new CheckpointEnd("k-Vt}YmEwS4c1WB", 127L, 127L, 127L, 127L, (-3), 127L, (long) (-3));
      long long0 = checkpointEnd0.getFirstActiveLsn();
      assertEquals(127L, long0);
  }

  @Test
  public void test09()  throws Throwable  {
      CheckpointEnd checkpointEnd0 = new CheckpointEnd();
      long long0 = checkpointEnd0.getFirstActiveLsn();
      assertEquals((-1L), long0);
  }

  @Test
  public void test10()  throws Throwable  {
      CheckpointEnd checkpointEnd0 = new CheckpointEnd("", 0L, 0L, 0L, 1L, 13, 0L, 0L);
      long long0 = checkpointEnd0.getCheckpointStartLsn();
      assertEquals(0L, long0);
  }

  @Test
  public void test11()  throws Throwable  {
      CheckpointEnd checkpointEnd0 = new CheckpointEnd((String) null, 17L, 17L, 17L, 17L, (-758), 17L, (long) (-758));
      long long0 = checkpointEnd0.getCheckpointStartLsn();
      assertEquals(17L, long0);
  }

  @Test
  public void test12()  throws Throwable  {
      CheckpointEnd checkpointEnd0 = new CheckpointEnd("", 653L, 0L, 0L, 0L, 0, 653L, (long) 0);
      int int0 = checkpointEnd0.getLastDbId();
      assertEquals(0, int0);
  }

  @Test
  public void test13()  throws Throwable  {
      CheckpointEnd checkpointEnd0 = new CheckpointEnd("</CkptEnd>", (-2544L), (-2544L), (-1L), (-1L), 56, (long) 56, (-2544L));
      assertTrue(checkpointEnd0.marshallOutsideWriteLatch());
  }

  @Test
  public void test14()  throws Throwable  {
      CheckpointEnd checkpointEnd0 = new CheckpointEnd("", (-2064L), (-2064L), (-2064L), (-2064L), 3144, (-2064L), 0L);
      long long0 = checkpointEnd0.getId();
      assertEquals(0L, long0);
  }

  @Test
  public void test15()  throws Throwable  {
      CheckpointEnd checkpointEnd0 = new CheckpointEnd();
      // Undeclared exception!
      try { 
        checkpointEnd0.writeToLog((ByteBuffer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.LogUtils", e);
      }
  }

  @Test
  public void test16()  throws Throwable  {
      CheckpointEnd checkpointEnd0 = new CheckpointEnd("", 0L, 0L, 0L, 1L, 13, 0L, 0L);
      // Undeclared exception!
      try { 
        checkpointEnd0.readFromLog((ByteBuffer) null, (byte)46);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.LogUtils", e);
      }
  }

  @Test
  public void test17()  throws Throwable  {
      CheckpointEnd checkpointEnd0 = new CheckpointEnd();
      // Undeclared exception!
      try { 
        checkpointEnd0.getLogSize();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.LogUtils", e);
      }
  }

  @Test
  public void test18()  throws Throwable  {
      CheckpointEnd checkpointEnd0 = new CheckpointEnd(" rootExists=", (-1L), (-1L), (-1L), (-1L), 28, (-1L), 1553L);
      // Undeclared exception!
      try { 
        checkpointEnd0.dumpLog((StringBuffer) null, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.recovery.CheckpointEnd", e);
      }
  }

  @Test
  public void test19()  throws Throwable  {
      CheckpointEnd checkpointEnd0 = new CheckpointEnd("", 0L, 0L, 0L, 1L, 13, 0L, 0L);
      String string0 = checkpointEnd0.toString();
      //  // Unstable assertion: assertEquals("time=2017-04-21 20:55:41.072 lastNodeId=1 lastDbId=13 lastTxnId=0 id=0 rootExists=true ckptStartLsn=0x0/0x0 root=0x0/0x0 firstActive=0x0/0x0", string0);
  }

  @Test
  public void test20()  throws Throwable  {
      CheckpointEnd checkpointEnd0 = new CheckpointEnd();
      String string0 = checkpointEnd0.toString();
      assertEquals("time=null lastNodeId=0 lastDbId=0 lastTxnId=0 id=0 rootExists=false ckptStartLsn=0xffffffff/0xffffffff firstActive=0xffffffff/0xffffffff", string0);
  }

  @Test
  public void test21()  throws Throwable  {
      CheckpointEnd checkpointEnd0 = new CheckpointEnd("Xb", 0L, 0L, 0L, 0L, 18, 0L, 0L);
      int int0 = checkpointEnd0.getLogSize();
      assertEquals(67, int0);
  }

  @Test
  public void test22()  throws Throwable  {
      CheckpointEnd checkpointEnd0 = new CheckpointEnd("\" lastTxnId=\"", (-4103L), (-1L), (-1L), (-4103L), 2146269694, (-338L), (-484L));
      int int0 = checkpointEnd0.getLogSize();
      assertEquals(70, int0);
  }

  @Test
  public void test23()  throws Throwable  {
      CheckpointEnd checkpointEnd0 = new CheckpointEnd("Xb", 0L, 0L, 0L, 0L, 18, 0L, 0L);
      int int0 = checkpointEnd0.getLastDbId();
      assertEquals(18, int0);
  }

  @Test
  public void test24()  throws Throwable  {
      CheckpointEnd checkpointEnd0 = new CheckpointEnd("k-Vt}YmEwS4c1WB", 127L, 127L, 127L, 127L, (-3), 127L, (long) (-3));
      boolean boolean0 = checkpointEnd0.logEntryIsTransactional();
      assertFalse(boolean0);
  }

  @Test
  public void test25()  throws Throwable  {
      CheckpointEnd checkpointEnd0 = new CheckpointEnd();
      long long0 = checkpointEnd0.getLastTxnId();
      assertEquals(0L, long0);
  }

  @Test
  public void test26()  throws Throwable  {
      CheckpointEnd checkpointEnd0 = new CheckpointEnd();
      long long0 = checkpointEnd0.getCheckpointStartLsn();
      assertEquals((-1L), long0);
  }

  @Test
  public void test27()  throws Throwable  {
      CheckpointEnd checkpointEnd0 = new CheckpointEnd("Xb", 0L, 0L, 0L, 0L, 18, 0L, 0L);
      long long0 = checkpointEnd0.getTransactionId();
      assertEquals(0L, long0);
  }

  @Test
  public void test28()  throws Throwable  {
      CheckpointEnd checkpointEnd0 = new CheckpointEnd();
      long long0 = checkpointEnd0.getRootLsn();
      assertEquals((-1L), long0);
  }

  @Test
  public void test29()  throws Throwable  {
      CheckpointEnd checkpointEnd0 = new CheckpointEnd((String) null, 127L, 127L, 127L, 127L, (-1), 934L, 127L);
      long long0 = checkpointEnd0.getId();
      assertEquals(127L, long0);
  }

  @Test
  public void test30()  throws Throwable  {
      CheckpointEnd checkpointEnd0 = new CheckpointEnd("k-Vt}YmEwS4c1WB", 127L, 127L, 127L, 127L, (-3), 127L, (long) (-3));
      LogEntryType logEntryType0 = checkpointEnd0.getLogType();
      assertFalse(logEntryType0.isNodeType());
  }

  @Test
  public void test31()  throws Throwable  {
      CheckpointEnd checkpointEnd0 = new CheckpointEnd("D*", 0L, (-2218L), 0L, (-2218L), 108, (-70L), (-2218L));
      long long0 = checkpointEnd0.getFirstActiveLsn();
      assertEquals(0L, long0);
  }

  @Test
  public void test32()  throws Throwable  {
      CheckpointEnd checkpointEnd0 = new CheckpointEnd((String) null, 17L, 17L, 17L, 17L, (-758), 17L, (long) (-758));
      boolean boolean0 = checkpointEnd0.marshallOutsideWriteLatch();
      assertTrue(boolean0);
  }

  @Test
  public void test33()  throws Throwable  {
      CheckpointEnd checkpointEnd0 = new CheckpointEnd("", 1249L, (-1L), 1249L, 60L, 1427, 1249L, 60L);
      boolean boolean0 = checkpointEnd0.countAsObsoleteWhenLogged();
      assertFalse(boolean0);
  }

  @Test
  public void test34()  throws Throwable  {
      CheckpointEnd checkpointEnd0 = new CheckpointEnd();
      checkpointEnd0.postLogWork(255L);
      assertEquals(0L, checkpointEnd0.getTransactionId());
  }

  @Test
  public void test35()  throws Throwable  {
      CheckpointEnd checkpointEnd0 = new CheckpointEnd();
      long long0 = checkpointEnd0.getLastNodeId();
      assertEquals(0L, long0);
  }
}
