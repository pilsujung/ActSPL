/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 13:32:52 KST 2017
 */

package com.sleepycat.je;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.sleepycat.je.DatabaseEntry;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class DatabaseEntry_ESTest4 extends DatabaseEntry_ESTest_scaffolding4 {

  @Test
  public void test00()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0);
      int int0 = databaseEntry0.getSize();
      assertEquals(0, databaseEntry0.getPartialLength());
      assertEquals(0, databaseEntry0.getPartialOffset());
      assertEquals(2, int0);
      assertFalse(databaseEntry0.getPartial());
  }

  @Test
  public void test01()  throws Throwable  {
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      databaseEntry0.setSize((-50));
      int int0 = databaseEntry0.getSize();
      assertEquals((-50), int0);
  }

  @Test
  public void test02()  throws Throwable  {
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      databaseEntry0.setPartial(1, 1, false);
      int int0 = databaseEntry0.getPartialOffset();
      assertEquals(1, databaseEntry0.getPartialLength());
      assertEquals(1, int0);
  }

  @Test
  public void test03()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0);
      databaseEntry0.setPartial((int) (byte) (-1), (int) (byte)0, false);
      int int0 = databaseEntry0.getPartialOffset();
      assertEquals((-1), int0);
  }

  @Test
  public void test04()  throws Throwable  {
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      databaseEntry0.setPartial(795, (-1613), true);
      int int0 = databaseEntry0.getPartialLength();
      assertEquals((-1613), int0);
  }

  @Test
  public void test05()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0);
      databaseEntry0.setPartial((-3314), (-1471), true);
      boolean boolean0 = databaseEntry0.getPartial();
      assertEquals(-1471, databaseEntry0.getPartialLength());
      assertTrue(boolean0);
  }

  @Test
  public void test06()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0);
      databaseEntry0.setOffset((byte)43);
      int int0 = databaseEntry0.getOffset();
      assertEquals(43, int0);
  }

  @Test
  public void test07()  throws Throwable  {
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      byte[] byteArray0 = new byte[2];
      databaseEntry0.setData(byteArray0, (int) (byte) (-104), (int) (byte)0);
      int int0 = databaseEntry0.getOffset();
      assertEquals((-104), int0);
  }

  @Test
  public void test08()  throws Throwable  {
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      byte[] byteArray0 = new byte[0];
      databaseEntry0.setData(byteArray0, (-1), (-1));
      databaseEntry0.getData();
      assertEquals(-1, databaseEntry0.getSize());
  }

  @Test
  public void test09()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byteArray0[1] = (byte)1;
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0);
      databaseEntry0.hashCode();
      assertEquals(0, databaseEntry0.getPartialLength());
      assertFalse(databaseEntry0.getPartial());
      assertEquals(0, databaseEntry0.getPartialOffset());
  }

  @Test
  public void test10()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0, 3317, (int) (byte) (-1));
      databaseEntry0.hashCode();
      assertEquals(-1, databaseEntry0.getSize());
      assertEquals(0, databaseEntry0.getPartialLength());
      assertEquals(0, databaseEntry0.getPartialOffset());
      assertEquals(3317, databaseEntry0.getOffset());
      assertFalse(databaseEntry0.getPartial());
  }

  @Test
  public void test11()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byteArray0[2] = (byte) (-1);
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0);
      databaseEntry0.setOffset((byte)1);
      DatabaseEntry databaseEntry1 = new DatabaseEntry(byteArray0);
      boolean boolean0 = databaseEntry0.equals(databaseEntry1);
      assertEquals(1, databaseEntry0.getOffset());
      assertFalse(boolean0);
  }

  @Test
  public void test12()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0, 0, (-1));
      boolean boolean0 = databaseEntry0.equals(databaseEntry0);
      assertTrue(boolean0);
      assertFalse(databaseEntry0.getPartial());
      assertEquals(-1, databaseEntry0.getSize());
      assertEquals(0, databaseEntry0.getPartialLength());
      assertEquals(0, databaseEntry0.getPartialOffset());
      assertEquals(0, databaseEntry0.getOffset());
  }

  @Test
  public void test13()  throws Throwable  {
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      byte[] byteArray0 = new byte[7];
      databaseEntry0.setData(byteArray0, (int) (byte)0, (int) (byte)0);
      DatabaseEntry databaseEntry1 = new DatabaseEntry(byteArray0);
      boolean boolean0 = databaseEntry1.equals(databaseEntry0);
      assertEquals(0, databaseEntry0.getPartialLength());
      assertFalse(boolean0);
      assertEquals(0, databaseEntry0.getPartialOffset());
      assertFalse(databaseEntry0.getPartial());
      assertFalse(databaseEntry1.getPartial());
      assertEquals(0, databaseEntry1.getPartialLength());
      assertEquals(0, databaseEntry0.getOffset());
      assertEquals(0, databaseEntry0.getSize());
      assertEquals(0, databaseEntry1.getPartialOffset());
  }

  @Test
  public void test14()  throws Throwable  {
      byte[] byteArray0 = new byte[13];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0);
      databaseEntry0.setPartial(true);
      DatabaseEntry databaseEntry1 = new DatabaseEntry();
      databaseEntry1.setPartial((int) (byte)17, (int) (byte)0, true);
      boolean boolean0 = databaseEntry0.equals(databaseEntry1);
      assertEquals(17, databaseEntry1.getPartialOffset());
      assertFalse(boolean0);
  }

  @Test
  public void test15()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0);
      databaseEntry0.setPartial((int) (byte)43, (int) (byte)43, true);
      DatabaseEntry databaseEntry1 = new DatabaseEntry(byteArray0);
      databaseEntry1.setPartial(true);
      boolean boolean0 = databaseEntry1.equals(databaseEntry0);
      assertEquals(43, databaseEntry0.getPartialOffset());
      assertFalse(boolean0);
  }

  @Test
  public void test16()  throws Throwable  {
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      databaseEntry0.setPartialOffset((-742));
      assertEquals(-742, databaseEntry0.getPartialOffset());
  }

  @Test
  public void test17()  throws Throwable  {
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      assertEquals(0, databaseEntry0.getPartialLength());
      
      databaseEntry0.setPartialLength((byte)1);
      int int0 = databaseEntry0.getPartialLength();
      assertEquals(1, int0);
  }

  @Test
  public void test18()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0, (-2990), 1355);
      // Undeclared exception!
      try { 
        databaseEntry0.hashCode();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2990
         //
         assertThrownBy("com.sleepycat.je.DatabaseEntry", e);
      }
  }

  @Test
  public void test19()  throws Throwable  {
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      databaseEntry0.hashCode();
      assertEquals(0, databaseEntry0.getOffset());
      assertFalse(databaseEntry0.getPartial());
      assertEquals(0, databaseEntry0.getPartialLength());
      assertEquals(0, databaseEntry0.getSize());
      assertEquals(0, databaseEntry0.getPartialOffset());
  }

  @Test
  public void test20()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte) (-1);
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0);
      databaseEntry0.setOffset((byte)1);
      DatabaseEntry databaseEntry1 = new DatabaseEntry(byteArray0);
      boolean boolean0 = databaseEntry0.equals(databaseEntry1);
      assertEquals(1, databaseEntry0.getOffset());
      assertFalse(boolean0);
  }

  @Test
  public void test21()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0, (int) (byte) (-77), (int) (byte)1);
      DatabaseEntry databaseEntry1 = new DatabaseEntry(byteArray0);
      boolean boolean0 = databaseEntry0.equals(databaseEntry1);
      assertFalse(boolean0);
      assertEquals(1, databaseEntry0.getSize());
      assertFalse(databaseEntry1.getPartial());
      assertFalse(databaseEntry0.getPartial());
      assertEquals(0, databaseEntry0.getPartialOffset());
      assertEquals(0, databaseEntry1.getPartialOffset());
      assertEquals(0, databaseEntry1.getPartialLength());
      assertEquals(-77, databaseEntry0.getOffset());
      assertEquals(0, databaseEntry0.getPartialLength());
  }

  @Test
  public void test22()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0);
      DatabaseEntry databaseEntry1 = new DatabaseEntry();
      boolean boolean0 = databaseEntry0.equals(databaseEntry1);
      assertEquals(0, databaseEntry1.getOffset());
      assertFalse(databaseEntry1.getPartial());
      assertEquals(0, databaseEntry1.getPartialOffset());
      assertEquals(0, databaseEntry1.getSize());
      assertFalse(boolean0);
      assertEquals(0, databaseEntry0.getPartialLength());
      assertEquals(0, databaseEntry0.getPartialOffset());
      assertFalse(databaseEntry0.getPartial());
      assertEquals(0, databaseEntry1.getPartialLength());
  }

  @Test
  public void test23()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0);
      DatabaseEntry databaseEntry1 = new DatabaseEntry();
      boolean boolean0 = databaseEntry1.equals(databaseEntry0);
      assertEquals(0, databaseEntry0.getPartialOffset());
      assertEquals(0, databaseEntry0.getPartialLength());
      assertEquals(0, databaseEntry1.getPartialLength());
      assertEquals(0, databaseEntry1.getSize());
      assertEquals(0, databaseEntry1.getPartialOffset());
      assertEquals(0, databaseEntry1.getOffset());
      assertFalse(boolean0);
      assertFalse(databaseEntry0.getPartial());
      assertFalse(databaseEntry1.getPartial());
      assertFalse(databaseEntry0.equals((Object)databaseEntry1));
  }

  @Test
  public void test24()  throws Throwable  {
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      boolean boolean0 = databaseEntry0.equals(databaseEntry0);
      assertEquals(0, databaseEntry0.getPartialLength());
      assertEquals(0, databaseEntry0.getPartialOffset());
      assertEquals(0, databaseEntry0.getSize());
      assertEquals(0, databaseEntry0.getOffset());
      assertTrue(boolean0);
      assertFalse(databaseEntry0.getPartial());
  }

  @Test
  public void test25()  throws Throwable  {
      byte[] byteArray0 = new byte[13];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0);
      databaseEntry0.setPartial(true);
      DatabaseEntry databaseEntry1 = new DatabaseEntry();
      databaseEntry1.setPartial((-3208), (int) (byte)0, true);
      boolean boolean0 = databaseEntry0.equals(databaseEntry1);
      assertEquals(-3208, databaseEntry1.getPartialOffset());
      assertFalse(boolean0);
  }

  @Test
  public void test26()  throws Throwable  {
      byte[] byteArray0 = new byte[13];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0);
      databaseEntry0.setPartial(true);
      DatabaseEntry databaseEntry1 = new DatabaseEntry();
      databaseEntry1.setPartial((int) (byte) (-93), (int) (byte) (-93), true);
      boolean boolean0 = databaseEntry0.equals(databaseEntry1);
      assertEquals(-93, databaseEntry1.getPartialLength());
      assertFalse(boolean0);
  }

  @Test
  public void test27()  throws Throwable  {
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      DatabaseEntry databaseEntry1 = new DatabaseEntry();
      databaseEntry1.setPartial(true);
      boolean boolean0 = databaseEntry0.equals(databaseEntry1);
      assertFalse(databaseEntry1.equals((Object)databaseEntry0));
      assertFalse(boolean0);
  }

  @Test
  public void test28()  throws Throwable  {
      byte[] byteArray0 = new byte[13];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0);
      assertFalse(databaseEntry0.getPartial());
      
      databaseEntry0.setPartial(true);
      boolean boolean0 = databaseEntry0.equals(databaseEntry0);
      assertTrue(databaseEntry0.getPartial());
      assertTrue(boolean0);
  }

  @Test
  public void test29()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0);
      Object object0 = new Object();
      boolean boolean0 = databaseEntry0.equals(object0);
      assertFalse(databaseEntry0.getPartial());
      assertEquals(0, databaseEntry0.getPartialLength());
      assertFalse(boolean0);
      assertEquals(0, databaseEntry0.getPartialOffset());
      assertEquals(0, databaseEntry0.getOffset());
  }

  @Test
  public void test30()  throws Throwable  {
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      databaseEntry0.setData((byte[]) null);
      assertEquals(0, databaseEntry0.getPartialLength());
      assertFalse(databaseEntry0.getPartial());
      assertEquals(0, databaseEntry0.getPartialOffset());
      assertEquals(0, databaseEntry0.getOffset());
      assertEquals(0, databaseEntry0.getSize());
  }

  @Test
  public void test31()  throws Throwable  {
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      byte[] byteArray0 = new byte[4];
      databaseEntry0.setData(byteArray0);
      assertEquals(4, databaseEntry0.getSize());
  }

  @Test
  public void test32()  throws Throwable  {
      DatabaseEntry databaseEntry0 = new DatabaseEntry((byte[]) null);
      assertEquals(0, databaseEntry0.getOffset());
      assertEquals(0, databaseEntry0.getSize());
      assertEquals(0, databaseEntry0.getPartialLength());
      assertFalse(databaseEntry0.getPartial());
      assertEquals(0, databaseEntry0.getPartialOffset());
  }

  @Test
  public void test33()  throws Throwable  {
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      databaseEntry0.getData();
      assertEquals(0, databaseEntry0.getSize());
      assertEquals(0, databaseEntry0.getOffset());
      assertEquals(0, databaseEntry0.getPartialOffset());
      assertFalse(databaseEntry0.getPartial());
      assertEquals(0, databaseEntry0.getPartialLength());
  }

  @Test
  public void test34()  throws Throwable  {
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      int int0 = databaseEntry0.getSize();
      assertEquals(0, databaseEntry0.getPartialOffset());
      assertEquals(0, databaseEntry0.getPartialLength());
      assertEquals(0, int0);
      assertFalse(databaseEntry0.getPartial());
      assertEquals(0, databaseEntry0.getOffset());
  }

  @Test
  public void test35()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0);
      int int0 = databaseEntry0.getPartialOffset();
      assertEquals(0, int0);
      assertEquals(0, databaseEntry0.getOffset());
      assertEquals(0, databaseEntry0.getPartialLength());
      assertFalse(databaseEntry0.getPartial());
  }

  @Test
  public void test36()  throws Throwable  {
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      int int0 = databaseEntry0.getPartialLength();
      assertEquals(0, databaseEntry0.getOffset());
      assertEquals(0, databaseEntry0.getSize());
      assertFalse(databaseEntry0.getPartial());
      assertEquals(0, databaseEntry0.getPartialOffset());
      assertEquals(0, int0);
  }

  @Test
  public void test37()  throws Throwable  {
      byte[] byteArray0 = new byte[13];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0);
      String string0 = databaseEntry0.toString();
      assertEquals("<DatabaseEntry dlen=0 doff=0 doff=0 offset=0 size=13>", string0);
      assertFalse(databaseEntry0.getPartial());
  }

  @Test
  public void test38()  throws Throwable  {
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      byte[] byteArray0 = new byte[4];
      databaseEntry0.setData(byteArray0, (int) (byte)1, (-195));
      databaseEntry0.getData();
      assertEquals(-195, databaseEntry0.getSize());
  }

  @Test
  public void test39()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0);
      boolean boolean0 = databaseEntry0.getPartial();
      assertEquals(0, databaseEntry0.getOffset());
      assertFalse(boolean0);
      assertEquals(0, databaseEntry0.getPartialOffset());
      assertEquals(0, databaseEntry0.getPartialLength());
  }

  @Test
  public void test40()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0, 827, (int) (byte)1);
      // Undeclared exception!
      try { 
        databaseEntry0.equals(databaseEntry0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 827
         //
         assertThrownBy("com.sleepycat.je.DatabaseEntry", e);
      }
  }

  @Test
  public void test41()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0);
      int int0 = databaseEntry0.getOffset();
      assertEquals(0, databaseEntry0.getPartialOffset());
      assertEquals(0, int0);
      assertEquals(0, databaseEntry0.getPartialLength());
      assertFalse(databaseEntry0.getPartial());
  }

  @Test
  public void test42()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0);
      databaseEntry0.dumpData();
      assertEquals(5, databaseEntry0.getSize());
      assertEquals(0, databaseEntry0.getOffset());
      assertEquals(0, databaseEntry0.getPartialOffset());
      assertEquals(0, databaseEntry0.getPartialLength());
      assertFalse(databaseEntry0.getPartial());
  }
}
