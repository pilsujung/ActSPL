/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 01:44:26 KST 2017
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
import java.nio.CharBuffer;
import java.nio.charset.Charset;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.sleepycat.je.cleaner.FileSummary;
import com.sleepycat.je.cleaner.TrackedFileSummary;
import com.sleepycat.je.dbi.DatabaseImpl;
import com.sleepycat.je.log.LogEntryType;

import sun.nio.cs.ext.MS949;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class FileSummaryLN_ESTest2 extends FileSummaryLN_ESTest_scaffolding2 {

  @Test
  public void test00()  throws Throwable  {
      FileSummaryLN fileSummaryLN0 = new FileSummaryLN();
      FileSummary fileSummary0 = fileSummaryLN0.getBaseSummary();
      fileSummary0.totalLNCount = 1270;
  }

  @Test
  public void test01()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      FileSummaryLN fileSummaryLN0 = new FileSummaryLN(fileSummary0);
      fileSummary0.totalCount = 1011;
      fileSummaryLN0.getBaseSummary();
      //  // Unstable assertion: assertEquals(263L, fileSummaryLN0.getNodeId());
  }

  @Test
  public void test02()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      FileSummaryLN fileSummaryLN0 = new FileSummaryLN(fileSummary0);
      fileSummaryLN0.getBaseSummary();
      fileSummary0.totalCount = (-5);
  }

  @Test
  public void test03()  throws Throwable  {
      byte[] byteArray0 = FileSummaryLN.makeFullKey(0, 0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)127, (byte) (-1), (byte) (-1), (byte) (-1)}, byteArray0);
  }

  @Test
  public void test04()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      FileSummaryLN fileSummaryLN0 = new FileSummaryLN(fileSummary0);
      byte[] byteArray0 = new byte[9];
      // Undeclared exception!
      try { 
        fileSummaryLN0.getFileNumber(byteArray0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\"
         //
         assertThrownBy("java.lang.NumberFormatException", e);
      }
  }


  @Test
  public void test06()  throws Throwable  {
      FileSummaryLN fileSummaryLN0 = new FileSummaryLN();
      // Undeclared exception!
      try { 
        fileSummaryLN0.readFromLog((ByteBuffer) null, (byte) (-18));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.LogUtils", e);
      }
  }


  @Test
  public void test08()  throws Throwable  {
      FileSummaryLN fileSummaryLN0 = new FileSummaryLN();
      // Undeclared exception!
      try { 
        fileSummaryLN0.dumpString(2680, true);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: 2680
         //
         assertThrownBy("java.lang.String", e);
      }
  }

  @Test
  public void test09()  throws Throwable  {
      FileSummaryLN fileSummaryLN0 = new FileSummaryLN();
      String string0 = fileSummaryLN0.dumpString(0, true);
      assertEquals("<fileSummaryLN>\n  <node>0</node>\n</fileSummaryLN>\n", string0);
  }

  @Test
  public void test10()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      FileSummaryLN fileSummaryLN0 = new FileSummaryLN(fileSummary0);
      String string0 = fileSummaryLN0.dumpString(0, true);
      //  // Unstable assertion: assertEquals("<fileSummaryLN>\n  <node>229</node>\n  <data></data>\n</fileSummaryLN>\n<summary totalCount=\"0\" totalSize=\"0\" totalINCount=\"0\" totalINSize=\"0\" totalLNCount=\"0\" totalLNSize=\"0\" obsoleteINCount=\"0\" obsoleteLNCount=\"0\"/><offsets size=\"0\"/>", string0);
  }

  @Test
  public void test11()  throws Throwable  {
      byte[] byteArray0 = FileSummaryLN.makePartialKey(2048L);
      FileSummaryLN fileSummaryLN0 = new FileSummaryLN();
      boolean boolean0 = fileSummaryLN0.hasStringKey(byteArray0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)8, (byte)0}, byteArray0);
      assertTrue(boolean0);
  }


  @Test
  public void test13()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      FileSummaryLN fileSummaryLN0 = new FileSummaryLN(fileSummary0);
      fileSummaryLN0.endTag();
      //  // Unstable assertion: assertEquals(223L, fileSummaryLN0.getNodeId());
  }

  @Test
  public void test14()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      FileSummaryLN fileSummaryLN0 = new FileSummaryLN(fileSummary0);
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("</fileSummaryLN>");
      // Undeclared exception!
      try { 
        fileSummaryLN0.readFromLog(byteBuffer0, (byte) (-68));
        fail("Expecting exception: BufferUnderflowException");
      
      } catch(BufferUnderflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.nio.Buffer", e);
      }
  }

  @Test
  public void test15()  throws Throwable  {
      FileSummaryLN fileSummaryLN0 = new FileSummaryLN();
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("<fileSummaryLN>");
      CharBuffer charBuffer0 = mS949_0.decode(byteBuffer0);
      ByteBuffer byteBuffer1 = mS949_0.encode(charBuffer0);
      fileSummaryLN0.writeToLog(byteBuffer1);
      assertFalse(byteBuffer1.isDirect());
  }

  @Test
  public void test16()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      FileSummaryLN fileSummaryLN0 = new FileSummaryLN(fileSummary0);
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("<com.sleepycat.je.tree.FileSummaryLN/4294969161");
      // Undeclared exception!
      try { 
        fileSummaryLN0.writeToLog(byteBuffer0);
        fail("Expecting exception: BufferOverflowException");
      
      } catch(BufferOverflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.nio.Buffer", e);
      }
  }

  @Test
  public void test17()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      FileSummaryLN fileSummaryLN0 = new FileSummaryLN(fileSummary0);
      int int0 = fileSummaryLN0.getLogSize();
      //  // Unstable assertion: assertEquals(177L, fileSummaryLN0.getNodeId());
      //  // Unstable assertion: assertEquals(53, int0);
  }


  @Test
  public void test20()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      FileSummaryLN fileSummaryLN0 = new FileSummaryLN(fileSummary0);
      StringWriter stringWriter0 = new StringWriter(5723);
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      fileSummaryLN0.dumpLog(stringBuffer0, true);
      //  // Unstable assertion: assertEquals(224, stringBuffer0.length());
      //  // Unstable assertion: assertEquals(157L, fileSummaryLN0.getLastId());
  }

  @Test
  public void test21()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      FileSummaryLN fileSummaryLN0 = new FileSummaryLN(fileSummary0);
      StringWriter stringWriter0 = new StringWriter(879);
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      fileSummaryLN0.dumpLogAdditional(stringBuffer0, false);
      //  // Unstable assertion: assertEquals(145, stringBuffer0.length());
      //  // Unstable assertion: assertEquals(148L, fileSummaryLN0.getNodeId());
  }

  @Test
  public void test22()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      FileSummaryLN fileSummaryLN0 = new FileSummaryLN(fileSummary0);
      // Undeclared exception!
      try { 
        fileSummaryLN0.dumpLogAdditional((StringBuffer) null, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.cleaner.FileSummary", e);
      }
  }

  @Test
  public void test23()  throws Throwable  {
      FileSummaryLN fileSummaryLN0 = new FileSummaryLN();
      StringWriter stringWriter0 = new StringWriter();
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      fileSummaryLN0.dumpLog(stringBuffer0, false);
      assertEquals(70, stringBuffer0.capacity());
      assertEquals("<fileSummaryLN>", fileSummaryLN0.beginTag());
  }


  @Test
  public void test25()  throws Throwable  {
      FileSummaryLN fileSummaryLN0 = new FileSummaryLN();
      DatabaseImpl databaseImpl0 = new DatabaseImpl();
      fileSummaryLN0.postFetchInit(databaseImpl0, 0);
      //  // Unstable assertion: assertEquals(136L, databaseImpl0.getEofNodeId());
      //  // Unstable assertion: assertEquals(136L, fileSummaryLN0.getLastId());
  }

  @Test
  public void test27()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      FileSummaryLN fileSummaryLN0 = new FileSummaryLN(fileSummary0);
      byte[] byteArray0 = new byte[8];
      long long0 = fileSummaryLN0.getFileNumber(byteArray0);
      //  // Unstable assertion: assertEquals(108L, fileSummaryLN0.getLastId());
      //  // Unstable assertion: assertEquals(0L, long0);
  }

  @Test
  public void test28()  throws Throwable  {
      FileSummaryLN fileSummaryLN0 = new FileSummaryLN();
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("<fileSummaryLN>");
      CharBuffer charBuffer0 = mS949_0.decode(byteBuffer0);
      ByteBuffer byteBuffer1 = mS949_0.encode(charBuffer0);
      fileSummaryLN0.readFromLog(byteBuffer1, (byte)96);
      byte[] byteArray0 = new byte[1];
      boolean boolean0 = fileSummaryLN0.hasStringKey(byteArray0);
      assertTrue(boolean0);
  }

  @Test
  public void test29()  throws Throwable  {
      byte[] byteArray0 = FileSummaryLN.makeFullKey(4294967289L, 514);
      FileSummary fileSummary0 = new FileSummary();
      FileSummaryLN fileSummaryLN0 = new FileSummaryLN(fileSummary0);
      long long0 = fileSummaryLN0.getFileNumber(byteArray0);
      //  // Unstable assertion: assertEquals(35L, fileSummaryLN0.getLastId());
      //  // Unstable assertion: assertEquals(4294967289L, long0);
  }


  @Test
  public void test32()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      FileSummaryLN fileSummaryLN0 = new FileSummaryLN(fileSummary0);
      fileSummaryLN0.getObsoleteOffsets();
      //  // Unstable assertion: assertEquals(26L, fileSummaryLN0.getLastId());
  }



  @Test
  public void test35()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      FileSummaryLN fileSummaryLN0 = new FileSummaryLN(fileSummary0);
      fileSummaryLN0.getTrackedSummary();
      //  // Unstable assertion: assertEquals(19L, fileSummaryLN0.getLastId());
  }

  @Test
  public void test36()  throws Throwable  {
      FileSummary fileSummary0 = new FileSummary();
      FileSummaryLN fileSummaryLN0 = new FileSummaryLN(fileSummary0);
      fileSummaryLN0.setTrackedSummary((TrackedFileSummary) null);
      // Undeclared exception!
      try { 
        fileSummaryLN0.getLogSize();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.FileSummaryLN", e);
      }
  }

  @Test
  public void test37()  throws Throwable  {
      FileSummaryLN fileSummaryLN0 = new FileSummaryLN();
      FileSummary fileSummary0 = fileSummaryLN0.getBaseSummary();
      fileSummary0.obsoleteLNCount = 1504;
  }
}
