/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 21 22:57:24 KST 2017
 */

package com.sleepycat.bind.tuple;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.fail;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.sleepycat.je.DatabaseEntry;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class TupleBinding_ESTest6 extends TupleBinding_ESTest_scaffolding6 {

  @Test
  public void test00()  throws Throwable  {
      Class<Float> class0 = Float.class;
      FloatBinding floatBinding0 = (FloatBinding)TupleBinding.getPrimitiveBinding(class0);
      assertEquals(0, floatBinding0.getTupleBufferSize());
  }

  @Test
  public void test01()  throws Throwable  {
      Object object0 = new Object();
      LongBinding longBinding0 = new LongBinding();
      Integer integer0 = new Integer(230);
      IntegerBinding integerBinding0 = new IntegerBinding();
      TupleOutput tupleOutput0 = integerBinding0.getTupleOutput(object0);
      longBinding0.objectToEntry((Object) integer0, tupleOutput0);
      assertEquals(8, tupleOutput0.getBufferLength());
  }

  @Test
  public void test02()  throws Throwable  {
      ShortBinding shortBinding0 = new ShortBinding();
      byte[] byteArray0 = new byte[2];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0);
      Short short0 = (Short)shortBinding0.entryToObject(databaseEntry0);
      assertEquals((short) (-32768), (short)short0);
  }

  @Test
  public void test03()  throws Throwable  {
      BooleanBinding booleanBinding0 = new BooleanBinding();
      byte[] byteArray0 = new byte[2];
      TupleInput tupleInput0 = new TupleInput(byteArray0);
      Boolean boolean0 = (Boolean)booleanBinding0.entryToObject(tupleInput0);
      assertFalse(boolean0);
  }

  @Test
  public void test04()  throws Throwable  {
      LongBinding longBinding0 = new LongBinding();
      Short short0 = new Short((short)2188);
      byte[] byteArray0 = new byte[6];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0, (int) (byte)0, 3);
      longBinding0.objectToEntry((Object) short0, databaseEntry0);
      assertFalse(databaseEntry0.getPartial());
  }

  @Test
  public void test05()  throws Throwable  {
      CharacterBinding characterBinding0 = new CharacterBinding();
      DoubleBinding doubleBinding0 = new DoubleBinding();
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      // Undeclared exception!
      try { 
        characterBinding0.objectToEntry((Object) doubleBinding0, databaseEntry0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // com.sleepycat.bind.tuple.DoubleBinding cannot be cast to java.lang.Character
         //
         assertThrownBy("com.sleepycat.bind.tuple.CharacterBinding", e);
      }
  }

  @Test
  public void test06()  throws Throwable  {
      ShortBinding shortBinding0 = new ShortBinding();
      byte[] byteArray0 = new byte[6];
      TupleOutput tupleOutput0 = TupleBase.newOutput(byteArray0);
      // Undeclared exception!
      try { 
        shortBinding0.objectToEntry((Object) shortBinding0, tupleOutput0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // com.sleepycat.bind.tuple.ShortBinding cannot be cast to java.lang.Number
         //
         assertThrownBy("com.sleepycat.bind.tuple.ShortBinding", e);
      }
  }

  @Test
  public void test07()  throws Throwable  {
      LongBinding longBinding0 = new LongBinding();
      // Undeclared exception!
      try { 
        longBinding0.entryToObject((DatabaseEntry) null);
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
      IntegerBinding integerBinding0 = new IntegerBinding();
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      byte[] byteArray0 = new byte[8];
      databaseEntry0.setData(byteArray0, (-2777), 222);
      // Undeclared exception!
      try { 
        integerBinding0.entryToObject(databaseEntry0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2777
         //
         assertThrownBy("com.sleepycat.util.FastInputStream", e);
      }
  }

  @Test
  public void test09()  throws Throwable  {
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
  public void test10()  throws Throwable  {
      ShortBinding shortBinding0 = new ShortBinding();
      byte[] byteArray0 = new byte[2];
      TupleInput tupleInput0 = new TupleInput(byteArray0, 0, (-529));
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
  public void test11()  throws Throwable  {
      Class<DoubleBinding> class0 = DoubleBinding.class;
      TupleBinding tupleBinding0 = TupleBinding.getPrimitiveBinding(class0);
      assertNull(tupleBinding0);
  }

  @Test
  public void test12()  throws Throwable  {
      DoubleBinding doubleBinding0 = new DoubleBinding();
      // Undeclared exception!
      try { 
        doubleBinding0.objectToEntry((Object) null, (DatabaseEntry) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.bind.tuple.DoubleBinding", e);
      }
  }

  @Test
  public void test13()  throws Throwable  {
      IntegerBinding integerBinding0 = new IntegerBinding();
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      // Undeclared exception!
      try { 
        integerBinding0.entryToObject(databaseEntry0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.bind.tuple.TupleInput", e);
      }
  }
}
