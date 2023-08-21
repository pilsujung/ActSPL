/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 03:44:17 KST 2017
 */

package com.sleepycat.je;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class TransactionConfig_ESTest3 extends TransactionConfig_ESTest_scaffolding3 {

  @Test
  public void test00()  throws Throwable  {
      TransactionConfig transactionConfig0 = new TransactionConfig();
      boolean boolean0 = transactionConfig0.getSync();
      assertFalse(transactionConfig0.getNoSync());
      assertFalse(transactionConfig0.getWriteNoSync());
      assertFalse(boolean0);
      assertFalse(transactionConfig0.getNoWait());
      assertFalse(transactionConfig0.getReadCommitted());
      assertFalse(transactionConfig0.getSerializableIsolation());
      assertFalse(transactionConfig0.getDirtyRead());
  }

  @Test
  public void test01()  throws Throwable  {
      TransactionConfig transactionConfig0 = new TransactionConfig();
      boolean boolean0 = transactionConfig0.getReadCommitted();
      assertFalse(transactionConfig0.getSerializableIsolation());
      assertFalse(transactionConfig0.getNoWait());
      assertFalse(transactionConfig0.getWriteNoSync());
      assertFalse(transactionConfig0.getNoSync());
      assertFalse(boolean0);
      assertFalse(transactionConfig0.getDirtyRead());
      assertFalse(transactionConfig0.getSync());
  }

  @Test
  public void test02()  throws Throwable  {
      TransactionConfig transactionConfig0 = new TransactionConfig();
      TransactionConfig transactionConfig1 = transactionConfig0.cloneConfig();
      assertFalse(transactionConfig1.getSync());
      assertFalse(transactionConfig1.getReadCommitted());
      assertFalse(transactionConfig1.getWriteNoSync());
      assertFalse(transactionConfig1.getNoSync());
      assertFalse(transactionConfig1.getReadUncommitted());
      assertFalse(transactionConfig1.getSerializableIsolation());
      assertFalse(transactionConfig1.getNoWait());
  }

  @Test
  public void test03()  throws Throwable  {
      TransactionConfig transactionConfig0 = new TransactionConfig();
      transactionConfig0.setReadUncommitted(false);
      assertFalse(transactionConfig0.getWriteNoSync());
      assertFalse(transactionConfig0.getNoSync());
      assertFalse(transactionConfig0.getSync());
      assertFalse(transactionConfig0.getReadCommitted());
      assertFalse(transactionConfig0.getSerializableIsolation());
      assertFalse(transactionConfig0.getNoWait());
      assertFalse(transactionConfig0.getReadUncommitted());
  }

  @Test
  public void test04()  throws Throwable  {
      TransactionConfig transactionConfig0 = new TransactionConfig();
      boolean boolean0 = transactionConfig0.getDirtyRead();
      assertFalse(transactionConfig0.getWriteNoSync());
      assertFalse(transactionConfig0.getReadCommitted());
      assertFalse(transactionConfig0.getSync());
      assertFalse(transactionConfig0.getNoWait());
      assertFalse(transactionConfig0.getSerializableIsolation());
      assertFalse(boolean0);
      assertFalse(transactionConfig0.getNoSync());
  }

  @Test
  public void test05()  throws Throwable  {
      TransactionConfig transactionConfig0 = TransactionConfig.DEFAULT;
      boolean boolean0 = transactionConfig0.getNoWait();
      //  // Unstable assertion: assertTrue(boolean0);
  }

  @Test
  public void test06()  throws Throwable  {
      TransactionConfig transactionConfig0 = new TransactionConfig();
      transactionConfig0.setNoSync(false);
      assertFalse(transactionConfig0.getSync());
      assertFalse(transactionConfig0.getReadCommitted());
      assertFalse(transactionConfig0.getNoSync());
      assertFalse(transactionConfig0.getWriteNoSync());
      assertFalse(transactionConfig0.getSerializableIsolation());
      assertFalse(transactionConfig0.getReadUncommitted());
      assertFalse(transactionConfig0.getNoWait());
  }

  @Test
  public void test07()  throws Throwable  {
      TransactionConfig transactionConfig0 = new TransactionConfig();
      transactionConfig0.setSerializableIsolation(false);
      assertFalse(transactionConfig0.getWriteNoSync());
      assertFalse(transactionConfig0.getReadCommitted());
      assertFalse(transactionConfig0.getSync());
      assertFalse(transactionConfig0.getNoWait());
      assertFalse(transactionConfig0.getSerializableIsolation());
      assertFalse(transactionConfig0.getNoSync());
      assertFalse(transactionConfig0.getDirtyRead());
  }

  @Test
  public void test09()  throws Throwable  {
      TransactionConfig transactionConfig0 = TransactionConfig.DEFAULT;
      transactionConfig0.setNoWait(false);
      assertFalse(transactionConfig0.getNoWait());
  }

  @Test
  public void test12()  throws Throwable  {
      TransactionConfig transactionConfig0 = new TransactionConfig();
      transactionConfig0.setWriteNoSync(false);
      assertFalse(transactionConfig0.getNoSync());
      assertFalse(transactionConfig0.getNoWait());
      assertFalse(transactionConfig0.getWriteNoSync());
      assertFalse(transactionConfig0.getSerializableIsolation());
      assertFalse(transactionConfig0.getDirtyRead());
      assertFalse(transactionConfig0.getReadCommitted());
      assertFalse(transactionConfig0.getSync());
  }


  @Test
  public void test14()  throws Throwable  {
      TransactionConfig transactionConfig0 = new TransactionConfig();
      transactionConfig0.setReadCommitted(false);
      assertFalse(transactionConfig0.getNoWait());
      assertFalse(transactionConfig0.getReadCommitted());
      assertFalse(transactionConfig0.getWriteNoSync());
      assertFalse(transactionConfig0.getSerializableIsolation());
      assertFalse(transactionConfig0.getNoSync());
      assertFalse(transactionConfig0.getSync());
      assertFalse(transactionConfig0.getReadUncommitted());
  }

  @Test
  public void test15()  throws Throwable  {
      TransactionConfig transactionConfig0 = TransactionConfig.DEFAULT;
      transactionConfig0.setSync(true);
      assertTrue(transactionConfig0.getSync());
  }


  @Test
  public void test18()  throws Throwable  {
      TransactionConfig transactionConfig0 = new TransactionConfig();
      assertFalse(transactionConfig0.getReadUncommitted());
      
      transactionConfig0.setDirtyRead(true);
      boolean boolean0 = transactionConfig0.getDirtyRead();
      assertTrue(boolean0);
  }
}
