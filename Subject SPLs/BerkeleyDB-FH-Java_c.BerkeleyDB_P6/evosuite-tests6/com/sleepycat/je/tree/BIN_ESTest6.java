/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 01:41:56 KST 2017
 */

package com.sleepycat.je.tree;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.sleepycat.je.DatabaseException;
import com.sleepycat.je.EnvironmentConfig;
import com.sleepycat.je.dbi.CursorImpl;
import com.sleepycat.je.dbi.DatabaseId;
import com.sleepycat.je.dbi.DatabaseImpl;
import com.sleepycat.je.dbi.DbConfigManager;
import com.sleepycat.je.latch.LatchException;
import com.sleepycat.je.latch.LatchNotHeldException;
import com.sleepycat.je.log.LogManager;

import de.ovgu.cide.jakutil.ReturnBoolean;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class BIN_ESTest6 extends BIN_ESTest_scaffolding6 {

  @Test
  public void test00()  throws Throwable  {
      DBIN dBIN0 = new DBIN();
      dBIN0.canBeAncestor(false);
      assertEquals((-1L), dBIN0.getLastDeltaVersion());
  }

  @Test
  public void test02()  throws Throwable  {
      BIN bIN0 = new BIN();
      CursorImpl cursorImpl0 = null;
      // Undeclared exception!
      try { 
        bIN0.getCursorBIN((CursorImpl) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.BIN", e);
      }
  }

  @Test
  public void test03()  throws Throwable  {
      BIN bIN0 = new BIN();
      DatabaseImpl databaseImpl0 = new DatabaseImpl();
      byte[] byteArray0 = new byte[1];
      DBIN dBIN0 = null;
      try {
        dBIN0 = new DBIN(databaseImpl0, byteArray0, bIN0.ACCUMULATED_LIMIT, byteArray0, bIN0.ACCUMULATED_LIMIT);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.IN", e);
      }
  }

  @Test
  public void test04()  throws Throwable  {
      BIN bIN0 = new BIN();
      bIN0.hook608(false);
      assertEquals((-1L), bIN0.getLastDeltaVersion());
      assertEquals("BIN", bIN0.shortClassName());
  }

  @Test
  public void test05()  throws Throwable  {
      DBIN dBIN0 = new DBIN();
      boolean boolean0 = false;
      DIN dIN0 = new DIN();
      try { 
        dBIN0.descendOnParentSearch((SearchResult) null, false, false, 1422L, dIN0, false);
        fail("Expecting exception: LatchNotHeldException");
      
      } catch(LatchNotHeldException e) {
         //
         // DBIN0 not held
         //
         assertThrownBy("com.sleepycat.je.latch.Java5LatchImpl", e);
      }
  }

  @Test
  public void test06()  throws Throwable  {
      BIN bIN0 = new BIN();
      DIN dIN0 = new DIN();
      dIN0.latchNoWait(true);
      bIN0.hook603(dIN0);
      //  // Unstable assertion: assertEquals(562L, dIN0.getGeneration());
  }

  @Test
  public void test08()  throws Throwable  {
      BIN bIN0 = new BIN();
      // Undeclared exception!
      try { 
        bIN0.hook610((-1));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         assertThrownBy("com.sleepycat.je.tree.IN", e);
      }
  }

  @Test
  public void test09()  throws Throwable  {
      BIN bIN0 = new BIN();
      DIN dIN0 = new DIN();
      bIN0.getChildKey(dIN0);
      assertEquals((-1L), bIN0.getLastDeltaVersion());
      assertEquals("BIN", bIN0.shortClassName());
  }

  @Test
  public void test11()  throws Throwable  {
      BIN bIN0 = new BIN();
      // Undeclared exception!
      try { 
        bIN0.clearKnownDeleted(0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         assertThrownBy("com.sleepycat.je.tree.IN", e);
      }
  }

  @Test
  public void test12()  throws Throwable  {
      BIN bIN0 = new BIN();
      byte[] byteArray0 = new byte[2];
      // Undeclared exception!
      try { 
        bIN0.getEvictionType();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.BIN", e);
      }
  }

  @Test
  public void test13()  throws Throwable  {
      BIN bIN0 = new BIN();
      boolean boolean0 = bIN0.isEvictionProhibited();
      assertEquals((-1L), bIN0.getLastDeltaVersion());
      assertEquals("BIN", bIN0.shortClassName());
      assertFalse(boolean0);
  }

  @Test
  public void test14()  throws Throwable  {
      BIN bIN0 = new BIN();
      boolean boolean0 = bIN0.hasNonLNChildren();
      assertEquals((-1L), bIN0.getLastDeltaVersion());
      assertFalse(boolean0);
      assertEquals("BIN", bIN0.shortClassName());
  }

  @Test
  public void test15()  throws Throwable  {
      DBIN dBIN0 = new DBIN();
      // Undeclared exception!
      try { 
        dBIN0.log((LogManager) null, true, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.BIN", e);
      }
  }

  @Test
  public void test16()  throws Throwable  {
      DBIN dBIN0 = new DBIN();
      SearchResult searchResult0 = new SearchResult();
      // Undeclared exception!
      try { 
        dBIN0.descendOnParentSearch(searchResult0, false, false, 12, (Node) null, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.BIN", e);
      }
  }

  @Test
  public void test17()  throws Throwable  {
      BIN bIN0 = new BIN();
      byte[] byteArray0 = new byte[1];
      bIN0.init((DatabaseImpl) null, byteArray0, 536, 3086);
      bIN0.clearKnownDeleted(0);
      assertTrue(bIN0.getDirty());
  }

  @Test
  public void test18()  throws Throwable  {
      DBIN dBIN0 = new DBIN();
      byte[] byteArray0 = new byte[2];
      // Undeclared exception!
      try { 
        dBIN0.splitSpecial(dBIN0, 1252, 100, byteArray0, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.DBIN", e);
      }
  }

  @Test
  public void test19()  throws Throwable  {
      DBIN dBIN0 = new DBIN();
      dBIN0.latchNoWait(true);
      try { 
        dBIN0.hook608(true);
        fail("Expecting exception: LatchException");
      
      } catch(LatchException e) {
         //
         // DBIN0 already held
         //
         assertThrownBy("com.sleepycat.je.latch.Java5LatchImpl", e);
      }
  }

  @Test
  public void test20()  throws Throwable  {
      BIN bIN0 = new BIN();
      try { 
        bIN0.hook606();
        fail("Expecting exception: LatchNotHeldException");
      
      } catch(LatchNotHeldException e) {
         //
         // BIN0 not held
         //
         assertThrownBy("com.sleepycat.je.latch.Java5LatchImpl", e);
      }
  }

  @Test
  public void test21()  throws Throwable  {
      BIN bIN0 = new BIN();
      DBIN dBIN0 = new DBIN();
      try { 
        dBIN0.hook603(bIN0);
        fail("Expecting exception: LatchNotHeldException");
      
      } catch(LatchNotHeldException e) {
         //
         // BIN0 not held
         //
         assertThrownBy("com.sleepycat.je.latch.Java5LatchImpl", e);
      }
  }

  @Test
  public void test22()  throws Throwable  {
      BIN bIN0 = new BIN();
      // Undeclared exception!
      try { 
        bIN0.getChildKey((IN) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.BIN", e);
      }
  }

  @Test
  public void test23()  throws Throwable  {
      BIN bIN0 = new BIN();
      // Undeclared exception!
      try { 
        bIN0.getChildEvictionType();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.BIN", e);
      }
  }

  @Test
  public void test24()  throws Throwable  {
      // Undeclared exception!
      try { 
        BIN.computeOverhead((DbConfigManager) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.IN", e);
      }
  }

  @Test
  public void test25()  throws Throwable  {
      DBIN dBIN0 = new DBIN();
      DatabaseId databaseId0 = new DatabaseId((-1622));
      byte[] byteArray0 = new byte[18];
      BINReference bINReference0 = new BINReference(1252, databaseId0, byteArray0);
      // Undeclared exception!
      try { 
        dBIN0.compress(bINReference0, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.BIN", e);
      }
  }

  @Test
  public void test27()  throws Throwable  {
      DatabaseImpl databaseImpl0 = new DatabaseImpl();
      byte[] byteArray0 = new byte[9];
      BIN bIN0 = null;
      try {
        bIN0 = new BIN(databaseImpl0, byteArray0, (int) (byte) (-36), 0);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.IN", e);
      }
  }

  @Test
  public void test28()  throws Throwable  {
      BIN bIN0 = new BIN();
      String string0 = bIN0.shortClassName();
      assertEquals((-1L), bIN0.getLastDeltaVersion());
      assertEquals("BIN", string0);
  }

  @Test
  public void test29()  throws Throwable  {
      DBIN dBIN0 = new DBIN();
      dBIN0.nCursors();
      assertEquals((-1L), dBIN0.getLastDeltaVersion());
  }

  @Test
  public void test30()  throws Throwable  {
      BIN bIN0 = new BIN();
      bIN0.isSoughtNode(1252, false);
      // Undeclared exception!
      try { 
        bIN0.evictLNs();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.BIN", e);
      }
  }

  @Test
  public void test31()  throws Throwable  {
      BIN bIN0 = new BIN();
      bIN0.latchNoWait();
      boolean boolean0 = bIN0.isValidForDelete();
      //  // Unstable assertion: assertEquals(442L, bIN0.getGeneration());
      //  // Unstable assertion: assertTrue(boolean0);
  }

  @Test
  public void test32()  throws Throwable  {
      DBIN dBIN0 = new DBIN();
      // Undeclared exception!
      try { 
        dBIN0.hook607(536, 1, true);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 536
         //
         assertThrownBy("com.sleepycat.je.tree.IN", e);
      }
  }

  @Test
  public void test33()  throws Throwable  {
      BIN bIN0 = new BIN();
      // Undeclared exception!
      try { 
        bIN0.hook607((-790), 536, true);
        fail("Expecting exception: ReturnBoolean");
      
      } catch(ReturnBoolean e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.BIN", e);
      }
  }

  @Test
  public void test34()  throws Throwable  {
      DBIN dBIN0 = new DBIN();
      dBIN0.latch(false);
      dBIN0.adjustCursorsForMutation((-1651), dBIN0, 1252, (CursorImpl) null);
      assertEquals((-1L), dBIN0.getLastDeltaVersion());
  }

  @Test
  public void test36()  throws Throwable  {
      DBIN dBIN0 = new DBIN();
      dBIN0.isSoughtNode(1970L, true);
      dBIN0.adjustCursorsForInsert(224);
      //  // Unstable assertion: assertEquals(226L, dBIN0.getGeneration());
  }

  @Test
  public void test38()  throws Throwable  {
      BIN bIN0 = new BIN();
      bIN0.latchNoWait(true);
      DIN dIN0 = new DIN();
      dIN0.latchNoWait(true);
      bIN0.adjustCursors(dIN0, 3700, 1252);
      //  // Unstable assertion: assertEquals(43L, dIN0.getGeneration());
      //  // Unstable assertion: assertEquals(42L, bIN0.getGeneration());
  }

  @Test
  public void test41()  throws Throwable  {
      BIN bIN0 = new BIN();
      DBIN dBIN0 = new DBIN();
      SearchResult searchResult0 = new SearchResult();
      try { 
        dBIN0.descendOnParentSearch(searchResult0, true, false, 647L, bIN0, false);
        fail("Expecting exception: LatchNotHeldException");
      
      } catch(LatchNotHeldException e) {
         //
         // DBIN0 not held
         //
         assertThrownBy("com.sleepycat.je.latch.Java5LatchImpl", e);
      }
  }

  @Test
  public void test42()  throws Throwable  {
      BIN bIN0 = new BIN();
      DBIN dBIN0 = new DBIN();
      SearchResult searchResult0 = new SearchResult();
      try { 
        dBIN0.descendOnParentSearch(searchResult0, false, false, 67108864L, bIN0, false);
        fail("Expecting exception: LatchNotHeldException");
      
      } catch(LatchNotHeldException e) {
         //
         // DBIN0 not held
         //
         assertThrownBy("com.sleepycat.je.latch.Java5LatchImpl", e);
      }
  }

  @Test
  public void test43()  throws Throwable  {
      DBIN dBIN0 = new DBIN();
      dBIN0.setProhibitNextDelta();
      assertEquals((-1L), dBIN0.getLastDeltaVersion());
  }

  @Test
  public void test44()  throws Throwable  {
      BIN bIN0 = new BIN();
      bIN0.getLogType();
      assertEquals((-1L), bIN0.getLastDeltaVersion());
      assertEquals("BIN", bIN0.shortClassName());
  }

  @Test
  public void test45()  throws Throwable  {
      BIN bIN0 = new BIN();
      bIN0.isSoughtNode(1252, false);
      bIN0.addCursor((CursorImpl) null);
      assertEquals((-1L), bIN0.getLastDeltaVersion());
      assertEquals("BIN", bIN0.shortClassName());
  }

  @Test
  public void test46()  throws Throwable  {
      BIN bIN0 = new BIN();
      bIN0.getBINDeltaType();
      assertEquals("BIN", bIN0.shortClassName());
      assertEquals((-1L), bIN0.getLastDeltaVersion());
  }

  @Test
  public void test47()  throws Throwable  {
      BIN bIN0 = new BIN();
      bIN0.isSoughtNode((-157L), false);
      bIN0.hook605();
      assertEquals((-1L), bIN0.getLastDeltaVersion());
      assertEquals("BIN", bIN0.shortClassName());
  }

  @Test
  public void test48()  throws Throwable  {
      BIN bIN0 = new BIN();
      // Undeclared exception!
      try { 
        bIN0.getKeyComparator();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.BIN", e);
      }
  }

  @Test
  public void test49()  throws Throwable  {
      BIN bIN0 = new BIN();
      // Undeclared exception!
      try { 
        bIN0.getCursorBINToBeRemoved((CursorImpl) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.BIN", e);
      }
  }

  @Test
  public void test50()  throws Throwable  {
      BIN bIN0 = new BIN();
      // Undeclared exception!
      try { 
        bIN0.createReference();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.BIN", e);
      }
  }

  @Test
  public void test51()  throws Throwable  {
      BIN bIN0 = new BIN();
      boolean boolean0 = bIN0.isCompressible();
      assertEquals((-1L), bIN0.getLastDeltaVersion());
      assertEquals("BIN", bIN0.shortClassName());
      assertTrue(boolean0);
  }

  @Test
  public void test52()  throws Throwable  {
      BIN bIN0 = new BIN();
      try { 
        bIN0.hook605();
        fail("Expecting exception: LatchNotHeldException");
      
      } catch(LatchNotHeldException e) {
         //
         // BIN0 not held
         //
         assertThrownBy("com.sleepycat.je.latch.Java5LatchImpl", e);
      }
  }

  @Test
  public void test53()  throws Throwable  {
      BIN bIN0 = new BIN();
      String string0 = bIN0.beginTag();
      assertEquals("<bin>", string0);
      assertEquals((-1L), bIN0.getLastDeltaVersion());
      assertEquals("BIN", bIN0.shortClassName());
  }

  @Test
  public void test54()  throws Throwable  {
      DatabaseImpl databaseImpl0 = new DatabaseImpl();
      byte[] byteArray0 = new byte[1];
      BIN bIN0 = null;
      try {
        bIN0 = new BIN(databaseImpl0, byteArray0, 544, (int) (byte)65);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.IN", e);
      }
  }

  @Test
  public void test55()  throws Throwable  {
      BIN bIN0 = new BIN();
      bIN0.latchNoWait(true);
      bIN0.removeCursor((CursorImpl) null);
      //  // Unstable assertion: assertEquals(32L, bIN0.getGeneration());
  }

  @Test
  public void test56()  throws Throwable  {
      BIN bIN0 = new BIN();
      // Undeclared exception!
      try { 
        bIN0.accumulateStats((TreeWalkerStatsAccumulator) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.BIN", e);
      }
  }

  @Test
  public void test57()  throws Throwable  {
      BIN bIN0 = new BIN();
      // Undeclared exception!
      try { 
        bIN0.setKnownDeletedLeaveTarget(241);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 241
         //
         assertThrownBy("com.sleepycat.je.tree.IN", e);
      }
  }

  @Test
  public void test58()  throws Throwable  {
      BIN bIN0 = new BIN();
      try { 
        bIN0.getChildKey(bIN0);
        fail("Expecting exception: DatabaseException");
      
      } catch(DatabaseException e) {
         //
         // BIN.getDupKey() called
         //
         assertThrownBy("com.sleepycat.je.tree.IN", e);
      }
  }

  @Test
  public void test59()  throws Throwable  {
      DBIN dBIN0 = new DBIN();
      dBIN0.hook601(1L);
      assertEquals((-1L), dBIN0.getInMemorySize());
  }

  @Test
  public void test60()  throws Throwable  {
      BIN bIN0 = new BIN();
      String string0 = bIN0.endTag();
      assertEquals("</bin>", string0);
      assertEquals("BIN", bIN0.shortClassName());
      assertEquals((-1L), bIN0.getLastDeltaVersion());
  }

  @Test
  public void test61()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = new EnvironmentConfig();
      DbConfigManager dbConfigManager0 = new DbConfigManager(environmentConfig0);
      long long0 = BIN.computeOverhead(dbConfigManager0);
      assertEquals(2728L, long0);
  }

  @Test
  public void test62()  throws Throwable  {
      BIN bIN0 = new BIN();
      long long0 = bIN0.getLastDeltaVersion();
      assertEquals("BIN", bIN0.shortClassName());
      assertEquals((-1L), long0);
  }

  @Test
  public void test63()  throws Throwable  {
      BIN bIN0 = new BIN();
      try { 
        bIN0.hook604();
        fail("Expecting exception: LatchNotHeldException");
      
      } catch(LatchNotHeldException e) {
         //
         // BIN0 not held
         //
         assertThrownBy("com.sleepycat.je.latch.Java5LatchImpl", e);
      }
  }

  @Test
  public void test64()  throws Throwable  {
      BIN bIN0 = new BIN();
      boolean boolean0 = bIN0.canBeAncestor(true);
      assertEquals((-1L), bIN0.getLastDeltaVersion());
      assertTrue(boolean0);
      assertEquals("BIN", bIN0.shortClassName());
  }

  @Test
  public void test65()  throws Throwable  {
      BIN bIN0 = new BIN();
      // Undeclared exception!
      try { 
        bIN0.setCursorIndex((CursorImpl) null, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.BIN", e);
      }
  }

  @Test
  public void test66()  throws Throwable  {
      BIN bIN0 = new BIN();
      boolean boolean0 = bIN0.entryZeroKeyComparesLow();
      assertEquals((-1L), bIN0.getLastDeltaVersion());
      assertFalse(boolean0);
      assertEquals("BIN", bIN0.shortClassName());
  }

  @Test
  public void test67()  throws Throwable  {
      BIN bIN0 = new BIN();
      byte[] byteArray0 = new byte[2];
      // Undeclared exception!
      try { 
        bIN0.createNewInstance(byteArray0, 218, 218);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.IN", e);
      }
  }

  @Test
  public void test68()  throws Throwable  {
      BIN bIN0 = new BIN();
      // Undeclared exception!
      try { 
        bIN0.getCursorBIN((CursorImpl) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.BIN", e);
      }
  }

  @Test
  public void test69()  throws Throwable  {
      BIN bIN0 = new BIN();
      bIN0.hook602(26L);
      assertEquals((-26L), bIN0.getInMemorySize());
  }

  @Test
  public void test70()  throws Throwable  {
      DBIN dBIN0 = new DBIN();
      // Undeclared exception!
      try { 
        dBIN0.evictLN(2706);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.BIN", e);
      }
  }

  @Test
  public void test71()  throws Throwable  {
      DBIN dBIN0 = new DBIN();
      // Undeclared exception!
      try { 
        dBIN0.setKnownDeleted(1252);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1252
         //
         assertThrownBy("com.sleepycat.je.tree.IN", e);
      }
  }

  @Test
  public void test72()  throws Throwable  {
      DBIN dBIN0 = new DBIN();
      dBIN0.getCursorSet();
      assertEquals((-1L), dBIN0.getLastDeltaVersion());
  }

  @Test
  public void test73()  throws Throwable  {
      BIN bIN0 = new BIN();
      // Undeclared exception!
      try { 
        bIN0.getCursorIndex((CursorImpl) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.BIN", e);
      }
  }

  @Test
  public void test74()  throws Throwable  {
      DBIN dBIN0 = new DBIN();
      boolean boolean0 = dBIN0.validateSubtreeBeforeDelete(1252);
      assertTrue(boolean0);
      assertEquals((-1L), dBIN0.getLastDeltaVersion());
  }

  @Test
  public void test75()  throws Throwable  {
      DBIN dBIN0 = new DBIN();
      DIN dIN0 = new DIN();
      dIN0.latch();
      // Undeclared exception!
      try { 
        dBIN0.descendOnParentSearch((SearchResult) null, true, true, 1422L, dIN0, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.BIN", e);
      }
  }

  @Test
  public void test76()  throws Throwable  {
      BIN bIN0 = new BIN();
      // Undeclared exception!
      try { 
        bIN0.setCursorBIN((CursorImpl) null, (BIN) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.BIN", e);
      }
  }

  @Test
  public void test77()  throws Throwable  {
      BIN bIN0 = new BIN();
      NameLN nameLN0 = new NameLN();
      // Undeclared exception!
      try { 
        bIN0.hook603(nameLN0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // com.sleepycat.je.tree.NameLN cannot be cast to com.sleepycat.je.tree.IN
         //
         assertThrownBy("com.sleepycat.je.tree.BIN", e);
      }
  }

  
}
