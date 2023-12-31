/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 21 20:30:14 KST 2017
 */

package com.sleepycat.je.tree;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.StringWriter;
import java.nio.BufferOverflowException;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.sleepycat.je.DatabaseException;
import com.sleepycat.je.dbi.DatabaseId;
import com.sleepycat.je.dbi.DatabaseImpl;
import com.sleepycat.je.log.LogManager;
import com.sleepycat.je.txn.LockResult;
import com.sleepycat.je.txn.Txn;

import sun.nio.cs.ext.MS949;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class DIN_ESTest1 extends DIN_ESTest_scaffolding1 {

  @Test
  public void test00()  throws Throwable  {
      DIN dIN0 = new DIN();
      byte[] byteArray0 = new byte[1];
      byte[] byteArray1 = dIN0.selectKey(byteArray0, (byte[]) null);
      assertNull(byteArray1);
      assertEquals(0, dIN0.getLevel());
      assertTrue(dIN0.needsSplitting());
  }

  @Test
  public void test01()  throws Throwable  {
      DatabaseImpl databaseImpl0 = new DatabaseImpl();
      byte[] byteArray0 = new byte[6];
      ChildReference childReference0 = new ChildReference();
      DIN dIN0 = new DIN(databaseImpl0, byteArray0, 10, byteArray0, childReference0, (int) (byte)14);
      dIN0.getMainTreeKey();
      //  // Unstable assertion: assertEquals(1021L, dIN0.getNodeId());
  }

  @Test
  public void test02()  throws Throwable  {
      DatabaseImpl databaseImpl0 = new DatabaseImpl();
      byte[] byteArray0 = new byte[7];
      NameLN nameLN0 = new NameLN((DatabaseId) null);
      ChildReference childReference0 = new ChildReference((Node) nameLN0, byteArray0, (long) (byte) (-13), (byte) (-108));
      DIN dIN0 = new DIN(databaseImpl0, byteArray0, 0, byteArray0, childReference0, (int) (byte) (-73));
      dIN0.getDupTreeKey();
      //  // Unstable assertion: assertEquals(980L, dIN0.getLastId());
  }

  @Test
  public void test03()  throws Throwable  {
      DatabaseImpl databaseImpl0 = new DatabaseImpl();
      byte[] byteArray0 = new byte[2];
      ChildReference childReference0 = new ChildReference();
      DIN dIN0 = new DIN(databaseImpl0, byteArray0, (int) (byte)60, byteArray0, childReference0, (int) (byte)1);
      dIN0.getDupKey();
      //  // Unstable assertion: assertEquals(951L, dIN0.getNodeId());
  }

  @Test
  public void test04()  throws Throwable  {
      DIN dIN0 = new DIN();
      DatabaseImpl databaseImpl0 = new DatabaseImpl();
      byte[] byteArray0 = new byte[9];
      DBIN dBIN0 = new DBIN(databaseImpl0, byteArray0, (int) (byte)13, byteArray0, 0);
      dIN0.getChildKey(dBIN0);
      //  // Unstable assertion: assertEquals(945L, dBIN0.getNodeId());
      //  // Unstable assertion: assertEquals(945L, dIN0.getLastId());
  }

  @Test
  public void test05()  throws Throwable  {
      DIN dIN0 = new DIN();
      DatabaseId databaseId0 = new DatabaseId();
      int int0 = dIN0.generateLevel(databaseId0, 0);
      assertEquals(0, int0);
      assertTrue(dIN0.needsSplitting());
      assertEquals(0, dIN0.getLevel());
  }

  @Test
  public void test06()  throws Throwable  {
      DIN dIN0 = new DIN();
      byte[] byteArray0 = new byte[1];
      byte[] byteArray1 = dIN0.selectKey((byte[]) null, byteArray0);
      assertTrue(dIN0.needsSplitting());
      assertNotNull(byteArray1);
      assertEquals(0, dIN0.getLevel());
  }

  @Test
  public void test08()  throws Throwable  {
      DatabaseImpl databaseImpl0 = new DatabaseImpl();
      byte[] byteArray0 = new byte[4];
      ChildReference childReference0 = new ChildReference((Node) null, byteArray0, 2130L);
      DIN dIN0 = new DIN(databaseImpl0, byteArray0, 1950, byteArray0, childReference0, 4);
      dIN0.getKeyComparator();
      //  // Unstable assertion: assertEquals(917L, dIN0.getNodeId());
  }

  @Test
  public void test09()  throws Throwable  {
      DIN dIN0 = new DIN();
      DatabaseId databaseId0 = new DatabaseId();
      int int0 = dIN0.generateLevel(databaseId0, (-1));
      assertTrue(dIN0.needsSplitting());
      assertEquals((-1), int0);
      assertEquals(0, dIN0.getLevel());
  }

  @Test
  public void test10()  throws Throwable  {
      DIN dIN0 = new DIN();
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("g");
      // Undeclared exception!
      try { 
        dIN0.writeToLog(byteBuffer0);
        fail("Expecting exception: BufferOverflowException");
      
      } catch(BufferOverflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.nio.Buffer", e);
      }
  }

  @Test
  public void test11()  throws Throwable  {
      DatabaseImpl databaseImpl0 = new DatabaseImpl();
      byte[] byteArray0 = new byte[3];
      DIN dIN0 = new DIN(databaseImpl0, byteArray0, 4480, byteArray0, (ChildReference) null, (int) (byte)0);
      // Undeclared exception!
      try { 
        dIN0.updateDupCountLNRef((byte)0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.DIN", e);
      }
  }

  @Test
  public void test12()  throws Throwable  {
      DIN dIN0 = new DIN();
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("<din>\n  <dupkey></dupkey>\n    <lsn/>\n    <key v=\"\"/>\n    <target/>\n    <knownDeleted val=\"false\"/><pendingDeleted val=\"false\"/><dirty val=\"false\"/>\n  <node>0</node>\n  <idkey><key v=\"\"/></idkey>\n  <dirty val=\"false\"/>\n  <generation val=\"0\"/>\n  <level val=\"0\"/>\n  <isRoot val=\"false\"/>\n  <entries nEntries=\"0\">\n  </entries>\n</din>");
      mS949_0.decode(byteBuffer0);
      // Undeclared exception!
      try { 
        dIN0.readFromLog(byteBuffer0, (byte)0);
        fail("Expecting exception: BufferUnderflowException");
      
      } catch(BufferUnderflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.nio.Buffer", e);
      }
  }

  @Test
  public void test13()  throws Throwable  {
      DIN dIN0 = new DIN();
      // Undeclared exception!
      try { 
        dIN0.readFromLog((ByteBuffer) null, (byte)0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.LogUtils", e);
      }
  }

  @Test
  public void test14()  throws Throwable  {
      DIN dIN0 = new DIN();
      DIN.DIN_updateDupCountLN dIN_DIN_updateDupCountLN0 = new DIN.DIN_updateDupCountLN(dIN0, dIN0);
      Txn txn0 = new Txn();
      // Undeclared exception!
      try { 
        dIN_DIN_updateDupCountLN0._this.incrementDuplicateCount((LockResult) null, (byte[]) null, txn0, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.DIN", e);
      }
  }

  @Test
  public void test15()  throws Throwable  {
      DIN dIN0 = new DIN();
      // Undeclared exception!
      try { 
        dIN0.getLogSize();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.LogUtils", e);
      }
  }

  @Test
  public void test16()  throws Throwable  {
      DIN dIN0 = new DIN();
      // Undeclared exception!
      try { 
        dIN0.dumpString(2290, false);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: 2292
         //
         assertThrownBy("java.lang.String", e);
      }
  }

  @Test
  public void test17()  throws Throwable  {
      DIN dIN0 = new DIN();
      // Undeclared exception!
      try { 
        dIN0.dumpLogAdditional((StringBuffer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.DIN", e);
      }
  }

  @Test
  public void test18()  throws Throwable  {
      DIN dIN0 = new DIN();
      byte[] byteArray0 = new byte[1];
      // Undeclared exception!
      try { 
        dIN0.createNewInstance(byteArray0, (-2849), 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.IN", e);
      }
  }

  @Test
  public void test19()  throws Throwable  {
      DatabaseImpl databaseImpl0 = new DatabaseImpl();
      byte[] byteArray0 = new byte[4];
      ChildReference childReference0 = new ChildReference();
      DIN dIN0 = new DIN(databaseImpl0, byteArray0, (int) (byte)127, byteArray0, childReference0, (int) (byte) (-15));
      NameLN nameLN0 = new NameLN();
      DIN.DIN_updateDupCountLN dIN_DIN_updateDupCountLN0 = new DIN.DIN_updateDupCountLN(dIN0, nameLN0);
      // Undeclared exception!
      try { 
        dIN_DIN_updateDupCountLN0._this.createNewInstance(byteArray0, (byte) (-15), (-2627));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.IN", e);
      }
  }

  @Test
  public void test20()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      DIN dIN0 = null;
      try {
        dIN0 = new DIN((DatabaseImpl) null, byteArray0, (-3220), byteArray0, (ChildReference) null, (int) (byte)0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.IN", e);
      }
  }

  @Test
  public void test21()  throws Throwable  {
      DatabaseImpl databaseImpl0 = new DatabaseImpl();
      byte[] byteArray0 = new byte[9];
      LN lN0 = new LN();
      ChildReference childReference0 = new ChildReference((Node) lN0, byteArray0, 0L, (byte)14);
      DIN dIN0 = null;
      try {
        dIN0 = new DIN(databaseImpl0, byteArray0, (-1249), byteArray0, childReference0, 0);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.IN", e);
      }
  }

  @Test
  public void test22()  throws Throwable  {
      DIN dIN0 = new DIN();
      String string0 = dIN0.dumpString(5, true);
      assertEquals("     <din>\n       <dupkey></dupkey>\n         <lsn/>\n         <key v=\"\"/>\n         <target/>\n         <knownDeleted val=\"false\"/><pendingDeleted val=\"false\"/><dirty val=\"false\"/>\n       <node>0</node>\n       <idkey><key v=\"\"/></idkey>\n       <dirty val=\"false\"/>\n       <generation val=\"0\"/>\n       <level val=\"0\"/>\n       <isRoot val=\"false\"/>\n       <entries nEntries=\"0\">\n       </entries>\n     </din>", string0);
      assertTrue(dIN0.needsSplitting());
  }

  @Test
  public void test23()  throws Throwable  {
      DIN dIN0 = new DIN();
      String string0 = dIN0.beginTag();
      assertEquals("<din>", string0);
      assertEquals(0, dIN0.getLevel());
      assertTrue(dIN0.needsSplitting());
  }

  @Test
  public void test24()  throws Throwable  {
      DIN dIN0 = new DIN();
      String string0 = dIN0.endTag();
      assertEquals("</din>", string0);
      assertTrue(dIN0.needsSplitting());
      assertEquals(0, dIN0.getLevel());
  }

  @Test
  public void test25()  throws Throwable  {
      DatabaseImpl databaseImpl0 = new DatabaseImpl();
      byte[] byteArray0 = new byte[4];
      DIN dIN0 = new DIN(databaseImpl0, (byte[]) null, (int) (byte)127, byteArray0, (ChildReference) null, (int) (byte) (-15));
      dIN0.toString();
      //  // Unstable assertion: assertEquals(550L, dIN0.getLastId());
  }

  @Test
  public void test26()  throws Throwable  {
      DatabaseImpl databaseImpl0 = new DatabaseImpl();
      byte[] byteArray0 = new byte[6];
      ChildReference childReference0 = new ChildReference();
      DIN dIN0 = new DIN(databaseImpl0, byteArray0, 10, byteArray0, childReference0, (int) (byte)14);
      dIN0.dumpString((byte)23, false);
      //  // Unstable assertion: assertEquals(400L, dIN0.getLastId());
  }

  @Test
  public void test27()  throws Throwable  {
      DIN dIN0 = new DIN();
      DIN.DIN_updateDupCountLN dIN_DIN_updateDupCountLN0 = new DIN.DIN_updateDupCountLN(dIN0, dIN0);
      StringWriter stringWriter0 = new StringWriter(0);
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      dIN_DIN_updateDupCountLN0._this.dumpLogAdditional(stringBuffer0);
      assertEquals(119, stringBuffer0.length());
      assertEquals(0, dIN0.getLevel());
  }

  @Test
  public void test28()  throws Throwable  {
      DatabaseImpl databaseImpl0 = new DatabaseImpl();
      byte[] byteArray0 = new byte[4];
      ChildReference childReference0 = new ChildReference();
      DIN dIN0 = new DIN(databaseImpl0, byteArray0, (int) (byte)127, byteArray0, childReference0, (int) (byte) (-15));
      NameLN nameLN0 = new NameLN();
      DIN.DIN_updateDupCountLN dIN_DIN_updateDupCountLN0 = new DIN.DIN_updateDupCountLN(dIN0, nameLN0);
      int int0 = dIN_DIN_updateDupCountLN0._this.getLogSize();
      //  // Unstable assertion: assertEquals(248L, nameLN0.getLastId());
      //  // Unstable assertion: assertEquals(56, int0);
  }

  @Test
  public void test29()  throws Throwable  {
      DIN dIN0 = new DIN();
      // Undeclared exception!
      try { 
        dIN0.log((LogManager) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.DIN", e);
      }
  }

  @Test
  public void test30()  throws Throwable  {
      DatabaseImpl databaseImpl0 = new DatabaseImpl();
      byte[] byteArray0 = new byte[7];
      DIN dIN0 = new DIN(databaseImpl0, byteArray0, (int) (byte)0, byteArray0, (ChildReference) null, 0);
      DBIN dBIN0 = new DBIN(databaseImpl0, byteArray0, 1916, byteArray0, (int) (byte)0);
      // Undeclared exception!
      try { 
        dIN0.logInternal((LogManager) null, true, true, false, dBIN0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.IN", e);
      }
  }

  @Test
  public void test31()  throws Throwable  {
      DIN dIN0 = new DIN();
      TreeLocation treeLocation0 = new TreeLocation();
      boolean boolean0 = dIN0.matchLNByNodeId(treeLocation0, (byte) (-61));
      assertEquals(0, dIN0.getLevel());
      assertTrue(dIN0.needsSplitting());
      assertFalse(boolean0);
  }

  @Test
  public void test32()  throws Throwable  {
      DIN dIN0 = new DIN();
      String string0 = dIN0.shortClassName();
      // Undeclared exception!
      try { 
        Charset.forName(string0);
        fail("Expecting exception: UnsupportedCharsetException");
      
      } catch(UnsupportedCharsetException e) {
         //
         // DIN
         //
         assertThrownBy("java.nio.charset.Charset", e);
      }
  }

  @Test
  public void test33()  throws Throwable  {
      DatabaseImpl databaseImpl0 = new DatabaseImpl();
      byte[] byteArray0 = new byte[6];
      ChildReference childReference0 = new ChildReference();
      DIN dIN0 = new DIN(databaseImpl0, byteArray0, 10, byteArray0, childReference0, (int) (byte)14);
      dIN0.createNewInstance(byteArray0, 1, (-386));
      //  // Unstable assertion: assertEquals(51L, dIN0.getLastId());
  }

  @Test
  public void test34()  throws Throwable  {
      DIN dIN0 = new DIN();
      // Undeclared exception!
      try { 
        dIN0.accumulateStats((TreeWalkerStatsAccumulator) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.DIN", e);
      }
  }

  @Test
  public void test35()  throws Throwable  {
      DIN dIN0 = new DIN();
      byte[] byteArray0 = dIN0.getDupTreeKey();
      dIN0.selectKey(byteArray0, byteArray0);
      assertTrue(dIN0.needsSplitting());
      assertEquals(0, dIN0.getLevel());
  }

  @Test
  public void test36()  throws Throwable  {
      DIN dIN0 = new DIN();
      boolean boolean0 = dIN0.isDbRoot();
      assertEquals(0, dIN0.getLevel());
      assertTrue(dIN0.needsSplitting());
      assertFalse(boolean0);
  }

  @Test
  public void test37()  throws Throwable  {
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
  public void test38()  throws Throwable  {
      DIN dIN0 = new DIN();
      dIN0.updateDupCountLNRef(0L);
      assertTrue(dIN0.getDirty());
  }

  @Test
  public void test39()  throws Throwable  {
      DIN dIN0 = new DIN();
      DIN.DIN_updateDupCountLNRefAndNullTarget dIN_DIN_updateDupCountLNRefAndNullTarget0 = new DIN.DIN_updateDupCountLNRefAndNullTarget(dIN0, (-1));
      dIN_DIN_updateDupCountLNRefAndNullTarget0._this.getDupCountLNRef();
      dIN_DIN_updateDupCountLNRefAndNullTarget0.execute();
      assertTrue(dIN0.getDirty());
      assertEquals(0, dIN0.getLevel());
  }

  @Test
  public void test40()  throws Throwable  {
      DIN dIN0 = new DIN();
      dIN0.getMainTreeKey();
      assertTrue(dIN0.needsSplitting());
      assertEquals(0, dIN0.getLevel());
  }

  @Test
  public void test41()  throws Throwable  {
      DIN dIN0 = new DIN();
      DIN.DIN_updateDupCountLN dIN_DIN_updateDupCountLN0 = new DIN.DIN_updateDupCountLN(dIN0, dIN0);
      dIN_DIN_updateDupCountLN0._this.getChildKey(dIN_DIN_updateDupCountLN0._this);
      assertTrue(dIN0.needsSplitting());
      assertEquals(0, dIN0.getLevel());
  }

  @Test
  public void test42()  throws Throwable  {
      DIN dIN0 = new DIN();
      boolean boolean0 = dIN0.containsDuplicates();
      assertTrue(boolean0);
      assertEquals(0, dIN0.getLevel());
      assertTrue(dIN0.needsSplitting());
  }

  @Test
  public void test43()  throws Throwable  {
      DIN dIN0 = new DIN();
      dIN0.getDupKey();
      assertTrue(dIN0.needsSplitting());
      assertEquals(0, dIN0.getLevel());
  }

  @Test
  public void test44()  throws Throwable  {
      DIN dIN0 = new DIN();
      byte[] byteArray0 = new byte[1];
      ChildReference childReference0 = new ChildReference((Node) dIN0, byteArray0, (long) (byte) (-61));
      dIN0.setDupCountLN(childReference0);
      // Undeclared exception!
      try { 
        dIN0.toString();
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: 130
         //
         assertThrownBy("java.lang.String", e);
      }
  }

  @Test
  public void test45()  throws Throwable  {
      DatabaseImpl databaseImpl0 = new DatabaseImpl();
      byte[] byteArray0 = new byte[1];
      ChildReference childReference0 = new ChildReference();
      DIN dIN0 = new DIN(databaseImpl0, byteArray0, 16777215, byteArray0, childReference0, (int) (byte)18);
      dIN0.updateDupCountLNRefAndNullTarget(16777215);
      assertTrue(dIN0.getDirty());
  }

  @Test
  public void test46()  throws Throwable  {
      DIN dIN0 = new DIN();
      // Undeclared exception!
      try { 
        dIN0.getKeyComparator();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.DIN", e);
      }
  }

  @Test
  public void test47()  throws Throwable  {
      DIN dIN0 = new DIN();
      DIN.DIN_updateDupCountLN dIN_DIN_updateDupCountLN0 = new DIN.DIN_updateDupCountLN(dIN0, dIN0);
      dIN_DIN_updateDupCountLN0._this.getLogType();
      assertEquals(0, dIN0.getLevel());
      assertTrue(dIN0.needsSplitting());
  }

  @Test
  public void test48()  throws Throwable  {
      DIN dIN0 = new DIN();
      dIN0.updateDupCountLN(dIN0);
      assertTrue(dIN0.needsSplitting());
      assertEquals(0, dIN0.getLevel());
  }
}
