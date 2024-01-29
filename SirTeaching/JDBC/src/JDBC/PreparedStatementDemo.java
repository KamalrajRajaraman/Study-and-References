package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class PreparedStatementDemo {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String url = "jdbc:mysql://localhost:3306/vastpro";
		String user = "root";
		String password ="Kamalraj@123";
		Connection con = DriverManager.getConnection(url, user, password);
		
		Scanner scn =new Scanner(System.in);
		
		String sql = "insert into employee values(?,?,?,?,?,?)";
		
		PreparedStatement p = con.prepareStatement(sql);
		System.out.println("Enter eid");
		p.setInt(1, scn.nextInt());
		System.out.println("Enter Name");
		p.setString(2, scn.next());
		System.out.println("Enter epass");
		p.setString(3, scn.next());
		System.out.println("Enter sal");
		p.setInt(4, scn.nextInt());
		System.out.println("Enter loc");
		p.setString(5, scn.next());
		System.out.println("Enter flag");
		p.setInt(6, scn.nextInt());
		
		boolean  a =p.execute();
		System.out.println(a);
	}
}
