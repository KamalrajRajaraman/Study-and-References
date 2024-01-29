package SerSoc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
	Socket s;
	BufferedReader br,keyin;
	PrintStream out;
	
	public Client() throws Exception {
		
		String ip ="localhost";
		int port =9999;
		
		s= new Socket(ip,port);
		
		out= new PrintStream(s.getOutputStream());
		System.out.println("Eneter msg to Server..");
		keyin = new BufferedReader(new InputStreamReader(System.in));
		String str=keyin.readLine();
		
		out.println(str);
		
		br = new BufferedReader(new InputStreamReader(s.getInputStream()));
		String str3 = br.readLine();
		
		System.out.println(str3);
		
		
	}
	
	public static void main(String[] args) throws Exception {
		new Client();
	}

}