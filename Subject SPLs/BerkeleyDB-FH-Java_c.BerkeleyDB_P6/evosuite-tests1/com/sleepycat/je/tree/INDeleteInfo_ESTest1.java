/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 21 20:38:32 KST 2017
 */

package com.sleepycat.je.tree;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.nio.ByteBuffer;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.sleepycat.je.dbi.DatabaseId;
import com.sleepycat.je.log.LogEntryType;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class INDeleteInfo_ESTest1 extends INDeleteInfo_ESTest_scaffolding1 {

  @Test
  public void test00()  throws Throwable  {
      INDeleteInfo iNDeleteInfo0 = new INDeleteInfo();
      long long0 = iNDeleteInfo0.getDeletedNodeId();
      assertEquals(0L, long0);
  }

  @Test
  public void test01()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      DatabaseId databaseId0 = new DatabaseId((int) (byte) (-1));
      INDeleteInfo iNDeleteInfo0 = new INDeleteInfo(2796L, byteArray0, databaseId0);
      long long0 = iNDeleteInfo0.getDeletedNodeId();
      assertEquals(2796L, long0);
  }

  @Test
  public void test02()  throws Throwable  {
      INDeleteInfo iNDeleteInfo0 = new INDeleteInfo();
      byte[] byteArray0 = iNDeleteInfo0.getDeletedIdKey();
      assertNull(byteArray0);
  }

  @Test
  public void test03()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      DatabaseId databaseId0 = new DatabaseId();
      INDeleteInfo iNDeleteInfo0 = new INDeleteInfo(0L, byteArray0, databaseId0);
      byte[] byteArray1 = iNDeleteInfo0.getDeletedIdKey();
      assertSame(byteArray0, byteArray1);
  }

  @Test
  public void test04()  throws Throwable  {
      INDeleteInfo iNDeleteInfo0 = new INDeleteInfo();
      DatabaseId databaseId0 = iNDeleteInfo0.getDatabaseId();
      assertEquals(4, databaseId0.getLogSize());
  }

  @Test
  public void test05()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      DatabaseId databaseId0 = new DatabaseId(288);
      INDeleteInfo iNDeleteInfo0 = new INDeleteInfo(0L, byteArray0, databaseId0);
      DatabaseId databaseId1 = iNDeleteInfo0.getDatabaseId();
      assertEquals(288, databaseId1.getId());
  }

  @Test
  public void test06()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      DatabaseId databaseId0 = new DatabaseId((-553));
      INDeleteInfo iNDeleteInfo0 = new INDeleteInfo(0L, byteArray0, databaseId0);
      DatabaseId databaseId1 = iNDeleteInfo0.getDatabaseId();
      assertEquals(0L, databaseId1.getTransactionId());
  }

  @Test
  public void test07()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      DatabaseId databaseId0 = new DatabaseId();
      INDeleteInfo iNDeleteInfo0 = new INDeleteInfo(1479L, byteArray0, databaseId0);
      int int0 = iNDeleteInfo0.getLogSize();
      assertEquals(1479L, iNDeleteInfo0.getDeletedNodeId());
      assertEquals(16, int0);
  }

  @Test
  public void test08()  throws Throwable  {
      INDeleteInfo iNDeleteInfo0 = new INDeleteInfo();
      // Undeclared exception!
      try { 
        iNDeleteInfo0.readFromLog((ByteBuffer) null, (byte) (-1));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.LogUtils", e);
      }
  }

  @Test
  public void test09()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      DatabaseId databaseId0 = new DatabaseId();
      INDeleteInfo iNDeleteInfo0 = new INDeleteInfo(1114L, byteArray0, databaseId0);
      iNDeleteInfo0.getDeletedIdKey();
      assertEquals(1114L, iNDeleteInfo0.getDeletedNodeId());
  }

  @Test
  public void test10()  throws Throwable  {
      INDeleteInfo iNDeleteInfo0 = new INDeleteInfo();
      boolean boolean0 = iNDeleteInfo0.logEntryIsTransactional();
      assertFalse(boolean0);
  }

  @Test
  public void test11()  throws Throwable  {
      INDeleteInfo iNDeleteInfo0 = new INDeleteInfo();
      // Undeclared exception!
      try { 
        iNDeleteInfo0.dumpLog((StringBuffer) null, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.INDeleteInfo", e);
      }
  }

  @Test
  public void test12()  throws Throwable  {
      INDeleteInfo iNDeleteInfo0 = new INDeleteInfo();
      long long0 = iNDeleteInfo0.getTransactionId();
      assertEquals(0L, long0);
  }

  @Test
  public void test13()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      INDeleteInfo iNDeleteInfo0 = new INDeleteInfo(0L, byteArray0, (DatabaseId) null);
      DatabaseId databaseId0 = iNDeleteInfo0.getDatabaseId();
      assertNull(databaseId0);
  }

  @Test
  public void test14()  throws Throwable  {
      INDeleteInfo iNDeleteInfo0 = new INDeleteInfo();
      // Undeclared exception!
      try { 
        iNDeleteInfo0.getLogSize();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.LogUtils", e);
      }
  }

  @Test
  public void test15()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      DatabaseId databaseId0 = new DatabaseId();
      INDeleteInfo iNDeleteInfo0 = new INDeleteInfo(2090L, byteArray0, databaseId0);
      iNDeleteInfo0.postLogWork((byte)11);
      assertEquals(2090L, iNDeleteInfo0.getDeletedNodeId());
  }

  @Test
  public void test16()  throws Throwable  {
      INDeleteInfo iNDeleteInfo0 = new INDeleteInfo();
      boolean boolean0 = iNDeleteInfo0.marshallOutsideWriteLatch();
      assertTrue(boolean0);
  }

  @Test
  public void test17()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      DatabaseId databaseId0 = new DatabaseId((-553));
      INDeleteInfo iNDeleteInfo0 = new INDeleteInfo(0L, byteArray0, databaseId0);
      boolean boolean0 = iNDeleteInfo0.countAsObsoleteWhenLogged();
      assertFalse(boolean0);
  }

  @Test
  public void test18()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      DatabaseId databaseId0 = new DatabaseId();
      INDeleteInfo iNDeleteInfo0 = new INDeleteInfo(0L, byteArray0, databaseId0);
      // Undeclared exception!
      try { 
        iNDeleteInfo0.writeToLog((ByteBuffer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.LogUtils", e);
      }
  }

  @Test
  public void test19()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      DatabaseId databaseId0 = new DatabaseId();
      INDeleteInfo iNDeleteInfo0 = new INDeleteInfo((-2368L), byteArray0, databaseId0);
      long long0 = iNDeleteInfo0.getDeletedNodeId();
      assertEquals((-2368L), long0);
  }

  @Test
  public void test20()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      DatabaseId databaseId0 = new DatabaseId((-553));
      INDeleteInfo iNDeleteInfo0 = new INDeleteInfo(0L, byteArray0, databaseId0);
      LogEntryType logEntryType0 = iNDeleteInfo0.getLogType();
      assertFalse(logEntryType0.isNodeType());
  }
}
