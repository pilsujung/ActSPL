/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 00:43:00 KST 2017
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
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
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

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class StatsAccumulator_ESTest6 extends StatsAccumulator_ESTest_scaffolding6 {

  @Test
  public void test00()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(0);
      PrintStream printStream0 = new PrintStream((OutputStream) byteArrayOutputStream0, true);
      StatsAccumulator statsAccumulator0 = new StatsAccumulator(printStream0, 0, (DatabaseStats) null);
      DIN dIN0 = new DIN();
      Long long0 = new Long((long) (-8));
      statsAccumulator0.processDIN(dIN0, long0, 18);
      int int0 = statsAccumulator0.getDuplicateTreeMaxDepth();
      assertEquals(18, int0);
  }

  @Test
  public void test01()  throws Throwable  {
      BtreeStats btreeStats0 = new BtreeStats();
      StatsAccumulator statsAccumulator0 = new StatsAccumulator((PrintStream) null, (-65537), btreeStats0);
      statsAccumulator0.incrementLNCount();
  }

  @Test
  public void test02()  throws Throwable  {
      BtreeStats btreeStats0 = new BtreeStats();
      StatsAccumulator statsAccumulator0 = new StatsAccumulator((PrintStream) null, 533, btreeStats0);
      DBIN dBIN0 = new DBIN();
      statsAccumulator0.processBIN(dBIN0, (Long) null, 0);
      assertEquals("DBIN", dBIN0.shortClassName());
  }

  @Test
  public void test03()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      PrintStream printStream0 = new PrintStream((OutputStream) byteArrayOutputStream0);
      BtreeStats btreeStats0 = new BtreeStats();
      StatsAccumulator statsAccumulator0 = new StatsAccumulator(printStream0, 65536, btreeStats0);
      statsAccumulator0.progressInterval = (-3645);
      statsAccumulator0.processDBIN((DBIN) null, (Long) null, 65536);
  }

  @Test
  public void test04()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(0);
      PrintStream printStream0 = new PrintStream((OutputStream) byteArrayOutputStream0, false);
      StatsAccumulator statsAccumulator0 = new StatsAccumulator(printStream0, 0, (DatabaseStats) null);
      DIN dIN0 = new DIN();
      Long long0 = new Long((long) (-8));
      // Undeclared exception!
      try { 
        statsAccumulator0.processDIN(dIN0, long0, (-8));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -8
         //
         assertThrownBy("com.sleepycat.je.dbi.StatsAccumulator", e);
      }
  }

  @Test
  public void test05()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(0);
      PrintStream printStream0 = new PrintStream((OutputStream) byteArrayOutputStream0, true);
      StatsAccumulator statsAccumulator0 = new StatsAccumulator(printStream0, 0, (DatabaseStats) null);
      DIN dIN0 = new DIN();
      Long long0 = new Long((long) (-8));
      // Undeclared exception!
      try { 
        statsAccumulator0.processDIN(dIN0, long0, (-8));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -8
         //
         assertThrownBy("com.sleepycat.je.dbi.StatsAccumulator", e);
      }
  }

  @Test
  public void test06()  throws Throwable  {
      BtreeStats btreeStats0 = new BtreeStats();
      StatsAccumulator statsAccumulator0 = new StatsAccumulator((PrintStream) null, 0, btreeStats0);
      DupCountLN dupCountLN0 = new DupCountLN();
      statsAccumulator0.hook367(dupCountLN0);
      assertFalse(dupCountLN0.countAsObsoleteWhenLogged());
  }

  @Test
  public void test07()  throws Throwable  {
      BtreeStats btreeStats0 = new BtreeStats();
      StatsAccumulator statsAccumulator0 = new StatsAccumulator((PrintStream) null, (-65537), btreeStats0);
      statsAccumulator0.hook366((DBIN) null);
  }

  @Test
  public void test08()  throws Throwable  {
      BtreeStats btreeStats0 = new BtreeStats();
      StatsAccumulator statsAccumulator0 = new StatsAccumulator((PrintStream) null, (-4064), btreeStats0);
      DIN dIN0 = new DIN();
      statsAccumulator0.hook365(dIN0);
      assertFalse(dIN0.countAsObsoleteWhenLogged());
  }

  @Test
  public void test09()  throws Throwable  {
      BtreeStats btreeStats0 = new BtreeStats();
      StatsAccumulator statsAccumulator0 = new StatsAccumulator((PrintStream) null, (-4064), btreeStats0);
      statsAccumulator0.hook364((BIN) null);
  }

  @Test
  public void test10()  throws Throwable  {
      BtreeStats btreeStats0 = new BtreeStats();
      StatsAccumulator statsAccumulator0 = new StatsAccumulator((PrintStream) null, (-65537), btreeStats0);
      int int0 = statsAccumulator0.getMainTreeMaxDepth();
      assertEquals(0, int0);
  }

  @Test
  public void test11()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      PrintStream printStream0 = new PrintStream((OutputStream) byteArrayOutputStream0);
      BtreeStats btreeStats0 = new BtreeStats();
      StatsAccumulator statsAccumulator0 = new StatsAccumulator(printStream0, 0, btreeStats0);
      long long0 = statsAccumulator0.getLNCount();
      assertEquals(0L, long0);
  }

  @Test
  public void test12()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      PrintStream printStream0 = new PrintStream((OutputStream) byteArrayOutputStream0);
      BtreeStats btreeStats0 = new BtreeStats();
      StatsAccumulator statsAccumulator0 = new StatsAccumulator(printStream0, (-22), btreeStats0);
      long[] longArray0 = statsAccumulator0.getINsByLevel();
      assertNotNull(longArray0);
  }

  @Test
  public void test13()  throws Throwable  {
      StatsAccumulator statsAccumulator0 = new StatsAccumulator((PrintStream) null, 1073741824, (DatabaseStats) null);
      Set set0 = statsAccumulator0.getINNodeIdsSeen();
      assertTrue(set0.isEmpty());
  }

  @Test
  public void test14()  throws Throwable  {
      BtreeStats btreeStats0 = new BtreeStats();
      StatsAccumulator statsAccumulator0 = new StatsAccumulator((PrintStream) null, 1761, btreeStats0);
      Set set0 = statsAccumulator0.getDupCountLNCount();
      assertTrue(set0.isEmpty());
  }

  @Test
  public void test15()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(0);
      PrintStream printStream0 = new PrintStream((OutputStream) byteArrayOutputStream0, true);
      StatsAccumulator statsAccumulator0 = new StatsAccumulator(printStream0, 0, (DatabaseStats) null);
      long long0 = statsAccumulator0.getDeletedLNCount();
      assertEquals(0L, long0);
  }

  @Test
  public void test16()  throws Throwable  {
      BtreeStats btreeStats0 = new BtreeStats();
      StatsAccumulator statsAccumulator0 = new StatsAccumulator((PrintStream) null, (-65537), btreeStats0);
      long[] longArray0 = statsAccumulator0.getDINsByLevel();
      assertNotNull(longArray0);
  }

  @Test
  public void test17()  throws Throwable  {
      BtreeStats btreeStats0 = new BtreeStats();
      StatsAccumulator statsAccumulator0 = new StatsAccumulator((PrintStream) null, (-4064), btreeStats0);
      Set set0 = statsAccumulator0.getDINNodeIdsSeen();
      assertTrue(set0.isEmpty());
  }

  @Test
  public void test18()  throws Throwable  {
      BtreeStats btreeStats0 = new BtreeStats();
      StatsAccumulator statsAccumulator0 = new StatsAccumulator((PrintStream) null, (-65537), btreeStats0);
      long[] longArray0 = statsAccumulator0.getDBINsByLevel();
      assertNotNull(longArray0);
  }

  @Test
  public void test19()  throws Throwable  {
      DatabaseImpl databaseImpl0 = new DatabaseImpl();
      BtreeStats btreeStats0 = (BtreeStats)databaseImpl0.getEmptyStats();
      StatsAccumulator statsAccumulator0 = new StatsAccumulator((PrintStream) null, 131072, btreeStats0);
      statsAccumulator0.getBINsByLevel();
      //  // Unstable assertion: assertEquals(1L, databaseImpl0.getEofNodeId());
  }

  @Test
  public void test20()  throws Throwable  {
      BtreeStats btreeStats0 = new BtreeStats();
      StatsAccumulator statsAccumulator0 = new StatsAccumulator((PrintStream) null, 533, btreeStats0);
      DBIN dBIN0 = new DBIN();
      // Undeclared exception!
      try { 
        statsAccumulator0.processDBIN(dBIN0, (Long) 0L, 2374);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2374
         //
         assertThrownBy("com.sleepycat.je.dbi.StatsAccumulator", e);
      }
  }

  @Test
  public void test21()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream(pipedInputStream0);
      PrintStream printStream0 = new PrintStream((OutputStream) pipedOutputStream0, false);
      BtreeStats btreeStats0 = new BtreeStats();
      StatsAccumulator statsAccumulator0 = new StatsAccumulator(printStream0, (-3804), btreeStats0);
      Long long0 = new Long((long) 0);
      // Undeclared exception!
      try { 
        statsAccumulator0.processBIN((BIN) null, long0, 533);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 533
         //
         assertThrownBy("com.sleepycat.je.dbi.StatsAccumulator", e);
      }
  }

  @Test
  public void test22()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      PrintStream printStream0 = new PrintStream((OutputStream) byteArrayOutputStream0);
      BtreeStats btreeStats0 = new BtreeStats();
      StatsAccumulator statsAccumulator0 = new StatsAccumulator(printStream0, 65536, btreeStats0);
      statsAccumulator0.incrementLNCount();
      assertEquals("", byteArrayOutputStream0.toString());
      assertEquals(0, byteArrayOutputStream0.size());
  }

  @Test
  public void test23()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      PrintStream printStream0 = new PrintStream((OutputStream) byteArrayOutputStream0);
      BtreeStats btreeStats0 = new BtreeStats();
      StatsAccumulator statsAccumulator0 = new StatsAccumulator(printStream0, 0, btreeStats0);
      statsAccumulator0.incrementLNCount();
      long long0 = statsAccumulator0.getLNCount();
      assertEquals(1L, long0);
      assertEquals(0L, btreeStats0.getLeafNodeCount());
  }

  @Test
  public void test24()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream(pipedInputStream0);
      PrintStream printStream0 = new PrintStream((OutputStream) pipedOutputStream0, false);
      BtreeStats btreeStats0 = new BtreeStats();
      StatsAccumulator statsAccumulator0 = new StatsAccumulator(printStream0, (-3804), btreeStats0);
      DBIN dBIN0 = new DBIN();
      // Undeclared exception!
      try { 
        statsAccumulator0.processIN(dBIN0, (Long) null, (-3804));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -3804
         //
         assertThrownBy("com.sleepycat.je.dbi.StatsAccumulator", e);
      }
  }

  @Test
  public void test25()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream(pipedInputStream0);
      PrintStream printStream0 = new PrintStream((OutputStream) pipedOutputStream0, false);
      BtreeStats btreeStats0 = new BtreeStats();
      StatsAccumulator statsAccumulator0 = new StatsAccumulator(printStream0, (-3804), btreeStats0);
      Long long0 = new Long((long) 0);
      DupCountLN dupCountLN0 = new DupCountLN();
      statsAccumulator0.processDupCountLN(dupCountLN0, long0);
      assertFalse(dupCountLN0.isDeleted());
  }

  @Test
  public void test27()  throws Throwable  {
      StatsAccumulator statsAccumulator0 = new StatsAccumulator((PrintStream) null, 1073741821, (DatabaseStats) null);
      statsAccumulator0.incrementDeletedLNCount();
  }

  @Test
  public void test28()  throws Throwable  {
      BtreeStats btreeStats0 = new BtreeStats();
      StatsAccumulator statsAccumulator0 = new StatsAccumulator((PrintStream) null, (-65537), btreeStats0);
      statsAccumulator0.copyToStats(btreeStats0);
      assertEquals(0, btreeStats0.getDuplicateTreeMaxDepth());
      assertEquals(0, btreeStats0.getMainTreeMaxDepth());
      assertEquals(0L, btreeStats0.getDeletedLeafNodeCount());
      assertEquals(0L, btreeStats0.getLeafNodeCount());
  }

  @Test
  public void test29()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      PrintStream printStream0 = new PrintStream((OutputStream) byteArrayOutputStream0);
      BtreeStats btreeStats0 = new BtreeStats();
      StatsAccumulator statsAccumulator0 = new StatsAccumulator(printStream0, 65536, btreeStats0);
      Set set0 = statsAccumulator0.getBINNodeIdsSeen();
      assertEquals(0, set0.size());
  }

  @Test
  public void test30()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(0);
      PrintStream printStream0 = new PrintStream((OutputStream) byteArrayOutputStream0, true);
      StatsAccumulator statsAccumulator0 = new StatsAccumulator(printStream0, 0, (DatabaseStats) null);
      int int0 = statsAccumulator0.getDuplicateTreeMaxDepth();
      assertEquals(0, int0);
  }

  @Test
  public void test31()  throws Throwable  {
      StatsAccumulator statsAccumulator0 = new StatsAccumulator((PrintStream) null, 1073741821, (DatabaseStats) null);
      Set set0 = statsAccumulator0.getDBINNodeIdsSeen();
      assertEquals(0, set0.size());
  }

  @Test
  public void test32()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(0);
      PrintStream printStream0 = new PrintStream((OutputStream) byteArrayOutputStream0, true);
      StatsAccumulator statsAccumulator0 = new StatsAccumulator(printStream0, 0, (DatabaseStats) null);
      DIN dIN0 = new DIN();
      Long long0 = new Long((long) (-8));
      statsAccumulator0.processDIN(dIN0, long0, 18);
      statsAccumulator0.processDIN(dIN0, long0, (-3052));
      //  // Unstable assertion: assertEquals(0L, dIN0.getLastId());
  }

  @Test
  public void test33()  throws Throwable  {
      StatsAccumulator statsAccumulator0 = new StatsAccumulator((PrintStream) null, (-1608), (DatabaseStats) null);
      statsAccumulator0.hook363((IN) null);
  }
}
