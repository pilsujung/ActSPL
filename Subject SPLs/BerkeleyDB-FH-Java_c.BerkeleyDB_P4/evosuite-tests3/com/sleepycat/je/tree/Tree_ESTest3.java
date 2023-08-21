/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 10:28:39 KST 2017
 */

package com.sleepycat.je.tree;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.fail;

import java.io.File;
import java.io.StringWriter;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;
import java.util.Properties;
import java.util.logging.Level;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.sleepycat.je.DatabaseException;
import com.sleepycat.je.EnvironmentConfig;
import com.sleepycat.je.PreloadConfig;
import com.sleepycat.je.dbi.CursorImpl;
import com.sleepycat.je.dbi.DatabaseId;
import com.sleepycat.je.dbi.DatabaseImpl;
import com.sleepycat.je.dbi.EnvironmentImpl;
import com.sleepycat.je.dbi.INList;
import com.sleepycat.je.latch.LatchException;
import com.sleepycat.je.latch.LatchNotHeldException;
import com.sleepycat.je.txn.LockGrantType;
import com.sleepycat.je.txn.LockResult;
import com.sleepycat.je.txn.WriteLockInfo;
import com.sleepycat.je.utilint.TestHook;

import de.ovgu.cide.jakutil.ReturnObject;
import sun.nio.cs.ext.MS949;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class Tree_ESTest3 extends Tree_ESTest_scaffolding3 {

  @Test
  public void test000()  throws Throwable  {
      Tree tree0 = new Tree();
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte)13;
      byteArray0[1] = (byte)86;
      byteArray0[2] = (byte)23;
      byteArray0[3] = (byte) (-106);
      byteArray0[4] = (byte) (-1);
      byteArray0[5] = (byte)109;
      byteArray0[6] = (byte)7;
      byteArray0[7] = (byte) (-92);
      byteArray0[8] = (byte)24;
      Tree.SearchType tree_SearchType0 = Tree.SearchType.RIGHT;
      BINBoundary bINBoundary0 = new BINBoundary();
      tree0.search(byteArray0, tree_SearchType0, (byte)24, bINBoundary0, false);
      // Undeclared exception!
      try { 
        tree0.hook738((IN) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.Tree", e);
      }
  }

  @Test
  public void test001()  throws Throwable  {
      Tree tree0 = new Tree();
      DBIN dBIN0 = new DBIN();
      dBIN0.latch(false);
      tree0.hook699(dBIN0);
      try { 
        tree0.hook689(dBIN0);
        fail("Expecting exception: LatchException");
      
      } catch(LatchException e) {
         //
         // DBIN0 already held
         //
         assertThrownBy("com.sleepycat.je.latch.Java5LatchImpl", e);
      }
  }

  @Test
  public void test003()  throws Throwable  {
      EnvironmentImpl.decThreadLocalReferenceCount();
      Tree tree0 = new Tree();
      Level level0 = Level.INFO;
      DIN dIN0 = new DIN();
      byte[] byteArray0 = new byte[5];
      try { 
        tree0.hook739(dIN0, dIN0);
        fail("Expecting exception: LatchNotHeldException");
      
      } catch(LatchNotHeldException e) {
         //
         // DIN0 not held
         //
         assertThrownBy("com.sleepycat.je.latch.Java5LatchImpl", e);
      }
  }

  @Test
  public void test004()  throws Throwable  {
      Tree tree0 = new Tree();
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte) (-83);
      byteArray0[1] = (byte)3;
      byteArray0[2] = (byte)49;
      Tree.SearchType tree_SearchType0 = Tree.SearchType.NORMAL;
      BINBoundary bINBoundary0 = new BINBoundary();
      tree0.search(byteArray0, tree_SearchType0, (byte)3, bINBoundary0, true);
      // Undeclared exception!
      try { 
        tree0.hook674(byteArray0, byteArray0, (IN) null, (IN) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.Tree", e);
      }
  }

  @Test
  public void test006()  throws Throwable  {
      DatabaseImpl databaseImpl0 = new DatabaseImpl();
      Tree tree0 = databaseImpl0.getTree();
      tree0.getFirstNode();
      DIN dIN0 = new DIN();
      // Undeclared exception!
      try { 
        tree0.hook737((IN) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.Tree", e);
      }
  }

  @Test
  public void test007()  throws Throwable  {
      Tree tree0 = new Tree();
      DIN dIN0 = new DIN();
      tree0.hook752();
      assertEquals(0L, tree0.getTransactionId());
  }

  @Test
  public void test008()  throws Throwable  {
      Tree tree0 = new Tree();
      byte[] byteArray0 = new byte[2];
      // Undeclared exception!
      try { 
        tree0.hook743((CursorImpl) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.Tree", e);
      }
  }


  @Test
  public void test010()  throws Throwable  {
      Tree tree0 = new Tree();
      tree0.dump();
      TreeLocation treeLocation0 = new TreeLocation();
      Tree.Tree_searchSplitsAllowed tree_Tree_searchSplitsAllowed0 = new Tree.Tree_searchSplitsAllowed(tree0, (byte[]) null, 0, true);
      tree_Tree_searchSplitsAllowed0.hook721();
      Tree.Tree_forceSplit tree_Tree_forceSplit0 = new Tree.Tree_forceSplit(tree0, (IN) null, (byte[]) null);
      // Undeclared exception!
      try { 
        tree_Tree_forceSplit0.hook725();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.Tree$Tree_forceSplit", e);
      }
  }

  @Test
  public void test012()  throws Throwable  {
      Tree tree0 = new Tree();
      byte[] byteArray0 = new byte[1];
      tree0.getLastNode();
      byteArray0[0] = (byte)1;
      DatabaseId databaseId0 = new DatabaseId();
      try { 
        tree0.hook693((IN) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.Tree", e);
      }
  }

  @Test
  public void test015()  throws Throwable  {
      Tree tree0 = new Tree();
      tree0.dump();
      TreeLocation treeLocation0 = new TreeLocation();
      // Undeclared exception!
      try { 
        tree0.hook750((BIN) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.Tree", e);
      }
  }

  @Test
  public void test016()  throws Throwable  {
      Tree tree0 = new Tree();
      // Undeclared exception!
      try { 
        tree0.hook676((ArrayList) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.Tree", e);
      }
  }

  @Test
  public void test017()  throws Throwable  {
      Tree tree0 = new Tree();
      DatabaseImpl databaseImpl0 = tree0.getDatabase();
      assertNull(databaseImpl0);
  }

  @Test
  public void test018()  throws Throwable  {
      Tree tree0 = new Tree();
      byte[] byteArray0 = new byte[3];
      tree0.getRootIN(true);
      // Undeclared exception!
      try { 
        tree0.getParentINForChildIN((IN) null, true, true, (int) (byte)0, (List) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // getParentNode passed null
         //
         assertThrownBy("com.sleepycat.je.tree.Tree", e);
      }
  }

  @Test
  public void test019()  throws Throwable  {
      Tree tree0 = new Tree();
      DBIN dBIN0 = new DBIN();
      tree0.hook750(dBIN0);
      DBIN dBIN1 = new DBIN();
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte) (-106);
      Tree.SearchType tree_SearchType0 = Tree.SearchType.NORMAL;
      BINBoundary bINBoundary0 = new BINBoundary();
      assertFalse(bINBoundary0.isLastBin);
  }


  @Test
  public void test021()  throws Throwable  {
      Tree tree0 = new Tree();
      byte[] byteArray0 = new byte[6];
      byteArray0[1] = (byte)1;
      byteArray0[2] = (byte) (-102);
      tree0.searchSplitsAllowed(byteArray0, 0L, false);
      Tree.Tree_forceSplit tree_Tree_forceSplit0 = new Tree.Tree_forceSplit(tree0, (IN) null, byteArray0);
      ArrayList<IN> arrayList0 = new ArrayList<IN>();
      // Undeclared exception!
      try { 
        tree_Tree_forceSplit0.hook724();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.Tree$Tree_forceSplit", e);
      }
  }

  @Test
  public void test022()  throws Throwable  {
      Tree tree0 = new Tree();
      DBIN dBIN0 = new DBIN();
      byte[] byteArray0 = new byte[1];
      try { 
        tree0.hook747(dBIN0);
        fail("Expecting exception: LatchNotHeldException");
      
      } catch(LatchNotHeldException e) {
         //
         // DBIN0 not held
         //
         assertThrownBy("com.sleepycat.je.latch.Java5LatchImpl", e);
      }
  }

  @Test
  public void test024()  throws Throwable  {
      DatabaseImpl databaseImpl0 = new DatabaseImpl();
      Tree tree0 = databaseImpl0.getTree();
      DIN dIN0 = new DIN();
      dIN0.toString();
      // Undeclared exception!
      try { 
        tree0.rebuildINList();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.Tree", e);
      }
  }

  @Test
  public void test025()  throws Throwable  {
      DatabaseImpl databaseImpl0 = new DatabaseImpl();
      Tree tree0 = databaseImpl0.getTree();
      DIN dIN0 = new DIN();
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte)15;
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte)9;
      byteArray0[3] = (byte)25;
      byteArray0[4] = (byte)49;
      byteArray0[5] = (byte)11;
      byteArray0[6] = (byte)1;
      byteArray0[7] = (byte)25;
      LN lN0 = new LN(byteArray0);
      DBIN dBIN0 = new DBIN();
      // Undeclared exception!
      try { 
        tree0.hook660(lN0, 2468L, dBIN0, (byte)9);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.Tree", e);
      }
  }

  @Test
  public void test027()  throws Throwable  {
      DatabaseImpl databaseImpl0 = new DatabaseImpl();
      Tree tree0 = databaseImpl0.getTree();
      // Undeclared exception!
      try { 
        tree0.hook734((IN) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.Tree", e);
      }
  }

  @Test
  public void test028()  throws Throwable  {
      DatabaseImpl databaseImpl0 = new DatabaseImpl();
      Tree tree0 = databaseImpl0.getTree();
      // Undeclared exception!
      try { 
        tree0.hook670((WithRootLatched) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.Tree", e);
      }
  }

  @Test
  public void test029()  throws Throwable  {
      Tree tree0 = new Tree();
      DupCountLN dupCountLN0 = new DupCountLN();
      byte[] byteArray0 = new byte[0];
      // Undeclared exception!
      try { 
        tree0.readFromLog((ByteBuffer) null, (byte)79);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.LogUtils", e);
      }
  }

  @Test
  public void test030()  throws Throwable  {
      Tree tree0 = new Tree();
      // Undeclared exception!
      try { 
        tree0.dumpString((byte) (-102));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -102
         //
         assertThrownBy("java.lang.String", e);
      }
  }

  @Test
  public void test031()  throws Throwable  {
      Tree tree0 = new Tree();
      DBIN dBIN0 = new DBIN();
      // Undeclared exception!
      try { 
        tree0.validateINList(dBIN0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.Tree", e);
      }
  }

  @Test
  public void test032()  throws Throwable  {
      Tree tree0 = new Tree();
      tree0.setTreeStatsAccumulator((TreeWalkerStatsAccumulator) null);
      assertEquals(0L, tree0.getTransactionId());
  }

  @Test
  public void test034()  throws Throwable  {
      Tree tree0 = new Tree();
      Level level0 = Level.OFF;
      tree0.getFirstNode();
      // Undeclared exception!
      try { 
        tree0.hook701(true, (IN) null);
        fail("Expecting exception: ReturnObject");
      
      } catch(ReturnObject e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.Tree", e);
      }
  }

  @Test
  public void test035()  throws Throwable  {
      Tree tree0 = new Tree();
      byte[] byteArray0 = new byte[1];
      // Undeclared exception!
      try { 
        tree0.hook712((BIN) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.Tree", e);
      }
  }

  @Test
  public void test036()  throws Throwable  {
      DatabaseImpl databaseImpl0 = new DatabaseImpl();
      Tree tree0 = databaseImpl0.getTree();
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte)1;
      byteArray0[1] = (byte) (-2);
      byteArray0[2] = (byte) (-23);
      byteArray0[3] = (byte) (-53);
      byteArray0[4] = (byte) (-59);
      byteArray0[5] = (byte) (-28);
      byteArray0[6] = (byte)2;
      Tree.Tree_searchSplitsAllowed tree_Tree_searchSplitsAllowed0 = new Tree.Tree_searchSplitsAllowed(tree0, byteArray0, 0L, true);
      tree_Tree_searchSplitsAllowed0.execute();
      // Undeclared exception!
      try { 
        tree0.hook736((IN) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.Tree", e);
      }
  }

  @Test
  public void test037()  throws Throwable  {
      Tree tree0 = new Tree();
      DBIN dBIN0 = new DBIN();
      byte[] byteArray0 = new byte[5];
      try { 
        tree0.hook736(dBIN0);
        fail("Expecting exception: LatchNotHeldException");
      
      } catch(LatchNotHeldException e) {
         //
         // DBIN0 not held
         //
         assertThrownBy("com.sleepycat.je.latch.Java5LatchImpl", e);
      }
  }


  @Test
  public void test042()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte) (-57);
      byteArray0[1] = (byte) (-1);
      DBIN dBIN0 = new DBIN();
      ChildReference childReference0 = new ChildReference((Node) dBIN0, byteArray0, 2279L, (byte)77);
      Tree tree0 = new Tree();
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("");
      // Undeclared exception!
      try { 
        tree0.writeToLog(byteBuffer0);
        fail("Expecting exception: BufferOverflowException");
      
      } catch(BufferOverflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.nio.Buffer", e);
      }
  }

  @Test
  public void test043()  throws Throwable  {
      Tree tree0 = new Tree();
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte)117;
      Tree.Tree_forceSplit tree_Tree_forceSplit0 = new Tree.Tree_forceSplit(tree0, (IN) null, byteArray0);
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("f:~");
      tree_Tree_forceSplit0.child = null;
      tree0.writeToLog(byteBuffer0);
      tree_Tree_forceSplit0.lastParentForSplit = (long) (byte)117;
      IN iN0 = null;
      try {  
      iN0 = tree_Tree_forceSplit0.parent;
      } catch(NullPointerException e) {}
  }

  @Test
  public void test044()  throws Throwable  {
      Tree tree0 = new Tree();
      TreeStats treeStats0 = tree0.getTreeStats();
      assertEquals(0, treeStats0.nRootSplits);
  }

  @Test
  public void test045()  throws Throwable  {
      Tree tree0 = new Tree();
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte)6;
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte)2;
      // Undeclared exception!
      try { 
        tree0.hook744((DIN) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.Tree", e);
      }
  }

  @Test
  public void test046()  throws Throwable  {
      Tree tree0 = new Tree();
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte) (-1);
      byteArray0[1] = (byte) (-8);
      byteArray0[2] = (byte)13;
      byteArray0[3] = (byte)1;
      byteArray0[4] = (byte)0;
      byteArray0[5] = (byte) (-1);
      byteArray0[6] = (byte)0;
      Tree.Tree_searchSplitsAllowed tree_Tree_searchSplitsAllowed0 = new Tree.Tree_searchSplitsAllowed(tree0, byteArray0, 0L, false);
      // Undeclared exception!
      try { 
        tree_Tree_searchSplitsAllowed0.hook720();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.Tree", e);
      }
  }

  @Test
  public void test047()  throws Throwable  {
      Tree tree0 = new Tree();
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte)0;
      tree0.searchSplitsAllowed(byteArray0, 0L, true);
      byteArray0[1] = (byte)1;
      byteArray0[2] = (byte) (-102);
      tree0.setWaitHook((TestHook) null);
      tree0.searchSplitsAllowed(byteArray0, 0L, false);
      Tree.Tree_forceSplit tree_Tree_forceSplit0 = new Tree.Tree_forceSplit(tree0, (IN) null, byteArray0);
      // Undeclared exception!
      try { 
        tree_Tree_forceSplit0.execute();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.Tree$Tree_forceSplit", e);
      }
  }

  @Test
  public void test048()  throws Throwable  {
      DatabaseImpl databaseImpl0 = new DatabaseImpl();
      Tree tree0 = new Tree();
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte) (-68);
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte)0;
      byteArray0[3] = (byte)119;
      byteArray0[4] = (byte)1;
      byteArray0[5] = (byte)0;
      byteArray0[6] = (byte) (-45);
      byteArray0[7] = (byte) (-2);
      // Undeclared exception!
      try { 
        tree0.hook698((IN) null, byteArray0, (byte) (-45), true, (byte)1, (IN) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.Tree", e);
      }
  }

  @Test
  public void test049()  throws Throwable  {
      Tree tree0 = new Tree();
      DBIN dBIN0 = new DBIN();
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte) (-106);
      Tree.SearchType tree_SearchType0 = Tree.SearchType.NORMAL;
      // Undeclared exception!
      try { 
        tree0.hook698(dBIN0, byteArray0, (-34L), false, (byte) (-106), dBIN0);
        fail("Expecting exception: ReturnObject");
      
      } catch(ReturnObject e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.Tree", e);
      }
  }

  @Test
  public void test050()  throws Throwable  {
      Tree tree0 = new Tree();
      int int0 = tree0.getLogSize();
      assertEquals(1, int0);
      
      // Undeclared exception!
      try { 
        tree0.hook705((DIN) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.Tree", e);
      }
  }


  @Test
  public void test052()  throws Throwable  {
      Tree tree0 = new Tree();
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte)93;
      byteArray0[1] = (byte)92;
      byteArray0[2] = (byte)75;
      Tree.Tree_searchSplitsAllowed tree_Tree_searchSplitsAllowed0 = new Tree.Tree_searchSplitsAllowed(tree0, byteArray0, (byte)92, true);
      tree_Tree_searchSplitsAllowed0.hook716();
  }


  @Test
  public void test055()  throws Throwable  {
      DatabaseImpl databaseImpl0 = new DatabaseImpl();
      Tree tree0 = databaseImpl0.getTree();
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte)0;
      Tree.SearchType tree_SearchType0 = Tree.SearchType.LEFT;
      BINBoundary bINBoundary0 = new BINBoundary();
      tree0.search(byteArray0, tree_SearchType0, 2186L, bINBoundary0, false);
      // Undeclared exception!
      try { 
        tree0.hook681((IN) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.Tree", e);
      }
  }

  @Test
  public void test057()  throws Throwable  {
      DatabaseImpl databaseImpl0 = new DatabaseImpl();
      Tree tree0 = databaseImpl0.getTree();
      tree0.hook751();
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte)68;
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte)0;
      byteArray0[3] = (byte)0;
      byteArray0[4] = (byte) (-110);
      byteArray0[5] = (byte)0;
      byteArray0[6] = (byte) (-26);
      Tree.Tree_forceSplit tree_Tree_forceSplit0 = new Tree.Tree_forceSplit(tree0, (IN) null, byteArray0);
      tree_Tree_forceSplit0.lastParentForSplit = (long) (byte) (-110);
      tree_Tree_forceSplit0.hook722();
      // Undeclared exception!
      try { 
        tree0.hook671((WithRootLatched) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.Tree", e);
      }
  }

  @Test
  public void test058()  throws Throwable  {
      Tree tree0 = new Tree();
      ArrayList<BIN> arrayList0 = new ArrayList<BIN>();
      tree0.hook697(arrayList0);
      DatabaseId databaseId0 = new DatabaseId((-65537));
      EnvironmentConfig environmentConfig0 = null;
      try {
        environmentConfig0 = new EnvironmentConfig((Properties) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.EnvironmentMutableConfig", e);
      }
  }

  @Test
  public void test059()  throws Throwable  {
      Tree tree0 = new Tree();
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte) (-71);
      byteArray0[1] = (byte) (-90);
      LockGrantType lockGrantType0 = LockGrantType.WAIT_NEW;
      LockResult lockResult0 = new LockResult(lockGrantType0, (WriteLockInfo) null);
      // Undeclared exception!
      try { 
        tree0.insert((LN) null, byteArray0, true, (CursorImpl) null, lockResult0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.Tree", e);
      }
  }

  @Test
  public void test061()  throws Throwable  {
      Tree tree0 = new Tree();
      // Undeclared exception!
      try { 
        tree0.hook714((INList) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.Tree", e);
      }
  }

  @Test
  public void test062()  throws Throwable  {
      Tree tree0 = new Tree();
      byte[] byteArray0 = new byte[0];
      Tree.SearchType tree_SearchType0 = Tree.SearchType.RIGHT;
      // Undeclared exception!
      try { 
        tree0.hook715(0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.Tree", e);
      }
  }

  @Test
  public void test064()  throws Throwable  {
      Tree tree0 = new Tree();
      tree0.hook751();
      assertEquals((-1L), tree0.getRootLsn());
  }


  @Test
  public void test070()  throws Throwable  {
      Tree tree0 = new Tree();
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte) (-1);
      byteArray0[1] = (byte) (-8);
      byteArray0[2] = (byte)13;
      byteArray0[3] = (byte)1;
      byteArray0[4] = (byte)0;
      byteArray0[5] = (byte) (-1);
      byteArray0[6] = (byte)0;
      Tree.Tree_searchSplitsAllowed tree_Tree_searchSplitsAllowed0 = new Tree.Tree_searchSplitsAllowed(tree0, byteArray0, 0L, false);
      // Undeclared exception!
      try { 
        tree_Tree_searchSplitsAllowed0.hook718();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.Tree$Tree_searchSplitsAllowed", e);
      }
  }


  @Test
  public void test072()  throws Throwable  {
      Tree tree0 = new Tree();
      DBIN dBIN0 = new DBIN();
      try { 
        tree0.hook691(dBIN0);
        fail("Expecting exception: LatchNotHeldException");
      
      } catch(LatchNotHeldException e) {
         //
         // DBIN0 not held
         //
         assertThrownBy("com.sleepycat.je.latch.Java5LatchImpl", e);
      }
  }

  @Test
  public void test074()  throws Throwable  {
      DatabaseImpl databaseImpl0 = new DatabaseImpl();
      Tree tree0 = databaseImpl0.getTree();
      tree0.setCkptHook((TestHook) null);
      //  // Unstable assertion: assertEquals(450L, databaseImpl0.getEofNodeId());
  }

  @Test
  public void test075()  throws Throwable  {
      Tree tree0 = new Tree();
      // Undeclared exception!
      try { 
        tree0.hook731((TreeLocation) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.Tree", e);
      }
  }



  @Test
  public void test078()  throws Throwable  {
      Tree tree0 = new Tree();
      DBIN dBIN0 = new DBIN();
      try { 
        tree0.hook692(dBIN0);
        fail("Expecting exception: LatchNotHeldException");
      
      } catch(LatchNotHeldException e) {
         //
         // DBIN0 not held
         //
         assertThrownBy("com.sleepycat.je.latch.Java5LatchImpl", e);
      }
  }

  @Test
  public void test079()  throws Throwable  {
      DatabaseImpl databaseImpl0 = new DatabaseImpl();
      Tree tree0 = databaseImpl0.getTree();
      DIN dIN0 = new DIN();
      tree0.hook710(dIN0);
      databaseImpl0.getLogSize();
      tree0.hook748();
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte)46;
      byteArray0[1] = (byte)120;
      byteArray0[2] = (byte)0;
      byteArray0[3] = (byte)64;
      byteArray0[4] = (byte)1;
      byteArray0[5] = (byte) (-1);
      byteArray0[6] = (byte)0;
      byteArray0[7] = (byte) (-11);
      byteArray0[8] = (byte)32;
      tree0.makeRootChildReference(dIN0, byteArray0, (byte) (-1));
      byte[] byteArray1 = new byte[2];
      byteArray1[0] = (byte)22;
      byteArray1[1] = (byte)12;
      Tree.Tree_forceSplit tree_Tree_forceSplit0 = new Tree.Tree_forceSplit(tree0, dIN0, byteArray1);
      tree_Tree_forceSplit0.index = (int) (byte)22;
      //  // Unstable assertion: assertEquals(437L, dIN0.getLastId());
      //  // Unstable assertion: assertEquals(437L, databaseImpl0.getEofNodeId());
  }

  @Test
  public void test081()  throws Throwable  {
      Tree tree0 = new Tree();
      DIN dIN0 = new DIN();
      byte[] byteArray0 = new byte[0];
      Tree.SearchType tree_SearchType0 = Tree.SearchType.LEFT;
      BINBoundary bINBoundary0 = new BINBoundary();
      bINBoundary0.isLastBin = true;
      // Undeclared exception!
      try { 
        tree0.searchSubTree(dIN0, byteArray0, tree_SearchType0, 65L, bINBoundary0, true);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // searchSubTree passed key and left/right search
         //
         assertThrownBy("com.sleepycat.je.tree.Tree", e);
      }
  }


  @Test
  public void test084()  throws Throwable  {
      DatabaseImpl databaseImpl0 = new DatabaseImpl();
      Tree tree0 = databaseImpl0.getTree();
      databaseImpl0.findPrimaryDatabase();
      databaseImpl0.setDebugDatabaseName("Op#l[X:c(A'bP m-");
      // Undeclared exception!
      try { 
        tree0.validateDelete(16777216);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.Tree", e);
      }
  }


  @Test
  public void test086()  throws Throwable  {
      Tree tree0 = new Tree();
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte)23;
      byteArray0[1] = (byte) (-1);
      byteArray0[2] = (byte)112;
      byteArray0[3] = (byte) (-1);
      byteArray0[4] = (byte)123;
      byteArray0[5] = (byte)0;
      byteArray0[6] = (byte)0;
      byteArray0[7] = (byte) (-125);
      Tree.Tree_searchSplitsAllowed tree_Tree_searchSplitsAllowed0 = new Tree.Tree_searchSplitsAllowed(tree0, byteArray0, (byte) (-1), true);
      tree_Tree_searchSplitsAllowed0.hook719();
  }

  @Test
  public void test087()  throws Throwable  {
      Tree tree0 = new Tree();
      byte[] byteArray0 = new byte[0];
      DIN dIN0 = new DIN();
      tree0.hook744(dIN0);
      tree0.getLastNode();
  }

  @Test
  public void test088()  throws Throwable  {
      Tree tree0 = new Tree();
      tree0.getLastNode();
      tree0.getRootIN(true);
      // Undeclared exception!
      try { 
        tree0.hook689((IN) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.Tree", e);
      }
  }

  @Test
  public void test089()  throws Throwable  {
      Tree tree0 = new Tree();
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte) (-80);
      byteArray0[1] = (byte) (-1);
      byteArray0[2] = (byte)3;
      byteArray0[3] = (byte)0;
      byteArray0[4] = (byte)0;
      byte byte0 = (byte)56;
      byteArray0[5] = (byte)56;
      // Undeclared exception!
      try { 
        tree0.hook733();
       //  fail("Expecting exception: AssertionError");
       // Unstable assertion
      } catch(AssertionError e) {
         //
         // com.sleepycat.je.latch.Java5LatchImpl$JEReentrantLock@16dc86e5[Locked by thread TEST_EXECUTION_THREAD_17]
         // com.sleepycat.je.latch.Java5LatchImpl$JEReentrantLock@3fa58119[Locked by thread TEST_EXECUTION_THREAD_17]
         // com.sleepycat.je.latch.Java5LatchImpl$JEReentrantLock@16c1c821[Locked by thread TEST_EXECUTION_THREAD_17]
         // com.sleepycat.je.latch.Java5LatchImpl$JEReentrantLock@728a6207[Locked by thread TEST_EXECUTION_THREAD_17]
         // com.sleepycat.je.latch.Java5LatchImpl$JEReentrantLock@239e133f[Locked by thread TEST_EXECUTION_THREAD_17]
         // com.sleepycat.je.latch.Java5LatchImpl$JEReentrantLock@49fc17c0[Locked by thread TEST_EXECUTION_THREAD_17]
         // com.sleepycat.je.latch.Java5LatchImpl$JEReentrantLock@1d156554[Locked by thread TEST_EXECUTION_THREAD_17]
         // com.sleepycat.je.latch.Java5LatchImpl$JEReentrantLock@14ccd20b[Locked by thread TEST_EXECUTION_THREAD_17]
         //
         assertThrownBy("com.sleepycat.je.tree.Tree", e);
      }
  }

  @Test
  public void test091()  throws Throwable  {
      DatabaseImpl databaseImpl0 = new DatabaseImpl();
      databaseImpl0.getTree();
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte)71;
      Tree tree0 = null;
      try {
        tree0 = new Tree(databaseImpl0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.Tree", e);
      }
  }

  @Test
  public void test092()  throws Throwable  {
      DatabaseImpl databaseImpl0 = new DatabaseImpl();
      Tree tree0 = databaseImpl0.getTree();
      DIN dIN0 = new DIN();
      // Undeclared exception!
      try { 
        tree0.hook745((CursorImpl) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.Tree", e);
      }
  }


  @Test
  public void test094()  throws Throwable  {
      Tree tree0 = null;
      try {
        tree0 = new Tree((DatabaseImpl) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.Tree", e);
      }
  }

  @Test
  public void test097()  throws Throwable  {
      Tree tree0 = new Tree();
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte)1;
      byteArray0[2] = (byte) (-102);
      boolean boolean0 = false;
      tree0.searchSplitsAllowed(byteArray0, 19L, false);
      Tree.Tree_forceSplit tree_Tree_forceSplit0 = new Tree.Tree_forceSplit(tree0, (IN) null, byteArray0);
      // Undeclared exception!
      try { 
        tree_Tree_forceSplit0.execute();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.Tree$Tree_forceSplit", e);
      }
  }

  @Test
  public void test102()  throws Throwable  {
      DatabaseImpl databaseImpl0 = new DatabaseImpl();
      Tree tree0 = databaseImpl0.getTree();
      tree0.getFirstNode();
      DIN dIN0 = new DIN();
      CursorImpl cursorImpl0 = null;
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte)16;
      try { 
        tree0.hook674(byteArray0, byteArray0, dIN0, (IN) null);
        fail("Expecting exception: LatchNotHeldException");
      
      } catch(LatchNotHeldException e) {
         //
         // DIN0 not held
         //
         assertThrownBy("com.sleepycat.je.latch.Java5LatchImpl", e);
      }
  }

  @Test
  public void test103()  throws Throwable  {
      Tree tree0 = new Tree();
      DIN dIN0 = new DIN();
      byte[] byteArray0 = new byte[1];
      TreeLocation treeLocation0 = new TreeLocation();
      DupCountLN dupCountLN0 = new DupCountLN(0);
      // Undeclared exception!
      try { 
        tree0.hook685(treeLocation0, byteArray0, dIN0, dupCountLN0, false, true, false, false, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.Tree", e);
      }
  }

  @Test
  public void test104()  throws Throwable  {
      DatabaseImpl databaseImpl0 = new DatabaseImpl();
      Tree tree0 = databaseImpl0.getTree();
      tree0.getLastNode();
      // Undeclared exception!
      try { 
        tree0.hook691((IN) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.Tree", e);
      }
  }

  
}
