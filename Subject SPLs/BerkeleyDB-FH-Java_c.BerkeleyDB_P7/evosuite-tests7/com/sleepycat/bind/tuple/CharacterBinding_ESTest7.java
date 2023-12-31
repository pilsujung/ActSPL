/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 21 18:44:11 KST 2017
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

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class CharacterBinding_ESTest7 extends CharacterBinding_ESTest_scaffolding7 {

  @Test
  public void test00()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0);
      char char0 = CharacterBinding.entryToChar(databaseEntry0);
      assertEquals('\u0000', char0);
  }

  @Test
  public void test01()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte) (-83);
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0, 0, (int) (byte)31);
      char char0 = CharacterBinding.entryToChar(databaseEntry0);
      assertEquals('\uAD00', char0);
  }

  @Test
  public void test02()  throws Throwable  {
      CharacterBinding characterBinding0 = new CharacterBinding();
      TupleOutput tupleOutput0 = new TupleOutput();
      tupleOutput0.writeDouble(1.0);
      TupleInput tupleInput0 = new TupleInput(tupleOutput0);
      Character character0 = (Character)characterBinding0.entryToObject(tupleInput0);
      assertEquals('\u3FF0', (char)character0);
  }

  @Test
  public void test03()  throws Throwable  {
      CharacterBinding characterBinding0 = new CharacterBinding();
      TupleOutput tupleOutput0 = new TupleOutput();
      // Undeclared exception!
      try { 
        characterBinding0.objectToEntry((Object) null, tupleOutput0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.bind.tuple.CharacterBinding", e);
      }
  }

  @Test
  public void test04()  throws Throwable  {
      CharacterBinding characterBinding0 = new CharacterBinding();
      Object object0 = new Object();
      TupleOutput tupleOutput0 = characterBinding0.getTupleOutput(characterBinding0);
      // Undeclared exception!
      try { 
        characterBinding0.objectToEntry(object0, tupleOutput0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Object cannot be cast to java.lang.Character
         //
         assertThrownBy("com.sleepycat.bind.tuple.CharacterBinding", e);
      }
  }

  @Test
  public void test05()  throws Throwable  {
      CharacterBinding characterBinding0 = new CharacterBinding();
      // Undeclared exception!
      try { 
        characterBinding0.entryToObject((TupleInput) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.bind.tuple.CharacterBinding", e);
      }
  }

  @Test
  public void test06()  throws Throwable  {
      CharacterBinding characterBinding0 = new CharacterBinding();
      byte[] byteArray0 = new byte[4];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0, (int) (byte) (-82), 0);
      TupleInput tupleInput0 = TupleBase.entryToInput(databaseEntry0);
      // Undeclared exception!
      try { 
        characterBinding0.entryToObject(tupleInput0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -82
         //
         assertThrownBy("com.sleepycat.util.FastInputStream", e);
      }
  }

  @Test
  public void test07()  throws Throwable  {
      // Undeclared exception!
      try { 
        CharacterBinding.entryToChar((DatabaseEntry) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.bind.tuple.TupleBase", e);
      }
  }

  @Test
  public void test08()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0, (-3908), 1151);
      // Undeclared exception!
      try { 
        CharacterBinding.entryToChar(databaseEntry0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -3908
         //
         assertThrownBy("com.sleepycat.util.FastInputStream", e);
      }
  }

  @Test
  public void test09()  throws Throwable  {
      // Undeclared exception!
      try { 
        CharacterBinding.charToEntry('5', (DatabaseEntry) null);
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
      CharacterBinding characterBinding0 = new CharacterBinding();
      TupleOutput tupleOutput0 = new TupleOutput();
      TupleInput tupleInput0 = new TupleInput(tupleOutput0);
      // Undeclared exception!
      try { 
        characterBinding0.entryToObject(tupleInput0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.bind.tuple.TupleInput", e);
      }
  }

  @Test
  public void test11()  throws Throwable  {
      CharacterBinding characterBinding0 = new CharacterBinding();
      Character character0 = Character.valueOf('l');
      byte[] byteArray0 = new byte[2];
      TupleOutput tupleOutput0 = new TupleOutput(byteArray0);
      characterBinding0.objectToEntry((Object) character0, tupleOutput0);
      assertEquals(0, characterBinding0.getTupleBufferSize());
  }

  @Test
  public void test12()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0, (int) (byte)0, (-653));
      CharacterBinding.charToEntry('6', databaseEntry0);
      char char0 = CharacterBinding.entryToChar(databaseEntry0);
      assertEquals('6', char0);
  }

  @Test
  public void test13()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      DatabaseEntry databaseEntry0 = new DatabaseEntry(byteArray0, (int) (byte)0, (-653));
      // Undeclared exception!
      try { 
        CharacterBinding.entryToChar(databaseEntry0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.bind.tuple.TupleInput", e);
      }
  }
}
