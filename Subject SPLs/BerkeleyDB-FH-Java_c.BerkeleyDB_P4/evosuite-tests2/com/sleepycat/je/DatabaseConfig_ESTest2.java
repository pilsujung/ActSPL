/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 21 22:50:32 KST 2017
 */

package com.sleepycat.je;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.sleepycat.je.DatabaseConfig;
import com.sleepycat.je.DatabaseException;
import java.util.Comparator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class DatabaseConfig_ESTest2 extends DatabaseConfig_ESTest_scaffolding2 {

  @Test
  public void test01()  throws Throwable  {
      DatabaseConfig databaseConfig0 = DatabaseConfig.DEFAULT;
      DatabaseConfig databaseConfig1 = databaseConfig0.cloneConfig();
      databaseConfig1.setOverrideDuplicateComparator(true);
      databaseConfig0.setSortedDuplicates(true);
      databaseConfig1.getBtreeComparator();
      assertTrue(databaseConfig1.getOverrideDuplicateComparator());
      
      databaseConfig0.getReadOnly();
      databaseConfig0.getBtreeComparator();
      assertTrue(databaseConfig0.getSortedDuplicates());
  }

  @Test
  public void test02()  throws Throwable  {
      DatabaseConfig databaseConfig0 = new DatabaseConfig();
      int int0 = databaseConfig0.getNodeMaxEntries();
      assertFalse(databaseConfig0.getTransactional());
      assertEquals(0, int0);
      assertFalse(databaseConfig0.getAllowCreate());
      assertFalse(databaseConfig0.getSortedDuplicates());
      assertFalse(databaseConfig0.getReadOnly());
      assertFalse(databaseConfig0.getExclusiveCreate());
  }

  @Test
  public void test03()  throws Throwable  {
      DatabaseConfig databaseConfig0 = new DatabaseConfig();
      databaseConfig0.setNodeMaxEntries(1);
      int int0 = databaseConfig0.getNodeMaxEntries();
      assertEquals(1, int0);
  }

  @Test
  public void test04()  throws Throwable  {
      DatabaseConfig databaseConfig0 = new DatabaseConfig();
      boolean boolean0 = databaseConfig0.getAllowCreate();
      assertFalse(boolean0);
      assertFalse(databaseConfig0.getExclusiveCreate());
      assertFalse(databaseConfig0.getReadOnly());
      assertFalse(databaseConfig0.getTransactional());
      assertFalse(databaseConfig0.getSortedDuplicates());
  }

  @Test
  public void test06()  throws Throwable  {
      DatabaseConfig databaseConfig0 = DatabaseConfig.DEFAULT;
      databaseConfig0.setDuplicateComparator((Class) null);
      assertFalse(databaseConfig0.getOverrideBtreeComparator());
  }

  @Test
  public void test07()  throws Throwable  {
      DatabaseConfig databaseConfig0 = DatabaseConfig.DEFAULT;
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
  public void test08()  throws Throwable  {
      DatabaseConfig databaseConfig0 = DatabaseConfig.DEFAULT;
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
  public void test09()  throws Throwable  {
      DatabaseConfig databaseConfig0 = new DatabaseConfig();
      Class<DatabaseConfig> class0 = DatabaseConfig.class;
      // Undeclared exception!
      try { 
        databaseConfig0.setBtreeComparator(class0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // com.sleepycat.je.DatabaseConfig cannot be cast to java.util.Comparator
         //
         assertThrownBy("com.sleepycat.je.dbi.DatabaseImpl", e);
      }
  }

  @Test
  public void test10()  throws Throwable  {
      DatabaseConfig databaseConfig0 = DatabaseConfig.DEFAULT;
      String string0 = databaseConfig0.genDatabaseConfigMismatchMessage(databaseConfig0, false, false, false, false, false);
      assertEquals("The following DatabaseConfig parameters for the\ncached Database do not match the parameters for the\nrequested Database:\n Transactional\n Read-Only\n Sorted Duplicates\n Btree Comparator\n Duplicate Comparator\n", string0);
  }

  @Test
  public void test11()  throws Throwable  {
      DatabaseConfig databaseConfig0 = DatabaseConfig.DEFAULT;
      String string0 = databaseConfig0.genDatabaseConfigMismatchMessage(databaseConfig0, true, true, true, true, false);
      assertEquals("The following DatabaseConfig parameters for the\ncached Database do not match the parameters for the\nrequested Database:\n Duplicate Comparator\n", string0);
  }

  @Test
  public void test12()  throws Throwable  {
      DatabaseConfig databaseConfig0 = new DatabaseConfig();
      assertFalse(databaseConfig0.getOverrideBtreeComparator());
      assertFalse(databaseConfig0.getOverrideDuplicateComparator());
      
      databaseConfig0.validate(databaseConfig0);
      assertFalse(databaseConfig0.getAllowCreate());
      assertFalse(databaseConfig0.getTransactional());
      assertFalse(databaseConfig0.getSortedDuplicates());
      assertFalse(databaseConfig0.getExclusiveCreate());
      assertFalse(databaseConfig0.getReadOnly());
  }

  @Test
  public void test17()  throws Throwable  {
      DatabaseConfig databaseConfig0 = DatabaseConfig.DEFAULT;
      Class<String> class0 = String.class;
      // Undeclared exception!
      try { 
        databaseConfig0.setDuplicateComparator(class0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.String cannot be cast to java.util.Comparator
         //
         assertThrownBy("com.sleepycat.je.dbi.DatabaseImpl", e);
      }
  }

  @Test
  public void test18()  throws Throwable  {
      DatabaseConfig databaseConfig0 = DatabaseConfig.DEFAULT;
      databaseConfig0.setReadOnly(false);
      assertFalse(databaseConfig0.getReadOnly());
  }


  @Test
  public void test20()  throws Throwable  {
      DatabaseConfig databaseConfig0 = new DatabaseConfig();
      databaseConfig0.setOverrideBtreeComparator(false);
      assertFalse(databaseConfig0.getReadOnly());
      assertFalse(databaseConfig0.getOverrideDuplicateComparator());
      assertFalse(databaseConfig0.getExclusiveCreate());
      assertFalse(databaseConfig0.getSortedDuplicates());
      assertFalse(databaseConfig0.getOverrideBtreeComparator());
      assertFalse(databaseConfig0.getAllowCreate());
      assertFalse(databaseConfig0.getTransactional());
  }

  @Test
  public void test22()  throws Throwable  {
      DatabaseConfig databaseConfig0 = DatabaseConfig.DEFAULT;
      databaseConfig0.setBtreeComparator((Class) null);
      //  // Unstable assertion: assertEquals(0, databaseConfig0.getNodeMaxDupTreeEntries());
  }

  @Test
  public void test23()  throws Throwable  {
      DatabaseConfig databaseConfig0 = DatabaseConfig.DEFAULT;
      databaseConfig0.setAllowCreate(true);
      assertTrue(databaseConfig0.getAllowCreate());
  }

  @Test
  public void test24()  throws Throwable  {
      DatabaseConfig databaseConfig0 = DatabaseConfig.DEFAULT;
      Comparator comparator0 = databaseConfig0.getDuplicateComparator();
      assertNull(comparator0);
  }

  @Test
  public void test25()  throws Throwable  {
      DatabaseConfig databaseConfig0 = DatabaseConfig.DEFAULT;
      boolean boolean0 = databaseConfig0.getOverrideBtreeComparator();
      assertFalse(boolean0);
  }

  @Test
  public void test26()  throws Throwable  {
      DatabaseConfig databaseConfig0 = DatabaseConfig.DEFAULT;
      databaseConfig0.setTransactional(true);
      assertTrue(databaseConfig0.getTransactional());
  }

  @Test
  public void test28()  throws Throwable  {
      DatabaseConfig databaseConfig0 = DatabaseConfig.DEFAULT;
      boolean boolean0 = databaseConfig0.getAllowCreate();
      //  // Unstable assertion: assertFalse(boolean0);
  }

  @Test
  public void test30()  throws Throwable  {
      DatabaseConfig databaseConfig0 = DatabaseConfig.DEFAULT;
      boolean boolean0 = databaseConfig0.getExclusiveCreate();
      boolean boolean1 = databaseConfig0.getOverrideBtreeComparator();
      //  // Unstable assertion: assertTrue(boolean1 == boolean0);
  }
}
