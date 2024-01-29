package ClientServer;
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