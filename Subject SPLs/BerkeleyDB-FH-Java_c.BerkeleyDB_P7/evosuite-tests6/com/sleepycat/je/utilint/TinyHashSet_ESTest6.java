/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 03:06:24 KST 2017
 */

package com.sleepycat.je.utilint;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.NoSuchElementException;
import java.util.Set;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class TinyHashSet_ESTest6 extends TinyHashSet_ESTest_scaffolding6 {

  @Test
  public void test00()  throws Throwable  {
      Object object0 = new Object();
      TinyHashSet tinyHashSet0 = new TinyHashSet();
      TinyHashSet.SingleElementIterator tinyHashSet_SingleElementIterator0 = new TinyHashSet.SingleElementIterator(object0, tinyHashSet0);
      tinyHashSet_SingleElementIterator0.next();
      tinyHashSet_SingleElementIterator0.remove();
      assertFalse(tinyHashSet_SingleElementIterator0.hasNext());
  }

  @Test
  public void test01()  throws Throwable  {
      Object object0 = new Object();
      TinyHashSet tinyHashSet0 = new TinyHashSet();
      TinyHashSet.SingleElementIterator tinyHashSet_SingleElementIterator0 = new TinyHashSet.SingleElementIterator(object0, tinyHashSet0);
      // Undeclared exception!
      try { 
        tinyHashSet_SingleElementIterator0.remove();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.utilint.TinyHashSet$SingleElementIterator", e);
      }
  }

  @Test
  public void test02()  throws Throwable  {
      TinyHashSet tinyHashSet0 = new TinyHashSet();
      TinyHashSet.SingleElementIterator tinyHashSet_SingleElementIterator0 = new TinyHashSet.SingleElementIterator((Object) null, tinyHashSet0);
      // Undeclared exception!
      try { 
        tinyHashSet_SingleElementIterator0.remove();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.utilint.TinyHashSet$SingleElementIterator", e);
      }
  }

  @Test
  public void test03()  throws Throwable  {
      TinyHashSet tinyHashSet0 = new TinyHashSet();
      TinyHashSet.SingleElementIterator tinyHashSet_SingleElementIterator0 = new TinyHashSet.SingleElementIterator(tinyHashSet0, tinyHashSet0);
      tinyHashSet_SingleElementIterator0.returnedTheObject = true;
      // Undeclared exception!
      try { 
        tinyHashSet_SingleElementIterator0.next();
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.utilint.TinyHashSet$SingleElementIterator", e);
      }
  }

  @Test
  public void test04()  throws Throwable  {
      Object object0 = new Object();
      TinyHashSet tinyHashSet0 = new TinyHashSet();
      TinyHashSet.SingleElementIterator tinyHashSet_SingleElementIterator0 = new TinyHashSet.SingleElementIterator(object0, tinyHashSet0);
      assertTrue(tinyHashSet_SingleElementIterator0.hasNext());
      
      tinyHashSet_SingleElementIterator0.next();
      boolean boolean0 = tinyHashSet_SingleElementIterator0.hasNext();
      assertFalse(boolean0);
  }

  @Test
  public void test05()  throws Throwable  {
      Object object0 = new Object();
      TinyHashSet tinyHashSet0 = new TinyHashSet();
      TinyHashSet.SingleElementIterator tinyHashSet_SingleElementIterator0 = new TinyHashSet.SingleElementIterator(object0, tinyHashSet0);
      boolean boolean0 = tinyHashSet_SingleElementIterator0.hasNext();
      assertTrue(boolean0);
  }

  @Test
  public void test06()  throws Throwable  {
      Object object0 = new Object();
      TinyHashSet tinyHashSet0 = new TinyHashSet();
      TinyHashSet.SingleElementIterator tinyHashSet_SingleElementIterator0 = new TinyHashSet.SingleElementIterator(object0, tinyHashSet0);
      tinyHashSet0.add(object0);
      tinyHashSet0.add(tinyHashSet_SingleElementIterator0);
      tinyHashSet0.iterator();
      assertEquals(2, tinyHashSet0.size());
  }

  @Test
  public void test07()  throws Throwable  {
      TinyHashSet tinyHashSet0 = new TinyHashSet();
      tinyHashSet0.add(tinyHashSet0);
      tinyHashSet0.iterator();
      assertEquals(1, tinyHashSet0.size());
  }

  @Test
  public void test08()  throws Throwable  {
      Object object0 = new Object();
      TinyHashSet tinyHashSet0 = new TinyHashSet();
      TinyHashSet.SingleElementIterator tinyHashSet_SingleElementIterator0 = new TinyHashSet.SingleElementIterator(object0, tinyHashSet0);
      tinyHashSet0.add(object0);
      tinyHashSet0.add(tinyHashSet_SingleElementIterator0);
      tinyHashSet0.copy();
      assertEquals(2, tinyHashSet0.size());
  }

  @Test
  public void test09()  throws Throwable  {
      TinyHashSet tinyHashSet0 = new TinyHashSet();
      tinyHashSet0.add(tinyHashSet0);
      tinyHashSet0.copy();
      assertEquals(1, tinyHashSet0.size());
  }

  @Test
  public void test10()  throws Throwable  {
      TinyHashSet tinyHashSet0 = new TinyHashSet();
      tinyHashSet0.add(tinyHashSet0);
      tinyHashSet0.add(tinyHashSet0);
      tinyHashSet0.add(tinyHashSet0);
      assertEquals(1, tinyHashSet0.size());
  }

  @Test
  public void test11()  throws Throwable  {
      TinyHashSet tinyHashSet0 = new TinyHashSet();
      tinyHashSet0.add(tinyHashSet0);
      tinyHashSet0.add(tinyHashSet0);
      tinyHashSet0.remove(tinyHashSet0);
      assertEquals(0, tinyHashSet0.size());
  }

  @Test
  public void test12()  throws Throwable  {
      TinyHashSet tinyHashSet0 = new TinyHashSet();
      Integer integer0 = new Integer(1);
      tinyHashSet0.add(integer0);
      Integer integer1 = new Integer(1);
      boolean boolean0 = tinyHashSet0.remove(integer1);
      assertEquals(0, tinyHashSet0.size());
      assertTrue(boolean0);
  }

  @Test
  public void test13()  throws Throwable  {
      TinyHashSet tinyHashSet0 = new TinyHashSet();
      Set set0 = tinyHashSet0.copy();
      tinyHashSet0.add(tinyHashSet0);
      TinyHashSet.SingleElementIterator tinyHashSet_SingleElementIterator0 = new TinyHashSet.SingleElementIterator(tinyHashSet0, tinyHashSet0);
      boolean boolean0 = tinyHashSet_SingleElementIterator0.theSet.remove(set0);
      assertEquals(1, tinyHashSet0.size());
      assertFalse(boolean0);
  }

  @Test
  public void test14()  throws Throwable  {
      TinyHashSet tinyHashSet0 = new TinyHashSet();
      boolean boolean0 = tinyHashSet0.remove(tinyHashSet0);
      assertFalse(boolean0);
  }

  @Test
  public void test15()  throws Throwable  {
      Object object0 = new Object();
      TinyHashSet tinyHashSet0 = new TinyHashSet();
      TinyHashSet.SingleElementIterator tinyHashSet_SingleElementIterator0 = new TinyHashSet.SingleElementIterator(object0, tinyHashSet0);
      tinyHashSet0.add(object0);
      tinyHashSet0.add(tinyHashSet_SingleElementIterator0);
      int int0 = tinyHashSet0.size();
      assertEquals(2, int0);
  }

  @Test
  public void test16()  throws Throwable  {
      TinyHashSet tinyHashSet0 = new TinyHashSet();
      tinyHashSet0.add(tinyHashSet0);
      TinyHashSet.SingleElementIterator tinyHashSet_SingleElementIterator0 = new TinyHashSet.SingleElementIterator(tinyHashSet0, tinyHashSet0);
      int int0 = tinyHashSet_SingleElementIterator0.theSet.size();
      assertEquals(1, int0);
  }

  @Test
  public void test17()  throws Throwable  {
      TinyHashSet tinyHashSet0 = new TinyHashSet();
      int int0 = tinyHashSet0.size();
      assertEquals(0, int0);
  }
}
