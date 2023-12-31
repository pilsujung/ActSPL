/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 09:25:41 KST 2017
 */

package com.sleepycat.je;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class DatabaseEntry_ESTest9 extends DatabaseEntry_ESTest_scaffolding9 {

  @Test
  public void test00()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0);
      int int0 = databaseEntry0.getSize();
      assertEquals(0, databaseEntry0.getPartialLength());
      assertFalse(databaseEntry0.getPartial());
      assertEquals(0, databaseEntry0.getPartialOffset());
      assertEquals(5, int0);
  }

  @Test
  public void test01()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0, (int) (byte)0, 0);
      databaseEntry0.setPartial((int) (byte)126, (-1625), false);
      int int0 = databaseEntry0.getPartialOffset();
      assertEquals(-1625, databaseEntry0.getPartialLength());
      assertEquals(126, int0);
  }

  @Test
  public void test02()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0);
      databaseEntry0.setPartial((-2371), 0, true);
      int int0 = databaseEntry0.getPartialOffset();
      assertEquals((-2371), int0);
  }

  @Test
  public void test03()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0);
      databaseEntry0.setPartialLength(3555);
      int int0 = databaseEntry0.getPartialLength();
      assertEquals(3555, int0);
  }

  @Test
  public void test04()  throws Throwable  {
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      databaseEntry0.setPartial((int) (byte)0, (-1), false);
      int int0 = databaseEntry0.getPartialLength();
      assertEquals((-1), int0);
  }


  @Test
  public void test06()  throws Throwable  {
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      int int0 = databaseEntry0.getOffset();
      assertEquals(0, int0);
      assertEquals(0, databaseEntry0.getPartialLength());
      assertEquals(0, databaseEntry0.getPartialOffset());
      assertFalse(databaseEntry0.getPartial());
      assertEquals(0, databaseEntry0.getSize());
  }

  @Test
  public void test07()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0, (-1884), (int) (byte) (-49));
      int int0 = databaseEntry0.getOffset();
      assertEquals(-49, databaseEntry0.getSize());
      assertFalse(databaseEntry0.getPartial());
      assertEquals(0, databaseEntry0.getPartialLength());
      assertEquals(0, databaseEntry0.getPartialOffset());
      assertEquals((-1884), int0);
  }

  @Test
  public void test08()  throws Throwable  {
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      databaseEntry0.getData();
      assertEquals(0, databaseEntry0.getOffset());
      assertEquals(0, databaseEntry0.getSize());
      assertEquals(0, databaseEntry0.getPartialLength());
      assertFalse(databaseEntry0.getPartial());
      assertEquals(0, databaseEntry0.getPartialOffset());
  }

  @Test
  public void test09()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0);
      databaseEntry0.getData();
      assertEquals(0, databaseEntry0.getPartialOffset());
      assertFalse(databaseEntry0.getPartial());
      assertEquals(0, databaseEntry0.getPartialLength());
  }

  @Test
  public void test10()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte)104;
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0, 1, (int) (byte)104);
      databaseEntry0.setOffset(0);
      // Undeclared exception!
      try { 
        databaseEntry0.hashCode();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         assertThrownBy("com.sleepycat.je.DatabaseEntry", e);
      }
  }

  @Test
  public void test11()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0, (int) (byte)0, (int) (byte)0);
      databaseEntry0.setSize((-513));
      databaseEntry0.hashCode();
      assertEquals(-513, databaseEntry0.getSize());
  }

  @Test
  public void test12()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte) (-81);
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0);
      byte[] byteArray1 = new byte[2];
      DatabaseEntry databaseEntry1 = new DatabaseEntry(byteArray1);
      boolean boolean0 = databaseEntry0.equals(databaseEntry1);
      assertFalse(boolean0);
      assertEquals(0, databaseEntry1.getPartialLength());
      assertFalse(databaseEntry1.getPartial());
      assertFalse(databaseEntry1.equals((Object)databaseEntry0));
      assertEquals(0, databaseEntry1.getPartialOffset());
  }

  @Test
  public void test13()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0, 0, (-842));
      boolean boolean0 = databaseEntry0.equals(databaseEntry0);
      assertEquals(-842, databaseEntry0.getSize());
      assertEquals(0, databaseEntry0.getOffset());
      assertTrue(boolean0);
      assertEquals(0, databaseEntry0.getPartialLength());
      assertFalse(databaseEntry0.getPartial());
      assertEquals(0, databaseEntry0.getPartialOffset());
  }

  @Test
  public void test14()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0);
      DatabaseEntry databaseEntry1 = new DatabaseEntry(byteArray0, (int) (byte)17, (int) (byte)17);
      boolean boolean0 = databaseEntry0.equals(databaseEntry1);
      assertEquals(0, databaseEntry0.getPartialLength());
      assertEquals(0, databaseEntry0.getPartialOffset());
      assertFalse(databaseEntry1.getPartial());
      assertEquals(0, databaseEntry1.getPartialLength());
      assertFalse(databaseEntry0.getPartial());
      assertEquals(0, databaseEntry1.getPartialOffset());
      assertEquals(17, databaseEntry1.getSize());
      assertEquals(17, databaseEntry1.getOffset());
      assertFalse(boolean0);
  }

  @Test
  public void test15()  throws Throwable  {
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      DatabaseEntry databaseEntry1 = new DatabaseEntry();
      databaseEntry1.setPartial(true);
      databaseEntry0.setPartialLength(483);
      databaseEntry0.setPartial(true);
      boolean boolean0 = databaseEntry0.equals(databaseEntry1);
      assertEquals(483, databaseEntry0.getPartialLength());
      assertFalse(boolean0);
  }

  @Test
  public void test16()  throws Throwable  {
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      byte[] byteArray0 = new byte[1];
      databaseEntry0.setData(byteArray0, (-431), (-4573));
      int int0 = databaseEntry0.getSize();
      assertEquals(-431, databaseEntry0.getOffset());
      assertEquals((-4573), int0);
  }

  @Test
  public void test17()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      databaseEntry0.setData(byteArray0, 1, 1);
      // Undeclared exception!
      try { 
        databaseEntry0.equals(databaseEntry0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         assertThrownBy("com.sleepycat.je.DatabaseEntry", e);
      }
  }

  @Test
  public void test18()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0, 1, (int) (byte)104);
      assertEquals(104, databaseEntry0.getSize());
      
      databaseEntry0.setData(byteArray0);
      databaseEntry0.hashCode();
      assertEquals(0, databaseEntry0.getPartialLength());
  }

  @Test
  public void test19()  throws Throwable  {
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      databaseEntry0.hashCode();
      assertEquals(0, databaseEntry0.getPartialOffset());
      assertEquals(0, databaseEntry0.getPartialLength());
      assertEquals(0, databaseEntry0.getSize());
      assertFalse(databaseEntry0.getPartial());
      assertEquals(0, databaseEntry0.getOffset());
  }

  @Test
  public void test20()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte)116;
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0);
      byte[] byteArray1 = new byte[2];
      DatabaseEntry databaseEntry1 = new DatabaseEntry(byteArray1);
      boolean boolean0 = databaseEntry0.equals(databaseEntry1);
      assertEquals(0, databaseEntry1.getPartialLength());
      assertFalse(databaseEntry1.equals((Object)databaseEntry0));
      assertFalse(boolean0);
      assertFalse(databaseEntry1.getPartial());
      assertEquals(0, databaseEntry1.getPartialOffset());
  }

  @Test
  public void test21()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0);
      byte[] byteArray1 = new byte[1];
      DatabaseEntry databaseEntry1 = new DatabaseEntry(byteArray1);
      boolean boolean0 = databaseEntry0.equals(databaseEntry1);
      assertEquals(0, databaseEntry1.getPartialLength());
      assertFalse(databaseEntry1.equals((Object)databaseEntry0));
      assertFalse(databaseEntry1.getPartial());
      assertEquals(0, databaseEntry1.getPartialOffset());
      assertFalse(boolean0);
  }

  @Test
  public void test22()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0);
      DatabaseEntry databaseEntry1 = new DatabaseEntry();
      boolean boolean0 = databaseEntry0.equals(databaseEntry1);
      assertFalse(boolean0);
      assertEquals(0, databaseEntry0.getPartialOffset());
      assertEquals(0, databaseEntry1.getOffset());
      assertFalse(databaseEntry1.getPartial());
      assertEquals(0, databaseEntry0.getPartialLength());
      assertEquals(0, databaseEntry1.getPartialOffset());
      assertEquals(0, databaseEntry1.getSize());
      assertFalse(databaseEntry0.getPartial());
      assertEquals(0, databaseEntry1.getPartialLength());
  }

  @Test
  public void test23()  throws Throwable  {
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      byte[] byteArray0 = new byte[7];
      DatabaseEntry databaseEntry1 = new DatabaseEntry(byteArray0);
      boolean boolean0 = databaseEntry0.equals(databaseEntry1);
      assertEquals(0, databaseEntry1.getPartialOffset());
      assertEquals(0, databaseEntry0.getPartialLength());
      assertFalse(databaseEntry0.getPartial());
      assertFalse(databaseEntry1.equals((Object)databaseEntry0));
      assertEquals(0, databaseEntry1.getPartialLength());
      assertFalse(databaseEntry1.getPartial());
      assertEquals(0, databaseEntry0.getSize());
      assertFalse(boolean0);
      assertEquals(0, databaseEntry0.getPartialOffset());
      assertEquals(0, databaseEntry0.getOffset());
  }

  @Test
  public void test24()  throws Throwable  {
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      DatabaseEntry databaseEntry1 = new DatabaseEntry();
      databaseEntry1.setPartial(true);
      databaseEntry1.setPartialLength((byte)1);
      databaseEntry0.setPartial(true);
      boolean boolean0 = databaseEntry0.equals(databaseEntry1);
      assertFalse(databaseEntry1.equals((Object)databaseEntry0));
      assertFalse(boolean0);
  }

  @Test
  public void test25()  throws Throwable  {
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      DatabaseEntry databaseEntry1 = new DatabaseEntry((byte[]) null);
      assertFalse(databaseEntry1.getPartial());
      
      databaseEntry1.setPartial(true);
      boolean boolean0 = databaseEntry0.equals(databaseEntry1);
      assertTrue(databaseEntry1.getPartial());
      assertFalse(boolean0);
  }

  @Test
  public void test26()  throws Throwable  {
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      assertFalse(databaseEntry0.getPartial());
      
      databaseEntry0.setPartial(true);
      boolean boolean0 = databaseEntry0.equals(databaseEntry0);
      assertTrue(databaseEntry0.getPartial());
      assertTrue(boolean0);
  }

  @Test
  public void test27()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0);
      boolean boolean0 = databaseEntry0.equals("\uFFFD\u0000");
      assertEquals(2, databaseEntry0.getSize());
      assertFalse(boolean0);
      assertEquals(0, databaseEntry0.getPartialLength());
      assertFalse(databaseEntry0.getPartial());
      assertEquals(0, databaseEntry0.getPartialOffset());
  }

  @Test
  public void test28()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0);
      assertEquals(0, databaseEntry0.getOffset());
      
      boolean boolean0 = databaseEntry0.equals(databaseEntry0);
      assertEquals(0, databaseEntry0.getPartialLength());
      assertEquals(0, databaseEntry0.getPartialOffset());
      assertFalse(databaseEntry0.getPartial());
      assertTrue(boolean0);
      assertEquals(2, databaseEntry0.getSize());
  }

  @Test
  public void test29()  throws Throwable  {
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      databaseEntry0.setData((byte[]) null);
      assertFalse(databaseEntry0.getPartial());
      assertEquals(0, databaseEntry0.getPartialLength());
      assertEquals(0, databaseEntry0.getOffset());
      assertEquals(0, databaseEntry0.getPartialOffset());
      assertEquals(0, databaseEntry0.getSize());
  }

  @Test
  public void test30()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0, 0, (-842));
      databaseEntry0.getData();
      assertEquals(0, databaseEntry0.getOffset());
      assertEquals(0, databaseEntry0.getPartialOffset());
      assertFalse(databaseEntry0.getPartial());
      assertEquals(-842, databaseEntry0.getSize());
      assertEquals(0, databaseEntry0.getPartialLength());
  }

  @Test
  public void test31()  throws Throwable  {
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      int int0 = databaseEntry0.getSize();
      assertFalse(databaseEntry0.getPartial());
      assertEquals(0, databaseEntry0.getPartialLength());
      assertEquals(0, databaseEntry0.getOffset());
      assertEquals(0, databaseEntry0.getPartialOffset());
      assertEquals(0, int0);
  }

  @Test
  public void test32()  throws Throwable  {
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      int int0 = databaseEntry0.getPartialOffset();
      assertEquals(0, databaseEntry0.getPartialLength());
      assertEquals(0, databaseEntry0.getSize());
      assertEquals(0, int0);
      assertFalse(databaseEntry0.getPartial());
      assertEquals(0, databaseEntry0.getOffset());
  }

  @Test
  public void test33()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0);
      databaseEntry0.setPartial((int) (byte) (-124), (int) (byte) (-124), true);
      DatabaseEntry databaseEntry1 = new DatabaseEntry(byteArray0, (int) (byte) (-124), (int) (byte) (-124));
      databaseEntry1.setPartial(20, (int) (byte) (-124), true);
      boolean boolean0 = databaseEntry0.equals(databaseEntry1);
      assertEquals(20, databaseEntry1.getPartialOffset());
      assertFalse(boolean0);
  }

  @Test
  public void test34()  throws Throwable  {
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      databaseEntry0.setPartialOffset(483);
      DatabaseEntry databaseEntry1 = new DatabaseEntry();
      databaseEntry1.setPartial(true);
      databaseEntry0.setPartial(true);
      boolean boolean0 = databaseEntry0.equals(databaseEntry1);
      assertEquals(483, databaseEntry0.getPartialOffset());
      assertFalse(boolean0);
  }

  @Test
  public void test35()  throws Throwable  {
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      int int0 = databaseEntry0.getPartialLength();
      assertFalse(databaseEntry0.getPartial());
      assertEquals(0, databaseEntry0.getSize());
      assertEquals(0, int0);
      assertEquals(0, databaseEntry0.getOffset());
      assertEquals(0, databaseEntry0.getPartialOffset());
  }

  @Test
  public void test36()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0);
      String string0 = databaseEntry0.toString();
      assertFalse(databaseEntry0.getPartial());
      assertEquals("<DatabaseEntry dlen=0 doff=0 doff=0 offset=0 size=2>", string0);
  }

  @Test
  public void test37()  throws Throwable  {
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      boolean boolean0 = databaseEntry0.getPartial();
      assertEquals(0, databaseEntry0.getPartialLength());
      assertEquals(0, databaseEntry0.getPartialOffset());
      assertFalse(boolean0);
      assertEquals(0, databaseEntry0.getSize());
      assertEquals(0, databaseEntry0.getOffset());
  }

  @Test
  public void test38()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0, 1, (int) (byte)1);
      int int0 = databaseEntry0.getOffset();
      assertEquals(0, databaseEntry0.getPartialLength());
      assertFalse(databaseEntry0.getPartial());
      assertEquals(0, databaseEntry0.getPartialOffset());
      assertEquals(1, databaseEntry0.getSize());
      assertEquals(1, int0);
  }

  @Test
  public void test39()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0);
      databaseEntry0.dumpData();
      assertEquals(0, databaseEntry0.getPartialLength());
      assertFalse(databaseEntry0.getPartial());
      assertEquals(2, databaseEntry0.getSize());
      assertEquals(0, databaseEntry0.getPartialOffset());
      assertEquals(0, databaseEntry0.getOffset());
  }
}
