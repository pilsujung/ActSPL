/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 21 20:26:20 KST 2017
 */

package com.sleepycat.je.tree;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
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

import com.sleepycat.je.dbi.CursorImpl;
import com.sleepycat.je.dbi.DatabaseId;
import com.sleepycat.je.dbi.DatabaseImpl;

import sun.nio.cs.ext.MS949;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class DBIN_ESTest1 extends DBIN_ESTest_scaffolding1 {

  @Test
  public void test00()  throws Throwable  {
      DBIN dBIN0 = new DBIN();
      byte[] byteArray0 = dBIN0.getMainTreeKey();
      assertNull(byteArray0);
  }

  @Test
  public void test02()  throws Throwable  {
      DBIN dBIN0 = new DBIN();
      byte[] byteArray0 = dBIN0.getDupTreeKey();
      assertArrayEquals(new byte[] {}, byteArray0);
  }

  @Test
  public void test03()  throws Throwable  {
      DBIN dBIN0 = new DBIN();
      byte[] byteArray0 = dBIN0.getDupKey();
      assertNull(byteArray0);
  }

  @Test
  public void test04()  throws Throwable  {
      DBIN dBIN0 = new DBIN();
      byte[] byteArray0 = dBIN0.getChildKey(dBIN0);
      byte[] byteArray1 = dBIN0.selectKey(byteArray0, byteArray0);
      assertSame(byteArray0, byteArray1);
  }

  @Test
  public void test05()  throws Throwable  {
      DBIN dBIN0 = new DBIN();
      DatabaseId databaseId0 = new DatabaseId();
      int int0 = dBIN0.generateLevel(databaseId0, 0);
      assertEquals(0, int0);
  }

  @Test
  public void test06()  throws Throwable  {
      DBIN dBIN0 = new DBIN();
      DatabaseId databaseId0 = new DatabaseId();
      int int0 = dBIN0.generateLevel(databaseId0, 2);
      assertEquals(2, int0);
  }

  @Test
  public void test08()  throws Throwable  {
      DBIN dBIN0 = new DBIN();
      TreeLocation treeLocation0 = new TreeLocation();
      boolean boolean0 = dBIN0.matchLNByNodeId(treeLocation0, 9223372036854775807L);
      assertFalse(boolean0);
  }

  @Test
  public void test11()  throws Throwable  {
      DBIN dBIN0 = new DBIN();
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("-8u.?=|,&+FI5W7r");
      CharBuffer charBuffer0 = mS949_0.decode(byteBuffer0);
      mS949_0.encode(charBuffer0);
      // Undeclared exception!
      try { 
        charBuffer0.append('`');
        fail("Expecting exception: BufferOverflowException");
      
      } catch(BufferOverflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.nio.Buffer", e);
      }
  }

  @Test
  public void test13()  throws Throwable  {
      DBIN dBIN0 = new DBIN();
      // Undeclared exception!
      try { 
        dBIN0.createReference();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.DBIN", e);
      }
  }

  @Test
  public void test14()  throws Throwable  {
      DBIN dBIN0 = new DBIN();
      // Undeclared exception!
      try { 
        dBIN0.accumulateStats((TreeWalkerStatsAccumulator) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.DBIN", e);
      }
  }

  @Test
  public void test15()  throws Throwable  {
      DBIN dBIN0 = new DBIN();
      CursorImpl cursorImpl0 = null;
      // Undeclared exception!
      try { 
        dBIN0.getCursorIndex((CursorImpl) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.DBIN", e);
      }
  }

  @Test
  public void test16()  throws Throwable  {
      DBIN dBIN0 = new DBIN();
      DatabaseId databaseId0 = new DatabaseId((-3427));
      int int0 = dBIN0.generateLevel(databaseId0, (-3427));
      assertEquals((-3427), int0);
  }

  @Test
  public void test18()  throws Throwable  {
      DBIN dBIN0 = new DBIN();
      StringWriter stringWriter0 = new StringWriter();
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      dBIN0.dumpLogAdditional(stringBuffer0);
      assertEquals("<key v=\"<null>\"/>", stringBuffer0.toString());
      assertEquals("<key v=\"<null>\"/>", stringWriter0.toString());
  }

  @Test
  public void test19()  throws Throwable  {
      DBIN dBIN0 = new DBIN();
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("");
      // Undeclared exception!
      try { 
        dBIN0.writeToLog(byteBuffer0);
        fail("Expecting exception: BufferOverflowException");
      
      } catch(BufferOverflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.nio.Buffer", e);
      }
  }

  @Test
  public void test20()  throws Throwable  {
      DBIN dBIN0 = new DBIN();
      BIN bIN0 = new BIN();
      // Undeclared exception!
      try { 
        dBIN0.setCursorBIN((CursorImpl) null, bIN0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // com.sleepycat.je.tree.BIN cannot be cast to com.sleepycat.je.tree.DBIN
         //
         assertThrownBy("com.sleepycat.je.tree.DBIN", e);
      }
  }

  @Test
  public void test23()  throws Throwable  {
      DBIN dBIN0 = new DBIN();
      // Undeclared exception!
      try { 
        dBIN0.getChildKey((IN) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.DBIN", e);
      }
  }

  @Test
  public void test24()  throws Throwable  {
      DBIN dBIN0 = new DBIN();
      // Undeclared exception!
      try { 
        dBIN0.dumpString((-1804), false);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -1804
         //
         assertThrownBy("java.lang.String", e);
      }
  }

  @Test
  public void test25()  throws Throwable  {
      DBIN dBIN0 = new DBIN();
      // Undeclared exception!
      try { 
        dBIN0.createNewInstance((byte[]) null, 2, 57);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.IN", e);
      }
  }

  @Test
  public void test26()  throws Throwable  {
      DatabaseImpl databaseImpl0 = new DatabaseImpl();
      byte[] byteArray0 = new byte[3];
      DBIN dBIN0 = null;
      try {
        dBIN0 = new DBIN(databaseImpl0, byteArray0, Integer.MAX_VALUE, byteArray0, 2);
        fail("Expecting exception: OutOfMemoryError");
      
      } catch(OutOfMemoryError e) {
         //
         // Requested array size exceeds VM limit
         //
      }
  }

  @Test
  public void test27()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      DBIN dBIN0 = null;
      try {
        dBIN0 = new DBIN((DatabaseImpl) null, byteArray0, (-267), byteArray0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.IN", e);
      }
  }

  @Test
  public void test28()  throws Throwable  {
      DatabaseImpl databaseImpl0 = new DatabaseImpl();
      byte[] byteArray0 = new byte[8];
      DBIN dBIN0 = null;
      try {
        dBIN0 = new DBIN(databaseImpl0, byteArray0, (int) (byte) (-88), byteArray0, 1560);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.IN", e);
      }
  }

  @Test
  public void test29()  throws Throwable  {
      DBIN dBIN0 = new DBIN();
      String string0 = dBIN0.endTag();
      assertEquals("</dbin>", string0);
  }

  @Test
  public void test30()  throws Throwable  {
      DBIN dBIN0 = new DBIN();
      // Undeclared exception!
      try { 
        dBIN0.getKeyComparator();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.DBIN", e);
      }
  }

  @Test
  public void test32()  throws Throwable  {
      DBIN dBIN0 = new DBIN();
      // Undeclared exception!
      try { 
        dBIN0.readFromLog((ByteBuffer) null, (byte)106);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.LogUtils", e);
      }
  }

  @Test
  public void test34()  throws Throwable  {
      DBIN dBIN0 = new DBIN();
      boolean boolean0 = dBIN0.hasNonLNChildren();
      assertFalse(boolean0);
  }

  @Test
  public void test38()  throws Throwable  {
      DBIN dBIN0 = new DBIN();
      // Undeclared exception!
      try { 
        dBIN0.getCursorIndex((CursorImpl) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.DBIN", e);
      }
  }

  @Test
  public void test41()  throws Throwable  {
      DBIN dBIN0 = new DBIN();
      String string0 = dBIN0.dumpString(0, false);
      assertEquals("<dbin>\n  <dupkey></dupkey>\n  <node>0</node>\n  <idkey><key v=\"\"/></idkey>\n  <dirty val=\"false\"/>\n  <generation val=\"0\"/>\n  <level val=\"0\"/>\n  <isRoot val=\"false\"/>\n  <entries nEntries=\"0\">\n  </entries>\n</dbin>", string0);
  }

  @Test
  public void test47()  throws Throwable  {
      DBIN dBIN0 = new DBIN();
      String string0 = dBIN0.beginTag();
      assertEquals("<dbin>", string0);
  }

  @Test
  public void test50()  throws Throwable  {
      DBIN dBIN0 = new DBIN();
      // Undeclared exception!
      try { 
        dBIN0.getLogSize();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.LogUtils", e);
      }
  }

  @Test
  public void test51()  throws Throwable  {
      DBIN dBIN0 = new DBIN();
      // Undeclared exception!
      try { 
        dBIN0.setCursorBIN((CursorImpl) null, dBIN0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.DBIN", e);
      }
  }

  @Test
  public void test53()  throws Throwable  {
      DBIN dBIN0 = new DBIN();
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("Only one may be specified: SerializableIsolation, ReadCommitted or ReadUncommitted");
      // Undeclared exception!
      try { 
        dBIN0.writeToLog(byteBuffer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.LogUtils", e);
      }
  }
}