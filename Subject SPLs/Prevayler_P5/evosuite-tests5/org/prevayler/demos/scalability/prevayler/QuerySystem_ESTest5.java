/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 06 20:13:23 KST 2017
 */

package org.prevayler.demos.scalability.prevayler;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.fail;

import java.util.List;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.TooManyResourcesException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.prevayler.demos.scalability.RecordIterator;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class QuerySystem_ESTest5 extends QuerySystem_ESTest_scaffolding5 {


  @Test
  public void test1()  throws Throwable  {
      QuerySystem querySystem0 = new QuerySystem();
      List list0 = querySystem0.queryByName("NAME");
      assertNull(list0);
  }

  @Test
  public void test2()  throws Throwable  {
      QuerySystem querySystem0 = new QuerySystem();
      RecordIterator recordIterator0 = new RecordIterator(1945);
      querySystem0.replaceAllRecords(recordIterator0);
      assertFalse(recordIterator0.hasNext());
  }

}