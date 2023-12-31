/*
 * This file was automatically generated by EvoSuite
 * Sun Oct 02 19:17:50 KST 2016
 */


import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import static org.junit.Assert.fail;

import java.awt.Graphics;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class Maler_ESTest1   {
@BeforeClass
public static void initEvoSuiteFramework() {
}
@AfterClass
public static void exitEvoSuiteFramework() {
}

  @Test
  public void test04()  throws Throwable  {
      Maler maler0 = new Maler((GameManager) null);
      // Undeclared exception!
      try { 
        maler0.gameWin();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("Maler$$PC", e);
      }
  }

  @Test
  public void test05()  throws Throwable  {
      Maler maler0 = new Maler((GameManager) null);
      // Undeclared exception!
      try { 
        maler0.gameLevel(0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("Maler$$PC", e);
      }
  }

  @Test
  public void test08()  throws Throwable  {
      Maler maler0 = new Maler((GameManager) null);
      // Undeclared exception!
      try { 
        maler0.print((Graphics) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("Maler$$PC", e);
      }
  }

  
}
