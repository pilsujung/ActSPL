/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 21 18:42:44 KST 2017
 */

package com.sleepycat.bind.tuple;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.sleepycat.je.DatabaseEntry;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class BooleanBinding_ESTest7 extends BooleanBinding_ESTest_scaffolding7 {

  @Test
  public void test00()  throws Throwable  {
      byte[] byteArray0 = new byte[15];
      byteArray0[0] = (byte) (-122);
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0);
      boolean boolean0 = BooleanBinding.entryToBoolean(databaseEntry0);
      assertTrue(boolean0);
  }

  @Test
  public void test01()  throws Throwable  {
      byte[] byteArray0 = new byte[15];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0);
      BooleanBinding.booleanToEntry(true, databaseEntry0);
      assertEquals(0, databaseEntry0.getPartialOffset());
  }

  @Test
  public void test02()  throws Throwable  {
      BooleanBinding booleanBinding0 = new BooleanBinding();
      Object object0 = new Object();
      TupleOutput tupleOutput0 = booleanBinding0.getTupleOutput("uQ1^x:N!FQCa7i");
      // Undeclared exception!
      try { 
        booleanBinding0.objectToEntry(object0, tupleOutput0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Object cannot be cast to java.lang.Boolean
         //
         assertThrownBy("com.sleepycat.bind.tuple.BooleanBinding", e);
      }
  }

  @Test
  public void test03()  throws Throwable  {
      BooleanBinding booleanBinding0 = new BooleanBinding();
      // Undeclared exception!
      try { 
        booleanBinding0.entryToObject((TupleInput) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.bind.tuple.BooleanBinding", e);
      }
  }

  @Test
  public void test04()  throws Throwable  {
      BooleanBinding booleanBinding0 = new BooleanBinding();
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      TupleInput tupleInput0 = TupleBase.entryToInput(databaseEntry0);
      // Undeclared exception!
      try { 
        booleanBinding0.entryToObject(tupleInput0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.bind.tuple.TupleInput", e);
      }
  }

  @Test
  public void test05()  throws Throwable  {
      BooleanBinding booleanBinding0 = new BooleanBinding();
      byte[] byteArray0 = new byte[7];
      TupleInput tupleInput0 = new TupleInput(byteArray0, (-9), 48);
      // Undeclared exception!
      try { 
        booleanBinding0.entryToObject(tupleInput0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -9
         //
         assertThrownBy("com.sleepycat.util.FastInputStream", e);
      }
  }

  @Test
  public void test06()  throws Throwable  {
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      databaseEntry0.setSize(56);
      // Undeclared exception!
      try { 
        BooleanBinding.entryToBoolean(databaseEntry0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.util.FastInputStream", e);
      }
  }

  @Test
  public void test07()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0, (-2297), (-2297));
      // Undeclared exception!
      try { 
        BooleanBinding.entryToBoolean(databaseEntry0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.bind.tuple.TupleInput", e);
      }
  }

  @Test
  public void test08()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0, (-193), (int) (byte)0);
      // Undeclared exception!
      try { 
        BooleanBinding.entryToBoolean(databaseEntry0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -193
         //
         assertThrownBy("com.sleepycat.util.FastInputStream", e);
      }
  }

  @Test
  public void test09()  throws Throwable  {
      BooleanBinding booleanBinding0 = new BooleanBinding();
      byte[] byteArray0 = new byte[15];
      byteArray0[0] = (byte) (-122);
      TupleInput tupleInput0 = new TupleInput(byteArray0);
      Boolean boolean0 = (Boolean)booleanBinding0.entryToObject(tupleInput0);
      assertTrue(boolean0);
  }

  @Test
  public void test10()  throws Throwable  {
      BooleanBinding booleanBinding0 = new BooleanBinding();
      byte[] byteArray0 = new byte[15];
      TupleInput tupleInput0 = new TupleInput(byteArray0);
      Boolean boolean0 = (Boolean)booleanBinding0.entryToObject(tupleInput0);
      assertFalse(boolean0);
  }

  @Test
  public void test11()  throws Throwable  {
      BooleanBinding booleanBinding0 = new BooleanBinding();
      TupleOutput tupleOutput0 = booleanBinding0.getTupleOutput(booleanBinding0);
      Boolean boolean0 = Boolean.TRUE;
      booleanBinding0.objectToEntry((Object) boolean0, tupleOutput0);
      assertEquals(1, tupleOutput0.size());
  }

  @Test
  public void test12()  throws Throwable  {
      byte[] byteArray0 = new byte[15];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0);
      boolean boolean0 = BooleanBinding.entryToBoolean(databaseEntry0);
      assertFalse(boolean0);
  }

  @Test
  public void test13()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanBinding.booleanToEntry(true, (DatabaseEntry) null);
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
      BooleanBinding booleanBinding0 = new BooleanBinding();
      Boolean boolean0 = Boolean.valueOf(true);
      // Undeclared exception!
      try { 
        booleanBinding0.objectToEntry((Object) boolean0, (TupleOutput) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.bind.tuple.BooleanBinding", e);
      }
  }
}
