/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 21 20:13:51 KST 2017
 */

package com.sleepycat.je.dbi;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.SortedSet;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.sleepycat.je.tree.ChildReference;
import com.sleepycat.je.tree.DBIN;
import com.sleepycat.je.tree.DIN;
import com.sleepycat.je.tree.DupCountLN;
import com.sleepycat.je.tree.IN;
import com.sleepycat.je.tree.Tree;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class INList_ESTest7 extends INList_ESTest_scaffolding7 {

  @Test
  public void test00()  throws Throwable  {
      INList iNList0 = new INList((EnvironmentImpl) null);
      boolean boolean0 = iNList0.hook341((IN) null, false);
      assertFalse(boolean0);
  }

  @Test
  public void test01()  throws Throwable  {
      INList iNList0 = new INList((EnvironmentImpl) null);
      DBIN dBIN0 = new DBIN();
      iNList0.add(dBIN0);
      int int0 = iNList0.getSize();
      assertEquals(1, int0);
  }

  @Test
  public void test02()  throws Throwable  {
      INList iNList0 = new INList((EnvironmentImpl) null);
      DIN dIN0 = new DIN();
      iNList0.add(dIN0);
      DIN dIN1 = (DIN)iNList0.first();
      assertTrue(dIN1.needsSplitting());
  }

  @Test
  public void test03()  throws Throwable  {
      INList iNList0 = new INList((EnvironmentImpl) null);
      DBIN dBIN0 = new DBIN();
      SortedSet sortedSet0 = iNList0.tailSet(dBIN0);
      assertEquals(0, sortedSet0.size());
  }

  @Test
  public void test04()  throws Throwable  {
      INList iNList0 = new INList((EnvironmentImpl) null);
      DBIN dBIN0 = new DBIN();
      iNList0.add(dBIN0);
      DBIN dBIN1 = (DBIN)iNList0.first();
      assertSame(dBIN1, dBIN0);
  }

  @Test
  public void test05()  throws Throwable  {
      INList iNList0 = new INList((EnvironmentImpl) null);
      iNList0.hook346((IN) null);
  }

  @Test
  public void test06()  throws Throwable  {
      INList iNList0 = new INList((EnvironmentImpl) null);
      iNList0.hook342();
  }

  @Test
  public void test07()  throws Throwable  {
      INList iNList0 = new INList((EnvironmentImpl) null);
      boolean boolean0 = iNList0.hook341((IN) null, true);
      assertTrue(boolean0);
  }

  @Test
  public void test08()  throws Throwable  {
      INList iNList0 = new INList((EnvironmentImpl) null);
      iNList0.hook338((EnvironmentImpl) null);
  }

  @Test
  public void test09()  throws Throwable  {
      INList iNList0 = new INList((EnvironmentImpl) null);
      // Undeclared exception!
      try { 
        iNList0.removeLatchAlreadyHeld((IN) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.util.TreeMap", e);
      }
  }

  @Test
  public void test10()  throws Throwable  {
      INList iNList0 = new INList((EnvironmentImpl) null);
      // Undeclared exception!
      try { 
        iNList0.remove((IN) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.util.TreeMap", e);
      }
  }

  @Test
  public void test11()  throws Throwable  {
      INList iNList0 = new INList((EnvironmentImpl) null);
      DBIN dBIN0 = new DBIN();
      iNList0.add(dBIN0);
      // Undeclared exception!
      try { 
        iNList0.dump();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.dbi.INList", e);
      }
  }

  @Test
  public void test12()  throws Throwable  {
      INList iNList0 = new INList((EnvironmentImpl) null);
      // Undeclared exception!
      try { 
        iNList0.add((IN) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test14()  throws Throwable  {
      INList iNList0 = null;
      try {
        iNList0 = new INList((INList) null, (EnvironmentImpl) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.dbi.INList", e);
      }
  }

  @Test
  public void test15()  throws Throwable  {
      INList iNList0 = new INList((EnvironmentImpl) null);
      DBIN dBIN0 = new DBIN();
      iNList0.add(dBIN0);
      iNList0.removeLatchAlreadyHeld(dBIN0);
      assertFalse(dBIN0.getDirty());
  }

  @Test
  public void test16()  throws Throwable  {
      INList iNList0 = new INList((EnvironmentImpl) null);
      int int0 = iNList0.getSize();
      assertEquals(0, int0);
  }

  @Test
  public void test17()  throws Throwable  {
      DatabaseImpl databaseImpl0 = new DatabaseImpl();
      INList iNList0 = new INList((EnvironmentImpl) null);
      byte[] byteArray0 = new byte[6];
      DupCountLN dupCountLN0 = new DupCountLN();
      Tree tree0 = databaseImpl0.getTree();
      ChildReference childReference0 = tree0.makeRootChildReference(dupCountLN0, byteArray0, 0L);
      DIN dIN0 = new DIN(databaseImpl0, byteArray0, 1622, byteArray0, childReference0, 1096);
      iNList0.add(dIN0);
      iNList0.dump();
  }

  @Test
  public void test19()  throws Throwable  {
      INList iNList0 = new INList((EnvironmentImpl) null);
      INList iNList1 = new INList(iNList0, (EnvironmentImpl) null);
      assertFalse(iNList1.equals((Object)iNList0));
  }

  @Test
  public void test20()  throws Throwable  {
      INList iNList0 = new INList((EnvironmentImpl) null);
      iNList0.clear();
  }

  @Test
  public void test21()  throws Throwable  {
      INList iNList0 = new INList((EnvironmentImpl) null);
      iNList0.hook339((EnvironmentImpl) null);
  }

  @Test
  public void test22()  throws Throwable  {
      INList iNList0 = new INList((EnvironmentImpl) null);
      // Undeclared exception!
      try { 
        iNList0.tailSet((IN) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.util.TreeMap", e);
      }
  }

  @Test
  public void test23()  throws Throwable  {
      INList iNList0 = new INList((EnvironmentImpl) null);
      iNList0.hook340();
  }

  @Test
  public void test24()  throws Throwable  {
      INList iNList0 = new INList((EnvironmentImpl) null);
      // Undeclared exception!
      try { 
        iNList0.first();
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.util.TreeMap", e);
      }
  }

  @Test
  public void test25()  throws Throwable  {
      INList iNList0 = new INList((EnvironmentImpl) null);
      Iterator iterator0 = iNList0.iterator();
      assertNotNull(iterator0);
  }

  @Test
  public void test26()  throws Throwable  {
      INList iNList0 = new INList((EnvironmentImpl) null);
      SortedSet sortedSet0 = iNList0.getINs();
      assertEquals(0, sortedSet0.size());
  }

  
}
