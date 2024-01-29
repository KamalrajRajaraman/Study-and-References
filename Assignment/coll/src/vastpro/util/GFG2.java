package vastpro.util;
// Java program to load resources from Classpath 
// using getResourceAsStream() method. 

import java.io.*; 
import java.nio.file.Files;
import java.util.Collection; 

//save file as the name of GFG2 
public class GFG2 { 
	
	
	//main class 
	public static void main(String[] args) throws Exception { 
		GFG2 g = new GFG2();
		InputStream is = g.getClass().getClassLoader().getResourceAsStream("Kamal.txt");
		BufferedReader br = new BufferedReader(new InputStreamReader(is));
		String line;
		while((line = br.readLine())!=null) {
			System.out.println(line);
		}
		
		
//		// creating object of the class 
//		// important since the getClass() method is 
//		// not static. 
//		GFG2 obj = new GFG2(); 
//		
//		// name of the resource 
//		// the resource is stored in our base path of the 
//		// .class file. 
//		String fileName = "GFG_text.txt"; 
//		
//		System.out.println("Getting the data of file " + fileName); 
//		
//		// declaring the input stream 
//		// and initializing the stream. 
//		InputStream instr = obj.getClass().getClassLoader().getResourceAsStream(fileName); 
//		System.out.println(instr);
//		// reading the files with buffered reader 
////		InputStreamReader strrd = new InputStreamReader(instr); 
//		System.out.println(strrd);
//		BufferedReader rr = new BufferedReader(new InputStreamReader(instr) ); 
//		System.out.println(rr);
//		String line; 
//		
//		// outputting each line of the file. 
//		while ((line = rr.readLine()) != null) 
//				System.out.println(line); 
		} 
}
