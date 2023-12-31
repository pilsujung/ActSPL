/*
 * This file was automatically generated by EvoSuite
 * Sun Aug 12 16:08:11 KST 2018
 */

package com.substanceofcode.utils;

import static org.evosuite.runtime.EvoAssertions.verifyException;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class CompatibilityBase64_ESTest1 extends CompatibilityBase64_ESTest_scaffolding1 {
@BeforeClass
public static void initEvoSuiteFramework() {
String a = "aa";
}
@AfterClass
public static void exitEvoSuiteFramework() {
String a = "aa";
}

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CompatibilityBase64 compatibilityBase64_0 = new CompatibilityBase64();
      byte[] byteArray0 = compatibilityBase64_0.decode(" ");
      assertArrayEquals(new byte[] {}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CompatibilityBase64 compatibilityBase64_0 = new CompatibilityBase64();
      // Undeclared exception!
      try { 
        compatibilityBase64_0.encode((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.substanceofcode.utils.CompatibilityBase64", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CompatibilityBase64 compatibilityBase64_0 = new CompatibilityBase64();
      // Undeclared exception!
      try { 
        compatibilityBase64_0.decode((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.substanceofcode.utils.CompatibilityBase64", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CompatibilityBase64 compatibilityBase64_0 = new CompatibilityBase64();
      byte[] byteArray0 = compatibilityBase64_0.decode("AAAAAAA=");
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CompatibilityBase64 compatibilityBase64_0 = new CompatibilityBase64();
      byte[] byteArray0 = compatibilityBase64_0.decode("AAAAAA==");
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CompatibilityBase64 compatibilityBase64_0 = new CompatibilityBase64();
      byte[] byteArray0 = compatibilityBase64_0.decode("\r");
      assertEquals(0, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CompatibilityBase64 compatibilityBase64_0 = new CompatibilityBase64();
      // Undeclared exception!
      try { 
        compatibilityBase64_0.decode("=");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CompatibilityBase64 compatibilityBase64_0 = new CompatibilityBase64();
      // Undeclared exception!
      try { 
        compatibilityBase64_0.decode("|");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // unexpected code: |
         //
         verifyException("com.substanceofcode.utils.CompatibilityBase64", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CompatibilityBase64 compatibilityBase64_0 = new CompatibilityBase64();
      byte[] byteArray0 = new byte[5];
      String string0 = compatibilityBase64_0.encode(byteArray0);
      assertEquals("AAAAAAA=", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CompatibilityBase64 compatibilityBase64_0 = new CompatibilityBase64();
      byte[] byteArray0 = compatibilityBase64_0.decode("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/");
      String string0 = compatibilityBase64_0.encode(byteArray0);
      assertEquals("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz01234567\r\n89+/", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CompatibilityBase64 compatibilityBase64_0 = new CompatibilityBase64();
      byte[] byteArray0 = new byte[4];
      String string0 = compatibilityBase64_0.encode(byteArray0);
      assertEquals("AAAAAA==", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CompatibilityBase64 compatibilityBase64_0 = new CompatibilityBase64();
      byte[] byteArray0 = compatibilityBase64_0.decode("");
      String string0 = compatibilityBase64_0.encode(byteArray0);
      assertEquals("", string0);
  }
}
