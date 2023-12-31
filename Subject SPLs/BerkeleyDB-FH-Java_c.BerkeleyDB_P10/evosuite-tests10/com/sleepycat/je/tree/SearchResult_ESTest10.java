/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 01:58:41 KST 2017
 */

package com.sleepycat.je.tree;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class SearchResult_ESTest10 extends SearchResult_ESTest_scaffolding10 {

  @Test
  public void test0()  throws Throwable  {
      SearchResult searchResult0 = new SearchResult();
      assertFalse(searchResult0.exactParentFound);
      
      searchResult0.exactParentFound = true;
      String string0 = searchResult0.toString();
      assertEquals("exactParentFound=true keepSearching=true parent=null index=-1 childNotResident=false", string0);
  }


}
