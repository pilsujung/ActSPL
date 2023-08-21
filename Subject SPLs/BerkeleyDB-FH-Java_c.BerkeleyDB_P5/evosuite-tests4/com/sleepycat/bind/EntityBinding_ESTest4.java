/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 13:01:20 KST 2017
 */

package com.sleepycat.bind;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.sleepycat.bind.serial.SerialBinding;
import com.sleepycat.bind.serial.TupleSerialMarshalledBinding;
import com.sleepycat.je.DatabaseEntry;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class EntityBinding_ESTest4 extends EntityBinding_ESTest_scaffolding4 {

  @Test
  public void test0()  throws Throwable  {
      TupleSerialMarshalledBinding tupleSerialMarshalledBinding0 = new TupleSerialMarshalledBinding((SerialBinding) null);
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      // Undeclared exception!
      try { 
        tupleSerialMarshalledBinding0.objectToKey((Object) null, databaseEntry0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.bind.serial.TupleSerialMarshalledBinding", e);
      }
  }

  @Test
  public void test1()  throws Throwable  {
      TupleSerialMarshalledBinding tupleSerialMarshalledBinding0 = new TupleSerialMarshalledBinding((SerialBinding) null);
      byte[] byteArray0 = new byte[3];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0, (int) (byte) (-60), (int) (byte) (-1));
      tupleSerialMarshalledBinding0.setTupleBufferSize((-2161));
      // Undeclared exception!
      try { 
        tupleSerialMarshalledBinding0.objectToKey(tupleSerialMarshalledBinding0, databaseEntry0);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.bind.tuple.TupleBase", e);
      }
  }

  @Test
  public void test2()  throws Throwable  {
      TupleSerialMarshalledBinding tupleSerialMarshalledBinding0 = new TupleSerialMarshalledBinding((SerialBinding) null);
      Integer integer0 = new Integer((-1567));
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      // Undeclared exception!
      try { 
        tupleSerialMarshalledBinding0.objectToKey(integer0, databaseEntry0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Integer cannot be cast to com.sleepycat.bind.tuple.MarshalledTupleKeyEntity
         //
         assertThrownBy("com.sleepycat.bind.serial.TupleSerialMarshalledBinding", e);
      }
  }

  @Test
  public void test3()  throws Throwable  {
      TupleSerialMarshalledBinding tupleSerialMarshalledBinding0 = new TupleSerialMarshalledBinding((SerialBinding) null);
      byte[] byteArray0 = new byte[4];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0, (int) (byte) (-107), (int) (byte) (-107));
      // Undeclared exception!
      try { 
        tupleSerialMarshalledBinding0.objectToData(tupleSerialMarshalledBinding0, databaseEntry0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.bind.serial.TupleSerialBinding", e);
      }
  }

  @Test
  public void test4()  throws Throwable  {
      TupleSerialMarshalledBinding tupleSerialMarshalledBinding0 = new TupleSerialMarshalledBinding((SerialBinding) null);
      // Undeclared exception!
      try { 
        tupleSerialMarshalledBinding0.entryToObject((DatabaseEntry) null, (DatabaseEntry) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.bind.tuple.TupleBase", e);
      }
  }
}
