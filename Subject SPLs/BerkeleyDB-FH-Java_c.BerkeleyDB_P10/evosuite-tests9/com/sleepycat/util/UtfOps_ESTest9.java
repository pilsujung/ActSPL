/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 22 12:43:06 KST 2017
 */

package com.sleepycat.util;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class UtfOps_ESTest9 extends UtfOps_ESTest_scaffolding9 {

  @Test
  public void test00()  throws Throwable  {
      byte[] byteArray0 = UtfOps.stringToBytes("U;nkXJ/\"$)lBo,sy+");
      UtfOps.getCharLength(byteArray0, 1, 0);
  }

  @Test
  public void test01()  throws Throwable  {
      byte[] byteArray0 = UtfOps.stringToBytes("U#}x&");
      UtfOps.getCharLength(byteArray0);
  }


  @Test
  public void test03()  throws Throwable  {
      char[] charArray0 = new char[0];
      byte[] byteArray0 = UtfOps.stringToBytes("");
      UtfOps.bytesToChars(byteArray0, 0, charArray0, 0, 0, true);
  }

  @Test
  public void test04()  throws Throwable  {
      byte[] byteArray0 = UtfOps.stringToBytes(" ,2L3?Kt@p}YH=L)0T");
      char[] charArray0 = new char[0];
      UtfOps.bytesToChars(byteArray0, (-720), charArray0, 2047, 0, true);
  }

  @Test
  public void test05()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      UtfOps.bytesToString(byteArray0, (byte) (-1), (byte) (-1));
  }

  @Test
  public void test06()  throws Throwable  {
      char[] charArray0 = new char[4];
      byte[] byteArray0 = new byte[5];
      byteArray0[1] = (byte) (-25);
      byteArray0[3] = (byte)72;
      try { 
        UtfOps.bytesToChars(byteArray0, (byte)0, charArray0, 3, 1865, false);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.util.UtfOps", e);
      }
  }

  @Test
  public void test07()  throws Throwable  {
      char[] charArray0 = new char[4];
      byte[] byteArray0 = new byte[4];
      byteArray0[1] = (byte) (-52);
      byteArray0[2] = (byte) (-52);
      try { 
        UtfOps.bytesToChars(byteArray0, (byte)0, charArray0, 3, 1865, false);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.util.UtfOps", e);
      }
  }

  @Test
  public void test08()  throws Throwable  {
      UtfOps.stringToBytes("0 /pjn)=3iHXJ$Mt");
  }

  @Test
  public void test09()  throws Throwable  {
      char[] charArray0 = new char[3];
      UtfOps.getByteLength(charArray0, (-4787), (-1));
  }

  @Test
  public void test10()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte) (-46);
      UtfOps.getZeroTerminatedByteLength(byteArray0, (byte)0);
  }




  @Test
  public void test14()  throws Throwable  {
      char[] charArray0 = new char[2];
      // Undeclared exception!
      try { 
        UtfOps.getByteLength(charArray0, 1781, 2244);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1781
         //
         assertThrownBy("com.sleepycat.util.UtfOps", e);
      }
  }


  @Test
  public void test16()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte) (-99);
      try { 
        UtfOps.bytesToString(byteArray0, 0, (byte)104);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.util.UtfOps", e);
      }
  }

  @Test
  public void test17()  throws Throwable  {
      byte[] byteArray0 = UtfOps.stringToBytes("");
      try { 
        UtfOps.bytesToString(byteArray0, 2047, 109);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test18()  throws Throwable  {
      char[] charArray0 = new char[9];
      // Undeclared exception!
      try { 
        UtfOps.bytesToChars((byte[]) null, (byte)0, charArray0, (byte)0, (byte)1, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.util.UtfOps", e);
      }
  }

  @Test
  public void test19()  throws Throwable  {
      byte[] byteArray0 = UtfOps.stringToBytes("U;nkXJ/\"$)lBo,sy+");
      char[] charArray0 = new char[9];
      charArray0[1] = '\"';
      // Undeclared exception!
      try { 
        UtfOps.charsToBytes(charArray0, 1, byteArray0, 0, 2383);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 9
         //
         assertThrownBy("com.sleepycat.util.UtfOps", e);
      }
  }

  @Test
  public void test20()  throws Throwable  {
      char[] charArray0 = new char[0];
      byte[] byteArray0 = new byte[9];
      UtfOps.charsToBytes(charArray0, 0, byteArray0, 1905, (byte) (-1));
  }

  @Test
  public void test21()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[1] = (byte)61;
      char[] charArray0 = new char[8];
      try { 
        UtfOps.bytesToChars(byteArray0, (byte)1, charArray0, (byte) (-56), (byte)127, true);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -56
         //
         assertThrownBy("com.sleepycat.util.UtfOps", e);
      }
  }

  @Test
  public void test22()  throws Throwable  {
      byte[] byteArray0 = UtfOps.stringToBytes("U#}x&");
      char[] charArray0 = new char[1];
      try { 
        UtfOps.bytesToChars(byteArray0, 0, charArray0, 0, 5, true);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         assertThrownBy("com.sleepycat.util.UtfOps", e);
      }
  }

  @Test
  public void test23()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byteArray0[3] = (byte)72;
      char[] charArray0 = new char[7];
      try { 
        UtfOps.bytesToChars(byteArray0, (byte)0, charArray0, 4, 1865, false);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 7
         //
         assertThrownBy("com.sleepycat.util.UtfOps", e);
      }
  }

  @Test
  public void test24()  throws Throwable  {
      char[] charArray0 = new char[5];
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte)112;
      try { 
        UtfOps.bytesToChars(byteArray0, 0, charArray0, (-1866), (byte)112, true);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1866
         //
         assertThrownBy("com.sleepycat.util.UtfOps", e);
      }
  }

  @Test
  public void test25()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byteArray0[1] = (byte)104;
      char[] charArray0 = new char[0];
      try { 
        UtfOps.bytesToChars(byteArray0, 1, charArray0, 1245, 31, true);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1245
         //
         assertThrownBy("com.sleepycat.util.UtfOps", e);
      }
  }

  @Test
  public void test26()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      byteArray0[1] = (byte)109;
      UtfOps.getCharLength(byteArray0, (int) (byte)1, (int) (byte)1);
  }

  @Test
  public void test27()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte) (-70);
      try { 
        UtfOps.getCharLength(byteArray0, (int) (byte)0, (int) (byte)35);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.util.UtfOps", e);
      }
  }

  @Test
  public void test28()  throws Throwable  {
      byte[] byteArray0 = UtfOps.stringToBytes("Yz 4F");
      try { 
        UtfOps.getCharLength(byteArray0, (int) (byte)0, 102);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test29()  throws Throwable  {
      char[] charArray0 = new char[15];
      charArray0[4] = 'a';
      UtfOps.getByteLength(charArray0, 4, 4);
  }

  @Test
  public void test30()  throws Throwable  {
      byte[] byteArray0 = UtfOps.stringToBytes("U#}x&");
      UtfOps.bytesToString(byteArray0, 0, 0);
  }

  @Test
  public void test31()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte) (-1);
      char[] charArray0 = new char[7];
      try { 
        UtfOps.bytesToChars(byteArray0, 0, charArray0, 'n', 'n', true);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.util.UtfOps", e);
      }
  }

  @Test
  public void test32()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byteArray0[1] = (byte) (-34);
      char[] charArray0 = new char[7];
      try { 
        UtfOps.bytesToChars(byteArray0, (byte)0, charArray0, 3, 1865, false);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.util.UtfOps", e);
      }
  }

  @Test
  public void test33()  throws Throwable  {
      char[] charArray0 = new char[9];
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte) (-84);
      try { 
        UtfOps.bytesToChars(byteArray0, (byte)0, charArray0, (byte)0, (byte)1, true);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.util.UtfOps", e);
      }
  }

  @Test
  public void test34()  throws Throwable  {
      char[] charArray0 = new char[9];
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte) (-104);
      try { 
        UtfOps.bytesToChars(byteArray0, (byte)0, charArray0, (byte)0, (byte)1, false);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.util.UtfOps", e);
      }
  }

  @Test
  public void test35()  throws Throwable  {
      char[] charArray0 = new char[9];
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte) (-128);
      try { 
        UtfOps.bytesToChars(byteArray0, (byte)0, charArray0, (byte)0, (byte)1, false);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.util.UtfOps", e);
      }
  }

  @Test
  public void test36()  throws Throwable  {
      char[] charArray0 = new char[9];
      byte[] byteArray0 = new byte[6];
      byteArray0[4] = (byte)20;
      try { 
        UtfOps.bytesToChars(byteArray0, (byte)0, charArray0, (byte)0, (byte)20, false);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 6
         //
         assertThrownBy("com.sleepycat.util.UtfOps", e);
      }
  }

  @Test
  public void test37()  throws Throwable  {
      char[] charArray0 = new char[9];
      byte[] byteArray0 = new byte[6];
      UtfOps.bytesToChars(byteArray0, (byte)0, charArray0, (byte)0, (byte)1, false);
  }

  @Test
  public void test38()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[5] = (byte) (-1);
      try { 
        UtfOps.getCharLength(byteArray0, (int) (byte)0, 1905);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.util.UtfOps", e);
      }
  }

  @Test
  public void test39()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[2] = (byte) (-30);
      try { 
        UtfOps.getCharLength(byteArray0, (int) (byte)0, 1905);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test40()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte) (-46);
      UtfOps.getCharLength(byteArray0, (int) (byte)0, 1);
  }

  @Test
  public void test41()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byteArray0[1] = (byte) (-57);
      int int0 = UtfOps.getCharLength(byteArray0, 1, 1);
      assertEquals(1, int0);
  }

  @Test
  public void test42()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byteArray0[1] = (byte) (-78);
      try { 
        UtfOps.getCharLength(byteArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.util.UtfOps", e);
      }
  }

  @Test
  public void test43()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte) (-83);
      try { 
        UtfOps.getCharLength(byteArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.util.UtfOps", e);
      }
  }

  @Test
  public void test44()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byteArray0[3] = (byte) (-112);
      try { 
        UtfOps.getCharLength(byteArray0, 2, 8);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.util.UtfOps", e);
      }
  }

  @Test
  public void test45()  throws Throwable  {
      byte[] byteArray0 = UtfOps.stringToBytes("U;nkXJ/\"$)lBo,sy+");
      String string0 = UtfOps.bytesToString(byteArray0, 0, 16);
      assertEquals("U;nkXJ/\"$)lBo,sy", string0);
  }

  @Test
  public void test46()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte)30;
      try { 
        UtfOps.getCharLength(byteArray0, (int) (byte)0, 1905);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test47()  throws Throwable  {
      byte[] byteArray0 = UtfOps.stringToBytes("\u0000");
      try { 
        UtfOps.getCharLength(byteArray0, (int) (byte)1, 127);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.sleepycat.util.UtfOps", e);
      }
  }

  @Test
  public void test48()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      int int0 = UtfOps.getZeroTerminatedByteLength(byteArray0, (byte)0);
      assertEquals(0, int0);
  }

  @Test
  public void test49()  throws Throwable  {
      byte[] byteArray0 = UtfOps.stringToBytes("U#}x&");
      try { 
        UtfOps.getZeroTerminatedByteLength(byteArray0, 1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 5
         //
         assertThrownBy("com.sleepycat.util.UtfOps", e);
      }
  }


  @Test
  public void test51()  throws Throwable  {
      char[] charArray0 = new char[9];
      int int0 = UtfOps.getByteLength(charArray0);
      assertEquals(18, int0);
  }

  @Test
  public void test52()  throws Throwable  {
      byte[] byteArray0 = UtfOps.stringToBytes("");
      int int0 = UtfOps.getCharLength(byteArray0);
      assertEquals(0, int0);
  }
}
