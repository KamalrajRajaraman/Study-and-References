package logix;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
class Client{
	Socket s;BufferedReader in,keyin;PrintStream out;
	public Client() {
		try {
			while(true) {
				
		s=new Socket("192.168.0.110",7000);
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