/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 07 18:54:25 KST 2017
 */

package org.prevayler.implementation.publishing;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.fail;

import java.util.Map;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.prevayler.foundation.Chunk;
import org.prevayler.implementation.TransactionTimestamp;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class POBox_ESTest3 extends POBox_ESTest_scaffolding3 {

  @Test
  public void test0()  throws Throwable  {
      POBox pOBox0 = new POBox((TransactionSubscriber) null);
      pOBox0.waitToEmpty();
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte) (-88);
      byteArray0[1] = (byte) (-114);
      byteArray0[2] = (byte)82;
      byteArray0[3] = (byte) (-1);
      byteArray0[4] = (byte)0;
      Chunk chunk0 = new Chunk(byteArray0);
      Map map0 = chunk0.getParameters();
      Chunk chunk1 = new Chunk(byteArray0, (Map) map0);
      // Undeclared exception!
      try { 
        TransactionTimestamp.fromChunk(chunk0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // null
         //
         assertThrownBy("java.lang.Long", e);
      }
  }
}
