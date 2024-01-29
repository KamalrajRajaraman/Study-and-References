package OneWay;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSide {
	 public static void main(String[] args) throws IOException {
		 System.out.println("Server started");
		ServerSocket sw = new ServerSocket(3000);
		System.out.println("Server Waiting");
		Socket s =sw.accept();
		System.out.println("Client Connected");
		System.out.println("Message from client");
		BufferedReader b = new BufferedReader(new InputStreamReader(s.getInputStream()));
		//System.out.println((char)b.read());
		String str = b.readLine();
		System.out.println(str);
//		
		
	}
}
