/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 01:08:12 KST 2017
 */

package com.sleepycat.je.log;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.TooManyResourcesException;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.sleepycat.je.dbi.EnvironmentImpl;
import com.sleepycat.je.latch.LatchException;
import com.sleepycat.je.latch.LatchNotHeldException;

import sun.nio.cs.ext.MS949;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class LogBuffer_ESTest6 extends LogBuffer_ESTest_scaffolding6 {

  @Test
  public void test00()  throws Throwable  {
      LogBuffer logBuffer0 = new LogBuffer(479, (EnvironmentImpl) null);
      long long0 = logBuffer0.getFirstLsn();
      assertEquals((-1L), long0);
  }

  @Test
  public void test01()  throws Throwable  {
      LogBuffer logBuffer0 = new LogBuffer((ByteBuffer) null, 9223372036854775807L);
      ByteBuffer byteBuffer0 = logBuffer0.getDataBuffer();
      assertNull(byteBuffer0);
  }

  @Test
  public void test02()  throws Throwable  {
      LogBuffer logBuffer0 = new LogBuffer(499, (EnvironmentImpl) null);
      int int0 = logBuffer0.getCapacity();
      assertEquals(499, int0);
  }

  @Test
  public void test03()  throws Throwable  {
      LogBuffer logBuffer0 = new LogBuffer(499, (EnvironmentImpl) null);
      logBuffer0.registerLsn(499);
      ByteBuffer byteBuffer0 = logBuffer0.getBytes((long) 499, 499);
      assertEquals(499, byteBuffer0.remaining());
  }

  @Test
  public void test04()  throws Throwable  {
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("generated for testing");
      byteBuffer0.putDouble((-1.0));
      LogBuffer logBuffer0 = new LogBuffer(byteBuffer0, (-1L));
      boolean boolean0 = logBuffer0.hasRoom(22);
      assertTrue(boolean0);
  }

  @Test
  public void test06()  throws Throwable  {
      LogBuffer logBuffer0 = new LogBuffer(499, (EnvironmentImpl) null);
      logBuffer0.reinit();
  }

  @Test
  public void test07()  throws Throwable  {
      LogBuffer logBuffer0 = new LogBuffer(499, (EnvironmentImpl) null);
      logBuffer0.hook482(499);
  }

  @Test
  public void test08()  throws Throwable  {
      LogBuffer logBuffer0 = new LogBuffer(0, (EnvironmentImpl) null);
      int int0 = logBuffer0.getCapacity();
      assertEquals(0, int0);
  }

  @Test
  public void test09()  throws Throwable  {
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("tQCiG\"<`[Tss~twd");
      LogBuffer logBuffer0 = new LogBuffer(byteBuffer0, (-1L));
      int int0 = 0;
      logBuffer0.hook481(int0);
  }

  @Test
  public void test10()  throws Throwable  {
      LogBuffer logBuffer0 = new LogBuffer(499, (EnvironmentImpl) null);
      logBuffer0.hook479((EnvironmentImpl) null);
  }

  @Test
  public void test11()  throws Throwable  {
      LogBuffer logBuffer0 = new LogBuffer((ByteBuffer) null, 9223372036854775807L);
      // Undeclared exception!
      try { 
        logBuffer0.release();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.LogBuffer", e);
      }
  }

  @Test
  public void test12()  throws Throwable  {
      LogBuffer logBuffer0 = new LogBuffer((ByteBuffer) null, 9223372036854775807L);
      // Undeclared exception!
      try { 
        logBuffer0.reinit();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.LogBuffer", e);
      }
  }

  @Test
  public void test13()  throws Throwable  {
      LogBuffer logBuffer0 = new LogBuffer(483, (EnvironmentImpl) null);
      logBuffer0.latchForWrite();
      try { 
        logBuffer0.reinit();
        fail("Expecting exception: LatchException");
      
      } catch(LatchException e) {
         //
         // com.sleepycat.je.log.LogBuffer already held
         //
         assertThrownBy("com.sleepycat.je.latch.Java5LatchImpl", e);
      }
  }

  @Test
  public void test14()  throws Throwable  {
      LogBuffer logBuffer0 = new LogBuffer((ByteBuffer) null, 9223372036854775807L);
      // Undeclared exception!
      try { 
        logBuffer0.registerLsn(465L);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.LogBuffer", e);
      }
  }

  @Test
  public void test16()  throws Throwable  {
      LogBuffer logBuffer0 = new LogBuffer(499, (EnvironmentImpl) null);
      logBuffer0.latchForWrite();
      try { 
        logBuffer0.registerLsn(499);
        fail("Expecting exception: LatchException");
      
      } catch(LatchException e) {
         //
         // com.sleepycat.je.log.LogBuffer already held
         //
         assertThrownBy("com.sleepycat.je.latch.Java5LatchImpl", e);
      }
  }

  @Test
  public void test17()  throws Throwable  {
      LogBuffer logBuffer0 = new LogBuffer((ByteBuffer) null, 9223372036854775807L);
      // Undeclared exception!
      try { 
        logBuffer0.latchForWrite();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.LogBuffer", e);
      }
  }

  @Test
  public void test18()  throws Throwable  {
      LogBuffer logBuffer0 = new LogBuffer(499, (EnvironmentImpl) null);
      logBuffer0.latchForWrite();
      try { 
        logBuffer0.latchForWrite();
        fail("Expecting exception: LatchException");
      
      } catch(LatchException e) {
         //
         // com.sleepycat.je.log.LogBuffer already held
         //
         assertThrownBy("com.sleepycat.je.latch.Java5LatchImpl", e);
      }
  }

  @Test
  public void test19()  throws Throwable  {
      LogBuffer logBuffer0 = new LogBuffer(499, (EnvironmentImpl) null);
      // Undeclared exception!
      try { 
        logBuffer0.hook482((-1148));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.nio.ByteBuffer", e);
      }
  }

  @Test
  public void test20()  throws Throwable  {
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode(" numBytes=");
      LogBuffer logBuffer0 = new LogBuffer(byteBuffer0, (-1L));
      // Undeclared exception!
      try { 
        logBuffer0.hook480();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.LogBuffer", e);
      }
  }

  @Test
  public void test21()  throws Throwable  {
      LogBuffer logBuffer0 = new LogBuffer(499, (EnvironmentImpl) null);
      try { 
        logBuffer0.hook480();
        fail("Expecting exception: LatchNotHeldException");
      
      } catch(LatchNotHeldException e) {
         //
         // com.sleepycat.je.log.LogBuffer not held
         //
         assertThrownBy("com.sleepycat.je.latch.Java5LatchImpl", e);
      }
  }

  @Test
  public void test22()  throws Throwable  {
      LogBuffer logBuffer0 = new LogBuffer((ByteBuffer) null, (-9223372036854775805L));
      // Undeclared exception!
      try { 
        logBuffer0.hasRoom(529);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.LogBuffer", e);
      }
  }

  @Test
  public void test23()  throws Throwable  {
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("generated for testing");
      LogBuffer logBuffer0 = new LogBuffer(byteBuffer0, (-1L));
      // Undeclared exception!
      try { 
        logBuffer0.getBytes((long) 22, 369);
        fail("Expecting exception: TooManyResourcesException");
      
      } catch(TooManyResourcesException e) {
         //
         // Loop has been executed more times than the allowed 10000
         //
         assertThrownBy("org.evosuite.runtime.LoopCounter", e);
      }
  }

  @Test
  public void test24()  throws Throwable  {
      LogBuffer logBuffer0 = new LogBuffer((ByteBuffer) null, 9223372036854775807L);
      // Undeclared exception!
      try { 
        logBuffer0.getBytes(474L, 1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test25()  throws Throwable  {
      LogBuffer logBuffer0 = new LogBuffer(479, (EnvironmentImpl) null);
      // Undeclared exception!
      try { 
        logBuffer0.getBytes((-489L));
        fail("Expecting exception: TooManyResourcesException");
      
      } catch(TooManyResourcesException e) {
         //
         // Loop has been executed more times than the allowed 10000
         //
         assertThrownBy("org.evosuite.runtime.LoopCounter", e);
      }
  }

  @Test
  public void test26()  throws Throwable  {
      LogBuffer logBuffer0 = new LogBuffer((ByteBuffer) null, 0L);
      // Undeclared exception!
      try { 
        logBuffer0.getBytes(0L);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test27()  throws Throwable  {
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("generated for testing");
      LogBuffer logBuffer0 = new LogBuffer(byteBuffer0, (-1L));
      // Undeclared exception!
      try { 
        logBuffer0.containsLsn(10L);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.LogBuffer", e);
      }
  }

  @Test
  public void test28()  throws Throwable  {
      LogBuffer logBuffer0 = new LogBuffer(499, (EnvironmentImpl) null);
      logBuffer0.registerLsn(465L);
      // Undeclared exception!
      try { 
        logBuffer0.containsLsn((-1));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.utilint.DbLsn", e);
      }
  }

  @Test
  public void test30()  throws Throwable  {
      LogBuffer logBuffer0 = null;
      try {
        logBuffer0 = new LogBuffer((-741), (EnvironmentImpl) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.nio.ByteBuffer", e);
      }
  }

  @Test
  public void test31()  throws Throwable  {
      LogBuffer logBuffer0 = new LogBuffer(499, (EnvironmentImpl) null);
      ByteBuffer byteBuffer0 = logBuffer0.getBytes(1L);
      assertEquals("java.nio.HeapByteBuffer[pos=2 lim=499 cap=499]", byteBuffer0.toString());
  }

  @Test
  public void test33()  throws Throwable  {
      LogBuffer logBuffer0 = new LogBuffer(499, (EnvironmentImpl) null);
      logBuffer0.registerLsn(465L);
      boolean boolean0 = logBuffer0.containsLsn(4849L);
      assertFalse(boolean0);
  }

  @Test
  public void test34()  throws Throwable  {
      LogBuffer logBuffer0 = new LogBuffer(499, (EnvironmentImpl) null);
      logBuffer0.registerLsn(465L);
      boolean boolean0 = logBuffer0.containsLsn(456L);
      assertFalse(boolean0);
  }

  @Test
  public void test35()  throws Throwable  {
      LogBuffer logBuffer0 = new LogBuffer(499, (EnvironmentImpl) null);
      logBuffer0.registerLsn(499);
      boolean boolean0 = logBuffer0.containsLsn(499L);
      assertTrue(boolean0);
  }

  @Test
  public void test36()  throws Throwable  {
      LogBuffer logBuffer0 = new LogBuffer(483, (EnvironmentImpl) null);
      boolean boolean0 = logBuffer0.hasRoom(483);
      assertTrue(boolean0);
  }

  @Test
  public void test37()  throws Throwable  {
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("tQCiG\"<`[Tss~twd");
      LogBuffer logBuffer0 = new LogBuffer(byteBuffer0, (-1L));
      boolean boolean0 = logBuffer0.hasRoom(38);
      assertFalse(boolean0);
  }

  @Test
  public void test39()  throws Throwable  {
      LogBuffer logBuffer0 = new LogBuffer(499, (EnvironmentImpl) null);
      logBuffer0.release();
  }

  @Test
  public void test40()  throws Throwable  {
      LogBuffer logBuffer0 = new LogBuffer((ByteBuffer) null, 9223372036854775807L);
      long long0 = logBuffer0.getFirstLsn();
      assertEquals(9223372036854775807L, long0);
  }

  @Test
  public void test41()  throws Throwable  {
      LogBuffer logBuffer0 = new LogBuffer(499, (EnvironmentImpl) null);
      logBuffer0.setRewriteAllowed();
      boolean boolean0 = logBuffer0.getRewriteAllowed();
      assertTrue(boolean0);
  }

  @Test
  public void test42()  throws Throwable  {
      LogBuffer logBuffer0 = new LogBuffer(499, (EnvironmentImpl) null);
      boolean boolean0 = logBuffer0.getRewriteAllowed();
      assertFalse(boolean0);
  }

  @Test
  public void test43()  throws Throwable  {
      LogBuffer logBuffer0 = new LogBuffer((ByteBuffer) null, 9223372036854775807L);
      // Undeclared exception!
      try { 
        logBuffer0.getCapacity();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.LogBuffer", e);
      }
  }

  @Test
  public void test44()  throws Throwable  {
      LogBuffer logBuffer0 = new LogBuffer(499, (EnvironmentImpl) null);
      boolean boolean0 = logBuffer0.containsLsn(499);
      assertFalse(boolean0);
  }

  @Test
  public void test45()  throws Throwable  {
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode(" numBytes=");
      LogBuffer logBuffer0 = new LogBuffer(byteBuffer0, (-1L));
      ByteBuffer byteBuffer1 = logBuffer0.getDataBuffer();
      assertEquals(10, byteBuffer1.remaining());
  }

  @Test
  public void test46()  throws Throwable  {
      LogBuffer logBuffer0 = new LogBuffer(499, (EnvironmentImpl) null);
      logBuffer0.registerLsn(499);
      logBuffer0.registerLsn(1245L);
      boolean boolean0 = logBuffer0.containsLsn(499L);
      assertTrue(boolean0);
  }

  @Test
  public void test47()  throws Throwable  {
      LogBuffer logBuffer0 = new LogBuffer(499, (EnvironmentImpl) null);
      logBuffer0.latchForWrite();
      try { 
        logBuffer0.containsLsn(499);
        fail("Expecting exception: LatchException");
      
      } catch(LatchException e) {
         //
         // com.sleepycat.je.log.LogBuffer already held
         //
         assertThrownBy("com.sleepycat.je.latch.Java5LatchImpl", e);
      }
  }

  @Test
  public void test48()  throws Throwable  {
      LogBuffer logBuffer0 = new LogBuffer(499, (EnvironmentImpl) null);
      ByteBuffer byteBuffer0 = logBuffer0.getBytes(465L, (-1));
      assertEquals(33, byteBuffer0.remaining());
  }
}
