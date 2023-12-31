/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 02:43:04 KST 2017
 */

package com.sleepycat.je.utilint;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.fail;

import java.io.File;
import java.io.StringWriter;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.sleepycat.je.EnvironmentConfig;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class CmdUtil_ESTest2 extends CmdUtil_ESTest_scaffolding2 {

  @Test
  public void test00()  throws Throwable  {
      long long0 = CmdUtil.readLongNumber("0");
      assertEquals(0L, long0);
  }

  @Test
  public void test01()  throws Throwable  {
      String[] stringArray0 = new String[6];
      stringArray0[1] = "u$";
      String string0 = CmdUtil.getArg(stringArray0, 1);
      assertEquals("u$", string0);
  }

  @Test
  public void test02()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(90);
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      byte[] byteArray0 = new byte[8];
      byteArray0[6] = (byte)127;
      CmdUtil.formatEntry(stringBuffer0, byteArray0, true);
      assertEquals(24, stringBuffer0.length());
      assertEquals("\\00\\00\\00\\00\\00\\00\\7f\\00", stringWriter0.toString());
  }

  @Test
  public void test03()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(255);
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      byte[] byteArray0 = new byte[6];
      byteArray0[4] = (byte)16;
      CmdUtil.formatEntry(stringBuffer0, byteArray0, false);
      assertEquals("000000001000", stringBuffer0.toString());
      assertEquals("000000001000", stringWriter0.toString());
  }

  @Test
  public void test04()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(90);
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      byte[] byteArray0 = new byte[8];
      byteArray0[1] = (byte)16;
      CmdUtil.formatEntry(stringBuffer0, byteArray0, true);
      assertEquals(24, stringBuffer0.length());
      assertEquals("\\00\\10\\00\\00\\00\\00\\00\\00", stringWriter0.toString());
  }

  @Test
  public void test05()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(56);
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      byte[] byteArray0 = new byte[3];
      byteArray0[2] = (byte)103;
      CmdUtil.formatEntry(stringBuffer0, byteArray0, true);
      assertEquals(7, stringBuffer0.length());
      assertEquals("\\00\\00g", stringWriter0.toString());
  }

  @Test
  public void test06()  throws Throwable  {
      String[] stringArray0 = new String[3];
      try { 
        CmdUtil.getArg(stringArray0, 476);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.utilint.CmdUtil", e);
      }
  }

  @Test
  public void test07()  throws Throwable  {
      // Undeclared exception!
      try { 
        CmdUtil.readLongNumber("-x");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"-x\"
         //
         assertThrownBy("java.lang.NumberFormatException", e);
      }
  }

  @Test
  public void test08()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = new EnvironmentConfig();
      CmdUtil.hook855(environmentConfig0);
      assertEquals(0L, environmentConfig0.getCacheSize());
  }

  @Test
  public void test09()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = new EnvironmentConfig();
      CmdUtil.hook854(environmentConfig0);
      assertFalse(environmentConfig0.getTxnNoSync());
  }

  @Test
  public void test10()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = new EnvironmentConfig();
      CmdUtil.hook853(environmentConfig0);
      assertFalse(environmentConfig0.getAllowCreate());
  }


  @Test
  public void test12()  throws Throwable  {
      // Undeclared exception!
      try { 
        CmdUtil.hook855((EnvironmentConfig) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.utilint.CmdUtil", e);
      }
  }

  @Test
  public void test13()  throws Throwable  {
      // Undeclared exception!
      try { 
        CmdUtil.hook854((EnvironmentConfig) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.utilint.CmdUtil", e);
      }
  }

  @Test
  public void test14()  throws Throwable  {
      // Undeclared exception!
      try { 
        CmdUtil.hook853((EnvironmentConfig) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.utilint.CmdUtil", e);
      }
  }


  @Test
  public void test16()  throws Throwable  {
      // Undeclared exception!
      try { 
        CmdUtil.getArg((String[]) null, 476);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.utilint.CmdUtil", e);
      }
  }

  @Test
  public void test17()  throws Throwable  {
      String[] stringArray0 = new String[17];
      // Undeclared exception!
      try { 
        CmdUtil.getArg(stringArray0, (-3376));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -3376
         //
         assertThrownBy("com.sleepycat.je.utilint.CmdUtil", e);
      }
  }

  @Test
  public void test18()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      // Undeclared exception!
      try { 
        CmdUtil.formatEntry((StringBuffer) null, byteArray0, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.utilint.CmdUtil", e);
      }
  }

  @Test
  public void test19()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(90);
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      byte[] byteArray0 = new byte[8];
      byteArray0[2] = (byte) (-81);
      CmdUtil.formatEntry(stringBuffer0, byteArray0, true);
      assertEquals(24, stringBuffer0.length());
      assertEquals("\\00\\00\\af\\00\\00\\00\\00\\00", stringWriter0.toString());
  }

  @Test
  public void test20()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(255);
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte) (-22);
      CmdUtil.formatEntry(stringBuffer0, byteArray0, false);
      assertEquals("ea0000000000", stringBuffer0.toString());
      assertEquals("ea0000000000", stringWriter0.toString());
  }

  @Test
  public void test21()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(90);
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte)32;
      CmdUtil.formatEntry(stringBuffer0, byteArray0, true);
      assertEquals(24, stringBuffer0.length());
      assertEquals("\\20\\00\\00\\00\\00\\00\\00\\00", stringWriter0.toString());
  }

  @Test
  public void test22()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      byte[] byteArray0 = new byte[8];
      byteArray0[3] = (byte)92;
      CmdUtil.formatEntry(stringBuffer0, byteArray0, true);
      assertEquals(34, stringBuffer0.capacity());
      assertEquals("\\00\\00\\00\\\\\\00\\00\\00\\00", stringWriter0.toString());
  }

  @Test
  public void test23()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(90);
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      byte[] byteArray0 = new byte[8];
      byteArray0[7] = (byte)40;
      CmdUtil.formatEntry(stringBuffer0, byteArray0, true);
      assertEquals(22, stringBuffer0.length());
      assertEquals("\\00\\00\\00\\00\\00\\00\\00(", stringWriter0.toString());
  }

  @Test
  public void test24()  throws Throwable  {
      long long0 = CmdUtil.readLongNumber("0xc");
      assertEquals(12L, long0);
  }

  @Test
  public void test25()  throws Throwable  {
      long long0 = CmdUtil.readLongNumber("-8");
      assertEquals((-8L), long0);
  }

  @Test
  public void test26()  throws Throwable  {
      String[] stringArray0 = new String[11];
      String string0 = CmdUtil.getArg(stringArray0, 0);
      assertNull(string0);
  }

  @Test
  public void test27()  throws Throwable  {
      String[] stringArray0 = new String[2];
      try { 
        CmdUtil.getArg(stringArray0, 2);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.utilint.CmdUtil", e);
      }
  }



  @Test
  public void test30()  throws Throwable  {
      // Undeclared exception!
      try { 
        CmdUtil.makeUtilityEnvironment((File) null, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.FileManager", e);
      }
  }
}
