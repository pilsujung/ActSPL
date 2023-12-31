/*
 * This file was automatically generated by EvoSuite
 * Sun Oct 02 10:56:11 GMT 2016
 */


import org.junit.Test;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Component;
import java.awt.event.KeyEvent;
import javax.swing.JFormattedTextField;
import javax.swing.JRadioButtonMenuItem;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class KeyMonitor_ESTest2   {
@BeforeClass
public static void initEvoSuiteFramework() {
}
@AfterClass
public static void exitEvoSuiteFramework() {
}

  //Test case number: 0
  /*
   * 11 covered goals:
   * Goal 1. KeyMonitor.keyTyped(Ljava/awt/event/KeyEvent;)V: root-Branch
   * Goal 2. KeyMonitor.<init>(LGameManager;)V: root-Branch
   * Goal 3. Branch KeyMonitor.keyTyped(Ljava/awt/event/KeyEvent;)V: root-Branch in context: KeyMonitor:keyTyped(Ljava/awt/event/KeyEvent;)V
   * Goal 4. Branch KeyMonitor.<init>(LGameManager;)V: root-Branch in context: KeyMonitor:<init>(LGameManager;)V
   * Goal 5. KeyMonitor.<init>(LGameManager;)V: Line 13
   * Goal 6. KeyMonitor.<init>(LGameManager;)V: Line 14
   * Goal 7. KeyMonitor.keyTyped(Ljava/awt/event/KeyEvent;)V: Line 30
   * Goal 8. [METHOD] KeyMonitor.<init>(LGameManager;)V
   * Goal 9. [METHOD] KeyMonitor.keyTyped(Ljava/awt/event/KeyEvent;)V
   * Goal 10. [METHODNOEX] KeyMonitor.<init>(LGameManager;)V
   * Goal 11. [METHODNOEX] KeyMonitor.keyTyped(Ljava/awt/event/KeyEvent;)V
   */

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      KeyMonitor keyMonitor0 = new KeyMonitor((GameManager) null);
      JFormattedTextField jFormattedTextField0 = new JFormattedTextField();
      KeyEvent keyEvent0 = new KeyEvent((Component) jFormattedTextField0, (-20), (long) (-20), (-20), (-20), '?');
      keyMonitor0.keyTyped(keyEvent0);
      assertTrue(keyEvent0.isAltGraphDown());
  }

  //Test case number: 1
  /*
   * 15 covered goals:
   * Goal 1. KeyMonitor.keyReleased(Ljava/awt/event/KeyEvent;)V: root-Branch
   * Goal 2. KeyMonitor.<init>(LGameManager;)V: root-Branch
   * Goal 3. Branch KeyMonitor.keyReleased(Ljava/awt/event/KeyEvent;)V: root-Branch in context: KeyMonitor:keyReleased(Ljava/awt/event/KeyEvent;)V
   * Goal 4. Branch KeyMonitor.<init>(LGameManager;)V: root-Branch in context: KeyMonitor:<init>(LGameManager;)V
   * Goal 5. keyReleased(Ljava/awt/event/KeyEvent;)V_java.lang.NullPointerException_IMPLICIT
   * Goal 6. KeyMonitor.<init>(LGameManager;)V: Line 13
   * Goal 7. KeyMonitor.<init>(LGameManager;)V: Line 14
   * Goal 8. KeyMonitor.keyReleased(Ljava/awt/event/KeyEvent;)V: Line 23
   * Goal 9. KeyMonitor.keyReleased(Ljava/awt/event/KeyEvent;)V: Line 24
   * Goal 10. [METHOD] KeyMonitor.<init>(LGameManager;)V
   * Goal 11. [METHOD] KeyMonitor.keyReleased(Ljava/awt/event/KeyEvent;)V
   * Goal 12. [METHODNOEX] KeyMonitor.<init>(LGameManager;)V
   * Goal 13. Weak Mutation 3: KeyMonitor.keyReleased(Ljava/awt/event/KeyEvent;)V:24 - InsertUnaryOp Negation of key
   * Goal 14. Weak Mutation 4: KeyMonitor.keyReleased(Ljava/awt/event/KeyEvent;)V:24 - InsertUnaryOp IINC 1 key
   * Goal 15. Weak Mutation 5: KeyMonitor.keyReleased(Ljava/awt/event/KeyEvent;)V:24 - InsertUnaryOp IINC -1 key
   */

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      KeyMonitor keyMonitor0 = new KeyMonitor((GameManager) null);
      JRadioButtonMenuItem jRadioButtonMenuItem0 = new JRadioButtonMenuItem("I[U+@");
      KeyEvent keyEvent0 = new KeyEvent((Component) jRadioButtonMenuItem0, 0, (long) 0, 0, 0, '!', 0);
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

  //Test case number: 2
  /*
   * 15 covered goals:
   * Goal 1. KeyMonitor.keyPressed(Ljava/awt/event/KeyEvent;)V: root-Branch
   * Goal 2. KeyMonitor.<init>(LGameManager;)V: root-Branch
   * Goal 3. Branch KeyMonitor.keyPressed(Ljava/awt/event/KeyEvent;)V: root-Branch in context: KeyMonitor:keyPressed(Ljava/awt/event/KeyEvent;)V
   * Goal 4. Branch KeyMonitor.<init>(LGameManager;)V: root-Branch in context: KeyMonitor:<init>(LGameManager;)V
   * Goal 5. keyPressed(Ljava/awt/event/KeyEvent;)V_java.lang.NullPointerException_IMPLICIT
   * Goal 6. KeyMonitor.<init>(LGameManager;)V: Line 13
   * Goal 7. KeyMonitor.<init>(LGameManager;)V: Line 14
   * Goal 8. KeyMonitor.keyPressed(Ljava/awt/event/KeyEvent;)V: Line 17
   * Goal 9. KeyMonitor.keyPressed(Ljava/awt/event/KeyEvent;)V: Line 18
   * Goal 10. [METHOD] KeyMonitor.<init>(LGameManager;)V
   * Goal 11. [METHOD] KeyMonitor.keyPressed(Ljava/awt/event/KeyEvent;)V
   * Goal 12. [METHODNOEX] KeyMonitor.<init>(LGameManager;)V
   * Goal 13. Weak Mutation 0: KeyMonitor.keyPressed(Ljava/awt/event/KeyEvent;)V:18 - InsertUnaryOp Negation of key
   * Goal 14. Weak Mutation 1: KeyMonitor.keyPressed(Ljava/awt/event/KeyEvent;)V:18 - InsertUnaryOp IINC 1 key
   * Goal 15. Weak Mutation 2: KeyMonitor.keyPressed(Ljava/awt/event/KeyEvent;)V:18 - InsertUnaryOp IINC -1 key
   */

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      KeyMonitor keyMonitor0 = new KeyMonitor((GameManager) null);
      JFormattedTextField jFormattedTextField0 = new JFormattedTextField();
      KeyEvent keyEvent0 = new KeyEvent((Component) jFormattedTextField0, (-20), (long) (-20), (-20), (-20), '?');
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
