/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 03:03:56 KST 2017
 */

package com.sleepycat.je.utilint;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.LinkedHashSet;
import java.util.Properties;
import java.util.Set;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.sleepycat.je.DatabaseException;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class PropUtil_ESTest6 extends PropUtil_ESTest_scaffolding6 {

  @Test
  public void test00()  throws Throwable  {
      long long0 = PropUtil.microsToMillis((-609L));
      assertEquals(0L, long0);
  }

  @Test
  public void test01()  throws Throwable  {
      long long0 = PropUtil.microsToMillis(1358L);
      assertEquals(2L, long0);
  }

  @Test
  public void test02()  throws Throwable  {
      LinkedHashSet<Integer> linkedHashSet0 = new LinkedHashSet<Integer>();
      Properties properties0 = PropUtil.validateProps((Properties) null, linkedHashSet0, "");
      Object object0 = new Object();
      properties0.put(linkedHashSet0, object0);
      // Undeclared exception!
      try { 
        PropUtil.validateProps(properties0, linkedHashSet0, "~5");
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
        PropUtil.validateProp("K+R<}!S1uujdeP3$B?", (Set) null, "K+R<}!S1uujdeP3$B?");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test04()  throws Throwable  {
      // Undeclared exception!
      try { 
        PropUtil.getBoolean((Properties) null, "");
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
      LinkedHashSet<Object> linkedHashSet0 = new LinkedHashSet<Object>();
      try { 
        PropUtil.validateProp("", linkedHashSet0, "~{D(QOf^_S%ayH");
        fail("Expecting exception: DatabaseException");
      
      } catch(DatabaseException e) {
         //
         //  is not a valid property for ~{D(QOf^_S%ayH
         //
         assertThrownBy("com.sleepycat.je.utilint.PropUtil", e);
      }
  }

  @Test
  public void test06()  throws Throwable  {
      LinkedHashSet<Object> linkedHashSet0 = new LinkedHashSet<Object>();
      linkedHashSet0.add("");
      PropUtil.validateProp("", linkedHashSet0, "");
      assertFalse(linkedHashSet0.isEmpty());
  }

  @Test
  public void test07()  throws Throwable  {
      LinkedHashSet<Object> linkedHashSet0 = new LinkedHashSet<Object>();
      linkedHashSet0.add("true");
      Properties properties0 = PropUtil.validateProps((Properties) null, linkedHashSet0, "true");
      properties0.setProperty("true", "true");
      Properties properties1 = PropUtil.validateProps(properties0, linkedHashSet0, "true");
      assertEquals(1, properties1.size());
  }

  @Test
  public void test08()  throws Throwable  {
      LinkedHashSet<Integer> linkedHashSet0 = new LinkedHashSet<Integer>();
      Properties properties0 = PropUtil.validateProps((Properties) null, linkedHashSet0, "e");
      byte[] byteArray0 = new byte[9];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream((InputStream) byteArrayInputStream0);
      properties0.load((InputStream) bufferedInputStream0);
      try { 
        PropUtil.validateProps(properties0, linkedHashSet0, "");
        fail("Expecting exception: DatabaseException");
      
      } catch(DatabaseException e) {
         //
         // \u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000 is not a valid property for 
         //
         assertThrownBy("com.sleepycat.je.utilint.PropUtil", e);
      }
  }

  @Test
  public void test09()  throws Throwable  {
      LinkedHashSet<Integer> linkedHashSet0 = new LinkedHashSet<Integer>();
      Properties properties0 = PropUtil.validateProps((Properties) null, linkedHashSet0, "e");
      Properties properties1 = PropUtil.validateProps(properties0, linkedHashSet0, "#j-*>rv]5cTT''P");
      assertSame(properties1, properties0);
  }

  @Test
  public void test10()  throws Throwable  {
      LinkedHashSet<Object> linkedHashSet0 = new LinkedHashSet<Object>();
      Properties properties0 = PropUtil.validateProps((Properties) null, linkedHashSet0, "|");
      properties0.setProperty("|", "tru~e");
      boolean boolean0 = PropUtil.getBoolean(properties0, "|");
      assertFalse(boolean0);
  }

  @Test
  public void test11()  throws Throwable  {
      LinkedHashSet<Object> linkedHashSet0 = new LinkedHashSet<Object>();
      Properties properties0 = PropUtil.validateProps((Properties) null, linkedHashSet0, "true");
      properties0.setProperty("true", "true");
      boolean boolean0 = PropUtil.getBoolean(properties0, "true");
      assertTrue(boolean0);
  }

  @Test
  public void test12()  throws Throwable  {
      LinkedHashSet<Integer> linkedHashSet0 = new LinkedHashSet<Integer>();
      Properties properties0 = PropUtil.validateProps((Properties) null, linkedHashSet0, "e");
      boolean boolean0 = PropUtil.getBoolean(properties0, "");
      assertFalse(boolean0);
  }

  @Test
  public void test13()  throws Throwable  {
      PropUtil propUtil0 = new PropUtil();
  }

  @Test
  public void test14()  throws Throwable  {
      long long0 = PropUtil.microsToMillis((-3617L));
      assertEquals((-2L), long0);
  }
}
