/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 01:38:23 KST 2017
 */

package com.sleepycat.je.tree;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.sleepycat.je.dbi.DatabaseId;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class DBINReference_ESTest10 extends DBINReference_ESTest_scaffolding10 {

  @Test
  public void test0()  throws Throwable  {
      DatabaseId databaseId0 = new DatabaseId();
      byte[] byteArray0 = new byte[4];
      DBINReference dBINReference0 = new DBINReference(4L, databaseId0, byteArray0, byteArray0);
      byte[] byteArray1 = dBINReference0.getKey();
      assertSame(byteArray0, byteArray1);
  }

  @Test
  public void test1()  throws Throwable  {
      DatabaseId databaseId0 = new DatabaseId();
      byte[] byteArray0 = new byte[0];
      DBINReference dBINReference0 = new DBINReference((-1110L), databaseId0, byteArray0, byteArray0);
      dBINReference0.idKey = null;
      byte[] byteArray1 = dBINReference0.getData();
      assertNull(byteArray1);
  }

  @Test
  public void test2()  throws Throwable  {
      DatabaseId databaseId0 = new DatabaseId();
      byte[] byteArray0 = new byte[4];
      DBINReference dBINReference0 = new DBINReference(4L, databaseId0, byteArray0, byteArray0);
      byte[] byteArray1 = dBINReference0.getData();
      assertSame(byteArray0, byteArray1);
  }

  @Test
  public void test3()  throws Throwable  {
      DatabaseId databaseId0 = new DatabaseId();
      byte[] byteArray0 = new byte[0];
      DBINReference dBINReference0 = new DBINReference((-1110L), databaseId0, byteArray0, byteArray0);
      dBINReference0.idKey = null;
      String string0 = dBINReference0.toString();
      assertEquals("idKey=key=<key v=\"<null>\"/> nodeId = -1110 db=0 deletedKeys=null dupKey=<key v=\"\"/>", string0);
  }

  @Test
  public void test4()  throws Throwable  {
      DatabaseId databaseId0 = new DatabaseId();
      byte[] byteArray0 = new byte[0];
      DBINReference dBINReference0 = new DBINReference((-1110L), databaseId0, byteArray0, byteArray0);
      dBINReference0.idKey = null;
      byte[] byteArray1 = dBINReference0.getKey();
      assertSame(byteArray0, byteArray1);
  }

  @Test
  public void test5()  throws Throwable  {
      DatabaseId databaseId0 = new DatabaseId();
      byte[] byteArray0 = new byte[0];
      DBINReference dBINReference0 = new DBINReference((-2426L), databaseId0, byteArray0, (byte[]) null);
      byte[] byteArray1 = dBINReference0.getKey();
      assertNull(byteArray1);
  }

  @Test
  public void test6()  throws Throwable  {
      DatabaseId databaseId0 = new DatabaseId();
      byte[] byteArray0 = new byte[0];
      DBINReference dBINReference0 = new DBINReference((-1110L), databaseId0, byteArray0, byteArray0);
      byte[] byteArray1 = dBINReference0.getData();
      assertSame(byteArray0, byteArray1);
  }
}