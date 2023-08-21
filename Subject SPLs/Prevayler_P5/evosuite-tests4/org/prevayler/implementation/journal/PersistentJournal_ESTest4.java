/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 07 12:23:47 KST 2017
 */

package org.prevayler.implementation.journal;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.fail;

import java.io.File;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.prevayler.implementation.PrevaylerDirectory;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class PersistentJournal_ESTest4 extends PersistentJournal_ESTest_scaffolding4 {

  @Test
  public void test0()  throws Throwable  {
      PrevaylerDirectory prevaylerDirectory0 = new PrevaylerDirectory((File) null);
      PersistentJournal persistentJournal0 = null;
      try {
        persistentJournal0 = new PersistentJournal(prevaylerDirectory0, 1788L, 0L, "journal");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.prevayler.foundation.FileManager", e);
      }
  }

  @Test
  public void test1()  throws Throwable  {
      PrevaylerDirectory prevaylerDirectory0 = new PrevaylerDirectory("");
      PersistentJournal persistentJournal0 = null;
      try {
        persistentJournal0 = new PersistentJournal(prevaylerDirectory0, (-1L), (-1L), "snapshot");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Journal filename suffix must match /[a-zA-Z0-9]*[Jj]ournal/, but 'snapshot' does not
         //
         assertThrownBy("org.prevayler.implementation.PrevaylerDirectory", e);
      }
  }
}