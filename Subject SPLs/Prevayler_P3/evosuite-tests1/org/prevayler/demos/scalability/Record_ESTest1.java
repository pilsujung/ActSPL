/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 08 12:56:02 KST 2017
 */

package org.prevayler.demos.scalability;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.fail;

import java.math.BigDecimal;
import java.time.Clock;
import java.time.Instant;
import java.util.Date;
import java.util.Random;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class Record_ESTest1 extends Record_ESTest_scaffolding1 {

  @Test
  public void test00()  throws Throwable  {
      Random random0 = new Random((-2120L));
      Record record0 = new Record((-2120L), random0);
      String string0 = record0.getString1();
      assertNull(string0);
      assertEquals((-2120L), record0.getId());
  }

  @Test
  public void test01()  throws Throwable  {
      Random random0 = new Random();
      Record record0 = new Record(3350L, random0);
      record0.getName();
      assertEquals(3350L, record0.getId());
  }

  @Test
  public void test02()  throws Throwable  {
      Record record0 = new Record(0L);
      record0.getId();
  }

  @Test
  public void test03()  throws Throwable  {
      Random random0 = new Random(0L);
      Record record0 = new Record(2378L, random0);
      long long0 = record0.getId();
      assertEquals(2378L, long0);
  }

  @Test
  public void test04()  throws Throwable  {
      Record record0 = new Record(0L);
      record0.getBigDecimal2();
  }

  @Test
  public void test05()  throws Throwable  {
      Record record0 = new Record(0L);
      record0.getBigDecimal1();
  }

  @Test
  public void test06()  throws Throwable  {
      Date date0 = new Date();
      Record record0 = new Record(632L, "}9R>QXzVZK-vkNj>#", "j#!xl", (BigDecimal) null, (BigDecimal) null, date0, date0);
      // Undeclared exception!
      try { 
        record0.hashCode();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.prevayler.demos.scalability.Record", e);
      }
  }

  @Test
  public void test09()  throws Throwable  {
      Record record0 = new Record((-1L));
      record0.hashCode();
      assertEquals((-1L), record0.getId());
  }

  @Test
  public void test10()  throws Throwable  {
      Date date0 = new Date(561L);
      Record record0 = new Record(1L, "", "", (BigDecimal) null, (BigDecimal) null, date0, date0);
      record0.getString1();
      assertEquals(1L, record0.getId());
  }

  @Test
  public void test11()  throws Throwable  {
      Record record0 = new Record((-1L));
      Date date0 = record0.getDate1();
      //  // Unstable assertion: assertEquals("Thu Jan 01 11:26:17 KST 1970", date0.toString());
  }

  @Test
  public void test12()  throws Throwable  {
      Record record0 = new Record((-4646L));
      long long0 = record0.getId();
      assertEquals((-4646L), long0);
  }

  @Test
  public void test13()  throws Throwable  {
      Date date0 = new Date(561L);
      Record record0 = new Record(1L, "", "", (BigDecimal) null, (BigDecimal) null, date0, date0);
      record0.getBigDecimal2();
      assertEquals(1L, record0.getId());
  }

  @Test
  public void test14()  throws Throwable  {
      Record record0 = new Record(0L);
      record0.getDate2();
  }

  @Test
  public void test15()  throws Throwable  {
      Date date0 = new Date(0L);
      Record record0 = new Record(0L, "NAME", "<1|'m$O#gl-qPdB1rb>", (BigDecimal) null, (BigDecimal) null, date0, date0);
      record0.getBigDecimal1();
      assertEquals("NAME", record0.getName());
      assertEquals("<1|'m$O#gl-qPdB1rb>", record0.getString1());
  }

  @Test
  public void test16()  throws Throwable  {
      Clock clock0 = Clock.systemUTC();
      Instant instant0 = Instant.now(clock0);
      Date date0 = Date.from(instant0);
      Record record0 = new Record((-1L), (String) null, "E5m5SOF/", (BigDecimal) null, (BigDecimal) null, date0, date0);
      String string0 = record0.getName();
      assertEquals((-1L), record0.getId());
      assertNull(string0);
  }
}
