/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 16:06:24 KST 2017
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

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class INDupDeleteInfo_ESTest4 extends INDupDeleteInfo_ESTest_scaffolding4 {


  @Test
  public void test01()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      INDupDeleteInfo iNDupDeleteInfo0 = new INDupDeleteInfo((-1L), byteArray0, byteArray0, (DatabaseId) null);
      long long0 = iNDupDeleteInfo0.getDeletedNodeId();
      assertEquals((-1L), long0);
  }


  @Test
  public void test03()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      DatabaseId databaseId0 = new DatabaseId();
      INDupDeleteInfo iNDupDeleteInfo0 = new INDupDeleteInfo(1531L, byteArray0, byteArray0, databaseId0);
      iNDupDeleteInfo0.getDeletedMainKey();
      assertEquals(1531L, iNDupDeleteInfo0.getDeletedNodeId());
  }


  @Test
  public void test05()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      INDupDeleteInfo iNDupDeleteInfo0 = new INDupDeleteInfo(1874L, byteArray0, byteArray0, (DatabaseId) null);
      iNDupDeleteInfo0.getDeletedDupKey();
      assertEquals(1874L, iNDupDeleteInfo0.getDeletedNodeId());
  }

  @Test
  public void test06()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      INDupDeleteInfo iNDupDeleteInfo0 = new INDupDeleteInfo(568L, byteArray0, byteArray0, (DatabaseId) null);
      iNDupDeleteInfo0.getDatabaseId();
      assertEquals(568L, iNDupDeleteInfo0.getDeletedNodeId());
  }

  @Test
  public void test07()  throws Throwable  {
      INDupDeleteInfo iNDupDeleteInfo0 = new INDupDeleteInfo();
      DatabaseId databaseId0 = iNDupDeleteInfo0.getDatabaseId();
      assertEquals("0", databaseId0.toString());
  }

  @Test
  public void test08()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      DatabaseId databaseId0 = new DatabaseId((int) (byte) (-13));
      INDupDeleteInfo iNDupDeleteInfo0 = new INDupDeleteInfo(1263L, byteArray0, byteArray0, databaseId0);
      iNDupDeleteInfo0.getDatabaseId();
      assertEquals(1263L, iNDupDeleteInfo0.getDeletedNodeId());
  }

  @Test
  public void test09()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      byte[] byteArray1 = new byte[3];
      DatabaseId databaseId0 = new DatabaseId();
      INDupDeleteInfo iNDupDeleteInfo0 = new INDupDeleteInfo((-1L), byteArray0, byteArray1, databaseId0);
      assertEquals((-1L), iNDupDeleteInfo0.getDeletedNodeId());
  }

  @Test
  public void test10()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      DatabaseId databaseId0 = new DatabaseId();
      INDupDeleteInfo iNDupDeleteInfo0 = new INDupDeleteInfo(1531L, byteArray0, byteArray0, databaseId0);
      int int0 = iNDupDeleteInfo0.getLogSize();
      assertEquals(24, int0);
      assertEquals(1531L, iNDupDeleteInfo0.getDeletedNodeId());
  }

  @Test
  public void test11()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      DatabaseId databaseId0 = new DatabaseId();
      INDupDeleteInfo iNDupDeleteInfo0 = new INDupDeleteInfo(0L, byteArray0, byteArray0, databaseId0);
      boolean boolean0 = iNDupDeleteInfo0.marshallOutsideWriteLatch();
      assertTrue(boolean0);
  }

  @Test
  public void test12()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      DatabaseId databaseId0 = new DatabaseId();
      INDupDeleteInfo iNDupDeleteInfo0 = new INDupDeleteInfo(1531L, byteArray0, byteArray0, databaseId0);
      // Undeclared exception!
      try { 
        iNDupDeleteInfo0.readFromLog((ByteBuffer) null, (byte)60);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.LogUtils", e);
      }
  }

  @Test
  public void test13()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      DatabaseId databaseId0 = new DatabaseId(3058);
      INDupDeleteInfo iNDupDeleteInfo0 = new INDupDeleteInfo((-1722L), byteArray0, byteArray0, databaseId0);
      iNDupDeleteInfo0.getLogType();
      assertEquals((-1722L), iNDupDeleteInfo0.getDeletedNodeId());
  }

  @Test
  public void test14()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      DatabaseId databaseId0 = new DatabaseId((int) (byte)1);
      INDupDeleteInfo iNDupDeleteInfo0 = new INDupDeleteInfo(1054L, byteArray0, byteArray0, databaseId0);
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
  public void test15()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      DatabaseId databaseId0 = new DatabaseId(3058);
      INDupDeleteInfo iNDupDeleteInfo0 = new INDupDeleteInfo((-1722L), byteArray0, byteArray0, databaseId0);
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
  public void test16()  throws Throwable  {
      INDupDeleteInfo iNDupDeleteInfo0 = new INDupDeleteInfo();
      iNDupDeleteInfo0.postLogWork(54L);
      assertTrue(iNDupDeleteInfo0.marshallOutsideWriteLatch());
  }

  @Test
  public void test17()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      DatabaseId databaseId0 = new DatabaseId(3058);
      INDupDeleteInfo iNDupDeleteInfo0 = new INDupDeleteInfo((-1722L), byteArray0, byteArray0, databaseId0);
      iNDupDeleteInfo0.getDatabaseId();
      assertEquals((-1722L), iNDupDeleteInfo0.getDeletedNodeId());
  }

  @Test
  public void test18()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      DatabaseId databaseId0 = new DatabaseId();
      INDupDeleteInfo iNDupDeleteInfo0 = new INDupDeleteInfo(0L, byteArray0, byteArray0, databaseId0);
      long long0 = iNDupDeleteInfo0.getTransactionId();
      assertEquals(0L, long0);
  }

  @Test
  public void test19()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      INDupDeleteInfo iNDupDeleteInfo0 = new INDupDeleteInfo(568L, byteArray0, byteArray0, (DatabaseId) null);
      // Undeclared exception!
      try { 
        iNDupDeleteInfo0.getLogSize();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.INDupDeleteInfo", e);
      }
  }

  @Test
  public void test20()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      DatabaseId databaseId0 = new DatabaseId((int) (byte)1);
      INDupDeleteInfo iNDupDeleteInfo0 = new INDupDeleteInfo(1054L, byteArray0, byteArray0, databaseId0);
      iNDupDeleteInfo0.getDeletedMainKey();
      assertEquals(1054L, iNDupDeleteInfo0.getDeletedNodeId());
  }

  @Test
  public void test21()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      DatabaseId databaseId0 = new DatabaseId();
      INDupDeleteInfo iNDupDeleteInfo0 = new INDupDeleteInfo(1028L, byteArray0, byteArray0, databaseId0);
      long long0 = iNDupDeleteInfo0.getDeletedNodeId();
      assertEquals(1028L, long0);
  }


  @Test
  public void test23()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      DatabaseId databaseId0 = new DatabaseId();
      INDupDeleteInfo iNDupDeleteInfo0 = new INDupDeleteInfo(0L, byteArray0, byteArray0, databaseId0);
      byte[] byteArray1 = iNDupDeleteInfo0.getDeletedDupKey();
      assertSame(byteArray1, byteArray0);
  }

  @Test
  public void test24()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      DatabaseId databaseId0 = new DatabaseId();
      INDupDeleteInfo iNDupDeleteInfo0 = new INDupDeleteInfo((-1L), byteArray0, byteArray0, databaseId0);
      boolean boolean0 = iNDupDeleteInfo0.countAsObsoleteWhenLogged();
      assertFalse(boolean0);
      assertEquals((-1L), iNDupDeleteInfo0.getDeletedNodeId());
  }
}
