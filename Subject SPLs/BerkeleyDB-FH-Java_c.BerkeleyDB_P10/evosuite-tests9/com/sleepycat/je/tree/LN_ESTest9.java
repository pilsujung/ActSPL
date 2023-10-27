/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 11:43:05 KST 2017
 */

package com.sleepycat.je.tree;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.StringWriter;
import java.nio.BufferOverflowException;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.util.HashMap;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.sleepycat.je.DatabaseEntry;
import com.sleepycat.je.cleaner.UtilizationTracker;
import com.sleepycat.je.dbi.DatabaseId;
import com.sleepycat.je.dbi.DatabaseImpl;
import com.sleepycat.je.dbi.EnvironmentImpl;
import com.sleepycat.je.dbi.INList;
import com.sleepycat.je.log.LogEntryType;
import com.sleepycat.je.txn.Locker;
import com.sleepycat.je.txn.Txn;

import sun.nio.cs.ext.MS949;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class LN_ESTest9 extends LN_ESTest_scaffolding9 {



  @Test
  public void test02()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      LN lN0 = new LN(byteArray0);
      lN0.getData();
      //  // Unstable assertion: assertEquals(734L, lN0.getNodeId());
  }

  @Test
  public void test03()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      LN lN0 = new LN(byteArray0);
      lN0.copyData();
      //  // Unstable assertion: assertEquals(715L, lN0.getNodeId());
  }

  @Test
  public void test04()  throws Throwable  {
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      LN lN0 = new LN(databaseEntry0);
      byte[] byteArray0 = new byte[2];
      DatabaseImpl databaseImpl0 = new DatabaseImpl();
      byte[] byteArray1 = new byte[5];
      Txn txn0 = new Txn();
      // Undeclared exception!
      try { 
        lN0.modify(byteArray0, databaseImpl0, byteArray1, (-25L), txn0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.LN", e);
      }
  }

  @Test
  public void test05()  throws Throwable  {
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      LN lN0 = new LN(databaseEntry0);
      DatabaseImpl databaseImpl0 = new DatabaseImpl();
      byte[] byteArray0 = new byte[4];
      Txn txn0 = new Txn();
      // Undeclared exception!
      try { 
        lN0.delete(databaseImpl0, byteArray0, byteArray0, 0L, txn0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.LN", e);
      }
  }

  @Test
  public void test06()  throws Throwable  {
      DupCountLN dupCountLN0 = new DupCountLN(6);
      DatabaseImpl databaseImpl0 = new DatabaseImpl();
      byte[] byteArray0 = new byte[2];
      byte[] byteArray1 = new byte[2];
      // Undeclared exception!
      try { 
        dupCountLN0.delete(databaseImpl0, byteArray1, byteArray0, (-1422L), (Locker) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.LN", e);
      }
  }

  @Test
  public void test07()  throws Throwable  {
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      LN lN0 = new LN(databaseEntry0);
      lN0.getTransactionalLogType();
      //  // Unstable assertion: assertEquals(579L, lN0.getNodeId());
  }

  @Test
  public void test08()  throws Throwable  {
      FileSummaryLN fileSummaryLN0 = new FileSummaryLN();
      StringWriter stringWriter0 = new StringWriter();
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      fileSummaryLN0.dumpLogAdditional(stringBuffer0, false);
      assertFalse(fileSummaryLN0.countAsObsoleteWhenLogged());
  }

  @Test
  public void test09()  throws Throwable  {
      DupCountLN dupCountLN0 = new DupCountLN(0);
      dupCountLN0.makeDeleted();
      //  // Unstable assertion: assertEquals(567L, dupCountLN0.getLastId());
  }

  @Test
  public void test10()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      LN lN0 = new LN(byteArray0);
      lN0.copyData();
      //  // Unstable assertion: assertEquals(549L, lN0.getLastId());
  }

  @Test
  public void test11()  throws Throwable  {
      DupCountLN dupCountLN0 = new DupCountLN();
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("");
      // Undeclared exception!
      try { 
        dupCountLN0.writeToLog(byteBuffer0);
        fail("Expecting exception: BufferOverflowException");
      
      } catch(BufferOverflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.nio.Buffer", e);
      }
  }

  @Test
  public void test12()  throws Throwable  {
      LN lN0 = new LN();
      // Undeclared exception!
      try { 
        lN0.writeToLog((ByteBuffer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.LogUtils", e);
      }
  }

  @Test
  public void test13()  throws Throwable  {
      MapLN mapLN0 = new MapLN();
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("Hu:Jl#nr$5%Amd");
      // Undeclared exception!
      try { 
        mapLN0.readFromLog(byteBuffer0, (byte) (-45));
        fail("Expecting exception: BufferUnderflowException");
      
      } catch(BufferUnderflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.nio.Buffer", e);
      }
  }

  @Test
  public void test14()  throws Throwable  {
      LN lN0 = new LN();
      // Undeclared exception!
      try { 
        lN0.readFromLog((ByteBuffer) null, (byte) (-1));
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
      DupCountLN dupCountLN0 = new DupCountLN(472);
      // Undeclared exception!
      try { 
        dupCountLN0.dumpString((-281), false);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -279
         //
         assertThrownBy("java.lang.String", e);
      }
  }

  @Test
  public void test17()  throws Throwable  {
      MapLN mapLN0 = new MapLN();
      // Undeclared exception!
      try { 
        mapLN0.dumpLogAdditional((StringBuffer) null, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.dbi.DatabaseImpl", e);
      }
  }


  @Test
  public void test19()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0, (int) (byte)0, (-391));
      LN lN0 = null;
      try {
        lN0 = new LN(databaseEntry0);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.LN", e);
      }
  }

  @Test
  public void test20()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0);
      databaseEntry0.setData(byteArray0, (int) (byte)16, 1297);
      LN lN0 = null;
      try {
        lN0 = new LN(databaseEntry0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.lang.System", e);
      }
  }

  @Test
  public void test21()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      LN lN0 = new LN(byteArray0);
      int int0 = lN0.getLogSize();
      //  // Unstable assertion: assertEquals(461L, lN0.getNodeId());
      //  // Unstable assertion: assertEquals(14, int0);
  }

  @Test
  public void test22()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      LN lN0 = new LN(byteArray0);
      lN0.dumpString(0, false);
      //  // Unstable assertion: assertEquals(406L, lN0.getNodeId());
  }

  @Test
  public void test23()  throws Throwable  {
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      LN lN0 = new LN(databaseEntry0);
      lN0.dumpString(6, true);
      //  // Unstable assertion: assertEquals(365L, lN0.getLastId());
  }

  @Test
  public void test24()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0, (int) (byte)1, 0);
      LN lN0 = new LN(databaseEntry0);
      boolean boolean0 = lN0.isDeleted();
      //  // Unstable assertion: assertEquals(350L, lN0.getLastId());
      //  // Unstable assertion: assertFalse(boolean0);
  }

  @Test
  public void test25()  throws Throwable  {
      FileSummaryLN fileSummaryLN0 = new FileSummaryLN();
      boolean boolean0 = fileSummaryLN0.isDeleted();
      assertTrue(boolean0);
  }

  @Test
  public void test26()  throws Throwable  {
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      LN lN0 = new LN(databaseEntry0);
      lN0.endTag();
      //  // Unstable assertion: assertEquals(347L, lN0.getLastId());
  }

  @Test
  public void test27()  throws Throwable  {
      DatabaseId databaseId0 = new DatabaseId();
      byte[] byteArray0 = new byte[8];
      NameLN nameLN0 = new NameLN();
      Txn txn0 = new Txn();
      // Undeclared exception!
      try { 
        nameLN0.log((EnvironmentImpl) null, databaseId0, byteArray0, 1495L, txn0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.LN", e);
      }
  }

  @Test
  public void test28()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      LN lN0 = new LN(byteArray0);
      lN0.beginTag();
      //  // Unstable assertion: assertEquals(334L, lN0.getNodeId());
  }

  @Test
  public void test29()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0);
      LN lN0 = new LN(databaseEntry0);
      long long0 = lN0.getMemorySizeIncludedByParent();
      //  // Unstable assertion: assertEquals(302L, lN0.getLastId());
      //  // Unstable assertion: assertEquals(64L, long0);
  }

  @Test
  public void test30()  throws Throwable  {
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      LN lN0 = new LN(databaseEntry0);
      long long0 = lN0.getMemorySizeIncludedByParent();
      //  // Unstable assertion: assertEquals(293L, lN0.getLastId());
      //  // Unstable assertion: assertEquals(32L, long0);
  }

  @Test
  public void test31()  throws Throwable  {
      NameLN nameLN0 = new NameLN((DatabaseId) null);
      StringWriter stringWriter0 = new StringWriter(0);
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      // Undeclared exception!
      try { 
        nameLN0.dumpLog(stringBuffer0, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.NameLN", e);
      }
  }

  @Test
  public void test32()  throws Throwable  {
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      LN lN0 = new LN(databaseEntry0);
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("      <ln>\n        <node>67112330</node>\n      </ln>");
      lN0.readFromLog(byteBuffer0, (byte)32);
      //  // Unstable assertion: assertEquals(265L, lN0.getLastId());
  }

  @Test
  public void test33()  throws Throwable  {
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      LN lN0 = new LN(databaseEntry0);
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("      <ln>\n        <node>67112325</node>\n      </ln>");
      lN0.writeToLog(byteBuffer0);
      assertEquals("java.nio.HeapByteBuffer[pos=9 lim=52 cap=104]", byteBuffer0.toString());
      assertTrue(lN0.isDeleted());
  }



  @Test
  public void test36()  throws Throwable  {
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      LN lN0 = new LN(databaseEntry0);
      DatabaseImpl databaseImpl0 = new DatabaseImpl();
      byte[] byteArray0 = new byte[4];
      Txn txn0 = new Txn();
      // Undeclared exception!
      try { 
        lN0.delete(databaseImpl0, byteArray0, byteArray0, (-9L), txn0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.LN", e);
      }
  }

  @Test
  public void test37()  throws Throwable  {
      FileSummaryLN fileSummaryLN0 = new FileSummaryLN();
      StringWriter stringWriter0 = new StringWriter(242);
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      fileSummaryLN0.dumpLog(stringBuffer0, true);
      assertEquals("<fileSummaryLN><node>0</node></fileSummaryLN>", stringBuffer0.toString());
      assertEquals("<fileSummaryLN><node>0</node></fileSummaryLN>", stringWriter0.toString());
  }

  @Test
  public void test38()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      LN lN0 = new LN(byteArray0);
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("     <node>67112320</node>\n     <data></data>\n");
      CharBuffer charBuffer0 = mS949_0.decode(byteBuffer0);
      ByteBuffer byteBuffer1 = mS949_0.encode(charBuffer0);
      lN0.writeToLog(byteBuffer1);
      //  // Unstable assertion: assertEquals("java.nio.HeapByteBuffer[pos=13 lim=46 cap=92]", byteBuffer1.toString());
      //  // Unstable assertion: assertEquals(185L, lN0.getLastId());
  }

  @Test
  public void test39()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0);
      databaseEntry0.setPartial(8, (-2), true);
      LN lN0 = new LN(databaseEntry0);
      //  // Unstable assertion: assertEquals(160L, lN0.getLastId());
  }

  @Test
  public void test40()  throws Throwable  {
      LN lN0 = new LN((byte[]) null);
      byte[] byteArray0 = lN0.getData();
      assertNull(byteArray0);
  }

  @Test
  public void test41()  throws Throwable  {
      MapLN mapLN0 = new MapLN();
      boolean boolean0 = mapLN0.countAsObsoleteWhenLogged();
      assertFalse(boolean0);
  }

  @Test
  public void test42()  throws Throwable  {
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      LN lN0 = new LN(databaseEntry0);
      lN0.rebuildINList((INList) null);
      //  // Unstable assertion: assertEquals(154L, lN0.getNodeId());
  }

  @Test
  public void test43()  throws Throwable  {
      MapLN mapLN0 = new MapLN();
      boolean boolean0 = mapLN0.canBeAncestor(false);
      assertFalse(boolean0);
  }

  @Test
  public void test44()  throws Throwable  {
      DupCountLN dupCountLN0 = new DupCountLN(0);
      boolean boolean0 = dupCountLN0.isSoughtNode(0L, false);
      //  // Unstable assertion: assertEquals(138L, dupCountLN0.getLastId());
      //  // Unstable assertion: assertFalse(boolean0);
  }

  @Test
  public void test45()  throws Throwable  {
      LN lN0 = new LN();
      long long0 = lN0.getTransactionId();
      assertEquals(0L, long0);
  }

  @Test
  public void test46()  throws Throwable  {
      DupCountLN dupCountLN0 = new DupCountLN();
      dupCountLN0.accountForSubtreeRemoval((INList) null, (UtilizationTracker) null);
      assertEquals(0L, dupCountLN0.getNodeId());
  }

  @Test
  public void test47()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      LN lN0 = new LN(byteArray0);
      DatabaseId databaseId0 = new DatabaseId();
      // Undeclared exception!
      try { 
        lN0.logProvisional((EnvironmentImpl) null, databaseId0, byteArray0, (-1L));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.LN", e);
      }
  }

  @Test
  public void test48()  throws Throwable  {
      DupCountLN dupCountLN0 = new DupCountLN();
      StringWriter stringWriter0 = new StringWriter(2427);
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      dupCountLN0.dumpLog(stringBuffer0, false);
      assertEquals("<dupCountLN><node>0</node><count v=\"0\"/></dupCountLN>", stringBuffer0.toString());
      assertEquals("<dupCountLN><node>0</node><count v=\"0\"/></dupCountLN>", stringWriter0.toString());
  }

  @Test
  public void test49()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      LN lN0 = new LN(byteArray0);
      lN0.getLogType();
      //  // Unstable assertion: assertEquals(48L, lN0.getLastId());
  }

  @Test
  public void test50()  throws Throwable  {
      NameLN nameLN0 = new NameLN((DatabaseId) null);
      nameLN0.getData();
      //  // Unstable assertion: assertEquals(28L, nameLN0.getLastId());
  }

  @Test
  public void test51()  throws Throwable  {
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      LN lN0 = new LN(databaseEntry0);
      boolean boolean0 = lN0.logEntryIsTransactional();
      //  // Unstable assertion: assertEquals(25L, lN0.getLastId());
      //  // Unstable assertion: assertFalse(boolean0);
  }

  @Test
  public void test52()  throws Throwable  {
      DupCountLN dupCountLN0 = new DupCountLN();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      dupCountLN0.addToDirtyMap(hashMap0);
      assertTrue(hashMap0.isEmpty());
  }

  @Test
  public void test53()  throws Throwable  {
      FileSummaryLN fileSummaryLN0 = new FileSummaryLN();
      // Undeclared exception!
      try { 
        fileSummaryLN0.copyData();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.LN", e);
      }
  }

  @Test
  public void test54()  throws Throwable  {
      DupCountLN dupCountLN0 = new DupCountLN(0);
      boolean boolean0 = dupCountLN0.isValidForDelete();
      //  // Unstable assertion: assertEquals(1L, dupCountLN0.getNodeId());
      //  // Unstable assertion: assertFalse(boolean0);
  }
}