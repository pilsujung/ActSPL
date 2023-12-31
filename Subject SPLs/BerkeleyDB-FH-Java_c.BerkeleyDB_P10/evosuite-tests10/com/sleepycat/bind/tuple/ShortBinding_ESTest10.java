/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 21 23:05:09 KST 2017
 */

package com.sleepycat.bind.tuple;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.sleepycat.bind.tuple.ShortBinding;
import com.sleepycat.bind.tuple.TupleBase;
import com.sleepycat.bind.tuple.TupleInput;
import com.sleepycat.bind.tuple.TupleOutput;
import com.sleepycat.je.DatabaseEntry;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class ShortBinding_ESTest10 extends ShortBinding_ESTest_scaffolding10 {



  @Test
  public void test02()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0);
      ShortBinding shortBinding0 = new ShortBinding();
      TupleInput tupleInput0 = TupleBase.entryToInput(databaseEntry0);
      Short short0 = (Short)shortBinding0.entryToObject(tupleInput0);
      assertEquals((short) (-32768), (short)short0);
  }

  @Test
  public void test03()  throws Throwable  {
      // Undeclared exception!
      try { 
        ShortBinding.shortToEntry((short)0, (DatabaseEntry) null);
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
      ShortBinding shortBinding0 = new ShortBinding();
      Double double0 = new Double((-2537.0));
      // Undeclared exception!
      try { 
        shortBinding0.objectToEntry((Object) double0, (TupleOutput) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.bind.tuple.ShortBinding", e);
      }
  }

  @Test
  public void test05()  throws Throwable  {
      ShortBinding shortBinding0 = new ShortBinding();
      TupleOutput tupleOutput0 = new TupleOutput();
      // Undeclared exception!
      try { 
        shortBinding0.objectToEntry((Object) shortBinding0, tupleOutput0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // com.sleepycat.bind.tuple.ShortBinding cannot be cast to java.lang.Number
         //
         assertThrownBy("com.sleepycat.bind.tuple.ShortBinding", e);
      }
  }

  @Test
  public void test06()  throws Throwable  {
      ShortBinding shortBinding0 = new ShortBinding();
      Integer integer0 = new Integer((-14));
      TupleOutput tupleOutput0 = shortBinding0.getTupleOutput(integer0);
      Float float0 = new Float((double) (-14));
      tupleOutput0.addSize(6);
      // Undeclared exception!
      try { 
        shortBinding0.objectToEntry((Object) float0, tupleOutput0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.lang.System", e);
      }
  }


  @Test
  public void test08()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0, (-3180), (int) (byte)1);
      // Undeclared exception!
      try { 
        ShortBinding.entryToShort(databaseEntry0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -3180
         //
         assertThrownBy("com.sleepycat.util.FastInputStream", e);
      }
  }


  @Test
  public void test10()  throws Throwable  {
      ShortBinding shortBinding0 = new ShortBinding();
      byte[] byteArray0 = new byte[1];
      TupleInput tupleInput0 = new TupleInput(byteArray0, (int) (byte)21, 40);
      // Undeclared exception!
      try { 
        shortBinding0.entryToObject(tupleInput0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 21
         //
         assertThrownBy("com.sleepycat.util.FastInputStream", e);
      }
  }

  @Test
  public void test11()  throws Throwable  {
      ShortBinding shortBinding0 = new ShortBinding();
      Integer integer0 = new Integer((-14));
      TupleOutput tupleOutput0 = shortBinding0.getTupleOutput(integer0);
      Float float0 = new Float((double) (-14));
      shortBinding0.objectToEntry((Object) float0, tupleOutput0);
      assertEquals(0, shortBinding0.getTupleBufferSize());
  }

  @Test
  public void test12()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      ShortBinding shortBinding0 = new ShortBinding();
      TupleInput tupleInput0 = new TupleInput(byteArray0, 56, 0);
      // Undeclared exception!
      try { 
        shortBinding0.entryToObject(tupleInput0);
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
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0, 255, (-1672));
      // Undeclared exception!
      try { 
        ShortBinding.entryToShort(databaseEntry0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.bind.tuple.TupleInput", e);
      }
  }

  @Test
  public void test14()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0, 255, (-1672));
      ShortBinding.shortToEntry((short)56, databaseEntry0);
      short short0 = ShortBinding.entryToShort(databaseEntry0);
      assertEquals((short)56, short0);
  }
}
