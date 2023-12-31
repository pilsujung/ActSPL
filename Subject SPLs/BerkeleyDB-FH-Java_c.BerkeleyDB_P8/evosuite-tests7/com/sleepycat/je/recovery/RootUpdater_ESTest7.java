/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 21 21:02:44 KST 2017
 */

package com.sleepycat.je.recovery;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.sleepycat.je.dbi.DatabaseImpl;
import com.sleepycat.je.tree.ChildReference;
import com.sleepycat.je.tree.IN;
import com.sleepycat.je.tree.Node;
import com.sleepycat.je.tree.Tree;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class RootUpdater_ESTest7 extends RootUpdater_ESTest_scaffolding7 {

  @Test
  public void test05()  throws Throwable  {
      RootUpdater rootUpdater0 = new RootUpdater((Tree) null, (IN) null, (-1760L));
      byte[] byteArray0 = new byte[1];
      ChildReference childReference0 = new ChildReference((Node) null, byteArray0, (long) 0, (byte) (-24));
      // Undeclared exception!
      try { 
        rootUpdater0.doWork(childReference0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.recovery.RootUpdater", e);
      }
  }

  @Test
  public void test07()  throws Throwable  {
      DatabaseImpl databaseImpl0 = new DatabaseImpl();
      Tree tree0 = databaseImpl0.getTree();
      RootUpdater rootUpdater0 = new RootUpdater(tree0, (IN) null, 0);
      boolean boolean0 = rootUpdater0.updateDone();
      //  // Unstable assertion: assertEquals(1L, databaseImpl0.getEofNodeId());
      //  // Unstable assertion: assertFalse(boolean0);
  }

  @Test
  public void test10()  throws Throwable  {
      Tree tree0 = new Tree();
      RootUpdater rootUpdater0 = new RootUpdater(tree0, (IN) null, 120L);
      boolean boolean0 = rootUpdater0.getReplaced();
      assertFalse(boolean0);
  }

  @Test
  public void test12()  throws Throwable  {
      Tree tree0 = new Tree();
      RootUpdater rootUpdater0 = new RootUpdater(tree0, (IN) null, 120L);
      boolean boolean0 = rootUpdater0.getInserted();
      assertFalse(boolean0);
  }

  @Test
  public void test13()  throws Throwable  {
      Tree tree0 = new Tree();
      RootUpdater rootUpdater0 = new RootUpdater(tree0, (IN) null, 120L);
      long long0 = rootUpdater0.getOriginalLsn();
      assertEquals((-1L), long0);
  }
}
