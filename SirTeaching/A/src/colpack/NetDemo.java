package iopack;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.URL;
import java.net.URLConnection;
public class NetDemo {
	public static void main(String[] args)throws Exception {
		InetAddress inet=Inet6Address.getLocalHost();
		
		System.out.println(inet);
		
		inet=Inet6Address.getByName("www.haarisinfotech.com");
		System.out.println(inet);
		
		inet=Inet6Address.getByName("www.docs.google.com");
		System.out.println(inet);
		
		InetAddress inetall[]=Inet6Address.getAllByName("www.openai.com");
		for(InetAddress i:inetall) {
			System.out.println(i);
		}
		
		URL url=new URL("http://142.251.12.189/index.html");
		URLConnection urlcon=url.openConnection();
		
		BufferedReader br=new BufferedReader(new InputStreamReader(urlcon.getInputStream()));
		FileWriter fos=new FileWriter("google.html");
		int i=0;
		char c[]=new char[256];
	
		while((i=br.read(c))!=-1) {
			String str=new String(c,0,i);
			System.out.print(str);
			fos.write(c,0,i);
		}
		br.close();
		fos.close();
	}
}
google.comgoogle.com
Google
Search the world's information, including webpages, images, videos and more. Google has many special features to help you find exactly what you're looking for.


haarisinfotech
  12:27 PM
package iopack;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
class Client{
	Socket s;BufferedReader in,keyin;PrintStream out;
	public Client() {
		try {
			while(true) {
		s=new Socket("localhost",2000);
		in=new BufferedReader(new InputStreamReader(s.getInputStream()));
		String msgFromServer=in.readLine();
		System.out.println("Msg From Server...:"+msgFromServer);
		out=new PrintStream(s.getOutputStream());
		keyin=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter message for server...:");
		String msg=keyin.readLine();
		out.println(msg);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		new Client();
	}
}
12:27
package iopack;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
class Server{
	ServerSocket ss;Socket s;PrintStream out;BufferedReader in,keyin;
	public Server() {
		try {
			ss=new ServerSocket(2000);
			while(true) {
				System.out.println("Server running....");
				s=ss.accept();
				out=new PrintStream(s.getOutputStream());
				keyin=new BufferedReader(new InputStreamReader(System.in));
				System.out.println("Enter message for client...:");
				String msg=keyin.readLine();
				out.println(msg);
				in=new BufferedReader(new InputStreamReader(s.getInputStream()));
				String msgFromClient=in.readLine();
				System.out.println("Msg From Client..:"+msgFromClient);
				//System.out.println(s);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		new Server();
	}
}

