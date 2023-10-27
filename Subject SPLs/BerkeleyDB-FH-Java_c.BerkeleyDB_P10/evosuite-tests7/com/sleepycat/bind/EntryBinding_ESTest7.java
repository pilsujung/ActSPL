/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 21 18:30:46 KST 2017
 */

package com.sleepycat.bind;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.fail;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.sleepycat.je.DatabaseEntry;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class EntryBinding_ESTest7 extends EntryBinding_ESTest_scaffolding7 {

  @Test
  public void test0()  throws Throwable  {
      ByteArrayBinding byteArrayBinding0 = new ByteArrayBinding();
      DatabaseEntry databaseEntry0 = new DatabaseEntry();
      Object object0 = byteArrayBinding0.entryToObject(databaseEntry0);
      byteArrayBinding0.objectToEntry(object0, databaseEntry0);
      assertEquals(0, databaseEntry0.getPartialLength());
  }

  @Test
  public void test1()  throws Throwable  {
      ByteArrayBinding byteArrayBinding0 = new ByteArrayBinding();
      byte[] byteArray0 = new byte[2];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0);
      Object object0 = byteArrayBinding0.entryToObject(databaseEntry0);
      assertNotSame(byteArray0, object0);
  }

  @Test
  public void test2()  throws Throwable  {
      ByteArrayBinding byteArrayBinding0 = new ByteArrayBinding();
      byte[] byteArray0 = new byte[2];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0, (int) (byte) (-20), 0);
      // Undeclared exception!
      try { 
        byteArrayBinding0.objectToEntry((Object) null, databaseEntry0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.bind.ByteArrayBinding", e);
      }
  }

  @Test
  public void test3()  throws Throwable  {
      ByteArrayBinding byteArrayBinding0 = new ByteArrayBinding();
      byte[] byteArray0 = new byte[4];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0, 2355, 0);
      // Undeclared exception!
      try { 
        byteArrayBinding0.objectToEntry(byteArrayBinding0, databaseEntry0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // com.sleepycat.bind.ByteArrayBinding cannot be cast to [B
         //
         assertThrownBy("com.sleepycat.bind.ByteArrayBinding", e);
      }
  }

  @Test
  public void test4()  throws Throwable  {
      RecordNumberBinding recordNumberBinding0 = new RecordNumberBinding();
      byte[] byteArray0 = new byte[2];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0, (int) (byte)28, (-2275));
      // Undeclared exception!
      try { 
        recordNumberBinding0.entryToObject(databaseEntry0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.compat.DbCompat", e);
      }
  }

  @Test
  public void test5()  throws Throwable  {
      ByteArrayBinding byteArrayBinding0 = new ByteArrayBinding();
      // Undeclared exception!
      try { 
        byteArrayBinding0.entryToObject((DatabaseEntry) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.bind.ByteArrayBinding", e);
      }
  }
}