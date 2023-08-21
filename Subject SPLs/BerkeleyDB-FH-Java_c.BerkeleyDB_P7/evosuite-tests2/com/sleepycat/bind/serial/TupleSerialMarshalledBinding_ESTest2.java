/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 21 23:12:51 KST 2017
 */

package com.sleepycat.bind.serial;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.sleepycat.bind.serial.ClassCatalog;
import com.sleepycat.bind.serial.SerialBinding;
import com.sleepycat.bind.serial.TupleSerialMarshalledBinding;
import com.sleepycat.bind.tuple.TupleBase;
import com.sleepycat.bind.tuple.TupleInput;
import com.sleepycat.bind.tuple.TupleOutput;
import com.sleepycat.je.DatabaseEntry;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class TupleSerialMarshalledBinding_ESTest2 extends TupleSerialMarshalledBinding_ESTest_scaffolding2 {

  @Test
  public void test0()  throws Throwable  {
      TupleSerialMarshalledBinding tupleSerialMarshalledBinding0 = new TupleSerialMarshalledBinding((SerialBinding) null);
      String string0 = (String)tupleSerialMarshalledBinding0.objectToData((Object) "h0Q\"z");
      assertEquals("h0Q\"z", string0);
  }

  @Test
  public void test1()  throws Throwable  {
      TupleSerialMarshalledBinding tupleSerialMarshalledBinding0 = new TupleSerialMarshalledBinding((SerialBinding) null);
      // Undeclared exception!
      try { 
        tupleSerialMarshalledBinding0.objectToKey((Object) "h0Q\"z", (TupleOutput) null);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.String cannot be cast to com.sleepycat.bind.tuple.MarshalledTupleKeyEntity
         //
         assertThrownBy("com.sleepycat.bind.serial.TupleSerialMarshalledBinding", e);
      }
  }

  @Test
  public void test2()  throws Throwable  {
      TupleSerialMarshalledBinding tupleSerialMarshalledBinding0 = new TupleSerialMarshalledBinding((SerialBinding) null);
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      TupleInput tupleInput0 = TupleBase.entryToInput(databaseEntry0);
      // Undeclared exception!
      try { 
        tupleSerialMarshalledBinding0.entryToObject(tupleInput0, (Object) databaseEntry0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // com.sleepycat.je.DatabaseEntry cannot be cast to com.sleepycat.bind.tuple.MarshalledTupleKeyEntity
         //
         assertThrownBy("com.sleepycat.bind.serial.TupleSerialMarshalledBinding", e);
      }
  }




  @Test
  public void test6()  throws Throwable  {
      TupleSerialMarshalledBinding tupleSerialMarshalledBinding0 = new TupleSerialMarshalledBinding((SerialBinding) null);
      TupleOutput tupleOutput0 = TupleBase.newOutput();
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
  public void test7()  throws Throwable  {
      Class<String> class0 = String.class;
      TupleSerialMarshalledBinding tupleSerialMarshalledBinding0 = null;
      try {
        tupleSerialMarshalledBinding0 = new TupleSerialMarshalledBinding((ClassCatalog) null, (Class) class0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // classCatalog must be non-null
         //
         assertThrownBy("com.sleepycat.bind.serial.SerialBinding", e);
      }
  }
}
