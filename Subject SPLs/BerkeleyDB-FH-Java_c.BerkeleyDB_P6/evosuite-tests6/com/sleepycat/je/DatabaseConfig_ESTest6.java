/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 21 23:11:20 KST 2017
 */

package com.sleepycat.je;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.Comparator;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class DatabaseConfig_ESTest6 extends DatabaseConfig_ESTest_scaffolding6 {

  @Test
  public void test00()  throws Throwable  {
      DatabaseConfig databaseConfig0 = new DatabaseConfig();
      databaseConfig0.setNodeMaxEntries(1);
      int int0 = databaseConfig0.getNodeMaxEntries();
      assertEquals(1, int0);
  }

  @Test
  public void test01()  throws Throwable  {
      DatabaseConfig databaseConfig0 = new DatabaseConfig();
      databaseConfig0.setNodeMaxDupTreeEntries((-984));
      int int0 = databaseConfig0.getNodeMaxDupTreeEntries();
      assertEquals((-984), int0);
  }

  @Test
  public void test02()  throws Throwable  {
      DatabaseConfig databaseConfig0 = new DatabaseConfig();
      assertFalse(databaseConfig0.getAllowCreate());
      
      databaseConfig0.setAllowCreate(true);
      boolean boolean0 = databaseConfig0.getAllowCreate();
      assertTrue(boolean0);
  }

  @Test
  public void test03()  throws Throwable  {
      DatabaseConfig databaseConfig0 = new DatabaseConfig();
      String string0 = databaseConfig0.genDatabaseConfigMismatchMessage(databaseConfig0, false, false, false, true, false);
      assertEquals("The following DatabaseConfig parameters for the\ncached Database do not match the parameters for the\nrequested Database:\n Transactional\n Read-Only\n Sorted Duplicates\n Duplicate Comparator\n", string0);
      assertFalse(databaseConfig0.getExclusiveCreate());
      assertFalse(databaseConfig0.getAllowCreate());
  }

  @Test
  public void test04()  throws Throwable  {
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
  public void test05()  throws Throwable  {
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
  public void test06()  throws Throwable  {
      DatabaseConfig databaseConfig0 = new DatabaseConfig();
      Class<Integer> class0 = Integer.class;
      // Undeclared exception!
      try { 
        databaseConfig0.setBtreeComparator(class0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Btree comparator is not valid: Exception while trying to load Btree Comparator class: java.lang.InstantiationException: java.lang.Integer
         // Perhaps you have not implemented a zero-parameter constructor for the comparator or the comparator class cannot be found.
         //
         assertThrownBy("com.sleepycat.je.DatabaseConfig", e);
      }
  }

  @Test
  public void test08()  throws Throwable  {
      DatabaseConfig databaseConfig0 = new DatabaseConfig();
      databaseConfig0.getSortedDuplicates();
      assertFalse(databaseConfig0.getExclusiveCreate());
      assertFalse(databaseConfig0.getAllowCreate());
  }

  @Test
  public void test09()  throws Throwable  {
      DatabaseConfig databaseConfig0 = new DatabaseConfig();
      databaseConfig0.getReadOnly();
      assertFalse(databaseConfig0.getExclusiveCreate());
      assertFalse(databaseConfig0.getAllowCreate());
  }

  @Test
  public void test10()  throws Throwable  {
      DatabaseConfig databaseConfig0 = DatabaseConfig.DEFAULT;
      databaseConfig0.getOverrideDuplicateComparator();
      databaseConfig0.getOverrideBtreeComparator();
      Class<Object> class0 = Object.class;
      // Undeclared exception!
      try { 
        databaseConfig0.setBtreeComparator(class0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Object cannot be cast to java.util.Comparator
         //
         assertThrownBy("com.sleepycat.je.dbi.DatabaseImpl", e);
      }
  }

  @Test
  public void test11()  throws Throwable  {
      DatabaseConfig databaseConfig0 = new DatabaseConfig();
      String string0 = databaseConfig0.genDatabaseConfigMismatchMessage(databaseConfig0, false, false, false, false, false);
      assertEquals("The following DatabaseConfig parameters for the\ncached Database do not match the parameters for the\nrequested Database:\n Transactional\n Read-Only\n Sorted Duplicates\n Btree Comparator\n Duplicate Comparator\n", string0);
      assertFalse(databaseConfig0.getAllowCreate());
      assertFalse(databaseConfig0.getExclusiveCreate());
  }

  @Test
  public void test12()  throws Throwable  {
      DatabaseConfig databaseConfig0 = new DatabaseConfig();
      DatabaseConfig databaseConfig1 = new DatabaseConfig();
      databaseConfig1.setSortedDuplicates(true);
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
  public void test13()  throws Throwable  {
      DatabaseConfig databaseConfig0 = new DatabaseConfig();
      databaseConfig0.setReadOnly(true);
      DatabaseConfig databaseConfig1 = databaseConfig0.cloneConfig();
      databaseConfig0.setReadOnly(false);
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
  public void test15()  throws Throwable  {
      DatabaseConfig databaseConfig0 = new DatabaseConfig();
      databaseConfig0.validate(databaseConfig0);
      assertFalse(databaseConfig0.getAllowCreate());
      assertFalse(databaseConfig0.getExclusiveCreate());
  }

  @Test
  public void test18()  throws Throwable  {
      DatabaseConfig databaseConfig0 = new DatabaseConfig();
      databaseConfig0.setExclusiveCreate(false);
      assertFalse(databaseConfig0.getOverrideDuplicateComparator());
      assertFalse(databaseConfig0.getSortedDuplicates());
      assertFalse(databaseConfig0.getTransactional());
      assertFalse(databaseConfig0.getOverrideBtreeComparator());
      assertFalse(databaseConfig0.getAllowCreate());
      assertFalse(databaseConfig0.getExclusiveCreate());
      assertFalse(databaseConfig0.getReadOnly());
  }

  @Test
  public void test19()  throws Throwable  {
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
  public void test22()  throws Throwable  {
      DatabaseConfig databaseConfig0 = DatabaseConfig.DEFAULT;
      databaseConfig0.setOverrideBtreeComparator(false);
      assertFalse(databaseConfig0.getOverrideBtreeComparator());
  }

  @Test
  public void test23()  throws Throwable  {
      DatabaseConfig databaseConfig0 = new DatabaseConfig();
      int int0 = databaseConfig0.getNodeMaxEntries();
      assertEquals(0, int0);
      assertFalse(databaseConfig0.getOverrideDuplicateComparator());
      assertFalse(databaseConfig0.getExclusiveCreate());
      assertFalse(databaseConfig0.getReadOnly());
      assertFalse(databaseConfig0.getSortedDuplicates());
      assertFalse(databaseConfig0.getTransactional());
      assertFalse(databaseConfig0.getAllowCreate());
      assertFalse(databaseConfig0.getOverrideBtreeComparator());
  }

  @Test
  public void test24()  throws Throwable  {
      DatabaseConfig databaseConfig0 = DatabaseConfig.DEFAULT;
      Comparator comparator0 = databaseConfig0.getDuplicateComparator();
      assertNull(comparator0);
  }

  @Test
  public void test25()  throws Throwable  {
      DatabaseConfig databaseConfig0 = new DatabaseConfig();
      assertFalse(databaseConfig0.getTransactional());
      
      databaseConfig0.setTransactional(true);
      assertTrue(databaseConfig0.getTransactional());
  }

  @Test
  public void test26()  throws Throwable  {
      DatabaseConfig databaseConfig0 = new DatabaseConfig();
      databaseConfig0.setUseExistingConfig(false);
      assertFalse(databaseConfig0.getAllowCreate());
      assertFalse(databaseConfig0.getReadOnly());
      assertFalse(databaseConfig0.getOverrideDuplicateComparator());
      assertFalse(databaseConfig0.getTransactional());
      assertFalse(databaseConfig0.getSortedDuplicates());
      assertFalse(databaseConfig0.getExclusiveCreate());
      assertFalse(databaseConfig0.getOverrideBtreeComparator());
  }

  @Test
  public void test27()  throws Throwable  {
      DatabaseConfig databaseConfig0 = new DatabaseConfig();
      databaseConfig0.getBtreeComparator();
      assertFalse(databaseConfig0.getExclusiveCreate());
      assertFalse(databaseConfig0.getTransactional());
      assertFalse(databaseConfig0.getOverrideDuplicateComparator());
      assertFalse(databaseConfig0.getOverrideBtreeComparator());
      assertFalse(databaseConfig0.getSortedDuplicates());
      assertFalse(databaseConfig0.getReadOnly());
      assertFalse(databaseConfig0.getAllowCreate());
  }

  @Test
  public void test28()  throws Throwable  {
      DatabaseConfig databaseConfig0 = new DatabaseConfig();
      boolean boolean0 = databaseConfig0.getAllowCreate();
      assertFalse(databaseConfig0.getExclusiveCreate());
      assertFalse(databaseConfig0.getReadOnly());
      assertFalse(databaseConfig0.getOverrideBtreeComparator());
      assertFalse(databaseConfig0.getSortedDuplicates());
      assertFalse(databaseConfig0.getTransactional());
      assertFalse(databaseConfig0.getOverrideDuplicateComparator());
      assertFalse(boolean0);
  }

  @Test
  public void test29()  throws Throwable  {
      DatabaseConfig databaseConfig0 = DatabaseConfig.DEFAULT;
      boolean boolean0 = databaseConfig0.getExclusiveCreate();
      assertFalse(boolean0);
  }
}
