/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 21 20:24:11 KST 2017
 */

package com.sleepycat.je.tree;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
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

import com.sleepycat.je.DatabaseException;
import com.sleepycat.je.cleaner.FileSummary;
import com.sleepycat.je.dbi.DatabaseImpl;

import sun.nio.cs.ext.MS949;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class ChildReference_ESTest1 extends ChildReference_ESTest_scaffolding1 {

  @Test
  public void test00()  throws Throwable  {
      ChildReference childReference0 = new ChildReference();
      childReference0.getTarget();
      assertEquals((-1L), childReference0.getLsn());
      assertFalse(childReference0.isKnownDeleted());
  }

  @Test
  public void test01()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      LN lN0 = new LN(byteArray0);
      ChildReference childReference0 = new ChildReference((Node) lN0, byteArray0, (-1L), (byte)64);
      LN lN1 = (LN)childReference0.getTarget();
      //  // Unstable assertion: assertEquals(392L, lN1.getLastId());
  }

  @Test
  public void test02()  throws Throwable  {
      ChildReference childReference0 = new ChildReference();
      byte byte0 = childReference0.getState();
      assertEquals((byte)0, byte0);
      assertEquals((-1L), childReference0.getLsn());
  }

  @Test
  public void test03()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      ChildReference childReference0 = new ChildReference((Node) null, byteArray0, 0L);
      byte byte0 = childReference0.getState();
      assertEquals((byte)2, byte0);
  }

  @Test
  public void test04()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      ChildReference childReference0 = new ChildReference((Node) null, byteArray0, (long) (byte)4, (byte)41);
      long long0 = childReference0.getLsn();
      assertFalse(childReference0.getMigrate());
      assertTrue(childReference0.isKnownDeleted());
      assertEquals(4L, long0);
  }

  @Test
  public void test05()  throws Throwable  {
      ChildReference childReference0 = new ChildReference();
      long long0 = childReference0.getLsn();
      assertEquals((-1L), long0);
      assertFalse(childReference0.isKnownDeleted());
  }

  @Test
  public void test06()  throws Throwable  {
      ChildReference childReference0 = new ChildReference();
      childReference0.getKey();
      assertFalse(childReference0.isKnownDeleted());
      assertEquals((-1L), childReference0.getLsn());
  }

  @Test
  public void test07()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      ChildReference childReference0 = new ChildReference((Node) null, byteArray0, 0L, (byte)0);
      String string0 = childReference0.toString();
      assertEquals("<DbLsn val=\"0x0/0x0\"/>\n<key v=\"\"/>\n<target/>\n<knownDeleted val=\"false\"/><pendingDeleted val=\"false\"/><dirty val=\"true\"/>", string0);
  }

  @Test
  public void test08()  throws Throwable  {
      ChildReference childReference0 = new ChildReference();
      childReference0.setMigrate(true);
      childReference0.setMigrate(true);
      assertFalse(childReference0.isKnownDeleted());
      assertTrue(childReference0.getMigrate());
  }

  @Test
  public void test09()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      ChildReference childReference0 = new ChildReference((Node) null, byteArray0, 0L, (byte)0);
      DatabaseImpl databaseImpl0 = new DatabaseImpl();
      try { 
        childReference0.fetchTarget(databaseImpl0, (IN) null);
        fail("Expecting exception: DatabaseException");
      
      } catch(DatabaseException e) {
         //
         // fetchTarget of 0x0/0x0 state=2 java.lang.NullPointerException
         //
         assertThrownBy("com.sleepycat.je.tree.ChildReference", e);
      }
  }

  @Test
  public void test10()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      ChildReference childReference0 = new ChildReference((Node) null, byteArray0, 0L, (byte)0);
      childReference0.setKey(byteArray0);
      assertFalse(childReference0.isKnownDeleted());
      assertFalse(childReference0.getMigrate());
  }

  @Test
  public void test11()  throws Throwable  {
      ChildReference childReference0 = new ChildReference();
      childReference0.setLsn(0L);
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("/KRTe(");
      // Undeclared exception!
      try { 
        childReference0.writeToLog(byteBuffer0);
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
      ChildReference childReference0 = new ChildReference();
      // Undeclared exception!
      try { 
        childReference0.writeToLog((ByteBuffer) null);
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
      byte[] byteArray0 = new byte[5];
      ChildReference childReference0 = new ChildReference((Node) null, byteArray0, 0L);
      // Undeclared exception!
      try { 
        childReference0.readFromLog((ByteBuffer) null, (byte)4);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.LogUtils", e);
      }
  }

  @Test
  public void test15()  throws Throwable  {
      ChildReference childReference0 = new ChildReference();
      // Undeclared exception!
      try { 
        childReference0.dumpString(2384, false);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: 2384
         //
         assertThrownBy("java.lang.String", e);
      }
  }

  @Test
  public void test16()  throws Throwable  {
      ChildReference childReference0 = new ChildReference();
      // Undeclared exception!
      try { 
        childReference0.dumpLog((StringBuffer) null, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.ChildReference", e);
      }
  }

  @Test
  public void test17()  throws Throwable  {
      ChildReference childReference0 = new ChildReference();
      boolean boolean0 = childReference0.isKnownDeleted();
      assertFalse(boolean0);
      assertEquals((-1L), childReference0.getLsn());
  }

  @Test
  public void test18()  throws Throwable  {
      NameLN nameLN0 = new NameLN();
      byte[] byteArray0 = new byte[4];
      ChildReference childReference0 = new ChildReference((Node) nameLN0, byteArray0, 2131L, (byte)15);
      boolean boolean0 = childReference0.isKnownDeleted();
      assertTrue(boolean0);
      assertTrue(childReference0.getMigrate());
      assertEquals(2131L, childReference0.getLsn());
  }

  @Test
  public void test20()  throws Throwable  {
      DupCountLN dupCountLN0 = new DupCountLN(1562);
      byte[] byteArray0 = new byte[2];
      ChildReference childReference0 = new ChildReference((Node) dupCountLN0, byteArray0, (-270L), (byte) (-91));
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("<DbLsn val=\"0xffffffff/0xfffffef2\"/>\n<key v=\"\u8A71\"/>\n<dupCountLN>\n  <count v=\"1562\"/>\n  <node>2102</node>\n  <data></data>\n</dupCountLN>\n<knownDeleted val=\"true\"/><pendingDeleted val=\"false\"/><dirty val=\"true\"/>");
      childReference0.writeToLog(byteBuffer0);
      byteBuffer0.rewind();
      childReference0.readFromLog(byteBuffer0, (byte) (-91));
      //  // Unstable assertion: assertEquals(310L, dupCountLN0.getNodeId());
      //  // Unstable assertion: assertEquals(310L, dupCountLN0.getLastId());
  }

  @Test
  public void test21()  throws Throwable  {
      ChildReference childReference0 = new ChildReference();
      childReference0.setMigrate(false);
      assertEquals((-1L), childReference0.getLsn());
      assertFalse(childReference0.getMigrate());
      assertFalse(childReference0.isKnownDeleted());
  }

  @Test
  public void test22()  throws Throwable  {
      ChildReference childReference0 = new ChildReference();
      assertFalse(childReference0.getMigrate());
      
      childReference0.setMigrate(true);
      boolean boolean0 = childReference0.getMigrate();
      assertTrue(boolean0);
  }

  @Test
  public void test23()  throws Throwable  {
      ChildReference childReference0 = new ChildReference();
      boolean boolean0 = childReference0.getMigrate();
      assertFalse(childReference0.isKnownDeleted());
      assertFalse(boolean0);
      assertEquals((-1L), childReference0.getLsn());
  }

  @Test
  public void test24()  throws Throwable  {
      ChildReference childReference0 = new ChildReference();
      String string0 = childReference0.dumpString(0, false);
      assertEquals("<lsn/>\n<key v=\"\"/>\n<target/>\n<knownDeleted val=\"false\"/><pendingDeleted val=\"false\"/><dirty val=\"false\"/>", string0);
  }

  @Test
  public void test25()  throws Throwable  {
      LN lN0 = new LN();
      byte[] byteArray0 = new byte[0];
      ChildReference childReference0 = new ChildReference((Node) lN0, byteArray0, (-439L), (byte)94);
      String string0 = childReference0.toString();
      assertEquals("<DbLsn val=\"0xffffffff/0xfffffe49\"/>\n<key v=\"\"/>\n<ln>\n  <node>0</node>\n</ln>\n<knownDeleted val=\"false\"/><pendingDeleted val=\"true\"/><dirty val=\"true\"/>", string0);
  }

  @Test
  public void test26()  throws Throwable  {
      ChildReference childReference0 = new ChildReference();
      byte[] byteArray0 = new byte[3];
      childReference0.setLsn((-401L));
      DatabaseImpl databaseImpl0 = new DatabaseImpl();
      DBIN dBIN0 = new DBIN(databaseImpl0, byteArray0, (int) (byte)16, byteArray0, 2146039476);
      try { 
        childReference0.fetchTarget(databaseImpl0, dBIN0);
        fail("Expecting exception: DatabaseException");
      
      } catch(DatabaseException e) {
         //
         // fetchTarget of 0xffffffff/0xfffffe6f IN=492 state=2 java.lang.NullPointerException
         //
         assertThrownBy("com.sleepycat.je.tree.ChildReference", e);
      }
  }

  @Test
  public void test27()  throws Throwable  {
      ChildReference childReference0 = new ChildReference();
      byte[] byteArray0 = new byte[3];
      DatabaseImpl databaseImpl0 = new DatabaseImpl();
      DBIN dBIN0 = new DBIN(databaseImpl0, byteArray0, (int) (byte)16, byteArray0, 2146039476);
      try { 
        childReference0.fetchTarget(databaseImpl0, dBIN0);
        fail("Expecting exception: DatabaseException");
      
      } catch(DatabaseException e) {
         //
         // fetchTarget of null lsn IN=494 state=0 NULL_LSN without KnownDeleted
         //
         assertThrownBy("com.sleepycat.je.tree.ChildReference", e);
      }
  }

  @Test
  public void test28()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      DatabaseImpl databaseImpl0 = new DatabaseImpl();
      FileSummary fileSummary0 = new FileSummary();
      FileSummaryLN fileSummaryLN0 = new FileSummaryLN(fileSummary0);
      ChildReference childReference0 = new ChildReference((Node) fileSummaryLN0, byteArray0, (long) (byte) (-61), (byte)4);
      DIN dIN0 = new DIN(databaseImpl0, byteArray0, 4, byteArray0, childReference0, 2143118843);
      // Undeclared exception!
      try { 
        dIN0.getDupCountLN();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // com.sleepycat.je.tree.FileSummaryLN cannot be cast to com.sleepycat.je.tree.DupCountLN
         //
         assertThrownBy("com.sleepycat.je.tree.DIN", e);
      }
  }

  @Test
  public void test29()  throws Throwable  {
      DupCountLN dupCountLN0 = new DupCountLN(1562);
      byte[] byteArray0 = new byte[2];
      ChildReference childReference0 = new ChildReference((Node) dupCountLN0, byteArray0, (-270L), (byte) (-91));
      byte byte0 = childReference0.getState();
      //  // Unstable assertion: assertEquals(134L, dupCountLN0.getNodeId());
      //  // Unstable assertion: assertEquals((byte) (-89), byte0);
  }

  @Test
  public void test30()  throws Throwable  {
      ChildReference childReference0 = new ChildReference();
      childReference0.clearTarget();
      assertFalse(childReference0.isKnownDeleted());
      assertEquals((-1L), childReference0.getLsn());
  }

  @Test
  public void test31()  throws Throwable  {
      DupCountLN dupCountLN0 = new DupCountLN(1535);
      byte[] byteArray0 = new byte[2];
      ChildReference childReference0 = new ChildReference((Node) dupCountLN0, byteArray0, (-270L), (byte) (-91));
      int int0 = childReference0.getLogSize();
      //  // Unstable assertion: assertEquals(110L, dupCountLN0.getLastId());
      //  // Unstable assertion: assertEquals(15, int0);
  }

  @Test
  public void test32()  throws Throwable  {
      DupCountLN dupCountLN0 = new DupCountLN((-368));
      byte[] byteArray0 = new byte[6];
      ChildReference childReference0 = new ChildReference((Node) dupCountLN0, byteArray0, 0L, (byte)33);
      childReference0.getLsn();
      //  // Unstable assertion: assertEquals(94L, dupCountLN0.getNodeId());
      //  // Unstable assertion: assertEquals(94L, dupCountLN0.getLastId());
  }

  @Test
  public void test33()  throws Throwable  {
      DupCountLN dupCountLN0 = new DupCountLN(1562);
      byte[] byteArray0 = new byte[2];
      ChildReference childReference0 = new ChildReference((Node) dupCountLN0, byteArray0, (-270L), (byte) (-91));
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("<DbLsn val=\"0xffffffff/0xfffffef2\"/>\n<key v=\"\u8A71\"/>\n<dupCountLN>\n  <count v=\"1562\"/>\n  <node>2102</node>\n  <data></data>\n</dupCountLN>\n<knownDeleted val=\"true\"/><pendingDeleted val=\"false\"/><dirty val=\"true\"/>");
      // Undeclared exception!
      try { 
        childReference0.readFromLog(byteBuffer0, (byte) (-91));
        fail("Expecting exception: BufferUnderflowException");
      
      } catch(BufferUnderflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.nio.HeapByteBuffer", e);
      }
  }

  @Test
  public void test34()  throws Throwable  {
      DupCountLN dupCountLN0 = new DupCountLN(1535);
      byte[] byteArray0 = new byte[2];
      ChildReference childReference0 = new ChildReference((Node) dupCountLN0, byteArray0, (-270L), (byte) (-91));
      DupCountLN dupCountLN1 = (DupCountLN)childReference0.getTarget();
      //  // Unstable assertion: assertEquals(64L, dupCountLN1.getNodeId());
  }

  @Test
  public void test35()  throws Throwable  {
      DupCountLN dupCountLN0 = new DupCountLN(1562);
      byte[] byteArray0 = new byte[2];
      ChildReference childReference0 = new ChildReference((Node) dupCountLN0, byteArray0, (-270L), (byte) (-91));
      childReference0.setTarget(dupCountLN0);
      //  // Unstable assertion: assertEquals(49L, dupCountLN0.getLastId());
      //  // Unstable assertion: assertEquals(49L, dupCountLN0.getNodeId());
  }

  @Test
  public void test36()  throws Throwable  {
      DupCountLN dupCountLN0 = new DupCountLN(1562);
      byte[] byteArray0 = new byte[2];
      ChildReference childReference0 = new ChildReference((Node) dupCountLN0, byteArray0, (-270L), (byte) (-91));
      boolean boolean0 = childReference0.logEntryIsTransactional();
      //  // Unstable assertion: assertEquals(33L, dupCountLN0.getLastId());
      //  // Unstable assertion: assertFalse(boolean0);
  }

  @Test
  public void test37()  throws Throwable  {
      DupCountLN dupCountLN0 = new DupCountLN(1562);
      byte[] byteArray0 = new byte[2];
      ChildReference childReference0 = new ChildReference((Node) dupCountLN0, byteArray0, (-270L), (byte) (-91));
      childReference0.getKey();
      //  // Unstable assertion: assertEquals(18L, dupCountLN0.getLastId());
      //  // Unstable assertion: assertEquals(18L, dupCountLN0.getNodeId());
  }

  @Test
  public void test38()  throws Throwable  {
      DupCountLN dupCountLN0 = new DupCountLN(1562);
      byte[] byteArray0 = new byte[2];
      ChildReference childReference0 = new ChildReference((Node) dupCountLN0, byteArray0, (-270L), (byte) (-91));
      long long0 = childReference0.getTransactionId();
      //  // Unstable assertion: assertEquals(1L, dupCountLN0.getNodeId());
      //  // Unstable assertion: assertEquals(0L, long0);
  }

  @Test
  public void test39()  throws Throwable  {
      BIN bIN0 = new BIN();
      byte[] byteArray0 = new byte[1];
      ChildReference childReference0 = new ChildReference((Node) bIN0, byteArray0, (long) 0, (byte)0);
      childReference0.hook613(bIN0);
      assertFalse(childReference0.isKnownDeleted());
      assertFalse(childReference0.getMigrate());
  }

  @Test
  public void test40()  throws Throwable  {
      ChildReference childReference0 = new ChildReference();
      StringWriter stringWriter0 = new StringWriter(21);
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      childReference0.dumpLog(stringBuffer0, false);
      assertEquals(182, stringBuffer0.capacity());
      assertEquals("<ref knownDeleted=\"false\" pendingDeleted=\"false\"><key v=\"\"/><DbLsn val=\"0xffffffff/0xffffffff\"/></ref>", stringWriter0.toString());
  }

  @Test
  public void test41()  throws Throwable  {
      ChildReference childReference0 = new ChildReference();
      byte[] byteArray0 = new byte[3];
      childReference0.setKey(byteArray0);
      childReference0.setLsn((-401L));
      assertEquals((-401L), childReference0.getLsn());
  }
}