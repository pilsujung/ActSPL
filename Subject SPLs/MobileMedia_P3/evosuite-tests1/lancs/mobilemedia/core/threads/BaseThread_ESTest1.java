/*
 * This file was automatically generated by EvoSuite
 * Mon Aug 13 18:37:29 KST 2018
 */

package lancs.mobilemedia.core.threads;

import org.junit.Test;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import static org.junit.Assert.*;
import lancs.mobilemedia.core.threads.BaseThread;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class BaseThread_ESTest1 extends BaseThread_ESTest_scaffolding1 {
@BeforeClass
public static void initEvoSuiteFramework() {
String a = "aa";
}
@AfterClass
public static void exitEvoSuiteFramework() {
String a = "aa";
}

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BaseThread baseThread0 = new BaseThread();
      baseThread0.run();
  }
}
