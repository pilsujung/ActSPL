/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 10:04:12 KST 2017
 */

package com.sleepycat.je.tree;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.nio.ByteBuffer;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class DeltaInfo_ESTest8 extends DeltaInfo_ESTest_scaffolding8 {


  @Test
  public void test01()  throws Throwable  {
      byte[] byteArray0 = new byte[10];
      DeltaInfo deltaInfo0 = new DeltaInfo(byteArray0, (byte)21, (byte)0);
      byte byte0 = deltaInfo0.getState();
      assertEquals((byte)0, byte0);
  }

  @Test
  public void test02()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      DeltaInfo deltaInfo0 = new DeltaInfo(byteArray0, (byte)95, (byte) (-93));
      byte byte0 = deltaInfo0.getState();
      assertEquals((byte) (-93), byte0);
  }

  @Test
  public void test03()  throws Throwable  {
      byte[] byteArray0 = new byte[10];
      DeltaInfo deltaInfo0 = new DeltaInfo(byteArray0, (byte)21, (byte)0);
      long long0 = deltaInfo0.getLsn();
      assertEquals(21L, long0);
  }



  @Test
  public void test06()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      DeltaInfo deltaInfo0 = new DeltaInfo(byteArray0, (byte)26, (byte)26);
      byte[] byteArray1 = deltaInfo0.getKey();
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0}, byteArray1);
  }

  @Test
  public void test07()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      byte byte0 = (byte)0;
      DeltaInfo deltaInfo0 = new DeltaInfo(byteArray0, 1L, (byte)119);
      // Undeclared exception!
      try { 
        deltaInfo0.dumpLog((StringBuffer) null, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.DeltaInfo", e);
      }
  }

  @Test
  public void test08()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      DeltaInfo deltaInfo0 = new DeltaInfo(byteArray0, 1L, (byte)119);
      StringBuffer stringBuffer0 = null;
      // Undeclared exception!
      try { 
        deltaInfo0.dumpLog((StringBuffer) null, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.DeltaInfo", e);
      }
  }

  @Test
  public void test09()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      DeltaInfo deltaInfo0 = new DeltaInfo(byteArray0, 1L, (byte)119);
      // Undeclared exception!
      try { 
        deltaInfo0.dumpLog((StringBuffer) null, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.DeltaInfo", e);
      }
  }

  @Test
  public void test10()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      DeltaInfo deltaInfo0 = new DeltaInfo(byteArray0, (byte)0, (byte)33);
      // Undeclared exception!
      try { 
        deltaInfo0.readFromLog((ByteBuffer) null, (byte)2);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.LogUtils", e);
      }
  }


  @Test
  public void test12()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      DeltaInfo deltaInfo0 = new DeltaInfo(byteArray0, (byte)0, (byte)33);
      boolean boolean0 = deltaInfo0.isKnownDeleted();
      assertTrue(boolean0);
  }

  @Test
  public void test13()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      DeltaInfo deltaInfo0 = new DeltaInfo(byteArray0, (byte) (-52), (byte) (-52));
      // Undeclared exception!
      try { 
        deltaInfo0.writeToLog((ByteBuffer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.LogUtils", e);
      }
  }

  @Test
  public void test14()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      DeltaInfo deltaInfo0 = new DeltaInfo(byteArray0, (byte)0, (byte)33);
      int int0 = deltaInfo0.getLogSize();
      assertEquals(19, int0);
  }

  @Test
  public void test15()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      DeltaInfo deltaInfo0 = new DeltaInfo(byteArray0, (byte)0, (byte)33);
      long long0 = deltaInfo0.getLsn();
      assertEquals(0L, long0);
  }

  @Test
  public void test16()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      DeltaInfo deltaInfo0 = new DeltaInfo(byteArray0, (-1L), (byte)73);
      byte byte0 = deltaInfo0.getState();
      assertEquals((byte)73, byte0);
  }

  @Test
  public void test17()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      DeltaInfo deltaInfo0 = new DeltaInfo(byteArray0, (byte)93, (byte)4);
      byte[] byteArray1 = deltaInfo0.getKey();
      assertArrayEquals(new byte[] {}, byteArray1);
  }

  @Test
  public void test18()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      DeltaInfo deltaInfo0 = new DeltaInfo(byteArray0, (byte)0, (byte)33);
      long long0 = deltaInfo0.getTransactionId();
      assertEquals(0L, long0);
  }

  @Test
  public void test19()  throws Throwable  {
      byte[] byteArray0 = new byte[10];
      DeltaInfo deltaInfo0 = new DeltaInfo(byteArray0, (byte)21, (byte)0);
      boolean boolean0 = deltaInfo0.logEntryIsTransactional();
      assertFalse(boolean0);
  }
}
