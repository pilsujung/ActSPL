/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 21 20:18:15 KST 2017
 */

package com.sleepycat.je.tree;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.File;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.sleepycat.je.DatabaseException;
import com.sleepycat.je.EnvironmentConfig;
import com.sleepycat.je.dbi.CursorImpl;
import com.sleepycat.je.dbi.DatabaseId;
import com.sleepycat.je.dbi.DatabaseImpl;
import com.sleepycat.je.dbi.EnvironmentImpl;
import com.sleepycat.je.log.LogManager;

import de.ovgu.cide.jakutil.ReturnBoolean;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class BIN_ESTest1 extends BIN_ESTest_scaffolding1 {

  @Test
  public void test02()  throws Throwable  {
      DBIN dBIN0 = new DBIN();
      dBIN0.canBeAncestor(true);
      assertEquals((-1L), dBIN0.getLastDeltaVersion());
  }

  @Test
  public void test04()  throws Throwable  {
      BIN bIN0 = new BIN();
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
  public void test05()  throws Throwable  {
      BIN bIN0 = new BIN();
      byte[] byteArray0 = new byte[1];
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
  public void test06()  throws Throwable  {
      DBIN dBIN0 = new DBIN();
      // Undeclared exception!
      try { 
        dBIN0.descendOnParentSearch((SearchResult) null, false, false, 1899L, dBIN0, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.BIN", e);
      }
  }

  @Test
  public void test08()  throws Throwable  {
      BIN bIN0 = new BIN();
      SearchResult searchResult0 = new SearchResult();
      // Undeclared exception!
      try { 
        bIN0.getChildKey(searchResult0.parent);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.BIN", e);
      }
  }

  @Test
  public void test09()  throws Throwable  {
      BIN bIN0 = new BIN();
      bIN0.nCursors();
      assertEquals((-1L), bIN0.getLastDeltaVersion());
  }

  @Test
  public void test14()  throws Throwable  {
      BIN bIN0 = new BIN();
      boolean boolean0 = bIN0.entryZeroKeyComparesLow();
      assertEquals((-1L), bIN0.getLastDeltaVersion());
      assertFalse(boolean0);
  }

  @Test
  public void test15()  throws Throwable  {
      BIN bIN0 = new BIN();
      boolean boolean0 = bIN0.canBeAncestor(true);
      assertEquals((-1L), bIN0.getLastDeltaVersion());
      assertTrue(boolean0);
  }

  @Test
  public void test16()  throws Throwable  {
      DBIN dBIN0 = new DBIN();
      dBIN0.adjustCursors(dBIN0, 65536, 65536);
      assertEquals((-1L), dBIN0.getLastDeltaVersion());
  }

  @Test
  public void test17()  throws Throwable  {
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
  public void test22()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      BIN bIN0 = null;
      try {
        bIN0 = new BIN((DatabaseImpl) null, byteArray0, (-2087), (int) (byte)14);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.IN", e);
      }
  }

  @Test
  public void test23()  throws Throwable  {
      DatabaseImpl databaseImpl0 = new DatabaseImpl();
      byte[] byteArray0 = new byte[7];
      BIN bIN0 = null;
      try {
        bIN0 = new BIN(databaseImpl0, byteArray0, (-250), (-596));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.IN", e);
      }
  }

  @Test
  public void test24()  throws Throwable  {
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
  public void test25()  throws Throwable  {
      BIN bIN0 = new BIN();
      String string0 = bIN0.shortClassName();
      assertEquals((-1L), bIN0.getLastDeltaVersion());
      assertEquals("BIN", string0);
  }

  @Test
  public void test28()  throws Throwable  {
      BIN bIN0 = new BIN();
      bIN0.adjustCursorsForInsert((-2591));
      assertEquals((-1L), bIN0.getLastDeltaVersion());
  }

  @Test
  public void test31()  throws Throwable  {
      BIN bIN0 = new BIN();
      boolean boolean0 = bIN0.hasNonLNChildren();
      assertFalse(boolean0);
      assertEquals((-1L), bIN0.getLastDeltaVersion());
  }

  @Test
  public void test32()  throws Throwable  {
      DBIN dBIN0 = new DBIN();
      boolean boolean0 = dBIN0.isEvictionProhibited();
      assertFalse(boolean0);
      assertEquals((-1L), dBIN0.getLastDeltaVersion());
  }

  @Test
  public void test36()  throws Throwable  {
      BIN bIN0 = new BIN();
      SearchResult searchResult0 = new SearchResult();
      // Undeclared exception!
      try { 
        bIN0.descendOnParentSearch(searchResult0, false, false, 2083L, (Node) null, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.BIN", e);
      }
  }

  @Test
  public void test37()  throws Throwable  {
      DBIN dBIN0 = new DBIN();
      long long0 = dBIN0.getLastDeltaVersion();
      assertEquals((-1L), long0);
  }

  @Test
  public void test38()  throws Throwable  {
      DBIN dBIN0 = new DBIN();
      dBIN0.setProhibitNextDelta();
      assertEquals((-1L), dBIN0.getLastDeltaVersion());
  }

  @Test
  public void test39()  throws Throwable  {
      BIN bIN0 = new BIN();
      SearchResult searchResult0 = new SearchResult();
      searchResult0.parent = (IN) bIN0;
      try { 
        bIN0.getChildKey(searchResult0.parent);
        fail("Expecting exception: DatabaseException");
      
      } catch(DatabaseException e) {
         //
         // BIN.getDupKey() called
         //
         assertThrownBy("com.sleepycat.je.tree.IN", e);
      }
  }

  @Test
  public void test40()  throws Throwable  {
      BIN bIN0 = new BIN();
      // Undeclared exception!
      try { 
        bIN0.clearKnownDeleted((-65537));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -65537
         //
         assertThrownBy("com.sleepycat.je.tree.IN", e);
      }
  }

  @Test
  public void test43()  throws Throwable  {
      BIN bIN0 = new BIN();
      // Undeclared exception!
      try { 
        bIN0.setCursorIndex((CursorImpl) null, (-2002));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.BIN", e);
      }
  }

  @Test
  public void test45()  throws Throwable  {
      BIN bIN0 = new BIN();
      byte[] byteArray0 = new byte[8];
      // Undeclared exception!
      try { 
        bIN0.createNewInstance(byteArray0, (byte) (-16), 169);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.IN", e);
      }
  }

  @Test
  public void test47()  throws Throwable  {
      BIN bIN0 = new BIN();
      bIN0.getBINDeltaType();
      assertEquals((-1L), bIN0.getLastDeltaVersion());
  }

  @Test
  public void test48()  throws Throwable  {
      BIN bIN0 = new BIN();
      bIN0.removeCursor((CursorImpl) null);
      assertEquals((-1L), bIN0.getLastDeltaVersion());
  }

  @Test
  public void test49()  throws Throwable  {
      BIN bIN0 = new BIN();
      byte[] byteArray0 = new byte[8];
      // Undeclared exception!
      try { 
        bIN0.splitSpecial((IN) null, (-185), 75, byteArray0, false);
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
  public void test52()  throws Throwable  {
      BIN bIN0 = new BIN();
      boolean boolean0 = bIN0.isCompressible();
      assertTrue(boolean0);
      assertEquals((-1L), bIN0.getLastDeltaVersion());
  }

  @Test
  public void test53()  throws Throwable  {
      BIN bIN0 = new BIN();
      bIN0.isValidForDelete();
      DatabaseId databaseId0 = new DatabaseId();
      byte[] byteArray0 = new byte[8];
      // Undeclared exception!
      try { 
        bIN0.createNewInstance(byteArray0, (byte) (-16), 169);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.IN", e);
      }
  }

  @Test
  public void test54()  throws Throwable  {
      DBIN dBIN0 = new DBIN();
      // Undeclared exception!
      try { 
        dBIN0.setKnownDeleted(45);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 45
         //
         assertThrownBy("com.sleepycat.je.tree.IN", e);
      }
  }

  @Test
  public void test55()  throws Throwable  {
      BIN bIN0 = new BIN();
      String string0 = bIN0.beginTag();
      assertEquals((-1L), bIN0.getLastDeltaVersion());
      assertEquals("<bin>", string0);
  }

  @Test
  public void test56()  throws Throwable  {
      BIN bIN0 = new BIN();
      bIN0.getCursorSet();
      assertEquals((-1L), bIN0.getLastDeltaVersion());
  }

  @Test
  public void test57()  throws Throwable  {
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
  public void test58()  throws Throwable  {
      BIN bIN0 = new BIN();
      boolean boolean0 = bIN0.validateSubtreeBeforeDelete(0);
      assertTrue(boolean0);
      assertEquals((-1L), bIN0.getLastDeltaVersion());
  }

  @Test
  public void test59()  throws Throwable  {
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
  public void test61()  throws Throwable  {
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
  public void test62()  throws Throwable  {
      DBIN dBIN0 = new DBIN();
      // Undeclared exception!
      try { 
        dBIN0.setKnownDeletedLeaveTarget((-2493));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2493
         //
         assertThrownBy("com.sleepycat.je.tree.IN", e);
      }
  }

  @Test
  public void test63()  throws Throwable  {
      BIN bIN0 = new BIN();
      bIN0.addCursor((CursorImpl) null);
      assertEquals((-1L), bIN0.getLastDeltaVersion());
  }

  @Test
  public void test65()  throws Throwable  {
      BIN bIN0 = new BIN();
      String string0 = bIN0.endTag();
      assertEquals((-1L), bIN0.getLastDeltaVersion());
      assertEquals("</bin>", string0);
  }
}
