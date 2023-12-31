/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 10:06:16 KST 2017
 */

package com.sleepycat.je.tree;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.File;
import java.io.StringWriter;
import java.nio.BufferOverflowException;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.IllegalCharsetNameException;
import java.util.Properties;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.sleepycat.je.DatabaseException;
import com.sleepycat.je.EnvironmentConfig;
import com.sleepycat.je.dbi.DatabaseId;
import com.sleepycat.je.dbi.DatabaseImpl;
import com.sleepycat.je.dbi.EnvironmentImpl;
import com.sleepycat.je.log.LogManager;
import com.sleepycat.je.txn.LockGrantType;
import com.sleepycat.je.txn.LockResult;
import com.sleepycat.je.txn.Locker;
import com.sleepycat.je.txn.Txn;
import com.sleepycat.je.txn.WriteLockInfo;

import sun.nio.cs.ext.MS949;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class DIN_ESTest3 extends DIN_ESTest_scaffolding3 {

  @Test
  public void test02()  throws Throwable  {
      DIN dIN0 = new DIN();
      dIN0.getDupKey();
      assertTrue(dIN0.needsSplitting());
      assertEquals("DIN", dIN0.shortClassName());
      assertEquals(0, dIN0.getLevel());
  }

  @Test
  public void test04()  throws Throwable  {
      DIN dIN0 = new DIN();
      DatabaseId databaseId0 = new DatabaseId();
      int int0 = dIN0.generateLevel(databaseId0, 0);
      assertTrue(dIN0.needsSplitting());
      assertEquals(0, dIN0.getLevel());
      assertEquals("DIN", dIN0.shortClassName());
      assertEquals(0, int0);
  }

  @Test
  public void test05()  throws Throwable  {
      DIN dIN0 = new DIN();
      int int0 = dIN0.generateLevel((DatabaseId) null, (-1188));
      assertEquals((-1188), int0);
      assertEquals("DIN", dIN0.shortClassName());
      assertEquals(0, dIN0.getLevel());
      assertTrue(dIN0.needsSplitting());
  }

  @Test
  public void test09()  throws Throwable  {
      DIN dIN0 = new DIN();
      TreeLocation treeLocation0 = new TreeLocation();
      boolean boolean0 = true;
      dIN0.deleteEntry((byte[]) null, true);
      EnvironmentConfig environmentConfig0 = new EnvironmentConfig();
      EnvironmentImpl environmentImpl0 = null;
      try {
        environmentImpl0 = new EnvironmentImpl((File) null, environmentConfig0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.FileManager", e);
      }
  }

  @Test
  public void test10()  throws Throwable  {
      DIN dIN0 = new DIN();
      DatabaseImpl databaseImpl0 = new DatabaseImpl();
      byte[] byteArray0 = new byte[9];
      dIN0.isKeyInBounds(byteArray0);
      File file0 = null;
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
  public void test12()  throws Throwable  {
      DIN dIN0 = new DIN();
      // Undeclared exception!
      try { 
        dIN0.fetchTarget(1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         assertThrownBy("com.sleepycat.je.tree.IN", e);
      }
  }

  @Test
  public void test13()  throws Throwable  {
      DIN dIN0 = new DIN();
      DatabaseId databaseId0 = new DatabaseId(0);
      int int0 = dIN0.generateLevel(databaseId0, 10);
      assertEquals(10, int0);
      assertEquals(0, dIN0.getLevel());
      assertTrue(dIN0.needsSplitting());
      assertEquals("DIN", dIN0.shortClassName());
  }

  @Test
  public void test14()  throws Throwable  {
      DIN dIN0 = new DIN();
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("ghwYXBq");
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
  public void test15()  throws Throwable  {
      DIN dIN0 = new DIN();
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("j");
      // Undeclared exception!
      try { 
        dIN0.readFromLog(byteBuffer0, (byte) (-78));
        fail("Expecting exception: BufferUnderflowException");
      
      } catch(BufferUnderflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.nio.Buffer", e);
      }
  }

  @Test
  public void test18()  throws Throwable  {
      DIN dIN0 = new DIN();
      LockGrantType lockGrantType0 = LockGrantType.DENIED;
      Txn txn0 = new Txn();
      WriteLockInfo writeLockInfo0 = txn0.getWriteLockInfo(10000);
      LockResult lockResult0 = new LockResult(lockGrantType0, writeLockInfo0);
      byte[] byteArray0 = new byte[7];
      try { 
        dIN0.incrementDuplicateCount(lockResult0, byteArray0, txn0, false);
        fail("Expecting exception: DatabaseException");
      
      } catch(DatabaseException e) {
         //
         // fetchTarget of null lsn IN=0 state=0 NULL_LSN without KnownDeleted
         //
         assertThrownBy("com.sleepycat.je.tree.ChildReference", e);
      }
  }





  @Test
  public void test23()  throws Throwable  {
      DIN dIN0 = new DIN();
      // Undeclared exception!
      try { 
        dIN0.dumpString(523, true);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: 523
         //
         assertThrownBy("java.lang.String", e);
      }
  }


  @Test
  public void test25()  throws Throwable  {
      DIN dIN0 = new DIN();
      DatabaseImpl databaseImpl0 = new DatabaseImpl();
      dIN0.setDatabase(databaseImpl0);
      DIN.DIN_updateDupCountLN dIN_DIN_updateDupCountLN0 = new DIN.DIN_updateDupCountLN(dIN0, dIN0);
      // Undeclared exception!
      try { 
        dIN_DIN_updateDupCountLN0._this.createNewInstance((byte[]) null, (byte) (-90), 1666);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.IN", e);
      }
  }

  @Test
  public void test26()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      LN lN0 = new LN();
      ChildReference childReference0 = new ChildReference((Node) lN0, byteArray0, 2297L, (byte)80);
      DIN dIN0 = null;
      try {
        dIN0 = new DIN((DatabaseImpl) null, byteArray0, (int) (byte)27, byteArray0, childReference0, (-988));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.IN", e);
      }
  }

  @Test
  public void test27()  throws Throwable  {
      DatabaseImpl databaseImpl0 = new DatabaseImpl();
      byte[] byteArray0 = new byte[8];
      ChildReference childReference0 = new ChildReference((Node) null, byteArray0, (-85L));
      DIN dIN0 = null;
      try {
        dIN0 = new DIN(databaseImpl0, byteArray0, (-2879), byteArray0, childReference0, (int) (byte) (-1));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.IN", e);
      }
  }


  @Test
  public void test30()  throws Throwable  {
      DIN dIN0 = new DIN();
      DIN.DIN_updateDupCountLN dIN_DIN_updateDupCountLN0 = new DIN.DIN_updateDupCountLN(dIN0, dIN0);
      String string0 = dIN_DIN_updateDupCountLN0._this.beginTag();
      assertEquals("<din>", string0);
      assertTrue(dIN0.needsSplitting());
      assertEquals("DIN", dIN0.shortClassName());
      assertEquals(0, dIN0.getLevel());
  }

  @Test
  public void test31()  throws Throwable  {
      DIN dIN0 = new DIN();
      String string0 = dIN0.endTag();
      assertEquals(0, dIN0.getLevel());
      assertEquals("DIN", dIN0.shortClassName());
      assertTrue(dIN0.needsSplitting());
      assertEquals("</din>", string0);
  }

  @Test
  public void test32()  throws Throwable  {
      DIN dIN0 = new DIN();
      DIN.DIN_updateDupCountLNRefAndNullTarget dIN_DIN_updateDupCountLNRefAndNullTarget0 = new DIN.DIN_updateDupCountLNRefAndNullTarget(dIN0, 3818L);
      String string0 = dIN_DIN_updateDupCountLNRefAndNullTarget0._this.shortClassName();
      assertEquals(0, dIN0.getLevel());
      assertEquals("DIN", string0);
      assertTrue(dIN0.needsSplitting());
  }

  @Test
  public void test34()  throws Throwable  {
      DIN dIN0 = new DIN();
      String string0 = dIN0.dumpString(0, false);
      assertEquals("DIN", dIN0.shortClassName());
      assertTrue(dIN0.needsSplitting());
      assertEquals("  <dupkey></dupkey>\n    <lsn/>\n    <key v=\"\"/>\n    <target/>\n    <knownDeleted val=\"false\"/><pendingDeleted val=\"false\"/><dirty val=\"false\"/>\n  <node>0</node>\n  <idkey><key v=\"\"/></idkey>\n  <dirty val=\"false\"/>\n  <generation val=\"0\"/>\n  <level val=\"0\"/>\n  <isRoot val=\"false\"/>\n  <entries nEntries=\"0\">\n  </entries>\n", string0);
  }

  @Test
  public void test35()  throws Throwable  {
      DIN dIN0 = new DIN();
      StringWriter stringWriter0 = new StringWriter();
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      dIN0.dumpLogAdditional(stringBuffer0);
      assertEquals("<key v=\"<null>\"/><ref knownDeleted=\"false\" pendingDeleted=\"false\"><key v=\"\"/><DbLsn val=\"0xffffffff/0xffffffff\"/></ref>", stringBuffer0.toString());
      assertTrue(dIN0.needsSplitting());
  }

  @Test
  public void test36()  throws Throwable  {
      DIN dIN0 = new DIN();
      DIN.DIN_updateDupCountLN dIN_DIN_updateDupCountLN0 = new DIN.DIN_updateDupCountLN(dIN0, dIN0);
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("<din>\n  <dupkey></dupkey>\n    <lsn/>\n    <key v=\"\"/>\n    <target/>\n    <knownDeleted val=\"false\"/><pendingDeleted val=\"false\"/><dirty val=\"false\"/>\n  <node>0</node>\n  <idkey><key v=\"\"/></idkey>\n  <dirty val=\"false\"/>\n  <generation val=\"209\"/>\n  <level val=\"0\"/>\n  <isRoot val=\"false\"/>\n  <entries nEntries=\"0\">\n  </entries>\n</din>");
      byteBuffer0.compact();
      dIN_DIN_updateDupCountLN0._this.readFromLog(byteBuffer0, (byte)24);
      assertEquals("java.nio.HeapByteBuffer[pos=361 lim=660 cap=660]", byteBuffer0.toString());
      assertEquals(361, byteBuffer0.position());
  }

  @Test
  public void test39()  throws Throwable  {
      DIN dIN0 = new DIN();
      TreeLocation treeLocation0 = new TreeLocation();
      boolean boolean0 = dIN0.matchLNByNodeId(treeLocation0, 255L);
      assertTrue(dIN0.needsSplitting());
      assertEquals(0, dIN0.getLevel());
      assertEquals("DIN", dIN0.shortClassName());
      assertFalse(boolean0);
  }

  @Test
  public void test40()  throws Throwable  {
      DIN dIN0 = new DIN();
      dIN0.selectKey((byte[]) null, (byte[]) null);
      assertEquals("DIN", dIN0.shortClassName());
      assertTrue(dIN0.needsSplitting());
      assertEquals(0, dIN0.getLevel());
  }

  @Test
  public void test41()  throws Throwable  {
      DIN dIN0 = new DIN();
      DIN.DIN_updateDupCountLN dIN_DIN_updateDupCountLN0 = new DIN.DIN_updateDupCountLN(dIN0, dIN0);
      // Undeclared exception!
      try { 
        dIN_DIN_updateDupCountLN0._this.createNewInstance((byte[]) null, (byte) (-90), 1666);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.IN", e);
      }
  }



  @Test
  public void test44()  throws Throwable  {
      DIN dIN0 = new DIN();
      DIN.DIN_updateDupCountLNRefAndNullTarget dIN_DIN_updateDupCountLNRefAndNullTarget0 = new DIN.DIN_updateDupCountLNRefAndNullTarget(dIN0, 3818L);
      boolean boolean0 = dIN_DIN_updateDupCountLNRefAndNullTarget0._this.isDbRoot();
      assertFalse(boolean0);
      assertEquals("DIN", dIN0.shortClassName());
      assertEquals(0, dIN0.getLevel());
      assertTrue(dIN0.needsSplitting());
  }

  @Test
  public void test46()  throws Throwable  {
      DIN dIN0 = new DIN();
      dIN0.updateDupCountLNRef(255L);
      assertTrue(dIN0.getDirty());
  }

  @Test
  public void test47()  throws Throwable  {
      DIN dIN0 = new DIN();
      dIN0.getDupCountLNRef();
      assertEquals("DIN", dIN0.shortClassName());
      assertEquals(0, dIN0.getLevel());
      assertTrue(dIN0.needsSplitting());
  }

  @Test
  public void test48()  throws Throwable  {
      DIN dIN0 = new DIN();
      dIN0.getMainTreeKey();
      assertEquals("DIN", dIN0.shortClassName());
      assertTrue(dIN0.needsSplitting());
      assertEquals(0, dIN0.getLevel());
  }

  @Test
  public void test49()  throws Throwable  {
      DIN dIN0 = new DIN();
      DIN.DIN_updateDupCountLN dIN_DIN_updateDupCountLN0 = new DIN.DIN_updateDupCountLN(dIN0, dIN0);
      dIN_DIN_updateDupCountLN0._this.getChildKey(dIN0);
      assertTrue(dIN0.needsSplitting());
      assertEquals("DIN", dIN0.shortClassName());
      assertEquals(0, dIN0.getLevel());
  }

  @Test
  public void test50()  throws Throwable  {
      DIN dIN0 = new DIN();
      boolean boolean0 = dIN0.containsDuplicates();
      assertEquals(0, dIN0.getLevel());
      assertEquals("DIN", dIN0.shortClassName());
      assertTrue(dIN0.needsSplitting());
      assertTrue(boolean0);
  }

  @Test
  public void test52()  throws Throwable  {
      DIN dIN0 = new DIN();
      dIN0.setDupCountLN((ChildReference) null);
      assertEquals("DIN", dIN0.shortClassName());
      assertTrue(dIN0.needsSplitting());
      assertEquals(0, dIN0.getLevel());
  }

  @Test
  public void test53()  throws Throwable  {
      DIN dIN0 = new DIN();
      DIN.DIN_updateDupCountLNRefAndNullTarget dIN_DIN_updateDupCountLNRefAndNullTarget0 = new DIN.DIN_updateDupCountLNRefAndNullTarget(dIN0, 3818L);
      dIN_DIN_updateDupCountLNRefAndNullTarget0._this.updateDupCountLNRefAndNullTarget((-9223372036854775808L));
      assertTrue(dIN0.getDirty());
      assertEquals("DIN", dIN0.shortClassName());
  }


  @Test
  public void test56()  throws Throwable  {
      DIN dIN0 = new DIN();
      DIN.DIN_updateDupCountLNRefAndNullTarget dIN_DIN_updateDupCountLNRefAndNullTarget0 = new DIN.DIN_updateDupCountLNRefAndNullTarget(dIN0, 0);
      dIN_DIN_updateDupCountLNRefAndNullTarget0.execute();
      dIN0.getDupCountLNRef();
      assertTrue(dIN0.getDirty());
  }

  @Test
  public void test57()  throws Throwable  {
      DIN dIN0 = new DIN();
      dIN0.updateDupCountLN((Node) null);
      assertEquals(0, dIN0.getLevel());
      assertTrue(dIN0.needsSplitting());
      assertEquals("DIN", dIN0.shortClassName());
  }
}
