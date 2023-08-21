/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 11:13:31 KST 2017
 */

package com.sleepycat.je.utilint;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.fail;

import java.util.HashMap;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.sleepycat.je.dbi.DatabaseImpl;
import com.sleepycat.je.tree.BIN;
import com.sleepycat.je.tree.DBIN;
import com.sleepycat.je.tree.IN;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class LevelOrderedINMap_ESTest3 extends LevelOrderedINMap_ESTest_scaffolding3 {


  @Test
  public void test1()  throws Throwable  {
      LevelOrderedINMap levelOrderedINMap0 = new LevelOrderedINMap();
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      hashMap0.putIfAbsent("LaEF{!!ig", "LaEF{!!ig");
      levelOrderedINMap0.putAll(hashMap0);
      DBIN dBIN0 = new DBIN();
      // Undeclared exception!
      try { 
        levelOrderedINMap0.putIN(dBIN0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.String cannot be cast to java.lang.Integer
         //
         assertThrownBy("java.lang.Integer", e);
      }
  }

  @Test
  public void test2()  throws Throwable  {
      LevelOrderedINMap levelOrderedINMap0 = new LevelOrderedINMap();
      DatabaseImpl databaseImpl0 = new DatabaseImpl();
      byte[] byteArray0 = new byte[0];
      BIN bIN0 = new BIN(databaseImpl0, byteArray0, 0, (-1));
      levelOrderedINMap0.putIN(bIN0);
      levelOrderedINMap0.putIN(bIN0);
      assertFalse(bIN0.isRoot());
  }
}
