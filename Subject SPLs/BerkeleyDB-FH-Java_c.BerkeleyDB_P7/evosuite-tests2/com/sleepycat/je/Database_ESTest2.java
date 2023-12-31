/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 21 22:51:31 KST 2017
 */

package com.sleepycat.je;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.sleepycat.je.Database;
import com.sleepycat.je.Environment;
import com.sleepycat.je.SecondaryConfig;
import com.sleepycat.je.SecondaryDatabase;
import java.io.File;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class Database_ESTest2 extends Database_ESTest_scaffolding2 {

  @Test
  public void test0()  throws Throwable  {
      SecondaryConfig secondaryConfig0 = SecondaryConfig.DEFAULT;
      secondaryConfig0.getForeignKeyDatabase();
      File file0 = null;
      Environment environment0 = null;
      try {
        environment0 = new Environment(file0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.dbi.DbEnvPool", e);
      }
  }

  @Test
  public void test1()  throws Throwable  {
      SecondaryConfig secondaryConfig0 = SecondaryConfig.DEFAULT;
      SecondaryDatabase secondaryDatabase0 = null;
      try {
        secondaryDatabase0 = new SecondaryDatabase((Environment) null, secondaryConfig0, (Database) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.Database", e);
      }
  }

  @Test
  public void test2()  throws Throwable  {
      Environment environment0 = null;
      SecondaryConfig secondaryConfig0 = SecondaryConfig.DEFAULT;
      secondaryConfig0.getForeignKeyDatabase();
      File file0 = null;
      Environment environment1 = null;
      try {
        environment1 = new Environment(file0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.dbi.DbEnvPool", e);
      }
  }

  @Test
  public void test3()  throws Throwable  {
      Database.DbState database_DbState0 = new Database.DbState("GJKM3^hmw20Ob6Y");
  }

  @Test
  public void test5()  throws Throwable  {
      Database database0 = null;
      try {
        database0 = new Database((Environment) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.Database", e);
      }
  }

  
}
