/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 08:38:29 KST 2017
 */

package com.sleepycat.je.evictor;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.sleepycat.je.EnvironmentConfig;
import com.sleepycat.je.dbi.EnvironmentImpl;
import com.sleepycat.je.evictor.Evictor;
import com.sleepycat.je.tree.DIN;
import java.io.File;
import java.util.List;
import java.util.Properties;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class Evictor_ESTest5 extends Evictor_ESTest_scaffolding5 {

  @Test
  public void test00()  throws Throwable  {
      Evictor evictor0 = null;
      Evictor.Evictor_evictBatch evictor_Evictor_evictBatch0 = new Evictor.Evictor_evictBatch((Evictor) null, (String) null, (-1165L));
      String string0 = null;
      try {  
      string0 = evictor_Evictor_evictBatch0.source;
      } catch(NullPointerException e) {}
  }

  @Test
  public void test01()  throws Throwable  {
      String string0 = "";
      File file0 = null;
      Properties properties0 = null;
      EnvironmentConfig environmentConfig0 = null;
      try {
        environmentConfig0 = new EnvironmentConfig(properties0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.EnvironmentMutableConfig", e);
      }
  }

  @Test
  public void test02()  throws Throwable  {
      Evictor evictor0 = null;
      String string0 = null;
      Evictor.Evictor_evictBatch evictor_Evictor_evictBatch0 = new Evictor.Evictor_evictBatch((Evictor) null, (String) null, (-1165L));
      String string1 = null;
      try {  
      string1 = evictor_Evictor_evictBatch0.source;
      } catch(NullPointerException e) {}
  }

  @Test
  public void test03()  throws Throwable  {
      Evictor.Evictor_isRunnable evictor_Evictor_isRunnable0 = new Evictor.Evictor_isRunnable((Evictor) null, "O`~![@)GeEV=!<");
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
  public void test06()  throws Throwable  {
      Evictor.Evictor_isRunnable evictor_Evictor_isRunnable0 = new Evictor.Evictor_isRunnable((Evictor) null, "9)");
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
  public void test08()  throws Throwable  {
      Evictor evictor0 = null;
      try {
        evictor0 = new Evictor((EnvironmentImpl) null, ",");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.evictor.Evictor", e);
      }
  }


  @Test
  public void test10()  throws Throwable  {
      DIN dIN0 = new DIN();
      Evictor.EvictProfile evictor_EvictProfile0 = new Evictor.EvictProfile();
      boolean boolean0 = evictor_EvictProfile0.count(dIN0);
      assertTrue(boolean0);
  }


  @Test
  public void test12()  throws Throwable  {
      Evictor.Evictor_evictBatch evictor_Evictor_evictBatch0 = new Evictor.Evictor_evictBatch((Evictor) null, (String) null, (-2146L));
      // Undeclared exception!
      try { 
        evictor_Evictor_evictBatch0.hook381();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.evictor.Evictor", e);
      }
  }

  @Test
  public void test13()  throws Throwable  {
      Evictor.Evictor_evictBatch evictor_Evictor_evictBatch0 = new Evictor.Evictor_evictBatch((Evictor) null, "nCleanerEntriesRead=", 0L);
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
  public void test16()  throws Throwable  {
      Evictor.Evictor_evictBatch evictor_Evictor_evictBatch0 = new Evictor.Evictor_evictBatch((Evictor) null, "", (-528L));
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
  public void test17()  throws Throwable  {
      Evictor.Evictor_evictBatch evictor_Evictor_evictBatch0 = new Evictor.Evictor_evictBatch((Evictor) null, "", (-1169L));
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
  public void test18()  throws Throwable  {
      Evictor.Evictor_evictBatch evictor_Evictor_evictBatch0 = new Evictor.Evictor_evictBatch((Evictor) null, (String) null, 1L);
      // Undeclared exception!
      try { 
        evictor_Evictor_evictBatch0.hook382();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.evictor.Evictor", e);
      }
  }
}