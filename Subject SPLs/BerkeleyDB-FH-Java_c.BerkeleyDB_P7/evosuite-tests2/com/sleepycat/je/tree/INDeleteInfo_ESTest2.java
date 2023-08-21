/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 01:49:29 KST 2017
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
public class INDeleteInfo_ESTest2 extends INDeleteInfo_ESTest_scaffolding2 {


  @Test
  public void test01()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      DatabaseId databaseId0 = new DatabaseId((-1356));
      INDeleteInfo iNDeleteInfo0 = new INDeleteInfo((-1552L), byteArray0, databaseId0);
      long long0 = iNDeleteInfo0.getDeletedNodeId();
      assertEquals((-1552L), long0);
  }


  @Test
  public void test03()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      DatabaseId databaseId0 = new DatabaseId();
      INDeleteInfo iNDeleteInfo0 = new INDeleteInfo(0L, byteArray0, databaseId0);
      byte[] byteArray1 = iNDeleteInfo0.getDeletedIdKey();
      assertSame(byteArray1, byteArray0);
  }

  @Test
  public void test04()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      INDeleteInfo iNDeleteInfo0 = new INDeleteInfo((-1037L), byteArray0, (DatabaseId) null);
      iNDeleteInfo0.getDatabaseId();
      assertEquals((-1037L), iNDeleteInfo0.getDeletedNodeId());
  }

  @Test
  public void test05()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      DatabaseId databaseId0 = new DatabaseId((int) (byte)17);
      INDeleteInfo iNDeleteInfo0 = new INDeleteInfo((-1773L), byteArray0, databaseId0);
      iNDeleteInfo0.getDatabaseId();
      assertEquals((-1773L), iNDeleteInfo0.getDeletedNodeId());
  }

  @Test
  public void test06()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      DatabaseId databaseId0 = new DatabaseId((-1356));
      INDeleteInfo iNDeleteInfo0 = new INDeleteInfo((-1552L), byteArray0, databaseId0);
      iNDeleteInfo0.getDatabaseId();
      assertEquals((-1552L), iNDeleteInfo0.getDeletedNodeId());
  }

  @Test
  public void test07()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      DatabaseId databaseId0 = new DatabaseId();
      INDeleteInfo iNDeleteInfo0 = new INDeleteInfo(5L, byteArray0, databaseId0);
      // Undeclared exception!
      try { 
        iNDeleteInfo0.readFromLog((ByteBuffer) null, (byte) (-15));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.LogUtils", e);
      }
  }

  @Test
  public void test08()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      DatabaseId databaseId0 = new DatabaseId(27);
      INDeleteInfo iNDeleteInfo0 = new INDeleteInfo(1917L, byteArray0, databaseId0);
      iNDeleteInfo0.getDeletedIdKey();
      assertEquals(1917L, iNDeleteInfo0.getDeletedNodeId());
  }


  @Test
  public void test10()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      DatabaseId databaseId0 = new DatabaseId(27);
      INDeleteInfo iNDeleteInfo0 = new INDeleteInfo(1917L, byteArray0, databaseId0);
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
      DatabaseId databaseId0 = iNDeleteInfo0.getDatabaseId();
      assertEquals("0", databaseId0.toString());
  }

  @Test
  public void test13()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      DatabaseId databaseId0 = new DatabaseId(27);
      INDeleteInfo iNDeleteInfo0 = new INDeleteInfo(1917L, byteArray0, databaseId0);
      int int0 = iNDeleteInfo0.getLogSize();
      assertEquals(1917L, iNDeleteInfo0.getDeletedNodeId());
      assertEquals(16, int0);
  }

  @Test
  public void test14()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      DatabaseId databaseId0 = new DatabaseId();
      INDeleteInfo iNDeleteInfo0 = new INDeleteInfo(5L, byteArray0, databaseId0);
      iNDeleteInfo0.postLogWork(5L);
      assertEquals(5L, iNDeleteInfo0.getDeletedNodeId());
  }

  @Test
  public void test15()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      DatabaseId databaseId0 = new DatabaseId();
      INDeleteInfo iNDeleteInfo0 = new INDeleteInfo(0L, byteArray0, databaseId0);
      boolean boolean0 = iNDeleteInfo0.marshallOutsideWriteLatch();
      assertTrue(boolean0);
  }

  @Test
  public void test16()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      DatabaseId databaseId0 = new DatabaseId();
      INDeleteInfo iNDeleteInfo0 = new INDeleteInfo(0L, byteArray0, databaseId0);
      boolean boolean0 = iNDeleteInfo0.countAsObsoleteWhenLogged();
      assertFalse(boolean0);
  }

  @Test
  public void test17()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      INDeleteInfo iNDeleteInfo0 = new INDeleteInfo(4294967295L, byteArray0, (DatabaseId) null);
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
  public void test18()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      INDeleteInfo iNDeleteInfo0 = new INDeleteInfo(4294967295L, byteArray0, (DatabaseId) null);
      long long0 = iNDeleteInfo0.getDeletedNodeId();
      assertEquals(4294967295L, long0);
  }

  @Test
  public void test19()  throws Throwable  {
      INDeleteInfo iNDeleteInfo0 = new INDeleteInfo();
      LogEntryType logEntryType0 = iNDeleteInfo0.getLogType();
      assertFalse(logEntryType0.isNodeType());
  }
}
