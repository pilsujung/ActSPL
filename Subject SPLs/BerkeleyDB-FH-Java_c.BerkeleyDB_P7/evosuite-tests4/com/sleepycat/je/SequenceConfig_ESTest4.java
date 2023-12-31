/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 13:55:57 KST 2017
 */

package com.sleepycat.je;

import org.junit.Test;
import static org.junit.Assert.*;
import com.sleepycat.je.SequenceConfig;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class SequenceConfig_ESTest4 extends SequenceConfig_ESTest_scaffolding4 {

  @Test
  public void test00()  throws Throwable  {
      SequenceConfig sequenceConfig0 = new SequenceConfig();
      long long0 = sequenceConfig0.getRangeMax();
      assertEquals(0L, sequenceConfig0.getInitialValue());
      assertEquals(0, sequenceConfig0.getCacheSize());
      assertEquals((-9223372036854775808L), sequenceConfig0.getRangeMin());
      assertEquals(9223372036854775807L, long0);
  }

  @Test
  public void test01()  throws Throwable  {
      SequenceConfig sequenceConfig0 = new SequenceConfig();
      sequenceConfig0.setInitialValue(3043L);
      long long0 = sequenceConfig0.getInitialValue();
      assertEquals(3043L, long0);
  }

  @Test
  public void test02()  throws Throwable  {
      SequenceConfig sequenceConfig0 = new SequenceConfig();
      sequenceConfig0.setAllowCreate(true);
      boolean boolean0 = sequenceConfig0.getAllowCreate();
      assertTrue(boolean0);
  }


  @Test
  public void test04()  throws Throwable  {
      SequenceConfig sequenceConfig0 = new SequenceConfig();
      sequenceConfig0.setRange(1408L, 1L);
      long long0 = sequenceConfig0.getRangeMin();
      assertEquals(1408L, long0);
  }

  @Test
  public void test05()  throws Throwable  {
      SequenceConfig sequenceConfig0 = new SequenceConfig();
      sequenceConfig0.getAllowCreate();
      assertEquals((-9223372036854775808L), sequenceConfig0.getRangeMin());
      assertEquals(0, sequenceConfig0.getCacheSize());
      assertEquals(9223372036854775807L, sequenceConfig0.getRangeMax());
      assertEquals(0L, sequenceConfig0.getInitialValue());
  }

  @Test
  public void test06()  throws Throwable  {
      SequenceConfig sequenceConfig0 = SequenceConfig.DEFAULT;
      sequenceConfig0.getInitialValue();
      sequenceConfig0.setInitialValue(0L);
      sequenceConfig0.getRangeMin();
      boolean boolean0 = sequenceConfig0.getAutoCommitNoSync();
      assertFalse(boolean0);
  }

  @Test
  public void test08()  throws Throwable  {
      SequenceConfig sequenceConfig0 = SequenceConfig.DEFAULT;
      sequenceConfig0.setWrap(false);
      assertFalse(sequenceConfig0.getWrap());
  }

  @Test
  public void test09()  throws Throwable  {
      SequenceConfig sequenceConfig0 = SequenceConfig.DEFAULT;
      sequenceConfig0.setDecrement(true);
      assertTrue(sequenceConfig0.getDecrement());
  }

  @Test
  public void test10()  throws Throwable  {
      SequenceConfig sequenceConfig0 = SequenceConfig.DEFAULT;
      sequenceConfig0.getWrap();
      sequenceConfig0.setWrap(false);
      sequenceConfig0.getAutoCommitNoSync();
      sequenceConfig0.setInitialValue((-405L));
      //  // Unstable assertion: assertFalse(sequenceConfig0.getExclusiveCreate());
      
      sequenceConfig0.setExclusiveCreate(true);
      long long0 = sequenceConfig0.getInitialValue();
      //  // Unstable assertion: assertEquals((-405L), long0);
  }

  @Test
  public void test11()  throws Throwable  {
      SequenceConfig sequenceConfig0 = SequenceConfig.DEFAULT;
      long long0 = sequenceConfig0.getRangeMax();
      assertEquals(9223372036854775807L, long0);
  }

  @Test
  public void test12()  throws Throwable  {
      SequenceConfig sequenceConfig0 = SequenceConfig.DEFAULT;
      boolean boolean0 = sequenceConfig0.getDecrement();
      //  // Unstable assertion: assertFalse(boolean0);
  }


  @Test
  public void test14()  throws Throwable  {
      SequenceConfig sequenceConfig0 = SequenceConfig.DEFAULT;
      sequenceConfig0.setAutoCommitNoSync(false);
      assertFalse(sequenceConfig0.getAutoCommitNoSync());
  }
}
