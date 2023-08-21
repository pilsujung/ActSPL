/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 13:53:01 KST 2017
 */

package com.sleepycat.je;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.sleepycat.je.Database;
import com.sleepycat.je.Environment;
import com.sleepycat.je.SecondaryConfig;
import com.sleepycat.je.SecondaryDatabase;
import java.util.logging.Level;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class SecondaryDatabase_ESTest4 extends SecondaryDatabase_ESTest_scaffolding4 {



  @Test
  public void test2()  throws Throwable  {
      Level level0 = Level.CONFIG;
      SecondaryDatabase.SecondaryDatabase_trace secondaryDatabase_SecondaryDatabase_trace0 = new SecondaryDatabase.SecondaryDatabase_trace((SecondaryDatabase) null, level0, "");
      // Undeclared exception!
      try { 
        secondaryDatabase_SecondaryDatabase_trace0.execute();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.SecondaryDatabase$SecondaryDatabase_trace", e);
      }
  }
}
