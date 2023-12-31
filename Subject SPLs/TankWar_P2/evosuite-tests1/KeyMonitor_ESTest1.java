/*
 * This file was automatically generated by EvoSuite
 * Sun Oct 02 20:42:09 KST 2016
 */


import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.awt.Component;
import java.awt.event.KeyEvent;

import javax.swing.JTabbedPane;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class KeyMonitor_ESTest1   {
@BeforeClass
public static void initEvoSuiteFramework() {
}
@AfterClass
public static void exitEvoSuiteFramework() {
}

  @Test
  public void test0()  throws Throwable  {
      KeyMonitor keyMonitor0 = new KeyMonitor((GameManager) null);
      JTabbedPane jTabbedPane0 = new JTabbedPane();
      KeyEvent keyEvent0 = new KeyEvent((Component) jTabbedPane0, (-924), (long) (-924), (-924), (-924), '!');
      keyMonitor0.keyTyped(keyEvent0);
      assertEquals(-924, keyEvent0.getID());
  }

  @Test
  public void test1()  throws Throwable  {
      KeyMonitor keyMonitor0 = new KeyMonitor((GameManager) null);
      JTabbedPane jTabbedPane0 = new JTabbedPane();
      KeyEvent keyEvent0 = new KeyEvent((Component) jTabbedPane0, (-1022), (long) (-1022), (-1022), (-1022), '=');
      // Undeclared exception!
      try { 
        keyMonitor0.keyReleased(keyEvent0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("KeyMonitor", e);
      }
  }

  @Test
  public void test2()  throws Throwable  {
      KeyMonitor keyMonitor0 = new KeyMonitor((GameManager) null);
      JTabbedPane jTabbedPane0 = new JTabbedPane();
      KeyEvent keyEvent0 = new KeyEvent((Component) jTabbedPane0, (-924), (long) (-924), (-924), (-924), '!');
      // Undeclared exception!
      try { 
        keyMonitor0.keyPressed(keyEvent0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("KeyMonitor", e);
      }
  }
}
