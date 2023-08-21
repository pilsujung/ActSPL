/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 04:07:30 KST 2017
 */

package com.sleepycat.je;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class DatabaseConfig_ESTest3 extends DatabaseConfig_ESTest_scaffolding3 {

  @Test
  public void test00()  throws Throwable  {
      DatabaseConfig databaseConfig0 = new DatabaseConfig();
      boolean boolean0 = databaseConfig0.getReadOnly();
      assertFalse(databaseConfig0.getAllowCreate());
      assertFalse(databaseConfig0.getExclusiveCreate());
      assertFalse(databaseConfig0.getSortedDuplicates());
      assertFalse(boolean0);
      assertFalse(databaseConfig0.getTransactional());
  }

  @Test
  public void test01()  throws Throwable  {
      DatabaseConfig databaseConfig0 = new DatabaseConfig();
      databaseConfig0.setOverrideBtreeComparator(true);
      boolean boolean0 = databaseConfig0.getOverrideBtreeComparator();
      assertTrue(boolean0);
  }

  @Test
  public void test02()  throws Throwable  {
      DatabaseConfig databaseConfig0 = new DatabaseConfig();
      int int0 = databaseConfig0.getNodeMaxEntries();
      assertFalse(databaseConfig0.getReadOnly());
      assertEquals(0, int0);
      assertFalse(databaseConfig0.getExclusiveCreate());
      assertFalse(databaseConfig0.getTransactional());
      assertFalse(databaseConfig0.getAllowCreate());
      assertFalse(databaseConfig0.getSortedDuplicates());
  }

  @Test
  public void test03()  throws Throwable  {
      DatabaseConfig databaseConfig0 = new DatabaseConfig();
      databaseConfig0.setNodeMaxEntries((-1438));
      int int0 = databaseConfig0.getNodeMaxEntries();
      assertEquals((-1438), int0);
  }

  @Test
  public void test04()  throws Throwable  {
      DatabaseConfig databaseConfig0 = new DatabaseConfig();
      int int0 = databaseConfig0.getNodeMaxDupTreeEntries();
      assertEquals(0, int0);
      assertFalse(databaseConfig0.getAllowCreate());
      assertFalse(databaseConfig0.getSortedDuplicates());
      assertFalse(databaseConfig0.getTransactional());
      assertFalse(databaseConfig0.getReadOnly());
      assertFalse(databaseConfig0.getExclusiveCreate());
  }

  @Test
  public void test05()  throws Throwable  {
      DatabaseConfig databaseConfig0 = new DatabaseConfig();
      boolean boolean0 = databaseConfig0.getAllowCreate();
      assertFalse(databaseConfig0.getTransactional());
      assertFalse(boolean0);
      assertFalse(databaseConfig0.getSortedDuplicates());
      assertFalse(databaseConfig0.getExclusiveCreate());
      assertFalse(databaseConfig0.getReadOnly());
  }

  @Test
  public void test06()  throws Throwable  {
      DatabaseConfig databaseConfig0 = new DatabaseConfig();
      Class<Integer> class0 = Integer.class;
      // Undeclared exception!
      try { 
        databaseConfig0.setDuplicateComparator(class0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Duplicate comparator is not valid: Exception while trying to load Duplicate Comparator class: java.lang.InstantiationException: java.lang.Integer
         // Perhaps you have not implemented a zero-parameter constructor for the comparator or the comparator class cannot be found.
         //
         assertThrownBy("com.sleepycat.je.DatabaseConfig", e);
      }
  }

  @Test
  public void test07()  throws Throwable  {
      DatabaseConfig databaseConfig0 = DatabaseConfig.DEFAULT;
      Class<Object> class0 = Object.class;
      // Undeclared exception!
      try { 
        databaseConfig0.setDuplicateComparator(class0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Object cannot be cast to java.util.Comparator
         //
         assertThrownBy("com.sleepycat.je.dbi.DatabaseImpl", e);
      }
  }


  @Test
  public void test09()  throws Throwable  {
      DatabaseConfig databaseConfig0 = new DatabaseConfig();
      String string0 = databaseConfig0.genDatabaseConfigMismatchMessage(databaseConfig0, false, false, false, false, false);
      assertFalse(databaseConfig0.getExclusiveCreate());
      assertEquals("The following DatabaseConfig parameters for the\ncached Database do not match the parameters for the\nrequested Database:\n Transactional\n Read-Only\n Sorted Duplicates\n Btree Comparator\n Duplicate Comparator\n", string0);
      assertFalse(databaseConfig0.getSortedDuplicates());
      assertFalse(databaseConfig0.getTransactional());
      assertFalse(databaseConfig0.getReadOnly());
      assertFalse(databaseConfig0.getAllowCreate());
  }

  @Test
  public void test10()  throws Throwable  {
      DatabaseConfig databaseConfig0 = DatabaseConfig.DEFAULT;
      boolean boolean0 = databaseConfig0.getTransactional();
      assertFalse(boolean0);
  }

  @Test
  public void test12()  throws Throwable  {
      DatabaseConfig databaseConfig0 = DatabaseConfig.DEFAULT;
      boolean boolean0 = databaseConfig0.getReadOnly();
      assertTrue(boolean0);
  }

  @Test
  public void test13()  throws Throwable  {
      DatabaseConfig databaseConfig0 = DatabaseConfig.DEFAULT;
      boolean boolean0 = databaseConfig0.getOverrideDuplicateComparator();
      //  // Unstable assertion: assertFalse(boolean0);
  }

  @Test
  public void test14()  throws Throwable  {
      DatabaseConfig databaseConfig0 = DatabaseConfig.DEFAULT;
      Class<String> class0 = String.class;
      // Undeclared exception!
      try { 
        databaseConfig0.setBtreeComparator(class0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.String cannot be cast to java.util.Comparator
         //
         assertThrownBy("com.sleepycat.je.dbi.DatabaseImpl", e);
      }
  }

  @Test
  public void test15()  throws Throwable  {
      DatabaseConfig databaseConfig0 = new DatabaseConfig();
      String string0 = databaseConfig0.genDatabaseConfigMismatchMessage(databaseConfig0, true, true, true, true, false);
      assertFalse(databaseConfig0.getTransactional());
      assertFalse(databaseConfig0.getSortedDuplicates());
      assertFalse(databaseConfig0.getAllowCreate());
      assertEquals("The following DatabaseConfig parameters for the\ncached Database do not match the parameters for the\nrequested Database:\n Duplicate Comparator\n", string0);
      assertFalse(databaseConfig0.getReadOnly());
      assertFalse(databaseConfig0.getExclusiveCreate());
  }

  @Test
  public void test16()  throws Throwable  {
      DatabaseConfig databaseConfig0 = new DatabaseConfig();
      databaseConfig0.setSortedDuplicates(true);
      DatabaseConfig databaseConfig1 = new DatabaseConfig();
      try { 
        databaseConfig0.validate(databaseConfig1);
        fail("Expecting exception: DatabaseException");
      
      } catch(DatabaseException e) {
         //
         // The following DatabaseConfig parameters for the
         // cached Database do not match the parameters for the
         // requested Database:
         //  Sorted Duplicates
         //
         assertThrownBy("com.sleepycat.je.DatabaseConfig", e);
      }
  }

  @Test
  public void test17()  throws Throwable  {
      DatabaseConfig databaseConfig0 = DatabaseConfig.DEFAULT;
      DatabaseConfig databaseConfig1 = new DatabaseConfig();
      try { 
        databaseConfig0.validate(databaseConfig1);
        fail("Expecting exception: DatabaseException");
      
      } catch(DatabaseException e) {
         //
         // The following DatabaseConfig parameters for the
         // cached Database do not match the parameters for the
         // requested Database:
         //  Read-Only
         //
         assertThrownBy("com.sleepycat.je.DatabaseConfig", e);
      }
  }

  @Test
  public void test19()  throws Throwable  {
      DatabaseConfig databaseConfig0 = new DatabaseConfig();
      // Undeclared exception!
      try { 
        databaseConfig0.validate((DatabaseConfig) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.DatabaseConfig", e);
      }
  }

  @Test
  public void test20()  throws Throwable  {
      DatabaseConfig databaseConfig0 = DatabaseConfig.DEFAULT;
      boolean boolean0 = databaseConfig0.getUseExistingConfig();
      assertFalse(boolean0);
  }

  @Test
  public void test21()  throws Throwable  {
      DatabaseConfig databaseConfig0 = DatabaseConfig.DEFAULT;
      databaseConfig0.setExclusiveCreate(true);
      assertTrue(databaseConfig0.getExclusiveCreate());
  }

  @Test
  public void test22()  throws Throwable  {
      DatabaseConfig databaseConfig0 = new DatabaseConfig();
      databaseConfig0.setDuplicateComparator((Class) null);
      assertFalse(databaseConfig0.getAllowCreate());
      assertFalse(databaseConfig0.getExclusiveCreate());
      assertFalse(databaseConfig0.getReadOnly());
      assertFalse(databaseConfig0.getTransactional());
      assertFalse(databaseConfig0.getSortedDuplicates());
  }

  @Test
  public void test23()  throws Throwable  {
      DatabaseConfig databaseConfig0 = DatabaseConfig.DEFAULT;
      databaseConfig0.setReadOnly(true);
      assertTrue(databaseConfig0.getReadOnly());
  }

  @Test
  public void test25()  throws Throwable  {
      DatabaseConfig databaseConfig0 = DatabaseConfig.DEFAULT;
      DatabaseConfig databaseConfig1 = databaseConfig0.cloneConfig();
      // Undeclared exception!
      try { 
        databaseConfig1.validate(databaseConfig0);
       //  fail("Expecting exception: NullPointerException");
       // Unstable assertion
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.DatabaseConfig", e);
      }
      
      //  // Unstable assertion: assertFalse(databaseConfig0.getExclusiveCreate());
  }

  @Test
  public void test27()  throws Throwable  {
      DatabaseConfig databaseConfig0 = new DatabaseConfig();
      databaseConfig0.setBtreeComparator((Class) null);
      assertFalse(databaseConfig0.getAllowCreate());
      assertFalse(databaseConfig0.getSortedDuplicates());
      assertFalse(databaseConfig0.getTransactional());
      assertFalse(databaseConfig0.getReadOnly());
      assertFalse(databaseConfig0.getExclusiveCreate());
  }


  @Test
  public void test29()  throws Throwable  {
      DatabaseConfig databaseConfig0 = DatabaseConfig.DEFAULT;
      databaseConfig0.setOverrideDuplicateComparator(true);
      assertTrue(databaseConfig0.getOverrideDuplicateComparator());
  }

  @Test
  public void test30()  throws Throwable  {
      DatabaseConfig databaseConfig0 = new DatabaseConfig();
      databaseConfig0.getDuplicateComparator();
      assertFalse(databaseConfig0.getExclusiveCreate());
      assertFalse(databaseConfig0.getReadOnly());
      assertFalse(databaseConfig0.getAllowCreate());
      assertFalse(databaseConfig0.getTransactional());
      assertFalse(databaseConfig0.getSortedDuplicates());
  }

  @Test
  public void test31()  throws Throwable  {
      DatabaseConfig databaseConfig0 = new DatabaseConfig();
      databaseConfig0.getOverrideBtreeComparator();
      assertFalse(databaseConfig0.getAllowCreate());
      assertFalse(databaseConfig0.getTransactional());
      assertFalse(databaseConfig0.getSortedDuplicates());
      assertFalse(databaseConfig0.getReadOnly());
      assertFalse(databaseConfig0.getExclusiveCreate());
  }

  @Test
  public void test32()  throws Throwable  {
      DatabaseConfig databaseConfig0 = new DatabaseConfig();
      assertFalse(databaseConfig0.getTransactional());
      
      databaseConfig0.setTransactional(true);
      assertTrue(databaseConfig0.getTransactional());
  }

  @Test
  public void test33()  throws Throwable  {
      DatabaseConfig databaseConfig0 = new DatabaseConfig();
      databaseConfig0.setUseExistingConfig(true);
      assertFalse(databaseConfig0.getExclusiveCreate());
      assertFalse(databaseConfig0.getReadOnly());
      assertFalse(databaseConfig0.getSortedDuplicates());
      assertFalse(databaseConfig0.getTransactional());
      assertFalse(databaseConfig0.getAllowCreate());
  }

  @Test
  public void test34()  throws Throwable  {
      DatabaseConfig databaseConfig0 = new DatabaseConfig();
      databaseConfig0.getBtreeComparator();
      assertFalse(databaseConfig0.getSortedDuplicates());
      assertFalse(databaseConfig0.getTransactional());
      assertFalse(databaseConfig0.getAllowCreate());
      assertFalse(databaseConfig0.getExclusiveCreate());
      assertFalse(databaseConfig0.getReadOnly());
  }


  @Test
  public void test36()  throws Throwable  {
      DatabaseConfig databaseConfig0 = new DatabaseConfig();
      assertFalse(databaseConfig0.getOverrideDuplicateComparator());
      assertFalse(databaseConfig0.getOverrideBtreeComparator());
      
      databaseConfig0.validate(databaseConfig0);
      assertFalse(databaseConfig0.getReadOnly());
      assertFalse(databaseConfig0.getSortedDuplicates());
      assertFalse(databaseConfig0.getTransactional());
      assertFalse(databaseConfig0.getExclusiveCreate());
      assertFalse(databaseConfig0.getAllowCreate());
  }


  @Test
  public void test38()  throws Throwable  {
      DatabaseConfig databaseConfig0 = new DatabaseConfig();
      databaseConfig0.setNodeMaxDupTreeEntries(0);
      assertFalse(databaseConfig0.getOverrideDuplicateComparator());
      assertFalse(databaseConfig0.getTransactional());
      assertFalse(databaseConfig0.getSortedDuplicates());
      assertFalse(databaseConfig0.getReadOnly());
      assertFalse(databaseConfig0.getExclusiveCreate());
      assertFalse(databaseConfig0.getOverrideBtreeComparator());
      assertFalse(databaseConfig0.getAllowCreate());
      assertEquals(0, databaseConfig0.getNodeMaxDupTreeEntries());
  }
}
