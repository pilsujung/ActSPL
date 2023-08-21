/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 21 20:27:27 KST 2017
 */

package com.sleepycat.je.log;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.io.File;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.sleepycat.je.EnvironmentConfig;
import com.sleepycat.je.dbi.EnvironmentImpl;

import sun.nio.cs.ext.MS949;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class FileManager_ESTest7 extends FileManager_ESTest_scaffolding7 {

  @Test
  public void test00()  throws Throwable  {
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("K7Si^cMpH");
      FileManager.FileManager_readFromFile fileManager_FileManager_readFromFile0 = new FileManager.FileManager_readFromFile((FileManager) null, (RandomAccessFile) null, byteBuffer0, (-2452L));
  }

  @Test
  public void test01()  throws Throwable  {
      FileManager.FileManager_writeToFile fileManager_FileManager_writeToFile0 = new FileManager.FileManager_writeToFile((FileManager) null, (RandomAccessFile) null, (ByteBuffer) null, 814);
      fileManager_FileManager_writeToFile0.pos = 2083;
      int int0 = fileManager_FileManager_writeToFile0.execute();
      assertEquals(0, int0);
  }

  @Test
  public void test02()  throws Throwable  {
      FileManager.FileManager_writeToFile fileManager_FileManager_writeToFile0 = new FileManager.FileManager_writeToFile((FileManager) null, (RandomAccessFile) null, (ByteBuffer) null, 4294967295L);
      fileManager_FileManager_writeToFile0.size = 322;
      int int0 = fileManager_FileManager_writeToFile0.execute();
      assertEquals(0, int0);
  }

  @Test
  public void test03()  throws Throwable  {
      FileManager.FileManager_writeToFile fileManager_FileManager_writeToFile0 = new FileManager.FileManager_writeToFile((FileManager) null, (RandomAccessFile) null, (ByteBuffer) null, 4294967295L);
      fileManager_FileManager_writeToFile0.origLimit = 1827;
      int int0 = fileManager_FileManager_writeToFile0.execute();
      assertEquals(0, int0);
  }

  @Test
  public void test04()  throws Throwable  {
      FileManager.FileManager_writeToFile fileManager_FileManager_writeToFile0 = new FileManager.FileManager_writeToFile((FileManager) null, (RandomAccessFile) null, (ByteBuffer) null, 4294967295L);
      fileManager_FileManager_writeToFile0.bytesWritten = 814;
      int int0 = fileManager_FileManager_writeToFile0.execute();
      assertEquals(0, int0);
  }

  @Test
  public void test05()  throws Throwable  {
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("9jGt,S/E6W\"6-I>'");
      FileManager.FileManager_writeToFile fileManager_FileManager_writeToFile0 = new FileManager.FileManager_writeToFile((FileManager) null, (RandomAccessFile) null, byteBuffer0, 1L);
  }

  @Test
  public void test06()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = new EnvironmentConfig();
      environmentConfig0.setReadOnly(true);
      EnvironmentImpl environmentImpl0 = null;
      try {
        environmentImpl0 = new EnvironmentImpl((File) null, environmentConfig0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.FileManager", e);
      }
  }

  @Test
  public void test07()  throws Throwable  {
      FileManager fileManager0 = null;
      try {
        fileManager0 = new FileManager((EnvironmentImpl) null, (File) null, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.FileManager", e);
      }
  }

  @Test
  public void test08()  throws Throwable  {
      FileManager.FileMode fileManager_FileMode0 = FileManager.FileMode.READ_MODE;
      String string0 = fileManager_FileMode0.getModeValue();
      assertEquals("r", string0);
  }

  @Test
  public void test09()  throws Throwable  {
      String[] stringArray0 = new String[10];
      // Undeclared exception!
      try { 
        FileManager.listFiles((File) null, stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.FileManager", e);
      }
  }

  @Test
  public void test10()  throws Throwable  {
      String string0 = FileManager.getFileName((-34L), "N IN=");
      assertEquals("ffffffdeN IN=", string0);
  }

  @Test
  public void test11()  throws Throwable  {
      int int0 = FileManager.firstLogEntryOffset();
      assertEquals(38, int0);
  }

  @Test
  public void test12()  throws Throwable  {
      EnvironmentConfig environmentConfig0 = new EnvironmentConfig();
      EnvironmentImpl environmentImpl0 = null;
      try {
        environmentImpl0 = new EnvironmentImpl((File) null, environmentConfig0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.FileManager", e);
      }
  }

  @Test
  public void test13()  throws Throwable  {
      FileManager.FileManager_readFromFile fileManager_FileManager_readFromFile0 = new FileManager.FileManager_readFromFile((FileManager) null, (RandomAccessFile) null, (ByteBuffer) null, 0);
      fileManager_FileManager_readFromFile0.execute();
  }
}
