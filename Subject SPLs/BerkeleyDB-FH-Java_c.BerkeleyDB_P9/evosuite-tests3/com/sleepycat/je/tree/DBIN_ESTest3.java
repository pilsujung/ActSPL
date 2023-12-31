/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 10:02:31 KST 2017
 */

package com.sleepycat.je.tree;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.StringWriter;
import java.nio.BufferOverflowException;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
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
public class DBIN_ESTest3 extends DBIN_ESTest_scaffolding3 {

  @Test
  public void test00()  throws Throwable  {
      DBIN dBIN0 = new DBIN();
      byte[] byteArray0 = new byte[7];
      dBIN0.selectKey(byteArray0, byteArray0);
      assertEquals("DBIN", dBIN0.shortClassName());
  }

  @Test
  public void test02()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      DBIN dBIN0 = new DBIN();
      dBIN0.setIdentifierKey(byteArray0);
      dBIN0.getDupTreeKey();
      assertEquals("DBIN", dBIN0.shortClassName());
  }

  @Test
  public void test05()  throws Throwable  {
      DBIN dBIN0 = new DBIN();
      DatabaseId databaseId0 = new DatabaseId(0);
      int int0 = dBIN0.generateLevel(databaseId0, 0);
      assertEquals(0, int0);
      assertEquals("DBIN", dBIN0.shortClassName());
  }

  @Test
  public void test07()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      DBIN dBIN0 = new DBIN();
      byte[] byteArray1 = dBIN0.getDupTreeKey();
      byte[] byteArray2 = dBIN0.selectKey(byteArray0, byteArray1);
      assertEquals("DBIN", dBIN0.shortClassName());
      assertArrayEquals(new byte[] {}, byteArray2);
  }

  @Test
  public void test09()  throws Throwable  {
      DBIN dBIN0 = new DBIN();
      byte[] byteArray0 = new byte[9];
      // Undeclared exception!
      try { 
        dBIN0.findEntry(byteArray0, true, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.DBIN", e);
      }
  }

  @Test
  public void test10()  throws Throwable  {
      DBIN dBIN0 = new DBIN();
      CursorImpl cursorImpl0 = null;
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
  public void test11()  throws Throwable  {
      DBIN dBIN0 = new DBIN();
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      String string0 = "";
      ByteBuffer byteBuffer0 = mS949_0.encode(string0);
      // Undeclared exception!
      try { 
        byteBuffer0.get();
        fail("Expecting exception: BufferUnderflowException");
      
      } catch(BufferUnderflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.nio.Buffer", e);
      }
  }



  @Test
  public void test14()  throws Throwable  {
      DBIN dBIN0 = new DBIN();
      // Undeclared exception!
      try { 
        dBIN0.getDatabaseId();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.IN", e);
      }
  }

  @Test
  public void test15()  throws Throwable  {
      DBIN dBIN0 = new DBIN();
      DatabaseId databaseId0 = new DatabaseId();
      int int0 = dBIN0.generateLevel(databaseId0, 3455);
      assertEquals(3455, int0);
      assertEquals("DBIN", dBIN0.shortClassName());
  }

  @Test
  public void test18()  throws Throwable  {
      DBIN dBIN0 = new DBIN();
      // Undeclared exception!
      try { 
        dBIN0.writeToLog((ByteBuffer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.LogUtils", e);
      }
  }


  @Test
  public void test20()  throws Throwable  {
      DBIN dBIN0 = new DBIN();
      // Undeclared exception!
      try { 
        dBIN0.readFromLog((ByteBuffer) null, (byte) (-128));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.LogUtils", e);
      }
  }




  @Test
  public void test24()  throws Throwable  {
      DBIN dBIN0 = new DBIN();
      // Undeclared exception!
      try { 
        dBIN0.dumpString((-1852), false);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -1852
         //
         assertThrownBy("java.lang.String", e);
      }
  }


  @Test
  public void test26()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      DBIN dBIN0 = new DBIN();
      // Undeclared exception!
      try { 
        dBIN0.createNewInstance(byteArray0, (byte)14, 1410);
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
      byte[] byteArray0 = new byte[0];
      DBIN dBIN0 = null;
      try {
        dBIN0 = new DBIN((DatabaseImpl) null, byteArray0, (-2749), byteArray0, (-2749));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.IN", e);
      }
  }

  @Test
  public void test29()  throws Throwable  {
      DatabaseImpl databaseImpl0 = new DatabaseImpl();
      byte[] byteArray0 = new byte[6];
      DBIN dBIN0 = null;
      try {
        dBIN0 = new DBIN(databaseImpl0, byteArray0, (int) (byte) (-106), byteArray0, 1332);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.IN", e);
      }
  }



  @Test
  public void test33()  throws Throwable  {
      DBIN dBIN0 = new DBIN();
      String string0 = dBIN0.dumpString(20, false);
      assertEquals("                    <dbin>\n                      <dupkey></dupkey>\n                      <node>0</node>\n                      <idkey><key v=\"\"/></idkey>\n                      <dirty val=\"false\"/>\n                      <generation val=\"0\"/>\n                      <level val=\"0\"/>\n                      <isRoot val=\"false\"/>\n                      <entries nEntries=\"0\">\n                      </entries>\n                    </dbin>", string0);
      assertEquals("DBIN", dBIN0.shortClassName());
  }

  @Test
  public void test35()  throws Throwable  {
      DBIN dBIN0 = new DBIN();
      TreeLocation treeLocation0 = new TreeLocation();
      boolean boolean0 = dBIN0.matchLNByNodeId(treeLocation0, (-201L));
      assertFalse(boolean0);
      assertEquals("DBIN", dBIN0.shortClassName());
  }

  @Test
  public void test36()  throws Throwable  {
      DBIN dBIN0 = new DBIN();
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode(":]1:K$>KBY'!");
      // Undeclared exception!
      try { 
        dBIN0.readFromLog(byteBuffer0, (byte) (-68));
        fail("Expecting exception: BufferUnderflowException");
      
      } catch(BufferUnderflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.nio.HeapByteBuffer", e);
      }
  }

  @Test
  public void test37()  throws Throwable  {
      DBIN dBIN0 = new DBIN();
      // Undeclared exception!
      try { 
        dBIN0.setCursorIndex((CursorImpl) null, 1633);
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
      boolean boolean0 = dBIN0.containsDuplicates();
      assertTrue(boolean0);
      assertEquals("DBIN", dBIN0.shortClassName());
  }

  @Test
  public void test43()  throws Throwable  {
      DBIN dBIN0 = new DBIN();
      dBIN0.getChildKey(dBIN0);
      assertEquals("DBIN", dBIN0.shortClassName());
  }


  @Test
  public void test48()  throws Throwable  {
      DBIN dBIN0 = new DBIN();
      boolean boolean0 = dBIN0.canBeAncestor(true);
      assertEquals("DBIN", dBIN0.shortClassName());
      assertFalse(boolean0);
  }




}
