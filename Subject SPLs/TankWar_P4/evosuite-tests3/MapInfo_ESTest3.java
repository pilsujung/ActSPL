/*
 * This file was automatically generated by EvoSuite
 * Sun Oct 02 21:01:47 KST 2016
 */


import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.fail;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class MapInfo_ESTest3   {
@BeforeClass
public static void initEvoSuiteFramework() {
}
@AfterClass
public static void exitEvoSuiteFramework() {
}




  @Test
  public void test3()  throws Throwable  {
      MapInfo mapInfo0 = new MapInfo((TankManager) null, 165);
      assertFalse(mapInfo0.read);
  }
}