/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 10:31:05 KST 2017
 */

package com.sleepycat.je.dbi;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.SortedSet;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.sleepycat.je.latch.LatchNotHeldException;
import com.sleepycat.je.tree.DBIN;
import com.sleepycat.je.tree.IN;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class INList_ESTest9 extends INList_ESTest_scaffolding9 {

  @Test
  public void test00()  throws Throwable  {
      INList iNList0 = new INList((EnvironmentImpl) null);
      DBIN dBIN0 = new DBIN();
      // Undeclared exception!
      try { 
        iNList0.hook346(dBIN0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.dbi.INList", e);
      }
  }








  @Test
  public void test10()  throws Throwable  {
      DBIN dBIN0 = new DBIN();
      INList.INList_add iNList_INList_add0 = new INList.INList_add((INList) null, dBIN0);
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









}