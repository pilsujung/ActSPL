/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 21 20:19:37 KST 2017
 */

package com.sleepycat.je.dbi;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Set;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.sleepycat.je.BtreeStats;
import com.sleepycat.je.DatabaseStats;
import com.sleepycat.je.tree.BIN;
import com.sleepycat.je.tree.DBIN;
import com.sleepycat.je.tree.DIN;
import com.sleepycat.je.tree.DupCountLN;
import com.sleepycat.je.tree.IN;
import com.sleepycat.je.tree.Node;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class StatsAccumulator_ESTest7 extends StatsAccumulator_ESTest_scaffolding7 {

  @Test
  public void test00()  throws Throwable  {
      BtreeStats btreeStats0 = new BtreeStats();
      StatsAccumulator statsAccumulator0 = new StatsAccumulator((PrintStream) null, (-892), btreeStats0);
      Long long0 = new Long(4014L);
      statsAccumulator0.processIN((IN) null, long0, 65537);
      int int0 = statsAccumulator0.getMainTreeMaxDepth();
      assertEquals(1, int0);
  }

  @Test
  public void test01()  throws Throwable  {
      BtreeStats btreeStats0 = new BtreeStats();
      StatsAccumulator statsAccumulator0 = new StatsAccumulator((PrintStream) null, (-892), btreeStats0);
      statsAccumulator0.incrementLNCount();
      long long0 = statsAccumulator0.getLNCount();
      assertEquals(1L, long0);
  }

  @Test
  public void test02()  throws Throwable  {
      StatsAccumulator statsAccumulator0 = new StatsAccumulator((PrintStream) null, 46, (DatabaseStats) null);
      Long long0 = new Long((long) 16777215);
      statsAccumulator0.processBIN((BIN) null, long0, 23);
      int int0 = statsAccumulator0.getDuplicateTreeMaxDepth();
      assertEquals(23, int0);
  }

  @Test
  public void test03()  throws Throwable  {
      BtreeStats btreeStats0 = new BtreeStats();
      StatsAccumulator statsAccumulator0 = new StatsAccumulator((PrintStream) null, 1640, btreeStats0);
      statsAccumulator0.incrementDeletedLNCount();
      long long0 = statsAccumulator0.getDeletedLNCount();
      assertEquals(1L, long0);
  }

  @Test
  public void test04()  throws Throwable  {
      StatsAccumulator statsAccumulator0 = new StatsAccumulator((PrintStream) null, 46, (DatabaseStats) null);
      DIN dIN0 = new DIN();
      statsAccumulator0.processDIN(dIN0, (Long) null, 16777215);
      assertEquals("</din>", dIN0.endTag());
  }

  @Test
  public void test05()  throws Throwable  {
      BtreeStats btreeStats0 = new BtreeStats();
      StatsAccumulator statsAccumulator0 = new StatsAccumulator((PrintStream) null, 101, btreeStats0);
      statsAccumulator0.verifyNode((Node) null);
  }

  @Test
  public void test06()  throws Throwable  {
      StatsAccumulator statsAccumulator0 = new StatsAccumulator((PrintStream) null, (-1134), (DatabaseStats) null);
      DBIN dBIN0 = new DBIN();
      statsAccumulator0.hook366(dBIN0);
      assertFalse(dBIN0.getDirty());
  }

  @Test
  public void test07()  throws Throwable  {
      StatsAccumulator statsAccumulator0 = new StatsAccumulator((PrintStream) null, 46, (DatabaseStats) null);
      DBIN dBIN0 = new DBIN();
      statsAccumulator0.hook364(dBIN0);
      assertFalse(dBIN0.getDirty());
  }

  @Test
  public void test08()  throws Throwable  {
      StatsAccumulator statsAccumulator0 = new StatsAccumulator((PrintStream) null, 46, (DatabaseStats) null);
      DIN dIN0 = new DIN();
      statsAccumulator0.hook363(dIN0);
      assertFalse(dIN0.countAsObsoleteWhenLogged());
  }

  @Test
  public void test09()  throws Throwable  {
      BtreeStats btreeStats0 = new BtreeStats();
      StatsAccumulator statsAccumulator0 = new StatsAccumulator((PrintStream) null, (-892), btreeStats0);
      int int0 = statsAccumulator0.getMainTreeMaxDepth();
      assertEquals(0, int0);
  }

  @Test
  public void test10()  throws Throwable  {
      StatsAccumulator statsAccumulator0 = new StatsAccumulator((PrintStream) null, 46, (DatabaseStats) null);
      long long0 = statsAccumulator0.getLNCount();
      assertEquals(0L, long0);
  }

  @Test
  public void test11()  throws Throwable  {
      BtreeStats btreeStats0 = new BtreeStats();
      StatsAccumulator statsAccumulator0 = new StatsAccumulator((PrintStream) null, 1640, btreeStats0);
      long[] longArray0 = statsAccumulator0.getINsByLevel();
      assertNotNull(longArray0);
  }

  @Test
  public void test12()  throws Throwable  {
      StatsAccumulator statsAccumulator0 = new StatsAccumulator((PrintStream) null, 46, (DatabaseStats) null);
      Set set0 = statsAccumulator0.getINNodeIdsSeen();
      assertTrue(set0.isEmpty());
  }

  @Test
  public void test13()  throws Throwable  {
      StatsAccumulator statsAccumulator0 = new StatsAccumulator((PrintStream) null, 46, (DatabaseStats) null);
      int int0 = statsAccumulator0.getDuplicateTreeMaxDepth();
      assertEquals(0, int0);
  }

  @Test
  public void test14()  throws Throwable  {
      BtreeStats btreeStats0 = new BtreeStats();
      StatsAccumulator statsAccumulator0 = new StatsAccumulator((PrintStream) null, (-1), btreeStats0);
      Set set0 = statsAccumulator0.getDupCountLNCount();
      assertEquals(0, set0.size());
  }

  @Test
  public void test15()  throws Throwable  {
      BtreeStats btreeStats0 = new BtreeStats();
      StatsAccumulator statsAccumulator0 = new StatsAccumulator((PrintStream) null, 1640, btreeStats0);
      long long0 = statsAccumulator0.getDeletedLNCount();
      assertEquals(0L, long0);
  }

  @Test
  public void test16()  throws Throwable  {
      BtreeStats btreeStats0 = new BtreeStats();
      StatsAccumulator statsAccumulator0 = new StatsAccumulator((PrintStream) null, 1640, btreeStats0);
      long[] longArray0 = statsAccumulator0.getDINsByLevel();
      assertNotNull(longArray0);
  }

  @Test
  public void test17()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(25);
      PrintStream printStream0 = new PrintStream((OutputStream) byteArrayOutputStream0);
      StatsAccumulator statsAccumulator0 = new StatsAccumulator(printStream0, 0, (DatabaseStats) null);
      Set set0 = statsAccumulator0.getDINNodeIdsSeen();
      assertEquals(0, set0.size());
  }

  @Test
  public void test18()  throws Throwable  {
      BtreeStats btreeStats0 = new BtreeStats();
      StatsAccumulator statsAccumulator0 = new StatsAccumulator((PrintStream) null, (-892), btreeStats0);
      long[] longArray0 = statsAccumulator0.getDBINsByLevel();
      assertNotNull(longArray0);
  }

  @Test
  public void test19()  throws Throwable  {
      BtreeStats btreeStats0 = new BtreeStats();
      StatsAccumulator statsAccumulator0 = new StatsAccumulator((PrintStream) null, (-4256), btreeStats0);
      Set set0 = statsAccumulator0.getDBINNodeIdsSeen();
      assertEquals(0, set0.size());
  }

  @Test
  public void test20()  throws Throwable  {
      BtreeStats btreeStats0 = new BtreeStats();
      StatsAccumulator statsAccumulator0 = new StatsAccumulator((PrintStream) null, (-892), btreeStats0);
      long[] longArray0 = statsAccumulator0.getBINsByLevel();
      assertNotNull(longArray0);
  }

  @Test
  public void test21()  throws Throwable  {
      StatsAccumulator statsAccumulator0 = new StatsAccumulator((PrintStream) null, (-1134), (DatabaseStats) null);
      Set set0 = statsAccumulator0.getBINNodeIdsSeen();
      assertTrue(set0.isEmpty());
  }

  @Test
  public void test22()  throws Throwable  {
      StatsAccumulator statsAccumulator0 = new StatsAccumulator((PrintStream) null, (-30), (DatabaseStats) null);
      // Undeclared exception!
      try { 
        statsAccumulator0.processIN((IN) null, (Long) null, (-30));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -30
         //
         assertThrownBy("com.sleepycat.je.dbi.StatsAccumulator", e);
      }
  }

  @Test
  public void test23()  throws Throwable  {
      BtreeStats btreeStats0 = new BtreeStats();
      StatsAccumulator statsAccumulator0 = new StatsAccumulator((PrintStream) null, 418, btreeStats0);
      DIN dIN0 = new DIN();
      Long long0 = new Long((long) 418);
      // Undeclared exception!
      try { 
        statsAccumulator0.processDIN(dIN0, long0, 281);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 281
         //
         assertThrownBy("com.sleepycat.je.dbi.StatsAccumulator", e);
      }
  }

  @Test
  public void test24()  throws Throwable  {
      BtreeStats btreeStats0 = new BtreeStats();
      StatsAccumulator statsAccumulator0 = new StatsAccumulator((PrintStream) null, 1640, btreeStats0);
      // Undeclared exception!
      try { 
        statsAccumulator0.processBIN((BIN) null, (Long) null, 1640);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1640
         //
         assertThrownBy("com.sleepycat.je.dbi.StatsAccumulator", e);
      }
  }

  @Test
  public void test25()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(25);
      PrintStream printStream0 = new PrintStream((OutputStream) byteArrayOutputStream0);
      StatsAccumulator statsAccumulator0 = new StatsAccumulator(printStream0, 0, (DatabaseStats) null);
      // Undeclared exception!
      try { 
        statsAccumulator0.copyToStats((DatabaseStats) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.dbi.StatsAccumulator", e);
      }
  }

  @Test
  public void test26()  throws Throwable  {
      BtreeStats btreeStats0 = new BtreeStats();
      StatsAccumulator statsAccumulator0 = new StatsAccumulator((PrintStream) null, (-1316), btreeStats0);
      DBIN dBIN0 = new DBIN();
      // Undeclared exception!
      try { 
        statsAccumulator0.processDBIN(dBIN0, (Long) null, (-1273));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1273
         //
         assertThrownBy("com.sleepycat.je.dbi.StatsAccumulator", e);
      }
  }

  @Test
  public void test27()  throws Throwable  {
      BtreeStats btreeStats0 = new BtreeStats();
      StatsAccumulator statsAccumulator0 = new StatsAccumulator((PrintStream) null, (-1), btreeStats0);
      // Undeclared exception!
      try { 
        statsAccumulator0.incrementLNCount();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.dbi.StatsAccumulator", e);
      }
  }

  @Test
  public void test28()  throws Throwable  {
      StatsAccumulator statsAccumulator0 = new StatsAccumulator((PrintStream) null, 46, (DatabaseStats) null);
      statsAccumulator0.incrementLNCount();
  }

  @Test
  public void test29()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(25);
      PrintStream printStream0 = new PrintStream((OutputStream) byteArrayOutputStream0);
      StatsAccumulator statsAccumulator0 = new StatsAccumulator(printStream0, 0, (DatabaseStats) null);
      statsAccumulator0.incrementLNCount();
  }

  @Test
  public void test30()  throws Throwable  {
      StatsAccumulator statsAccumulator0 = new StatsAccumulator((PrintStream) null, 46, (DatabaseStats) null);
      Long long0 = new Long((long) 16777215);
      statsAccumulator0.processBIN((BIN) null, long0, 23);
      DBIN dBIN0 = new DBIN();
      statsAccumulator0.processDBIN(dBIN0, long0, 23);
      assertTrue(dBIN0.isCompressible());
  }

  @Test
  public void test31()  throws Throwable  {
      BtreeStats btreeStats0 = new BtreeStats();
      StatsAccumulator statsAccumulator0 = new StatsAccumulator((PrintStream) null, (-892), btreeStats0);
      Long long0 = new Long(4014L);
      statsAccumulator0.processIN((IN) null, long0, 65536);
  }

  @Test
  public void test32()  throws Throwable  {
      BtreeStats btreeStats0 = new BtreeStats();
      StatsAccumulator statsAccumulator0 = new StatsAccumulator((PrintStream) null, 1640, btreeStats0);
      Long long0 = new Long((long) 281);
      statsAccumulator0.processIN((IN) null, long0, 131072);
  }

  @Test
  public void test33()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(25);
      PrintStream printStream0 = new PrintStream((OutputStream) byteArrayOutputStream0);
      StatsAccumulator statsAccumulator0 = new StatsAccumulator(printStream0, 0, (DatabaseStats) null);
      Long long0 = new Long((long) 0);
      statsAccumulator0.processDIN((DIN) null, long0, 56);
      statsAccumulator0.processDIN((DIN) null, long0, 0);
  }

  @Test
  public void test34()  throws Throwable  {
      StatsAccumulator statsAccumulator0 = new StatsAccumulator((PrintStream) null, 46, (DatabaseStats) null);
      Long long0 = new Long((long) 16777215);
      DupCountLN dupCountLN0 = new DupCountLN();
      statsAccumulator0.processDupCountLN(dupCountLN0, long0);
      assertEquals("<dupCountLN>", dupCountLN0.beginTag());
  }

  @Test
  public void test35()  throws Throwable  {
      StatsAccumulator statsAccumulator0 = new StatsAccumulator((PrintStream) null, 46, (DatabaseStats) null);
      Long long0 = new Long((long) 16777215);
      statsAccumulator0.processBIN((BIN) null, long0, 23);
      statsAccumulator0.processBIN((BIN) null, long0, 21);
  }

  @Test
  public void test36()  throws Throwable  {
      BtreeStats btreeStats0 = new BtreeStats();
      StatsAccumulator statsAccumulator0 = new StatsAccumulator((PrintStream) null, (-892), btreeStats0);
      DupCountLN dupCountLN0 = new DupCountLN();
      statsAccumulator0.hook367(dupCountLN0);
      assertEquals(0, dupCountLN0.getDupCount());
  }

  @Test
  public void test37()  throws Throwable  {
      StatsAccumulator statsAccumulator0 = new StatsAccumulator((PrintStream) null, 46, (DatabaseStats) null);
      Long long0 = new Long((long) 16777215);
      DBIN dBIN0 = new DBIN();
      statsAccumulator0.processDBIN(dBIN0, long0, 23);
      statsAccumulator0.processDBIN(dBIN0, long0, 100000);
      assertFalse(dBIN0.countAsObsoleteWhenLogged());
  }

  @Test
  public void test38()  throws Throwable  {
      BtreeStats btreeStats0 = new BtreeStats();
      StatsAccumulator statsAccumulator0 = new StatsAccumulator((PrintStream) null, (-892), btreeStats0);
      Long long0 = new Long(4014L);
      statsAccumulator0.processIN((IN) null, long0, 65537);
      statsAccumulator0.processIN((IN) null, long0, (-3615));
  }

  @Test
  public void test39()  throws Throwable  {
      BtreeStats btreeStats0 = new BtreeStats();
      StatsAccumulator statsAccumulator0 = new StatsAccumulator((PrintStream) null, (-892), btreeStats0);
      statsAccumulator0.copyToStats(btreeStats0);
      assertEquals(0, btreeStats0.getMainTreeMaxDepth());
      assertEquals(0, btreeStats0.getDuplicateTreeMaxDepth());
      assertEquals(0L, btreeStats0.getDeletedLeafNodeCount());
      assertEquals(0L, btreeStats0.getLeafNodeCount());
  }

  @Test
  public void test40()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(25);
      PrintStream printStream0 = new PrintStream((OutputStream) byteArrayOutputStream0);
      StatsAccumulator statsAccumulator0 = new StatsAccumulator(printStream0, 0, (DatabaseStats) null);
      statsAccumulator0.hook365((DIN) null);
  }
}
