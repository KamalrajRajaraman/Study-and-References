package SetSemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket s =new Socket("localhost",9090);
		
		
		BufferedReader b = new BufferedReader(new InputStreamReader(s.getInputStream()));
		String str = b.readLine();
		System.out.println("Msg from Server "+str);
		
		System.out.println(" give msg for server");
		
		BufferedReader b1 = new BufferedReader(new InputStreamReader(System.in));
		String str1 = b1.readLine();
		
		PrintStream ot = new PrintStream(s.getOutputStream());
		ot.println(str1);
		ot.flush();
	}
}
