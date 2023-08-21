/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 16:54:15 KST 2017
 */

package com.sleepycat.je.utilint;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class BitMap_ESTest4 extends BitMap_ESTest_scaffolding4 {



  @Test
  public void test02()  throws Throwable  {
      BitMap bitMap0 = new BitMap();
      boolean boolean0 = bitMap0.get(14L);
      assertFalse(boolean0);
  }

  @Test
  public void test03()  throws Throwable  {
      BitMap bitMap0 = new BitMap();
      bitMap0.set(65535L);
  }


  @Test
  public void test05()  throws Throwable  {
      BitMap bitMap0 = new BitMap();
      bitMap0.set(0);
      bitMap0.set(0);
  }

  @Test
  public void test06()  throws Throwable  {
      BitMap bitMap0 = new BitMap();
      try { 
        bitMap0.get((-3L));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // -3 is negative.
         //
         assertThrownBy("com.sleepycat.je.utilint.BitMap", e);
      }
  }


  @Test
  public void test08()  throws Throwable  {
      BitMap bitMap0 = new BitMap();
      try { 
        bitMap0.set((-1714L));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // -1714 is negative.
         //
         assertThrownBy("com.sleepycat.je.utilint.BitMap", e);
      }
  }


}