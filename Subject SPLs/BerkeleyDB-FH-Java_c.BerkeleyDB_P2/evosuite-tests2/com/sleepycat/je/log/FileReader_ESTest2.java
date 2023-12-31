/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 00:50:39 KST 2017
 */

package com.sleepycat.je.log;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.sleepycat.je.dbi.EnvironmentImpl;
import com.sleepycat.je.log.FileReader;
import com.sleepycat.je.log.LastFileReader;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class FileReader_ESTest2 extends FileReader_ESTest_scaffolding2 {


  @Test
  public void test1()  throws Throwable  {
      LastFileReader lastFileReader0 = null;
      try {
        lastFileReader0 = new LastFileReader((EnvironmentImpl) null, 526);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.FileReader", e);
      }
  }



  @Test
  public void test4()  throws Throwable  {
      FileReader.FileReader_readNextEntry fileReader_FileReader_readNextEntry0 = new FileReader.FileReader_readNextEntry((FileReader) null);
      // Undeclared exception!
      try { 
        fileReader_FileReader_readNextEntry0.hook468();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.log.FileReader$FileReader_readNextEntry", e);
      }
  }

}
