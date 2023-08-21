/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 21 18:45:14 KST 2017
 */

package com.sleepycat.je;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.fail;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.sleepycat.je.txn.Txn;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class JoinCursor_ESTest1 extends JoinCursor_ESTest_scaffolding1 {

  @Test
  public void test0()  throws Throwable  {
      Txn txn0 = new Txn();
      Cursor[] cursorArray0 = new Cursor[2];
      JoinConfig joinConfig0 = new JoinConfig();
      JoinCursor joinCursor0 = null;
      try {
        joinCursor0 = new JoinCursor(txn0, (Database) null, cursorArray0, joinConfig0);
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
      Txn txn0 = new Txn();
      Cursor[] cursorArray0 = new Cursor[0];
      JoinCursor joinCursor0 = null;
      try {
        joinCursor0 = new JoinCursor(txn0, (Database) null, cursorArray0, (JoinConfig) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.Cursor", e);
      }
  }
}
