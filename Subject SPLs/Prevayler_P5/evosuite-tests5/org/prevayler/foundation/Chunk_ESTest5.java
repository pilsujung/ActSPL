/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 06 20:15:03 KST 2017
 */

package org.prevayler.foundation;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.fail;

import java.util.HashMap;
import java.util.Map;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class Chunk_ESTest5 extends Chunk_ESTest_scaffolding5 {

  @Test
  public void test0()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      Chunk chunk0 = new Chunk(byteArray0, (Map) null);
      Map map0 = chunk0.getParameters();
      assertNull(map0);
  }

  @Test
  public void test1()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      Chunk chunk0 = new Chunk(byteArray0);
      chunk0.setParameter("", "");
      String string0 = chunk0.getParameter("");
      assertEquals("", string0);
  }

  @Test
  public void test2()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      Chunk chunk0 = new Chunk(byteArray0);
      byte[] byteArray1 = chunk0.getBytes();
      assertSame(byteArray0, byteArray1);
  }

  @Test
  public void test3()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      Chunk chunk0 = new Chunk(byteArray0, (Map) null);
      // Undeclared exception!
      try { 
        chunk0.setParameter("+:s", (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.prevayler.foundation.Chunk", e);
      }
  }

  @Test
  public void test4()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      Chunk chunk0 = new Chunk(byteArray0, (Map) hashMap0);
      Integer integer0 = new Integer((int) (byte) (-30));
      hashMap0.put("", integer0);
      // Undeclared exception!
      try { 
        chunk0.getParameter("");
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Integer cannot be cast to java.lang.String
         //
         assertThrownBy("org.prevayler.foundation.Chunk", e);
      }
  }

  @Test
  public void test5()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      Chunk chunk0 = new Chunk((byte[]) null);
      Map map0 = chunk0.getParameters();
      Chunk chunk1 = new Chunk(byteArray0, (Map) map0);
      byte[] byteArray1 = chunk1.getBytes();
      assertSame(byteArray0, byteArray1);
  }

  @Test
  public void test6()  throws Throwable  {
      Chunk chunk0 = new Chunk((byte[]) null);
      String string0 = chunk0.getParameter("8;-VIbiHx(dgv,{C!");
      assertNull(string0);
  }

}
