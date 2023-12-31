/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 10:04:24 KST 2017
 */

package com.sleepycat.je.cleaner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.sleepycat.je.dbi.DatabaseId;
import com.sleepycat.je.tree.DupCountLN;
import com.sleepycat.je.tree.LN;
import com.sleepycat.je.tree.MapLN;
import com.sleepycat.je.tree.NameLN;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class LNInfo_ESTest5 extends LNInfo_ESTest_scaffolding5 {

  @Test
  public void test00()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      LNInfo lNInfo0 = new LNInfo((LN) null, (DatabaseId) null, byteArray0, (byte[]) null);
      LN lN0 = lNInfo0.getLN();
      assertNull(lN0);
  }

  @Test
  public void test01()  throws Throwable  {
      LN lN0 = new LN();
      DatabaseId databaseId0 = new DatabaseId();
      byte[] byteArray0 = new byte[0];
      LNInfo lNInfo0 = new LNInfo(lN0, databaseId0, byteArray0, byteArray0);
      LN lN1 = lNInfo0.getLN();
      assertEquals("<ln>", lN1.beginTag());
  }

  @Test
  public void test02()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      LNInfo lNInfo0 = new LNInfo((LN) null, (DatabaseId) null, byteArray0, (byte[]) null);
      byte[] byteArray1 = lNInfo0.getKey();
      assertSame(byteArray0, byteArray1);
  }

  @Test
  public void test03()  throws Throwable  {
      MapLN mapLN0 = new MapLN();
      DatabaseId databaseId0 = new DatabaseId();
      byte[] byteArray0 = new byte[0];
      LNInfo lNInfo0 = new LNInfo((LN) mapLN0, databaseId0, byteArray0, byteArray0);
      lNInfo0.getKey();
      //  // Unstable assertion: assertEquals(42L, mapLN0.getLastId());
  }

  @Test
  public void test04()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      LNInfo lNInfo0 = new LNInfo((LN) null, (DatabaseId) null, byteArray0, (byte[]) null);
      byte[] byteArray1 = lNInfo0.getDupKey();
      assertNull(byteArray1);
  }

  @Test
  public void test05()  throws Throwable  {
      DatabaseId databaseId0 = new DatabaseId(4361);
      NameLN nameLN0 = new NameLN(databaseId0);
      byte[] byteArray0 = new byte[1];
      LNInfo lNInfo0 = new LNInfo((LN) nameLN0, databaseId0, byteArray0, byteArray0);
      lNInfo0.getDupKey();
      //  // Unstable assertion: assertEquals(39L, nameLN0.getNodeId());
      //  // Unstable assertion: assertEquals(39L, nameLN0.getLastId());
  }

  @Test
  public void test06()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      LNInfo lNInfo0 = new LNInfo((LN) null, (DatabaseId) null, byteArray0, (byte[]) null);
      DatabaseId databaseId0 = lNInfo0.getDbId();
      assertNull(databaseId0);
  }

  @Test
  public void test07()  throws Throwable  {
      DupCountLN dupCountLN0 = new DupCountLN();
      DatabaseId databaseId0 = new DatabaseId();
      byte[] byteArray0 = new byte[0];
      LNInfo lNInfo0 = new LNInfo((LN) dupCountLN0, databaseId0, byteArray0, byteArray0);
      DatabaseId databaseId1 = lNInfo0.getDbId();
      assertSame(databaseId0, databaseId1);
  }

  @Test
  public void test08()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      NameLN nameLN0 = new NameLN();
      DatabaseId databaseId0 = new DatabaseId(1639);
      LNInfo lNInfo0 = new LNInfo((LN) nameLN0, databaseId0, byteArray0, byteArray0);
      DatabaseId databaseId1 = lNInfo0.getDbId();
      assertFalse(databaseId1.logEntryIsTransactional());
  }

  @Test
  public void test09()  throws Throwable  {
      DupCountLN dupCountLN0 = new DupCountLN();
      DatabaseId databaseId0 = new DatabaseId();
      byte[] byteArray0 = new byte[2];
      LNInfo lNInfo0 = new LNInfo((LN) dupCountLN0, databaseId0, byteArray0, byteArray0);
      int int0 = lNInfo0.getMemorySize();
      assertEquals(136, int0);
  }

  @Test
  public void test10()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      LNInfo lNInfo0 = new LNInfo((LN) null, (DatabaseId) null, byteArray0, (byte[]) null);
      int int0 = lNInfo0.getMemorySize();
      assertEquals(72, int0);
  }

  @Test
  public void test11()  throws Throwable  {
      DupCountLN dupCountLN0 = new DupCountLN(1682);
      DatabaseId databaseId0 = new DatabaseId();
      byte[] byteArray0 = new byte[0];
      LNInfo lNInfo0 = new LNInfo((LN) dupCountLN0, databaseId0, (byte[]) null, byteArray0);
      int int0 = lNInfo0.getMemorySize();
      //  // Unstable assertion: assertEquals(13L, dupCountLN0.getLastId());
      //  // Unstable assertion: assertEquals(112, int0);
  }

  @Test
  public void test12()  throws Throwable  {
      DupCountLN dupCountLN0 = new DupCountLN(1682);
      DatabaseId databaseId0 = new DatabaseId();
      byte[] byteArray0 = new byte[0];
      LNInfo lNInfo0 = new LNInfo((LN) dupCountLN0, databaseId0, (byte[]) null, byteArray0);
      lNInfo0.getKey();
      //  // Unstable assertion: assertEquals(10L, dupCountLN0.getLastId());
      //  // Unstable assertion: assertEquals(10L, dupCountLN0.getNodeId());
  }

  @Test
  public void test13()  throws Throwable  {
      DatabaseId databaseId0 = new DatabaseId();
      NameLN nameLN0 = new NameLN(databaseId0);
      byte[] byteArray0 = new byte[0];
      LNInfo lNInfo0 = new LNInfo((LN) nameLN0, databaseId0, byteArray0, byteArray0);
      NameLN nameLN1 = (NameLN)lNInfo0.getLN();
      //  // Unstable assertion: assertEquals(7L, nameLN1.getNodeId());
  }

  @Test
  public void test14()  throws Throwable  {
      DupCountLN dupCountLN0 = new DupCountLN(1682);
      DatabaseId databaseId0 = new DatabaseId();
      byte[] byteArray0 = new byte[0];
      LNInfo lNInfo0 = new LNInfo((LN) dupCountLN0, databaseId0, (byte[]) null, byteArray0);
      lNInfo0.getDupKey();
      //  // Unstable assertion: assertEquals(4L, dupCountLN0.getNodeId());
      //  // Unstable assertion: assertEquals(4L, dupCountLN0.getLastId());
  }

  @Test
  public void test15()  throws Throwable  {
      DatabaseId databaseId0 = new DatabaseId((-1));
      NameLN nameLN0 = new NameLN(databaseId0);
      byte[] byteArray0 = new byte[3];
      LNInfo lNInfo0 = new LNInfo((LN) nameLN0, databaseId0, byteArray0, byteArray0);
      lNInfo0.getDbId();
      //  // Unstable assertion: assertEquals(1L, nameLN0.getLastId());
      //  // Unstable assertion: assertEquals(1L, nameLN0.getNodeId());
  }
}
