/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 11:18:29 KST 2017
 */

package com.sleepycat.je.recovery;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.fail;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.sleepycat.je.DatabaseException;
import com.sleepycat.je.dbi.DatabaseImpl;
import com.sleepycat.je.latch.LatchException;
import com.sleepycat.je.log.LogManager;
import com.sleepycat.je.tree.BIN;
import com.sleepycat.je.tree.ChildReference;
import com.sleepycat.je.tree.DIN;
import com.sleepycat.je.tree.DupCountLN;
import com.sleepycat.je.tree.IN;
import com.sleepycat.je.tree.LN;
import com.sleepycat.je.tree.Node;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class RootFlusher_ESTest9 extends RootFlusher_ESTest_scaffolding9 {

  @Test
  public void test00()  throws Throwable  {
      DatabaseImpl databaseImpl0 = new DatabaseImpl();
      RootFlusher rootFlusher0 = new RootFlusher(databaseImpl0, (LogManager) null, 3139L);
      BIN bIN0 = new BIN();
      rootFlusher0.hook599((ChildReference) null, bIN0);
      //  // Unstable assertion: assertEquals(28L, bIN0.getLastId());
      //  // Unstable assertion: assertEquals(28L, databaseImpl0.getEofNodeId());
  }

  @Test
  public void test01()  throws Throwable  {
      RootFlusher rootFlusher0 = new RootFlusher((DatabaseImpl) null, (LogManager) null, 0L);
      DIN dIN0 = new DIN();
      byte[] byteArray0 = new byte[1];
      ChildReference childReference0 = new ChildReference((Node) dIN0, byteArray0, 0L);
      // Undeclared exception!
      try { 
        rootFlusher0.hook599(childReference0, (IN) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.recovery.RootFlusher", e);
      }
  }

  @Test
  public void test02()  throws Throwable  {
      RootFlusher rootFlusher0 = new RootFlusher((DatabaseImpl) null, (LogManager) null, 0L);
      DIN dIN0 = new DIN();
      dIN0.setDirty(true);
      byte[] byteArray0 = new byte[1];
      ChildReference childReference0 = new ChildReference((Node) dIN0, byteArray0, 0L);
      // Undeclared exception!
      try { 
        rootFlusher0.hook599(childReference0, dIN0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.DIN", e);
      }
  }

  @Test
  public void test03()  throws Throwable  {
      RootFlusher rootFlusher0 = new RootFlusher((DatabaseImpl) null, (LogManager) null, 0L);
      DIN dIN0 = new DIN();
      byte[] byteArray0 = new byte[1];
      ChildReference childReference0 = new ChildReference((Node) dIN0, byteArray0, 0L);
      dIN0.latch(true);
      try { 
        rootFlusher0.hook599(childReference0, dIN0);
        fail("Expecting exception: LatchException");
      
      } catch(LatchException e) {
         //
         // DIN0 already held
         //
         assertThrownBy("com.sleepycat.je.latch.Java5LatchImpl", e);
      }
  }

  @Test
  public void test04()  throws Throwable  {
      RootFlusher rootFlusher0 = new RootFlusher((DatabaseImpl) null, (LogManager) null, 0L);
      byte[] byteArray0 = new byte[1];
      DupCountLN dupCountLN0 = new DupCountLN();
      ChildReference childReference0 = new ChildReference((Node) dupCountLN0, byteArray0, (-2170L));
      // Undeclared exception!
      try { 
        rootFlusher0.doWork(childReference0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // com.sleepycat.je.tree.DupCountLN cannot be cast to com.sleepycat.je.tree.IN
         //
         assertThrownBy("com.sleepycat.je.recovery.RootFlusher", e);
      }
  }

  @Test
  public void test05()  throws Throwable  {
      RootFlusher rootFlusher0 = new RootFlusher((DatabaseImpl) null, (LogManager) null, 0L);
      DIN dIN0 = new DIN();
      dIN0.latchNoWait(false);
      byte[] byteArray0 = new byte[1];
      ChildReference childReference0 = new ChildReference((Node) dIN0, byteArray0, 0L);
      try { 
        rootFlusher0.doWork(childReference0);
        fail("Expecting exception: LatchException");
      
      } catch(LatchException e) {
         //
         // DIN0 already held
         //
         assertThrownBy("com.sleepycat.je.latch.Java5LatchImpl", e);
      }
  }

  @Test
  public void test06()  throws Throwable  {
      DatabaseImpl databaseImpl0 = new DatabaseImpl();
      RootFlusher rootFlusher0 = new RootFlusher(databaseImpl0, (LogManager) null, 3126L);
      byte[] byteArray0 = new byte[6];
      ChildReference childReference0 = new ChildReference((Node) null, byteArray0, 32767L, (byte)125);
      try { 
        rootFlusher0.doWork(childReference0);
        fail("Expecting exception: DatabaseException");
      
      } catch(DatabaseException e) {
         //
         // fetchTarget of 0x0/0x7fff state=127 java.lang.NullPointerException
         //
         assertThrownBy("com.sleepycat.je.tree.ChildReference", e);
      }
  }

  @Test
  public void test07()  throws Throwable  {
      RootFlusher rootFlusher0 = new RootFlusher((DatabaseImpl) null, (LogManager) null, 0L);
      DIN dIN0 = new DIN();
      dIN0.setDirty(true);
      byte[] byteArray0 = new byte[1];
      ChildReference childReference0 = new ChildReference((Node) dIN0, byteArray0, 0L);
      // Undeclared exception!
      try { 
        rootFlusher0.doWork(childReference0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.DIN", e);
      }
  }

  @Test
  public void test08()  throws Throwable  {
      RootFlusher rootFlusher0 = new RootFlusher((DatabaseImpl) null, (LogManager) null, 0L);
      DIN dIN0 = new DIN();
      byte[] byteArray0 = new byte[0];
      LN lN0 = new LN(byteArray0);
      ChildReference childReference0 = new ChildReference((Node) lN0, byteArray0, 22L);
      rootFlusher0.hook599(childReference0, dIN0);
      //  // Unstable assertion: assertEquals(12L, lN0.getNodeId());
      
      boolean boolean0 = rootFlusher0.stillRoot();
      //  // Unstable assertion: assertTrue(boolean0);
  }

  @Test
  public void test09()  throws Throwable  {
      RootFlusher rootFlusher0 = new RootFlusher((DatabaseImpl) null, (LogManager) null, (-1871L));
      DIN dIN0 = new DIN();
      byte[] byteArray0 = new byte[1];
      ChildReference childReference0 = new ChildReference((Node) dIN0, byteArray0, (-1871L));
      IN iN0 = rootFlusher0.doWork(childReference0);
      assertNull(iN0);
  }

  @Test
  public void test10()  throws Throwable  {
      DatabaseImpl databaseImpl0 = new DatabaseImpl();
      RootFlusher rootFlusher0 = new RootFlusher(databaseImpl0, (LogManager) null, 3139L);
      rootFlusher0.doWork((ChildReference) null);
      //  // Unstable assertion: assertEquals(7L, databaseImpl0.getEofNodeId());
  }

  @Test
  public void test11()  throws Throwable  {
      RootFlusher rootFlusher0 = new RootFlusher((DatabaseImpl) null, (LogManager) null, 0L);
      boolean boolean0 = rootFlusher0.getFlushed();
      assertFalse(boolean0);
  }


  @Test
  public void test13()  throws Throwable  {
      DatabaseImpl databaseImpl0 = new DatabaseImpl();
      RootFlusher rootFlusher0 = new RootFlusher(databaseImpl0, (LogManager) null, 1659L);
      byte[] byteArray0 = new byte[4];
      ChildReference childReference0 = new ChildReference((Node) null, byteArray0, (-1L), (byte) (-5));
      // Undeclared exception!
      try { 
        rootFlusher0.doWork(childReference0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.recovery.RootFlusher", e);
      }
  }
}