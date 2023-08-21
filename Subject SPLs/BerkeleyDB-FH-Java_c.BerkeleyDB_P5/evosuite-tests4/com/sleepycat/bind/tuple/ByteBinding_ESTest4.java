/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 13:12:45 KST 2017
 */

package com.sleepycat.bind.tuple;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.sleepycat.je.DatabaseEntry;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class ByteBinding_ESTest4 extends ByteBinding_ESTest_scaffolding4 {

  @Test
  public void test00()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte) (-1);
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0);
      byte byte0 = ByteBinding.entryToByte(databaseEntry0);
      assertEquals((byte)127, byte0);
  }

  @Test
  public void test01()  throws Throwable  {
      ByteBinding byteBinding0 = new ByteBinding();
      TupleOutput tupleOutput0 = new TupleOutput();
      // Undeclared exception!
      try { 
        byteBinding0.objectToEntry((Object) null, tupleOutput0);
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
      TupleOutput tupleOutput0 = new TupleOutput();
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        byteBinding0.objectToEntry(object0, tupleOutput0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Object cannot be cast to java.lang.Number
         //
         assertThrownBy("com.sleepycat.bind.tuple.ByteBinding", e);
      }
  }



  @Test
  public void test05()  throws Throwable  {
      ByteBinding byteBinding0 = new ByteBinding();
      byte[] byteArray0 = new byte[5];
      TupleInput tupleInput0 = new TupleInput(byteArray0, (int) (byte) (-52), (int) (byte)71);
      // Undeclared exception!
      try { 
        byteBinding0.entryToObject(tupleInput0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -52
         //
         assertThrownBy("com.sleepycat.util.FastInputStream", e);
      }
  }



  @Test
  public void test08()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0, (-1229), (int) (byte)112);
      // Undeclared exception!
      try { 
        ByteBinding.entryToByte(databaseEntry0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1229
         //
         assertThrownBy("com.sleepycat.util.FastInputStream", e);
      }
  }

  @Test
  public void test09()  throws Throwable  {
      // Undeclared exception!
      try { 
        ByteBinding.byteToEntry((byte) (-36), (DatabaseEntry) null);
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
      byte[] byteArray0 = new byte[1];
      ByteBinding byteBinding0 = new ByteBinding();
      TupleOutput tupleOutput0 = new TupleOutput();
      byteBinding0.objectToEntry((Object) byteArray0[0], tupleOutput0);
      assertArrayEquals(new byte[] {(byte)0}, byteArray0);
  }


  @Test
  public void test12()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0);
      ByteBinding byteBinding0 = new ByteBinding();
      TupleInput tupleInput0 = TupleBase.entryToInput(databaseEntry0);
      Byte byte0 = (Byte)byteBinding0.entryToObject(tupleInput0);
      assertEquals((byte) (-128), (byte)byte0);
  }

  @Test
  public void test13()  throws Throwable  {
      ByteBinding byteBinding0 = new ByteBinding();
      Integer integer0 = new Integer(3612);
      TupleOutput tupleOutput0 = byteBinding0.getTupleOutput(integer0);
      assertEquals(0, tupleOutput0.getBufferOffset());
  }

  @Test
  public void test14()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0);
      ByteBinding.byteToEntry((byte)0, databaseEntry0);
      byte byte0 = ByteBinding.entryToByte(databaseEntry0);
      assertEquals((byte)0, byte0);
  }
}
