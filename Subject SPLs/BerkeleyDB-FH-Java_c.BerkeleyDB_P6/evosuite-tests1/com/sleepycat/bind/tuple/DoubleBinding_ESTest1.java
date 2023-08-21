/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 21 18:13:29 KST 2017
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
public class DoubleBinding_ESTest1 extends DoubleBinding_ESTest_scaffolding1 {

  @Test
  public void test00()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0);
      DoubleBinding.doubleToEntry(2231.770018, databaseEntry0);
      double double0 = DoubleBinding.entryToDouble(databaseEntry0);
      assertEquals(2231.770018, double0, 0.01D);
  }

  @Test
  public void test01()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte) (-128);
      byteArray0[1] = (byte)16;
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0);
      double double0 = DoubleBinding.entryToDouble(databaseEntry0);
      assertEquals((-2.2250738585072014E-308), double0, 0.01D);
  }

  @Test
  public void test02()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0, 56, 56);
      DoubleBinding.doubleToEntry(0.0, databaseEntry0);
      DoubleBinding doubleBinding0 = new DoubleBinding();
      TupleInput tupleInput0 = TupleBase.entryToInput(databaseEntry0);
      Double double0 = (Double)doubleBinding0.entryToObject(tupleInput0);
      assertEquals(0.0, (double)double0, 0.01D);
  }

  @Test
  public void test03()  throws Throwable  {
      DoubleBinding doubleBinding0 = new DoubleBinding();
      TupleOutput tupleOutput0 = new TupleOutput();
      // Undeclared exception!
      try { 
        doubleBinding0.objectToEntry((Object) null, tupleOutput0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.bind.tuple.DoubleBinding", e);
      }
  }

  @Test
  public void test04()  throws Throwable  {
      DoubleBinding doubleBinding0 = new DoubleBinding();
      TupleOutput tupleOutput0 = new TupleOutput();
      // Undeclared exception!
      try { 
        doubleBinding0.objectToEntry((Object) doubleBinding0, tupleOutput0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // com.sleepycat.bind.tuple.DoubleBinding cannot be cast to java.lang.Number
         //
         assertThrownBy("com.sleepycat.bind.tuple.DoubleBinding", e);
      }
  }

  @Test
  public void test05()  throws Throwable  {
      DoubleBinding doubleBinding0 = new DoubleBinding();
      // Undeclared exception!
      try { 
        doubleBinding0.entryToObject((TupleInput) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.bind.tuple.DoubleBinding", e);
      }
  }

  @Test
  public void test06()  throws Throwable  {
      DoubleBinding doubleBinding0 = new DoubleBinding();
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      TupleInput tupleInput0 = TupleBase.entryToInput(databaseEntry0);
      // Undeclared exception!
      try { 
        doubleBinding0.entryToObject(tupleInput0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.bind.tuple.TupleInput", e);
      }
  }

  @Test
  public void test07()  throws Throwable  {
      // Undeclared exception!
      try { 
        DoubleBinding.entryToDouble((DatabaseEntry) null);
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
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      // Undeclared exception!
      try { 
        DoubleBinding.entryToDouble(databaseEntry0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.bind.tuple.TupleInput", e);
      }
  }

  @Test
  public void test09()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0, (int) (byte) (-1), 2477);
      // Undeclared exception!
      try { 
        DoubleBinding.entryToDouble(databaseEntry0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         assertThrownBy("com.sleepycat.util.FastInputStream", e);
      }
  }

  @Test
  public void test10()  throws Throwable  {
      DoubleBinding doubleBinding0 = new DoubleBinding();
      Short short0 = new Short((short) (-775));
      TupleOutput tupleOutput0 = doubleBinding0.getTupleOutput(doubleBinding0);
      doubleBinding0.objectToEntry((Object) short0, tupleOutput0);
      assertEquals(0, doubleBinding0.getTupleBufferSize());
  }

  @Test
  public void test11()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0);
      double double0 = DoubleBinding.entryToDouble(databaseEntry0);
      assertEquals(0.0, double0, 0.01D);
  }

  @Test
  public void test12()  throws Throwable  {
      // Undeclared exception!
      try { 
        DoubleBinding.doubleToEntry(0.0, (DatabaseEntry) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.bind.tuple.TupleBase", e);
      }
  }

  @Test
  public void test13()  throws Throwable  {
      DoubleBinding doubleBinding0 = new DoubleBinding();
      byte[] byteArray0 = new byte[8];
      TupleInput tupleInput0 = new TupleInput(byteArray0, (int) (byte) (-128), 2);
      // Undeclared exception!
      try { 
        doubleBinding0.entryToObject(tupleInput0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -128
         //
         assertThrownBy("com.sleepycat.util.FastInputStream", e);
      }
  }
}
