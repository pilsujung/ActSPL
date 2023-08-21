/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 15:49:08 KST 2017
 */

package com.sleepycat.je.tree;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.Iterator;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.sleepycat.je.dbi.DatabaseId;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class BINReference_ESTest4 extends BINReference_ESTest_scaffolding4 {

  @Test
  public void test00()  throws Throwable  {
      DatabaseId databaseId0 = new DatabaseId(1);
      byte[] byteArray0 = new byte[0];
      BINReference bINReference0 = new BINReference(0L, databaseId0, byteArray0);
      long long0 = bINReference0.getNodeId();
      assertEquals(0L, long0);
  }

  @Test
  public void test01()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      BINReference bINReference0 = new BINReference((-353L), (DatabaseId) null, byteArray0);
      long long0 = bINReference0.getNodeId();
      assertEquals((-353L), long0);
  }

  @Test
  public void test02()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      BINReference bINReference0 = new BINReference((-353L), (DatabaseId) null, byteArray0);
      byte[] byteArray1 = bINReference0.getKey();
      assertNotNull(byteArray1);
      assertEquals((-353L), bINReference0.getNodeId());
  }

  @Test
  public void test03()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      BINReference bINReference0 = new BINReference((-360L), (DatabaseId) null, byteArray0);
      bINReference0.getDatabaseId();
      assertEquals((-360L), bINReference0.getNodeId());
  }


  @Test
  public void test05()  throws Throwable  {
      DatabaseId databaseId0 = new DatabaseId(1);
      byte[] byteArray0 = new byte[4];
      BINReference bINReference0 = new BINReference(2582L, databaseId0, byteArray0);
      bINReference0.getDatabaseId();
      assertEquals(2582L, bINReference0.getNodeId());
  }

  @Test
  public void test06()  throws Throwable  {
      DatabaseId databaseId0 = new DatabaseId();
      byte[] byteArray0 = new byte[7];
      BINReference bINReference0 = new BINReference(0L, (DatabaseId) null, byteArray0);
      BINReference bINReference1 = new BINReference((byte) (-5), databaseId0, byteArray0);
      boolean boolean0 = bINReference0.equals(bINReference1);
      assertFalse(boolean0);
      assertFalse(bINReference1.equals((Object)bINReference0));
      assertEquals((-5L), bINReference1.getNodeId());
  }

  @Test
  public void test07()  throws Throwable  {
      DatabaseId databaseId0 = new DatabaseId();
      byte[] byteArray0 = new byte[0];
      BINReference bINReference0 = new BINReference(0L, databaseId0, byteArray0);
      // Undeclared exception!
      try { 
        bINReference0.addDeletedKeys((BINReference) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.BINReference", e);
      }
  }

  @Test
  public void test08()  throws Throwable  {
      DatabaseId databaseId0 = new DatabaseId();
      byte[] byteArray0 = new byte[7];
      BINReference bINReference0 = new BINReference((-1L), databaseId0, byteArray0);
      Key key0 = new Key((byte[]) null);
      // Undeclared exception!
      try { 
        bINReference0.addDeletedKey(key0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.Key", e);
      }
  }

  @Test
  public void test09()  throws Throwable  {
      DatabaseId databaseId0 = new DatabaseId();
      byte[] byteArray0 = new byte[5];
      BINReference bINReference0 = new BINReference(0L, databaseId0, byteArray0);
      BINReference bINReference1 = new BINReference(0L, databaseId0, byteArray0);
      boolean boolean0 = bINReference0.equals(bINReference1);
      assertTrue(boolean0);
  }

  @Test
  public void test10()  throws Throwable  {
      DatabaseId databaseId0 = new DatabaseId(1);
      byte[] byteArray0 = new byte[4];
      BINReference bINReference0 = new BINReference(2582L, databaseId0, byteArray0);
      Integer integer0 = new Integer((int) (byte)76);
      boolean boolean0 = bINReference0.equals(integer0);
      assertEquals(2582L, bINReference0.getNodeId());
      assertFalse(boolean0);
  }

  @Test
  public void test11()  throws Throwable  {
      DatabaseId databaseId0 = new DatabaseId();
      byte[] byteArray0 = new byte[5];
      BINReference bINReference0 = new BINReference(0L, databaseId0, byteArray0);
      boolean boolean0 = bINReference0.equals(bINReference0);
      assertTrue(boolean0);
  }

  @Test
  public void test12()  throws Throwable  {
      DatabaseId databaseId0 = new DatabaseId();
      byte[] byteArray0 = new byte[5];
      BINReference bINReference0 = new BINReference(0L, databaseId0, byteArray0);
      BINReference bINReference1 = new BINReference((byte)55, databaseId0, byteArray0);
      boolean boolean0 = bINReference0.equals(bINReference1);
      assertEquals(55L, bINReference1.getNodeId());
      assertFalse(bINReference1.equals((Object)bINReference0));
      assertFalse(boolean0);
  }

  @Test
  public void test13()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      BINReference bINReference0 = new BINReference((-353L), (DatabaseId) null, byteArray0);
      bINReference0.addDeletedKeys(bINReference0);
      Iterator iterator0 = bINReference0.getDeletedKeyIterator();
      assertEquals((-353L), bINReference0.getNodeId());
      assertNotNull(iterator0);
  }


  @Test
  public void test15()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      BINReference bINReference0 = new BINReference((-353L), (DatabaseId) null, byteArray0);
      bINReference0.addDeletedKeys(bINReference0);
      boolean boolean0 = bINReference0.deletedKeysExist();
      assertEquals((-353L), bINReference0.getNodeId());
      assertFalse(boolean0);
  }

  @Test
  public void test16()  throws Throwable  {
      DatabaseId databaseId0 = new DatabaseId();
      byte[] byteArray0 = new byte[7];
      BINReference bINReference0 = new BINReference((-1L), databaseId0, byteArray0);
      Key key0 = new Key(byteArray0);
      bINReference0.addDeletedKey(key0);
      boolean boolean0 = bINReference0.deletedKeysExist();
      assertTrue(boolean0);
  }

  @Test
  public void test17()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      BINReference bINReference0 = new BINReference(0L, (DatabaseId) null, byteArray0);
      boolean boolean0 = bINReference0.deletedKeysExist();
      assertFalse(boolean0);
  }

  @Test
  public void test18()  throws Throwable  {
      DatabaseId databaseId0 = new DatabaseId(3878);
      byte[] byteArray0 = new byte[6];
      BINReference bINReference0 = new BINReference(1480L, databaseId0, byteArray0);
      Key key0 = new Key(byteArray0);
      bINReference0.addDeletedKey(key0);
      boolean boolean0 = bINReference0.hasDeletedKey(key0);
      assertEquals(1480L, bINReference0.getNodeId());
      assertTrue(boolean0);
  }

  @Test
  public void test19()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      BINReference bINReference0 = new BINReference((-353L), (DatabaseId) null, byteArray0);
      bINReference0.addDeletedKeys(bINReference0);
      Key key0 = new Key(byteArray0);
      boolean boolean0 = bINReference0.hasDeletedKey(key0);
      assertFalse(boolean0);
      assertEquals((-353L), bINReference0.getNodeId());
  }

  @Test
  public void test20()  throws Throwable  {
      DatabaseId databaseId0 = new DatabaseId(3878);
      byte[] byteArray0 = new byte[7];
      BINReference bINReference0 = new BINReference(1503L, databaseId0, byteArray0);
      bINReference0.addDeletedKey((Key) null);
      Key key0 = new Key(byteArray0);
      // Undeclared exception!
      try { 
        bINReference0.hasDeletedKey(key0);
       //  fail("Expecting exception: NullPointerException");
       // Unstable assertion
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test21()  throws Throwable  {
      DatabaseId databaseId0 = new DatabaseId();
      byte[] byteArray0 = new byte[7];
      BINReference bINReference0 = new BINReference((-1L), databaseId0, byteArray0);
      Key key0 = new Key(byteArray0);
      boolean boolean0 = bINReference0.hasDeletedKey(key0);
      assertEquals((-1L), bINReference0.getNodeId());
      assertFalse(boolean0);
  }

  @Test
  public void test22()  throws Throwable  {
      DatabaseId databaseId0 = new DatabaseId();
      byte[] byteArray0 = new byte[7];
      BINReference bINReference0 = new BINReference((-1L), databaseId0, byteArray0);
      Key key0 = new Key(byteArray0);
      bINReference0.addDeletedKey(key0);
      bINReference0.removeDeletedKey(key0);
      assertEquals((-1L), bINReference0.getNodeId());
  }

  @Test
  public void test23()  throws Throwable  {
      DatabaseId databaseId0 = new DatabaseId();
      byte[] byteArray0 = new byte[7];
      BINReference bINReference0 = new BINReference((-1L), databaseId0, byteArray0);
      Key key0 = new Key(byteArray0);
      bINReference0.addDeletedKey(key0);
      bINReference0.removeDeletedKey((Key) null);
      assertTrue(bINReference0.deletedKeysExist());
  }

  @Test
  public void test24()  throws Throwable  {
      DatabaseId databaseId0 = new DatabaseId();
      byte[] byteArray0 = new byte[7];
      BINReference bINReference0 = new BINReference((-1L), databaseId0, byteArray0);
      Key key0 = new Key(byteArray0);
      bINReference0.removeDeletedKey(key0);
      assertEquals((-1L), bINReference0.getNodeId());
  }

  @Test
  public void test25()  throws Throwable  {
      DatabaseId databaseId0 = new DatabaseId(1);
      byte[] byteArray0 = new byte[4];
      BINReference bINReference0 = new BINReference(2582L, databaseId0, byteArray0);
      BINReference bINReference1 = new BINReference((byte) (-71), databaseId0, byteArray0);
      bINReference1.addDeletedKeys(bINReference0);
      bINReference0.addDeletedKeys(bINReference1);
      assertEquals((-71L), bINReference1.getNodeId());
      assertEquals(2582L, bINReference0.getNodeId());
  }

  @Test
  public void test26()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      BINReference bINReference0 = new BINReference((-353L), (DatabaseId) null, byteArray0);
      bINReference0.addDeletedKeys(bINReference0);
      bINReference0.addDeletedKeys(bINReference0);
      assertEquals((-353L), bINReference0.getNodeId());
  }

  @Test
  public void test27()  throws Throwable  {
      DatabaseId databaseId0 = new DatabaseId(3878);
      byte[] byteArray0 = new byte[7];
      BINReference bINReference0 = new BINReference(1503L, databaseId0, byteArray0);
      bINReference0.addDeletedKey((Key) null);
      Key key0 = new Key(byteArray0);
      bINReference0.addDeletedKey(key0);
      assertEquals(1503L, bINReference0.getNodeId());
  }

  @Test
  public void test28()  throws Throwable  {
      DatabaseId databaseId0 = new DatabaseId(3878);
      byte[] byteArray0 = new byte[7];
      BINReference bINReference0 = new BINReference(1503L, databaseId0, byteArray0);
      String string0 = bINReference0.toString();
      assertEquals("idKey=key=<key v=\"0 0 0 0 0 0 0 \"/> nodeId = 1503 db=3878 deletedKeys=null", string0);
  }

  @Test
  public void test29()  throws Throwable  {
      DatabaseId databaseId0 = new DatabaseId((-1728));
      byte[] byteArray0 = new byte[7];
      BINReference bINReference0 = new BINReference(0L, databaseId0, byteArray0);
      DatabaseId databaseId1 = bINReference0.getDatabaseId();
      assertEquals(-1728, databaseId1.getId());
  }

  @Test
  public void test30()  throws Throwable  {
      DatabaseId databaseId0 = new DatabaseId((-249));
      byte[] byteArray0 = new byte[1];
      BINReference bINReference0 = new BINReference(473L, databaseId0, byteArray0);
      long long0 = bINReference0.getNodeId();
      assertEquals(473L, long0);
  }

  @Test
  public void test31()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      BINReference bINReference0 = new BINReference(0L, (DatabaseId) null, byteArray0);
      byte[] byteArray1 = bINReference0.getData();
      assertNull(byteArray1);
  }

  @Test
  public void test32()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      BINReference bINReference0 = new BINReference(0L, (DatabaseId) null, byteArray0);
      bINReference0.hashCode();
  }

  @Test
  public void test33()  throws Throwable  {
      DatabaseId databaseId0 = new DatabaseId();
      byte[] byteArray0 = new byte[0];
      BINReference bINReference0 = new BINReference((-1920L), databaseId0, byteArray0);
      byte[] byteArray1 = bINReference0.getKey();
      assertEquals((-1920L), bINReference0.getNodeId());
      assertNotNull(byteArray1);
  }
}
