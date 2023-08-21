/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 11:39:25 KST 2017
 */

package com.sleepycat.je.tree;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.nio.ByteBuffer;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.sleepycat.je.dbi.DatabaseId;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class INDeleteInfo_ESTest5 extends INDeleteInfo_ESTest_scaffolding5 {


  @Test
  public void test01()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      DatabaseId databaseId0 = new DatabaseId(0);
      INDeleteInfo iNDeleteInfo0 = new INDeleteInfo(994L, byteArray0, databaseId0);
      long long0 = iNDeleteInfo0.getDeletedNodeId();
      assertEquals(994L, long0);
  }


  @Test
  public void test03()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      DatabaseId databaseId0 = new DatabaseId(175);
      INDeleteInfo iNDeleteInfo0 = new INDeleteInfo(2651L, byteArray0, databaseId0);
      iNDeleteInfo0.getDeletedIdKey();
      assertEquals(2651L, iNDeleteInfo0.getDeletedNodeId());
  }

  @Test
  public void test04()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      INDeleteInfo iNDeleteInfo0 = new INDeleteInfo(0L, byteArray0, (DatabaseId) null);
      DatabaseId databaseId0 = iNDeleteInfo0.getDatabaseId();
      assertNull(databaseId0);
  }

  @Test
  public void test05()  throws Throwable  {
      INDeleteInfo iNDeleteInfo0 = new INDeleteInfo();
      DatabaseId databaseId0 = iNDeleteInfo0.getDatabaseId();
      assertFalse(databaseId0.logEntryIsTransactional());
  }

  @Test
  public void test06()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      DatabaseId databaseId0 = new DatabaseId(4012);
      INDeleteInfo iNDeleteInfo0 = new INDeleteInfo(0L, byteArray0, databaseId0);
      DatabaseId databaseId1 = iNDeleteInfo0.getDatabaseId();
      assertEquals("4012", databaseId1.toString());
  }


  @Test
  public void test08()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      INDeleteInfo iNDeleteInfo0 = new INDeleteInfo((-1L), byteArray0, (DatabaseId) null);
      iNDeleteInfo0.getDeletedIdKey();
      assertEquals((-1L), iNDeleteInfo0.getDeletedNodeId());
  }

  @Test
  public void test09()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      DatabaseId databaseId0 = new DatabaseId(0);
      INDeleteInfo iNDeleteInfo0 = new INDeleteInfo((-27L), byteArray0, databaseId0);
      boolean boolean0 = iNDeleteInfo0.logEntryIsTransactional();
      assertFalse(boolean0);
      assertEquals((-27L), iNDeleteInfo0.getDeletedNodeId());
  }

  @Test
  public void test10()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      DatabaseId databaseId0 = new DatabaseId(0);
      INDeleteInfo iNDeleteInfo0 = new INDeleteInfo((-27L), byteArray0, databaseId0);
      // Undeclared exception!
      try { 
        iNDeleteInfo0.dumpLog((StringBuffer) null, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.INDeleteInfo", e);
      }
  }

  @Test
  public void test11()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      INDeleteInfo iNDeleteInfo0 = new INDeleteInfo((-1L), byteArray0, (DatabaseId) null);
      long long0 = iNDeleteInfo0.getTransactionId();
      assertEquals((-1L), iNDeleteInfo0.getDeletedNodeId());
      assertEquals(0L, long0);
  }

  @Test
  public void test12()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      DatabaseId databaseId0 = new DatabaseId((-2473));
      INDeleteInfo iNDeleteInfo0 = new INDeleteInfo((-556L), byteArray0, databaseId0);
      iNDeleteInfo0.getDatabaseId();
      assertEquals((-556L), iNDeleteInfo0.getDeletedNodeId());
  }

  @Test
  public void test13()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      DatabaseId databaseId0 = new DatabaseId((-2473));
      INDeleteInfo iNDeleteInfo0 = new INDeleteInfo((-556L), byteArray0, databaseId0);
      int int0 = iNDeleteInfo0.getLogSize();
      assertEquals((-556L), iNDeleteInfo0.getDeletedNodeId());
      assertEquals(21, int0);
  }

  @Test
  public void test14()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      INDeleteInfo iNDeleteInfo0 = new INDeleteInfo((-1L), byteArray0, (DatabaseId) null);
      iNDeleteInfo0.postLogWork(0L);
      assertEquals((-1L), iNDeleteInfo0.getDeletedNodeId());
  }

  @Test
  public void test15()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      INDeleteInfo iNDeleteInfo0 = new INDeleteInfo((-1L), byteArray0, (DatabaseId) null);
      boolean boolean0 = iNDeleteInfo0.marshallOutsideWriteLatch();
      assertEquals((-1L), iNDeleteInfo0.getDeletedNodeId());
      assertTrue(boolean0);
  }


  @Test
  public void test17()  throws Throwable  {
      INDeleteInfo iNDeleteInfo0 = new INDeleteInfo();
      // Undeclared exception!
      try { 
        iNDeleteInfo0.readFromLog((ByteBuffer) null, (byte)68);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.LogUtils", e);
      }
  }

  @Test
  public void test18()  throws Throwable  {
      INDeleteInfo iNDeleteInfo0 = new INDeleteInfo();
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
      byte[] byteArray0 = new byte[3];
      DatabaseId databaseId0 = new DatabaseId();
      INDeleteInfo iNDeleteInfo0 = new INDeleteInfo((-2115L), byteArray0, databaseId0);
      long long0 = iNDeleteInfo0.getDeletedNodeId();
      assertEquals((-2115L), long0);
  }

  @Test
  public void test20()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      INDeleteInfo iNDeleteInfo0 = new INDeleteInfo((-1L), byteArray0, (DatabaseId) null);
      iNDeleteInfo0.getLogType();
      assertEquals((-1L), iNDeleteInfo0.getDeletedNodeId());
  }
}
