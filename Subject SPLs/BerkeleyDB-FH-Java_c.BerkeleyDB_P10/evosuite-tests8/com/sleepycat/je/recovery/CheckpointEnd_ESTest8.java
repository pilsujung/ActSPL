/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 09:44:35 KST 2017
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

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class CheckpointEnd_ESTest8 extends CheckpointEnd_ESTest_scaffolding8 {

  @Test
  public void test03()  throws Throwable  {
      CheckpointEnd checkpointEnd0 = new CheckpointEnd("HMPHiZUY7", 0L, 0L, 0L, 0L, 1001, (long) 1001, (long) 1001);
      long long0 = checkpointEnd0.getLastTxnId();
      assertEquals(1001L, long0);
  }

  @Test
  public void test04()  throws Throwable  {
      CheckpointEnd checkpointEnd0 = new CheckpointEnd();
      long long0 = checkpointEnd0.getLastNodeId();
      assertEquals(0L, long0);
  }

  @Test
  public void test05()  throws Throwable  {
      CheckpointEnd checkpointEnd0 = new CheckpointEnd("", 1L, 1L, 1L, 1L, 0, 1L, (long) 0);
      long long0 = checkpointEnd0.getLastNodeId();
      assertEquals(1L, long0);
  }


  @Test
  public void test07()  throws Throwable  {
      CheckpointEnd checkpointEnd0 = new CheckpointEnd("U\"Me)q7!", 0L, 1L, 0L, 0L, (-1), 1L, (long) (-1));
      int int0 = checkpointEnd0.getLastDbId();
      assertEquals((-1), int0);
  }

  @Test
  public void test08()  throws Throwable  {
      CheckpointEnd checkpointEnd0 = new CheckpointEnd("", 1L, 1L, 1L, 1L, 0, 1L, (long) 0);
      long long0 = checkpointEnd0.getId();
      assertEquals(0L, long0);
  }

  @Test
  public void test09()  throws Throwable  {
      CheckpointEnd checkpointEnd0 = new CheckpointEnd("o", 1893L, 255L, 255L, 1893L, (-347), 255L, 255L);
      long long0 = checkpointEnd0.getId();
      assertEquals(255L, long0);
  }

  @Test
  public void test10()  throws Throwable  {
      CheckpointEnd checkpointEnd0 = new CheckpointEnd("HMPHiZUY7", 0L, 0L, 0L, 0L, 1001, (long) 1001, (long) 1001);
      long long0 = checkpointEnd0.getFirstActiveLsn();
      assertEquals(0L, long0);
  }

  @Test
  public void test11()  throws Throwable  {
      CheckpointEnd checkpointEnd0 = new CheckpointEnd("Y", 1L, 0L, 1L, 0L, 0, 2631L, (long) 0);
      long long0 = checkpointEnd0.getFirstActiveLsn();
      assertEquals(1L, long0);
  }

  @Test
  public void test12()  throws Throwable  {
      CheckpointEnd checkpointEnd0 = new CheckpointEnd("DupCountLN", 240L, 240L, 240L, 240L, 0, 240L, 651L);
      long long0 = checkpointEnd0.getCheckpointStartLsn();
      assertEquals(240L, long0);
  }


  @Test
  public void test14()  throws Throwable  {
      CheckpointEnd checkpointEnd0 = new CheckpointEnd("</firstActive>", (-1L), 255L, (-1L), 255L, 1847, 255L, (long) 1847);
      assertTrue(checkpointEnd0.marshallOutsideWriteLatch());
  }

  @Test
  public void test15()  throws Throwable  {
      CheckpointEnd checkpointEnd0 = new CheckpointEnd("", 2674L, (-1L), (-1L), (-1L), (-2146027725), (-1L), 2674L);
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
      CheckpointEnd checkpointEnd0 = new CheckpointEnd("DupCountLN", 240L, 240L, 240L, 240L, 0, 240L, 651L);
      // Undeclared exception!
      try { 
        checkpointEnd0.readFromLog((ByteBuffer) null, (byte)56);
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
      CheckpointEnd checkpointEnd0 = new CheckpointEnd("", (-2801L), 0L, (-166L), 414L, (-180), 414L, 0L);
      // Undeclared exception!
      try { 
        checkpointEnd0.dumpLog((StringBuffer) null, false);
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
      CheckpointEnd checkpointEnd0 = new CheckpointEnd("@;u\"|tAJW:0-z3Iq}I", 1L, 0L, 1L, (-374L), 0, (-374L), (-3453L));
      String string0 = checkpointEnd0.toString();
      //  // Unstable assertion: assertEquals("time=2017-04-22 09:44:14.072 lastNodeId=-374 lastDbId=0 lastTxnId=-374 id=-3453 rootExists=true ckptStartLsn=0x0/0x1 root=0x0/0x0 firstActive=0x0/0x1", string0);
  }

  @Test
  public void test20()  throws Throwable  {
      CheckpointEnd checkpointEnd0 = new CheckpointEnd();
      String string0 = checkpointEnd0.toString();
      assertEquals("time=null lastNodeId=0 lastDbId=0 lastTxnId=0 id=0 rootExists=false ckptStartLsn=0xffffffff/0xffffffff firstActive=0xffffffff/0xffffffff", string0);
  }

  @Test
  public void test21()  throws Throwable  {
      CheckpointEnd checkpointEnd0 = new CheckpointEnd("@;u\"|tAJW:0-z3Iq}I", 1L, 0L, 1L, (-374L), 0, (-374L), (-3453L));
      int int0 = checkpointEnd0.getLogSize();
      assertEquals(83, int0);
  }

  @Test
  public void test22()  throws Throwable  {
      CheckpointEnd checkpointEnd0 = new CheckpointEnd("", 2674L, (-1L), (-1L), (-1L), (-2146027725), (-1L), 2674L);
      int int0 = checkpointEnd0.getLogSize();
      assertEquals(57, int0);
  }

  @Test
  public void test23()  throws Throwable  {
      CheckpointEnd checkpointEnd0 = new CheckpointEnd((String) null, (long) (byte)110, (long) (byte)110, (long) (byte)110, (-8L), (int) (byte)110, (long) (byte)110, (long) (byte)110);
      assertEquals(0L, checkpointEnd0.getTransactionId());
  }

  @Test
  public void test24()  throws Throwable  {
      CheckpointEnd checkpointEnd0 = new CheckpointEnd("<dbTree lastDbId =\"", (-415L), (-415L), (-415L), (-415L), 3814, 198L, 156L);
      int int0 = checkpointEnd0.getLastDbId();
      assertEquals(3814, int0);
  }

  @Test
  public void test25()  throws Throwable  {
      CheckpointEnd checkpointEnd0 = new CheckpointEnd("@;u\"|tAJW:0-z3Iq}I", 1L, 0L, 1L, (-374L), 0, (-374L), (-3453L));
      boolean boolean0 = checkpointEnd0.logEntryIsTransactional();
      assertFalse(boolean0);
  }

  @Test
  public void test26()  throws Throwable  {
      CheckpointEnd checkpointEnd0 = new CheckpointEnd("</CkptEnd>", (-1420L), (-2877L), (-1420L), 32L, 0, (-2877L), (-1041L));
      long long0 = checkpointEnd0.getLastTxnId();
      assertEquals((-2877L), long0);
  }

  @Test
  public void test27()  throws Throwable  {
      CheckpointEnd checkpointEnd0 = new CheckpointEnd("", 0L, 839L, 0L, 0L, 2390, 839L, 0L);
      long long0 = checkpointEnd0.getCheckpointStartLsn();
      assertEquals(0L, long0);
  }

  @Test
  public void test28()  throws Throwable  {
      CheckpointEnd checkpointEnd0 = new CheckpointEnd("@;u\"|tAJW:0-z3Iq}I", 1L, 0L, 1L, (-374L), 0, (-374L), (-3453L));
      long long0 = checkpointEnd0.getTransactionId();
      assertEquals(0L, long0);
  }

  @Test
  public void test29()  throws Throwable  {
      CheckpointEnd checkpointEnd0 = new CheckpointEnd("", (-2801L), 0L, (-166L), 414L, (-180), 414L, 0L);
      long long0 = checkpointEnd0.getRootLsn();
      assertEquals(0L, long0);
  }

  @Test
  public void test30()  throws Throwable  {
      CheckpointEnd checkpointEnd0 = new CheckpointEnd("@;u\"|tAJW:0-z3Iq}I", 1L, 0L, 1L, (-374L), 0, (-374L), (-3453L));
      long long0 = checkpointEnd0.getId();
      assertEquals((-3453L), long0);
  }

  @Test
  public void test31()  throws Throwable  {
      CheckpointEnd checkpointEnd0 = new CheckpointEnd("@;u\"|tAJW:0-z3Iq}I", 1L, 0L, 1L, (-374L), 0, (-374L), (-3453L));
      LogEntryType logEntryType0 = checkpointEnd0.getLogType();
      assertFalse(logEntryType0.isNodeType());
  }

  @Test
  public void test32()  throws Throwable  {
      CheckpointEnd checkpointEnd0 = new CheckpointEnd("NameLN", (-1826L), (-1826L), (-1826L), (-1826L), (-632), (-1826L), (-1826L));
      long long0 = checkpointEnd0.getFirstActiveLsn();
      assertEquals((-1826L), long0);
  }

  @Test
  public void test33()  throws Throwable  {
      CheckpointEnd checkpointEnd0 = new CheckpointEnd("@;u\"|tAJW:0-z3Iq}I", 1L, 0L, 1L, (-374L), 0, (-374L), (-3453L));
      boolean boolean0 = checkpointEnd0.marshallOutsideWriteLatch();
      assertTrue(boolean0);
  }

  @Test
  public void test34()  throws Throwable  {
      CheckpointEnd checkpointEnd0 = new CheckpointEnd("@;u\"|tAJW:0-z3Iq}I", 1L, 0L, 1L, (-374L), 0, (-374L), (-3453L));
      boolean boolean0 = checkpointEnd0.countAsObsoleteWhenLogged();
      assertFalse(boolean0);
  }

  @Test
  public void test35()  throws Throwable  {
      CheckpointEnd checkpointEnd0 = new CheckpointEnd();
      checkpointEnd0.postLogWork(0);
      assertTrue(checkpointEnd0.marshallOutsideWriteLatch());
  }

  @Test
  public void test36()  throws Throwable  {
      CheckpointEnd checkpointEnd0 = new CheckpointEnd("@;u\"|tAJW:0-z3Iq}I", 1L, 0L, 1L, (-374L), 0, (-374L), (-3453L));
      long long0 = checkpointEnd0.getLastNodeId();
      assertEquals((-374L), long0);
  }
}
