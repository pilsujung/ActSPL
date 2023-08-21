/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 01:34:03 KST 2017
 */

package com.sleepycat.je.recovery;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.sleepycat.je.CheckpointConfig;
import com.sleepycat.je.EnvironmentConfig;
import com.sleepycat.je.dbi.DatabaseImpl;
import com.sleepycat.je.dbi.DbConfigManager;
import com.sleepycat.je.dbi.EnvironmentImpl;

import de.ovgu.cide.jakutil.ReturnBoolean;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class Checkpointer_ESTest6 extends Checkpointer_ESTest_scaffolding6 {

  @Test
  public void test01()  throws Throwable  {
      CheckpointConfig checkpointConfig0 = CheckpointConfig.DEFAULT;
      Checkpointer.Checkpointer_doCheckpoint checkpointer_Checkpointer_doCheckpoint0 = new Checkpointer.Checkpointer_doCheckpoint((Checkpointer) null, checkpointConfig0, false, "k|5rk%LQ7uN;F_T3V");
      checkpointer_Checkpointer_doCheckpoint0.firstActiveLsn = (-1775L);
      // Undeclared exception!
      try { 
        checkpointer_Checkpointer_doCheckpoint0.hook536();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.recovery.Checkpointer", e);
      }
  }

  @Test
  public void test03()  throws Throwable  {
      CheckpointConfig checkpointConfig0 = CheckpointConfig.DEFAULT;
      Checkpointer.Checkpointer_isRunnable checkpointer_Checkpointer_isRunnable0 = new Checkpointer.Checkpointer_isRunnable((Checkpointer) null, checkpointConfig0);
      checkpointer_Checkpointer_isRunnable0.useTimeInterval = 843L;
      // Undeclared exception!
      try { 
        checkpointer_Checkpointer_isRunnable0.hook542();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.recovery.Checkpointer", e);
      }
  }

  @Test
  public void test05()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = new EnvironmentConfig();
      DbConfigManager dbConfigManager0 = new DbConfigManager(environmentConfig0);
      Checkpointer.Checkpointer_getWakeupPeriod checkpointer_Checkpointer_getWakeupPeriod0 = new Checkpointer.Checkpointer_getWakeupPeriod(dbConfigManager0);
      checkpointer_Checkpointer_getWakeupPeriod0.wakeupPeriod = (-4254L);
      checkpointer_Checkpointer_getWakeupPeriod0.hook540();
  }

  @Test
  public void test06()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = new EnvironmentConfig();
      DbConfigManager dbConfigManager0 = new DbConfigManager(environmentConfig0);
      Checkpointer.Checkpointer_getWakeupPeriod checkpointer_Checkpointer_getWakeupPeriod0 = new Checkpointer.Checkpointer_getWakeupPeriod(dbConfigManager0);
      checkpointer_Checkpointer_getWakeupPeriod0.bytePeriod = 999L;
      long long0 = checkpointer_Checkpointer_getWakeupPeriod0.execute();
      assertEquals(0L, long0);
  }

  @Test
  public void test07()  throws Throwable  {
      DatabaseImpl databaseImpl0 = new DatabaseImpl();
      byte[] byteArray0 = new byte[9];
      byte[] byteArray1 = new byte[6];
      Checkpointer.CheckpointReference checkpointer_CheckpointReference0 = new Checkpointer.CheckpointReference(databaseImpl0, (-179940000L), true, true, byteArray0, byteArray1);
      //  // Unstable assertion: assertEquals(1L, databaseImpl0.getEofNodeId());
  }

  @Test
  public void test08()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      Checkpointer.CheckpointReference checkpointer_CheckpointReference0 = new Checkpointer.CheckpointReference((DatabaseImpl) null, 1024L, false, true, byteArray0, byteArray0);
  }

  @Test
  public void test09()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = new EnvironmentConfig();
      DbConfigManager dbConfigManager0 = new DbConfigManager(environmentConfig0);
      long long0 = Checkpointer.getWakeupPeriod(dbConfigManager0);
      assertEquals(0L, long0);
  }

  @Test
  public void test10()  throws Throwable  {
      String string0 = "";
      Checkpointer checkpointer0 = null;
      try {
        checkpointer0 = new Checkpointer((EnvironmentImpl) null, (-1423L), ": source=");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.recovery.Checkpointer", e);
      }
  }

  @Test
  public void test11()  throws Throwable  {
      EnvironmentImpl environmentImpl0 = null;
      Checkpointer checkpointer0 = null;
      try {
        checkpointer0 = new Checkpointer((EnvironmentImpl) null, (-1423L), ": source=");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.recovery.Checkpointer", e);
      }
  }

  @Test
  public void test12()  throws Throwable  {
      CheckpointConfig checkpointConfig0 = CheckpointConfig.DEFAULT;
      Checkpointer.Checkpointer_doCheckpoint checkpointer_Checkpointer_doCheckpoint0 = new Checkpointer.Checkpointer_doCheckpoint((Checkpointer) null, checkpointConfig0, false, "");
      // Undeclared exception!
      try { 
        checkpointer_Checkpointer_doCheckpoint0.execute();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.recovery.Checkpointer", e);
      }
  }

  @Test
  public void test13()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte) (-117);
      byteArray0[1] = (byte) (-46);
      byteArray0[2] = (byte)20;
      byteArray0[3] = (byte) (-127);
      Checkpointer.CheckpointReference checkpointer_CheckpointReference0 = new Checkpointer.CheckpointReference((DatabaseImpl) null, 833L, true, true, byteArray0, byteArray0);
      checkpointer_CheckpointReference0.mainTreeKey = byteArray0;
      checkpointer_CheckpointReference0.equals(byteArray0);
      CheckpointConfig checkpointConfig0 = CheckpointConfig.DEFAULT;
      Checkpointer.Checkpointer_isRunnable checkpointer_Checkpointer_isRunnable0 = new Checkpointer.Checkpointer_isRunnable((Checkpointer) null, checkpointConfig0);
      // Undeclared exception!
      try { 
        checkpointer_Checkpointer_isRunnable0.execute();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.recovery.Checkpointer", e);
      }
  }

  @Test
  public void test14()  throws Throwable  {
      Checkpointer checkpointer0 = null;
      try {
        checkpointer0 = new Checkpointer((EnvironmentImpl) null, (-1423L), ": source=");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.recovery.Checkpointer", e);
      }
  }

  @Test
  public void test17()  throws Throwable  {
      Checkpointer.Checkpointer_selectDirtyINs checkpointer_Checkpointer_selectDirtyINs0 = new Checkpointer.Checkpointer_selectDirtyINs((Checkpointer) null, true, true);
      // Undeclared exception!
      try { 
        checkpointer_Checkpointer_selectDirtyINs0.hook528();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.recovery.Checkpointer$Checkpointer_selectDirtyINs", e);
      }
  }

  @Test
  public void test18()  throws Throwable  {
      Checkpointer.Checkpointer_selectDirtyINs checkpointer_Checkpointer_selectDirtyINs0 = new Checkpointer.Checkpointer_selectDirtyINs((Checkpointer) null, true, true);
      // Undeclared exception!
      try { 
        checkpointer_Checkpointer_selectDirtyINs0.hook530();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.recovery.Checkpointer$Checkpointer_selectDirtyINs", e);
      }
  }

  @Test
  public void test19()  throws Throwable  {
      Checkpointer.Checkpointer_selectDirtyINs checkpointer_Checkpointer_selectDirtyINs0 = new Checkpointer.Checkpointer_selectDirtyINs((Checkpointer) null, true, true);
      // Undeclared exception!
      try { 
        checkpointer_Checkpointer_selectDirtyINs0.execute();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.recovery.Checkpointer", e);
      }
  }

  @Test
  public void test21()  throws Throwable  {
      // Undeclared exception!
      try { 
        Checkpointer.getWakeupPeriod((DbConfigManager) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.recovery.Checkpointer$Checkpointer_getWakeupPeriod", e);
      }
  }

  @Test
  public void test23()  throws Throwable  {
      CheckpointConfig checkpointConfig0 = CheckpointConfig.DEFAULT;
      Checkpointer.Checkpointer_isRunnable checkpointer_Checkpointer_isRunnable0 = new Checkpointer.Checkpointer_isRunnable((Checkpointer) null, checkpointConfig0);
      // Undeclared exception!
      try { 
        checkpointer_Checkpointer_isRunnable0.hook542();
        fail("Expecting exception: ReturnBoolean");
      
      } catch(ReturnBoolean e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.recovery.Checkpointer$Checkpointer_isRunnable", e);
      }
  }

  @Test
  public void test24()  throws Throwable  {
      CheckpointConfig checkpointConfig0 = new CheckpointConfig();
      Checkpointer.Checkpointer_isRunnable checkpointer_Checkpointer_isRunnable0 = new Checkpointer.Checkpointer_isRunnable((Checkpointer) null, checkpointConfig0);
      // Undeclared exception!
      try { 
        checkpointer_Checkpointer_isRunnable0.execute();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.recovery.Checkpointer", e);
      }
  }

  @Test
  public void test25()  throws Throwable  {
      CheckpointConfig checkpointConfig0 = new CheckpointConfig();
      Checkpointer.Checkpointer_doCheckpoint checkpointer_Checkpointer_doCheckpoint0 = new Checkpointer.Checkpointer_doCheckpoint((Checkpointer) null, checkpointConfig0, false, "hyvbB(L+%%aFX&5|");
      // Undeclared exception!
      try { 
        checkpointer_Checkpointer_doCheckpoint0.hook525();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.recovery.Checkpointer", e);
      }
  }

  @Test
  public void test27()  throws Throwable  {
      CheckpointConfig checkpointConfig0 = CheckpointConfig.DEFAULT;
      Checkpointer.Checkpointer_doCheckpoint checkpointer_Checkpointer_doCheckpoint0 = new Checkpointer.Checkpointer_doCheckpoint((Checkpointer) null, checkpointConfig0, false, "Vk|5rk%LQ7uN;F_T3V");
      checkpointer_Checkpointer_doCheckpoint0.hook522();
  }

  @Test
  public void test28()  throws Throwable  {
      CheckpointConfig checkpointConfig0 = CheckpointConfig.DEFAULT;
      Checkpointer.Checkpointer_doCheckpoint checkpointer_Checkpointer_doCheckpoint0 = new Checkpointer.Checkpointer_doCheckpoint((Checkpointer) null, checkpointConfig0, true, "<7=%|#QJ8");
      // Undeclared exception!
      try { 
        checkpointer_Checkpointer_doCheckpoint0.hook534();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.recovery.Checkpointer", e);
      }
  }

  @Test
  public void test29()  throws Throwable  {
      CheckpointConfig checkpointConfig0 = new CheckpointConfig();
      Checkpointer.Checkpointer_doCheckpoint checkpointer_Checkpointer_doCheckpoint0 = new Checkpointer.Checkpointer_doCheckpoint((Checkpointer) null, checkpointConfig0, false, "lWG");
      // Undeclared exception!
      try { 
        checkpointer_Checkpointer_doCheckpoint0.hook535();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.recovery.Checkpointer", e);
      }
  }

  @Test
  public void test30()  throws Throwable  {
      CheckpointConfig checkpointConfig0 = CheckpointConfig.DEFAULT;
      Checkpointer.Checkpointer_doCheckpoint checkpointer_Checkpointer_doCheckpoint0 = new Checkpointer.Checkpointer_doCheckpoint((Checkpointer) null, checkpointConfig0, true, (String) null);
      checkpointer_Checkpointer_doCheckpoint0.hook548();
  }

  @Test
  public void test32()  throws Throwable  {
      CheckpointConfig checkpointConfig0 = CheckpointConfig.DEFAULT;
      Checkpointer.Checkpointer_doCheckpoint checkpointer_Checkpointer_doCheckpoint0 = new Checkpointer.Checkpointer_doCheckpoint((Checkpointer) null, checkpointConfig0, false, "k|5rk%LQ7uN;F_T3V");
      checkpointer_Checkpointer_doCheckpoint0.hook551();
  }

  
}
