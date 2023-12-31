// 각 test method가 cover하는 methods 출력
package org.test1.maven;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;

import org.apache.bcel.classfile.JavaClass;
import org.apache.bcel.classfile.Method;
import org.apache.bcel.generic.ClassGen;
import org.apache.bcel.generic.ConstantPoolGen;
import org.apache.bcel.generic.INVOKESTATIC;
import org.apache.bcel.generic.InstructionFactory;
import org.apache.bcel.generic.InstructionHandle;
import org.apache.bcel.generic.InstructionList;
import org.apache.bcel.generic.LDC;
import org.apache.bcel.generic.MethodGen;
import org.apache.bcel.util.ClassPathRepository;
import org.apache.commons.codec.digest.DigestUtils;

public class BCELForMRR_Method_to_Method_Ver {
	static String target = "C:\\Users\\user\\Downloads\\eclipse-java-mars-2-win32-x86_64\\MRR_P5\\bin";
	static File d = new File(target);
	
	static public void main(String args[]) throws IOException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, ClassNotFoundException {
		long start = System.currentTimeMillis();
		
		invokeAllMethods(d);
		
		long end = System.currentTimeMillis();
		System.out.println("time: " + (end - start)+" ms");
	}
	public static void invokeAllMethods(File file) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, ClassNotFoundException, IOException{
	    if(file.isDirectory()) {
	    	for(File f : file.listFiles()) {
	    		invokeAllMethods(f);
	        }
	    }																			
	    else{	
			
	    	URL url = file.toURI().toURL();
	    	String classPath = url.getPath().substring(url.getPath().indexOf("bin")+4);
	    	String mkdir = "";
	    	if(classPath.lastIndexOf("/") != -1)
	    		mkdir = classPath.substring(0, classPath.lastIndexOf("/")+1);
	    	
	    	classPath = classPath.replace("/", ".");
	    	String path = classPath.substring(0, classPath.lastIndexOf("."));
	    	String name = path.substring(path.lastIndexOf(".")+1);
       //    System.out.println(path);
	    	JavaClass mod = null;
		    
		    
		    try {
		    	ClassPathRepository classPathRepository = new ClassPathRepository(new org.apache.bcel.util.ClassPath(target));
		    	
		        mod = classPathRepository.loadClass(path);
		    }
		    catch (Exception e) {
	//	        System.err.println("Could not get class ");
		        return;
		    }

		    //Create a generic class to modify
		    ClassGen modClass = new ClassGen(mod);
		    //Create a generic constantpool to modify
		    ConstantPoolGen cp = modClass.getConstantPool();

		    Method[] methods = mod.getMethods();

		    
		    for (int i = 0; i < methods.length; i++) {
		    	if(methods[i].getName().equals("doneWithTestCase")){
		    		MethodGen mgen = new MethodGen(methods[i], name + ".class", cp);
		    		InstructionList ilist = mgen.getInstructionList();
		    		
		    		InstructionHandle [] ihs = ilist.getInstructionHandles();
			    		
		    		ihs[0] = ilist.append(ihs[0], new INVOKESTATIC(cp.addMethodref("CoverageInfo", "print", "()V")));
		    				    		
		    		mgen.setMaxStack();
		    		mgen.setMaxLocals();
		            modClass.replaceMethod(methods[i], mgen.getMethod());

		           /* System.out.println(modClass.getClassName());
		    		for (InstructionHandle ihandle : ilist.getInstructionHandles()){
		                System.out.println(ihandle.toString());
		            }*/
		    		
		            ilist.dispose();
		            
		    	}else if(name.contains("ESTest") && !name.contains("scaffolding") && !methods[i].getName().equals("<init>") && !methods[i].getName().equals("initEvoSuiteFramework") && !methods[i].getName().equals("exitEvoSuiteFramework")){
		    		MethodGen mgen = new MethodGen(methods[i], name + ".class", cp);
		    		InstructionList ilist = mgen.getInstructionList();
		    		InstructionFactory ifac = new InstructionFactory(modClass);

		    		InstructionHandle [] ihs = ilist.getInstructionHandles();

		    		ihs[0] = ilist.append(ihs[0], new LDC(cp.addString(path + "." + methods[i].getName() + "()")));
		    		ihs[0] = ilist.append(ihs[0], new INVOKESTATIC(cp.addMethodref("CoverageInfo", "save", "(Ljava/lang/String;)V")));

		            mgen.setMaxStack();
		            mgen.setMaxLocals();
		            modClass.replaceMethod(methods[i], mgen.getMethod());
		            
		            ilist.dispose();
		            
		    	}
		    	
		    	if(!name.contains("ESTest")){
		    		MethodGen mgen = new MethodGen(methods[i], name + ".class", cp);
		    		InstructionList ilist = mgen.getInstructionList();
		    		if(ilist == null)
		    			continue;
		    		String checksum = DigestUtils.md5Hex(ilist.getByteCode());
		    		InstructionFactory ifac = new InstructionFactory(modClass);

		    		InstructionHandle [] ihs = ilist.getInstructionHandles();

		    		ihs[0] = ilist.append(ihs[0], new LDC(cp.addString(path + '.' + methods[i].getName() + "[" + checksum + "]")));
		    		ihs[0] = ilist.append(ihs[0], new INVOKESTATIC(cp.addMethodref("CoverageInfo", "save", "(Ljava/lang/String;)V")));

		            mgen.setMaxStack();
		            mgen.setMaxLocals();
		            modClass.replaceMethod(methods[i], mgen.getMethod());
		            
		            ilist.dispose();
			    	
		    	}
		    }
		    
		    File testfile = new File("./"+mkdir);
            if(!testfile.exists()){
            	testfile.mkdirs();
            }
            
            FileOutputStream fos = new FileOutputStream(mkdir + name + ".class");
            modClass.getJavaClass().dump(fos);
            fos.close();
            
	    }
	    
	}
	
	
}
