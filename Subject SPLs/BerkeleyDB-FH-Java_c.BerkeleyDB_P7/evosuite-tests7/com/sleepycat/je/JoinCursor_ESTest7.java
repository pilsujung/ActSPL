/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 21 19:21:40 KST 2017
 */

package com.sleepycat.je;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.fail;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.sleepycat.je.txn.Locker;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class JoinCursor_ESTest7 extends JoinCursor_ESTest_scaffolding7 {

  @Test
  public void test0()  throws Throwable  {
      Cursor[] cursorArray0 = new Cursor[9];
      LockMode lockMode0 = null;
      JoinCursor joinCursor0 = null;
      try {
        joinCursor0 = new JoinCursor((Locker) null, (Database) null, cursorArray0, (JoinConfig) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.JoinCursor", e);
      }
  }

  @Test
  public void test1()  throws Throwable  {
      Cursor[] cursorArray0 = new Cursor[0];
      JoinConfig joinConfig0 = new JoinConfig();
      JoinCursor joinCursor0 = null;
      try {
        joinCursor0 = new JoinCursor((Locker) null, (Database) null, cursorArray0, joinConfig0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.Cursor", e);
      }
  }
}
