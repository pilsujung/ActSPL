/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 21 22:46:21 KST 2017
 */

package com.sleepycat.bind.serial;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.fail;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.sleepycat.bind.tuple.TupleBase;
import com.sleepycat.bind.tuple.TupleInput;
import com.sleepycat.bind.tuple.TupleOutput;
import com.sleepycat.je.DatabaseEntry;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class TupleSerialBinding_ESTest6 extends TupleSerialBinding_ESTest_scaffolding6 {

  @Test
  public void test00()  throws Throwable  {
      TupleSerialMarshalledBinding tupleSerialMarshalledBinding0 = new TupleSerialMarshalledBinding((SerialBinding) null);
      Object object0 = tupleSerialMarshalledBinding0.entryToObject((TupleInput) null, (Object) null);
      assertNull(object0);
  }

  @Test
  public void test01()  throws Throwable  {
      TupleSerialMarshalledBinding tupleSerialMarshalledBinding0 = new TupleSerialMarshalledBinding((SerialBinding) null);
      Object object0 = new Object();
      Object object1 = tupleSerialMarshalledBinding0.objectToData(object0);
      assertSame(object1, object0);
  }

  @Test
  public void test02()  throws Throwable  {
      TupleSerialMarshalledBinding tupleSerialMarshalledBinding0 = new TupleSerialMarshalledBinding((SerialBinding) null);
      // Undeclared exception!
      try { 
        tupleSerialMarshalledBinding0.objectToKey((Object) null, (DatabaseEntry) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.bind.serial.TupleSerialMarshalledBinding", e);
      }
  }

  @Test
  public void test03()  throws Throwable  {
      TupleSerialMarshalledBinding tupleSerialMarshalledBinding0 = new TupleSerialMarshalledBinding((SerialBinding) null);
      tupleSerialMarshalledBinding0.setTupleBufferSize((-1));
      Integer integer0 = new Integer(24);
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      // Undeclared exception!
      try { 
        tupleSerialMarshalledBinding0.objectToKey((Object) integer0, databaseEntry0);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.bind.tuple.TupleBase", e);
      }
  }

  @Test
  public void test04()  throws Throwable  {
      TupleSerialMarshalledBinding tupleSerialMarshalledBinding0 = new TupleSerialMarshalledBinding((SerialBinding) null);
      TupleOutput tupleOutput0 = new TupleOutput();
      // Undeclared exception!
      try { 
        tupleSerialMarshalledBinding0.objectToKey((Object) null, tupleOutput0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.bind.serial.TupleSerialMarshalledBinding", e);
      }
  }

  @Test
  public void test05()  throws Throwable  {
      TupleSerialMarshalledBinding tupleSerialMarshalledBinding0 = new TupleSerialMarshalledBinding((SerialBinding) null);
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        tupleSerialMarshalledBinding0.objectToKey(object0, (TupleOutput) null);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Object cannot be cast to com.sleepycat.bind.tuple.MarshalledTupleKeyEntity
         //
         assertThrownBy("com.sleepycat.bind.serial.TupleSerialMarshalledBinding", e);
      }
  }

  @Test
  public void test06()  throws Throwable  {
      TupleSerialMarshalledBinding tupleSerialMarshalledBinding0 = new TupleSerialMarshalledBinding((SerialBinding) null);
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      TupleInput tupleInput0 = TupleBase.entryToInput(databaseEntry0);
      // Undeclared exception!
      try { 
        tupleSerialMarshalledBinding0.entryToObject(tupleInput0, (Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.bind.serial.TupleSerialMarshalledBinding", e);
      }
  }

  @Test
  public void test07()  throws Throwable  {
      TupleSerialMarshalledBinding tupleSerialMarshalledBinding0 = new TupleSerialMarshalledBinding((SerialBinding) null);
      byte[] byteArray0 = new byte[9];
      TupleInput tupleInput0 = new TupleInput(byteArray0);
      // Undeclared exception!
      try { 
        tupleSerialMarshalledBinding0.entryToObject(tupleInput0, (Object) tupleSerialMarshalledBinding0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // com.sleepycat.bind.serial.TupleSerialMarshalledBinding cannot be cast to com.sleepycat.bind.tuple.MarshalledTupleKeyEntity
         //
         assertThrownBy("com.sleepycat.bind.serial.TupleSerialMarshalledBinding", e);
      }
  }

  @Test
  public void test08()  throws Throwable  {
      TupleSerialMarshalledBinding tupleSerialMarshalledBinding0 = new TupleSerialMarshalledBinding((SerialBinding) null);
      byte[] byteArray0 = new byte[6];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0, (-593), (int) (byte)66);
      // Undeclared exception!
      try { 
        tupleSerialMarshalledBinding0.entryToObject(databaseEntry0, (DatabaseEntry) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.bind.serial.TupleSerialBinding", e);
      }
  }

  @Test
  public void test09()  throws Throwable  {
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      TupleSerialMarshalledBinding tupleSerialMarshalledBinding0 = new TupleSerialMarshalledBinding((SerialBinding) null);
      // Undeclared exception!
      try { 
        tupleSerialMarshalledBinding0.objectToData((Object) null, databaseEntry0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.bind.serial.TupleSerialBinding", e);
      }
  }

  @Test
  public void test10()  throws Throwable  {
      TupleSerialMarshalledBinding tupleSerialMarshalledBinding0 = new TupleSerialMarshalledBinding((SerialBinding) null);
      Integer integer0 = new Integer(24);
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      // Undeclared exception!
      try { 
        tupleSerialMarshalledBinding0.objectToKey((Object) integer0, databaseEntry0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Integer cannot be cast to com.sleepycat.bind.tuple.MarshalledTupleKeyEntity
         //
         assertThrownBy("com.sleepycat.bind.serial.TupleSerialMarshalledBinding", e);
      }
  }
}
