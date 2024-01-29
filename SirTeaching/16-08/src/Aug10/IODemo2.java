package Aug10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IODemo2 {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("Kamal.txt");
		System.out.println(fis.available());
		FileOutputStream fos = new FileOutputStream("Hari.txt");
		byte [] b = new byte[8];
		int numOfChar =0;
		//System.out.println();
		while((numOfChar=fis.read(b))!=-1) {

			for(byte b1:b) {
				System.out.println((char)b1);
			}
			System.out.println("end.....");
			String s = new String(b,0,numOfChar);
			System.out.println(s);
			System.out.println(numOfChar);
		}
		
		
	}
}
