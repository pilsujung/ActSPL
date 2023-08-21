/*
 * This file was automatically generated by EvoSuite
 * Sun Oct 02 20:33:57 KST 2016
 */


import org.junit.Test;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class MalerZeit_ESTest1   {
@BeforeClass
public static void initEvoSuiteFramework() {
}
@AfterClass
public static void exitEvoSuiteFramework() {
}

  @Test
  public void test0()  throws Throwable  {
      MalerZeit malerZeit0 = new MalerZeit((GameManager) null);
      // Undeclared exception!
      try { 
        malerZeit0.run();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("MalerZeit", e);
      }
  }
}
