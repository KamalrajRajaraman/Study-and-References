package JDBC;

import java.sql.*;



public class Table {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vastpro","root","Kamalraj@123");
		
		Statement st= con.createStatement();
		
		String sql ="select * from employee";
		
		ResultSet rs =st.executeQuery(sql);
		
		ResultSetMetaData rsdm = rs.getMetaData();
		
		for(int i =1;i<=rsdm.getColumnCount();i++) {
			System.out.print(rsdm.getColumnName(i)+"\t");
		}
		System.out.println();
		for(int i =1;i<=rsdm.getColumnCount();i++) {
		
			System.out.print(rsdm.getColumnTypeName(i)+"\t");
		}
		System.out.println();
		while(rs.next()) {
			System.out.print(rs.getInt(1)+"\t");
			System.out.print(rs.getString(2)+"\t");
			System.out.print(rs.getString(3)+"\t");
			System.out.print(rs.getInt(4)+"\t");
			System.out.print(rs.getString(5)+"\t");
			System.out.print(rs.getInt(6)+"\t");
			System.out.println();
			
		}

		
	}

}
