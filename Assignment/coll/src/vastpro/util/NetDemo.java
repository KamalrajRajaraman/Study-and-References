package vastpro.util;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.URL;
import java.net.URLConnection;
import java.sql.BatchUpdateException;
public class NetDemo {
	public static void main(String[] args)throws Exception {
		
		
		URL url = new URL("https://openai.com/");
		URLConnection urlcon = url.openConnection();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(urlcon.getInputStream()));
//		FileOutputStream os = new FileOutputStream("guru.html");
		FileWriter f = new FileWriter("guru.html");
		int i=0;
		char c[]=new char[256];
	
		while((i=br.read(c))!=-1) {
			String str=new String(c,0,i);
			System.out.print(str);
			f.write(c,0,i);
		}
		br.close();
		f.close();
		
////		InetAddress inet=Inet6Address.getLocalHost();
////		System.out.println(inet);
//////		
////		inet=Inet6Address.getByName("www.haarisinfotech.com");
////		System.out.println(inet);
////////		
////////		inet=Inet6Address.getByName("www.docs.google.com");
////////		System.out.println(inet);
////////		
////		InetAddress inetall[]=Inet6Address.getAllByName("www.openai.com");
////		for(InetAddress i:inetall) {
////			System.out.println(i);
////		}
////		
//		URL url=new URL("http://142.251.12.189/index.html");
//		URLConnection urlcon=url.openConnection();
////		
//		BufferedReader br=new BufferedReader(new InputStreamReader(urlcon.getInputStream()));
//		FileWriter fos=new FileWriter("google.html");
//		int i=0;
//		char c[]=new char[256];
//	
//		while((i=br.read(c))!=-1) {
//			String str=new String(c,0,i);
//			System.out.print(str);
//			fos.write(c,0,i);
//		}
//		br.close();
//		fos.close();
	}
}