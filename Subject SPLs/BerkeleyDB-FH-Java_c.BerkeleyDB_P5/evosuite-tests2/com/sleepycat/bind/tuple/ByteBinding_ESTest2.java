/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 21 23:10:40 KST 2017
 */

package com.sleepycat.bind.tuple;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.sleepycat.bind.tuple.ByteBinding;
import com.sleepycat.bind.tuple.TupleBase;
import com.sleepycat.bind.tuple.TupleInput;
import com.sleepycat.bind.tuple.TupleOutput;
import com.sleepycat.je.DatabaseEntry;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class ByteBinding_ESTest2 extends ByteBinding_ESTest_scaffolding2 {

  @Test
  public void test00()  throws Throwable  {
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      ByteBinding.byteToEntry((byte)14, databaseEntry0);
      byte byte0 = ByteBinding.entryToByte(databaseEntry0);
      assertEquals((byte)14, byte0);
  }

  @Test
  public void test01()  throws Throwable  {
      ByteBinding byteBinding0 = new ByteBinding();
      // Undeclared exception!
      try { 
        byteBinding0.objectToEntry((Object) null, (TupleOutput) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.bind.tuple.ByteBinding", e);
      }
  }

  @Test
  public void test02()  throws Throwable  {
      ByteBinding byteBinding0 = new ByteBinding();
      Object object0 = new Object();
      TupleOutput tupleOutput0 = byteBinding0.getTupleOutput(object0);
      // Undeclared exception!
      try { 
        byteBinding0.objectToEntry((Object) "~na", tupleOutput0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.String cannot be cast to java.lang.Number
         //
         assertThrownBy("com.sleepycat.bind.tuple.ByteBinding", e);
      }
  }

  @Test
  public void test03()  throws Throwable  {
      ByteBinding byteBinding0 = new ByteBinding();
      Byte byte0 = new Byte((byte)59);
      TupleOutput tupleOutput0 = byteBinding0.getTupleOutput(byte0);
      tupleOutput0.addSize((byte)59);
      Double double0 = new Double((double) (byte)59);
      // Undeclared exception!
      try { 
        byteBinding0.objectToEntry((Object) double0, tupleOutput0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.lang.System", e);
      }
  }


  @Test
  public void test05()  throws Throwable  {
      ByteBinding byteBinding0 = new ByteBinding();
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      TupleInput tupleInput0 = TupleBase.entryToInput(databaseEntry0);
      // Undeclared exception!
      try { 
        byteBinding0.entryToObject(tupleInput0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.bind.tuple.TupleInput", e);
      }
  }

  @Test
  public void test06()  throws Throwable  {
      ByteBinding byteBinding0 = new ByteBinding();
      byte[] byteArray0 = new byte[5];
      TupleInput tupleInput0 = new TupleInput(byteArray0, (int) (byte) (-75), (int) (byte)0);
      // Undeclared exception!
      try { 
        byteBinding0.entryToObject(tupleInput0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -75
         //
         assertThrownBy("com.sleepycat.util.FastInputStream", e);
      }
  }


  @Test
  public void test08()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0, 2358, 0);
      // Undeclared exception!
      try { 
        ByteBinding.entryToByte(databaseEntry0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.bind.tuple.TupleInput", e);
      }
  }

  @Test
  public void test09()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0, (-1532), 0);
      // Undeclared exception!
      try { 
        ByteBinding.entryToByte(databaseEntry0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1532
         //
         assertThrownBy("com.sleepycat.util.FastInputStream", e);
      }
  }


  @Test
  public void test11()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0);
      byte byte0 = ByteBinding.entryToByte(databaseEntry0);
      assertEquals((byte) (-128), byte0);
  }

  @Test
  public void test12()  throws Throwable  {
      ByteBinding byteBinding0 = new ByteBinding();
      byte[] byteArray0 = new byte[3];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0);
      TupleInput tupleInput0 = TupleBase.entryToInput(databaseEntry0);
      Byte byte0 = (Byte)byteBinding0.entryToObject(tupleInput0);
      assertEquals((byte) (-128), (byte)byte0);
  }

  @Test
  public void test13()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0);
      ByteBinding.byteToEntry((byte)0, databaseEntry0);
      byte byte0 = ByteBinding.entryToByte(databaseEntry0);
      assertEquals((byte)0, byte0);
  }

  @Test
  public void test14()  throws Throwable  {
      ByteBinding byteBinding0 = new ByteBinding();
      Byte byte0 = new Byte((byte)59);
      TupleOutput tupleOutput0 = byteBinding0.getTupleOutput(byte0);
      Double double0 = new Double((double) (byte)59);
      byteBinding0.objectToEntry((Object) double0, tupleOutput0);
      assertEquals(1, tupleOutput0.getBufferLength());
  }
}
