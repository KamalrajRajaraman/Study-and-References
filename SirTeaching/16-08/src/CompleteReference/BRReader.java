package CompleteReference;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BRReader {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		char c;
		System.out.println("Enter characters ,q to exit");
		do {
			c=(char)bf.read();
			System.out.println(c);	
		}while(c!='q');
		
	}
}
