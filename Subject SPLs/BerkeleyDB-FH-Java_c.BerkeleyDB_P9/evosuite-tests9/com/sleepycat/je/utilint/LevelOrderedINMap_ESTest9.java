/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 12:32:14 KST 2017
 */

package com.sleepycat.je.utilint;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.sleepycat.je.tree.DBIN;
import com.sleepycat.je.tree.IN;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class LevelOrderedINMap_ESTest9 extends LevelOrderedINMap_ESTest_scaffolding9 {



  @Test
  public void test2()  throws Throwable  {
      LevelOrderedINMap levelOrderedINMap0 = new LevelOrderedINMap();
      IN iN0 = new IN();
      levelOrderedINMap0.putIN(iN0);
      levelOrderedINMap0.putIN(iN0);
      assertTrue(iN0.isEvictable());
  }
}