/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 09:35:40 KST 2017
 */

package com.sleepycat.je.log.entry;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.fail;

import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.sleepycat.je.dbi.DatabaseId;
import com.sleepycat.je.dbi.DatabaseImpl;
import com.sleepycat.je.dbi.EnvironmentImpl;
import com.sleepycat.je.log.LogReadable;
import com.sleepycat.je.tree.BINDelta;
import com.sleepycat.je.tree.ChildReference;
import com.sleepycat.je.tree.DBIN;
import com.sleepycat.je.tree.NameLN;
import com.sleepycat.je.tree.Node;

import sun.nio.cs.ext.MS949;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class BINDeltaLogEntry_ESTest3 extends BINDeltaLogEntry_ESTest_scaffolding3 {

  @Test
  public void test0()  throws Throwable  {
      Class<BINDelta> class0 = BINDelta.class;
      BINDeltaLogEntry bINDeltaLogEntry0 = new BINDeltaLogEntry(class0);
      BINDelta bINDelta0 = new BINDelta();
      bINDeltaLogEntry0.item = (LogReadable) bINDelta0;
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      bINDeltaLogEntry0.getDbId();
      ByteBuffer byteBuffer0 = mS949_0.encode("READ_COMMITTED");
      CharBuffer charBuffer0 = mS949_0.decode(byteBuffer0);
      ByteBuffer byteBuffer1 = mS949_0.encode(charBuffer0);
      // Undeclared exception!
      try { 
        bINDelta0.readFromLog(byteBuffer1, (byte)0);
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
      Class<BINDelta> class0 = BINDelta.class;
      BINDeltaLogEntry bINDeltaLogEntry0 = new BINDeltaLogEntry(class0);
      BINDelta bINDelta0 = new BINDelta();
      bINDeltaLogEntry0.item = (LogReadable) bINDelta0;
      long long0 = bINDeltaLogEntry0.getLsnOfIN((-1178L));
      assertEquals((-1L), long0);
  }

  @Test
  public void test2()  throws Throwable  {
      Class<BINDelta> class0 = BINDelta.class;
      BINDeltaLogEntry bINDeltaLogEntry0 = new BINDeltaLogEntry(class0);
      BINDelta bINDelta0 = new BINDelta();
      bINDeltaLogEntry0.item = (LogReadable) bINDelta0;
      DatabaseId databaseId0 = bINDeltaLogEntry0.getDbId();
      assertFalse(databaseId0.logEntryIsTransactional());
  }

  @Test
  public void test3()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      BINDeltaLogEntry bINDeltaLogEntry0 = new BINDeltaLogEntry(class0);
      DatabaseImpl databaseImpl0 = new DatabaseImpl();
      byte[] byteArray0 = new byte[4];
      DBIN dBIN0 = new DBIN(databaseImpl0, byteArray0, 0, byteArray0, (int) (byte) (-112));
      bINDeltaLogEntry0.item = (LogReadable) dBIN0;
      // Undeclared exception!
      try { 
        bINDeltaLogEntry0.getLsnOfIN(477L);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // com.sleepycat.je.tree.DBIN cannot be cast to com.sleepycat.je.tree.BINDelta
         //
         assertThrownBy("com.sleepycat.je.log.entry.BINDeltaLogEntry", e);
      }
  }

  @Test
  public void test4()  throws Throwable  {
      Class<Object> class0 = Object.class;
      BINDeltaLogEntry bINDeltaLogEntry0 = new BINDeltaLogEntry(class0);
      byte[] byteArray0 = new byte[7];
      ChildReference childReference0 = new ChildReference((Node) null, byteArray0, (long) (byte) (-119), (byte)82);
      bINDeltaLogEntry0.item = (LogReadable) childReference0;
      // Undeclared exception!
      try { 
        bINDeltaLogEntry0.getIN((EnvironmentImpl) null);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // com.sleepycat.je.tree.ChildReference cannot be cast to com.sleepycat.je.tree.BINDelta
         //
         assertThrownBy("com.sleepycat.je.log.entry.BINDeltaLogEntry", e);
      }
  }

  @Test
  public void test5()  throws Throwable  {
      Class<String> class0 = String.class;
      BINDeltaLogEntry bINDeltaLogEntry0 = new BINDeltaLogEntry(class0);
      DatabaseId databaseId0 = new DatabaseId();
      NameLN nameLN0 = new NameLN(databaseId0);
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
      Class<BINDelta> class0 = BINDelta.class;
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
  public void test8()  throws Throwable  {
      Class<BINDelta> class0 = BINDelta.class;
      BINDeltaLogEntry bINDeltaLogEntry0 = new BINDeltaLogEntry(class0);
      // Undeclared exception!
      try { 
        bINDeltaLogEntry0.getLsnOfIN((-1178L));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.entry.BINDeltaLogEntry", e);
      }
  }
}
