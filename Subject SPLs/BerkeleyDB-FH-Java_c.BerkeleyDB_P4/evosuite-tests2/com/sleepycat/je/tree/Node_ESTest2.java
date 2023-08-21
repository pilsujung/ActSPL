/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 01:57:47 KST 2017
 */

package com.sleepycat.je.tree;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.io.StringWriter;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.sleepycat.je.DatabaseEntry;
import com.sleepycat.je.DatabaseException;
import com.sleepycat.je.dbi.DatabaseImpl;
import com.sleepycat.je.dbi.INList;

import sun.nio.cs.ext.MS949;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class Node_ESTest2 extends Node_ESTest_scaffolding2 {

  @Test
  public void test00()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0);
      LN lN0 = new LN(databaseEntry0);
      lN0.getMemorySizeIncludedByParent();
      //  // Unstable assertion: assertEquals(1002253L, lN0.getNodeId());
  }

  @Test
  public void test01()  throws Throwable  {
      NameLN nameLN0 = new NameLN();
      Node.getNextNodeId();
      Node.setLastNodeId(1002252L);
      nameLN0.getLevel();
      StringWriter stringWriter0 = new StringWriter();
      char[] charArray0 = new char[1];
      // Undeclared exception!
      try { 
        stringWriter0.write(charArray0, (-1709), 2145502574);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.io.StringWriter", e);
      }
  }

  @Test
  public void test02()  throws Throwable  {
      DBIN dBIN0 = new DBIN();
      String string0 = dBIN0.dumpString(15, false);
      //  // Unstable assertion: assertEquals("               <dbin>\n                 <dupkey></dupkey>\n                 <node>0</node>\n                 <idkey><key v=\"\"/></idkey>\n                 <dirty val=\"false\"/>\n                 <generation val=\"0\"/>\n                 <level val=\"0\"/>\n                 <isRoot val=\"false\"/>\n                 <entries nEntries=\"0\">\n                 </entries>\n               </dbin>", string0);
      //  // Unstable assertion: assertEquals(1L, dBIN0.getLastId());
  }

  @Test
  public void test03()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      LN lN0 = new LN(byteArray0);
      INList iNList0 = null;
      lN0.rebuildINList(iNList0);
      //  // Unstable assertion: assertEquals(1L, lN0.getLastId());
  }

  @Test
  public void test04()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      LN lN0 = new LN(byteArray0);
      boolean boolean0 = lN0.containsDuplicates();
      //  // Unstable assertion: assertEquals(18L, lN0.getLastId());
      //  // Unstable assertion: assertFalse(boolean0);
  }

  @Test
  public void test05()  throws Throwable  {
      DBIN dBIN0 = new DBIN();
      dBIN0.canBeAncestor(false);
      //  // Unstable assertion: assertEquals(16L, dBIN0.getLastId());
  }

  @Test
  public void test06()  throws Throwable  {
      BIN bIN0 = new BIN();
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode(">*a]T7's@/`");
      // Undeclared exception!
      try { 
        bIN0.writeToLog(byteBuffer0);
        fail("Expecting exception: BufferOverflowException");
      
      } catch(BufferOverflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.nio.Buffer", e);
      }
  }

  @Test
  public void test07()  throws Throwable  {
      DupCountLN dupCountLN0 = new DupCountLN();
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("<#'DFx><PSV_#827Q#r");
      dupCountLN0.readFromLog(byteBuffer0, (byte)49);
      //  // Unstable assertion: assertEquals(14L, dupCountLN0.getLastId());
  }

  @Test
  public void test08()  throws Throwable  {
      DIN dIN0 = new DIN();
      dIN0.dump((byte)116);
      //  // Unstable assertion: assertEquals(13L, dIN0.getLastId());
  }

  @Test
  public void test09()  throws Throwable  {
      DupCountLN dupCountLN0 = new DupCountLN();
      // Undeclared exception!
      try { 
        dupCountLN0.readFromLog((ByteBuffer) null, (byte) (-44));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.LogUtils", e);
      }
  }

  @Test
  public void test10()  throws Throwable  {
      DIN dIN0 = new DIN();
      // Undeclared exception!
      try { 
        dIN0.postFetchInit((DatabaseImpl) null, 29L);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.IN", e);
      }
  }

  @Test
  public void test11()  throws Throwable  {
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
  public void test12()  throws Throwable  {
      FileSummaryLN fileSummaryLN0 = new FileSummaryLN();
      // Undeclared exception!
      try { 
        fileSummaryLN0.dumpString((-1982), false);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -1980
         //
         assertThrownBy("java.lang.String", e);
      }
  }

  @Test
  public void test13()  throws Throwable  {
      BIN bIN0 = new BIN();
      // Undeclared exception!
      try { 
        bIN0.dumpLog((StringBuffer) null, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.IN", e);
      }
  }

  @Test
  public void test14()  throws Throwable  {
      DIN dIN0 = new DIN();
      dIN0.getType();
      //  // Unstable assertion: assertEquals(7L, dIN0.getLastId());
  }

  @Test
  public void test15()  throws Throwable  {
      BIN bIN0 = new BIN();
      // Undeclared exception!
      try { 
        bIN0.writeToLog((ByteBuffer) null);
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
      byte[] byteArray0 = new byte[9];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0);
      LN lN0 = new LN(databaseEntry0);
      int int0 = lN0.getLogSize();
      //  // Unstable assertion: assertEquals(1L, lN0.getNodeId());
      //  // Unstable assertion: assertEquals(22, int0);
  }

  @Test
  public void test17()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      LN lN0 = new LN(byteArray0);
      lN0.verify(byteArray0);
      //  // Unstable assertion: assertEquals(4L, lN0.getNodeId());
  }

  @Test
  public void test18()  throws Throwable  {
      FileSummaryLN fileSummaryLN0 = new FileSummaryLN();
      // Undeclared exception!
      try { 
        fileSummaryLN0.dump((-700));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -700
         //
         assertThrownBy("java.lang.String", e);
      }
  }

  @Test
  public void test19()  throws Throwable  {
      FileSummaryLN fileSummaryLN0 = new FileSummaryLN();
      StringWriter stringWriter0 = new StringWriter();
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      fileSummaryLN0.dumpLog(stringBuffer0, true);
      assertEquals("<fileSummaryLN><node>0</node></fileSummaryLN>", stringBuffer0.toString());
      assertEquals("<fileSummaryLN><node>0</node></fileSummaryLN>", stringWriter0.toString());
  }

  @Test
  public void test20()  throws Throwable  {
      BIN bIN0 = new BIN();
      bIN0.shortDescription();
      //  // Unstable assertion: assertEquals(0L, bIN0.getLastId());
  }

  @Test
  public void test21()  throws Throwable  {
      long long0 = Node.getLastId();
      //  // Unstable assertion: assertEquals(0L, long0);
  }

  @Test
  public void test22()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0);
      LN lN0 = new LN(databaseEntry0);
      lN0.toString();
      //  // Unstable assertion: assertEquals(3L, lN0.getNodeId());
  }

  @Test
  public void test23()  throws Throwable  {
      BIN bIN0 = new BIN();
      bIN0.postLogWork(845L);
      //  // Unstable assertion: assertEquals(1L, bIN0.getLastId());
  }

  @Test
  public void test24()  throws Throwable  {
      MapLN mapLN0 = new MapLN((DatabaseImpl) null);
      boolean boolean0 = mapLN0.marshallOutsideWriteLatch();
      //  // Unstable assertion: assertEquals(3L, mapLN0.getNodeId());
      //  // Unstable assertion: assertTrue(boolean0);
  }

  @Test
  public void test25()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0);
      LN lN0 = new LN(databaseEntry0);
      lN0.setNodeId((byte)0);
      //  // Unstable assertion: assertEquals(7L, lN0.getLastId());
  }

  @Test
  public void test26()  throws Throwable  {
      DupCountLN dupCountLN0 = new DupCountLN();
      DatabaseImpl databaseImpl0 = new DatabaseImpl();
      dupCountLN0.postFetchInit(databaseImpl0, 0);
      //  // Unstable assertion: assertEquals(1L, dupCountLN0.getLastId());
  }

  @Test
  public void test27()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      LN lN0 = new LN(byteArray0);
      TreeLocation treeLocation0 = new TreeLocation();
      try { 
        lN0.matchLNByNodeId(treeLocation0, 3351L);
        fail("Expecting exception: DatabaseException");
      
      } catch(DatabaseException e) {
         //
         // matchLNByNodeId called on non DIN/DBIN
         //
         assertThrownBy("com.sleepycat.je.tree.Node", e);
      }
  }

  @Test
  public void test28()  throws Throwable  {
      BIN bIN0 = new BIN();
      boolean boolean0 = bIN0.countAsObsoleteWhenLogged();
      //  // Unstable assertion: assertEquals(1L, bIN0.getLastId());
      //  // Unstable assertion: assertFalse(boolean0);
  }

  @Test
  public void test29()  throws Throwable  {
      BIN bIN0 = new BIN();
      long long0 = bIN0.getMemorySizeIncludedByParent();
      //  // Unstable assertion: assertEquals(0L, long0);
      //  // Unstable assertion: assertEquals(0L, bIN0.getLastId());
  }
}
