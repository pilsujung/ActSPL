import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;


public class Main {
	private static HashMap<String, List<String>> TrMatrix = new HashMap<String, List<String>>();
	public static int valueForOptimal = 0;
	public static int maxProductNumber = 0;
	
	public static String P = null;// = "C:\\Users\\user\\Desktop\\eclipse-java-mars-2-win32-x86_64\\BerkeleyDB-FH-Java_c.BerkeleyDB_P" + valueForOptimal;
	public static File TrFile = null;// = new File("C:\\Users\\user\\Desktop\\eclipse-java-mars-2-win32-x86_64\\ActSPL\\BerkeleyDB_Tr.xml");
	//public static String P = "C:\\Users\\user\\Desktop\\eclipse-java-mars-2-win32-x86_64\\TankWar_P" + valueForOptimal;
	//public static File TrFile = new File("C:\\Users\\user\\Desktop\\eclipse-java-mars-2-win32-x86_64\\ActSPL\\TankWar_Tr.xml");
	//public static String P = "C:\\Users\\user\\Downloads\\eclipse-java-mars-2-win32-x86_64\\Prevayler_P" + valueForOptimal;
	//public static File TrFile = new File("C:\\Users\\user\\Desktop\\eclipse-java-mars-2-win32-x86_64\\ActSPL\\Prevayler_Tr.xml");
	//public static String P = "C:\\Users\\user\\Downloads\\eclipse-java-mars-2-win32-x86_64\\MRR_P" + valueForOptimal;
	//public static File TrFile = new File("C:\\Users\\user\\Desktop\\eclipse-java-mars-2-win32-x86_64\\ActSPL\\MRR_Tr.xml");
	//public static String P = "C:\\Users\\user\\Downloads\\eclipse-java-mars-2-win32-x86_64\\MobileMedia_P" + valueForOptimal;
	//public static File TrFile = new File("C:\\Users\\user\\Desktop\\eclipse-java-mars-2-win32-x86_64\\ActSPL\\MobileMedia_Tr.xml");

	public static void selectProject() throws IOException{
		System.out.println("Select a number:");
		System.out.println("1) BerkeleyDB");
		System.out.println("2) TankWar");
		System.out.println("3) Prevayler");
		System.out.println("4) MRR");
		System.out.println("5) MobileMedia");
		
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		while (num < 1 || num > 5){
			System.out.println("Select a number:");
			System.out.println("1) BerkeleyDB");
			System.out.println("2) TankWar");
			System.out.println("3) Prevayler");
			System.out.println("4) MRR");
			System.out.println("5) MobileMedia");
			num = s.nextInt();
		}
		s.close();
		
		if(num == 1){
			P = "C:\\Users\\user\\Desktop\\eclipse-java-mars-2-win32-x86_64\\BerkeleyDB-FH-Java_c.BerkeleyDB_P";
			TrFile = new File("C:\\Users\\user\\Desktop\\eclipse-java-mars-2-win32-x86_64\\ActSPL\\BerkeleyDB_Tr.xml");
			maxProductNumber = 7;
		} else if(num == 2){
			P = "C:\\Users\\user\\Desktop\\eclipse-java-mars-2-win32-x86_64\\TankWar_P";
			TrFile = new File("C:\\Users\\user\\Desktop\\eclipse-java-mars-2-win32-x86_64\\ActSPL\\TankWar_Tr.xml");
			maxProductNumber = 5;
		} else if(num == 3){
			P = "C:\\Users\\user\\Downloads\\eclipse-java-mars-2-win32-x86_64\\Prevayler_P";
			TrFile = new File("C:\\Users\\user\\Downloads\\eclipse-java-mars-2-win32-x86_64\\Prevayler_P");
			maxProductNumber = 5;
		} else if(num == 4){
			P = "C:\\Users\\user\\Downloads\\eclipse-java-mars-2-win32-x86_64\\MRR_P";
			TrFile = new File("C:\\Users\\user\\Downloads\\eclipse-java-mars-2-win32-x86_64\\MRR_P");
			maxProductNumber = 5;
		} else if(num == 5){
			P = "C:\\Users\\user\\Downloads\\eclipse-java-mars-2-win32-x86_64\\MobileMedia_P";
			TrFile = new File("C:\\Users\\user\\Desktop\\eclipse-java-mars-2-win32-x86_64\\ActSPL\\MobileMedia_Tr.xml");
			maxProductNumber = 4;
		}
	}
	
	public static void main(String args[]) throws FileNotFoundException, IOException{
		selectProject();
		//Runner run = new Runner();
		
		List<String> pList = new ArrayList<String>();
		if(TrFile.exists()){
			pList = loadTrMatrix();
		}
		String NEW = "";
		for (int i = 1; i<=maxProductNumber; i++){
			if (i >= 3)
				NEW = "(new product)";
			System.out.println("=================== P" + i + NEW + " ===================");
			
			valueForOptimal = i;
			Runner_Class_level_granularity run = new Runner_Class_level_granularity();
			if(!pList.contains(P))
				run.UpdateTC2CodeTraceability(TrMatrix, P+i);
		}
	}
	
	public static List<String> loadTrMatrix(){
		List<String> pList = new ArrayList<String>();
		try{
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document doc = builder.parse(TrFile);
			doc.getDocumentElement().normalize();
			NodeList list = doc.getElementsByTagName("TestCase");
			for(int i = 0; i < list.getLength() ; i ++){
				   Element element = (Element) list.item(i);
				   String csvTCName = getTagValue("name",element);
				   String csvProducts = getTagValue("product",element);
				   String csvCodeSeq = getTagValue("codeseq",element);
				   csvTCName = csvTCName.replace(" ", "");
				   csvProducts = csvProducts.replace(" ", "");
				   csvCodeSeq = csvCodeSeq.replace(" ", "");
				   pList = Arrays.asList(csvProducts.split(","));
				   List<String> codeSeqList = Arrays.asList(csvCodeSeq.split(","));
				   
				   List<String> v = new ArrayList<String>();
				   v.add(pList.toString().replace("[", "").replace("]", "").replace(" ", ""));
				   v.add(codeSeqList.toString().replace("[", "").replace("]", "").replace(" ", ""));
				   
				   TrMatrix.put(csvTCName, v);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return pList;
	}
	private static String getTagValue(String tagName, Element element){
		  NodeList nodeList = element.getElementsByTagName(tagName).item(0).getChildNodes();
		  Node node = nodeList.item(0);
		  return node.getNodeValue();
	}
}
