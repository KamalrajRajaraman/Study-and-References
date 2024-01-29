package JDBC;
import java.sql.*;
class eg1
{
	public static void main(String st1[]) throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/vastpro","root","Kamalraj@123");
		Statement st=con.createStatement();
		
		ResultSet rs= st.executeQuery("select * from employee");
		
		ResultSetMetaData rsmd=rs.getMetaData();
		
		System.out.println("No. of Cols =" +rsmd.getColumnCount());
		
		for(int i=1;i<=rsmd.getColumnCount();i++)
		{	
			String c=rsmd.getColumnName(i);
			String c1=rsmd.getColumnTypeName(i);
			
			String c2=rsmd.getColumnLabel(i);
			System.out.println("(columne name " +c +"),( type name "+c1+"),( label " +c2+")");


		}
	}
}
