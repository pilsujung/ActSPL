/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 21 22:22:50 KST 2017
 */

package com.sleepycat.je.utilint;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.nio.charset.Charset;
import java.util.LinkedHashSet;
import java.util.Properties;
import java.util.Set;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.sleepycat.je.DatabaseException;

import sun.nio.cs.ext.MS949;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class PropUtil_ESTest7 extends PropUtil_ESTest_scaffolding7 {

  @Test
  public void test00()  throws Throwable  {
      long long0 = PropUtil.microsToMillis(0L);
      assertEquals(0L, long0);
  }

  @Test
  public void test01()  throws Throwable  {
      long long0 = PropUtil.microsToMillis(1L);
      assertEquals(1L, long0);
  }

  @Test
  public void test02()  throws Throwable  {
      LinkedHashSet<Object> linkedHashSet0 = new LinkedHashSet<Object>();
      Properties properties0 = PropUtil.validateProps((Properties) null, linkedHashSet0, "");
      Integer integer0 = new Integer(0);
      properties0.put(integer0, integer0);
      // Undeclared exception!
      try { 
        PropUtil.validateProps(properties0, linkedHashSet0, " is not a valid property for ");
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Integer cannot be cast to java.lang.String
         //
         assertThrownBy("java.util.Properties", e);
      }
  }

  @Test
  public void test03()  throws Throwable  {
      LinkedHashSet<Object> linkedHashSet0 = new LinkedHashSet<Object>();
      linkedHashSet0.add((Object) null);
      // Undeclared exception!
      try { 
        PropUtil.validateProp((String) null, linkedHashSet0, ".");
       //  fail("Expecting exception: NullPointerException");
       // Unstable assertion
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
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
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      Set<String> set0 = mS949_0.aliases();
      try { 
        PropUtil.validateProp(". ", set0, "");
        fail("Expecting exception: DatabaseException");
      
      } catch(DatabaseException e) {
         //
         // .  is not a valid property for 
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
      linkedHashSet0.add("O]<vKtR<\"+wp");
      Properties properties0 = PropUtil.validateProps((Properties) null, linkedHashSet0, "O]<vKtR<\"+wp");
      properties0.put("O]<vKtR<\"+wp", "true");
      Properties properties1 = PropUtil.validateProps(properties0, linkedHashSet0, "O]<vKtR<\"+wp");
      assertSame(properties1, properties0);
  }

  @Test
  public void test08()  throws Throwable  {
      LinkedHashSet<Object> linkedHashSet0 = new LinkedHashSet<Object>();
      Properties properties0 = PropUtil.validateProps((Properties) null, linkedHashSet0, "true");
      properties0.put("true", "");
      try { 
        PropUtil.validateProps(properties0, linkedHashSet0, "9#wjStGuS*1$9H");
        fail("Expecting exception: DatabaseException");
      
      } catch(DatabaseException e) {
         //
         // true is not a valid property for 9#wjStGuS*1$9H
         //
         assertThrownBy("com.sleepycat.je.utilint.PropUtil", e);
      }
  }

  @Test
  public void test09()  throws Throwable  {
      LinkedHashSet<Object> linkedHashSet0 = new LinkedHashSet<Object>();
      Properties properties0 = PropUtil.validateProps((Properties) null, linkedHashSet0, "true");
      Properties properties1 = PropUtil.validateProps(properties0, linkedHashSet0, "");
      assertSame(properties1, properties0);
  }

  @Test
  public void test10()  throws Throwable  {
      LinkedHashSet<Object> linkedHashSet0 = new LinkedHashSet<Object>();
      Properties properties0 = PropUtil.validateProps((Properties) null, linkedHashSet0, "O]<vKtR<\"+wp");
      properties0.put("O]<vKtR<\"+wp", "true");
      boolean boolean0 = PropUtil.getBoolean(properties0, "O]<vKtR<\"+wp");
      assertTrue(boolean0);
  }

  @Test
  public void test11()  throws Throwable  {
      LinkedHashSet<Object> linkedHashSet0 = new LinkedHashSet<Object>();
      Properties properties0 = PropUtil.validateProps((Properties) null, linkedHashSet0, "wDZ_,k:");
      properties0.put("wDZ_,k:", "VUur");
      boolean boolean0 = PropUtil.getBoolean(properties0, "wDZ_,k:");
      assertFalse(boolean0);
  }

  @Test
  public void test12()  throws Throwable  {
      LinkedHashSet<Object> linkedHashSet0 = new LinkedHashSet<Object>();
      Properties properties0 = PropUtil.validateProps((Properties) null, linkedHashSet0, "O]<vKtR<\"+wp");
      boolean boolean0 = PropUtil.getBoolean(properties0, "true");
      assertFalse(boolean0);
  }

  @Test
  public void test13()  throws Throwable  {
      PropUtil propUtil0 = new PropUtil();
  }

  @Test
  public void test14()  throws Throwable  {
      long long0 = PropUtil.microsToMillis((-2162L));
      assertEquals((-1L), long0);
  }
}
