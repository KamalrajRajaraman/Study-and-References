package PractiseJDBCPocedure;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ReadWriteImage {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/vastpro";
		String user = "root";
		String password = "Kamalraj@123";
		Connection con = DriverManager.getConnection(url, user, password);
		
		
		
	}
}
