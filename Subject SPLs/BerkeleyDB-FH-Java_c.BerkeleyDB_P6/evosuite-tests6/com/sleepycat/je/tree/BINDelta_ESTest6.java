/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 01:43:39 KST 2017
 */

package com.sleepycat.je.tree;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.StringWriter;
import java.nio.BufferOverflowException;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.sleepycat.je.dbi.EnvironmentImpl;
import com.sleepycat.je.latch.LatchException;
import com.sleepycat.je.latch.LatchNotHeldException;

import sun.nio.cs.ext.MS949;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class BINDelta_ESTest6 extends BINDelta_ESTest_scaffolding6 {

  @Test
  public void test00()  throws Throwable  {
      BINDelta bINDelta0 = new BINDelta();
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("qw9N<q*-jm[)U2'/F");
      bINDelta0.getDbId();
      // Undeclared exception!
      try { 
        bINDelta0.readFromLog(byteBuffer0, (byte)39);
        fail("Expecting exception: BufferUnderflowException");
      
      } catch(BufferUnderflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.nio.Buffer", e);
      }
  }

  @Test
  public void test01()  throws Throwable  {
      BINDelta bINDelta0 = new BINDelta();
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("<bin>");
      // Undeclared exception!
      try { 
        bINDelta0.writeToLog(byteBuffer0);
        fail("Expecting exception: BufferOverflowException");
      
      } catch(BufferOverflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.nio.Buffer", e);
      }
  }

  @Test
  public void test02()  throws Throwable  {
      BINDelta bINDelta0 = new BINDelta();
      // Undeclared exception!
      try { 
        bINDelta0.writeToLog((ByteBuffer) null);
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
      BINDelta bINDelta0 = new BINDelta();
      // Undeclared exception!
      try { 
        bINDelta0.reconstituteBIN((EnvironmentImpl) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.BINDelta", e);
      }
  }

  @Test
  public void test04()  throws Throwable  {
      BINDelta bINDelta0 = new BINDelta();
      // Undeclared exception!
      try { 
        bINDelta0.readFromLog((ByteBuffer) null, (byte)0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.LogUtils", e);
      }
  }

  @Test
  public void test05()  throws Throwable  {
      BINDelta bINDelta0 = new BINDelta();
      // Undeclared exception!
      try { 
        bINDelta0.hook612((BIN) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.BINDelta", e);
      }
  }

  @Test
  public void test06()  throws Throwable  {
      BINDelta bINDelta0 = new BINDelta();
      DBIN dBIN0 = new DBIN();
      dBIN0.hook608(true);
      try { 
        bINDelta0.hook612(dBIN0);
        fail("Expecting exception: LatchException");
      
      } catch(LatchException e) {
         //
         // DBIN0 already held
         //
         assertThrownBy("com.sleepycat.je.latch.Java5LatchImpl", e);
      }
  }

  @Test
  public void test07()  throws Throwable  {
      BINDelta bINDelta0 = new BINDelta();
      // Undeclared exception!
      try { 
        bINDelta0.hook611((BIN) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.BINDelta", e);
      }
  }

  @Test
  public void test08()  throws Throwable  {
      BINDelta bINDelta0 = new BINDelta();
      // Undeclared exception!
      try { 
        bINDelta0.dumpLog((StringBuffer) null, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.dbi.DatabaseId", e);
      }
  }

  @Test
  public void test09()  throws Throwable  {
      DBIN dBIN0 = new DBIN();
      BINDelta bINDelta0 = null;
      try {
        bINDelta0 = new BINDelta((BIN) dBIN0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.IN", e);
      }
  }

  @Test
  public void test10()  throws Throwable  {
      BINDelta bINDelta0 = new BINDelta();
      StringWriter stringWriter0 = new StringWriter();
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      bINDelta0.dumpLog(stringBuffer0, false);
      assertEquals(142, stringBuffer0.capacity());
      assertEquals("<dbId id=\"0\"/><lastFullLsn><DbLsn val=\"0xffffffff/0xffffffff\"/></lastFullLsn><deltas size=\"0\"/>", stringWriter0.toString());
  }

  @Test
  public void test11()  throws Throwable  {
      BINDelta bINDelta0 = new BINDelta();
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("qw9N<q*-jm[)U2'/F");
      CharBuffer charBuffer0 = mS949_0.decode(byteBuffer0);
      ByteBuffer byteBuffer1 = mS949_0.encode(charBuffer0);
      bINDelta0.writeToLog(byteBuffer1);
      assertEquals((-1L), bINDelta0.getLastFullLsn());
  }

  @Test
  public void test12()  throws Throwable  {
      BINDelta bINDelta0 = new BINDelta();
      int int0 = bINDelta0.getLogSize();
      assertEquals(16, int0);
      assertEquals((-1L), bINDelta0.getLastFullLsn());
  }

  @Test
  public void test13()  throws Throwable  {
      BINDelta bINDelta0 = new BINDelta();
      bINDelta0.getNumDeltas();
      assertEquals((-1L), bINDelta0.getLastFullLsn());
  }

  @Test
  public void test14()  throws Throwable  {
      BINDelta bINDelta0 = new BINDelta();
      long long0 = bINDelta0.getLastFullLsn();
      assertEquals((-1L), long0);
  }

  @Test
  public void test15()  throws Throwable  {
      BINDelta bINDelta0 = new BINDelta();
      boolean boolean0 = bINDelta0.countAsObsoleteWhenLogged();
      assertEquals((-1L), bINDelta0.getLastFullLsn());
      assertFalse(boolean0);
  }

  @Test
  public void test16()  throws Throwable  {
      BINDelta bINDelta0 = new BINDelta();
      DBIN dBIN0 = new DBIN();
      bINDelta0.hook612(dBIN0);
      //  // Unstable assertion: assertEquals(4L, dBIN0.getGeneration());
      //  // Unstable assertion: assertEquals((-1L), bINDelta0.getLastFullLsn());
  }

  @Test
  public void test17()  throws Throwable  {
      BINDelta bINDelta0 = new BINDelta();
      bINDelta0.getDbId();
      assertEquals((-1L), bINDelta0.getLastFullLsn());
  }

  @Test
  public void test18()  throws Throwable  {
      BINDelta bINDelta0 = new BINDelta();
      boolean boolean0 = bINDelta0.marshallOutsideWriteLatch();
      assertEquals((-1L), bINDelta0.getLastFullLsn());
      assertTrue(boolean0);
  }

  @Test
  public void test19()  throws Throwable  {
      BINDelta bINDelta0 = new BINDelta();
      DBIN dBIN0 = new DBIN();
      dBIN0.hook608(true);
      bINDelta0.hook611(dBIN0);
      //  // Unstable assertion: assertEquals(0L, dBIN0.getGeneration());
      //  // Unstable assertion: assertEquals((-1L), bINDelta0.getLastFullLsn());
  }

  @Test
  public void test20()  throws Throwable  {
      BINDelta bINDelta0 = new BINDelta();
      long long0 = bINDelta0.getTransactionId();
      assertEquals((-1L), bINDelta0.getLastFullLsn());
      assertEquals(0L, long0);
  }

  @Test
  public void test21()  throws Throwable  {
      BINDelta bINDelta0 = new BINDelta();
      bINDelta0.getLogType();
      assertEquals((-1L), bINDelta0.getLastFullLsn());
  }

  @Test
  public void test22()  throws Throwable  {
      BINDelta bINDelta0 = new BINDelta();
      boolean boolean0 = bINDelta0.logEntryIsTransactional();
      assertFalse(boolean0);
      assertEquals((-1L), bINDelta0.getLastFullLsn());
  }

  @Test
  public void test23()  throws Throwable  {
      BINDelta bINDelta0 = new BINDelta();
      bINDelta0.postLogWork((-13L));
      assertEquals((-1L), bINDelta0.getLastFullLsn());
  }

  @Test
  public void test24()  throws Throwable  {
      BINDelta bINDelta0 = new BINDelta();
      DBIN dBIN0 = new DBIN();
      try { 
        bINDelta0.hook611(dBIN0);
        fail("Expecting exception: LatchNotHeldException");
      
      } catch(LatchNotHeldException e) {
         //
         // DBIN0 not held
         //
         assertThrownBy("com.sleepycat.je.latch.Java5LatchImpl", e);
      }
  }
}
