package com.sleepycat.je.cleaner;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.io.File;

import org.junit.Test;

import com.sleepycat.je.DatabaseException;
import com.sleepycat.je.Environment;
import com.sleepycat.je.EnvironmentConfig;
import com.sleepycat.je.dbi.EnvironmentImpl;

public class IntegrationTests2 {

	@Test
	public void test1() {
		FileSelector fs = new FileSelector();
		FileProcessor fp = new FileProcessor((String) "aa", (EnvironmentImpl) null, (Cleaner) null, (UtilizationProfile) null, fs);
		
		fp.runOrPause(true);
		fp.runOrPause(true);
	    
		assertEquals("aa",fp.getThread().getName());
	}
}
