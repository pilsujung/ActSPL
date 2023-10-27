/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 08:52:07 KST 2017
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

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class ByteBinding_ESTest8 extends ByteBinding_ESTest_scaffolding8 {

  @Test
  public void test00()  throws Throwable  {
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      ByteBinding.byteToEntry((byte)55, databaseEntry0);
      byte byte0 = ByteBinding.entryToByte(databaseEntry0);
      assertEquals((byte)55, byte0);
  }

  @Test
  public void test01()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0);
      byte byte0 = ByteBinding.entryToByte(databaseEntry0);
      assertEquals((byte) (-128), byte0);
  }

  @Test
  public void test02()  throws Throwable  {
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      ByteBinding byteBinding0 = new ByteBinding();
      ByteBinding.byteToEntry((byte)55, databaseEntry0);
      TupleInput tupleInput0 = TupleBase.entryToInput(databaseEntry0);
      Byte byte0 = (Byte)byteBinding0.entryToObject(tupleInput0);
      assertEquals((byte)55, (byte)byte0);
  }

  @Test
  public void test03()  throws Throwable  {
      ByteBinding byteBinding0 = new ByteBinding();
      Float float0 = new Float(0.0);
      TupleOutput tupleOutput0 = new TupleOutput();
      byteBinding0.objectToEntry((Object) float0, tupleOutput0);
      assertEquals(0, tupleOutput0.getBufferOffset());
  }

  @Test
  public void test04()  throws Throwable  {
      ByteBinding byteBinding0 = new ByteBinding();
      Object object0 = new Object();
      TupleOutput tupleOutput0 = byteBinding0.getTupleOutput(object0);
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
  public void test06()  throws Throwable  {
      ByteBinding byteBinding0 = new ByteBinding();
      byte[] byteArray0 = new byte[8];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0, (int) (byte) (-94), 5231);
      TupleInput tupleInput0 = TupleBase.entryToInput(databaseEntry0);
      // Undeclared exception!
      try { 
        byteBinding0.entryToObject(tupleInput0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -94
         //
         assertThrownBy("com.sleepycat.util.FastInputStream", e);
      }
  }


  @Test
  public void test08()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0, (-94), 853);
      // Undeclared exception!
      try { 
        ByteBinding.entryToByte(databaseEntry0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -94
         //
         assertThrownBy("com.sleepycat.util.FastInputStream", e);
      }
  }



  @Test
  public void test11()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0);
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
  public void test13()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0);
      ByteBinding.byteToEntry((byte)0, databaseEntry0);
      byte byte0 = ByteBinding.entryToByte(databaseEntry0);
      assertEquals((byte)0, byte0);
  }
}