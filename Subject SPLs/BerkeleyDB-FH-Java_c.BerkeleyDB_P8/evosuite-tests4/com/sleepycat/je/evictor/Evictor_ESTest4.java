/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 14:39:01 KST 2017
 */

package com.sleepycat.je.evictor;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.sleepycat.je.EnvironmentConfig;
import com.sleepycat.je.dbi.EnvironmentImpl;
import com.sleepycat.je.evictor.Evictor;
import com.sleepycat.je.tree.DBIN;
import java.io.File;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class Evictor_ESTest4 extends Evictor_ESTest_scaffolding4 {

  @Test
  public void test00()  throws Throwable  {
      String string0 = "";
      File file0 = null;
      EnvironmentConfig environmentConfig0 = new EnvironmentConfig();
      EnvironmentImpl environmentImpl0 = null;
      try {
        environmentImpl0 = new EnvironmentImpl(file0, environmentConfig0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.FileManager", e);
      }
  }

  @Test
  public void test01()  throws Throwable  {
      Evictor.Evictor_isRunnable evictor_Evictor_isRunnable0 = new Evictor.Evictor_isRunnable((Evictor) null, "");
      // Undeclared exception!
      try { 
        evictor_Evictor_isRunnable0.hook388();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.evictor.Evictor$Evictor_isRunnable", e);
      }
  }

  @Test
  public void test02()  throws Throwable  {
      Evictor.Evictor_isRunnable evictor_Evictor_isRunnable0 = new Evictor.Evictor_isRunnable((Evictor) null, "");
      // Undeclared exception!
      try { 
        evictor_Evictor_isRunnable0.execute();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.evictor.Evictor", e);
      }
  }

  @Test
  public void test04()  throws Throwable  {
      Evictor evictor0 = null;
      try {
        evictor0 = new Evictor((EnvironmentImpl) null, "N<T4E8e)i");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.evictor.Evictor", e);
      }
  }


  @Test
  public void test06()  throws Throwable  {
      Evictor.EvictProfile evictor_EvictProfile0 = new Evictor.EvictProfile();
      List list0 = evictor_EvictProfile0.getCandidates();
      assertTrue(list0.isEmpty());
  }


  @Test
  public void test10()  throws Throwable  {
      Evictor.Evictor_evictBatch evictor_Evictor_evictBatch0 = new Evictor.Evictor_evictBatch((Evictor) null, "critical", (-1884L));
      // Undeclared exception!
      try { 
        evictor_Evictor_evictBatch0.hook377();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.evictor.Evictor$Evictor_evictBatch", e);
      }
  }

  @Test
  public void test11()  throws Throwable  {
      Evictor.Evictor_evictBatch evictor_Evictor_evictBatch0 = new Evictor.Evictor_evictBatch((Evictor) null, "m", 19L);
      // Undeclared exception!
      try { 
        evictor_Evictor_evictBatch0.hook376();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.evictor.Evictor$Evictor_evictBatch", e);
      }
  }

  @Test
  public void test12()  throws Throwable  {
      Evictor.Evictor_evictBatch evictor_Evictor_evictBatch0 = new Evictor.Evictor_evictBatch((Evictor) null, "G^G){++ ", 1483L);
      // Undeclared exception!
      try { 
        evictor_Evictor_evictBatch0.execute();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.evictor.Evictor", e);
      }
  }

  
}
