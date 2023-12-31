package com.sleepycat.je.log; 
import java.io.IOException; 
import java.io.RandomAccessFile; 
import com.sleepycat.je.DatabaseException; 
import com.sleepycat.je.dbi.EnvironmentImpl; 
import de.ovgu.cide.jakutil.*; 
import com.sleepycat.je.latch.Latch; 
import com.sleepycat.je.latch.LatchSupport; 
 
class  FileHandle {
	
  private RandomAccessFile file;

	
  private boolean oldHeaderVersion;

	
  FileHandle(  RandomAccessFile file,  String fileName,  EnvironmentImpl env,  boolean oldHeaderVersion){
    this.file=file;
    this.oldHeaderVersion=oldHeaderVersion;
    this.hook444(fileName,env);
  }

	
  RandomAccessFile getFile(){
    return file;
  }

	
  boolean isOldHeaderVersion(){
    return oldHeaderVersion;
  }

	
  void close() throws IOException {
    if (file != null) {
      file.close();
      file=null;
    }
  }

	
   private void  hook444__wrappee__base  (  String fileName,  EnvironmentImpl env){
  }

	
  protected void hook444(  String fileName,  EnvironmentImpl env){
    fileLatch=LatchSupport.makeLatch(fileName + "_fileHandle",env);
    hook444__wrappee__base(fileName,env);
  }

	
  private Latch fileLatch;

	
  void latch() throws DatabaseException {
    fileLatch.acquire();
  }

	
  boolean latchNoWait() throws DatabaseException {
    return fileLatch.acquireNoWait();
  }

	
  void release() throws DatabaseException {
    fileLatch.release();
  }


}
