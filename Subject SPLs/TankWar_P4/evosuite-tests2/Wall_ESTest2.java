/*
 * This file was automatically generated by EvoSuite
 * Sun Oct 02 20:56:20 KST 2016
 */


import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import static org.junit.Assert.fail;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class Wall_ESTest2   {
@BeforeClass
public static void initEvoSuiteFramework() {
}
@AfterClass
public static void exitEvoSuiteFramework() {
}

  @Test
  public void test0()  throws Throwable  {
      Wall wall0 = null;
      try {
        wall0 = new Wall((TankManager) null, (-1715), 134, 134, 73, 73);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("Wall$$TankWar", e);
      }
  }

  @Test
  public void test1()  throws Throwable  {
      Wall wall0 = null;
      try {
        wall0 = new Wall((TankManager) null, (-828), 0, 134, 62, (-1));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("Wall$$TankWar", e);
      }
  }
}
