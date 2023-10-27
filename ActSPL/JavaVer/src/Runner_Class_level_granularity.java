import java.io.BufferedInputStream;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.io.IOUtils;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class Runner_Class_level_granularity {
	private Set<String> hashValuesForP = new HashSet<String>();
	//private String projectName = "MobileMedia";
	//private String projectName = "TankWar";
	//private String projectName = "Prevayler";
	//private String projectName = "MRR";
	private String projectName = null; //"BerkeleyDB";
	private String projectNumber = "P" + Main.valueForOptimal;
	
	
	private File covFile = null; //new File("C:\\Users\\user\\Desktop\\eclipse-java-mars-2-win32-x86_64\\test1\\" + projectName + "_" + projectNumber + " CoverageInfo_m2.txt");
	private static HashMap<String, HashSet<String>> testCases;
	private static HashSet<String> allTCs = new HashSet<String>();
	private static int allExecutionsNumber = 0;
	private static List<File> files;
	private static ArrayList<String> target = new ArrayList<String>();
	
	public Runner_Class_level_granularity(){
		if(Main.P.contains("BerkeleyDB"))
			projectName = "BerkeleyDB";
		else if(Main.P.contains("TankWar"))
			projectName = "TankWar";
		else if(Main.P.contains("Prevayler"))
			projectName = "Prevayler";
		else if(Main.P.contains("MRR"))
			projectName = "MRR";
		else if(Main.P.contains("MobileMedia"))
			projectName = "MobileMedia";
		 covFile = new File("C:\\Users\\user\\Desktop\\eclipse-java-mars-2-win32-x86_64\\ActSPL\\CovFiles\\" + projectName + "_" + projectNumber + " CoverageInfo_m.txt");
	}
	
	public void UpdateTC2CodeTraceability(HashMap<String, List<String>> TrMatrix, String P) throws FileNotFoundException, IOException{
		File dir = new File(P + "\\bin");
		HashSet<String> selected = new HashSet<String>();
		
		long e0 = System.currentTimeMillis();
		hashingCodeUnits(dir);		// list of hash values of code units in p
		long e1 = System.currentTimeMillis();
		System.out.println("Preprocessing: " + (e1 - e0)+" ms done");
		
		
		Set<String> H = new HashSet<String>(hashValuesForP);
		Set<String> E = new HashSet<String>();
		/* update TC-to-Code traceability matrix by TC reuse (for the initial product, pass here) */
		for( String t : TrMatrix.keySet() ){
			List<String> v = TrMatrix.get(t);
			String pList = v.get(0);
			String hValues = v.get(1);

			Set<String> s = new HashSet<String>(Arrays.asList(hValues.split(",")));
			E.addAll(s);
			if(H.containsAll(s)){
				selected.add(t);
				pList += "," + P;			// reusing the existing test cases for P
				v.set(0, pList);
				TrMatrix.put(t, v);
			}
		}
		long e2 = System.currentTimeMillis();
		System.out.println("Test case selection: " + (e2 - e1)+" ms done");
		
		// append traces for new TCs to TC-to-Code traceability matrix
		List<String> data = new ArrayList<String>();
		data = Files.readAllLines(Paths.get(covFile.getAbsolutePath()));	
		
		String TC = null;
		
		List<String> hashValues = new ArrayList<String>();
		int cnt = 0;
		for(String s : data){
			if(s.contains("_ESTest") || s.contains("IntegrationTests")){
				cnt++;
				if(hashValues.size() != 0 && !TrMatrix.containsKey(TC)){
					List<String> v = new ArrayList<String>();
					v.add(P);
					v.add(hashValues.toString().replace("[", "").replace("]", "").replace(" ", ""));
					TrMatrix.put(TC, v);
					hashValues = new ArrayList<String>();
				}
				TC = s;
			}else{
				File f = new File(P + "\\bin\\" + s.replace(".", "\\") + ".class");
				String h = hashing(f);
				hashValues.add(h);
			}
		}
		long e3 = System.currentTimeMillis();
		System.out.println("Traceability Update: " + (e3 - e2)+" ms done");
		
		/////////////////////////////////////////////////////////////////////////////////////////////////////////////
		//System.out.println("Total # of TCs: " + cnt);
		saveTraceability(TrMatrix);
		
		setTCs("C:\\Users\\user\\Desktop\\eclipse-java-mars-2-win32-x86_64\\ActSPL\\" + projectName + "10_TCs.xml");
		HashSet<String> optimalTCs = optimalCase(Main.valueForOptimal-1);
		HashSet<String> tmp = new HashSet<String>();
		for(String tc : optimalTCs){
			tmp.add(tc.substring(tc.indexOf(".") + 1));
		}
		tmp.retainAll(selected);
		System.out.println("# of reused TCs (#Selected): " + tmp.size());
		
		if(!E.isEmpty())
			ActSPL_VS_Single(E, H);
	}
	
	public void ActSPL_VS_Single(Set<String> E, Set<String> H){
		H.removeAll(E);
		//System.out.println(H);
		for(String s : H){
			String sp = s.split("\\.")[0];
			String spp[] = sp.split("\\\\");
			String c = spp[spp.length-1];
			target.add(c);
		}
		String prefix = "";
		if(projectName.equals("BerkeleyDB")){
			prefix = "BerkeleyDB-FH-Java_c.";
		}
		List<String> ret = allTCs(prefix + projectName + "_P" + Main.valueForOptimal, "evosuite-tests" + Main.valueForOptimal);
		//System.out.println(ret.size() + " -> " + ret);
	}
	
	public static List<String> allTCs(String projectName, String packName){
		List<String> ret = new ArrayList<String>();
		files = new ArrayList<File>();
		
		String DesktopOrDownloads = "Downloads";
		if(projectName.contains("TankWar") || projectName.contains("BerkeleyDB"))
				DesktopOrDownloads = "Desktop";

		String path = "C:/Users/user/" + DesktopOrDownloads + "/eclipse-java-mars-2-win32-x86_64/"+ projectName + "\\" + packName;
		
		subDirList(path);
		List<String> data;

		for(File f : files){
			String fName = "";
			String CanPath = f.getPath();
			String sp = CanPath.replace("\\", ".");
			String ssp[] = sp.split("[.]");
			
			fName = ssp[7];
			for(int i = 8; i<ssp.length; i++){
				if(ssp[i].equals("java"))
					break;
				fName += "." + ssp[i];
			}
			
			try {
				data = Files.readAllLines(Paths.get(f.getAbsolutePath()));
				data.removeIf(i->{return !(i.contains("public void test") || i.contains("public void notGeneratedAnyTest"));});

				for(String methodSig : data){
					if(methodSig.contains("public void test")){
						methodSig = methodSig.trim();
						String[] words = methodSig.split(" ");
						ret.add(packName + "." + fName + "." + words[2]);
					}else if(methodSig.contains("public void notGeneratedAnyTest")){
					}
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		files.clear();
		//		    	System.out.println(ret.size());
		return ret;
	}
	
	public static void subDirList(String source){
		File dir = new File(source); 
		File[] fileList = dir.listFiles(); 
		try{
			for(int i = 0 ; i < fileList.length ; i++){
				File file = fileList[i]; 
				if(file.isFile()){
					for(String c : target){
						if(file.getAbsolutePath().contains(c)){
							files.add(file);
							break;
						}
					}
					
				}else if(file.isDirectory()){
					subDirList(file.getCanonicalPath().toString()); 
				}
			}
		}catch(IOException e){	
		}
	}
	
	public void hashingCodeUnits(File file) throws FileNotFoundException, IOException{
		if(file.isDirectory()) {
			for(File f : file.listFiles()) {
				hashingCodeUnits(f);
			}
		}
		
		if(!file.getPath().contains("ESTest") && file.getPath().contains(".class")){
			FileInputStream tt = new FileInputStream(file);
			tt.skip(100);
			String path = file.getAbsolutePath();
			String checksum = path.substring(path.indexOf("bin")) + ":" + DigestUtils.md5Hex(IOUtils.toByteArray(tt));
			hashValuesForP.add(checksum);
		}
	}
	
	public String hashing(File f) throws FileNotFoundException, IOException{
		BufferedInputStream tt = new BufferedInputStream(new FileInputStream(f), 8*1024);
		tt.skip(100);
		String path = f.getAbsolutePath();
		return path.substring(path.indexOf("bin")) + ":" + DigestUtils.md5Hex(IOUtils.toByteArray(tt));
	}
	
	public void saveTraceability(HashMap<String, List<String>> TrMatrix) throws FileNotFoundException, IOException{
		BufferedWriter writer;
		
		writer = new BufferedWriter(new FileWriter(Main.TrFile));
		
		writer.write("<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\r\n");
		writer.write("<Traceability>\r\n");
		
		for( String t : TrMatrix.keySet() ){
			List<String> v = TrMatrix.get(t);
			String products = v.get(0);
			String hValues = v.get(1);
			
			writer.write("\t<TestCase>\r\n");
			writer.write("\t\t<name>" + t.replace("<", "").replace(">", "").replace(": void ", ".") + "</name>\r\n");
			writer.write("\t\t<product>" + products.toString().replace("[", "").replace("]", "") + "</product>\r\n");			
			writer.write("\t\t<codeseq>" + hValues.toString().replace("[", "").replace("]", "") + "</codeseq>\r\n");
			writer.write("\t</TestCase>\r\n");
		}
		writer.write("</Traceability>");
		writer.close();
	}
	public static HashSet<String> optimalCase(int pNum){
		HashSet<String> optimalTCs = new HashSet<String>();
		HashSet<String> newTCs = new HashSet<String>();
		ArrayList<String> keyList = new ArrayList<String>(testCases.keySet());
		Collections.sort(keyList);
		
		if(keyList.size() >= 10){
			String rm = keyList.remove(1);
			keyList.add(rm);
		}
		
		Iterator<String> iterator = keyList.iterator();
		
		for(int i = 0; iterator.hasNext(); i++){
			String key = (String)iterator.next();
			if(i == pNum) {
				newTCs.addAll(testCases.get(key));
				break;
			}
			optimalTCs.addAll(testCases.get(key));
		}
		System.out.println("# of existing TCs (#Candidate): " + optimalTCs.size());
		optimalTCs.retainAll(newTCs);
		for(String c : optimalTCs){
			if(!(c.contains("_ESTest") || c.contains("IntegrationTests")))
				optimalTCs.remove(c);
		}
			
		System.out.println("number of reusable TCs (#Reusable): " + optimalTCs.size());
		return optimalTCs; 
	}

	public static void setTCs(String TCsFilePath){
		testCases = new HashMap<String, HashSet<String>>();

		// get product name (key) - TCs (values) pair 
		testCases = getTestCases(TCsFilePath);
		
		Iterator<String> iterator = testCases.keySet().iterator();
		
		// get all test cases (ready for getting TCs partition table)

		while (iterator.hasNext()) { 
			String key = (String)iterator.next();
			allTCs.addAll(testCases.get(key));
			allExecutionsNumber += testCases.get(key).size();
			//System.out.println("Size of TCs for " + key + " = " + testCases.get(key).size());
		}
		System.out.println("allTCs size (domain TCs) = " + allTCs.size());
		//System.out.println("allExecution number = " + allExecutionsNumber);
		
		
	}

	public static HashMap<String, HashSet<String>> getTestCases(String TCsFilePath){
		HashMap<String, HashSet<String>> testCases = new HashMap<String, HashSet<String>>();
		System.out.println("reading and parsing -- " + TCsFilePath);
		
		try{
			File TCsFile = new File(TCsFilePath);
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document doc = builder.parse(TCsFile);
			doc.getDocumentElement().normalize();
			NodeList list = doc.getElementsByTagName("Product");
			for(int i = 0; i < list.getLength() ; i ++){
				   Element element = (Element) list.item(i);
				   String csvProductName = getTagValue("name",element);
				   String csvTCs = getTagValue("TestCases",element);
				   csvProductName = csvProductName.replace(" ", "");
				   csvTCs = csvTCs.replace(" ", "");
				   HashSet<String> TCs = new HashSet<String>(Arrays.asList(csvTCs.split(",")));
				   
				   testCases.put(csvProductName, TCs);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return testCases;
	}

	private static String getTagValue(String tagName, Element element){
		  NodeList nodeList = element.getElementsByTagName(tagName).item(0).getChildNodes();
		  Node node = nodeList.item(0);
		  return node.getNodeValue();
	}
}

