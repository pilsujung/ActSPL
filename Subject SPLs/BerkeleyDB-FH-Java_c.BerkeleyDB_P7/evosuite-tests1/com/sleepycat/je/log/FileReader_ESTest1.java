/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 21 19:41:01 KST 2017
 */

package com.sleepycat.je.log;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.fail;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.sleepycat.je.dbi.EnvironmentImpl;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class FileReader_ESTest1 extends FileReader_ESTest_scaffolding1 {

  @Test
  public void test0()  throws Throwable  {
      FileReader.FileReader_readNextEntry fileReader_FileReader_readNextEntry0 = new FileReader.FileReader_readNextEntry((FileReader) null);
      // Undeclared exception!
      try { 
        fileReader_FileReader_readNextEntry0.execute();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.FileReader$FileReader_readNextEntry", e);
      }
  }

  @Test
  public void test1()  throws Throwable  {
      LastFileReader lastFileReader0 = null;
      try {
        lastFileReader0 = new LastFileReader((EnvironmentImpl) null, 1009);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.FileReader", e);
      }
  }

  @Test
  public void test2()  throws Throwable  {
      FileReader.FileReader_readNextEntry fileReader_FileReader_readNextEntry0 = new FileReader.FileReader_readNextEntry((FileReader) null);
      fileReader_FileReader_readNextEntry0.hook474();
  }

  @Test
  public void test3()  throws Throwable  {
      FileReader.FileReader_readNextEntry fileReader_FileReader_readNextEntry0 = new FileReader.FileReader_readNextEntry((FileReader) null);
      fileReader_FileReader_readNextEntry0.hook475();
  }

  @Test
  public void test4()  throws Throwable  {
      FileReader.FileReader_readNextEntry fileReader_FileReader_readNextEntry0 = new FileReader.FileReader_readNextEntry((FileReader) null);
      fileReader_FileReader_readNextEntry0.hook468();
  }

  
}
