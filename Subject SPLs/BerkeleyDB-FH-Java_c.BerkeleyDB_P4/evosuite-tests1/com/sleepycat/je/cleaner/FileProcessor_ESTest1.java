/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 21 19:00:30 KST 2017
 */

package com.sleepycat.je.cleaner;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.util.HashMap;
import java.util.Map;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.sleepycat.je.dbi.DatabaseId;
import com.sleepycat.je.dbi.DbTree;
import com.sleepycat.je.dbi.EnvironmentImpl;
import com.sleepycat.je.tree.FileSummaryLN;
import com.sleepycat.je.tree.IN;
import com.sleepycat.je.tree.LN;
import com.sleepycat.je.tree.TreeLocation;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class FileProcessor_ESTest1 extends FileProcessor_ESTest_scaffolding1 {

  @Test
  public void test00()  throws Throwable  {
      Long long0 = new Long((-9223372036854775808L));
      FileProcessor.FileProcessor_processFile fileProcessor_FileProcessor_processFile0 = new FileProcessor.FileProcessor_processFile((FileProcessor) null, long0);
      // Undeclared exception!
      try { 
        fileProcessor_FileProcessor_processFile0.execute();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.cleaner.FileProcessor", e);
      }
  }

  @Test
  public void test01()  throws Throwable  {
      Long long0 = new Long(3008L);
      TreeLocation treeLocation0 = new TreeLocation();
      LN lN0 = new LN();
      DatabaseId databaseId0 = DbTree.ID_DB_ID;
      LNInfo lNInfo0 = new LNInfo(lN0, databaseId0, (byte[]) null, (byte[]) null);
      Object object0 = new Object();
      HashMap<IN, Object> hashMap0 = new HashMap<IN, Object>();
      FileProcessor.FileProcessor_processLN fileProcessor_FileProcessor_processLN0 = new FileProcessor.FileProcessor_processLN((FileProcessor) null, long0, treeLocation0, (Long) (-1L), lNInfo0, object0, hashMap0);
      // Undeclared exception!
      try { 
        fileProcessor_FileProcessor_processLN0.execute();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.cleaner.FileProcessor", e);
      }
  }

  @Test
  public void test03()  throws Throwable  {
      Long long0 = new Long((-1L));
      TreeLocation treeLocation0 = new TreeLocation();
      FileSummaryLN fileSummaryLN0 = new FileSummaryLN();
      DatabaseId databaseId0 = DbTree.NAME_DB_ID;
      LNInfo lNInfo0 = new LNInfo((LN) fileSummaryLN0, databaseId0, (byte[]) null, (byte[]) null);
      FileProcessor.FileProcessor_processLN fileProcessor_FileProcessor_processLN0 = new FileProcessor.FileProcessor_processLN((FileProcessor) null, long0, treeLocation0, long0, lNInfo0, databaseId0, (Map) null);
      fileProcessor_FileProcessor_processLN0.hook135();
  }

  @Test
  public void test06()  throws Throwable  {
      Long long0 = new Long((-1L));
      TreeLocation treeLocation0 = new TreeLocation();
      FileSummaryLN fileSummaryLN0 = new FileSummaryLN();
      DatabaseId databaseId0 = DbTree.NAME_DB_ID;
      LNInfo lNInfo0 = new LNInfo((LN) fileSummaryLN0, databaseId0, (byte[]) null, (byte[]) null);
      FileProcessor.FileProcessor_processLN fileProcessor_FileProcessor_processLN0 = new FileProcessor.FileProcessor_processLN((FileProcessor) null, long0, treeLocation0, (Long) treeLocation0.childLsn, lNInfo0, databaseId0, (Map) null);
      fileProcessor_FileProcessor_processLN0.hook126();
  }

  @Test
  public void test09()  throws Throwable  {
      Long long0 = new Long((-1L));
      TreeLocation treeLocation0 = new TreeLocation();
      HashMap<Object, String> hashMap0 = new HashMap<Object, String>();
      FileProcessor.FileProcessor_processLN fileProcessor_FileProcessor_processLN0 = new FileProcessor.FileProcessor_processLN((FileProcessor) null, long0, treeLocation0, long0, (LNInfo) null, long0, hashMap0);
      fileProcessor_FileProcessor_processLN0.hook133();
  }

  @Test
  public void test10()  throws Throwable  {
      Long long0 = new Long((-303L));
      FileProcessor.FileProcessor_processFile fileProcessor_FileProcessor_processFile0 = new FileProcessor.FileProcessor_processFile((FileProcessor) null, long0);
      fileProcessor_FileProcessor_processFile0.hook137();
  }

  @Test
  public void test11()  throws Throwable  {
      Long long0 = new Long((-9223372036854775808L));
      FileProcessor.FileProcessor_processFile fileProcessor_FileProcessor_processFile0 = new FileProcessor.FileProcessor_processFile((FileProcessor) null, long0);
      fileProcessor_FileProcessor_processFile0.hook154();
  }

  @Test
  public void test12()  throws Throwable  {
      Long long0 = new Long((-9223372036854775808L));
      FileProcessor.FileProcessor_processFile fileProcessor_FileProcessor_processFile0 = new FileProcessor.FileProcessor_processFile((FileProcessor) null, long0);
      fileProcessor_FileProcessor_processFile0.hook129();
  }

  @Test
  public void test13()  throws Throwable  {
      Long long0 = new Long((-9223372036854775808L));
      FileProcessor.FileProcessor_processFile fileProcessor_FileProcessor_processFile0 = new FileProcessor.FileProcessor_processFile((FileProcessor) null, long0);
      fileProcessor_FileProcessor_processFile0.hook128();
  }

  @Test
  public void test16()  throws Throwable  {
      Long long0 = new Long((-9223372036854775808L));
      FileProcessor.FileProcessor_processFile fileProcessor_FileProcessor_processFile0 = new FileProcessor.FileProcessor_processFile((FileProcessor) null, long0);
      // Undeclared exception!
      try { 
        fileProcessor_FileProcessor_processFile0.hook130();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.cleaner.FileProcessor", e);
      }
  }

  @Test
  public void test17()  throws Throwable  {
      Long long0 = new Long((-1L));
      FileProcessor.FileProcessor_processFile fileProcessor_FileProcessor_processFile0 = new FileProcessor.FileProcessor_processFile((FileProcessor) null, long0);
      fileProcessor_FileProcessor_processFile0.hook120();
  }

  @Test
  public void test18()  throws Throwable  {
      FileProcessor.FileProcessor_processFile fileProcessor_FileProcessor_processFile0 = new FileProcessor.FileProcessor_processFile((FileProcessor) null, (Long) (-1L));
      fileProcessor_FileProcessor_processFile0.hook127();
  }

  @Test
  public void test21()  throws Throwable  {
      Long long0 = new Long(384L);
      FileProcessor.FileProcessor_processFile fileProcessor_FileProcessor_processFile0 = new FileProcessor.FileProcessor_processFile((FileProcessor) null, long0);
      fileProcessor_FileProcessor_processFile0.hook147();
  }

  @Test
  public void test24()  throws Throwable  {
      Long long0 = new Long((-1100L));
      FileProcessor.FileProcessor_processFile fileProcessor_FileProcessor_processFile0 = new FileProcessor.FileProcessor_processFile((FileProcessor) null, long0);
      fileProcessor_FileProcessor_processFile0.hook119();
  }

  @Test
  public void test25()  throws Throwable  {
      FileSelector fileSelector0 = new FileSelector();
      FileProcessor fileProcessor0 = new FileProcessor("", (EnvironmentImpl) null, (Cleaner) null, (UtilizationProfile) null, fileSelector0);
      assertEquals(0, fileProcessor0.getQueueSize());
  }
}
