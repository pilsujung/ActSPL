/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 09:24:05 KST 2017
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
public class DatabaseConfig_ESTest5 extends DatabaseConfig_ESTest_scaffolding5 {

  @Test
  public void test01()  throws Throwable  {
      DatabaseConfig databaseConfig0 = new DatabaseConfig();
      int int0 = databaseConfig0.getNodeMaxEntries();
      assertFalse(databaseConfig0.getExclusiveCreate());
      assertFalse(databaseConfig0.getAllowCreate());
      assertEquals(0, int0);
  }

  @Test
  public void test02()  throws Throwable  {
      DatabaseConfig databaseConfig0 = new DatabaseConfig();
      int int0 = databaseConfig0.getNodeMaxDupTreeEntries();
      assertEquals(0, int0);
      assertFalse(databaseConfig0.getExclusiveCreate());
      assertFalse(databaseConfig0.getAllowCreate());
  }

  @Test
  public void test03()  throws Throwable  {
      DatabaseConfig databaseConfig0 = new DatabaseConfig();
      boolean boolean0 = databaseConfig0.getAllowCreate();
      assertFalse(boolean0);
      assertFalse(databaseConfig0.getExclusiveCreate());
  }

  @Test
  public void test04()  throws Throwable  {
      DatabaseConfig databaseConfig0 = new DatabaseConfig();
      String string0 = databaseConfig0.genDatabaseConfigMismatchMessage(databaseConfig0, false, true, false, true, false);
      assertFalse(databaseConfig0.getExclusiveCreate());
      assertFalse(databaseConfig0.getAllowCreate());
      assertEquals("The following DatabaseConfig parameters for the\ncached Database do not match the parameters for the\nrequested Database:\n Transactional\n Sorted Duplicates\n Duplicate Comparator\n", string0);
  }

  @Test
  public void test05()  throws Throwable  {
      DatabaseConfig databaseConfig0 = new DatabaseConfig();
      databaseConfig0.setBtreeComparator((Class) null);
      assertFalse(databaseConfig0.getExclusiveCreate());
      assertFalse(databaseConfig0.getAllowCreate());
  }


  @Test
  public void test07()  throws Throwable  {
      DatabaseConfig databaseConfig0 = new DatabaseConfig();
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
      assertEquals("The following DatabaseConfig parameters for the\ncached Database do not match the parameters for the\nrequested Database:\n Transactional\n Read-Only\n Sorted Duplicates\n Btree Comparator\n Duplicate Comparator\n", string0);
      assertFalse(databaseConfig0.getExclusiveCreate());
      assertFalse(databaseConfig0.getAllowCreate());
  }

  @Test
  public void test10()  throws Throwable  {
      DatabaseConfig databaseConfig0 = DatabaseConfig.DEFAULT;
      databaseConfig0.setNodeMaxDupTreeEntries(1);
      DatabaseConfig databaseConfig1 = databaseConfig0.cloneConfig();
      databaseConfig1.setSortedDuplicates(true);
      // Undeclared exception!
      try { 
        databaseConfig1.validate(databaseConfig0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.DatabaseConfig", e);
      }
  }


  @Test
  public void test14()  throws Throwable  {
      DatabaseConfig databaseConfig0 = DatabaseConfig.DEFAULT;
      databaseConfig0.setExclusiveCreate(false);
      assertFalse(databaseConfig0.getExclusiveCreate());
  }

  @Test
  public void test15()  throws Throwable  {
      DatabaseConfig databaseConfig0 = new DatabaseConfig();
      databaseConfig0.setDuplicateComparator((Class) null);
      assertFalse(databaseConfig0.getSortedDuplicates());
      assertFalse(databaseConfig0.getOverrideDuplicateComparator());
      assertFalse(databaseConfig0.getTransactional());
      assertFalse(databaseConfig0.getOverrideBtreeComparator());
      assertFalse(databaseConfig0.getAllowCreate());
      assertFalse(databaseConfig0.getExclusiveCreate());
      assertFalse(databaseConfig0.getReadOnly());
  }

  @Test
  public void test16()  throws Throwable  {
      DatabaseConfig databaseConfig0 = new DatabaseConfig();
      boolean boolean0 = databaseConfig0.getSortedDuplicates();
      assertFalse(databaseConfig0.getReadOnly());
      assertFalse(databaseConfig0.getOverrideDuplicateComparator());
      assertFalse(databaseConfig0.getExclusiveCreate());
      assertFalse(boolean0);
      assertFalse(databaseConfig0.getTransactional());
      assertFalse(databaseConfig0.getAllowCreate());
      assertFalse(databaseConfig0.getOverrideBtreeComparator());
  }


  @Test
  public void test18()  throws Throwable  {
      DatabaseConfig databaseConfig0 = new DatabaseConfig();
      databaseConfig0.setReadOnly(false);
      assertFalse(databaseConfig0.getOverrideDuplicateComparator());
      assertFalse(databaseConfig0.getTransactional());
      assertFalse(databaseConfig0.getAllowCreate());
      assertFalse(databaseConfig0.getReadOnly());
      assertFalse(databaseConfig0.getExclusiveCreate());
      assertFalse(databaseConfig0.getOverrideBtreeComparator());
      assertFalse(databaseConfig0.getSortedDuplicates());
  }

  @Test
  public void test19()  throws Throwable  {
      DatabaseConfig databaseConfig0 = new DatabaseConfig();
      boolean boolean0 = databaseConfig0.getTransactional();
      assertFalse(databaseConfig0.getAllowCreate());
      assertFalse(databaseConfig0.getReadOnly());
      assertFalse(databaseConfig0.getOverrideDuplicateComparator());
      assertFalse(databaseConfig0.getSortedDuplicates());
      assertFalse(databaseConfig0.getExclusiveCreate());
      assertFalse(boolean0);
      assertFalse(databaseConfig0.getOverrideBtreeComparator());
  }

  @Test
  public void test21()  throws Throwable  {
      DatabaseConfig databaseConfig0 = new DatabaseConfig();
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
  public void test24()  throws Throwable  {
      DatabaseConfig databaseConfig0 = new DatabaseConfig();
      databaseConfig0.getDuplicateComparator();
      assertFalse(databaseConfig0.getReadOnly());
      assertFalse(databaseConfig0.getOverrideDuplicateComparator());
      assertFalse(databaseConfig0.getOverrideBtreeComparator());
      assertFalse(databaseConfig0.getExclusiveCreate());
      assertFalse(databaseConfig0.getSortedDuplicates());
      assertFalse(databaseConfig0.getTransactional());
      assertFalse(databaseConfig0.getAllowCreate());
  }


  @Test
  public void test27()  throws Throwable  {
      DatabaseConfig databaseConfig0 = new DatabaseConfig();
      databaseConfig0.setNodeMaxEntries(154);
      assertEquals(154, databaseConfig0.getNodeMaxEntries());
  }

  @Test
  public void test28()  throws Throwable  {
      DatabaseConfig databaseConfig0 = new DatabaseConfig();
      databaseConfig0.getBtreeComparator();
      assertFalse(databaseConfig0.getExclusiveCreate());
      assertFalse(databaseConfig0.getSortedDuplicates());
      assertFalse(databaseConfig0.getOverrideBtreeComparator());
      assertFalse(databaseConfig0.getAllowCreate());
      assertFalse(databaseConfig0.getTransactional());
      assertFalse(databaseConfig0.getReadOnly());
      assertFalse(databaseConfig0.getOverrideDuplicateComparator());
  }


  @Test
  public void test30()  throws Throwable  {
      DatabaseConfig databaseConfig0 = DatabaseConfig.DEFAULT;
      boolean boolean0 = databaseConfig0.getExclusiveCreate();
      assertFalse(boolean0);
  }
}
