/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 16:18:01 KST 2017
 */

package com.sleepycat.je.tree;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.fail;

import java.util.NoSuchElementException;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.sleepycat.je.dbi.DatabaseImpl;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class TreeIterator_ESTest4 extends TreeIterator_ESTest_scaffolding4 {






  @Test
  public void test5()  throws Throwable  {
      DatabaseImpl databaseImpl0 = new DatabaseImpl();
      Tree tree0 = databaseImpl0.getTree();
      NameLN nameLN0 = new NameLN();
      byte[] byteArray0 = new byte[9];
      ChildReference childReference0 = new ChildReference((Node) nameLN0, byteArray0, (-549L));
      tree0.setRoot(childReference0, true);
      TreeIterator treeIterator0 = null;
      try {
        treeIterator0 = new TreeIterator(tree0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // com.sleepycat.je.tree.NameLN cannot be cast to com.sleepycat.je.tree.IN
         //
         assertThrownBy("com.sleepycat.je.tree.Tree", e);
      }
  }



}
