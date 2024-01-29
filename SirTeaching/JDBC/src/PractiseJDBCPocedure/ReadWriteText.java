package PractiseJDBCPocedure;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ReadWriteText {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String url ="jdbc:mysql://localhost:3306/vastpro";
		String user ="root";
		String password ="Kamalraj@123";
		
		Connection con =DriverManager.getConnection(url, user, password);
		
		String msg ="my name is Kamal";
		byte[] b = msg.getBytes();
		//writeByte(con, b);
//		writeText(con,msg);
		readBlob(con);
		
	}
	
	public static void writeByte(Connection con,byte[] b) throws SQLException {
		String sql = "insert into file (BinaryFile) values(?)";
		PreparedStatement p = con.prepareStatement(sql);
		p.setBytes(1, b);
		p.executeUpdate();
		
	}
	public static void writeText(Connection con,String st) throws SQLException {
		String sql = "insert into file (TextFile) values(?)";
		PreparedStatement p = con.prepareStatement(sql);
		p.setString(1, st);
		p.executeUpdate();
	}
	
	public static void readBlob(Connection con) throws SQLException {
		String sql ="select * from file";
		PreparedStatement p = con.prepareStatement(sql);
		ResultSet rs = p.executeQuery();
		while(rs.next()) {
			System.out.println(rs.getInt(1));
			byte[]b =rs.getBytes(2);
			if(b!=null) {
				String s = new String(b);
				System.out.println(s);
			}
			else {
				System.out.println("null");
			}
			System.out.println(rs.getString(3));
		}
		
	}

	
	
}
