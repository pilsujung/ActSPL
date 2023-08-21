/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 21 23:41:36 KST 2017
 */

package com.sleepycat.je;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class TransactionConfig_ESTest6 extends TransactionConfig_ESTest_scaffolding6 {

  @Test
  public void test00()  throws Throwable  {
      TransactionConfig transactionConfig0 = new TransactionConfig();
      boolean boolean0 = transactionConfig0.getReadUncommitted();
      assertFalse(transactionConfig0.getReadCommitted());
      assertFalse(boolean0);
      assertFalse(transactionConfig0.getSync());
      assertFalse(transactionConfig0.getNoWait());
      assertFalse(transactionConfig0.getSerializableIsolation());
      assertFalse(transactionConfig0.getWriteNoSync());
      assertFalse(transactionConfig0.getNoSync());
  }

  @Test
  public void test01()  throws Throwable  {
      TransactionConfig transactionConfig0 = new TransactionConfig();
      boolean boolean0 = transactionConfig0.getNoWait();
      assertFalse(transactionConfig0.getWriteNoSync());
      assertFalse(transactionConfig0.getNoSync());
      assertFalse(transactionConfig0.getSerializableIsolation());
      assertFalse(boolean0);
      assertFalse(transactionConfig0.getDirtyRead());
      assertFalse(transactionConfig0.getReadCommitted());
      assertFalse(transactionConfig0.getSync());
  }

  @Test
  public void test02()  throws Throwable  {
      TransactionConfig transactionConfig0 = TransactionConfig.DEFAULT;
      boolean boolean0 = transactionConfig0.getDirtyRead();
      assertTrue(boolean0);
  }

  @Test
  public void test03()  throws Throwable  {
      TransactionConfig transactionConfig0 = new TransactionConfig();
      boolean boolean0 = transactionConfig0.getDirtyRead();
      assertFalse(transactionConfig0.getSync());
      assertFalse(transactionConfig0.getReadCommitted());
      assertFalse(transactionConfig0.getNoWait());
      assertFalse(transactionConfig0.getNoSync());
      assertFalse(boolean0);
      assertFalse(transactionConfig0.getWriteNoSync());
      assertFalse(transactionConfig0.getSerializableIsolation());
  }

  @Test
  public void test05()  throws Throwable  {
      TransactionConfig transactionConfig0 = new TransactionConfig();
      assertFalse(transactionConfig0.getNoSync());
      
      transactionConfig0.setNoSync(true);
      assertTrue(transactionConfig0.getNoSync());
  }

  @Test
  public void test06()  throws Throwable  {
      TransactionConfig transactionConfig0 = new TransactionConfig();
      assertFalse(transactionConfig0.getSerializableIsolation());
      
      transactionConfig0.setSerializableIsolation(true);
      boolean boolean0 = transactionConfig0.getSerializableIsolation();
      assertTrue(boolean0);
  }

  @Test
  public void test07()  throws Throwable  {
      TransactionConfig transactionConfig0 = new TransactionConfig();
      transactionConfig0.setDirtyRead(false);
      assertFalse(transactionConfig0.getNoWait());
      assertFalse(transactionConfig0.getSerializableIsolation());
      assertFalse(transactionConfig0.getDirtyRead());
      assertFalse(transactionConfig0.getNoSync());
      assertFalse(transactionConfig0.getSync());
      assertFalse(transactionConfig0.getWriteNoSync());
      assertFalse(transactionConfig0.getReadCommitted());
  }

  @Test
  public void test08()  throws Throwable  {
      TransactionConfig transactionConfig0 = TransactionConfig.DEFAULT;
      TransactionConfig transactionConfig1 = transactionConfig0.cloneConfig();
      //  // Unstable assertion: assertTrue(transactionConfig1.getWriteNoSync());
  }

  @Test
  public void test09()  throws Throwable  {
      TransactionConfig transactionConfig0 = new TransactionConfig();
      assertFalse(transactionConfig0.getNoWait());
      
      transactionConfig0.setNoWait(true);
      assertTrue(transactionConfig0.getNoWait());
  }

  @Test
  public void test11()  throws Throwable  {
      TransactionConfig transactionConfig0 = TransactionConfig.DEFAULT;
      boolean boolean0 = transactionConfig0.getSync();
      assertFalse(boolean0);
  }

  @Test
  public void test12()  throws Throwable  {
      TransactionConfig transactionConfig0 = TransactionConfig.DEFAULT;
      boolean boolean0 = transactionConfig0.getWriteNoSync();
      //  // Unstable assertion: assertTrue(boolean0);
  }

  @Test
  public void test13()  throws Throwable  {
      TransactionConfig transactionConfig0 = TransactionConfig.DEFAULT;
      transactionConfig0.setWriteNoSync(false);
      assertFalse(transactionConfig0.getWriteNoSync());
  }

  @Test
  public void test14()  throws Throwable  {
      TransactionConfig transactionConfig0 = TransactionConfig.DEFAULT;
      boolean boolean0 = transactionConfig0.getReadCommitted();
      assertFalse(boolean0);
  }

  @Test
  public void test15()  throws Throwable  {
      TransactionConfig transactionConfig0 = new TransactionConfig();
      transactionConfig0.setReadCommitted(false);
      assertFalse(transactionConfig0.getNoSync());
      assertFalse(transactionConfig0.getWriteNoSync());
      assertFalse(transactionConfig0.getNoWait());
      assertFalse(transactionConfig0.getSync());
      assertFalse(transactionConfig0.getReadCommitted());
      assertFalse(transactionConfig0.getSerializableIsolation());
      assertFalse(transactionConfig0.getDirtyRead());
  }

  @Test
  public void test16()  throws Throwable  {
      TransactionConfig transactionConfig0 = new TransactionConfig();
      transactionConfig0.setSync(false);
      assertFalse(transactionConfig0.getNoWait());
      assertFalse(transactionConfig0.getSerializableIsolation());
      assertFalse(transactionConfig0.getDirtyRead());
      assertFalse(transactionConfig0.getNoSync());
      assertFalse(transactionConfig0.getSync());
      assertFalse(transactionConfig0.getWriteNoSync());
      assertFalse(transactionConfig0.getReadCommitted());
  }

  @Test
  public void test18()  throws Throwable  {
      TransactionConfig transactionConfig0 = TransactionConfig.DEFAULT;
      transactionConfig0.setReadUncommitted(true);
      assertTrue(transactionConfig0.getDirtyRead());
  }

  @Test
  public void test19()  throws Throwable  {
      TransactionConfig transactionConfig0 = new TransactionConfig();
      boolean boolean0 = transactionConfig0.getSerializableIsolation();
      assertFalse(boolean0);
      assertFalse(transactionConfig0.getWriteNoSync());
      assertFalse(transactionConfig0.getDirtyRead());
      assertFalse(transactionConfig0.getNoSync());
      assertFalse(transactionConfig0.getReadCommitted());
      assertFalse(transactionConfig0.getNoWait());
      assertFalse(transactionConfig0.getSync());
  }
}