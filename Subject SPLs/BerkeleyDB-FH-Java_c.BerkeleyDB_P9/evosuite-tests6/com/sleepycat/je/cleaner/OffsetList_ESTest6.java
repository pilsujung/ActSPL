/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 21 23:54:01 KST 2017
 */

package com.sleepycat.je.cleaner;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.sleepycat.je.cleaner.OffsetList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.TooManyResourcesException;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class OffsetList_ESTest6 extends OffsetList_ESTest_scaffolding6 {

  @Test
  public void test1()  throws Throwable  {
      OffsetList offsetList0 = new OffsetList();
      OffsetList offsetList1 = new OffsetList();
      offsetList0.add(0L, false);
      offsetList1.merge(offsetList0);
      offsetList0.add(0L, false);
      offsetList0.merge(offsetList1);
      offsetList0.add(0L, false);
      offsetList0.add(0L, false);
      offsetList0.size();
      offsetList1.add(5, true);
      offsetList0.merge(offsetList0);
      offsetList0.merge(offsetList0);
      offsetList0.add(0L, false);
      offsetList1.merge(offsetList1);
      offsetList0.merge(offsetList1);
      // Undeclared exception!
      try { 
        offsetList1.contains((-1739L));
        fail("Expecting exception: TooManyResourcesException");
      
      } catch(TooManyResourcesException e) {
         //
         // Loop has been executed more times than the allowed 10000
         //
         assertThrownBy("org.evosuite.runtime.LoopCounter", e);
      }
  }

  @Test
  public void test2()  throws Throwable  {
      OffsetList offsetList0 = new OffsetList();
      // Undeclared exception!
      try { 
        offsetList0.merge((OffsetList) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.cleaner.OffsetList", e);
      }
  }

  @Test
  public void test3()  throws Throwable  {
      OffsetList offsetList0 = new OffsetList();
      offsetList0.contains((-1L));
      OffsetList offsetList1 = new OffsetList();
      offsetList0.merge(offsetList1);
      offsetList0.add((-1L), true);
      offsetList0.contains((-1L));
      offsetList0.merge(offsetList1);
  }

  @Test
  public void test4()  throws Throwable  {
      OffsetList offsetList0 = new OffsetList();
      offsetList0.add((-1827L), false);
      offsetList0.contains((-2328L));
  }

  @Test
  public void test5()  throws Throwable  {
      OffsetList.Segment offsetList_Segment0 = new OffsetList.Segment();
      offsetList_Segment0.next();
      offsetList_Segment0.setNext((OffsetList.Segment) null);
  }

  @Test
  public void test7()  throws Throwable  {
      OffsetList.Segment offsetList_Segment0 = new OffsetList.Segment();
      OffsetList.Segment offsetList_Segment1 = offsetList_Segment0.add(0L);
      offsetList_Segment0.setNext(offsetList_Segment1);
      offsetList_Segment0.add(335L);
      OffsetList.Segment offsetList_Segment2 = offsetList_Segment0.add(0L);
      OffsetList.Segment offsetList_Segment3 = offsetList_Segment0.next();
      OffsetList.Segment offsetList_Segment4 = offsetList_Segment3.add((-1L));
      offsetList_Segment4.setNext(offsetList_Segment2);
      OffsetList.Segment offsetList_Segment5 = offsetList_Segment4.add(0L);
      offsetList_Segment4.setNext(offsetList_Segment5);
      OffsetList offsetList0 = new OffsetList();
      offsetList0.add(0L, true);
      OffsetList offsetList1 = new OffsetList();
      offsetList1.merge(offsetList0);
      offsetList_Segment5.add((-453L));
      offsetList0.merge(offsetList1);
      offsetList_Segment4.size();
      offsetList1.add(1L, false);
      offsetList_Segment4.size();
      offsetList_Segment0.add(6);
      offsetList0.contains(1L);
      offsetList_Segment3.add(0L);
      offsetList0.toArray();
      OffsetList offsetList2 = new OffsetList();
      OffsetList.Segment offsetList_Segment6 = offsetList_Segment5.next();
      OffsetList offsetList3 = new OffsetList();
      offsetList1.merge(offsetList3);
      offsetList_Segment5.setNext(offsetList_Segment3);
      offsetList_Segment6.size();
      offsetList2.toArray();
      OffsetList offsetList4 = new OffsetList();
  }

  @Test
  public void test8()  throws Throwable  {
      OffsetList offsetList0 = new OffsetList();
      long long0 = 721L;
      offsetList0.add(721L, true);
      offsetList0.size();
      offsetList0.merge(offsetList0);
      offsetList0.merge(offsetList0);
      offsetList0.toArray();
      offsetList0.toArray();
      // Undeclared exception!
      try { 
        offsetList0.merge(offsetList0);
        fail("Expecting exception: TooManyResourcesException");
      
      } catch(TooManyResourcesException e) {
         //
         // Loop has been executed more times than the allowed 10000
         //
         assertThrownBy("org.evosuite.runtime.LoopCounter", e);
      }
  }

  
}