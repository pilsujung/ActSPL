/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 21 18:50:42 KST 2017
 */

package com.sleepycat.je;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.sleepycat.bind.tuple.TupleTupleMarshalledBinding;
import com.sleepycat.bind.tuple.TupleTupleMarshalledKeyCreator;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class SecondaryConfig_ESTest1 extends SecondaryConfig_ESTest_scaffolding1 {

  @Test
  public void test00()  throws Throwable  {
      SecondaryConfig secondaryConfig0 = SecondaryConfig.DEFAULT;
      String string0 = secondaryConfig0.genSecondaryConfigMismatchMessage(secondaryConfig0, false, true, false, true, true, true, true);
      assertEquals("The following SecondaryConfig parameters for the\ncached Database do not match the parameters for the\nrequested Database:\n SecondaryKeyCreator\n ForeignKeyDelete\n", string0);
  }

  @Test
  public void test01()  throws Throwable  {
      SecondaryConfig secondaryConfig0 = new SecondaryConfig();
      // Undeclared exception!
      try { 
        secondaryConfig0.setForeignKeyDeleteAction((ForeignKeyDeleteAction) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // foreignKeyDeleteAction cannot be null
         //
         assertThrownBy("com.sleepycat.je.DatabaseUtil", e);
      }
  }

  @Test
  public void test02()  throws Throwable  {
      SecondaryConfig secondaryConfig0 = SecondaryConfig.DEFAULT;
      secondaryConfig0.validate(SecondaryConfig.DEFAULT);
      assertEquals(0, secondaryConfig0.getNodeMaxDupTreeEntries());
  }

  @Test
  public void test03()  throws Throwable  {
      SecondaryConfig secondaryConfig0 = SecondaryConfig.DEFAULT;
      TupleTupleMarshalledKeyCreator tupleTupleMarshalledKeyCreator0 = (TupleTupleMarshalledKeyCreator)secondaryConfig0.getKeyCreator();
      assertNull(tupleTupleMarshalledKeyCreator0);
  }

  @Test
  public void test04()  throws Throwable  {
      SecondaryConfig secondaryConfig0 = new SecondaryConfig();
      ForeignKeyDeleteAction foreignKeyDeleteAction0 = secondaryConfig0.getForeignKeyDeleteAction();
      assertNotNull(foreignKeyDeleteAction0);
  }

  @Test
  public void test05()  throws Throwable  {
      SecondaryConfig secondaryConfig0 = SecondaryConfig.DEFAULT;
      SecondaryMultiKeyCreator secondaryMultiKeyCreator0 = secondaryConfig0.getMultiKeyCreator();
      assertNull(secondaryMultiKeyCreator0);
  }

  @Test
  public void test06()  throws Throwable  {
      SecondaryConfig secondaryConfig0 = SecondaryConfig.DEFAULT;
      Database database0 = secondaryConfig0.getForeignKeyDatabase();
      assertNull(database0);
  }

  @Test
  public void test07()  throws Throwable  {
      SecondaryConfig secondaryConfig0 = SecondaryConfig.DEFAULT;
      ForeignMultiKeyNullifier foreignMultiKeyNullifier0 = secondaryConfig0.getForeignMultiKeyNullifier();
      assertNull(foreignMultiKeyNullifier0);
  }

  @Test
  public void test08()  throws Throwable  {
      SecondaryConfig secondaryConfig0 = new SecondaryConfig();
      secondaryConfig0.getForeignKeyNullifier();
      secondaryConfig0.getImmutableSecondaryKey();
      ForeignKeyDeleteAction foreignKeyDeleteAction0 = ForeignKeyDeleteAction.ABORT;
      secondaryConfig0.setNodeMaxEntries(0);
      secondaryConfig0.validate(secondaryConfig0);
      SecondaryConfig secondaryConfig1 = SecondaryConfig.DEFAULT;
      ForeignKeyDeleteAction foreignKeyDeleteAction1 = ForeignKeyDeleteAction.CASCADE;
      secondaryConfig1.setForeignKeyDeleteAction(foreignKeyDeleteAction1);
      secondaryConfig1.setForeignKeyNullifier((ForeignKeyNullifier) null);
      SecondaryConfig.DEFAULT = secondaryConfig0;
      try { 
        SecondaryConfig.DEFAULT.validate(secondaryConfig1);
        fail("Expecting exception: DatabaseException");
      
      } catch(DatabaseException e) {
         //
         // The following SecondaryConfig parameters for the
         // cached Database do not match the parameters for the
         // requested Database:
         //  ForeignKeyDeleteAction
         //  ImmutableSecondaryKey
         //
         assertThrownBy("com.sleepycat.je.SecondaryConfig", e);
      }
  }

  @Test
  public void test09()  throws Throwable  {
      SecondaryConfig secondaryConfig0 = SecondaryConfig.DEFAULT;
      String string0 = SecondaryConfig.DEFAULT.genSecondaryConfigMismatchMessage(secondaryConfig0, false, false, false, false, false, true, true);
      assertEquals("The following SecondaryConfig parameters for the\ncached Database do not match the parameters for the\nrequested Database:\n SecondaryKeyCreator\n SecondaryMultiKeyCreator\n ForeignKeyDelete\n ForeignKeyDeleteAction\n ForeignKeyNullifier\n ForeignMultiKeyNullifier\n", string0);
  }

  @Test
  public void test10()  throws Throwable  {
      SecondaryConfig secondaryConfig0 = new SecondaryConfig();
      SecondaryConfig secondaryConfig1 = SecondaryConfig.DEFAULT;
      TupleTupleMarshalledKeyCreator tupleTupleMarshalledKeyCreator0 = new TupleTupleMarshalledKeyCreator((TupleTupleMarshalledBinding) null, "B(rR0XD(RxfTlw&6U*K");
      secondaryConfig0.setForeignKeyNullifier(tupleTupleMarshalledKeyCreator0);
      SecondaryConfig secondaryConfig2 = (SecondaryConfig)secondaryConfig1.cloneConfig();
      try { 
        secondaryConfig0.validate(secondaryConfig2);
        fail("Expecting exception: DatabaseException");
      
      } catch(DatabaseException e) {
         //
         // The following SecondaryConfig parameters for the
         // cached Database do not match the parameters for the
         // requested Database:
         //  ForeignKeyNullifier
         //  ForeignMultiKeyNullifier
         //
         assertThrownBy("com.sleepycat.je.SecondaryConfig", e);
      }
  }

  @Test
  public void test11()  throws Throwable  {
      SecondaryConfig secondaryConfig0 = new SecondaryConfig();
      DatabaseConfig databaseConfig0 = new DatabaseConfig();
      try { 
        secondaryConfig0.validate(databaseConfig0);
        fail("Expecting exception: DatabaseException");
      
      } catch(DatabaseException e) {
         //
         // The SecondaryConfig argument is null.
         //
         assertThrownBy("com.sleepycat.je.SecondaryConfig", e);
      }
  }

  @Test
  public void test12()  throws Throwable  {
      SecondaryConfig secondaryConfig0 = SecondaryConfig.DEFAULT;
      secondaryConfig0.setForeignKeyDatabase((Database) null);
      assertFalse(secondaryConfig0.getExclusiveCreate());
  }

  @Test
  public void test13()  throws Throwable  {
      SecondaryConfig secondaryConfig0 = SecondaryConfig.DEFAULT;
      secondaryConfig0.setAllowPopulate(false);
      assertFalse(secondaryConfig0.getAllowPopulate());
  }

  @Test
  public void test14()  throws Throwable  {
      SecondaryConfig secondaryConfig0 = SecondaryConfig.DEFAULT;
      secondaryConfig0.setForeignMultiKeyNullifier((ForeignMultiKeyNullifier) null);
      assertFalse(secondaryConfig0.getAllowCreate());
  }

  @Test
  public void test15()  throws Throwable  {
      SecondaryConfig secondaryConfig0 = SecondaryConfig.DEFAULT;
      secondaryConfig0.setImmutableSecondaryKey(true);
      assertTrue(secondaryConfig0.getImmutableSecondaryKey());
  }

  @Test
  public void test16()  throws Throwable  {
      SecondaryConfig secondaryConfig0 = SecondaryConfig.DEFAULT;
      secondaryConfig0.setMultiKeyCreator((SecondaryMultiKeyCreator) null);
      assertFalse(secondaryConfig0.getExclusiveCreate());
  }

  @Test
  public void test17()  throws Throwable  {
      SecondaryConfig secondaryConfig0 = SecondaryConfig.DEFAULT;
      boolean boolean0 = secondaryConfig0.getAllowPopulate();
      assertFalse(boolean0);
  }

  @Test
  public void test18()  throws Throwable  {
      SecondaryConfig secondaryConfig0 = SecondaryConfig.DEFAULT;
      secondaryConfig0.setKeyCreator((SecondaryKeyCreator) null);
      assertFalse(secondaryConfig0.getAllowCreate());
  }
}
