/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 21 22:53:20 KST 2017
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
public class LongBinding_ESTest6 extends LongBinding_ESTest_scaffolding6 {

  @Test
  public void test00()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte) (-70);
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0);
      long long0 = LongBinding.entryToLong(databaseEntry0);
      assertEquals(4179340454199820288L, long0);
  }

  @Test
  public void test01()  throws Throwable  {
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      LongBinding.longToEntry((-2147483648L), databaseEntry0);
      long long0 = LongBinding.entryToLong(databaseEntry0);
      assertEquals((-2147483648L), long0);
  }

  @Test
  public void test02()  throws Throwable  {
      LongBinding longBinding0 = new LongBinding();
      TupleOutput tupleOutput0 = TupleBase.newOutput();
      TupleOutput tupleOutput1 = tupleOutput0.writeBytes("5!sU]->)|Y;UbI");
      TupleInput tupleInput0 = new TupleInput(tupleOutput1);
      Long long0 = (Long)longBinding0.entryToObject(tupleInput0);
      assertEquals((-5394904068140483031L), (long)long0);
  }

  @Test
  public void test03()  throws Throwable  {
      LongBinding longBinding0 = new LongBinding();
      Short short0 = new Short((short) (-228));
      // Undeclared exception!
      try { 
        longBinding0.objectToEntry((Object) short0, (TupleOutput) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.bind.tuple.LongBinding", e);
      }
  }

  @Test
  public void test04()  throws Throwable  {
      LongBinding longBinding0 = new LongBinding();
      TupleOutput tupleOutput0 = new TupleOutput();
      // Undeclared exception!
      try { 
        longBinding0.objectToEntry((Object) longBinding0, tupleOutput0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // com.sleepycat.bind.tuple.LongBinding cannot be cast to java.lang.Number
         //
         assertThrownBy("com.sleepycat.bind.tuple.LongBinding", e);
      }
  }

  @Test
  public void test05()  throws Throwable  {
      // Undeclared exception!
      try { 
        LongBinding.longToEntry(1307L, (DatabaseEntry) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.bind.tuple.TupleBase", e);
      }
  }

  @Test
  public void test06()  throws Throwable  {
      LongBinding longBinding0 = new LongBinding();
      // Undeclared exception!
      try { 
        longBinding0.entryToObject((TupleInput) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.bind.tuple.LongBinding", e);
      }
  }

  @Test
  public void test07()  throws Throwable  {
      LongBinding longBinding0 = new LongBinding();
      byte[] byteArray0 = new byte[2];
      TupleInput tupleInput0 = new TupleInput(byteArray0, (int) (byte)28, 128);
      // Undeclared exception!
      try { 
        longBinding0.entryToObject(tupleInput0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 28
         //
         assertThrownBy("com.sleepycat.util.FastInputStream", e);
      }
  }

  @Test
  public void test08()  throws Throwable  {
      // Undeclared exception!
      try { 
        LongBinding.entryToLong((DatabaseEntry) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.bind.tuple.TupleBase", e);
      }
  }

  @Test
  public void test09()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0, 0, 537);
      // Undeclared exception!
      try { 
        LongBinding.entryToLong(databaseEntry0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 7
         //
         assertThrownBy("com.sleepycat.util.FastInputStream", e);
      }
  }

  @Test
  public void test10()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0);
      // Undeclared exception!
      try { 
        LongBinding.entryToLong(databaseEntry0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.bind.tuple.TupleInput", e);
      }
  }

  @Test
  public void test11()  throws Throwable  {
      LongBinding longBinding0 = new LongBinding();
      Byte byte0 = new Byte((byte)0);
      TupleOutput tupleOutput0 = longBinding0.getTupleOutput(byte0);
      longBinding0.objectToEntry((Object) byte0, tupleOutput0);
      assertEquals(0, tupleOutput0.getBufferOffset());
  }

  @Test
  public void test12()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0);
      LongBinding.longToEntry((byte)0, databaseEntry0);
      long long0 = LongBinding.entryToLong(databaseEntry0);
      assertEquals(0L, long0);
  }

  @Test
  public void test13()  throws Throwable  {
      LongBinding longBinding0 = new LongBinding();
      TupleOutput tupleOutput0 = TupleBase.newOutput();
      TupleInput tupleInput0 = new TupleInput(tupleOutput0);
      // Undeclared exception!
      try { 
        longBinding0.entryToObject(tupleInput0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.bind.tuple.TupleInput", e);
      }
  }
}
