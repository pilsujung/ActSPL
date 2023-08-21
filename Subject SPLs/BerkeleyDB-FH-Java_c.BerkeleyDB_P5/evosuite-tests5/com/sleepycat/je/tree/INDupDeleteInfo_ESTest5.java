/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 11:40:14 KST 2017
 */

package com.sleepycat.je.tree;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertArrayEquals;
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

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class INDupDeleteInfo_ESTest5 extends INDupDeleteInfo_ESTest_scaffolding5 {


  @Test
  public void test01()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      INDupDeleteInfo iNDupDeleteInfo0 = new INDupDeleteInfo(1L, byteArray0, byteArray0, (DatabaseId) null);
      long long0 = iNDupDeleteInfo0.getDeletedNodeId();
      assertEquals(1L, long0);
  }


  @Test
  public void test03()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      DatabaseId databaseId0 = new DatabaseId();
      INDupDeleteInfo iNDupDeleteInfo0 = new INDupDeleteInfo(1925L, byteArray0, byteArray0, databaseId0);
      iNDupDeleteInfo0.getDeletedMainKey();
      assertEquals(1925L, iNDupDeleteInfo0.getDeletedNodeId());
  }


  @Test
  public void test05()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      DatabaseId databaseId0 = new DatabaseId();
      INDupDeleteInfo iNDupDeleteInfo0 = new INDupDeleteInfo(0L, byteArray0, byteArray0, databaseId0);
      byte[] byteArray1 = iNDupDeleteInfo0.getDeletedDupKey();
      assertSame(byteArray1, byteArray0);
  }

  @Test
  public void test06()  throws Throwable  {
      INDupDeleteInfo iNDupDeleteInfo0 = new INDupDeleteInfo();
      DatabaseId databaseId0 = iNDupDeleteInfo0.getDatabaseId();
      assertEquals(0, databaseId0.getId());
  }

  @Test
  public void test07()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      DatabaseId databaseId0 = new DatabaseId(3603);
      INDupDeleteInfo iNDupDeleteInfo0 = new INDupDeleteInfo((-3008L), byteArray0, byteArray0, databaseId0);
      iNDupDeleteInfo0.getDatabaseId();
      assertEquals((-3008L), iNDupDeleteInfo0.getDeletedNodeId());
  }

  @Test
  public void test08()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      DatabaseId databaseId0 = new DatabaseId((int) (byte) (-56));
      INDupDeleteInfo iNDupDeleteInfo0 = new INDupDeleteInfo(0L, byteArray0, byteArray0, databaseId0);
      DatabaseId databaseId1 = iNDupDeleteInfo0.getDatabaseId();
      assertFalse(databaseId1.logEntryIsTransactional());
  }

  @Test
  public void test09()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      byte[] byteArray1 = new byte[0];
      DatabaseId databaseId0 = new DatabaseId();
      INDupDeleteInfo iNDupDeleteInfo0 = new INDupDeleteInfo((-1L), byteArray0, byteArray1, databaseId0);
      int int0 = iNDupDeleteInfo0.getLogSize();
      assertEquals(20, int0);
      assertEquals((-1L), iNDupDeleteInfo0.getDeletedNodeId());
  }


  @Test
  public void test11()  throws Throwable  {
      INDupDeleteInfo iNDupDeleteInfo0 = new INDupDeleteInfo();
      // Undeclared exception!
      try { 
        iNDupDeleteInfo0.readFromLog((ByteBuffer) null, (byte)0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.LogUtils", e);
      }
  }

  @Test
  public void test12()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      INDupDeleteInfo iNDupDeleteInfo0 = new INDupDeleteInfo((-953L), byteArray0, byteArray0, (DatabaseId) null);
      iNDupDeleteInfo0.getLogType();
      assertEquals((-953L), iNDupDeleteInfo0.getDeletedNodeId());
  }

  @Test
  public void test13()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      DatabaseId databaseId0 = new DatabaseId(8);
      INDupDeleteInfo iNDupDeleteInfo0 = new INDupDeleteInfo(0L, byteArray0, byteArray0, databaseId0);
      // Undeclared exception!
      try { 
        iNDupDeleteInfo0.dumpLog((StringBuffer) null, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.INDupDeleteInfo", e);
      }
  }

  @Test
  public void test14()  throws Throwable  {
      INDupDeleteInfo iNDupDeleteInfo0 = new INDupDeleteInfo();
      // Undeclared exception!
      try { 
        iNDupDeleteInfo0.writeToLog((ByteBuffer) null);
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
      INDupDeleteInfo iNDupDeleteInfo0 = new INDupDeleteInfo();
      iNDupDeleteInfo0.postLogWork(801L);
      assertEquals(0L, iNDupDeleteInfo0.getDeletedNodeId());
  }

  @Test
  public void test16()  throws Throwable  {
      byte[] byteArray0 = new byte[10];
      INDupDeleteInfo iNDupDeleteInfo0 = new INDupDeleteInfo(4294967295L, byteArray0, byteArray0, (DatabaseId) null);
      iNDupDeleteInfo0.getDatabaseId();
      assertEquals(4294967295L, iNDupDeleteInfo0.getDeletedNodeId());
  }


  @Test
  public void test18()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      DatabaseId databaseId0 = new DatabaseId(8);
      INDupDeleteInfo iNDupDeleteInfo0 = new INDupDeleteInfo(0L, byteArray0, byteArray0, databaseId0);
      byte[] byteArray1 = iNDupDeleteInfo0.getDeletedMainKey();
      assertArrayEquals(new byte[] {}, byteArray1);
  }

  @Test
  public void test19()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      DatabaseId databaseId0 = new DatabaseId((int) (byte)15);
      INDupDeleteInfo iNDupDeleteInfo0 = new INDupDeleteInfo((-1L), byteArray0, byteArray0, databaseId0);
      long long0 = iNDupDeleteInfo0.getDeletedNodeId();
      assertEquals((-1L), long0);
  }


  @Test
  public void test21()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      DatabaseId databaseId0 = new DatabaseId(3603);
      INDupDeleteInfo iNDupDeleteInfo0 = new INDupDeleteInfo((-3008L), byteArray0, byteArray0, databaseId0);
      boolean boolean0 = iNDupDeleteInfo0.logEntryIsTransactional();
      assertFalse(boolean0);
      assertEquals((-3008L), iNDupDeleteInfo0.getDeletedNodeId());
  }

  @Test
  public void test22()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      INDupDeleteInfo iNDupDeleteInfo0 = new INDupDeleteInfo((-953L), byteArray0, byteArray0, (DatabaseId) null);
      iNDupDeleteInfo0.getDeletedDupKey();
      assertEquals((-953L), iNDupDeleteInfo0.getDeletedNodeId());
  }

  @Test
  public void test23()  throws Throwable  {
      byte[] byteArray0 = new byte[10];
      INDupDeleteInfo iNDupDeleteInfo0 = new INDupDeleteInfo(4294967295L, byteArray0, byteArray0, (DatabaseId) null);
      boolean boolean0 = iNDupDeleteInfo0.countAsObsoleteWhenLogged();
      assertEquals(4294967295L, iNDupDeleteInfo0.getDeletedNodeId());
      assertFalse(boolean0);
  }
}
