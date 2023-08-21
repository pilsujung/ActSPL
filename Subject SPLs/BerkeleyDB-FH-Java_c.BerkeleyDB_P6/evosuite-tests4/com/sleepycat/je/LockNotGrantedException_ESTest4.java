/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 13:46:36 KST 2017
 */

package com.sleepycat.je;

import org.junit.Test;
import static org.junit.Assert.*;
import com.sleepycat.je.LockNotGrantedException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class LockNotGrantedException_ESTest4 extends LockNotGrantedException_ESTest_scaffolding4 {

  @Test
  public void test0()  throws Throwable  {
      LockNotGrantedException lockNotGrantedException0 = new LockNotGrantedException();
      LockNotGrantedException lockNotGrantedException1 = new LockNotGrantedException((Throwable) lockNotGrantedException0);
      assertEquals("com.sleepycat.je.LockNotGrantedException: com.sleepycat.je.LockNotGrantedException", lockNotGrantedException1.toString());
  }

  @Test
  public void test1()  throws Throwable  {
      LockNotGrantedException lockNotGrantedException0 = new LockNotGrantedException((String) null);
      assertEquals("com.sleepycat.je.LockNotGrantedException", lockNotGrantedException0.toString());
  }

  @Test
  public void test2()  throws Throwable  {
      LockNotGrantedException lockNotGrantedException0 = new LockNotGrantedException();
      LockNotGrantedException lockNotGrantedException1 = new LockNotGrantedException((String) null, (Throwable) lockNotGrantedException0);
      assertFalse(lockNotGrantedException1.equals((Object)lockNotGrantedException0));
  }
}
