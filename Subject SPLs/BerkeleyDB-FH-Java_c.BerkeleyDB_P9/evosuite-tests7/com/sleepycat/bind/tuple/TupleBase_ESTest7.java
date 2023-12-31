/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 21 18:50:45 KST 2017
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
public class TupleBase_ESTest7 extends TupleBase_ESTest_scaffolding7 {

  @Test
  public void test00()  throws Throwable  {
      TupleBase tupleBase0 = new TupleBase();
      tupleBase0.setTupleBufferSize(2342);
      int int0 = tupleBase0.getTupleBufferSize();
      assertEquals(2342, int0);
  }

  @Test
  public void test01()  throws Throwable  {
      TupleBase tupleBase0 = new TupleBase();
      tupleBase0.setTupleBufferSize((-90));
      int int0 = tupleBase0.getTupleBufferSize();
      assertEquals((-90), int0);
  }

  @Test
  public void test02()  throws Throwable  {
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      // Undeclared exception!
      try { 
        TupleBase.outputToEntry((TupleOutput) null, databaseEntry0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.bind.tuple.TupleBase", e);
      }
  }

  @Test
  public void test03()  throws Throwable  {
      TupleOutput tupleOutput0 = TupleBase.newOutput();
      TupleInput tupleInput0 = new TupleInput(tupleOutput0);
      // Undeclared exception!
      try { 
        TupleBase.inputToEntry(tupleInput0, (DatabaseEntry) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.bind.tuple.TupleBase", e);
      }
  }

  @Test
  public void test04()  throws Throwable  {
      TupleBase tupleBase0 = new TupleBase();
      tupleBase0.setTupleBufferSize((-90));
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      // Undeclared exception!
      try { 
        tupleBase0.getTupleOutput(databaseEntry0);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.bind.tuple.TupleBase", e);
      }
  }

  @Test
  public void test05()  throws Throwable  {
      // Undeclared exception!
      try { 
        TupleBase.entryToInput((DatabaseEntry) null);
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
      byte[] byteArray0 = new byte[2];
      TupleOutput tupleOutput0 = TupleBase.newOutput(byteArray0);
      assertEquals(0, tupleOutput0.size());
  }

  @Test
  public void test07()  throws Throwable  {
      TupleBase tupleBase0 = new TupleBase();
      Object object0 = new Object();
      TupleOutput tupleOutput0 = tupleBase0.getTupleOutput(object0);
      TupleInput tupleInput0 = new TupleInput(tupleOutput0);
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      TupleBase.inputToEntry(tupleInput0, databaseEntry0);
      assertEquals(0, tupleBase0.getTupleBufferSize());
  }

  @Test
  public void test08()  throws Throwable  {
      TupleBase tupleBase0 = new TupleBase();
      int int0 = tupleBase0.getTupleBufferSize();
      assertEquals(0, int0);
  }

  @Test
  public void test09()  throws Throwable  {
      TupleOutput tupleOutput0 = TupleBase.newOutput();
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      TupleBase.outputToEntry(tupleOutput0, databaseEntry0);
      assertEquals(0, databaseEntry0.getSize());
  }

  @Test
  public void test10()  throws Throwable  {
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      TupleInput tupleInput0 = TupleBase.entryToInput(databaseEntry0);
      assertEquals(0, tupleInput0.getBufferLength());
  }

  @Test
  public void test11()  throws Throwable  {
      TupleBase tupleBase0 = new TupleBase();
      tupleBase0.setTupleBufferSize(2342);
      tupleBase0.getTupleOutput("");
      assertEquals(2342, tupleBase0.getTupleBufferSize());
  }
}
