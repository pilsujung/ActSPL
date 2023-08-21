/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 21 23:11:20 KST 2017
 */

package com.sleepycat.bind.tuple;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.sleepycat.bind.tuple.BooleanBinding;
import com.sleepycat.bind.tuple.TupleBase;
import com.sleepycat.bind.tuple.TupleInput;
import com.sleepycat.bind.tuple.TupleOutput;
import com.sleepycat.je.DatabaseEntry;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class BooleanBinding_ESTest2 extends BooleanBinding_ESTest_scaffolding2 {

  @Test
  public void test00()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte) (-59);
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0);
      boolean boolean0 = BooleanBinding.entryToBoolean(databaseEntry0);
      assertTrue(boolean0);
  }

  @Test
  public void test01()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0);
      boolean boolean0 = BooleanBinding.entryToBoolean(databaseEntry0);
      assertFalse(boolean0);
  }

  @Test
  public void test02()  throws Throwable  {
      BooleanBinding booleanBinding0 = new BooleanBinding();
      Integer integer0 = new Integer(0);
      TupleOutput tupleOutput0 = booleanBinding0.getTupleOutput(integer0);
      // Undeclared exception!
      try { 
        booleanBinding0.objectToEntry((Object) null, tupleOutput0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.bind.tuple.BooleanBinding", e);
      }
  }

  @Test
  public void test03()  throws Throwable  {
      BooleanBinding booleanBinding0 = new BooleanBinding();
      TupleOutput tupleOutput0 = booleanBinding0.getTupleOutput(booleanBinding0);
      // Undeclared exception!
      try { 
        booleanBinding0.objectToEntry((Object) booleanBinding0, tupleOutput0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // com.sleepycat.bind.tuple.BooleanBinding cannot be cast to java.lang.Boolean
         //
         assertThrownBy("com.sleepycat.bind.tuple.BooleanBinding", e);
      }
  }

  @Test
  public void test04()  throws Throwable  {
      BooleanBinding booleanBinding0 = new BooleanBinding();
      Boolean boolean0 = new Boolean(true);
      TupleOutput tupleOutput0 = booleanBinding0.getTupleOutput(boolean0);
      tupleOutput0.addSize((-2993));
      // Undeclared exception!
      try { 
        booleanBinding0.objectToEntry((Object) boolean0, tupleOutput0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2993
         //
         assertThrownBy("com.sleepycat.util.FastOutputStream", e);
      }
  }


  @Test
  public void test06()  throws Throwable  {
      BooleanBinding booleanBinding0 = new BooleanBinding();
      byte[] byteArray0 = new byte[1];
      TupleInput tupleInput0 = new TupleInput(byteArray0, (-2148), (int) (byte)0);
      // Undeclared exception!
      try { 
        booleanBinding0.entryToObject(tupleInput0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2148
         //
         assertThrownBy("com.sleepycat.util.FastInputStream", e);
      }
  }


  @Test
  public void test08()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0, (int) (byte) (-20), (int) (byte)118);
      // Undeclared exception!
      try { 
        BooleanBinding.entryToBoolean(databaseEntry0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -20
         //
         assertThrownBy("com.sleepycat.util.FastInputStream", e);
      }
  }

  @Test
  public void test09()  throws Throwable  {
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
  public void test10()  throws Throwable  {
      BooleanBinding booleanBinding0 = new BooleanBinding();
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte) (-59);
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0);
      TupleInput tupleInput0 = TupleBase.entryToInput(databaseEntry0);
      Boolean boolean0 = (Boolean)booleanBinding0.entryToObject(tupleInput0);
      assertTrue(boolean0);
  }

  @Test
  public void test11()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      BooleanBinding booleanBinding0 = new BooleanBinding();
      TupleInput tupleInput0 = new TupleInput(byteArray0);
      booleanBinding0.entryToObject(tupleInput0);
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
  public void test13()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0, (int) (byte)0, (int) (byte)0);
      BooleanBinding.booleanToEntry(false, databaseEntry0);
      assertEquals(0, databaseEntry0.getOffset());
  }

  @Test
  public void test14()  throws Throwable  {
      BooleanBinding booleanBinding0 = new BooleanBinding();
      Boolean boolean0 = new Boolean(true);
      TupleOutput tupleOutput0 = booleanBinding0.getTupleOutput(boolean0);
      booleanBinding0.objectToEntry((Object) boolean0, tupleOutput0);
      assertEquals(1, tupleOutput0.getBufferLength());
  }
}
