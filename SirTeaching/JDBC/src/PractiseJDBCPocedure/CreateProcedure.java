package PractiseJDBCPocedure;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public interface CreateProcedure {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/vastpro";
		String user="root";
		String password ="Kamalraj@123";
		Connection con = DriverManager.getConnection(url, user, password);
		
		String sql = "{delimiter //}";
		Statement st =con.createStatement();
		st.execute(sql);
		
		 sql ="create procedure updateFalg(IN name VARCHAR(20),IN myFalg int)"
				+ "begin"
				+ "update employee set flag = myflag where ename=name;"
				+ "end;"
				+ "//";
		st =con.createStatement();
		st.execute(sql);
		
		
	}

}
