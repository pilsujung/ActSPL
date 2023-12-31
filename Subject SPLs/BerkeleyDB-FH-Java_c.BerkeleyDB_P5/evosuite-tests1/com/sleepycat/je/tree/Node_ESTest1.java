/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 21 20:47:05 KST 2017
 */

package com.sleepycat.je.tree;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.io.StringWriter;
import java.nio.BufferOverflowException;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.sleepycat.je.DatabaseConfig;
import com.sleepycat.je.DatabaseException;
import com.sleepycat.je.cleaner.FileSummary;
import com.sleepycat.je.dbi.DatabaseId;
import com.sleepycat.je.dbi.DatabaseImpl;

import sun.nio.cs.ext.MS949;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class Node_ESTest1 extends Node_ESTest_scaffolding1 {

  @Test
  public void test00()  throws Throwable  {
      LN lN0 = new LN();
      long long0 = lN0.getNodeId();
      //  // Unstable assertion: assertEquals(2L, lN0.getLastId());
      //  // Unstable assertion: assertEquals(0L, long0);
  }

  @Test
  public void test01()  throws Throwable  {
      LN lN0 = new LN();
      lN0.setNodeId((-1L));
      lN0.getTransactionalLogType();
      Node.setLastNodeId((-1L));
      lN0.toString();
      lN0.getTransactionalLogType();
      lN0.getNodeId();
      DupCountLN dupCountLN0 = new DupCountLN();
      lN0.toString();
      //  // Unstable assertion: assertEquals((-1L), lN0.getNodeId());
      
      dupCountLN0.shortDescription();
      long long0 = Node.getNextNodeId();
      //  // Unstable assertion: assertEquals(0L, long0);
  }

  @Test
  public void test02()  throws Throwable  {
      DBIN dBIN0 = new DBIN();
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      Node.getNextNodeId();
      ByteBuffer byteBuffer0 = mS949_0.encode("f.6kd|To-E};R&MLjU#");
      byteBuffer0.getFloat(1);
      // Undeclared exception!
      try { 
        dBIN0.readFromLog(byteBuffer0, (byte)8);
        fail("Expecting exception: BufferUnderflowException");
      
      } catch(BufferUnderflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.nio.HeapByteBuffer", e);
      }
  }

  @Test
  public void test03()  throws Throwable  {
      Node.setLastNodeId(98304L);
  }

  @Test
  public void test04()  throws Throwable  {
      DIN dIN0 = new DIN();
      TreeLocation treeLocation0 = new TreeLocation();
      dIN0.matchLNByNodeId(treeLocation0, 0);
      //  // Unstable assertion: assertEquals(11L, dIN0.getLastId());
  }

  @Test
  public void test05()  throws Throwable  {
      DBIN dBIN0 = new DBIN();
      String string0 = dBIN0.dumpString(0, true);
      //  // Unstable assertion: assertEquals("<dbin>\n  <dupkey></dupkey>\n  <node>0</node>\n  <idkey><key v=\"\"/></idkey>\n  <dirty val=\"false\"/>\n  <generation val=\"0\"/>\n  <level val=\"0\"/>\n  <isRoot val=\"false\"/>\n  <entries nEntries=\"0\">\n  </entries>\n</dbin>", string0);
      //  // Unstable assertion: assertEquals(10L, dBIN0.getLastId());
  }

  @Test
  public void test06()  throws Throwable  {
      IN iN0 = new IN();
      StringWriter stringWriter0 = new StringWriter();
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      iN0.dumpLog(stringBuffer0, true);
      //  // Unstable assertion: assertEquals("<in><node>0</node><key v=\"\"/><isRoot val=\"false\"/><level val=\"0\"/><entries numEntries=\"0\" length=\"0\" baseFileNumber=\"-1\"></entries></in>", stringBuffer0.toString());
      //  // Unstable assertion: assertEquals(9L, iN0.getLastId());
  }

  @Test
  public void test07()  throws Throwable  {
      DBIN dBIN0 = new DBIN();
      dBIN0.isValidForDelete();
      //  // Unstable assertion: assertEquals(8L, dBIN0.getLastId());
  }

  @Test
  public void test08()  throws Throwable  {
      DBIN dBIN0 = new DBIN();
      dBIN0.isSoughtNode(Integer.MAX_VALUE, true);
      //  // Unstable assertion: assertEquals(0L, dBIN0.getGeneration());
  }

  @Test
  public void test09()  throws Throwable  {
      NameLN nameLN0 = new NameLN();
      nameLN0.getLogType();
      //  // Unstable assertion: assertEquals(6L, nameLN0.getLastId());
  }

  @Test
  public void test10()  throws Throwable  {
      FileSummaryLN fileSummaryLN0 = new FileSummaryLN();
      fileSummaryLN0.canBeAncestor(false);
      //  // Unstable assertion: assertEquals(5L, fileSummaryLN0.getLastId());
  }

  @Test
  public void test11()  throws Throwable  {
      FileSummaryLN fileSummaryLN0 = new FileSummaryLN();
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("P|4TWMs'j~~");
      CharBuffer charBuffer0 = mS949_0.decode(byteBuffer0);
      ByteBuffer byteBuffer1 = mS949_0.encode(charBuffer0);
      fileSummaryLN0.writeToLog(byteBuffer1);
      //  // Unstable assertion: assertEquals(4L, fileSummaryLN0.getLastId());
  }

  @Test
  public void test12()  throws Throwable  {
      MapLN mapLN0 = new MapLN();
      // Undeclared exception!
      try { 
        mapLN0.dumpString((-2665), true);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -2665
         //
         assertThrownBy("java.lang.String", e);
      }
  }

  @Test
  public void test13()  throws Throwable  {
      IN iN0 = new IN();
      // Undeclared exception!
      try { 
        iN0.dumpLog((StringBuffer) null, false);
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
      FileSummaryLN fileSummaryLN0 = new FileSummaryLN();
      // Undeclared exception!
      try { 
        fileSummaryLN0.dump((-1021));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -1021
         //
         assertThrownBy("java.lang.String", e);
      }
  }

  @Test
  public void test15()  throws Throwable  {
      long long0 = Node.getNextNodeId();
      //  // Unstable assertion: assertEquals(0L, long0);
  }

  @Test
  public void test16()  throws Throwable  {
      DatabaseImpl databaseImpl0 = new DatabaseImpl();
      MapLN mapLN0 = new MapLN(databaseImpl0);
      mapLN0.getType();
      //  // Unstable assertion: assertEquals(1897L, databaseImpl0.getEofNodeId());
  }

  @Test
  public void test17()  throws Throwable  {
      FileSummaryLN fileSummaryLN0 = new FileSummaryLN();
      Node.setLastNodeId(1896L);
      fileSummaryLN0.makeDeleted();
      fileSummaryLN0.setNodeId((-125L));
      fileSummaryLN0.shortDescription();
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte)93;
      byteArray0[1] = (byte)93;
      byteArray0[2] = (byte)13;
      byteArray0[3] = (byte)1;
      byteArray0[4] = (byte)54;
      byteArray0[5] = (byte)38;
      fileSummaryLN0.verify(byteArray0);
      fileSummaryLN0.beginTag();
      DatabaseId databaseId0 = new DatabaseId();
      DatabaseConfig databaseConfig0 = new DatabaseConfig();
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("<");
      CharBuffer charBuffer0 = mS949_0.decode(byteBuffer0);
      ByteBuffer byteBuffer1 = mS949_0.encode(charBuffer0);
      // Undeclared exception!
      try { 
        fileSummaryLN0.writeToLog(byteBuffer1);
        fail("Expecting exception: BufferOverflowException");
      
      } catch(BufferOverflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.nio.Buffer", e);
      }
  }

  @Test
  public void test18()  throws Throwable  {
      LN lN0 = new LN();
      int int0 = lN0.getLogSize();
      assertEquals(0L, lN0.getNodeId());
      assertEquals(9, int0);
  }

  @Test
  public void test19()  throws Throwable  {
      DatabaseImpl databaseImpl0 = new DatabaseImpl();
      MapLN mapLN0 = new MapLN(databaseImpl0);
      int int0 = mapLN0.getLevel();
      //  // Unstable assertion: assertEquals(4L, mapLN0.getLastId());
      //  // Unstable assertion: assertEquals(3L, databaseImpl0.getEofNodeId());
      //  // Unstable assertion: assertEquals(0, int0);
  }

  @Test
  public void test20()  throws Throwable  {
      DBIN dBIN0 = new DBIN();
      dBIN0.dump(1);
      //  // Unstable assertion: assertEquals(1L, dBIN0.getLastId());
  }

  @Test
  public void test21()  throws Throwable  {
      long long0 = Node.getLastId();
      //  // Unstable assertion: assertEquals(1L, long0);
  }

  @Test
  public void test22()  throws Throwable  {
      DupCountLN dupCountLN0 = new DupCountLN(1);
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("");
      // Undeclared exception!
      try { 
        dupCountLN0.readFromLog(byteBuffer0, (byte)54);
        fail("Expecting exception: BufferUnderflowException");
      
      } catch(BufferUnderflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.nio.Buffer", e);
      }
  }

  @Test
  public void test23()  throws Throwable  {
      IN iN0 = new IN();
      boolean boolean0 = iN0.marshallOutsideWriteLatch();
      //  // Unstable assertion: assertEquals((-1L), iN0.getLastId());
      //  // Unstable assertion: assertTrue(boolean0);
  }

  @Test
  public void test24()  throws Throwable  {
      DatabaseId databaseId0 = new DatabaseId((-1492));
      NameLN nameLN0 = new NameLN(databaseId0);
      DatabaseImpl databaseImpl0 = new DatabaseImpl();
      nameLN0.postFetchInit(databaseImpl0, Integer.MAX_VALUE);
      //  // Unstable assertion: assertEquals(12L, nameLN0.getNodeId());
  }

  @Test
  public void test25()  throws Throwable  {
      FileSummaryLN fileSummaryLN0 = new FileSummaryLN();
      TreeLocation treeLocation0 = new TreeLocation();
      try { 
        fileSummaryLN0.matchLNByNodeId(treeLocation0, (byte)0);
        fail("Expecting exception: DatabaseException");
      
      } catch(DatabaseException e) {
         //
         // matchLNByNodeId called on non DIN/DBIN
         //
         assertThrownBy("com.sleepycat.je.tree.Node", e);
      }
  }

  @Test
  public void test26()  throws Throwable  {
      DBIN dBIN0 = new DBIN();
      boolean boolean0 = dBIN0.countAsObsoleteWhenLogged();
      //  // Unstable assertion: assertEquals(9L, dBIN0.getLastId());
      //  // Unstable assertion: assertFalse(boolean0);
  }

  @Test
  public void test27()  throws Throwable  {
      DatabaseImpl databaseImpl0 = new DatabaseImpl();
      MapLN mapLN0 = new MapLN(databaseImpl0);
      long long0 = mapLN0.getMemorySizeIncludedByParent();
      //  // Unstable assertion: assertEquals(0L, long0);
      //  // Unstable assertion: assertEquals(2L, mapLN0.getLastId());
  }

  @Test
  public void test28()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      FileSummaryLN fileSummaryLN0 = new FileSummaryLN(fileSummary0);
      long long0 = fileSummaryLN0.getNodeId();
      //  // Unstable assertion: assertEquals(1L, long0);
  }
}
