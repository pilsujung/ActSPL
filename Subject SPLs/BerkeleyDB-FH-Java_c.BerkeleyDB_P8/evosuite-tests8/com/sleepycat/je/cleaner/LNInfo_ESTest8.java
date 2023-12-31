/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 03:37:30 KST 2017
 */

package com.sleepycat.je.cleaner;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.sleepycat.je.dbi.DatabaseId;
import com.sleepycat.je.dbi.DatabaseImpl;
import com.sleepycat.je.tree.DBIN;
import com.sleepycat.je.tree.DBINReference;
import com.sleepycat.je.tree.FileSummaryLN;
import com.sleepycat.je.tree.LN;
import com.sleepycat.je.tree.NameLN;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class LNInfo_ESTest8 extends LNInfo_ESTest_scaffolding8 {

  @Test
  public void test00()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      LNInfo lNInfo0 = new LNInfo((LN) null, (DatabaseId) null, byteArray0, byteArray0);
      LN lN0 = lNInfo0.getLN();
      assertNull(lN0);
  }

  @Test
  public void test01()  throws Throwable  {
      NameLN nameLN0 = new NameLN();
      byte[] byteArray0 = new byte[8];
      LNInfo lNInfo0 = new LNInfo((LN) nameLN0, (DatabaseId) null, byteArray0, byteArray0);
      NameLN nameLN1 = (NameLN)lNInfo0.getLN();
      //  // Unstable assertion: assertEquals(27L, nameLN1.getLastId());
  }

  @Test
  public void test02()  throws Throwable  {
      LN lN0 = new LN();
      DatabaseId databaseId0 = new DatabaseId();
      byte[] byteArray0 = new byte[5];
      LNInfo lNInfo0 = new LNInfo(lN0, databaseId0, byteArray0, byteArray0);
      LN lN1 = lNInfo0.getLN();
      assertEquals("<ln>", lN1.beginTag());
  }

  @Test
  public void test03()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      LN lN0 = new LN(byteArray0);
      DatabaseId databaseId0 = new DatabaseId((-1950));
      LNInfo lNInfo0 = new LNInfo(lN0, databaseId0, byteArray0, byteArray0);
      lNInfo0.getKey();
      //  // Unstable assertion: assertEquals(25L, lN0.getNodeId());
      //  // Unstable assertion: assertEquals(25L, lN0.getLastId());
  }

  @Test
  public void test04()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      DatabaseId databaseId0 = new DatabaseId();
      NameLN nameLN0 = new NameLN(databaseId0);
      LNInfo lNInfo0 = new LNInfo((LN) nameLN0, databaseId0, byteArray0, byteArray0);
      lNInfo0.getKey();
      //  // Unstable assertion: assertEquals(22L, nameLN0.getNodeId());
      //  // Unstable assertion: assertEquals(22L, nameLN0.getLastId());
  }

  @Test
  public void test05()  throws Throwable  {
      byte[] byteArray0 = new byte[10];
      FileSummaryLN fileSummaryLN0 = new FileSummaryLN();
      DatabaseId databaseId0 = new DatabaseId();
      LNInfo lNInfo0 = new LNInfo((LN) fileSummaryLN0, databaseId0, byteArray0, (byte[]) null);
      byte[] byteArray1 = lNInfo0.getDupKey();
      assertNull(byteArray1);
  }

  @Test
  public void test06()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      DatabaseId databaseId0 = new DatabaseId();
      LNInfo lNInfo0 = new LNInfo((LN) null, databaseId0, byteArray0, byteArray0);
      byte[] byteArray1 = lNInfo0.getDupKey();
      assertArrayEquals(new byte[] {}, byteArray1);
  }

  @Test
  public void test07()  throws Throwable  {
      NameLN nameLN0 = new NameLN();
      byte[] byteArray0 = new byte[8];
      LNInfo lNInfo0 = new LNInfo((LN) nameLN0, (DatabaseId) null, byteArray0, byteArray0);
      DatabaseId databaseId0 = lNInfo0.getDbId();
      assertNull(databaseId0);
  }

  @Test
  public void test08()  throws Throwable  {
      NameLN nameLN0 = new NameLN();
      DatabaseId databaseId0 = new DatabaseId(5);
      byte[] byteArray0 = new byte[0];
      LNInfo lNInfo0 = new LNInfo((LN) nameLN0, databaseId0, byteArray0, byteArray0);
      DatabaseId databaseId1 = lNInfo0.getDbId();
      assertFalse(databaseId1.logEntryIsTransactional());
  }

  @Test
  public void test09()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      LN lN0 = new LN(byteArray0);
      DatabaseId databaseId0 = new DatabaseId((-1950));
      LNInfo lNInfo0 = new LNInfo(lN0, databaseId0, byteArray0, byteArray0);
      lNInfo0.getDbId();
      //  // Unstable assertion: assertEquals(19L, lN0.getLastId());
      //  // Unstable assertion: assertEquals(19L, lN0.getNodeId());
  }

  
}
