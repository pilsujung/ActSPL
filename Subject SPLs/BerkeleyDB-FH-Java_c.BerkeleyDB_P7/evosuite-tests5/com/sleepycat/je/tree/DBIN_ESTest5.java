/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 11:28:25 KST 2017
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
import java.nio.charset.Charset;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.sleepycat.je.EnvironmentConfig;
import com.sleepycat.je.dbi.CursorImpl;
import com.sleepycat.je.dbi.DatabaseId;
import com.sleepycat.je.dbi.DatabaseImpl;
import com.sleepycat.je.dbi.DbConfigManager;
import com.sleepycat.je.dbi.EnvironmentImpl;
import com.sleepycat.je.dbi.MemoryBudget;

import sun.nio.cs.ext.MS949;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class DBIN_ESTest5 extends DBIN_ESTest_scaffolding5 {


  @Test
  public void test01()  throws Throwable  {
      DBIN dBIN0 = new DBIN();
      byte[] byteArray0 = new byte[6];
      dBIN0.setIdentifierKey(byteArray0);
      dBIN0.getDupTreeKey();
      assertEquals("DBIN", dBIN0.shortClassName());
  }

  @Test
  public void test02()  throws Throwable  {
      DBIN dBIN0 = new DBIN();
      DatabaseId databaseId0 = new DatabaseId((-85));
      int int0 = dBIN0.generateLevel(databaseId0, 0);
      assertEquals(0, int0);
      assertEquals("DBIN", dBIN0.shortClassName());
  }

  @Test
  public void test03()  throws Throwable  {
      DBIN dBIN0 = new DBIN();
      DatabaseId databaseId0 = new DatabaseId();
      int int0 = dBIN0.generateLevel(databaseId0, (-1357));
      assertEquals("DBIN", dBIN0.shortClassName());
      assertEquals((-1357), int0);
  }

  @Test
  public void test04()  throws Throwable  {
      DBIN dBIN0 = new DBIN();
      // Undeclared exception!
      try { 
        dBIN0.setCursorIndex((CursorImpl) null, 756);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.DBIN", e);
      }
  }

  @Test
  public void test05()  throws Throwable  {
      DBIN dBIN0 = new DBIN();
      byte[] byteArray0 = new byte[3];
      byte[] byteArray1 = new byte[4];
      byte[] byteArray2 = dBIN0.selectKey(byteArray0, byteArray1);
      assertEquals("DBIN", dBIN0.shortClassName());
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0}, byteArray2);
  }


  @Test
  public void test07()  throws Throwable  {
      DBIN dBIN0 = new DBIN();
      DatabaseImpl databaseImpl0 = new DatabaseImpl();
      dBIN0.setDatabase(databaseImpl0);
      dBIN0.getKeyComparator();
      assertEquals("DBIN", dBIN0.shortClassName());
  }

  @Test
  public void test09()  throws Throwable  {
      DBIN dBIN0 = new DBIN();
      DIN dIN0 = new DIN();
      dBIN0.getChildKey(dIN0);
      assertEquals("DBIN", dBIN0.shortClassName());
  }

  @Test
  public void test10()  throws Throwable  {
      DBIN dBIN0 = new DBIN();
      StringWriter stringWriter0 = null;
      try {
        stringWriter0 = new StringWriter((-85));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Negative buffer size
         //
         assertThrownBy("java.io.StringWriter", e);
      }
  }

  @Test
  public void test12()  throws Throwable  {
      DBIN dBIN0 = new DBIN();
      StringWriter stringWriter0 = new StringWriter();
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      dBIN0.dumpLog(stringBuffer0, true);
      assertEquals(157, stringBuffer0.length());
      assertEquals("DBIN", dBIN0.shortClassName());
  }



  @Test
  public void test15()  throws Throwable  {
      DBIN dBIN0 = new DBIN();
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("<dbin>");
      // Undeclared exception!
      try { 
        dBIN0.readFromLog(byteBuffer0, (byte)32);
        fail("Expecting exception: BufferUnderflowException");
      
      } catch(BufferUnderflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.nio.Buffer", e);
      }
  }

  @Test
  public void test16()  throws Throwable  {
      DBIN dBIN0 = new DBIN();
      // Undeclared exception!
      try { 
        dBIN0.dumpString((-360), true);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -360
         //
         assertThrownBy("java.lang.String", e);
      }
  }


  @Test
  public void test19()  throws Throwable  {
      DatabaseImpl databaseImpl0 = new DatabaseImpl();
      byte[] byteArray0 = new byte[8];
      DBIN dBIN0 = null;
      try {
        dBIN0 = new DBIN(databaseImpl0, byteArray0, (int) (byte) (-29), byteArray0, (int) (byte) (-119));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.IN", e);
      }
  }



  @Test
  public void test22()  throws Throwable  {
      DBIN dBIN0 = new DBIN();
      TreeLocation treeLocation0 = new TreeLocation();
      boolean boolean0 = dBIN0.matchLNByNodeId(treeLocation0, 0L);
      assertFalse(boolean0);
      assertEquals("DBIN", dBIN0.shortClassName());
  }

  @Test
  public void test23()  throws Throwable  {
      DBIN dBIN0 = new DBIN();
      // Undeclared exception!
      try { 
        dBIN0.readFromLog((ByteBuffer) null, (byte)0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.LogUtils", e);
      }
  }





  @Test
  public void test28()  throws Throwable  {
      DBIN dBIN0 = new DBIN();
      byte[] byteArray0 = new byte[6];
      // Undeclared exception!
      try { 
        dBIN0.createNewInstance(byteArray0, 915, (-154));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.IN", e);
      }
  }



  @Test
  public void test31()  throws Throwable  {
      DBIN dBIN0 = new DBIN();
      String string0 = dBIN0.dumpString(61, false);
      assertEquals("                                                             <dbin>\n                                                               <dupkey></dupkey>\n                                                               <node>0</node>\n                                                               <idkey><key v=\"\"/></idkey>\n                                                               <dirty val=\"false\"/>\n                                                               <generation val=\"0\"/>\n                                                               <level val=\"0\"/>\n                                                               <isRoot val=\"false\"/>\n                                                               <entries nEntries=\"0\">\n                                                               </entries>\n                                                             </dbin>", string0);
      assertEquals("DBIN", dBIN0.shortClassName());
  }





  @Test
  public void test37()  throws Throwable  {
      DBIN dBIN0 = new DBIN();
      DatabaseId databaseId0 = new DatabaseId();
      int int0 = dBIN0.generateLevel(databaseId0, 10);
      assertEquals(10, int0);
      assertEquals("DBIN", dBIN0.shortClassName());
  }




  @Test
  public void test42()  throws Throwable  {
      DBIN dBIN0 = new DBIN();
      String string0 = dBIN0.beginTag();
      assertEquals("DBIN", dBIN0.shortClassName());
      assertEquals("<dbin>", string0);
  }






}
