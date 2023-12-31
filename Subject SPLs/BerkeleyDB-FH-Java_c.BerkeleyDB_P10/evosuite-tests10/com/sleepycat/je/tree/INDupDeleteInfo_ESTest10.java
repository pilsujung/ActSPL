/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 01:50:25 KST 2017
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

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class INDupDeleteInfo_ESTest10 extends INDupDeleteInfo_ESTest_scaffolding10 {

  @Test
  public void test00()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      DatabaseId databaseId0 = new DatabaseId();
      INDupDeleteInfo iNDupDeleteInfo0 = new INDupDeleteInfo(1L, byteArray0, byteArray0, databaseId0);
      long long0 = iNDupDeleteInfo0.getDeletedNodeId();
      assertEquals(1L, long0);
  }

  @Test
  public void test01()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      DatabaseId databaseId0 = new DatabaseId();
      INDupDeleteInfo iNDupDeleteInfo0 = new INDupDeleteInfo((-89L), byteArray0, byteArray0, databaseId0);
      long long0 = iNDupDeleteInfo0.getDeletedNodeId();
      assertEquals((-89L), long0);
  }

  @Test
  public void test02()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      DatabaseId databaseId0 = new DatabaseId((int) (byte) (-36));
      INDupDeleteInfo iNDupDeleteInfo0 = new INDupDeleteInfo((-922L), byteArray0, byteArray0, databaseId0);
      iNDupDeleteInfo0.getDeletedMainKey();
      assertEquals((-922L), iNDupDeleteInfo0.getDeletedNodeId());
  }

  @Test
  public void test03()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      DatabaseId databaseId0 = new DatabaseId();
      INDupDeleteInfo iNDupDeleteInfo0 = new INDupDeleteInfo((-17L), byteArray0, byteArray0, databaseId0);
      iNDupDeleteInfo0.getDeletedMainKey();
      assertEquals((-17L), iNDupDeleteInfo0.getDeletedNodeId());
  }

  @Test
  public void test04()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      DatabaseId databaseId0 = new DatabaseId((int) (byte) (-36));
      INDupDeleteInfo iNDupDeleteInfo0 = new INDupDeleteInfo((-922L), byteArray0, byteArray0, databaseId0);
      iNDupDeleteInfo0.getDeletedDupKey();
      assertEquals((-922L), iNDupDeleteInfo0.getDeletedNodeId());
  }

  @Test
  public void test05()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      DatabaseId databaseId0 = new DatabaseId();
      INDupDeleteInfo iNDupDeleteInfo0 = new INDupDeleteInfo((-17L), byteArray0, byteArray0, databaseId0);
      iNDupDeleteInfo0.getDeletedDupKey();
      assertEquals((-17L), iNDupDeleteInfo0.getDeletedNodeId());
  }

  @Test
  public void test06()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      INDupDeleteInfo iNDupDeleteInfo0 = new INDupDeleteInfo((-156L), byteArray0, byteArray0, (DatabaseId) null);
      iNDupDeleteInfo0.getDatabaseId();
      assertEquals((-156L), iNDupDeleteInfo0.getDeletedNodeId());
  }

  @Test
  public void test07()  throws Throwable  {
      INDupDeleteInfo iNDupDeleteInfo0 = new INDupDeleteInfo();
      DatabaseId databaseId0 = iNDupDeleteInfo0.getDatabaseId();
      assertEquals(0L, databaseId0.getTransactionId());
  }

  @Test
  public void test08()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      DatabaseId databaseId0 = new DatabaseId(2830);
      INDupDeleteInfo iNDupDeleteInfo0 = new INDupDeleteInfo(0L, byteArray0, byteArray0, databaseId0);
      DatabaseId databaseId1 = iNDupDeleteInfo0.getDatabaseId();
      assertEquals("2830", databaseId1.toString());
  }

  @Test
  public void test09()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byte[] byteArray1 = new byte[3];
      DatabaseId databaseId0 = new DatabaseId(2830);
      INDupDeleteInfo iNDupDeleteInfo0 = new INDupDeleteInfo(0L, byteArray0, byteArray1, databaseId0);
      assertFalse(iNDupDeleteInfo0.logEntryIsTransactional());
  }



  @Test
  public void test12()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      DatabaseId databaseId0 = new DatabaseId();
      INDupDeleteInfo iNDupDeleteInfo0 = new INDupDeleteInfo((-17L), byteArray0, byteArray0, databaseId0);
      // Undeclared exception!
      try { 
        iNDupDeleteInfo0.readFromLog((ByteBuffer) null, (byte)61);
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
      byte[] byteArray0 = new byte[0];
      DatabaseId databaseId0 = new DatabaseId();
      INDupDeleteInfo iNDupDeleteInfo0 = new INDupDeleteInfo((-17L), byteArray0, byteArray0, databaseId0);
      iNDupDeleteInfo0.getLogType();
      assertEquals((-17L), iNDupDeleteInfo0.getDeletedNodeId());
  }

  @Test
  public void test14()  throws Throwable  {
      INDupDeleteInfo iNDupDeleteInfo0 = new INDupDeleteInfo();
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
      byte[] byteArray0 = new byte[1];
      INDupDeleteInfo iNDupDeleteInfo0 = new INDupDeleteInfo((-156L), byteArray0, byteArray0, (DatabaseId) null);
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
      byte[] byteArray0 = new byte[4];
      DatabaseId databaseId0 = new DatabaseId(2830);
      INDupDeleteInfo iNDupDeleteInfo0 = new INDupDeleteInfo(0L, byteArray0, byteArray0, databaseId0);
      iNDupDeleteInfo0.postLogWork((-1L));
      assertFalse(iNDupDeleteInfo0.countAsObsoleteWhenLogged());
  }

  @Test
  public void test17()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      DatabaseId databaseId0 = new DatabaseId((int) (byte) (-11));
      INDupDeleteInfo iNDupDeleteInfo0 = new INDupDeleteInfo(4267L, byteArray0, byteArray0, databaseId0);
      iNDupDeleteInfo0.getDatabaseId();
      assertEquals(4267L, iNDupDeleteInfo0.getDeletedNodeId());
  }

  @Test
  public void test18()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      DatabaseId databaseId0 = new DatabaseId(2830);
      INDupDeleteInfo iNDupDeleteInfo0 = new INDupDeleteInfo(0L, byteArray0, byteArray0, databaseId0);
      long long0 = iNDupDeleteInfo0.getTransactionId();
      assertEquals(0L, long0);
  }

  @Test
  public void test19()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      DatabaseId databaseId0 = new DatabaseId(2830);
      INDupDeleteInfo iNDupDeleteInfo0 = new INDupDeleteInfo(0L, byteArray0, byteArray0, databaseId0);
      int int0 = iNDupDeleteInfo0.getLogSize();
      assertEquals(28, int0);
  }


  @Test
  public void test21()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      DatabaseId databaseId0 = new DatabaseId(2830);
      INDupDeleteInfo iNDupDeleteInfo0 = new INDupDeleteInfo(0L, byteArray0, byteArray0, databaseId0);
      long long0 = iNDupDeleteInfo0.getDeletedNodeId();
      assertEquals(0L, long0);
  }

  @Test
  public void test22()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      DatabaseId databaseId0 = new DatabaseId();
      INDupDeleteInfo iNDupDeleteInfo0 = new INDupDeleteInfo((-17L), byteArray0, byteArray0, databaseId0);
      boolean boolean0 = iNDupDeleteInfo0.logEntryIsTransactional();
      assertEquals((-17L), iNDupDeleteInfo0.getDeletedNodeId());
      assertFalse(boolean0);
  }


  @Test
  public void test24()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      INDupDeleteInfo iNDupDeleteInfo0 = new INDupDeleteInfo((-156L), byteArray0, byteArray0, (DatabaseId) null);
      boolean boolean0 = iNDupDeleteInfo0.countAsObsoleteWhenLogged();
      assertFalse(boolean0);
      assertEquals((-156L), iNDupDeleteInfo0.getDeletedNodeId());
  }
}
