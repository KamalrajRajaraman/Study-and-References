package SerSoc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	ServerSocket ss;
	Socket s;
	PrintStream out;
	BufferedReader br,keyin;
	public Server() throws Exception {
		
		
		System.out.println("Server Started..");
		ss= new ServerSocket(9999);
		
		s=ss.accept();
		
		br = new BufferedReader(new InputStreamReader(s.getInputStream()));
		String str = br.readLine();
		
		System.out.println(str);
		System.out.println("Enter a msg to Client...");
		keyin = new BufferedReader(new InputStreamReader(System.in));
		String str2 = keyin.readLine();
		//FileOutStream os = new FileOutputStream("out.txt");
		//os.write(b,o,)
		out = new PrintStream(s.getOutputStream());
		out.println(str2);
		
		
	}
	
	public static void main(String[] args) throws Exception {
		new Server();
	}

}
