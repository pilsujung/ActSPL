/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 07 18:59:15 KST 2017
 */

package org.prevayler.implementation.snapshot;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.fail;

import java.io.IOException;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class NullSnapshotManager_ESTest3 extends NullSnapshotManager_ESTest_scaffolding3 {

  @Test
  public void test0()  throws Throwable  {
      NullSnapshotManager nullSnapshotManager0 = new NullSnapshotManager((Object) "r'i592sU6-uOC},", "r'i592sU6-uOC},");
      try { 
        nullSnapshotManager0.writeSnapshot("r'i592sU6-uOC},", 1L);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // r'i592sU6-uOC},
         //
         assertThrownBy("org.prevayler.implementation.snapshot.NullSnapshotManager", e);
      }
  }
}
