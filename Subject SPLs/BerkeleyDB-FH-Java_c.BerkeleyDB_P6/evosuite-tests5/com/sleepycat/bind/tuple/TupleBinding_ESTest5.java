/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 09:10:12 KST 2017
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
public class TupleBinding_ESTest5 extends TupleBinding_ESTest_scaffolding5 {

  @Test
  public void test00()  throws Throwable  {
      StringBinding stringBinding0 = new StringBinding();
      byte[] byteArray0 = new byte[0];
      TupleOutput tupleOutput0 = new TupleOutput(byteArray0);
      stringBinding0.objectToEntry((Object) null, tupleOutput0);
      assertEquals(2, tupleOutput0.size());
  }

  @Test
  public void test01()  throws Throwable  {
      BooleanBinding booleanBinding0 = new BooleanBinding();
      byte[] byteArray0 = new byte[8];
      TupleInput tupleInput0 = new TupleInput(byteArray0);
      Boolean boolean0 = (Boolean)booleanBinding0.entryToObject(tupleInput0);
      assertFalse(boolean0);
  }

  @Test
  public void test02()  throws Throwable  {
      IntegerBinding integerBinding0 = new IntegerBinding();
      // Undeclared exception!
      try { 
        integerBinding0.objectToEntry((Object) null, (DatabaseEntry) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.bind.tuple.IntegerBinding", e);
      }
  }

  @Test
  public void test03()  throws Throwable  {
      Class<Float> class0 = Float.TYPE;
      FloatBinding floatBinding0 = (FloatBinding)TupleBinding.getPrimitiveBinding(class0);
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      // Undeclared exception!
      try { 
        floatBinding0.objectToEntry((Object) floatBinding0, databaseEntry0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // com.sleepycat.bind.tuple.FloatBinding cannot be cast to java.lang.Number
         //
         assertThrownBy("com.sleepycat.bind.tuple.FloatBinding", e);
      }
  }

  @Test
  public void test04()  throws Throwable  {
      ByteBinding byteBinding0 = new ByteBinding();
      FloatBinding floatBinding0 = new FloatBinding();
      TupleOutput tupleOutput0 = floatBinding0.getTupleOutput(floatBinding0);
      // Undeclared exception!
      try { 
        byteBinding0.objectToEntry((Object) byteBinding0, tupleOutput0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // com.sleepycat.bind.tuple.ByteBinding cannot be cast to java.lang.Number
         //
         assertThrownBy("com.sleepycat.bind.tuple.ByteBinding", e);
      }
  }

  @Test
  public void test05()  throws Throwable  {
      DoubleBinding doubleBinding0 = new DoubleBinding();
      // Undeclared exception!
      try { 
        doubleBinding0.entryToObject((DatabaseEntry) null);
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
      StringBinding stringBinding0 = new StringBinding();
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte) (-47);
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0);
      // Undeclared exception!
      try { 
        stringBinding0.entryToObject(databaseEntry0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.util.UtfOps", e);
      }
  }

  @Test
  public void test08()  throws Throwable  {
      IntegerBinding integerBinding0 = new IntegerBinding();
      byte[] byteArray0 = new byte[8];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0, (-1698), (int) (byte)0);
      // Undeclared exception!
      try { 
        integerBinding0.entryToObject(databaseEntry0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1698
         //
         assertThrownBy("com.sleepycat.util.FastInputStream", e);
      }
  }

  @Test
  public void test09()  throws Throwable  {
      LongBinding longBinding0 = new LongBinding();
      byte[] byteArray0 = new byte[5];
      TupleInput tupleInput0 = new TupleInput(byteArray0, 2124, (int) (byte)34);
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

  @Test
  public void test10()  throws Throwable  {
      Class<DoubleBinding> class0 = DoubleBinding.class;
      TupleBinding tupleBinding0 = TupleBinding.getPrimitiveBinding(class0);
      assertNull(tupleBinding0);
  }

  @Test
  public void test11()  throws Throwable  {
      DoubleBinding doubleBinding0 = new DoubleBinding();
      Short short0 = new Short((short) (-138));
      byte[] byteArray0 = new byte[6];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0, (int) (byte)1, (int) (byte)3);
      doubleBinding0.objectToEntry((Object) short0, databaseEntry0);
      assertEquals(0, databaseEntry0.getPartialLength());
  }

  @Test
  public void test12()  throws Throwable  {
      StringBinding stringBinding0 = new StringBinding();
      byte[] byteArray0 = new byte[3];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0);
      String string0 = (String)stringBinding0.entryToObject(databaseEntry0);
      assertEquals("", string0);
  }
}
