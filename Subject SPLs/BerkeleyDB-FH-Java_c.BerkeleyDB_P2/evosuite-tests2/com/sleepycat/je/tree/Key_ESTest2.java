/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 01:51:58 KST 2017
 */

package com.sleepycat.je.tree;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.fail;

import java.util.Comparator;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.sleepycat.je.DatabaseEntry;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class Key_ESTest2 extends Key_ESTest_scaffolding2 {


  @Test
  public void test01()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      Key key0 = new Key(byteArray0);
      byte[] byteArray1 = key0.getKey();
      assertFalse(byteArray1.equals((Object)byteArray0));
  }

  @Test
  public void test02()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byte[] byteArray1 = new byte[2];
      byteArray1[0] = (byte)21;
      Key key0 = new Key(byteArray1);
      Key key1 = new Key(byteArray0);
      int int0 = key0.compareTo(key1);
      assertFalse(key1.equals((Object)key0));
      assertEquals(21, int0);
  }

  @Test
  public void test03()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      Key key0 = new Key(byteArray0);
      byte[] byteArray1 = new byte[2];
      Key key1 = new Key(byteArray1);
      int int0 = key0.compareTo(key1);
      assertEquals((-2), int0);
      assertFalse(key1.equals((Object)key0));
  }

  @Test
  public void test04()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byte[] byteArray1 = new byte[1];
      int int0 = Key.compareKeys(byteArray1, byteArray0, (Comparator) null);
      assertEquals((-2), int0);
  }

  @Test
  public void test05()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      String string0 = Key.getNoFormatString(byteArray0);
      assertEquals("key=<key v=\"\"/>", string0);
  }

  @Test
  public void test06()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byte[] byteArray1 = new byte[1];
      byteArray0[0] = (byte) (-1);
      Key key0 = new Key(byteArray1);
      Key key1 = new Key(byteArray0);
      boolean boolean0 = key0.equals(key1);
      assertFalse(key1.equals((Object)key0));
      assertFalse(boolean0);
  }

  @Test
  public void test07()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byte[] byteArray1 = new byte[1];
      byteArray0[0] = (byte) (-1);
      int int0 = Key.compareKeys(byteArray0, byteArray1, (Comparator) null);
      assertEquals(255, int0);
  }

  @Test
  public void test08()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      byte[] byteArray1 = new byte[7];
      int int0 = Key.compareKeys(byteArray1, byteArray0, (Comparator) null);
      assertEquals(6, int0);
  }

  @Test
  public void test09()  throws Throwable  {
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      byte[] byteArray0 = Key.makeKey(databaseEntry0);
      String string0 = Key.getNoFormatString(byteArray0);
      assertEquals("key=<key v=\"\"/>", string0);
  }


  @Test
  public void test11()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0);
      databaseEntry0.setSize((byte) (-73));
      // Undeclared exception!
      try { 
        Key.makeKey(databaseEntry0);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.Key", e);
      }
  }

  @Test
  public void test12()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0, 962, 1404);
      // Undeclared exception!
      try { 
        Key.makeKey(databaseEntry0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.lang.System", e);
      }
  }


  @Test
  public void test14()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      // Undeclared exception!
      try { 
        Key.dumpString(byteArray0, (-1));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -1
         //
         assertThrownBy("java.lang.String", e);
      }
  }

  @Test
  public void test15()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      Key key0 = new Key(byteArray0);
      // Undeclared exception!
      try { 
        key0.compareTo(byteArray0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // [B cannot be cast to com.sleepycat.je.tree.Key
         //
         assertThrownBy("com.sleepycat.je.tree.Key", e);
      }
  }

  @Test
  public void test16()  throws Throwable  {
      byte[] byteArray0 = new byte[24];
      // Undeclared exception!
      try { 
        Key.compareKeys(byteArray0, (byte[]) null, (Comparator) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.Key", e);
      }
  }

  @Test
  public void test17()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      String string0 = Key.getNoFormatString(byteArray0);
      assertEquals("key=<key v=\"0 0 0 \"/>", string0);
  }

  @Test
  public void test18()  throws Throwable  {
      String string0 = Key.getNoFormatString((byte[]) null);
      assertEquals("key=<key v=\"<null>\"/>", string0);
  }

  @Test
  public void test19()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte)118;
      byteArray0[2] = (byte)66;
      byteArray0[3] = (byte)0;
      Key key0 = new Key(byteArray0);
      key0.compareTo(key0);
      key0.equals(key0);
      Key.dumpString(byteArray0, (byte)0);
      byte[] byteArray1 = key0.getKey();
      Object object0 = new Object();
      key0.equals(object0);
      Key.getNoFormatString(byteArray1);
      boolean boolean0 = Key.DUMP_BINARY;
      Key.DUMP_BINARY = true;
      Key.dumpString((byte[]) null, (byte)118);
      Object object1 = new Object();
      key0.equals(object1);
      key0.hashCode();
      Key.dumpString(byteArray0, 0);
      Key key1 = new Key(byteArray0);
      Key.DUMP_INT_BINDING = true;
  }

  @Test
  public void test20()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byte[] byteArray1 = new byte[2];
      byteArray1[0] = (byte)21;
      Key key0 = new Key(byteArray1);
      Key key1 = new Key(byteArray0);
      boolean boolean0 = key0.equals(key1);
      assertFalse(boolean0);
      assertFalse(key1.equals((Object)key0));
  }

  @Test
  public void test21()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      int int0 = Key.compareKeys(byteArray0, byteArray0, (Comparator) null);
      assertEquals(0, int0);
  }

  @Test
  public void test22()  throws Throwable  {
      byte[] byteArray0 = new byte[21];
      Key key0 = new Key(byteArray0);
      // Undeclared exception!
      try { 
        key0.compareTo((Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.Key", e);
      }
  }

  @Test
  public void test23()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0);
      byte[] byteArray1 = Key.makeKey(databaseEntry0);
      assertNotSame(byteArray1, byteArray0);
      assertArrayEquals(new byte[] {(byte)0}, byteArray1);
  }

  @Test
  public void test24()  throws Throwable  {
      Key key0 = new Key((byte[]) null);
      // Undeclared exception!
      try { 
        key0.compareTo(key0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.tree.Key", e);
      }
  }
}
