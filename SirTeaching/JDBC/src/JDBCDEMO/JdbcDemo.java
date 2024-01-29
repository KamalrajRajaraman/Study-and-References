package JDBCDEMO;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;

public class JdbcDemo {

	public static void main(String[] args) throws SQLException {
		//getEmpById(1);
		//delete(2);
//		insert(2,"Kamal",500000);
//		update(1, "Hari");
//		callStoredProcedure();
		 Batchupdate();
	}

	public static void insert(int emp_id,String ename,int salary) throws SQLException {
		String url = "jdbc:mysql://localhost:3306/jdbcDemo";
		String user = "root";
		String password = "Kamalraj@123";
		

		Connection con = DriverManager.getConnection(url, user, password);

		String sql = "INSERT INTO employee VALUES(?,?,?)";

		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, emp_id);
		ps.setString(2, ename);
		ps.setInt(3, salary);
		
		int result =ps.executeUpdate();
		System.out.println("No of rows Affected :"+result);

	}
	public static void update(int emp_id,int salary) throws SQLException {
		String url = "jdbc:mysql://localhost:3306/jdbcDemo";
		String user = "root";
		String password = "Kamalraj@123";
		

		Connection con = DriverManager.getConnection(url, user, password);
		String sql ="update employee set salary =? where emp_id =?";
		PreparedStatement p = con.prepareStatement(sql);
		p.setInt(1, salary);
		p.setInt(2, emp_id);
		
		int a=p.executeUpdate();
		System.out.println(a);
		
	}
	public static void update(int emp_id,String name) throws SQLException {
		String url = "jdbc:mysql://localhost:3306/jdbcDemo";
		String user = "root";
		String password = "Kamalraj@123";
		

		Connection con = DriverManager.getConnection(url, user, password);
		String sql ="update employee set ename =? where emp_id =?";
		PreparedStatement p = con.prepareStatement(sql);
		p.setString(1, name);
		p.setInt(2, emp_id);
		
		int a=p.executeUpdate();
		System.out.println(a);
		
	}
	public static void delete(int emp_id) throws SQLException {
		String url = "jdbc:mysql://localhost:3306/jdbcDemo";
		String user = "root";
		String password = "Kamalraj@123";
		

		Connection con = DriverManager.getConnection(url, user, password);

		String sql = "delete from employee where emp_id= ?";

		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, emp_id);

		
		int result =ps.executeUpdate();
	
		System.out.println("No of rows Affected m :"+result);

	}
	public static void callStoredProcedure() throws SQLException {
		String url = "jdbc:mysql://localhost:3306/jdbcDemo";
		String user = "root";
		String password = "Kamalraj@123";
	
		Connection con = DriverManager.getConnection(url, user, password);
		
		CallableStatement cs = con.prepareCall("{call getTable()}");
		ResultSet rs = cs.executeQuery();
		while(rs.next()) {
			System.out.print(rs.getInt(1));
			System.out.print("\t");
			System.out.print(rs.getString(2));
			System.out.print("\t");
			System.out.print(rs.getInt(3));
			System.out.println();
			
		}
		
		
	}
	public static void getEmpById(int id) throws SQLException {
		String url = "jdbc:mysql://localhost:3306/jdbcDemo";
		String user = "root";
		String password = "Kamalraj@123";
	
		Connection con = DriverManager.getConnection(url, user, password);
		
		CallableStatement cs = con.prepareCall("{call getEmpById(?)}");
		cs.setInt(1, id);
		ResultSet rs = cs.executeQuery();
		while(rs.next()) {
			System.out.println(rs.getInt(1));
			System.out.println(rs.getString(2));
			System.out.println(rs.getInt(3));
		}
		
		
	}
	public static void getNamesById(int id) throws SQLException {
		String url = "jdbc:mysql://localhost:3306/jdbcDemo";
		String user = "root";
		String password = "Kamalraj@123";
	
		Connection con = DriverManager.getConnection(url, user, password);
		
		CallableStatement cs = con.prepareCall("{call getNameById(?,?)}");
		cs.setInt(1, id);
		cs.registerOutParameter(2, Types.VARCHAR);
		
		cs.executeUpdate();
		System.out.println(cs.getString(2));
		
		
		
	}
	public static void Batchupdate() throws SQLException {
		String url = "jdbc:mysql://localhost:3306/jdbcDemo";
		String user = "root";
		String password = "Kamalraj@123";
		

		Connection con = DriverManager.getConnection(url, user, password);
		con.setAutoCommit(false);
		String sql ="update employee set ename = 'harih' where emp_id =1";
		String sql1 ="update employee set ename = 'KamalR' where emp_id =2";
		
		Statement st = con.createStatement();
		st.addBatch(sql);
		st.addBatch(sql1);
		int[] a=null;
		try {
			a =st.executeBatch();
		}catch (Exception e) {
			e.printStackTrace();
			con.rollback();
		}
		for(int b:a) {
			if(b>0) {
				continue;
			}
			else {
				con.rollback();
			}
		}
		
		con.commit();
		
		
	}

	
	
}
