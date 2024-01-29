package SetSemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	
	public static void main(String[] args) throws IOException {
		System.out.println("Sever running");
		ServerSocket ss = new ServerSocket(9090);
		Socket a = ss.accept();
		System.out.println("Client Connected");
		System.out.println("give msg to client");
		BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
		String str = b.readLine();
		
		PrintStream ot = new PrintStream(a.getOutputStream());
		ot.println(str );
		
		BufferedReader b1 = new BufferedReader(new InputStreamReader(a.getInputStream()));
		String str1 = b1.readLine();
		System.out.println("Msg from Server "+str1);
		
		 
	}
}
