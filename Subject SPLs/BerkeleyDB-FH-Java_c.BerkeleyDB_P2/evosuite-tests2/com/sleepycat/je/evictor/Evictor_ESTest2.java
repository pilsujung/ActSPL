/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 00:34:40 KST 2017
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
public class Evictor_ESTest2 extends Evictor_ESTest_scaffolding2 {

  @Test
  public void test00()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = new EnvironmentConfig();
      EnvironmentImpl environmentImpl0 = null;
      try {
        environmentImpl0 = new EnvironmentImpl((File) null, environmentConfig0);
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
      Evictor.Evictor_isRunnable evictor_Evictor_isRunnable0 = new Evictor.Evictor_isRunnable((Evictor) null, (String) null);
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
      Evictor.Evictor_evictBatch evictor_Evictor_evictBatch0 = new Evictor.Evictor_evictBatch((Evictor) null, ":F", (-1607L));
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

  @Test
  public void test03()  throws Throwable  {
      Evictor.Evictor_doCriticalEviction evictor_Evictor_doCriticalEviction0 = new Evictor.Evictor_doCriticalEviction((Evictor) null);
      // Undeclared exception!
      try { 
        evictor_Evictor_doCriticalEviction0.execute();
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
      Evictor.Evictor_isRunnable evictor_Evictor_isRunnable0 = new Evictor.Evictor_isRunnable((Evictor) null, (String) null);
      evictor_Evictor_isRunnable0.hook372();
  }

  @Test
  public void test05()  throws Throwable  {
      Evictor.Evictor_isRunnable evictor_Evictor_isRunnable0 = new Evictor.Evictor_isRunnable((Evictor) null, "|");
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
  public void test06()  throws Throwable  {
      Evictor evictor0 = null;
      try {
        evictor0 = new Evictor((EnvironmentImpl) null, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.evictor.Evictor", e);
      }
  }

  @Test
  public void test07()  throws Throwable  {
      Evictor.EvictProfile evictor_EvictProfile0 = new Evictor.EvictProfile();
      boolean boolean0 = evictor_EvictProfile0.clear();
      assertTrue(boolean0);
  }

  @Test
  public void test08()  throws Throwable  {
      Evictor.EvictProfile evictor_EvictProfile0 = new Evictor.EvictProfile();
      List list0 = evictor_EvictProfile0.getCandidates();
      assertEquals(0, list0.size());
  }

  @Test
  public void test09()  throws Throwable  {
      Evictor.EvictProfile evictor_EvictProfile0 = new Evictor.EvictProfile();
      DBIN dBIN0 = new DBIN();
      boolean boolean0 = evictor_EvictProfile0.count(dBIN0);
      assertTrue(boolean0);
  }

  @Test
  public void test10()  throws Throwable  {
      Evictor.Evictor_evictBatch evictor_Evictor_evictBatch0 = new Evictor.Evictor_evictBatch((Evictor) null, "", 5000000L);
      evictor_Evictor_evictBatch0.hook371();
  }

  @Test
  public void test11()  throws Throwable  {
      Evictor.Evictor_evictBatch evictor_Evictor_evictBatch0 = new Evictor.Evictor_evictBatch((Evictor) null, " parent node=", 4999981L);
      evictor_Evictor_evictBatch0.hook381();
  }

  @Test
  public void test12()  throws Throwable  {
      Evictor.Evictor_evictBatch evictor_Evictor_evictBatch0 = new Evictor.Evictor_evictBatch((Evictor) null, "Za;,l|tTy#bJ^#R >Iz", (-1460L));
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
  public void test13()  throws Throwable  {
      Evictor.Evictor_evictBatch evictor_Evictor_evictBatch0 = new Evictor.Evictor_evictBatch((Evictor) null, "s_,+S1j;/+I03", 0);
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
  public void test14()  throws Throwable  {
      Evictor.Evictor_evictBatch evictor_Evictor_evictBatch0 = new Evictor.Evictor_evictBatch((Evictor) null, ":F", (-1607L));
      evictor_Evictor_evictBatch0.hook382();
  }
}
