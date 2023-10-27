/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 12:33:39 KST 2017
 */

package com.sleepycat.je.utilint;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.LinkedHashSet;
import java.util.Properties;
import java.util.Set;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.sleepycat.je.DatabaseException;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class PropUtil_ESTest9 extends PropUtil_ESTest_scaffolding9 {

  @Test
  public void test00()  throws Throwable  {
      long long0 = PropUtil.microsToMillis(4018L);
      assertEquals(5L, long0);
  }

  @Test
  public void test01()  throws Throwable  {
      long long0 = PropUtil.microsToMillis((-2861L));
      assertEquals((-1L), long0);
  }

  @Test
  public void test02()  throws Throwable  {
      LinkedHashSet<Object> linkedHashSet0 = new LinkedHashSet<Object>();
      Properties properties0 = PropUtil.validateProps((Properties) null, linkedHashSet0, "");
      properties0.put(linkedHashSet0, properties0);
      // Undeclared exception!
      try { 
        PropUtil.validateProps(properties0, linkedHashSet0, "");
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.util.LinkedHashSet cannot be cast to java.lang.String
         //
         assertThrownBy("java.util.Properties", e);
      }
  }

  @Test
  public void test03()  throws Throwable  {
      // Undeclared exception!
      try { 
        PropUtil.validateProp("LMr!n+", (Set) null, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test04()  throws Throwable  {
      // Undeclared exception!
      try { 
        PropUtil.getBoolean((Properties) null, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.utilint.PropUtil", e);
      }
  }

  @Test
  public void test05()  throws Throwable  {
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      try { 
        PropUtil.validateProp((String) null, linkedHashSet0, "m2~@E3.Afd");
        fail("Expecting exception: DatabaseException");
      
      } catch(DatabaseException e) {
         //
         // null is not a valid property for m2~@E3.Afd
         //
         assertThrownBy("com.sleepycat.je.utilint.PropUtil", e);
      }
  }

  @Test
  public void test06()  throws Throwable  {
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      linkedHashSet0.add("true");
      PropUtil.validateProp("true", linkedHashSet0, "true");
      assertEquals(1, linkedHashSet0.size());
  }

  @Test
  public void test07()  throws Throwable  {
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      linkedHashSet0.add("true");
      Properties properties0 = PropUtil.validateProps((Properties) null, linkedHashSet0, "true");
      properties0.setProperty("true", "true");
      Properties properties1 = PropUtil.validateProps(properties0, linkedHashSet0, "true");
      assertSame(properties0, properties1);
  }

  @Test
  public void test08()  throws Throwable  {
      LinkedHashSet<Object> linkedHashSet0 = new LinkedHashSet<Object>();
      Properties properties0 = PropUtil.validateProps((Properties) null, linkedHashSet0, "!yU>hZ}");
      properties0.put("!yU>hZ}", "!yU>hZ}");
      try { 
        PropUtil.validateProps(properties0, linkedHashSet0, "!yU>hZ}");
        fail("Expecting exception: DatabaseException");
      
      } catch(DatabaseException e) {
         //
         // !yU>hZ} is not a valid property for !yU>hZ}
         //
         assertThrownBy("com.sleepycat.je.utilint.PropUtil", e);
      }
  }

  @Test
  public void test09()  throws Throwable  {
      LinkedHashSet<Object> linkedHashSet0 = new LinkedHashSet<Object>();
      Properties properties0 = PropUtil.validateProps((Properties) null, linkedHashSet0, "!yU>hZ}");
      Properties properties1 = PropUtil.validateProps(properties0, linkedHashSet0, "!yU>hZ}");
      assertEquals(0, properties1.size());
  }

  @Test
  public void test10()  throws Throwable  {
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      Properties properties0 = PropUtil.validateProps((Properties) null, linkedHashSet0, "true");
      properties0.setProperty("true", "true");
      boolean boolean0 = PropUtil.getBoolean(properties0, "true");
      assertTrue(boolean0);
  }

  @Test
  public void test11()  throws Throwable  {
      LinkedHashSet<Object> linkedHashSet0 = new LinkedHashSet<Object>();
      Properties properties0 = PropUtil.validateProps((Properties) null, linkedHashSet0, "!yU>hZ}");
      properties0.put("!yU>hZ}", "!yU>hZ}");
      boolean boolean0 = PropUtil.getBoolean(properties0, "!yU>hZ}");
      assertFalse(boolean0);
  }

  @Test
  public void test12()  throws Throwable  {
      LinkedHashSet<Object> linkedHashSet0 = new LinkedHashSet<Object>();
      Properties properties0 = PropUtil.validateProps((Properties) null, linkedHashSet0, "");
      boolean boolean0 = PropUtil.getBoolean(properties0, "");
      assertFalse(boolean0);
  }


}