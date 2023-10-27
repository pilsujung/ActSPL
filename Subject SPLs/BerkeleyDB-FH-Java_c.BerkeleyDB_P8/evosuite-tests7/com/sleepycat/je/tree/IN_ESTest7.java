/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 21 21:23:00 KST 2017
 */

package com.sleepycat.je.tree;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.StringWriter;
import java.nio.BufferOverflowException;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.LinkedList;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.sleepycat.je.DatabaseException;
import com.sleepycat.je.dbi.DatabaseId;
import com.sleepycat.je.dbi.DatabaseImpl;
import com.sleepycat.je.log.LogManager;

import de.ovgu.cide.jakutil.ReturnBoolean;
import sun.nio.cs.ext.MS949;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class IN_ESTest7 extends IN_ESTest_scaffolding7 {

  @Test
  public void test000()  throws Throwable  {
      IN.isStatePendingDeleted((byte) (-29));
  }

  @Test
  public void test001()  throws Throwable  {
      IN.isStateKnownDeleted((byte) (-93));
  }

  @Test
  public void test002()  throws Throwable  {
      DBIN dBIN0 = new DBIN();
      dBIN0.getMainTreeKey();
  }

  @Test
  public void test006()  throws Throwable  {
      BIN bIN0 = new BIN();
      DBIN dBIN0 = new DBIN();
      bIN0.getChildKey(dBIN0);
  }

  @Test
  public void test008()  throws Throwable  {
      DIN dIN0 = new DIN();
      IN.IN_trackProvisionalObsolete iN_IN_trackProvisionalObsolete0 = new IN.IN_trackProvisionalObsolete(dIN0, dIN0, 1130L, 1194);
      iN_IN_trackProvisionalObsolete0.obsoleteLsn1 = (-1586L);
      iN_IN_trackProvisionalObsolete0.execute();
  }

  @Test
  public void test009()  throws Throwable  {
      DIN dIN0 = new DIN();
      IN.IN_validateSubtreeBeforeDelete iN_IN_validateSubtreeBeforeDelete0 = new IN.IN_validateSubtreeBeforeDelete(dIN0, 812);
      iN_IN_validateSubtreeBeforeDelete0.index = 0;
      iN_IN_validateSubtreeBeforeDelete0.execute();
  }

  @Test
  public void test010()  throws Throwable  {
      DIN dIN0 = new DIN();
      dIN0.isSoughtNode((-2871L), true);
  }

  @Test
  public void test013()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      BIN bIN0 = null;
      try {
        bIN0 = new BIN((DatabaseImpl) null, byteArray0, (-2433), (-2476));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.IN", e);
      }
  }

  @Test
  public void test015()  throws Throwable  {
      BIN bIN0 = new BIN();
      byte[] byteArray0 = new byte[5];
      // Undeclared exception!
      try { 
        bIN0.splitInternal(bIN0, (byte)0, (byte)18, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.BIN", e);
      }
  }

  @Test
  public void test017()  throws Throwable  {
      DBIN dBIN0 = new DBIN();
      dBIN0.setLastFullLsn(10L);
  }

  @Test
  public void test018()  throws Throwable  {
      BIN bIN0 = new BIN();
      bIN0.logEntryIsTransactional();
  }

  @Test
  public void test019()  throws Throwable  {
      DBIN dBIN0 = new DBIN();
      dBIN0.isCompressible();
  }

  @Test
  public void test022()  throws Throwable  {
      DIN dIN0 = new DIN();
      dIN0.getDupTreeKey();
  }

  @Test
  public void test023()  throws Throwable  {
      DIN dIN0 = new DIN();
      dIN0.getDupKey();
  }

  @Test
  public void test024()  throws Throwable  {
      DIN dIN0 = new DIN();
      DatabaseId databaseId0 = new DatabaseId();
      dIN0.generateLevel(databaseId0, 3305);
  }

  @Test
  public void test025()  throws Throwable  {
      BIN bIN0 = new BIN();
      bIN0.entryZeroKeyComparesLow();
  }

  @Test
  public void test028()  throws Throwable  {
      IN iN0 = new IN();
      // Undeclared exception!
      try { 
        iN0.log((LogManager) null, false, false, true, iN0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.entry.INLogEntry", e);
      }
  }

  @Test
  public void test029()  throws Throwable  {
      IN iN0 = new IN();
      iN0.dump((byte)0);
  }

  @Test
  public void test030()  throws Throwable  {
      IN iN0 = new IN();
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("o-2qukqc`piD");
      // Undeclared exception!
      try { 
        iN0.writeToLog(byteBuffer0);
        fail("Expecting exception: BufferOverflowException");
      
      } catch(BufferOverflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.nio.Buffer", e);
      }
  }

  @Test
  public void test031()  throws Throwable  {
      IN iN0 = new IN();
      // Undeclared exception!
      try { 
        iN0.writeToLog((ByteBuffer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.LogUtils", e);
      }
  }

  @Test
  public void test033()  throws Throwable  {
      IN iN0 = new IN();
      LN lN0 = new LN();
      // Undeclared exception!
      try { 
        iN0.setTarget(6, lN0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 6
         //
         assertThrownBy("com.sleepycat.je.tree.IN", e);
      }
  }

  @Test
  public void test034()  throws Throwable  {
      DBIN dBIN0 = new DBIN();
      // Undeclared exception!
      try { 
        dBIN0.setLsnElement(2905, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 11620
         //
         assertThrownBy("com.sleepycat.je.tree.IN", e);
      }
  }

  @Test
  public void test036()  throws Throwable  {
      IN iN0 = new IN();
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("4=4UhRTfp%nn!4P$zn");
      // Undeclared exception!
      try { 
        iN0.readFromLog(byteBuffer0, (byte)0);
        fail("Expecting exception: BufferUnderflowException");
      
      } catch(BufferUnderflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.nio.HeapByteBuffer", e);
      }
  }

  @Test
  public void test037()  throws Throwable  {
      IN iN0 = new IN();
      // Undeclared exception!
      try { 
        iN0.isEntryKnownDeleted(0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         assertThrownBy("com.sleepycat.je.tree.IN", e);
      }
  }

  @Test
  public void test038()  throws Throwable  {
      DBIN dBIN0 = new DBIN();
      // Undeclared exception!
      try { 
        dBIN0.isDirty((byte)16);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 16
         //
         assertThrownBy("com.sleepycat.je.tree.IN", e);
      }
  }

  @Test
  public void test039()  throws Throwable  {
      BIN bIN0 = new BIN();
      // Undeclared exception!
      try { 
        bIN0.insertEntry((ChildReference) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.BIN", e);
      }
  }

  @Test
  public void test040()  throws Throwable  {
      IN iN0 = new IN();
      ChildReference childReference0 = new ChildReference();
      try { 
        iN0.insertEntry(childReference0);
        fail("Expecting exception: InconsistentNodeException");
      
      } catch(InconsistentNodeException e) {
         //
         // Node 0 should have been split before calling insertEntry
         //
         assertThrownBy("com.sleepycat.je.tree.IN$IN_insertEntry1", e);
      }
  }

  @Test
  public void test042()  throws Throwable  {
      DIN dIN0 = new DIN();
      // Undeclared exception!
      try { 
        dIN0.getState(0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         assertThrownBy("com.sleepycat.je.tree.IN", e);
      }
  }

  @Test
  public void test044()  throws Throwable  {
      DBIN dBIN0 = new DBIN();
      // Undeclared exception!
      try { 
        dBIN0.getLogSize();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.LogUtils", e);
      }
  }

  @Test
  public void test045()  throws Throwable  {
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
  public void test046()  throws Throwable  {
      IN iN0 = new IN();
      // Undeclared exception!
      try { 
        iN0.getDatabaseId();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.IN", e);
      }
  }

  @Test
  public void test047()  throws Throwable  {
      IN iN0 = new IN();
      byte[] byteArray0 = new byte[4];
      // Undeclared exception!
      try { 
        iN0.findEntry(byteArray0, true, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.IN", e);
      }
  }

  @Test
  public void test048()  throws Throwable  {
      DBIN dBIN0 = new DBIN();
      // Undeclared exception!
      try { 
        dBIN0.fetchTarget((-918));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -918
         //
         assertThrownBy("com.sleepycat.je.tree.IN", e);
      }
  }

  @Test
  public void test049()  throws Throwable  {
      IN iN0 = new IN();
      SearchResult searchResult0 = new SearchResult();
      // Undeclared exception!
      try { 
        iN0.descendOnParentSearch(searchResult0, false, false, (-1), (Node) null, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.IN", e);
      }
  }

  @Test
  public void test050()  throws Throwable  {
      IN iN0 = new IN();
      byte[] byteArray0 = new byte[4];
      // Undeclared exception!
      try { 
        iN0.createNewInstance(byteArray0, (-1095), (byte) (-84));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.IN", e);
      }
  }

  @Test
  public void test052()  throws Throwable  {
      DBIN dBIN0 = new DBIN();
      byte[] byteArray0 = new byte[1];
      DatabaseId databaseId0 = new DatabaseId(65535);
      BINReference bINReference0 = new BINReference((-2853L), databaseId0, byteArray0);
      // Undeclared exception!
      try { 
        dBIN0.compress(bINReference0, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.BIN", e);
      }
  }

  @Test
  public void test053()  throws Throwable  {
      DBIN dBIN0 = new DBIN();
      IN.IN_splitInternal iN_IN_splitInternal0 = new IN.IN_splitInternal(dBIN0, dBIN0, 2215, 2215, 2215);
      // Undeclared exception!
      try { 
        dBIN0.compareTo(iN_IN_splitInternal0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // com.sleepycat.je.tree.IN$IN_splitInternal cannot be cast to com.sleepycat.je.tree.IN
         //
         assertThrownBy("com.sleepycat.je.tree.IN", e);
      }
  }

  @Test
  public void test054()  throws Throwable  {
      IN iN0 = new IN();
      // Undeclared exception!
      try { 
        iN0.clearKnownDeleted(8);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 8
         //
         assertThrownBy("com.sleepycat.je.tree.IN", e);
      }
  }

  @Test
  public void test055()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      IN iN0 = null;
      try {
        iN0 = new IN((DatabaseImpl) null, byteArray0, (int) (byte)3, (int) (byte)0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.IN", e);
      }
  }

  @Test
  public void test056()  throws Throwable  {
      DatabaseImpl databaseImpl0 = new DatabaseImpl();
      byte[] byteArray0 = new byte[0];
      IN iN0 = null;
      try {
        iN0 = new IN(databaseImpl0, byteArray0, (-2575), (-9));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.IN", e);
      }
  }

  @Test
  public void test057()  throws Throwable  {
      BIN bIN0 = new BIN();
      // Undeclared exception!
      try { 
        bIN0.dumpString((-1193), false);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -1191
         //
         assertThrownBy("java.lang.String", e);
      }
  }

  @Test
  public void test058()  throws Throwable  {
      DIN dIN0 = new DIN();
      // Undeclared exception!
      try { 
        dIN0.getLsn((-2340));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -9359
         //
         assertThrownBy("com.sleepycat.je.tree.IN", e);
      }
  }

  @Test
  public void test059()  throws Throwable  {
      IN iN0 = new IN();
      iN0.latch(true);
  }

  @Test
  public void test060()  throws Throwable  {
      IN iN0 = new IN();
      iN0.latch(false);
  }

  @Test
  public void test064()  throws Throwable  {
      DIN dIN0 = new DIN();
      dIN0.getNEntries();
  }

  @Test
  public void test065()  throws Throwable  {
      BIN bIN0 = new BIN();
      // Undeclared exception!
      try { 
        bIN0.getKey(60);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 60
         //
         assertThrownBy("com.sleepycat.je.tree.IN", e);
      }
  }

  @Test
  public void test066()  throws Throwable  {
      BIN bIN0 = new BIN();
      bIN0.getDatabase();
  }

  @Test
  public void test067()  throws Throwable  {
      DBIN dBIN0 = new DBIN();
      dBIN0.getIdentifierKey();
  }

  @Test
  public void test068()  throws Throwable  {
      IN iN0 = new IN();
      // Undeclared exception!
      try { 
        iN0.hook619(false);
        fail("Expecting exception: ReturnBoolean");
      
      } catch(ReturnBoolean e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.IN", e);
      }
  }

  @Test
  public void test072()  throws Throwable  {
      BIN bIN0 = new BIN();
      // Undeclared exception!
      try { 
        bIN0.dumpString(2215, true);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: 2215
         //
         assertThrownBy("java.lang.String", e);
      }
  }

  @Test
  public void test073()  throws Throwable  {
      BIN bIN0 = new BIN();
      bIN0.dumpKeys();
  }

  @Test
  public void test074()  throws Throwable  {
      BIN bIN0 = new BIN();
      bIN0.getLogSize();
  }

  @Test
  public void test075()  throws Throwable  {
      IN iN0 = new IN();
      Tree.SearchType tree_SearchType0 = Tree.SearchType.RIGHT;
      byte[] byteArray0 = new byte[1];
      SearchResult searchResult0 = new SearchResult();
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      iN0.findParent(tree_SearchType0, (-1263L), true, true, byteArray0, byteArray0, searchResult0, false, false, (-2113929215), linkedList0, true);
  }

  @Test
  public void test078()  throws Throwable  {
      BIN bIN0 = new BIN();
      byte[] byteArray0 = new byte[7];
      bIN0.deleteEntry(byteArray0, false);
  }

  @Test
  public void test079()  throws Throwable  {
      DIN dIN0 = new DIN();
      byte[] byteArray0 = new byte[7];
      dIN0.isKeyInBounds(byteArray0);
  }

  @Test
  public void test080()  throws Throwable  {
      DIN dIN0 = new DIN();
      try { 
        dIN0.getDupCountLN();
        fail("Expecting exception: DatabaseException");
      
      } catch(DatabaseException e) {
         //
         // fetchTarget of null lsn IN=0 state=0 NULL_LSN without KnownDeleted
         //
         assertThrownBy("com.sleepycat.je.tree.ChildReference", e);
      }
  }

  @Test
  public void test082()  throws Throwable  {
      IN.isStatePendingDeleted((byte) (-124));
  }

  @Test
  public void test083()  throws Throwable  {
      IN.isStateKnownDeleted((byte)0);
  }

  @Test
  public void test088()  throws Throwable  {
      IN iN0 = new IN();
      iN0.isSoughtNode(30, false);
  }

  @Test
  public void test089()  throws Throwable  {
      DIN dIN0 = new DIN();
      // Undeclared exception!
      try { 
        dIN0.compareTo((Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.IN", e);
      }
  }

  @Test
  public void test090()  throws Throwable  {
      IN iN0 = new IN();
      iN0.equals(iN0);
  }

  @Test
  public void test091()  throws Throwable  {
      DIN dIN0 = new DIN();
      IN.IN_insertEntry1 iN_IN_insertEntry1_0 = new IN.IN_insertEntry1(dIN0, (ChildReference) null);
      iN_IN_insertEntry1_0.hook646();
  }

  @Test
  public void test093()  throws Throwable  {
      DIN dIN0 = new DIN();
      IN.IN_trackProvisionalObsolete iN_IN_trackProvisionalObsolete0 = new IN.IN_trackProvisionalObsolete(dIN0, dIN0, 1130L, (-1193));
      iN_IN_trackProvisionalObsolete0.execute();
      iN_IN_trackProvisionalObsolete0.execute();
  }

  @Test
  public void test094()  throws Throwable  {
      IN iN0 = new IN();
      IN.IN_splitInternal iN_IN_splitInternal0 = new IN.IN_splitInternal(iN0, iN0, (byte)0, (byte)0, (-372));
      iN_IN_splitInternal0.hook617();
  }

  @Test
  public void test098()  throws Throwable  {
      IN iN0 = new IN();
      iN0.getDirty();
  }

  @Test
  public void test099()  throws Throwable  {
      BIN bIN0 = new BIN();
      bIN0.getGeneration();
  }

  @Test
  public void test101()  throws Throwable  {
      DIN dIN0 = new DIN();
      dIN0.validateSubtreeBeforeDelete((byte)39);
  }

  @Test
  public void test102()  throws Throwable  {
      DBIN dBIN0 = new DBIN();
      // Undeclared exception!
      try { 
        dBIN0.split((IN) null, 1299, 4);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.DBIN", e);
      }
  }

  @Test
  public void test103()  throws Throwable  {
      BIN bIN0 = new BIN();
      Tree.SearchType tree_SearchType0 = Tree.SearchType.RIGHT;
      byte[] byteArray0 = new byte[4];
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      // Undeclared exception!
      try { 
        bIN0.findParent(tree_SearchType0, (-531L), true, true, byteArray0, byteArray0, (SearchResult) null, true, true, (byte)0, linkedList0, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.IN", e);
      }
  }

  @Test
  public void test104()  throws Throwable  {
      IN iN0 = new IN();
      iN0.getEntryLsnLongArray();
  }

  @Test
  public void test108()  throws Throwable  {
      BIN bIN0 = new BIN();
      // Undeclared exception!
      try { 
        bIN0.updateEntry(0, (long) 0, (byte) (-120));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         assertThrownBy("com.sleepycat.je.tree.IN", e);
      }
  }

  @Test
  public void test109()  throws Throwable  {
      IN iN0 = new IN();
      iN0.getLogType();
  }

  @Test
  public void test110()  throws Throwable  {
      IN iN0 = new IN();
      // Undeclared exception!
      try { 
        iN0.setPendingDeleted(4781);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 4781
         //
         assertThrownBy("com.sleepycat.je.tree.IN", e);
      }
  }

  @Test
  public void test111()  throws Throwable  {
      BIN bIN0 = new BIN();
      bIN0.getMainTreeKey();
  }

  @Test
  public void test114()  throws Throwable  {
      DBIN dBIN0 = new DBIN();
      // Undeclared exception!
      try { 
        dBIN0.postFetchInit((DatabaseImpl) null, (-2012));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.IN", e);
      }
  }

  @Test
  public void test115()  throws Throwable  {
      DBIN dBIN0 = new DBIN();
      // Undeclared exception!
      try { 
        dBIN0.log((LogManager) null, true, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.BIN", e);
      }
  }

  @Test
  public void test116()  throws Throwable  {
      BIN bIN0 = new BIN();
      DupCountLN dupCountLN0 = new DupCountLN((-512));
      byte[] byteArray0 = new byte[5];
      // Undeclared exception!
      try { 
        bIN0.updateEntry(27, (Node) dupCountLN0, (long) (-512), byteArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 108
         //
         assertThrownBy("com.sleepycat.je.tree.IN", e);
      }
  }

  @Test
  public void test117()  throws Throwable  {
      DBIN dBIN0 = new DBIN();
      dBIN0.setGeneration(1L);
  }

  @Test
  public void test118()  throws Throwable  {
      BIN bIN0 = new BIN();
      byte[] byteArray0 = new byte[1];
      bIN0.setIdentifierKey(byteArray0);
  }

  @Test
  public void test119()  throws Throwable  {
      DIN dIN0 = new DIN();
      dIN0.isSoughtNode(0, true);
  }

  @Test
  public void test120()  throws Throwable  {
      DIN dIN0 = new DIN();
      // Undeclared exception!
      try { 
        dIN0.updateEntry(1458, (long) 1458);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 5832
         //
         assertThrownBy("com.sleepycat.je.tree.IN", e);
      }
  }

  @Test
  public void test122()  throws Throwable  {
      IN iN0 = new IN();
      DIN dIN0 = new DIN();
      iN0.getChildKey(dIN0);
  }

  @Test
  public void test123()  throws Throwable  {
      DIN dIN0 = new DIN();
      dIN0.adjustCursorsForInsert(100);
  }

  @Test
  public void test126()  throws Throwable  {
      IN iN0 = new IN();
      // Undeclared exception!
      try { 
        iN0.updateEntry((-5540), (long) (byte) (-32), (long) (byte) (-32), (-2905L));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -22160
         //
         assertThrownBy("com.sleepycat.je.tree.IN", e);
      }
  }

  @Test
  public void test127()  throws Throwable  {
      IN iN0 = new IN();
      boolean boolean0 = iN0.latchNoWait(true);
      //  // Unstable assertion: assertEquals(69L, iN0.getGeneration());
      //  // Unstable assertion: assertTrue(boolean0);
  }

  @Test
  public void test129()  throws Throwable  {
      DBIN dBIN0 = new DBIN();
      String string0 = dBIN0.toString();
      assertEquals((-1L), dBIN0.getLastFullVersion());
      assertEquals("<dbin>\n  <dupkey></dupkey>\n  <node>0</node>\n  <idkey><key v=\"\"/></idkey>\n  <dirty val=\"false\"/>\n  <generation val=\"0\"/>\n  <level val=\"0\"/>\n  <isRoot val=\"false\"/>\n  <entries nEntries=\"0\">\n  </entries>\n</dbin>", string0);
      assertTrue(dBIN0.needsSplitting());
  }

  @Test
  public void test130()  throws Throwable  {
      DIN dIN0 = new DIN();
      byte[] byteArray0 = dIN0.getEntryLsnByteArray();
      assertFalse(dIN0.isRoot());
      assertEquals(0, dIN0.getLevel());
      assertArrayEquals(new byte[] {}, byteArray0);
      assertTrue(dIN0.needsSplitting());
      assertEquals(0L, dIN0.getGeneration());
      assertFalse(dIN0.getDirty());
      assertEquals((-1L), dIN0.getLastFullVersion());
  }

  @Test
  public void test133()  throws Throwable  {
      IN iN0 = new IN();
      // Undeclared exception!
      try { 
        iN0.trackProvisionalObsolete((IN) null, 98304L, 98304L);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.IN", e);
      }
  }

  @Test
  public void test134()  throws Throwable  {
      DIN dIN0 = new DIN();
      ChildReference childReference0 = new ChildReference();
      try { 
        dIN0.insertEntry1(childReference0);
        fail("Expecting exception: InconsistentNodeException");
      
      } catch(InconsistentNodeException e) {
         //
         // Node 0 should have been split before calling insertEntry
         //
         assertThrownBy("com.sleepycat.je.tree.IN$IN_insertEntry1", e);
      }
  }

  @Test
  public void test136()  throws Throwable  {
      DIN dIN0 = new DIN();
      int int0 = dIN0.compareTo(dIN0);
      assertEquals(0L, dIN0.getGeneration());
      assertEquals((-1L), dIN0.getLastFullVersion());
      assertEquals(0, dIN0.getLevel());
      assertFalse(dIN0.isRoot());
      assertEquals(0, int0);
      assertTrue(dIN0.needsSplitting());
      assertFalse(dIN0.getDirty());
  }

  @Test
  public void test137()  throws Throwable  {
      IN iN0 = new IN();
      iN0.initEntryLsn((byte)0);
      assertEquals(0, iN0.getLevel());
      assertFalse(iN0.isRoot());
      assertTrue(iN0.needsSplitting());
      assertEquals(0L, iN0.getGeneration());
      assertEquals((-1L), iN0.getLastFullVersion());
      assertFalse(iN0.getDirty());
  }

  @Test
  public void test138()  throws Throwable  {
      IN iN0 = new IN();
      // Undeclared exception!
      try { 
        iN0.getTarget((-1318));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1318
         //
         assertThrownBy("com.sleepycat.je.tree.IN", e);
      }
  }

  @Test
  public void test140()  throws Throwable  {
      IN iN0 = new IN();
      // Undeclared exception!
      try { 
        iN0.accumulateStats((TreeWalkerStatsAccumulator) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.IN", e);
      }
  }

  @Test
  public void test143()  throws Throwable  {
      BIN bIN0 = new BIN();
      ChildReference childReference0 = new ChildReference();
      // Undeclared exception!
      try { 
        bIN0.insertEntry1(childReference0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.BIN", e);
      }
  }

  @Test
  public void test144()  throws Throwable  {
      DBIN dBIN0 = new DBIN();
      assertEquals(0, dBIN0.getNEntries());
      
      boolean boolean0 = dBIN0.deleteEntry((-918), true);
      assertEquals((-1L), dBIN0.getLastFullVersion());
      assertEquals(0L, dBIN0.getGeneration());
      assertTrue(dBIN0.needsSplitting());
      assertFalse(dBIN0.getDirty());
      assertEquals(0, dBIN0.getLevel());
      assertFalse(boolean0);
      assertFalse(dBIN0.isRoot());
  }

  @Test
  public void test145()  throws Throwable  {
      IN iN0 = new IN();
      assertFalse(iN0.getDirty());
      
      iN0.setIsRoot(false);
      assertTrue(iN0.getDirty());
  }

  @Test
  public void test152()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(0);
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      IN.dumpDeletedState(stringBuffer0, (byte) (-1));
      assertEquals(54, stringBuffer0.length());
      assertEquals("<knownDeleted val=\"true\"/><pendingDeleted val=\"true\"/>", stringWriter0.toString());
  }

  @Test
  public void test153()  throws Throwable  {
      BIN bIN0 = new BIN();
      StringWriter stringWriter0 = new StringWriter();
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      bIN0.dumpLogAdditional(stringBuffer0);
      assertFalse(bIN0.getDirty());
      assertEquals(0L, bIN0.getGeneration());
      assertTrue(bIN0.needsSplitting());
      assertFalse(bIN0.isRoot());
      assertEquals(0, bIN0.getLevel());
      assertEquals(0, bIN0.getNEntries());
      assertEquals((-1L), bIN0.getLastFullVersion());
  }

  @Test
  public void test154()  throws Throwable  {
      IN iN0 = new IN();
      // Undeclared exception!
      try { 
        iN0.clearPendingDeleted((byte) (-24));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -24
         //
         assertThrownBy("com.sleepycat.je.tree.IN", e);
      }
  }

  @Test
  public void test155()  throws Throwable  {
      IN iN0 = new IN();
      boolean boolean0 = iN0.isDbRoot();
      assertEquals(0L, iN0.getGeneration());
      assertFalse(iN0.getDirty());
      assertTrue(iN0.needsSplitting());
      assertEquals(0, iN0.getLevel());
      assertFalse(boolean0);
      assertEquals((-1L), iN0.getLastFullVersion());
      assertEquals(0, iN0.getNEntries());
  }

  @Test
  public void test157()  throws Throwable  {
      BIN bIN0 = new BIN();
      IN.IN_deleteEntry iN_IN_deleteEntry0 = new IN.IN_deleteEntry(bIN0, 2, false);
      iN_IN_deleteEntry0.hook616();
      assertEquals(0, bIN0.getLevel());
      assertEquals(0, bIN0.getNEntries());
      assertTrue(bIN0.needsSplitting());
      assertFalse(bIN0.isDbRoot());
      assertEquals((-1L), bIN0.getLastFullVersion());
      assertFalse(bIN0.getDirty());
      assertEquals(0L, bIN0.getGeneration());
  }

  
}