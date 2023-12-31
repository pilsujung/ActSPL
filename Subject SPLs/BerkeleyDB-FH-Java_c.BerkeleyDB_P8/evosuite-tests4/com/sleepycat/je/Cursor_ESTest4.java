/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 13:29:01 KST 2017
 */

package com.sleepycat.je;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.sleepycat.je.Cursor;
import com.sleepycat.je.CursorConfig;
import com.sleepycat.je.Database;
import com.sleepycat.je.DatabaseEntry;
import com.sleepycat.je.LockMode;
import com.sleepycat.je.SecondaryConfig;
import com.sleepycat.je.Transaction;
import com.sleepycat.je.dbi.DatabaseImpl;
import com.sleepycat.je.txn.Locker;
import com.sleepycat.je.txn.Txn;
import java.util.logging.Level;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class Cursor_ESTest4 extends Cursor_ESTest_scaffolding4 {

  @Test
  public void test0()  throws Throwable  {
      SecondaryConfig secondaryConfig0 = SecondaryConfig.DEFAULT;
      Database database0 = secondaryConfig0.getForeignKeyDatabase();
      CursorConfig cursorConfig0 = CursorConfig.READ_COMMITTED;
      Locker locker0 = null;
      Cursor cursor0 = null;
      try {
        cursor0 = new Cursor(database0, locker0, cursorConfig0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.Cursor", e);
      }
  }





  @Test
  public void test6()  throws Throwable  {
      CursorConfig cursorConfig0 = CursorConfig.DEFAULT;
      Cursor cursor0 = null;
      try {
        cursor0 = new Cursor((Database) null, (Transaction) null, cursorConfig0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.Cursor", e);
      }
  }

  @Test
  public void test7()  throws Throwable  {
      DatabaseImpl databaseImpl0 = new DatabaseImpl();
      Txn txn0 = new Txn();
      CursorConfig cursorConfig0 = CursorConfig.READ_COMMITTED;
      Cursor cursor0 = null;
      try {
        cursor0 = new Cursor(databaseImpl0, txn0, cursorConfig0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.Cursor", e);
      }
  }

  
}
