package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Insert {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String url="jdbc:mysql://localhost:3306/vastpro";
		String user= "root";
		String password ="Kamalraj@123";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		
		Connection con = DriverManager.getConnection(url, user, password);
		
		String sql = "insert into employee values(1,'ganesh','superman',2000,'bangalore',1)";
		
		Statement stm = con.createStatement();
		int a = stm.executeUpdate(sql);
		System.out.println(a);
		boolean val =stm.execute(sql);
		System.out.println(val);
		
	}
}
