package Guru;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
	public static void main(String[] args) throws IOException {
		System.out.println("Server started");
		ServerSocket ss = new ServerSocket(8888);
		while(true) {
			
			Socket s= ss.accept();
			
			Scanner br = new Scanner(s.getInputStream());
			String str = br.nextLine();
			
			System.out.println(str);
			
			br = new Scanner(System.in);
			System.out.println("Enter Message for Client :: ");
			str = br.nextLine();
			
			
			PrintStream out = new PrintStream(s.getOutputStream());
			out.println(str);
		}
		}

}