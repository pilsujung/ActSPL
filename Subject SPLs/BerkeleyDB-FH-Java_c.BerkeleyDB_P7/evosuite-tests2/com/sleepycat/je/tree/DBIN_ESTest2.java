/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 01:37:38 KST 2017
 */

package com.sleepycat.je.tree;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.File;
import java.io.StringWriter;
import java.nio.BufferOverflowException;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.util.Properties;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.sleepycat.je.EnvironmentConfig;
import com.sleepycat.je.dbi.CursorImpl;
import com.sleepycat.je.dbi.DatabaseId;
import com.sleepycat.je.dbi.DatabaseImpl;
import com.sleepycat.je.dbi.DbConfigManager;

import sun.nio.cs.ext.MS949;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class DBIN_ESTest2 extends DBIN_ESTest_scaffolding2 {

  @Test
  public void test00()  throws Throwable  {
      DBIN dBIN0 = new DBIN();
      int int0 = dBIN0.generateLevel((DatabaseId) null, 0);
      assertEquals(0, int0);
      assertEquals("DBIN", dBIN0.shortClassName());
  }

  @Test
  public void test01()  throws Throwable  {
      DBIN dBIN0 = new DBIN();
      int int0 = dBIN0.generateLevel((DatabaseId) null, 2626);
      assertEquals(2626, int0);
      assertEquals("DBIN", dBIN0.shortClassName());
  }

  @Test
  public void test02()  throws Throwable  {
      DBIN dBIN0 = new DBIN();
      String string0 = dBIN0.dumpString(0, false);
      assertEquals("DBIN", dBIN0.shortClassName());
      assertEquals("<dbin>\n  <dupkey></dupkey>\n  <node>0</node>\n  <idkey><key v=\"\"/></idkey>\n  <dirty val=\"false\"/>\n  <generation val=\"0\"/>\n  <level val=\"0\"/>\n  <isRoot val=\"false\"/>\n  <entries nEntries=\"0\">\n  </entries>\n</dbin>", string0);
  }

  @Test
  public void test03()  throws Throwable  {
      DBIN dBIN0 = new DBIN();
      byte[] byteArray0 = new byte[0];
      byte[] byteArray1 = new byte[5];
      byte[] byteArray2 = dBIN0.selectKey(byteArray0, byteArray1);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray2);
      assertEquals("DBIN", dBIN0.shortClassName());
  }


  @Test
  public void test06()  throws Throwable  {
      DBIN dBIN0 = new DBIN();
      CursorImpl cursorImpl0 = null;
      // Undeclared exception!
      try { 
        dBIN0.getCursorBIN((CursorImpl) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.DBIN", e);
      }
  }

  @Test
  public void test07()  throws Throwable  {
      DBIN dBIN0 = new DBIN();
      File file0 = null;
      Properties properties0 = null;
      EnvironmentConfig environmentConfig0 = null;
      try {
        environmentConfig0 = new EnvironmentConfig(properties0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.EnvironmentMutableConfig", e);
      }
  }

  @Test
  public void test08()  throws Throwable  {
      DBIN dBIN0 = new DBIN();
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("  <dbin>\n    <dupkey></dupkey>\n    <node>0</node>\n    <idkey><key v=\"\"/></idkey>\n    <dirty val=\"false\"/>\n    <generation val=\"0\"/>\n    <level val=\"0\"/>\n    <isRoot val=\"false\"/>\n    <entries nEntries=\"0\">\n    </entries>\n  </dbin>");
      CharBuffer charBuffer0 = mS949_0.decode(byteBuffer0);
      ByteBuffer byteBuffer1 = mS949_0.encode(charBuffer0);
      // Undeclared exception!
      try { 
        dBIN0.writeToLog(byteBuffer1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.LogUtils", e);
      }
  }


  @Test
  public void test10()  throws Throwable  {
      DBIN dBIN0 = new DBIN();
      // Undeclared exception!
      try { 
        dBIN0.readFromLog((ByteBuffer) null, (byte)2);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.LogUtils", e);
      }
  }

  @Test
  public void test11()  throws Throwable  {
      DBIN dBIN0 = new DBIN();
      // Undeclared exception!
      try { 
        dBIN0.dumpString(741, false);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: 741
         //
         assertThrownBy("java.lang.String", e);
      }
  }

  @Test
  public void test12()  throws Throwable  {
      DBIN dBIN0 = new DBIN();
      // Undeclared exception!
      try { 
        dBIN0.dumpLogAdditional((StringBuffer) null);
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
      String string0 = dBIN0.endTag();
      assertEquals("DBIN", dBIN0.shortClassName());
      assertEquals("</dbin>", string0);
  }

  @Test
  public void test15()  throws Throwable  {
      DBIN dBIN0 = new DBIN();
      String string0 = dBIN0.beginTag();
      assertEquals("<dbin>", string0);
      assertEquals("DBIN", dBIN0.shortClassName());
  }

  @Test
  public void test16()  throws Throwable  {
      DBIN dBIN0 = new DBIN();
      String string0 = dBIN0.shortClassName();
      assertEquals("DBIN", string0);
  }

  @Test
  public void test17()  throws Throwable  {
      DBIN dBIN0 = new DBIN();
      boolean boolean0 = dBIN0.matchLNByNodeId((TreeLocation) null, 1212L);
      assertFalse(boolean0);
      assertEquals("DBIN", dBIN0.shortClassName());
  }

  @Test
  public void test19()  throws Throwable  {
      DBIN dBIN0 = new DBIN();
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("");
      // Undeclared exception!
      try { 
        dBIN0.readFromLog(byteBuffer0, (byte) (-93));
        fail("Expecting exception: BufferUnderflowException");
      
      } catch(BufferUnderflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.nio.Buffer", e);
      }
  }

  @Test
  public void test20()  throws Throwable  {
      DBIN dBIN0 = new DBIN();
      // Undeclared exception!
      try { 
        dBIN0.getCursorBIN((CursorImpl) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.DBIN", e);
      }
  }

  @Test
  public void test21()  throws Throwable  {
      DBIN dBIN0 = new DBIN();
      // Undeclared exception!
      try { 
        dBIN0.setCursorIndex((CursorImpl) null, 214);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.DBIN", e);
      }
  }

  @Test
  public void test22()  throws Throwable  {
      DBIN dBIN0 = new DBIN();
      boolean boolean0 = dBIN0.hasNonLNChildren();
      assertEquals("DBIN", dBIN0.shortClassName());
      assertFalse(boolean0);
  }

  @Test
  public void test23()  throws Throwable  {
      DBIN dBIN0 = new DBIN();
      dBIN0.getMainTreeKey();
      assertEquals("DBIN", dBIN0.shortClassName());
  }

  @Test
  public void test24()  throws Throwable  {
      DBIN dBIN0 = new DBIN();
      boolean boolean0 = dBIN0.containsDuplicates();
      assertEquals("DBIN", dBIN0.shortClassName());
      assertTrue(boolean0);
  }

  @Test
  public void test25()  throws Throwable  {
      DBIN dBIN0 = new DBIN();
      byte[] byteArray0 = dBIN0.getChildKey(dBIN0);
      // Undeclared exception!
      try { 
        dBIN0.createNewInstance(byteArray0, 332, 10);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.IN", e);
      }
  }


  @Test
  public void test27()  throws Throwable  {
      DatabaseImpl databaseImpl0 = new DatabaseImpl();
      byte[] byteArray0 = new byte[8];
      DBIN dBIN0 = null;
      try {
        dBIN0 = new DBIN(databaseImpl0, byteArray0, (-1090), byteArray0, (int) (byte) (-116));
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
      dBIN0.getLogType();
      assertEquals("DBIN", dBIN0.shortClassName());
  }


  @Test
  public void test32()  throws Throwable  {
      DBIN dBIN0 = new DBIN();
      // Undeclared exception!
      try { 
        dBIN0.getCursorBINToBeRemoved((CursorImpl) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.DBIN", e);
      }
  }

  @Test
  public void test33()  throws Throwable  {
      DBIN dBIN0 = new DBIN();
      StringWriter stringWriter0 = new StringWriter();
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      dBIN0.dumpLogAdditional(stringBuffer0);
      assertEquals(17, stringBuffer0.length());
      assertEquals("<key v=\"<null>\"/>", stringWriter0.toString());
  }

  @Test
  public void test34()  throws Throwable  {
      DBIN dBIN0 = new DBIN();
      DatabaseId databaseId0 = new DatabaseId(0);
      int int0 = dBIN0.generateLevel(databaseId0, (-159));
      assertEquals("DBIN", dBIN0.shortClassName());
      assertEquals((-159), int0);
  }

  @Test
  public void test35()  throws Throwable  {
      DBIN dBIN0 = new DBIN();
      dBIN0.getDupTreeKey();
      assertEquals("DBIN", dBIN0.shortClassName());
  }

  @Test
  public void test36()  throws Throwable  {
      DBIN dBIN0 = new DBIN();
      dBIN0.getDupKey();
      assertEquals("DBIN", dBIN0.shortClassName());
  }


  @Test
  public void test38()  throws Throwable  {
      DBIN dBIN0 = new DBIN();
      String string0 = dBIN0.dumpString(2, false);
      assertEquals("DBIN", dBIN0.shortClassName());
      assertEquals("  <dbin>\n    <dupkey></dupkey>\n    <node>0</node>\n    <idkey><key v=\"\"/></idkey>\n    <dirty val=\"false\"/>\n    <generation val=\"0\"/>\n    <level val=\"0\"/>\n    <isRoot val=\"false\"/>\n    <entries nEntries=\"0\">\n    </entries>\n  </dbin>", string0);
  }

  @Test
  public void test39()  throws Throwable  {
      DBIN dBIN0 = new DBIN();
      boolean boolean0 = dBIN0.canBeAncestor(false);
      assertEquals("DBIN", dBIN0.shortClassName());
      assertFalse(boolean0);
  }

  @Test
  public void test40()  throws Throwable  {
      DBIN dBIN0 = new DBIN();
      dBIN0.getBINDeltaType();
      assertEquals("DBIN", dBIN0.shortClassName());
  }



  @Test
  public void test43()  throws Throwable  {
      DBIN dBIN0 = new DBIN();
      dBIN0.selectKey((byte[]) null, (byte[]) null);
      assertEquals("DBIN", dBIN0.shortClassName());
  }

  @Test
  public void test44()  throws Throwable  {
      DBIN dBIN0 = new DBIN();
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("9lB]i");
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
}
