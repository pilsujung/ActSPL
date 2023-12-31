/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 14:35:34 KST 2017
 */

package com.sleepycat.je.dbi;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.sleepycat.je.DatabaseException;
import com.sleepycat.je.PreloadStats;
import com.sleepycat.je.dbi.DatabaseImpl;
import com.sleepycat.je.dbi.EnvironmentImpl;
import com.sleepycat.je.dbi.INList;
import com.sleepycat.je.dbi.PreloadProcessor;
import com.sleepycat.je.dbi.SortedLSNTreeWalker;
import com.sleepycat.je.tree.DBIN;
import com.sleepycat.je.tree.IN;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class SortedLSNTreeWalker_ESTest4 extends SortedLSNTreeWalker_ESTest_scaffolding4 {

  @Test
  public void test0()  throws Throwable  {
      SortedLSNTreeWalker sortedLSNTreeWalker0 = null;
      try {
        sortedLSNTreeWalker0 = new SortedLSNTreeWalker((DatabaseImpl) null, false, false, (-1369L), (SortedLSNTreeWalker.TreeNodeProcessor) null);
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
      PreloadStats preloadStats0 = new PreloadStats();
      PreloadProcessor preloadProcessor0 = new PreloadProcessor((EnvironmentImpl) null, (-2450L), (-2450L), preloadStats0);
      SortedLSNTreeWalker sortedLSNTreeWalker0 = null;
      try {
        sortedLSNTreeWalker0 = new SortedLSNTreeWalker(databaseImpl0, true, true, (-2450L), (SortedLSNTreeWalker.TreeNodeProcessor) preloadProcessor0);
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
      DBIN dBIN0 = new DBIN();
      sortedLSNTreeWalker_SortedLSNTreeWalker_extractINsForDb0.thisIN = (IN) dBIN0;
      sortedLSNTreeWalker_SortedLSNTreeWalker_extractINsForDb0.hook361();
  }





}
