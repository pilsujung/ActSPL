/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 21 23:45:53 KST 2017
 */

package com.sleepycat.je.cleaner;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.sleepycat.je.DatabaseException;
import com.sleepycat.je.cleaner.Cleaner;
import com.sleepycat.je.cleaner.FileProcessor;
import com.sleepycat.je.cleaner.FileSelector;
import com.sleepycat.je.cleaner.LNInfo;
import com.sleepycat.je.cleaner.PackedOffsets;
import com.sleepycat.je.cleaner.UtilizationProfile;
import com.sleepycat.je.dbi.DatabaseId;
import com.sleepycat.je.dbi.DatabaseImpl;
import com.sleepycat.je.dbi.DbTree;
import com.sleepycat.je.dbi.EnvironmentImpl;
import com.sleepycat.je.log.LogEntryType;
import com.sleepycat.je.tree.DIN;
import com.sleepycat.je.tree.FileSummaryLN;
import com.sleepycat.je.tree.IN;
import com.sleepycat.je.tree.LN;
import com.sleepycat.je.tree.MapLN;
import com.sleepycat.je.tree.NameLN;
import com.sleepycat.je.tree.SearchResult;
import com.sleepycat.je.tree.Tree;
import com.sleepycat.je.tree.TreeLocation;
import java.io.IOException;
import java.util.HashMap;
import java.util.Set;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class FileProcessor_ESTest6 extends FileProcessor_ESTest_scaffolding6 {

  @Test
  public void test00()  throws Throwable  {
      FileSelector fileSelector0 = new FileSelector();
      FileProcessor fileProcessor0 = new FileProcessor("", (EnvironmentImpl) null, (Cleaner) null, (UtilizationProfile) null, fileSelector0);
      DatabaseImpl databaseImpl0 = new DatabaseImpl();
      boolean boolean0 = fileProcessor0.hook159(databaseImpl0, true);
      //  // Unstable assertion: assertEquals(305L, databaseImpl0.getEofNodeId());
      //  // Unstable assertion: assertTrue(boolean0);
  }

  @Test
  public void test02()  throws Throwable  {
      Long long0 = new Long((-1L));
      FileProcessor.FileProcessor_processFile fileProcessor_FileProcessor_processFile0 = new FileProcessor.FileProcessor_processFile((FileProcessor) null, long0);
      fileProcessor_FileProcessor_processFile0.lookAheadCacheSize = (int) (byte)116;
      fileProcessor_FileProcessor_processFile0.hook118();
  }

  @Test
  public void test03()  throws Throwable  {
      Long long0 = new Long((-1L));
      FileProcessor.FileProcessor_processFile fileProcessor_FileProcessor_processFile0 = new FileProcessor.FileProcessor_processFile((FileProcessor) null, long0);
      fileProcessor_FileProcessor_processFile0.adjustMem = 673;
      fileProcessor_FileProcessor_processFile0.hook118();
  }

  @Test
  public void test04()  throws Throwable  {
      FileProcessor.FileProcessor_processFile fileProcessor_FileProcessor_processFile0 = new FileProcessor.FileProcessor_processFile((FileProcessor) null, (Long) null);
      fileProcessor_FileProcessor_processFile0.readBufferSize = 1;
      // Undeclared exception!
      try { 
        fileProcessor_FileProcessor_processFile0.hook162();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.cleaner.FileProcessor$FileProcessor_processFile", e);
      }
  }

  @Test
  public void test05()  throws Throwable  {
      FileProcessor.FileProcessor_processFile fileProcessor_FileProcessor_processFile0 = new FileProcessor.FileProcessor_processFile((FileProcessor) null, (Long) null);
      fileProcessor_FileProcessor_processFile0.readBufferSize = 3986;
      // Undeclared exception!
      try { 
        fileProcessor_FileProcessor_processFile0.hook161();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.cleaner.FileProcessor$FileProcessor_processFile", e);
      }
  }

  @Test
  public void test06()  throws Throwable  {
      FileSelector fileSelector0 = new FileSelector();
      FileProcessor fileProcessor0 = new FileProcessor("", (EnvironmentImpl) null, (Cleaner) null, (UtilizationProfile) null, fileSelector0);
      Long long0 = new Long(32767L);
      // Undeclared exception!
      try { 
        fileProcessor0.hook140();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.cleaner.FileProcessor", e);
      }
  }

  @Test
  public void test07()  throws Throwable  {
      FileProcessor.FileProcessor_processFile fileProcessor_FileProcessor_processFile0 = new FileProcessor.FileProcessor_processFile((FileProcessor) null, (Long) null);
      FileSummaryLN fileSummaryLN0 = new FileSummaryLN();
      PackedOffsets packedOffsets0 = fileSummaryLN0.getObsoleteOffsets();
      fileProcessor_FileProcessor_processFile0.obsoleteOffsets = packedOffsets0;
      // Undeclared exception!
      try { 
        fileProcessor_FileProcessor_processFile0.hook161();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.cleaner.FileProcessor", e);
      }
  }

  @Test
  public void test08()  throws Throwable  {
      FileSelector fileSelector0 = new FileSelector();
      Long long0 = new Long(32767L);
      FileProcessor fileProcessor0 = new FileProcessor("", (EnvironmentImpl) null, (Cleaner) null, (UtilizationProfile) null, fileSelector0);
      FileProcessor.FileProcessor_processFile fileProcessor_FileProcessor_processFile0 = new FileProcessor.FileProcessor_processFile(fileProcessor0, long0);
      // Undeclared exception!
      try { 
        fileProcessor_FileProcessor_processFile0.hook156();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.cleaner.FileProcessor$FileProcessor_processFile", e);
      }
  }

  @Test
  public void test09()  throws Throwable  {
      FileProcessor.FileProcessor_processFile fileProcessor_FileProcessor_processFile0 = new FileProcessor.FileProcessor_processFile((FileProcessor) null, (Long) null);
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
  public void test10()  throws Throwable  {
      FileSelector fileSelector0 = new FileSelector();
      FileProcessor fileProcessor0 = new FileProcessor("", (EnvironmentImpl) null, (Cleaner) null, (UtilizationProfile) null, fileSelector0);
      // Undeclared exception!
      try { 
        fileProcessor0.hook159((DatabaseImpl) null, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.cleaner.FileProcessor", e);
      }
  }

  @Test
  public void test11()  throws Throwable  {
      FileSelector fileSelector0 = new FileSelector();
      FileProcessor fileProcessor0 = new FileProcessor("", (EnvironmentImpl) null, (Cleaner) null, (UtilizationProfile) null, fileSelector0);
      // Undeclared exception!
      try { 
        fileProcessor0.doClean(false, false, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.cleaner.FileProcessor", e);
      }
  }

  @Test
  public void test12()  throws Throwable  {
      FileSelector fileSelector0 = new FileSelector();
      FileProcessor fileProcessor0 = new FileProcessor("", (EnvironmentImpl) null, (Cleaner) null, (UtilizationProfile) null, fileSelector0);
      DatabaseImpl databaseImpl0 = new DatabaseImpl();
      Tree tree0 = new Tree();
      SearchResult searchResult0 = new SearchResult();
      // Undeclared exception!
      try { 
        fileProcessor0.hook134(tree0, databaseImpl0, (IN) null, 0, searchResult0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.cleaner.FileProcessor", e);
      }
  }

  @Test
  public void test13()  throws Throwable  {
      FileSelector fileSelector0 = new FileSelector();
      FileProcessor fileProcessor0 = new FileProcessor("", (EnvironmentImpl) null, (Cleaner) null, (UtilizationProfile) null, fileSelector0);
      Tree tree0 = new Tree();
      // Undeclared exception!
      try { 
        fileProcessor0.hook134(tree0, (DatabaseImpl) null, (IN) null, 4294967295L, (SearchResult) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.cleaner.FileProcessor", e);
      }
  }

  @Test
  public void test14()  throws Throwable  {
      FileProcessor.FileProcessor_processFile fileProcessor_FileProcessor_processFile0 = new FileProcessor.FileProcessor_processFile((FileProcessor) null, (Long) null);
      Set set0 = LogEntryType.getAllTypes();
      fileProcessor_FileProcessor_processFile0.checkPendingDbSet = set0;
      // Undeclared exception!
      try { 
        fileProcessor_FileProcessor_processFile0.hook155();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // com.sleepycat.je.log.LogEntryType cannot be cast to com.sleepycat.je.dbi.DatabaseId
         //
         assertThrownBy("com.sleepycat.je.cleaner.FileProcessor$FileProcessor_processFile", e);
      }
  }

  @Test
  public void test15()  throws Throwable  {
      FileProcessor.FileProcessor_processFile fileProcessor_FileProcessor_processFile0 = new FileProcessor.FileProcessor_processFile((FileProcessor) null, (Long) null);
      fileProcessor_FileProcessor_processFile0.isLN = true;
      // Undeclared exception!
      try { 
        fileProcessor_FileProcessor_processFile0.hook147();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.cleaner.FileProcessor", e);
      }
  }

  @Test
  public void test16()  throws Throwable  {
      FileSelector fileSelector0 = new FileSelector();
      FileProcessor fileProcessor0 = new FileProcessor("", (EnvironmentImpl) null, (Cleaner) null, (UtilizationProfile) null, fileSelector0);
      Long long0 = new Long(32767L);
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      TreeLocation treeLocation0 = new TreeLocation();
      FileProcessor.FileProcessor_processLN fileProcessor_FileProcessor_processLN0 = new FileProcessor.FileProcessor_processLN(fileProcessor0, long0, treeLocation0, (Long) treeLocation0.childLsn, (LNInfo) null, "", hashMap0);
      fileProcessor_FileProcessor_processLN0.hook126();
  }

  @Test
  public void test17()  throws Throwable  {
      FileSelector fileSelector0 = new FileSelector();
      Long long0 = new Long(32767L);
      TreeLocation treeLocation0 = new TreeLocation();
      MapLN mapLN0 = new MapLN();
      DatabaseId databaseId0 = new DatabaseId();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      FileProcessor fileProcessor0 = new FileProcessor("", (EnvironmentImpl) null, (Cleaner) null, (UtilizationProfile) null, fileSelector0);
      LNInfo lNInfo0 = new LNInfo((LN) mapLN0, databaseId0, treeLocation0.lnKey, (byte[]) null);
      FileProcessor.FileProcessor_processLN fileProcessor_FileProcessor_processLN0 = new FileProcessor.FileProcessor_processLN(fileProcessor0, long0, treeLocation0, long0, lNInfo0, long0, hashMap0);
      fileProcessor_FileProcessor_processLN0.hook149();
      //  // Unstable assertion: assertEquals(230L, mapLN0.getLastId());
  }

  @Test
  public void test18()  throws Throwable  {
      FileSelector fileSelector0 = new FileSelector();
      FileProcessor fileProcessor0 = new FileProcessor("", (EnvironmentImpl) null, (Cleaner) null, (UtilizationProfile) null, fileSelector0);
      Long long0 = new Long(32767L);
      TreeLocation treeLocation0 = new TreeLocation();
      MapLN mapLN0 = new MapLN();
      DatabaseId databaseId0 = DbTree.ID_DB_ID;
      LNInfo lNInfo0 = new LNInfo((LN) mapLN0, databaseId0, (byte[]) null, (byte[]) null);
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      FileProcessor.FileProcessor_processLN fileProcessor_FileProcessor_processLN0 = new FileProcessor.FileProcessor_processLN(fileProcessor0, long0, treeLocation0, long0, lNInfo0, treeLocation0, hashMap0);
      fileProcessor_FileProcessor_processLN0.isDupCountLN = true;
      fileProcessor_FileProcessor_processLN0.hook133();
      //  // Unstable assertion: assertEquals(200L, mapLN0.getLastId());
  }

  @Test
  public void test19()  throws Throwable  {
      FileSelector fileSelector0 = new FileSelector();
      FileProcessor fileProcessor0 = new FileProcessor("", (EnvironmentImpl) null, (Cleaner) null, (UtilizationProfile) null, fileSelector0);
      Long long0 = new Long(32767L);
      TreeLocation treeLocation0 = new TreeLocation();
      MapLN mapLN0 = new MapLN();
      DatabaseId databaseId0 = DbTree.ID_DB_ID;
      LNInfo lNInfo0 = new LNInfo((LN) mapLN0, databaseId0, (byte[]) null, (byte[]) null);
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      FileProcessor.FileProcessor_processLN fileProcessor_FileProcessor_processLN0 = new FileProcessor.FileProcessor_processLN(fileProcessor0, long0, treeLocation0, long0, lNInfo0, treeLocation0, hashMap0);
      // Undeclared exception!
      try { 
        fileProcessor_FileProcessor_processLN0.hook158();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.cleaner.FileProcessor$FileProcessor_processLN", e);
      }
  }

  @Test
  public void test20()  throws Throwable  {
      FileSelector fileSelector0 = new FileSelector();
      FileProcessor fileProcessor0 = new FileProcessor("", (EnvironmentImpl) null, (Cleaner) null, (UtilizationProfile) null, fileSelector0);
      Long long0 = new Long(32767L);
      TreeLocation treeLocation0 = new TreeLocation();
      MapLN mapLN0 = new MapLN();
      DatabaseId databaseId0 = DbTree.ID_DB_ID;
      LNInfo lNInfo0 = new LNInfo((LN) mapLN0, databaseId0, (byte[]) null, (byte[]) null);
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      FileProcessor.FileProcessor_processLN fileProcessor_FileProcessor_processLN0 = new FileProcessor.FileProcessor_processLN(fileProcessor0, long0, treeLocation0, long0, lNInfo0, treeLocation0, hashMap0);
      // Undeclared exception!
      try { 
        fileProcessor_FileProcessor_processLN0.hook157();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.cleaner.FileProcessor$FileProcessor_processLN", e);
      }
  }

  @Test
  public void test21()  throws Throwable  {
      FileSelector fileSelector0 = new FileSelector();
      FileProcessor fileProcessor0 = new FileProcessor("", (EnvironmentImpl) null, (Cleaner) null, (UtilizationProfile) null, fileSelector0);
      Long long0 = new Long(32767L);
      TreeLocation treeLocation0 = new TreeLocation();
      MapLN mapLN0 = new MapLN();
      DatabaseId databaseId0 = DbTree.ID_DB_ID;
      LNInfo lNInfo0 = new LNInfo((LN) mapLN0, databaseId0, (byte[]) null, (byte[]) null);
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      FileProcessor.FileProcessor_processLN fileProcessor_FileProcessor_processLN0 = new FileProcessor.FileProcessor_processLN(fileProcessor0, long0, treeLocation0, long0, lNInfo0, treeLocation0, hashMap0);
      fileProcessor_FileProcessor_processLN0.hook148();
      //  // Unstable assertion: assertEquals(120L, mapLN0.getLastId());
  }

  @Test
  public void test23()  throws Throwable  {
      FileSelector fileSelector0 = new FileSelector();
      FileProcessor fileProcessor0 = new FileProcessor("", (EnvironmentImpl) null, (Cleaner) null, (UtilizationProfile) null, fileSelector0);
      TreeLocation treeLocation0 = new TreeLocation();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      DatabaseId databaseId0 = new DatabaseId();
      NameLN nameLN0 = new NameLN(databaseId0);
      LNInfo lNInfo0 = new LNInfo((LN) nameLN0, databaseId0, treeLocation0.lnKey, treeLocation0.lnKey);
      DIN dIN0 = new DIN();
      FileProcessor.FileProcessor_processLN fileProcessor_FileProcessor_processLN0 = new FileProcessor.FileProcessor_processLN(fileProcessor0, (Long) treeLocation0.childLsn, treeLocation0, (Long) treeLocation0.childLsn, lNInfo0, dIN0, hashMap0);
      fileProcessor_FileProcessor_processLN0.hook150();
      //  // Unstable assertion: assertEquals(58L, dIN0.getLastId());
      //  // Unstable assertion: assertEquals(58L, nameLN0.getLastId());
  }

  @Test
  public void test24()  throws Throwable  {
      FileSelector fileSelector0 = new FileSelector();
      TreeLocation treeLocation0 = new TreeLocation();
      MapLN mapLN0 = new MapLN();
      DatabaseId databaseId0 = new DatabaseId();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      FileProcessor fileProcessor0 = new FileProcessor("", (EnvironmentImpl) null, (Cleaner) null, (UtilizationProfile) null, fileSelector0);
      LNInfo lNInfo0 = new LNInfo((LN) mapLN0, databaseId0, treeLocation0.lnKey, (byte[]) null);
      FileProcessor.FileProcessor_processLN fileProcessor_FileProcessor_processLN0 = new FileProcessor.FileProcessor_processLN(fileProcessor0, (Long) treeLocation0.childLsn, treeLocation0, (Long) treeLocation0.childLsn, lNInfo0, treeLocation0.childLsn, hashMap0);
      fileProcessor_FileProcessor_processLN0.hook135();
      //  // Unstable assertion: assertEquals(32L, mapLN0.getLastId());
  }

  @Test
  public void test25()  throws Throwable  {
      FileSelector fileSelector0 = new FileSelector();
      FileProcessor fileProcessor0 = new FileProcessor("", (EnvironmentImpl) null, (Cleaner) null, (UtilizationProfile) null, fileSelector0);
      Long long0 = new Long(32767L);
      FileProcessor.FileProcessor_processFile fileProcessor_FileProcessor_processFile0 = new FileProcessor.FileProcessor_processFile(fileProcessor0, long0);
      fileProcessor_FileProcessor_processFile0.hook137();
  }

  @Test
  public void test27()  throws Throwable  {
      FileProcessor.FileProcessor_processFile fileProcessor_FileProcessor_processFile0 = new FileProcessor.FileProcessor_processFile((FileProcessor) null, (Long) null);
      fileProcessor_FileProcessor_processFile0.hook127();
  }

  @Test
  public void test28()  throws Throwable  {
      FileSelector fileSelector0 = new FileSelector();
      TreeLocation treeLocation0 = new TreeLocation();
      FileProcessor fileProcessor0 = new FileProcessor("", (EnvironmentImpl) null, (Cleaner) null, (UtilizationProfile) null, fileSelector0);
      FileProcessor.FileProcessor_processFile fileProcessor_FileProcessor_processFile0 = new FileProcessor.FileProcessor_processFile(fileProcessor0, (Long) treeLocation0.childLsn);
      // Undeclared exception!
      try { 
        fileProcessor_FileProcessor_processFile0.hook146();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.cleaner.FileProcessor$FileProcessor_processFile", e);
      }
  }

  @Test
  public void test30()  throws Throwable  {
      FileProcessor.FileProcessor_processFile fileProcessor_FileProcessor_processFile0 = new FileProcessor.FileProcessor_processFile((FileProcessor) null, (Long) null);
      fileProcessor_FileProcessor_processFile0.hook147();
  }

  @Test
  public void test31()  throws Throwable  {
      FileProcessor.FileProcessor_processFile fileProcessor_FileProcessor_processFile0 = new FileProcessor.FileProcessor_processFile((FileProcessor) null, (Long) null);
      fileProcessor_FileProcessor_processFile0.hook154();
      fileProcessor_FileProcessor_processFile0.hook155();
  }

  @Test
  public void test32()  throws Throwable  {
      FileProcessor.FileProcessor_processFile fileProcessor_FileProcessor_processFile0 = new FileProcessor.FileProcessor_processFile((FileProcessor) null, (Long) null);
      fileProcessor_FileProcessor_processFile0.hook129();
  }

  @Test
  public void test34()  throws Throwable  {
      FileSelector fileSelector0 = new FileSelector();
      Long long0 = new Long(32767L);
      FileProcessor fileProcessor0 = new FileProcessor("", (EnvironmentImpl) null, (Cleaner) null, (UtilizationProfile) null, fileSelector0);
      FileProcessor.FileProcessor_processFile fileProcessor_FileProcessor_processFile0 = new FileProcessor.FileProcessor_processFile(fileProcessor0, long0);
      // Undeclared exception!
      try { 
        fileProcessor_FileProcessor_processFile0.hook145();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.cleaner.FileProcessor$FileProcessor_processFile", e);
      }
  }

  @Test
  public void test36()  throws Throwable  {
      FileSelector fileSelector0 = new FileSelector();
      FileProcessor fileProcessor0 = new FileProcessor("", (EnvironmentImpl) null, (Cleaner) null, (UtilizationProfile) null, fileSelector0);
      // Undeclared exception!
      try { 
        fileProcessor0.hook136((IN) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.cleaner.FileProcessor", e);
      }
  }

  @Test
  public void test38()  throws Throwable  {
      FileSelector fileSelector0 = new FileSelector();
      FileProcessor fileProcessor0 = new FileProcessor("", (EnvironmentImpl) null, (Cleaner) null, (UtilizationProfile) null, fileSelector0);
      DatabaseImpl databaseImpl0 = new DatabaseImpl();
      boolean boolean0 = fileProcessor0.hook159(databaseImpl0, false);
      //  // Unstable assertion: assertEquals(1L, databaseImpl0.getEofNodeId());
      //  // Unstable assertion: assertFalse(boolean0);
  }

  @Test
  public void test39()  throws Throwable  {
      FileSelector fileSelector0 = new FileSelector();
      FileProcessor fileProcessor0 = new FileProcessor("CleanerRun ", (EnvironmentImpl) null, (Cleaner) null, (UtilizationProfile) null, fileSelector0);
      // Undeclared exception!
      try { 
        fileProcessor0.nDeadlockRetries();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.cleaner.FileProcessor", e);
      }
  }

  @Test
  public void test40()  throws Throwable  {
      FileProcessor fileProcessor0 = new FileProcessor("l", (EnvironmentImpl) null, (Cleaner) null, (UtilizationProfile) null, (FileSelector) null);
      fileProcessor0.clearEnv();
      assertEquals(0, fileProcessor0.getNWakeupRequests());
  }

  @Test
  public void test41()  throws Throwable  {
      FileSelector fileSelector0 = new FileSelector();
      FileProcessor fileProcessor0 = new FileProcessor("", (EnvironmentImpl) null, (Cleaner) null, (UtilizationProfile) null, fileSelector0);
      String string0 = fileProcessor0.toString();
      assertEquals("<Cleaner name=\"\"/>", string0);
  }

  @Test
  public void test42()  throws Throwable  {
      FileSelector fileSelector0 = new FileSelector();
      FileProcessor fileProcessor0 = new FileProcessor("", (EnvironmentImpl) null, (Cleaner) null, (UtilizationProfile) null, fileSelector0);
      // Undeclared exception!
      try { 
        fileProcessor0.hook160((DatabaseImpl) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.cleaner.FileProcessor", e);
      }
  }

  @Test
  public void test43()  throws Throwable  {
      FileSelector fileSelector0 = new FileSelector();
      FileProcessor fileProcessor0 = new FileProcessor("", (EnvironmentImpl) null, (Cleaner) null, (UtilizationProfile) null, fileSelector0);
      fileProcessor0.hook144();
      assertEquals(0, fileProcessor0.getNWakeupRequests());
  }

  @Test
  public void test44()  throws Throwable  {
      FileSelector fileSelector0 = new FileSelector();
      FileProcessor fileProcessor0 = new FileProcessor("", (EnvironmentImpl) null, (Cleaner) null, (UtilizationProfile) null, fileSelector0);
      // Undeclared exception!
      try { 
        fileProcessor0.onWakeup();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.cleaner.FileProcessor", e);
      }
  }

  @Test
  public void test45()  throws Throwable  {
      FileProcessor fileProcessor0 = new FileProcessor("l", (EnvironmentImpl) null, (Cleaner) null, (UtilizationProfile) null, (FileSelector) null);
      fileProcessor0.hook123("l");
      assertFalse(fileProcessor0.isRunning());
  }

  @Test
  public void test46()  throws Throwable  {
      FileSelector fileSelector0 = new FileSelector();
      FileProcessor fileProcessor0 = new FileProcessor("", (EnvironmentImpl) null, (Cleaner) null, (UtilizationProfile) null, fileSelector0);
      IOException iOException0 = new IOException();
      fileProcessor0.hook122(iOException0);
      assertEquals("java.io.IOException", iOException0.toString());
  }

  @Test
  public void test47()  throws Throwable  {
      FileSelector fileSelector0 = new FileSelector();
      FileProcessor fileProcessor0 = new FileProcessor("", (EnvironmentImpl) null, (Cleaner) null, (UtilizationProfile) null, fileSelector0);
      fileProcessor0.hook152();
      assertFalse(fileProcessor0.isRunning());
  }

  @Test
  public void test48()  throws Throwable  {
      FileSelector fileSelector0 = new FileSelector();
      FileProcessor fileProcessor0 = new FileProcessor("", (EnvironmentImpl) null, (Cleaner) null, (UtilizationProfile) null, fileSelector0);
      fileProcessor0.hook142();
      assertEquals(0, fileProcessor0.getNWakeupRequests());
  }

  @Test
  public void test49()  throws Throwable  {
      FileSelector fileSelector0 = new FileSelector();
      FileProcessor fileProcessor0 = new FileProcessor("", (EnvironmentImpl) null, (Cleaner) null, (UtilizationProfile) null, fileSelector0);
      // Undeclared exception!
      try { 
        fileProcessor0.hook139("");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.cleaner.FileProcessor", e);
      }
  }

  @Test
  public void test50()  throws Throwable  {
      FileSelector fileSelector0 = new FileSelector();
      FileProcessor fileProcessor0 = new FileProcessor("", (EnvironmentImpl) null, (Cleaner) null, (UtilizationProfile) null, fileSelector0);
      try { 
        fileProcessor0.addToQueue((Object) null);
        fail("Expecting exception: DatabaseException");
      
      } catch(DatabaseException e) {
         //
         // Cleaner.addToQueue should never be called.
         //
         assertThrownBy("com.sleepycat.je.cleaner.FileProcessor", e);
      }
  }

  @Test
  public void test51()  throws Throwable  {
      FileSelector fileSelector0 = new FileSelector();
      FileProcessor fileProcessor0 = new FileProcessor("", (EnvironmentImpl) null, (Cleaner) null, (UtilizationProfile) null, fileSelector0);
      String string0 = fileProcessor0.hook141("");
      assertEquals(" nEntriesRead=0 nINsObsolete=0 nINsCleaned=0 nINsDead=0 nINsMigrated=0 nLNsObsolete=0 nLNsCleaned=0 nLNsDead=0 nLNsMigrated=0 nLNsMarked=0 nLNQueueHits=0 nLNsLocked=0", string0);
  }

  @Test
  public void test52()  throws Throwable  {
      FileSelector fileSelector0 = new FileSelector();
      FileProcessor fileProcessor0 = new FileProcessor((String) null, (EnvironmentImpl) null, (Cleaner) null, (UtilizationProfile) null, fileSelector0);
      fileProcessor0.hook121((String) null);
      assertEquals(0, fileProcessor0.getNWakeupRequests());
  }

  @Test
  public void test53()  throws Throwable  {
      FileSelector fileSelector0 = new FileSelector();
      FileProcessor fileProcessor0 = new FileProcessor("", (EnvironmentImpl) null, (Cleaner) null, (UtilizationProfile) null, fileSelector0);
      fileProcessor0.hook153();
      assertFalse(fileProcessor0.isRunning());
  }

  @Test
  public void test54()  throws Throwable  {
      FileSelector fileSelector0 = new FileSelector();
      FileProcessor fileProcessor0 = new FileProcessor("", (EnvironmentImpl) null, (Cleaner) null, (UtilizationProfile) null, fileSelector0);
      fileProcessor0.hook151();
      assertEquals(0, fileProcessor0.getNWakeupRequests());
  }

  @Test
  public void test55()  throws Throwable  {
      FileProcessor fileProcessor0 = new FileProcessor("l", (EnvironmentImpl) null, (Cleaner) null, (UtilizationProfile) null, (FileSelector) null);
      // Undeclared exception!
      try { 
        fileProcessor0.hook125((IN) null, (DatabaseImpl) null, (-1L), true, true, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.cleaner.FileProcessor", e);
      }
  }

  @Test
  public void test56()  throws Throwable  {
      FileProcessor fileProcessor0 = new FileProcessor("l", (EnvironmentImpl) null, (Cleaner) null, (UtilizationProfile) null, (FileSelector) null);
      fileProcessor0.hook143();
      assertEquals(0, fileProcessor0.getNWakeupRequests());
  }

  @Test
  public void test57()  throws Throwable  {
      FileSelector fileSelector0 = new FileSelector();
      FileProcessor fileProcessor0 = new FileProcessor("", (EnvironmentImpl) null, (Cleaner) null, (UtilizationProfile) null, fileSelector0);
      fileProcessor0.hook138();
      assertEquals(0, fileProcessor0.getNWakeupRequests());
  }
}
