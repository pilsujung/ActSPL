/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 00:33:09 KST 2017
 */

package com.sleepycat.je.dbi;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.sleepycat.je.DatabaseException;
import com.sleepycat.je.dbi.DatabaseImpl;
import com.sleepycat.je.dbi.INList;
import com.sleepycat.je.dbi.SortedLSNTreeWalker;
import com.sleepycat.je.tree.DIN;
import com.sleepycat.je.tree.IN;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class SortedLSNTreeWalker_ESTest2 extends SortedLSNTreeWalker_ESTest_scaffolding2 {

  @Test
  public void test0()  throws Throwable  {
      SortedLSNTreeWalker sortedLSNTreeWalker0 = null;
      try {
        sortedLSNTreeWalker0 = new SortedLSNTreeWalker((DatabaseImpl) null, true, true, 1L, (SortedLSNTreeWalker.TreeNodeProcessor) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.dbi.SortedLSNTreeWalker", e);
      }
  }

  @Test
  public void test1()  throws Throwable  {
      DatabaseImpl databaseImpl0 = new DatabaseImpl();
      SortedLSNTreeWalker sortedLSNTreeWalker0 = null;
      try {
        sortedLSNTreeWalker0 = new SortedLSNTreeWalker(databaseImpl0, false, false, (-17L), (SortedLSNTreeWalker.TreeNodeProcessor) null);
        fail("Expecting exception: DatabaseException");
      
      } catch(DatabaseException e) {
         //
         // environmentImpl is null for target db null
         //
         assertThrownBy("com.sleepycat.je.dbi.SortedLSNTreeWalker", e);
      }
  }

  @Test
  public void test2()  throws Throwable  {
      SortedLSNTreeWalker.SortedLSNTreeWalker_extractINsForDb sortedLSNTreeWalker_SortedLSNTreeWalker_extractINsForDb0 = new SortedLSNTreeWalker.SortedLSNTreeWalker_extractINsForDb((SortedLSNTreeWalker) null, (INList) null);
      DIN dIN0 = new DIN();
      sortedLSNTreeWalker_SortedLSNTreeWalker_extractINsForDb0.thisIN = (IN) dIN0;
      sortedLSNTreeWalker_SortedLSNTreeWalker_extractINsForDb0.hook361();
  }

  
}
