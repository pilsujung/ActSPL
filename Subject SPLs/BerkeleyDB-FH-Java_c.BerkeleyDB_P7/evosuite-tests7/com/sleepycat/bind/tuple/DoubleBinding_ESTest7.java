/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 21 18:44:56 KST 2017
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
public class DoubleBinding_ESTest7 extends DoubleBinding_ESTest_scaffolding7 {

  @Test
  public void test00()  throws Throwable  {
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      DoubleBinding.doubleToEntry(0.0, databaseEntry0);
      double double0 = DoubleBinding.entryToDouble(databaseEntry0);
      assertEquals(0.0, double0, 0.01D);
  }

  @Test
  public void test01()  throws Throwable  {
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      DoubleBinding.doubleToEntry(1913.82, databaseEntry0);
      double double0 = DoubleBinding.entryToDouble(databaseEntry0);
      assertEquals(1913.82, double0, 0.01D);
  }

  @Test
  public void test02()  throws Throwable  {
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      DoubleBinding.doubleToEntry((-3505.0), databaseEntry0);
      DoubleBinding doubleBinding0 = new DoubleBinding();
      TupleInput tupleInput0 = TupleBase.entryToInput(databaseEntry0);
      Double double0 = (Double)doubleBinding0.entryToObject(tupleInput0);
      assertEquals((-3505.0), (double)double0, 0.01D);
  }

  @Test
  public void test03()  throws Throwable  {
      DoubleBinding doubleBinding0 = new DoubleBinding();
      Short short0 = new Short((short)0);
      // Undeclared exception!
      try { 
        doubleBinding0.objectToEntry((Object) short0, (TupleOutput) null);
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
      TupleOutput tupleOutput0 = TupleBase.newOutput();
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
      byte[] byteArray0 = new byte[6];
      TupleInput tupleInput0 = new TupleInput(byteArray0, (-765), 0);
      // Undeclared exception!
      try { 
        doubleBinding0.entryToObject(tupleInput0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -765
         //
         assertThrownBy("com.sleepycat.util.FastInputStream", e);
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
      byte[] byteArray0 = new byte[3];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0, (int) (byte)0, (int) (byte)0);
      databaseEntry0.setData(byteArray0, (-175), (int) (byte)0);
      // Undeclared exception!
      try { 
        DoubleBinding.entryToDouble(databaseEntry0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -175
         //
         assertThrownBy("com.sleepycat.util.FastInputStream", e);
      }
  }

  @Test
  public void test09()  throws Throwable  {
      // Undeclared exception!
      try { 
        DoubleBinding.doubleToEntry((-384.6022717023), (DatabaseEntry) null);
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
      DoubleBinding doubleBinding0 = new DoubleBinding();
      Short short0 = new Short((short) (-2763));
      TupleOutput tupleOutput0 = TupleBase.newOutput();
      doubleBinding0.objectToEntry((Object) short0, tupleOutput0);
      assertEquals(0, tupleOutput0.getBufferOffset());
  }

  @Test
  public void test11()  throws Throwable  {
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
  public void test12()  throws Throwable  {
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      DoubleBinding.doubleToEntry((-670.44117860889), databaseEntry0);
      double double0 = DoubleBinding.entryToDouble(databaseEntry0);
      assertEquals((-670.44117860889), double0, 0.01D);
  }

  @Test
  public void test13()  throws Throwable  {
      DoubleBinding doubleBinding0 = new DoubleBinding();
      TupleOutput tupleOutput0 = doubleBinding0.getTupleOutput(doubleBinding0);
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
