/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 10:48:42 KST 2017
 */

package com.sleepycat.je.log;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotSame;
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
import com.sleepycat.je.latch.LatchNotHeldException;

import sun.nio.cs.ext.MS949;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class LogBuffer_ESTest5 extends LogBuffer_ESTest_scaffolding5 {

  @Test
  public void test00()  throws Throwable  {
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("0");
      LogBuffer logBuffer0 = new LogBuffer(byteBuffer0, 3818L);
      long long0 = logBuffer0.getFirstLsn();
      assertEquals(3818L, long0);
  }

  @Test
  public void test01()  throws Throwable  {
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("");
      LogBuffer logBuffer0 = new LogBuffer(byteBuffer0, (-919L));
      long long0 = logBuffer0.getFirstLsn();
      assertEquals((-919L), long0);
  }

  @Test
  public void test02()  throws Throwable  {
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("0");
      LogBuffer logBuffer0 = new LogBuffer(byteBuffer0, 3818L);
      int int0 = logBuffer0.getCapacity();
      assertEquals(2, int0);
  }

  @Test
  public void test03()  throws Throwable  {
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("");
      LogBuffer logBuffer0 = new LogBuffer(byteBuffer0, (-919L));
      ByteBuffer byteBuffer1 = logBuffer0.getBytes((-919L), 0);
      assertEquals(0, byteBuffer1.capacity());
  }

  @Test
  public void test04()  throws Throwable  {
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("");
      LogBuffer logBuffer0 = new LogBuffer(byteBuffer0, (-919L));
      boolean boolean0 = logBuffer0.hasRoom((-14));
      assertTrue(boolean0);
  }

  @Test
  public void test05()  throws Throwable  {
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("");
      LogBuffer logBuffer0 = new LogBuffer(byteBuffer0, (-919L));
      logBuffer0.hook482(0);
  }

  @Test
  public void test06()  throws Throwable  {
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("");
      LogBuffer logBuffer0 = new LogBuffer(byteBuffer0, (-919L));
      logBuffer0.hook481(0);
  }

  @Test
  public void test07()  throws Throwable  {
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("");
      LogBuffer logBuffer0 = new LogBuffer(byteBuffer0, (-919L));
      logBuffer0.hook479((EnvironmentImpl) null);
      logBuffer0.release();
  }

  @Test
  public void test08()  throws Throwable  {
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("");
      LogBuffer logBuffer0 = new LogBuffer(byteBuffer0, (-919L));
      logBuffer0.hook479((EnvironmentImpl) null);
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
  public void test09()  throws Throwable  {
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("");
      LogBuffer logBuffer0 = new LogBuffer(byteBuffer0, (-919L));
      // Undeclared exception!
      try { 
        logBuffer0.getBytes(1091L, (-1873));
        fail("Expecting exception: TooManyResourcesException");
      
      } catch(TooManyResourcesException e) {
         //
         // Loop has been executed more times than the allowed 10000
         //
         assertThrownBy("org.evosuite.runtime.LoopCounter", e);
      }
  }

  @Test
  public void test10()  throws Throwable  {
      LogBuffer logBuffer0 = new LogBuffer((ByteBuffer) null, (-919L));
      // Undeclared exception!
      try { 
        logBuffer0.getBytes((-919L), 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test11()  throws Throwable  {
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("");
      LogBuffer logBuffer0 = new LogBuffer(byteBuffer0, (-919L));
      // Undeclared exception!
      try { 
        logBuffer0.getBytes(361L);
        fail("Expecting exception: TooManyResourcesException");
      
      } catch(TooManyResourcesException e) {
         //
         // Loop has been executed more times than the allowed 10000
         //
         assertThrownBy("org.evosuite.runtime.LoopCounter", e);
      }
  }

  @Test
  public void test12()  throws Throwable  {
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("");
      LogBuffer logBuffer0 = new LogBuffer(byteBuffer0, (-896L));
      ByteBuffer byteBuffer1 = logBuffer0.getBytes((-896L));
      assertNotSame(byteBuffer1, byteBuffer0);
  }

  @Test
  public void test14()  throws Throwable  {
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("");
      LogBuffer logBuffer0 = new LogBuffer(byteBuffer0, (-919L));
      boolean boolean0 = logBuffer0.hasRoom(0);
      assertTrue(boolean0);
  }

  @Test
  public void test15()  throws Throwable  {
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("@");
      byteBuffer0.compact();
      LogBuffer logBuffer0 = new LogBuffer(byteBuffer0, (-919L));
      boolean boolean0 = logBuffer0.hasRoom(2);
      assertFalse(boolean0);
  }

  @Test
  public void test16()  throws Throwable  {
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("");
      LogBuffer logBuffer0 = new LogBuffer(byteBuffer0, (-919L));
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
  public void test17()  throws Throwable  {
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("n+");
      LogBuffer logBuffer0 = new LogBuffer(byteBuffer0, (-934L));
      // Undeclared exception!
      try { 
        logBuffer0.containsLsn((-934L));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.LogBuffer", e);
      }
  }


  @Test
  public void test19()  throws Throwable  {
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("");
      LogBuffer logBuffer0 = new LogBuffer(byteBuffer0, (-919L));
      logBuffer0.setRewriteAllowed();
      boolean boolean0 = logBuffer0.getRewriteAllowed();
      assertTrue(boolean0);
  }

  @Test
  public void test20()  throws Throwable  {
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("");
      LogBuffer logBuffer0 = new LogBuffer(byteBuffer0, (-919L));
      boolean boolean0 = logBuffer0.getRewriteAllowed();
      assertFalse(boolean0);
  }

  @Test
  public void test21()  throws Throwable  {
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("");
      LogBuffer logBuffer0 = new LogBuffer(byteBuffer0, (-919L));
      int int0 = logBuffer0.getCapacity();
      assertEquals(0, int0);
  }

  @Test
  public void test23()  throws Throwable  {
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("");
      LogBuffer logBuffer0 = new LogBuffer(byteBuffer0, (-919L));
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
  public void test24()  throws Throwable  {
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("");
      LogBuffer logBuffer0 = new LogBuffer(byteBuffer0, (-919L));
      ByteBuffer byteBuffer1 = logBuffer0.getDataBuffer();
      assertFalse(byteBuffer1.isReadOnly());
  }

  @Test
  public void test25()  throws Throwable  {
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("");
      LogBuffer logBuffer0 = new LogBuffer(byteBuffer0, (-919L));
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
  public void test26()  throws Throwable  {
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("");
      LogBuffer logBuffer0 = new LogBuffer(byteBuffer0, 0L);
      // Undeclared exception!
      try { 
        logBuffer0.registerLsn(0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.LogBuffer", e);
      }
  }

  @Test
  public void test27()  throws Throwable  {
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("@");
      LogBuffer logBuffer0 = new LogBuffer(byteBuffer0, (-919L));
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
  public void test28()  throws Throwable  {
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("");
      LogBuffer logBuffer0 = new LogBuffer(byteBuffer0, 0L);
      ByteBuffer byteBuffer1 = logBuffer0.getBytes(0L, (-6));
      assertEquals("java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]", byteBuffer1.toString());
  }
}
