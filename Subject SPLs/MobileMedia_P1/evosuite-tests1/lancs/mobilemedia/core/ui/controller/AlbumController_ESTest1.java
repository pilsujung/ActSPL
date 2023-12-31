/*
 * This file was automatically generated by EvoSuite
 * Mon Aug 13 18:39:52 KST 2018
 */

package lancs.mobilemedia.core.ui.controller;

import org.junit.Test;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import javax.microedition.lcdui.Command;
import lancs.mobilemedia.core.ui.MainUIMidlet;
import lancs.mobilemedia.core.ui.controller.AlbumController;
import lancs.mobilemedia.core.ui.datamodel.ImageAlbumData;
import lancs.mobilemedia.core.ui.screens.AlbumListScreen;
import lancs.mobilemedia.core.ui.screens.PlayMediaScreen;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class AlbumController_ESTest1 extends AlbumController_ESTest_scaffolding1 {
@BeforeClass
public static void initEvoSuiteFramework() {
String a = "aa";
}
@AfterClass
public static void exitEvoSuiteFramework() {
String a = "aa";
}

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ImageAlbumData imageAlbumData0 = new ImageAlbumData();
      Command command0 = PlayMediaScreen.copy;
      MainUIMidlet mainUIMidlet0 = new MainUIMidlet();
      AlbumController albumController0 = new AlbumController(mainUIMidlet0, imageAlbumData0, (AlbumListScreen) null);
      // Undeclared exception!
      try { 
        albumController0.handleCommand(command0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }
}
