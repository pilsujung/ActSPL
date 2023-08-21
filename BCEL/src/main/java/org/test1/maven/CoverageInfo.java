package org.test1.maven;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedHashSet;

public class CoverageInfo {
	private static LinkedHashSet<String> hs = new LinkedHashSet<String>();
	
	public synchronized static void save(String x) throws IOException{	//�ܼ��� hashset�� ��Ƽ� �Ѳ����� ����ϸ� ������ ���δ�.
		hs.add(x);
		/*
		File f = new File("C:\\Users\\soo\\Desktop\\eclipse-java-mars-2-win32-x86_64\\test1\\CoverageInfo.txt");
		BufferedWriter writer = new BufferedWriter(new FileWriter(f,true));
		writer.write(x + "\r\n");
		System.out.println(x);
		writer.close();
		*/
	}
	
	public synchronized static void print() throws IOException{
		
		File f = new File("C:\\Users\\user\\Desktop\\eclipse-java-mars-2-win32-x86_64\\test1\\CoverageInfo.txt");
		BufferedWriter writer = new BufferedWriter(new FileWriter(f,true));
		
		for(String a : hs)
			writer.write(a + "\r\n");
		System.out.println("success !!");
		writer.close();
		
		hs.clear();
	}
}
