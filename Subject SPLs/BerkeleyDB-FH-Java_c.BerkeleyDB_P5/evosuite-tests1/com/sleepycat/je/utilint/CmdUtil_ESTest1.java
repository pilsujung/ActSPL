/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 21 21:29:04 KST 2017
 */

package com.sleepycat.je.utilint;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.sleepycat.je.EnvironmentConfig;
import com.sleepycat.je.utilint.CmdUtil;
import java.io.File;
import java.io.StringWriter;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class CmdUtil_ESTest1 extends CmdUtil_ESTest_scaffolding1 {

  @Test
  public void test00()  throws Throwable  {
      String[] stringArray0 = new String[4];
      stringArray0[1] = "je.cleaner.minAge";
      String string0 = CmdUtil.getArg(stringArray0, 1);
      assertEquals("je.cleaner.minAge", string0);
  }

  @Test
  public void test01()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(0);
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      byte[] byteArray0 = new byte[7];
      byteArray0[4] = (byte)32;
      CmdUtil.formatEntry(stringBuffer0, byteArray0, true);
      assertEquals(30, stringBuffer0.capacity());
      assertEquals("\\00\\00\\00\\00\\20\\00\\00", stringWriter0.toString());
  }

  @Test
  public void test02()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(0);
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      byte[] byteArray0 = new byte[6];
      byteArray0[5] = (byte)127;
      CmdUtil.formatEntry(stringBuffer0, byteArray0, true);
      assertEquals(18, stringBuffer0.length());
      assertEquals("\\00\\00\\00\\00\\00\\7f", stringWriter0.toString());
  }

  @Test
  public void test03()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(1);
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      byte[] byteArray0 = new byte[6];
      byteArray0[2] = (byte) (-71);
      CmdUtil.formatEntry(stringBuffer0, byteArray0, false);
      assertEquals(22, stringBuffer0.capacity());
      assertEquals("0000b9000000", stringWriter0.toString());
  }

  @Test
  public void test04()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(0);
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte)106;
      CmdUtil.formatEntry(stringBuffer0, byteArray0, true);
      assertEquals(30, stringBuffer0.capacity());
      assertEquals("j\\00\\00\\00\\00\\00\\00", stringWriter0.toString());
  }

  @Test
  public void test05()  throws Throwable  {
      String[] stringArray0 = new String[6];
      try { 
        CmdUtil.getArg(stringArray0, 881);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.utilint.CmdUtil", e);
      }
  }

  @Test
  public void test06()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = new EnvironmentConfig();
      CmdUtil.hook855(environmentConfig0);
      assertFalse(environmentConfig0.getTxnSerializableIsolation());
  }

  @Test
  public void test07()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = new EnvironmentConfig();
      CmdUtil.hook854(environmentConfig0);
      assertFalse(environmentConfig0.getTxnSerializableIsolation());
  }

  @Test
  public void test08()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = new EnvironmentConfig();
      CmdUtil.hook853(environmentConfig0);
      assertFalse(environmentConfig0.getReadOnly());
  }

  @Test
  public void test09()  throws Throwable  {
      Class<Object> class0 = Object.class;
      String string0 = CmdUtil.getJavaCommand(class0);
      assertEquals("java { java.lang.Object | -jar je.jar Object }", string0);
  }

  @Test
  public void test10()  throws Throwable  {
      // Undeclared exception!
      try { 
        CmdUtil.readLongNumber("WW90nzjoj%(S");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"WW90nzjoj%(S\"
         //
         assertThrownBy("java.lang.NumberFormatException", e);
      }
  }

  @Test
  public void test11()  throws Throwable  {
      // Undeclared exception!
      try { 
        CmdUtil.readLongNumber((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test12()  throws Throwable  {
      // Undeclared exception!
      try { 
        CmdUtil.getArg((String[]) null, 0);
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
      String[] stringArray0 = new String[7];
      // Undeclared exception!
      try { 
        CmdUtil.getArg(stringArray0, (-2083));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2083
         //
         assertThrownBy("com.sleepycat.je.utilint.CmdUtil", e);
      }
  }

  @Test
  public void test14()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      // Undeclared exception!
      try { 
        CmdUtil.formatEntry((StringBuffer) null, byteArray0, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.utilint.CmdUtil", e);
      }
  }

  @Test
  public void test15()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(0);
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      byte[] byteArray0 = new byte[7];
      byteArray0[5] = (byte) (-14);
      CmdUtil.formatEntry(stringBuffer0, byteArray0, true);
      assertEquals(30, stringBuffer0.capacity());
      assertEquals("\\00\\00\\00\\00\\00\\f2\\00", stringWriter0.toString());
  }

  @Test
  public void test16()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(1);
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte)16;
      CmdUtil.formatEntry(stringBuffer0, byteArray0, false);
      assertEquals(22, stringBuffer0.capacity());
      assertEquals("100000000000", stringWriter0.toString());
  }

  @Test
  public void test17()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(0);
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      byte[] byteArray0 = new byte[6];
      byteArray0[5] = (byte)16;
      CmdUtil.formatEntry(stringBuffer0, byteArray0, true);
      assertEquals(30, stringBuffer0.capacity());
      assertEquals("\\00\\00\\00\\00\\00\\10", stringWriter0.toString());
  }

  @Test
  public void test18()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(0);
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      byte[] byteArray0 = new byte[6];
      byteArray0[4] = (byte)92;
      CmdUtil.formatEntry(stringBuffer0, byteArray0, true);
      assertEquals(30, stringBuffer0.capacity());
      assertEquals("\\00\\00\\00\\00\\\\\\00", stringWriter0.toString());
  }

  @Test
  public void test19()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(0);
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      byte[] byteArray0 = new byte[6];
      byteArray0[1] = (byte)47;
      CmdUtil.formatEntry(stringBuffer0, byteArray0, true);
      assertEquals(30, stringBuffer0.capacity());
      assertEquals("\\00/\\00\\00\\00\\00", stringWriter0.toString());
  }

  @Test
  public void test20()  throws Throwable  {
      long long0 = CmdUtil.readLongNumber("0x0");
      assertEquals(0L, long0);
  }

  @Test
  public void test21()  throws Throwable  {
      long long0 = CmdUtil.readLongNumber("3");
      assertEquals(3L, long0);
  }

  @Test
  public void test22()  throws Throwable  {
      String[] stringArray0 = new String[5];
      String string0 = CmdUtil.getArg(stringArray0, 0);
      assertNull(string0);
  }

  @Test
  public void test23()  throws Throwable  {
      String[] stringArray0 = new String[0];
      try { 
        CmdUtil.getArg(stringArray0, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.utilint.CmdUtil", e);
      }
  }

  @Test
  public void test24()  throws Throwable  {
      CmdUtil cmdUtil0 = new CmdUtil();
  }

  @Test
  public void test25()  throws Throwable  {
      // Undeclared exception!
      try { 
        CmdUtil.getJavaCommand((Class) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.utilint.CmdUtil", e);
      }
  }

  @Test
  public void test26()  throws Throwable  {
      // Undeclared exception!
      try { 
        CmdUtil.makeUtilityEnvironment((File) null, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.FileManager", e);
      }
  }
}
