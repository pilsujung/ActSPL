/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 00:49:45 KST 2017
 */

package com.sleepycat.je.log;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.sleepycat.je.EnvironmentConfig;
import com.sleepycat.je.dbi.EnvironmentImpl;
import com.sleepycat.je.log.FileManager;
import java.io.File;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import sun.nio.cs.ext.MS949;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class FileManager_ESTest2 extends FileManager_ESTest_scaffolding2 {

  @Test
  public void test00()  throws Throwable  {
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("Environment was opened for read-write access.");
      FileManager.FileManager_readFromFile fileManager_FileManager_readFromFile0 = new FileManager.FileManager_readFromFile((FileManager) null, (RandomAccessFile) null, byteBuffer0, 1311L);
  }

  @Test
  public void test01()  throws Throwable  {
      FileManager.FileManager_writeToFile fileManager_FileManager_writeToFile0 = new FileManager.FileManager_writeToFile((FileManager) null, (RandomAccessFile) null, (ByteBuffer) null, 20000018L);
      fileManager_FileManager_writeToFile0.pos = 444;
      // Undeclared exception!
      try { 
        fileManager_FileManager_writeToFile0.execute();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.FileManager$FileManager_writeToFile", e);
      }
  }

  @Test
  public void test02()  throws Throwable  {
      FileManager.FileManager_writeToFile fileManager_FileManager_writeToFile0 = new FileManager.FileManager_writeToFile((FileManager) null, (RandomAccessFile) null, (ByteBuffer) null, 20000018L);
      fileManager_FileManager_writeToFile0.size = (-3152);
      // Undeclared exception!
      try { 
        fileManager_FileManager_writeToFile0.execute();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.FileManager$FileManager_writeToFile", e);
      }
  }

  @Test
  public void test03()  throws Throwable  {
      FileManager.FileManager_writeToFile fileManager_FileManager_writeToFile0 = new FileManager.FileManager_writeToFile((FileManager) null, (RandomAccessFile) null, (ByteBuffer) null, 20000018L);
      fileManager_FileManager_writeToFile0.origLimit = 1167;
      // Undeclared exception!
      try { 
        fileManager_FileManager_writeToFile0.execute();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.FileManager$FileManager_writeToFile", e);
      }
  }

  @Test
  public void test04()  throws Throwable  {
      FileManager.FileManager_writeToFile fileManager_FileManager_writeToFile0 = new FileManager.FileManager_writeToFile((FileManager) null, (RandomAccessFile) null, (ByteBuffer) null, 20000018L);
      fileManager_FileManager_writeToFile0.bytesWritten = 902;
      // Undeclared exception!
      try { 
        fileManager_FileManager_writeToFile0.execute();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.FileManager$FileManager_writeToFile", e);
      }
  }



  @Test
  public void test07()  throws Throwable  {
      String[] stringArray0 = new String[1];
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
  public void test08()  throws Throwable  {
      String string0 = FileManager.getFileName(20000039L, "\"Kw%t=dx)3in");
      assertEquals("01312d27\"Kw%t=dx)3in", string0);
  }


  @Test
  public void test10()  throws Throwable  {
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
  public void test11()  throws Throwable  {
      FileManager.FileManager_readFromFile fileManager_FileManager_readFromFile0 = new FileManager.FileManager_readFromFile((FileManager) null, (RandomAccessFile) null, (ByteBuffer) null, (-893L));
      // Undeclared exception!
      try { 
        fileManager_FileManager_readFromFile0.execute();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.FileManager$FileManager_readFromFile", e);
      }
  }

  @Test
  public void test12()  throws Throwable  {
      MS949 mS949_0 = (MS949)Charset.defaultCharset();
      ByteBuffer byteBuffer0 = mS949_0.encode("\"Kw%t=dx)3in");
      FileManager.FileManager_writeToFile fileManager_FileManager_writeToFile0 = new FileManager.FileManager_writeToFile((FileManager) null, (RandomAccessFile) null, byteBuffer0, 9223372036854775807L);
      // Undeclared exception!
      try { 
        fileManager_FileManager_writeToFile0.execute();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.FileManager$FileManager_writeToFile", e);
      }
  }
}
