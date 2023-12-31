/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 00:02:02 KST 2017
 */

package com.sleepycat.je.config;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.sleepycat.je.config.LongConfigParam;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class LongConfigParam_ESTest6 extends LongConfigParam_ESTest_scaffolding6 {

  @Test
  public void test0()  throws Throwable  {
      Long long0 = new Long(0L);
      Long long1 = new Long((-3543L));
      LongConfigParam longConfigParam0 = new LongConfigParam("Ylps.OD$F?^B&g.", (Long) null, long0, long1, true, "");
      longConfigParam0.validate();
      assertEquals("", longConfigParam0.getDescription());
  }

  @Test
  public void test1()  throws Throwable  {
      String string0 = "";
      Long long0 = new Long(6144L);
      Long long1 = new Long(20L);
      LongConfigParam longConfigParam0 = new LongConfigParam("# If true, operates in an in-memory fashion without\n# flushing the log to disk. The system operates until it runs\n# out of memory, in which case a java.lang.OutOfMemory error is\n# thrown.", long0, long1, long1, true, "# If true, operates in an in-memory fashion without\n# flushing the log to disk. The system operates until it runs\n# out of memory, in which case a java.lang.OutOfMemory error is\n# thrown.");
      try { 
        longConfigParam0.validate();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // com.sleepycat.je.config.LongConfigParam: param # If true, operates in an in-memory fashion without
         // # flushing the log to disk. The system operates until it runs
         // # out of memory, in which case a java.lang.OutOfMemory error is
         // # thrown. doesn't validate, 20 is less than min of 6144
         //
         assertThrownBy("com.sleepycat.je.config.LongConfigParam", e);
      }
  }

  @Test
  public void test2()  throws Throwable  {
      Long long0 = new Long(0L);
      LongConfigParam longConfigParam0 = new LongConfigParam("Ylps.OD$F?^B&g.", (Long) null, long0, long0, true, "");
      try { 
        longConfigParam0.validateValue("# maximum = 0");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // com.sleepycat.je.config.LongConfigParam: # maximum = 0 not valid value for Ylps.OD$F?^B&g.
         //
         assertThrownBy("com.sleepycat.je.config.LongConfigParam", e);
      }
  }

  @Test
  public void test3()  throws Throwable  {
      LongConfigParam longConfigParam0 = null;
      try {
        longConfigParam0 = new LongConfigParam("", (Long) null, (Long) null, (Long) null, false, "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.je.config.LongConfigParam", e);
      }
  }

  @Test
  public void test4()  throws Throwable  {
      Long long0 = new Long((-963L));
      LongConfigParam longConfigParam0 = null;
      try {
        longConfigParam0 = new LongConfigParam("", long0, long0, long0, true, "");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         //  A configuration parameter name can't be null or 0 length
         //
         assertThrownBy("com.sleepycat.je.config.ConfigParam", e);
      }
  }

  @Test
  public void test5()  throws Throwable  {
      Long long0 = new Long((-3L));
      LongConfigParam longConfigParam0 = new LongConfigParam("Hmp1", (Long) null, (Long) null, long0, false, "Hmp1");
      String string0 = longConfigParam0.getExtraDescription();
      assertEquals("", string0);
  }

  @Test
  public void test6()  throws Throwable  {
      Long long0 = new Long((-1413L));
      LongConfigParam longConfigParam0 = new LongConfigParam(" is less than min of ", long0, long0, long0, false, " is less than min of ");
      String string0 = longConfigParam0.getExtraDescription();
      assertEquals("# minimum = -1413\n# maximum = -1413", string0);
  }

  @Test
  public void test7()  throws Throwable  {
      Long long0 = Long.valueOf((-1L));
      LongConfigParam longConfigParam0 = new LongConfigParam(":x3k*M9z;j>aSurP", long0, long0, long0, false, ":x3k*M9z;j>aSurP");
      try { 
        longConfigParam0.validateValue("0");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // com.sleepycat.je.config.LongConfigParam: param :x3k*M9z;j>aSurP doesn't validate, 0 is greater than max  of -1
         //
         assertThrownBy("com.sleepycat.je.config.LongConfigParam", e);
      }
  }

  @Test
  public void test8()  throws Throwable  {
      Long long0 = new Long(6144L);
      LongConfigParam longConfigParam0 = new LongConfigParam("# If true, operates in an in-memory fashion without\n# flushing the log to disk. The system operates until it runs\n# out of memory, in which case a java.lang.OutOfMemory error is\n# thrown.", long0, long0, long0, true, "# If true, operates in an in-memory fashion without\n# flushing the log to disk. The system operates until it runs\n# out of memory, in which case a java.lang.OutOfMemory error is\n# thrown.");
      longConfigParam0.validate();
      assertTrue(longConfigParam0.isMutable());
  }

  @Test
  public void test9()  throws Throwable  {
      Long long0 = new Long(0L);
      LongConfigParam longConfigParam0 = new LongConfigParam("Ylps.OD$F?^B&g.", (Long) null, long0, long0, true, "");
      String string0 = longConfigParam0.getExtraDescription();
      assertEquals("# maximum = 0", string0);
  }
}
