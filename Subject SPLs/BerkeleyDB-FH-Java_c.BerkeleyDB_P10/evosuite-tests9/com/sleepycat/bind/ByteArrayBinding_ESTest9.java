/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 08:49:33 KST 2017
 */

package com.sleepycat.bind;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.sleepycat.je.DatabaseEntry;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class ByteArrayBinding_ESTest9 extends ByteArrayBinding_ESTest_scaffolding9 {

  @Test
  public void test0()  throws Throwable  {
      ByteArrayBinding byteArrayBinding0 = new ByteArrayBinding();
      // Undeclared exception!
      try { 
        byteArrayBinding0.objectToEntry((Object) null, (DatabaseEntry) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.bind.ByteArrayBinding", e);
      }
  }

  @Test
  public void test1()  throws Throwable  {
      ByteArrayBinding byteArrayBinding0 = new ByteArrayBinding();
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      // Undeclared exception!
      try { 
        byteArrayBinding0.objectToEntry("m", databaseEntry0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.String cannot be cast to [B
         //
         assertThrownBy("com.sleepycat.bind.ByteArrayBinding", e);
      }
  }


  @Test
  public void test3()  throws Throwable  {
      ByteArrayBinding byteArrayBinding0 = new ByteArrayBinding();
      byte[] byteArray0 = new byte[3];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0, (int) (byte)1, (int) (byte) (-59));
      // Undeclared exception!
      try { 
        byteArrayBinding0.entryToObject(databaseEntry0);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.bind.ByteArrayBinding", e);
      }
  }

  @Test
  public void test4()  throws Throwable  {
      ByteArrayBinding byteArrayBinding0 = new ByteArrayBinding();
      byte[] byteArray0 = new byte[0];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0);
      databaseEntry0.setSize(1);
      // Undeclared exception!
      try { 
        byteArrayBinding0.entryToObject(databaseEntry0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.lang.System", e);
      }
  }


  @Test
  public void test6()  throws Throwable  {
      ByteArrayBinding byteArrayBinding0 = new ByteArrayBinding();
      byte[] byteArray0 = new byte[4];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0);
      Object object0 = byteArrayBinding0.entryToObject(databaseEntry0);
      byteArrayBinding0.objectToEntry(object0, databaseEntry0);
      assertEquals(4, databaseEntry0.getSize());
      assertEquals(0, databaseEntry0.getOffset());
  }
}
