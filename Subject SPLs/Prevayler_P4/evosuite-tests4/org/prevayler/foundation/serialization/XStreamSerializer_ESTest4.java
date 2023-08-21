/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 07 12:12:58 KST 2017
 */

package org.prevayler.foundation.serialization;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.PushbackInputStream;
import java.io.UnsupportedEncodingException;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.converters.reflection.ObjectAccessException;
import com.thoughtworks.xstream.io.HierarchicalStreamDriver;
import com.thoughtworks.xstream.io.StreamException;
import com.thoughtworks.xstream.io.xml.QNameMap;
import com.thoughtworks.xstream.io.xml.StaxDriver;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class XStreamSerializer_ESTest4 extends XStreamSerializer_ESTest_scaffolding4 {

  @Test
  public void test01()  throws Throwable  {
      XStreamSerializer xStreamSerializer0 = new XStreamSerializer();
      XStream xStream0 = xStreamSerializer0.createXStream();
      assertNotNull(xStream0);
  }

  @Test
  public void test02()  throws Throwable  {
      XStreamSerializer xStreamSerializer0 = new XStreamSerializer();
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(462);
      xStreamSerializer0.writeObject(byteArrayOutputStream0, byteArrayOutputStream0);
      assertEquals("<java.io.ByteArrayOutputStream>\n  <buf>AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\nAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\nAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\nAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\nAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\nAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\nAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\nAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\nAAAAAAAA</buf>\n  <count>0</count>\n</java.io.ByteArrayOutputStream>", byteArrayOutputStream0.toString());
  }

  @Test
  public void test03()  throws Throwable  {
      XStreamSerializer xStreamSerializer0 = new XStreamSerializer();
      QNameMap qNameMap0 = new QNameMap();
      StaxDriver staxDriver0 = new StaxDriver(qNameMap0);
      XStream xStream0 = new XStream((HierarchicalStreamDriver) staxDriver0);
      // Undeclared exception!
      try { 
        xStreamSerializer0.writeObject((OutputStream) null, xStream0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.io.Writer", e);
      }
  }



  @Test
  public void test06()  throws Throwable  {
      XStreamSerializer xStreamSerializer0 = new XStreamSerializer();
      byte[] byteArray0 = new byte[9];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (-3893), 8);
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream((InputStream) byteArrayInputStream0);
      // Undeclared exception!
      try { 
        xStreamSerializer0.readObject(pushbackInputStream0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.lang.System", e);
      }
  }

  @Test
  public void test07()  throws Throwable  {
      XStreamSerializer xStreamSerializer0 = new XStreamSerializer();
      ByteArrayInputStream byteArrayInputStream0 = (ByteArrayInputStream)ClassLoader.getSystemResourceAsStream("");
      // Undeclared exception!
      try { 
        xStreamSerializer0.readObject(byteArrayInputStream0);
        fail("Expecting exception: StreamException");
      
      } catch(StreamException e) {
         //
         //  : only whitespace content allowed before start tag and not o (position: START_DOCUMENT seen o... @1:1) 
         //
         assertThrownBy("com.thoughtworks.xstream.io.xml.XppReader", e);
      }
  }

  @Test
  public void test08()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream(1);
      XStreamSerializer xStreamSerializer0 = new XStreamSerializer("");
      try { 
        xStreamSerializer0.readObject(pipedInputStream0);
        fail("Expecting exception: UnsupportedEncodingException");
      
      } catch(UnsupportedEncodingException e) {
         //
         // 
         //
         assertThrownBy("sun.nio.cs.StreamDecoder", e);
      }
  }

  @Test
  public void test09()  throws Throwable  {
      XStreamSerializer xStreamSerializer0 = new XStreamSerializer("i}a~wjr{TcyK");
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      Object object0 = new Object();
      try { 
        xStreamSerializer0.writeObject(pipedOutputStream0, object0);
        fail("Expecting exception: UnsupportedEncodingException");
      
      } catch(UnsupportedEncodingException e) {
         //
         // i}a~wjr{TcyK
         //
         assertThrownBy("sun.nio.cs.StreamEncoder", e);
      }
  }

  @Test
  public void test10()  throws Throwable  {
      XStreamSerializer xStreamSerializer0 = new XStreamSerializer();
      BufferedOutputStream bufferedOutputStream0 = new BufferedOutputStream((OutputStream) null);
      // Undeclared exception!
      try { 
        xStreamSerializer0.writeObject(bufferedOutputStream0, xStreamSerializer0);
        fail("Expecting exception: ObjectAccessException");
      
      } catch(ObjectAccessException e) {
         //
         // Invalid final field org.prevayler.foundation.serialization.XStreamSerializer$1.this$0
         //
         assertThrownBy("com.thoughtworks.xstream.converters.reflection.PureJavaReflectionProvider", e);
      }
  }
}
