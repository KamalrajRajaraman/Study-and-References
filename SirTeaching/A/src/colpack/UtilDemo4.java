package colpack;

import java.io.FileReader;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class UtilDemo4 {
	public static void main(String[] args) {
		ExecutorService es=Executors.newFixedThreadPool(2);
		es.execute(()->{
			Connection c=ConnectionUtility.getConnection();
			c=ConnectionUtility.getConnection();
			ConnectionUtility.closeConnection();
			c=ConnectionUtility.getConnection();
		});
		es.execute(()->{
			//Connection c=ConnectionUtility.getConnection();
			System.out.println(ConnectionUtility.getConnection());
			
		});
		es.shutdown();
	}
}
//To give unique connection for every user...
class ConnectionUtility{
	private static ThreadLocal<Connection> tlocal=new ThreadLocal<Connection>();
	public static Connection getConnection() {
		Connection c=tlocal.get();
		if(c!=null) {
			return c;
		}
		else {
			Connection con=new Connection();
			tlocal.set(con);
			return c;
		}
	}
	public static void closeConnection() {
		Connection c=tlocal.get();
		if(c!=null) {
			tlocal.remove();
		}
	}
}
class Connection{
	public Connection() {
		System.out.println("connection created....");
	}
	public FileReader getFileConnection() throws Exception{
		FileReader fir=new FileReader("abc.txt");
		return fir;
	}
}
