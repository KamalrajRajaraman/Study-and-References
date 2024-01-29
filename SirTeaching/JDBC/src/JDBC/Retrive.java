package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Retrive {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String url ="jdbc:mysql://localhost:3306/vastpro";
		String user ="root";
		String password ="Kamalraj@123";
		
		Connection con = DriverManager.getConnection(url, user, password);
		
		String sql = "select * from employee";
	
		Statement st = con.createStatement();
		
		
		
	
		ResultSet rs = st.executeQuery(sql);
		
		while(rs.next()) {
			System.out.println(rs.getInt(1));
			System.out.println(rs.getString("epass"));
		}
		
		
		
		
		
	}

}
