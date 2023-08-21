/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 14:30:25 KST 2017
 */

package com.sleepycat.je.dbi;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.sleepycat.je.dbi.EnvironmentImpl;
import com.sleepycat.je.dbi.INList;
import com.sleepycat.je.latch.LatchNotHeldException;
import com.sleepycat.je.tree.DBIN;
import com.sleepycat.je.tree.DIN;
import com.sleepycat.je.tree.IN;
import com.sleepycat.je.tree.Tree;
import java.util.SortedSet;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class INList_ESTest4 extends INList_ESTest_scaffolding4 {

  @Test
  public void test00()  throws Throwable  {
      INList iNList0 = new INList((EnvironmentImpl) null);
      IN iN0 = null;
      // Undeclared exception!
      try { 
        iNList0.latchMajor();
       //  fail("Expecting exception: AssertionError");
       // Unstable assertion
      } catch(AssertionError e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.dbi.INList", e);
      }
  }






  @Test
  public void test06()  throws Throwable  {
      INList iNList0 = new INList((EnvironmentImpl) null);
      Tree tree0 = new Tree();
      tree0.getRootIN(false);
      iNList0.hook341((IN) null, false);
      iNList0.dump();
      // Undeclared exception!
      try { 
        iNList0.latchMajor();
       //  fail("Expecting exception: AssertionError");
       // Unstable assertion
      } catch(AssertionError e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.dbi.INList", e);
      }
  }



  @Test
  public void test09()  throws Throwable  {
      INList.INList_add iNList_INList_add0 = new INList.INList_add((INList) null, (IN) null);
      iNList_INList_add0.enteredWithLatchHeld = true;
      // Undeclared exception!
      try { 
        iNList_INList_add0.hook343();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.dbi.INList", e);
      }
  }





  @Test
  public void test18()  throws Throwable  {
      INList iNList0 = new INList((EnvironmentImpl) null);
      DIN dIN0 = new DIN();
      // Undeclared exception!
      try { 
        iNList0.add(dIN0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.dbi.INList$INList_addAndSetMemory", e);
      }
  }


  @Test
  public void test20()  throws Throwable  {
      INList iNList0 = new INList((EnvironmentImpl) null);
      DBIN dBIN0 = new DBIN();
      INList.INList_add iNList_INList_add0 = new INList.INList_add(iNList0, dBIN0);
      // Undeclared exception!
      try { 
        iNList_INList_add0.hook343();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.dbi.INList$INList_addAndSetMemory", e);
      }
  }
}