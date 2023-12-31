/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 21 18:17:14 KST 2017
 */

package com.sleepycat.bind.tuple;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.sleepycat.je.DatabaseEntry;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class ShortBinding_ESTest1 extends ShortBinding_ESTest_scaffolding1 {

  @Test
  public void test00()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte) (-80);
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0);
      short short0 = ShortBinding.entryToShort(databaseEntry0);
      assertEquals((short)12288, short0);
  }

  @Test
  public void test01()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0);
      short short0 = ShortBinding.entryToShort(databaseEntry0);
      assertEquals((short) (-32768), short0);
  }

  @Test
  public void test02()  throws Throwable  {
      ShortBinding shortBinding0 = new ShortBinding();
      byte[] byteArray0 = new byte[3];
      TupleInput tupleInput0 = new TupleInput(byteArray0);
      Short short0 = (Short)shortBinding0.entryToObject(tupleInput0);
      assertEquals((short) (-32768), (short)short0);
  }

  @Test
  public void test03()  throws Throwable  {
      // Undeclared exception!
      try { 
        ShortBinding.shortToEntry((short)3916, (DatabaseEntry) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.bind.tuple.TupleBase", e);
      }
  }

  @Test
  public void test04()  throws Throwable  {
      ShortBinding shortBinding0 = new ShortBinding();
      Integer integer0 = new Integer(2193);
      // Undeclared exception!
      try { 
        shortBinding0.objectToEntry((Object) integer0, (TupleOutput) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.bind.tuple.ShortBinding", e);
      }
  }

  @Test
  public void test05()  throws Throwable  {
      ShortBinding shortBinding0 = new ShortBinding();
      Short short0 = new Short((short)2);
      TupleOutput tupleOutput0 = new TupleOutput();
      tupleOutput0.addSize((-3667));
      // Undeclared exception!
      try { 
        shortBinding0.objectToEntry((Object) short0, tupleOutput0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -3667
         //
         assertThrownBy("com.sleepycat.util.FastOutputStream", e);
      }
  }

  @Test
  public void test06()  throws Throwable  {
      // Undeclared exception!
      try { 
        ShortBinding.entryToShort((DatabaseEntry) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.bind.tuple.TupleBase", e);
      }
  }

  @Test
  public void test07()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0, (-1550), (-314));
      // Undeclared exception!
      try { 
        ShortBinding.entryToShort(databaseEntry0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1550
         //
         assertThrownBy("com.sleepycat.util.FastInputStream", e);
      }
  }

  @Test
  public void test08()  throws Throwable  {
      ShortBinding shortBinding0 = new ShortBinding();
      // Undeclared exception!
      try { 
        shortBinding0.entryToObject((TupleInput) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.bind.tuple.ShortBinding", e);
      }
  }

  @Test
  public void test09()  throws Throwable  {
      ShortBinding shortBinding0 = new ShortBinding();
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      TupleInput tupleInput0 = TupleBase.entryToInput(databaseEntry0);
      // Undeclared exception!
      try { 
        shortBinding0.entryToObject(tupleInput0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.bind.tuple.TupleInput", e);
      }
  }

  @Test
  public void test10()  throws Throwable  {
      ShortBinding shortBinding0 = new ShortBinding();
      TupleOutput tupleOutput0 = shortBinding0.getTupleOutput(shortBinding0);
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        shortBinding0.objectToEntry(object0, tupleOutput0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Object cannot be cast to java.lang.Number
         //
         assertThrownBy("com.sleepycat.bind.tuple.ShortBinding", e);
      }
  }

  @Test
  public void test11()  throws Throwable  {
      ShortBinding shortBinding0 = new ShortBinding();
      Byte byte0 = new Byte((byte) (-115));
      byte[] byteArray0 = new byte[9];
      TupleOutput tupleOutput0 = new TupleOutput(byteArray0);
      shortBinding0.objectToEntry((Object) byte0, tupleOutput0);
      assertEquals(0, tupleOutput0.getBufferOffset());
  }

  @Test
  public void test12()  throws Throwable  {
      ShortBinding shortBinding0 = new ShortBinding();
      byte[] byteArray0 = new byte[7];
      TupleInput tupleInput0 = new TupleInput(byteArray0, (-643), 2);
      // Undeclared exception!
      try { 
        shortBinding0.entryToObject(tupleInput0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -643
         //
         assertThrownBy("com.sleepycat.util.FastInputStream", e);
      }
  }

  @Test
  public void test13()  throws Throwable  {
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      // Undeclared exception!
      try { 
        ShortBinding.entryToShort(databaseEntry0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.bind.tuple.TupleInput", e);
      }
  }

  @Test
  public void test14()  throws Throwable  {
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      ShortBinding.shortToEntry((short)0, databaseEntry0);
      short short0 = ShortBinding.entryToShort(databaseEntry0);
      assertEquals((short)0, short0);
  }
}
