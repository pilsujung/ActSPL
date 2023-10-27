/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 21 22:15:15 KST 2017
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
public class BitMap_ESTest7 extends BitMap_ESTest_scaffolding7 {

  @Test
  public void test0()  throws Throwable  {
      BitMap bitMap0 = new BitMap();
      bitMap0.set(0L);
      int int0 = bitMap0.getNumSegments();
      assertEquals(1, int0);
  }

  @Test
  public void test1()  throws Throwable  {
      BitMap bitMap0 = new BitMap();
      int int0 = bitMap0.cardinality();
      assertEquals(0, int0);
  }

  @Test
  public void test2()  throws Throwable  {
      BitMap bitMap0 = new BitMap();
      bitMap0.set(1L);
  }

  @Test
  public void test3()  throws Throwable  {
      BitMap bitMap0 = new BitMap();
      bitMap0.set(0L);
      int int0 = bitMap0.cardinality();
      assertEquals(1, int0);
  }

  @Test
  public void test4()  throws Throwable  {
      BitMap bitMap0 = new BitMap();
      bitMap0.set(0L);
      bitMap0.set(0);
  }

  @Test
  public void test5()  throws Throwable  {
      BitMap bitMap0 = new BitMap();
      try { 
        bitMap0.get((-1724L));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // -1724 is negative.
         //
         assertThrownBy("com.sleepycat.je.utilint.BitMap", e);
      }
  }

  @Test
  public void test6()  throws Throwable  {
      BitMap bitMap0 = new BitMap();
      boolean boolean0 = bitMap0.get(1973L);
      assertFalse(boolean0);
  }

  @Test
  public void test7()  throws Throwable  {
      BitMap bitMap0 = new BitMap();
      try { 
        bitMap0.set((-26L));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // -26 is negative.
         //
         assertThrownBy("com.sleepycat.je.utilint.BitMap", e);
      }
  }

  @Test
  public void test8()  throws Throwable  {
      BitMap bitMap0 = new BitMap();
      int int0 = bitMap0.getNumSegments();
      assertEquals(0, int0);
  }

  @Test
  public void test9()  throws Throwable  {
      BitMap bitMap0 = new BitMap();
      bitMap0.set(0L);
      boolean boolean0 = bitMap0.get(0);
      assertTrue(boolean0);
  }
}