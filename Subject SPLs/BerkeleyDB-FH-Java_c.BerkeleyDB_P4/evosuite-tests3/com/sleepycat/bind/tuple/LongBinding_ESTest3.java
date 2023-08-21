/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 08:55:33 KST 2017
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
public class LongBinding_ESTest3 extends LongBinding_ESTest_scaffolding3 {

  @Test
  public void test00()  throws Throwable  {
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      LongBinding.longToEntry(1983L, databaseEntry0);
      long long0 = LongBinding.entryToLong(databaseEntry0);
      assertEquals(1983L, long0);
  }

  @Test
  public void test01()  throws Throwable  {
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      LongBinding.longToEntry((-772L), databaseEntry0);
      long long0 = LongBinding.entryToLong(databaseEntry0);
      assertEquals((-772L), long0);
  }

  @Test
  public void test02()  throws Throwable  {
      LongBinding longBinding0 = new LongBinding();
      TupleOutput tupleOutput0 = new TupleOutput();
      TupleOutput tupleOutput1 = tupleOutput0.writeChars("!=h`KlfVPCy~");
      TupleInput tupleInput0 = new TupleInput(tupleOutput1);
      Long long0 = (Long)longBinding0.entryToObject(tupleInput0);
      assertEquals((-9214083100623503264L), (long)long0);
  }


  @Test
  public void test04()  throws Throwable  {
      LongBinding longBinding0 = new LongBinding();
      TupleOutput tupleOutput0 = longBinding0.getTupleOutput("wL");
      // Undeclared exception!
      try { 
        longBinding0.objectToEntry((Object) "wL", tupleOutput0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.String cannot be cast to java.lang.Number
         //
         assertThrownBy("com.sleepycat.bind.tuple.LongBinding", e);
      }
  }

  @Test
  public void test05()  throws Throwable  {
      LongBinding longBinding0 = new LongBinding();
      TupleOutput tupleOutput0 = new TupleOutput();
      Float float0 = new Float((float) (-8));
      tupleOutput0.addSize((-8));
      // Undeclared exception!
      try { 
        longBinding0.objectToEntry((Object) float0, tupleOutput0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -8
         //
         assertThrownBy("com.sleepycat.util.FastOutputStream", e);
      }
  }

  @Test
  public void test06()  throws Throwable  {
      // Undeclared exception!
      try { 
        LongBinding.longToEntry((-823L), (DatabaseEntry) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.bind.tuple.TupleBase", e);
      }
  }


  @Test
  public void test08()  throws Throwable  {
      LongBinding longBinding0 = new LongBinding();
      byte[] byteArray0 = new byte[9];
      TupleInput tupleInput0 = new TupleInput(byteArray0, (-1494), 798);
      // Undeclared exception!
      try { 
        longBinding0.entryToObject(tupleInput0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1494
         //
         assertThrownBy("com.sleepycat.util.FastInputStream", e);
      }
  }


  @Test
  public void test10()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0, (int) (byte)1, (int) (byte)42);
      databaseEntry0.setData(byteArray0, (int) (byte)42, 1630);
      // Undeclared exception!
      try { 
        LongBinding.entryToLong(databaseEntry0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 42
         //
         assertThrownBy("com.sleepycat.util.FastInputStream", e);
      }
  }

  @Test
  public void test11()  throws Throwable  {
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
  public void test12()  throws Throwable  {
      LongBinding longBinding0 = new LongBinding();
      TupleOutput tupleOutput0 = new TupleOutput();
      Float float0 = new Float((float) (-8));
      longBinding0.objectToEntry((Object) float0, tupleOutput0);
      assertEquals(0, tupleOutput0.getBufferOffset());
  }

  @Test
  public void test13()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0);
      LongBinding.longToEntry(0L, databaseEntry0);
      long long0 = LongBinding.entryToLong(databaseEntry0);
      assertEquals(0L, long0);
  }

}
