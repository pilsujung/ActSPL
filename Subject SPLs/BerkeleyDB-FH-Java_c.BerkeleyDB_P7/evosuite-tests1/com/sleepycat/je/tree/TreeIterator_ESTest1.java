/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 21 20:53:30 KST 2017
 */

package com.sleepycat.je.tree;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.fail;

import java.util.NoSuchElementException;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.sleepycat.je.DatabaseException;
import com.sleepycat.je.dbi.DatabaseImpl;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class TreeIterator_ESTest1 extends TreeIterator_ESTest_scaffolding1 {

  @Test
  public void test0()  throws Throwable  {
      Tree tree0 = new Tree();
      TreeIterator treeIterator0 = new TreeIterator(tree0);
      treeIterator0.hook755();
  }

  @Test
  public void test1()  throws Throwable  {
      TreeIterator treeIterator0 = null;
      try {
        treeIterator0 = new TreeIterator((Tree) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.TreeIterator", e);
      }
  }

  @Test
  public void test2()  throws Throwable  {
      Tree tree0 = new Tree();
      ChildReference childReference0 = new ChildReference();
      tree0.setRoot(childReference0, false);
      TreeIterator treeIterator0 = null;
      try {
        treeIterator0 = new TreeIterator(tree0);
        fail("Expecting exception: DatabaseException");
      
      } catch(DatabaseException e) {
         //
         // fetchTarget of null lsn state=0 NULL_LSN without KnownDeleted
         //
         assertThrownBy("com.sleepycat.je.tree.ChildReference", e);
      }
  }

  @Test
  public void test3()  throws Throwable  {
      Tree tree0 = new Tree();
      TreeIterator treeIterator0 = new TreeIterator(tree0);
      // Undeclared exception!
      try { 
        treeIterator0.next();
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.TreeIterator", e);
      }
  }

  @Test
  public void test4()  throws Throwable  {
      DatabaseImpl databaseImpl0 = new DatabaseImpl();
      Tree tree0 = databaseImpl0.getTree();
      TreeIterator treeIterator0 = new TreeIterator(tree0);
      boolean boolean0 = treeIterator0.hasNext();
      //  // Unstable assertion: assertEquals(9L, databaseImpl0.getEofNodeId());
      //  // Unstable assertion: assertFalse(boolean0);
  }

  @Test
  public void test5()  throws Throwable  {
      DatabaseImpl databaseImpl0 = new DatabaseImpl();
      Tree tree0 = databaseImpl0.getTree();
      TreeIterator treeIterator0 = new TreeIterator(tree0);
      treeIterator0.hook759();
      //  // Unstable assertion: assertEquals(5L, databaseImpl0.getEofNodeId());
  }

  @Test
  public void test6()  throws Throwable  {
      Tree tree0 = new Tree();
      TreeIterator treeIterator0 = new TreeIterator(tree0);
      treeIterator0.hook756();
  }

  @Test
  public void test7()  throws Throwable  {
      Tree tree0 = new Tree();
      TreeIterator treeIterator0 = new TreeIterator(tree0);
      // Undeclared exception!
      try { 
        treeIterator0.remove();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.TreeIterator", e);
      }
  }

  @Test
  public void test8()  throws Throwable  {
      Tree tree0 = new Tree();
      TreeIterator treeIterator0 = new TreeIterator(tree0);
      treeIterator0.hook758();
  }

  @Test
  public void test9()  throws Throwable  {
      DatabaseImpl databaseImpl0 = new DatabaseImpl();
      Tree tree0 = databaseImpl0.getTree();
      TreeIterator treeIterator0 = new TreeIterator(tree0);
      treeIterator0.hook757();
      //  // Unstable assertion: assertEquals(1L, databaseImpl0.getEofNodeId());
  }
}
