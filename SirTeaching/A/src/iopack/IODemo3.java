package iopack;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
public class IODemo3 {
	public static void main(String[] args){
		File file=new File("abc.txt");
		String s=file.exists()?"file exist":"file does not exist";
		System.out.println(s);
		//FileInputStream fis=new FileInputStream("abc.txt");
		//TRY WITH RESOURCES
		
		//FileWriter fos=null;
		try(FileReader fis=new FileReader("abc.txt");
				FileWriter fos=new FileWriter("copy.txt");	)
		{				
		char b[]=new char[8];
		int noofcharread=0;
		while((noofcharread=fis.read(b))!=-1) {
			
			String str=new String(b,0,noofcharread);
			System.out.println(str);
			
			fos.write(b, 0, noofcharread);			
		}
	
		
	}catch(Exception e) {
		e.printStackTrace();
	}
	}
}



