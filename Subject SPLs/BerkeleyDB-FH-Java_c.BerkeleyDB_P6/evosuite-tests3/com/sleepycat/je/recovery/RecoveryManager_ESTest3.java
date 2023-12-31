/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 09:49:51 KST 2017
 */

package com.sleepycat.je.recovery;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.File;
import java.util.logging.Level;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.sleepycat.je.EnvironmentConfig;
import com.sleepycat.je.dbi.DatabaseImpl;
import com.sleepycat.je.dbi.EnvironmentImpl;
import com.sleepycat.je.latch.LatchException;
import com.sleepycat.je.tree.ChildReference;
import com.sleepycat.je.tree.DIN;
import com.sleepycat.je.tree.DupCountLN;
import com.sleepycat.je.tree.FileSummaryLN;
import com.sleepycat.je.tree.IN;
import com.sleepycat.je.tree.LN;
import com.sleepycat.je.tree.Node;
import com.sleepycat.je.tree.Tree;
import com.sleepycat.je.tree.TreeLocation;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class RecoveryManager_ESTest3 extends RecoveryManager_ESTest_scaffolding3 {

  @Test
  public void test00()  throws Throwable  {
      EnvironmentImpl environmentImpl0 = null;
      try {
        environmentImpl0 = new EnvironmentImpl((File) null, (EnvironmentConfig) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.dbi.DbConfigManager", e);
      }
  }

  @Test
  public void test01()  throws Throwable  {
      TreeLocation treeLocation0 = new TreeLocation();
      treeLocation0.childLsn = (long) 0;
      DIN dIN0 = new DIN();
      boolean boolean0 = RecoveryManager.hook592(treeLocation0, 0, 0, false, dIN0);
      assertTrue(dIN0.getDirty());
      assertTrue(boolean0);
  }

  @Test
  public void test02()  throws Throwable  {
      TreeLocation treeLocation0 = new TreeLocation();
      // Undeclared exception!
      try { 
        RecoveryManager.hook592(treeLocation0, 0L, 0, true, (DIN) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.recovery.RecoveryManager", e);
      }
  }

  @Test
  public void test04()  throws Throwable  {
      Level level0 = Level.ALL;
      byte[] byteArray0 = new byte[4];
      LN lN0 = new LN(byteArray0);
      RecoveryInfo recoveryInfo0 = new RecoveryInfo();
      // Undeclared exception!
      try { 
        RecoveryManager.hook584(level0, (DatabaseImpl) null, (TreeLocation) null, lN0, byteArray0, byteArray0, 1907L, 0L, true, recoveryInfo0, true, true, false, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.recovery.RecoveryManager", e);
      }
  }

  @Test
  public void test06()  throws Throwable  {
      TreeLocation treeLocation0 = new TreeLocation();
      treeLocation0.childLsn = (long) 0;
      DIN dIN0 = new DIN();
      boolean boolean0 = RecoveryManager.hook592(treeLocation0, 9223372036854775807L, 0, false, dIN0);
      //  // Unstable assertion: assertEquals(11L, dIN0.getGeneration());
      //  // Unstable assertion: assertFalse(boolean0);
  }

  @Test
  public void test07()  throws Throwable  {
      Level level0 = Level.ALL;
      DatabaseImpl databaseImpl0 = new DatabaseImpl();
      TreeLocation treeLocation0 = new TreeLocation();
      DupCountLN dupCountLN0 = new DupCountLN(0);
      RecoveryInfo recoveryInfo0 = new RecoveryInfo();
      RecoveryManager.hook584(level0, databaseImpl0, treeLocation0, dupCountLN0, (byte[]) null, (byte[]) null, (-1L), (-1), false, recoveryInfo0, false, false, false, false);
      //  // Unstable assertion: assertEquals(118L, dupCountLN0.getLastId());
      //  // Unstable assertion: assertEquals(117L, databaseImpl0.getEofNodeId());
  }

  @Test
  public void test08()  throws Throwable  {
      Level level0 = Level.CONFIG;
      DatabaseImpl databaseImpl0 = new DatabaseImpl();
      TreeLocation treeLocation0 = new TreeLocation();
      FileSummaryLN fileSummaryLN0 = new FileSummaryLN();
      RecoveryInfo recoveryInfo0 = new RecoveryInfo();
      RecoveryManager.undo(level0, databaseImpl0, treeLocation0, fileSummaryLN0, (byte[]) null, (byte[]) null, (-1), (-1L), false, recoveryInfo0, false);
      //  // Unstable assertion: assertEquals(1, recoveryInfo0.lnNotFound);
      //  // Unstable assertion: assertEquals(57L, databaseImpl0.getEofNodeId());
  }

  @Test
  public void test09()  throws Throwable  {
      RecoveryManager.RecoveryManager_trace recoveryManager_RecoveryManager_trace0 = new RecoveryManager.RecoveryManager_trace((Level) null, (DatabaseImpl) null, "INSkR^^t3;sLu45bN", false, (Node) null, 44L, (IN) null, false, false, false, 44L, 44L, (-3561));
      // Undeclared exception!
      try { 
        recoveryManager_RecoveryManager_trace0.execute();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.recovery.RecoveryManager$RecoveryManager_trace", e);
      }
  }


  @Test
  public void test12()  throws Throwable  {
      DatabaseImpl databaseImpl0 = new DatabaseImpl();
      TreeLocation treeLocation0 = new TreeLocation();
      // Undeclared exception!
      try { 
        RecoveryManager.hook595(databaseImpl0, treeLocation0, (byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.recovery.RecoveryManager", e);
      }
  }

  @Test
  public void test13()  throws Throwable  {
      TreeLocation treeLocation0 = new TreeLocation();
      DIN dIN0 = new DIN();
      // Undeclared exception!
      try { 
        RecoveryManager.hook592(treeLocation0, 9223372036854775807L, 0, false, dIN0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.utilint.DbLsn", e);
      }
  }

  @Test
  public void test14()  throws Throwable  {
      Level level0 = Level.FINE;
      DatabaseImpl databaseImpl0 = new DatabaseImpl();
      TreeLocation treeLocation0 = new TreeLocation();
      RecoveryInfo recoveryInfo0 = new RecoveryInfo();
      // Undeclared exception!
      try { 
        RecoveryManager.undo(level0, databaseImpl0, treeLocation0, (LN) null, (byte[]) null, (byte[]) null, 255L, (-1L), false, recoveryInfo0, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.recovery.RecoveryManager", e);
      }
  }
}
