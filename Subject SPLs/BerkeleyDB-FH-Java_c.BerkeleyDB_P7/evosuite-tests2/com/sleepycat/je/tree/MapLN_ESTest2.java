/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 01:55:07 KST 2017
 */

package com.sleepycat.je.tree;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
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

import com.sleepycat.je.dbi.DatabaseImpl;
import com.sleepycat.je.log.LogEntryType;

import sun.nio.cs.ext.MS949;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class MapLN_ESTest2 extends MapLN_ESTest_scaffolding2 {

  @Test
  public void test00()  throws Throwable  {
      DatabaseImpl databaseImpl0 = new DatabaseImpl();
      MapLN mapLN0 = new MapLN(databaseImpl0);
      databaseImpl0.setTransactional(true);
      DatabaseImpl databaseImpl1 = mapLN0.getDatabase();
      //  // Unstable assertion: assertEquals(214L, databaseImpl1.getEofNodeId());
  }

  @Test
  public void test02()  throws Throwable  {
      MapLN mapLN0 = new MapLN();
      mapLN0.dumpString(0, true);
      //  // Unstable assertion: assertEquals(188L, mapLN0.getLastId());
  }

  @Test
  public void test03()  throws Throwable  {
      MapLN mapLN0 = new MapLN();
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("LockMode.");
      // Undeclared exception!
      try { 
        mapLN0.readFromLog(byteBuffer0, (byte)0);
        fail("Expecting exception: BufferUnderflowException");
      
      } catch(BufferUnderflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.nio.Buffer", e);
      }
  }

  @Test
  public void test04()  throws Throwable  {
      MapLN mapLN0 = new MapLN();
      mapLN0.makeDeleted();
      boolean boolean0 = mapLN0.isDeleted();
      assertTrue(boolean0);
  }

  @Test
  public void test05()  throws Throwable  {
      MapLN mapLN0 = new MapLN();
      StringWriter stringWriter0 = new StringWriter(0);
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      mapLN0.dumpLogAdditional(stringBuffer0, true);
      //  // Unstable assertion: assertEquals(175L, mapLN0.getLastId());
  }

  @Test
  public void test06()  throws Throwable  {
      MapLN mapLN0 = new MapLN();
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("/wo!3O");
      // Undeclared exception!
      try { 
        mapLN0.writeToLog(byteBuffer0);
        fail("Expecting exception: BufferOverflowException");
      
      } catch(BufferOverflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.nio.Buffer", e);
      }
  }


  @Test
  public void test08()  throws Throwable  {
      MapLN mapLN0 = new MapLN();
      // Undeclared exception!
      try { 
        mapLN0.readFromLog((ByteBuffer) null, (byte)16);
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
      MapLN mapLN0 = new MapLN();
      // Undeclared exception!
      try { 
        mapLN0.dumpString(1003, false);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: 1005
         //
         assertThrownBy("java.lang.String", e);
      }
  }


  @Test
  public void test12()  throws Throwable  {
      MapLN mapLN0 = new MapLN();
      mapLN0.isDeleted();
      //  // Unstable assertion: assertEquals(130L, mapLN0.getLastId());
  }


  @Test
  public void test14()  throws Throwable  {
      DatabaseImpl databaseImpl0 = new DatabaseImpl();
      MapLN mapLN0 = new MapLN(databaseImpl0);
      int int0 = mapLN0.getLogSize();
      //  // Unstable assertion: assertEquals(107L, mapLN0.getLastId());
      //  // Unstable assertion: assertEquals(36, int0);
  }

  @Test
  public void test15()  throws Throwable  {
      MapLN mapLN0 = new MapLN((DatabaseImpl) null);
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("vB2Z3&6& QKYSc&D");
      // Undeclared exception!
      try { 
        mapLN0.writeToLog(byteBuffer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.MapLN", e);
      }
  }

  @Test
  public void test16()  throws Throwable  {
      MapLN mapLN0 = new MapLN((DatabaseImpl) null);
      mapLN0.getDatabase();
      //  // Unstable assertion: assertEquals(101L, mapLN0.getNodeId());
  }


  @Test
  public void test18()  throws Throwable  {
      DatabaseImpl databaseImpl0 = new DatabaseImpl();
      MapLN mapLN0 = new MapLN(databaseImpl0);
      mapLN0.toString();
      //  // Unstable assertion: assertEquals(39L, mapLN0.getLastId());
  }

  @Test
  public void test19()  throws Throwable  {
      MapLN mapLN0 = new MapLN();
      DatabaseImpl databaseImpl0 = new DatabaseImpl();
      // Undeclared exception!
      try { 
        mapLN0.postFetchInit(databaseImpl0, 1957L);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.dbi.DatabaseImpl", e);
      }
  }

  @Test
  public void test20()  throws Throwable  {
      MapLN mapLN0 = new MapLN((DatabaseImpl) null);
      // Undeclared exception!
      try { 
        mapLN0.dumpString(0, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.MapLN", e);
      }
  }

  @Test
  public void test21()  throws Throwable  {
      MapLN mapLN0 = new MapLN();
      // Undeclared exception!
      try { 
        mapLN0.dumpLogAdditional((StringBuffer) null, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.dbi.DatabaseImpl", e);
      }
  }


}
