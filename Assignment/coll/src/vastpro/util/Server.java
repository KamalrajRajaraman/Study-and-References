package vastpro.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public static void main(String[] args) throws Exception {
		System.out.println("Sever started..");
		ServerSocket ss = new ServerSocket(9999);
		System.out.println("waiting for client");
		Socket s=ss.accept();
		System.out.println("Client Connected");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
		String str = br.readLine();
		System.out.println(str);
		
		
		
		PrintWriter out = new PrintWriter(new OutputStreamWriter(s.getOutputStream()));
		out.println("Welcome....");
		os.flush();
	}

}