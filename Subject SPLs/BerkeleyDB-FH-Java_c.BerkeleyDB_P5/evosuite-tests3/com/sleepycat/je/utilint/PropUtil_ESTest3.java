/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 11:15:07 KST 2017
 */

package com.sleepycat.je.utilint;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Properties;
import java.util.Set;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.sleepycat.je.DatabaseException;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class PropUtil_ESTest3 extends PropUtil_ESTest_scaffolding3 {


  @Test
  public void test01()  throws Throwable  {
      long long0 = PropUtil.microsToMillis(1L);
      assertEquals(1L, long0);
  }

  @Test
  public void test02()  throws Throwable  {
      String string0 = "";
      Properties properties0 = PropUtil.validateProps((Properties) null, (Set) null, string0);
      properties0.put(".", "'El15;IGzFr>]s");
      // Undeclared exception!
      try { 
        PropUtil.validateProps(properties0, (Set) null, "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test03()  throws Throwable  {
      Locale locale0 = Locale.ROOT;
      Set<String> set0 = locale0.getUnicodeLocaleKeys();
      Properties properties0 = PropUtil.validateProps((Properties) null, set0, "M");
      properties0.put(set0, "M");
      // Undeclared exception!
      try { 
        PropUtil.validateProps(properties0, set0, "M");
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.util.Collections$EmptySet cannot be cast to java.lang.String
         //
         assertThrownBy("java.util.Properties", e);
      }
  }

  @Test
  public void test04()  throws Throwable  {
      // Undeclared exception!
      try { 
        PropUtil.validateProp("", (Set) null, "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }


  @Test
  public void test06()  throws Throwable  {
      LinkedHashSet<Integer> linkedHashSet0 = new LinkedHashSet<Integer>();
      try { 
        PropUtil.validateProp("", linkedHashSet0, "");
        fail("Expecting exception: DatabaseException");
      
      } catch(DatabaseException e) {
         //
         //  is not a valid property for 
         //
         assertThrownBy("com.sleepycat.je.utilint.PropUtil", e);
      }
  }

  @Test
  public void test07()  throws Throwable  {
      LinkedHashSet<Object> linkedHashSet0 = new LinkedHashSet<Object>();
      linkedHashSet0.add("");
      PropUtil.validateProp("", linkedHashSet0, "");
      assertEquals(1, linkedHashSet0.size());
  }

  @Test
  public void test08()  throws Throwable  {
      LinkedHashSet<Object> linkedHashSet0 = new LinkedHashSet<Object>();
      linkedHashSet0.add("");
      Properties properties0 = PropUtil.validateProps((Properties) null, linkedHashSet0, "");
      properties0.setProperty("", "");
      Properties properties1 = PropUtil.validateProps(properties0, linkedHashSet0, "");
      assertSame(properties1, properties0);
  }

  @Test
  public void test09()  throws Throwable  {
      LinkedHashSet<Integer> linkedHashSet0 = new LinkedHashSet<Integer>();
      Properties properties0 = PropUtil.validateProps((Properties) null, linkedHashSet0, "L){)");
      properties0.put("L){)", "L){)");
      try { 
        PropUtil.validateProps(properties0, linkedHashSet0, "L){)");
        fail("Expecting exception: DatabaseException");
      
      } catch(DatabaseException e) {
         //
         // L){) is not a valid property for L){)
         //
         assertThrownBy("com.sleepycat.je.utilint.PropUtil", e);
      }
  }

  @Test
  public void test10()  throws Throwable  {
      LinkedHashSet<Integer> linkedHashSet0 = new LinkedHashSet<Integer>();
      Properties properties0 = PropUtil.validateProps((Properties) null, linkedHashSet0, " is not a valid property for ");
      Properties properties1 = PropUtil.validateProps(properties0, linkedHashSet0, " is not a valid property for ");
      assertSame(properties0, properties1);
  }

  @Test
  public void test11()  throws Throwable  {
      LinkedHashSet<Integer> linkedHashSet0 = new LinkedHashSet<Integer>();
      Properties properties0 = PropUtil.validateProps((Properties) null, linkedHashSet0, "true");
      properties0.put("true", "true");
      boolean boolean0 = PropUtil.getBoolean(properties0, "true");
      assertTrue(boolean0);
  }

  @Test
  public void test12()  throws Throwable  {
      LinkedHashSet<Integer> linkedHashSet0 = new LinkedHashSet<Integer>();
      Properties properties0 = PropUtil.validateProps((Properties) null, linkedHashSet0, " is not a valid property for ");
      properties0.setProperty(" is not a valid property for ", "zUH~C/`");
      boolean boolean0 = PropUtil.getBoolean(properties0, " is not a valid property for ");
      assertFalse(boolean0);
  }

  @Test
  public void test13()  throws Throwable  {
      LinkedHashSet<Integer> linkedHashSet0 = new LinkedHashSet<Integer>();
      Properties properties0 = PropUtil.validateProps((Properties) null, linkedHashSet0, " is not a valid property for ");
      boolean boolean0 = PropUtil.getBoolean(properties0, "");
      assertFalse(boolean0);
  }


  @Test
  public void test15()  throws Throwable  {
      long long0 = PropUtil.microsToMillis((-2200L));
      assertEquals((-1L), long0);
  }
}
