package com.sleepycat.je.utilint; 
import java.util.Arrays; 
import com.sleepycat.je.log.FileManager; 
import com.sleepycat.je.log.LogReadable; 
import com.sleepycat.je.tree.TreeUtils; 
import de.ovgu.cide.jakutil.*; 
/** 
 * DbLsn is a class that operates on Log Sequence Numbers (LSNs). An LSN is a
 * long comprised of a file number (32b) and offset within that file (32b)
 * which references a unique record in the database environment log.  While
 * LSNs are represented as long's, we operate on them using an abstraction and
 * return longs from these methods so that we don't have to worry about the
 * lack of unsigned quantities.
 */
public  class  DbLsn {
	
  static final long INT_MASK=0xFFFFFFFFL;

	
  public static final long MAX_FILE_OFFSET=0xFFFFFFFFL;

	
  public static final long NULL_LSN=-1;

	
  private DbLsn(){
  }

	
  public static long makeLsn(  long fileNumber,  long fileOffset){
    return fileOffset & INT_MASK | ((fileNumber & INT_MASK) << 32);
  }

	
  public static long longToLsn(  Long lsn){
    if (lsn == null) {
      return NULL_LSN;
    }
    return lsn.longValue();
  }

	
  /** 
 * Return the file number for this DbLsn.
 * @return the number for this DbLsn.
 */
  public static long getFileNumber(  long lsn){
    return (lsn >> 32) & INT_MASK;
  }

	
  /** 
 * Return the file offset for this DbLsn.
 * @return the offset for this DbLsn.
 */
  public static long getFileOffset(  long lsn){
    return (lsn & INT_MASK);
  }

	
  private static int compareLong(  long l1,  long l2){
    if (l1 < l2) {
      return -1;
    }
 else     if (l1 > l2) {
      return 1;
    }
 else {
      return 0;
    }
  }

	
  public static int compareTo(  long lsn1,  long lsn2){
    if (lsn1 == NULL_LSN || lsn2 == NULL_LSN) {
      throw new NullPointerException();
    }
    long fileNumber1=getFileNumber(lsn1);
    long fileNumber2=getFileNumber(lsn2);
    if (fileNumber1 == fileNumber2) {
      return compareLong(getFileOffset(lsn1),getFileOffset(lsn2));
    }
 else {
      return compareLong(fileNumber1,fileNumber2);
    }
  }

	
  public static String toString(  long lsn){
    return "<DbLsn val=\"0x" + Long.toHexString(getFileNumber(lsn)) + "/0x"+ Long.toHexString(getFileOffset(lsn))+ "\"/>";
  }

	
  public static String getNoFormatString(  long lsn){
    return "0x" + Long.toHexString(getFileNumber(lsn)) + "/0x"+ Long.toHexString(getFileOffset(lsn));
  }

	
  public static String dumpString(  long lsn,  int nSpaces){
    StringBuffer sb=new StringBuffer();
    sb.append(TreeUtils.indent(nSpaces));
    sb.append(toString(lsn));
    return sb.toString();
  }

	
  /** 
 * Return the logsize in bytes between these two LSNs. This is an
 * approximation; the logs might actually be a little more or less in
 * size. This assumes that no log files have been cleaned.
 */
  public static long getNoCleaningDistance(  long thisLsn,  long otherLsn,  long logFileSize){
    long diff=0;
    assert thisLsn != NULL_LSN;
    long myFile=getFileNumber(thisLsn);
    if (otherLsn == NULL_LSN) {
      otherLsn=0;
    }
    long otherFile=getFileNumber(otherLsn);
    if (myFile == otherFile) {
      diff=Math.abs(getFileOffset(thisLsn) - getFileOffset(otherLsn));
    }
 else     if (myFile > otherFile) {
      diff=calcDiff(myFile - otherFile,logFileSize,thisLsn,otherLsn);
    }
 else {
      diff=calcDiff(otherFile - myFile,logFileSize,otherLsn,thisLsn);
    }
    return diff;
  }

	
  /** 
 * Return the logsize in bytes between these two LSNs. This is an
 * approximation; the logs might actually be a little more or less in
 * size. This assumes that log files might have been cleaned.
 */
  public static long getWithCleaningDistance(  long thisLsn,  FileManager fileManager,  long otherLsn,  long logFileSize){
    long diff=0;
    assert thisLsn != NULL_LSN;
    long myFile=getFileNumber(thisLsn);
    if (otherLsn == NULL_LSN) {
      otherLsn=0;
    }
    long otherFile=getFileNumber(otherLsn);
    if (myFile == otherFile) {
      diff=Math.abs(getFileOffset(thisLsn) - getFileOffset(otherLsn));
    }
 else {
      Long[] fileNums=fileManager.getAllFileNumbers();
      int myFileIdx=Arrays.binarySearch(fileNums,new Long(myFile));
      int otherFileIdx=Arrays.binarySearch(fileNums,new Long(otherFile));
      if (myFileIdx > otherFileIdx) {
        diff=calcDiff(myFileIdx - otherFileIdx,logFileSize,thisLsn,otherLsn);
      }
 else {
        diff=calcDiff(otherFileIdx - myFileIdx,logFileSize,otherLsn,thisLsn);
      }
    }
    return diff;
  }

	
  private static long calcDiff(  long fileDistance,  long logFileSize,  long laterLsn,  long earlierLsn){
    long diff=fileDistance * logFileSize;
    diff+=getFileOffset(laterLsn);
    diff-=getFileOffset(earlierLsn);
    return diff;
  }

	
  /** 
 * @see LogReadable#logEntryIsTransactional.
 */
  public boolean logEntryIsTransactionalX(){
    return false;
  }

	
  /** 
 * @see LogReadable#getTransactionId
 */
  public long getTransactionIdX(){
    return 0;
  }


}
