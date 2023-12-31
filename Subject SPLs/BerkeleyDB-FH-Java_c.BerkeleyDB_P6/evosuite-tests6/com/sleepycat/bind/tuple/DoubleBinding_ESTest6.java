/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 21 22:51:13 KST 2017
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
public class DoubleBinding_ESTest6 extends DoubleBinding_ESTest_scaffolding6 {

  @Test
  public void test00()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0);
      DoubleBinding.doubleToEntry(0.0, databaseEntry0);
      double double0 = DoubleBinding.entryToDouble(databaseEntry0);
      assertEquals(0.0, double0, 0.01D);
  }

  @Test
  public void test01()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0);
      DoubleBinding.doubleToEntry(1815.2771, databaseEntry0);
      double double0 = DoubleBinding.entryToDouble(databaseEntry0);
      assertEquals(1815.2771, double0, 0.01D);
  }

  @Test
  public void test02()  throws Throwable  {
      DoubleBinding doubleBinding0 = new DoubleBinding();
      TupleOutput tupleOutput0 = TupleBase.newOutput();
      TupleOutput tupleOutput1 = tupleOutput0.writeLong(0L);
      TupleInput tupleInput0 = new TupleInput(tupleOutput1);
      Double double0 = (Double)doubleBinding0.entryToObject(tupleInput0);
      assertEquals(-0.0, (double)double0, 0.01D);
  }

  @Test
  public void test03()  throws Throwable  {
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      DoubleBinding.doubleToEntry((-856.87995200379), databaseEntry0);
      double double0 = DoubleBinding.entryToDouble(databaseEntry0);
      assertEquals((-856.87995200379), double0, 0.01D);
  }

  @Test
  public void test04()  throws Throwable  {
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
  public void test05()  throws Throwable  {
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
  public void test06()  throws Throwable  {
      DoubleBinding doubleBinding0 = new DoubleBinding();
      Byte byte0 = new Byte((byte) (-66));
      Object object0 = new Object();
      TupleOutput tupleOutput0 = doubleBinding0.getTupleOutput(object0);
      tupleOutput0.addSize(224);
      // Undeclared exception!
      try { 
        doubleBinding0.objectToEntry((Object) byte0, tupleOutput0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.lang.System", e);
      }
  }

  @Test
  public void test07()  throws Throwable  {
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
  public void test08()  throws Throwable  {
      DoubleBinding doubleBinding0 = new DoubleBinding();
      byte[] byteArray0 = new byte[3];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0, (int) (byte) (-35), (int) (byte)0);
      TupleInput tupleInput0 = TupleBase.entryToInput(databaseEntry0);
      // Undeclared exception!
      try { 
        doubleBinding0.entryToObject(tupleInput0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -35
         //
         assertThrownBy("com.sleepycat.util.FastInputStream", e);
      }
  }

  @Test
  public void test09()  throws Throwable  {
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
  public void test10()  throws Throwable  {
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      byte[] byteArray0 = new byte[6];
      databaseEntry0.setData(byteArray0, (int) (byte)0, (int) (byte)48);
      // Undeclared exception!
      try { 
        DoubleBinding.entryToDouble(databaseEntry0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 6
         //
         assertThrownBy("com.sleepycat.util.FastInputStream", e);
      }
  }

  @Test
  public void test11()  throws Throwable  {
      DoubleBinding doubleBinding0 = new DoubleBinding();
      Byte byte0 = new Byte((byte) (-66));
      Object object0 = new Object();
      TupleOutput tupleOutput0 = doubleBinding0.getTupleOutput(object0);
      doubleBinding0.objectToEntry((Object) byte0, tupleOutput0);
      assertEquals(8, tupleOutput0.size());
  }

  @Test
  public void test12()  throws Throwable  {
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
  public void test13()  throws Throwable  {
      // Undeclared exception!
      try { 
        DoubleBinding.doubleToEntry(1.0, (DatabaseEntry) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.bind.tuple.TupleBase", e);
      }
  }

  @Test
  public void test14()  throws Throwable  {
      DoubleBinding doubleBinding0 = new DoubleBinding();
      TupleOutput tupleOutput0 = TupleBase.newOutput();
      TupleInput tupleInput0 = new TupleInput(tupleOutput0);
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
}
