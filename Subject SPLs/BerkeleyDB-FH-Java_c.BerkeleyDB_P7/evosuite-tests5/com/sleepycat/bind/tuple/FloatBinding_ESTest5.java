/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 09:04:32 KST 2017
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
public class FloatBinding_ESTest5 extends FloatBinding_ESTest_scaffolding5 {


  @Test
  public void test01()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte)32;
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0);
      float float0 = FloatBinding.entryToFloat(databaseEntry0);
      assertEquals(1.0842022E-19F, float0, 0.01F);
  }

  @Test
  public void test02()  throws Throwable  {
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      FloatBinding.floatToEntry((-1820.8F), databaseEntry0);
      FloatBinding floatBinding0 = new FloatBinding();
      TupleInput tupleInput0 = TupleBase.entryToInput(databaseEntry0);
      Float float0 = (Float)floatBinding0.entryToObject(tupleInput0);
      assertEquals((-1820.8F), (float)float0, 0.01F);
  }

  @Test
  public void test03()  throws Throwable  {
      FloatBinding floatBinding0 = new FloatBinding();
      byte[] byteArray0 = new byte[9];
      TupleOutput tupleOutput0 = new TupleOutput(byteArray0);
      // Undeclared exception!
      try { 
        floatBinding0.objectToEntry((Object) null, tupleOutput0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.bind.tuple.FloatBinding", e);
      }
  }

  @Test
  public void test04()  throws Throwable  {
      FloatBinding floatBinding0 = new FloatBinding();
      TupleOutput tupleOutput0 = TupleBase.newOutput();
      // Undeclared exception!
      try { 
        floatBinding0.objectToEntry((Object) floatBinding0, tupleOutput0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // com.sleepycat.bind.tuple.FloatBinding cannot be cast to java.lang.Number
         //
         assertThrownBy("com.sleepycat.bind.tuple.FloatBinding", e);
      }
  }

  @Test
  public void test05()  throws Throwable  {
      FloatBinding floatBinding0 = new FloatBinding();
      Double double0 = new Double(0.5651687723633828);
      TupleOutput tupleOutput0 = floatBinding0.getTupleOutput(double0);
      tupleOutput0.addSize(2975);
      Short short0 = new Short((short) (-591));
      // Undeclared exception!
      try { 
        floatBinding0.objectToEntry((Object) short0, tupleOutput0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.lang.System", e);
      }
  }

  @Test
  public void test06()  throws Throwable  {
      // Undeclared exception!
      try { 
        FloatBinding.floatToEntry((-800.0F), (DatabaseEntry) null);
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
      FloatBinding floatBinding0 = new FloatBinding();
      byte[] byteArray0 = new byte[0];
      TupleInput tupleInput0 = new TupleInput(byteArray0);
      // Undeclared exception!
      try { 
        floatBinding0.entryToObject(tupleInput0);
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
      byte[] byteArray0 = new byte[4];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0, (-925), 24);
      // Undeclared exception!
      try { 
        FloatBinding.entryToFloat(databaseEntry0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -925
         //
         assertThrownBy("com.sleepycat.util.FastInputStream", e);
      }
  }

  @Test
  public void test11()  throws Throwable  {
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      FloatBinding.floatToEntry((-1820.8F), databaseEntry0);
      float float0 = FloatBinding.entryToFloat(databaseEntry0);
      assertEquals((-1820.8F), float0, 0.01F);
  }


  @Test
  public void test13()  throws Throwable  {
      FloatBinding floatBinding0 = new FloatBinding();
      byte[] byteArray0 = new byte[8];
      TupleInput tupleInput0 = new TupleInput(byteArray0, (int) (byte) (-42), (int) (byte) (-13));
      // Undeclared exception!
      try { 
        floatBinding0.entryToObject(tupleInput0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -42
         //
         assertThrownBy("com.sleepycat.util.FastInputStream", e);
      }
  }

  @Test
  public void test14()  throws Throwable  {
      FloatBinding floatBinding0 = new FloatBinding();
      Double double0 = new Double(0.5651687723633828);
      TupleOutput tupleOutput0 = floatBinding0.getTupleOutput(double0);
      Short short0 = new Short((short) (-591));
      floatBinding0.objectToEntry((Object) short0, tupleOutput0);
      assertEquals(0, tupleOutput0.getBufferOffset());
  }
}
