package vastpro.util;

import java.io.BufferedReader;

import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {
	public static void main(String[] args) throws Exception {
		
		Socket s = new Socket("localhost",9999);
		String str = "Kamal";
		
		OutputStreamWriter os = new OutputStreamWriter(s.getOutputStream());
		PrintWriter out = new PrintWriter(os);
		out.println(str);
		
		os.flush();
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
		String str1 = br.readLine();
		System.out.println(str1);
	}
}
