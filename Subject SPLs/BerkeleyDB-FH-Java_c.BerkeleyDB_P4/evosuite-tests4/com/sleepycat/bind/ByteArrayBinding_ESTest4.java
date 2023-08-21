/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 13:00:49 KST 2017
 */

package com.sleepycat.bind;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.sleepycat.bind.ByteArrayBinding;
import com.sleepycat.je.DatabaseEntry;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class ByteArrayBinding_ESTest4 extends ByteArrayBinding_ESTest_scaffolding4 {




  @Test
  public void test3()  throws Throwable  {
      ByteArrayBinding byteArrayBinding0 = new ByteArrayBinding();
      byte[] byteArray0 = new byte[1];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0, (-1553), (-1553));
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
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0, 43, 43);
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
      byte[] byteArray0 = new byte[19];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0);
      Object object0 = byteArrayBinding0.entryToObject(databaseEntry0);
      byteArrayBinding0.objectToEntry(object0, databaseEntry0);
      assertEquals(0, databaseEntry0.getOffset());
      assertEquals(19, databaseEntry0.getSize());
  }
}