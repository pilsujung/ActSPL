/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 21 23:59:50 KST 2017
 */

package com.sleepycat.je.config;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.sleepycat.je.config.ConfigParam;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class ConfigParam_ESTest6 extends ConfigParam_ESTest_scaffolding6 {

  @Test
  public void test00()  throws Throwable  {
      ConfigParam configParam0 = new ConfigParam("x&~$fS\"/pGjgMt!pwJH", "", false, "&O,p#QW?l5w+");
      assertEquals("x&~$fS\"/pGjgMt!pwJH", configParam0.getName());
      
      configParam0.name = null;
      String string0 = configParam0.toString();
      assertEquals("", configParam0.getDefault());
      assertFalse(configParam0.isMutable());
      assertEquals("&O,p#QW?l5w+", configParam0.getDescription());
      assertNull(string0);
  }

  @Test
  public void test01()  throws Throwable  {
      ConfigParam configParam0 = new ConfigParam("0", "0", false, "0");
      boolean boolean0 = configParam0.isMutable();
      assertEquals("0", configParam0.getDescription());
      assertEquals("0", configParam0.getDefault());
      assertEquals("0", configParam0.getName());
      assertFalse(boolean0);
  }

  @Test
  public void test02()  throws Throwable  {
      ConfigParam configParam0 = new ConfigParam("92v}0XbuV7|Sc[]oFFg", "92v}0XbuV7|Sc[]oFFg", true, "92v}0XbuV7|Sc[]oFFg");
      assertEquals("92v}0XbuV7|Sc[]oFFg", configParam0.getName());
      
      configParam0.name = null;
      configParam0.getName();
      assertEquals("92v}0XbuV7|Sc[]oFFg", configParam0.getDefault());
      assertEquals("92v}0XbuV7|Sc[]oFFg", configParam0.getDescription());
      assertTrue(configParam0.isMutable());
  }

  @Test
  public void test03()  throws Throwable  {
      ConfigParam configParam0 = new ConfigParam("0", "0", false, "0");
      String string0 = configParam0.getDescription();
      assertEquals("0", configParam0.getName());
      assertFalse(configParam0.isMutable());
      assertEquals("0", configParam0.getDefault());
      assertEquals("0", string0);
  }

  @Test
  public void test04()  throws Throwable  {
      ConfigParam configParam0 = new ConfigParam("{V", (String) null, false, (String) null);
      String string0 = configParam0.getDefault();
      assertFalse(configParam0.isMutable());
      assertEquals("{V", configParam0.getName());
      assertNull(string0);
  }

  @Test
  public void test05()  throws Throwable  {
      ConfigParam configParam0 = new ConfigParam("$J>F,A", "K4J881R<", true, " A configuration parameter name can't be null or 0 length");
      configParam0.validate();
      assertTrue(configParam0.isMutable());
      assertEquals("K4J881R<", configParam0.getDefault());
      assertEquals("$J>F,A", configParam0.getName());
      assertEquals(" A configuration parameter name can't be null or 0 length", configParam0.getDescription());
  }

  @Test
  public void test06()  throws Throwable  {
      ConfigParam configParam0 = new ConfigParam("92v}0XbuV7|Sc[]oFFg", "92v}0XbuV7|Sc[]oFFg", true, "92v}0XbuV7|Sc[]oFFg");
      assertEquals("92v}0XbuV7|Sc[]oFFg", configParam0.getName());
      
      configParam0.name = null;
      String string0 = configParam0.getDefault();
      assertEquals("92v}0XbuV7|Sc[]oFFg", string0);
      assertNotNull(string0);
      assertEquals("92v}0XbuV7|Sc[]oFFg", configParam0.getDescription());
      assertTrue(configParam0.isMutable());
  }

  @Test
  public void test07()  throws Throwable  {
      ConfigParam configParam0 = null;
      try {
        configParam0 = new ConfigParam((String) null, (String) null, false, (String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         //  A configuration parameter name can't be null or 0 length
         //
         assertThrownBy("com.sleepycat.je.config.ConfigParam", e);
      }
  }

  @Test
  public void test08()  throws Throwable  {
      ConfigParam configParam0 = new ConfigParam("92v}0XbuV7|Sc[]oFFg", "92v}0XbuV7|Sc[]oFFg", true, "92v}0XbuV7|Sc[]oFFg");
      String string0 = configParam0.getName();
      assertEquals("92v}0XbuV7|Sc[]oFFg", configParam0.getDescription());
      assertNotNull(string0);
      assertTrue(configParam0.isMutable());
      assertEquals("92v}0XbuV7|Sc[]oFFg", string0);
      assertEquals("92v}0XbuV7|Sc[]oFFg", configParam0.getDefault());
  }

  @Test
  public void test09()  throws Throwable  {
      ConfigParam configParam0 = new ConfigParam("$J>F,A", "K4J881R<", true, " A configuration parameter name can't be null or 0 length");
      configParam0.validateValue("");
      assertEquals("$J>F,A", configParam0.getName());
      assertTrue(configParam0.isMutable());
      assertEquals("K4J881R<", configParam0.getDefault());
      assertEquals(" A configuration parameter name can't be null or 0 length", configParam0.getDescription());
  }

  @Test
  public void test10()  throws Throwable  {
      ConfigParam configParam0 = null;
      try {
        configParam0 = new ConfigParam("", "", true, "");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         //  A configuration parameter name can't be null or 0 length
         //
         assertThrownBy("com.sleepycat.je.config.ConfigParam", e);
      }
  }

  @Test
  public void test11()  throws Throwable  {
      ConfigParam configParam0 = new ConfigParam("x&~$fS\"/pGjgMt!pwJH", "", false, "&O,p#QW?l5w+");
      configParam0.name = null;
      try { 
        configParam0.validate();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         //  A configuration parameter name can't be null or 0 length
         //
         assertThrownBy("com.sleepycat.je.config.ConfigParam", e);
      }
  }

  @Test
  public void test12()  throws Throwable  {
      ConfigParam configParam0 = new ConfigParam("T", "T", true, (String) null);
      String string0 = configParam0.getDescription();
      assertEquals("T", configParam0.getName());
      assertEquals("T", configParam0.getDefault());
      assertTrue(configParam0.isMutable());
      assertNull(string0);
  }

  @Test
  public void test13()  throws Throwable  {
      ConfigParam configParam0 = new ConfigParam("92v}0XbuV7|Sc[]oFFg", "92v}0XbuV7|Sc[]oFFg", true, "92v}0XbuV7|Sc[]oFFg");
      String string0 = configParam0.toString();
      assertNotNull(string0);
      assertEquals("92v}0XbuV7|Sc[]oFFg", configParam0.getDefault());
      assertEquals("92v}0XbuV7|Sc[]oFFg", configParam0.getDescription());
      assertEquals("92v}0XbuV7|Sc[]oFFg", string0);
      assertEquals("92v}0XbuV7|Sc[]oFFg", configParam0.getName());
      assertTrue(configParam0.isMutable());
  }

  @Test
  public void test14()  throws Throwable  {
      ConfigParam configParam0 = new ConfigParam("92v}0XbuV7|Sc[]oFFg", "92v}0XbuV7|Sc[]oFFg", true, "92v}0XbuV7|Sc[]oFFg");
      boolean boolean0 = configParam0.isMutable();
      assertTrue(boolean0);
      assertEquals("92v}0XbuV7|Sc[]oFFg", configParam0.getName());
      assertEquals("92v}0XbuV7|Sc[]oFFg", configParam0.getDefault());
      assertEquals("92v}0XbuV7|Sc[]oFFg", configParam0.getDescription());
  }

  @Test
  public void test15()  throws Throwable  {
      ConfigParam configParam0 = new ConfigParam("92v}0XbuV7|Sc[]oFFg", "92v}0XbuV7|Sc[]oFFg", true, "92v}0XbuV7|Sc[]oFFg");
      configParam0.getExtraDescription();
      assertEquals("92v}0XbuV7|Sc[]oFFg", configParam0.getName());
      assertTrue(configParam0.isMutable());
      assertEquals("92v}0XbuV7|Sc[]oFFg", configParam0.getDefault());
      assertEquals("92v}0XbuV7|Sc[]oFFg", configParam0.getDescription());
  }
}