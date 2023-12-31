/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 21 20:47:16 KST 2017
 */

package com.sleepycat.je.log.entry;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.sleepycat.je.dbi.DatabaseId;
import com.sleepycat.je.dbi.EnvironmentImpl;
import com.sleepycat.je.log.LogReadable;
import com.sleepycat.je.tree.BINDelta;
import com.sleepycat.je.tree.FileSummaryLN;
import com.sleepycat.je.tree.IN;
import com.sleepycat.je.tree.NameLN;

import sun.nio.cs.ext.MS949;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class BINDeltaLogEntry_ESTest7 extends BINDeltaLogEntry_ESTest_scaffolding7 {

  @Test
  public void test0()  throws Throwable  {
      Class<String> class0 = String.class;
      BINDeltaLogEntry bINDeltaLogEntry0 = new BINDeltaLogEntry(class0);
      BINDelta bINDelta0 = new BINDelta();
      bINDeltaLogEntry0.item = (LogReadable) bINDelta0;
      bINDeltaLogEntry0.getDbId();
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("h'Oo+BT{A");
      // Undeclared exception!
      try { 
        bINDelta0.readFromLog(byteBuffer0, (byte) (-85));
        fail("Expecting exception: BufferUnderflowException");
      
      } catch(BufferUnderflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.nio.Buffer", e);
      }
  }

  @Test
  public void test1()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      BINDeltaLogEntry bINDeltaLogEntry0 = new BINDeltaLogEntry(class0);
      BINDelta bINDelta0 = new BINDelta();
      bINDeltaLogEntry0.item = (LogReadable) bINDelta0;
      long long0 = bINDeltaLogEntry0.getLsnOfIN(882L);
      assertEquals((-1L), long0);
  }

  @Test
  public void test2()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      BINDeltaLogEntry bINDeltaLogEntry0 = new BINDeltaLogEntry(class0);
      BINDelta bINDelta0 = new BINDelta();
      bINDeltaLogEntry0.item = (LogReadable) bINDelta0;
      DatabaseId databaseId0 = bINDeltaLogEntry0.getDbId();
      assertEquals(0L, databaseId0.getTransactionId());
  }

  @Test
  public void test3()  throws Throwable  {
      Class<Object> class0 = Object.class;
      BINDeltaLogEntry bINDeltaLogEntry0 = new BINDeltaLogEntry(class0);
      IN iN0 = new IN();
      bINDeltaLogEntry0.item = (LogReadable) iN0;
      // Undeclared exception!
      try { 
        bINDeltaLogEntry0.getLsnOfIN((-1L));
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // com.sleepycat.je.tree.IN cannot be cast to com.sleepycat.je.tree.BINDelta
         //
         assertThrownBy("com.sleepycat.je.log.entry.BINDeltaLogEntry", e);
      }
  }

  @Test
  public void test4()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      BINDeltaLogEntry bINDeltaLogEntry0 = new BINDeltaLogEntry(class0);
      FileSummaryLN fileSummaryLN0 = new FileSummaryLN();
      bINDeltaLogEntry0.item = (LogReadable) fileSummaryLN0;
      // Undeclared exception!
      try { 
        bINDeltaLogEntry0.getIN((EnvironmentImpl) null);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // com.sleepycat.je.tree.FileSummaryLN cannot be cast to com.sleepycat.je.tree.BINDelta
         //
         assertThrownBy("com.sleepycat.je.log.entry.BINDeltaLogEntry", e);
      }
  }

  @Test
  public void test5()  throws Throwable  {
      Class<String> class0 = String.class;
      BINDeltaLogEntry bINDeltaLogEntry0 = new BINDeltaLogEntry(class0);
      NameLN nameLN0 = new NameLN();
      bINDeltaLogEntry0.item = (LogReadable) nameLN0;
      // Undeclared exception!
      try { 
        bINDeltaLogEntry0.getDbId();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // com.sleepycat.je.tree.NameLN cannot be cast to com.sleepycat.je.tree.BINDelta
         //
         assertThrownBy("com.sleepycat.je.log.entry.BINDeltaLogEntry", e);
      }
  }

  @Test
  public void test6()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      BINDeltaLogEntry bINDeltaLogEntry0 = new BINDeltaLogEntry(class0);
      // Undeclared exception!
      try { 
        bINDeltaLogEntry0.getDbId();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.entry.BINDeltaLogEntry", e);
      }
  }

  @Test
  public void test7()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      BINDeltaLogEntry bINDeltaLogEntry0 = new BINDeltaLogEntry(class0);
      // Undeclared exception!
      try { 
        bINDeltaLogEntry0.getLsnOfIN(882L);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.entry.BINDeltaLogEntry", e);
      }
  }

  @Test
  public void test8()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      BINDeltaLogEntry bINDeltaLogEntry0 = new BINDeltaLogEntry(class0);
      // Undeclared exception!
      try { 
        bINDeltaLogEntry0.getIN((EnvironmentImpl) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.entry.BINDeltaLogEntry", e);
      }
  }
}
